package org.linphone.p054ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import org.linphone.C5321R;

/* renamed from: org.linphone.ui.Numpad */
public class Numpad extends LinearLayout implements AddressAware {
    private boolean mPlayDtmf;

    public void setPlayDtmf(boolean z) {
        this.mPlayDtmf = z;
    }

    public Numpad(Context context, boolean z) {
        super(context);
        this.mPlayDtmf = z;
        LayoutInflater.from(context).inflate(C5321R.layout.numpad, this);
        setLongClickable(true);
        onFinishInflate();
    }

    public Numpad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5321R.styleable.Numpad);
        this.mPlayDtmf = 1 == obtainStyledAttributes.getInt(C5321R.styleable.Numpad_play_dtmf, 1);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(C5321R.layout.numpad, this);
        setLongClickable(true);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        for (Digit playDtmf : retrieveChildren(this, Digit.class)) {
            playDtmf.setPlayDtmf(this.mPlayDtmf);
        }
        super.onFinishInflate();
    }

    public void setAddressWidget(AddressText addressText) {
        for (AddressAware addressWidget : retrieveChildren(this, AddressAware.class)) {
            addressWidget.setAddressWidget(addressText);
        }
    }

    private final <T> Collection<T> retrieveChildren(ViewGroup viewGroup, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(retrieveChildren((ViewGroup) childAt, cls));
            } else if (cls.isInstance(childAt)) {
                arrayList.add(cls.cast(childAt));
            }
        }
        return arrayList;
    }
}
