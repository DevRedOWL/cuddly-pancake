package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy */
public class C4702x12a70883 extends ServiceFile implements RealmObjectProxy, C4703xdbbe67f6 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceFileColumnInfo columnInfo;
    private ProxyState<ServiceFile> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceFile";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy$ServiceFileColumnInfo */
    static final class ServiceFileColumnInfo extends ColumnInfo {
        long fileIdIndex;
        long fileNameIndex;
        long fileSizeIndex;
        long fileUrlIndex;
        long maxColumnIndexValue;
        long messageIdIndex;

        ServiceFileColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.fileIdIndex = addColumnDetails("fileId", "fileId", objectSchemaInfo);
            this.fileNameIndex = addColumnDetails("fileName", "fileName", objectSchemaInfo);
            this.fileSizeIndex = addColumnDetails("fileSize", "fileSize", objectSchemaInfo);
            this.messageIdIndex = addColumnDetails(Constants.FirelogAnalytics.PARAM_MESSAGE_ID, Constants.FirelogAnalytics.PARAM_MESSAGE_ID, objectSchemaInfo);
            this.fileUrlIndex = addColumnDetails("fileUrl", "fileUrl", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceFileColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceFileColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceFileColumnInfo serviceFileColumnInfo = (ServiceFileColumnInfo) columnInfo;
            ServiceFileColumnInfo serviceFileColumnInfo2 = (ServiceFileColumnInfo) columnInfo2;
            serviceFileColumnInfo2.fileIdIndex = serviceFileColumnInfo.fileIdIndex;
            serviceFileColumnInfo2.fileNameIndex = serviceFileColumnInfo.fileNameIndex;
            serviceFileColumnInfo2.fileSizeIndex = serviceFileColumnInfo.fileSizeIndex;
            serviceFileColumnInfo2.messageIdIndex = serviceFileColumnInfo.messageIdIndex;
            serviceFileColumnInfo2.fileUrlIndex = serviceFileColumnInfo.fileUrlIndex;
            serviceFileColumnInfo2.maxColumnIndexValue = serviceFileColumnInfo.maxColumnIndexValue;
        }
    }

    C4702x12a70883() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceFileColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$fileId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fileIdIndex);
    }

    public void realmSet$fileId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'fileId' cannot be changed after object was created.");
        }
    }

    public String realmGet$fileName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fileNameIndex);
    }

    public void realmSet$fileName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fileNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fileNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fileNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fileNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fileSize() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fileSizeIndex);
    }

    public void realmSet$fileSize(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fileSizeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fileSizeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fileSizeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fileSizeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$messageId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageIdIndex);
    }

    public void realmSet$messageId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.messageIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.messageIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.messageIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fileUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fileUrlIndex);
    }

    public void realmSet$fileUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fileUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fileUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fileUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fileUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("fileId", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("fileName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fileSize", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Constants.FirelogAnalytics.PARAM_MESSAGE_ID, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fileUrl", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceFileColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceFileColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "fileId"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy$ServiceFileColumnInfo r3 = (p046io.realm.C4702x12a70883.ServiceFileColumnInfo) r3
            long r3 = r3.fileIdIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r1)
            long r3 = r14.findFirstString(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r2
        L_0x0065:
            if (r14 != 0) goto L_0x0094
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x008c
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy r14 = (p046io.realm.C4702x12a70883) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy r14 = (p046io.realm.C4702x12a70883) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'fileId'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxyInterface r12 = (p046io.realm.C4703xdbbe67f6) r12
            java.lang.String r0 = "fileName"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$fileName(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$fileName(r0)
        L_0x00b0:
            java.lang.String r0 = "fileSize"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$fileSize(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$fileSize(r0)
        L_0x00c9:
            java.lang.String r0 = "messageId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$messageId(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$messageId(r0)
        L_0x00e2:
            java.lang.String r0 = "fileUrl"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f4
            r12.realmSet$fileUrl(r2)
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$fileUrl(r13)
        L_0x00fb:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4702x12a70883.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile");
    }

    public static ServiceFile createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceFile serviceFile = new ServiceFile();
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("fileId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileId((String) null);
                }
                z = true;
            } else if (nextName.equals("fileName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileName((String) null);
                }
            } else if (nextName.equals("fileSize")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileSize(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileSize((String) null);
                }
            } else if (nextName.equals(Constants.FirelogAnalytics.PARAM_MESSAGE_ID)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$messageId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$messageId((String) null);
                }
            } else if (!nextName.equals("fileUrl")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileUrl(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileUrl((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ServiceFile) realm.copyToRealm(serviceFile, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'fileId'.");
    }

    private static C4702x12a70883 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class), false, Collections.emptyList());
        C4702x12a70883 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxy = new C4702x12a70883();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4702x12a70883.ServiceFileColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.fileIdIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxyInterface r5 = (p046io.realm.C4703xdbbe67f6) r5
            java.lang.String r5 = r5.realmGet$fileId()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x0068
        L_0x0064:
            long r3 = r2.findFirstString(r3, r5)
        L_0x0068:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0094
        L_0x0070:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x008e }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008e }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x008e }
            r12.put(r10, r2)     // Catch:{ all -> 0x008e }
            r0.clear()
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            r3 = r1
            if (r0 == 0) goto L_0x00a1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4702x12a70883.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceFileRealmProxy$ServiceFileColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile");
    }

    public static ServiceFile copy(Realm realm, ServiceFileColumnInfo serviceFileColumnInfo, ServiceFile serviceFile, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(serviceFile);
        if (realmObjectProxy != null) {
            return (ServiceFile) realmObjectProxy;
        }
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceFile.class), serviceFileColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceFileColumnInfo.fileIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileId());
        osObjectBuilder.addString(serviceFileColumnInfo.fileNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileName());
        osObjectBuilder.addString(serviceFileColumnInfo.fileSizeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileSize());
        osObjectBuilder.addString(serviceFileColumnInfo.messageIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$messageId());
        osObjectBuilder.addString(serviceFileColumnInfo.fileUrlIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileUrl());
        C4702x12a70883 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(serviceFile, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceFile serviceFile, Map<RealmModel, Long> map) {
        long j;
        long j2;
        ServiceFile serviceFile2 = serviceFile;
        if (serviceFile2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFile2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceFile.class);
        long nativePtr = table.getNativePtr();
        ServiceFileColumnInfo serviceFileColumnInfo = (ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class);
        long j3 = serviceFileColumnInfo.fileIdIndex;
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile2;
        String realmGet$fileId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileId();
        if (realmGet$fileId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$fileId);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$fileId);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$fileId);
            j2 = j;
        }
        map.put(serviceFile2, Long.valueOf(j2));
        String realmGet$fileName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileName();
        if (realmGet$fileName != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileNameIndex, j2, realmGet$fileName, false);
        }
        String realmGet$fileSize = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileSize();
        if (realmGet$fileSize != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileSizeIndex, j2, realmGet$fileSize, false);
        }
        String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$messageId();
        if (realmGet$messageId != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.messageIdIndex, j2, realmGet$messageId, false);
        }
        String realmGet$fileUrl = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileUrl();
        if (realmGet$fileUrl != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileUrlIndex, j2, realmGet$fileUrl, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceFile.class);
        long nativePtr = table.getNativePtr();
        ServiceFileColumnInfo serviceFileColumnInfo = (ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class);
        long j3 = serviceFileColumnInfo.fileIdIndex;
        while (it.hasNext()) {
            ServiceFile serviceFile = (ServiceFile) it.next();
            if (!map2.containsKey(serviceFile)) {
                if (serviceFile instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFile;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceFile, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile;
                String realmGet$fileId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileId();
                if (realmGet$fileId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$fileId);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$fileId);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$fileId);
                    j2 = j;
                }
                map2.put(serviceFile, Long.valueOf(j2));
                String realmGet$fileName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileName();
                if (realmGet$fileName != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileNameIndex, j2, realmGet$fileName, false);
                }
                String realmGet$fileSize = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileSize();
                if (realmGet$fileSize != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileSizeIndex, j2, realmGet$fileSize, false);
                }
                String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$messageId();
                if (realmGet$messageId != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.messageIdIndex, j2, realmGet$messageId, false);
                }
                String realmGet$fileUrl = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileUrl();
                if (realmGet$fileUrl != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileUrlIndex, j2, realmGet$fileUrl, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceFile serviceFile, Map<RealmModel, Long> map) {
        long j;
        ServiceFile serviceFile2 = serviceFile;
        if (serviceFile2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFile2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceFile.class);
        long nativePtr = table.getNativePtr();
        ServiceFileColumnInfo serviceFileColumnInfo = (ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class);
        long j2 = serviceFileColumnInfo.fileIdIndex;
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile2;
        String realmGet$fileId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileId();
        if (realmGet$fileId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$fileId);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$fileId) : j;
        map.put(serviceFile2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$fileName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileName();
        if (realmGet$fileName != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileNameIndex, createRowWithPrimaryKey, realmGet$fileName, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceFileColumnInfo.fileNameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$fileSize = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileSize();
        if (realmGet$fileSize != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileSizeIndex, createRowWithPrimaryKey, realmGet$fileSize, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceFileColumnInfo.fileSizeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$messageId();
        if (realmGet$messageId != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.messageIdIndex, createRowWithPrimaryKey, realmGet$messageId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceFileColumnInfo.messageIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$fileUrl = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileUrl();
        if (realmGet$fileUrl != null) {
            Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileUrlIndex, createRowWithPrimaryKey, realmGet$fileUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceFileColumnInfo.fileUrlIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceFile.class);
        long nativePtr = table.getNativePtr();
        ServiceFileColumnInfo serviceFileColumnInfo = (ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class);
        long j2 = serviceFileColumnInfo.fileIdIndex;
        while (it.hasNext()) {
            ServiceFile serviceFile = (ServiceFile) it.next();
            if (!map2.containsKey(serviceFile)) {
                if (serviceFile instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceFile;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceFile, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile;
                String realmGet$fileId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileId();
                if (realmGet$fileId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$fileId);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$fileId) : j;
                map2.put(serviceFile, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$fileName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileName();
                if (realmGet$fileName != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileNameIndex, createRowWithPrimaryKey, realmGet$fileName, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceFileColumnInfo.fileNameIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$fileSize = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileSize();
                if (realmGet$fileSize != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileSizeIndex, createRowWithPrimaryKey, realmGet$fileSize, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceFileColumnInfo.fileSizeIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$messageId();
                if (realmGet$messageId != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.messageIdIndex, createRowWithPrimaryKey, realmGet$messageId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceFileColumnInfo.messageIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$fileUrl = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmGet$fileUrl();
                if (realmGet$fileUrl != null) {
                    Table.nativeSetString(nativePtr, serviceFileColumnInfo.fileUrlIndex, createRowWithPrimaryKey, realmGet$fileUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceFileColumnInfo.fileUrlIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static ServiceFile createDetachedCopy(ServiceFile serviceFile, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceFile serviceFile2;
        if (i > i2 || serviceFile == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceFile);
        if (cacheData == null) {
            serviceFile2 = new ServiceFile();
            map.put(serviceFile, new RealmObjectProxy.CacheData(i, serviceFile2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceFile) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceFile2 = (ServiceFile) cacheData.object;
        }
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile2;
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2 = serviceFile;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileName(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileName());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileSize(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileSize());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$messageId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$messageId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface.realmSet$fileUrl(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileUrl());
        return serviceFile2;
    }

    static ServiceFile update(Realm realm, ServiceFileColumnInfo serviceFileColumnInfo, ServiceFile serviceFile, ServiceFile serviceFile2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface = serviceFile;
        C4703xdbbe67f6 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2 = serviceFile2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceFile.class), serviceFileColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceFileColumnInfo.fileIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileId());
        osObjectBuilder.addString(serviceFileColumnInfo.fileNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileName());
        osObjectBuilder.addString(serviceFileColumnInfo.fileSizeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileSize());
        osObjectBuilder.addString(serviceFileColumnInfo.messageIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$messageId());
        osObjectBuilder.addString(serviceFileColumnInfo.fileUrlIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxyinterface2.realmGet$fileUrl());
        osObjectBuilder.updateExistingObject();
        return serviceFile;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceFile = proxy[");
        sb.append("{fileId:");
        String str = "null";
        sb.append(realmGet$fileId() != null ? realmGet$fileId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fileName:");
        sb.append(realmGet$fileName() != null ? realmGet$fileName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fileSize:");
        sb.append(realmGet$fileSize() != null ? realmGet$fileSize() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{messageId:");
        sb.append(realmGet$messageId() != null ? realmGet$messageId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fileUrl:");
        if (realmGet$fileUrl() != null) {
            str = realmGet$fileUrl();
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
        C4702x12a70883 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxy = (C4702x12a70883) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicefilerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
