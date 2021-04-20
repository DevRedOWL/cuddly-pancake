package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.PropertyRenta;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p046io.realm.BaseRealm;
import p046io.realm.C4742xdc63beb7;
import p046io.realm.C4756x99acf311;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy */
public class C4752xf2aa007e extends RentTypeAttr implements RealmObjectProxy, C4753x3e233a5b {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentTypeAttrColumnInfo columnInfo;
    private ProxyState<RentTypeAttr> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentTypeAttr";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy$RentTypeAttrColumnInfo */
    static final class RentTypeAttrColumnInfo extends ColumnInfo {
        long finishDateIndex;
        long idIndex;
        long maxColumnIndexValue;
        long propRentaIndex;
        long startDateIndex;
        long stateDisplayNameIndex;
        long stateNameIndex;
        long stateRentaIndex;

        RentTypeAttrColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.startDateIndex = addColumnDetails("startDate", "startDate", objectSchemaInfo);
            this.finishDateIndex = addColumnDetails("finishDate", "finishDate", objectSchemaInfo);
            this.stateNameIndex = addColumnDetails("stateName", "stateName", objectSchemaInfo);
            this.stateDisplayNameIndex = addColumnDetails("stateDisplayName", "stateDisplayName", objectSchemaInfo);
            this.stateRentaIndex = addColumnDetails("stateRenta", "stateRenta", objectSchemaInfo);
            this.propRentaIndex = addColumnDetails("propRenta", "propRenta", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentTypeAttrColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentTypeAttrColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentTypeAttrColumnInfo rentTypeAttrColumnInfo = (RentTypeAttrColumnInfo) columnInfo;
            RentTypeAttrColumnInfo rentTypeAttrColumnInfo2 = (RentTypeAttrColumnInfo) columnInfo2;
            rentTypeAttrColumnInfo2.idIndex = rentTypeAttrColumnInfo.idIndex;
            rentTypeAttrColumnInfo2.startDateIndex = rentTypeAttrColumnInfo.startDateIndex;
            rentTypeAttrColumnInfo2.finishDateIndex = rentTypeAttrColumnInfo.finishDateIndex;
            rentTypeAttrColumnInfo2.stateNameIndex = rentTypeAttrColumnInfo.stateNameIndex;
            rentTypeAttrColumnInfo2.stateDisplayNameIndex = rentTypeAttrColumnInfo.stateDisplayNameIndex;
            rentTypeAttrColumnInfo2.stateRentaIndex = rentTypeAttrColumnInfo.stateRentaIndex;
            rentTypeAttrColumnInfo2.propRentaIndex = rentTypeAttrColumnInfo.propRentaIndex;
            rentTypeAttrColumnInfo2.maxColumnIndexValue = rentTypeAttrColumnInfo.maxColumnIndexValue;
        }
    }

    C4752xf2aa007e() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentTypeAttrColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public Integer realmGet$startDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.startDateIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.startDateIndex));
    }

    public void realmSet$startDate(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startDateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.startDateIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.startDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.startDateIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$finishDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.finishDateIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.finishDateIndex));
    }

    public void realmSet$finishDate(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.finishDateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.finishDateIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.finishDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.finishDateIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$stateName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateNameIndex);
    }

    public void realmSet$stateName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$stateDisplayName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateDisplayNameIndex);
    }

    public void realmSet$stateDisplayName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateDisplayNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateDisplayNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateDisplayNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateDisplayNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public StateRenta realmGet$stateRenta() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.stateRentaIndex)) {
            return null;
        }
        return (StateRenta) this.proxyState.getRealm$realm().get(StateRenta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.stateRentaIndex), false, Collections.emptyList());
    }

    public void realmSet$stateRenta(StateRenta stateRenta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (stateRenta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.stateRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(stateRenta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.stateRentaIndex, ((RealmObjectProxy) stateRenta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("stateRenta")) {
            if (stateRenta != null && !RealmObject.isManaged(stateRenta)) {
                stateRenta = (StateRenta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(stateRenta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (stateRenta == null) {
                row$realm.nullifyLink(this.columnInfo.stateRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(stateRenta);
            row$realm.getTable().setLink(this.columnInfo.stateRentaIndex, row$realm.getIndex(), ((RealmObjectProxy) stateRenta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public PropertyRenta realmGet$propRenta() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.propRentaIndex)) {
            return null;
        }
        return (PropertyRenta) this.proxyState.getRealm$realm().get(PropertyRenta.class, this.proxyState.getRow$realm().getLink(this.columnInfo.propRentaIndex), false, Collections.emptyList());
    }

    public void realmSet$propRenta(PropertyRenta propertyRenta) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (propertyRenta == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.propRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(propertyRenta);
            this.proxyState.getRow$realm().setLink(this.columnInfo.propRentaIndex, ((RealmObjectProxy) propertyRenta).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("propRenta")) {
            if (propertyRenta != null && !RealmObject.isManaged(propertyRenta)) {
                propertyRenta = (PropertyRenta) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(propertyRenta, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (propertyRenta == null) {
                row$realm.nullifyLink(this.columnInfo.propRentaIndex);
                return;
            }
            this.proxyState.checkValidObject(propertyRenta);
            row$realm.getTable().setLink(this.columnInfo.propRentaIndex, row$realm.getIndex(), ((RealmObjectProxy) propertyRenta).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("startDate", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("finishDate", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("stateName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("stateDisplayName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("stateRenta", RealmFieldType.OBJECT, C4756x99acf311.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("propRenta", RealmFieldType.OBJECT, C4742xdc63beb7.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentTypeAttrColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentTypeAttrColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy$RentTypeAttrColumnInfo r4 = (p046io.realm.C4752xf2aa007e.RentTypeAttrColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            long r6 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r3 = r2
        L_0x0067:
            java.lang.String r4 = "propRenta"
            java.lang.String r5 = "stateRenta"
            if (r3 != 0) goto L_0x00b0
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0076
            r0.add(r5)
        L_0x0076:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007f
            r0.add(r4)
        L_0x007f:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a8
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0096
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy r3 = (p046io.realm.C4752xf2aa007e) r3
            goto L_0x00b0
        L_0x0096:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy r3 = (p046io.realm.C4752xf2aa007e) r3
            goto L_0x00b0
        L_0x00a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b0:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxyInterface r0 = (p046io.realm.C4753x3e233a5b) r0
            java.lang.String r1 = "startDate"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00d0
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00c5
            r0.realmSet$startDate(r2)
            goto L_0x00d0
        L_0x00c5:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$startDate(r1)
        L_0x00d0:
            java.lang.String r1 = "finishDate"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00ed
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00e2
            r0.realmSet$finishDate(r2)
            goto L_0x00ed
        L_0x00e2:
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.realmSet$finishDate(r1)
        L_0x00ed:
            java.lang.String r1 = "stateName"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0106
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00ff
            r0.realmSet$stateName(r2)
            goto L_0x0106
        L_0x00ff:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$stateName(r1)
        L_0x0106:
            java.lang.String r1 = "stateDisplayName"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x011f
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0118
            r0.realmSet$stateDisplayName(r2)
            goto L_0x011f
        L_0x0118:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$stateDisplayName(r1)
        L_0x011f:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x013a
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x012f
            r0.realmSet$stateRenta(r2)
            goto L_0x013a
        L_0x012f:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r1 = p046io.realm.C4756x99acf311.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$stateRenta(r1)
        L_0x013a:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x0155
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x014a
            r0.realmSet$propRenta(r2)
            goto L_0x0155
        L_0x014a:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.PropertyRenta r13 = p046io.realm.C4742xdc63beb7.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$propRenta(r13)
        L_0x0155:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4752xf2aa007e.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr");
    }

    public static RentTypeAttr createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentTypeAttr rentTypeAttr = new RentTypeAttr();
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("startDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$startDate(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$startDate((Integer) null);
                }
            } else if (nextName.equals("finishDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$finishDate(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$finishDate((Integer) null);
                }
            } else if (nextName.equals("stateName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateName((String) null);
                }
            } else if (nextName.equals("stateDisplayName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateDisplayName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateDisplayName((String) null);
                }
            } else if (nextName.equals("stateRenta")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateRenta((StateRenta) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateRenta(C4756x99acf311.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("propRenta")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$propRenta((PropertyRenta) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$propRenta(C4742xdc63beb7.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentTypeAttr) realm.copyToRealm(rentTypeAttr, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4752xf2aa007e newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class), false, Collections.emptyList());
        C4752xf2aa007e ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxy = new C4752xf2aa007e();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4752xf2aa007e.RentTypeAttrColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentTypeAttr.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxyInterface r5 = (p046io.realm.C4753x3e233a5b) r5
            java.lang.Integer r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4752xf2aa007e.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentTypeAttrRealmProxy$RentTypeAttrColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentTypeAttr");
    }

    public static RentTypeAttr copy(Realm realm, RentTypeAttrColumnInfo rentTypeAttrColumnInfo, RentTypeAttr rentTypeAttr, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentTypeAttr);
        if (realmObjectProxy != null) {
            return (RentTypeAttr) realmObjectProxy;
        }
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentTypeAttr.class), rentTypeAttrColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentTypeAttrColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(rentTypeAttrColumnInfo.startDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$startDate());
        osObjectBuilder.addInteger(rentTypeAttrColumnInfo.finishDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$finishDate());
        osObjectBuilder.addString(rentTypeAttrColumnInfo.stateNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateName());
        osObjectBuilder.addString(rentTypeAttrColumnInfo.stateDisplayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateDisplayName());
        C4752xf2aa007e newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentTypeAttr, newProxyInstance);
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta == null) {
            newProxyInstance.realmSet$stateRenta((StateRenta) null);
        } else {
            StateRenta stateRenta = (StateRenta) map.get(realmGet$stateRenta);
            if (stateRenta != null) {
                newProxyInstance.realmSet$stateRenta(stateRenta);
            } else {
                newProxyInstance.realmSet$stateRenta(C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), realmGet$stateRenta, z, map, set));
            }
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$propRenta();
        if (realmGet$propRenta == null) {
            newProxyInstance.realmSet$propRenta((PropertyRenta) null);
        } else {
            PropertyRenta propertyRenta = (PropertyRenta) map.get(realmGet$propRenta);
            if (propertyRenta != null) {
                newProxyInstance.realmSet$propRenta(propertyRenta);
            } else {
                newProxyInstance.realmSet$propRenta(C4742xdc63beb7.copyOrUpdate(realm, (C4742xdc63beb7.PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class), realmGet$propRenta, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentTypeAttr rentTypeAttr, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentTypeAttr rentTypeAttr2 = rentTypeAttr;
        Map<RealmModel, Long> map2 = map;
        if (rentTypeAttr2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentTypeAttr2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentTypeAttr.class);
        long nativePtr = table.getNativePtr();
        RentTypeAttrColumnInfo rentTypeAttrColumnInfo = (RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class);
        long j3 = rentTypeAttrColumnInfo.idIndex;
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(rentTypeAttr2, Long.valueOf(j2));
        Integer realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$startDate();
        if (realmGet$startDate != null) {
            Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.startDateIndex, j2, realmGet$startDate.longValue(), false);
        }
        Integer realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$finishDate();
        if (realmGet$finishDate != null) {
            Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.finishDateIndex, j2, realmGet$finishDate.longValue(), false);
        }
        String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateName();
        if (realmGet$stateName != null) {
            Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateNameIndex, j2, realmGet$stateName, false);
        }
        String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateDisplayName();
        if (realmGet$stateDisplayName != null) {
            Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateDisplayNameIndex, j2, realmGet$stateDisplayName, false);
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta != null) {
            Long l = map2.get(realmGet$stateRenta);
            if (l == null) {
                l = Long.valueOf(C4756x99acf311.insert(realm2, realmGet$stateRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentTypeAttrColumnInfo.stateRentaIndex, j2, l.longValue(), false);
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$propRenta();
        if (realmGet$propRenta != null) {
            Long l2 = map2.get(realmGet$propRenta);
            if (l2 == null) {
                l2 = Long.valueOf(C4742xdc63beb7.insert(realm2, realmGet$propRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentTypeAttrColumnInfo.propRentaIndex, j2, l2.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentTypeAttr.class);
        long nativePtr = table.getNativePtr();
        RentTypeAttrColumnInfo rentTypeAttrColumnInfo = (RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class);
        long j3 = rentTypeAttrColumnInfo.idIndex;
        while (it.hasNext()) {
            RentTypeAttr rentTypeAttr = (RentTypeAttr) it.next();
            if (!map2.containsKey(rentTypeAttr)) {
                if (rentTypeAttr instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentTypeAttr;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentTypeAttr, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(rentTypeAttr, Long.valueOf(j4));
                Integer realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$startDate();
                if (realmGet$startDate != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.startDateIndex, j4, realmGet$startDate.longValue(), false);
                } else {
                    j2 = j3;
                }
                Integer realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$finishDate();
                if (realmGet$finishDate != null) {
                    Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.finishDateIndex, j4, realmGet$finishDate.longValue(), false);
                }
                String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateName();
                if (realmGet$stateName != null) {
                    Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateNameIndex, j4, realmGet$stateName, false);
                }
                String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateDisplayName();
                if (realmGet$stateDisplayName != null) {
                    Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateDisplayNameIndex, j4, realmGet$stateDisplayName, false);
                }
                StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateRenta();
                if (realmGet$stateRenta != null) {
                    Long l = map2.get(realmGet$stateRenta);
                    if (l == null) {
                        l = Long.valueOf(C4756x99acf311.insert(realm2, realmGet$stateRenta, map2));
                    }
                    table.setLink(rentTypeAttrColumnInfo.stateRentaIndex, j4, l.longValue(), false);
                }
                PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$propRenta();
                if (realmGet$propRenta != null) {
                    Long l2 = map2.get(realmGet$propRenta);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4742xdc63beb7.insert(realm2, realmGet$propRenta, map2));
                    }
                    table.setLink(rentTypeAttrColumnInfo.propRentaIndex, j4, l2.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentTypeAttr rentTypeAttr, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        RentTypeAttr rentTypeAttr2 = rentTypeAttr;
        Map<RealmModel, Long> map2 = map;
        if (rentTypeAttr2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentTypeAttr2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentTypeAttr.class);
        long nativePtr = table.getNativePtr();
        RentTypeAttrColumnInfo rentTypeAttrColumnInfo = (RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class);
        long j2 = rentTypeAttrColumnInfo.idIndex;
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr2;
        if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id()) : j;
        map2.put(rentTypeAttr2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$startDate();
        if (realmGet$startDate != null) {
            Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.startDateIndex, createRowWithPrimaryKey, realmGet$startDate.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.startDateIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$finishDate();
        if (realmGet$finishDate != null) {
            Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.finishDateIndex, createRowWithPrimaryKey, realmGet$finishDate.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.finishDateIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateName();
        if (realmGet$stateName != null) {
            Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateNameIndex, createRowWithPrimaryKey, realmGet$stateName, false);
        } else {
            Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.stateNameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateDisplayName();
        if (realmGet$stateDisplayName != null) {
            Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateDisplayNameIndex, createRowWithPrimaryKey, realmGet$stateDisplayName, false);
        } else {
            Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.stateDisplayNameIndex, createRowWithPrimaryKey, false);
        }
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateRenta();
        if (realmGet$stateRenta != null) {
            Long l = map2.get(realmGet$stateRenta);
            if (l == null) {
                l = Long.valueOf(C4756x99acf311.insertOrUpdate(realm2, realmGet$stateRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentTypeAttrColumnInfo.stateRentaIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentTypeAttrColumnInfo.stateRentaIndex, createRowWithPrimaryKey);
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$propRenta();
        if (realmGet$propRenta != null) {
            Long l2 = map2.get(realmGet$propRenta);
            if (l2 == null) {
                l2 = Long.valueOf(C4742xdc63beb7.insertOrUpdate(realm2, realmGet$propRenta, map2));
            }
            Table.nativeSetLink(nativePtr, rentTypeAttrColumnInfo.propRentaIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentTypeAttrColumnInfo.propRentaIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentTypeAttr.class);
        long nativePtr = table.getNativePtr();
        RentTypeAttrColumnInfo rentTypeAttrColumnInfo = (RentTypeAttrColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentTypeAttr.class);
        long j3 = rentTypeAttrColumnInfo.idIndex;
        while (it.hasNext()) {
            RentTypeAttr rentTypeAttr = (RentTypeAttr) it.next();
            if (!map2.containsKey(rentTypeAttr)) {
                if (rentTypeAttr instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentTypeAttr;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentTypeAttr, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr;
                if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(rentTypeAttr, Long.valueOf(j4));
                Integer realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$startDate();
                if (realmGet$startDate != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.startDateIndex, j4, realmGet$startDate.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.startDateIndex, j4, false);
                }
                Integer realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$finishDate();
                if (realmGet$finishDate != null) {
                    Table.nativeSetLong(nativePtr, rentTypeAttrColumnInfo.finishDateIndex, j4, realmGet$finishDate.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.finishDateIndex, j4, false);
                }
                String realmGet$stateName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateName();
                if (realmGet$stateName != null) {
                    Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateNameIndex, j4, realmGet$stateName, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.stateNameIndex, j4, false);
                }
                String realmGet$stateDisplayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateDisplayName();
                if (realmGet$stateDisplayName != null) {
                    Table.nativeSetString(nativePtr, rentTypeAttrColumnInfo.stateDisplayNameIndex, j4, realmGet$stateDisplayName, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentTypeAttrColumnInfo.stateDisplayNameIndex, j4, false);
                }
                StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$stateRenta();
                if (realmGet$stateRenta != null) {
                    Long l = map2.get(realmGet$stateRenta);
                    if (l == null) {
                        l = Long.valueOf(C4756x99acf311.insertOrUpdate(realm2, realmGet$stateRenta, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentTypeAttrColumnInfo.stateRentaIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentTypeAttrColumnInfo.stateRentaIndex, j4);
                }
                PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmGet$propRenta();
                if (realmGet$propRenta != null) {
                    Long l2 = map2.get(realmGet$propRenta);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4742xdc63beb7.insertOrUpdate(realm2, realmGet$propRenta, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentTypeAttrColumnInfo.propRentaIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentTypeAttrColumnInfo.propRentaIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static RentTypeAttr createDetachedCopy(RentTypeAttr rentTypeAttr, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentTypeAttr rentTypeAttr2;
        if (i > i2 || rentTypeAttr == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentTypeAttr);
        if (cacheData == null) {
            rentTypeAttr2 = new RentTypeAttr();
            map.put(rentTypeAttr, new RealmObjectProxy.CacheData(i, rentTypeAttr2));
        } else if (i >= cacheData.minDepth) {
            return (RentTypeAttr) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentTypeAttr2 = (RentTypeAttr) cacheData.object;
        }
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr2;
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2 = rentTypeAttr;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$startDate(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$startDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$finishDate(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$finishDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$stateName());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateDisplayName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$stateDisplayName());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$stateRenta(C4756x99acf311.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$stateRenta(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface.realmSet$propRenta(C4742xdc63beb7.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$propRenta(), i3, i2, map));
        return rentTypeAttr2;
    }

    static RentTypeAttr update(Realm realm, RentTypeAttrColumnInfo rentTypeAttrColumnInfo, RentTypeAttr rentTypeAttr, RentTypeAttr rentTypeAttr2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface = rentTypeAttr;
        C4753x3e233a5b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2 = rentTypeAttr2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentTypeAttr.class), rentTypeAttrColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentTypeAttrColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(rentTypeAttrColumnInfo.startDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$startDate());
        osObjectBuilder.addInteger(rentTypeAttrColumnInfo.finishDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$finishDate());
        osObjectBuilder.addString(rentTypeAttrColumnInfo.stateNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$stateName());
        osObjectBuilder.addString(rentTypeAttrColumnInfo.stateDisplayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$stateDisplayName());
        StateRenta realmGet$stateRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$stateRenta();
        if (realmGet$stateRenta == null) {
            osObjectBuilder.addNull(rentTypeAttrColumnInfo.stateRentaIndex);
        } else {
            StateRenta stateRenta = (StateRenta) map.get(realmGet$stateRenta);
            if (stateRenta != null) {
                osObjectBuilder.addObject(rentTypeAttrColumnInfo.stateRentaIndex, stateRenta);
            } else {
                osObjectBuilder.addObject(rentTypeAttrColumnInfo.stateRentaIndex, C4756x99acf311.copyOrUpdate(realm, (C4756x99acf311.StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), realmGet$stateRenta, true, map, set));
            }
        }
        PropertyRenta realmGet$propRenta = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxyinterface2.realmGet$propRenta();
        if (realmGet$propRenta == null) {
            osObjectBuilder.addNull(rentTypeAttrColumnInfo.propRentaIndex);
        } else {
            PropertyRenta propertyRenta = (PropertyRenta) map.get(realmGet$propRenta);
            if (propertyRenta != null) {
                osObjectBuilder.addObject(rentTypeAttrColumnInfo.propRentaIndex, propertyRenta);
            } else {
                osObjectBuilder.addObject(rentTypeAttrColumnInfo.propRentaIndex, C4742xdc63beb7.copyOrUpdate(realm, (C4742xdc63beb7.PropertyRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PropertyRenta.class), realmGet$propRenta, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return rentTypeAttr;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentTypeAttr = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{startDate:");
        sb.append(realmGet$startDate() != null ? realmGet$startDate() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{finishDate:");
        sb.append(realmGet$finishDate() != null ? realmGet$finishDate() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{stateName:");
        sb.append(realmGet$stateName() != null ? realmGet$stateName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{stateDisplayName:");
        sb.append(realmGet$stateDisplayName() != null ? realmGet$stateDisplayName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{stateRenta:");
        sb.append(realmGet$stateRenta() != null ? C4756x99acf311.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{propRenta:");
        if (realmGet$propRenta() != null) {
            str = C4742xdc63beb7.ClassNameHelper.INTERNAL_CLASS_NAME;
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long index = this.proxyState.getRow$realm().getIndex();
        int i = 0;
        int hashCode = (527 + (path != null ? path.hashCode() : 0)) * 31;
        if (name != null) {
            i = name.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4752xf2aa007e ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxy = (C4752xf2aa007e) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_renttypeattrrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
