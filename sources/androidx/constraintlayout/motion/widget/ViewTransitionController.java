package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ViewTransitionController {
    private String TAG = "ViewTransitionController";
    ArrayList<ViewTransition.Animate> animations;
    private final MotionLayout mMotionLayout;
    private HashSet<View> mRelatedViews;
    ArrayList<ViewTransition.Animate> removeList = new ArrayList<>();
    private ArrayList<ViewTransition> viewTransitions = new ArrayList<>();

    public ViewTransitionController(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
    }

    public void add(ViewTransition viewTransition) {
        this.viewTransitions.add(viewTransition);
        this.mRelatedViews = null;
        if (viewTransition.getStateTransition() == 3) {
            listenForSharedVariable(viewTransition, true);
        } else if (viewTransition.getStateTransition() == 4) {
            listenForSharedVariable(viewTransition, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void remove(int i) {
        ViewTransition viewTransition;
        Iterator<ViewTransition> it = this.viewTransitions.iterator();
        while (true) {
            if (!it.hasNext()) {
                viewTransition = null;
                break;
            }
            viewTransition = it.next();
            if (viewTransition.getId() == i) {
                break;
            }
        }
        if (viewTransition != null) {
            this.mRelatedViews = null;
            this.viewTransitions.remove(viewTransition);
        }
    }

    private void viewTransition(ViewTransition viewTransition, View... viewArr) {
        int currentState = this.mMotionLayout.getCurrentState();
        if (viewTransition.mViewTransitionMode == 2) {
            viewTransition.applyTransition(this, this.mMotionLayout, currentState, (ConstraintSet) null, viewArr);
        } else if (currentState == -1) {
            Log.w(this.TAG, "Dont support transition within transition yet");
        } else {
            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
            if (constraintSet != null) {
                viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, viewArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void enableViewTransition(int i, boolean z) {
        Iterator<ViewTransition> it = this.viewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                next.setEnable(z);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isViewTransitionEnabled(int i) {
        Iterator<ViewTransition> it = this.viewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                return next.isEnabled();
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void viewTransition(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<ViewTransition> it = this.viewTransitions.iterator();
        ViewTransition viewTransition = null;
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                for (View view : viewArr) {
                    if (next.checkTags(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    viewTransition(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                viewTransition = next;
            }
        }
        if (viewTransition == null) {
            Log.e(this.TAG, " Could not find ViewTransition");
        }
    }

    /* access modifiers changed from: package-private */
    public void touchEvent(MotionEvent motionEvent) {
        ViewTransition viewTransition;
        int currentState = this.mMotionLayout.getCurrentState();
        if (currentState != -1) {
            if (this.mRelatedViews == null) {
                this.mRelatedViews = new HashSet<>();
                Iterator<ViewTransition> it = this.viewTransitions.iterator();
                while (it.hasNext()) {
                    ViewTransition next = it.next();
                    int childCount = this.mMotionLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.mMotionLayout.getChildAt(i);
                        if (next.matchesView(childAt)) {
                            childAt.getId();
                            this.mRelatedViews.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            if (action == 0 || action == 1) {
                ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
                Iterator<ViewTransition> it2 = this.viewTransitions.iterator();
                while (it2.hasNext()) {
                    ViewTransition next2 = it2.next();
                    if (next2.supports(action)) {
                        Iterator<View> it3 = this.mRelatedViews.iterator();
                        while (it3.hasNext()) {
                            View next3 = it3.next();
                            if (next2.matchesView(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    viewTransition = next2;
                                    next2.applyTransition(this, this.mMotionLayout, currentState, constraintSet, next3);
                                } else {
                                    viewTransition = next2;
                                }
                                next2 = viewTransition;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addAnimation(ViewTransition.Animate animate) {
        if (this.animations == null) {
            this.animations = new ArrayList<>();
        }
        this.animations.add(animate);
    }

    /* access modifiers changed from: package-private */
    public void removeAnimation(ViewTransition.Animate animate) {
        this.removeList.add(animate);
    }

    /* access modifiers changed from: package-private */
    public void animate() {
        ArrayList<ViewTransition.Animate> arrayList = this.animations;
        if (arrayList != null) {
            Iterator<ViewTransition.Animate> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mutate();
            }
            this.animations.removeAll(this.removeList);
            this.removeList.clear();
            if (this.animations.isEmpty()) {
                this.animations = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void invalidate() {
        this.mMotionLayout.invalidate();
    }

    /* access modifiers changed from: package-private */
    public boolean applyViewTransition(int i, MotionController motionController) {
        Iterator<ViewTransition> it = this.viewTransitions.iterator();
        while (it.hasNext()) {
            ViewTransition next = it.next();
            if (next.getId() == i) {
                next.mKeyFrames.addAllFrames(motionController);
                return true;
            }
        }
        return false;
    }

    private void listenForSharedVariable(ViewTransition viewTransition, boolean z) {
        ConstraintLayout.getSharedValues().addListener(new SharedValues.SharedValuesListener(viewTransition, viewTransition.getSharedValueID(), z, viewTransition.getSharedValue()) {
            private final /* synthetic */ ViewTransition f$1;
            private final /* synthetic */ int f$2;
            private final /* synthetic */ boolean f$3;
            private final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onNewValue(int i, int i2, int i3) {
                ViewTransitionController.this.lambda$listenForSharedVariable$0$ViewTransitionController(this.f$1, this.f$2, this.f$3, this.f$4, i, i2, i3);
            }
        }, viewTransition.getSharedValueID());
    }

    public /* synthetic */ void lambda$listenForSharedVariable$0$ViewTransitionController(ViewTransition viewTransition, int i, boolean z, int i2, int i3, int i4, int i5) {
        int sharedValueCurrent = viewTransition.getSharedValueCurrent();
        viewTransition.setSharedValueCurrent(i4);
        if (i == i3 && sharedValueCurrent != i4) {
            if (z) {
                if (i2 == i4) {
                    int childCount = this.mMotionLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        View childAt = this.mMotionLayout.getChildAt(i6);
                        if (viewTransition.matchesView(childAt)) {
                            int currentState = this.mMotionLayout.getCurrentState();
                            ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(currentState);
                            viewTransition.applyTransition(this, this.mMotionLayout, currentState, constraintSet, childAt);
                        }
                    }
                }
            } else if (i2 != i4) {
                int childCount2 = this.mMotionLayout.getChildCount();
                for (int i7 = 0; i7 < childCount2; i7++) {
                    View childAt2 = this.mMotionLayout.getChildAt(i7);
                    if (viewTransition.matchesView(childAt2)) {
                        int currentState2 = this.mMotionLayout.getCurrentState();
                        ConstraintSet constraintSet2 = this.mMotionLayout.getConstraintSet(currentState2);
                        viewTransition.applyTransition(this, this.mMotionLayout, currentState2, constraintSet2, childAt2);
                    }
                }
            }
        }
    }
}
