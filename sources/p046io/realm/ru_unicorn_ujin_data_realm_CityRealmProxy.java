package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.Coordinates;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.MapPoint;
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
import p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy */
public class ru_unicorn_ujin_data_realm_CityRealmProxy extends City implements RealmObjectProxy, ru_unicorn_ujin_data_realm_CityRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CityColumnInfo columnInfo;
    private ProxyState<City> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "City";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy$CityColumnInfo */
    static final class CityColumnInfo extends ColumnInfo {
        long centerIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long zoomIndex;

        CityColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.zoomIndex = addColumnDetails(MapPoint.JsonFields.zoom, MapPoint.JsonFields.zoom, objectSchemaInfo);
            this.centerIndex = addColumnDetails("center", "center", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CityColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CityColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CityColumnInfo cityColumnInfo = (CityColumnInfo) columnInfo;
            CityColumnInfo cityColumnInfo2 = (CityColumnInfo) columnInfo2;
            cityColumnInfo2.idIndex = cityColumnInfo.idIndex;
            cityColumnInfo2.titleIndex = cityColumnInfo.titleIndex;
            cityColumnInfo2.zoomIndex = cityColumnInfo.zoomIndex;
            cityColumnInfo2.centerIndex = cityColumnInfo.centerIndex;
            cityColumnInfo2.maxColumnIndexValue = cityColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_CityRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CityColumnInfo) realmObjectContext.getColumnInfo();
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

    public Integer realmGet$zoom() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.zoomIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.zoomIndex));
    }

    public void realmSet$zoom(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.zoomIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.zoomIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.zoomIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.zoomIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Coordinates realmGet$center() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.centerIndex)) {
            return null;
        }
        return (Coordinates) this.proxyState.getRealm$realm().get(Coordinates.class, this.proxyState.getRow$realm().getLink(this.columnInfo.centerIndex), false, Collections.emptyList());
    }

    public void realmSet$center(Coordinates coordinates) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (coordinates == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.centerIndex);
                return;
            }
            this.proxyState.checkValidObject(coordinates);
            this.proxyState.getRow$realm().setLink(this.columnInfo.centerIndex, ((RealmObjectProxy) coordinates).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("center")) {
            if (coordinates != null && !RealmObject.isManaged(coordinates)) {
                coordinates = (Coordinates) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(coordinates, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (coordinates == null) {
                row$realm.nullifyLink(this.columnInfo.centerIndex);
                return;
            }
            this.proxyState.checkValidObject(coordinates);
            row$realm.getTable().setLink(this.columnInfo.centerIndex, row$realm.getIndex(), ((RealmObjectProxy) coordinates).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(MapPoint.JsonFields.zoom, RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedLinkProperty("center", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CityColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CityColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.City createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
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
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r1 = p035ru.unicorn.ujin.data.realm.City.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r3 = p035ru.unicorn.ujin.data.realm.City.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy$CityColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy.CityColumnInfo) r2
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
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r2 = p035ru.unicorn.ujin.data.realm.City.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy     // Catch:{ all -> 0x0066 }
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
            java.lang.String r2 = "center"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r1 = p035ru.unicorn.ujin.data.realm.City.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r1 = p035ru.unicorn.ujin.data.realm.City.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxyInterface r3 = (p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxyInterface) r3
            java.lang.String r4 = "title"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$title(r12)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$title(r4)
        L_0x00bf:
            java.lang.String r4 = "zoom"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00dd
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d2
            r3.realmSet$zoom(r12)
            goto L_0x00dd
        L_0x00d2:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$zoom(r4)
        L_0x00dd:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00f8
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00ed
            r3.realmSet$center(r12)
            goto L_0x00f8
        L_0x00ed:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.Coordinates r0 = p046io.realm.ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$center(r0)
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.City");
    }

    public static City createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        City city = new City();
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals(MapPoint.JsonFields.zoom)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$zoom(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$zoom((Integer) null);
                }
            } else if (!nextName.equals("center")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$center((Coordinates) null);
            } else {
                ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$center(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (City) realm.copyToRealm(city, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_CityRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) City.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CityRealmProxy ru_unicorn_ujin_data_realm_cityrealmproxy = new ru_unicorn_ujin_data_realm_CityRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_cityrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.City copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy.CityColumnInfo r9, p035ru.unicorn.ujin.data.realm.City r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.City r1 = (p035ru.unicorn.ujin.data.realm.City) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.City> r2 = p035ru.unicorn.ujin.data.realm.City.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.City r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.City r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_CityRealmProxy$CityColumnInfo, ru.unicorn.ujin.data.realm.City, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.City");
    }

    public static City copy(Realm realm, CityColumnInfo cityColumnInfo, City city, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(city);
        if (realmObjectProxy != null) {
            return (City) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(City.class), cityColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cityColumnInfo.idIndex, ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(cityColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$title());
        osObjectBuilder.addInteger(cityColumnInfo.zoomIndex, ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$zoom());
        ru_unicorn_ujin_data_realm_CityRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(city, newProxyInstance);
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$center();
        if (realmGet$center == null) {
            newProxyInstance.realmSet$center((Coordinates) null);
        } else {
            Coordinates coordinates = (Coordinates) map.get(realmGet$center);
            if (coordinates != null) {
                newProxyInstance.realmSet$center(coordinates);
            } else {
                newProxyInstance.realmSet$center(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class), realmGet$center, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, City city, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        City city2 = city;
        Map<RealmModel, Long> map2 = map;
        if (city2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) city2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(City.class);
        long nativePtr = table.getNativePtr();
        CityColumnInfo cityColumnInfo = (CityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) City.class);
        long j3 = cityColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city2;
        String realmGet$id = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$id();
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
        map2.put(city2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cityColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        Integer realmGet$zoom = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$zoom();
        if (realmGet$zoom != null) {
            Table.nativeSetLong(nativePtr, cityColumnInfo.zoomIndex, j2, realmGet$zoom.longValue(), false);
        }
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$center();
        if (realmGet$center != null) {
            Long l = map2.get(realmGet$center);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm2, realmGet$center, map2));
            }
            Table.nativeSetLink(nativePtr, cityColumnInfo.centerIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(City.class);
        long nativePtr = table.getNativePtr();
        CityColumnInfo cityColumnInfo = (CityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) City.class);
        long j4 = cityColumnInfo.idIndex;
        while (it.hasNext()) {
            City city = (City) it.next();
            if (!map2.containsKey(city)) {
                if (city instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) city;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(city, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city;
                String realmGet$id = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(city, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, cityColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j3 = j4;
                }
                Integer realmGet$zoom = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$zoom();
                if (realmGet$zoom != null) {
                    Table.nativeSetLong(nativePtr, cityColumnInfo.zoomIndex, j2, realmGet$zoom.longValue(), false);
                }
                Coordinates realmGet$center = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$center();
                if (realmGet$center != null) {
                    Long l = map2.get(realmGet$center);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insert(realm2, realmGet$center, map2));
                    }
                    table.setLink(cityColumnInfo.centerIndex, j2, l.longValue(), false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, City city, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        City city2 = city;
        Map<RealmModel, Long> map2 = map;
        if (city2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) city2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(City.class);
        long nativePtr = table.getNativePtr();
        CityColumnInfo cityColumnInfo = (CityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) City.class);
        long j2 = cityColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city2;
        String realmGet$id = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(city2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cityColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, cityColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$zoom = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$zoom();
        if (realmGet$zoom != null) {
            Table.nativeSetLong(nativePtr, cityColumnInfo.zoomIndex, createRowWithPrimaryKey, realmGet$zoom.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, cityColumnInfo.zoomIndex, createRowWithPrimaryKey, false);
        }
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$center();
        if (realmGet$center != null) {
            Long l = map2.get(realmGet$center);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm2, realmGet$center, map2));
            }
            Table.nativeSetLink(nativePtr, cityColumnInfo.centerIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, cityColumnInfo.centerIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(City.class);
        long nativePtr = table.getNativePtr();
        CityColumnInfo cityColumnInfo = (CityColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) City.class);
        long j3 = cityColumnInfo.idIndex;
        while (it.hasNext()) {
            City city = (City) it.next();
            if (!map2.containsKey(city)) {
                if (city instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) city;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(city, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city;
                String realmGet$id = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(city, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, cityColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, cityColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$zoom = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$zoom();
                if (realmGet$zoom != null) {
                    Table.nativeSetLong(nativePtr, cityColumnInfo.zoomIndex, createRowWithPrimaryKey, realmGet$zoom.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, cityColumnInfo.zoomIndex, createRowWithPrimaryKey, false);
                }
                Coordinates realmGet$center = ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmGet$center();
                if (realmGet$center != null) {
                    Long l = map2.get(realmGet$center);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.insertOrUpdate(realm2, realmGet$center, map2));
                    }
                    Table.nativeSetLink(nativePtr, cityColumnInfo.centerIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, cityColumnInfo.centerIndex, createRowWithPrimaryKey);
                }
                j3 = j2;
            }
        }
    }

    public static City createDetachedCopy(City city, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        City city2;
        if (i > i2 || city == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(city);
        if (cacheData == null) {
            city2 = new City();
            map.put(city, new RealmObjectProxy.CacheData(i, city2));
        } else if (i >= cacheData.minDepth) {
            return (City) cacheData.object;
        } else {
            cacheData.minDepth = i;
            city2 = (City) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city2;
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface2 = city;
        ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$zoom(ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$zoom());
        ru_unicorn_ujin_data_realm_cityrealmproxyinterface.realmSet$center(ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$center(), i + 1, i2, map));
        return city2;
    }

    static City update(Realm realm, CityColumnInfo cityColumnInfo, City city, City city2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface = city;
        ru_unicorn_ujin_data_realm_CityRealmProxyInterface ru_unicorn_ujin_data_realm_cityrealmproxyinterface2 = city2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(City.class), cityColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cityColumnInfo.idIndex, ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(cityColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addInteger(cityColumnInfo.zoomIndex, ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$zoom());
        Coordinates realmGet$center = ru_unicorn_ujin_data_realm_cityrealmproxyinterface2.realmGet$center();
        if (realmGet$center == null) {
            osObjectBuilder.addNull(cityColumnInfo.centerIndex);
        } else {
            Coordinates coordinates = (Coordinates) map.get(realmGet$center);
            if (coordinates != null) {
                osObjectBuilder.addObject(cityColumnInfo.centerIndex, coordinates);
            } else {
                osObjectBuilder.addObject(cityColumnInfo.centerIndex, ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.CoordinatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coordinates.class), realmGet$center, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return city;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("City = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{zoom:");
        sb.append(realmGet$zoom() != null ? realmGet$zoom() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{center:");
        if (realmGet$center() != null) {
            str = ru_unicorn_ujin_data_realm_CoordinatesRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_CityRealmProxy ru_unicorn_ujin_data_realm_cityrealmproxy = (ru_unicorn_ujin_data_realm_CityRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_cityrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_cityrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_cityrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
