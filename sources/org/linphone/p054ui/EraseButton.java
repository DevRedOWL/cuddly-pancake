package org.linphone.p054ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* renamed from: org.linphone.ui.EraseButton */
public class EraseButton extends ImageView implements AddressAware, View.OnClickListener, View.OnLongClickListener, TextWatcher {
    private AddressText address;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public EraseButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    public void onClick(View view) {
        if (this.address.getText().length() > 0) {
            int selectionStart = this.address.getSelectionStart();
            if (selectionStart == -1) {
                selectionStart = this.address.getEditableText().length() - 1;
            }
            if (selectionStart > 0) {
                this.address.getEditableText().delete(selectionStart - 1, selectionStart);
            }
        }
    }

    public boolean onLongClick(View view) {
        this.address.getEditableText().clear();
        return true;
    }

    public void setAddressWidget(AddressText addressText) {
        this.address = addressText;
        addressText.addTextChangedListener(this);
    }

    public void afterTextChanged(Editable editable) {
        setEnabled(editable.length() > 0);
    }
}
