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
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy */
public class ru_unicorn_ujin_data_api_response_SubAccountRealmProxy extends SubAccount implements RealmObjectProxy, ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SubAccountColumnInfo columnInfo;
    private ProxyState<SubAccount> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SubAccount";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy$SubAccountColumnInfo */
    static final class SubAccountColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long nameIndex;
        long phoneIndex;
        long rulesIndex;

        SubAccountColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.rulesIndex = addColumnDetails("rules", "rules", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SubAccountColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SubAccountColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SubAccountColumnInfo subAccountColumnInfo = (SubAccountColumnInfo) columnInfo;
            SubAccountColumnInfo subAccountColumnInfo2 = (SubAccountColumnInfo) columnInfo2;
            subAccountColumnInfo2.nameIndex = subAccountColumnInfo.nameIndex;
            subAccountColumnInfo2.phoneIndex = subAccountColumnInfo.phoneIndex;
            subAccountColumnInfo2.rulesIndex = subAccountColumnInfo.rulesIndex;
            subAccountColumnInfo2.maxColumnIndexValue = subAccountColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_api_response_SubAccountRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SubAccountColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
    }

    public String realmGet$phone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.phoneIndex);
    }

    public void realmSet$phone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.phoneIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.phoneIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
    }

    public int realmGet$rules() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.rulesIndex);
    }

    public void realmSet$rules(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.rulesIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.rulesIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("phone", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("rules", RealmFieldType.INTEGER, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SubAccountColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SubAccountColumnInfo(osSchemaInfo);
    }

    public static SubAccount createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SubAccount subAccount = (SubAccount) realm.createObjectInternal(SubAccount.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("phone")) {
            if (jSONObject.isNull("phone")) {
                ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$phone((String) null);
            } else {
                ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$phone(jSONObject.getString("phone"));
            }
        }
        if (jSONObject.has("rules")) {
            if (!jSONObject.isNull("rules")) {
                ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$rules(jSONObject.getInt("rules"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'rules' to null.");
            }
        }
        return subAccount;
    }

    public static SubAccount createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SubAccount subAccount = new SubAccount();
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("phone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$phone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$phone((String) null);
                }
            } else if (!nextName.equals("rules")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$rules(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'rules' to null.");
            }
        }
        jsonReader.endObject();
        return (SubAccount) realm.copyToRealm(subAccount, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_api_response_SubAccountRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxy ru_unicorn_ujin_data_api_response_subaccountrealmproxy = new ru_unicorn_ujin_data_api_response_SubAccountRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_api_response_subaccountrealmproxy;
    }

    public static SubAccount copyOrUpdate(Realm realm, SubAccountColumnInfo subAccountColumnInfo, SubAccount subAccount, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (subAccount instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) subAccount;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return subAccount;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(subAccount);
        if (realmObjectProxy2 != null) {
            return (SubAccount) realmObjectProxy2;
        }
        return copy(realm, subAccountColumnInfo, subAccount, z, map, set);
    }

    public static SubAccount copy(Realm realm, SubAccountColumnInfo subAccountColumnInfo, SubAccount subAccount, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(subAccount);
        if (realmObjectProxy != null) {
            return (SubAccount) realmObjectProxy;
        }
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SubAccount.class), subAccountColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(subAccountColumnInfo.nameIndex, ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(subAccountColumnInfo.phoneIndex, ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$phone());
        osObjectBuilder.addInteger(subAccountColumnInfo.rulesIndex, Integer.valueOf(ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$rules()));
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(subAccount, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SubAccount subAccount, Map<RealmModel, Long> map) {
        if (subAccount instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) subAccount;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SubAccount.class);
        long nativePtr = table.getNativePtr();
        SubAccountColumnInfo subAccountColumnInfo = (SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class);
        long createRow = OsObject.createRow(table);
        map.put(subAccount, Long.valueOf(createRow));
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
        String realmGet$name = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, subAccountColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, subAccountColumnInfo.phoneIndex, createRow, realmGet$phone, false);
        }
        Table.nativeSetLong(nativePtr, subAccountColumnInfo.rulesIndex, createRow, (long) ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$rules(), false);
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SubAccount.class);
        long nativePtr = table.getNativePtr();
        SubAccountColumnInfo subAccountColumnInfo = (SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class);
        while (it.hasNext()) {
            SubAccount subAccount = (SubAccount) it.next();
            if (!map2.containsKey(subAccount)) {
                if (subAccount instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) subAccount;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(subAccount, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(subAccount, Long.valueOf(createRow));
                ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
                String realmGet$name = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, subAccountColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, subAccountColumnInfo.phoneIndex, createRow, realmGet$phone, false);
                }
                Table.nativeSetLong(nativePtr, subAccountColumnInfo.rulesIndex, createRow, (long) ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$rules(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SubAccount subAccount, Map<RealmModel, Long> map) {
        if (subAccount instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) subAccount;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SubAccount.class);
        long nativePtr = table.getNativePtr();
        SubAccountColumnInfo subAccountColumnInfo = (SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class);
        long createRow = OsObject.createRow(table);
        map.put(subAccount, Long.valueOf(createRow));
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
        String realmGet$name = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, subAccountColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, subAccountColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, subAccountColumnInfo.phoneIndex, createRow, realmGet$phone, false);
        } else {
            Table.nativeSetNull(nativePtr, subAccountColumnInfo.phoneIndex, createRow, false);
        }
        Table.nativeSetLong(nativePtr, subAccountColumnInfo.rulesIndex, createRow, (long) ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$rules(), false);
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SubAccount.class);
        long nativePtr = table.getNativePtr();
        SubAccountColumnInfo subAccountColumnInfo = (SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class);
        while (it.hasNext()) {
            SubAccount subAccount = (SubAccount) it.next();
            if (!map2.containsKey(subAccount)) {
                if (subAccount instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) subAccount;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(subAccount, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(subAccount, Long.valueOf(createRow));
                ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount;
                String realmGet$name = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, subAccountColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, subAccountColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, subAccountColumnInfo.phoneIndex, createRow, realmGet$phone, false);
                } else {
                    Table.nativeSetNull(nativePtr, subAccountColumnInfo.phoneIndex, createRow, false);
                }
                Table.nativeSetLong(nativePtr, subAccountColumnInfo.rulesIndex, createRow, (long) ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmGet$rules(), false);
            }
        }
    }

    public static SubAccount createDetachedCopy(SubAccount subAccount, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SubAccount subAccount2;
        if (i > i2 || subAccount == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(subAccount);
        if (cacheData == null) {
            subAccount2 = new SubAccount();
            map.put(subAccount, new RealmObjectProxy.CacheData(i, subAccount2));
        } else if (i >= cacheData.minDepth) {
            return (SubAccount) cacheData.object;
        } else {
            cacheData.minDepth = i;
            subAccount2 = (SubAccount) cacheData.object;
        }
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface = subAccount2;
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxyInterface ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface2 = subAccount;
        ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$phone(ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface2.realmGet$phone());
        ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface.realmSet$rules(ru_unicorn_ujin_data_api_response_subaccountrealmproxyinterface2.realmGet$rules());
        return subAccount2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "SubAccount = proxy[" + "{name:" + realmGet$name() + "}" + "," + "{phone:" + realmGet$phone() + "}" + "," + "{rules:" + realmGet$rules() + "}" + "]";
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
        ru_unicorn_ujin_data_api_response_SubAccountRealmProxy ru_unicorn_ujin_data_api_response_subaccountrealmproxy = (ru_unicorn_ujin_data_api_response_SubAccountRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_api_response_subaccountrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_api_response_subaccountrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_api_response_subaccountrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
