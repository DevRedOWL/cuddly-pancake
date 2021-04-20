package p035ru.unicorn.ujin.market.offer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/market/offer/TagListLayout;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "horizontalSpacing", "", "verticalSpacing", "onLayout", "", "changed", "", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.TagListLayout */
/* compiled from: TagListLayout.kt */
public final class TagListLayout extends ViewGroup {
    private HashMap _$_findViewCache;
    private int horizontalSpacing;
    private int verticalSpacing;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TagListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.horizontalSpacing = (int) context.getResources().getDimension(R.dimen.base_8);
        this.verticalSpacing = (int) context.getResources().getDimension(R.dimen.base_4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int i5 = paddingTop;
        int i6 = 0;
        int i7 = paddingLeft;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            Intrinsics.checkNotNullExpressionValue(childAt, "child");
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                if (i7 + measuredWidth > paddingRight) {
                    i5 += i6 + this.verticalSpacing;
                    i7 = paddingLeft;
                    i6 = measuredHeight;
                } else {
                    i6 = Math.max(i6, measuredHeight);
                }
                childAt.layout(i7, i5, i7 + measuredWidth, measuredHeight + i5);
                i7 += measuredWidth + this.horizontalSpacing;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            Intrinsics.checkNotNullExpressionValue(childAt, "child");
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                int i8 = i6 + measuredWidth;
                if (i8 > size) {
                    i3 += i4 + this.verticalSpacing;
                    i5++;
                    i8 = measuredWidth;
                } else {
                    measuredHeight = Math.max(i4, measuredHeight);
                }
                i6 = i8 + this.horizontalSpacing;
                i4 = measuredHeight;
            }
        }
        int paddingTop = getPaddingTop() + getPaddingBottom() + i3 + i4;
        int paddingLeft = i5 == 0 ? getPaddingLeft() + getPaddingRight() + i6 : size;
        if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824) {
            paddingTop = size2;
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }
}
