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
import p035ru.unicorn.ujin.data.realm.company.EnterpriseApplication;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_company_EnterpriseApplicationRealmProxy */
public class C4601xb6361989 extends EnterpriseApplication implements RealmObjectProxy, C4602x634b1db0 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private EnterpriseApplicationColumnInfo columnInfo;
    private ProxyState<EnterpriseApplication> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_company_EnterpriseApplicationRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "EnterpriseApplication";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_company_EnterpriseApplicationRealmProxy$EnterpriseApplicationColumnInfo */
    static final class EnterpriseApplicationColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        EnterpriseApplicationColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        EnterpriseApplicationColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new EnterpriseApplicationColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo = (EnterpriseApplicationColumnInfo) columnInfo;
            EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo2 = (EnterpriseApplicationColumnInfo) columnInfo2;
            enterpriseApplicationColumnInfo2.idIndex = enterpriseApplicationColumnInfo.idIndex;
            enterpriseApplicationColumnInfo2.titleIndex = enterpriseApplicationColumnInfo.titleIndex;
            enterpriseApplicationColumnInfo2.maxColumnIndexValue = enterpriseApplicationColumnInfo.maxColumnIndexValue;
        }
    }

    C4601xb6361989() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (EnterpriseApplicationColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static EnterpriseApplicationColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new EnterpriseApplicationColumnInfo(osSchemaInfo);
    }

    public static EnterpriseApplication createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        EnterpriseApplication enterpriseApplication = (EnterpriseApplication) realm.createObjectInternal(EnterpriseApplication.class, true, Collections.emptyList());
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return enterpriseApplication;
    }

    public static EnterpriseApplication createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        EnterpriseApplication enterpriseApplication = new EnterpriseApplication();
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (EnterpriseApplication) realm.copyToRealm(enterpriseApplication, new ImportFlag[0]);
    }

    private static C4601xb6361989 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class), false, Collections.emptyList());
        C4601xb6361989 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxy = new C4601xb6361989();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxy;
    }

    public static EnterpriseApplication copyOrUpdate(Realm realm, EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo, EnterpriseApplication enterpriseApplication, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (enterpriseApplication instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) enterpriseApplication;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return enterpriseApplication;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(enterpriseApplication);
        if (realmObjectProxy2 != null) {
            return (EnterpriseApplication) realmObjectProxy2;
        }
        return copy(realm, enterpriseApplicationColumnInfo, enterpriseApplication, z, map, set);
    }

    public static EnterpriseApplication copy(Realm realm, EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo, EnterpriseApplication enterpriseApplication, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(enterpriseApplication);
        if (realmObjectProxy != null) {
            return (EnterpriseApplication) realmObjectProxy;
        }
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(EnterpriseApplication.class), enterpriseApplicationColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(enterpriseApplicationColumnInfo.idIndex, ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(enterpriseApplicationColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$title());
        C4601xb6361989 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(enterpriseApplication, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, EnterpriseApplication enterpriseApplication, Map<RealmModel, Long> map) {
        if (enterpriseApplication instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) enterpriseApplication;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(EnterpriseApplication.class);
        long nativePtr = table.getNativePtr();
        EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo = (EnterpriseApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class);
        long createRow = OsObject.createRow(table);
        map.put(enterpriseApplication, Long.valueOf(createRow));
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
        String realmGet$id = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(EnterpriseApplication.class);
        long nativePtr = table.getNativePtr();
        EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo = (EnterpriseApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class);
        while (it.hasNext()) {
            EnterpriseApplication enterpriseApplication = (EnterpriseApplication) it.next();
            if (!map2.containsKey(enterpriseApplication)) {
                if (enterpriseApplication instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) enterpriseApplication;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(enterpriseApplication, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(enterpriseApplication, Long.valueOf(createRow));
                C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
                String realmGet$id = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, EnterpriseApplication enterpriseApplication, Map<RealmModel, Long> map) {
        if (enterpriseApplication instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) enterpriseApplication;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(EnterpriseApplication.class);
        long nativePtr = table.getNativePtr();
        EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo = (EnterpriseApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class);
        long createRow = OsObject.createRow(table);
        map.put(enterpriseApplication, Long.valueOf(createRow));
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
        String realmGet$id = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, enterpriseApplicationColumnInfo.idIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, enterpriseApplicationColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(EnterpriseApplication.class);
        long nativePtr = table.getNativePtr();
        EnterpriseApplicationColumnInfo enterpriseApplicationColumnInfo = (EnterpriseApplicationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) EnterpriseApplication.class);
        while (it.hasNext()) {
            EnterpriseApplication enterpriseApplication = (EnterpriseApplication) it.next();
            if (!map2.containsKey(enterpriseApplication)) {
                if (enterpriseApplication instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) enterpriseApplication;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(enterpriseApplication, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(enterpriseApplication, Long.valueOf(createRow));
                C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication;
                String realmGet$id = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, enterpriseApplicationColumnInfo.idIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, enterpriseApplicationColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, enterpriseApplicationColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static EnterpriseApplication createDetachedCopy(EnterpriseApplication enterpriseApplication, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        EnterpriseApplication enterpriseApplication2;
        if (i > i2 || enterpriseApplication == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(enterpriseApplication);
        if (cacheData == null) {
            enterpriseApplication2 = new EnterpriseApplication();
            map.put(enterpriseApplication, new RealmObjectProxy.CacheData(i, enterpriseApplication2));
        } else if (i >= cacheData.minDepth) {
            return (EnterpriseApplication) cacheData.object;
        } else {
            cacheData.minDepth = i;
            enterpriseApplication2 = (EnterpriseApplication) cacheData.object;
        }
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface = enterpriseApplication2;
        C4602x634b1db0 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface2 = enterpriseApplication;
        ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxyinterface2.realmGet$title());
        return enterpriseApplication2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("EnterpriseApplication = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() != null) {
            str = realmGet$title();
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
        C4601xb6361989 ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxy = (C4601xb6361989) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_company_enterpriseapplicationrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
