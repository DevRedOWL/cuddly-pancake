package org.linphone.p054ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import org.linphone.C5321R;

/* renamed from: org.linphone.ui.CircleLabelView */
public class CircleLabelView extends ConstraintLayout {
    int dynamicBackgroundColorActive;
    int dynamicBackgroundColorPressed;
    int dynamicBackgroundDisable;
    private FloatingActionButton fab;
    private TextView label;

    public CircleLabelView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public CircleLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public CircleLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public CircleLabelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(C5321R.layout.button_with_label, this, true);
        this.label = (TextView) findViewById(C5321R.C5324id.label);
        this.fab = (FloatingActionButton) findViewById(C5321R.C5324id.fab);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5321R.styleable.CircleLabelView, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(C5321R.styleable.CircleLabelView_icon, C5321R.C5323drawable.ic_svg_door);
            this.dynamicBackgroundColorActive = obtainStyledAttributes.getColor(C5321R.styleable.CircleLabelView_colorActive, ContextCompat.getColor(getContext(), C5321R.C5322color.colorAccentControl));
            this.dynamicBackgroundColorPressed = obtainStyledAttributes.getColor(C5321R.styleable.CircleLabelView_colorPressed, ContextCompat.getColor(getContext(), C5321R.C5322color.colorAccentDarkControl));
            this.dynamicBackgroundDisable = obtainStyledAttributes.getColor(C5321R.styleable.CircleLabelView_colorDisable, ContextCompat.getColor(getContext(), C5321R.C5322color.colorAccentDisabled));
            this.fab.setImageDrawable(AppCompatResources.getDrawable(getContext(), resourceId));
            this.label.setTextColor(-1);
            this.label.setText(obtainStyledAttributes.getText(C5321R.styleable.CircleLabelView_label));
            obtainStyledAttributes.recycle();
        }
        createDrawable();
    }

    private void createDrawable() {
        this.fab.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{16842910}, new int[]{-16842910}, new int[]{16842919}}, new int[]{this.dynamicBackgroundColorActive, this.dynamicBackgroundDisable, this.dynamicBackgroundColorPressed}));
        this.fab.setRippleColor(getDynamicBackgroundColorPressed());
    }

    public void setCaption(CharSequence charSequence) {
        this.label.setText(charSequence, TextView.BufferType.SPANNABLE);
        this.label.invalidate();
        this.label.requestLayout();
    }

    public void setArrowOnClickListener(View.OnClickListener onClickListener) {
        this.fab.setOnClickListener(onClickListener);
    }

    public int getDynamicBackgroundColorActive() {
        return this.dynamicBackgroundColorActive;
    }

    public int getDynamicBackgroundColorPressed() {
        return this.dynamicBackgroundColorPressed;
    }

    public int getDynamicBackgroundDisable() {
        return this.dynamicBackgroundDisable;
    }
}
