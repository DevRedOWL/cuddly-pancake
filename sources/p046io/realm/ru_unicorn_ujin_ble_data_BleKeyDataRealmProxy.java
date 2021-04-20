package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
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

/* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy */
public class ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy extends BleKeyData implements RealmObjectProxy, ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BleKeyDataColumnInfo columnInfo;
    private ProxyState<BleKeyData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BleKeyData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy$BleKeyDataColumnInfo */
    static final class BleKeyDataColumnInfo extends ColumnInfo {
        long deviceClassIndex;
        long interfaceTypeIndex;
        long keyAssignIndex;
        long keyTitleIndex;
        long keyValueIndex;
        long maxColumnIndexValue;
        long serialNumberIndex;

        BleKeyDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.serialNumberIndex = addColumnDetails("serialNumber", "serialNumber", objectSchemaInfo);
            this.keyValueIndex = addColumnDetails("keyValue", "keyValue", objectSchemaInfo);
            this.keyTitleIndex = addColumnDetails("keyTitle", "keyTitle", objectSchemaInfo);
            this.keyAssignIndex = addColumnDetails("keyAssign", "keyAssign", objectSchemaInfo);
            this.deviceClassIndex = addColumnDetails("deviceClass", "deviceClass", objectSchemaInfo);
            this.interfaceTypeIndex = addColumnDetails("interfaceType", "interfaceType", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BleKeyDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BleKeyDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BleKeyDataColumnInfo bleKeyDataColumnInfo = (BleKeyDataColumnInfo) columnInfo;
            BleKeyDataColumnInfo bleKeyDataColumnInfo2 = (BleKeyDataColumnInfo) columnInfo2;
            bleKeyDataColumnInfo2.serialNumberIndex = bleKeyDataColumnInfo.serialNumberIndex;
            bleKeyDataColumnInfo2.keyValueIndex = bleKeyDataColumnInfo.keyValueIndex;
            bleKeyDataColumnInfo2.keyTitleIndex = bleKeyDataColumnInfo.keyTitleIndex;
            bleKeyDataColumnInfo2.keyAssignIndex = bleKeyDataColumnInfo.keyAssignIndex;
            bleKeyDataColumnInfo2.deviceClassIndex = bleKeyDataColumnInfo.deviceClassIndex;
            bleKeyDataColumnInfo2.interfaceTypeIndex = bleKeyDataColumnInfo.interfaceTypeIndex;
            bleKeyDataColumnInfo2.maxColumnIndexValue = bleKeyDataColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BleKeyDataColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$keyValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.keyValueIndex);
    }

    public void realmSet$keyValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.keyValueIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'keyValue' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.keyValueIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'keyValue' to null.");
        }
    }

    public String realmGet$keyTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.keyTitleIndex);
    }

    public void realmSet$keyTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.keyTitleIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'keyTitle' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.keyTitleIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'keyTitle' to null.");
        }
    }

    public int realmGet$keyAssign() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.keyAssignIndex);
    }

    public void realmSet$keyAssign(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.keyAssignIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.keyAssignIndex, row$realm.getIndex(), (long) i, true);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("serialNumber", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("keyValue", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("keyTitle", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("keyAssign", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("deviceClass", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("interfaceType", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BleKeyDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BleKeyDataColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v6, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.ble.data.BleKeyData createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "serialNumber"
            r2 = 0
            if (r14 == 0) goto L_0x0061
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r14 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r4 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy$BleKeyDataColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.BleKeyDataColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r3 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005c }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005c }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005c }
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy r14 = new io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy     // Catch:{ all -> 0x005c }
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
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r14 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy) r14
            goto L_0x0095
        L_0x007b:
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r14 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            long r4 = r13.getLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy) r14
            goto L_0x0095
        L_0x008d:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'serialNumber'."
            r12.<init>(r13)
            throw r12
        L_0x0095:
            r12 = r14
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface) r12
            java.lang.String r0 = "keyValue"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b1
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00aa
            r12.realmSet$keyValue(r2)
            goto L_0x00b1
        L_0x00aa:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$keyValue(r0)
        L_0x00b1:
            java.lang.String r0 = "keyTitle"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c3
            r12.realmSet$keyTitle(r2)
            goto L_0x00ca
        L_0x00c3:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$keyTitle(r0)
        L_0x00ca:
            java.lang.String r0 = "keyAssign"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e8
            boolean r1 = r13.isNull(r0)
            if (r1 != 0) goto L_0x00e0
            int r0 = r13.getInt(r0)
            r12.realmSet$keyAssign(r0)
            goto L_0x00e8
        L_0x00e0:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Trying to set non-nullable field 'keyAssign' to null."
            r12.<init>(r13)
            throw r12
        L_0x00e8:
            java.lang.String r0 = "deviceClass"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0101
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00fa
            r12.realmSet$deviceClass(r2)
            goto L_0x0101
        L_0x00fa:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$deviceClass(r0)
        L_0x0101:
            java.lang.String r0 = "interfaceType"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x011a
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0113
            r12.realmSet$interfaceType(r2)
            goto L_0x011a
        L_0x0113:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$interfaceType(r13)
        L_0x011a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.ble.data.BleKeyData");
    }

    public static BleKeyData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BleKeyData bleKeyData = new BleKeyData();
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("serialNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$serialNumber(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'serialNumber' to null.");
                }
            } else if (nextName.equals("keyValue")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyValue(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyValue((String) null);
                }
            } else if (nextName.equals("keyTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyTitle((String) null);
                }
            } else if (nextName.equals("keyAssign")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyAssign(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'keyAssign' to null.");
                }
            } else if (nextName.equals("deviceClass")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$deviceClass(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$deviceClass((String) null);
                }
            } else if (!nextName.equals("interfaceType")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$interfaceType(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$interfaceType((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (BleKeyData) realm.copyToRealm(bleKeyData, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'serialNumber'.");
    }

    private static ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleKeyData.class), false, Collections.emptyList());
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy ru_unicorn_ujin_ble_data_blekeydatarealmproxy = new ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_ble_data_blekeydatarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.ble.data.BleKeyData copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.BleKeyDataColumnInfo r9, p035ru.unicorn.ujin.ble.data.BleKeyData r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.ble.data.BleKeyData r1 = (p035ru.unicorn.ujin.ble.data.BleKeyData) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.ble.data.BleKeyData> r2 = p035ru.unicorn.ujin.ble.data.BleKeyData.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.serialNumberIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy     // Catch:{ all -> 0x0087 }
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
            ru.unicorn.ujin.ble.data.BleKeyData r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.ble.data.BleKeyData r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy$BleKeyDataColumnInfo, ru.unicorn.ujin.ble.data.BleKeyData, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.ble.data.BleKeyData");
    }

    public static BleKeyData copy(Realm realm, BleKeyDataColumnInfo bleKeyDataColumnInfo, BleKeyData bleKeyData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(bleKeyData);
        if (realmObjectProxy != null) {
            return (BleKeyData) realmObjectProxy;
        }
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BleKeyData.class), bleKeyDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(bleKeyDataColumnInfo.serialNumberIndex, Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()));
        osObjectBuilder.addString(bleKeyDataColumnInfo.keyValueIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyValue());
        osObjectBuilder.addString(bleKeyDataColumnInfo.keyTitleIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyTitle());
        osObjectBuilder.addInteger(bleKeyDataColumnInfo.keyAssignIndex, Integer.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyAssign()));
        osObjectBuilder.addString(bleKeyDataColumnInfo.deviceClassIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$deviceClass());
        osObjectBuilder.addString(bleKeyDataColumnInfo.interfaceTypeIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$interfaceType());
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(bleKeyData, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, BleKeyData bleKeyData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        BleKeyData bleKeyData2 = bleKeyData;
        if (bleKeyData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleKeyData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BleKeyData.class);
        long nativePtr = table.getNativePtr();
        BleKeyDataColumnInfo bleKeyDataColumnInfo = (BleKeyDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleKeyData.class);
        long j3 = bleKeyDataColumnInfo.serialNumberIndex;
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map.put(bleKeyData2, Long.valueOf(j2));
        String realmGet$keyValue = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyValue();
        if (realmGet$keyValue != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyValueIndex, j2, realmGet$keyValue, false);
        }
        String realmGet$keyTitle = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyTitle();
        if (realmGet$keyTitle != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyTitleIndex, j2, realmGet$keyTitle, false);
        }
        Table.nativeSetLong(nativePtr, bleKeyDataColumnInfo.keyAssignIndex, j2, (long) ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyAssign(), false);
        String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$deviceClass();
        if (realmGet$deviceClass != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.deviceClassIndex, j2, realmGet$deviceClass, false);
        }
        String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$interfaceType();
        if (realmGet$interfaceType != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.interfaceTypeIndex, j2, realmGet$interfaceType, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BleKeyData.class);
        long nativePtr = table.getNativePtr();
        BleKeyDataColumnInfo bleKeyDataColumnInfo = (BleKeyDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleKeyData.class);
        long j3 = bleKeyDataColumnInfo.serialNumberIndex;
        while (it.hasNext()) {
            BleKeyData bleKeyData = (BleKeyData) it.next();
            if (!map2.containsKey(bleKeyData)) {
                if (bleKeyData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleKeyData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bleKeyData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j4 = j;
                map2.put(bleKeyData, Long.valueOf(j4));
                String realmGet$keyValue = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyValue();
                if (realmGet$keyValue != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyValueIndex, j4, realmGet$keyValue, false);
                } else {
                    j2 = j3;
                }
                String realmGet$keyTitle = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyTitle();
                if (realmGet$keyTitle != null) {
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyTitleIndex, j4, realmGet$keyTitle, false);
                }
                Table.nativeSetLong(nativePtr, bleKeyDataColumnInfo.keyAssignIndex, j4, (long) ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyAssign(), false);
                String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$deviceClass();
                if (realmGet$deviceClass != null) {
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.deviceClassIndex, j4, realmGet$deviceClass, false);
                }
                String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$interfaceType();
                if (realmGet$interfaceType != null) {
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.interfaceTypeIndex, j4, realmGet$interfaceType, false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BleKeyData bleKeyData, Map<RealmModel, Long> map) {
        BleKeyData bleKeyData2 = bleKeyData;
        if (bleKeyData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleKeyData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(BleKeyData.class);
        long nativePtr = table.getNativePtr();
        BleKeyDataColumnInfo bleKeyDataColumnInfo = (BleKeyDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleKeyData.class);
        long j = bleKeyDataColumnInfo.serialNumberIndex;
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData2;
        long nativeFindFirstInt = Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()) != null ? Table.nativeFindFirstInt(nativePtr, j, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber())) : nativeFindFirstInt;
        map.put(bleKeyData2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$keyValue = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyValue();
        if (realmGet$keyValue != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyValueIndex, createRowWithPrimaryKey, realmGet$keyValue, false);
        } else {
            Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.keyValueIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$keyTitle = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyTitle();
        if (realmGet$keyTitle != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyTitleIndex, createRowWithPrimaryKey, realmGet$keyTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.keyTitleIndex, createRowWithPrimaryKey, false);
        }
        Table.nativeSetLong(nativePtr, bleKeyDataColumnInfo.keyAssignIndex, createRowWithPrimaryKey, (long) ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyAssign(), false);
        String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$deviceClass();
        if (realmGet$deviceClass != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.deviceClassIndex, createRowWithPrimaryKey, realmGet$deviceClass, false);
        } else {
            Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.deviceClassIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$interfaceType();
        if (realmGet$interfaceType != null) {
            Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.interfaceTypeIndex, createRowWithPrimaryKey, realmGet$interfaceType, false);
        } else {
            Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.interfaceTypeIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(BleKeyData.class);
        long nativePtr = table.getNativePtr();
        BleKeyDataColumnInfo bleKeyDataColumnInfo = (BleKeyDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BleKeyData.class);
        long j3 = bleKeyDataColumnInfo.serialNumberIndex;
        while (it.hasNext()) {
            BleKeyData bleKeyData = (BleKeyData) it.next();
            if (!map2.containsKey(bleKeyData)) {
                if (bleKeyData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) bleKeyData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(bleKeyData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData;
                if (Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$serialNumber()));
                }
                long j4 = j;
                map2.put(bleKeyData, Long.valueOf(j4));
                String realmGet$keyValue = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyValue();
                if (realmGet$keyValue != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyValueIndex, j4, realmGet$keyValue, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.keyValueIndex, j4, false);
                }
                String realmGet$keyTitle = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyTitle();
                if (realmGet$keyTitle != null) {
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.keyTitleIndex, j4, realmGet$keyTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.keyTitleIndex, j4, false);
                }
                Table.nativeSetLong(nativePtr, bleKeyDataColumnInfo.keyAssignIndex, j4, (long) ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$keyAssign(), false);
                String realmGet$deviceClass = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$deviceClass();
                if (realmGet$deviceClass != null) {
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.deviceClassIndex, j4, realmGet$deviceClass, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.deviceClassIndex, j4, false);
                }
                String realmGet$interfaceType = ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmGet$interfaceType();
                if (realmGet$interfaceType != null) {
                    Table.nativeSetString(nativePtr, bleKeyDataColumnInfo.interfaceTypeIndex, j4, realmGet$interfaceType, false);
                } else {
                    Table.nativeSetNull(nativePtr, bleKeyDataColumnInfo.interfaceTypeIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static BleKeyData createDetachedCopy(BleKeyData bleKeyData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BleKeyData bleKeyData2;
        if (i > i2 || bleKeyData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(bleKeyData);
        if (cacheData == null) {
            bleKeyData2 = new BleKeyData();
            map.put(bleKeyData, new RealmObjectProxy.CacheData(i, bleKeyData2));
        } else if (i >= cacheData.minDepth) {
            return (BleKeyData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            bleKeyData2 = (BleKeyData) cacheData.object;
        }
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData2;
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2 = bleKeyData;
        ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$serialNumber(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$serialNumber());
        ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyValue(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$keyValue());
        ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyTitle(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$keyTitle());
        ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$keyAssign(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$keyAssign());
        ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$deviceClass(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$deviceClass());
        ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface.realmSet$interfaceType(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$interfaceType());
        return bleKeyData2;
    }

    static BleKeyData update(Realm realm, BleKeyDataColumnInfo bleKeyDataColumnInfo, BleKeyData bleKeyData, BleKeyData bleKeyData2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface = bleKeyData;
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2 = bleKeyData2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(BleKeyData.class), bleKeyDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(bleKeyDataColumnInfo.serialNumberIndex, Long.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$serialNumber()));
        osObjectBuilder.addString(bleKeyDataColumnInfo.keyValueIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$keyValue());
        osObjectBuilder.addString(bleKeyDataColumnInfo.keyTitleIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$keyTitle());
        osObjectBuilder.addInteger(bleKeyDataColumnInfo.keyAssignIndex, Integer.valueOf(ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$keyAssign()));
        osObjectBuilder.addString(bleKeyDataColumnInfo.deviceClassIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$deviceClass());
        osObjectBuilder.addString(bleKeyDataColumnInfo.interfaceTypeIndex, ru_unicorn_ujin_ble_data_blekeydatarealmproxyinterface2.realmGet$interfaceType());
        osObjectBuilder.updateExistingObject();
        return bleKeyData;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "BleKeyData = proxy[" + "{serialNumber:" + realmGet$serialNumber() + "}" + "," + "{keyValue:" + realmGet$keyValue() + "}" + "," + "{keyTitle:" + realmGet$keyTitle() + "}" + "," + "{keyAssign:" + realmGet$keyAssign() + "}" + "," + "{deviceClass:" + realmGet$deviceClass() + "}" + "," + "{interfaceType:" + realmGet$interfaceType() + "}" + "]";
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
        ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy ru_unicorn_ujin_ble_data_blekeydatarealmproxy = (ru_unicorn_ujin_ble_data_BleKeyDataRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_ble_data_blekeydatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_ble_data_blekeydatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_ble_data_blekeydatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
