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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.ApartmentScenarioOptionAdd;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_ApartmentScenarioOptionAddRealmProxy */
public class C4798x7bd56e2e extends ApartmentScenarioOptionAdd implements RealmObjectProxy, C4799xd0032ab {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ApartmentScenarioOptionAddColumnInfo columnInfo;
    private ProxyState<ApartmentScenarioOptionAdd> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_ApartmentScenarioOptionAddRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ApartmentScenarioOptionAdd";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_ApartmentScenarioOptionAddRealmProxy$ApartmentScenarioOptionAddColumnInfo */
    static final class ApartmentScenarioOptionAddColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long temperatureIndex;

        ApartmentScenarioOptionAddColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.temperatureIndex = addColumnDetails("temperature", "temperature", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ApartmentScenarioOptionAddColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ApartmentScenarioOptionAddColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo = (ApartmentScenarioOptionAddColumnInfo) columnInfo;
            ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo2 = (ApartmentScenarioOptionAddColumnInfo) columnInfo2;
            apartmentScenarioOptionAddColumnInfo2.temperatureIndex = apartmentScenarioOptionAddColumnInfo.temperatureIndex;
            apartmentScenarioOptionAddColumnInfo2.maxColumnIndexValue = apartmentScenarioOptionAddColumnInfo.maxColumnIndexValue;
        }
    }

    C4798x7bd56e2e() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ApartmentScenarioOptionAddColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$temperature() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.temperatureIndex);
    }

    public void realmSet$temperature(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.temperatureIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.temperatureIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.temperatureIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.temperatureIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("temperature", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ApartmentScenarioOptionAddColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ApartmentScenarioOptionAddColumnInfo(osSchemaInfo);
    }

    public static ApartmentScenarioOptionAdd createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ApartmentScenarioOptionAdd apartmentScenarioOptionAdd = (ApartmentScenarioOptionAdd) realm.createObjectInternal(ApartmentScenarioOptionAdd.class, true, Collections.emptyList());
        C4799xd0032ab ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxyinterface = apartmentScenarioOptionAdd;
        if (jSONObject.has("temperature")) {
            if (jSONObject.isNull("temperature")) {
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxyinterface.realmSet$temperature((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxyinterface.realmSet$temperature(jSONObject.getString("temperature"));
            }
        }
        return apartmentScenarioOptionAdd;
    }

    public static ApartmentScenarioOptionAdd createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ApartmentScenarioOptionAdd apartmentScenarioOptionAdd = new ApartmentScenarioOptionAdd();
        C4799xd0032ab ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxyinterface = apartmentScenarioOptionAdd;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("temperature")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxyinterface.realmSet$temperature(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxyinterface.realmSet$temperature((String) null);
            }
        }
        jsonReader.endObject();
        return (ApartmentScenarioOptionAdd) realm.copyToRealm(apartmentScenarioOptionAdd, new ImportFlag[0]);
    }

    private static C4798x7bd56e2e newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class), false, Collections.emptyList());
        C4798x7bd56e2e ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxy = new C4798x7bd56e2e();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxy;
    }

    public static ApartmentScenarioOptionAdd copyOrUpdate(Realm realm, ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo, ApartmentScenarioOptionAdd apartmentScenarioOptionAdd, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (apartmentScenarioOptionAdd instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentScenarioOptionAdd;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return apartmentScenarioOptionAdd;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(apartmentScenarioOptionAdd);
        if (realmObjectProxy2 != null) {
            return (ApartmentScenarioOptionAdd) realmObjectProxy2;
        }
        return copy(realm, apartmentScenarioOptionAddColumnInfo, apartmentScenarioOptionAdd, z, map, set);
    }

    public static ApartmentScenarioOptionAdd copy(Realm realm, ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo, ApartmentScenarioOptionAdd apartmentScenarioOptionAdd, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(apartmentScenarioOptionAdd);
        if (realmObjectProxy != null) {
            return (ApartmentScenarioOptionAdd) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ApartmentScenarioOptionAdd.class), apartmentScenarioOptionAddColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(apartmentScenarioOptionAddColumnInfo.temperatureIndex, apartmentScenarioOptionAdd.realmGet$temperature());
        C4798x7bd56e2e newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(apartmentScenarioOptionAdd, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ApartmentScenarioOptionAdd apartmentScenarioOptionAdd, Map<RealmModel, Long> map) {
        if (apartmentScenarioOptionAdd instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentScenarioOptionAdd;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ApartmentScenarioOptionAdd.class);
        long nativePtr = table.getNativePtr();
        ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo = (ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class);
        long createRow = OsObject.createRow(table);
        map.put(apartmentScenarioOptionAdd, Long.valueOf(createRow));
        String realmGet$temperature = apartmentScenarioOptionAdd.realmGet$temperature();
        if (realmGet$temperature != null) {
            Table.nativeSetString(nativePtr, apartmentScenarioOptionAddColumnInfo.temperatureIndex, createRow, realmGet$temperature, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ApartmentScenarioOptionAdd.class);
        long nativePtr = table.getNativePtr();
        ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo = (ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class);
        while (it.hasNext()) {
            ApartmentScenarioOptionAdd apartmentScenarioOptionAdd = (ApartmentScenarioOptionAdd) it.next();
            if (!map.containsKey(apartmentScenarioOptionAdd)) {
                if (apartmentScenarioOptionAdd instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentScenarioOptionAdd;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(apartmentScenarioOptionAdd, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(apartmentScenarioOptionAdd, Long.valueOf(createRow));
                String realmGet$temperature = apartmentScenarioOptionAdd.realmGet$temperature();
                if (realmGet$temperature != null) {
                    Table.nativeSetString(nativePtr, apartmentScenarioOptionAddColumnInfo.temperatureIndex, createRow, realmGet$temperature, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ApartmentScenarioOptionAdd apartmentScenarioOptionAdd, Map<RealmModel, Long> map) {
        if (apartmentScenarioOptionAdd instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentScenarioOptionAdd;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ApartmentScenarioOptionAdd.class);
        long nativePtr = table.getNativePtr();
        ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo = (ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class);
        long createRow = OsObject.createRow(table);
        map.put(apartmentScenarioOptionAdd, Long.valueOf(createRow));
        String realmGet$temperature = apartmentScenarioOptionAdd.realmGet$temperature();
        if (realmGet$temperature != null) {
            Table.nativeSetString(nativePtr, apartmentScenarioOptionAddColumnInfo.temperatureIndex, createRow, realmGet$temperature, false);
        } else {
            Table.nativeSetNull(nativePtr, apartmentScenarioOptionAddColumnInfo.temperatureIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ApartmentScenarioOptionAdd.class);
        long nativePtr = table.getNativePtr();
        ApartmentScenarioOptionAddColumnInfo apartmentScenarioOptionAddColumnInfo = (ApartmentScenarioOptionAddColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ApartmentScenarioOptionAdd.class);
        while (it.hasNext()) {
            ApartmentScenarioOptionAdd apartmentScenarioOptionAdd = (ApartmentScenarioOptionAdd) it.next();
            if (!map.containsKey(apartmentScenarioOptionAdd)) {
                if (apartmentScenarioOptionAdd instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) apartmentScenarioOptionAdd;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(apartmentScenarioOptionAdd, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(apartmentScenarioOptionAdd, Long.valueOf(createRow));
                String realmGet$temperature = apartmentScenarioOptionAdd.realmGet$temperature();
                if (realmGet$temperature != null) {
                    Table.nativeSetString(nativePtr, apartmentScenarioOptionAddColumnInfo.temperatureIndex, createRow, realmGet$temperature, false);
                } else {
                    Table.nativeSetNull(nativePtr, apartmentScenarioOptionAddColumnInfo.temperatureIndex, createRow, false);
                }
            }
        }
    }

    public static ApartmentScenarioOptionAdd createDetachedCopy(ApartmentScenarioOptionAdd apartmentScenarioOptionAdd, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ApartmentScenarioOptionAdd apartmentScenarioOptionAdd2;
        if (i > i2 || apartmentScenarioOptionAdd == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(apartmentScenarioOptionAdd);
        if (cacheData == null) {
            apartmentScenarioOptionAdd2 = new ApartmentScenarioOptionAdd();
            map.put(apartmentScenarioOptionAdd, new RealmObjectProxy.CacheData(i, apartmentScenarioOptionAdd2));
        } else if (i >= cacheData.minDepth) {
            return (ApartmentScenarioOptionAdd) cacheData.object;
        } else {
            cacheData.minDepth = i;
            apartmentScenarioOptionAdd2 = (ApartmentScenarioOptionAdd) cacheData.object;
        }
        apartmentScenarioOptionAdd2.realmSet$temperature(apartmentScenarioOptionAdd.realmGet$temperature());
        return apartmentScenarioOptionAdd2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ApartmentScenarioOptionAdd = proxy[");
        sb.append("{temperature:");
        sb.append(realmGet$temperature() != null ? realmGet$temperature() : "null");
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
        C4798x7bd56e2e ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxy = (C4798x7bd56e2e) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_scenario_settings_apartmentscenariooptionaddrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
