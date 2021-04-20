package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Size;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy */
public class ru_unicorn_ujin_data_realm_SizeRealmProxy extends Size implements RealmObjectProxy, ru_unicorn_ujin_data_realm_SizeRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SizeColumnInfo columnInfo;
    private ProxyState<Size> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Size";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy$SizeColumnInfo */
    static final class SizeColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long xIndex;
        long yIndex;

        SizeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.xIndex = addColumnDetails(MapPoint.JsonFields.f6911x, MapPoint.JsonFields.f6911x, objectSchemaInfo);
            this.yIndex = addColumnDetails(MapPoint.JsonFields.f6912y, MapPoint.JsonFields.f6912y, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SizeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SizeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SizeColumnInfo sizeColumnInfo = (SizeColumnInfo) columnInfo;
            SizeColumnInfo sizeColumnInfo2 = (SizeColumnInfo) columnInfo2;
            sizeColumnInfo2.xIndex = sizeColumnInfo.xIndex;
            sizeColumnInfo2.yIndex = sizeColumnInfo.yIndex;
            sizeColumnInfo2.maxColumnIndexValue = sizeColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_SizeRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SizeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$x() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.xIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.xIndex));
    }

    public void realmSet$x(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.xIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.xIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.xIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.xIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$y() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.yIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.yIndex));
    }

    public void realmSet$y(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.yIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.yIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.yIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.yIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty(MapPoint.JsonFields.f6911x, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty(MapPoint.JsonFields.f6912y, RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SizeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SizeColumnInfo(osSchemaInfo);
    }

    public static Size createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Size size = (Size) realm.createObjectInternal(Size.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size;
        if (jSONObject.has(MapPoint.JsonFields.f6911x)) {
            if (jSONObject.isNull(MapPoint.JsonFields.f6911x)) {
                ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$x((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$x(Integer.valueOf(jSONObject.getInt(MapPoint.JsonFields.f6911x)));
            }
        }
        if (jSONObject.has(MapPoint.JsonFields.f6912y)) {
            if (jSONObject.isNull(MapPoint.JsonFields.f6912y)) {
                ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$y((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$y(Integer.valueOf(jSONObject.getInt(MapPoint.JsonFields.f6912y)));
            }
        }
        return size;
    }

    public static Size createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Size size = new Size();
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(MapPoint.JsonFields.f6911x)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$x(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$x((Integer) null);
                }
            } else if (!nextName.equals(MapPoint.JsonFields.f6912y)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$y(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$y((Integer) null);
            }
        }
        jsonReader.endObject();
        return (Size) realm.copyToRealm(size, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_SizeRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SizeRealmProxy ru_unicorn_ujin_data_realm_sizerealmproxy = new ru_unicorn_ujin_data_realm_SizeRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_sizerealmproxy;
    }

    public static Size copyOrUpdate(Realm realm, SizeColumnInfo sizeColumnInfo, Size size, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (size instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) size;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return size;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(size);
        if (realmObjectProxy2 != null) {
            return (Size) realmObjectProxy2;
        }
        return copy(realm, sizeColumnInfo, size, z, map, set);
    }

    public static Size copy(Realm realm, SizeColumnInfo sizeColumnInfo, Size size, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(size);
        if (realmObjectProxy != null) {
            return (Size) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Size.class), sizeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(sizeColumnInfo.xIndex, ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$x());
        osObjectBuilder.addInteger(sizeColumnInfo.yIndex, ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$y());
        ru_unicorn_ujin_data_realm_SizeRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(size, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Size size, Map<RealmModel, Long> map) {
        Size size2 = size;
        if (size2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) size2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Size.class);
        long nativePtr = table.getNativePtr();
        SizeColumnInfo sizeColumnInfo = (SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class);
        long createRow = OsObject.createRow(table);
        map.put(size2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size2;
        Integer realmGet$x = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$x();
        if (realmGet$x != null) {
            Table.nativeSetLong(nativePtr, sizeColumnInfo.xIndex, createRow, realmGet$x.longValue(), false);
        }
        Integer realmGet$y = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$y();
        if (realmGet$y != null) {
            Table.nativeSetLong(nativePtr, sizeColumnInfo.yIndex, createRow, realmGet$y.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Size.class);
        long nativePtr = table.getNativePtr();
        SizeColumnInfo sizeColumnInfo = (SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class);
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!map2.containsKey(size)) {
                if (size instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) size;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(size, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(size, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size;
                Integer realmGet$x = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$x();
                if (realmGet$x != null) {
                    Table.nativeSetLong(nativePtr, sizeColumnInfo.xIndex, createRow, realmGet$x.longValue(), false);
                }
                Integer realmGet$y = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$y();
                if (realmGet$y != null) {
                    Table.nativeSetLong(nativePtr, sizeColumnInfo.yIndex, createRow, realmGet$y.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Size size, Map<RealmModel, Long> map) {
        Size size2 = size;
        if (size2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) size2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Size.class);
        long nativePtr = table.getNativePtr();
        SizeColumnInfo sizeColumnInfo = (SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class);
        long createRow = OsObject.createRow(table);
        map.put(size2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size2;
        Integer realmGet$x = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$x();
        if (realmGet$x != null) {
            Table.nativeSetLong(nativePtr, sizeColumnInfo.xIndex, createRow, realmGet$x.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, sizeColumnInfo.xIndex, createRow, false);
        }
        Integer realmGet$y = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$y();
        if (realmGet$y != null) {
            Table.nativeSetLong(nativePtr, sizeColumnInfo.yIndex, createRow, realmGet$y.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, sizeColumnInfo.yIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Size.class);
        long nativePtr = table.getNativePtr();
        SizeColumnInfo sizeColumnInfo = (SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class);
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (!map2.containsKey(size)) {
                if (size instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) size;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(size, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(size, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size;
                Integer realmGet$x = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$x();
                if (realmGet$x != null) {
                    Table.nativeSetLong(nativePtr, sizeColumnInfo.xIndex, createRow, realmGet$x.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, sizeColumnInfo.xIndex, createRow, false);
                }
                Integer realmGet$y = ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmGet$y();
                if (realmGet$y != null) {
                    Table.nativeSetLong(nativePtr, sizeColumnInfo.yIndex, createRow, realmGet$y.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, sizeColumnInfo.yIndex, createRow, false);
                }
            }
        }
    }

    public static Size createDetachedCopy(Size size, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Size size2;
        if (i > i2 || size == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(size);
        if (cacheData == null) {
            size2 = new Size();
            map.put(size, new RealmObjectProxy.CacheData(i, size2));
        } else if (i >= cacheData.minDepth) {
            return (Size) cacheData.object;
        } else {
            cacheData.minDepth = i;
            size2 = (Size) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface = size2;
        ru_unicorn_ujin_data_realm_SizeRealmProxyInterface ru_unicorn_ujin_data_realm_sizerealmproxyinterface2 = size;
        ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$x(ru_unicorn_ujin_data_realm_sizerealmproxyinterface2.realmGet$x());
        ru_unicorn_ujin_data_realm_sizerealmproxyinterface.realmSet$y(ru_unicorn_ujin_data_realm_sizerealmproxyinterface2.realmGet$y());
        return size2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Size = proxy[");
        sb.append("{x:");
        Object obj = "null";
        sb.append(realmGet$x() != null ? realmGet$x() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{y:");
        if (realmGet$y() != null) {
            obj = realmGet$y();
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
        ru_unicorn_ujin_data_realm_SizeRealmProxy ru_unicorn_ujin_data_realm_sizerealmproxy = (ru_unicorn_ujin_data_realm_SizeRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_sizerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_sizerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_sizerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
