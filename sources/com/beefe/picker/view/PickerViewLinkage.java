package com.beefe.picker.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.beefe.picker.C1081R;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class PickerViewLinkage extends LinearLayout {
    private int curRow;
    /* access modifiers changed from: private */
    public ArrayList<ReturnData> curSelectedList;
    /* access modifiers changed from: private */
    public ArrayList<ReadableMap> data = new ArrayList<>();
    /* access modifiers changed from: private */
    public LoopView loopViewOne;
    /* access modifiers changed from: private */
    public LoopView loopViewThree;
    /* access modifiers changed from: private */
    public LoopView loopViewTwo;
    /* access modifiers changed from: private */
    public OnSelectedListener onSelectedListener;
    /* access modifiers changed from: private */
    public ArrayList<String> oneList = new ArrayList<>();
    /* access modifiers changed from: private */
    public ReturnData returnData;
    /* access modifiers changed from: private */
    public ReturnData returnData1;
    /* access modifiers changed from: private */
    public ReturnData returnData2;
    /* access modifiers changed from: private */
    public int selectOneIndex;
    /* access modifiers changed from: private */
    public int selectTwoIndex;
    /* access modifiers changed from: private */
    public ArrayList<String> threeList = new ArrayList<>();
    /* access modifiers changed from: private */
    public ArrayList<String> twoList = new ArrayList<>();

    public PickerViewLinkage(Context context) {
        super(context);
        init(context);
    }

    public PickerViewLinkage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public PickerViewLinkage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C1081R.layout.picker_view_linkage, this);
        this.loopViewOne = (LoopView) inflate.findViewById(C1081R.C1084id.loopViewOne);
        this.loopViewTwo = (LoopView) inflate.findViewById(C1081R.C1084id.loopViewTwo);
        this.loopViewThree = (LoopView) inflate.findViewById(C1081R.C1084id.loopViewThree);
    }

    private void setRow(int i) {
        if (i == 2) {
            this.curRow = 2;
            this.loopViewTwo.setVisibility(0);
            this.loopViewOne.setVisibility(0);
            this.loopViewThree.setVisibility(8);
        } else if (i == 3) {
            this.curRow = 3;
            this.loopViewOne.setVisibility(0);
            this.loopViewTwo.setVisibility(0);
            this.loopViewThree.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public void checkItems(LoopView loopView, ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            loopView.setItems(arrayList);
            loopView.setSelectedPosition(0);
        }
    }

    private void setWeights(double[] dArr) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1);
        int i = this.curRow;
        if (i == 2) {
            if (dArr.length != 1) {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = (float) dArr[1];
            } else {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = 1.0f;
            }
            this.loopViewOne.setLayoutParams(layoutParams);
            this.loopViewTwo.setLayoutParams(layoutParams2);
        } else if (i == 3) {
            int length = dArr.length;
            if (length == 1) {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = 1.0f;
                layoutParams3.weight = 1.0f;
            } else if (length != 2) {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = (float) dArr[1];
                layoutParams3.weight = (float) dArr[2];
            } else {
                layoutParams.weight = (float) dArr[0];
                layoutParams2.weight = (float) dArr[1];
                layoutParams3.weight = 1.0f;
            }
            this.loopViewOne.setLayoutParams(layoutParams);
            this.loopViewTwo.setLayoutParams(layoutParams2);
            this.loopViewThree.setLayoutParams(layoutParams3);
        }
    }

    public void setPickerData(ReadableArray readableArray, double[] dArr) {
        this.curSelectedList = new ArrayList<>();
        this.returnData = new ReturnData();
        this.returnData1 = new ReturnData();
        this.returnData2 = new ReturnData();
        this.oneList.clear();
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            this.data.add(map);
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            if (keySetIterator.hasNextKey()) {
                this.oneList.add(keySetIterator.nextKey());
            }
        }
        checkItems(this.loopViewOne, this.oneList);
        this.returnData.setItem(this.oneList.get(0));
        this.returnData.setIndex(this.loopViewOne.getSelectedIndex());
        if (this.curSelectedList.size() > 0) {
            this.curSelectedList.set(0, this.returnData);
        } else {
            this.curSelectedList.add(0, this.returnData);
        }
        ReadableArray array = this.data.get(0).getArray(this.oneList.get(0));
        if (array.getType(0).name().equals("Map")) {
            setRow(3);
            this.twoList.clear();
            getTwoListData();
            checkItems(this.loopViewTwo, this.twoList);
            this.returnData1.setItem(this.twoList.get(0));
            this.returnData1.setIndex(this.loopViewTwo.getSelectedIndex());
            if (this.curSelectedList.size() > 1) {
                this.curSelectedList.set(1, this.returnData1);
            } else {
                this.curSelectedList.add(1, this.returnData1);
            }
            ReadableMap map2 = this.data.get(0).getArray(this.oneList.get(0)).getMap(0);
            ReadableArray array2 = map2.getArray(map2.keySetIterator().nextKey());
            this.threeList.clear();
            this.threeList = arrayToList(array2);
            checkItems(this.loopViewThree, this.threeList);
            ArrayList<String> arrayList = this.threeList;
            if (arrayList != null && arrayList.size() > 0) {
                this.returnData2.setItem(this.threeList.get(0));
                this.returnData2.setIndex(this.loopViewThree.getSelectedIndex());
                if (this.curSelectedList.size() > 2) {
                    this.curSelectedList.set(2, this.returnData2);
                } else {
                    this.curSelectedList.add(2, this.returnData2);
                }
            }
            this.loopViewOne.setListener(new OnItemSelectedListener() {
                public void onItemSelected(String str, int i) {
                    int unused = PickerViewLinkage.this.selectOneIndex = i;
                    ReturnData unused2 = PickerViewLinkage.this.returnData = new ReturnData();
                    PickerViewLinkage.this.returnData.setIndex(i);
                    PickerViewLinkage.this.returnData.setItem(str);
                    PickerViewLinkage.this.curSelectedList.set(0, PickerViewLinkage.this.returnData);
                    PickerViewLinkage.this.twoList.clear();
                    ReadableArray array = ((ReadableMap) PickerViewLinkage.this.data.get(i)).getArray(str);
                    for (int i2 = 0; i2 < array.size(); i2++) {
                        ReadableMapKeySetIterator keySetIterator = array.getMap(i2).keySetIterator();
                        if (keySetIterator.hasNextKey()) {
                            PickerViewLinkage.this.twoList.add(keySetIterator.nextKey());
                        }
                    }
                    PickerViewLinkage pickerViewLinkage = PickerViewLinkage.this;
                    pickerViewLinkage.checkItems(pickerViewLinkage.loopViewTwo, PickerViewLinkage.this.twoList);
                    ReturnData unused3 = PickerViewLinkage.this.returnData1 = new ReturnData();
                    PickerViewLinkage.this.returnData1.setItem((String) PickerViewLinkage.this.twoList.get(0));
                    PickerViewLinkage.this.returnData1.setIndex(PickerViewLinkage.this.loopViewTwo.getSelectedIndex());
                    PickerViewLinkage.this.curSelectedList.set(1, PickerViewLinkage.this.returnData1);
                    ReadableMap map = ((ReadableMap) PickerViewLinkage.this.data.get(i)).getArray(str).getMap(0);
                    ReadableArray array2 = map.getArray(map.keySetIterator().nextKey());
                    PickerViewLinkage.this.threeList.clear();
                    PickerViewLinkage pickerViewLinkage2 = PickerViewLinkage.this;
                    ArrayList unused4 = pickerViewLinkage2.threeList = pickerViewLinkage2.arrayToList(array2);
                    PickerViewLinkage pickerViewLinkage3 = PickerViewLinkage.this;
                    pickerViewLinkage3.checkItems(pickerViewLinkage3.loopViewThree, PickerViewLinkage.this.threeList);
                    ReturnData unused5 = PickerViewLinkage.this.returnData2 = new ReturnData();
                    if (PickerViewLinkage.this.threeList != null && PickerViewLinkage.this.threeList.size() > 0) {
                        PickerViewLinkage.this.returnData2.setItem((String) PickerViewLinkage.this.threeList.get(0));
                        PickerViewLinkage.this.returnData2.setIndex(PickerViewLinkage.this.loopViewThree.getSelectedIndex());
                        PickerViewLinkage.this.curSelectedList.set(2, PickerViewLinkage.this.returnData2);
                        if (PickerViewLinkage.this.onSelectedListener != null) {
                            PickerViewLinkage.this.onSelectedListener.onSelected(PickerViewLinkage.this.curSelectedList);
                        }
                    }
                }
            });
            this.loopViewTwo.setListener(new OnItemSelectedListener() {
                public void onItemSelected(String str, int i) {
                    int unused = PickerViewLinkage.this.selectTwoIndex = i;
                    ReadableArray array = ((ReadableMap) PickerViewLinkage.this.data.get(PickerViewLinkage.this.selectOneIndex)).getArray((String) PickerViewLinkage.this.oneList.get(PickerViewLinkage.this.selectOneIndex));
                    int size = array.size();
                    if (i > size) {
                        i = size - 1;
                    }
                    ReadableMap map = array.getMap(i);
                    ReadableArray array2 = map.getArray(map.keySetIterator().nextKey());
                    PickerViewLinkage.this.threeList.clear();
                    PickerViewLinkage pickerViewLinkage = PickerViewLinkage.this;
                    ArrayList unused2 = pickerViewLinkage.threeList = pickerViewLinkage.arrayToList(array2);
                    PickerViewLinkage pickerViewLinkage2 = PickerViewLinkage.this;
                    pickerViewLinkage2.checkItems(pickerViewLinkage2.loopViewThree, PickerViewLinkage.this.threeList);
                    ReturnData unused3 = PickerViewLinkage.this.returnData = new ReturnData();
                    PickerViewLinkage.this.returnData.setItem((String) PickerViewLinkage.this.oneList.get(PickerViewLinkage.this.selectOneIndex));
                    PickerViewLinkage.this.returnData.setIndex(PickerViewLinkage.this.loopViewOne.getSelectedIndex());
                    PickerViewLinkage.this.curSelectedList.set(0, PickerViewLinkage.this.returnData);
                    ReturnData unused4 = PickerViewLinkage.this.returnData1 = new ReturnData();
                    PickerViewLinkage.this.returnData1.setItem(str);
                    PickerViewLinkage.this.returnData1.setIndex(i);
                    PickerViewLinkage.this.curSelectedList.set(1, PickerViewLinkage.this.returnData1);
                    ReturnData unused5 = PickerViewLinkage.this.returnData2 = new ReturnData();
                    if (PickerViewLinkage.this.threeList != null && PickerViewLinkage.this.threeList.size() > 0) {
                        PickerViewLinkage.this.returnData2.setItem((String) PickerViewLinkage.this.threeList.get(0));
                        PickerViewLinkage.this.returnData2.setIndex(PickerViewLinkage.this.loopViewThree.getSelectedIndex());
                        PickerViewLinkage.this.curSelectedList.set(2, PickerViewLinkage.this.returnData2);
                        if (PickerViewLinkage.this.onSelectedListener != null) {
                            PickerViewLinkage.this.onSelectedListener.onSelected(PickerViewLinkage.this.curSelectedList);
                        }
                    }
                }
            });
            this.loopViewThree.setListener(new OnItemSelectedListener() {
                public void onItemSelected(String str, int i) {
                    int size = PickerViewLinkage.this.oneList.size();
                    if (PickerViewLinkage.this.selectOneIndex >= size) {
                        int unused = PickerViewLinkage.this.selectOneIndex = size - 1;
                    }
                    int size2 = PickerViewLinkage.this.twoList.size();
                    if (PickerViewLinkage.this.selectTwoIndex >= size2) {
                        int unused2 = PickerViewLinkage.this.selectTwoIndex = size2 - 1;
                    }
                    ReturnData unused3 = PickerViewLinkage.this.returnData = new ReturnData();
                    PickerViewLinkage.this.returnData.setItem((String) PickerViewLinkage.this.oneList.get(PickerViewLinkage.this.selectOneIndex));
                    PickerViewLinkage.this.returnData.setIndex(PickerViewLinkage.this.loopViewOne.getSelectedIndex());
                    PickerViewLinkage.this.curSelectedList.set(0, PickerViewLinkage.this.returnData);
                    ReturnData unused4 = PickerViewLinkage.this.returnData1 = new ReturnData();
                    PickerViewLinkage.this.returnData1.setItem((String) PickerViewLinkage.this.twoList.get(PickerViewLinkage.this.selectTwoIndex));
                    PickerViewLinkage.this.returnData1.setIndex(PickerViewLinkage.this.loopViewTwo.getSelectedIndex());
                    PickerViewLinkage.this.curSelectedList.set(1, PickerViewLinkage.this.returnData1);
                    ReturnData unused5 = PickerViewLinkage.this.returnData2 = new ReturnData();
                    PickerViewLinkage.this.returnData2.setItem(str);
                    PickerViewLinkage.this.returnData2.setIndex(i);
                    PickerViewLinkage.this.curSelectedList.set(2, PickerViewLinkage.this.returnData2);
                    if (PickerViewLinkage.this.onSelectedListener != null) {
                        PickerViewLinkage.this.onSelectedListener.onSelected(PickerViewLinkage.this.curSelectedList);
                    }
                }
            });
        } else {
            setRow(2);
            this.loopViewOne.setListener(new OnItemSelectedListener() {
                public void onItemSelected(String str, int i) {
                    int unused = PickerViewLinkage.this.selectOneIndex = i;
                    ReadableArray array = ((ReadableMap) PickerViewLinkage.this.data.get(i)).getArray(str);
                    PickerViewLinkage.this.twoList.clear();
                    PickerViewLinkage pickerViewLinkage = PickerViewLinkage.this;
                    ArrayList unused2 = pickerViewLinkage.twoList = pickerViewLinkage.arrayToList(array);
                    PickerViewLinkage pickerViewLinkage2 = PickerViewLinkage.this;
                    pickerViewLinkage2.checkItems(pickerViewLinkage2.loopViewTwo, PickerViewLinkage.this.twoList);
                    ReturnData unused3 = PickerViewLinkage.this.returnData = new ReturnData();
                    PickerViewLinkage.this.returnData.setItem(str);
                    PickerViewLinkage.this.returnData.setIndex(i);
                    PickerViewLinkage.this.curSelectedList.set(0, PickerViewLinkage.this.returnData);
                    ReturnData unused4 = PickerViewLinkage.this.returnData1 = new ReturnData();
                    PickerViewLinkage.this.returnData1.setItem((String) PickerViewLinkage.this.twoList.get(0));
                    PickerViewLinkage.this.returnData1.setIndex(PickerViewLinkage.this.loopViewTwo.getSelectedIndex());
                    PickerViewLinkage.this.curSelectedList.set(1, PickerViewLinkage.this.returnData1);
                    if (PickerViewLinkage.this.onSelectedListener != null) {
                        PickerViewLinkage.this.onSelectedListener.onSelected(PickerViewLinkage.this.curSelectedList);
                    }
                }
            });
            this.twoList.clear();
            this.twoList = arrayToList(array);
            checkItems(this.loopViewTwo, this.twoList);
            this.returnData1 = new ReturnData();
            this.returnData1.setItem(this.twoList.get(0));
            this.returnData1.setIndex(this.loopViewTwo.getSelectedIndex());
            if (this.curSelectedList.size() > 1) {
                this.curSelectedList.set(1, this.returnData1);
            } else {
                this.curSelectedList.add(1, this.returnData1);
            }
            this.loopViewTwo.setListener(new OnItemSelectedListener() {
                public void onItemSelected(String str, int i) {
                    ReturnData unused = PickerViewLinkage.this.returnData = new ReturnData();
                    PickerViewLinkage.this.returnData.setItem((String) PickerViewLinkage.this.oneList.get(PickerViewLinkage.this.selectOneIndex));
                    PickerViewLinkage.this.returnData.setIndex(PickerViewLinkage.this.loopViewOne.getSelectedIndex());
                    PickerViewLinkage.this.curSelectedList.set(0, PickerViewLinkage.this.returnData);
                    ReturnData unused2 = PickerViewLinkage.this.returnData1 = new ReturnData();
                    PickerViewLinkage.this.returnData1.setIndex(i);
                    PickerViewLinkage.this.returnData1.setItem(str);
                    PickerViewLinkage.this.curSelectedList.set(1, PickerViewLinkage.this.returnData1);
                    if (PickerViewLinkage.this.onSelectedListener != null) {
                        PickerViewLinkage.this.onSelectedListener.onSelected(PickerViewLinkage.this.curSelectedList);
                    }
                }
            });
        }
        if (dArr != null) {
            setWeights(dArr);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r3 = java.lang.String.valueOf(r11.getDouble(r2));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0060 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> arrayToList(com.facebook.react.bridge.ReadableArray r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x0078 }
            r0.<init>()     // Catch:{ Exception -> 0x0078 }
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r11.size()     // Catch:{ Exception -> 0x0078 }
            if (r2 >= r3) goto L_0x0077
            java.lang.String r3 = ""
            com.facebook.react.bridge.ReadableType r4 = r11.getType(r2)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r4 = r4.name()     // Catch:{ Exception -> 0x0078 }
            r5 = -1
            int r6 = r4.hashCode()     // Catch:{ Exception -> 0x0078 }
            r7 = -1950496919(0xffffffff8bbdc769, float:-7.310019E-32)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L_0x0042
            r7 = -1808118735(0xffffffff943a4c31, float:-9.405626E-27)
            if (r6 == r7) goto L_0x0038
            r7 = 1729365000(0x67140408, float:6.989846E23)
            if (r6 == r7) goto L_0x002e
            goto L_0x004b
        L_0x002e:
            java.lang.String r6 = "Boolean"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x0078 }
            if (r4 == 0) goto L_0x004b
            r5 = 0
            goto L_0x004b
        L_0x0038:
            java.lang.String r6 = "String"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x0078 }
            if (r4 == 0) goto L_0x004b
            r5 = 2
            goto L_0x004b
        L_0x0042:
            java.lang.String r6 = "Number"
            boolean r4 = r4.equals(r6)     // Catch:{ Exception -> 0x0078 }
            if (r4 == 0) goto L_0x004b
            r5 = 1
        L_0x004b:
            if (r5 == 0) goto L_0x0069
            if (r5 == r9) goto L_0x0057
            if (r5 == r8) goto L_0x0052
            goto L_0x0071
        L_0x0052:
            java.lang.String r3 = r11.getString(r2)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0071
        L_0x0057:
            int r3 = r11.getInt(r2)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0060 }
            goto L_0x0071
        L_0x0060:
            double r3 = r11.getDouble(r2)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0071
        L_0x0069:
            boolean r3 = r11.getBoolean(r2)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0078 }
        L_0x0071:
            r0.add(r3)     // Catch:{ Exception -> 0x0078 }
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0077:
            return r0
        L_0x0078:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beefe.picker.view.PickerViewLinkage.arrayToList(com.facebook.react.bridge.ReadableArray):java.util.ArrayList");
    }

    public void setSelectValue(String[] strArr) {
        int i = this.curRow;
        if (i <= strArr.length) {
            selectValues((String[]) Arrays.copyOf(strArr, i), this.curSelectedList);
            return;
        }
        int length = strArr.length;
        if (length == 1) {
            selectOneLoop(strArr, this.curSelectedList);
            int i2 = this.curRow;
            if (i2 == 2) {
                this.twoList.clear();
                getAllTwoListData();
                this.loopViewTwo.setItems(this.twoList);
                this.loopViewTwo.setSelectedPosition(0);
                this.returnData1 = new ReturnData();
                this.returnData1.setItem(this.loopViewTwo.getIndexItem(0));
                this.returnData1.setIndex(this.loopViewTwo.getSelectedIndex());
                this.curSelectedList.set(1, this.returnData1);
            } else if (i2 == 3) {
                this.twoList.clear();
                getTwoListData();
                this.loopViewTwo.setItems(this.twoList);
                this.loopViewTwo.setSelectedPosition(0);
                this.returnData1 = new ReturnData();
                this.returnData1.setItem(this.loopViewTwo.getIndexItem(0));
                this.returnData1.setIndex(this.loopViewTwo.getSelectedIndex());
                this.curSelectedList.set(1, this.returnData1);
                this.threeList.clear();
                getThreeListData();
                this.loopViewThree.setItems(this.threeList);
                this.loopViewThree.setSelectedPosition(0);
                this.returnData2 = new ReturnData();
                this.returnData2.setItem(this.loopViewThree.getIndexItem(0));
                this.returnData2.setIndex(this.loopViewThree.getSelectedIndex());
                this.curSelectedList.set(2, this.returnData2);
            }
        } else if (length == 2 && i == 3) {
            selectOneLoop(strArr, this.curSelectedList);
            this.twoList.clear();
            getTwoListData();
            selectTwoLoop(strArr, this.curSelectedList);
            this.threeList.clear();
            getThreeListData();
            this.loopViewThree.setItems(this.threeList);
            this.loopViewThree.setSelectedPosition(0);
            this.returnData2 = new ReturnData();
            this.returnData2.setItem(this.loopViewThree.getIndexItem(0));
            this.returnData2.setIndex(this.loopViewThree.getSelectedIndex());
            this.curSelectedList.set(2, this.returnData2);
        }
    }

    private void selectValues(String[] strArr, ArrayList<ReturnData> arrayList) {
        int length = strArr.length;
        if (length == 2) {
            selectOneLoop(strArr, arrayList);
            this.twoList.clear();
            getAllTwoListData();
            selectTwoLoop(strArr, arrayList);
        } else if (length == 3) {
            selectOneLoop(strArr, arrayList);
            this.twoList.clear();
            getTwoListData();
            selectTwoLoop(strArr, arrayList);
            this.threeList.clear();
            getThreeListData();
            selectThreeLoop(strArr, arrayList);
        }
    }

    private void selectOneLoop(String[] strArr, ArrayList<ReturnData> arrayList) {
        if (this.loopViewOne.hasItem(strArr[0])) {
            this.selectOneIndex = this.loopViewOne.getItemPosition(strArr[0]);
        } else {
            this.selectOneIndex = 0;
        }
        this.loopViewOne.setSelectedPosition(this.selectOneIndex);
        this.returnData = new ReturnData();
        this.returnData.setItem(this.loopViewOne.getIndexItem(this.selectOneIndex));
        this.returnData.setIndex(this.loopViewOne.getSelectedIndex());
        arrayList.set(0, this.returnData);
    }

    private void selectTwoLoop(String[] strArr, ArrayList<ReturnData> arrayList) {
        this.loopViewTwo.setItems(this.twoList);
        if (this.loopViewTwo.hasItem(strArr[1])) {
            this.selectTwoIndex = this.loopViewTwo.getItemPosition(strArr[1]);
        } else {
            this.selectTwoIndex = 0;
        }
        this.returnData1 = new ReturnData();
        this.loopViewTwo.setSelectedPosition(this.selectTwoIndex);
        this.returnData1.setItem(this.loopViewTwo.getIndexItem(this.selectTwoIndex));
        this.returnData1.setIndex(this.loopViewTwo.getSelectedIndex());
        arrayList.set(1, this.returnData1);
    }

    private void selectThreeLoop(String[] strArr, ArrayList<ReturnData> arrayList) {
        this.loopViewThree.setItems(this.threeList);
        int itemPosition = this.loopViewThree.hasItem(strArr[2]) ? this.loopViewThree.getItemPosition(strArr[2]) : 0;
        this.returnData2 = new ReturnData();
        this.loopViewThree.setSelectedPosition(itemPosition);
        this.returnData2.setItem(this.loopViewThree.getIndexItem(itemPosition));
        this.returnData2.setIndex(this.loopViewThree.getSelectedIndex());
        arrayList.set(2, this.returnData2);
    }

    private void getAllTwoListData() {
        this.twoList = arrayToList(this.data.get(this.selectOneIndex).getArray(this.oneList.get(this.selectOneIndex)));
    }

    private void getTwoListData() {
        ReadableArray array = this.data.get(this.selectOneIndex).getArray(this.oneList.get(this.selectOneIndex));
        for (int i = 0; i < array.size(); i++) {
            ReadableMapKeySetIterator keySetIterator = array.getMap(i).keySetIterator();
            if (keySetIterator.hasNextKey()) {
                this.twoList.add(keySetIterator.nextKey());
            }
        }
    }

    private void getThreeListData() {
        ReadableMap map = this.data.get(this.selectOneIndex).getArray(this.oneList.get(this.selectOneIndex)).getMap(this.selectTwoIndex);
        this.threeList = arrayToList(map.getArray(map.keySetIterator().nextKey()));
    }

    public void setTextSize(float f) {
        int i = this.curRow;
        if (i == 2) {
            this.loopViewOne.setTextSize(f);
            this.loopViewTwo.setTextSize(f);
        } else if (i == 3) {
            this.loopViewOne.setTextSize(f);
            this.loopViewTwo.setTextSize(f);
            this.loopViewThree.setTextSize(f);
        }
    }

    public void setTypeface(Typeface typeface) {
        int i = this.curRow;
        if (i == 2) {
            this.loopViewOne.setTypeface(typeface);
            this.loopViewTwo.setTypeface(typeface);
        } else if (i == 3) {
            this.loopViewOne.setTypeface(typeface);
            this.loopViewTwo.setTypeface(typeface);
            this.loopViewThree.setTypeface(typeface);
        }
    }

    public void setTextEllipsisLen(int i) {
        int i2 = this.curRow;
        if (i2 == 2) {
            this.loopViewOne.setTextEllipsisLen(i);
            this.loopViewTwo.setTextEllipsisLen(i);
        } else if (i2 == 3) {
            this.loopViewOne.setTextEllipsisLen(i);
            this.loopViewTwo.setTextEllipsisLen(i);
            this.loopViewThree.setTextEllipsisLen(i);
        }
    }

    public void setTextColor(int i) {
        int i2 = this.curRow;
        if (i2 == 2) {
            this.loopViewOne.setTextColor(i);
            this.loopViewTwo.setTextColor(i);
        } else if (i2 == 3) {
            this.loopViewOne.setTextColor(i);
            this.loopViewTwo.setTextColor(i);
            this.loopViewThree.setTextColor(i);
        }
    }

    public void setIsLoop(boolean z) {
        if (!z) {
            int i = this.curRow;
            if (i == 2) {
                this.loopViewOne.setNotLoop();
                this.loopViewTwo.setNotLoop();
            } else if (i == 3) {
                this.loopViewOne.setNotLoop();
                this.loopViewTwo.setNotLoop();
                this.loopViewThree.setNotLoop();
            }
        }
    }

    public int getViewHeight() {
        return this.loopViewOne.getViewHeight();
    }

    public ArrayList<ReturnData> getSelectedData() {
        return this.curSelectedList;
    }

    public void setOnSelectListener(OnSelectedListener onSelectedListener2) {
        this.onSelectedListener = onSelectedListener2;
    }
}
