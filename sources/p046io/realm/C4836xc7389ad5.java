package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p046io.realm.BaseRealm;
import p046io.realm.C4830x6d8ab071;
import p046io.realm.C4838xc3cde83a;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchBuildingDTORealmProxy */
public class C4836xc7389ad5 extends SearchBuildingDTO implements RealmObjectProxy, C4837xdc5751e4 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SearchBuildingDTOColumnInfo columnInfo;
    private ProxyState<SearchBuildingDTO> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchBuildingDTORealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SearchBuildingDTO";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_SearchBuildingDTORealmProxy$SearchBuildingDTOColumnInfo */
    static final class SearchBuildingDTOColumnInfo extends ColumnInfo {
        long buildingIndex;
        long complexIndex;
        long maxColumnIndexValue;

        SearchBuildingDTOColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.complexIndex = addColumnDetails("complex", "complex", objectSchemaInfo);
            this.buildingIndex = addColumnDetails("building", "building", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SearchBuildingDTOColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SearchBuildingDTOColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo = (SearchBuildingDTOColumnInfo) columnInfo;
            SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo2 = (SearchBuildingDTOColumnInfo) columnInfo2;
            searchBuildingDTOColumnInfo2.complexIndex = searchBuildingDTOColumnInfo.complexIndex;
            searchBuildingDTOColumnInfo2.buildingIndex = searchBuildingDTOColumnInfo.buildingIndex;
            searchBuildingDTOColumnInfo2.maxColumnIndexValue = searchBuildingDTOColumnInfo.maxColumnIndexValue;
        }
    }

    C4836xc7389ad5() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SearchBuildingDTOColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public SearchComplex realmGet$complex() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.complexIndex)) {
            return null;
        }
        return (SearchComplex) this.proxyState.getRealm$realm().get(SearchComplex.class, this.proxyState.getRow$realm().getLink(this.columnInfo.complexIndex), false, Collections.emptyList());
    }

    public void realmSet$complex(SearchComplex searchComplex) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (searchComplex == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.complexIndex);
                return;
            }
            this.proxyState.checkValidObject(searchComplex);
            this.proxyState.getRow$realm().setLink(this.columnInfo.complexIndex, ((RealmObjectProxy) searchComplex).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("complex")) {
            if (searchComplex != null && !RealmObject.isManaged(searchComplex)) {
                searchComplex = (SearchComplex) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(searchComplex, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (searchComplex == null) {
                row$realm.nullifyLink(this.columnInfo.complexIndex);
                return;
            }
            this.proxyState.checkValidObject(searchComplex);
            row$realm.getTable().setLink(this.columnInfo.complexIndex, row$realm.getIndex(), ((RealmObjectProxy) searchComplex).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public BusinessBuildings realmGet$building() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.buildingIndex)) {
            return null;
        }
        return (BusinessBuildings) this.proxyState.getRealm$realm().get(BusinessBuildings.class, this.proxyState.getRow$realm().getLink(this.columnInfo.buildingIndex), false, Collections.emptyList());
    }

    public void realmSet$building(BusinessBuildings businessBuildings) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (businessBuildings == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.buildingIndex);
                return;
            }
            this.proxyState.checkValidObject(businessBuildings);
            this.proxyState.getRow$realm().setLink(this.columnInfo.buildingIndex, ((RealmObjectProxy) businessBuildings).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("building")) {
            if (businessBuildings != null && !RealmObject.isManaged(businessBuildings)) {
                businessBuildings = (BusinessBuildings) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(businessBuildings, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (businessBuildings == null) {
                row$realm.nullifyLink(this.columnInfo.buildingIndex);
                return;
            }
            this.proxyState.checkValidObject(businessBuildings);
            row$realm.getTable().setLink(this.columnInfo.buildingIndex, row$realm.getIndex(), ((RealmObjectProxy) businessBuildings).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedLinkProperty("complex", RealmFieldType.OBJECT, C4838xc3cde83a.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("building", RealmFieldType.OBJECT, C4830x6d8ab071.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SearchBuildingDTOColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SearchBuildingDTOColumnInfo(osSchemaInfo);
    }

    public static SearchBuildingDTO createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("complex")) {
            arrayList.add("complex");
        }
        if (jSONObject.has("building")) {
            arrayList.add("building");
        }
        SearchBuildingDTO searchBuildingDTO = (SearchBuildingDTO) realm.createObjectInternal(SearchBuildingDTO.class, true, arrayList);
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO;
        if (jSONObject.has("complex")) {
            if (jSONObject.isNull("complex")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$complex((SearchComplex) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$complex(C4838xc3cde83a.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("complex"), z));
            }
        }
        if (jSONObject.has("building")) {
            if (jSONObject.isNull("building")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$building((BusinessBuildings) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$building(C4830x6d8ab071.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("building"), z));
            }
        }
        return searchBuildingDTO;
    }

    public static SearchBuildingDTO createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SearchBuildingDTO searchBuildingDTO = new SearchBuildingDTO();
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("complex")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$complex((SearchComplex) null);
                } else {
                    ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$complex(C4838xc3cde83a.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("building")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$building((BusinessBuildings) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$building(C4830x6d8ab071.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (SearchBuildingDTO) realm.copyToRealm(searchBuildingDTO, new ImportFlag[0]);
    }

    private static C4836xc7389ad5 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchBuildingDTO.class), false, Collections.emptyList());
        C4836xc7389ad5 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxy = new C4836xc7389ad5();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxy;
    }

    public static SearchBuildingDTO copyOrUpdate(Realm realm, SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo, SearchBuildingDTO searchBuildingDTO, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (searchBuildingDTO instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchBuildingDTO;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return searchBuildingDTO;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(searchBuildingDTO);
        if (realmObjectProxy2 != null) {
            return (SearchBuildingDTO) realmObjectProxy2;
        }
        return copy(realm, searchBuildingDTOColumnInfo, searchBuildingDTO, z, map, set);
    }

    public static SearchBuildingDTO copy(Realm realm, SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo, SearchBuildingDTO searchBuildingDTO, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(searchBuildingDTO);
        if (realmObjectProxy != null) {
            return (SearchBuildingDTO) realmObjectProxy;
        }
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO;
        C4836xc7389ad5 newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(SearchBuildingDTO.class), searchBuildingDTOColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(searchBuildingDTO, newProxyInstance);
        SearchComplex realmGet$complex = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$complex();
        if (realmGet$complex == null) {
            newProxyInstance.realmSet$complex((SearchComplex) null);
        } else {
            SearchComplex searchComplex = (SearchComplex) map.get(realmGet$complex);
            if (searchComplex != null) {
                newProxyInstance.realmSet$complex(searchComplex);
            } else {
                newProxyInstance.realmSet$complex(C4838xc3cde83a.copyOrUpdate(realm, (C4838xc3cde83a.SearchComplexColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchComplex.class), realmGet$complex, z, map, set));
            }
        }
        BusinessBuildings realmGet$building = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$building();
        if (realmGet$building == null) {
            newProxyInstance.realmSet$building((BusinessBuildings) null);
        } else {
            BusinessBuildings businessBuildings = (BusinessBuildings) map.get(realmGet$building);
            if (businessBuildings != null) {
                newProxyInstance.realmSet$building(businessBuildings);
            } else {
                newProxyInstance.realmSet$building(C4830x6d8ab071.copyOrUpdate(realm, (C4830x6d8ab071.BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class), realmGet$building, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, SearchBuildingDTO searchBuildingDTO, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        SearchBuildingDTO searchBuildingDTO2 = searchBuildingDTO;
        Map<RealmModel, Long> map2 = map;
        if (searchBuildingDTO2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchBuildingDTO2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(SearchBuildingDTO.class);
        long nativePtr = table.getNativePtr();
        SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo = (SearchBuildingDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchBuildingDTO.class);
        long createRow = OsObject.createRow(table);
        map2.put(searchBuildingDTO2, Long.valueOf(createRow));
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO2;
        SearchComplex realmGet$complex = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$complex();
        if (realmGet$complex != null) {
            Long l = map2.get(realmGet$complex);
            if (l == null) {
                l = Long.valueOf(C4838xc3cde83a.insert(realm2, realmGet$complex, map2));
            }
            Table.nativeSetLink(nativePtr, searchBuildingDTOColumnInfo.complexIndex, createRow, l.longValue(), false);
        }
        BusinessBuildings realmGet$building = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Long l2 = map2.get(realmGet$building);
            if (l2 == null) {
                l2 = Long.valueOf(C4830x6d8ab071.insert(realm2, realmGet$building, map2));
            }
            Table.nativeSetLink(nativePtr, searchBuildingDTOColumnInfo.buildingIndex, createRow, l2.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(SearchBuildingDTO.class);
        table.getNativePtr();
        SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo = (SearchBuildingDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchBuildingDTO.class);
        while (it.hasNext()) {
            SearchBuildingDTO searchBuildingDTO = (SearchBuildingDTO) it.next();
            if (!map.containsKey(searchBuildingDTO)) {
                if (searchBuildingDTO instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchBuildingDTO;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(searchBuildingDTO, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(searchBuildingDTO, Long.valueOf(createRow));
                C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO;
                SearchComplex realmGet$complex = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$complex();
                if (realmGet$complex != null) {
                    Long l = map.get(realmGet$complex);
                    if (l == null) {
                        l = Long.valueOf(C4838xc3cde83a.insert(realm, realmGet$complex, map));
                    }
                    table.setLink(searchBuildingDTOColumnInfo.complexIndex, createRow, l.longValue(), false);
                }
                BusinessBuildings realmGet$building = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Long l2 = map.get(realmGet$building);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4830x6d8ab071.insert(realm, realmGet$building, map));
                    }
                    table.setLink(searchBuildingDTOColumnInfo.buildingIndex, createRow, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SearchBuildingDTO searchBuildingDTO, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        SearchBuildingDTO searchBuildingDTO2 = searchBuildingDTO;
        Map<RealmModel, Long> map2 = map;
        if (searchBuildingDTO2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchBuildingDTO2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(SearchBuildingDTO.class);
        long nativePtr = table.getNativePtr();
        SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo = (SearchBuildingDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchBuildingDTO.class);
        long createRow = OsObject.createRow(table);
        map2.put(searchBuildingDTO2, Long.valueOf(createRow));
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO2;
        SearchComplex realmGet$complex = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$complex();
        if (realmGet$complex != null) {
            Long l = map2.get(realmGet$complex);
            if (l == null) {
                l = Long.valueOf(C4838xc3cde83a.insertOrUpdate(realm2, realmGet$complex, map2));
            }
            Table.nativeSetLink(nativePtr, searchBuildingDTOColumnInfo.complexIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, searchBuildingDTOColumnInfo.complexIndex, createRow);
        }
        BusinessBuildings realmGet$building = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$building();
        if (realmGet$building != null) {
            Long l2 = map2.get(realmGet$building);
            if (l2 == null) {
                l2 = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm2, realmGet$building, map2));
            }
            Table.nativeSetLink(nativePtr, searchBuildingDTOColumnInfo.buildingIndex, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, searchBuildingDTOColumnInfo.buildingIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(SearchBuildingDTO.class);
        long nativePtr = table.getNativePtr();
        SearchBuildingDTOColumnInfo searchBuildingDTOColumnInfo = (SearchBuildingDTOColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SearchBuildingDTO.class);
        while (it.hasNext()) {
            SearchBuildingDTO searchBuildingDTO = (SearchBuildingDTO) it.next();
            if (!map2.containsKey(searchBuildingDTO)) {
                if (searchBuildingDTO instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) searchBuildingDTO;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(searchBuildingDTO, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(searchBuildingDTO, Long.valueOf(createRow));
                C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO;
                SearchComplex realmGet$complex = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$complex();
                if (realmGet$complex != null) {
                    Long l = map2.get(realmGet$complex);
                    if (l == null) {
                        l = Long.valueOf(C4838xc3cde83a.insertOrUpdate(realm2, realmGet$complex, map2));
                    }
                    Table.nativeSetLink(nativePtr, searchBuildingDTOColumnInfo.complexIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, searchBuildingDTOColumnInfo.complexIndex, createRow);
                }
                BusinessBuildings realmGet$building = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmGet$building();
                if (realmGet$building != null) {
                    Long l2 = map2.get(realmGet$building);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm2, realmGet$building, map2));
                    }
                    Table.nativeSetLink(nativePtr, searchBuildingDTOColumnInfo.buildingIndex, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, searchBuildingDTOColumnInfo.buildingIndex, createRow);
                }
            }
        }
    }

    public static SearchBuildingDTO createDetachedCopy(SearchBuildingDTO searchBuildingDTO, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SearchBuildingDTO searchBuildingDTO2;
        if (i > i2 || searchBuildingDTO == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(searchBuildingDTO);
        if (cacheData == null) {
            searchBuildingDTO2 = new SearchBuildingDTO();
            map.put(searchBuildingDTO, new RealmObjectProxy.CacheData(i, searchBuildingDTO2));
        } else if (i >= cacheData.minDepth) {
            return (SearchBuildingDTO) cacheData.object;
        } else {
            cacheData.minDepth = i;
            searchBuildingDTO2 = (SearchBuildingDTO) cacheData.object;
        }
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface = searchBuildingDTO2;
        C4837xdc5751e4 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface2 = searchBuildingDTO;
        int i3 = i + 1;
        ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$complex(C4838xc3cde83a.createDetachedCopy(ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface2.realmGet$complex(), i3, i2, map));
        ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface.realmSet$building(C4830x6d8ab071.createDetachedCopy(ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxyinterface2.realmGet$building(), i3, i2, map));
        return searchBuildingDTO2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SearchBuildingDTO = proxy[");
        sb.append("{complex:");
        String str = "null";
        sb.append(realmGet$complex() != null ? C4838xc3cde83a.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{building:");
        if (realmGet$building() != null) {
            str = C4830x6d8ab071.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4836xc7389ad5 ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxy = (C4836xc7389ad5) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_profileselection_data_searchbuildingdtorealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
