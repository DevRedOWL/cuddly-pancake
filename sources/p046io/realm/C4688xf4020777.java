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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.market.company.CompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceStatus;
import p046io.realm.BaseRealm;
import p046io.realm.C4686xbd7f885e;
import p046io.realm.C4692x82b5a23f;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceDataRealmProxy */
public class C4688xf4020777 extends ServiceData implements RealmObjectProxy, C4689x93e0fb82 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceDataColumnInfo columnInfo;
    private RealmList<FilesUrl> filesRealmList;
    private ProxyState<ServiceData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_ServiceDataRealmProxy$ServiceDataColumnInfo */
    static final class ServiceDataColumnInfo extends ColumnInfo {
        long agreementMessageIndex;
        long companyTitleIndex;
        long descriptionIndex;
        long filesIndex;
        long idIndex;
        long maxColumnIndexValue;
        long statusIndex;
        long titleIndex;

        ServiceDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.companyTitleIndex = addColumnDetails(CompanyFragment.COMPANY_TITLE, CompanyFragment.COMPANY_TITLE, objectSchemaInfo);
            this.statusIndex = addColumnDetails(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, objectSchemaInfo);
            this.agreementMessageIndex = addColumnDetails("agreementMessage", "agreementMessage", objectSchemaInfo);
            this.filesIndex = addColumnDetails("files", "files", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceDataColumnInfo serviceDataColumnInfo = (ServiceDataColumnInfo) columnInfo;
            ServiceDataColumnInfo serviceDataColumnInfo2 = (ServiceDataColumnInfo) columnInfo2;
            serviceDataColumnInfo2.idIndex = serviceDataColumnInfo.idIndex;
            serviceDataColumnInfo2.titleIndex = serviceDataColumnInfo.titleIndex;
            serviceDataColumnInfo2.descriptionIndex = serviceDataColumnInfo.descriptionIndex;
            serviceDataColumnInfo2.companyTitleIndex = serviceDataColumnInfo.companyTitleIndex;
            serviceDataColumnInfo2.statusIndex = serviceDataColumnInfo.statusIndex;
            serviceDataColumnInfo2.agreementMessageIndex = serviceDataColumnInfo.agreementMessageIndex;
            serviceDataColumnInfo2.filesIndex = serviceDataColumnInfo.filesIndex;
            serviceDataColumnInfo2.maxColumnIndexValue = serviceDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4688xf4020777() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
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

    public String realmGet$description() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionIndex);
    }

    public void realmSet$description(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$companyTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.companyTitleIndex);
    }

    public void realmSet$companyTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.companyTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.companyTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.companyTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.companyTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public ServiceStatus realmGet$status() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.statusIndex)) {
            return null;
        }
        return (ServiceStatus) this.proxyState.getRealm$realm().get(ServiceStatus.class, this.proxyState.getRow$realm().getLink(this.columnInfo.statusIndex), false, Collections.emptyList());
    }

    public void realmSet$status(ServiceStatus serviceStatus) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (serviceStatus == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.statusIndex);
                return;
            }
            this.proxyState.checkValidObject(serviceStatus);
            this.proxyState.getRow$realm().setLink(this.columnInfo.statusIndex, ((RealmObjectProxy) serviceStatus).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(NotificationCompat.CATEGORY_STATUS)) {
            if (serviceStatus != null && !RealmObject.isManaged(serviceStatus)) {
                serviceStatus = (ServiceStatus) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(serviceStatus, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (serviceStatus == null) {
                row$realm.nullifyLink(this.columnInfo.statusIndex);
                return;
            }
            this.proxyState.checkValidObject(serviceStatus);
            row$realm.getTable().setLink(this.columnInfo.statusIndex, row$realm.getIndex(), ((RealmObjectProxy) serviceStatus).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$agreementMessage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.agreementMessageIndex);
    }

    public void realmSet$agreementMessage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.agreementMessageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.agreementMessageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.agreementMessageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.agreementMessageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<FilesUrl> realmGet$files() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<FilesUrl> realmList = this.filesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.filesRealmList = new RealmList<>(FilesUrl.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.filesIndex), this.proxyState.getRealm$realm());
        return this.filesRealmList;
    }

    public void realmSet$files(RealmList<FilesUrl> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("files")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<FilesUrl> realmList2 = new RealmList<>();
                Iterator<FilesUrl> it = realmList.iterator();
                while (it.hasNext()) {
                    FilesUrl next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.filesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    FilesUrl filesUrl = realmList.get(i);
                    this.proxyState.checkValidObject(filesUrl);
                    modelList.addRow(((RealmObjectProxy) filesUrl).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            FilesUrl filesUrl2 = realmList.get(i);
            this.proxyState.checkValidObject(filesUrl2);
            modelList.setRow((long) i, ((RealmObjectProxy) filesUrl2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CompanyFragment.COMPANY_TITLE, RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty(NotificationCompat.CATEGORY_STATUS, RealmFieldType.OBJECT, C4692x82b5a23f.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("agreementMessage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("files", RealmFieldType.LIST, C4686xbd7f885e.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceDataColumnInfo(osSchemaInfo);
    }

    public static ServiceData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
            arrayList.add(NotificationCompat.CATEGORY_STATUS);
        }
        if (jSONObject.has("files")) {
            arrayList.add("files");
        }
        ServiceData serviceData = (ServiceData) realm.createObjectInternal(ServiceData.class, true, arrayList);
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$id((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$id(Integer.valueOf(jSONObject.getInt("id")));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("description")) {
            if (jSONObject.isNull("description")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$description((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$description(jSONObject.getString("description"));
            }
        }
        if (jSONObject.has(CompanyFragment.COMPANY_TITLE)) {
            if (jSONObject.isNull(CompanyFragment.COMPANY_TITLE)) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$companyTitle((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$companyTitle(jSONObject.getString(CompanyFragment.COMPANY_TITLE));
            }
        }
        if (jSONObject.has(NotificationCompat.CATEGORY_STATUS)) {
            if (jSONObject.isNull(NotificationCompat.CATEGORY_STATUS)) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$status((ServiceStatus) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$status(C4692x82b5a23f.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject(NotificationCompat.CATEGORY_STATUS), z));
            }
        }
        if (jSONObject.has("agreementMessage")) {
            if (jSONObject.isNull("agreementMessage")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$agreementMessage((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$agreementMessage(jSONObject.getString("agreementMessage"));
            }
        }
        if (jSONObject.has("files")) {
            if (jSONObject.isNull("files")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$files((RealmList<FilesUrl>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("files");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files().add(C4686xbd7f885e.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return serviceData;
    }

    public static ServiceData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceData serviceData = new ServiceData();
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals(CompanyFragment.COMPANY_TITLE)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$companyTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$companyTitle((String) null);
                }
            } else if (nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$status((ServiceStatus) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$status(C4692x82b5a23f.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("agreementMessage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$agreementMessage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$agreementMessage((String) null);
                }
            } else if (!nextName.equals("files")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$files((RealmList<FilesUrl>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$files(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files().add(C4686xbd7f885e.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (ServiceData) realm.copyToRealm(serviceData, new ImportFlag[0]);
    }

    private static C4688xf4020777 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceData.class), false, Collections.emptyList());
        C4688xf4020777 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxy = new C4688xf4020777();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxy;
    }

    public static ServiceData copyOrUpdate(Realm realm, ServiceDataColumnInfo serviceDataColumnInfo, ServiceData serviceData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (serviceData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return serviceData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(serviceData);
        if (realmObjectProxy2 != null) {
            return (ServiceData) realmObjectProxy2;
        }
        return copy(realm, serviceDataColumnInfo, serviceData, z, map, set);
    }

    public static ServiceData copy(Realm realm, ServiceDataColumnInfo serviceDataColumnInfo, ServiceData serviceData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(serviceData);
        if (realmObjectProxy != null) {
            return (ServiceData) realmObjectProxy;
        }
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceData.class), serviceDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(serviceDataColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(serviceDataColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(serviceDataColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(serviceDataColumnInfo.companyTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$companyTitle());
        osObjectBuilder.addString(serviceDataColumnInfo.agreementMessageIndex, ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$agreementMessage());
        C4688xf4020777 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(serviceData, newProxyInstance);
        ServiceStatus realmGet$status = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$status();
        if (realmGet$status == null) {
            newProxyInstance.realmSet$status((ServiceStatus) null);
        } else {
            ServiceStatus serviceStatus = (ServiceStatus) map.get(realmGet$status);
            if (serviceStatus != null) {
                newProxyInstance.realmSet$status(serviceStatus);
            } else {
                newProxyInstance.realmSet$status(C4692x82b5a23f.copyOrUpdate(realm, (C4692x82b5a23f.ServiceStatusColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceStatus.class), realmGet$status, z, map, set));
            }
        }
        RealmList<FilesUrl> realmGet$files = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files();
        if (realmGet$files != null) {
            RealmList<FilesUrl> realmGet$files2 = newProxyInstance.realmGet$files();
            realmGet$files2.clear();
            for (int i = 0; i < realmGet$files.size(); i++) {
                FilesUrl filesUrl = realmGet$files.get(i);
                FilesUrl filesUrl2 = (FilesUrl) map.get(filesUrl);
                if (filesUrl2 != null) {
                    realmGet$files2.add(filesUrl2);
                } else {
                    realmGet$files2.add(C4686xbd7f885e.copyOrUpdate(realm, (C4686xbd7f885e.FilesUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class), filesUrl, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceData serviceData, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        ServiceData serviceData2 = serviceData;
        Map<RealmModel, Long> map2 = map;
        if (serviceData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ServiceData.class);
        long nativePtr = table.getNativePtr();
        ServiceDataColumnInfo serviceDataColumnInfo = (ServiceDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceData.class);
        long createRow = OsObject.createRow(table);
        map2.put(serviceData2, Long.valueOf(createRow));
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            j = createRow;
            Table.nativeSetLong(nativePtr, serviceDataColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            j = createRow;
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.titleIndex, j, realmGet$title, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.descriptionIndex, j, realmGet$description, false);
        }
        String realmGet$companyTitle = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$companyTitle();
        if (realmGet$companyTitle != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.companyTitleIndex, j, realmGet$companyTitle, false);
        }
        ServiceStatus realmGet$status = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$status();
        if (realmGet$status != null) {
            Long l = map2.get(realmGet$status);
            if (l == null) {
                l = Long.valueOf(C4692x82b5a23f.insert(realm2, realmGet$status, map2));
            }
            Table.nativeSetLink(nativePtr, serviceDataColumnInfo.statusIndex, j, l.longValue(), false);
        }
        String realmGet$agreementMessage = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$agreementMessage();
        if (realmGet$agreementMessage != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.agreementMessageIndex, j, realmGet$agreementMessage, false);
        }
        RealmList<FilesUrl> realmGet$files = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files();
        if (realmGet$files == null) {
            return j;
        }
        long j2 = j;
        OsList osList = new OsList(table.getUncheckedRow(j2), serviceDataColumnInfo.filesIndex);
        Iterator<FilesUrl> it = realmGet$files.iterator();
        while (it.hasNext()) {
            FilesUrl next = it.next();
            Long l2 = map2.get(next);
            if (l2 == null) {
                l2 = Long.valueOf(C4686xbd7f885e.insert(realm2, next, map2));
            }
            osList.addRow(l2.longValue());
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ServiceData.class);
        long nativePtr = table.getNativePtr();
        ServiceDataColumnInfo serviceDataColumnInfo = (ServiceDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceData.class);
        while (it.hasNext()) {
            ServiceData serviceData = (ServiceData) it.next();
            if (!map2.containsKey(serviceData)) {
                if (serviceData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(serviceData, Long.valueOf(createRow));
                C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    j = createRow;
                    Table.nativeSetLong(nativePtr, serviceDataColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    j = createRow;
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.titleIndex, j, realmGet$title, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.descriptionIndex, j, realmGet$description, false);
                }
                String realmGet$companyTitle = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$companyTitle();
                if (realmGet$companyTitle != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.companyTitleIndex, j, realmGet$companyTitle, false);
                }
                ServiceStatus realmGet$status = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$status();
                if (realmGet$status != null) {
                    Long l = map2.get(realmGet$status);
                    if (l == null) {
                        l = Long.valueOf(C4692x82b5a23f.insert(realm2, realmGet$status, map2));
                    }
                    table.setLink(serviceDataColumnInfo.statusIndex, j, l.longValue(), false);
                }
                String realmGet$agreementMessage = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$agreementMessage();
                if (realmGet$agreementMessage != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.agreementMessageIndex, j, realmGet$agreementMessage, false);
                }
                RealmList<FilesUrl> realmGet$files = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files();
                if (realmGet$files != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j), serviceDataColumnInfo.filesIndex);
                    Iterator<FilesUrl> it2 = realmGet$files.iterator();
                    while (it2.hasNext()) {
                        FilesUrl next = it2.next();
                        Long l2 = map2.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4686xbd7f885e.insert(realm2, next, map2));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceData serviceData, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        ServiceData serviceData2 = serviceData;
        Map<RealmModel, Long> map2 = map;
        if (serviceData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ServiceData.class);
        long nativePtr = table.getNativePtr();
        ServiceDataColumnInfo serviceDataColumnInfo = (ServiceDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceData.class);
        long createRow = OsObject.createRow(table);
        map2.put(serviceData2, Long.valueOf(createRow));
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            j = createRow;
            Table.nativeSetLong(nativePtr, serviceDataColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, serviceDataColumnInfo.idIndex, j, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.titleIndex, j, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceDataColumnInfo.titleIndex, j, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.descriptionIndex, j, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceDataColumnInfo.descriptionIndex, j, false);
        }
        String realmGet$companyTitle = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$companyTitle();
        if (realmGet$companyTitle != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.companyTitleIndex, j, realmGet$companyTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceDataColumnInfo.companyTitleIndex, j, false);
        }
        ServiceStatus realmGet$status = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$status();
        if (realmGet$status != null) {
            Long l = map2.get(realmGet$status);
            if (l == null) {
                l = Long.valueOf(C4692x82b5a23f.insertOrUpdate(realm2, realmGet$status, map2));
            }
            Table.nativeSetLink(nativePtr, serviceDataColumnInfo.statusIndex, j, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, serviceDataColumnInfo.statusIndex, j);
        }
        String realmGet$agreementMessage = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$agreementMessage();
        if (realmGet$agreementMessage != null) {
            Table.nativeSetString(nativePtr, serviceDataColumnInfo.agreementMessageIndex, j, realmGet$agreementMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceDataColumnInfo.agreementMessageIndex, j, false);
        }
        long j2 = j;
        OsList osList = new OsList(table.getUncheckedRow(j2), serviceDataColumnInfo.filesIndex);
        RealmList<FilesUrl> realmGet$files = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files();
        if (realmGet$files == null || ((long) realmGet$files.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$files != null) {
                Iterator<FilesUrl> it = realmGet$files.iterator();
                while (it.hasNext()) {
                    FilesUrl next = it.next();
                    Long l2 = map2.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4686xbd7f885e.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$files.size();
            for (int i = 0; i < size; i++) {
                FilesUrl filesUrl = realmGet$files.get(i);
                Long l3 = map2.get(filesUrl);
                if (l3 == null) {
                    l3 = Long.valueOf(C4686xbd7f885e.insertOrUpdate(realm2, filesUrl, map2));
                }
                osList.setRow((long) i, l3.longValue());
            }
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ServiceData.class);
        long nativePtr = table.getNativePtr();
        ServiceDataColumnInfo serviceDataColumnInfo = (ServiceDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceData.class);
        while (it.hasNext()) {
            ServiceData serviceData = (ServiceData) it.next();
            if (!map2.containsKey(serviceData)) {
                if (serviceData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(serviceData, Long.valueOf(createRow));
                C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    j = createRow;
                    Table.nativeSetLong(nativePtr, serviceDataColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    j = createRow;
                    Table.nativeSetNull(nativePtr, serviceDataColumnInfo.idIndex, j, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.titleIndex, j, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceDataColumnInfo.titleIndex, j, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.descriptionIndex, j, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceDataColumnInfo.descriptionIndex, j, false);
                }
                String realmGet$companyTitle = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$companyTitle();
                if (realmGet$companyTitle != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.companyTitleIndex, j, realmGet$companyTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceDataColumnInfo.companyTitleIndex, j, false);
                }
                ServiceStatus realmGet$status = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$status();
                if (realmGet$status != null) {
                    Long l = map2.get(realmGet$status);
                    if (l == null) {
                        l = Long.valueOf(C4692x82b5a23f.insertOrUpdate(realm2, realmGet$status, map2));
                    }
                    Table.nativeSetLink(nativePtr, serviceDataColumnInfo.statusIndex, j, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, serviceDataColumnInfo.statusIndex, j);
                }
                String realmGet$agreementMessage = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$agreementMessage();
                if (realmGet$agreementMessage != null) {
                    Table.nativeSetString(nativePtr, serviceDataColumnInfo.agreementMessageIndex, j, realmGet$agreementMessage, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceDataColumnInfo.agreementMessageIndex, j, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(j), serviceDataColumnInfo.filesIndex);
                RealmList<FilesUrl> realmGet$files = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmGet$files();
                if (realmGet$files == null || ((long) realmGet$files.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$files != null) {
                        Iterator<FilesUrl> it2 = realmGet$files.iterator();
                        while (it2.hasNext()) {
                            FilesUrl next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(C4686xbd7f885e.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$files.size();
                    for (int i = 0; i < size; i++) {
                        FilesUrl filesUrl = realmGet$files.get(i);
                        Long l3 = map2.get(filesUrl);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4686xbd7f885e.insertOrUpdate(realm2, filesUrl, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                    }
                }
            }
        }
    }

    public static ServiceData createDetachedCopy(ServiceData serviceData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceData serviceData2;
        if (i > i2 || serviceData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceData);
        if (cacheData == null) {
            serviceData2 = new ServiceData();
            map.put(serviceData, new RealmObjectProxy.CacheData(i, serviceData2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceData2 = (ServiceData) cacheData.object;
        }
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface = serviceData2;
        C4689x93e0fb82 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2 = serviceData;
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$companyTitle(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$companyTitle());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$status(C4692x82b5a23f.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$status(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$agreementMessage(ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$agreementMessage());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$files((RealmList<FilesUrl>) null);
        } else {
            RealmList<FilesUrl> realmGet$files = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface2.realmGet$files();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxyinterface.realmSet$files(realmList);
            int size = realmGet$files.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4686xbd7f885e.createDetachedCopy(realmGet$files.get(i4), i3, i2, map));
            }
        }
        return serviceData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceData = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{companyTitle:");
        sb.append(realmGet$companyTitle() != null ? realmGet$companyTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(realmGet$status() != null ? C4692x82b5a23f.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{agreementMessage:");
        if (realmGet$agreementMessage() != null) {
            str = realmGet$agreementMessage();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{files:");
        sb.append("RealmList<FilesUrl>[");
        sb.append(realmGet$files().size());
        sb.append("]");
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
        C4688xf4020777 ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxy = (C4688xf4020777) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_servicedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
