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
import p035ru.unicorn.ujin.data.realm.Coordinates;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy */
public class ru_unicorn_ujin_data_realm_CoordinatesRealmProxy extends Coordinates implements RealmObjectProxy, ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CoordinatesColumnInfo columnInfo;
    private ProxyState<Coordinates> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Coordinates";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy$CoordinatesColumnInfo */
    static final class CoordinatesColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long xIndex;
        long yIndex;

        CoordinatesColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.xIndex = addColumnDetails(MapPoint.JsonFields.f6911x, MapPoint.JsonFields.f6911x, objectSchemaInfo);
            this.yIndex = addColumnDetails(MapPoint.JsonFields.f6912y, MapPoint.JsonFields.f6912y, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CoordinatesColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CoordinatesColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CoordinatesColumnInfo coordinatesColumnInfo = (CoordinatesColumnInfo) columnInfo;
            CoordinatesColumnInfo coordinatesColumnInfo2 = (CoordinatesColumnInfo) columnInfo2;
            coordinatesColumnInfo2.xIndex = coordinatesColumnInfo.xIndex;
            coordinatesColumnInfo2.yIndex = coordinatesColumnInfo.yIndex;
            coordinatesColumnInfo2.maxColumnIndexValue = coordinatesColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_CoordinatesRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CoordinatesColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Double realmGet$x() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.xIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.xIndex));
    }

    public void realmSet$x(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.xIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.xIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.xIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.xIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public Double realmGet$y() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.yIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.yIndex));
    }

    public void realmSet$y(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.yIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.yIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.yIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.yIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty(MapPoint.JsonFields.f6911x, RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty(MapPoint.JsonFields.f6912y, RealmFieldType.DOUBLE, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CoordinatesColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CoordinatesColumnInfo(osSchemaInfo);
    }

    public static Coordinates createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Coordinates coordinates = (Coordinates) realm.createObjectInternal(Coordinates.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates;
        if (jSONObject.has(MapPoint.JsonFields.f6911x)) {
            if (jSONObject.isNull(MapPoint.JsonFields.f6911x)) {
                ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$x((Double) null);
            } else {
                ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$x(Double.valueOf(jSONObject.getDouble(MapPoint.JsonFields.f6911x)));
            }
        }
        if (jSONObject.has(MapPoint.JsonFields.f6912y)) {
            if (jSONObject.isNull(MapPoint.JsonFields.f6912y)) {
                ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$y((Double) null);
            } else {
                ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$y(Double.valueOf(jSONObject.getDouble(MapPoint.JsonFields.f6912y)));
            }
        }
        return coordinates;
    }

    public static Coordinates createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Coordinates coordinates = new Coordinates();
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(MapPoint.JsonFields.f6911x)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$x(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$x((Double) null);
                }
            } else if (!nextName.equals(MapPoint.JsonFields.f6912y)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$y(Double.valueOf(jsonReader.nextDouble()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$y((Double) null);
            }
        }
        jsonReader.endObject();
        return (Coordinates) realm.copyToRealm(coordinates, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_CoordinatesRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxy ru_unicorn_ujin_data_realm_coordinatesrealmproxy = new ru_unicorn_ujin_data_realm_CoordinatesRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_coordinatesrealmproxy;
    }

    public static Coordinates copyOrUpdate(Realm realm, CoordinatesColumnInfo coordinatesColumnInfo, Coordinates coordinates, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (coordinates instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coordinates;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return coordinates;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(coordinates);
        if (realmObjectProxy2 != null) {
            return (Coordinates) realmObjectProxy2;
        }
        return copy(realm, coordinatesColumnInfo, coordinates, z, map, set);
    }

    public static Coordinates copy(Realm realm, CoordinatesColumnInfo coordinatesColumnInfo, Coordinates coordinates, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(coordinates);
        if (realmObjectProxy != null) {
            return (Coordinates) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Coordinates.class), coordinatesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addDouble(coordinatesColumnInfo.xIndex, ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$x());
        osObjectBuilder.addDouble(coordinatesColumnInfo.yIndex, ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$y());
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(coordinates, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Coordinates coordinates, Map<RealmModel, Long> map) {
        Coordinates coordinates2 = coordinates;
        if (coordinates2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coordinates2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Coordinates.class);
        long nativePtr = table.getNativePtr();
        CoordinatesColumnInfo coordinatesColumnInfo = (CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class);
        long createRow = OsObject.createRow(table);
        map.put(coordinates2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates2;
        Double realmGet$x = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$x();
        if (realmGet$x != null) {
            Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.xIndex, createRow, realmGet$x.doubleValue(), false);
        }
        Double realmGet$y = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$y();
        if (realmGet$y != null) {
            Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.yIndex, createRow, realmGet$y.doubleValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Coordinates.class);
        long nativePtr = table.getNativePtr();
        CoordinatesColumnInfo coordinatesColumnInfo = (CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class);
        while (it.hasNext()) {
            Coordinates coordinates = (Coordinates) it.next();
            if (!map2.containsKey(coordinates)) {
                if (coordinates instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coordinates;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(coordinates, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(coordinates, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates;
                Double realmGet$x = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$x();
                if (realmGet$x != null) {
                    Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.xIndex, createRow, realmGet$x.doubleValue(), false);
                }
                Double realmGet$y = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$y();
                if (realmGet$y != null) {
                    Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.yIndex, createRow, realmGet$y.doubleValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Coordinates coordinates, Map<RealmModel, Long> map) {
        Coordinates coordinates2 = coordinates;
        if (coordinates2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coordinates2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Coordinates.class);
        long nativePtr = table.getNativePtr();
        CoordinatesColumnInfo coordinatesColumnInfo = (CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class);
        long createRow = OsObject.createRow(table);
        map.put(coordinates2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates2;
        Double realmGet$x = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$x();
        if (realmGet$x != null) {
            Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.xIndex, createRow, realmGet$x.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, coordinatesColumnInfo.xIndex, createRow, false);
        }
        Double realmGet$y = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$y();
        if (realmGet$y != null) {
            Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.yIndex, createRow, realmGet$y.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, coordinatesColumnInfo.yIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Coordinates.class);
        long nativePtr = table.getNativePtr();
        CoordinatesColumnInfo coordinatesColumnInfo = (CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class);
        while (it.hasNext()) {
            Coordinates coordinates = (Coordinates) it.next();
            if (!map2.containsKey(coordinates)) {
                if (coordinates instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coordinates;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(coordinates, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(coordinates, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates;
                Double realmGet$x = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$x();
                if (realmGet$x != null) {
                    Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.xIndex, createRow, realmGet$x.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, coordinatesColumnInfo.xIndex, createRow, false);
                }
                Double realmGet$y = ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmGet$y();
                if (realmGet$y != null) {
                    Table.nativeSetDouble(nativePtr, coordinatesColumnInfo.yIndex, createRow, realmGet$y.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, coordinatesColumnInfo.yIndex, createRow, false);
                }
            }
        }
    }

    public static Coordinates createDetachedCopy(Coordinates coordinates, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Coordinates coordinates2;
        if (i > i2 || coordinates == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(coordinates);
        if (cacheData == null) {
            coordinates2 = new Coordinates();
            map.put(coordinates, new RealmObjectProxy.CacheData(i, coordinates2));
        } else if (i >= cacheData.minDepth) {
            return (Coordinates) cacheData.object;
        } else {
            cacheData.minDepth = i;
            coordinates2 = (Coordinates) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface = coordinates2;
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxyInterface ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface2 = coordinates;
        ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$x(ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface2.realmGet$x());
        ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface.realmSet$y(ru_unicorn_ujin_data_realm_coordinatesrealmproxyinterface2.realmGet$y());
        return coordinates2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Coordinates = proxy[");
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
        ru_unicorn_ujin_data_realm_CoordinatesRealmProxy ru_unicorn_ujin_data_realm_coordinatesrealmproxy = (ru_unicorn_ujin_data_realm_CoordinatesRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_coordinatesrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_coordinatesrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_coordinatesrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
