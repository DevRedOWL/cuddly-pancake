package p035ru.unicorn.ujin.view.customViews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.facebook.react.uimanager.ViewProps;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

/* renamed from: ru.unicorn.ujin.view.customViews.DynamicBackgroundButton */
public class DynamicBackgroundButton extends AppCompatButton {
    int dynamicBackgroundColorActive;
    int dynamicBackgroundColorPressed;
    int dynamicBackgroundDisable;
    private float radius;
    int strokeWidth;
    boolean stroked;
    Type type;
    int typeInt;

    /* renamed from: ru.unicorn.ujin.view.customViews.DynamicBackgroundButton$Type */
    public enum Type {
        PRIMARY(1, R.color.buttonPrimary, R.color.buttonPrimaryPressed, R.color.buttonPrimaryDisabled, R.color.buttonPrimaryText),
        SECONDARY(2, R.color.buttonSecondary, R.color.buttonSecondaryPressed, R.color.buttonSecondaryDisabled, R.color.buttonSecondaryText),
        TERTIARY(3, R.color.brandTertiary, R.color.brandTertiaryDark, R.color.brandTertiaryLight, R.color.white),
        NOT_ACTIVE(3, R.color.notActiveBtnBackground, R.color.notActiveBtnBackgroundPressed, R.color.brandDisabled, R.color.notActiveBtnText),
        OUTLINED(4, R.color.buttonOutlined, R.color.buttonOutlinedPressed, R.color.buttonOutlinedDisabled, R.color.buttonOutlinedText),
        OUTLINED_DEFAULT(5, R.color.transparent, R.color.buttonOutlinedPressed, R.color.buttonOutlinedDisabled, R.color.buttonOutlinedText),
        ACCENT(6, R.color.buttonAccent, R.color.buttonAccentPressed, R.color.buttonAccentDisabled, R.color.buttonAccentText);
        
        private int color;
        private int colorDisabled;
        private int colorPressed;
        private int textColor;
        private int type;

        private Type(int i, int i2, int i3, int i4, int i5) {
            this.type = i;
            this.color = i2;
            this.colorPressed = i3;
            this.colorDisabled = i4;
            this.textColor = i5;
        }

        public static Type getByInt(int i) {
            Type type2 = PRIMARY;
            if (i == type2.type) {
                return type2;
            }
            Type type3 = SECONDARY;
            if (i == type3.type) {
                return type3;
            }
            Type type4 = TERTIARY;
            if (i == type4.type) {
                return type4;
            }
            Type type5 = OUTLINED;
            if (i == type5.type) {
                return type5;
            }
            Type type6 = ACCENT;
            return i == type6.type ? type6 : type2;
        }

        public int getColor() {
            return this.color;
        }

        public int getColorPressed() {
            return this.colorPressed;
        }

        public int getColorDisabled() {
            return this.colorDisabled;
        }

        public int getTextColor() {
            return this.textColor;
        }
    }

    private DynamicBackgroundButton(Context context) {
        super(context);
    }

    public DynamicBackgroundButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5619R.styleable.DynamicBackgroundButton);
        this.radius = obtainStyledAttributes.getDimension(3, getResources().getDimension(R.dimen.mainButtonRadius));
        this.stroked = obtainStyledAttributes.getBoolean(5, false);
        this.strokeWidth = (int) obtainStyledAttributes.getDimension(4, getResources().getDimension(R.dimen.mainButtonStrokeWidth));
        this.typeInt = obtainStyledAttributes.getInteger(6, 1);
        this.type = Type.getByInt(this.typeInt);
        setDefaults(attributeSet);
        setType(this.type);
        this.dynamicBackgroundColorActive = obtainStyledAttributes.getColor(0, ContextCompat.getColor(getContext(), this.type.getColor()));
        this.dynamicBackgroundColorPressed = obtainStyledAttributes.getColor(2, ContextCompat.getColor(getContext(), this.type.getColorPressed()));
        this.dynamicBackgroundDisable = obtainStyledAttributes.getColor(1, ContextCompat.getColor(getContext(), this.type.getColorDisabled()));
        obtainStyledAttributes.recycle();
        ViewCompat.setBackground(this, createDrawable());
    }

    public void setType(Type type2) {
        this.type = type2;
        this.dynamicBackgroundColorActive = ContextCompat.getColor(getContext(), type2.getColor());
        this.dynamicBackgroundColorPressed = ContextCompat.getColor(getContext(), type2.getColorPressed());
        this.dynamicBackgroundDisable = ContextCompat.getColor(getContext(), type2.getColorDisabled());
        setTextColor(getResources().getColor(type2.getTextColor()));
        ViewCompat.setBackground(this, createDrawable());
        invalidate();
    }

    public void setCustomColors(int i, int i2, int i3, int i4) {
        this.dynamicBackgroundColorActive = i;
        this.dynamicBackgroundColorPressed = i2;
        this.dynamicBackgroundDisable = i3;
        setTextColor(i4);
        ViewCompat.setBackground(this, createDrawable());
        invalidate();
    }

    private void setDefaults(AttributeSet attributeSet) {
        if (StringUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "textColor"))) {
            setTextColor(getResources().getColor(this.type.getTextColor()));
        }
        if (StringUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", ViewProps.FONT_FAMILY))) {
            setTypeface(ResourcesCompat.getFont(getContext(), R.font.medium));
        }
        if (StringUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "textSize"))) {
            setTextSize(0, getResources().getDimension(R.dimen.mainButtonTextSize));
        }
        if (StringUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "textAllCaps"))) {
            setAllCaps(false);
        }
        if (StringUtils.isEmpty(attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "gravity"))) {
            setGravity(17);
        }
    }

    private StateListDrawable createDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        if (this.stroked || this.type == Type.OUTLINED) {
            int color = getResources().getColor(R.color.transparent);
            gradientDrawable.setColor(color);
            gradientDrawable2.setColor(color);
            gradientDrawable3.setColor(color);
            gradientDrawable.setStroke(this.strokeWidth, getDynamicBackgroundColorActive());
            gradientDrawable2.setStroke(this.strokeWidth, getDynamicBackgroundColorPressed());
            gradientDrawable3.setStroke(this.strokeWidth, getDynamicBackgroundDisable());
        } else {
            gradientDrawable.setColor(getDynamicBackgroundColorActive());
            gradientDrawable2.setColor(getDynamicBackgroundColorPressed());
            gradientDrawable3.setColor(getDynamicBackgroundDisable());
        }
        gradientDrawable.setCornerRadius(getRadius());
        gradientDrawable2.setCornerRadius(getRadius());
        gradientDrawable3.setCornerRadius(getRadius());
        stateListDrawable.addState(new int[]{-16842919, 16842910}, gradientDrawable);
        stateListDrawable.addState(new int[]{16842919, 16842910}, gradientDrawable2);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable3);
        return stateListDrawable;
    }

    public float getRadius() {
        return this.radius;
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
