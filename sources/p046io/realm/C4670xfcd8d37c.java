package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.ReactConst;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p046io.realm.BaseRealm;
import p046io.realm.C4668xcf375a75;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy */
public class C4670xfcd8d37c extends Schemas implements RealmObjectProxy, C4671x675ee51d {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Schema> cabinetRealmList;
    private SchemasColumnInfo columnInfo;
    private RealmList<Schema> guardRealmList;
    private RealmList<Schema> hotkeysRealmList;
    private RealmList<Schema> metaRealmList;
    private ProxyState<Schemas> proxyState;
    private RealmList<Schema> servicesRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Schemas";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy$SchemasColumnInfo */
    static final class SchemasColumnInfo extends ColumnInfo {
        long cabinetIndex;
        long guardIndex;
        long hotkeysIndex;
        long idIndex;
        long maxColumnIndexValue;
        long metaIndex;
        long servicesIndex;

        SchemasColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.guardIndex = addColumnDetails("guard", "guard", objectSchemaInfo);
            this.hotkeysIndex = addColumnDetails("hotkeys", "hotkeys", objectSchemaInfo);
            this.servicesIndex = addColumnDetails(ReactConst.SERVICETAB, ReactConst.SERVICETAB, objectSchemaInfo);
            this.cabinetIndex = addColumnDetails(ReactConst.CABINET, ReactConst.CABINET, objectSchemaInfo);
            this.metaIndex = addColumnDetails("meta", "meta", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SchemasColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SchemasColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SchemasColumnInfo schemasColumnInfo = (SchemasColumnInfo) columnInfo;
            SchemasColumnInfo schemasColumnInfo2 = (SchemasColumnInfo) columnInfo2;
            schemasColumnInfo2.idIndex = schemasColumnInfo.idIndex;
            schemasColumnInfo2.guardIndex = schemasColumnInfo.guardIndex;
            schemasColumnInfo2.hotkeysIndex = schemasColumnInfo.hotkeysIndex;
            schemasColumnInfo2.servicesIndex = schemasColumnInfo.servicesIndex;
            schemasColumnInfo2.cabinetIndex = schemasColumnInfo.cabinetIndex;
            schemasColumnInfo2.metaIndex = schemasColumnInfo.metaIndex;
            schemasColumnInfo2.maxColumnIndexValue = schemasColumnInfo.maxColumnIndexValue;
        }
    }

    C4670xfcd8d37c() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SchemasColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public RealmList<Schema> realmGet$guard() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Schema> realmList = this.guardRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.guardRealmList = new RealmList<>(Schema.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.guardIndex), this.proxyState.getRealm$realm());
        return this.guardRealmList;
    }

    public void realmSet$guard(RealmList<Schema> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("guard")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Schema> realmList2 = new RealmList<>();
                Iterator<Schema> it = realmList.iterator();
                while (it.hasNext()) {
                    Schema next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.guardIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Schema schema = realmList.get(i);
                    this.proxyState.checkValidObject(schema);
                    modelList.addRow(((RealmObjectProxy) schema).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Schema schema2 = realmList.get(i);
            this.proxyState.checkValidObject(schema2);
            modelList.setRow((long) i, ((RealmObjectProxy) schema2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<Schema> realmGet$hotkeys() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Schema> realmList = this.hotkeysRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.hotkeysRealmList = new RealmList<>(Schema.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.hotkeysIndex), this.proxyState.getRealm$realm());
        return this.hotkeysRealmList;
    }

    public void realmSet$hotkeys(RealmList<Schema> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("hotkeys")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Schema> realmList2 = new RealmList<>();
                Iterator<Schema> it = realmList.iterator();
                while (it.hasNext()) {
                    Schema next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.hotkeysIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Schema schema = realmList.get(i);
                    this.proxyState.checkValidObject(schema);
                    modelList.addRow(((RealmObjectProxy) schema).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Schema schema2 = realmList.get(i);
            this.proxyState.checkValidObject(schema2);
            modelList.setRow((long) i, ((RealmObjectProxy) schema2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<Schema> realmGet$services() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Schema> realmList = this.servicesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.servicesRealmList = new RealmList<>(Schema.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.servicesIndex), this.proxyState.getRealm$realm());
        return this.servicesRealmList;
    }

    public void realmSet$services(RealmList<Schema> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains(ReactConst.SERVICETAB)) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Schema> realmList2 = new RealmList<>();
                Iterator<Schema> it = realmList.iterator();
                while (it.hasNext()) {
                    Schema next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.servicesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Schema schema = realmList.get(i);
                    this.proxyState.checkValidObject(schema);
                    modelList.addRow(((RealmObjectProxy) schema).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Schema schema2 = realmList.get(i);
            this.proxyState.checkValidObject(schema2);
            modelList.setRow((long) i, ((RealmObjectProxy) schema2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<Schema> realmGet$cabinet() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Schema> realmList = this.cabinetRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.cabinetRealmList = new RealmList<>(Schema.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.cabinetIndex), this.proxyState.getRealm$realm());
        return this.cabinetRealmList;
    }

    public void realmSet$cabinet(RealmList<Schema> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains(ReactConst.CABINET)) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Schema> realmList2 = new RealmList<>();
                Iterator<Schema> it = realmList.iterator();
                while (it.hasNext()) {
                    Schema next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.cabinetIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Schema schema = realmList.get(i);
                    this.proxyState.checkValidObject(schema);
                    modelList.addRow(((RealmObjectProxy) schema).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Schema schema2 = realmList.get(i);
            this.proxyState.checkValidObject(schema2);
            modelList.setRow((long) i, ((RealmObjectProxy) schema2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<Schema> realmGet$meta() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Schema> realmList = this.metaRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.metaRealmList = new RealmList<>(Schema.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.metaIndex), this.proxyState.getRealm$realm());
        return this.metaRealmList;
    }

    public void realmSet$meta(RealmList<Schema> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("meta")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Schema> realmList2 = new RealmList<>();
                Iterator<Schema> it = realmList.iterator();
                while (it.hasNext()) {
                    Schema next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.metaIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Schema schema = realmList.get(i);
                    this.proxyState.checkValidObject(schema);
                    modelList.addRow(((RealmObjectProxy) schema).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Schema schema2 = realmList.get(i);
            this.proxyState.checkValidObject(schema2);
            modelList.setRow((long) i, ((RealmObjectProxy) schema2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder.addPersistedLinkProperty("guard", RealmFieldType.LIST, C4668xcf375a75.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("hotkeys", RealmFieldType.LIST, C4668xcf375a75.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(ReactConst.SERVICETAB, RealmFieldType.LIST, C4668xcf375a75.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty(ReactConst.CABINET, RealmFieldType.LIST, C4668xcf375a75.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("meta", RealmFieldType.LIST, C4668xcf375a75.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SchemasColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SchemasColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 5
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0063
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r5 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy$SchemasColumnInfo r4 = (p046io.realm.C4670xfcd8d37c.SchemasColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            r7 = -1
            if (r6 != 0) goto L_0x0030
            long r9 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r9)
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x005e }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x005e }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r4 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x005e }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005e }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy     // Catch:{ all -> 0x005e }
            r3.<init>()     // Catch:{ all -> 0x005e }
            r6.clear()
            goto L_0x0064
        L_0x005e:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0063:
            r3 = r2
        L_0x0064:
            java.lang.String r4 = "meta"
            java.lang.String r5 = "cabinet"
            java.lang.String r6 = "services"
            java.lang.String r7 = "hotkeys"
            java.lang.String r8 = "guard"
            if (r3 != 0) goto L_0x00ce
            boolean r3 = r14.has(r8)
            if (r3 == 0) goto L_0x0079
            r0.add(r8)
        L_0x0079:
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x0082
            r0.add(r7)
        L_0x0082:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x008b
            r0.add(r6)
        L_0x008b:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0094
            r0.add(r5)
        L_0x0094:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x009d
            r0.add(r4)
        L_0x009d:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00c6
            boolean r3 = r14.isNull(r1)
            r9 = 1
            if (r3 == 0) goto L_0x00b4
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r1 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy r3 = (p046io.realm.C4670xfcd8d37c) r3
            goto L_0x00ce
        L_0x00b4:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r9, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy r3 = (p046io.realm.C4670xfcd8d37c) r3
            goto L_0x00ce
        L_0x00c6:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00ce:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxyInterface r0 = (p046io.realm.C4671x675ee51d) r0
            boolean r1 = r14.has(r8)
            r9 = 0
            if (r1 == 0) goto L_0x0106
            boolean r1 = r14.isNull(r8)
            if (r1 == 0) goto L_0x00e2
            r0.realmSet$guard(r2)
            goto L_0x0106
        L_0x00e2:
            io.realm.RealmList r1 = r0.realmGet$guard()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r8)
            r8 = 0
        L_0x00ee:
            int r10 = r1.length()
            if (r8 >= r10) goto L_0x0106
            org.json.JSONObject r10 = r1.getJSONObject(r8)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r10 = p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(r13, r10, r15)
            io.realm.RealmList r11 = r0.realmGet$guard()
            r11.add(r10)
            int r8 = r8 + 1
            goto L_0x00ee
        L_0x0106:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x013a
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0116
            r0.realmSet$hotkeys(r2)
            goto L_0x013a
        L_0x0116:
            io.realm.RealmList r1 = r0.realmGet$hotkeys()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r7)
            r7 = 0
        L_0x0122:
            int r8 = r1.length()
            if (r7 >= r8) goto L_0x013a
            org.json.JSONObject r8 = r1.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r8 = p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(r13, r8, r15)
            io.realm.RealmList r10 = r0.realmGet$hotkeys()
            r10.add(r8)
            int r7 = r7 + 1
            goto L_0x0122
        L_0x013a:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x016e
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x014a
            r0.realmSet$services(r2)
            goto L_0x016e
        L_0x014a:
            io.realm.RealmList r1 = r0.realmGet$services()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r6)
            r6 = 0
        L_0x0156:
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x016e
            org.json.JSONObject r7 = r1.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r7 = p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(r13, r7, r15)
            io.realm.RealmList r8 = r0.realmGet$services()
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x0156
        L_0x016e:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x01a2
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x017e
            r0.realmSet$cabinet(r2)
            goto L_0x01a2
        L_0x017e:
            io.realm.RealmList r1 = r0.realmGet$cabinet()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r5)
            r5 = 0
        L_0x018a:
            int r6 = r1.length()
            if (r5 >= r6) goto L_0x01a2
            org.json.JSONObject r6 = r1.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r6 = p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(r13, r6, r15)
            io.realm.RealmList r7 = r0.realmGet$cabinet()
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x018a
        L_0x01a2:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x01d5
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x01b2
            r0.realmSet$meta(r2)
            goto L_0x01d5
        L_0x01b2:
            io.realm.RealmList r1 = r0.realmGet$meta()
            r1.clear()
            org.json.JSONArray r14 = r14.getJSONArray(r4)
        L_0x01bd:
            int r1 = r14.length()
            if (r9 >= r1) goto L_0x01d5
            org.json.JSONObject r1 = r14.getJSONObject(r9)
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r1 = p046io.realm.C4668xcf375a75.createOrUpdateUsingJsonObject(r13, r1, r15)
            io.realm.RealmList r2 = r0.realmGet$meta()
            r2.add(r1)
            int r9 = r9 + 1
            goto L_0x01bd
        L_0x01d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4670xfcd8d37c.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas");
    }

    public static Schemas createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Schemas schemas = new Schemas();
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("guard")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$guard((RealmList<Schema>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$guard(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$guard().add(C4668xcf375a75.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("hotkeys")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$hotkeys((RealmList<Schema>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$hotkeys(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$hotkeys().add(C4668xcf375a75.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals(ReactConst.SERVICETAB)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$services((RealmList<Schema>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$services(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$services().add(C4668xcf375a75.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals(ReactConst.CABINET)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$cabinet((RealmList<Schema>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$cabinet(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$cabinet().add(C4668xcf375a75.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("meta")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$meta((RealmList<Schema>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$meta(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$meta().add(C4668xcf375a75.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Schemas) realm.copyToRealm(schemas, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4670xfcd8d37c newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schemas.class), false, Collections.emptyList());
        C4670xfcd8d37c ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxy = new C4670xfcd8d37c();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4670xfcd8d37c.SchemasColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r1 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas> r2 = p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxyInterface r5 = (p046io.realm.C4671x675ee51d) r5
            int r5 = r5.realmGet$id()
            long r5 = (long) r5
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r0 = 0
            goto L_0x008e
        L_0x006a:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0088 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0088 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0088 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0088 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0088 }
            r0.clear()
            goto L_0x008d
        L_0x0088:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008d:
            r0 = r11
        L_0x008e:
            r3 = r1
            if (r0 == 0) goto L_0x009b
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4670xfcd8d37c.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_SchemasRealmProxy$SchemasColumnInfo, ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas");
    }

    public static Schemas copy(Realm realm, SchemasColumnInfo schemasColumnInfo, Schemas schemas, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        SchemasColumnInfo schemasColumnInfo2 = schemasColumnInfo;
        Schemas schemas2 = schemas;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(schemas2);
        if (realmObjectProxy != null) {
            return (Schemas) realmObjectProxy;
        }
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Schemas.class), schemasColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(schemasColumnInfo2.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()));
        C4670xfcd8d37c newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(schemas2, newProxyInstance);
        RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$guard();
        if (realmGet$guard != null) {
            RealmList<Schema> realmGet$guard2 = newProxyInstance.realmGet$guard();
            realmGet$guard2.clear();
            for (int i = 0; i < realmGet$guard.size(); i++) {
                Schema schema = realmGet$guard.get(i);
                Schema schema2 = (Schema) map2.get(schema);
                if (schema2 != null) {
                    realmGet$guard2.add(schema2);
                } else {
                    realmGet$guard2.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema, z, map, set));
                }
            }
        }
        RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$hotkeys();
        if (realmGet$hotkeys != null) {
            RealmList<Schema> realmGet$hotkeys2 = newProxyInstance.realmGet$hotkeys();
            realmGet$hotkeys2.clear();
            for (int i2 = 0; i2 < realmGet$hotkeys.size(); i2++) {
                Schema schema3 = realmGet$hotkeys.get(i2);
                Schema schema4 = (Schema) map2.get(schema3);
                if (schema4 != null) {
                    realmGet$hotkeys2.add(schema4);
                } else {
                    realmGet$hotkeys2.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema3, z, map, set));
                }
            }
        }
        RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$services();
        if (realmGet$services != null) {
            RealmList<Schema> realmGet$services2 = newProxyInstance.realmGet$services();
            realmGet$services2.clear();
            for (int i3 = 0; i3 < realmGet$services.size(); i3++) {
                Schema schema5 = realmGet$services.get(i3);
                Schema schema6 = (Schema) map2.get(schema5);
                if (schema6 != null) {
                    realmGet$services2.add(schema6);
                } else {
                    realmGet$services2.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema5, z, map, set));
                }
            }
        }
        RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$cabinet();
        if (realmGet$cabinet != null) {
            RealmList<Schema> realmGet$cabinet2 = newProxyInstance.realmGet$cabinet();
            realmGet$cabinet2.clear();
            for (int i4 = 0; i4 < realmGet$cabinet.size(); i4++) {
                Schema schema7 = realmGet$cabinet.get(i4);
                Schema schema8 = (Schema) map2.get(schema7);
                if (schema8 != null) {
                    realmGet$cabinet2.add(schema8);
                } else {
                    realmGet$cabinet2.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema7, z, map, set));
                }
            }
        }
        RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$meta();
        if (realmGet$meta != null) {
            RealmList<Schema> realmGet$meta2 = newProxyInstance.realmGet$meta();
            realmGet$meta2.clear();
            for (int i5 = 0; i5 < realmGet$meta.size(); i5++) {
                Schema schema9 = realmGet$meta.get(i5);
                Schema schema10 = (Schema) map2.get(schema9);
                if (schema10 != null) {
                    realmGet$meta2.add(schema10);
                } else {
                    realmGet$meta2.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema9, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Schemas schemas, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Schemas schemas2 = schemas;
        Map<RealmModel, Long> map2 = map;
        if (schemas2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemas2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Schemas.class);
        long nativePtr = table.getNativePtr();
        SchemasColumnInfo schemasColumnInfo = (SchemasColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schemas.class);
        long j2 = schemasColumnInfo.idIndex;
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map2.put(schemas2, Long.valueOf(j));
        RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$guard();
        if (realmGet$guard != null) {
            OsList osList = new OsList(table.getUncheckedRow(j), schemasColumnInfo.guardIndex);
            Iterator<Schema> it = realmGet$guard.iterator();
            while (it.hasNext()) {
                Schema next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(C4668xcf375a75.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        }
        RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$hotkeys();
        if (realmGet$hotkeys != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.hotkeysIndex);
            Iterator<Schema> it2 = realmGet$hotkeys.iterator();
            while (it2.hasNext()) {
                Schema next2 = it2.next();
                Long l2 = map2.get(next2);
                if (l2 == null) {
                    l2 = Long.valueOf(C4668xcf375a75.insert(realm2, next2, map2));
                }
                osList2.addRow(l2.longValue());
            }
        }
        RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$services();
        if (realmGet$services != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.servicesIndex);
            Iterator<Schema> it3 = realmGet$services.iterator();
            while (it3.hasNext()) {
                Schema next3 = it3.next();
                Long l3 = map2.get(next3);
                if (l3 == null) {
                    l3 = Long.valueOf(C4668xcf375a75.insert(realm2, next3, map2));
                }
                osList3.addRow(l3.longValue());
            }
        }
        RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$cabinet();
        if (realmGet$cabinet != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.cabinetIndex);
            Iterator<Schema> it4 = realmGet$cabinet.iterator();
            while (it4.hasNext()) {
                Schema next4 = it4.next();
                Long l4 = map2.get(next4);
                if (l4 == null) {
                    l4 = Long.valueOf(C4668xcf375a75.insert(realm2, next4, map2));
                }
                osList4.addRow(l4.longValue());
            }
        }
        RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$meta();
        if (realmGet$meta != null) {
            OsList osList5 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.metaIndex);
            Iterator<Schema> it5 = realmGet$meta.iterator();
            while (it5.hasNext()) {
                Schema next5 = it5.next();
                Long l5 = map2.get(next5);
                if (l5 == null) {
                    l5 = Long.valueOf(C4668xcf375a75.insert(realm2, next5, map2));
                }
                osList5.addRow(l5.longValue());
            }
        }
        return j;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Schemas.class);
        long nativePtr = table.getNativePtr();
        SchemasColumnInfo schemasColumnInfo = (SchemasColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schemas.class);
        long j3 = schemasColumnInfo.idIndex;
        while (it.hasNext()) {
            Schemas schemas = (Schemas) it.next();
            if (!map2.containsKey(schemas)) {
                if (schemas instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemas;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(schemas, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map2.put(schemas, Long.valueOf(j));
                RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$guard();
                if (realmGet$guard != null) {
                    j2 = nativePtr;
                    OsList osList = new OsList(table.getUncheckedRow(j), schemasColumnInfo.guardIndex);
                    Iterator<Schema> it2 = realmGet$guard.iterator();
                    while (it2.hasNext()) {
                        Schema next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4668xcf375a75.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j2 = nativePtr;
                }
                RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$hotkeys();
                if (realmGet$hotkeys != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.hotkeysIndex);
                    Iterator<Schema> it3 = realmGet$hotkeys.iterator();
                    while (it3.hasNext()) {
                        Schema next2 = it3.next();
                        Long l2 = map2.get(next2);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4668xcf375a75.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l2.longValue());
                    }
                }
                RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$services();
                if (realmGet$services != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.servicesIndex);
                    Iterator<Schema> it4 = realmGet$services.iterator();
                    while (it4.hasNext()) {
                        Schema next3 = it4.next();
                        Long l3 = map2.get(next3);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4668xcf375a75.insert(realm2, next3, map2));
                        }
                        osList3.addRow(l3.longValue());
                    }
                }
                RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$cabinet();
                if (realmGet$cabinet != null) {
                    OsList osList4 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.cabinetIndex);
                    Iterator<Schema> it5 = realmGet$cabinet.iterator();
                    while (it5.hasNext()) {
                        Schema next4 = it5.next();
                        Long l4 = map2.get(next4);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4668xcf375a75.insert(realm2, next4, map2));
                        }
                        osList4.addRow(l4.longValue());
                    }
                }
                RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$meta();
                if (realmGet$meta != null) {
                    OsList osList5 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.metaIndex);
                    Iterator<Schema> it6 = realmGet$meta.iterator();
                    while (it6.hasNext()) {
                        Schema next5 = it6.next();
                        Long l5 = map2.get(next5);
                        if (l5 == null) {
                            l5 = Long.valueOf(C4668xcf375a75.insert(realm2, next5, map2));
                        }
                        osList5.addRow(l5.longValue());
                    }
                }
                nativePtr = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Schemas schemas, Map<RealmModel, Long> map) {
        long j;
        if (schemas instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemas;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Schemas.class);
        long nativePtr = table.getNativePtr();
        SchemasColumnInfo schemasColumnInfo = (SchemasColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schemas.class);
        long j2 = schemasColumnInfo.idIndex;
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas;
        if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()));
        }
        map.put(schemas, Long.valueOf(j));
        OsList osList = new OsList(table.getUncheckedRow(j), schemasColumnInfo.guardIndex);
        RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$guard();
        if (realmGet$guard == null || ((long) realmGet$guard.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$guard != null) {
                Iterator<Schema> it = realmGet$guard.iterator();
                while (it.hasNext()) {
                    Schema next = it.next();
                    Long l = map.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$guard.size();
            for (int i = 0; i < size; i++) {
                Schema schema = realmGet$guard.get(i);
                Long l2 = map.get(schema);
                if (l2 == null) {
                    l2 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, schema, map));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.hotkeysIndex);
        RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$hotkeys();
        if (realmGet$hotkeys == null || ((long) realmGet$hotkeys.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$hotkeys != null) {
                Iterator<Schema> it2 = realmGet$hotkeys.iterator();
                while (it2.hasNext()) {
                    Schema next2 = it2.next();
                    Long l3 = map.get(next2);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, next2, map));
                    }
                    osList2.addRow(l3.longValue());
                }
            }
        } else {
            int size2 = realmGet$hotkeys.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Schema schema2 = realmGet$hotkeys.get(i2);
                Long l4 = map.get(schema2);
                if (l4 == null) {
                    l4 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, schema2, map));
                }
                osList2.setRow((long) i2, l4.longValue());
            }
        }
        OsList osList3 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.servicesIndex);
        RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$services();
        if (realmGet$services == null || ((long) realmGet$services.size()) != osList3.size()) {
            osList3.removeAll();
            if (realmGet$services != null) {
                Iterator<Schema> it3 = realmGet$services.iterator();
                while (it3.hasNext()) {
                    Schema next3 = it3.next();
                    Long l5 = map.get(next3);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, next3, map));
                    }
                    osList3.addRow(l5.longValue());
                }
            }
        } else {
            int size3 = realmGet$services.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Schema schema3 = realmGet$services.get(i3);
                Long l6 = map.get(schema3);
                if (l6 == null) {
                    l6 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, schema3, map));
                }
                osList3.setRow((long) i3, l6.longValue());
            }
        }
        OsList osList4 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.cabinetIndex);
        RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$cabinet();
        if (realmGet$cabinet == null || ((long) realmGet$cabinet.size()) != osList4.size()) {
            osList4.removeAll();
            if (realmGet$cabinet != null) {
                Iterator<Schema> it4 = realmGet$cabinet.iterator();
                while (it4.hasNext()) {
                    Schema next4 = it4.next();
                    Long l7 = map.get(next4);
                    if (l7 == null) {
                        l7 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, next4, map));
                    }
                    osList4.addRow(l7.longValue());
                }
            }
        } else {
            int size4 = realmGet$cabinet.size();
            for (int i4 = 0; i4 < size4; i4++) {
                Schema schema4 = realmGet$cabinet.get(i4);
                Long l8 = map.get(schema4);
                if (l8 == null) {
                    l8 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, schema4, map));
                }
                osList4.setRow((long) i4, l8.longValue());
            }
        }
        OsList osList5 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.metaIndex);
        RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$meta();
        if (realmGet$meta == null || ((long) realmGet$meta.size()) != osList5.size()) {
            osList5.removeAll();
            if (realmGet$meta != null) {
                Iterator<Schema> it5 = realmGet$meta.iterator();
                while (it5.hasNext()) {
                    Schema next5 = it5.next();
                    Long l9 = map.get(next5);
                    if (l9 == null) {
                        l9 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, next5, map));
                    }
                    osList5.addRow(l9.longValue());
                }
            }
        } else {
            int size5 = realmGet$meta.size();
            for (int i5 = 0; i5 < size5; i5++) {
                Schema schema5 = realmGet$meta.get(i5);
                Long l10 = map.get(schema5);
                if (l10 == null) {
                    l10 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm, schema5, map));
                }
                osList5.setRow((long) i5, l10.longValue());
            }
        }
        return j;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Schemas.class);
        long nativePtr = table.getNativePtr();
        SchemasColumnInfo schemasColumnInfo = (SchemasColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schemas.class);
        long j4 = schemasColumnInfo.idIndex;
        while (it.hasNext()) {
            Schemas schemas = (Schemas) it.next();
            if (!map2.containsKey(schemas)) {
                if (schemas instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) schemas;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(schemas, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j4, (long) ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j4, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$id()));
                }
                map2.put(schemas, Long.valueOf(j));
                OsList osList = new OsList(table.getUncheckedRow(j), schemasColumnInfo.guardIndex);
                RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$guard();
                if (realmGet$guard == null || ((long) realmGet$guard.size()) != osList.size()) {
                    j3 = nativePtr;
                    j2 = j4;
                    osList.removeAll();
                    if (realmGet$guard != null) {
                        Iterator<Schema> it2 = realmGet$guard.iterator();
                        while (it2.hasNext()) {
                            Schema next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$guard.size();
                    int i = 0;
                    while (i < size) {
                        Schema schema = realmGet$guard.get(i);
                        Long l2 = map2.get(schema);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, schema, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        nativePtr = nativePtr;
                        j4 = j4;
                    }
                    j3 = nativePtr;
                    j2 = j4;
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.hotkeysIndex);
                RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$hotkeys();
                if (realmGet$hotkeys == null || ((long) realmGet$hotkeys.size()) != osList2.size()) {
                    osList2.removeAll();
                    if (realmGet$hotkeys != null) {
                        Iterator<Schema> it3 = realmGet$hotkeys.iterator();
                        while (it3.hasNext()) {
                            Schema next2 = it3.next();
                            Long l3 = map2.get(next2);
                            if (l3 == null) {
                                l3 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$hotkeys.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Schema schema2 = realmGet$hotkeys.get(i2);
                        Long l4 = map2.get(schema2);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, schema2, map2));
                        }
                        osList2.setRow((long) i2, l4.longValue());
                    }
                }
                OsList osList3 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.servicesIndex);
                RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$services();
                if (realmGet$services == null || ((long) realmGet$services.size()) != osList3.size()) {
                    osList3.removeAll();
                    if (realmGet$services != null) {
                        Iterator<Schema> it4 = realmGet$services.iterator();
                        while (it4.hasNext()) {
                            Schema next3 = it4.next();
                            Long l5 = map2.get(next3);
                            if (l5 == null) {
                                l5 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, next3, map2));
                            }
                            osList3.addRow(l5.longValue());
                        }
                    }
                } else {
                    int size3 = realmGet$services.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        Schema schema3 = realmGet$services.get(i3);
                        Long l6 = map2.get(schema3);
                        if (l6 == null) {
                            l6 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, schema3, map2));
                        }
                        osList3.setRow((long) i3, l6.longValue());
                    }
                }
                OsList osList4 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.cabinetIndex);
                RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$cabinet();
                if (realmGet$cabinet == null || ((long) realmGet$cabinet.size()) != osList4.size()) {
                    osList4.removeAll();
                    if (realmGet$cabinet != null) {
                        Iterator<Schema> it5 = realmGet$cabinet.iterator();
                        while (it5.hasNext()) {
                            Schema next4 = it5.next();
                            Long l7 = map2.get(next4);
                            if (l7 == null) {
                                l7 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, next4, map2));
                            }
                            osList4.addRow(l7.longValue());
                        }
                    }
                } else {
                    int size4 = realmGet$cabinet.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        Schema schema4 = realmGet$cabinet.get(i4);
                        Long l8 = map2.get(schema4);
                        if (l8 == null) {
                            l8 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, schema4, map2));
                        }
                        osList4.setRow((long) i4, l8.longValue());
                    }
                }
                OsList osList5 = new OsList(table.getUncheckedRow(j), schemasColumnInfo.metaIndex);
                RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmGet$meta();
                if (realmGet$meta == null || ((long) realmGet$meta.size()) != osList5.size()) {
                    osList5.removeAll();
                    if (realmGet$meta != null) {
                        Iterator<Schema> it6 = realmGet$meta.iterator();
                        while (it6.hasNext()) {
                            Schema next5 = it6.next();
                            Long l9 = map2.get(next5);
                            if (l9 == null) {
                                l9 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, next5, map2));
                            }
                            osList5.addRow(l9.longValue());
                        }
                    }
                } else {
                    int size5 = realmGet$meta.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        Schema schema5 = realmGet$meta.get(i5);
                        Long l10 = map2.get(schema5);
                        if (l10 == null) {
                            l10 = Long.valueOf(C4668xcf375a75.insertOrUpdate(realm2, schema5, map2));
                        }
                        osList5.setRow((long) i5, l10.longValue());
                    }
                }
                nativePtr = j3;
                j4 = j2;
            }
        }
    }

    public static Schemas createDetachedCopy(Schemas schemas, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Schemas schemas2;
        if (i > i2 || schemas == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(schemas);
        if (cacheData == null) {
            schemas2 = new Schemas();
            map.put(schemas, new RealmObjectProxy.CacheData(i, schemas2));
        } else if (i >= cacheData.minDepth) {
            return (Schemas) cacheData.object;
        } else {
            cacheData.minDepth = i;
            schemas2 = (Schemas) cacheData.object;
        }
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas2;
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2 = schemas;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$id());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$guard((RealmList<Schema>) null);
        } else {
            RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$guard();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$guard(realmList);
            int i3 = i + 1;
            int size = realmGet$guard.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4668xcf375a75.createDetachedCopy(realmGet$guard.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$hotkeys((RealmList<Schema>) null);
        } else {
            RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$hotkeys();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$hotkeys(realmList2);
            int i5 = i + 1;
            int size2 = realmGet$hotkeys.size();
            for (int i6 = 0; i6 < size2; i6++) {
                realmList2.add(C4668xcf375a75.createDetachedCopy(realmGet$hotkeys.get(i6), i5, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$services((RealmList<Schema>) null);
        } else {
            RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$services();
            RealmList realmList3 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$services(realmList3);
            int i7 = i + 1;
            int size3 = realmGet$services.size();
            for (int i8 = 0; i8 < size3; i8++) {
                realmList3.add(C4668xcf375a75.createDetachedCopy(realmGet$services.get(i8), i7, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$cabinet((RealmList<Schema>) null);
        } else {
            RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$cabinet();
            RealmList realmList4 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$cabinet(realmList4);
            int i9 = i + 1;
            int size4 = realmGet$cabinet.size();
            for (int i10 = 0; i10 < size4; i10++) {
                realmList4.add(C4668xcf375a75.createDetachedCopy(realmGet$cabinet.get(i10), i9, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$meta((RealmList<Schema>) null);
        } else {
            RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$meta();
            RealmList realmList5 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface.realmSet$meta(realmList5);
            int i11 = i + 1;
            int size5 = realmGet$meta.size();
            for (int i12 = 0; i12 < size5; i12++) {
                realmList5.add(C4668xcf375a75.createDetachedCopy(realmGet$meta.get(i12), i11, i2, map));
            }
        }
        return schemas2;
    }

    static Schemas update(Realm realm, SchemasColumnInfo schemasColumnInfo, Schemas schemas, Schemas schemas2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        SchemasColumnInfo schemasColumnInfo2 = schemasColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface = schemas;
        C4671x675ee51d ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2 = schemas2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Schemas.class), schemasColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(schemasColumnInfo2.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$id()));
        RealmList<Schema> realmGet$guard = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$guard();
        if (realmGet$guard != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$guard.size(); i++) {
                Schema schema = realmGet$guard.get(i);
                Schema schema2 = (Schema) map2.get(schema);
                if (schema2 != null) {
                    realmList.add(schema2);
                } else {
                    realmList.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(schemasColumnInfo2.guardIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(schemasColumnInfo2.guardIndex, new RealmList());
        }
        RealmList<Schema> realmGet$hotkeys = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$hotkeys();
        if (realmGet$hotkeys != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$hotkeys.size(); i2++) {
                Schema schema3 = realmGet$hotkeys.get(i2);
                Schema schema4 = (Schema) map2.get(schema3);
                if (schema4 != null) {
                    realmList2.add(schema4);
                } else {
                    realmList2.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema3, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(schemasColumnInfo2.hotkeysIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(schemasColumnInfo2.hotkeysIndex, new RealmList());
        }
        RealmList<Schema> realmGet$services = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$services();
        if (realmGet$services != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$services.size(); i3++) {
                Schema schema5 = realmGet$services.get(i3);
                Schema schema6 = (Schema) map2.get(schema5);
                if (schema6 != null) {
                    realmList3.add(schema6);
                } else {
                    realmList3.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema5, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(schemasColumnInfo2.servicesIndex, realmList3);
        } else {
            osObjectBuilder.addObjectList(schemasColumnInfo2.servicesIndex, new RealmList());
        }
        RealmList<Schema> realmGet$cabinet = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$cabinet();
        if (realmGet$cabinet != null) {
            RealmList realmList4 = new RealmList();
            for (int i4 = 0; i4 < realmGet$cabinet.size(); i4++) {
                Schema schema7 = realmGet$cabinet.get(i4);
                Schema schema8 = (Schema) map2.get(schema7);
                if (schema8 != null) {
                    realmList4.add(schema8);
                } else {
                    realmList4.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema7, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(schemasColumnInfo2.cabinetIndex, realmList4);
        } else {
            osObjectBuilder.addObjectList(schemasColumnInfo2.cabinetIndex, new RealmList());
        }
        RealmList<Schema> realmGet$meta = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxyinterface2.realmGet$meta();
        if (realmGet$meta != null) {
            RealmList realmList5 = new RealmList();
            for (int i5 = 0; i5 < realmGet$meta.size(); i5++) {
                Schema schema9 = realmGet$meta.get(i5);
                Schema schema10 = (Schema) map2.get(schema9);
                if (schema10 != null) {
                    realmList5.add(schema10);
                } else {
                    realmList5.add(C4668xcf375a75.copyOrUpdate(realm, (C4668xcf375a75.SchemaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Schema.class), schema9, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(schemasColumnInfo2.metaIndex, realmList5);
        } else {
            osObjectBuilder.addObjectList(schemasColumnInfo2.metaIndex, new RealmList());
        }
        osObjectBuilder.updateExistingObject();
        return schemas;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Schemas = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{guard:" + "RealmList<Schema>[" + realmGet$guard().size() + "]" + "}" + "," + "{hotkeys:" + "RealmList<Schema>[" + realmGet$hotkeys().size() + "]" + "}" + "," + "{services:" + "RealmList<Schema>[" + realmGet$services().size() + "]" + "}" + "," + "{cabinet:" + "RealmList<Schema>[" + realmGet$cabinet().size() + "]" + "}" + "," + "{meta:" + "RealmList<Schema>[" + realmGet$meta().size() + "]" + "}" + "]";
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
        C4670xfcd8d37c ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxy = (C4670xfcd8d37c) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_schemasrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
