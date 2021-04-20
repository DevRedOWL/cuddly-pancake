package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.customViews.IntellectView */
public class IntellectView extends ViewGroup implements View.OnClickListener {
    private int cornerRadius;
    private int dividerHeight;
    private int fullSizeColor;
    private TextView labelTextView;
    private TextView makeBetterTextView;
    private OnMakeBetterClick onMakeBetterClick;
    private int paddingBottom;
    private int paddingHorizontal;
    private int paddingLeft;
    private int paddingRight;
    private int paddingVertical;
    private Paint paint;
    private int percent = -1;
    private int primaryTextColor;
    private float primaryTextSize;
    private int progressSizeColor;
    private RectF rectF;
    private int secondaryTextColor;
    private float secondaryTextSize;

    /* renamed from: ru.unicorn.ujin.view.customViews.IntellectView$OnMakeBetterClick */
    public interface OnMakeBetterClick {
        void onMakeBetterClickListener();
    }

    public IntellectView(Context context) {
        super(context);
        init(context);
    }

    public IntellectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        setClipToPadding(false);
        this.rectF = new RectF();
        this.paint = new Paint();
        this.primaryTextColor = ContextCompat.getColor(context, R.color.color_text);
        this.secondaryTextColor = ContextCompat.getColor(context, R.color.item_scenario_title_text);
        this.fullSizeColor = ContextCompat.getColor(context, R.color.color_text_scale_time);
        this.progressSizeColor = ContextCompat.getColor(context, R.color.progress);
        this.paddingLeft = dpToPx(24);
        this.paddingRight = dpToPx(18);
        this.paddingHorizontal = dpToPx(20);
        this.paddingVertical = dpToPx(8);
        this.paddingBottom = dpToPx(10);
        this.cornerRadius = dpToPx(4);
        this.dividerHeight = dpToPx(6);
        this.primaryTextSize = 14.0f;
        this.secondaryTextSize = 12.0f;
        this.labelTextView = new TextView(context);
        this.labelTextView.setTextColor(this.secondaryTextColor);
        this.labelTextView.setTextSize(this.secondaryTextSize);
        this.labelTextView.setGravity(GravityCompat.START);
        addView(this.labelTextView);
        this.makeBetterTextView = new TextView(context);
        this.makeBetterTextView.setTextColor(this.primaryTextColor);
        this.makeBetterTextView.setTextSize(this.primaryTextSize);
        this.makeBetterTextView.setGravity(GravityCompat.END);
        this.makeBetterTextView.setText(R.string.make_better);
        this.makeBetterTextView.setClickable(true);
        this.makeBetterTextView.setOnClickListener(this);
        addView(this.makeBetterTextView);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        this.labelTextView.setMaxWidth(defaultSize);
        this.makeBetterTextView.setMaxWidth(defaultSize / 3);
        measureChild(this.labelTextView, defaultSize, i2);
        measureChild(this.makeBetterTextView, defaultSize / 4, i2);
        setMeasuredDimension(defaultSize, (this.paddingVertical * 2) + this.labelTextView.getMeasuredHeight() + this.makeBetterTextView.getMeasuredHeight() + this.paddingBottom);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.paddingHorizontal;
        int i6 = (i3 - i) - i5;
        int i7 = this.paddingVertical * 2;
        TextView textView = this.labelTextView;
        textView.layout(i5, i7, textView.getMeasuredWidth() + i5, this.labelTextView.getMeasuredHeight() + i7);
        int measuredHeight = i7 + this.labelTextView.getMeasuredHeight();
        TextView textView2 = this.makeBetterTextView;
        textView2.layout(i6 - textView2.getMeasuredWidth(), measuredHeight, i6, this.makeBetterTextView.getMeasuredHeight() + measuredHeight);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int width = canvas.getWidth();
        canvas.getHeight();
        this.paint.setColor(this.fullSizeColor);
        this.paint.setStrokeWidth((float) this.dividerHeight);
        int bottom = this.makeBetterTextView.getBottom();
        this.rectF.set((float) this.paddingHorizontal, (float) (bottom - (this.dividerHeight * 2)), (float) (((width - this.makeBetterTextView.getMeasuredWidth()) - this.paddingLeft) - this.paddingRight), (float) (bottom - this.dividerHeight));
        RectF rectF2 = this.rectF;
        int i = this.cornerRadius;
        canvas.drawRoundRect(rectF2, (float) i, (float) i, this.paint);
        this.paint.setColor(this.progressSizeColor);
        if (getPercent() >= 0 && getPercent() <= 100) {
            this.rectF.set((float) this.paddingHorizontal, (float) (bottom - (this.dividerHeight * 2)), ((float) (((width - this.makeBetterTextView.getMeasuredWidth()) - this.paddingLeft) - this.paddingRight)) * (((float) getPercent()) / 100.0f), (float) (bottom - this.dividerHeight));
            RectF rectF3 = this.rectF;
            int i2 = this.cornerRadius;
            canvas.drawRoundRect(rectF3, (float) i2, (float) i2, this.paint);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    public void bindIntellect(int i) {
        this.labelTextView.setText("Интеллект дома " + i + "%");
        setPercent(i);
    }

    public int getPercent() {
        return this.percent;
    }

    public void setPercent(int i) {
        this.percent = i;
    }

    public void setOnMakeBetterClick(OnMakeBetterClick onMakeBetterClick2) {
        this.onMakeBetterClick = onMakeBetterClick2;
    }

    public void onClick(View view) {
        OnMakeBetterClick onMakeBetterClick2 = this.onMakeBetterClick;
        if (onMakeBetterClick2 != null) {
            onMakeBetterClick2.onMakeBetterClickListener();
        }
    }
}
