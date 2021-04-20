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
import p035ru.unicorn.ujin.data.realm.marketplace.CompanyContact;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy extends CompanyContact implements RealmObjectProxy, C4610x1f8a05e0 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CompanyContactColumnInfo columnInfo;
    private ProxyState<CompanyContact> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CompanyContact";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy$CompanyContactColumnInfo */
    static final class CompanyContactColumnInfo extends ColumnInfo {
        long detailsIndex;
        long maxColumnIndexValue;
        long typeIndex;
        long valueIndex;

        CompanyContactColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.detailsIndex = addColumnDetails("details", "details", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CompanyContactColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CompanyContactColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CompanyContactColumnInfo companyContactColumnInfo = (CompanyContactColumnInfo) columnInfo;
            CompanyContactColumnInfo companyContactColumnInfo2 = (CompanyContactColumnInfo) columnInfo2;
            companyContactColumnInfo2.typeIndex = companyContactColumnInfo.typeIndex;
            companyContactColumnInfo2.valueIndex = companyContactColumnInfo.valueIndex;
            companyContactColumnInfo2.detailsIndex = companyContactColumnInfo.detailsIndex;
            companyContactColumnInfo2.maxColumnIndexValue = companyContactColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CompanyContactColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.valueIndex);
    }

    public void realmSet$value(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.valueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.valueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.valueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.valueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$details() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.detailsIndex);
    }

    public void realmSet$details(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.detailsIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.detailsIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.detailsIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.detailsIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("details", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CompanyContactColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CompanyContactColumnInfo(osSchemaInfo);
    }

    public static CompanyContact createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        CompanyContact companyContact = (CompanyContact) realm.createObjectInternal(CompanyContact.class, true, Collections.emptyList());
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        if (jSONObject.has("details")) {
            if (jSONObject.isNull("details")) {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$details((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$details(jSONObject.getString("details"));
            }
        }
        return companyContact;
    }

    public static CompanyContact createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CompanyContact companyContact = new CompanyContact();
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$value((String) null);
                }
            } else if (!nextName.equals("details")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$details(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$details((String) null);
            }
        }
        jsonReader.endObject();
        return (CompanyContact) realm.copyToRealm(companyContact, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxy;
    }

    public static CompanyContact copyOrUpdate(Realm realm, CompanyContactColumnInfo companyContactColumnInfo, CompanyContact companyContact, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (companyContact instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyContact;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return companyContact;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(companyContact);
        if (realmObjectProxy2 != null) {
            return (CompanyContact) realmObjectProxy2;
        }
        return copy(realm, companyContactColumnInfo, companyContact, z, map, set);
    }

    public static CompanyContact copy(Realm realm, CompanyContactColumnInfo companyContactColumnInfo, CompanyContact companyContact, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(companyContact);
        if (realmObjectProxy != null) {
            return (CompanyContact) realmObjectProxy;
        }
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CompanyContact.class), companyContactColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(companyContactColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(companyContactColumnInfo.valueIndex, ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$value());
        osObjectBuilder.addString(companyContactColumnInfo.detailsIndex, ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$details());
        ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(companyContact, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, CompanyContact companyContact, Map<RealmModel, Long> map) {
        if (companyContact instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyContact;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CompanyContact.class);
        long nativePtr = table.getNativePtr();
        CompanyContactColumnInfo companyContactColumnInfo = (CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class);
        long createRow = OsObject.createRow(table);
        map.put(companyContact, Long.valueOf(createRow));
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, companyContactColumnInfo.typeIndex, createRow, realmGet$type, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, companyContactColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        String realmGet$details = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$details();
        if (realmGet$details != null) {
            Table.nativeSetString(nativePtr, companyContactColumnInfo.detailsIndex, createRow, realmGet$details, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CompanyContact.class);
        long nativePtr = table.getNativePtr();
        CompanyContactColumnInfo companyContactColumnInfo = (CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class);
        while (it.hasNext()) {
            CompanyContact companyContact = (CompanyContact) it.next();
            if (!map2.containsKey(companyContact)) {
                if (companyContact instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyContact;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(companyContact, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(companyContact, Long.valueOf(createRow));
                C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, companyContactColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, companyContactColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
                String realmGet$details = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$details();
                if (realmGet$details != null) {
                    Table.nativeSetString(nativePtr, companyContactColumnInfo.detailsIndex, createRow, realmGet$details, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CompanyContact companyContact, Map<RealmModel, Long> map) {
        if (companyContact instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyContact;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CompanyContact.class);
        long nativePtr = table.getNativePtr();
        CompanyContactColumnInfo companyContactColumnInfo = (CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class);
        long createRow = OsObject.createRow(table);
        map.put(companyContact, Long.valueOf(createRow));
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, companyContactColumnInfo.typeIndex, createRow, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, companyContactColumnInfo.typeIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, companyContactColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, companyContactColumnInfo.valueIndex, createRow, false);
        }
        String realmGet$details = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$details();
        if (realmGet$details != null) {
            Table.nativeSetString(nativePtr, companyContactColumnInfo.detailsIndex, createRow, realmGet$details, false);
        } else {
            Table.nativeSetNull(nativePtr, companyContactColumnInfo.detailsIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CompanyContact.class);
        long nativePtr = table.getNativePtr();
        CompanyContactColumnInfo companyContactColumnInfo = (CompanyContactColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyContact.class);
        while (it.hasNext()) {
            CompanyContact companyContact = (CompanyContact) it.next();
            if (!map2.containsKey(companyContact)) {
                if (companyContact instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyContact;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(companyContact, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(companyContact, Long.valueOf(createRow));
                C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact;
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, companyContactColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyContactColumnInfo.typeIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, companyContactColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyContactColumnInfo.valueIndex, createRow, false);
                }
                String realmGet$details = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmGet$details();
                if (realmGet$details != null) {
                    Table.nativeSetString(nativePtr, companyContactColumnInfo.detailsIndex, createRow, realmGet$details, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyContactColumnInfo.detailsIndex, createRow, false);
                }
            }
        }
    }

    public static CompanyContact createDetachedCopy(CompanyContact companyContact, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CompanyContact companyContact2;
        if (i > i2 || companyContact == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(companyContact);
        if (cacheData == null) {
            companyContact2 = new CompanyContact();
            map.put(companyContact, new RealmObjectProxy.CacheData(i, companyContact2));
        } else if (i >= cacheData.minDepth) {
            return (CompanyContact) cacheData.object;
        } else {
            cacheData.minDepth = i;
            companyContact2 = (CompanyContact) cacheData.object;
        }
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface = companyContact2;
        C4610x1f8a05e0 ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface2 = companyContact;
        ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$value(ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface.realmSet$details(ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxyinterface2.realmGet$details());
        return companyContact2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CompanyContact = proxy[");
        sb.append("{type:");
        String str = "null";
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value() != null ? realmGet$value() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{details:");
        if (realmGet$details() != null) {
            str = realmGet$details();
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
        ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CompanyContactRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_companycontactrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
