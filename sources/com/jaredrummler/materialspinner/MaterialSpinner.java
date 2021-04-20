package com.jaredrummler.materialspinner;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class MaterialSpinner extends TextView {
    /* access modifiers changed from: private */
    public MaterialSpinnerBaseAdapter adapter;
    private int arrowColor;
    private int arrowColorDisabled;
    private Drawable arrowDrawable;
    private int backgroundColor;
    private int backgroundSelector;
    /* access modifiers changed from: private */
    public boolean hideArrow;
    private int hintColor;
    /* access modifiers changed from: private */
    public String hintText;
    private ListView listView;
    /* access modifiers changed from: private */
    public boolean nothingSelected;
    /* access modifiers changed from: private */
    public OnItemSelectedListener onItemSelectedListener;
    /* access modifiers changed from: private */
    public OnNothingSelectedListener onNothingSelectedListener;
    private int popupPaddingBottom;
    private int popupPaddingLeft;
    private int popupPaddingRight;
    private int popupPaddingTop;
    private PopupWindow popupWindow;
    private int popupWindowHeight;
    private int popupWindowMaxHeight;
    /* access modifiers changed from: private */
    public int selectedIndex;
    /* access modifiers changed from: private */
    public int textColor;

    public interface OnItemSelectedListener<T> {
        void onItemSelected(MaterialSpinner materialSpinner, int i, long j, T t);
    }

    public interface OnNothingSelectedListener {
        void onNothingSelected(MaterialSpinner materialSpinner);
    }

    public MaterialSpinner(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    private void init(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        String str;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2739R.styleable.MaterialSpinner);
        int defaultColor = getTextColors().getDefaultColor();
        boolean isRtl = Utils.isRtl(context);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C2739R.dimen.ms__padding_top);
        if (isRtl) {
            i = resources.getDimensionPixelSize(C2739R.dimen.ms__padding_left);
            i2 = dimensionPixelSize;
        } else {
            i2 = resources.getDimensionPixelSize(C2739R.dimen.ms__padding_left);
            i = dimensionPixelSize;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C2739R.dimen.ms__popup_padding_left);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C2739R.dimen.ms__popup_padding_top);
        try {
            this.backgroundColor = obtainStyledAttributes.getColor(C2739R.styleable.MaterialSpinner_ms_background_color, -1);
            this.backgroundSelector = obtainStyledAttributes.getResourceId(C2739R.styleable.MaterialSpinner_ms_background_selector, 0);
            this.textColor = obtainStyledAttributes.getColor(C2739R.styleable.MaterialSpinner_ms_text_color, defaultColor);
            this.hintColor = obtainStyledAttributes.getColor(C2739R.styleable.MaterialSpinner_ms_hint_color, defaultColor);
            this.arrowColor = obtainStyledAttributes.getColor(C2739R.styleable.MaterialSpinner_ms_arrow_tint, this.textColor);
            this.hideArrow = obtainStyledAttributes.getBoolean(C2739R.styleable.MaterialSpinner_ms_hide_arrow, false);
            if (obtainStyledAttributes.getString(C2739R.styleable.MaterialSpinner_ms_hint) == null) {
                str = "";
            } else {
                str = obtainStyledAttributes.getString(C2739R.styleable.MaterialSpinner_ms_hint);
            }
            this.hintText = str;
            this.popupWindowMaxHeight = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_dropdown_max_height, 0);
            this.popupWindowHeight = obtainStyledAttributes.getLayoutDimension(C2739R.styleable.MaterialSpinner_ms_dropdown_height, -2);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_padding_top, dimensionPixelSize);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_padding_left, i2);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_padding_bottom, dimensionPixelSize);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_padding_right, i);
            this.popupPaddingTop = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_popup_padding_top, dimensionPixelSize3);
            this.popupPaddingLeft = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_popup_padding_left, dimensionPixelSize2);
            this.popupPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_popup_padding_bottom, dimensionPixelSize3);
            this.popupPaddingRight = obtainStyledAttributes.getDimensionPixelSize(C2739R.styleable.MaterialSpinner_ms_popup_padding_right, dimensionPixelSize2);
            this.arrowColorDisabled = Utils.lighter(this.arrowColor, 0.8f);
            obtainStyledAttributes.recycle();
            this.nothingSelected = true;
            setGravity(8388627);
            setClickable(true);
            setPadding(dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize7, dimensionPixelSize6);
            setBackgroundResource(C2739R.C2740drawable.ms__selector);
            if (Build.VERSION.SDK_INT >= 17 && isRtl) {
                setLayoutDirection(1);
                setTextDirection(4);
            }
            if (!this.hideArrow) {
                this.arrowDrawable = Utils.getDrawable(context, C2739R.C2740drawable.ms__arrow).mutate();
                this.arrowDrawable.setColorFilter(this.arrowColor, PorterDuff.Mode.SRC_IN);
                Drawable[] compoundDrawables = getCompoundDrawables();
                if (isRtl) {
                    compoundDrawables[0] = this.arrowDrawable;
                } else {
                    compoundDrawables[2] = this.arrowDrawable;
                }
                setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            }
            this.listView = new ListView(context);
            this.listView.setId(getId());
            this.listView.setDivider((Drawable) null);
            this.listView.setItemsCanFocus(true);
            this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i >= MaterialSpinner.this.selectedIndex && i < MaterialSpinner.this.adapter.getCount() && MaterialSpinner.this.adapter.getItems().size() != 1 && TextUtils.isEmpty(MaterialSpinner.this.hintText)) {
                        i++;
                    }
                    int i2 = i;
                    int unused = MaterialSpinner.this.selectedIndex = i2;
                    boolean unused2 = MaterialSpinner.this.nothingSelected = false;
                    Object obj = MaterialSpinner.this.adapter.get(i2);
                    MaterialSpinner.this.adapter.notifyItemSelected(i2);
                    MaterialSpinner materialSpinner = MaterialSpinner.this;
                    materialSpinner.setTextColor(materialSpinner.textColor);
                    MaterialSpinner.this.setText(obj.toString());
                    MaterialSpinner.this.collapse();
                    if (MaterialSpinner.this.onItemSelectedListener != null) {
                        MaterialSpinner.this.onItemSelectedListener.onItemSelected(MaterialSpinner.this, i2, j, obj);
                    }
                }
            });
            this.popupWindow = new PopupWindow(context);
            this.popupWindow.setContentView(this.listView);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setFocusable(true);
            if (Build.VERSION.SDK_INT >= 21) {
                this.popupWindow.setElevation(16.0f);
                this.popupWindow.setBackgroundDrawable(Utils.getDrawable(context, C2739R.C2740drawable.ms__drawable));
            } else {
                this.popupWindow.setBackgroundDrawable(Utils.getDrawable(context, C2739R.C2740drawable.ms__drop_down_shadow));
            }
            int i3 = this.backgroundColor;
            if (i3 != -1) {
                setBackgroundColor(i3);
            } else {
                int i4 = this.backgroundSelector;
                if (i4 != 0) {
                    setBackgroundResource(i4);
                }
            }
            int i5 = this.textColor;
            if (i5 != defaultColor) {
                setTextColor(i5);
            }
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                public void onDismiss() {
                    if (MaterialSpinner.this.nothingSelected && MaterialSpinner.this.onNothingSelectedListener != null) {
                        MaterialSpinner.this.onNothingSelectedListener.onNothingSelected(MaterialSpinner.this);
                    }
                    if (!MaterialSpinner.this.hideArrow) {
                        MaterialSpinner.this.animateArrow(false);
                    }
                }
            });
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.popupWindow.setWidth(View.MeasureSpec.getSize(i));
        this.popupWindow.setHeight(calculatePopupWindowHeight());
        if (this.adapter != null) {
            CharSequence text = getText();
            String charSequence = text.toString();
            for (int i3 = 0; i3 < this.adapter.getCount(); i3++) {
                String itemText = this.adapter.getItemText(i3);
                if (itemText.length() > charSequence.length()) {
                    charSequence = itemText;
                }
            }
            setText(charSequence);
            super.onMeasure(i, i2);
            setText(text);
            return;
        }
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (!this.popupWindow.isShowing()) {
                expand();
            } else {
                collapse();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            Class<StateListDrawable> cls = StateListDrawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("getStateDrawable", new Class[]{Integer.TYPE});
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {Utils.darker(i, 0.85f), i};
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    ((ColorDrawable) declaredMethod.invoke(background, new Object[]{Integer.valueOf(i2)})).setColor(iArr[i2]);
                }
            } catch (Exception e) {
                Log.e("MaterialSpinner", "Error setting background color", e);
            }
        } else if (background != null) {
            background.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        this.popupWindow.getBackground().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setTextColor(int i) {
        this.textColor = i;
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.adapter;
        if (materialSpinnerBaseAdapter != null) {
            materialSpinnerBaseAdapter.setTextColor(this.textColor);
            this.adapter.notifyDataSetChanged();
        }
        super.setTextColor(i);
    }

    public void setHintColor(int i) {
        this.hintColor = i;
        super.setTextColor(i);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.selectedIndex);
        bundle.putBoolean("nothing_selected", this.nothingSelected);
        PopupWindow popupWindow2 = this.popupWindow;
        if (popupWindow2 != null) {
            bundle.putBoolean("is_popup_showing", popupWindow2.isShowing());
            collapse();
        } else {
            bundle.putBoolean("is_popup_showing", false);
        }
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.selectedIndex = bundle.getInt("selected_index");
            this.nothingSelected = bundle.getBoolean("nothing_selected");
            if (this.adapter != null) {
                if (!this.nothingSelected || TextUtils.isEmpty(this.hintText)) {
                    setTextColor(this.textColor);
                    setText(this.adapter.get(this.selectedIndex).toString());
                } else {
                    setHintColor(this.hintColor);
                    setText(this.hintText);
                }
                this.adapter.notifyItemSelected(this.selectedIndex);
            }
            if (bundle.getBoolean("is_popup_showing") && this.popupWindow != null) {
                post(new Runnable() {
                    public void run() {
                        MaterialSpinner.this.expand();
                    }
                });
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Drawable drawable = this.arrowDrawable;
        if (drawable != null) {
            drawable.setColorFilter(z ? this.arrowColor : this.arrowColorDisabled, PorterDuff.Mode.SRC_IN);
        }
    }

    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    public void setSelectedIndex(int i) {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.adapter;
        if (materialSpinnerBaseAdapter == null) {
            return;
        }
        if (i < 0 || i > materialSpinnerBaseAdapter.getCount()) {
            throw new IllegalArgumentException("Position must be lower than adapter count!");
        }
        this.adapter.notifyItemSelected(i);
        this.selectedIndex = i;
        setText(this.adapter.get(i).toString());
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener2) {
        this.onItemSelectedListener = onItemSelectedListener2;
    }

    public void setOnNothingSelectedListener(OnNothingSelectedListener onNothingSelectedListener2) {
        this.onNothingSelectedListener = onNothingSelectedListener2;
    }

    public <T> void setItems(T... tArr) {
        setItems(Arrays.asList(tArr));
    }

    public <T> void setItems(List<T> list) {
        this.adapter = new MaterialSpinnerAdapter(getContext(), list).setPopupPadding(this.popupPaddingLeft, this.popupPaddingTop, this.popupPaddingRight, this.popupPaddingBottom).setBackgroundSelector(this.backgroundSelector).setTextColor(this.textColor);
        setAdapterInternal(this.adapter);
    }

    public void setAdapter(ListAdapter listAdapter) {
        this.adapter = new MaterialSpinnerAdapterWrapper(getContext(), listAdapter).setPopupPadding(this.popupPaddingLeft, this.popupPaddingTop, this.popupPaddingRight, this.popupPaddingBottom).setBackgroundSelector(this.backgroundSelector).setTextColor(this.textColor);
        setAdapterInternal(this.adapter);
    }

    public <T> void setAdapter(MaterialSpinnerAdapter<T> materialSpinnerAdapter) {
        this.adapter = materialSpinnerAdapter;
        this.adapter.setTextColor(this.textColor);
        this.adapter.setBackgroundSelector(this.backgroundSelector);
        this.adapter.setPopupPadding(this.popupPaddingLeft, this.popupPaddingTop, this.popupPaddingRight, this.popupPaddingBottom);
        setAdapterInternal(materialSpinnerAdapter);
    }

    private void setAdapterInternal(MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter) {
        boolean z = this.listView.getAdapter() != null;
        materialSpinnerBaseAdapter.setHintEnabled(true ^ TextUtils.isEmpty(this.hintText));
        this.listView.setAdapter(materialSpinnerBaseAdapter);
        if (this.selectedIndex >= materialSpinnerBaseAdapter.getCount()) {
            this.selectedIndex = 0;
        }
        if (materialSpinnerBaseAdapter.getItems().size() <= 0) {
            setText("");
        } else if (!this.nothingSelected || TextUtils.isEmpty(this.hintText)) {
            setTextColor(this.textColor);
            setText(materialSpinnerBaseAdapter.get(this.selectedIndex).toString());
        } else {
            setText(this.hintText);
            setHintColor(this.hintColor);
        }
        if (z) {
            this.popupWindow.setHeight(calculatePopupWindowHeight());
        }
    }

    public <T> List<T> getItems() {
        MaterialSpinnerBaseAdapter materialSpinnerBaseAdapter = this.adapter;
        if (materialSpinnerBaseAdapter == null) {
            return null;
        }
        return materialSpinnerBaseAdapter.getItems();
    }

    public void expand() {
        if (canShowPopup()) {
            if (!this.hideArrow) {
                animateArrow(true);
            }
            this.nothingSelected = true;
            this.popupWindow.showAsDropDown(this);
        }
    }

    public void collapse() {
        if (!this.hideArrow) {
            animateArrow(false);
        }
        this.popupWindow.dismiss();
    }

    public void setArrowColor(int i) {
        this.arrowColor = i;
        this.arrowColorDisabled = Utils.lighter(this.arrowColor, 0.8f);
        Drawable drawable = this.arrowDrawable;
        if (drawable != null) {
            drawable.setColorFilter(this.arrowColor, PorterDuff.Mode.SRC_IN);
        }
    }

    private boolean canShowPopup() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return isLaidOut();
        }
        return getWidth() > 0 && getHeight() > 0;
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void animateArrow(boolean z) {
        int i = 10000;
        int i2 = z ? 0 : 10000;
        if (!z) {
            i = 0;
        }
        ObjectAnimator.ofInt(this.arrowDrawable, FirebaseAnalytics.Param.LEVEL, new int[]{i2, i}).start();
    }

    public void setDropdownMaxHeight(int i) {
        this.popupWindowMaxHeight = i;
        this.popupWindow.setHeight(calculatePopupWindowHeight());
    }

    public void setDropdownHeight(int i) {
        this.popupWindowHeight = i;
        this.popupWindow.setHeight(calculatePopupWindowHeight());
    }

    private int calculatePopupWindowHeight() {
        if (this.adapter == null) {
            return -2;
        }
        float dimension = getResources().getDimension(C2739R.dimen.ms__item_height);
        float count = ((float) this.adapter.getCount()) * dimension;
        int i = this.popupWindowMaxHeight;
        if (i > 0 && count > ((float) i)) {
            return i;
        }
        int i2 = this.popupWindowHeight;
        if (i2 != -1 && i2 != -2 && ((float) i2) <= count) {
            return i2;
        }
        if (count == 0.0f && this.adapter.getItems().size() == 1) {
            return (int) dimension;
        }
        return -2;
    }

    public PopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    public ListView getListView() {
        return this.listView;
    }
}
