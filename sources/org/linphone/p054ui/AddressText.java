package org.linphone.p054ui;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import org.linphone.C5321R;
import org.linphone.DialerFragment;
import org.linphone.LinphoneManager;

/* renamed from: org.linphone.ui.AddressText */
public class AddressText extends EditText implements LinphoneManager.AddressType {
    private DialerFragment dialer;
    private String displayedName;
    private Paint mTestPaint = new Paint();
    private Uri pictureUri;

    public void setPictureUri(Uri uri) {
        this.pictureUri = uri;
    }

    public Uri getPictureUri() {
        return this.pictureUri;
    }

    public AddressText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTestPaint.set(getPaint());
    }

    public void clearDisplayedName() {
        this.displayedName = null;
    }

    public String getDisplayedName() {
        return this.displayedName;
    }

    public void setContactAddress(String str, String str2) {
        setText(str);
        this.displayedName = str2;
    }

    public void setDisplayedName(String str) {
        this.displayedName = str;
    }

    private String getHintText() {
        return getHint() != null ? getHint().toString() : getContext().getString(C5321R.string.address_bar_hint);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        clearDisplayedName();
        this.pictureUri = null;
        refitText(getWidth(), getHeight());
        DialerFragment dialerFragment = this.dialer;
        if (dialerFragment != null) {
            dialerFragment.enableDisableAddContact();
        }
        super.onTextChanged(charSequence, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            refitText(getWidth(), getHeight());
        }
    }

    private float getOptimizedTextSize(String str, int i, int i2) {
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        this.mTestPaint.set(getPaint());
        float f = 90.0f;
        float f2 = 2.0f;
        while (f - f2 > 0.5f) {
            float f3 = (f + f2) / 2.0f;
            this.mTestPaint.setTextSize(f3);
            if (this.mTestPaint.measureText(str) >= ((float) paddingLeft) || f3 >= ((float) paddingTop)) {
                f = f3;
            } else {
                f2 = f3;
            }
        }
        return f2;
    }

    private void refitText(int i, int i2) {
        if (i > 0) {
            float optimizedTextSize = getOptimizedTextSize(getHintText(), i, i2);
            float optimizedTextSize2 = getOptimizedTextSize(getText().toString(), i, i2);
            if (optimizedTextSize2 >= optimizedTextSize) {
                optimizedTextSize2 = optimizedTextSize;
            }
            setTextSize(0, optimizedTextSize2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = getMeasuredHeight();
        refitText(size, measuredHeight);
        setMeasuredDimension(size, measuredHeight);
    }

    public void setDialerFragment(DialerFragment dialerFragment) {
        this.dialer = dialerFragment;
    }
}
