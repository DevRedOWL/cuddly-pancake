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
import p035ru.unicorn.ujin.data.realm.Pamyatka;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy */
public class ru_unicorn_ujin_data_realm_PamyatkaRealmProxy extends Pamyatka implements RealmObjectProxy, ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PamyatkaColumnInfo columnInfo;
    private ProxyState<Pamyatka> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Pamyatka";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PamyatkaRealmProxy$PamyatkaColumnInfo */
    static final class PamyatkaColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long pamyatkaTitleIndex;
        long pamyatkaUrlIndex;

        PamyatkaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.pamyatkaUrlIndex = addColumnDetails("pamyatkaUrl", "pamyatkaUrl", objectSchemaInfo);
            this.pamyatkaTitleIndex = addColumnDetails("pamyatkaTitle", "pamyatkaTitle", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PamyatkaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PamyatkaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PamyatkaColumnInfo pamyatkaColumnInfo = (PamyatkaColumnInfo) columnInfo;
            PamyatkaColumnInfo pamyatkaColumnInfo2 = (PamyatkaColumnInfo) columnInfo2;
            pamyatkaColumnInfo2.pamyatkaUrlIndex = pamyatkaColumnInfo.pamyatkaUrlIndex;
            pamyatkaColumnInfo2.pamyatkaTitleIndex = pamyatkaColumnInfo.pamyatkaTitleIndex;
            pamyatkaColumnInfo2.maxColumnIndexValue = pamyatkaColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_PamyatkaRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PamyatkaColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$pamyatkaUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.pamyatkaUrlIndex);
    }

    public void realmSet$pamyatkaUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.pamyatkaUrlIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'pamyatkaUrl' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.pamyatkaUrlIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'pamyatkaUrl' to null.");
        }
    }

    public String realmGet$pamyatkaTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.pamyatkaTitleIndex);
    }

    public void realmSet$pamyatkaTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.pamyatkaTitleIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'pamyatkaTitle' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.pamyatkaTitleIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'pamyatkaTitle' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("pamyatkaUrl", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("pamyatkaTitle", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PamyatkaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PamyatkaColumnInfo(osSchemaInfo);
    }

    public static Pamyatka createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Pamyatka pamyatka = (Pamyatka) realm.createObjectInternal(Pamyatka.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
        if (jSONObject.has("pamyatkaUrl")) {
            if (jSONObject.isNull("pamyatkaUrl")) {
                ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaUrl((String) null);
            } else {
                ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaUrl(jSONObject.getString("pamyatkaUrl"));
            }
        }
        if (jSONObject.has("pamyatkaTitle")) {
            if (jSONObject.isNull("pamyatkaTitle")) {
                ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaTitle((String) null);
            } else {
                ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaTitle(jSONObject.getString("pamyatkaTitle"));
            }
        }
        return pamyatka;
    }

    public static Pamyatka createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Pamyatka pamyatka = new Pamyatka();
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("pamyatkaUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaUrl((String) null);
                }
            } else if (!nextName.equals("pamyatkaTitle")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaTitle(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaTitle((String) null);
            }
        }
        jsonReader.endObject();
        return (Pamyatka) realm.copyToRealm(pamyatka, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_PamyatkaRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxy ru_unicorn_ujin_data_realm_pamyatkarealmproxy = new ru_unicorn_ujin_data_realm_PamyatkaRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_pamyatkarealmproxy;
    }

    public static Pamyatka copyOrUpdate(Realm realm, PamyatkaColumnInfo pamyatkaColumnInfo, Pamyatka pamyatka, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (pamyatka instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pamyatka;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return pamyatka;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(pamyatka);
        if (realmObjectProxy2 != null) {
            return (Pamyatka) realmObjectProxy2;
        }
        return copy(realm, pamyatkaColumnInfo, pamyatka, z, map, set);
    }

    public static Pamyatka copy(Realm realm, PamyatkaColumnInfo pamyatkaColumnInfo, Pamyatka pamyatka, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(pamyatka);
        if (realmObjectProxy != null) {
            return (Pamyatka) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Pamyatka.class), pamyatkaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(pamyatkaColumnInfo.pamyatkaUrlIndex, ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaUrl());
        osObjectBuilder.addString(pamyatkaColumnInfo.pamyatkaTitleIndex, ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaTitle());
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(pamyatka, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Pamyatka pamyatka, Map<RealmModel, Long> map) {
        if (pamyatka instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pamyatka;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Pamyatka.class);
        long nativePtr = table.getNativePtr();
        PamyatkaColumnInfo pamyatkaColumnInfo = (PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class);
        long createRow = OsObject.createRow(table);
        map.put(pamyatka, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
        String realmGet$pamyatkaUrl = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaUrl();
        if (realmGet$pamyatkaUrl != null) {
            Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaUrlIndex, createRow, realmGet$pamyatkaUrl, false);
        }
        String realmGet$pamyatkaTitle = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaTitle();
        if (realmGet$pamyatkaTitle != null) {
            Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaTitleIndex, createRow, realmGet$pamyatkaTitle, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Pamyatka.class);
        long nativePtr = table.getNativePtr();
        PamyatkaColumnInfo pamyatkaColumnInfo = (PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class);
        while (it.hasNext()) {
            Pamyatka pamyatka = (Pamyatka) it.next();
            if (!map2.containsKey(pamyatka)) {
                if (pamyatka instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pamyatka;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(pamyatka, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(pamyatka, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
                String realmGet$pamyatkaUrl = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaUrl();
                if (realmGet$pamyatkaUrl != null) {
                    Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaUrlIndex, createRow, realmGet$pamyatkaUrl, false);
                }
                String realmGet$pamyatkaTitle = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaTitle();
                if (realmGet$pamyatkaTitle != null) {
                    Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaTitleIndex, createRow, realmGet$pamyatkaTitle, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Pamyatka pamyatka, Map<RealmModel, Long> map) {
        if (pamyatka instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pamyatka;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Pamyatka.class);
        long nativePtr = table.getNativePtr();
        PamyatkaColumnInfo pamyatkaColumnInfo = (PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class);
        long createRow = OsObject.createRow(table);
        map.put(pamyatka, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
        String realmGet$pamyatkaUrl = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaUrl();
        if (realmGet$pamyatkaUrl != null) {
            Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaUrlIndex, createRow, realmGet$pamyatkaUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, pamyatkaColumnInfo.pamyatkaUrlIndex, createRow, false);
        }
        String realmGet$pamyatkaTitle = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaTitle();
        if (realmGet$pamyatkaTitle != null) {
            Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaTitleIndex, createRow, realmGet$pamyatkaTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, pamyatkaColumnInfo.pamyatkaTitleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Pamyatka.class);
        long nativePtr = table.getNativePtr();
        PamyatkaColumnInfo pamyatkaColumnInfo = (PamyatkaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Pamyatka.class);
        while (it.hasNext()) {
            Pamyatka pamyatka = (Pamyatka) it.next();
            if (!map2.containsKey(pamyatka)) {
                if (pamyatka instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) pamyatka;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(pamyatka, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(pamyatka, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka;
                String realmGet$pamyatkaUrl = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaUrl();
                if (realmGet$pamyatkaUrl != null) {
                    Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaUrlIndex, createRow, realmGet$pamyatkaUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, pamyatkaColumnInfo.pamyatkaUrlIndex, createRow, false);
                }
                String realmGet$pamyatkaTitle = ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmGet$pamyatkaTitle();
                if (realmGet$pamyatkaTitle != null) {
                    Table.nativeSetString(nativePtr, pamyatkaColumnInfo.pamyatkaTitleIndex, createRow, realmGet$pamyatkaTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, pamyatkaColumnInfo.pamyatkaTitleIndex, createRow, false);
                }
            }
        }
    }

    public static Pamyatka createDetachedCopy(Pamyatka pamyatka, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Pamyatka pamyatka2;
        if (i > i2 || pamyatka == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(pamyatka);
        if (cacheData == null) {
            pamyatka2 = new Pamyatka();
            map.put(pamyatka, new RealmObjectProxy.CacheData(i, pamyatka2));
        } else if (i >= cacheData.minDepth) {
            return (Pamyatka) cacheData.object;
        } else {
            cacheData.minDepth = i;
            pamyatka2 = (Pamyatka) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface = pamyatka2;
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxyInterface ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface2 = pamyatka;
        ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaUrl(ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface2.realmGet$pamyatkaUrl());
        ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface.realmSet$pamyatkaTitle(ru_unicorn_ujin_data_realm_pamyatkarealmproxyinterface2.realmGet$pamyatkaTitle());
        return pamyatka2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Pamyatka = proxy[" + "{pamyatkaUrl:" + realmGet$pamyatkaUrl() + "}" + "," + "{pamyatkaTitle:" + realmGet$pamyatkaTitle() + "}" + "]";
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
        ru_unicorn_ujin_data_realm_PamyatkaRealmProxy ru_unicorn_ujin_data_realm_pamyatkarealmproxy = (ru_unicorn_ujin_data_realm_PamyatkaRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_pamyatkarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_pamyatkarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_pamyatkarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
