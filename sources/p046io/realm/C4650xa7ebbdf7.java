package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy */
public class C4650xa7ebbdf7 extends Intellect implements RealmObjectProxy, C4651x913c9502 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private IntellectColumnInfo columnInfo;
    private ProxyState<Intellect> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Intellect";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy$IntellectColumnInfo */
    static final class IntellectColumnInfo extends ColumnInfo {
        long idIndex;
        long intellectIndex;
        long maxColumnIndexValue;

        IntellectColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.intellectIndex = addColumnDetails("intellect", "intellect", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        IntellectColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new IntellectColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            IntellectColumnInfo intellectColumnInfo = (IntellectColumnInfo) columnInfo;
            IntellectColumnInfo intellectColumnInfo2 = (IntellectColumnInfo) columnInfo2;
            intellectColumnInfo2.idIndex = intellectColumnInfo.idIndex;
            intellectColumnInfo2.intellectIndex = intellectColumnInfo.intellectIndex;
            intellectColumnInfo2.maxColumnIndexValue = intellectColumnInfo.maxColumnIndexValue;
        }
    }

    C4650xa7ebbdf7() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (IntellectColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$intellect() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.intellectIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.intellectIndex));
    }

    public void realmSet$intellect(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.intellectIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.intellectIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.intellectIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.intellectIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("intellect", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static IntellectColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new IntellectColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r14 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r4 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy$IntellectColumnInfo r3 = (p046io.realm.C4650xa7ebbdf7.IntellectColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r2)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            long r5 = r13.getLong(r2)
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r1
        L_0x0065:
            if (r14 != 0) goto L_0x0098
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x0090
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r14 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy r14 = (p046io.realm.C4650xa7ebbdf7) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r14 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            int r2 = r13.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy r14 = (p046io.realm.C4650xa7ebbdf7) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxyInterface r12 = (p046io.realm.C4651x913c9502) r12
            java.lang.String r0 = "intellect"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b8
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00ad
            r12.realmSet$intellect(r1)
            goto L_0x00b8
        L_0x00ad:
            int r13 = r13.getInt(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.realmSet$intellect(r13)
        L_0x00b8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4650xa7ebbdf7.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect");
    }

    public static Intellect createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Intellect intellect = new Intellect();
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (!nextName.equals("intellect")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmSet$intellect(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmSet$intellect((Integer) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Intellect) realm.copyToRealm(intellect, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4650xa7ebbdf7 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intellect.class), false, Collections.emptyList());
        C4650xa7ebbdf7 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxy = new C4650xa7ebbdf7();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4650xa7ebbdf7.IntellectColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect r1 = (p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect> r2 = p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxyInterface r5 = (p046io.realm.C4651x913c9502) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4650xa7ebbdf7.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_entity_intellect_IntellectRealmProxy$IntellectColumnInfo, ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect");
    }

    public static Intellect copy(Realm realm, IntellectColumnInfo intellectColumnInfo, Intellect intellect, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(intellect);
        if (realmObjectProxy != null) {
            return (Intellect) realmObjectProxy;
        }
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Intellect.class), intellectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(intellectColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(intellectColumnInfo.intellectIndex, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$intellect());
        C4650xa7ebbdf7 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(intellect, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Intellect intellect, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Intellect intellect2 = intellect;
        if (intellect2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intellect2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Realm realm2 = realm;
        Table table = realm.getTable(Intellect.class);
        long nativePtr = table.getNativePtr();
        IntellectColumnInfo intellectColumnInfo = (IntellectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intellect.class);
        long j3 = intellectColumnInfo.idIndex;
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(intellect2, Long.valueOf(j2));
        Integer realmGet$intellect = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$intellect();
        if (realmGet$intellect != null) {
            Table.nativeSetLong(nativePtr, intellectColumnInfo.intellectIndex, j2, realmGet$intellect.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Intellect.class);
        long nativePtr = table.getNativePtr();
        IntellectColumnInfo intellectColumnInfo = (IntellectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intellect.class);
        long j3 = intellectColumnInfo.idIndex;
        while (it.hasNext()) {
            Intellect intellect = (Intellect) it.next();
            if (!map2.containsKey(intellect)) {
                if (intellect instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intellect;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(intellect, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(intellect, Long.valueOf(j4));
                Integer realmGet$intellect = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$intellect();
                if (realmGet$intellect != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, intellectColumnInfo.intellectIndex, j4, realmGet$intellect.longValue(), false);
                } else {
                    j2 = j3;
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Intellect intellect, Map<RealmModel, Long> map) {
        long j;
        Intellect intellect2 = intellect;
        if (intellect2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intellect2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Realm realm2 = realm;
        Table table = realm.getTable(Intellect.class);
        long nativePtr = table.getNativePtr();
        IntellectColumnInfo intellectColumnInfo = (IntellectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intellect.class);
        long j2 = intellectColumnInfo.idIndex;
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect2;
        if (ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id()) : j;
        map.put(intellect, Long.valueOf(createRowWithPrimaryKey));
        Integer realmGet$intellect = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$intellect();
        if (realmGet$intellect != null) {
            Table.nativeSetLong(nativePtr, intellectColumnInfo.intellectIndex, createRowWithPrimaryKey, realmGet$intellect.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, intellectColumnInfo.intellectIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Intellect.class);
        long nativePtr = table.getNativePtr();
        IntellectColumnInfo intellectColumnInfo = (IntellectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intellect.class);
        long j3 = intellectColumnInfo.idIndex;
        while (it.hasNext()) {
            Intellect intellect = (Intellect) it.next();
            if (!map2.containsKey(intellect)) {
                if (intellect instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intellect;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(intellect, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect;
                if (ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(intellect, Long.valueOf(j4));
                Integer realmGet$intellect = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmGet$intellect();
                if (realmGet$intellect != null) {
                    j2 = j3;
                    Table.nativeSetLong(nativePtr, intellectColumnInfo.intellectIndex, j4, realmGet$intellect.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, intellectColumnInfo.intellectIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static Intellect createDetachedCopy(Intellect intellect, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Intellect intellect2;
        if (i > i2 || intellect == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(intellect);
        if (cacheData == null) {
            intellect2 = new Intellect();
            map.put(intellect, new RealmObjectProxy.CacheData(i, intellect2));
        } else if (i >= cacheData.minDepth) {
            return (Intellect) cacheData.object;
        } else {
            cacheData.minDepth = i;
            intellect2 = (Intellect) cacheData.object;
        }
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect2;
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface2 = intellect;
        ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface.realmSet$intellect(ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface2.realmGet$intellect());
        return intellect2;
    }

    static Intellect update(Realm realm, IntellectColumnInfo intellectColumnInfo, Intellect intellect, Intellect intellect2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface = intellect;
        C4651x913c9502 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface2 = intellect2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Intellect.class), intellectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(intellectColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addInteger(intellectColumnInfo.intellectIndex, ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxyinterface2.realmGet$intellect());
        osObjectBuilder.updateExistingObject();
        return intellect;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Intellect = proxy[");
        sb.append("{id:");
        Object obj = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{intellect:");
        if (realmGet$intellect() != null) {
            obj = realmGet$intellect();
        }
        sb.append(obj);
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
        C4650xa7ebbdf7 ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxy = (C4650xa7ebbdf7) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_intellect_intellectrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
