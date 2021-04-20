package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.MyBeacon;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy */
public class ru_unicorn_ujin_data_realm_MyBeaconRealmProxy extends MyBeacon implements RealmObjectProxy, ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private MyBeaconColumnInfo columnInfo;
    private ProxyState<MyBeacon> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MyBeacon";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy$MyBeaconColumnInfo */
    static final class MyBeaconColumnInfo extends ColumnInfo {
        long autoActionIndex;
        long bssidIndex;
        long levelIndex;
        long levelOutIndex;
        long maxColumnIndexValue;
        long minorIndex;
        long radiusIndex;
        long radiusOutIndex;

        MyBeaconColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.bssidIndex = addColumnDetails("bssid", "bssid", objectSchemaInfo);
            this.minorIndex = addColumnDetails("minor", "minor", objectSchemaInfo);
            this.radiusIndex = addColumnDetails("radius", "radius", objectSchemaInfo);
            this.radiusOutIndex = addColumnDetails("radiusOut", "radiusOut", objectSchemaInfo);
            this.levelIndex = addColumnDetails(FirebaseAnalytics.Param.LEVEL, FirebaseAnalytics.Param.LEVEL, objectSchemaInfo);
            this.levelOutIndex = addColumnDetails("levelOut", "levelOut", objectSchemaInfo);
            this.autoActionIndex = addColumnDetails("autoAction", "autoAction", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MyBeaconColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new MyBeaconColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            MyBeaconColumnInfo myBeaconColumnInfo = (MyBeaconColumnInfo) columnInfo;
            MyBeaconColumnInfo myBeaconColumnInfo2 = (MyBeaconColumnInfo) columnInfo2;
            myBeaconColumnInfo2.bssidIndex = myBeaconColumnInfo.bssidIndex;
            myBeaconColumnInfo2.minorIndex = myBeaconColumnInfo.minorIndex;
            myBeaconColumnInfo2.radiusIndex = myBeaconColumnInfo.radiusIndex;
            myBeaconColumnInfo2.radiusOutIndex = myBeaconColumnInfo.radiusOutIndex;
            myBeaconColumnInfo2.levelIndex = myBeaconColumnInfo.levelIndex;
            myBeaconColumnInfo2.levelOutIndex = myBeaconColumnInfo.levelOutIndex;
            myBeaconColumnInfo2.autoActionIndex = myBeaconColumnInfo.autoActionIndex;
            myBeaconColumnInfo2.maxColumnIndexValue = myBeaconColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_MyBeaconRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (MyBeaconColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$bssid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bssidIndex);
    }

    public void realmSet$bssid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bssidIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bssidIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bssidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bssidIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$minor() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.minorIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.minorIndex));
    }

    public void realmSet$minor(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'minor' cannot be changed after object was created.");
        }
    }

    public Double realmGet$radius() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.radiusIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.radiusIndex));
    }

    public void realmSet$radius(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.radiusIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.radiusIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.radiusIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.radiusIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public Double realmGet$radiusOut() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.radiusOutIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.radiusOutIndex));
    }

    public void realmSet$radiusOut(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.radiusOutIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.radiusOutIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.radiusOutIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.radiusOutIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
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

    public Integer realmGet$autoAction() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.autoActionIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.autoActionIndex));
    }

    public void realmSet$autoAction(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.autoActionIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.autoActionIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.autoActionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.autoActionIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("bssid", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("minor", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("radius", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("radiusOut", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty(FirebaseAnalytics.Param.LEVEL, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("levelOut", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("autoAction", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MyBeaconColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new MyBeaconColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.MyBeacon createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "minor"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r14 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r4 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy$MyBeaconColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.MyBeaconColumnInfo) r3
            long r3 = r3.minorIndex
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
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r3 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r14 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r14 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            int r1 = r13.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'minor'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface) r12
            java.lang.String r0 = "bssid"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00ad
            r12.realmSet$bssid(r2)
            goto L_0x00b4
        L_0x00ad:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$bssid(r0)
        L_0x00b4:
            java.lang.String r0 = "radius"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00d1
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c6
            r12.realmSet$radius(r2)
            goto L_0x00d1
        L_0x00c6:
            double r0 = r13.getDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12.realmSet$radius(r0)
        L_0x00d1:
            java.lang.String r0 = "radiusOut"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00e3
            r12.realmSet$radiusOut(r2)
            goto L_0x00ee
        L_0x00e3:
            double r0 = r13.getDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12.realmSet$radiusOut(r0)
        L_0x00ee:
            java.lang.String r0 = "level"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x010b
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0100
            r12.realmSet$level(r2)
            goto L_0x010b
        L_0x0100:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$level(r0)
        L_0x010b:
            java.lang.String r0 = "levelOut"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0128
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x011d
            r12.realmSet$levelOut(r2)
            goto L_0x0128
        L_0x011d:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$levelOut(r0)
        L_0x0128:
            java.lang.String r0 = "autoAction"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0145
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x013a
            r12.realmSet$autoAction(r2)
            goto L_0x0145
        L_0x013a:
            int r13 = r13.getInt(r0)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.realmSet$autoAction(r13)
        L_0x0145:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.MyBeacon");
    }

    public static MyBeacon createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        MyBeacon myBeacon = new MyBeacon();
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("bssid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$bssid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$bssid((String) null);
                }
            } else if (nextName.equals("minor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$minor(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$minor((Integer) null);
                }
                z = true;
            } else if (nextName.equals("radius")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$radius(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$radius((Double) null);
                }
            } else if (nextName.equals("radiusOut")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$radiusOut(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$radiusOut((Double) null);
                }
            } else if (nextName.equals(FirebaseAnalytics.Param.LEVEL)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$level(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$level((Integer) null);
                }
            } else if (nextName.equals("levelOut")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$levelOut(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$levelOut((Integer) null);
                }
            } else if (!nextName.equals("autoAction")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$autoAction(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$autoAction((Integer) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (MyBeacon) realm.copyToRealm(myBeacon, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'minor'.");
    }

    private static ru_unicorn_ujin_data_realm_MyBeaconRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxy ru_unicorn_ujin_data_realm_mybeaconrealmproxy = new ru_unicorn_ujin_data_realm_MyBeaconRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_mybeaconrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.MyBeacon copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.MyBeaconColumnInfo r9, p035ru.unicorn.ujin.data.realm.MyBeacon r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.MyBeacon r1 = (p035ru.unicorn.ujin.data.realm.MyBeacon) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.data.realm.MyBeacon> r2 = p035ru.unicorn.ujin.data.realm.MyBeacon.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.minorIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface) r5
            java.lang.Integer r5 = r5.realmGet$minor()
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
            io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.data.realm.MyBeacon r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.data.realm.MyBeacon r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_MyBeaconRealmProxy$MyBeaconColumnInfo, ru.unicorn.ujin.data.realm.MyBeacon, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.MyBeacon");
    }

    public static MyBeacon copy(Realm realm, MyBeaconColumnInfo myBeaconColumnInfo, MyBeacon myBeacon, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(myBeacon);
        if (realmObjectProxy != null) {
            return (MyBeacon) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(MyBeacon.class), myBeaconColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(myBeaconColumnInfo.bssidIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$bssid());
        osObjectBuilder.addInteger(myBeaconColumnInfo.minorIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor());
        osObjectBuilder.addDouble(myBeaconColumnInfo.radiusIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radius());
        osObjectBuilder.addDouble(myBeaconColumnInfo.radiusOutIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radiusOut());
        osObjectBuilder.addInteger(myBeaconColumnInfo.levelIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$level());
        osObjectBuilder.addInteger(myBeaconColumnInfo.levelOutIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$levelOut());
        osObjectBuilder.addInteger(myBeaconColumnInfo.autoActionIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$autoAction());
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(myBeacon, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, MyBeacon myBeacon, Map<RealmModel, Long> map) {
        long j;
        long j2;
        MyBeacon myBeacon2 = myBeacon;
        if (myBeacon2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) myBeacon2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(MyBeacon.class);
        long nativePtr = table.getNativePtr();
        MyBeaconColumnInfo myBeaconColumnInfo = (MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class);
        long j3 = myBeaconColumnInfo.minorIndex;
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon2;
        Integer realmGet$minor = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor();
        if (realmGet$minor == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$minor);
            j2 = j;
        }
        map.put(myBeacon2, Long.valueOf(j2));
        String realmGet$bssid = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$bssid();
        if (realmGet$bssid != null) {
            Table.nativeSetString(nativePtr, myBeaconColumnInfo.bssidIndex, j2, realmGet$bssid, false);
        }
        Double realmGet$radius = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radius();
        if (realmGet$radius != null) {
            Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusIndex, j2, realmGet$radius.doubleValue(), false);
        }
        Double realmGet$radiusOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radiusOut();
        if (realmGet$radiusOut != null) {
            Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusOutIndex, j2, realmGet$radiusOut.doubleValue(), false);
        }
        Integer realmGet$level = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$level();
        if (realmGet$level != null) {
            Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelIndex, j2, realmGet$level.longValue(), false);
        }
        Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$levelOut();
        if (realmGet$levelOut != null) {
            Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelOutIndex, j2, realmGet$levelOut.longValue(), false);
        }
        Integer realmGet$autoAction = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$autoAction();
        if (realmGet$autoAction != null) {
            Table.nativeSetLong(nativePtr, myBeaconColumnInfo.autoActionIndex, j2, realmGet$autoAction.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(MyBeacon.class);
        long nativePtr = table.getNativePtr();
        MyBeaconColumnInfo myBeaconColumnInfo = (MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class);
        long j3 = myBeaconColumnInfo.minorIndex;
        while (it.hasNext()) {
            MyBeacon myBeacon = (MyBeacon) it.next();
            if (!map2.containsKey(myBeacon)) {
                if (myBeacon instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) myBeacon;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(myBeacon, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon;
                Integer realmGet$minor = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor();
                if (realmGet$minor == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$minor);
                }
                long j4 = j;
                map2.put(myBeacon, Long.valueOf(j4));
                String realmGet$bssid = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$bssid();
                if (realmGet$bssid != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, myBeaconColumnInfo.bssidIndex, j4, realmGet$bssid, false);
                } else {
                    j2 = j3;
                }
                Double realmGet$radius = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radius();
                if (realmGet$radius != null) {
                    Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusIndex, j4, realmGet$radius.doubleValue(), false);
                }
                Double realmGet$radiusOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radiusOut();
                if (realmGet$radiusOut != null) {
                    Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusOutIndex, j4, realmGet$radiusOut.doubleValue(), false);
                }
                Integer realmGet$level = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$level();
                if (realmGet$level != null) {
                    Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelIndex, j4, realmGet$level.longValue(), false);
                }
                Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$levelOut();
                if (realmGet$levelOut != null) {
                    Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelOutIndex, j4, realmGet$levelOut.longValue(), false);
                }
                Integer realmGet$autoAction = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$autoAction();
                if (realmGet$autoAction != null) {
                    Table.nativeSetLong(nativePtr, myBeaconColumnInfo.autoActionIndex, j4, realmGet$autoAction.longValue(), false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, MyBeacon myBeacon, Map<RealmModel, Long> map) {
        long j;
        MyBeacon myBeacon2 = myBeacon;
        if (myBeacon2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) myBeacon2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(MyBeacon.class);
        long nativePtr = table.getNativePtr();
        MyBeaconColumnInfo myBeaconColumnInfo = (MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class);
        long j2 = myBeaconColumnInfo.minorIndex;
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon2;
        if (ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor()) : j;
        map.put(myBeacon2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$bssid = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$bssid();
        if (realmGet$bssid != null) {
            Table.nativeSetString(nativePtr, myBeaconColumnInfo.bssidIndex, createRowWithPrimaryKey, realmGet$bssid, false);
        } else {
            Table.nativeSetNull(nativePtr, myBeaconColumnInfo.bssidIndex, createRowWithPrimaryKey, false);
        }
        Double realmGet$radius = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radius();
        if (realmGet$radius != null) {
            Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusIndex, createRowWithPrimaryKey, realmGet$radius.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, myBeaconColumnInfo.radiusIndex, createRowWithPrimaryKey, false);
        }
        Double realmGet$radiusOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radiusOut();
        if (realmGet$radiusOut != null) {
            Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusOutIndex, createRowWithPrimaryKey, realmGet$radiusOut.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, myBeaconColumnInfo.radiusOutIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$level = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$level();
        if (realmGet$level != null) {
            Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelIndex, createRowWithPrimaryKey, realmGet$level.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, myBeaconColumnInfo.levelIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$levelOut();
        if (realmGet$levelOut != null) {
            Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelOutIndex, createRowWithPrimaryKey, realmGet$levelOut.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, myBeaconColumnInfo.levelOutIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$autoAction = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$autoAction();
        if (realmGet$autoAction != null) {
            Table.nativeSetLong(nativePtr, myBeaconColumnInfo.autoActionIndex, createRowWithPrimaryKey, realmGet$autoAction.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, myBeaconColumnInfo.autoActionIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(MyBeacon.class);
        long nativePtr = table.getNativePtr();
        MyBeaconColumnInfo myBeaconColumnInfo = (MyBeaconColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MyBeacon.class);
        long j3 = myBeaconColumnInfo.minorIndex;
        while (it.hasNext()) {
            MyBeacon myBeacon = (MyBeacon) it.next();
            if (!map2.containsKey(myBeacon)) {
                if (myBeacon instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) myBeacon;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(myBeacon, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon;
                if (ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$minor());
                }
                long j4 = j;
                map2.put(myBeacon, Long.valueOf(j4));
                String realmGet$bssid = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$bssid();
                if (realmGet$bssid != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, myBeaconColumnInfo.bssidIndex, j4, realmGet$bssid, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, myBeaconColumnInfo.bssidIndex, j4, false);
                }
                Double realmGet$radius = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radius();
                if (realmGet$radius != null) {
                    Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusIndex, j4, realmGet$radius.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, myBeaconColumnInfo.radiusIndex, j4, false);
                }
                Double realmGet$radiusOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$radiusOut();
                if (realmGet$radiusOut != null) {
                    Table.nativeSetDouble(nativePtr, myBeaconColumnInfo.radiusOutIndex, j4, realmGet$radiusOut.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, myBeaconColumnInfo.radiusOutIndex, j4, false);
                }
                Integer realmGet$level = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$level();
                if (realmGet$level != null) {
                    Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelIndex, j4, realmGet$level.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, myBeaconColumnInfo.levelIndex, j4, false);
                }
                Integer realmGet$levelOut = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$levelOut();
                if (realmGet$levelOut != null) {
                    Table.nativeSetLong(nativePtr, myBeaconColumnInfo.levelOutIndex, j4, realmGet$levelOut.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, myBeaconColumnInfo.levelOutIndex, j4, false);
                }
                Integer realmGet$autoAction = ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmGet$autoAction();
                if (realmGet$autoAction != null) {
                    Table.nativeSetLong(nativePtr, myBeaconColumnInfo.autoActionIndex, j4, realmGet$autoAction.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, myBeaconColumnInfo.autoActionIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static MyBeacon createDetachedCopy(MyBeacon myBeacon, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        MyBeacon myBeacon2;
        if (i > i2 || myBeacon == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(myBeacon);
        if (cacheData == null) {
            myBeacon2 = new MyBeacon();
            map.put(myBeacon, new RealmObjectProxy.CacheData(i, myBeacon2));
        } else if (i >= cacheData.minDepth) {
            return (MyBeacon) cacheData.object;
        } else {
            cacheData.minDepth = i;
            myBeacon2 = (MyBeacon) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon2;
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2 = myBeacon;
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$bssid(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$bssid());
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$minor(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$minor());
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$radius(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$radius());
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$radiusOut(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$radiusOut());
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$level(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$level());
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$levelOut(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$levelOut());
        ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface.realmSet$autoAction(ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$autoAction());
        return myBeacon2;
    }

    static MyBeacon update(Realm realm, MyBeaconColumnInfo myBeaconColumnInfo, MyBeacon myBeacon, MyBeacon myBeacon2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface = myBeacon;
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxyInterface ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2 = myBeacon2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(MyBeacon.class), myBeaconColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(myBeaconColumnInfo.bssidIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$bssid());
        osObjectBuilder.addInteger(myBeaconColumnInfo.minorIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$minor());
        osObjectBuilder.addDouble(myBeaconColumnInfo.radiusIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$radius());
        osObjectBuilder.addDouble(myBeaconColumnInfo.radiusOutIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$radiusOut());
        osObjectBuilder.addInteger(myBeaconColumnInfo.levelIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$level());
        osObjectBuilder.addInteger(myBeaconColumnInfo.levelOutIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$levelOut());
        osObjectBuilder.addInteger(myBeaconColumnInfo.autoActionIndex, ru_unicorn_ujin_data_realm_mybeaconrealmproxyinterface2.realmGet$autoAction());
        osObjectBuilder.updateExistingObject();
        return myBeacon;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("MyBeacon = proxy[");
        sb.append("{bssid:");
        Object obj = "null";
        sb.append(realmGet$bssid() != null ? realmGet$bssid() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{minor:");
        sb.append(realmGet$minor() != null ? realmGet$minor() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{radius:");
        sb.append(realmGet$radius() != null ? realmGet$radius() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{radiusOut:");
        sb.append(realmGet$radiusOut() != null ? realmGet$radiusOut() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{level:");
        sb.append(realmGet$level() != null ? realmGet$level() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{levelOut:");
        sb.append(realmGet$levelOut() != null ? realmGet$levelOut() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{autoAction:");
        if (realmGet$autoAction() != null) {
            obj = realmGet$autoAction();
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
        ru_unicorn_ujin_data_realm_MyBeaconRealmProxy ru_unicorn_ujin_data_realm_mybeaconrealmproxy = (ru_unicorn_ujin_data_realm_MyBeaconRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_mybeaconrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_mybeaconrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_mybeaconrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
