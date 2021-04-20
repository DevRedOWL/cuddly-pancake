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
import p035ru.unicorn.ujin.data.realm.SipOpenDoorParam;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy */
public class ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy extends SipOpenDoorParam implements RealmObjectProxy, ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SipOpenDoorParamColumnInfo columnInfo;
    private ProxyState<SipOpenDoorParam> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SipOpenDoorParam";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy$SipOpenDoorParamColumnInfo */
    static final class SipOpenDoorParamColumnInfo extends ColumnInfo {
        long dtmfIndex;
        long maxColumnIndexValue;
        long openDoorUrlIndex;

        SipOpenDoorParamColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.dtmfIndex = addColumnDetails(SipParametrs.DTMF, SipParametrs.DTMF, objectSchemaInfo);
            this.openDoorUrlIndex = addColumnDetails("openDoorUrl", "openDoorUrl", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SipOpenDoorParamColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SipOpenDoorParamColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo = (SipOpenDoorParamColumnInfo) columnInfo;
            SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo2 = (SipOpenDoorParamColumnInfo) columnInfo2;
            sipOpenDoorParamColumnInfo2.dtmfIndex = sipOpenDoorParamColumnInfo.dtmfIndex;
            sipOpenDoorParamColumnInfo2.openDoorUrlIndex = sipOpenDoorParamColumnInfo.openDoorUrlIndex;
            sipOpenDoorParamColumnInfo2.maxColumnIndexValue = sipOpenDoorParamColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SipOpenDoorParamColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$dtmf() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dtmfIndex);
    }

    public void realmSet$dtmf(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dtmfIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dtmfIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dtmfIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dtmfIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$openDoorUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.openDoorUrlIndex);
    }

    public void realmSet$openDoorUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.openDoorUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.openDoorUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.openDoorUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.openDoorUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty(SipParametrs.DTMF, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("openDoorUrl", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SipOpenDoorParamColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SipOpenDoorParamColumnInfo(osSchemaInfo);
    }

    public static SipOpenDoorParam createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SipOpenDoorParam sipOpenDoorParam = (SipOpenDoorParam) realm.createObjectInternal(SipOpenDoorParam.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
        if (jSONObject.has(SipParametrs.DTMF)) {
            if (jSONObject.isNull(SipParametrs.DTMF)) {
                ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$dtmf((String) null);
            } else {
                ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$dtmf(jSONObject.getString(SipParametrs.DTMF));
            }
        }
        if (jSONObject.has("openDoorUrl")) {
            if (jSONObject.isNull("openDoorUrl")) {
                ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$openDoorUrl((String) null);
            } else {
                ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$openDoorUrl(jSONObject.getString("openDoorUrl"));
            }
        }
        return sipOpenDoorParam;
    }

    public static SipOpenDoorParam createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SipOpenDoorParam sipOpenDoorParam = new SipOpenDoorParam();
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(SipParametrs.DTMF)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$dtmf(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$dtmf((String) null);
                }
            } else if (!nextName.equals("openDoorUrl")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$openDoorUrl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$openDoorUrl((String) null);
            }
        }
        jsonReader.endObject();
        return (SipOpenDoorParam) realm.copyToRealm(sipOpenDoorParam, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxy = new ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxy;
    }

    public static SipOpenDoorParam copyOrUpdate(Realm realm, SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo, SipOpenDoorParam sipOpenDoorParam, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (sipOpenDoorParam instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipOpenDoorParam;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return sipOpenDoorParam;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(sipOpenDoorParam);
        if (realmObjectProxy2 != null) {
            return (SipOpenDoorParam) realmObjectProxy2;
        }
        return copy(realm, sipOpenDoorParamColumnInfo, sipOpenDoorParam, z, map, set);
    }

    public static SipOpenDoorParam copy(Realm realm, SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo, SipOpenDoorParam sipOpenDoorParam, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(sipOpenDoorParam);
        if (realmObjectProxy != null) {
            return (SipOpenDoorParam) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SipOpenDoorParam.class), sipOpenDoorParamColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(sipOpenDoorParamColumnInfo.dtmfIndex, ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$dtmf());
        osObjectBuilder.addString(sipOpenDoorParamColumnInfo.openDoorUrlIndex, ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$openDoorUrl());
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(sipOpenDoorParam, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SipOpenDoorParam sipOpenDoorParam, Map<RealmModel, Long> map) {
        if (sipOpenDoorParam instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipOpenDoorParam;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SipOpenDoorParam.class);
        long nativePtr = table.getNativePtr();
        SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo = (SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class);
        long createRow = OsObject.createRow(table);
        map.put(sipOpenDoorParam, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
        String realmGet$dtmf = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$dtmf();
        if (realmGet$dtmf != null) {
            Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.dtmfIndex, createRow, realmGet$dtmf, false);
        }
        String realmGet$openDoorUrl = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$openDoorUrl();
        if (realmGet$openDoorUrl != null) {
            Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.openDoorUrlIndex, createRow, realmGet$openDoorUrl, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SipOpenDoorParam.class);
        long nativePtr = table.getNativePtr();
        SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo = (SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class);
        while (it.hasNext()) {
            SipOpenDoorParam sipOpenDoorParam = (SipOpenDoorParam) it.next();
            if (!map2.containsKey(sipOpenDoorParam)) {
                if (sipOpenDoorParam instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipOpenDoorParam;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sipOpenDoorParam, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(sipOpenDoorParam, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
                String realmGet$dtmf = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$dtmf();
                if (realmGet$dtmf != null) {
                    Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.dtmfIndex, createRow, realmGet$dtmf, false);
                }
                String realmGet$openDoorUrl = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$openDoorUrl();
                if (realmGet$openDoorUrl != null) {
                    Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.openDoorUrlIndex, createRow, realmGet$openDoorUrl, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SipOpenDoorParam sipOpenDoorParam, Map<RealmModel, Long> map) {
        if (sipOpenDoorParam instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipOpenDoorParam;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SipOpenDoorParam.class);
        long nativePtr = table.getNativePtr();
        SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo = (SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class);
        long createRow = OsObject.createRow(table);
        map.put(sipOpenDoorParam, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
        String realmGet$dtmf = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$dtmf();
        if (realmGet$dtmf != null) {
            Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.dtmfIndex, createRow, realmGet$dtmf, false);
        } else {
            Table.nativeSetNull(nativePtr, sipOpenDoorParamColumnInfo.dtmfIndex, createRow, false);
        }
        String realmGet$openDoorUrl = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$openDoorUrl();
        if (realmGet$openDoorUrl != null) {
            Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.openDoorUrlIndex, createRow, realmGet$openDoorUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, sipOpenDoorParamColumnInfo.openDoorUrlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SipOpenDoorParam.class);
        long nativePtr = table.getNativePtr();
        SipOpenDoorParamColumnInfo sipOpenDoorParamColumnInfo = (SipOpenDoorParamColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SipOpenDoorParam.class);
        while (it.hasNext()) {
            SipOpenDoorParam sipOpenDoorParam = (SipOpenDoorParam) it.next();
            if (!map2.containsKey(sipOpenDoorParam)) {
                if (sipOpenDoorParam instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sipOpenDoorParam;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sipOpenDoorParam, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(sipOpenDoorParam, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam;
                String realmGet$dtmf = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$dtmf();
                if (realmGet$dtmf != null) {
                    Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.dtmfIndex, createRow, realmGet$dtmf, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipOpenDoorParamColumnInfo.dtmfIndex, createRow, false);
                }
                String realmGet$openDoorUrl = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmGet$openDoorUrl();
                if (realmGet$openDoorUrl != null) {
                    Table.nativeSetString(nativePtr, sipOpenDoorParamColumnInfo.openDoorUrlIndex, createRow, realmGet$openDoorUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, sipOpenDoorParamColumnInfo.openDoorUrlIndex, createRow, false);
                }
            }
        }
    }

    public static SipOpenDoorParam createDetachedCopy(SipOpenDoorParam sipOpenDoorParam, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SipOpenDoorParam sipOpenDoorParam2;
        if (i > i2 || sipOpenDoorParam == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(sipOpenDoorParam);
        if (cacheData == null) {
            sipOpenDoorParam2 = new SipOpenDoorParam();
            map.put(sipOpenDoorParam, new RealmObjectProxy.CacheData(i, sipOpenDoorParam2));
        } else if (i >= cacheData.minDepth) {
            return (SipOpenDoorParam) cacheData.object;
        } else {
            cacheData.minDepth = i;
            sipOpenDoorParam2 = (SipOpenDoorParam) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface = sipOpenDoorParam2;
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxyInterface ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface2 = sipOpenDoorParam;
        ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$dtmf(ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface2.realmGet$dtmf());
        ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface.realmSet$openDoorUrl(ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxyinterface2.realmGet$openDoorUrl());
        return sipOpenDoorParam2;
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
        ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxy = (ru_unicorn_ujin_data_realm_SipOpenDoorParamRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_sipopendoorparamrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
