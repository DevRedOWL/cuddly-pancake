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
import p035ru.unicorn.ujin.data.api.response.marketplace.RedeemCodeResponseData;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_api_response_marketplace_RedeemCodeResponseDataRealmProxy */
public class C4595x5d0db86d extends RedeemCodeResponseData implements RealmObjectProxy, C4596x638dff4c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RedeemCodeResponseDataColumnInfo columnInfo;
    private ProxyState<RedeemCodeResponseData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_marketplace_RedeemCodeResponseDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RedeemCodeResponseData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_marketplace_RedeemCodeResponseDataRealmProxy$RedeemCodeResponseDataColumnInfo */
    static final class RedeemCodeResponseDataColumnInfo extends ColumnInfo {
        long codeIndex;
        long maxColumnIndexValue;

        RedeemCodeResponseDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.codeIndex = addColumnDetails("code", "code", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RedeemCodeResponseDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RedeemCodeResponseDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo = (RedeemCodeResponseDataColumnInfo) columnInfo;
            RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo2 = (RedeemCodeResponseDataColumnInfo) columnInfo2;
            redeemCodeResponseDataColumnInfo2.codeIndex = redeemCodeResponseDataColumnInfo.codeIndex;
            redeemCodeResponseDataColumnInfo2.maxColumnIndexValue = redeemCodeResponseDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4595x5d0db86d() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RedeemCodeResponseDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RedeemedCode realmGet$code() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.codeIndex)) {
            return null;
        }
        return (RedeemedCode) this.proxyState.getRealm$realm().get(RedeemedCode.class, this.proxyState.getRow$realm().getLink(this.columnInfo.codeIndex), false, Collections.emptyList());
    }

    public void realmSet$code(RedeemedCode redeemedCode) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (redeemedCode == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.codeIndex);
                return;
            }
            this.proxyState.checkValidObject(redeemedCode);
            this.proxyState.getRow$realm().setLink(this.columnInfo.codeIndex, ((RealmObjectProxy) redeemedCode).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("code")) {
            if (redeemedCode != null && !RealmObject.isManaged(redeemedCode)) {
                redeemedCode = (RedeemedCode) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(redeemedCode, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (redeemedCode == null) {
                row$realm.nullifyLink(this.columnInfo.codeIndex);
                return;
            }
            this.proxyState.checkValidObject(redeemedCode);
            row$realm.getTable().setLink(this.columnInfo.codeIndex, row$realm.getIndex(), ((RealmObjectProxy) redeemedCode).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty("code", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RedeemCodeResponseDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RedeemCodeResponseDataColumnInfo(osSchemaInfo);
    }

    public static RedeemCodeResponseData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("code")) {
            arrayList.add("code");
        }
        RedeemCodeResponseData redeemCodeResponseData = (RedeemCodeResponseData) realm.createObjectInternal(RedeemCodeResponseData.class, true, arrayList);
        C4596x638dff4c ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxyinterface = redeemCodeResponseData;
        if (jSONObject.has("code")) {
            if (jSONObject.isNull("code")) {
                ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxyinterface.realmSet$code((RedeemedCode) null);
            } else {
                ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxyinterface.realmSet$code(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("code"), z));
            }
        }
        return redeemCodeResponseData;
    }

    public static RedeemCodeResponseData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RedeemCodeResponseData redeemCodeResponseData = new RedeemCodeResponseData();
        C4596x638dff4c ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxyinterface = redeemCodeResponseData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("code")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxyinterface.realmSet$code((RedeemedCode) null);
            } else {
                ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxyinterface.realmSet$code(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (RedeemCodeResponseData) realm.copyToRealm(redeemCodeResponseData, new ImportFlag[0]);
    }

    private static C4595x5d0db86d newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemCodeResponseData.class), false, Collections.emptyList());
        C4595x5d0db86d ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxy = new C4595x5d0db86d();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxy;
    }

    public static RedeemCodeResponseData copyOrUpdate(Realm realm, RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo, RedeemCodeResponseData redeemCodeResponseData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (redeemCodeResponseData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemCodeResponseData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return redeemCodeResponseData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(redeemCodeResponseData);
        if (realmObjectProxy2 != null) {
            return (RedeemCodeResponseData) realmObjectProxy2;
        }
        return copy(realm, redeemCodeResponseDataColumnInfo, redeemCodeResponseData, z, map, set);
    }

    public static RedeemCodeResponseData copy(Realm realm, RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo, RedeemCodeResponseData redeemCodeResponseData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(redeemCodeResponseData);
        if (realmObjectProxy != null) {
            return (RedeemCodeResponseData) realmObjectProxy;
        }
        C4595x5d0db86d newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(RedeemCodeResponseData.class), redeemCodeResponseDataColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(redeemCodeResponseData, newProxyInstance);
        RedeemedCode realmGet$code = redeemCodeResponseData.realmGet$code();
        if (realmGet$code == null) {
            newProxyInstance.realmSet$code((RedeemedCode) null);
        } else {
            RedeemedCode redeemedCode = (RedeemedCode) map.get(realmGet$code);
            if (redeemedCode != null) {
                newProxyInstance.realmSet$code(redeemedCode);
            } else {
                newProxyInstance.realmSet$code(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class), realmGet$code, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RedeemCodeResponseData redeemCodeResponseData, Map<RealmModel, Long> map) {
        if (redeemCodeResponseData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemCodeResponseData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RedeemCodeResponseData.class);
        long nativePtr = table.getNativePtr();
        RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo = (RedeemCodeResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemCodeResponseData.class);
        long createRow = OsObject.createRow(table);
        map.put(redeemCodeResponseData, Long.valueOf(createRow));
        RedeemedCode realmGet$code = redeemCodeResponseData.realmGet$code();
        if (realmGet$code != null) {
            Long l = map.get(realmGet$code);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm, realmGet$code, map));
            }
            Table.nativeSetLink(nativePtr, redeemCodeResponseDataColumnInfo.codeIndex, createRow, l.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(RedeemCodeResponseData.class);
        table.getNativePtr();
        RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo = (RedeemCodeResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemCodeResponseData.class);
        while (it.hasNext()) {
            RedeemCodeResponseData redeemCodeResponseData = (RedeemCodeResponseData) it.next();
            if (!map.containsKey(redeemCodeResponseData)) {
                if (redeemCodeResponseData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemCodeResponseData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(redeemCodeResponseData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(redeemCodeResponseData, Long.valueOf(createRow));
                RedeemedCode realmGet$code = redeemCodeResponseData.realmGet$code();
                if (realmGet$code != null) {
                    Long l = map.get(realmGet$code);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm, realmGet$code, map));
                    }
                    table.setLink(redeemCodeResponseDataColumnInfo.codeIndex, createRow, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RedeemCodeResponseData redeemCodeResponseData, Map<RealmModel, Long> map) {
        if (redeemCodeResponseData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemCodeResponseData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RedeemCodeResponseData.class);
        long nativePtr = table.getNativePtr();
        RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo = (RedeemCodeResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemCodeResponseData.class);
        long createRow = OsObject.createRow(table);
        map.put(redeemCodeResponseData, Long.valueOf(createRow));
        RedeemedCode realmGet$code = redeemCodeResponseData.realmGet$code();
        if (realmGet$code != null) {
            Long l = map.get(realmGet$code);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm, realmGet$code, map));
            }
            Table.nativeSetLink(nativePtr, redeemCodeResponseDataColumnInfo.codeIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, redeemCodeResponseDataColumnInfo.codeIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(RedeemCodeResponseData.class);
        long nativePtr = table.getNativePtr();
        RedeemCodeResponseDataColumnInfo redeemCodeResponseDataColumnInfo = (RedeemCodeResponseDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemCodeResponseData.class);
        while (it.hasNext()) {
            RedeemCodeResponseData redeemCodeResponseData = (RedeemCodeResponseData) it.next();
            if (!map.containsKey(redeemCodeResponseData)) {
                if (redeemCodeResponseData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) redeemCodeResponseData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(redeemCodeResponseData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(redeemCodeResponseData, Long.valueOf(createRow));
                RedeemedCode realmGet$code = redeemCodeResponseData.realmGet$code();
                if (realmGet$code != null) {
                    Long l = map.get(realmGet$code);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm, realmGet$code, map));
                    }
                    Table.nativeSetLink(nativePtr, redeemCodeResponseDataColumnInfo.codeIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, redeemCodeResponseDataColumnInfo.codeIndex, createRow);
                }
            }
        }
    }

    public static RedeemCodeResponseData createDetachedCopy(RedeemCodeResponseData redeemCodeResponseData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RedeemCodeResponseData redeemCodeResponseData2;
        if (i > i2 || redeemCodeResponseData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(redeemCodeResponseData);
        if (cacheData == null) {
            redeemCodeResponseData2 = new RedeemCodeResponseData();
            map.put(redeemCodeResponseData, new RealmObjectProxy.CacheData(i, redeemCodeResponseData2));
        } else if (i >= cacheData.minDepth) {
            return (RedeemCodeResponseData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            redeemCodeResponseData2 = (RedeemCodeResponseData) cacheData.object;
        }
        redeemCodeResponseData2.realmSet$code(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createDetachedCopy(redeemCodeResponseData.realmGet$code(), i + 1, i2, map));
        return redeemCodeResponseData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RedeemCodeResponseData = proxy[");
        sb.append("{code:");
        sb.append(realmGet$code() != null ? ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
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
        C4595x5d0db86d ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxy = (C4595x5d0db86d) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_api_response_marketplace_redeemcoderesponsedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
