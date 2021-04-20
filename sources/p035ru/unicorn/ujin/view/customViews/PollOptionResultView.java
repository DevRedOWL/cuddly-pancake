package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.view.customViews.PollOptionResultView */
public class PollOptionResultView extends LinearLayout {
    private int progress = 0;
    private ProgressBar progressBar;
    private String text = "";
    private TextView textPercent;
    private TextView textTitle;

    public PollOptionResultView(Context context) {
        super(context);
        initView(context);
    }

    public PollOptionResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public PollOptionResultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public PollOptionResultView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context, R.layout.item_poll_option_result, this);
        this.progressBar = (ProgressBar) findViewById(R.id.pbPercent);
        this.textPercent = (TextView) findViewById(R.id.tvPercent);
        this.textTitle = (TextView) findViewById(R.id.tvPollOptionText);
    }

    public double getProgress() {
        return (double) this.progress;
    }

    public void setProgress(double d) {
        this.progress = (int) d;
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                PollOptionResultView.this.redraw();
            }
        }, 100);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: private */
    public void redraw() {
        this.progressBar.setProgress(this.progress);
        TextView textView = this.textPercent;
        textView.setText(this.progress + "%");
        this.textTitle.setText(this.text);
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                PollOptionResultView.this.redraw();
            }
        }, 100);
    }
}
