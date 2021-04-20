package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.ble.data.BleReader;
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

/* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy */
public class ru_unicorn_ujin_ble_data_BleReaderRealmProxy extends BleReader implements RealmObjectProxy, ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BleReaderColumnInfo columnInfo;
    private ProxyState<BleReader> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BleReader";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy$BleReaderColumnInfo */
    static final class BleReaderColumnInfo extends ColumnInfo {
        long deviceClassIndex;
        long deviceKeyIndex;
        long deviceMacIndex;
        long deviceNameIndex;
        long deviceTitleIndex;
        long interfaceTypeIndex;
        long maxColumnIndexValue;
        long rssiIndex;
        long serialNumberIndex;
        long uuidIDIndex;
        long uuidRXIndex;
        long uuidServiceIndex;
        long uuidTXIndex;

        BleReaderColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.serialNumberIndex = addColumnDetails("serialNumber", "serialNumber", objectSchemaInfo);
            this.deviceKeyIndex = addColumnDetails("deviceKey", "deviceKey", objectSchemaInfo);
            this.deviceNameIndex = addColumnDetails("deviceName", "deviceName", objectSchemaInfo);
            this.deviceTitleIndex = addColumnDetails("deviceTitle", "deviceTitle", objectSchemaInfo);
            this.deviceClassIndex = addColumnDetails("deviceClass", "deviceClass", objectSchemaInfo);
            this.deviceMacIndex = addColumnDetails("deviceMac", "deviceMac", objectSchemaInfo);
            this.interfaceTypeIndex = addColumnDetails("interfaceType", "interfaceType", objectSchemaInfo);
            this.uuidIDIndex = addColumnDetails("uuidID", "uuidID", objectSchemaInfo);
            this.uuidTXIndex = addColumnDetails("uuidTX", "uuidTX", objectSchemaInfo);
            this.uuidRXIndex = addColumnDetails("uuidRX", "uuidRX", objectSchemaInfo);
            this.uuidServiceIndex = addColumnDetails("uuidService", "uuidService", objectSchemaInfo);
            this.rssiIndex = addColumnDetails("rssi", "rssi", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BleReaderColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BleReaderColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BleReaderColumnInfo bleReaderColumnInfo = (BleReaderColumnInfo) columnInfo;
            BleReaderColumnInfo bleReaderColumnInfo2 = (BleReaderColumnInfo) columnInfo2;
            bleReaderColumnInfo2.serialNumberIndex = bleReaderColumnInfo.serialNumberIndex;
            bleReaderColumnInfo2.deviceKeyIndex = bleReaderColumnInfo.deviceKeyIndex;
            bleReaderColumnInfo2.deviceNameIndex = bleReaderColumnInfo.deviceNameIndex;
            bleReaderColumnInfo2.deviceTitleIndex = bleReaderColumnInfo.deviceTitleIndex;
            bleReaderColumnInfo2.deviceClassIndex = bleReaderColumnInfo.deviceClassIndex;
            bleReaderColumnInfo2.deviceMacIndex = bleReaderColumnInfo.deviceMacIndex;
            bleReaderColumnInfo2.interfaceTypeIndex = bleReaderColumnInfo.interfaceTypeIndex;
            bleReaderColumnInfo2.uuidIDIndex = bleReaderColumnInfo.uuidIDIndex;
            bleReaderColumnInfo2.uuidTXIndex = bleReaderColumnInfo.uuidTXIndex;
            bleReaderColumnInfo2.uuidRXIndex = bleReaderColumnInfo.uuidRXIndex;
            bleReaderColumnInfo2.uuidServiceIndex = bleReaderColumnInfo.uuidServiceIndex;
            bleReaderColumnInfo2.rssiIndex = bleReaderColumnInfo.rssiIndex;
            bleReaderColumnInfo2.maxColumnIndexValue = bleReaderColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_ble_data_BleReaderRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BleReaderColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public long realmGet$serialNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.serialNumberIndex);
    }

    public void realmSet$serialNumber(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'serialNumber' cannot be changed after object was created.");
        }
    }

    public String realmGet$deviceKey() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceKeyIndex);
    }

    public void realmSet$deviceKey(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceKeyIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceKey' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.deviceKeyIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceKey' to null.");
        }
    }

    public String realmGet$deviceName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceNameIndex);
    }

    public void realmSet$deviceName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceNameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceName' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.deviceNameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceName' to null.");
        }
    }

    public String realmGet$deviceTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceTitleIndex);
    }

    public void realmSet$deviceTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceTitleIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceTitle' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.deviceTitleIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceTitle' to null.");
        }
    }

    public String realmGet$deviceClass() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceClassIndex);
    }

    public void realmSet$deviceClass(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceClassIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceClass' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.deviceClassIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceClass' to null.");
        }
    }

    public String realmGet$deviceMac() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deviceMacIndex);
    }

    public void realmSet$deviceMac(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.deviceMacIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceMac' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.deviceMacIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'deviceMac' to null.");
        }
    }

    public String realmGet$interfaceType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.interfaceTypeIndex);
    }

    public void realmSet$interfaceType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.interfaceTypeIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'interfaceType' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.interfaceTypeIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'interfaceType' to null.");
        }
    }

    public String realmGet$uuidID() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uuidIDIndex);
    }

    public void realmSet$uuidID(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.uuidIDIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidID' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.uuidIDIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidID' to null.");
        }
    }

    public String realmGet$uuidTX() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uuidTXIndex);
    }

    public void realmSet$uuidTX(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.uuidTXIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidTX' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.uuidTXIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidTX' to null.");
        }
    }

    public String realmGet$uuidRX() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uuidRXIndex);
    }

    public void realmSet$uuidRX(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.uuidRXIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidRX' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.uuidRXIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidRX' to null.");
        }
    }

    public String realmGet$uuidService() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.uuidServiceIndex);
    }

    public void realmSet$uuidService(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.uuidServiceIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidService' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.uuidServiceIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'uuidService' to null.");
        }
    }

    public String realmGet$rssi() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rssiIndex);
    }

    public void realmSet$rssi(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.rssiIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'rssi' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.rssiIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'rssi' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("serialNumber", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("deviceKey", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("deviceName", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("deviceTitle", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("deviceClass", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("deviceMac", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("interfaceType", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("uuidID", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("uuidTX", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("uuidRX", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("uuidService", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("rssi", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BleReaderColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BleReaderColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.ble.data.BleReader createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "serialNumber"
            r2 = 0
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r14 = p035ru.unicorn.ujin.ble.data.BleReader.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r4 = p035ru.unicorn.ujin.ble.data.BleReader.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy$BleReaderColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy.BleReaderColumnInfo) r3
            long r3 = r3.serialNumberIndex
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
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r3 = p035ru.unicorn.ujin.ble.data.BleReader.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy r14 = new io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy     // Catch:{ all -> 0x005c }
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
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r14 = p035ru.unicorn.ujin.ble.data.BleReader.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r14 = p035ru.unicorn.ujin.ble.data.BleReader.class
            long r4 = r13.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'serialNumber'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface) r12
            java.lang.String r0 = "deviceKey"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b1
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00aa
            r12.realmSet$deviceKey(r2)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$deviceKey(r0)
        L_0x00b1:
            java.lang.String r0 = "deviceName"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c3
            r12.realmSet$deviceName(r2)
            goto L_0x00ca
        L_0x00c3:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$deviceName(r0)
        L_0x00ca:
            java.lang.String r0 = "deviceTitle"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e3
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00dc
            r12.realmSet$deviceTitle(r2)
            goto L_0x00e3
        L_0x00dc:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$deviceTitle(r0)
        L_0x00e3:
            java.lang.String r0 = "deviceClass"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fc
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f5
            r12.realmSet$deviceClass(r2)
            goto L_0x00fc
        L_0x00f5:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$deviceClass(r0)
        L_0x00fc:
            java.lang.String r0 = "deviceMac"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0115
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x010e
            r12.realmSet$deviceMac(r2)
            goto L_0x0115
        L_0x010e:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$deviceMac(r0)
        L_0x0115:
            java.lang.String r0 = "interfaceType"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x012e
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0127
            r12.realmSet$interfaceType(r2)
            goto L_0x012e
        L_0x0127:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$interfaceType(r0)
        L_0x012e:
            java.lang.String r0 = "uuidID"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0148
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0141
            r12.realmSet$uuidID(r2)
            goto L_0x0148
        L_0x0141:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$uuidID(r0)
        L_0x0148:
            java.lang.String r0 = "uuidTX"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0162
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x015b
            r12.realmSet$uuidTX(r2)
            goto L_0x0162
        L_0x015b:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$uuidTX(r0)
        L_0x0162:
            java.lang.String r0 = "uuidRX"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x017c
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0175
            r12.realmSet$uuidRX(r2)
            goto L_0x017c
        L_0x0175:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$uuidRX(r0)
        L_0x017c:
            java.lang.String r0 = "uuidService"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0196
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x018f
            r12.realmSet$uuidService(r2)
            goto L_0x0196
        L_0x018f:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$uuidService(r0)
        L_0x0196:
            java.lang.String r0 = "rssi"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x01af
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x01a8
            r12.realmSet$rssi(r2)
            goto L_0x01af
        L_0x01a8:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$rssi(r13)
        L_0x01af:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.ble.data.BleReader");
    }

    public static BleReader createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BleReader bleReader = new BleReader();
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("serialNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$serialNumber(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'serialNumber' to null.");
                }
            } else if (nextName.equals("deviceKey")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceKey(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceKey((String) null);
                }
            } else if (nextName.equals("deviceName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceName((String) null);
                }
            } else if (nextName.equals("deviceTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceTitle((String) null);
                }
            } else if (nextName.equals("deviceClass")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceClass(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceClass((String) null);
                }
            } else if (nextName.equals("deviceMac")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceMac(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceMac((String) null);
                }
            } else if (nextName.equals("interfaceType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$interfaceType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$interfaceType((String) null);
                }
            } else if (nextName.equals("uuidID")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidID(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidID((String) null);
                }
            } else if (nextName.equals("uuidTX")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidTX(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidTX((String) null);
                }
            } else if (nextName.equals("uuidRX")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidRX(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidRX((String) null);
                }
            } else if (nextName.equals("uuidService")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidService(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidService((String) null);
                }
            } else if (!nextName.equals("rssi")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$rssi(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$rssi((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (BleReader) realm.copyToRealm(bleReader, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'serialNumber'.");
    }

    private static ru_unicorn_ujin_ble_data_BleReaderRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleReader.class), false, Collections.emptyList());
        ru_unicorn_ujin_ble_data_BleReaderRealmProxy ru_unicorn_ujin_ble_data_blereaderrealmproxy = new ru_unicorn_ujin_ble_data_BleReaderRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_ble_data_blereaderrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.ble.data.BleReader copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy.BleReaderColumnInfo r9, p035ru.unicorn.ujin.ble.data.BleReader r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.ble.data.BleReader r1 = (p035ru.unicorn.ujin.ble.data.BleReader) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.ble.data.BleReader> r2 = p035ru.unicorn.ujin.ble.data.BleReader.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.serialNumberIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface) r5
            long r5 = r5.realmGet$serialNumber()
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy r1 = new io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.ble.data.BleReader r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.ble.data.BleReader r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxy$BleReaderColumnInfo, ru.unicorn.ujin.ble.data.BleReader, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.ble.data.BleReader");
    }

    public static BleReader copy(Realm realm, BleReaderColumnInfo bleReaderColumnInfo, BleReader bleReader, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bleReader);
        if (realmObjectProxy != null) {
            return (BleReader) realmObjectProxy;
        }
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BleReader.class), bleReaderColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(bleReaderColumnInfo.serialNumberIndex, Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()));
        osObjectBuilder.addString(bleReaderColumnInfo.deviceKeyIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceKey());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceNameIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceName());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceTitleIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceTitle());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceClassIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceClass());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceMacIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceMac());
        osObjectBuilder.addString(bleReaderColumnInfo.interfaceTypeIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$interfaceType());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidIDIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidID());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidTXIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidTX());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidRXIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidRX());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidServiceIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidService());
        osObjectBuilder.addString(bleReaderColumnInfo.rssiIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$rssi());
        ru_unicorn_ujin_ble_data_BleReaderRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bleReader, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, BleReader bleReader, Map<RealmModel, Long> map) {
        long j;
        long j2;
        BleReader bleReader2 = bleReader;
        if (bleReader2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleReader2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BleReader.class);
        long nativePtr = table.getNativePtr();
        BleReaderColumnInfo bleReaderColumnInfo = (BleReaderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleReader.class);
        long j3 = bleReaderColumnInfo.serialNumberIndex;
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(bleReader2, Long.valueOf(j2));
        String realmGet$deviceKey = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceKey();
        if (realmGet$deviceKey != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceKeyIndex, j2, realmGet$deviceKey, false);
        }
        String realmGet$deviceName = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceName();
        if (realmGet$deviceName != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceNameIndex, j2, realmGet$deviceName, false);
        }
        String realmGet$deviceTitle = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceTitle();
        if (realmGet$deviceTitle != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceTitleIndex, j2, realmGet$deviceTitle, false);
        }
        String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceClass();
        if (realmGet$deviceClass != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceClassIndex, j2, realmGet$deviceClass, false);
        }
        String realmGet$deviceMac = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceMac();
        if (realmGet$deviceMac != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceMacIndex, j2, realmGet$deviceMac, false);
        }
        String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$interfaceType();
        if (realmGet$interfaceType != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.interfaceTypeIndex, j2, realmGet$interfaceType, false);
        }
        String realmGet$uuidID = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidID();
        if (realmGet$uuidID != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidIDIndex, j2, realmGet$uuidID, false);
        }
        String realmGet$uuidTX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidTX();
        if (realmGet$uuidTX != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidTXIndex, j2, realmGet$uuidTX, false);
        }
        String realmGet$uuidRX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidRX();
        if (realmGet$uuidRX != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidRXIndex, j2, realmGet$uuidRX, false);
        }
        String realmGet$uuidService = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidService();
        if (realmGet$uuidService != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidServiceIndex, j2, realmGet$uuidService, false);
        }
        String realmGet$rssi = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$rssi();
        if (realmGet$rssi != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.rssiIndex, j2, realmGet$rssi, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BleReader.class);
        long nativePtr = table.getNativePtr();
        BleReaderColumnInfo bleReaderColumnInfo = (BleReaderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleReader.class);
        long j2 = bleReaderColumnInfo.serialNumberIndex;
        while (it.hasNext()) {
            BleReader bleReader = (BleReader) it.next();
            if (!map2.containsKey(bleReader)) {
                if (bleReader instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleReader;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bleReader, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(bleReader, Long.valueOf(j3));
                String realmGet$deviceKey = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceKey();
                if (realmGet$deviceKey != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceKeyIndex, j3, realmGet$deviceKey, false);
                }
                String realmGet$deviceName = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceName();
                if (realmGet$deviceName != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceNameIndex, j3, realmGet$deviceName, false);
                }
                String realmGet$deviceTitle = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceTitle();
                if (realmGet$deviceTitle != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceTitleIndex, j3, realmGet$deviceTitle, false);
                }
                String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceClass();
                if (realmGet$deviceClass != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceClassIndex, j3, realmGet$deviceClass, false);
                }
                String realmGet$deviceMac = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceMac();
                if (realmGet$deviceMac != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceMacIndex, j3, realmGet$deviceMac, false);
                }
                String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$interfaceType();
                if (realmGet$interfaceType != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.interfaceTypeIndex, j3, realmGet$interfaceType, false);
                }
                String realmGet$uuidID = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidID();
                if (realmGet$uuidID != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidIDIndex, j3, realmGet$uuidID, false);
                }
                String realmGet$uuidTX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidTX();
                if (realmGet$uuidTX != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidTXIndex, j3, realmGet$uuidTX, false);
                }
                String realmGet$uuidRX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidRX();
                if (realmGet$uuidRX != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidRXIndex, j3, realmGet$uuidRX, false);
                }
                String realmGet$uuidService = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidService();
                if (realmGet$uuidService != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidServiceIndex, j3, realmGet$uuidService, false);
                }
                String realmGet$rssi = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$rssi();
                if (realmGet$rssi != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.rssiIndex, j3, realmGet$rssi, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BleReader bleReader, Map<RealmModel, Long> map) {
        BleReader bleReader2 = bleReader;
        if (bleReader2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleReader2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BleReader.class);
        long nativePtr = table.getNativePtr();
        BleReaderColumnInfo bleReaderColumnInfo = (BleReaderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleReader.class);
        long j = bleReaderColumnInfo.serialNumberIndex;
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader2;
        long nativeFindFirstInt = Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()) != null ? Table.nativeFindFirstInt(nativePtr, j, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber())) : nativeFindFirstInt;
        map.put(bleReader2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$deviceKey = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceKey();
        if (realmGet$deviceKey != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceKeyIndex, createRowWithPrimaryKey, realmGet$deviceKey, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceKeyIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$deviceName = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceName();
        if (realmGet$deviceName != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceNameIndex, createRowWithPrimaryKey, realmGet$deviceName, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceNameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$deviceTitle = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceTitle();
        if (realmGet$deviceTitle != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceTitleIndex, createRowWithPrimaryKey, realmGet$deviceTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceTitleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceClass();
        if (realmGet$deviceClass != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceClassIndex, createRowWithPrimaryKey, realmGet$deviceClass, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceClassIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$deviceMac = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceMac();
        if (realmGet$deviceMac != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceMacIndex, createRowWithPrimaryKey, realmGet$deviceMac, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceMacIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$interfaceType();
        if (realmGet$interfaceType != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.interfaceTypeIndex, createRowWithPrimaryKey, realmGet$interfaceType, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.interfaceTypeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$uuidID = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidID();
        if (realmGet$uuidID != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidIDIndex, createRowWithPrimaryKey, realmGet$uuidID, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidIDIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$uuidTX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidTX();
        if (realmGet$uuidTX != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidTXIndex, createRowWithPrimaryKey, realmGet$uuidTX, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidTXIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$uuidRX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidRX();
        if (realmGet$uuidRX != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidRXIndex, createRowWithPrimaryKey, realmGet$uuidRX, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidRXIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$uuidService = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidService();
        if (realmGet$uuidService != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidServiceIndex, createRowWithPrimaryKey, realmGet$uuidService, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidServiceIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$rssi = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$rssi();
        if (realmGet$rssi != null) {
            Table.nativeSetString(nativePtr, bleReaderColumnInfo.rssiIndex, createRowWithPrimaryKey, realmGet$rssi, false);
        } else {
            Table.nativeSetNull(nativePtr, bleReaderColumnInfo.rssiIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BleReader.class);
        long nativePtr = table.getNativePtr();
        BleReaderColumnInfo bleReaderColumnInfo = (BleReaderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleReader.class);
        long j2 = bleReaderColumnInfo.serialNumberIndex;
        while (it.hasNext()) {
            BleReader bleReader = (BleReader) it.next();
            if (!map2.containsKey(bleReader)) {
                if (bleReader instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleReader;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bleReader, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader;
                if (Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$serialNumber()));
                }
                long j3 = j;
                map2.put(bleReader, Long.valueOf(j3));
                String realmGet$deviceKey = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceKey();
                if (realmGet$deviceKey != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceKeyIndex, j3, realmGet$deviceKey, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceKeyIndex, j3, false);
                }
                String realmGet$deviceName = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceName();
                if (realmGet$deviceName != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceNameIndex, j3, realmGet$deviceName, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceNameIndex, j3, false);
                }
                String realmGet$deviceTitle = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceTitle();
                if (realmGet$deviceTitle != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceTitleIndex, j3, realmGet$deviceTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceTitleIndex, j3, false);
                }
                String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceClass();
                if (realmGet$deviceClass != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceClassIndex, j3, realmGet$deviceClass, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceClassIndex, j3, false);
                }
                String realmGet$deviceMac = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$deviceMac();
                if (realmGet$deviceMac != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.deviceMacIndex, j3, realmGet$deviceMac, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.deviceMacIndex, j3, false);
                }
                String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$interfaceType();
                if (realmGet$interfaceType != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.interfaceTypeIndex, j3, realmGet$interfaceType, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.interfaceTypeIndex, j3, false);
                }
                String realmGet$uuidID = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidID();
                if (realmGet$uuidID != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidIDIndex, j3, realmGet$uuidID, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidIDIndex, j3, false);
                }
                String realmGet$uuidTX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidTX();
                if (realmGet$uuidTX != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidTXIndex, j3, realmGet$uuidTX, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidTXIndex, j3, false);
                }
                String realmGet$uuidRX = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidRX();
                if (realmGet$uuidRX != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidRXIndex, j3, realmGet$uuidRX, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidRXIndex, j3, false);
                }
                String realmGet$uuidService = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$uuidService();
                if (realmGet$uuidService != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.uuidServiceIndex, j3, realmGet$uuidService, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.uuidServiceIndex, j3, false);
                }
                String realmGet$rssi = ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmGet$rssi();
                if (realmGet$rssi != null) {
                    Table.nativeSetString(nativePtr, bleReaderColumnInfo.rssiIndex, j3, realmGet$rssi, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleReaderColumnInfo.rssiIndex, j3, false);
                }
            }
        }
    }

    public static BleReader createDetachedCopy(BleReader bleReader, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BleReader bleReader2;
        if (i > i2 || bleReader == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(bleReader);
        if (cacheData == null) {
            bleReader2 = new BleReader();
            map.put(bleReader, new RealmObjectProxy.CacheData(i, bleReader2));
        } else if (i >= cacheData.minDepth) {
            return (BleReader) cacheData.object;
        } else {
            cacheData.minDepth = i;
            bleReader2 = (BleReader) cacheData.object;
        }
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader2;
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2 = bleReader;
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$serialNumber(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$serialNumber());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceKey(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceKey());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceName(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceName());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceTitle(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceTitle());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceClass(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceClass());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$deviceMac(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceMac());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$interfaceType(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$interfaceType());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidID(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidID());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidTX(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidTX());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidRX(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidRX());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$uuidService(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidService());
        ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface.realmSet$rssi(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$rssi());
        return bleReader2;
    }

    static BleReader update(Realm realm, BleReaderColumnInfo bleReaderColumnInfo, BleReader bleReader, BleReader bleReader2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface = bleReader;
        ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2 = bleReader2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BleReader.class), bleReaderColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(bleReaderColumnInfo.serialNumberIndex, Long.valueOf(ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$serialNumber()));
        osObjectBuilder.addString(bleReaderColumnInfo.deviceKeyIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceKey());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceNameIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceName());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceTitleIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceTitle());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceClassIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceClass());
        osObjectBuilder.addString(bleReaderColumnInfo.deviceMacIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$deviceMac());
        osObjectBuilder.addString(bleReaderColumnInfo.interfaceTypeIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$interfaceType());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidIDIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidID());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidTXIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidTX());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidRXIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidRX());
        osObjectBuilder.addString(bleReaderColumnInfo.uuidServiceIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$uuidService());
        osObjectBuilder.addString(bleReaderColumnInfo.rssiIndex, ru_unicorn_ujin_ble_data_blereaderrealmproxyinterface2.realmGet$rssi());
        osObjectBuilder.updateExistingObject();
        return bleReader;
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
        ru_unicorn_ujin_ble_data_BleReaderRealmProxy ru_unicorn_ujin_ble_data_blereaderrealmproxy = (ru_unicorn_ujin_ble_data_BleReaderRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_ble_data_blereaderrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_ble_data_blereaderrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_ble_data_blereaderrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
