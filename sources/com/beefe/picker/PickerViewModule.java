package com.beefe.picker;

import android.app.Dialog;
import com.beefe.picker.view.PickerViewAlone;
import com.beefe.picker.view.PickerViewLinkage;
import com.beefe.picker.view.ReturnData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.Iterator;

public class PickerViewModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String ERROR_NOT_INIT = "please initialize the component first";
    private static final String EVENT_KEY_CANCEL = "cancel";
    private static final String EVENT_KEY_CONFIRM = "confirm";
    private static final String EVENT_KEY_SELECTED = "select";
    private static final String FONTS = "fonts/";
    private static final String IS_LOOP = "isLoop";
    private static final String OTF = ".otf";
    private static final String PICKER_BG_COLOR = "pickerBg";
    private static final String PICKER_CANCEL_BTN_COLOR = "pickerCancelBtnColor";
    private static final String PICKER_CANCEL_BTN_TEXT = "pickerCancelBtnText";
    private static final String PICKER_CONFIRM_BTN_COLOR = "pickerConfirmBtnColor";
    private static final String PICKER_CONFIRM_BTN_TEXT = "pickerConfirmBtnText";
    private static final String PICKER_DATA = "pickerData";
    private static final String PICKER_EVENT_NAME = "pickerEvent";
    private static final String PICKER_FONT_FAMILY = "pickerFontFamily";
    private static final String PICKER_TEXT_COLOR = "pickerFontColor";
    private static final String PICKER_TEXT_ELLIPSIS_LEN = "pickerTextEllipsisLen";
    private static final String PICKER_TEXT_SIZE = "pickerFontSize";
    private static final String PICKER_TITLE_TEXT = "pickerTitleText";
    private static final String PICKER_TITLE_TEXT_COLOR = "pickerTitleColor";
    private static final String PICKER_TOOL_BAR_BG = "pickerToolBarBg";
    private static final String PICKER_TOOL_BAR_HEIGHT = "pickerToolBarHeight";
    private static final String PICKER_TOOL_BAR_TEXT_SIZE = "pickerToolBarFontSize";
    private static final String REACT_CLASS = "BEEPickerManager";
    private static final String SELECTED_VALUE = "selectedValue";
    private static final String TTF = ".ttf";
    private static final String WEIGHTS = "wheelFlex";
    private String cancelText;
    private String confirmText;
    /* access modifiers changed from: private */
    public int curStatus;
    private Dialog dialog = null;
    private boolean isLoop = true;
    private int pickerTextEllipsisLen;
    /* access modifiers changed from: private */
    public PickerViewAlone pickerViewAlone;
    /* access modifiers changed from: private */
    public PickerViewLinkage pickerViewLinkage;
    /* access modifiers changed from: private */
    public ArrayList<ReturnData> returnData;
    private String titleText;
    private double[] weights;

    public String getName() {
        return REACT_CLASS;
    }

    public void onHostResume() {
    }

    public PickerViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r6 = android.graphics.Typeface.createFromAsset(r5, FONTS + r6 + OTF);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r6 = android.graphics.Typeface.create(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0373, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0352 */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022f A[SYNTHETIC, Splitter:B:75:0x022f] */
    @com.facebook.react.bridge.ReactMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void _init(com.facebook.react.bridge.ReadableMap r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.app.Activity r2 = r17.getCurrentActivity()
            if (r2 == 0) goto L_0x0417
            java.lang.String r3 = "pickerData"
            boolean r4 = r1.hasKey(r3)
            if (r4 == 0) goto L_0x0417
            android.view.LayoutInflater r4 = r2.getLayoutInflater()
            int r5 = com.beefe.picker.C1081R.layout.picker_view
            r6 = 0
            android.view.View r4 = r4.inflate(r5, r6)
            int r5 = com.beefe.picker.C1081R.C1084id.barLayout
            android.view.View r5 = r4.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            int r7 = com.beefe.picker.C1081R.C1084id.cancel
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r8 = com.beefe.picker.C1081R.C1084id.title
            android.view.View r8 = r4.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            int r9 = com.beefe.picker.C1081R.C1084id.confirm
            android.view.View r9 = r4.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            int r10 = com.beefe.picker.C1081R.C1084id.pickerLayout
            android.view.View r10 = r4.findViewById(r10)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            int r11 = com.beefe.picker.C1081R.C1084id.pickerViewLinkage
            android.view.View r11 = r4.findViewById(r11)
            com.beefe.picker.view.PickerViewLinkage r11 = (com.beefe.picker.view.PickerViewLinkage) r11
            r0.pickerViewLinkage = r11
            int r11 = com.beefe.picker.C1081R.C1084id.pickerViewAlone
            android.view.View r11 = r4.findViewById(r11)
            com.beefe.picker.view.PickerViewAlone r11 = (com.beefe.picker.view.PickerViewAlone) r11
            r0.pickerViewAlone = r11
            java.lang.String r11 = "pickerToolBarHeight"
            boolean r12 = r1.hasKey(r11)
            if (r12 == 0) goto L_0x006e
            int r11 = r1.getInt(r11)     // Catch:{ Exception -> 0x0068 }
            goto L_0x007d
        L_0x0068:
            double r11 = r1.getDouble(r11)
            int r11 = (int) r11
            goto L_0x007d
        L_0x006e:
            android.content.res.Resources r11 = r2.getResources()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            r12 = 1109393408(0x42200000, float:40.0)
            float r11 = r11 * r12
            int r11 = (int) r11
        L_0x007d:
            android.widget.RelativeLayout$LayoutParams r12 = new android.widget.RelativeLayout$LayoutParams
            r13 = -1
            r12.<init>(r13, r11)
            r5.setLayoutParams(r12)
            java.lang.String r12 = "pickerToolBarBg"
            boolean r14 = r1.hasKey(r12)
            r15 = 3
            r13 = 1
            r6 = 0
            if (r14 == 0) goto L_0x00ab
            com.facebook.react.bridge.ReadableArray r12 = r1.getArray(r12)
            int[] r12 = r0.getColor(r12)
            r14 = r12[r15]
            r15 = r12[r6]
            r6 = r12[r13]
            r16 = 2
            r12 = r12[r16]
            int r6 = android.graphics.Color.argb(r14, r15, r6, r12)
            r5.setBackgroundColor(r6)
        L_0x00ab:
            java.lang.String r5 = "pickerToolBarFontSize"
            boolean r6 = r1.hasKey(r5)
            if (r6 == 0) goto L_0x00c2
            int r5 = r1.getInt(r5)
            float r5 = (float) r5
            r7.setTextSize(r5)
            r8.setTextSize(r5)
            r9.setTextSize(r5)
        L_0x00c2:
            java.lang.String r5 = "pickerConfirmBtnText"
            boolean r6 = r1.hasKey(r5)
            if (r6 == 0) goto L_0x00d1
            java.lang.String r5 = r1.getString(r5)
            r0.confirmText = r5
        L_0x00d1:
            java.lang.String r5 = r0.confirmText
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x00de
            java.lang.String r5 = r0.confirmText
            goto L_0x00df
        L_0x00de:
            r5 = r6
        L_0x00df:
            r9.setText(r5)
            java.lang.String r5 = "pickerConfirmBtnColor"
            boolean r12 = r1.hasKey(r5)
            if (r12 == 0) goto L_0x0106
            com.facebook.react.bridge.ReadableArray r5 = r1.getArray(r5)
            int[] r5 = r0.getColor(r5)
            r12 = 3
            r14 = r5[r12]
            r12 = 0
            r15 = r5[r12]
            r12 = r5[r13]
            r16 = 2
            r5 = r5[r16]
            int r5 = android.graphics.Color.argb(r14, r15, r12, r5)
            r9.setTextColor(r5)
        L_0x0106:
            com.beefe.picker.PickerViewModule$1 r5 = new com.beefe.picker.PickerViewModule$1
            r5.<init>()
            r9.setOnClickListener(r5)
            java.lang.String r5 = "pickerTitleText"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x0120
            java.lang.String r5 = "pickerTitleText"
            java.lang.String r5 = r1.getString(r5)
            r0.titleText = r5
        L_0x0120:
            java.lang.String r5 = r0.titleText
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x012b
            java.lang.String r5 = r0.titleText
            goto L_0x012c
        L_0x012b:
            r5 = r6
        L_0x012c:
            r8.setText(r5)
            java.lang.String r5 = "pickerTitleColor"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x0156
            java.lang.String r5 = "pickerTitleColor"
            com.facebook.react.bridge.ReadableArray r5 = r1.getArray(r5)
            int[] r5 = r0.getColor(r5)
            r12 = 3
            r14 = r5[r12]
            r12 = 0
            r15 = r5[r12]
            r12 = r5[r13]
            r16 = 2
            r5 = r5[r16]
            int r5 = android.graphics.Color.argb(r14, r15, r12, r5)
            r8.setTextColor(r5)
        L_0x0156:
            java.lang.String r5 = "pickerCancelBtnText"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x0168
            java.lang.String r5 = "pickerCancelBtnText"
            java.lang.String r5 = r1.getString(r5)
            r0.cancelText = r5
        L_0x0168:
            java.lang.String r5 = r0.cancelText
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0172
            java.lang.String r6 = r0.cancelText
        L_0x0172:
            r7.setText(r6)
            java.lang.String r5 = "pickerCancelBtnColor"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x019b
            java.lang.String r5 = "pickerCancelBtnColor"
            com.facebook.react.bridge.ReadableArray r5 = r1.getArray(r5)
            int[] r5 = r0.getColor(r5)
            r6 = 3
            r12 = r5[r6]
            r6 = 0
            r14 = r5[r6]
            r6 = r5[r13]
            r15 = 2
            r5 = r5[r15]
            int r5 = android.graphics.Color.argb(r12, r14, r6, r5)
            r7.setTextColor(r5)
        L_0x019b:
            com.beefe.picker.PickerViewModule$2 r5 = new com.beefe.picker.PickerViewModule$2
            r5.<init>()
            r7.setOnClickListener(r5)
            java.lang.String r5 = "pickerTextEllipsisLen"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x01b5
            java.lang.String r5 = "pickerTextEllipsisLen"
            int r5 = r1.getInt(r5)
            r0.pickerTextEllipsisLen = r5
        L_0x01b5:
            java.lang.String r5 = "isLoop"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x01c5
            java.lang.String r5 = "isLoop"
            boolean r5 = r1.getBoolean(r5)
            r0.isLoop = r5
        L_0x01c5:
            java.lang.String r5 = "wheelFlex"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x0244
            java.lang.String r5 = "wheelFlex"
            com.facebook.react.bridge.ReadableArray r5 = r1.getArray(r5)
            int r6 = r5.size()
            double[] r6 = new double[r6]
            r0.weights = r6
            r6 = 0
        L_0x01de:
            int r12 = r5.size()
            if (r6 >= r12) goto L_0x0244
            com.facebook.react.bridge.ReadableType r12 = r5.getType(r6)
            java.lang.String r12 = r12.name()
            int r14 = r12.hashCode()
            r15 = -1950496919(0xffffffff8bbdc769, float:-7.310019E-32)
            if (r14 == r15) goto L_0x0205
            r15 = -1808118735(0xffffffff943a4c31, float:-9.405626E-27)
            if (r14 == r15) goto L_0x01fb
            goto L_0x020f
        L_0x01fb:
            java.lang.String r14 = "String"
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x020f
            r12 = 1
            goto L_0x0210
        L_0x0205:
            java.lang.String r14 = "Number"
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x020f
            r12 = 0
            goto L_0x0210
        L_0x020f:
            r12 = -1
        L_0x0210:
            if (r12 == 0) goto L_0x022f
            if (r12 == r13) goto L_0x021b
            double[] r12 = r0.weights
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12[r6] = r14
            goto L_0x0241
        L_0x021b:
            double[] r12 = r0.weights     // Catch:{ Exception -> 0x0228 }
            java.lang.String r14 = r5.getString(r6)     // Catch:{ Exception -> 0x0228 }
            double r14 = java.lang.Double.parseDouble(r14)     // Catch:{ Exception -> 0x0228 }
            r12[r6] = r14     // Catch:{ Exception -> 0x0228 }
            goto L_0x0241
        L_0x0228:
            double[] r12 = r0.weights
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12[r6] = r14
            goto L_0x0241
        L_0x022f:
            double[] r12 = r0.weights     // Catch:{ Exception -> 0x0239 }
            int r14 = r5.getInt(r6)     // Catch:{ Exception -> 0x0239 }
            double r14 = (double) r14     // Catch:{ Exception -> 0x0239 }
            r12[r6] = r14     // Catch:{ Exception -> 0x0239 }
            goto L_0x0241
        L_0x0239:
            double[] r12 = r0.weights
            double r14 = r5.getDouble(r6)
            r12[r6] = r14
        L_0x0241:
            int r6 = r6 + 1
            goto L_0x01de
        L_0x0244:
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.String r6 = "pickerFontColor"
            boolean r6 = r1.hasKey(r6)
            if (r6 == 0) goto L_0x0269
            java.lang.String r5 = "pickerFontColor"
            com.facebook.react.bridge.ReadableArray r5 = r1.getArray(r5)
            int[] r5 = r0.getColor(r5)
            r6 = 3
            r12 = r5[r6]
            r6 = 0
            r14 = r5[r6]
            r6 = r5[r13]
            r15 = 2
            r5 = r5[r15]
            int r5 = android.graphics.Color.argb(r12, r14, r6, r5)
        L_0x0269:
            r6 = 16
            java.lang.String r12 = "pickerFontSize"
            boolean r14 = r1.hasKey(r12)
            if (r14 == 0) goto L_0x027e
            int r6 = r1.getInt(r12)     // Catch:{ Exception -> 0x0279 }
            goto L_0x027e
        L_0x0279:
            double r14 = r1.getDouble(r12)
            int r6 = (int) r14
        L_0x027e:
            com.facebook.react.bridge.ReadableArray r3 = r1.getArray(r3)
            r12 = 0
            com.facebook.react.bridge.ReadableType r14 = r3.getType(r12)
            java.lang.String r12 = r14.name()
            int r14 = r12.hashCode()
            r15 = 77116(0x12d3c, float:1.08063E-40)
            if (r14 == r15) goto L_0x0295
            goto L_0x029f
        L_0x0295:
            java.lang.String r14 = "Map"
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x029f
            r12 = 0
            goto L_0x02a0
        L_0x029f:
            r12 = -1
        L_0x02a0:
            r14 = 8
            if (r12 == 0) goto L_0x02e2
            r12 = 0
            r0.curStatus = r12
            com.beefe.picker.view.PickerViewAlone r15 = r0.pickerViewAlone
            r15.setVisibility(r12)
            com.beefe.picker.view.PickerViewLinkage r12 = r0.pickerViewLinkage
            r12.setVisibility(r14)
            com.beefe.picker.view.PickerViewAlone r12 = r0.pickerViewAlone
            double[] r15 = r0.weights
            r12.setPickerData(r3, r15)
            com.beefe.picker.view.PickerViewAlone r3 = r0.pickerViewAlone
            r3.setTextColor(r5)
            com.beefe.picker.view.PickerViewAlone r3 = r0.pickerViewAlone
            float r5 = (float) r6
            r3.setTextSize(r5)
            com.beefe.picker.view.PickerViewAlone r3 = r0.pickerViewAlone
            int r5 = r0.pickerTextEllipsisLen
            r3.setTextEllipsisLen(r5)
            com.beefe.picker.view.PickerViewAlone r3 = r0.pickerViewAlone
            boolean r5 = r0.isLoop
            r3.setIsLoop(r5)
            com.beefe.picker.view.PickerViewAlone r3 = r0.pickerViewAlone
            com.beefe.picker.PickerViewModule$4 r5 = new com.beefe.picker.PickerViewModule$4
            r5.<init>()
            r3.setOnSelectedListener(r5)
            com.beefe.picker.view.PickerViewAlone r3 = r0.pickerViewAlone
            int r3 = r3.getViewHeight()
            goto L_0x031f
        L_0x02e2:
            r0.curStatus = r13
            com.beefe.picker.view.PickerViewLinkage r12 = r0.pickerViewLinkage
            r15 = 0
            r12.setVisibility(r15)
            com.beefe.picker.view.PickerViewAlone r12 = r0.pickerViewAlone
            r12.setVisibility(r14)
            com.beefe.picker.view.PickerViewLinkage r12 = r0.pickerViewLinkage
            double[] r15 = r0.weights
            r12.setPickerData(r3, r15)
            com.beefe.picker.view.PickerViewLinkage r3 = r0.pickerViewLinkage
            r3.setTextColor(r5)
            com.beefe.picker.view.PickerViewLinkage r3 = r0.pickerViewLinkage
            float r5 = (float) r6
            r3.setTextSize(r5)
            com.beefe.picker.view.PickerViewLinkage r3 = r0.pickerViewLinkage
            int r5 = r0.pickerTextEllipsisLen
            r3.setTextEllipsisLen(r5)
            com.beefe.picker.view.PickerViewLinkage r3 = r0.pickerViewLinkage
            boolean r5 = r0.isLoop
            r3.setIsLoop(r5)
            com.beefe.picker.view.PickerViewLinkage r3 = r0.pickerViewLinkage
            com.beefe.picker.PickerViewModule$3 r5 = new com.beefe.picker.PickerViewModule$3
            r5.<init>()
            r3.setOnSelectListener(r5)
            com.beefe.picker.view.PickerViewLinkage r3 = r0.pickerViewLinkage
            int r3 = r3.getViewHeight()
        L_0x031f:
            java.lang.String r5 = "pickerFontFamily"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x0387
            android.content.Context r5 = r2.getApplicationContext()
            android.content.res.AssetManager r5 = r5.getAssets()
            java.lang.String r6 = "pickerFontFamily"
            java.lang.String r6 = r1.getString(r6)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0352 }
            r12.<init>()     // Catch:{ Exception -> 0x0352 }
            java.lang.String r15 = "fonts/"
            r12.append(r15)     // Catch:{ Exception -> 0x0352 }
            r12.append(r6)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r15 = ".ttf"
            r12.append(r15)     // Catch:{ Exception -> 0x0352 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0352 }
            android.graphics.Typeface r6 = android.graphics.Typeface.createFromAsset(r5, r12)     // Catch:{ Exception -> 0x0352 }
            goto L_0x0374
        L_0x0352:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x036d }
            r12.<init>()     // Catch:{ Exception -> 0x036d }
            java.lang.String r15 = "fonts/"
            r12.append(r15)     // Catch:{ Exception -> 0x036d }
            r12.append(r6)     // Catch:{ Exception -> 0x036d }
            java.lang.String r15 = ".otf"
            r12.append(r15)     // Catch:{ Exception -> 0x036d }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x036d }
            android.graphics.Typeface r6 = android.graphics.Typeface.createFromAsset(r5, r12)     // Catch:{ Exception -> 0x036d }
            goto L_0x0374
        L_0x036d:
            r5 = 0
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r6, r5)     // Catch:{ Exception -> 0x0373 }
            goto L_0x0374
        L_0x0373:
            r6 = 0
        L_0x0374:
            r7.setTypeface(r6)
            r8.setTypeface(r6)
            r9.setTypeface(r6)
            com.beefe.picker.view.PickerViewAlone r5 = r0.pickerViewAlone
            r5.setTypeface(r6)
            com.beefe.picker.view.PickerViewLinkage r5 = r0.pickerViewLinkage
            r5.setTypeface(r6)
        L_0x0387:
            java.lang.String r5 = "selectedValue"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x039e
            java.lang.String r5 = "selectedValue"
            com.facebook.react.bridge.ReadableArray r5 = r1.getArray(r5)
            java.lang.String[] r5 = r0.getSelectedValue(r5)
            r0.select(r5)
        L_0x039e:
            java.lang.String r5 = "pickerBg"
            boolean r5 = r1.hasKey(r5)
            if (r5 == 0) goto L_0x03c4
            java.lang.String r5 = "pickerBg"
            com.facebook.react.bridge.ReadableArray r1 = r1.getArray(r5)
            int[] r1 = r0.getColor(r1)
            r5 = 3
            r5 = r1[r5]
            r6 = 0
            r6 = r1[r6]
            r7 = r1[r13]
            r8 = 2
            r1 = r1[r8]
            int r1 = android.graphics.Color.argb(r5, r6, r7, r1)
            r10.setBackgroundColor(r1)
        L_0x03c4:
            int r11 = r11 + r3
            android.app.Dialog r1 = r0.dialog
            if (r1 != 0) goto L_0x040f
            android.app.Dialog r1 = new android.app.Dialog
            int r3 = com.beefe.picker.C1081R.style.Dialog_Full_Screen
            r1.<init>(r2, r3)
            r0.dialog = r1
            android.app.Dialog r1 = r0.dialog
            r1.setContentView(r4)
            android.view.WindowManager$LayoutParams r1 = new android.view.WindowManager$LayoutParams
            r1.<init>()
            android.app.Dialog r2 = r0.dialog
            android.view.Window r2 = r2.getWindow()
            if (r2 == 0) goto L_0x0417
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x03f0
            r3 = 2003(0x7d3, float:2.807E-42)
            r2.setType(r3)
            goto L_0x03f9
        L_0x03f0:
            boolean r3 = com.beefe.picker.util.MIUIUtils.isMIUI()
            if (r3 == 0) goto L_0x03f9
            r3 = 2
            r1.type = r3
        L_0x03f9:
            r1.flags = r14
            r3 = -2
            r1.format = r3
            int r3 = com.beefe.picker.C1081R.style.PickerAnim
            r1.windowAnimations = r3
            r3 = -1
            r1.width = r3
            r1.height = r11
            r3 = 80
            r1.gravity = r3
            r2.setAttributes(r1)
            goto L_0x0417
        L_0x040f:
            r1.dismiss()
            android.app.Dialog r1 = r0.dialog
            r1.setContentView(r4)
        L_0x0417:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beefe.picker.PickerViewModule._init(com.facebook.react.bridge.ReadableMap):void");
    }

    @ReactMethod
    public void select(ReadableArray readableArray, Callback callback) {
        if (this.dialog != null) {
            select(getSelectedValue(readableArray));
        } else if (callback != null) {
            callback.invoke(ERROR_NOT_INIT);
        }
    }

    @ReactMethod
    public void show() {
        Dialog dialog2 = this.dialog;
        if (dialog2 != null && !dialog2.isShowing()) {
            this.dialog.show();
        }
    }

    @ReactMethod
    public void hide() {
        Dialog dialog2 = this.dialog;
        if (dialog2 != null && dialog2.isShowing()) {
            this.dialog.dismiss();
        }
    }

    @ReactMethod
    public void isPickerShow(Callback callback) {
        if (callback != null) {
            Dialog dialog2 = this.dialog;
            if (dialog2 == null) {
                callback.invoke(ERROR_NOT_INIT);
                return;
            }
            callback.invoke(null, Boolean.valueOf(dialog2.isShowing()));
        }
    }

    private int[] getColor(ReadableArray readableArray) {
        int[] iArr = new int[4];
        for (int i = 0; i < readableArray.size(); i++) {
            if (i == 0 || i == 1 || i == 2) {
                iArr[i] = readableArray.getInt(i);
            } else if (i == 3) {
                iArr[i] = (int) (readableArray.getDouble(i) * 255.0d);
            }
        }
        return iArr;
    }

    private String[] getSelectedValue(ReadableArray readableArray) {
        String[] strArr = new String[readableArray.size()];
        String str = "";
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
            } else if (c == 1) {
                try {
                    str = String.valueOf(readableArray.getInt(i));
                } catch (Exception unused) {
                    str = String.valueOf(readableArray.getDouble(i));
                }
            } else if (c == 2) {
                str = readableArray.getString(i);
            }
            strArr[i] = str;
        }
        return strArr;
    }

    private void select(String[] strArr) {
        int i = this.curStatus;
        if (i == 0) {
            this.pickerViewAlone.setSelectValue(strArr);
        } else if (i == 1) {
            this.pickerViewLinkage.setSelectValue(strArr);
        }
    }

    /* access modifiers changed from: private */
    public void commonEvent(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", str);
        WritableArray createArray = Arguments.createArray();
        WritableArray createArray2 = Arguments.createArray();
        Iterator<ReturnData> it = this.returnData.iterator();
        while (it.hasNext()) {
            ReturnData next = it.next();
            createArray.pushInt(next.getIndex());
            createArray2.pushString(next.getItem());
        }
        createMap.putArray(SELECTED_VALUE, createArray2);
        createMap.putArray("selectedIndex", createArray);
        sendEvent(getReactApplicationContext(), PICKER_EVENT_NAME, createMap);
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    public void onHostPause() {
        hide();
        this.dialog = null;
    }

    public void onHostDestroy() {
        hide();
        this.dialog = null;
    }
}
