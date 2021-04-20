package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0185R;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MotionScene {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final String INCLUDE_TAG = "Include";
    private static final int INTERPOLATOR_REFRENCE_ID = -2;
    private static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final String MOTIONSCENE_TAG = "MotionScene";
    private static final String ONCLICK_TAG = "OnClick";
    private static final String ONSWIPE_TAG = "OnSwipe";
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String STATESET_TAG = "StateSet";
    public static final String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    private static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final String VIEW_TRANSITION = "ViewTransition";
    private boolean DEBUG_DESKTOP = false;
    private ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    private HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    /* access modifiers changed from: private */
    public SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    Transition mCurrentTransition = null;
    /* access modifiers changed from: private */
    public int mDefaultDuration = 400;
    private Transition mDefaultTransition = null;
    private SparseIntArray mDeriveMap = new SparseIntArray();
    private boolean mDisableAutoTransition = false;
    private boolean mIgnoreTouch = false;
    private MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    /* access modifiers changed from: private */
    public int mLayoutDuringTransition = 0;
    /* access modifiers changed from: private */
    public final MotionLayout mMotionLayout;
    private boolean mMotionOutsideRegion = false;
    private boolean mRtl;
    StateSet mStateSet = null;
    private ArrayList<Transition> mTransitionList = new ArrayList<>();
    private MotionLayout.MotionTracker mVelocityTracker;
    final ViewTransitionController mViewTransitionController;

    public float getPathPercent(View view, int i) {
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTransition(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.StateSet r0 = r6.mStateSet
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.stateGetConstraintID(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.StateSet r2 = r6.mStateSet
            int r2 = r2.stateGetConstraintID(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            if (r3 == 0) goto L_0x002b
            int r3 = r3.mConstraintSetEnd
            if (r3 != r8) goto L_0x002b
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r6.mCurrentTransition
            int r3 = r3.mConstraintSetStart
            if (r3 != r7) goto L_0x002b
            return
        L_0x002b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mTransitionList
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006d
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = r4.mConstraintSetEnd
            if (r5 != r2) goto L_0x0049
            int r5 = r4.mConstraintSetStart
            if (r5 == r0) goto L_0x0055
        L_0x0049:
            int r5 = r4.mConstraintSetEnd
            if (r5 != r8) goto L_0x0031
            int r5 = r4.mConstraintSetStart
            if (r5 != r7) goto L_0x0031
        L_0x0055:
            r6.mCurrentTransition = r4
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            if (r7 == 0) goto L_0x006c
            androidx.constraintlayout.motion.widget.TouchResponse r7 = r7.mTouchResponse
            if (r7 == 0) goto L_0x006c
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r7 = r7.mTouchResponse
            boolean r8 = r6.mRtl
            r7.setRTL(r8)
        L_0x006c:
            return
        L_0x006d:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r6.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r6.mAbstractTransitionList
            java.util.Iterator r3 = r3.iterator()
        L_0x0075:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0089
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r4
            int r5 = r4.mConstraintSetEnd
            if (r5 != r8) goto L_0x0075
            r7 = r4
            goto L_0x0075
        L_0x0089:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r8 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r8.<init>(r6, r7)
            int unused = r8.mConstraintSetStart = r0
            int unused = r8.mConstraintSetEnd = r2
            if (r0 == r1) goto L_0x009b
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r7 = r6.mTransitionList
            r7.add(r8)
        L_0x009b:
            r6.mCurrentTransition = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.setTransition(int, int):void");
    }

    public void addTransition(Transition transition) {
        int index = getIndex(transition);
        if (index == -1) {
            this.mTransitionList.add(transition);
        } else {
            this.mTransitionList.set(index, transition);
        }
    }

    public void removeTransition(Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    private int getIndex(Transition transition) {
        int access$300 = transition.mId;
        if (access$300 != -1) {
            for (int i = 0; i < this.mTransitionList.size(); i++) {
                if (this.mTransitionList.get(i).mId == access$300) {
                    return i;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        return motionLayout == this.mMotionLayout && motionLayout.mScene == this;
    }

    public void setTransition(Transition transition) {
        this.mCurrentTransition = transition;
        Transition transition2 = this.mCurrentTransition;
        if (transition2 != null && transition2.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.stateGetConstraintID(r3, -1, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getRealID(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.StateSet r0 = r2.mStateSet
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.stateGetConstraintID(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.getRealID(int):int");
    }

    public List<Transition> getTransitionsWithState(int i) {
        int realID = getRealID(i);
        ArrayList arrayList = new ArrayList();
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mConstraintSetStart == realID || next.mConstraintSetEnd == realID) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mOnClicks.size() > 0) {
                Iterator it2 = next.mOnClicks.iterator();
                while (it2.hasNext()) {
                    ((Transition.TransitionOnClick) it2.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it3 = this.mAbstractTransitionList.iterator();
        while (it3.hasNext()) {
            Transition next2 = it3.next();
            if (next2.mOnClicks.size() > 0) {
                Iterator it4 = next2.mOnClicks.iterator();
                while (it4.hasNext()) {
                    ((Transition.TransitionOnClick) it4.next()).removeOnClickListeners(motionLayout);
                }
            }
        }
        Iterator<Transition> it5 = this.mTransitionList.iterator();
        while (it5.hasNext()) {
            Transition next3 = it5.next();
            if (next3.mOnClicks.size() > 0) {
                Iterator it6 = next3.mOnClicks.iterator();
                while (it6.hasNext()) {
                    ((Transition.TransitionOnClick) it6.next()).addOnClickListeners(motionLayout, i, next3);
                }
            }
        }
        Iterator<Transition> it7 = this.mAbstractTransitionList.iterator();
        while (it7.hasNext()) {
            Transition next4 = it7.next();
            if (next4.mOnClicks.size() > 0) {
                Iterator it8 = next4.mOnClicks.iterator();
                while (it8.hasNext()) {
                    ((Transition.TransitionOnClick) it8.next()).addOnClickListeners(motionLayout, i, next4);
                }
            }
        }
    }

    public Transition bestTransitionFor(int i, float f, float f2, MotionEvent motionEvent) {
        RectF touchRegion;
        int i2 = i;
        float f3 = f;
        float f4 = f2;
        if (i2 == -1) {
            return this.mCurrentTransition;
        }
        List<Transition> transitionsWithState = getTransitionsWithState(i);
        float f5 = 0.0f;
        Transition transition = null;
        RectF rectF = new RectF();
        for (Transition next : transitionsWithState) {
            if (!next.mDisable && next.mTouchResponse != null) {
                next.mTouchResponse.setRTL(this.mRtl);
                RectF touchRegion2 = next.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                if ((touchRegion2 == null || motionEvent == null || touchRegion2.contains(motionEvent.getX(), motionEvent.getY())) && ((touchRegion = next.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF)) == null || motionEvent == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float dot = next.mTouchResponse.dot(f3, f4);
                    if (next.mTouchResponse.mIsRotateMode) {
                        float x = motionEvent.getX() - next.mTouchResponse.mRotateCenterX;
                        float y = motionEvent.getY() - next.mTouchResponse.mRotateCenterY;
                        dot = ((float) (Math.atan2((double) (f4 + y), (double) (f3 + x)) - Math.atan2((double) x, (double) y))) * 10.0f;
                    }
                    float f6 = dot * (next.mConstraintSetEnd == i2 ? -1.0f : 1.1f);
                    if (f6 > f5) {
                        transition = next;
                        f5 = f6;
                    }
                }
            }
        }
        return transition;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public Transition getTransitionById(int i) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (next.mId == i) {
                return next;
            }
        }
        return null;
    }

    public int[] getConstraintSetIds() {
        int[] iArr = new int[this.mConstraintSetMap.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = this.mConstraintSetMap.keyAt(i);
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    public boolean autoTransition(MotionLayout motionLayout, int i) {
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            Transition next = it.next();
            if (!(next.mAutoTransition == 0 || this.mCurrentTransition == next)) {
                if (i == next.mConstraintSetStart && (next.mAutoTransition == 4 || next.mAutoTransition == 2)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                } else if (i == next.mConstraintSetEnd && (next.mAutoTransition == 3 || next.mAutoTransition == 1)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(next);
                    if (next.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    public void setRtl(boolean z) {
        this.mRtl = z;
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
        }
    }

    public void viewTransition(int i, View... viewArr) {
        this.mViewTransitionController.viewTransition(i, viewArr);
    }

    public void enableViewTransition(int i, boolean z) {
        this.mViewTransitionController.enableViewTransition(i, z);
    }

    public boolean isViewTransitionEnabled(int i) {
        return this.mViewTransitionController.isViewTransitionEnabled(i);
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(i, motionController);
    }

    public static class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        /* access modifiers changed from: private */
        public int mAutoTransition = 0;
        /* access modifiers changed from: private */
        public int mConstraintSetEnd = -1;
        /* access modifiers changed from: private */
        public int mConstraintSetStart = -1;
        /* access modifiers changed from: private */
        public int mDefaultInterpolator = 0;
        /* access modifiers changed from: private */
        public int mDefaultInterpolatorID = -1;
        /* access modifiers changed from: private */
        public String mDefaultInterpolatorString = null;
        /* access modifiers changed from: private */
        public boolean mDisable = false;
        /* access modifiers changed from: private */
        public int mDuration = 400;
        /* access modifiers changed from: private */
        public int mId = -1;
        /* access modifiers changed from: private */
        public boolean mIsAbstract = false;
        /* access modifiers changed from: private */
        public ArrayList<KeyFrames> mKeyFramesList = new ArrayList<>();
        private int mLayoutDuringTransition = 0;
        /* access modifiers changed from: private */
        public final MotionScene mMotionScene;
        /* access modifiers changed from: private */
        public ArrayList<TransitionOnClick> mOnClicks = new ArrayList<>();
        /* access modifiers changed from: private */
        public int mPathMotionArc = -1;
        /* access modifiers changed from: private */
        public float mStagger = 0.0f;
        /* access modifiers changed from: private */
        public TouchResponse mTouchResponse = null;
        private int mTransitionFlags = 0;

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.mOnClicks.add(new TransitionOnClick(context, this, xmlPullParser));
        }

        public void setAutoTransition(int i) {
            this.mAutoTransition = i;
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getId() {
            return this.mId;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public void setDuration(int i) {
            this.mDuration = i;
        }

        public int getDuration() {
            return this.mDuration;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public void addtKeyFrame(KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public void setStagger(float f) {
            this.mStagger = f;
        }

        public void setPathMotionArc(int i) {
            this.mPathMotionArc = i;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public void setEnable(boolean z) {
            this.mDisable = !z;
        }

        public String debugString(Context context) {
            String str;
            if (this.mConstraintSetStart == -1) {
                str = "null";
            } else {
                str = context.getResources().getResourceEntryName(this.mConstraintSetStart);
            }
            if (this.mConstraintSetEnd == -1) {
                return str + " -> null";
            }
            return str + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        public boolean isTransitionFlag(int i) {
            return (i & this.mTransitionFlags) != 0;
        }

        public void setOnTouchUp(int i) {
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(i);
            }
        }

        static class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode = 17;
            int mTargetId = -1;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.mTransition = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0185R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0185R.styleable.OnClick_targetId) {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                    } else if (index == C0185R.styleable.OnClick_clickAction) {
                        this.mMode = obtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void addOnClickListeners(MotionLayout motionLayout, int i, Transition transition) {
                int i2 = this.mTargetId;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.mTargetId);
                    return;
                }
                int access$100 = transition.mConstraintSetStart;
                int access$000 = transition.mConstraintSetEnd;
                if (access$100 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                boolean z = true;
                boolean z2 = ((this.mMode & 1) != 0 && i == access$100) | ((this.mMode & 1) != 0 && i == access$100) | ((this.mMode & 256) != 0 && i == access$100) | ((this.mMode & 16) != 0 && i == access$000);
                if ((this.mMode & 4096) == 0 || i != access$000) {
                    z = false;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i = this.mTargetId;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        Log.e("MotionScene", " (*)  could not find id " + this.mTargetId);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean isTransitionViable(Transition transition, MotionLayout motionLayout) {
                Transition transition2 = this.mTransition;
                if (transition2 == transition) {
                    return true;
                }
                int access$000 = transition2.mConstraintSetEnd;
                int access$100 = this.mTransition.mConstraintSetStart;
                if (access$100 == -1) {
                    if (motionLayout.mCurrentState != access$000) {
                        return true;
                    }
                    return false;
                } else if (motionLayout.mCurrentState == access$100 || motionLayout.mCurrentState == access$000) {
                    return true;
                } else {
                    return false;
                }
            }

            public void onClick(View view) {
                MotionLayout access$800 = this.mTransition.mMotionScene.mMotionLayout;
                if (access$800.isInteractionEnabled()) {
                    if (this.mTransition.mConstraintSetStart == -1) {
                        int currentState = access$800.getCurrentState();
                        if (currentState == -1) {
                            access$800.transitionToState(this.mTransition.mConstraintSetEnd);
                            return;
                        }
                        Transition transition = new Transition(this.mTransition.mMotionScene, this.mTransition);
                        int unused = transition.mConstraintSetStart = currentState;
                        int unused2 = transition.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                        access$800.setTransition(transition);
                        access$800.transitionToEnd();
                        return;
                    }
                    Transition transition2 = this.mTransition.mMotionScene.mCurrentTransition;
                    int i = this.mMode;
                    boolean z = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    int i2 = this.mMode;
                    boolean z2 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z && z2) {
                        Transition transition3 = this.mTransition.mMotionScene.mCurrentTransition;
                        Transition transition4 = this.mTransition;
                        if (transition3 != transition4) {
                            access$800.setTransition(transition4);
                        }
                        if (access$800.getCurrentState() == access$800.getEndState() || access$800.getProgress() > 0.5f) {
                            z = false;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!isTransitionViable(transition2, access$800)) {
                        return;
                    }
                    if (z && (this.mMode & 1) != 0) {
                        access$800.setTransition(this.mTransition);
                        access$800.transitionToEnd();
                    } else if (z2 && (this.mMode & 16) != 0) {
                        access$800.setTransition(this.mTransition);
                        access$800.transitionToStart();
                    } else if (z && (this.mMode & 256) != 0) {
                        access$800.setTransition(this.mTransition);
                        access$800.setProgress(1.0f);
                    } else if (z2 && (this.mMode & 4096) != 0) {
                        access$800.setTransition(this.mTransition);
                        access$800.setProgress(0.0f);
                    }
                }
            }
        }

        Transition(MotionScene motionScene, Transition transition) {
            this.mMotionScene = motionScene;
            if (transition != null) {
                this.mPathMotionArc = transition.mPathMotionArc;
                this.mDefaultInterpolator = transition.mDefaultInterpolator;
                this.mDefaultInterpolatorString = transition.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = transition.mDefaultInterpolatorID;
                this.mDuration = transition.mDuration;
                this.mKeyFramesList = transition.mKeyFramesList;
                this.mStagger = transition.mStagger;
                this.mLayoutDuringTransition = transition.mLayoutDuringTransition;
            }
        }

        public Transition(int i, MotionScene motionScene, int i2, int i3) {
            this.mId = i;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = i2;
            this.mConstraintSetEnd = i3;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }

        Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) {
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(xmlPullParser));
        }

        public void setInterpolatorInfo(int i, String str, int i2) {
            this.mDefaultInterpolator = i;
            this.mDefaultInterpolatorString = str;
            this.mDefaultInterpolatorID = i2;
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0185R.styleable.Transition);
            fill(motionScene, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        private void fill(MotionScene motionScene, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == C0185R.styleable.Transition_constraintSetEnd) {
                    this.mConstraintSetEnd = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == C0185R.styleable.Transition_constraintSetStart) {
                    this.mConstraintSetStart = typedArray.getResourceId(index, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == C0185R.styleable.Transition_motionInterpolator) {
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                        if (this.mDefaultInterpolatorID != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (peekValue.type == 3) {
                        this.mDefaultInterpolatorString = typedArray.getString(index);
                        if (this.mDefaultInterpolatorString.indexOf("/") > 0) {
                            this.mDefaultInterpolatorID = typedArray.getResourceId(index, -1);
                            this.mDefaultInterpolator = -2;
                        } else {
                            this.mDefaultInterpolator = -1;
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(index, this.mDefaultInterpolator);
                    }
                } else if (index == C0185R.styleable.Transition_duration) {
                    this.mDuration = typedArray.getInt(index, this.mDuration);
                } else if (index == C0185R.styleable.Transition_staggered) {
                    this.mStagger = typedArray.getFloat(index, this.mStagger);
                } else if (index == C0185R.styleable.Transition_autoTransition) {
                    this.mAutoTransition = typedArray.getInteger(index, this.mAutoTransition);
                } else if (index == C0185R.styleable.Transition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == C0185R.styleable.Transition_transitionDisable) {
                    this.mDisable = typedArray.getBoolean(index, this.mDisable);
                } else if (index == C0185R.styleable.Transition_pathMotionArc) {
                    this.mPathMotionArc = typedArray.getInteger(index, -1);
                } else if (index == C0185R.styleable.Transition_layoutDuringTransition) {
                    this.mLayoutDuringTransition = typedArray.getInteger(index, 0);
                } else if (index == C0185R.styleable.Transition_transitionFlags) {
                    this.mTransitionFlags = typedArray.getInteger(index, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }
    }

    public MotionScene(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
    }

    MotionScene(Context context, MotionLayout motionLayout, int i) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
        load(context, i);
        this.mConstraintSetMap.put(C0185R.C0188id.motion_base, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(C0185R.C0188id.motion_base));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void load(android.content.Context r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = " "
            java.lang.String r1 = "MotionScene"
            android.content.res.Resources r2 = r12.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r13)
            r3 = 0
            int r4 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x0011:
            r5 = 1
            if (r4 == r5) goto L_0x01c2
            if (r4 == 0) goto L_0x0176
            r6 = 3
            r7 = 2
            if (r4 == r7) goto L_0x001c
            goto L_0x0179
        L_0x001c:
            java.lang.String r4 = r2.getName()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            boolean r8 = r11.DEBUG_DESKTOP     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r8 == 0) goto L_0x003b
            java.io.PrintStream r8 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r10 = "parsing = "
            r9.append(r10)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r9.append(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r9 = r9.toString()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r8.println(r9)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x003b:
            int r8 = r4.hashCode()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r9 = -1
            switch(r8) {
                case -1349929691: goto L_0x0092;
                case -1239391468: goto L_0x0088;
                case -687739768: goto L_0x007e;
                case 61998586: goto L_0x0073;
                case 269306229: goto L_0x006a;
                case 312750793: goto L_0x0060;
                case 327855227: goto L_0x0056;
                case 793277014: goto L_0x004e;
                case 1382829617: goto L_0x0044;
                default: goto L_0x0043;
            }     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x0043:
            goto L_0x009c
        L_0x0044:
            java.lang.String r5 = "StateSet"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 4
            goto L_0x009d
        L_0x004e:
            boolean r5 = r4.equals(r1)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 0
            goto L_0x009d
        L_0x0056:
            java.lang.String r5 = "OnSwipe"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 2
            goto L_0x009d
        L_0x0060:
            java.lang.String r5 = "OnClick"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 3
            goto L_0x009d
        L_0x006a:
            java.lang.String r6 = "Transition"
            boolean r6 = r4.equals(r6)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r6 == 0) goto L_0x009c
            goto L_0x009d
        L_0x0073:
            java.lang.String r5 = "ViewTransition"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 8
            goto L_0x009d
        L_0x007e:
            java.lang.String r5 = "Include"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 6
            goto L_0x009d
        L_0x0088:
            java.lang.String r5 = "KeyFrameSet"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 7
            goto L_0x009d
        L_0x0092:
            java.lang.String r5 = "ConstraintSet"
            boolean r5 = r4.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r5 == 0) goto L_0x009c
            r5 = 5
            goto L_0x009d
        L_0x009c:
            r5 = -1
        L_0x009d:
            switch(r5) {
                case 0: goto L_0x0156;
                case 1: goto L_0x010e;
                case 2: goto L_0x00d4;
                case 3: goto L_0x00cf;
                case 4: goto L_0x00c6;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00bc;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00a2;
                default: goto L_0x00a0;
            }     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x00a0:
            goto L_0x015a
        L_0x00a2:
            androidx.constraintlayout.motion.widget.ViewTransition r4 = new androidx.constraintlayout.motion.widget.ViewTransition     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r4.<init>(r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.ViewTransitionController r5 = r11.mViewTransitionController     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r5.add(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ae:
            androidx.constraintlayout.motion.widget.KeyFrames r4 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r4.<init>(r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.util.ArrayList r5 = r3.mKeyFramesList     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r5.add(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x00bc:
            r11.parseInclude((android.content.Context) r12, (org.xmlpull.v1.XmlPullParser) r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c1:
            r11.parseConstraintSet(r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c6:
            androidx.constraintlayout.widget.StateSet r4 = new androidx.constraintlayout.widget.StateSet     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r4.<init>(r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r11.mStateSet = r4     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x00cf:
            r3.addOnClick(r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x00d4:
            if (r3 != 0) goto L_0x0103
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r4 = r4.getResourceEntryName(r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            int r5 = r2.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r7 = " OnSwipe ("
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r4 = ".xml:"
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r6.append(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r4 = ")"
            r6.append(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r4 = r6.toString()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            android.util.Log.v(r1, r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x0103:
            androidx.constraintlayout.motion.widget.TouchResponse r4 = new androidx.constraintlayout.motion.widget.TouchResponse     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r11.mMotionLayout     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r4.<init>(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.TouchResponse unused = r3.mTouchResponse = r4     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x010e:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r11.mTransitionList     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = new androidx.constraintlayout.motion.widget.MotionScene$Transition     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r4.<init>(r11, r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r3.add(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r11.mCurrentTransition     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r3 != 0) goto L_0x013b
            boolean r3 = r4.mIsAbstract     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r3 != 0) goto L_0x013b
            r11.mCurrentTransition = r4     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r11.mCurrentTransition     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r3 == 0) goto L_0x013b
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r11.mCurrentTransition     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.TouchResponse r3 = r3.mTouchResponse     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r3 == 0) goto L_0x013b
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r11.mCurrentTransition     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            androidx.constraintlayout.motion.widget.TouchResponse r3 = r3.mTouchResponse     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            boolean r5 = r11.mRtl     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r3.setRTL(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x013b:
            boolean r3 = r4.mIsAbstract     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0154
            int r3 = r4.mConstraintSetEnd     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            if (r3 != r9) goto L_0x014a
            r11.mDefaultTransition = r4     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x014f
        L_0x014a:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r11.mAbstractTransitionList     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r3.add(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x014f:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r11.mTransitionList     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r3.remove(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x0154:
            r3 = r4
            goto L_0x0179
        L_0x0156:
            r11.parseMotionSceneTags(r12, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x015a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r6 = getLine(r12, r13, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r6 = "WARNING UNKNOWN ATTRIBUTE "
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            java.lang.String r4 = r5.toString()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            android.util.Log.v(r1, r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0179
        L_0x0176:
            r2.getName()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
        L_0x0179:
            int r4 = r2.next()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x017f }
            goto L_0x0011
        L_0x017f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = getLine(r12, r13, r2)
            r4.append(r12)
            r4.append(r0)
            java.lang.String r12 = r3.getMessage()
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            android.util.Log.v(r1, r12)
            r3.printStackTrace()
            goto L_0x01c2
        L_0x01a1:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = getLine(r12, r13, r2)
            r4.append(r12)
            r4.append(r0)
            java.lang.String r12 = r3.getMessage()
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            android.util.Log.v(r1, r12)
            r3.printStackTrace()
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.load(android.content.Context, int):void");
    }

    private void parseMotionSceneTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0185R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0185R.styleable.MotionScene_defaultDuration) {
                this.mDefaultDuration = obtainStyledAttributes.getInt(index, this.mDefaultDuration);
            } else if (index == C0185R.styleable.MotionScene_layoutDuringTransition) {
                this.mLayoutDuringTransition = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private int getId(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.DEBUG_DESKTOP) {
                PrintStream printStream = System.out;
                printStream.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    private void parseInclude(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0185R.styleable.Include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0185R.styleable.Include_constraintSet) {
                parseInclude(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
    }

    /* access modifiers changed from: private */
    public int parseInclude(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && CONSTRAINTSET_TAG.equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e) {
            Log.v("MotionScene", getLine(context, i, xml) + " " + e.getMessage());
            e.printStackTrace();
            return -1;
        } catch (IOException e2) {
            Log.v("MotionScene", getLine(context, i, xml) + " " + e2.getMessage());
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int parseConstraintSet(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r1 = 0
            r0.setForceId(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0011:
            r7 = 1
            if (r4 >= r2) goto L_0x007d
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.DEBUG_DESKTOP
            if (r10 == 0) goto L_0x0036
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L_0x0036:
            int r10 = r8.hashCode()
            r11 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            if (r10 == r11) goto L_0x004e
            r11 = 3355(0xd1b, float:4.701E-42)
            if (r10 == r11) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            java.lang.String r10 = "id"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0058
            r8 = 0
            goto L_0x0059
        L_0x004e:
            java.lang.String r10 = "deriveConstraintsFrom"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0058
            r8 = 1
            goto L_0x0059
        L_0x0058:
            r8 = -1
        L_0x0059:
            if (r8 == 0) goto L_0x0063
            if (r8 == r7) goto L_0x005e
            goto L_0x007a
        L_0x005e:
            int r6 = r13.getId(r14, r9)
            goto L_0x007a
        L_0x0063:
            int r5 = r13.getId(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.mConstraintSetIdMap
            java.lang.String r8 = stripID(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getName((android.content.Context) r14, (int) r5)
            r0.mIdString = r7
        L_0x007a:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x007d:
            if (r5 == r3) goto L_0x0097
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r13.mMotionLayout
            int r1 = r1.mDebugPath
            if (r1 == 0) goto L_0x0088
            r0.setValidateOnParse(r7)
        L_0x0088:
            r0.load((android.content.Context) r14, (org.xmlpull.v1.XmlPullParser) r15)
            if (r6 == r3) goto L_0x0092
            android.util.SparseIntArray r14 = r13.mDeriveMap
            r14.put(r5, r6)
        L_0x0092:
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> r14 = r13.mConstraintSetMap
            r14.put(r5, r0)
        L_0x0097:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.parseConstraintSet(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        if (this.DEBUG_DESKTOP) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.mConstraintSetMap.size());
        }
        for (int i = 0; i < this.mConstraintSetMap.size(); i++) {
            int keyAt = this.mConstraintSetMap.keyAt(i);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.DEBUG_DESKTOP) {
                PrintStream printStream3 = System.out;
                printStream3.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.mConstraintSetMap.get(keyAt);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public ConstraintSet getConstraintSet(int i) {
        return getConstraintSet(i, -1, -1);
    }

    /* access modifiers changed from: package-private */
    public ConstraintSet getConstraintSet(int i, int i2, int i3) {
        int stateGetConstraintID;
        if (this.DEBUG_DESKTOP) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.mConstraintSetMap.size());
        }
        StateSet stateSet = this.mStateSet;
        if (!(stateSet == null || (stateGetConstraintID = stateSet.stateGetConstraintID(i, i2, i3)) == -1)) {
            i = stateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(i) != null) {
            return this.mConstraintSetMap.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), i) + " In MotionScene");
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public void setConstraintSet(int i, ConstraintSet constraintSet) {
        this.mConstraintSetMap.put(i, constraintSet);
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            Transition transition2 = this.mDefaultTransition;
            if (transition2 != null) {
                Iterator it = transition2.mKeyFramesList.iterator();
                while (it.hasNext()) {
                    ((KeyFrames) it.next()).addFrames(motionController);
                }
                return;
            }
            return;
        }
        Iterator it2 = transition.mKeyFramesList.iterator();
        while (it2.hasNext()) {
            ((KeyFrames) it2.next()).addFrames(motionController);
        }
    }

    /* access modifiers changed from: package-private */
    public Key getKeyFrame(Context context, int i, int i2, int i3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return null;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            KeyFrames keyFrames = (KeyFrames) it.next();
            Iterator<Integer> it2 = keyFrames.getKeys().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer next = it2.next();
                    if (i2 == next.intValue()) {
                        Iterator<Key> it3 = keyFrames.getKeyFramesForView(next.intValue()).iterator();
                        while (it3.hasNext()) {
                            Key next2 = it3.next();
                            if (next2.mFramePosition == i3 && next2.mType == i) {
                                return next2;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getTransitionDirection(int i) {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mConstraintSetStart == i) {
                return 0;
            }
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    public boolean hasKeyFramePosition(View view, int i) {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return false;
        }
        Iterator it = transition.mKeyFramesList.iterator();
        while (it.hasNext()) {
            Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().mFramePosition == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void setKeyframe(View view, int i, String str, Object obj) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            Iterator it = transition.mKeyFramesList.iterator();
            while (it.hasNext()) {
                Iterator<Key> it2 = ((KeyFrames) it.next()).getKeyFramesForView(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().mFramePosition == i) {
                        int i2 = ((obj != null ? ((Float) obj).floatValue() : 0.0f) > 0.0f ? 1 : ((obj != null ? ((Float) obj).floatValue() : 0.0f) == 0.0f ? 0 : -1));
                        str.equalsIgnoreCase("app:PerpendicularPath_percent");
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean supportTouch() {
        Iterator<Transition> it = this.mTransitionList.iterator();
        while (it.hasNext()) {
            if (it.next().mTouchResponse != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void processTouchEvent(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                this.mLastTouchDown = motionEvent;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo == null || limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion == null || touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            this.mMotionOutsideRegion = false;
                        } else {
                            this.mMotionOutsideRegion = true;
                        }
                        this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                        return;
                    }
                    this.mLastTouchDown = null;
                    this.mIgnoreTouch = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.mIgnoreTouch) {
                float rawY = motionEvent.getRawY() - this.mLastTouchY;
                float rawX = motionEvent.getRawX() - this.mLastTouchX;
                if ((((double) rawX) != Utils.DOUBLE_EPSILON || ((double) rawY) != Utils.DOUBLE_EPSILON) && (motionEvent2 = this.mLastTouchDown) != null) {
                    Transition bestTransitionFor = bestTransitionFor(i, rawX, rawY, motionEvent2);
                    if (bestTransitionFor != null) {
                        motionLayout.setTransition(bestTransitionFor);
                        RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                        if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                            z = true;
                        }
                        this.mMotionOutsideRegion = z;
                        this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.mIgnoreTouch) {
            Transition transition = this.mCurrentTransition;
            if (!(transition == null || transition.mTouchResponse == null || this.mMotionOutsideRegion)) {
                this.mCurrentTransition.mTouchResponse.processTouchEvent(motionEvent, this.mVelocityTracker, i, this);
            }
            this.mLastTouchX = motionEvent.getRawX();
            this.mLastTouchY = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (motionTracker = this.mVelocityTracker) != null) {
                motionTracker.recycle();
                this.mVelocityTracker = null;
                if (motionLayout.mCurrentState != -1) {
                    autoTransition(motionLayout, motionLayout.mCurrentState);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void processScrollMove(float f, float f2) {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.scrollMove(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public void processScrollUp(float f, float f2) {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.scrollUp(f, f2);
        }
    }

    /* access modifiers changed from: package-private */
    public float getProgressDirection(float f, float f2) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(f, f2);
    }

    /* access modifiers changed from: package-private */
    public int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    /* access modifiers changed from: package-private */
    public int getEndId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public Interpolator getInterpolator() {
        switch (this.mCurrentTransition.mDefaultInterpolator) {
            case -2:
                return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
            case -1:
                final Easing interpolator = Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
                return new Interpolator() {
                    public float getInterpolation(float f) {
                        return (float) interpolator.get((double) f);
                    }
                };
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new BounceInterpolator();
            case 5:
                return new OvershootInterpolator();
            case 6:
                return new AnticipateInterpolator();
            default:
                return null;
        }
    }

    public int getDuration() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mDuration;
        }
        return this.mDefaultDuration;
    }

    public void setDuration(int i) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(i);
        } else {
            this.mDefaultDuration = i;
        }
    }

    public int gatPathMotionArc() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    public float getStaggered() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public float getMaxAcceleration() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    /* access modifiers changed from: package-private */
    public float getMaxVelocity() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    /* access modifiers changed from: package-private */
    public void setupTouch() {
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null) {
            this.mCurrentTransition.mTouchResponse.setupTouch();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean getMoveWhenScrollAtTop() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    /* access modifiers changed from: package-private */
    public void readFallback(MotionLayout motionLayout) {
        int i = 0;
        while (i < this.mConstraintSetMap.size()) {
            int keyAt = this.mConstraintSetMap.keyAt(i);
            if (hasCycleDependency(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            } else {
                readConstraintChain(keyAt);
                i++;
            }
        }
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            this.mConstraintSetMap.valueAt(i2).readFallback((ConstraintLayout) motionLayout);
        }
    }

    private boolean hasCycleDependency(int i) {
        int i2 = this.mDeriveMap.get(i);
        int size = this.mDeriveMap.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.mDeriveMap.get(i2);
            size = i3;
        }
        return false;
    }

    private void readConstraintChain(int i) {
        int i2 = this.mDeriveMap.get(i);
        if (i2 > 0) {
            readConstraintChain(this.mDeriveMap.get(i));
            ConstraintSet constraintSet = this.mConstraintSetMap.get(i);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i2);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.getName(this.mMotionLayout.getContext(), i2));
                return;
            }
            constraintSet.readFallback(constraintSet2);
            this.mDeriveMap.put(i, -1);
        }
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    public int lookUpConstraintId(String str) {
        return this.mConstraintSetIdMap.get(str).intValue();
    }

    public String lookUpConstraintName(int i) {
        for (Map.Entry next : this.mConstraintSetIdMap.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    public void disableAutoTransition(boolean z) {
        this.mDisableAutoTransition = z;
    }

    static String getLine(Context context, int i, XmlPullParser xmlPullParser) {
        return ".(" + Debug.getName(context, i) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }
}
