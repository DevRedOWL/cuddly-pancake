package com.andrognito.pinlockview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.andrognito.pinlockview.PinLockAdapter;

public class PinLockView extends RecyclerView {
    private static final int[] DEFAULT_KEY_SET = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    private static final int DEFAULT_PIN_LENGTH = 4;
    /* access modifiers changed from: private */
    public PinLockAdapter mAdapter;
    private Drawable mButtonBackgroundDrawable;
    private int mButtonSize;
    private int[] mCustomKeySet;
    private CustomizationOptionsBundle mCustomizationOptionsBundle;
    private Drawable mDeleteButtonDrawable;
    private int mDeleteButtonPressedColor;
    private int mDeleteButtonSize;
    private int mHorizontalSpacing;
    /* access modifiers changed from: private */
    public IndicatorDots mIndicatorDots;
    private PinLockAdapter.OnDeleteClickListener mOnDeleteClickListener = new PinLockAdapter.OnDeleteClickListener() {
        public void onDeleteClicked() {
            if (PinLockView.this.mPin.length() > 0) {
                PinLockView pinLockView = PinLockView.this;
                String unused = pinLockView.mPin = pinLockView.mPin.substring(0, PinLockView.this.mPin.length() - 1);
                if (PinLockView.this.isIndicatorDotsAttached()) {
                    PinLockView.this.mIndicatorDots.updateDot(PinLockView.this.mPin.length());
                }
                if (PinLockView.this.mPin.length() == 0) {
                    PinLockView.this.mAdapter.setPinLength(PinLockView.this.mPin.length());
                    PinLockView.this.mAdapter.notifyItemChanged(PinLockView.this.mAdapter.getItemCount() - 1);
                }
                if (PinLockView.this.mPinLockListener == null) {
                    return;
                }
                if (PinLockView.this.mPin.length() == 0) {
                    PinLockView.this.mPinLockListener.onEmpty();
                    PinLockView.this.clearInternalPin();
                    return;
                }
                PinLockView.this.mPinLockListener.onPinChange(PinLockView.this.mPin.length(), PinLockView.this.mPin);
            } else if (PinLockView.this.mPinLockListener != null) {
                PinLockView.this.mPinLockListener.onEmpty();
            }
        }

        public void onDeleteLongClicked() {
            PinLockView.this.resetPinLockView();
            if (PinLockView.this.mPinLockListener != null) {
                PinLockView.this.mPinLockListener.onEmpty();
            }
        }
    };
    private PinLockAdapter.OnNumberClickListener mOnNumberClickListener = new PinLockAdapter.OnNumberClickListener() {
        public void onNumberClicked(int i) {
            if (PinLockView.this.mPin.length() < PinLockView.this.getPinLength()) {
                PinLockView pinLockView = PinLockView.this;
                String unused = pinLockView.mPin = pinLockView.mPin.concat(String.valueOf(i));
                if (PinLockView.this.isIndicatorDotsAttached()) {
                    PinLockView.this.mIndicatorDots.updateDot(PinLockView.this.mPin.length());
                }
                if (PinLockView.this.mPin.length() == 1) {
                    PinLockView.this.mAdapter.setPinLength(PinLockView.this.mPin.length());
                    PinLockView.this.mAdapter.notifyItemChanged(PinLockView.this.mAdapter.getItemCount() - 1);
                }
                if (PinLockView.this.mPinLockListener == null) {
                    return;
                }
                if (PinLockView.this.mPin.length() == PinLockView.this.mPinLength) {
                    PinLockView.this.mPinLockListener.onComplete(PinLockView.this.mPin);
                } else {
                    PinLockView.this.mPinLockListener.onPinChange(PinLockView.this.mPin.length(), PinLockView.this.mPin);
                }
            } else if (!PinLockView.this.isShowDeleteButton()) {
                PinLockView.this.resetPinLockView();
                PinLockView pinLockView2 = PinLockView.this;
                String unused2 = pinLockView2.mPin = pinLockView2.mPin.concat(String.valueOf(i));
                if (PinLockView.this.isIndicatorDotsAttached()) {
                    PinLockView.this.mIndicatorDots.updateDot(PinLockView.this.mPin.length());
                }
                if (PinLockView.this.mPinLockListener != null) {
                    PinLockView.this.mPinLockListener.onPinChange(PinLockView.this.mPin.length(), PinLockView.this.mPin);
                }
            } else if (PinLockView.this.mPinLockListener != null) {
                PinLockView.this.mPinLockListener.onComplete(PinLockView.this.mPin);
            }
        }
    };
    /* access modifiers changed from: private */
    public String mPin = "";
    /* access modifiers changed from: private */
    public int mPinLength;
    /* access modifiers changed from: private */
    public PinLockListener mPinLockListener;
    private boolean mShowDeleteButton;
    private int mTextColor;
    private int mTextSize;
    private int mVerticalSpacing;

    public PinLockView(Context context) {
        super(context);
        init((AttributeSet) null, 0);
    }

    public PinLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0);
    }

    public PinLockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }

    /* JADX INFO: finally extract failed */
    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1071R.styleable.PinLockView);
        try {
            this.mPinLength = obtainStyledAttributes.getInt(C1071R.styleable.PinLockView_pinLength, 4);
            this.mHorizontalSpacing = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_keypadHorizontalSpacing, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_horizontal_spacing));
            this.mVerticalSpacing = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_keypadVerticalSpacing, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_vertical_spacing));
            this.mTextColor = obtainStyledAttributes.getColor(C1071R.styleable.PinLockView_keypadTextColor, ResourceUtils.getColor(getContext(), C1071R.C1072color.white));
            this.mTextSize = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_keypadTextSize, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_text_size));
            this.mButtonSize = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_keypadButtonSize, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_button_size));
            this.mDeleteButtonSize = (int) obtainStyledAttributes.getDimension(C1071R.styleable.PinLockView_keypadDeleteButtonSize, ResourceUtils.getDimensionInPx(getContext(), C1071R.dimen.default_delete_button_size));
            this.mButtonBackgroundDrawable = obtainStyledAttributes.getDrawable(C1071R.styleable.PinLockView_keypadButtonBackgroundDrawable);
            this.mDeleteButtonDrawable = obtainStyledAttributes.getDrawable(C1071R.styleable.PinLockView_keypadDeleteButtonDrawable);
            this.mShowDeleteButton = obtainStyledAttributes.getBoolean(C1071R.styleable.PinLockView_keypadShowDeleteButton, true);
            this.mDeleteButtonPressedColor = obtainStyledAttributes.getColor(C1071R.styleable.PinLockView_keypadDeleteButtonPressedColor, ResourceUtils.getColor(getContext(), C1071R.C1072color.greyish));
            obtainStyledAttributes.recycle();
            this.mCustomizationOptionsBundle = new CustomizationOptionsBundle();
            this.mCustomizationOptionsBundle.setTextColor(this.mTextColor);
            this.mCustomizationOptionsBundle.setTextSize(this.mTextSize);
            this.mCustomizationOptionsBundle.setButtonSize(this.mButtonSize);
            this.mCustomizationOptionsBundle.setButtonBackgroundDrawable(this.mButtonBackgroundDrawable);
            this.mCustomizationOptionsBundle.setDeleteButtonDrawable(this.mDeleteButtonDrawable);
            this.mCustomizationOptionsBundle.setDeleteButtonSize(this.mDeleteButtonSize);
            this.mCustomizationOptionsBundle.setShowDeleteButton(this.mShowDeleteButton);
            this.mCustomizationOptionsBundle.setDeleteButtonPressesColor(this.mDeleteButtonPressedColor);
            initView();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void initView() {
        setLayoutManager(new LTRGridLayoutManager(getContext(), 3));
        this.mAdapter = new PinLockAdapter(getContext());
        this.mAdapter.setOnItemClickListener(this.mOnNumberClickListener);
        this.mAdapter.setOnDeleteClickListener(this.mOnDeleteClickListener);
        this.mAdapter.setCustomizationOptions(this.mCustomizationOptionsBundle);
        setAdapter(this.mAdapter);
        addItemDecoration(new ItemSpaceDecoration(this.mHorizontalSpacing, this.mVerticalSpacing, 3, false));
        setOverScrollMode(2);
    }

    public void setPinLockListener(PinLockListener pinLockListener) {
        this.mPinLockListener = pinLockListener;
    }

    public int getPinLength() {
        return this.mPinLength;
    }

    public void setPinLength(int i) {
        this.mPinLength = i;
        if (isIndicatorDotsAttached()) {
            this.mIndicatorDots.setPinLength(i);
        }
    }

    public int getTextColor() {
        return this.mTextColor;
    }

    public void setTextColor(int i) {
        this.mTextColor = i;
        this.mCustomizationOptionsBundle.setTextColor(i);
        this.mAdapter.notifyDataSetChanged();
    }

    public int getTextSize() {
        return this.mTextSize;
    }

    public void setTextSize(int i) {
        this.mTextSize = i;
        this.mCustomizationOptionsBundle.setTextSize(i);
        this.mAdapter.notifyDataSetChanged();
    }

    public int getButtonSize() {
        return this.mButtonSize;
    }

    public void setButtonSize(int i) {
        this.mButtonSize = i;
        this.mCustomizationOptionsBundle.setButtonSize(i);
        this.mAdapter.notifyDataSetChanged();
    }

    public Drawable getButtonBackgroundDrawable() {
        return this.mButtonBackgroundDrawable;
    }

    public void setButtonBackgroundDrawable(Drawable drawable) {
        this.mButtonBackgroundDrawable = drawable;
        this.mCustomizationOptionsBundle.setButtonBackgroundDrawable(drawable);
        this.mAdapter.notifyDataSetChanged();
    }

    public Drawable getDeleteButtonDrawable() {
        return this.mDeleteButtonDrawable;
    }

    public void setDeleteButtonDrawable(Drawable drawable) {
        this.mDeleteButtonDrawable = drawable;
        this.mCustomizationOptionsBundle.setDeleteButtonDrawable(drawable);
        this.mAdapter.notifyDataSetChanged();
    }

    public int getDeleteButtonSize() {
        return this.mDeleteButtonSize;
    }

    public void setDeleteButtonSize(int i) {
        this.mDeleteButtonSize = i;
        this.mCustomizationOptionsBundle.setDeleteButtonSize(i);
        this.mAdapter.notifyDataSetChanged();
    }

    public boolean isShowDeleteButton() {
        return this.mShowDeleteButton;
    }

    public void setShowDeleteButton(boolean z) {
        this.mShowDeleteButton = z;
        this.mCustomizationOptionsBundle.setShowDeleteButton(z);
        this.mAdapter.notifyDataSetChanged();
    }

    public int getDeleteButtonPressedColor() {
        return this.mDeleteButtonPressedColor;
    }

    public void setDeleteButtonPressedColor(int i) {
        this.mDeleteButtonPressedColor = i;
        this.mCustomizationOptionsBundle.setDeleteButtonPressesColor(i);
        this.mAdapter.notifyDataSetChanged();
    }

    public int[] getCustomKeySet() {
        return this.mCustomKeySet;
    }

    public void setCustomKeySet(int[] iArr) {
        this.mCustomKeySet = iArr;
        PinLockAdapter pinLockAdapter = this.mAdapter;
        if (pinLockAdapter != null) {
            pinLockAdapter.setKeyValues(iArr);
        }
    }

    public void enableLayoutShuffling() {
        this.mCustomKeySet = ShuffleArrayUtils.shuffle(DEFAULT_KEY_SET);
        PinLockAdapter pinLockAdapter = this.mAdapter;
        if (pinLockAdapter != null) {
            pinLockAdapter.setKeyValues(this.mCustomKeySet);
        }
    }

    /* access modifiers changed from: private */
    public void clearInternalPin() {
        this.mPin = "";
    }

    public void resetPinLockView() {
        clearInternalPin();
        this.mAdapter.setPinLength(this.mPin.length());
        PinLockAdapter pinLockAdapter = this.mAdapter;
        pinLockAdapter.notifyItemChanged(pinLockAdapter.getItemCount() - 1);
        IndicatorDots indicatorDots = this.mIndicatorDots;
        if (indicatorDots != null) {
            indicatorDots.updateDot(this.mPin.length());
        }
    }

    public boolean isIndicatorDotsAttached() {
        return this.mIndicatorDots != null;
    }

    public void attachIndicatorDots(IndicatorDots indicatorDots) {
        this.mIndicatorDots = indicatorDots;
    }
}
