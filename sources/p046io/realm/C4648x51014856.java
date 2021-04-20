package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy */
public class C4648x51014856 extends RoomInfo implements RealmObjectProxy, C4649x8e034583 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RoomInfoColumnInfo columnInfo;
    private ProxyState<RoomInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RoomInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy$RoomInfoColumnInfo */
    static final class RoomInfoColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        RoomInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RoomInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RoomInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RoomInfoColumnInfo roomInfoColumnInfo = (RoomInfoColumnInfo) columnInfo;
            RoomInfoColumnInfo roomInfoColumnInfo2 = (RoomInfoColumnInfo) columnInfo2;
            roomInfoColumnInfo2.idIndex = roomInfoColumnInfo.idIndex;
            roomInfoColumnInfo2.titleIndex = roomInfoColumnInfo.titleIndex;
            roomInfoColumnInfo2.maxColumnIndexValue = roomInfoColumnInfo.maxColumnIndexValue;
        }
    }

    C4648x51014856() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RoomInfoColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RoomInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RoomInfoColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r14 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r4 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy$RoomInfoColumnInfo r3 = (p046io.realm.C4648x51014856.RoomInfoColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r14 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy r14 = (p046io.realm.C4648x51014856) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r14 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            int r2 = r13.getInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy r14 = (p046io.realm.C4648x51014856) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxyInterface r12 = (p046io.realm.C4649x8e034583) r12
            java.lang.String r0 = "title"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b4
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00ad
            r12.realmSet$title(r1)
            goto L_0x00b4
        L_0x00ad:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$title(r13)
        L_0x00b4:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4648x51014856.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo");
    }

    public static RoomInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RoomInfo roomInfo = new RoomInfo();
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RoomInfo) realm.copyToRealm(roomInfo, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4648x51014856 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class), false, Collections.emptyList());
        C4648x51014856 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxy = new C4648x51014856();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4648x51014856.RoomInfoColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r1 = (p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo> r2 = p035ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxyInterface r5 = (p046io.realm.C4649x8e034583) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4648x51014856.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_entity_hardware_RoomInfoRealmProxy$RoomInfoColumnInfo, ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.entity.hardware.RoomInfo");
    }

    public static RoomInfo copy(Realm realm, RoomInfoColumnInfo roomInfoColumnInfo, RoomInfo roomInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(roomInfo);
        if (realmObjectProxy != null) {
            return (RoomInfo) realmObjectProxy;
        }
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RoomInfo.class), roomInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(roomInfoColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(roomInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$title());
        C4648x51014856 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(roomInfo, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RoomInfo roomInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        if (roomInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) roomInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RoomInfo.class);
        long nativePtr = table.getNativePtr();
        RoomInfoColumnInfo roomInfoColumnInfo = (RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class);
        long j3 = roomInfoColumnInfo.idIndex;
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(roomInfo, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, roomInfoColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RoomInfo.class);
        long nativePtr = table.getNativePtr();
        RoomInfoColumnInfo roomInfoColumnInfo = (RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class);
        long j2 = roomInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            RoomInfo roomInfo = (RoomInfo) it.next();
            if (!map2.containsKey(roomInfo)) {
                if (roomInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) roomInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(roomInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j3 = j;
                map2.put(roomInfo, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, roomInfoColumnInfo.titleIndex, j3, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RoomInfo roomInfo, Map<RealmModel, Long> map) {
        long j;
        if (roomInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) roomInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RoomInfo.class);
        long nativePtr = table.getNativePtr();
        RoomInfoColumnInfo roomInfoColumnInfo = (RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class);
        long j2 = roomInfoColumnInfo.idIndex;
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
        if (ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id()) : j;
        map.put(roomInfo, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, roomInfoColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, roomInfoColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RoomInfo.class);
        long nativePtr = table.getNativePtr();
        RoomInfoColumnInfo roomInfoColumnInfo = (RoomInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RoomInfo.class);
        long j2 = roomInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            RoomInfo roomInfo = (RoomInfo) it.next();
            if (!map2.containsKey(roomInfo)) {
                if (roomInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) roomInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(roomInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
                if (ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$id());
                }
                long j3 = j;
                map2.put(roomInfo, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, roomInfoColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, roomInfoColumnInfo.titleIndex, j3, false);
                }
            }
        }
    }

    public static RoomInfo createDetachedCopy(RoomInfo roomInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RoomInfo roomInfo2;
        if (i > i2 || roomInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(roomInfo);
        if (cacheData == null) {
            roomInfo2 = new RoomInfo();
            map.put(roomInfo, new RealmObjectProxy.CacheData(i, roomInfo2));
        } else if (i >= cacheData.minDepth) {
            return (RoomInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            roomInfo2 = (RoomInfo) cacheData.object;
        }
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo2;
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface2 = roomInfo;
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface2.realmGet$title());
        return roomInfo2;
    }

    static RoomInfo update(Realm realm, RoomInfoColumnInfo roomInfoColumnInfo, RoomInfo roomInfo, RoomInfo roomInfo2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface = roomInfo;
        C4649x8e034583 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface2 = roomInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RoomInfo.class), roomInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(roomInfoColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(roomInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxyinterface2.realmGet$title());
        osObjectBuilder.updateExistingObject();
        return roomInfo;
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
        C4648x51014856 ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxy = (C4648x51014856) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_hardware_roominforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
