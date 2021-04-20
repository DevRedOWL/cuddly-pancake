package com.beefe.picker.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.beefe.picker.C1081R;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.Arrays;

public class PickerViewAlone extends LinearLayout {
    /* access modifiers changed from: private */
    public ArrayList<ReturnData> curSelectedList;
    /* access modifiers changed from: private */
    public OnSelectedListener onSelectedListener;
    /* access modifiers changed from: private */
    public LinearLayout pickerViewAloneLayout;

    public PickerViewAlone(Context context) {
        super(context);
        init(context);
    }

    public PickerViewAlone(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        this.pickerViewAloneLayout = (LinearLayout) LayoutInflater.from(context).inflate(C1081R.layout.picker_view_alone, this).findViewById(C1081R.C1084id.pickerViewAloneLayout);
    }

    public void setOnSelectedListener(OnSelectedListener onSelectedListener2) {
        this.onSelectedListener = onSelectedListener2;
    }

    public void setPickerData(ReadableArray readableArray, double[] dArr) {
        this.curSelectedList = new ArrayList<>();
        char c = 0;
        String name = readableArray.getType(0).name();
        if (name.hashCode() != 63537721 || !name.equals("Array")) {
            c = 65535;
        }
        if (c != 0) {
            setAloneData(readableArray);
        } else {
            setMultipleData(readableArray, dArr);
        }
    }

    public ArrayList<ReturnData> getSelectedData() {
        return this.curSelectedList;
    }

    private void setAloneData(ReadableArray readableArray) {
        ArrayList<String> arrayToList = arrayToList(readableArray);
        LoopView loopView = new LoopView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        loopView.setLayoutParams(layoutParams);
        loopView.setItems(arrayToList);
        loopView.setSelectedPosition(0);
        ReturnData returnData = new ReturnData();
        returnData.setItem(arrayToList.get(0));
        returnData.setIndex(loopView.getSelectedIndex());
        if (this.curSelectedList.size() > 0) {
            this.curSelectedList.set(0, returnData);
        } else {
            this.curSelectedList.add(0, returnData);
        }
        loopView.setListener(new OnItemSelectedListener() {
            public void onItemSelected(String str, int i) {
                if (PickerViewAlone.this.onSelectedListener != null) {
                    ReturnData returnData = new ReturnData();
                    returnData.setItem(str);
                    returnData.setIndex(i);
                    PickerViewAlone.this.curSelectedList.set(0, returnData);
                    PickerViewAlone.this.onSelectedListener.onSelected(PickerViewAlone.this.curSelectedList);
                }
            }
        });
        this.pickerViewAloneLayout.addView(loopView);
    }

    private void setMultipleData(ReadableArray readableArray, double[] dArr) {
        final String[] strArr = new String[readableArray.size()];
        final int[] iArr = new int[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            String name = readableArray.getType(i).name();
            if (((name.hashCode() == 63537721 && name.equals("Array")) ? (char) 0 : 65535) == 0) {
                ArrayList<String> arrayToList = arrayToList(readableArray.getArray(i));
                LoopView loopView = new LoopView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                if (dArr == null) {
                    layoutParams.weight = 1.0f;
                } else if (i < dArr.length) {
                    layoutParams.weight = (float) dArr[i];
                } else {
                    layoutParams.weight = 1.0f;
                }
                loopView.setLayoutParams(layoutParams);
                loopView.setItems(arrayToList);
                loopView.setTag(Integer.valueOf(i));
                loopView.setSelectedPosition(0);
                ReturnData returnData = new ReturnData();
                returnData.setItem(arrayToList.get(0));
                returnData.setIndex(loopView.getSelectedIndex());
                if (this.curSelectedList.size() > i) {
                    this.curSelectedList.set(i, returnData);
                } else {
                    this.curSelectedList.add(i, returnData);
                }
                strArr[i] = arrayToList.get(0);
                loopView.setListener(new OnItemSelectedListener() {
                    public void onItemSelected(String str, int i) {
                        int childCount = PickerViewAlone.this.pickerViewAloneLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = PickerViewAlone.this.pickerViewAloneLayout.getChildAt(i2);
                            if (childAt instanceof LoopView) {
                                LoopView loopView = (LoopView) childAt;
                                strArr[i2] = loopView.getSelectedItem();
                                iArr[i2] = loopView.getSelectedIndex();
                            }
                        }
                        if (PickerViewAlone.this.onSelectedListener != null) {
                            for (int i3 = 0; i3 < strArr.length; i3++) {
                                ReturnData returnData = new ReturnData();
                                returnData.setItem(strArr[i3]);
                                returnData.setIndex(iArr[i3]);
                                PickerViewAlone.this.curSelectedList.set(i3, returnData);
                            }
                            PickerViewAlone.this.onSelectedListener.onSelected(PickerViewAlone.this.curSelectedList);
                        }
                    }
                });
                this.pickerViewAloneLayout.addView(loopView);
            }
        }
    }

    public void setSelectValue(String[] strArr) {
        int childCount = this.pickerViewAloneLayout.getChildCount();
        int length = strArr.length;
        if (length <= childCount) {
            setSelect(length, strArr, this.curSelectedList);
        } else {
            setSelect(childCount, (String[]) Arrays.copyOf(strArr, childCount), this.curSelectedList);
        }
    }

    private void setSelect(int i, String[] strArr, ArrayList<ReturnData> arrayList) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.pickerViewAloneLayout.getChildAt(i2);
            if (childAt instanceof LoopView) {
                LoopView loopView = (LoopView) childAt;
                if (loopView.hasItem(strArr[i2])) {
                    loopView.setSelectedItem(strArr[i2]);
                    ReturnData returnData = new ReturnData();
                    returnData.setItem(strArr[i2]);
                    returnData.setIndex(loopView.getSelectedIndex());
                    arrayList.set(i2, returnData);
                }
            }
        }
    }

    public void setTextColor(int i) {
        int childCount = this.pickerViewAloneLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.pickerViewAloneLayout.getChildAt(i2);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTextColor(i);
            }
        }
    }

    public void setTextSize(float f) {
        int childCount = this.pickerViewAloneLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.pickerViewAloneLayout.getChildAt(i);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTextSize(f);
            }
        }
    }

    public void setTypeface(Typeface typeface) {
        int childCount = this.pickerViewAloneLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.pickerViewAloneLayout.getChildAt(i);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTypeface(typeface);
            }
        }
    }

    public void setTextEllipsisLen(int i) {
        int childCount = this.pickerViewAloneLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.pickerViewAloneLayout.getChildAt(i2);
            if (childAt instanceof LoopView) {
                ((LoopView) childAt).setTextEllipsisLen(i);
            }
        }
    }

    public void setIsLoop(boolean z) {
        if (!z) {
            int childCount = this.pickerViewAloneLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.pickerViewAloneLayout.getChildAt(i);
                if (childAt instanceof LoopView) {
                    ((LoopView) childAt).setNotLoop();
                }
            }
        }
    }

    public int getViewHeight() {
        View childAt = this.pickerViewAloneLayout.getChildAt(0);
        if (childAt instanceof LoopView) {
            return ((LoopView) childAt).getViewHeight();
        }
        return 0;
    }

    private ArrayList<String> arrayToList(ReadableArray readableArray) {
        String str;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < readableArray.size(); i++) {
            String name = readableArray.getType(i).name();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != -1950496919) {
                if (hashCode != -1808118735) {
                    if (hashCode == 1729365000 && name.equals("Boolean")) {
                        c = 0;
                    }
                } else if (name.equals("String")) {
                    c = 2;
                }
            } else if (name.equals("Number")) {
                c = 1;
            }
            if (c == 0) {
                str = String.valueOf(readableArray.getBoolean(i));
            } else if (c != 1) {
                str = c != 2 ? "" : readableArray.getString(i);
            } else {
                try {
                    str = String.valueOf(readableArray.getInt(i));
                } catch (Exception unused) {
                    str = String.valueOf(readableArray.getDouble(i));
                }
            }
            arrayList.add(str);
        }
        return arrayList;
    }
}
