package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy */
public class C4704x27ddec53 extends ServiceMessages implements RealmObjectProxy, C4705xde42ce26 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceMessagesColumnInfo columnInfo;
    private ProxyState<ServiceMessages> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceMessages";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy$ServiceMessagesColumnInfo */
    static final class ServiceMessagesColumnInfo extends ColumnInfo {
        long datauserIdIndex;
        long maxColumnIndexValue;
        long messageDtIndex;
        long messageIdIndex;
        long messageTextIndex;
        long userdataFullnameIndex;

        ServiceMessagesColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.messageIdIndex = addColumnDetails(Constants.FirelogAnalytics.PARAM_MESSAGE_ID, Constants.FirelogAnalytics.PARAM_MESSAGE_ID, objectSchemaInfo);
            this.datauserIdIndex = addColumnDetails("datauserId", "datauserId", objectSchemaInfo);
            this.messageDtIndex = addColumnDetails("messageDt", "messageDt", objectSchemaInfo);
            this.messageTextIndex = addColumnDetails("messageText", "messageText", objectSchemaInfo);
            this.userdataFullnameIndex = addColumnDetails("userdataFullname", "userdataFullname", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceMessagesColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceMessagesColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceMessagesColumnInfo serviceMessagesColumnInfo = (ServiceMessagesColumnInfo) columnInfo;
            ServiceMessagesColumnInfo serviceMessagesColumnInfo2 = (ServiceMessagesColumnInfo) columnInfo2;
            serviceMessagesColumnInfo2.messageIdIndex = serviceMessagesColumnInfo.messageIdIndex;
            serviceMessagesColumnInfo2.datauserIdIndex = serviceMessagesColumnInfo.datauserIdIndex;
            serviceMessagesColumnInfo2.messageDtIndex = serviceMessagesColumnInfo.messageDtIndex;
            serviceMessagesColumnInfo2.messageTextIndex = serviceMessagesColumnInfo.messageTextIndex;
            serviceMessagesColumnInfo2.userdataFullnameIndex = serviceMessagesColumnInfo.userdataFullnameIndex;
            serviceMessagesColumnInfo2.maxColumnIndexValue = serviceMessagesColumnInfo.maxColumnIndexValue;
        }
    }

    C4704x27ddec53() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceMessagesColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$messageId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageIdIndex);
    }

    public void realmSet$messageId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'messageId' cannot be changed after object was created.");
        }
    }

    public String realmGet$datauserId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.datauserIdIndex);
    }

    public void realmSet$datauserId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.datauserIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.datauserIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.datauserIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.datauserIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$messageDt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageDtIndex);
    }

    public void realmSet$messageDt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.messageDtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageDtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.messageDtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.messageDtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$messageText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageTextIndex);
    }

    public void realmSet$messageText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.messageTextIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageTextIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.messageTextIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.messageTextIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$userdataFullname() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userdataFullnameIndex);
    }

    public void realmSet$userdataFullname(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userdataFullnameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userdataFullnameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userdataFullnameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userdataFullnameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty(Constants.FirelogAnalytics.PARAM_MESSAGE_ID, RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("datauserId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("messageDt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("messageText", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("userdataFullname", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceMessagesColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceMessagesColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "messageId"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy$ServiceMessagesColumnInfo r3 = (p046io.realm.C4704x27ddec53.ServiceMessagesColumnInfo) r3
            long r3 = r3.messageIdIndex
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy r14 = (p046io.realm.C4704x27ddec53) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy r14 = (p046io.realm.C4704x27ddec53) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'messageId'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxyInterface r12 = (p046io.realm.C4705xde42ce26) r12
            java.lang.String r0 = "datauserId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$datauserId(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$datauserId(r0)
        L_0x00b0:
            java.lang.String r0 = "messageDt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$messageDt(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$messageDt(r0)
        L_0x00c9:
            java.lang.String r0 = "messageText"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$messageText(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$messageText(r0)
        L_0x00e2:
            java.lang.String r0 = "userdataFullname"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fc
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f5
            r12.realmSet$userdataFullname(r2)
            goto L_0x00fc
        L_0x00f5:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$userdataFullname(r13)
        L_0x00fc:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4704x27ddec53.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages");
    }

    public static ServiceMessages createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceMessages serviceMessages = new ServiceMessages();
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(Constants.FirelogAnalytics.PARAM_MESSAGE_ID)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageId((String) null);
                }
                z = true;
            } else if (nextName.equals("datauserId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$datauserId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$datauserId((String) null);
                }
            } else if (nextName.equals("messageDt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageDt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageDt((String) null);
                }
            } else if (nextName.equals("messageText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageText((String) null);
                }
            } else if (!nextName.equals("userdataFullname")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$userdataFullname(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$userdataFullname((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ServiceMessages) realm.copyToRealm(serviceMessages, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'messageId'.");
    }

    private static C4704x27ddec53 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class), false, Collections.emptyList());
        C4704x27ddec53 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxy = new C4704x27ddec53();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4704x27ddec53.ServiceMessagesColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.messageIdIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxyInterface r5 = (p046io.realm.C4705xde42ce26) r5
            java.lang.String r5 = r5.realmGet$messageId()
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4704x27ddec53.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceMessagesRealmProxy$ServiceMessagesColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages");
    }

    public static ServiceMessages copy(Realm realm, ServiceMessagesColumnInfo serviceMessagesColumnInfo, ServiceMessages serviceMessages, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(serviceMessages);
        if (realmObjectProxy != null) {
            return (ServiceMessages) realmObjectProxy;
        }
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceMessages.class), serviceMessagesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceMessagesColumnInfo.messageIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageId());
        osObjectBuilder.addString(serviceMessagesColumnInfo.datauserIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$datauserId());
        osObjectBuilder.addString(serviceMessagesColumnInfo.messageDtIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageDt());
        osObjectBuilder.addString(serviceMessagesColumnInfo.messageTextIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageText());
        osObjectBuilder.addString(serviceMessagesColumnInfo.userdataFullnameIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$userdataFullname());
        C4704x27ddec53 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(serviceMessages, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceMessages serviceMessages, Map<RealmModel, Long> map) {
        long j;
        long j2;
        ServiceMessages serviceMessages2 = serviceMessages;
        if (serviceMessages2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceMessages2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceMessages.class);
        long nativePtr = table.getNativePtr();
        ServiceMessagesColumnInfo serviceMessagesColumnInfo = (ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class);
        long j3 = serviceMessagesColumnInfo.messageIdIndex;
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages2;
        String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageId();
        if (realmGet$messageId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$messageId);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$messageId);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$messageId);
            j2 = j;
        }
        map.put(serviceMessages2, Long.valueOf(j2));
        String realmGet$datauserId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$datauserId();
        if (realmGet$datauserId != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.datauserIdIndex, j2, realmGet$datauserId, false);
        }
        String realmGet$messageDt = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageDt();
        if (realmGet$messageDt != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageDtIndex, j2, realmGet$messageDt, false);
        }
        String realmGet$messageText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageText();
        if (realmGet$messageText != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageTextIndex, j2, realmGet$messageText, false);
        }
        String realmGet$userdataFullname = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$userdataFullname();
        if (realmGet$userdataFullname != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.userdataFullnameIndex, j2, realmGet$userdataFullname, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceMessages.class);
        long nativePtr = table.getNativePtr();
        ServiceMessagesColumnInfo serviceMessagesColumnInfo = (ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class);
        long j3 = serviceMessagesColumnInfo.messageIdIndex;
        while (it.hasNext()) {
            ServiceMessages serviceMessages = (ServiceMessages) it.next();
            if (!map2.containsKey(serviceMessages)) {
                if (serviceMessages instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceMessages;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceMessages, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages;
                String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageId();
                if (realmGet$messageId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$messageId);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$messageId);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$messageId);
                    j2 = j;
                }
                map2.put(serviceMessages, Long.valueOf(j2));
                String realmGet$datauserId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$datauserId();
                if (realmGet$datauserId != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.datauserIdIndex, j2, realmGet$datauserId, false);
                }
                String realmGet$messageDt = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageDt();
                if (realmGet$messageDt != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageDtIndex, j2, realmGet$messageDt, false);
                }
                String realmGet$messageText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageText();
                if (realmGet$messageText != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageTextIndex, j2, realmGet$messageText, false);
                }
                String realmGet$userdataFullname = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$userdataFullname();
                if (realmGet$userdataFullname != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.userdataFullnameIndex, j2, realmGet$userdataFullname, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceMessages serviceMessages, Map<RealmModel, Long> map) {
        long j;
        ServiceMessages serviceMessages2 = serviceMessages;
        if (serviceMessages2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceMessages2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceMessages.class);
        long nativePtr = table.getNativePtr();
        ServiceMessagesColumnInfo serviceMessagesColumnInfo = (ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class);
        long j2 = serviceMessagesColumnInfo.messageIdIndex;
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages2;
        String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageId();
        if (realmGet$messageId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$messageId);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$messageId) : j;
        map.put(serviceMessages2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$datauserId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$datauserId();
        if (realmGet$datauserId != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.datauserIdIndex, createRowWithPrimaryKey, realmGet$datauserId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.datauserIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$messageDt = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageDt();
        if (realmGet$messageDt != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageDtIndex, createRowWithPrimaryKey, realmGet$messageDt, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.messageDtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$messageText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageText();
        if (realmGet$messageText != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageTextIndex, createRowWithPrimaryKey, realmGet$messageText, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.messageTextIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$userdataFullname = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$userdataFullname();
        if (realmGet$userdataFullname != null) {
            Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.userdataFullnameIndex, createRowWithPrimaryKey, realmGet$userdataFullname, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.userdataFullnameIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceMessages.class);
        long nativePtr = table.getNativePtr();
        ServiceMessagesColumnInfo serviceMessagesColumnInfo = (ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class);
        long j2 = serviceMessagesColumnInfo.messageIdIndex;
        while (it.hasNext()) {
            ServiceMessages serviceMessages = (ServiceMessages) it.next();
            if (!map2.containsKey(serviceMessages)) {
                if (serviceMessages instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceMessages;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceMessages, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages;
                String realmGet$messageId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageId();
                if (realmGet$messageId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$messageId);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$messageId) : j;
                map2.put(serviceMessages, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$datauserId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$datauserId();
                if (realmGet$datauserId != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.datauserIdIndex, createRowWithPrimaryKey, realmGet$datauserId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.datauserIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$messageDt = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageDt();
                if (realmGet$messageDt != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageDtIndex, createRowWithPrimaryKey, realmGet$messageDt, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.messageDtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$messageText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$messageText();
                if (realmGet$messageText != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.messageTextIndex, createRowWithPrimaryKey, realmGet$messageText, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.messageTextIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$userdataFullname = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmGet$userdataFullname();
                if (realmGet$userdataFullname != null) {
                    Table.nativeSetString(nativePtr, serviceMessagesColumnInfo.userdataFullnameIndex, createRowWithPrimaryKey, realmGet$userdataFullname, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceMessagesColumnInfo.userdataFullnameIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static ServiceMessages createDetachedCopy(ServiceMessages serviceMessages, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceMessages serviceMessages2;
        if (i > i2 || serviceMessages == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceMessages);
        if (cacheData == null) {
            serviceMessages2 = new ServiceMessages();
            map.put(serviceMessages, new RealmObjectProxy.CacheData(i, serviceMessages2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceMessages) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceMessages2 = (ServiceMessages) cacheData.object;
        }
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages2;
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2 = serviceMessages;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$messageId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$datauserId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$datauserId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageDt(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$messageDt());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$messageText(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$messageText());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface.realmSet$userdataFullname(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$userdataFullname());
        return serviceMessages2;
    }

    static ServiceMessages update(Realm realm, ServiceMessagesColumnInfo serviceMessagesColumnInfo, ServiceMessages serviceMessages, ServiceMessages serviceMessages2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface = serviceMessages;
        C4705xde42ce26 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2 = serviceMessages2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceMessages.class), serviceMessagesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceMessagesColumnInfo.messageIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$messageId());
        osObjectBuilder.addString(serviceMessagesColumnInfo.datauserIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$datauserId());
        osObjectBuilder.addString(serviceMessagesColumnInfo.messageDtIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$messageDt());
        osObjectBuilder.addString(serviceMessagesColumnInfo.messageTextIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$messageText());
        osObjectBuilder.addString(serviceMessagesColumnInfo.userdataFullnameIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxyinterface2.realmGet$userdataFullname());
        osObjectBuilder.updateExistingObject();
        return serviceMessages;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceMessages = proxy[");
        sb.append("{messageId:");
        String str = "null";
        sb.append(realmGet$messageId() != null ? realmGet$messageId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{datauserId:");
        sb.append(realmGet$datauserId() != null ? realmGet$datauserId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{messageDt:");
        sb.append(realmGet$messageDt() != null ? realmGet$messageDt() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{messageText:");
        sb.append(realmGet$messageText() != null ? realmGet$messageText() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{userdataFullname:");
        if (realmGet$userdataFullname() != null) {
            str = realmGet$userdataFullname();
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
        C4704x27ddec53 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxy = (C4704x27ddec53) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicemessagesrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
