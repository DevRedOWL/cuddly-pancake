package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy */
public class C4756x99acf311 extends StateRenta implements RealmObjectProxy, C4757xc7c7d28 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private StateRentaColumnInfo columnInfo;
    private ProxyState<StateRenta> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "StateRenta";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy$StateRentaColumnInfo */
    static final class StateRentaColumnInfo extends ColumnInfo {
        long createdAtIndex;
        long displayNameIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long updatedAtIndex;

        StateRentaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.displayNameIndex = addColumnDetails("displayName", "displayName", objectSchemaInfo);
            this.createdAtIndex = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtIndex = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        StateRentaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new StateRentaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            StateRentaColumnInfo stateRentaColumnInfo = (StateRentaColumnInfo) columnInfo;
            StateRentaColumnInfo stateRentaColumnInfo2 = (StateRentaColumnInfo) columnInfo2;
            stateRentaColumnInfo2.idIndex = stateRentaColumnInfo.idIndex;
            stateRentaColumnInfo2.nameIndex = stateRentaColumnInfo.nameIndex;
            stateRentaColumnInfo2.displayNameIndex = stateRentaColumnInfo.displayNameIndex;
            stateRentaColumnInfo2.createdAtIndex = stateRentaColumnInfo.createdAtIndex;
            stateRentaColumnInfo2.updatedAtIndex = stateRentaColumnInfo.updatedAtIndex;
            stateRentaColumnInfo2.maxColumnIndexValue = stateRentaColumnInfo.maxColumnIndexValue;
        }
    }

    C4756x99acf311() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (StateRentaColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$displayName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.displayNameIndex);
    }

    public void realmSet$displayName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.displayNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.displayNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.displayNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.displayNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.createdAtIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtIndex));
    }

    public void realmSet$createdAt(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.createdAtIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.createdAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.createdAtIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    public Long realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.updatedAtIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.updatedAtIndex));
    }

    public void realmSet$updatedAt(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (l == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.updatedAtIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.updatedAtIndex, l.longValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (l == null) {
                row$realm.getTable().setNull(this.columnInfo.updatedAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.updatedAtIndex, row$realm.getIndex(), l.longValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("displayName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("createdAt", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("updatedAt", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StateRentaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new StateRentaColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy$StateRentaColumnInfo r3 = (p046io.realm.C4756x99acf311.StateRentaColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            long r5 = r13.getLong(r1)
            long r3 = r14.findFirstLong(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r2
        L_0x0065:
            if (r14 != 0) goto L_0x0098
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x0090
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy r14 = (p046io.realm.C4756x99acf311) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            int r1 = r13.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy r14 = (p046io.realm.C4756x99acf311) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxyInterface r12 = (p046io.realm.C4757xc7c7d28) r12
            java.lang.String r0 = "name"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00ad
            r12.realmSet$name(r2)
            goto L_0x00b4
        L_0x00ad:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$name(r0)
        L_0x00b4:
            java.lang.String r0 = "displayName"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c6
            r12.realmSet$displayName(r2)
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$displayName(r0)
        L_0x00cd:
            java.lang.String r0 = "createdAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ea
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00df
            r12.realmSet$createdAt(r2)
            goto L_0x00ea
        L_0x00df:
            long r0 = r13.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.realmSet$createdAt(r0)
        L_0x00ea:
            java.lang.String r0 = "updatedAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0108
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00fd
            r12.realmSet$updatedAt(r2)
            goto L_0x0108
        L_0x00fd:
            long r0 = r13.getLong(r0)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r12.realmSet$updatedAt(r13)
        L_0x0108:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4756x99acf311.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta");
    }

    public static StateRenta createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        StateRenta stateRenta = new StateRenta();
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("displayName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$displayName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$displayName((String) null);
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$createdAt(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$createdAt((Long) null);
                }
            } else if (!nextName.equals("updatedAt")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$updatedAt(Long.valueOf(jsonReader.nextLong()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$updatedAt((Long) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (StateRenta) realm.copyToRealm(stateRenta, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4756x99acf311 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class), false, Collections.emptyList());
        C4756x99acf311 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxy = new C4756x99acf311();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4756x99acf311.StateRentaColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.StateRenta.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxyInterface r5 = (p046io.realm.C4757xc7c7d28) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4756x99acf311.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_StateRentaRealmProxy$StateRentaColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrenta.StateRenta");
    }

    public static StateRenta copy(Realm realm, StateRentaColumnInfo stateRentaColumnInfo, StateRenta stateRenta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(stateRenta);
        if (realmObjectProxy != null) {
            return (StateRenta) realmObjectProxy;
        }
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(StateRenta.class), stateRentaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(stateRentaColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(stateRentaColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(stateRentaColumnInfo.displayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$displayName());
        osObjectBuilder.addInteger(stateRentaColumnInfo.createdAtIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addInteger(stateRentaColumnInfo.updatedAtIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$updatedAt());
        C4756x99acf311 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(stateRenta, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, StateRenta stateRenta, Map<RealmModel, Long> map) {
        long j;
        long j2;
        StateRenta stateRenta2 = stateRenta;
        if (stateRenta2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) stateRenta2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(StateRenta.class);
        long nativePtr = table.getNativePtr();
        StateRentaColumnInfo stateRentaColumnInfo = (StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class);
        long j3 = stateRentaColumnInfo.idIndex;
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(stateRenta2, Long.valueOf(j2));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, stateRentaColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, stateRentaColumnInfo.displayNameIndex, j2, realmGet$displayName, false);
        }
        Long realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetLong(nativePtr, stateRentaColumnInfo.createdAtIndex, j2, realmGet$createdAt.longValue(), false);
        }
        Long realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetLong(nativePtr, stateRentaColumnInfo.updatedAtIndex, j2, realmGet$updatedAt.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(StateRenta.class);
        long nativePtr = table.getNativePtr();
        StateRentaColumnInfo stateRentaColumnInfo = (StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class);
        long j3 = stateRentaColumnInfo.idIndex;
        while (it.hasNext()) {
            StateRenta stateRenta = (StateRenta) it.next();
            if (!map2.containsKey(stateRenta)) {
                if (stateRenta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) stateRenta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(stateRenta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(stateRenta, Long.valueOf(j4));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, stateRentaColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    j2 = j3;
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, stateRentaColumnInfo.displayNameIndex, j4, realmGet$displayName, false);
                }
                Long realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetLong(nativePtr, stateRentaColumnInfo.createdAtIndex, j4, realmGet$createdAt.longValue(), false);
                }
                Long realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetLong(nativePtr, stateRentaColumnInfo.updatedAtIndex, j4, realmGet$updatedAt.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, StateRenta stateRenta, Map<RealmModel, Long> map) {
        long j;
        StateRenta stateRenta2 = stateRenta;
        if (stateRenta2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) stateRenta2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(StateRenta.class);
        long nativePtr = table.getNativePtr();
        StateRentaColumnInfo stateRentaColumnInfo = (StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class);
        long j2 = stateRentaColumnInfo.idIndex;
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta2;
        if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id()) : j;
        map.put(stateRenta2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, stateRentaColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, stateRentaColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, stateRentaColumnInfo.displayNameIndex, createRowWithPrimaryKey, realmGet$displayName, false);
        } else {
            Table.nativeSetNull(nativePtr, stateRentaColumnInfo.displayNameIndex, createRowWithPrimaryKey, false);
        }
        Long realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetLong(nativePtr, stateRentaColumnInfo.createdAtIndex, createRowWithPrimaryKey, realmGet$createdAt.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, stateRentaColumnInfo.createdAtIndex, createRowWithPrimaryKey, false);
        }
        Long realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetLong(nativePtr, stateRentaColumnInfo.updatedAtIndex, createRowWithPrimaryKey, realmGet$updatedAt.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, stateRentaColumnInfo.updatedAtIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(StateRenta.class);
        long nativePtr = table.getNativePtr();
        StateRentaColumnInfo stateRentaColumnInfo = (StateRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) StateRenta.class);
        long j3 = stateRentaColumnInfo.idIndex;
        while (it.hasNext()) {
            StateRenta stateRenta = (StateRenta) it.next();
            if (!map2.containsKey(stateRenta)) {
                if (stateRenta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) stateRenta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(stateRenta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta;
                if (ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(stateRenta, Long.valueOf(j4));
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, stateRentaColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, stateRentaColumnInfo.nameIndex, j4, false);
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, stateRentaColumnInfo.displayNameIndex, j4, realmGet$displayName, false);
                } else {
                    Table.nativeSetNull(nativePtr, stateRentaColumnInfo.displayNameIndex, j4, false);
                }
                Long realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetLong(nativePtr, stateRentaColumnInfo.createdAtIndex, j4, realmGet$createdAt.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, stateRentaColumnInfo.createdAtIndex, j4, false);
                }
                Long realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetLong(nativePtr, stateRentaColumnInfo.updatedAtIndex, j4, realmGet$updatedAt.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, stateRentaColumnInfo.updatedAtIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static StateRenta createDetachedCopy(StateRenta stateRenta, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        StateRenta stateRenta2;
        if (i > i2 || stateRenta == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(stateRenta);
        if (cacheData == null) {
            stateRenta2 = new StateRenta();
            map.put(stateRenta, new RealmObjectProxy.CacheData(i, stateRenta2));
        } else if (i >= cacheData.minDepth) {
            return (StateRenta) cacheData.object;
        } else {
            cacheData.minDepth = i;
            stateRenta2 = (StateRenta) cacheData.object;
        }
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta2;
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2 = stateRenta;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$displayName(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$displayName());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$createdAt(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$createdAt());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface.realmSet$updatedAt(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$updatedAt());
        return stateRenta2;
    }

    static StateRenta update(Realm realm, StateRentaColumnInfo stateRentaColumnInfo, StateRenta stateRenta, StateRenta stateRenta2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface = stateRenta;
        C4757xc7c7d28 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2 = stateRenta2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(StateRenta.class), stateRentaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(stateRentaColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(stateRentaColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(stateRentaColumnInfo.displayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$displayName());
        osObjectBuilder.addInteger(stateRentaColumnInfo.createdAtIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$createdAt());
        osObjectBuilder.addInteger(stateRentaColumnInfo.updatedAtIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxyinterface2.realmGet$updatedAt());
        osObjectBuilder.updateExistingObject();
        return stateRenta;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StateRenta = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.Integer r1 = r5.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.Integer r1 = r5.realmGet$id()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{name:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$name()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r5.realmGet$name()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{displayName:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$displayName()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.realmGet$displayName()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{createdAt:"
            r0.append(r4)
            java.lang.Long r4 = r5.realmGet$createdAt()
            if (r4 == 0) goto L_0x0079
            java.lang.Long r4 = r5.realmGet$createdAt()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{updatedAt:"
            r0.append(r3)
            java.lang.Long r3 = r5.realmGet$updatedAt()
            if (r3 == 0) goto L_0x0093
            java.lang.Long r2 = r5.realmGet$updatedAt()
        L_0x0093:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4756x99acf311.toString():java.lang.String");
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
        C4756x99acf311 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxy = (C4756x99acf311) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_staterentarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
