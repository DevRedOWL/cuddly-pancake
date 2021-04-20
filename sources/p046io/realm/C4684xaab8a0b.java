package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy */
public class C4684xaab8a0b extends Devices implements RealmObjectProxy, C4685x713f1f6e {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DevicesColumnInfo columnInfo;
    private ProxyState<Devices> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Devices";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy$DevicesColumnInfo */
    static final class DevicesColumnInfo extends ColumnInfo {
        long deviceTokenIndex;
        long maxColumnIndexValue;
        long serialNumberIndex;

        DevicesColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.serialNumberIndex = addColumnDetails("serialNumber", "serialNumber", objectSchemaInfo);
            this.deviceTokenIndex = addColumnDetails("deviceToken", "deviceToken", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DevicesColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DevicesColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DevicesColumnInfo devicesColumnInfo = (DevicesColumnInfo) columnInfo;
            DevicesColumnInfo devicesColumnInfo2 = (DevicesColumnInfo) columnInfo2;
            devicesColumnInfo2.serialNumberIndex = devicesColumnInfo.serialNumberIndex;
            devicesColumnInfo2.deviceTokenIndex = devicesColumnInfo.deviceTokenIndex;
            devicesColumnInfo2.maxColumnIndexValue = devicesColumnInfo.maxColumnIndexValue;
        }
    }

    C4684xaab8a0b() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DevicesColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$serialNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.serialNumberIndex);
    }

    public void realmSet$serialNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'serialNumber' cannot be changed after object was created.");
        }
    }

    public String realmGet$deviceToken() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceTokenIndex);
    }

    public void realmSet$deviceToken(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deviceTokenIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceTokenIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deviceTokenIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deviceTokenIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("serialNumber", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("deviceToken", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DevicesColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DevicesColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "serialNumber"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy$DevicesColumnInfo r3 = (p046io.realm.C4684xaab8a0b.DevicesColumnInfo) r3
            long r3 = r3.serialNumberIndex
            boolean r5 = r13.isNull(r2)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r2)
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r1
        L_0x0065:
            if (r14 != 0) goto L_0x0094
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x008c
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy r14 = (p046io.realm.C4684xaab8a0b) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            java.lang.String r2 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy r14 = (p046io.realm.C4684xaab8a0b) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'serialNumber'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxyInterface r12 = (p046io.realm.C4685x713f1f6e) r12
            java.lang.String r0 = "deviceToken"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00a9
            r12.realmSet$deviceToken(r1)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$deviceToken(r13)
        L_0x00b0:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4684xaab8a0b.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.device.Devices");
    }

    public static Devices createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Devices devices = new Devices();
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("serialNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmSet$serialNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmSet$serialNumber((String) null);
                }
                z = true;
            } else if (!nextName.equals("deviceToken")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmSet$deviceToken(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmSet$deviceToken((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Devices) realm.copyToRealm(devices, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'serialNumber'.");
    }

    private static C4684xaab8a0b newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Devices.class), false, Collections.emptyList());
        C4684xaab8a0b ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxy = new C4684xaab8a0b();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4684xaab8a0b.DevicesColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.device.Devices r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.device.Devices> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.device.Devices.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.serialNumberIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxyInterface r5 = (p046io.realm.C4685x713f1f6e) r5
            java.lang.String r5 = r5.realmGet$serialNumber()
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.device.Devices r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.device.Devices r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4684xaab8a0b.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_device_DevicesRealmProxy$DevicesColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.device.Devices, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.device.Devices");
    }

    public static Devices copy(Realm realm, DevicesColumnInfo devicesColumnInfo, Devices devices, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(devices);
        if (realmObjectProxy != null) {
            return (Devices) realmObjectProxy;
        }
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Devices.class), devicesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(devicesColumnInfo.serialNumberIndex, ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$serialNumber());
        osObjectBuilder.addString(devicesColumnInfo.deviceTokenIndex, ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$deviceToken());
        C4684xaab8a0b newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(devices, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Devices devices, Map<RealmModel, Long> map) {
        long j;
        long j2;
        if (devices instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) devices;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Devices.class);
        long nativePtr = table.getNativePtr();
        DevicesColumnInfo devicesColumnInfo = (DevicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Devices.class);
        long j3 = devicesColumnInfo.serialNumberIndex;
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
        String realmGet$serialNumber = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$serialNumber();
        if (realmGet$serialNumber == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$serialNumber);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$serialNumber);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$serialNumber);
            j2 = j;
        }
        map.put(devices, Long.valueOf(j2));
        String realmGet$deviceToken = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$deviceToken();
        if (realmGet$deviceToken != null) {
            Table.nativeSetString(nativePtr, devicesColumnInfo.deviceTokenIndex, j2, realmGet$deviceToken, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Devices.class);
        long nativePtr = table.getNativePtr();
        DevicesColumnInfo devicesColumnInfo = (DevicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Devices.class);
        long j3 = devicesColumnInfo.serialNumberIndex;
        while (it.hasNext()) {
            Devices devices = (Devices) it.next();
            if (!map2.containsKey(devices)) {
                if (devices instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) devices;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(devices, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
                String realmGet$serialNumber = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$serialNumber();
                if (realmGet$serialNumber == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$serialNumber);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$serialNumber);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$serialNumber);
                    j2 = j;
                }
                map2.put(devices, Long.valueOf(j2));
                String realmGet$deviceToken = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$deviceToken();
                if (realmGet$deviceToken != null) {
                    Table.nativeSetString(nativePtr, devicesColumnInfo.deviceTokenIndex, j2, realmGet$deviceToken, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Devices devices, Map<RealmModel, Long> map) {
        long j;
        if (devices instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) devices;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Devices.class);
        long nativePtr = table.getNativePtr();
        DevicesColumnInfo devicesColumnInfo = (DevicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Devices.class);
        long j2 = devicesColumnInfo.serialNumberIndex;
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
        String realmGet$serialNumber = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$serialNumber();
        if (realmGet$serialNumber == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$serialNumber);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$serialNumber) : j;
        map.put(devices, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$deviceToken = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$deviceToken();
        if (realmGet$deviceToken != null) {
            Table.nativeSetString(nativePtr, devicesColumnInfo.deviceTokenIndex, createRowWithPrimaryKey, realmGet$deviceToken, false);
        } else {
            Table.nativeSetNull(nativePtr, devicesColumnInfo.deviceTokenIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Devices.class);
        long nativePtr = table.getNativePtr();
        DevicesColumnInfo devicesColumnInfo = (DevicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Devices.class);
        long j2 = devicesColumnInfo.serialNumberIndex;
        while (it.hasNext()) {
            Devices devices = (Devices) it.next();
            if (!map2.containsKey(devices)) {
                if (devices instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) devices;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(devices, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
                String realmGet$serialNumber = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$serialNumber();
                if (realmGet$serialNumber == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$serialNumber);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$serialNumber) : j;
                map2.put(devices, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$deviceToken = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmGet$deviceToken();
                if (realmGet$deviceToken != null) {
                    Table.nativeSetString(nativePtr, devicesColumnInfo.deviceTokenIndex, createRowWithPrimaryKey, realmGet$deviceToken, false);
                } else {
                    Table.nativeSetNull(nativePtr, devicesColumnInfo.deviceTokenIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static Devices createDetachedCopy(Devices devices, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Devices devices2;
        if (i > i2 || devices == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(devices);
        if (cacheData == null) {
            devices2 = new Devices();
            map.put(devices, new RealmObjectProxy.CacheData(i, devices2));
        } else if (i >= cacheData.minDepth) {
            return (Devices) cacheData.object;
        } else {
            cacheData.minDepth = i;
            devices2 = (Devices) cacheData.object;
        }
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices2;
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface2 = devices;
        ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmSet$serialNumber(ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface2.realmGet$serialNumber());
        ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface.realmSet$deviceToken(ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface2.realmGet$deviceToken());
        return devices2;
    }

    static Devices update(Realm realm, DevicesColumnInfo devicesColumnInfo, Devices devices, Devices devices2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface = devices;
        C4685x713f1f6e ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface2 = devices2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Devices.class), devicesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(devicesColumnInfo.serialNumberIndex, ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface2.realmGet$serialNumber());
        osObjectBuilder.addString(devicesColumnInfo.deviceTokenIndex, ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxyinterface2.realmGet$deviceToken());
        osObjectBuilder.updateExistingObject();
        return devices;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Devices = proxy[");
        sb.append("{serialNumber:");
        String str = "null";
        sb.append(realmGet$serialNumber() != null ? realmGet$serialNumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{deviceToken:");
        if (realmGet$deviceToken() != null) {
            str = realmGet$deviceToken();
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
        C4684xaab8a0b ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxy = (C4684xaab8a0b) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_device_devicesrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
