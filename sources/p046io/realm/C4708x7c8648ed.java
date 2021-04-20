package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy */
public class C4708x7c8648ed extends ServiceTicketType implements RealmObjectProxy, C4709x9f6ffecc {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceTicketTypeColumnInfo columnInfo;
    private ProxyState<ServiceTicketType> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceTicketType";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy$ServiceTicketTypeColumnInfo */
    static final class ServiceTicketTypeColumnInfo extends ColumnInfo {
        long descriptionIndex;
        long idIndex;
        long maxColumnIndexValue;
        long slugIndex;
        long titleIndex;

        ServiceTicketTypeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.slugIndex = addColumnDetails("slug", "slug", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceTicketTypeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceTicketTypeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo = (ServiceTicketTypeColumnInfo) columnInfo;
            ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo2 = (ServiceTicketTypeColumnInfo) columnInfo2;
            serviceTicketTypeColumnInfo2.idIndex = serviceTicketTypeColumnInfo.idIndex;
            serviceTicketTypeColumnInfo2.titleIndex = serviceTicketTypeColumnInfo.titleIndex;
            serviceTicketTypeColumnInfo2.slugIndex = serviceTicketTypeColumnInfo.slugIndex;
            serviceTicketTypeColumnInfo2.descriptionIndex = serviceTicketTypeColumnInfo.descriptionIndex;
            serviceTicketTypeColumnInfo2.maxColumnIndexValue = serviceTicketTypeColumnInfo.maxColumnIndexValue;
        }
    }

    C4708x7c8648ed() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceTicketTypeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
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

    public String realmGet$slug() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.slugIndex);
    }

    public void realmSet$slug(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.slugIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.slugIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.slugIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.slugIndex, row$realm.getIndex(), str, true);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("slug", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceTicketTypeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceTicketTypeColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy$ServiceTicketTypeColumnInfo r3 = (p046io.realm.C4708x7c8648ed.ServiceTicketTypeColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            r6 = -1
            if (r5 != 0) goto L_0x002e
            long r8 = r13.getLong(r1)
            long r3 = r14.findFirstLong(r3, r8)
            goto L_0x002f
        L_0x002e:
            r3 = r6
        L_0x002f:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x0061
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005c }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005c }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy     // Catch:{ all -> 0x005c }
            r14.<init>()     // Catch:{ all -> 0x005c }
            r5.clear()
            goto L_0x0062
        L_0x005c:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0061:
            r14 = r2
        L_0x0062:
            if (r14 != 0) goto L_0x0095
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x008d
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007b
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy r14 = (p046io.realm.C4708x7c8648ed) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            int r1 = r13.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy r14 = (p046io.realm.C4708x7c8648ed) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxyInterface r12 = (p046io.realm.C4709x9f6ffecc) r12
            java.lang.String r0 = "title"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b1
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00aa
            r12.realmSet$title(r2)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$title(r0)
        L_0x00b1:
            java.lang.String r0 = "slug"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c3
            r12.realmSet$slug(r2)
            goto L_0x00ca
        L_0x00c3:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$slug(r0)
        L_0x00ca:
            java.lang.String r0 = "description"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e3
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00dc
            r12.realmSet$description(r2)
            goto L_0x00e3
        L_0x00dc:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$description(r13)
        L_0x00e3:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4708x7c8648ed.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType");
    }

    public static ServiceTicketType createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceTicketType serviceTicketType = new ServiceTicketType();
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("slug")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$slug(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$slug((String) null);
                }
            } else if (!nextName.equals("description")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$description(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$description((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ServiceTicketType) realm.copyToRealm(serviceTicketType, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4708x7c8648ed newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicketType.class), false, Collections.emptyList());
        C4708x7c8648ed ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxy = new C4708x7c8648ed();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4708x7c8648ed.ServiceTicketTypeColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketType.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxyInterface r5 = (p046io.realm.C4709x9f6ffecc) r5
            int r5 = r5.realmGet$id()
            long r5 = (long) r5
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r0 = 0
            goto L_0x008e
        L_0x006a:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0088 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0088 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0088 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0088 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0088 }
            r0.clear()
            goto L_0x008d
        L_0x0088:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008d:
            r0 = r11
        L_0x008e:
            r3 = r1
            if (r0 == 0) goto L_0x009b
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4708x7c8648ed.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketTypeRealmProxy$ServiceTicketTypeColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicketType");
    }

    public static ServiceTicketType copy(Realm realm, ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo, ServiceTicketType serviceTicketType, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(serviceTicketType);
        if (realmObjectProxy != null) {
            return (ServiceTicketType) realmObjectProxy;
        }
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceTicketType.class), serviceTicketTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(serviceTicketTypeColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(serviceTicketTypeColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(serviceTicketTypeColumnInfo.slugIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$slug());
        osObjectBuilder.addString(serviceTicketTypeColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$description());
        C4708x7c8648ed newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(serviceTicketType, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceTicketType serviceTicketType, Map<RealmModel, Long> map) {
        long j;
        long j2;
        ServiceTicketType serviceTicketType2 = serviceTicketType;
        if (serviceTicketType2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicketType2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceTicketType.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo = (ServiceTicketTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicketType.class);
        long j3 = serviceTicketTypeColumnInfo.idIndex;
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(serviceTicketType2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.slugIndex, j2, realmGet$slug, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.descriptionIndex, j2, realmGet$description, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceTicketType.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo = (ServiceTicketTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicketType.class);
        long j2 = serviceTicketTypeColumnInfo.idIndex;
        while (it.hasNext()) {
            ServiceTicketType serviceTicketType = (ServiceTicketType) it.next();
            if (!map2.containsKey(serviceTicketType)) {
                if (serviceTicketType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicketType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceTicketType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(serviceTicketType, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.slugIndex, j3, realmGet$slug, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.descriptionIndex, j3, realmGet$description, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceTicketType serviceTicketType, Map<RealmModel, Long> map) {
        ServiceTicketType serviceTicketType2 = serviceTicketType;
        if (serviceTicketType2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicketType2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ServiceTicketType.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo = (ServiceTicketTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicketType.class);
        long j = serviceTicketTypeColumnInfo.idIndex;
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map.put(serviceTicketType2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketTypeColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.slugIndex, createRowWithPrimaryKey, realmGet$slug, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketTypeColumnInfo.slugIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.descriptionIndex, createRowWithPrimaryKey, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketTypeColumnInfo.descriptionIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ServiceTicketType.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo = (ServiceTicketTypeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicketType.class);
        long j2 = serviceTicketTypeColumnInfo.idIndex;
        while (it.hasNext()) {
            ServiceTicketType serviceTicketType = (ServiceTicketType) it.next();
            if (!map2.containsKey(serviceTicketType)) {
                if (serviceTicketType instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicketType;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceTicketType, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$id()));
                }
                long j3 = j;
                map2.put(serviceTicketType, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.titleIndex, j3, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketTypeColumnInfo.titleIndex, j3, false);
                }
                String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.slugIndex, j3, realmGet$slug, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketTypeColumnInfo.slugIndex, j3, false);
                }
                String realmGet$description = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, serviceTicketTypeColumnInfo.descriptionIndex, j3, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketTypeColumnInfo.descriptionIndex, j3, false);
                }
            }
        }
    }

    public static ServiceTicketType createDetachedCopy(ServiceTicketType serviceTicketType, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceTicketType serviceTicketType2;
        if (i > i2 || serviceTicketType == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceTicketType);
        if (cacheData == null) {
            serviceTicketType2 = new ServiceTicketType();
            map.put(serviceTicketType, new RealmObjectProxy.CacheData(i, serviceTicketType2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceTicketType) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceTicketType2 = (ServiceTicketType) cacheData.object;
        }
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType2;
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2 = serviceTicketType;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$slug(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$slug());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface.realmSet$description(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$description());
        return serviceTicketType2;
    }

    static ServiceTicketType update(Realm realm, ServiceTicketTypeColumnInfo serviceTicketTypeColumnInfo, ServiceTicketType serviceTicketType, ServiceTicketType serviceTicketType2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface = serviceTicketType;
        C4709x9f6ffecc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2 = serviceTicketType2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceTicketType.class), serviceTicketTypeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(serviceTicketTypeColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(serviceTicketTypeColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(serviceTicketTypeColumnInfo.slugIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$slug());
        osObjectBuilder.addString(serviceTicketTypeColumnInfo.descriptionIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxyinterface2.realmGet$description());
        osObjectBuilder.updateExistingObject();
        return serviceTicketType;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceTicketType = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{slug:");
        sb.append(realmGet$slug() != null ? realmGet$slug() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        if (realmGet$description() != null) {
            str = realmGet$description();
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
        C4708x7c8648ed ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxy = (C4708x7c8648ed) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_servicetickettyperealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
