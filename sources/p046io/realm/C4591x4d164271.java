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
import p035ru.unicorn.ujin.data.realm.profile.User;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeDataRealmProxy */
public class C4591x4d164271 extends RentConfirmCodeData implements RealmObjectProxy, C4592x64a679c8 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentConfirmCodeDataColumnInfo columnInfo;
    private ProxyState<RentConfirmCodeData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentConfirmCodeData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_authorization_RentConfirmCodeDataRealmProxy$RentConfirmCodeDataColumnInfo */
    static final class RentConfirmCodeDataColumnInfo extends ColumnInfo {
        long codeConfirmedIndex;
        long maxColumnIndexValue;
        long tokenIndex;
        long userIndex;

        RentConfirmCodeDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.codeConfirmedIndex = addColumnDetails("codeConfirmed", "codeConfirmed", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.userIndex = addColumnDetails("user", "user", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentConfirmCodeDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentConfirmCodeDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo = (RentConfirmCodeDataColumnInfo) columnInfo;
            RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo2 = (RentConfirmCodeDataColumnInfo) columnInfo2;
            rentConfirmCodeDataColumnInfo2.codeConfirmedIndex = rentConfirmCodeDataColumnInfo.codeConfirmedIndex;
            rentConfirmCodeDataColumnInfo2.tokenIndex = rentConfirmCodeDataColumnInfo.tokenIndex;
            rentConfirmCodeDataColumnInfo2.userIndex = rentConfirmCodeDataColumnInfo.userIndex;
            rentConfirmCodeDataColumnInfo2.maxColumnIndexValue = rentConfirmCodeDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4591x4d164271() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentConfirmCodeDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public boolean realmGet$codeConfirmed() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.codeConfirmedIndex);
    }

    public void realmSet$codeConfirmed(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.codeConfirmedIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.codeConfirmedIndex, row$realm.getIndex(), z, true);
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

    public User realmGet$user() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.userIndex)) {
            return null;
        }
        return (User) this.proxyState.getRealm$realm().get(User.class, this.proxyState.getRow$realm().getLink(this.columnInfo.userIndex), false, Collections.emptyList());
    }

    public void realmSet$user(User user) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (user == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.userIndex);
                return;
            }
            this.proxyState.checkValidObject(user);
            this.proxyState.getRow$realm().setLink(this.columnInfo.userIndex, ((RealmObjectProxy) user).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("user")) {
            if (user != null && !RealmObject.isManaged(user)) {
                user = (User) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(user, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (user == null) {
                row$realm.nullifyLink(this.columnInfo.userIndex);
                return;
            }
            this.proxyState.checkValidObject(user);
            row$realm.getTable().setLink(this.columnInfo.userIndex, row$realm.getIndex(), ((RealmObjectProxy) user).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("codeConfirmed", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty("token", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_profile_UserRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentConfirmCodeDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentConfirmCodeDataColumnInfo(osSchemaInfo);
    }

    public static RentConfirmCodeData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("user")) {
            arrayList.add("user");
        }
        RentConfirmCodeData rentConfirmCodeData = (RentConfirmCodeData) realm.createObjectInternal(RentConfirmCodeData.class, true, arrayList);
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData;
        if (jSONObject.has("codeConfirmed")) {
            if (!jSONObject.isNull("codeConfirmed")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$codeConfirmed(jSONObject.getBoolean("codeConfirmed"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'codeConfirmed' to null.");
            }
        }
        if (jSONObject.has("token")) {
            if (jSONObject.isNull("token")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$token((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$token(jSONObject.getString("token"));
            }
        }
        if (jSONObject.has("user")) {
            if (jSONObject.isNull("user")) {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$user((User) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$user(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("user"), z));
            }
        }
        return rentConfirmCodeData;
    }

    public static RentConfirmCodeData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentConfirmCodeData rentConfirmCodeData = new RentConfirmCodeData();
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("codeConfirmed")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$codeConfirmed(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'codeConfirmed' to null.");
                }
            } else if (nextName.equals("token")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$token(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$token((String) null);
                }
            } else if (!nextName.equals("user")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$user((User) null);
            } else {
                ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$user(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (RentConfirmCodeData) realm.copyToRealm(rentConfirmCodeData, new ImportFlag[0]);
    }

    private static C4591x4d164271 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class), false, Collections.emptyList());
        C4591x4d164271 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxy = new C4591x4d164271();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxy;
    }

    public static RentConfirmCodeData copyOrUpdate(Realm realm, RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo, RentConfirmCodeData rentConfirmCodeData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentConfirmCodeData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentConfirmCodeData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentConfirmCodeData);
        if (realmObjectProxy2 != null) {
            return (RentConfirmCodeData) realmObjectProxy2;
        }
        return copy(realm, rentConfirmCodeDataColumnInfo, rentConfirmCodeData, z, map, set);
    }

    public static RentConfirmCodeData copy(Realm realm, RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo, RentConfirmCodeData rentConfirmCodeData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentConfirmCodeData);
        if (realmObjectProxy != null) {
            return (RentConfirmCodeData) realmObjectProxy;
        }
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentConfirmCodeData.class), rentConfirmCodeDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addBoolean(rentConfirmCodeDataColumnInfo.codeConfirmedIndex, Boolean.valueOf(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$codeConfirmed()));
        osObjectBuilder.addString(rentConfirmCodeDataColumnInfo.tokenIndex, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$token());
        C4591x4d164271 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentConfirmCodeData, newProxyInstance);
        User realmGet$user = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$user();
        if (realmGet$user == null) {
            newProxyInstance.realmSet$user((User) null);
        } else {
            User user = (User) map.get(realmGet$user);
            if (user != null) {
                newProxyInstance.realmSet$user(user);
            } else {
                newProxyInstance.realmSet$user(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class), realmGet$user, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentConfirmCodeData rentConfirmCodeData, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentConfirmCodeData rentConfirmCodeData2 = rentConfirmCodeData;
        Map<RealmModel, Long> map2 = map;
        if (rentConfirmCodeData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentConfirmCodeData.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo = (RentConfirmCodeDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class);
        long createRow = OsObject.createRow(table);
        map2.put(rentConfirmCodeData2, Long.valueOf(createRow));
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData2;
        Table.nativeSetBoolean(nativePtr, rentConfirmCodeDataColumnInfo.codeConfirmedIndex, createRow, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$codeConfirmed(), false);
        String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeDataColumnInfo.tokenIndex, createRow, realmGet$token, false);
        }
        User realmGet$user = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$user();
        if (realmGet$user != null) {
            Long l = map2.get(realmGet$user);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insert(realm2, realmGet$user, map2));
            }
            Table.nativeSetLink(nativePtr, rentConfirmCodeDataColumnInfo.userIndex, createRow, l.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentConfirmCodeData.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo = (RentConfirmCodeDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class);
        while (it.hasNext()) {
            RentConfirmCodeData rentConfirmCodeData = (RentConfirmCodeData) it.next();
            if (!map2.containsKey(rentConfirmCodeData)) {
                if (rentConfirmCodeData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentConfirmCodeData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentConfirmCodeData, Long.valueOf(createRow));
                C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData;
                Table.nativeSetBoolean(nativePtr, rentConfirmCodeDataColumnInfo.codeConfirmedIndex, createRow, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$codeConfirmed(), false);
                String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeDataColumnInfo.tokenIndex, createRow, realmGet$token, false);
                }
                User realmGet$user = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$user();
                if (realmGet$user != null) {
                    Long l = map2.get(realmGet$user);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insert(realm2, realmGet$user, map2));
                    }
                    table.setLink(rentConfirmCodeDataColumnInfo.userIndex, createRow, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentConfirmCodeData rentConfirmCodeData, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        RentConfirmCodeData rentConfirmCodeData2 = rentConfirmCodeData;
        Map<RealmModel, Long> map2 = map;
        if (rentConfirmCodeData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentConfirmCodeData.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo = (RentConfirmCodeDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class);
        long createRow = OsObject.createRow(table);
        map2.put(rentConfirmCodeData2, Long.valueOf(createRow));
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData2;
        Table.nativeSetBoolean(nativePtr, rentConfirmCodeDataColumnInfo.codeConfirmedIndex, createRow, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$codeConfirmed(), false);
        String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, rentConfirmCodeDataColumnInfo.tokenIndex, createRow, realmGet$token, false);
        } else {
            Table.nativeSetNull(nativePtr, rentConfirmCodeDataColumnInfo.tokenIndex, createRow, false);
        }
        User realmGet$user = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$user();
        if (realmGet$user != null) {
            Long l = map2.get(realmGet$user);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insertOrUpdate(realm2, realmGet$user, map2));
            }
            Table.nativeSetLink(nativePtr, rentConfirmCodeDataColumnInfo.userIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, rentConfirmCodeDataColumnInfo.userIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentConfirmCodeData.class);
        long nativePtr = table.getNativePtr();
        RentConfirmCodeDataColumnInfo rentConfirmCodeDataColumnInfo = (RentConfirmCodeDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentConfirmCodeData.class);
        while (it.hasNext()) {
            RentConfirmCodeData rentConfirmCodeData = (RentConfirmCodeData) it.next();
            if (!map2.containsKey(rentConfirmCodeData)) {
                if (rentConfirmCodeData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentConfirmCodeData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentConfirmCodeData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentConfirmCodeData, Long.valueOf(createRow));
                C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData;
                Table.nativeSetBoolean(nativePtr, rentConfirmCodeDataColumnInfo.codeConfirmedIndex, createRow, ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$codeConfirmed(), false);
                String realmGet$token = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, rentConfirmCodeDataColumnInfo.tokenIndex, createRow, realmGet$token, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentConfirmCodeDataColumnInfo.tokenIndex, createRow, false);
                }
                User realmGet$user = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmGet$user();
                if (realmGet$user != null) {
                    Long l = map2.get(realmGet$user);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.insertOrUpdate(realm2, realmGet$user, map2));
                    }
                    Table.nativeSetLink(nativePtr, rentConfirmCodeDataColumnInfo.userIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, rentConfirmCodeDataColumnInfo.userIndex, createRow);
                }
            }
        }
    }

    public static RentConfirmCodeData createDetachedCopy(RentConfirmCodeData rentConfirmCodeData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentConfirmCodeData rentConfirmCodeData2;
        if (i > i2 || rentConfirmCodeData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentConfirmCodeData);
        if (cacheData == null) {
            rentConfirmCodeData2 = new RentConfirmCodeData();
            map.put(rentConfirmCodeData, new RealmObjectProxy.CacheData(i, rentConfirmCodeData2));
        } else if (i >= cacheData.minDepth) {
            return (RentConfirmCodeData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentConfirmCodeData2 = (RentConfirmCodeData) cacheData.object;
        }
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface = rentConfirmCodeData2;
        C4592x64a679c8 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface2 = rentConfirmCodeData;
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$codeConfirmed(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface2.realmGet$codeConfirmed());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$token(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface2.realmGet$token());
        ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface.realmSet$user(ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxyinterface2.realmGet$user(), i + 1, i2, map));
        return rentConfirmCodeData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentConfirmCodeData = proxy[");
        sb.append("{codeConfirmed:");
        sb.append(realmGet$codeConfirmed());
        sb.append("}");
        sb.append(",");
        sb.append("{token:");
        String str = "null";
        sb.append(realmGet$token() != null ? realmGet$token() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{user:");
        if (realmGet$user() != null) {
            str = ru_unicorn_ujin_data_realm_profile_UserRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4591x4d164271 ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxy = (C4591x4d164271) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_api_response_authorization_rentconfirmcodedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
