package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy */
public class C4676xf1982dca extends Device implements RealmObjectProxy, C4677x99a5428f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DeviceColumnInfo columnInfo;
    private ProxyState<Device> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Device";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy$DeviceColumnInfo */
    static final class DeviceColumnInfo extends ColumnInfo {
        long idIndex;
        long ipAdressIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long statusIndex;
        long tokenIndex;
        long valueIndex;

        DeviceColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.ipAdressIndex = addColumnDetails("ipAdress", "ipAdress", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.statusIndex = addColumnDetails(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DeviceColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DeviceColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DeviceColumnInfo deviceColumnInfo = (DeviceColumnInfo) columnInfo;
            DeviceColumnInfo deviceColumnInfo2 = (DeviceColumnInfo) columnInfo2;
            deviceColumnInfo2.idIndex = deviceColumnInfo.idIndex;
            deviceColumnInfo2.ipAdressIndex = deviceColumnInfo.ipAdressIndex;
            deviceColumnInfo2.nameIndex = deviceColumnInfo.nameIndex;
            deviceColumnInfo2.tokenIndex = deviceColumnInfo.tokenIndex;
            deviceColumnInfo2.valueIndex = deviceColumnInfo.valueIndex;
            deviceColumnInfo2.statusIndex = deviceColumnInfo.statusIndex;
            deviceColumnInfo2.maxColumnIndexValue = deviceColumnInfo.maxColumnIndexValue;
        }
    }

    C4676xf1982dca() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DeviceColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Long.valueOf(this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Long l) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$ipAdress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ipAdressIndex);
    }

    public void realmSet$ipAdress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ipAdressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ipAdressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ipAdressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ipAdressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
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

    public int realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.valueIndex);
    }

    public void realmSet$value(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.valueIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.valueIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public int realmGet$status() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.statusIndex);
    }

    public void realmSet$status(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.statusIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.statusIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("ipAdress", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("token", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty(NotificationCompat.CATEGORY_STATUS, RealmFieldType.INTEGER, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DeviceColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DeviceColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v7, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r14 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r4 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy$DeviceColumnInfo r3 = (p046io.realm.C4676xf1982dca.DeviceColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            long r5 = r13.getLong(r1)
            long r3 = r14.findFirstLong(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r3 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy     // Catch:{ all -> 0x005f }
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
            if (r14 != 0) goto L_0x0098
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x0090
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r14 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy r14 = (p046io.realm.C4676xf1982dca) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r14 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            long r4 = r13.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy r14 = (p046io.realm.C4676xf1982dca) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxyInterface r12 = (p046io.realm.C4677x99a5428f) r12
            java.lang.String r0 = "ipAdress"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00ad
            r12.realmSet$ipAdress(r2)
            goto L_0x00b4
        L_0x00ad:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$ipAdress(r0)
        L_0x00b4:
            java.lang.String r0 = "name"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c6
            r12.realmSet$name(r2)
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$name(r0)
        L_0x00cd:
            java.lang.String r0 = "token"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e7
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00e0
            r12.realmSet$token(r2)
            goto L_0x00e7
        L_0x00e0:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$token(r0)
        L_0x00e7:
            java.lang.String r0 = "value"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0106
            boolean r1 = r13.isNull(r0)
            if (r1 != 0) goto L_0x00fe
            int r0 = r13.getInt(r0)
            r12.realmSet$value(r0)
            goto L_0x0106
        L_0x00fe:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Trying to set non-nullable field 'value' to null."
            r12.<init>(r13)
            throw r12
        L_0x0106:
            java.lang.String r0 = "status"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0124
            boolean r1 = r13.isNull(r0)
            if (r1 != 0) goto L_0x011c
            int r13 = r13.getInt(r0)
            r12.realmSet$status(r13)
            goto L_0x0124
        L_0x011c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Trying to set non-nullable field 'status' to null."
            r12.<init>(r13)
            throw r12
        L_0x0124:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4676xf1982dca.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device");
    }

    public static Device createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Device device = new Device();
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$id(Long.valueOf(jsonReader.nextLong()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$id((Long) null);
                }
                z = true;
            } else if (nextName.equals("ipAdress")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$ipAdress(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$ipAdress((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("token")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$token(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$token((String) null);
                }
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$value(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'value' to null.");
                }
            } else if (!nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$status(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Device) realm.copyToRealm(device, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4676xf1982dca newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Device.class), false, Collections.emptyList());
        C4676xf1982dca ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxy = new C4676xf1982dca();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4676xf1982dca.DeviceColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device r1 = (p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device> r2 = p035ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxyInterface r5 = (p046io.realm.C4677x99a5428f) r5
            java.lang.Long r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4676xf1982dca.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_DeviceRealmProxy$DeviceColumnInfo, ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.repository.udp.repository.Device");
    }

    public static Device copy(Realm realm, DeviceColumnInfo deviceColumnInfo, Device device, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(device);
        if (realmObjectProxy != null) {
            return (Device) realmObjectProxy;
        }
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Device.class), deviceColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(deviceColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(deviceColumnInfo.ipAdressIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$ipAdress());
        osObjectBuilder.addString(deviceColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(deviceColumnInfo.tokenIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$token());
        osObjectBuilder.addInteger(deviceColumnInfo.valueIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$value()));
        osObjectBuilder.addInteger(deviceColumnInfo.statusIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$status()));
        C4676xf1982dca newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(device, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Device device, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Device device2 = device;
        if (device2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) device2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Device.class);
        long nativePtr = table.getNativePtr();
        DeviceColumnInfo deviceColumnInfo = (DeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Device.class);
        long j3 = deviceColumnInfo.idIndex;
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device2;
        Long realmGet$id = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id().longValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(device2, Long.valueOf(j2));
        String realmGet$ipAdress = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$ipAdress();
        if (realmGet$ipAdress != null) {
            Table.nativeSetString(nativePtr, deviceColumnInfo.ipAdressIndex, j2, realmGet$ipAdress, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, deviceColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$token = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, deviceColumnInfo.tokenIndex, j2, realmGet$token, false);
        }
        long j4 = nativePtr;
        long j5 = j2;
        Table.nativeSetLong(j4, deviceColumnInfo.valueIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$value(), false);
        Table.nativeSetLong(j4, deviceColumnInfo.statusIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$status(), false);
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Device.class);
        long nativePtr = table.getNativePtr();
        DeviceColumnInfo deviceColumnInfo = (DeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Device.class);
        long j3 = deviceColumnInfo.idIndex;
        while (it.hasNext()) {
            Device device = (Device) it.next();
            if (!map2.containsKey(device)) {
                if (device instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) device;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(device, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device;
                Long realmGet$id = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id().longValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(device, Long.valueOf(j4));
                String realmGet$ipAdress = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$ipAdress();
                if (realmGet$ipAdress != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, deviceColumnInfo.ipAdressIndex, j4, realmGet$ipAdress, false);
                } else {
                    j2 = j3;
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, deviceColumnInfo.nameIndex, j4, realmGet$name, false);
                }
                String realmGet$token = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, deviceColumnInfo.tokenIndex, j4, realmGet$token, false);
                }
                long j5 = j4;
                Table.nativeSetLong(nativePtr, deviceColumnInfo.valueIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$value(), false);
                Table.nativeSetLong(nativePtr, deviceColumnInfo.statusIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$status(), false);
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Device device, Map<RealmModel, Long> map) {
        long j;
        Device device2 = device;
        if (device2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) device2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Device.class);
        long nativePtr = table.getNativePtr();
        DeviceColumnInfo deviceColumnInfo = (DeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Device.class);
        long j2 = deviceColumnInfo.idIndex;
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device2;
        if (ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id().longValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id()) : j;
        map.put(device2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$ipAdress = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$ipAdress();
        if (realmGet$ipAdress != null) {
            Table.nativeSetString(nativePtr, deviceColumnInfo.ipAdressIndex, createRowWithPrimaryKey, realmGet$ipAdress, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceColumnInfo.ipAdressIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, deviceColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$token = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            Table.nativeSetString(nativePtr, deviceColumnInfo.tokenIndex, createRowWithPrimaryKey, realmGet$token, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceColumnInfo.tokenIndex, createRowWithPrimaryKey, false);
        }
        long j3 = nativePtr;
        long j4 = createRowWithPrimaryKey;
        Table.nativeSetLong(j3, deviceColumnInfo.valueIndex, j4, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$value(), false);
        Table.nativeSetLong(j3, deviceColumnInfo.statusIndex, j4, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$status(), false);
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Device.class);
        long nativePtr = table.getNativePtr();
        DeviceColumnInfo deviceColumnInfo = (DeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Device.class);
        long j3 = deviceColumnInfo.idIndex;
        while (it.hasNext()) {
            Device device = (Device) it.next();
            if (!map2.containsKey(device)) {
                if (device instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) device;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(device, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device;
                if (ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id().longValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(device, Long.valueOf(j4));
                String realmGet$ipAdress = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$ipAdress();
                if (realmGet$ipAdress != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, deviceColumnInfo.ipAdressIndex, j4, realmGet$ipAdress, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, deviceColumnInfo.ipAdressIndex, j4, false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, deviceColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceColumnInfo.nameIndex, j4, false);
                }
                String realmGet$token = ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    Table.nativeSetString(nativePtr, deviceColumnInfo.tokenIndex, j4, realmGet$token, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceColumnInfo.tokenIndex, j4, false);
                }
                long j5 = j4;
                Table.nativeSetLong(nativePtr, deviceColumnInfo.valueIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$value(), false);
                Table.nativeSetLong(nativePtr, deviceColumnInfo.statusIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmGet$status(), false);
                j3 = j2;
            }
        }
    }

    public static Device createDetachedCopy(Device device, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Device device2;
        if (i > i2 || device == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(device);
        if (cacheData == null) {
            device2 = new Device();
            map.put(device, new RealmObjectProxy.CacheData(i, device2));
        } else if (i >= cacheData.minDepth) {
            return (Device) cacheData.object;
        } else {
            cacheData.minDepth = i;
            device2 = (Device) cacheData.object;
        }
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device2;
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2 = device;
        ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$ipAdress(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$ipAdress());
        ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$token(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$token());
        ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface.realmSet$status(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$status());
        return device2;
    }

    static Device update(Realm realm, DeviceColumnInfo deviceColumnInfo, Device device, Device device2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface = device;
        C4677x99a5428f ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2 = device2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Device.class), deviceColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(deviceColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(deviceColumnInfo.ipAdressIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$ipAdress());
        osObjectBuilder.addString(deviceColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(deviceColumnInfo.tokenIndex, ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$token());
        osObjectBuilder.addInteger(deviceColumnInfo.valueIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$value()));
        osObjectBuilder.addInteger(deviceColumnInfo.statusIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_repository_udp_repository_devicerealmproxyinterface2.realmGet$status()));
        osObjectBuilder.updateExistingObject();
        return device;
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }
}
