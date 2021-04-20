package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildingsList;
import p046io.realm.BaseRealm;
import p046io.realm.C4830x6d8ab071;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsListRealmProxy */
public class C4828xbbcd96af extends BusinessBuildingsList implements RealmObjectProxy, C4829xd6b70b4a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<BusinessBuildings> buildingsRealmList;
    private BusinessBuildingsListColumnInfo columnInfo;
    private ProxyState<BusinessBuildingsList> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsListRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BusinessBuildingsList";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsListRealmProxy$BusinessBuildingsListColumnInfo */
    static final class BusinessBuildingsListColumnInfo extends ColumnInfo {
        long buildingsIndex;
        long maxColumnIndexValue;

        BusinessBuildingsListColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.buildingsIndex = addColumnDetails("buildings", "buildings", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BusinessBuildingsListColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BusinessBuildingsListColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo = (BusinessBuildingsListColumnInfo) columnInfo;
            BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo2 = (BusinessBuildingsListColumnInfo) columnInfo2;
            businessBuildingsListColumnInfo2.buildingsIndex = businessBuildingsListColumnInfo.buildingsIndex;
            businessBuildingsListColumnInfo2.maxColumnIndexValue = businessBuildingsListColumnInfo.maxColumnIndexValue;
        }
    }

    C4828xbbcd96af() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BusinessBuildingsListColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RealmList<BusinessBuildings> realmGet$buildings() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<BusinessBuildings> realmList = this.buildingsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.buildingsRealmList = new RealmList<>(BusinessBuildings.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.buildingsIndex), this.proxyState.getRealm$realm());
        return this.buildingsRealmList;
    }

    public void realmSet$buildings(RealmList<BusinessBuildings> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("buildings")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<BusinessBuildings> realmList2 = new RealmList<>();
                Iterator<BusinessBuildings> it = realmList.iterator();
                while (it.hasNext()) {
                    BusinessBuildings next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.buildingsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    BusinessBuildings businessBuildings = realmList.get(i);
                    this.proxyState.checkValidObject(businessBuildings);
                    modelList.addRow(((RealmObjectProxy) businessBuildings).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            BusinessBuildings businessBuildings2 = realmList.get(i);
            this.proxyState.checkValidObject(businessBuildings2);
            modelList.setRow((long) i, ((RealmObjectProxy) businessBuildings2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty("buildings", RealmFieldType.LIST, C4830x6d8ab071.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BusinessBuildingsListColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BusinessBuildingsListColumnInfo(osSchemaInfo);
    }

    public static BusinessBuildingsList createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("buildings")) {
            arrayList.add("buildings");
        }
        BusinessBuildingsList businessBuildingsList = (BusinessBuildingsList) realm.createObjectInternal(BusinessBuildingsList.class, true, arrayList);
        C4829xd6b70b4a ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface = businessBuildingsList;
        if (jSONObject.has("buildings")) {
            if (jSONObject.isNull("buildings")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmSet$buildings((RealmList<BusinessBuildings>) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmGet$buildings().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("buildings");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmGet$buildings().add(C4830x6d8ab071.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return businessBuildingsList;
    }

    public static BusinessBuildingsList createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BusinessBuildingsList businessBuildingsList = new BusinessBuildingsList();
        C4829xd6b70b4a ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface = businessBuildingsList;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("buildings")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmSet$buildings((RealmList<BusinessBuildings>) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmSet$buildings(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmGet$buildings().add(C4830x6d8ab071.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (BusinessBuildingsList) realm.copyToRealm(businessBuildingsList, new ImportFlag[0]);
    }

    private static C4828xbbcd96af newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildingsList.class), false, Collections.emptyList());
        C4828xbbcd96af ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxy = new C4828xbbcd96af();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxy;
    }

    public static BusinessBuildingsList copyOrUpdate(Realm realm, BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo, BusinessBuildingsList businessBuildingsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (businessBuildingsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildingsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return businessBuildingsList;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(businessBuildingsList);
        if (realmObjectProxy2 != null) {
            return (BusinessBuildingsList) realmObjectProxy2;
        }
        return copy(realm, businessBuildingsListColumnInfo, businessBuildingsList, z, map, set);
    }

    public static BusinessBuildingsList copy(Realm realm, BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo, BusinessBuildingsList businessBuildingsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(businessBuildingsList);
        if (realmObjectProxy != null) {
            return (BusinessBuildingsList) realmObjectProxy;
        }
        C4828xbbcd96af newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(BusinessBuildingsList.class), businessBuildingsListColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(businessBuildingsList, newProxyInstance);
        RealmList<BusinessBuildings> realmGet$buildings = businessBuildingsList.realmGet$buildings();
        if (realmGet$buildings != null) {
            RealmList<BusinessBuildings> realmGet$buildings2 = newProxyInstance.realmGet$buildings();
            realmGet$buildings2.clear();
            for (int i = 0; i < realmGet$buildings.size(); i++) {
                BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                BusinessBuildings businessBuildings2 = (BusinessBuildings) map.get(businessBuildings);
                if (businessBuildings2 != null) {
                    realmGet$buildings2.add(businessBuildings2);
                } else {
                    realmGet$buildings2.add(C4830x6d8ab071.copyOrUpdate(realm, (C4830x6d8ab071.BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class), businessBuildings, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, BusinessBuildingsList businessBuildingsList, Map<RealmModel, Long> map) {
        if (businessBuildingsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildingsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BusinessBuildingsList.class);
        table.getNativePtr();
        BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo = (BusinessBuildingsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildingsList.class);
        long createRow = OsObject.createRow(table);
        map.put(businessBuildingsList, Long.valueOf(createRow));
        RealmList<BusinessBuildings> realmGet$buildings = businessBuildingsList.realmGet$buildings();
        if (realmGet$buildings != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), businessBuildingsListColumnInfo.buildingsIndex);
            Iterator<BusinessBuildings> it = realmGet$buildings.iterator();
            while (it.hasNext()) {
                BusinessBuildings next = it.next();
                Long l = map.get(next);
                if (l == null) {
                    l = Long.valueOf(C4830x6d8ab071.insert(realm, next, map));
                }
                osList.addRow(l.longValue());
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BusinessBuildingsList.class);
        table.getNativePtr();
        BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo = (BusinessBuildingsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildingsList.class);
        while (it.hasNext()) {
            BusinessBuildingsList businessBuildingsList = (BusinessBuildingsList) it.next();
            if (!map.containsKey(businessBuildingsList)) {
                if (businessBuildingsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildingsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(businessBuildingsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(businessBuildingsList, Long.valueOf(createRow));
                RealmList<BusinessBuildings> realmGet$buildings = businessBuildingsList.realmGet$buildings();
                if (realmGet$buildings != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), businessBuildingsListColumnInfo.buildingsIndex);
                    Iterator<BusinessBuildings> it2 = realmGet$buildings.iterator();
                    while (it2.hasNext()) {
                        BusinessBuildings next = it2.next();
                        Long l = map.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4830x6d8ab071.insert(realm, next, map));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BusinessBuildingsList businessBuildingsList, Map<RealmModel, Long> map) {
        if (businessBuildingsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildingsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BusinessBuildingsList.class);
        table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(businessBuildingsList, Long.valueOf(createRow));
        OsList osList = new OsList(table.getUncheckedRow(createRow), ((BusinessBuildingsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildingsList.class)).buildingsIndex);
        RealmList<BusinessBuildings> realmGet$buildings = businessBuildingsList.realmGet$buildings();
        if (realmGet$buildings == null || ((long) realmGet$buildings.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$buildings != null) {
                Iterator<BusinessBuildings> it = realmGet$buildings.iterator();
                while (it.hasNext()) {
                    BusinessBuildings next = it.next();
                    Long l = map.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$buildings.size();
            for (int i = 0; i < size; i++) {
                BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                Long l2 = map.get(businessBuildings);
                if (l2 == null) {
                    l2 = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm, businessBuildings, map));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BusinessBuildingsList.class);
        table.getNativePtr();
        BusinessBuildingsListColumnInfo businessBuildingsListColumnInfo = (BusinessBuildingsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildingsList.class);
        while (it.hasNext()) {
            BusinessBuildingsList businessBuildingsList = (BusinessBuildingsList) it.next();
            if (!map.containsKey(businessBuildingsList)) {
                if (businessBuildingsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildingsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(businessBuildingsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(businessBuildingsList, Long.valueOf(createRow));
                OsList osList = new OsList(table.getUncheckedRow(createRow), businessBuildingsListColumnInfo.buildingsIndex);
                RealmList<BusinessBuildings> realmGet$buildings = businessBuildingsList.realmGet$buildings();
                if (realmGet$buildings == null || ((long) realmGet$buildings.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$buildings != null) {
                        Iterator<BusinessBuildings> it2 = realmGet$buildings.iterator();
                        while (it2.hasNext()) {
                            BusinessBuildings next = it2.next();
                            Long l = map.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm, next, map));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$buildings.size();
                    for (int i = 0; i < size; i++) {
                        BusinessBuildings businessBuildings = realmGet$buildings.get(i);
                        Long l2 = map.get(businessBuildings);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4830x6d8ab071.insertOrUpdate(realm, businessBuildings, map));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static BusinessBuildingsList createDetachedCopy(BusinessBuildingsList businessBuildingsList, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BusinessBuildingsList businessBuildingsList2;
        if (i > i2 || businessBuildingsList == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(businessBuildingsList);
        if (cacheData == null) {
            businessBuildingsList2 = new BusinessBuildingsList();
            map.put(businessBuildingsList, new RealmObjectProxy.CacheData(i, businessBuildingsList2));
        } else if (i >= cacheData.minDepth) {
            return (BusinessBuildingsList) cacheData.object;
        } else {
            cacheData.minDepth = i;
            businessBuildingsList2 = (BusinessBuildingsList) cacheData.object;
        }
        C4829xd6b70b4a ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface = businessBuildingsList2;
        C4829xd6b70b4a ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface2 = businessBuildingsList;
        if (i == i2) {
            ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmSet$buildings((RealmList<BusinessBuildings>) null);
        } else {
            RealmList<BusinessBuildings> realmGet$buildings = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface2.realmGet$buildings();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxyinterface.realmSet$buildings(realmList);
            int i3 = i + 1;
            int size = realmGet$buildings.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4830x6d8ab071.createDetachedCopy(realmGet$buildings.get(i4), i3, i2, map));
            }
        }
        return businessBuildingsList2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "BusinessBuildingsList = proxy[" + "{buildings:" + "RealmList<BusinessBuildings>[" + realmGet$buildings().size() + "]" + "}" + "]";
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
        C4828xbbcd96af ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxy = (C4828xbbcd96af) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingslistrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
