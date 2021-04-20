package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.AppUtils;

/* renamed from: ru.unicorn.ujin.view.customViews.ProgressLineView */
public class ProgressLineView extends LinearLayout {
    Runnable fixMargins = new Runnable() {
        public void run() {
            int measuredWidth = ((ProgressLineView.this.getMeasuredWidth() - ProgressLineView.this.halfTextPercentWidth) * ProgressLineView.this.progress) / 100;
            ProgressLineView progressLineView = ProgressLineView.this;
            progressLineView.maxPadding = (progressLineView.getMeasuredWidth() - ProgressLineView.this.textMaxPercent.getMeasuredWidth()) - ProgressLineView.this.textPercent.getMeasuredWidth();
            if (measuredWidth < ProgressLineView.this.textMinPercent.getMeasuredWidth()) {
                measuredWidth = ProgressLineView.this.textMinPercent.getMeasuredWidth();
            } else if (measuredWidth > ProgressLineView.this.maxPadding) {
                measuredWidth = ProgressLineView.this.maxPadding;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ProgressLineView.this.textPercent.getLayoutParams();
            layoutParams.setMargins(measuredWidth, 0, 0, 0);
            ProgressLineView.this.textPercent.setLayoutParams(layoutParams);
        }
    };
    int halfTextPercentWidth;
    int maxPadding;
    /* access modifiers changed from: private */
    public int progress = 0;
    private ProgressBar progressBar;
    /* access modifiers changed from: private */
    public TextView textMaxPercent;
    /* access modifiers changed from: private */
    public TextView textMinPercent;
    /* access modifiers changed from: private */
    public TextView textPercent;

    public ProgressLineView(Context context) {
        super(context);
        initView(context);
    }

    public ProgressLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public ProgressLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context, R.layout.view_progressline, this);
        this.halfTextPercentWidth = AppUtils.dpToPx(getContext(), 18);
        this.textMinPercent = (TextView) findViewById(R.id.textMinPercent);
        this.textMaxPercent = (TextView) findViewById(R.id.textMaxPercent);
        this.textPercent = (TextView) findViewById(R.id.textPercent);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        redraw();
    }

    public int getProgress() {
        return this.progress;
    }

    public void setProgress(int i) {
        this.progress = i;
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                ProgressLineView.this.redraw();
            }
        }, 100);
    }

    /* access modifiers changed from: private */
    public void redraw() {
        this.textMinPercent.setTextColor(getContext().getResources().getColor(R.color.textSecondary));
        this.textMaxPercent.setTextColor(getContext().getResources().getColor(R.color.textSecondary));
        this.progressBar.setProgress(this.progress);
        this.progressBar.setVisibility(0);
        int i = this.progress;
        if (i > 0 && i < 100) {
            TextView textView = this.textPercent;
            textView.setText(this.progress + "%");
            this.textPercent.setVisibility(0);
        } else if (this.progress == 100) {
            this.textPercent.setVisibility(8);
            this.textMaxPercent.setTextColor(getContext().getResources().getColor(R.color.textPrimary));
        } else {
            this.textPercent.setVisibility(8);
            this.textMinPercent.setTextColor(getContext().getResources().getColor(R.color.textPrimary));
        }
        new Handler().postDelayed(this.fixMargins, 300);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
}
