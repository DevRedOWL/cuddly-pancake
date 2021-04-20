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
import p035ru.unicorn.ujin.data.realm.CityTitle;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy */
public class ru_unicorn_ujin_data_realm_CityTitleRealmProxy extends CityTitle implements RealmObjectProxy, ru_unicorn_ujin_data_realm_CityTitleRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CityTitleColumnInfo columnInfo;
    private ProxyState<CityTitle> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CityTitle";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityTitleRealmProxy$CityTitleColumnInfo */
    static final class CityTitleColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;

        CityTitleColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CityTitleColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CityTitleColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CityTitleColumnInfo cityTitleColumnInfo = (CityTitleColumnInfo) columnInfo;
            CityTitleColumnInfo cityTitleColumnInfo2 = (CityTitleColumnInfo) columnInfo2;
            cityTitleColumnInfo2.titleIndex = cityTitleColumnInfo.titleIndex;
            cityTitleColumnInfo2.maxColumnIndexValue = cityTitleColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_CityTitleRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CityTitleColumnInfo) realmObjectContext.getColumnInfo();
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CityTitleColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CityTitleColumnInfo(osSchemaInfo);
    }

    public static CityTitle createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        CityTitle cityTitle = (CityTitle) realm.createObjectInternal(CityTitle.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CityTitleRealmProxyInterface ru_unicorn_ujin_data_realm_citytitlerealmproxyinterface = cityTitle;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_citytitlerealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_citytitlerealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return cityTitle;
    }

    public static CityTitle createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CityTitle cityTitle = new CityTitle();
        ru_unicorn_ujin_data_realm_CityTitleRealmProxyInterface ru_unicorn_ujin_data_realm_citytitlerealmproxyinterface = cityTitle;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_citytitlerealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_citytitlerealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (CityTitle) realm.copyToRealm(cityTitle, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_CityTitleRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityTitle.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CityTitleRealmProxy ru_unicorn_ujin_data_realm_citytitlerealmproxy = new ru_unicorn_ujin_data_realm_CityTitleRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_citytitlerealmproxy;
    }

    public static CityTitle copyOrUpdate(Realm realm, CityTitleColumnInfo cityTitleColumnInfo, CityTitle cityTitle, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (cityTitle instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityTitle;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cityTitle;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cityTitle);
        if (realmObjectProxy2 != null) {
            return (CityTitle) realmObjectProxy2;
        }
        return copy(realm, cityTitleColumnInfo, cityTitle, z, map, set);
    }

    public static CityTitle copy(Realm realm, CityTitleColumnInfo cityTitleColumnInfo, CityTitle cityTitle, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cityTitle);
        if (realmObjectProxy != null) {
            return (CityTitle) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CityTitle.class), cityTitleColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cityTitleColumnInfo.titleIndex, cityTitle.realmGet$title());
        ru_unicorn_ujin_data_realm_CityTitleRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cityTitle, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, CityTitle cityTitle, Map<RealmModel, Long> map) {
        if (cityTitle instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityTitle;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CityTitle.class);
        long nativePtr = table.getNativePtr();
        CityTitleColumnInfo cityTitleColumnInfo = (CityTitleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityTitle.class);
        long createRow = OsObject.createRow(table);
        map.put(cityTitle, Long.valueOf(createRow));
        String realmGet$title = cityTitle.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cityTitleColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CityTitle.class);
        long nativePtr = table.getNativePtr();
        CityTitleColumnInfo cityTitleColumnInfo = (CityTitleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityTitle.class);
        while (it.hasNext()) {
            CityTitle cityTitle = (CityTitle) it.next();
            if (!map.containsKey(cityTitle)) {
                if (cityTitle instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityTitle;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(cityTitle, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(cityTitle, Long.valueOf(createRow));
                String realmGet$title = cityTitle.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, cityTitleColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CityTitle cityTitle, Map<RealmModel, Long> map) {
        if (cityTitle instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityTitle;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CityTitle.class);
        long nativePtr = table.getNativePtr();
        CityTitleColumnInfo cityTitleColumnInfo = (CityTitleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityTitle.class);
        long createRow = OsObject.createRow(table);
        map.put(cityTitle, Long.valueOf(createRow));
        String realmGet$title = cityTitle.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cityTitleColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, cityTitleColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CityTitle.class);
        long nativePtr = table.getNativePtr();
        CityTitleColumnInfo cityTitleColumnInfo = (CityTitleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CityTitle.class);
        while (it.hasNext()) {
            CityTitle cityTitle = (CityTitle) it.next();
            if (!map.containsKey(cityTitle)) {
                if (cityTitle instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cityTitle;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(cityTitle, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(cityTitle, Long.valueOf(createRow));
                String realmGet$title = cityTitle.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, cityTitleColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, cityTitleColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static CityTitle createDetachedCopy(CityTitle cityTitle, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CityTitle cityTitle2;
        if (i > i2 || cityTitle == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cityTitle);
        if (cacheData == null) {
            cityTitle2 = new CityTitle();
            map.put(cityTitle, new RealmObjectProxy.CacheData(i, cityTitle2));
        } else if (i >= cacheData.minDepth) {
            return (CityTitle) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cityTitle2 = (CityTitle) cacheData.object;
        }
        cityTitle2.realmSet$title(cityTitle.realmGet$title());
        return cityTitle2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CityTitle = proxy[");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : "null");
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
        ru_unicorn_ujin_data_realm_CityTitleRealmProxy ru_unicorn_ujin_data_realm_citytitlerealmproxy = (ru_unicorn_ujin_data_realm_CityTitleRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_citytitlerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_citytitlerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_citytitlerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
