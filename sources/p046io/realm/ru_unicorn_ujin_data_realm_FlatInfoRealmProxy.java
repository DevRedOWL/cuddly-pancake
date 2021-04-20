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
import p035ru.unicorn.ujin.data.realm.FlatInfo;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy */
public class ru_unicorn_ujin_data_realm_FlatInfoRealmProxy extends FlatInfo implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FlatInfoColumnInfo columnInfo;
    private ProxyState<FlatInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FlatInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FlatInfoRealmProxy$FlatInfoColumnInfo */
    static final class FlatInfoColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long measureIndex;
        long squareIndex;
        long titleIndex;

        FlatInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.squareIndex = addColumnDetails("square", "square", objectSchemaInfo);
            this.measureIndex = addColumnDetails("measure", "measure", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FlatInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FlatInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FlatInfoColumnInfo flatInfoColumnInfo = (FlatInfoColumnInfo) columnInfo;
            FlatInfoColumnInfo flatInfoColumnInfo2 = (FlatInfoColumnInfo) columnInfo2;
            flatInfoColumnInfo2.titleIndex = flatInfoColumnInfo.titleIndex;
            flatInfoColumnInfo2.squareIndex = flatInfoColumnInfo.squareIndex;
            flatInfoColumnInfo2.measureIndex = flatInfoColumnInfo.measureIndex;
            flatInfoColumnInfo2.maxColumnIndexValue = flatInfoColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FlatInfoRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FlatInfoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$square() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.squareIndex);
    }

    public void realmSet$square(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.squareIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.squareIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.squareIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.squareIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$measure() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.measureIndex);
    }

    public void realmSet$measure(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.measureIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.measureIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.measureIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.measureIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("square", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("measure", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FlatInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FlatInfoColumnInfo(osSchemaInfo);
    }

    public static FlatInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        FlatInfo flatInfo = (FlatInfo) realm.createObjectInternal(FlatInfo.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("square")) {
            if (jSONObject.isNull("square")) {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$square((String) null);
            } else {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$square(jSONObject.getString("square"));
            }
        }
        if (jSONObject.has("measure")) {
            if (jSONObject.isNull("measure")) {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$measure((String) null);
            } else {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$measure(jSONObject.getString("measure"));
            }
        }
        return flatInfo;
    }

    public static FlatInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        FlatInfo flatInfo = new FlatInfo();
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("square")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$square(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$square((String) null);
                }
            } else if (!nextName.equals("measure")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$measure(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$measure((String) null);
            }
        }
        jsonReader.endObject();
        return (FlatInfo) realm.copyToRealm(flatInfo, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_FlatInfoRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxy ru_unicorn_ujin_data_realm_flatinforealmproxy = new ru_unicorn_ujin_data_realm_FlatInfoRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_flatinforealmproxy;
    }

    public static FlatInfo copyOrUpdate(Realm realm, FlatInfoColumnInfo flatInfoColumnInfo, FlatInfo flatInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (flatInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return flatInfo;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(flatInfo);
        if (realmObjectProxy2 != null) {
            return (FlatInfo) realmObjectProxy2;
        }
        return copy(realm, flatInfoColumnInfo, flatInfo, z, map, set);
    }

    public static FlatInfo copy(Realm realm, FlatInfoColumnInfo flatInfoColumnInfo, FlatInfo flatInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(flatInfo);
        if (realmObjectProxy != null) {
            return (FlatInfo) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FlatInfo.class), flatInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(flatInfoColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(flatInfoColumnInfo.squareIndex, ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$square());
        osObjectBuilder.addString(flatInfoColumnInfo.measureIndex, ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$measure());
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(flatInfo, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, FlatInfo flatInfo, Map<RealmModel, Long> map) {
        if (flatInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FlatInfo.class);
        long nativePtr = table.getNativePtr();
        FlatInfoColumnInfo flatInfoColumnInfo = (FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class);
        long createRow = OsObject.createRow(table);
        map.put(flatInfo, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
        String realmGet$title = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, flatInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$square = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$square();
        if (realmGet$square != null) {
            Table.nativeSetString(nativePtr, flatInfoColumnInfo.squareIndex, createRow, realmGet$square, false);
        }
        String realmGet$measure = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, flatInfoColumnInfo.measureIndex, createRow, realmGet$measure, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(FlatInfo.class);
        long nativePtr = table.getNativePtr();
        FlatInfoColumnInfo flatInfoColumnInfo = (FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class);
        while (it.hasNext()) {
            FlatInfo flatInfo = (FlatInfo) it.next();
            if (!map2.containsKey(flatInfo)) {
                if (flatInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(flatInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(flatInfo, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
                String realmGet$title = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, flatInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$square = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$square();
                if (realmGet$square != null) {
                    Table.nativeSetString(nativePtr, flatInfoColumnInfo.squareIndex, createRow, realmGet$square, false);
                }
                String realmGet$measure = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, flatInfoColumnInfo.measureIndex, createRow, realmGet$measure, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, FlatInfo flatInfo, Map<RealmModel, Long> map) {
        if (flatInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FlatInfo.class);
        long nativePtr = table.getNativePtr();
        FlatInfoColumnInfo flatInfoColumnInfo = (FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class);
        long createRow = OsObject.createRow(table);
        map.put(flatInfo, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
        String realmGet$title = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, flatInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, flatInfoColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$square = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$square();
        if (realmGet$square != null) {
            Table.nativeSetString(nativePtr, flatInfoColumnInfo.squareIndex, createRow, realmGet$square, false);
        } else {
            Table.nativeSetNull(nativePtr, flatInfoColumnInfo.squareIndex, createRow, false);
        }
        String realmGet$measure = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, flatInfoColumnInfo.measureIndex, createRow, realmGet$measure, false);
        } else {
            Table.nativeSetNull(nativePtr, flatInfoColumnInfo.measureIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(FlatInfo.class);
        long nativePtr = table.getNativePtr();
        FlatInfoColumnInfo flatInfoColumnInfo = (FlatInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FlatInfo.class);
        while (it.hasNext()) {
            FlatInfo flatInfo = (FlatInfo) it.next();
            if (!map2.containsKey(flatInfo)) {
                if (flatInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) flatInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(flatInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(flatInfo, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo;
                String realmGet$title = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, flatInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatInfoColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$square = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$square();
                if (realmGet$square != null) {
                    Table.nativeSetString(nativePtr, flatInfoColumnInfo.squareIndex, createRow, realmGet$square, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatInfoColumnInfo.squareIndex, createRow, false);
                }
                String realmGet$measure = ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, flatInfoColumnInfo.measureIndex, createRow, realmGet$measure, false);
                } else {
                    Table.nativeSetNull(nativePtr, flatInfoColumnInfo.measureIndex, createRow, false);
                }
            }
        }
    }

    public static FlatInfo createDetachedCopy(FlatInfo flatInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        FlatInfo flatInfo2;
        if (i > i2 || flatInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(flatInfo);
        if (cacheData == null) {
            flatInfo2 = new FlatInfo();
            map.put(flatInfo, new RealmObjectProxy.CacheData(i, flatInfo2));
        } else if (i >= cacheData.minDepth) {
            return (FlatInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            flatInfo2 = (FlatInfo) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface = flatInfo2;
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxyInterface ru_unicorn_ujin_data_realm_flatinforealmproxyinterface2 = flatInfo;
        ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_flatinforealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$square(ru_unicorn_ujin_data_realm_flatinforealmproxyinterface2.realmGet$square());
        ru_unicorn_ujin_data_realm_flatinforealmproxyinterface.realmSet$measure(ru_unicorn_ujin_data_realm_flatinforealmproxyinterface2.realmGet$measure());
        return flatInfo2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FlatInfo = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{square:");
        sb.append(realmGet$square() != null ? realmGet$square() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{measure:");
        if (realmGet$measure() != null) {
            str = realmGet$measure();
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
        ru_unicorn_ujin_data_realm_FlatInfoRealmProxy ru_unicorn_ujin_data_realm_flatinforealmproxy = (ru_unicorn_ujin_data_realm_FlatInfoRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_flatinforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_flatinforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_flatinforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
