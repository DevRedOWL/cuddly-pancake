package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.TimeSlot;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy */
public class ru_unicorn_ujin_data_realm_TimeSlotRealmProxy extends TimeSlot implements RealmObjectProxy, ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TimeSlotColumnInfo columnInfo;
    private ProxyState<TimeSlot> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TimeSlot";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy$TimeSlotColumnInfo */
    static final class TimeSlotColumnInfo extends ColumnInfo {
        long endTimeIndex;
        long idIndex;
        long maxColumnIndexValue;
        long startTimeIndex;
        long stateIndex;

        TimeSlotColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.startTimeIndex = addColumnDetails("startTime", "startTime", objectSchemaInfo);
            this.endTimeIndex = addColumnDetails("endTime", "endTime", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TimeSlotColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TimeSlotColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TimeSlotColumnInfo timeSlotColumnInfo = (TimeSlotColumnInfo) columnInfo;
            TimeSlotColumnInfo timeSlotColumnInfo2 = (TimeSlotColumnInfo) columnInfo2;
            timeSlotColumnInfo2.idIndex = timeSlotColumnInfo.idIndex;
            timeSlotColumnInfo2.stateIndex = timeSlotColumnInfo.stateIndex;
            timeSlotColumnInfo2.startTimeIndex = timeSlotColumnInfo.startTimeIndex;
            timeSlotColumnInfo2.endTimeIndex = timeSlotColumnInfo.endTimeIndex;
            timeSlotColumnInfo2.maxColumnIndexValue = timeSlotColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_TimeSlotRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TimeSlotColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateIndex);
    }

    public void realmSet$state(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$startTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.startTimeIndex);
    }

    public void realmSet$startTime(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startTimeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.startTimeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.startTimeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.startTimeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$endTime() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.endTimeIndex);
    }

    public void realmSet$endTime(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.endTimeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.endTimeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.endTimeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.endTimeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("state", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("startTime", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("endTime", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TimeSlotColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TimeSlotColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.TimeSlot createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r14 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r4 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy$TimeSlotColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.TimeSlotColumnInfo) r3
            long r3 = r3.idIndex
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
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r3 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r14 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r14 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface) r12
            java.lang.String r0 = "state"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$state(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$state(r0)
        L_0x00b0:
            java.lang.String r0 = "startTime"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$startTime(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$startTime(r0)
        L_0x00c9:
            java.lang.String r0 = "endTime"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$endTime(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$endTime(r13)
        L_0x00e2:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.TimeSlot");
    }

    public static TimeSlot createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TimeSlot timeSlot = new TimeSlot();
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("state")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$state(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$state((String) null);
                }
            } else if (nextName.equals("startTime")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$startTime(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$startTime((String) null);
                }
            } else if (!nextName.equals("endTime")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$endTime(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$endTime((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TimeSlot) realm.copyToRealm(timeSlot, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_TimeSlotRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlot.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxy ru_unicorn_ujin_data_realm_timeslotrealmproxy = new ru_unicorn_ujin_data_realm_TimeSlotRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_timeslotrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.TimeSlot copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.TimeSlotColumnInfo r9, p035ru.unicorn.ujin.data.realm.TimeSlot r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.TimeSlot r1 = (p035ru.unicorn.ujin.data.realm.TimeSlot) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.TimeSlot> r2 = p035ru.unicorn.ujin.data.realm.TimeSlot.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.TimeSlot r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.TimeSlot r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_TimeSlotRealmProxy$TimeSlotColumnInfo, ru.unicorn.ujin.data.realm.TimeSlot, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.TimeSlot");
    }

    public static TimeSlot copy(Realm realm, TimeSlotColumnInfo timeSlotColumnInfo, TimeSlot timeSlot, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(timeSlot);
        if (realmObjectProxy != null) {
            return (TimeSlot) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TimeSlot.class), timeSlotColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(timeSlotColumnInfo.idIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(timeSlotColumnInfo.stateIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$state());
        osObjectBuilder.addString(timeSlotColumnInfo.startTimeIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$startTime());
        osObjectBuilder.addString(timeSlotColumnInfo.endTimeIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$endTime());
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(timeSlot, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TimeSlot timeSlot, Map<RealmModel, Long> map) {
        long j;
        long j2;
        TimeSlot timeSlot2 = timeSlot;
        if (timeSlot2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlot2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TimeSlot.class);
        long nativePtr = table.getNativePtr();
        TimeSlotColumnInfo timeSlotColumnInfo = (TimeSlotColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlot.class);
        long j3 = timeSlotColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot2;
        String realmGet$id = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$id();
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
        map.put(timeSlot2, Long.valueOf(j2));
        String realmGet$state = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(nativePtr, timeSlotColumnInfo.stateIndex, j2, realmGet$state, false);
        }
        String realmGet$startTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$startTime();
        if (realmGet$startTime != null) {
            Table.nativeSetString(nativePtr, timeSlotColumnInfo.startTimeIndex, j2, realmGet$startTime, false);
        }
        String realmGet$endTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$endTime();
        if (realmGet$endTime != null) {
            Table.nativeSetString(nativePtr, timeSlotColumnInfo.endTimeIndex, j2, realmGet$endTime, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TimeSlot.class);
        long nativePtr = table.getNativePtr();
        TimeSlotColumnInfo timeSlotColumnInfo = (TimeSlotColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlot.class);
        long j3 = timeSlotColumnInfo.idIndex;
        while (it.hasNext()) {
            TimeSlot timeSlot = (TimeSlot) it.next();
            if (!map2.containsKey(timeSlot)) {
                if (timeSlot instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlot;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(timeSlot, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot;
                String realmGet$id = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$id();
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
                map2.put(timeSlot, Long.valueOf(j2));
                String realmGet$state = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetString(nativePtr, timeSlotColumnInfo.stateIndex, j2, realmGet$state, false);
                }
                String realmGet$startTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$startTime();
                if (realmGet$startTime != null) {
                    Table.nativeSetString(nativePtr, timeSlotColumnInfo.startTimeIndex, j2, realmGet$startTime, false);
                }
                String realmGet$endTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$endTime();
                if (realmGet$endTime != null) {
                    Table.nativeSetString(nativePtr, timeSlotColumnInfo.endTimeIndex, j2, realmGet$endTime, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TimeSlot timeSlot, Map<RealmModel, Long> map) {
        long j;
        TimeSlot timeSlot2 = timeSlot;
        if (timeSlot2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlot2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TimeSlot.class);
        long nativePtr = table.getNativePtr();
        TimeSlotColumnInfo timeSlotColumnInfo = (TimeSlotColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlot.class);
        long j2 = timeSlotColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot2;
        String realmGet$id = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(timeSlot2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$state = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(nativePtr, timeSlotColumnInfo.stateIndex, createRowWithPrimaryKey, realmGet$state, false);
        } else {
            Table.nativeSetNull(nativePtr, timeSlotColumnInfo.stateIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$startTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$startTime();
        if (realmGet$startTime != null) {
            Table.nativeSetString(nativePtr, timeSlotColumnInfo.startTimeIndex, createRowWithPrimaryKey, realmGet$startTime, false);
        } else {
            Table.nativeSetNull(nativePtr, timeSlotColumnInfo.startTimeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$endTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$endTime();
        if (realmGet$endTime != null) {
            Table.nativeSetString(nativePtr, timeSlotColumnInfo.endTimeIndex, createRowWithPrimaryKey, realmGet$endTime, false);
        } else {
            Table.nativeSetNull(nativePtr, timeSlotColumnInfo.endTimeIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TimeSlot.class);
        long nativePtr = table.getNativePtr();
        TimeSlotColumnInfo timeSlotColumnInfo = (TimeSlotColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlot.class);
        long j2 = timeSlotColumnInfo.idIndex;
        while (it.hasNext()) {
            TimeSlot timeSlot = (TimeSlot) it.next();
            if (!map2.containsKey(timeSlot)) {
                if (timeSlot instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlot;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(timeSlot, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot;
                String realmGet$id = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
                map2.put(timeSlot, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$state = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetString(nativePtr, timeSlotColumnInfo.stateIndex, createRowWithPrimaryKey, realmGet$state, false);
                } else {
                    Table.nativeSetNull(nativePtr, timeSlotColumnInfo.stateIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$startTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$startTime();
                if (realmGet$startTime != null) {
                    Table.nativeSetString(nativePtr, timeSlotColumnInfo.startTimeIndex, createRowWithPrimaryKey, realmGet$startTime, false);
                } else {
                    Table.nativeSetNull(nativePtr, timeSlotColumnInfo.startTimeIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$endTime = ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmGet$endTime();
                if (realmGet$endTime != null) {
                    Table.nativeSetString(nativePtr, timeSlotColumnInfo.endTimeIndex, createRowWithPrimaryKey, realmGet$endTime, false);
                } else {
                    Table.nativeSetNull(nativePtr, timeSlotColumnInfo.endTimeIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static TimeSlot createDetachedCopy(TimeSlot timeSlot, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TimeSlot timeSlot2;
        if (i > i2 || timeSlot == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(timeSlot);
        if (cacheData == null) {
            timeSlot2 = new TimeSlot();
            map.put(timeSlot, new RealmObjectProxy.CacheData(i, timeSlot2));
        } else if (i >= cacheData.minDepth) {
            return (TimeSlot) cacheData.object;
        } else {
            cacheData.minDepth = i;
            timeSlot2 = (TimeSlot) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot2;
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2 = timeSlot;
        ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$state(ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$state());
        ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$startTime(ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$startTime());
        ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface.realmSet$endTime(ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$endTime());
        return timeSlot2;
    }

    static TimeSlot update(Realm realm, TimeSlotColumnInfo timeSlotColumnInfo, TimeSlot timeSlot, TimeSlot timeSlot2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface = timeSlot;
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxyInterface ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2 = timeSlot2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TimeSlot.class), timeSlotColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(timeSlotColumnInfo.idIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(timeSlotColumnInfo.stateIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$state());
        osObjectBuilder.addString(timeSlotColumnInfo.startTimeIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$startTime());
        osObjectBuilder.addString(timeSlotColumnInfo.endTimeIndex, ru_unicorn_ujin_data_realm_timeslotrealmproxyinterface2.realmGet$endTime());
        osObjectBuilder.updateExistingObject();
        return timeSlot;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TimeSlot = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{state:");
        sb.append(realmGet$state() != null ? realmGet$state() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{startTime:");
        sb.append(realmGet$startTime() != null ? realmGet$startTime() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{endTime:");
        if (realmGet$endTime() != null) {
            str = realmGet$endTime();
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
        ru_unicorn_ujin_data_realm_TimeSlotRealmProxy ru_unicorn_ujin_data_realm_timeslotrealmproxy = (ru_unicorn_ujin_data_realm_TimeSlotRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_timeslotrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_timeslotrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_timeslotrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
