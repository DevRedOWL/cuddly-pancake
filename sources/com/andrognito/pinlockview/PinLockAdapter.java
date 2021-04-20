package com.andrognito.pinlockview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

public class PinLockAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int VIEW_TYPE_DELETE = 1;
    private static final int VIEW_TYPE_NUMBER = 0;
    private Context mContext;
    /* access modifiers changed from: private */
    public CustomizationOptionsBundle mCustomizationOptionsBundle;
    private int[] mKeyValues = getAdjustKeyValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
    /* access modifiers changed from: private */
    public OnDeleteClickListener mOnDeleteClickListener;
    /* access modifiers changed from: private */
    public OnNumberClickListener mOnNumberClickListener;
    /* access modifiers changed from: private */
    public int mPinLength;

    public interface OnDeleteClickListener {
        void onDeleteClicked();

        void onDeleteLongClicked();
    }

    public interface OnNumberClickListener {
        void onNumberClicked(int i);
    }

    public int getItemCount() {
        return 12;
    }

    public PinLockAdapter(Context context) {
        this.mContext = context;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new NumberViewHolder(from.inflate(C1071R.layout.layout_number_item, viewGroup, false));
        }
        return new DeleteViewHolder(from.inflate(C1071R.layout.layout_delete_item, viewGroup, false));
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == 0) {
            configureNumberButtonHolder((NumberViewHolder) viewHolder, i);
        } else if (viewHolder.getItemViewType() == 1) {
            configureDeleteButtonHolder((DeleteViewHolder) viewHolder);
        }
    }

    private void configureNumberButtonHolder(NumberViewHolder numberViewHolder, int i) {
        if (numberViewHolder != null) {
            if (i == 9) {
                numberViewHolder.mNumberButton.setVisibility(8);
            } else {
                numberViewHolder.mNumberButton.setText(String.valueOf(this.mKeyValues[i]));
                numberViewHolder.mNumberButton.setVisibility(0);
                numberViewHolder.mNumberButton.setTag(Integer.valueOf(this.mKeyValues[i]));
            }
            if (this.mCustomizationOptionsBundle != null) {
                numberViewHolder.mNumberButton.setTextColor(this.mCustomizationOptionsBundle.getTextColor());
                if (this.mCustomizationOptionsBundle.getButtonBackgroundDrawable() != null) {
                    if (Build.VERSION.SDK_INT < 16) {
                        numberViewHolder.mNumberButton.setBackgroundDrawable(this.mCustomizationOptionsBundle.getButtonBackgroundDrawable());
                    } else {
                        numberViewHolder.mNumberButton.setBackground(this.mCustomizationOptionsBundle.getButtonBackgroundDrawable());
                    }
                }
                numberViewHolder.mNumberButton.setTextSize(0, (float) this.mCustomizationOptionsBundle.getTextSize());
                numberViewHolder.mNumberButton.setLayoutParams(new LinearLayout.LayoutParams(this.mCustomizationOptionsBundle.getButtonSize(), this.mCustomizationOptionsBundle.getButtonSize()));
            }
        }
    }

    private void configureDeleteButtonHolder(DeleteViewHolder deleteViewHolder) {
        if (deleteViewHolder == null) {
            return;
        }
        if (!this.mCustomizationOptionsBundle.isShowDeleteButton() || this.mPinLength <= 0) {
            deleteViewHolder.mButtonImage.setVisibility(8);
            return;
        }
        deleteViewHolder.mButtonImage.setVisibility(0);
        if (this.mCustomizationOptionsBundle.getDeleteButtonDrawable() != null) {
            deleteViewHolder.mButtonImage.setImageDrawable(this.mCustomizationOptionsBundle.getDeleteButtonDrawable());
        }
        deleteViewHolder.mButtonImage.setColorFilter(this.mCustomizationOptionsBundle.getTextColor(), PorterDuff.Mode.SRC_ATOP);
        deleteViewHolder.mButtonImage.setLayoutParams(new LinearLayout.LayoutParams(this.mCustomizationOptionsBundle.getDeleteButtonSize(), this.mCustomizationOptionsBundle.getDeleteButtonSize()));
    }

    public int getItemViewType(int i) {
        return i == getItemCount() - 1 ? 1 : 0;
    }

    public int getPinLength() {
        return this.mPinLength;
    }

    public void setPinLength(int i) {
        this.mPinLength = i;
    }

    public int[] getKeyValues() {
        return this.mKeyValues;
    }

    public void setKeyValues(int[] iArr) {
        this.mKeyValues = getAdjustKeyValues(iArr);
        notifyDataSetChanged();
    }

    private int[] getAdjustKeyValues(int[] iArr) {
        int[] iArr2 = new int[(iArr.length + 1)];
        for (int i = 0; i < iArr.length; i++) {
            if (i < 9) {
                iArr2[i] = iArr[i];
            } else {
                iArr2[i] = -1;
                iArr2[i + 1] = iArr[i];
            }
        }
        return iArr2;
    }

    public OnNumberClickListener getOnItemClickListener() {
        return this.mOnNumberClickListener;
    }

    public void setOnItemClickListener(OnNumberClickListener onNumberClickListener) {
        this.mOnNumberClickListener = onNumberClickListener;
    }

    public OnDeleteClickListener getOnDeleteClickListener() {
        return this.mOnDeleteClickListener;
    }

    public void setOnDeleteClickListener(OnDeleteClickListener onDeleteClickListener) {
        this.mOnDeleteClickListener = onDeleteClickListener;
    }

    public CustomizationOptionsBundle getCustomizationOptions() {
        return this.mCustomizationOptionsBundle;
    }

    public void setCustomizationOptions(CustomizationOptionsBundle customizationOptionsBundle) {
        this.mCustomizationOptionsBundle = customizationOptionsBundle;
    }

    public class NumberViewHolder extends RecyclerView.ViewHolder {
        Button mNumberButton;

        public NumberViewHolder(View view) {
            super(view);
            this.mNumberButton = (Button) view.findViewById(C1071R.C1074id.button);
            this.mNumberButton.setOnClickListener(new View.OnClickListener(PinLockAdapter.this) {
                public void onClick(View view) {
                    if (PinLockAdapter.this.mOnNumberClickListener != null) {
                        PinLockAdapter.this.mOnNumberClickListener.onNumberClicked(((Integer) view.getTag()).intValue());
                    }
                }
            });
        }
    }

    public class DeleteViewHolder extends RecyclerView.ViewHolder {
        ImageView mButtonImage;
        LinearLayout mDeleteButton;

        public DeleteViewHolder(View view) {
            super(view);
            this.mDeleteButton = (LinearLayout) view.findViewById(C1071R.C1074id.button);
            this.mButtonImage = (ImageView) view.findViewById(C1071R.C1074id.buttonImage);
            if (PinLockAdapter.this.mCustomizationOptionsBundle.isShowDeleteButton() && PinLockAdapter.this.mPinLength > 0) {
                this.mDeleteButton.setOnClickListener(new View.OnClickListener(PinLockAdapter.this) {
                    public void onClick(View view) {
                        if (PinLockAdapter.this.mOnDeleteClickListener != null) {
                            PinLockAdapter.this.mOnDeleteClickListener.onDeleteClicked();
                        }
                    }
                });
                this.mDeleteButton.setOnLongClickListener(new View.OnLongClickListener(PinLockAdapter.this) {
                    public boolean onLongClick(View view) {
                        if (PinLockAdapter.this.mOnDeleteClickListener == null) {
                            return true;
                        }
                        PinLockAdapter.this.mOnDeleteClickListener.onDeleteLongClicked();
                        return true;
                    }
                });
                this.mDeleteButton.setOnTouchListener(new View.OnTouchListener(PinLockAdapter.this) {
                    private Rect rect;

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            DeleteViewHolder.this.mButtonImage.setColorFilter(PinLockAdapter.this.mCustomizationOptionsBundle.getDeleteButtonPressesColor());
                            this.rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        }
                        if (motionEvent.getAction() == 1) {
                            DeleteViewHolder.this.mButtonImage.clearColorFilter();
                        }
                        if (motionEvent.getAction() != 2 || this.rect.contains(view.getLeft() + ((int) motionEvent.getX()), view.getTop() + ((int) motionEvent.getY()))) {
                            return false;
                        }
                        DeleteViewHolder.this.mButtonImage.clearColorFilter();
                        return false;
                    }
                });
            }
        }
    }
}
