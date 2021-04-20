package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.ble.data.AvailablePassType;
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

/* renamed from: io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy */
public class ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy extends AvailablePassType implements RealmObjectProxy, ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AvailablePassTypeColumnInfo columnInfo;
    private ProxyState<AvailablePassType> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AvailablePassType";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy$AvailablePassTypeColumnInfo */
    static final class AvailablePassTypeColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long typeIndex;

        AvailablePassTypeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AvailablePassTypeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AvailablePassTypeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AvailablePassTypeColumnInfo availablePassTypeColumnInfo = (AvailablePassTypeColumnInfo) columnInfo;
            AvailablePassTypeColumnInfo availablePassTypeColumnInfo2 = (AvailablePassTypeColumnInfo) columnInfo2;
            availablePassTypeColumnInfo2.typeIndex = availablePassTypeColumnInfo.typeIndex;
            availablePassTypeColumnInfo2.maxColumnIndexValue = availablePassTypeColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AvailablePassTypeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'type' cannot be changed after object was created.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("type", RealmFieldType.STRING, true, true, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AvailablePassTypeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AvailablePassTypeColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.ble.data.AvailablePassType createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "type"
            if (r14 == 0) goto L_0x0062
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r14 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r4 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy$AvailablePassTypeColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.AvailablePassTypeColumnInfo) r3
            long r3 = r3.typeIndex
            boolean r5 = r13.isNull(r2)
            r6 = -1
            if (r5 != 0) goto L_0x002f
            java.lang.String r5 = r13.getString(r2)
            long r3 = r14.findFirstString(r3, r5)
            goto L_0x0030
        L_0x002f:
            r3 = r6
        L_0x0030:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005d }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005d }
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r3 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005d }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005d }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005d }
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy r14 = new io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy     // Catch:{ all -> 0x005d }
            r14.<init>()     // Catch:{ all -> 0x005d }
            r5.clear()
            goto L_0x0063
        L_0x005d:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0062:
            r14 = r1
        L_0x0063:
            if (r14 != 0) goto L_0x0092
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x008a
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007c
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r13 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r13, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy) r14
            goto L_0x0092
        L_0x007c:
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r14 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            java.lang.String r13 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r13, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy) r14
            goto L_0x0092
        L_0x008a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'type'."
            r12.<init>(r13)
            throw r12
        L_0x0092:
            r12 = r14
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface) r12
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.ble.data.AvailablePassType");
    }

    public static AvailablePassType createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        AvailablePassType availablePassType = new AvailablePassType();
        ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface ru_unicorn_ujin_ble_data_availablepasstyperealmproxyinterface = availablePassType;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_availablepasstyperealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_availablepasstyperealmproxyinterface.realmSet$type((String) null);
                }
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (AvailablePassType) realm.copyToRealm(availablePassType, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'type'.");
    }

    private static ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) AvailablePassType.class), false, Collections.emptyList());
        ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy ru_unicorn_ujin_ble_data_availablepasstyperealmproxy = new ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_ble_data_availablepasstyperealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.ble.data.AvailablePassType copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.AvailablePassTypeColumnInfo r9, p035ru.unicorn.ujin.ble.data.AvailablePassType r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.ble.data.AvailablePassType r1 = (p035ru.unicorn.ujin.ble.data.AvailablePassType) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.ble.data.AvailablePassType> r2 = p035ru.unicorn.ujin.ble.data.AvailablePassType.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.typeIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$type()
            long r3 = r2.findFirstString(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy r1 = new io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.ble.data.AvailablePassType r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.ble.data.AvailablePassType r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy$AvailablePassTypeColumnInfo, ru.unicorn.ujin.ble.data.AvailablePassType, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.ble.data.AvailablePassType");
    }

    public static AvailablePassType copy(Realm realm, AvailablePassTypeColumnInfo availablePassTypeColumnInfo, AvailablePassType availablePassType, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(availablePassType);
        if (realmObjectProxy != null) {
            return (AvailablePassType) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AvailablePassType.class), availablePassTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(availablePassTypeColumnInfo.typeIndex, availablePassType.realmGet$type());
        ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(availablePassType, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, AvailablePassType availablePassType, Map<RealmModel, Long> map) {
        if (availablePassType instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) availablePassType;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AvailablePassType.class);
        long nativePtr = table.getNativePtr();
        long j = ((AvailablePassTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AvailablePassType.class)).typeIndex;
        String realmGet$type = availablePassType.realmGet$type();
        long nativeFindFirstString = realmGet$type != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$type) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, realmGet$type);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$type);
        }
        map.put(availablePassType, Long.valueOf(nativeFindFirstString));
        return nativeFindFirstString;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(AvailablePassType.class);
        long nativePtr = table.getNativePtr();
        long j = ((AvailablePassTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AvailablePassType.class)).typeIndex;
        while (it.hasNext()) {
            AvailablePassType availablePassType = (AvailablePassType) it.next();
            if (!map.containsKey(availablePassType)) {
                if (availablePassType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) availablePassType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(availablePassType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                String realmGet$type = availablePassType.realmGet$type();
                long nativeFindFirstString = realmGet$type != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$type) : -1;
                if (nativeFindFirstString == -1) {
                    nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, realmGet$type);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$type);
                }
                map.put(availablePassType, Long.valueOf(nativeFindFirstString));
            }
        }
    }

    public static long insertOrUpdate(Realm realm, AvailablePassType availablePassType, Map<RealmModel, Long> map) {
        if (availablePassType instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) availablePassType;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AvailablePassType.class);
        long nativePtr = table.getNativePtr();
        long j = ((AvailablePassTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AvailablePassType.class)).typeIndex;
        String realmGet$type = availablePassType.realmGet$type();
        long nativeFindFirstString = realmGet$type != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$type) : -1;
        if (nativeFindFirstString == -1) {
            nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, realmGet$type);
        }
        map.put(availablePassType, Long.valueOf(nativeFindFirstString));
        return nativeFindFirstString;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(AvailablePassType.class);
        long nativePtr = table.getNativePtr();
        long j = ((AvailablePassTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AvailablePassType.class)).typeIndex;
        while (it.hasNext()) {
            AvailablePassType availablePassType = (AvailablePassType) it.next();
            if (!map.containsKey(availablePassType)) {
                if (availablePassType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) availablePassType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(availablePassType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                String realmGet$type = availablePassType.realmGet$type();
                long nativeFindFirstString = realmGet$type != null ? Table.nativeFindFirstString(nativePtr, j, realmGet$type) : -1;
                if (nativeFindFirstString == -1) {
                    nativeFindFirstString = OsObject.createRowWithPrimaryKey(table, j, realmGet$type);
                }
                map.put(availablePassType, Long.valueOf(nativeFindFirstString));
            }
        }
    }

    public static AvailablePassType createDetachedCopy(AvailablePassType availablePassType, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        AvailablePassType availablePassType2;
        if (i > i2 || availablePassType == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(availablePassType);
        if (cacheData == null) {
            availablePassType2 = new AvailablePassType();
            map.put(availablePassType, new RealmObjectProxy.CacheData(i, availablePassType2));
        } else if (i >= cacheData.minDepth) {
            return (AvailablePassType) cacheData.object;
        } else {
            cacheData.minDepth = i;
            availablePassType2 = (AvailablePassType) cacheData.object;
        }
        availablePassType2.realmSet$type(availablePassType.realmGet$type());
        return availablePassType2;
    }

    static AvailablePassType update(Realm realm, AvailablePassTypeColumnInfo availablePassTypeColumnInfo, AvailablePassType availablePassType, AvailablePassType availablePassType2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxyInterface ru_unicorn_ujin_ble_data_availablepasstyperealmproxyinterface = availablePassType;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AvailablePassType.class), availablePassTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(availablePassTypeColumnInfo.typeIndex, availablePassType2.realmGet$type());
        osObjectBuilder.updateExistingObject();
        return availablePassType;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "AvailablePassType = proxy[" + "{type:" + realmGet$type() + "}" + "]";
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
        ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy ru_unicorn_ujin_ble_data_availablepasstyperealmproxy = (ru_unicorn_ujin_ble_data_AvailablePassTypeRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_ble_data_availablepasstyperealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_ble_data_availablepasstyperealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_ble_data_availablepasstyperealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
