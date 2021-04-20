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
import p035ru.unicorn.ujin.data.realm.marketplace.SearchItem;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy extends SearchItem implements RealmObjectProxy, C4624x6f10d768 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SearchItemColumnInfo columnInfo;
    private ProxyState<SearchItem> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SearchItem";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy$SearchItemColumnInfo */
    static final class SearchItemColumnInfo extends ColumnInfo {
        long contentTypeIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long typeIndex;

        SearchItemColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.contentTypeIndex = addColumnDetails("contentType", "contentType", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SearchItemColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SearchItemColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SearchItemColumnInfo searchItemColumnInfo = (SearchItemColumnInfo) columnInfo;
            SearchItemColumnInfo searchItemColumnInfo2 = (SearchItemColumnInfo) columnInfo2;
            searchItemColumnInfo2.idIndex = searchItemColumnInfo.idIndex;
            searchItemColumnInfo2.typeIndex = searchItemColumnInfo.typeIndex;
            searchItemColumnInfo2.titleIndex = searchItemColumnInfo.titleIndex;
            searchItemColumnInfo2.contentTypeIndex = searchItemColumnInfo.contentTypeIndex;
            searchItemColumnInfo2.maxColumnIndexValue = searchItemColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SearchItemColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$contentType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.contentTypeIndex);
    }

    public void realmSet$contentType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.contentTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.contentTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.contentTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.contentTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("contentType", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SearchItemColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SearchItemColumnInfo(osSchemaInfo);
    }

    public static SearchItem createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SearchItem searchItem = (SearchItem) realm.createObjectInternal(SearchItem.class, true, Collections.emptyList());
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("contentType")) {
            if (jSONObject.isNull("contentType")) {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$contentType((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$contentType(jSONObject.getString("contentType"));
            }
        }
        return searchItem;
    }

    public static SearchItem createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SearchItem searchItem = new SearchItem();
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("contentType")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$contentType(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$contentType((String) null);
            }
        }
        jsonReader.endObject();
        return (SearchItem) realm.copyToRealm(searchItem, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchItem.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxy;
    }

    public static SearchItem copyOrUpdate(Realm realm, SearchItemColumnInfo searchItemColumnInfo, SearchItem searchItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (searchItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return searchItem;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(searchItem);
        if (realmObjectProxy2 != null) {
            return (SearchItem) realmObjectProxy2;
        }
        return copy(realm, searchItemColumnInfo, searchItem, z, map, set);
    }

    public static SearchItem copy(Realm realm, SearchItemColumnInfo searchItemColumnInfo, SearchItem searchItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(searchItem);
        if (realmObjectProxy != null) {
            return (SearchItem) realmObjectProxy;
        }
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SearchItem.class), searchItemColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(searchItemColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(searchItemColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(searchItemColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(searchItemColumnInfo.contentTypeIndex, ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$contentType());
        ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(searchItem, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SearchItem searchItem, Map<RealmModel, Long> map) {
        if (searchItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SearchItem.class);
        long nativePtr = table.getNativePtr();
        SearchItemColumnInfo searchItemColumnInfo = (SearchItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchItem.class);
        long createRow = OsObject.createRow(table);
        map.put(searchItem, Long.valueOf(createRow));
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.typeIndex, createRow, realmGet$type, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.contentTypeIndex, createRow, realmGet$contentType, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SearchItem.class);
        long nativePtr = table.getNativePtr();
        SearchItemColumnInfo searchItemColumnInfo = (SearchItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchItem.class);
        while (it.hasNext()) {
            SearchItem searchItem = (SearchItem) it.next();
            if (!map2.containsKey(searchItem)) {
                if (searchItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(searchItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(searchItem, Long.valueOf(createRow));
                C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$contentType();
                if (realmGet$contentType != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.contentTypeIndex, createRow, realmGet$contentType, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SearchItem searchItem, Map<RealmModel, Long> map) {
        if (searchItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SearchItem.class);
        long nativePtr = table.getNativePtr();
        SearchItemColumnInfo searchItemColumnInfo = (SearchItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchItem.class);
        long createRow = OsObject.createRow(table);
        map.put(searchItem, Long.valueOf(createRow));
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, searchItemColumnInfo.idIndex, createRow, false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.typeIndex, createRow, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, searchItemColumnInfo.typeIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, searchItemColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(nativePtr, searchItemColumnInfo.contentTypeIndex, createRow, realmGet$contentType, false);
        } else {
            Table.nativeSetNull(nativePtr, searchItemColumnInfo.contentTypeIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SearchItem.class);
        long nativePtr = table.getNativePtr();
        SearchItemColumnInfo searchItemColumnInfo = (SearchItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchItem.class);
        while (it.hasNext()) {
            SearchItem searchItem = (SearchItem) it.next();
            if (!map2.containsKey(searchItem)) {
                if (searchItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(searchItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(searchItem, Long.valueOf(createRow));
                C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, searchItemColumnInfo.idIndex, createRow, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, searchItemColumnInfo.typeIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, searchItemColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmGet$contentType();
                if (realmGet$contentType != null) {
                    Table.nativeSetString(nativePtr, searchItemColumnInfo.contentTypeIndex, createRow, realmGet$contentType, false);
                } else {
                    Table.nativeSetNull(nativePtr, searchItemColumnInfo.contentTypeIndex, createRow, false);
                }
            }
        }
    }

    public static SearchItem createDetachedCopy(SearchItem searchItem, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SearchItem searchItem2;
        if (i > i2 || searchItem == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(searchItem);
        if (cacheData == null) {
            searchItem2 = new SearchItem();
            map.put(searchItem, new RealmObjectProxy.CacheData(i, searchItem2));
        } else if (i >= cacheData.minDepth) {
            return (SearchItem) cacheData.object;
        } else {
            cacheData.minDepth = i;
            searchItem2 = (SearchItem) cacheData.object;
        }
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface = searchItem2;
        C4624x6f10d768 ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface2 = searchItem;
        ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface.realmSet$contentType(ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxyinterface2.realmGet$contentType());
        return searchItem2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SearchItem = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{contentType:");
        if (realmGet$contentType() != null) {
            str = realmGet$contentType();
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
        ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_SearchItemRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_searchitemrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
