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
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsRealmProxy */
public class C4830x6d8ab071 extends BusinessBuildings implements RealmObjectProxy, C4831x154dcbc8 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BusinessBuildingsColumnInfo columnInfo;
    private ProxyState<BusinessBuildings> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BusinessBuildings";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_fragments_profileselection_data_BusinessBuildingsRealmProxy$BusinessBuildingsColumnInfo */
    static final class BusinessBuildingsColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        BusinessBuildingsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BusinessBuildingsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BusinessBuildingsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BusinessBuildingsColumnInfo businessBuildingsColumnInfo = (BusinessBuildingsColumnInfo) columnInfo;
            BusinessBuildingsColumnInfo businessBuildingsColumnInfo2 = (BusinessBuildingsColumnInfo) columnInfo2;
            businessBuildingsColumnInfo2.idIndex = businessBuildingsColumnInfo.idIndex;
            businessBuildingsColumnInfo2.titleIndex = businessBuildingsColumnInfo.titleIndex;
            businessBuildingsColumnInfo2.maxColumnIndexValue = businessBuildingsColumnInfo.maxColumnIndexValue;
        }
    }

    C4830x6d8ab071() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BusinessBuildingsColumnInfo) realmObjectContext.getColumnInfo();
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

    public static BusinessBuildingsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BusinessBuildingsColumnInfo(osSchemaInfo);
    }

    public static BusinessBuildings createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        BusinessBuildings businessBuildings = (BusinessBuildings) realm.createObjectInternal(BusinessBuildings.class, true, Collections.emptyList());
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings;
        if (jSONObject.has("id")) {
            if (!jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$id(jSONObject.getInt("id"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return businessBuildings;
    }

    public static BusinessBuildings createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BusinessBuildings businessBuildings = new BusinessBuildings();
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (BusinessBuildings) realm.copyToRealm(businessBuildings, new ImportFlag[0]);
    }

    private static C4830x6d8ab071 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class), false, Collections.emptyList());
        C4830x6d8ab071 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxy = new C4830x6d8ab071();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxy;
    }

    public static BusinessBuildings copyOrUpdate(Realm realm, BusinessBuildingsColumnInfo businessBuildingsColumnInfo, BusinessBuildings businessBuildings, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (businessBuildings instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildings;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return businessBuildings;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(businessBuildings);
        if (realmObjectProxy2 != null) {
            return (BusinessBuildings) realmObjectProxy2;
        }
        return copy(realm, businessBuildingsColumnInfo, businessBuildings, z, map, set);
    }

    public static BusinessBuildings copy(Realm realm, BusinessBuildingsColumnInfo businessBuildingsColumnInfo, BusinessBuildings businessBuildings, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(businessBuildings);
        if (realmObjectProxy != null) {
            return (BusinessBuildings) realmObjectProxy;
        }
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BusinessBuildings.class), businessBuildingsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(businessBuildingsColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(businessBuildingsColumnInfo.titleIndex, ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$title());
        C4830x6d8ab071 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(businessBuildings, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, BusinessBuildings businessBuildings, Map<RealmModel, Long> map) {
        BusinessBuildings businessBuildings2 = businessBuildings;
        if (businessBuildings2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildings2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BusinessBuildings.class);
        long nativePtr = table.getNativePtr();
        BusinessBuildingsColumnInfo businessBuildingsColumnInfo = (BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class);
        long createRow = OsObject.createRow(table);
        map.put(businessBuildings2, Long.valueOf(createRow));
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings2;
        Table.nativeSetLong(nativePtr, businessBuildingsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$id(), false);
        String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, businessBuildingsColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BusinessBuildings.class);
        long nativePtr = table.getNativePtr();
        BusinessBuildingsColumnInfo businessBuildingsColumnInfo = (BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class);
        while (it.hasNext()) {
            BusinessBuildings businessBuildings = (BusinessBuildings) it.next();
            if (!map2.containsKey(businessBuildings)) {
                if (businessBuildings instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildings;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(businessBuildings, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(businessBuildings, Long.valueOf(createRow));
                C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings;
                Table.nativeSetLong(nativePtr, businessBuildingsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$id(), false);
                String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, businessBuildingsColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BusinessBuildings businessBuildings, Map<RealmModel, Long> map) {
        BusinessBuildings businessBuildings2 = businessBuildings;
        if (businessBuildings2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildings2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BusinessBuildings.class);
        long nativePtr = table.getNativePtr();
        BusinessBuildingsColumnInfo businessBuildingsColumnInfo = (BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class);
        long createRow = OsObject.createRow(table);
        map.put(businessBuildings2, Long.valueOf(createRow));
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings2;
        Table.nativeSetLong(nativePtr, businessBuildingsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$id(), false);
        String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, businessBuildingsColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, businessBuildingsColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BusinessBuildings.class);
        long nativePtr = table.getNativePtr();
        BusinessBuildingsColumnInfo businessBuildingsColumnInfo = (BusinessBuildingsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BusinessBuildings.class);
        while (it.hasNext()) {
            BusinessBuildings businessBuildings = (BusinessBuildings) it.next();
            if (!map2.containsKey(businessBuildings)) {
                if (businessBuildings instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) businessBuildings;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(businessBuildings, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(businessBuildings, Long.valueOf(createRow));
                C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings;
                Table.nativeSetLong(nativePtr, businessBuildingsColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$id(), false);
                String realmGet$title = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, businessBuildingsColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, businessBuildingsColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static BusinessBuildings createDetachedCopy(BusinessBuildings businessBuildings, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BusinessBuildings businessBuildings2;
        if (i > i2 || businessBuildings == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(businessBuildings);
        if (cacheData == null) {
            businessBuildings2 = new BusinessBuildings();
            map.put(businessBuildings, new RealmObjectProxy.CacheData(i, businessBuildings2));
        } else if (i >= cacheData.minDepth) {
            return (BusinessBuildings) cacheData.object;
        } else {
            cacheData.minDepth = i;
            businessBuildings2 = (BusinessBuildings) cacheData.object;
        }
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface = businessBuildings2;
        C4831x154dcbc8 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface2 = businessBuildings;
        ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxyinterface2.realmGet$title());
        return businessBuildings2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "BusinessBuildings = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{title:" + realmGet$title() + "}" + "]";
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
        C4830x6d8ab071 ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxy = (C4830x6d8ab071) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_fragments_profileselection_data_businessbuildingsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
