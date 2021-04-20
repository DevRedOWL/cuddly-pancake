package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.notification.Notification;
import p035ru.unicorn.ujin.data.realm.notification.NotificationData;
import p035ru.unicorn.ujin.data.service.FCM;
import p046io.realm.BaseRealm;
import p046io.realm.C4626xe255e1e5;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy */
public class ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy extends Notification implements RealmObjectProxy, C4628x1a6dcade {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private NotificationColumnInfo columnInfo;
    private ProxyState<Notification> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Notification";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy$NotificationColumnInfo */
    static final class NotificationColumnInfo extends ColumnInfo {
        long bodyIndex;
        long dataIndex;
        long eventIndex;
        long idIndex;
        long maxColumnIndexValue;
        long readAtIndex;
        long sentAtIndex;
        long titleIndex;

        NotificationColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.eventIndex = addColumnDetails("event", "event", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.bodyIndex = addColumnDetails(FCM.BODY, FCM.BODY, objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.sentAtIndex = addColumnDetails("sentAt", "sentAt", objectSchemaInfo);
            this.readAtIndex = addColumnDetails(Notification.Fields.readAt, Notification.Fields.readAt, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        NotificationColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new NotificationColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            NotificationColumnInfo notificationColumnInfo = (NotificationColumnInfo) columnInfo;
            NotificationColumnInfo notificationColumnInfo2 = (NotificationColumnInfo) columnInfo2;
            notificationColumnInfo2.idIndex = notificationColumnInfo.idIndex;
            notificationColumnInfo2.eventIndex = notificationColumnInfo.eventIndex;
            notificationColumnInfo2.titleIndex = notificationColumnInfo.titleIndex;
            notificationColumnInfo2.bodyIndex = notificationColumnInfo.bodyIndex;
            notificationColumnInfo2.dataIndex = notificationColumnInfo.dataIndex;
            notificationColumnInfo2.sentAtIndex = notificationColumnInfo.sentAtIndex;
            notificationColumnInfo2.readAtIndex = notificationColumnInfo.readAtIndex;
            notificationColumnInfo2.maxColumnIndexValue = notificationColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (NotificationColumnInfo) realmObjectContext.getColumnInfo();
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
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$event() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.eventIndex);
    }

    public void realmSet$event(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.eventIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.eventIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.eventIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.eventIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$body() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bodyIndex);
    }

    public void realmSet$body(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bodyIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bodyIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bodyIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bodyIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public NotificationData realmGet$data() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.dataIndex)) {
            return null;
        }
        return (NotificationData) this.proxyState.getRealm$realm().get(NotificationData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.dataIndex), false, Collections.emptyList());
    }

    public void realmSet$data(NotificationData notificationData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (notificationData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.dataIndex);
                return;
            }
            this.proxyState.checkValidObject(notificationData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.dataIndex, ((RealmObjectProxy) notificationData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("data")) {
            if (notificationData != null && !RealmObject.isManaged(notificationData)) {
                notificationData = (NotificationData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(notificationData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (notificationData == null) {
                row$realm.nullifyLink(this.columnInfo.dataIndex);
                return;
            }
            this.proxyState.checkValidObject(notificationData);
            row$realm.getTable().setLink(this.columnInfo.dataIndex, row$realm.getIndex(), ((RealmObjectProxy) notificationData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$sentAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sentAtIndex);
    }

    public void realmSet$sentAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sentAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sentAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sentAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sentAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$readAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.readAtIndex);
    }

    public void realmSet$readAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.readAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.readAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.readAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.readAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("event", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(FCM.BODY, RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("data", RealmFieldType.OBJECT, C4626xe255e1e5.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("sentAt", RealmFieldType.STRING, false, false, false);
        builder3.addPersistedProperty(Notification.Fields.readAt, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static NotificationColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new NotificationColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.notification.Notification createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r1 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r3 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy$NotificationColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.NotificationColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r11)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r11)
            long r2 = r1.findFirstString(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r2 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r12
        L_0x006c:
            java.lang.String r2 = "data"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r1 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r1 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxyInterface r3 = (p046io.realm.C4628x1a6dcade) r3
            java.lang.String r4 = "event"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$event(r12)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$event(r4)
        L_0x00bf:
            java.lang.String r4 = "title"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00d8
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d1
            r3.realmSet$title(r12)
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$title(r4)
        L_0x00d8:
            java.lang.String r4 = "body"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f1
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00ea
            r3.realmSet$body(r12)
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$body(r4)
        L_0x00f1:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x010c
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x0101
            r3.realmSet$data(r12)
            goto L_0x010c
        L_0x0101:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.notification.NotificationData r0 = p046io.realm.C4626xe255e1e5.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$data(r0)
        L_0x010c:
            java.lang.String r0 = "sentAt"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x0125
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x011e
            r3.realmSet$sentAt(r12)
            goto L_0x0125
        L_0x011e:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$sentAt(r0)
        L_0x0125:
            java.lang.String r0 = "readAt"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x013e
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x0137
            r3.realmSet$readAt(r12)
            goto L_0x013e
        L_0x0137:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$readAt(r0)
        L_0x013e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.notification.Notification");
    }

    public static Notification createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Notification notification = new Notification();
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("event")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$event(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$event((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals(FCM.BODY)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$body(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$body((String) null);
                }
            } else if (nextName.equals("data")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$data((NotificationData) null);
                } else {
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$data(C4626xe255e1e5.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("sentAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$sentAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$sentAt((String) null);
                }
            } else if (!nextName.equals(Notification.Fields.readAt)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$readAt(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$readAt((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Notification) realm.copyToRealm(notification, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Notification.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy ru_unicorn_ujin_data_realm_notification_notificationrealmproxy = new ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_notification_notificationrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.notification.Notification copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.NotificationColumnInfo r9, p035ru.unicorn.ujin.data.realm.notification.Notification r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.notification.Notification r1 = (p035ru.unicorn.ujin.data.realm.notification.Notification) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.notification.Notification> r2 = p035ru.unicorn.ujin.data.realm.notification.Notification.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxyInterface r5 = (p046io.realm.C4628x1a6dcade) r5
            java.lang.String r5 = r5.realmGet$id()
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
            io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.notification.Notification r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.notification.Notification r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy$NotificationColumnInfo, ru.unicorn.ujin.data.realm.notification.Notification, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.notification.Notification");
    }

    public static Notification copy(Realm realm, NotificationColumnInfo notificationColumnInfo, Notification notification, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(notification);
        if (realmObjectProxy != null) {
            return (Notification) realmObjectProxy;
        }
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Notification.class), notificationColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(notificationColumnInfo.idIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(notificationColumnInfo.eventIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$event());
        osObjectBuilder.addString(notificationColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(notificationColumnInfo.bodyIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$body());
        osObjectBuilder.addString(notificationColumnInfo.sentAtIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$sentAt());
        osObjectBuilder.addString(notificationColumnInfo.readAtIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$readAt());
        ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(notification, newProxyInstance);
        NotificationData realmGet$data = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$data();
        if (realmGet$data == null) {
            newProxyInstance.realmSet$data((NotificationData) null);
        } else {
            NotificationData notificationData = (NotificationData) map.get(realmGet$data);
            if (notificationData != null) {
                newProxyInstance.realmSet$data(notificationData);
            } else {
                newProxyInstance.realmSet$data(C4626xe255e1e5.copyOrUpdate(realm, (C4626xe255e1e5.NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class), realmGet$data, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Notification notification, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Notification notification2 = notification;
        Map<RealmModel, Long> map2 = map;
        if (notification2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notification2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Notification.class);
        long nativePtr = table.getNativePtr();
        NotificationColumnInfo notificationColumnInfo = (NotificationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Notification.class);
        long j3 = notificationColumnInfo.idIndex;
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification2;
        String realmGet$id = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(notification2, Long.valueOf(j2));
        String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$event();
        if (realmGet$event != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.eventIndex, j2, realmGet$event, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$body = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.bodyIndex, j2, realmGet$body, false);
        }
        NotificationData realmGet$data = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$data();
        if (realmGet$data != null) {
            Long l = map2.get(realmGet$data);
            if (l == null) {
                l = Long.valueOf(C4626xe255e1e5.insert(realm2, realmGet$data, map2));
            }
            Table.nativeSetLink(nativePtr, notificationColumnInfo.dataIndex, j2, l.longValue(), false);
        }
        String realmGet$sentAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$sentAt();
        if (realmGet$sentAt != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.sentAtIndex, j2, realmGet$sentAt, false);
        }
        String realmGet$readAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$readAt();
        if (realmGet$readAt != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.readAtIndex, j2, realmGet$readAt, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Notification.class);
        long nativePtr = table.getNativePtr();
        NotificationColumnInfo notificationColumnInfo = (NotificationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Notification.class);
        long j3 = notificationColumnInfo.idIndex;
        while (it.hasNext()) {
            Notification notification = (Notification) it.next();
            if (!map2.containsKey(notification)) {
                if (notification instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notification;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(notification, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification;
                String realmGet$id = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(notification, Long.valueOf(j2));
                String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$event();
                if (realmGet$event != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.eventIndex, j2, realmGet$event, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.titleIndex, j2, realmGet$title, false);
                }
                String realmGet$body = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$body();
                if (realmGet$body != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.bodyIndex, j2, realmGet$body, false);
                }
                NotificationData realmGet$data = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$data();
                if (realmGet$data != null) {
                    Long l = map2.get(realmGet$data);
                    if (l == null) {
                        l = Long.valueOf(C4626xe255e1e5.insert(realm2, realmGet$data, map2));
                    }
                    table.setLink(notificationColumnInfo.dataIndex, j2, l.longValue(), false);
                }
                String realmGet$sentAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$sentAt();
                if (realmGet$sentAt != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.sentAtIndex, j2, realmGet$sentAt, false);
                }
                String realmGet$readAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$readAt();
                if (realmGet$readAt != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.readAtIndex, j2, realmGet$readAt, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Notification notification, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Notification notification2 = notification;
        Map<RealmModel, Long> map2 = map;
        if (notification2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notification2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Notification.class);
        long nativePtr = table.getNativePtr();
        NotificationColumnInfo notificationColumnInfo = (NotificationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Notification.class);
        long j2 = notificationColumnInfo.idIndex;
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification2;
        String realmGet$id = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(notification2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$event();
        if (realmGet$event != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.eventIndex, createRowWithPrimaryKey, realmGet$event, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationColumnInfo.eventIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$body = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.bodyIndex, createRowWithPrimaryKey, realmGet$body, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationColumnInfo.bodyIndex, createRowWithPrimaryKey, false);
        }
        NotificationData realmGet$data = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$data();
        if (realmGet$data != null) {
            Long l = map2.get(realmGet$data);
            if (l == null) {
                l = Long.valueOf(C4626xe255e1e5.insertOrUpdate(realm2, realmGet$data, map2));
            }
            Table.nativeSetLink(nativePtr, notificationColumnInfo.dataIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, notificationColumnInfo.dataIndex, createRowWithPrimaryKey);
        }
        String realmGet$sentAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$sentAt();
        if (realmGet$sentAt != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.sentAtIndex, createRowWithPrimaryKey, realmGet$sentAt, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationColumnInfo.sentAtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$readAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$readAt();
        if (realmGet$readAt != null) {
            Table.nativeSetString(nativePtr, notificationColumnInfo.readAtIndex, createRowWithPrimaryKey, realmGet$readAt, false);
        } else {
            Table.nativeSetNull(nativePtr, notificationColumnInfo.readAtIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Notification.class);
        long nativePtr = table.getNativePtr();
        NotificationColumnInfo notificationColumnInfo = (NotificationColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Notification.class);
        long j3 = notificationColumnInfo.idIndex;
        while (it.hasNext()) {
            Notification notification = (Notification) it.next();
            if (!map2.containsKey(notification)) {
                if (notification instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) notification;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(notification, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification;
                String realmGet$id = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(notification, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$event = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$event();
                if (realmGet$event != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, notificationColumnInfo.eventIndex, createRowWithPrimaryKey, realmGet$event, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, notificationColumnInfo.eventIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$body = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$body();
                if (realmGet$body != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.bodyIndex, createRowWithPrimaryKey, realmGet$body, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationColumnInfo.bodyIndex, createRowWithPrimaryKey, false);
                }
                NotificationData realmGet$data = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$data();
                if (realmGet$data != null) {
                    Long l = map2.get(realmGet$data);
                    if (l == null) {
                        l = Long.valueOf(C4626xe255e1e5.insertOrUpdate(realm2, realmGet$data, map2));
                    }
                    Table.nativeSetLink(nativePtr, notificationColumnInfo.dataIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, notificationColumnInfo.dataIndex, createRowWithPrimaryKey);
                }
                String realmGet$sentAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$sentAt();
                if (realmGet$sentAt != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.sentAtIndex, createRowWithPrimaryKey, realmGet$sentAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationColumnInfo.sentAtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$readAt = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmGet$readAt();
                if (realmGet$readAt != null) {
                    Table.nativeSetString(nativePtr, notificationColumnInfo.readAtIndex, createRowWithPrimaryKey, realmGet$readAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, notificationColumnInfo.readAtIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static Notification createDetachedCopy(Notification notification, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Notification notification2;
        if (i > i2 || notification == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(notification);
        if (cacheData == null) {
            notification2 = new Notification();
            map.put(notification, new RealmObjectProxy.CacheData(i, notification2));
        } else if (i >= cacheData.minDepth) {
            return (Notification) cacheData.object;
        } else {
            cacheData.minDepth = i;
            notification2 = (Notification) cacheData.object;
        }
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification2;
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2 = notification;
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$event(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$event());
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$body(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$body());
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$data(C4626xe255e1e5.createDetachedCopy(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$data(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$sentAt(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$sentAt());
        ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface.realmSet$readAt(ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$readAt());
        return notification2;
    }

    static Notification update(Realm realm, NotificationColumnInfo notificationColumnInfo, Notification notification, Notification notification2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface = notification;
        C4628x1a6dcade ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2 = notification2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Notification.class), notificationColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(notificationColumnInfo.idIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(notificationColumnInfo.eventIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$event());
        osObjectBuilder.addString(notificationColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(notificationColumnInfo.bodyIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$body());
        NotificationData realmGet$data = ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$data();
        if (realmGet$data == null) {
            osObjectBuilder.addNull(notificationColumnInfo.dataIndex);
        } else {
            NotificationData notificationData = (NotificationData) map.get(realmGet$data);
            if (notificationData != null) {
                osObjectBuilder.addObject(notificationColumnInfo.dataIndex, notificationData);
            } else {
                osObjectBuilder.addObject(notificationColumnInfo.dataIndex, C4626xe255e1e5.copyOrUpdate(realm, (C4626xe255e1e5.NotificationDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) NotificationData.class), realmGet$data, true, map, set));
            }
        }
        osObjectBuilder.addString(notificationColumnInfo.sentAtIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$sentAt());
        osObjectBuilder.addString(notificationColumnInfo.readAtIndex, ru_unicorn_ujin_data_realm_notification_notificationrealmproxyinterface2.realmGet$readAt());
        osObjectBuilder.updateExistingObject();
        return notification;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Notification = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{event:");
        sb.append(realmGet$event() != null ? realmGet$event() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{body:");
        sb.append(realmGet$body() != null ? realmGet$body() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{data:");
        sb.append(realmGet$data() != null ? C4626xe255e1e5.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{sentAt:");
        sb.append(realmGet$sentAt() != null ? realmGet$sentAt() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{readAt:");
        if (realmGet$readAt() != null) {
            str = realmGet$readAt();
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
        ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy ru_unicorn_ujin_data_realm_notification_notificationrealmproxy = (ru_unicorn_ujin_data_realm_notification_NotificationRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_notification_notificationrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_notification_notificationrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_notification_notificationrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
