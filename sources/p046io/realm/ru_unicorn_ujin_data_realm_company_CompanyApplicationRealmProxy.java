package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.company.CompanyApplication;
import p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication;
import p046io.realm.BaseRealm;
import p046io.realm.C4601xb6361989;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy */
public class ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy extends CompanyApplication implements RealmObjectProxy, C4600xd2ac66e2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CompanyApplicationColumnInfo columnInfo;
    private ProxyState<CompanyApplication> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CompanyApplication";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy$CompanyApplicationColumnInfo */
    static final class CompanyApplicationColumnInfo extends ColumnInfo {
        long commentIndex;
        long enterpriseIndex;
        long maxColumnIndexValue;
        long statusIndex;

        CompanyApplicationColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.statusIndex = addColumnDetails(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, objectSchemaInfo);
            this.enterpriseIndex = addColumnDetails("enterprise", "enterprise", objectSchemaInfo);
            this.commentIndex = addColumnDetails("comment", "comment", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CompanyApplicationColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CompanyApplicationColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CompanyApplicationColumnInfo companyApplicationColumnInfo = (CompanyApplicationColumnInfo) columnInfo;
            CompanyApplicationColumnInfo companyApplicationColumnInfo2 = (CompanyApplicationColumnInfo) columnInfo2;
            companyApplicationColumnInfo2.statusIndex = companyApplicationColumnInfo.statusIndex;
            companyApplicationColumnInfo2.enterpriseIndex = companyApplicationColumnInfo.enterpriseIndex;
            companyApplicationColumnInfo2.commentIndex = companyApplicationColumnInfo.commentIndex;
            companyApplicationColumnInfo2.maxColumnIndexValue = companyApplicationColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CompanyApplicationColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Boolean realmGet$status() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.statusIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.statusIndex));
    }

    public void realmSet$status(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.statusIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.statusIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.statusIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.statusIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public EnterpriseApplication realmGet$enterprise() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.enterpriseIndex)) {
            return null;
        }
        return (EnterpriseApplication) this.proxyState.getRealm$realm().get(EnterpriseApplication.class, this.proxyState.getRow$realm().getLink(this.columnInfo.enterpriseIndex), false, Collections.emptyList());
    }

    public void realmSet$enterprise(EnterpriseApplication enterpriseApplication) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (enterpriseApplication == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.enterpriseIndex);
                return;
            }
            this.proxyState.checkValidObject(enterpriseApplication);
            this.proxyState.getRow$realm().setLink(this.columnInfo.enterpriseIndex, ((RealmObjectProxy) enterpriseApplication).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("enterprise")) {
            if (enterpriseApplication != null && !RealmObject.isManaged(enterpriseApplication)) {
                enterpriseApplication = (EnterpriseApplication) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(enterpriseApplication, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (enterpriseApplication == null) {
                row$realm.nullifyLink(this.columnInfo.enterpriseIndex);
                return;
            }
            this.proxyState.checkValidObject(enterpriseApplication);
            row$realm.getTable().setLink(this.columnInfo.enterpriseIndex, row$realm.getIndex(), ((RealmObjectProxy) enterpriseApplication).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$comment() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.commentIndex);
    }

    public void realmSet$comment(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.commentIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.commentIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.commentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.commentIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        builder.addPersistedProperty(NotificationCompat.CATEGORY_STATUS, RealmFieldType.BOOLEAN, false, false, false);
        builder.addPersistedLinkProperty("enterprise", RealmFieldType.OBJECT, C4601xb6361989.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("comment", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CompanyApplicationColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CompanyApplicationColumnInfo(osSchemaInfo);
    }

    public static CompanyApplication createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("enterprise")) {
            arrayList.add("enterprise");
        }
        CompanyApplication companyApplication = (CompanyApplication) realm.createObjectInternal(CompanyApplication.class, true, arrayList);
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication;
        if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
            if (jSONObject.isNull(NotificationCompat.CATEGORY_STATUS)) {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$status((Boolean) null);
            } else {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$status(Boolean.valueOf(jSONObject.getBoolean(NotificationCompat.CATEGORY_STATUS)));
            }
        }
        if (jSONObject.has("enterprise")) {
            if (jSONObject.isNull("enterprise")) {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$enterprise((EnterpriseApplication) null);
            } else {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$enterprise(C4601xb6361989.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("enterprise"), z));
            }
        }
        if (jSONObject.has("comment")) {
            if (jSONObject.isNull("comment")) {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$comment((String) null);
            } else {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$comment(jSONObject.getString("comment"));
            }
        }
        return companyApplication;
    }

    public static CompanyApplication createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CompanyApplication companyApplication = new CompanyApplication();
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$status(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$status((Boolean) null);
                }
            } else if (nextName.equals("enterprise")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$enterprise((EnterpriseApplication) null);
                } else {
                    ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$enterprise(C4601xb6361989.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("comment")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$comment(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$comment((String) null);
            }
        }
        jsonReader.endObject();
        return (CompanyApplication) realm.copyToRealm(companyApplication, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyApplication.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxy = new ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxy;
    }

    public static CompanyApplication copyOrUpdate(Realm realm, CompanyApplicationColumnInfo companyApplicationColumnInfo, CompanyApplication companyApplication, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (companyApplication instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyApplication;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return companyApplication;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(companyApplication);
        if (realmObjectProxy2 != null) {
            return (CompanyApplication) realmObjectProxy2;
        }
        return copy(realm, companyApplicationColumnInfo, companyApplication, z, map, set);
    }

    public static CompanyApplication copy(Realm realm, CompanyApplicationColumnInfo companyApplicationColumnInfo, CompanyApplication companyApplication, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(companyApplication);
        if (realmObjectProxy != null) {
            return (CompanyApplication) realmObjectProxy;
        }
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CompanyApplication.class), companyApplicationColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addBoolean(companyApplicationColumnInfo.statusIndex, ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$status());
        osObjectBuilder.addString(companyApplicationColumnInfo.commentIndex, ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$comment());
        ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(companyApplication, newProxyInstance);
        EnterpriseApplication realmGet$enterprise = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$enterprise();
        if (realmGet$enterprise == null) {
            newProxyInstance.realmSet$enterprise((EnterpriseApplication) null);
        } else {
            EnterpriseApplication enterpriseApplication = (EnterpriseApplication) map.get(realmGet$enterprise);
            if (enterpriseApplication != null) {
                newProxyInstance.realmSet$enterprise(enterpriseApplication);
            } else {
                newProxyInstance.realmSet$enterprise(C4601xb6361989.copyOrUpdate(realm, (C4601xb6361989.EnterpriseApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class), realmGet$enterprise, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, CompanyApplication companyApplication, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        CompanyApplication companyApplication2 = companyApplication;
        Map<RealmModel, Long> map2 = map;
        if (companyApplication2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyApplication2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CompanyApplication.class);
        long nativePtr = table.getNativePtr();
        CompanyApplicationColumnInfo companyApplicationColumnInfo = (CompanyApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyApplication.class);
        long createRow = OsObject.createRow(table);
        map2.put(companyApplication2, Long.valueOf(createRow));
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication2;
        Boolean realmGet$status = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetBoolean(nativePtr, companyApplicationColumnInfo.statusIndex, createRow, realmGet$status.booleanValue(), false);
        }
        EnterpriseApplication realmGet$enterprise = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$enterprise();
        if (realmGet$enterprise != null) {
            Long l = map2.get(realmGet$enterprise);
            if (l == null) {
                l = Long.valueOf(C4601xb6361989.insert(realm2, realmGet$enterprise, map2));
            }
            Table.nativeSetLink(nativePtr, companyApplicationColumnInfo.enterpriseIndex, createRow, l.longValue(), false);
        }
        String realmGet$comment = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, companyApplicationColumnInfo.commentIndex, createRow, realmGet$comment, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CompanyApplication.class);
        long nativePtr = table.getNativePtr();
        CompanyApplicationColumnInfo companyApplicationColumnInfo = (CompanyApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyApplication.class);
        while (it.hasNext()) {
            CompanyApplication companyApplication = (CompanyApplication) it.next();
            if (!map2.containsKey(companyApplication)) {
                if (companyApplication instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyApplication;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(companyApplication, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(companyApplication, Long.valueOf(createRow));
                C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication;
                Boolean realmGet$status = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$status();
                if (realmGet$status != null) {
                    Table.nativeSetBoolean(nativePtr, companyApplicationColumnInfo.statusIndex, createRow, realmGet$status.booleanValue(), false);
                }
                EnterpriseApplication realmGet$enterprise = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$enterprise();
                if (realmGet$enterprise != null) {
                    Long l = map2.get(realmGet$enterprise);
                    if (l == null) {
                        l = Long.valueOf(C4601xb6361989.insert(realm2, realmGet$enterprise, map2));
                    }
                    table.setLink(companyApplicationColumnInfo.enterpriseIndex, createRow, l.longValue(), false);
                }
                String realmGet$comment = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, companyApplicationColumnInfo.commentIndex, createRow, realmGet$comment, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CompanyApplication companyApplication, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        CompanyApplication companyApplication2 = companyApplication;
        Map<RealmModel, Long> map2 = map;
        if (companyApplication2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyApplication2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CompanyApplication.class);
        long nativePtr = table.getNativePtr();
        CompanyApplicationColumnInfo companyApplicationColumnInfo = (CompanyApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyApplication.class);
        long createRow = OsObject.createRow(table);
        map2.put(companyApplication2, Long.valueOf(createRow));
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication2;
        Boolean realmGet$status = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetBoolean(nativePtr, companyApplicationColumnInfo.statusIndex, createRow, realmGet$status.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, companyApplicationColumnInfo.statusIndex, createRow, false);
        }
        EnterpriseApplication realmGet$enterprise = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$enterprise();
        if (realmGet$enterprise != null) {
            Long l = map2.get(realmGet$enterprise);
            if (l == null) {
                l = Long.valueOf(C4601xb6361989.insertOrUpdate(realm2, realmGet$enterprise, map2));
            }
            Table.nativeSetLink(nativePtr, companyApplicationColumnInfo.enterpriseIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, companyApplicationColumnInfo.enterpriseIndex, createRow);
        }
        String realmGet$comment = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, companyApplicationColumnInfo.commentIndex, createRow, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, companyApplicationColumnInfo.commentIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CompanyApplication.class);
        long nativePtr = table.getNativePtr();
        CompanyApplicationColumnInfo companyApplicationColumnInfo = (CompanyApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CompanyApplication.class);
        while (it.hasNext()) {
            CompanyApplication companyApplication = (CompanyApplication) it.next();
            if (!map2.containsKey(companyApplication)) {
                if (companyApplication instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) companyApplication;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(companyApplication, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(companyApplication, Long.valueOf(createRow));
                C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication;
                Boolean realmGet$status = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$status();
                if (realmGet$status != null) {
                    Table.nativeSetBoolean(nativePtr, companyApplicationColumnInfo.statusIndex, createRow, realmGet$status.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, companyApplicationColumnInfo.statusIndex, createRow, false);
                }
                EnterpriseApplication realmGet$enterprise = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$enterprise();
                if (realmGet$enterprise != null) {
                    Long l = map2.get(realmGet$enterprise);
                    if (l == null) {
                        l = Long.valueOf(C4601xb6361989.insertOrUpdate(realm2, realmGet$enterprise, map2));
                    }
                    Table.nativeSetLink(nativePtr, companyApplicationColumnInfo.enterpriseIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, companyApplicationColumnInfo.enterpriseIndex, createRow);
                }
                String realmGet$comment = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, companyApplicationColumnInfo.commentIndex, createRow, realmGet$comment, false);
                } else {
                    Table.nativeSetNull(nativePtr, companyApplicationColumnInfo.commentIndex, createRow, false);
                }
            }
        }
    }

    public static CompanyApplication createDetachedCopy(CompanyApplication companyApplication, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CompanyApplication companyApplication2;
        if (i > i2 || companyApplication == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(companyApplication);
        if (cacheData == null) {
            companyApplication2 = new CompanyApplication();
            map.put(companyApplication, new RealmObjectProxy.CacheData(i, companyApplication2));
        } else if (i >= cacheData.minDepth) {
            return (CompanyApplication) cacheData.object;
        } else {
            cacheData.minDepth = i;
            companyApplication2 = (CompanyApplication) cacheData.object;
        }
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface = companyApplication2;
        C4600xd2ac66e2 ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface2 = companyApplication;
        ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$status(ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface2.realmGet$status());
        ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$enterprise(C4601xb6361989.createDetachedCopy(ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface2.realmGet$enterprise(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface.realmSet$comment(ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxyinterface2.realmGet$comment());
        return companyApplication2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CompanyApplication = proxy[");
        sb.append("{status:");
        String str = "null";
        sb.append(realmGet$status() != null ? realmGet$status() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{enterprise:");
        sb.append(realmGet$enterprise() != null ? C4601xb6361989.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{comment:");
        if (realmGet$comment() != null) {
            str = realmGet$comment();
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
        ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxy = (ru_unicorn_ujin_data_realm_company_CompanyApplicationRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_company_companyapplicationrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
