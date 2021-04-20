package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.Wifi;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy */
public class ru_unicorn_ujin_data_realm_WifiRealmProxy extends Wifi implements RealmObjectProxy, ru_unicorn_ujin_data_realm_WifiRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private WifiColumnInfo columnInfo;
    private ProxyState<Wifi> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Wifi";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy$WifiColumnInfo */
    static final class WifiColumnInfo extends ColumnInfo {
        long bssidIndex;
        long levelInIndex;
        long levelIndex;
        long levelOutIndex;
        long maxColumnIndexValue;
        long ssidIndex;

        WifiColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.ssidIndex = addColumnDetails("ssid", "ssid", objectSchemaInfo);
            this.bssidIndex = addColumnDetails("bssid", "bssid", objectSchemaInfo);
            this.levelIndex = addColumnDetails(FirebaseAnalytics.Param.LEVEL, FirebaseAnalytics.Param.LEVEL, objectSchemaInfo);
            this.levelInIndex = addColumnDetails("levelIn", "levelIn", objectSchemaInfo);
            this.levelOutIndex = addColumnDetails("levelOut", "levelOut", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        WifiColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new WifiColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            WifiColumnInfo wifiColumnInfo = (WifiColumnInfo) columnInfo;
            WifiColumnInfo wifiColumnInfo2 = (WifiColumnInfo) columnInfo2;
            wifiColumnInfo2.ssidIndex = wifiColumnInfo.ssidIndex;
            wifiColumnInfo2.bssidIndex = wifiColumnInfo.bssidIndex;
            wifiColumnInfo2.levelIndex = wifiColumnInfo.levelIndex;
            wifiColumnInfo2.levelInIndex = wifiColumnInfo.levelInIndex;
            wifiColumnInfo2.levelOutIndex = wifiColumnInfo.levelOutIndex;
            wifiColumnInfo2.maxColumnIndexValue = wifiColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_WifiRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (WifiColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$ssid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ssidIndex);
    }

    public void realmSet$ssid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ssidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ssidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ssidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ssidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$bssid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bssidIndex);
    }

    public void realmSet$bssid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'bssid' cannot be changed after object was created.");
        }
    }

    public Integer realmGet$level() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.levelIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.levelIndex));
    }

    public void realmSet$level(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.levelIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.levelIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.levelIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.levelIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$levelIn() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.levelInIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.levelInIndex));
    }

    public void realmSet$levelIn(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.levelInIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.levelInIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.levelInIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.levelInIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$levelOut() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.levelOutIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.levelOutIndex));
    }

    public void realmSet$levelOut(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.levelOutIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.levelOutIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.levelOutIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.levelOutIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("ssid", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("bssid", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty(FirebaseAnalytics.Param.LEVEL, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("levelIn", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("levelOut", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static WifiColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new WifiColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Wifi createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "bssid"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r14 = p035ru.unicorn.ujin.data.realm.Wifi.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r4 = p035ru.unicorn.ujin.data.realm.Wifi.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy$WifiColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.WifiColumnInfo) r3
            long r3 = r3.bssidIndex
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
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r3 = p035ru.unicorn.ujin.data.realm.Wifi.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r14 = p035ru.unicorn.ujin.data.realm.Wifi.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r14 = p035ru.unicorn.ujin.data.realm.Wifi.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'bssid'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxyInterface) r12
            java.lang.String r0 = "ssid"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$ssid(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$ssid(r0)
        L_0x00b0:
            java.lang.String r0 = "level"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$level(r2)
            goto L_0x00cd
        L_0x00c2:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$level(r0)
        L_0x00cd:
            java.lang.String r0 = "levelIn"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ea
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00df
            r12.realmSet$levelIn(r2)
            goto L_0x00ea
        L_0x00df:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$levelIn(r0)
        L_0x00ea:
            java.lang.String r0 = "levelOut"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0107
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00fc
            r12.realmSet$levelOut(r2)
            goto L_0x0107
        L_0x00fc:
            int r13 = r13.getInt(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.realmSet$levelOut(r13)
        L_0x0107:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.Wifi");
    }

    public static Wifi createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Wifi wifi = new Wifi();
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("ssid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$ssid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$ssid((String) null);
                }
            } else if (nextName.equals("bssid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$bssid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$bssid((String) null);
                }
                z = true;
            } else if (nextName.equals(FirebaseAnalytics.Param.LEVEL)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$level(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$level((Integer) null);
                }
            } else if (nextName.equals("levelIn")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$levelIn(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$levelIn((Integer) null);
                }
            } else if (!nextName.equals("levelOut")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$levelOut(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$levelOut((Integer) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Wifi) realm.copyToRealm(wifi, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'bssid'.");
    }

    private static ru_unicorn_ujin_data_realm_WifiRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_WifiRealmProxy ru_unicorn_ujin_data_realm_wifirealmproxy = new ru_unicorn_ujin_data_realm_WifiRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_wifirealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.Wifi copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.WifiColumnInfo r9, p035ru.unicorn.ujin.data.realm.Wifi r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.Wifi r1 = (p035ru.unicorn.ujin.data.realm.Wifi) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.Wifi> r2 = p035ru.unicorn.ujin.data.realm.Wifi.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.bssidIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$bssid()
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
            io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.Wifi r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.Wifi r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_WifiRealmProxy$WifiColumnInfo, ru.unicorn.ujin.data.realm.Wifi, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.Wifi");
    }

    public static Wifi copy(Realm realm, WifiColumnInfo wifiColumnInfo, Wifi wifi, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(wifi);
        if (realmObjectProxy != null) {
            return (Wifi) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Wifi.class), wifiColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(wifiColumnInfo.ssidIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$ssid());
        osObjectBuilder.addString(wifiColumnInfo.bssidIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$bssid());
        osObjectBuilder.addInteger(wifiColumnInfo.levelIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$level());
        osObjectBuilder.addInteger(wifiColumnInfo.levelInIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelIn());
        osObjectBuilder.addInteger(wifiColumnInfo.levelOutIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelOut());
        ru_unicorn_ujin_data_realm_WifiRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(wifi, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Wifi wifi, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Wifi wifi2 = wifi;
        if (wifi2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) wifi2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Wifi.class);
        long nativePtr = table.getNativePtr();
        WifiColumnInfo wifiColumnInfo = (WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class);
        long j3 = wifiColumnInfo.bssidIndex;
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi2;
        String realmGet$bssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$bssid();
        if (realmGet$bssid == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$bssid);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$bssid);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$bssid);
            j2 = j;
        }
        map.put(wifi2, Long.valueOf(j2));
        String realmGet$ssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$ssid();
        if (realmGet$ssid != null) {
            Table.nativeSetString(nativePtr, wifiColumnInfo.ssidIndex, j2, realmGet$ssid, false);
        }
        Integer realmGet$level = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$level();
        if (realmGet$level != null) {
            Table.nativeSetLong(nativePtr, wifiColumnInfo.levelIndex, j2, realmGet$level.longValue(), false);
        }
        Integer realmGet$levelIn = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelIn();
        if (realmGet$levelIn != null) {
            Table.nativeSetLong(nativePtr, wifiColumnInfo.levelInIndex, j2, realmGet$levelIn.longValue(), false);
        }
        Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelOut();
        if (realmGet$levelOut != null) {
            Table.nativeSetLong(nativePtr, wifiColumnInfo.levelOutIndex, j2, realmGet$levelOut.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Wifi.class);
        long nativePtr = table.getNativePtr();
        WifiColumnInfo wifiColumnInfo = (WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class);
        long j4 = wifiColumnInfo.bssidIndex;
        while (it.hasNext()) {
            Wifi wifi = (Wifi) it.next();
            if (!map2.containsKey(wifi)) {
                if (wifi instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) wifi;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(wifi, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi;
                String realmGet$bssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$bssid();
                if (realmGet$bssid == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$bssid);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$bssid);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$bssid);
                    j2 = j;
                }
                map2.put(wifi, Long.valueOf(j2));
                String realmGet$ssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$ssid();
                if (realmGet$ssid != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, wifiColumnInfo.ssidIndex, j2, realmGet$ssid, false);
                } else {
                    j3 = j4;
                }
                Integer realmGet$level = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$level();
                if (realmGet$level != null) {
                    Table.nativeSetLong(nativePtr, wifiColumnInfo.levelIndex, j2, realmGet$level.longValue(), false);
                }
                Integer realmGet$levelIn = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelIn();
                if (realmGet$levelIn != null) {
                    Table.nativeSetLong(nativePtr, wifiColumnInfo.levelInIndex, j2, realmGet$levelIn.longValue(), false);
                }
                Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelOut();
                if (realmGet$levelOut != null) {
                    Table.nativeSetLong(nativePtr, wifiColumnInfo.levelOutIndex, j2, realmGet$levelOut.longValue(), false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Wifi wifi, Map<RealmModel, Long> map) {
        long j;
        Wifi wifi2 = wifi;
        if (wifi2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) wifi2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Wifi.class);
        long nativePtr = table.getNativePtr();
        WifiColumnInfo wifiColumnInfo = (WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class);
        long j2 = wifiColumnInfo.bssidIndex;
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi2;
        String realmGet$bssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$bssid();
        if (realmGet$bssid == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$bssid);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$bssid) : j;
        map.put(wifi2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$ssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$ssid();
        if (realmGet$ssid != null) {
            Table.nativeSetString(nativePtr, wifiColumnInfo.ssidIndex, createRowWithPrimaryKey, realmGet$ssid, false);
        } else {
            Table.nativeSetNull(nativePtr, wifiColumnInfo.ssidIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$level = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$level();
        if (realmGet$level != null) {
            Table.nativeSetLong(nativePtr, wifiColumnInfo.levelIndex, createRowWithPrimaryKey, realmGet$level.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, wifiColumnInfo.levelIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$levelIn = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelIn();
        if (realmGet$levelIn != null) {
            Table.nativeSetLong(nativePtr, wifiColumnInfo.levelInIndex, createRowWithPrimaryKey, realmGet$levelIn.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, wifiColumnInfo.levelInIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelOut();
        if (realmGet$levelOut != null) {
            Table.nativeSetLong(nativePtr, wifiColumnInfo.levelOutIndex, createRowWithPrimaryKey, realmGet$levelOut.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, wifiColumnInfo.levelOutIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Wifi.class);
        long nativePtr = table.getNativePtr();
        WifiColumnInfo wifiColumnInfo = (WifiColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Wifi.class);
        long j3 = wifiColumnInfo.bssidIndex;
        while (it.hasNext()) {
            Wifi wifi = (Wifi) it.next();
            if (!map2.containsKey(wifi)) {
                if (wifi instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) wifi;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(wifi, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi;
                String realmGet$bssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$bssid();
                if (realmGet$bssid == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$bssid);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$bssid) : j;
                map2.put(wifi, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$ssid = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$ssid();
                if (realmGet$ssid != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, wifiColumnInfo.ssidIndex, createRowWithPrimaryKey, realmGet$ssid, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, wifiColumnInfo.ssidIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$level = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$level();
                if (realmGet$level != null) {
                    Table.nativeSetLong(nativePtr, wifiColumnInfo.levelIndex, createRowWithPrimaryKey, realmGet$level.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, wifiColumnInfo.levelIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$levelIn = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelIn();
                if (realmGet$levelIn != null) {
                    Table.nativeSetLong(nativePtr, wifiColumnInfo.levelInIndex, createRowWithPrimaryKey, realmGet$levelIn.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, wifiColumnInfo.levelInIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmGet$levelOut();
                if (realmGet$levelOut != null) {
                    Table.nativeSetLong(nativePtr, wifiColumnInfo.levelOutIndex, createRowWithPrimaryKey, realmGet$levelOut.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, wifiColumnInfo.levelOutIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static Wifi createDetachedCopy(Wifi wifi, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Wifi wifi2;
        if (i > i2 || wifi == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(wifi);
        if (cacheData == null) {
            wifi2 = new Wifi();
            map.put(wifi, new RealmObjectProxy.CacheData(i, wifi2));
        } else if (i >= cacheData.minDepth) {
            return (Wifi) cacheData.object;
        } else {
            cacheData.minDepth = i;
            wifi2 = (Wifi) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi2;
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface2 = wifi;
        ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$ssid(ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$ssid());
        ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$bssid(ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$bssid());
        ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$level(ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$level());
        ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$levelIn(ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$levelIn());
        ru_unicorn_ujin_data_realm_wifirealmproxyinterface.realmSet$levelOut(ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$levelOut());
        return wifi2;
    }

    static Wifi update(Realm realm, WifiColumnInfo wifiColumnInfo, Wifi wifi, Wifi wifi2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface = wifi;
        ru_unicorn_ujin_data_realm_WifiRealmProxyInterface ru_unicorn_ujin_data_realm_wifirealmproxyinterface2 = wifi2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Wifi.class), wifiColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(wifiColumnInfo.ssidIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$ssid());
        osObjectBuilder.addString(wifiColumnInfo.bssidIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$bssid());
        osObjectBuilder.addInteger(wifiColumnInfo.levelIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$level());
        osObjectBuilder.addInteger(wifiColumnInfo.levelInIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$levelIn());
        osObjectBuilder.addInteger(wifiColumnInfo.levelOutIndex, ru_unicorn_ujin_data_realm_wifirealmproxyinterface2.realmGet$levelOut());
        osObjectBuilder.updateExistingObject();
        return wifi;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Wifi = proxy[");
        sb.append("{ssid:");
        Object obj = "null";
        sb.append(realmGet$ssid() != null ? realmGet$ssid() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{bssid:");
        sb.append(realmGet$bssid() != null ? realmGet$bssid() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{level:");
        sb.append(realmGet$level() != null ? realmGet$level() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{levelIn:");
        sb.append(realmGet$levelIn() != null ? realmGet$levelIn() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{levelOut:");
        if (realmGet$levelOut() != null) {
            obj = realmGet$levelOut();
        }
        sb.append(obj);
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
        ru_unicorn_ujin_data_realm_WifiRealmProxy ru_unicorn_ujin_data_realm_wifirealmproxy = (ru_unicorn_ujin_data_realm_WifiRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_wifirealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_wifirealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_wifirealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
