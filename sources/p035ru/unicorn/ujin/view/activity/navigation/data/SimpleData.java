package p035ru.unicorn.ujin.view.activity.navigation.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.data.SimpleData */
public class SimpleData implements Diffable<SimpleData> {
    public static final String CARD = "card";
    public static final int CARD_ID = 2;
    public static final int CONSERJ_ID = 6;
    public static final String DIALOG = "dialogue";
    public static final String DOMOFON = "domofon";
    public static final int DOMOFON_ID = 1;
    public static final int EMERGENCY_ID = 5;
    public static final int GATE_ID = 3;
    public static final int SECURITY_ID = 4;
    public static final int SUPPORT_ID = 7;
    public static final String VIDEO = "video";
    public static final int VIDEO_ID = 0;
    private Action action;
    private String descr;
    private int iconRes;
    private String title;
    private int workId;

    public boolean areContentsTheSame(SimpleData simpleData) {
        return true;
    }

    public boolean areItemsTheSame(SimpleData simpleData) {
        return true;
    }

    public SimpleData(int i, String str, String str2, int i2) {
        this.iconRes = i;
        this.title = str;
        this.descr = str2;
        this.workId = i2;
    }

    public SimpleData(int i, String str, Action action2) {
        this.iconRes = i;
        this.descr = str;
        this.action = action2;
    }

    public SimpleData(int i, String str, String str2) {
        this.iconRes = i;
        this.title = str;
        this.descr = str2;
    }

    public SimpleData(int i, String str) {
        this.iconRes = i;
        this.descr = str;
    }

    public SimpleData(int i, String str, String str2, Action action2) {
        this.iconRes = i;
        this.title = str;
        this.descr = str2;
        this.action = action2;
    }

    public Action getAction() {
        return this.action;
    }

    public void setAction(Action action2) {
        this.action = action2;
    }

    public int getIconRes() {
        return this.iconRes;
    }

    public void setIconRes(int i) {
        this.iconRes = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDescr() {
        return this.descr;
    }

    public void setDescr(String str) {
        this.descr = str;
    }

    public int getWorkId() {
        return this.workId;
    }

    public static List<SimpleData> smartHome(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SimpleData((int) R.drawable.ic_base_camera, context.getString(R.string.label_smart_1), context.getString(R.string.label_smart_1_1)));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_complect, context.getString(R.string.label_smart_2), context.getString(R.string.label_smart_2_1)));
        return arrayList;
    }

    public static List<SimpleData> smartSecurity(Context context, Guard guard) {
        ArrayList arrayList = new ArrayList();
        showItem(guard.getVideoItem().getMode());
        arrayList.add(new SimpleData((int) R.drawable.ic_base_video, context.getString(R.string.label_smart_3), context.getString(R.string.label_smart_3_1), 0));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_access, context.getString(R.string.label_smart_4), context.getString(R.string.label_smart_4_1), 1));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_card, context.getString(R.string.label_smart_5), context.getString(R.string.label_smart_5_1), 2));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_gate, context.getString(R.string.label_smart_6), context.getString(R.string.label_smart_6_1), 3));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_security_men, context.getString(R.string.label_smart_7), context.getString(R.string.label_smart_7_1), 4));
        return arrayList;
    }

    public static List<SimpleData> smartUslugi(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SimpleData((int) R.drawable.ic_base_counter, context.getString(R.string.label_smart_8), context.getString(R.string.label_smart_8_1)));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_kvit, context.getString(R.string.label_smart_9), context.getString(R.string.label_smart_9_1)));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_company, context.getString(R.string.label_smart_10), context.getString(R.string.label_smart_10_1)));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_service_desk, context.getString(R.string.label_smart_11), context.getString(R.string.label_smart_11_1)));
        return arrayList;
    }

    public static List<SimpleData> smartStart(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SimpleData((int) R.drawable.ic_base_superman, context.getString(R.string.label_start_12), new Action("call", context.getString(R.string.action_call_emergency))));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_security_men_white, context.getString(R.string.label_start_13), new Action("call", context.getString(R.string.action_call_emergency))));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_conserj, context.getString(R.string.label_start_14), new Action("call", context.getString(R.string.action_call_emergency))));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_support, context.getString(R.string.label_start_15), new Action("call", context.getString(R.string.action_call_emergency))));
        arrayList.add(new SimpleData((int) R.drawable.ic_base_open_door, context.getString(R.string.label_start_16), new Action("open_door")));
        arrayList.add(new SimpleData(R.drawable.ic_base_open_gate, context.getString(R.string.label_start_17)));
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[ADDED_TO_REGION, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean showItem(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1217487446(0xffffffffb76e9daa, float:-1.42226145E-5)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 95945896(0x5b804a8, float:1.7304987E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "dummy"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "hidden"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = -1
        L_0x0026:
            if (r4 == 0) goto L_0x002c
            if (r4 == r3) goto L_0x002b
            return r3
        L_0x002b:
            return r2
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.data.SimpleData.showItem(java.lang.String):boolean");
    }
}
