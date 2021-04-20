package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy */
public class C4772xa5d8f71d extends Renters implements RealmObjectProxy, C4773x8b06469c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentersColumnInfo columnInfo;
    private ProxyState<Renters> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Renters";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy$RentersColumnInfo */
    static final class RentersColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long rentIdIndex;
        long roleIdIndex;
        long userdataIdIndex;

        RentersColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.rentIdIndex = addColumnDetails("rentId", "rentId", objectSchemaInfo);
            this.userdataIdIndex = addColumnDetails("userdataId", "userdataId", objectSchemaInfo);
            this.roleIdIndex = addColumnDetails("roleId", "roleId", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentersColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentersColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentersColumnInfo rentersColumnInfo = (RentersColumnInfo) columnInfo;
            RentersColumnInfo rentersColumnInfo2 = (RentersColumnInfo) columnInfo2;
            rentersColumnInfo2.idIndex = rentersColumnInfo.idIndex;
            rentersColumnInfo2.rentIdIndex = rentersColumnInfo.rentIdIndex;
            rentersColumnInfo2.userdataIdIndex = rentersColumnInfo.userdataIdIndex;
            rentersColumnInfo2.roleIdIndex = rentersColumnInfo.roleIdIndex;
            rentersColumnInfo2.maxColumnIndexValue = rentersColumnInfo.maxColumnIndexValue;
        }
    }

    C4772xa5d8f71d() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentersColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$rentId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.rentIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.rentIdIndex));
    }

    public void realmSet$rentId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rentIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.rentIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.rentIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.rentIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$userdataId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.userdataIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.userdataIdIndex));
    }

    public void realmSet$userdataId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userdataIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.userdataIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.userdataIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.userdataIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$roleId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.roleIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.roleIdIndex));
    }

    public void realmSet$roleId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.roleIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.roleIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.roleIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.roleIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("rentId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("userdataId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("roleId", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentersColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentersColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy$RentersColumnInfo r3 = (p046io.realm.C4772xa5d8f71d.RentersColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy r14 = (p046io.realm.C4772xa5d8f71d) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            int r1 = r13.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy r14 = (p046io.realm.C4772xa5d8f71d) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxyInterface r12 = (p046io.realm.C4773x8b06469c) r12
            java.lang.String r0 = "rentId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b8
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00ad
            r12.realmSet$rentId(r2)
            goto L_0x00b8
        L_0x00ad:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$rentId(r0)
        L_0x00b8:
            java.lang.String r0 = "userdataId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00d6
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00cb
            r12.realmSet$userdataId(r2)
            goto L_0x00d6
        L_0x00cb:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$userdataId(r0)
        L_0x00d6:
            java.lang.String r0 = "roleId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00f3
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00e8
            r12.realmSet$roleId(r2)
            goto L_0x00f3
        L_0x00e8:
            int r13 = r13.getInt(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.realmSet$roleId(r13)
        L_0x00f3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4772xa5d8f71d.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters");
    }

    public static Renters createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Renters renters = new Renters();
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("rentId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$rentId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$rentId((Integer) null);
                }
            } else if (nextName.equals("userdataId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$userdataId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$userdataId((Integer) null);
                }
            } else if (!nextName.equals("roleId")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$roleId(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$roleId((Integer) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Renters) realm.copyToRealm(renters, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4772xa5d8f71d newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class), false, Collections.emptyList());
        C4772xa5d8f71d ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxy = new C4772xa5d8f71d();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4772xa5d8f71d.RentersColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxyInterface r5 = (p046io.realm.C4773x8b06469c) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4772xa5d8f71d.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentersRealmProxy$RentersColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.Renters");
    }

    public static Renters copy(Realm realm, RentersColumnInfo rentersColumnInfo, Renters renters, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(renters);
        if (realmObjectProxy != null) {
            return (Renters) realmObjectProxy;
        }
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Renters.class), rentersColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentersColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(rentersColumnInfo.rentIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$rentId());
        osObjectBuilder.addInteger(rentersColumnInfo.userdataIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$userdataId());
        osObjectBuilder.addInteger(rentersColumnInfo.roleIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$roleId());
        C4772xa5d8f71d newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(renters, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Renters renters, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Renters renters2 = renters;
        if (renters2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) renters2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Renters.class);
        long nativePtr = table.getNativePtr();
        RentersColumnInfo rentersColumnInfo = (RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class);
        long j3 = rentersColumnInfo.idIndex;
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(renters2, Long.valueOf(j2));
        Integer realmGet$rentId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$rentId();
        if (realmGet$rentId != null) {
            Table.nativeSetLong(nativePtr, rentersColumnInfo.rentIdIndex, j2, realmGet$rentId.longValue(), false);
        }
        Integer realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$userdataId();
        if (realmGet$userdataId != null) {
            Table.nativeSetLong(nativePtr, rentersColumnInfo.userdataIdIndex, j2, realmGet$userdataId.longValue(), false);
        }
        Integer realmGet$roleId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$roleId();
        if (realmGet$roleId != null) {
            Table.nativeSetLong(nativePtr, rentersColumnInfo.roleIdIndex, j2, realmGet$roleId.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Renters.class);
        long nativePtr = table.getNativePtr();
        RentersColumnInfo rentersColumnInfo = (RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class);
        long j3 = rentersColumnInfo.idIndex;
        while (it.hasNext()) {
            Renters renters = (Renters) it.next();
            if (!map2.containsKey(renters)) {
                if (renters instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) renters;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(renters, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(renters, Long.valueOf(j4));
                Integer realmGet$rentId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$rentId();
                if (realmGet$rentId != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, rentersColumnInfo.rentIdIndex, j4, realmGet$rentId.longValue(), false);
                } else {
                    j2 = j3;
                }
                Integer realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$userdataId();
                if (realmGet$userdataId != null) {
                    Table.nativeSetLong(nativePtr, rentersColumnInfo.userdataIdIndex, j4, realmGet$userdataId.longValue(), false);
                }
                Integer realmGet$roleId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$roleId();
                if (realmGet$roleId != null) {
                    Table.nativeSetLong(nativePtr, rentersColumnInfo.roleIdIndex, j4, realmGet$roleId.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Renters renters, Map<RealmModel, Long> map) {
        long j;
        Renters renters2 = renters;
        if (renters2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) renters2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Renters.class);
        long nativePtr = table.getNativePtr();
        RentersColumnInfo rentersColumnInfo = (RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class);
        long j2 = rentersColumnInfo.idIndex;
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters2;
        if (ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id()) : j;
        map.put(renters2, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$rentId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$rentId();
        if (realmGet$rentId != null) {
            Table.nativeSetLong(nativePtr, rentersColumnInfo.rentIdIndex, createRowWithPrimaryKey, realmGet$rentId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentersColumnInfo.rentIdIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$userdataId();
        if (realmGet$userdataId != null) {
            Table.nativeSetLong(nativePtr, rentersColumnInfo.userdataIdIndex, createRowWithPrimaryKey, realmGet$userdataId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentersColumnInfo.userdataIdIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$roleId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$roleId();
        if (realmGet$roleId != null) {
            Table.nativeSetLong(nativePtr, rentersColumnInfo.roleIdIndex, createRowWithPrimaryKey, realmGet$roleId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentersColumnInfo.roleIdIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Renters.class);
        long nativePtr = table.getNativePtr();
        RentersColumnInfo rentersColumnInfo = (RentersColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Renters.class);
        long j3 = rentersColumnInfo.idIndex;
        while (it.hasNext()) {
            Renters renters = (Renters) it.next();
            if (!map2.containsKey(renters)) {
                if (renters instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) renters;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(renters, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters;
                if (ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(renters, Long.valueOf(j4));
                Integer realmGet$rentId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$rentId();
                if (realmGet$rentId != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, rentersColumnInfo.rentIdIndex, j4, realmGet$rentId.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, rentersColumnInfo.rentIdIndex, j4, false);
                }
                Integer realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$userdataId();
                if (realmGet$userdataId != null) {
                    Table.nativeSetLong(nativePtr, rentersColumnInfo.userdataIdIndex, j4, realmGet$userdataId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentersColumnInfo.userdataIdIndex, j4, false);
                }
                Integer realmGet$roleId = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmGet$roleId();
                if (realmGet$roleId != null) {
                    Table.nativeSetLong(nativePtr, rentersColumnInfo.roleIdIndex, j4, realmGet$roleId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentersColumnInfo.roleIdIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static Renters createDetachedCopy(Renters renters, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Renters renters2;
        if (i > i2 || renters == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(renters);
        if (cacheData == null) {
            renters2 = new Renters();
            map.put(renters, new RealmObjectProxy.CacheData(i, renters2));
        } else if (i >= cacheData.minDepth) {
            return (Renters) cacheData.object;
        } else {
            cacheData.minDepth = i;
            renters2 = (Renters) cacheData.object;
        }
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters2;
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2 = renters;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$rentId(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$rentId());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$userdataId(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$userdataId());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface.realmSet$roleId(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$roleId());
        return renters2;
    }

    static Renters update(Realm realm, RentersColumnInfo rentersColumnInfo, Renters renters, Renters renters2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface = renters;
        C4773x8b06469c ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2 = renters2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Renters.class), rentersColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentersColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(rentersColumnInfo.rentIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$rentId());
        osObjectBuilder.addInteger(rentersColumnInfo.userdataIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$userdataId());
        osObjectBuilder.addInteger(rentersColumnInfo.roleIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxyinterface2.realmGet$roleId());
        osObjectBuilder.updateExistingObject();
        return renters;
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
        C4772xa5d8f71d ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxy = (C4772xa5d8f71d) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentersrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
