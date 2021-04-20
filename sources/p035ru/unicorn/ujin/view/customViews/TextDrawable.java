package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.TypedValue;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.Flavors;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0017H\u0016J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0017H\u0002R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/TextDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "text", "", "(Landroid/content/Context;Ljava/lang/CharSequence;)V", "mContext", "mDrawable", "mPaint", "Landroid/text/TextPaint;", "mTextBounds", "Landroid/graphics/Rect;", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getIntrinsicHeight", "", "getIntrinsicWidth", "getOpacity", "setAlpha", "alpha", "setColorFilter", "filter", "Landroid/graphics/ColorFilter;", "tintDrawable", "n", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.TextDrawable */
/* compiled from: TextDrawable.kt */
public final class TextDrawable extends Drawable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int DEFAULT_COLOR = Color.parseColor("#444444");
    private static final int DEFAULT_TEXT_SIZE_IN_DP = 14;
    private final Context mContext;
    private final Drawable mDrawable;
    private final TextPaint mPaint = new TextPaint(1);
    private final Rect mTextBounds = new Rect();
    private CharSequence text;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/TextDrawable$Companion;", "", "()V", "DEFAULT_COLOR", "", "DEFAULT_TEXT_SIZE_IN_DP", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.customViews.TextDrawable$Companion */
    /* compiled from: TextDrawable.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TextDrawable(Context context, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNull(context);
        this.mContext = context;
        this.text = charSequence;
        this.mPaint.setTypeface(ResourcesCompat.getFont(this.mContext, R.font.medium));
        this.mPaint.setColor(DEFAULT_COLOR);
        this.mPaint.setTextAlign(Paint.Align.CENTER);
        Resources resources = this.mContext.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "mContext.resources");
        this.mPaint.setTextSize(TypedValue.applyDimension(1, (float) DEFAULT_TEXT_SIZE_IN_DP, resources.getDisplayMetrics()));
        Drawable drawable = AppCompatResources.getDrawable(this.mContext, R.drawable.circle_chat);
        Intrinsics.checkNotNull(drawable);
        this.mDrawable = drawable;
        Drawable drawable2 = this.mDrawable;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final void setText(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "value");
        this.text = charSequence;
        invalidateSelf();
    }

    private final void tintDrawable(int i) {
        int[] intArray = this.mContext.getResources().getIntArray(R.array.chat_colors);
        Intrinsics.checkNotNullExpressionValue(intArray, "mContext.resources.getIn…rray(R.array.chat_colors)");
        DrawableCompat.setTint(this.mDrawable, intArray[i % intArray.length]);
    }

    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        if (this.text.length() > 0) {
            if (Intrinsics.areEqual((Object) "kortros", (Object) Flavors.ORDYNKA)) {
                int[] intArray = this.mContext.getResources().getIntArray(R.array.chat_colors);
                Intrinsics.checkNotNullExpressionValue(intArray, "mContext.resources.getIn…rray(R.array.chat_colors)");
                this.mPaint.setColor(intArray[this.text.charAt(0) % intArray.length]);
            } else {
                char charAt = this.text.charAt(0);
                CharSequence charSequence = this.text;
                tintDrawable(charAt + charSequence.charAt(StringsKt.getLastIndex(charSequence)));
            }
            this.mDrawable.draw(canvas);
            this.mPaint.getTextBounds(this.text.toString(), 0, this.text.length(), this.mTextBounds);
            canvas.drawText(StringsKt.substring(this.text, new IntRange(0, 0)), ((float) bounds.right) / 1.95f, (((float) bounds.bottom) + ((float) (this.mTextBounds.bottom - this.mTextBounds.top))) / 2.1f, this.mPaint);
        }
    }

    public int getOpacity() {
        return this.mPaint.getAlpha();
    }

    public int getIntrinsicWidth() {
        return this.mDrawable.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.mDrawable.getIntrinsicHeight();
    }

    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
