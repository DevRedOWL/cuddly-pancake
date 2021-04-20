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
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchComplexRealmProxy */
public class C4838xc3cde83a extends SearchComplex implements RealmObjectProxy, C4839xaf62461f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SearchComplexColumnInfo columnInfo;
    private ProxyState<SearchComplex> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchComplexRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SearchComplex";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchComplexRealmProxy$SearchComplexColumnInfo */
    static final class SearchComplexColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        SearchComplexColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SearchComplexColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SearchComplexColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SearchComplexColumnInfo searchComplexColumnInfo = (SearchComplexColumnInfo) columnInfo;
            SearchComplexColumnInfo searchComplexColumnInfo2 = (SearchComplexColumnInfo) columnInfo2;
            searchComplexColumnInfo2.idIndex = searchComplexColumnInfo.idIndex;
            searchComplexColumnInfo2.titleIndex = searchComplexColumnInfo.titleIndex;
            searchComplexColumnInfo2.maxColumnIndexValue = searchComplexColumnInfo.maxColumnIndexValue;
        }
    }

    C4838xc3cde83a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SearchComplexColumnInfo) realmObjectContext.getColumnInfo();
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
            this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SearchComplexColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SearchComplexColumnInfo(osSchemaInfo);
    }

    public static SearchComplex createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SearchComplex searchComplex = (SearchComplex) realm.createObjectInternal(SearchComplex.class, true, Collections.emptyList());
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex;
        if (jSONObject.has("id")) {
            if (!jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$id(jSONObject.getInt("id"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return searchComplex;
    }

    public static SearchComplex createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SearchComplex searchComplex = new SearchComplex();
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (SearchComplex) realm.copyToRealm(searchComplex, new ImportFlag[0]);
    }

    private static C4838xc3cde83a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class), false, Collections.emptyList());
        C4838xc3cde83a ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxy = new C4838xc3cde83a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxy;
    }

    public static SearchComplex copyOrUpdate(Realm realm, SearchComplexColumnInfo searchComplexColumnInfo, SearchComplex searchComplex, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (searchComplex instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchComplex;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return searchComplex;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(searchComplex);
        if (realmObjectProxy2 != null) {
            return (SearchComplex) realmObjectProxy2;
        }
        return copy(realm, searchComplexColumnInfo, searchComplex, z, map, set);
    }

    public static SearchComplex copy(Realm realm, SearchComplexColumnInfo searchComplexColumnInfo, SearchComplex searchComplex, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(searchComplex);
        if (realmObjectProxy != null) {
            return (SearchComplex) realmObjectProxy;
        }
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SearchComplex.class), searchComplexColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(searchComplexColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(searchComplexColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$title());
        C4838xc3cde83a newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(searchComplex, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SearchComplex searchComplex, Map<RealmModel, Long> map) {
        SearchComplex searchComplex2 = searchComplex;
        if (searchComplex2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchComplex2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SearchComplex.class);
        long nativePtr = table.getNativePtr();
        SearchComplexColumnInfo searchComplexColumnInfo = (SearchComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class);
        long createRow = OsObject.createRow(table);
        map.put(searchComplex2, Long.valueOf(createRow));
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex2;
        Table.nativeSetLong(nativePtr, searchComplexColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$id(), false);
        String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, searchComplexColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SearchComplex.class);
        long nativePtr = table.getNativePtr();
        SearchComplexColumnInfo searchComplexColumnInfo = (SearchComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class);
        while (it.hasNext()) {
            SearchComplex searchComplex = (SearchComplex) it.next();
            if (!map2.containsKey(searchComplex)) {
                if (searchComplex instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchComplex;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(searchComplex, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(searchComplex, Long.valueOf(createRow));
                C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex;
                Table.nativeSetLong(nativePtr, searchComplexColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$id(), false);
                String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, searchComplexColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SearchComplex searchComplex, Map<RealmModel, Long> map) {
        SearchComplex searchComplex2 = searchComplex;
        if (searchComplex2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchComplex2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SearchComplex.class);
        long nativePtr = table.getNativePtr();
        SearchComplexColumnInfo searchComplexColumnInfo = (SearchComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class);
        long createRow = OsObject.createRow(table);
        map.put(searchComplex2, Long.valueOf(createRow));
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex2;
        Table.nativeSetLong(nativePtr, searchComplexColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$id(), false);
        String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, searchComplexColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, searchComplexColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SearchComplex.class);
        long nativePtr = table.getNativePtr();
        SearchComplexColumnInfo searchComplexColumnInfo = (SearchComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class);
        while (it.hasNext()) {
            SearchComplex searchComplex = (SearchComplex) it.next();
            if (!map2.containsKey(searchComplex)) {
                if (searchComplex instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchComplex;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(searchComplex, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(searchComplex, Long.valueOf(createRow));
                C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex;
                Table.nativeSetLong(nativePtr, searchComplexColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$id(), false);
                String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, searchComplexColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, searchComplexColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static SearchComplex createDetachedCopy(SearchComplex searchComplex, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SearchComplex searchComplex2;
        if (i > i2 || searchComplex == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(searchComplex);
        if (cacheData == null) {
            searchComplex2 = new SearchComplex();
            map.put(searchComplex, new RealmObjectProxy.CacheData(i, searchComplex2));
        } else if (i >= cacheData.minDepth) {
            return (SearchComplex) cacheData.object;
        } else {
            cacheData.minDepth = i;
            searchComplex2 = (SearchComplex) cacheData.object;
        }
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface = searchComplex2;
        C4839xaf62461f ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface2 = searchComplex;
        ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxyinterface2.realmGet$title());
        return searchComplex2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "SearchComplex = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{title:" + realmGet$title() + "}" + "]";
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
        C4838xc3cde83a ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxy = (C4838xc3cde83a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_profileselection_data_searchcomplexrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
