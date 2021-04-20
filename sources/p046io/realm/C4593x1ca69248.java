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
import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeData;
import p035ru.unicorn.ujin.data.api.response.authorization.RentConfirmCodeResponse;
import p046io.realm.BaseRealm;
import p046io.realm.C4591x4d164271;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeResponseRealmProxy */
public class C4593x1ca69248 extends RentConfirmCodeResponse implements RealmObjectProxy, C4594xeaad0bd1 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentConfirmCodeResponseColumnInfo columnInfo;
    private ProxyState<RentConfirmCodeResponse> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeResponseRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentConfirmCodeResponse";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeResponseRealmProxy$RentConfirmCodeResponseColumnInfo */
    static final class RentConfirmCodeResponseColumnInfo extends ColumnInfo {
        long commandIndex;
        long dataIndex;
        long errorIndex;
        long fromdomainIndex;
        long maxColumnIndexValue;
        long messageIndex;
        long tokenIndex;
        long worktimeIndex;

        RentConfirmCodeResponseColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.commandIndex = addColumnDetails("command", "command", objectSchemaInfo);
            this.errorIndex = addColumnDetails("error", "error", objectSchemaInfo);
            this.messageIndex = addColumnDetails("message", "message", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.fromdomainIndex = addColumnDetails("fromdomain", "fromdomain", objectSchemaInfo);
            this.worktimeIndex = addColumnDetails("worktime", "worktime", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentConfirmCodeResponseColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentConfirmCodeResponseColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo = (RentConfirmCodeResponseColumnInfo) columnInfo;
            RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo2 = (RentConfirmCodeResponseColumnInfo) columnInfo2;
            rentConfirmCodeResponseColumnInfo2.commandIndex = rentConfirmCodeResponseColumnInfo.commandIndex;
            rentConfirmCodeResponseColumnInfo2.errorIndex = rentConfirmCodeResponseColumnInfo.errorIndex;
            rentConfirmCodeResponseColumnInfo2.messageIndex = rentConfirmCodeResponseColumnInfo.messageIndex;
            rentConfirmCodeResponseColumnInfo2.tokenIndex = rentConfirmCodeResponseColumnInfo.tokenIndex;
            rentConfirmCodeResponseColumnInfo2.fromdomainIndex = rentConfirmCodeResponseColumnInfo.fromdomainIndex;
            rentConfirmCodeResponseColumnInfo2.worktimeIndex = rentConfirmCodeResponseColumnInfo.worktimeIndex;
            rentConfirmCodeResponseColumnInfo2.dataIndex = rentConfirmCodeResponseColumnInfo.dataIndex;
            rentConfirmCodeResponseColumnInfo2.maxColumnIndexValue = rentConfirmCodeResponseColumnInfo.maxColumnIndexValue;
        }
    }

    C4593x1ca69248() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentConfirmCodeResponseColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$command() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.commandIndex);
    }

    public void realmSet$command(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.commandIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.commandIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.commandIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.commandIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$error() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.errorIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.errorIndex));
    }

    public void realmSet$error(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.errorIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.errorIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.errorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.errorIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$message() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageIndex);
    }

    public void realmSet$message(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.messageIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'message' to null.");
        }
    }

    public String realmGet$token() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tokenIndex);
    }

    public void realmSet$token(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.tokenIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.tokenIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.tokenIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.tokenIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fromdomain() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fromdomainIndex);
    }

    public void realmSet$fromdomain(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fromdomainIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fromdomainIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fromdomainIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fromdomainIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$worktime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.worktimeIndex);
    }

    public void realmSet$worktime(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.worktimeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.worktimeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.worktimeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.worktimeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RentConfirmCodeData realmGet$data() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.dataIndex)) {
            return null;
        }
        return (RentConfirmCodeData) this.proxyState.getRealm$realm().get(RentConfirmCodeData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.dataIndex), false, Collections.emptyList());
    }

    public void realmSet$data(RentConfirmCodeData rentConfirmCodeData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentConfirmCodeData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.dataIndex);
                return;
            }
            this.proxyState.checkValidObject(rentConfirmCodeData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.dataIndex, ((RealmObjectProxy) rentConfirmCodeData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("data")) {
            if (rentConfirmCodeData != null && !RealmObject.isManaged(rentConfirmCodeData)) {
                rentConfirmCodeData = (RentConfirmCodeData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentConfirmCodeData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentConfirmCodeData == null) {
                row$realm.nullifyLink(this.columnInfo.dataIndex);
                return;
            }
            this.proxyState.checkValidObject(rentConfirmCodeData);
            row$realm.getTable().setLink(this.columnInfo.dataIndex, row$realm.getIndex(), ((RealmObjectProxy) rentConfirmCodeData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("command", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("error", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("message", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("token", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fromdomain", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("worktime", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("data", RealmFieldType.OBJECT, C4591x4d164271.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentConfirmCodeResponseColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentConfirmCodeResponseColumnInfo(osSchemaInfo);
    }

    public static RentConfirmCodeResponse createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("data")) {
            arrayList.add("data");
        }
        RentConfirmCodeResponse rentConfirmCodeResponse = (RentConfirmCodeResponse) realm.createObjectInternal(RentConfirmCodeResponse.class, true, arrayList);
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse;
        if (jSONObject.has("command")) {
            if (jSONObject.isNull("command")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$command((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$command(jSONObject.getString("command"));
            }
        }
        if (jSONObject.has("error")) {
            if (jSONObject.isNull("error")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$error((Integer) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$error(Integer.valueOf(jSONObject.getInt("error")));
            }
        }
        if (jSONObject.has("message")) {
            if (jSONObject.isNull("message")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$message((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$message(jSONObject.getString("message"));
            }
        }
        if (jSONObject.has("token")) {
            if (jSONObject.isNull("token")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$token((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$token(jSONObject.getString("token"));
            }
        }
        if (jSONObject.has("fromdomain")) {
            if (jSONObject.isNull("fromdomain")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$fromdomain((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$fromdomain(jSONObject.getString("fromdomain"));
            }
        }
        if (jSONObject.has("worktime")) {
            if (jSONObject.isNull("worktime")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$worktime((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$worktime(jSONObject.getString("worktime"));
            }
        }
        if (jSONObject.has("data")) {
            if (jSONObject.isNull("data")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$data((RentConfirmCodeData) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$data(C4591x4d164271.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("data"), z));
            }
        }
        return rentConfirmCodeResponse;
    }

    public static RentConfirmCodeResponse createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentConfirmCodeResponse rentConfirmCodeResponse = new RentConfirmCodeResponse();
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("command")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$command(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$command((String) null);
                }
            } else if (nextName.equals("error")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$error(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$error((Integer) null);
                }
            } else if (nextName.equals("message")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$message(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$message((String) null);
                }
            } else if (nextName.equals("token")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$token(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$token((String) null);
                }
            } else if (nextName.equals("fromdomain")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$fromdomain(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$fromdomain((String) null);
                }
            } else if (nextName.equals("worktime")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$worktime(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$worktime((String) null);
                }
            } else if (!nextName.equals("data")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$data((RentConfirmCodeData) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$data(C4591x4d164271.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (RentConfirmCodeResponse) realm.copyToRealm(rentConfirmCodeResponse, new ImportFlag[0]);
    }

    private static C4593x1ca69248 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeResponse.class), false, Collections.emptyList());
        C4593x1ca69248 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxy = new C4593x1ca69248();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxy;
    }

    public static RentConfirmCodeResponse copyOrUpdate(Realm realm, RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo, RentConfirmCodeResponse rentConfirmCodeResponse, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentConfirmCodeResponse instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeResponse;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentConfirmCodeResponse;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentConfirmCodeResponse);
        if (realmObjectProxy2 != null) {
            return (RentConfirmCodeResponse) realmObjectProxy2;
        }
        return copy(realm, rentConfirmCodeResponseColumnInfo, rentConfirmCodeResponse, z, map, set);
    }

    public static RentConfirmCodeResponse copy(Realm realm, RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo, RentConfirmCodeResponse rentConfirmCodeResponse, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentConfirmCodeResponse);
        if (realmObjectProxy != null) {
            return (RentConfirmCodeResponse) realmObjectProxy;
        }
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentConfirmCodeResponse.class), rentConfirmCodeResponseColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentConfirmCodeResponseColumnInfo.commandIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$command());
        osObjectBuilder.addInteger(rentConfirmCodeResponseColumnInfo.errorIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$error());
        osObjectBuilder.addString(rentConfirmCodeResponseColumnInfo.messageIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$message());
        osObjectBuilder.addString(rentConfirmCodeResponseColumnInfo.tokenIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$token());
        osObjectBuilder.addString(rentConfirmCodeResponseColumnInfo.fromdomainIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$fromdomain());
        osObjectBuilder.addString(rentConfirmCodeResponseColumnInfo.worktimeIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$worktime());
        C4593x1ca69248 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentConfirmCodeResponse, newProxyInstance);
        RentConfirmCodeData realmGet$data = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$data();
        if (realmGet$data == null) {
            newProxyInstance.realmSet$data((RentConfirmCodeData) null);
        } else {
            RentConfirmCodeData rentConfirmCodeData = (RentConfirmCodeData) map.get(realmGet$data);
            if (rentConfirmCodeData != null) {
                newProxyInstance.realmSet$data(rentConfirmCodeData);
            } else {
                newProxyInstance.realmSet$data(C4591x4d164271.copyOrUpdate(realm, (C4591x4d164271.RentConfirmCodeDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class), realmGet$data, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentConfirmCodeResponse rentConfirmCodeResponse, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentConfirmCodeResponse rentConfirmCodeResponse2 = rentConfirmCodeResponse;
        Map<RealmModel, Long> map2 = map;
        if (rentConfirmCodeResponse2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeResponse2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentConfirmCodeResponse.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo = (RentConfirmCodeResponseColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeResponse.class);
        long createRow = OsObject.createRow(table);
        map2.put(rentConfirmCodeResponse2, Long.valueOf(createRow));
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse2;
        String realmGet$command = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$command();
        if (realmGet$command != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.commandIndex, createRow, realmGet$command, false);
        }
        Integer realmGet$error = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$error();
        if (realmGet$error != null) {
            Table.nativeSetLong(nativePtr, rentConfirmCodeResponseColumnInfo.errorIndex, createRow, realmGet$error.longValue(), false);
        }
        String realmGet$message = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.messageIndex, createRow, realmGet$message, false);
        }
        String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.tokenIndex, createRow, realmGet$token, false);
        }
        String realmGet$fromdomain = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$fromdomain();
        if (realmGet$fromdomain != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.fromdomainIndex, createRow, realmGet$fromdomain, false);
        }
        String realmGet$worktime = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$worktime();
        if (realmGet$worktime != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.worktimeIndex, createRow, realmGet$worktime, false);
        }
        RentConfirmCodeData realmGet$data = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$data();
        if (realmGet$data != null) {
            Long l = map2.get(realmGet$data);
            if (l == null) {
                l = Long.valueOf(C4591x4d164271.insert(realm2, realmGet$data, map2));
            }
            Table.nativeSetLink(nativePtr, rentConfirmCodeResponseColumnInfo.dataIndex, createRow, l.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentConfirmCodeResponse.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo = (RentConfirmCodeResponseColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeResponse.class);
        while (it.hasNext()) {
            RentConfirmCodeResponse rentConfirmCodeResponse = (RentConfirmCodeResponse) it.next();
            if (!map2.containsKey(rentConfirmCodeResponse)) {
                if (rentConfirmCodeResponse instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeResponse;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentConfirmCodeResponse, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentConfirmCodeResponse, Long.valueOf(createRow));
                C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse;
                String realmGet$command = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$command();
                if (realmGet$command != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.commandIndex, createRow, realmGet$command, false);
                }
                Integer realmGet$error = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$error();
                if (realmGet$error != null) {
                    Table.nativeSetLong(nativePtr, rentConfirmCodeResponseColumnInfo.errorIndex, createRow, realmGet$error.longValue(), false);
                }
                String realmGet$message = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.messageIndex, createRow, realmGet$message, false);
                }
                String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.tokenIndex, createRow, realmGet$token, false);
                }
                String realmGet$fromdomain = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$fromdomain();
                if (realmGet$fromdomain != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.fromdomainIndex, createRow, realmGet$fromdomain, false);
                }
                String realmGet$worktime = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$worktime();
                if (realmGet$worktime != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.worktimeIndex, createRow, realmGet$worktime, false);
                }
                RentConfirmCodeData realmGet$data = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$data();
                if (realmGet$data != null) {
                    Long l = map2.get(realmGet$data);
                    if (l == null) {
                        l = Long.valueOf(C4591x4d164271.insert(realm2, realmGet$data, map2));
                    }
                    table.setLink(rentConfirmCodeResponseColumnInfo.dataIndex, createRow, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentConfirmCodeResponse rentConfirmCodeResponse, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentConfirmCodeResponse rentConfirmCodeResponse2 = rentConfirmCodeResponse;
        Map<RealmModel, Long> map2 = map;
        if (rentConfirmCodeResponse2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeResponse2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentConfirmCodeResponse.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo = (RentConfirmCodeResponseColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeResponse.class);
        long createRow = OsObject.createRow(table);
        map2.put(rentConfirmCodeResponse2, Long.valueOf(createRow));
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse2;
        String realmGet$command = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$command();
        if (realmGet$command != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.commandIndex, createRow, realmGet$command, false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.commandIndex, createRow, false);
        }
        Integer realmGet$error = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$error();
        if (realmGet$error != null) {
            Table.nativeSetLong(nativePtr, rentConfirmCodeResponseColumnInfo.errorIndex, createRow, realmGet$error.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.errorIndex, createRow, false);
        }
        String realmGet$message = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$message();
        if (realmGet$message != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.messageIndex, createRow, realmGet$message, false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.messageIndex, createRow, false);
        }
        String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.tokenIndex, createRow, realmGet$token, false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.tokenIndex, createRow, false);
        }
        String realmGet$fromdomain = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$fromdomain();
        if (realmGet$fromdomain != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.fromdomainIndex, createRow, realmGet$fromdomain, false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.fromdomainIndex, createRow, false);
        }
        String realmGet$worktime = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$worktime();
        if (realmGet$worktime != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.worktimeIndex, createRow, realmGet$worktime, false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.worktimeIndex, createRow, false);
        }
        RentConfirmCodeData realmGet$data = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$data();
        if (realmGet$data != null) {
            Long l = map2.get(realmGet$data);
            if (l == null) {
                l = Long.valueOf(C4591x4d164271.insertOrUpdate(realm2, realmGet$data, map2));
            }
            Table.nativeSetLink(nativePtr, rentConfirmCodeResponseColumnInfo.dataIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentConfirmCodeResponseColumnInfo.dataIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentConfirmCodeResponse.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeResponseColumnInfo rentConfirmCodeResponseColumnInfo = (RentConfirmCodeResponseColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeResponse.class);
        while (it.hasNext()) {
            RentConfirmCodeResponse rentConfirmCodeResponse = (RentConfirmCodeResponse) it.next();
            if (!map2.containsKey(rentConfirmCodeResponse)) {
                if (rentConfirmCodeResponse instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeResponse;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentConfirmCodeResponse, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentConfirmCodeResponse, Long.valueOf(createRow));
                C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse;
                String realmGet$command = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$command();
                if (realmGet$command != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.commandIndex, createRow, realmGet$command, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.commandIndex, createRow, false);
                }
                Integer realmGet$error = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$error();
                if (realmGet$error != null) {
                    Table.nativeSetLong(nativePtr, rentConfirmCodeResponseColumnInfo.errorIndex, createRow, realmGet$error.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.errorIndex, createRow, false);
                }
                String realmGet$message = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$message();
                if (realmGet$message != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.messageIndex, createRow, realmGet$message, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.messageIndex, createRow, false);
                }
                String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.tokenIndex, createRow, realmGet$token, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.tokenIndex, createRow, false);
                }
                String realmGet$fromdomain = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$fromdomain();
                if (realmGet$fromdomain != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.fromdomainIndex, createRow, realmGet$fromdomain, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.fromdomainIndex, createRow, false);
                }
                String realmGet$worktime = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$worktime();
                if (realmGet$worktime != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeResponseColumnInfo.worktimeIndex, createRow, realmGet$worktime, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeResponseColumnInfo.worktimeIndex, createRow, false);
                }
                RentConfirmCodeData realmGet$data = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmGet$data();
                if (realmGet$data != null) {
                    Long l = map2.get(realmGet$data);
                    if (l == null) {
                        l = Long.valueOf(C4591x4d164271.insertOrUpdate(realm2, realmGet$data, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentConfirmCodeResponseColumnInfo.dataIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentConfirmCodeResponseColumnInfo.dataIndex, createRow);
                }
            }
        }
    }

    public static RentConfirmCodeResponse createDetachedCopy(RentConfirmCodeResponse rentConfirmCodeResponse, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentConfirmCodeResponse rentConfirmCodeResponse2;
        if (i > i2 || rentConfirmCodeResponse == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentConfirmCodeResponse);
        if (cacheData == null) {
            rentConfirmCodeResponse2 = new RentConfirmCodeResponse();
            map.put(rentConfirmCodeResponse, new RealmObjectProxy.CacheData(i, rentConfirmCodeResponse2));
        } else if (i >= cacheData.minDepth) {
            return (RentConfirmCodeResponse) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentConfirmCodeResponse2 = (RentConfirmCodeResponse) cacheData.object;
        }
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface = rentConfirmCodeResponse2;
        C4594xeaad0bd1 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2 = rentConfirmCodeResponse;
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$command(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$command());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$error(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$error());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$message(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$message());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$token(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$token());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$fromdomain(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$fromdomain());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$worktime(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$worktime());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface.realmSet$data(C4591x4d164271.createDetachedCopy(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxyinterface2.realmGet$data(), i + 1, i2, map));
        return rentConfirmCodeResponse2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentConfirmCodeResponse = proxy[");
        sb.append("{command:");
        String str = "null";
        sb.append(realmGet$command() != null ? realmGet$command() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{error:");
        sb.append(realmGet$error() != null ? realmGet$error() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{message:");
        sb.append(realmGet$message());
        sb.append("}");
        sb.append(",");
        sb.append("{token:");
        sb.append(realmGet$token() != null ? realmGet$token() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fromdomain:");
        sb.append(realmGet$fromdomain() != null ? realmGet$fromdomain() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{worktime:");
        sb.append(realmGet$worktime() != null ? realmGet$worktime() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{data:");
        if (realmGet$data() != null) {
            str = C4591x4d164271.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4593x1ca69248 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxy = (C4593x1ca69248) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_api_response_authorization_rentconfirmcoderesponserealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
