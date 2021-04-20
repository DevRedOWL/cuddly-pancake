package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J@\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001bH\u0016J\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/SwipeToDeleteCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "background", "Landroid/graphics/drawable/ColorDrawable;", "clearPaint", "Landroid/graphics/Paint;", "deleteIcon", "Landroid/graphics/drawable/Drawable;", "intrinsicHeight", "", "intrinsicWidth", "clearCanvas", "", "c", "Landroid/graphics/Canvas;", "left", "", "top", "right", "bottom", "onChildDraw", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "dY", "actionState", "isCurrentlyActive", "", "onMove", "target", "onSwiped", "direction", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.SwipeToDeleteCallback */
/* compiled from: SwipeToDeleteCallback.kt */
public abstract class SwipeToDeleteCallback extends ItemTouchHelper.SimpleCallback {
    private final ColorDrawable background;
    private final Paint clearPaint;
    private final Drawable deleteIcon;
    private final int intrinsicHeight;
    private final int intrinsicWidth;

    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(viewHolder2, TouchesHelper.TARGET_KEY);
        return false;
    }

    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDeleteCallback(Context context) {
        super(0, 4);
        Intrinsics.checkNotNullParameter(context, "context");
        int i = 0;
        this.deleteIcon = ContextCompat.getDrawable(context, R.drawable.ic_wastebasket_white);
        Drawable drawable = this.deleteIcon;
        this.intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        Drawable drawable2 = this.deleteIcon;
        this.intrinsicHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : i;
        this.background = new ColorDrawable();
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Unit unit = Unit.INSTANCE;
        this.clearPaint = paint;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        int bottom = view.getBottom() - view.getTop();
        if (f == 0.0f && !z) {
            clearCanvas(canvas, ((float) view.getRight()) + f, (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
            return;
        }
        this.background.setColor(view.getResources().getColor(R.color.brandBadgeColor));
        this.background.setBounds(view.getRight() + ((int) f), view.getTop(), view.getRight(), view.getBottom());
        this.background.draw(canvas);
        int top = view.getTop();
        int i2 = this.intrinsicHeight;
        int i3 = top + ((bottom - i2) / 2);
        int i4 = (bottom - i2) / 4;
        int right = (view.getRight() - i4) - this.intrinsicWidth;
        int right2 = view.getRight() - i4;
        int i5 = this.intrinsicHeight + i3;
        Drawable drawable = this.deleteIcon;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(view.getResources().getColor(R.color.marketBadgeTextColor), PorterDuff.Mode.SRC_ATOP));
        }
        Drawable drawable2 = this.deleteIcon;
        if (drawable2 != null) {
            drawable2.setBounds(right, i3, right2, i5);
        }
        Drawable drawable3 = this.deleteIcon;
        if (drawable3 != null) {
            drawable3.draw(canvas);
        }
        super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
    }

    private final void clearCanvas(Canvas canvas, float f, float f2, float f3, float f4) {
        if (canvas != null) {
            canvas.drawRect(f, f2, f3, f4, this.clearPaint);
        }
    }
}
