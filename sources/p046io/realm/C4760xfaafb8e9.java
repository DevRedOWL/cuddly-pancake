package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHumanValue;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanValueRealmProxy */
public class C4760xfaafb8e9 extends TimeSlotHumanValue implements RealmObjectProxy, C4761x4fbeca50 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TimeSlotHumanValueColumnInfo columnInfo;
    private ProxyState<TimeSlotHumanValue> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanValueRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TimeSlotHumanValue";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanValueRealmProxy$TimeSlotHumanValueColumnInfo */
    static final class TimeSlotHumanValueColumnInfo extends ColumnInfo {
        long dateIndex;
        long maxColumnIndexValue;
        long timeIndex;
        long weekDayIndex;

        TimeSlotHumanValueColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.weekDayIndex = addColumnDetails("weekDay", "weekDay", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.timeIndex = addColumnDetails("time", "time", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TimeSlotHumanValueColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TimeSlotHumanValueColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo = (TimeSlotHumanValueColumnInfo) columnInfo;
            TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo2 = (TimeSlotHumanValueColumnInfo) columnInfo2;
            timeSlotHumanValueColumnInfo2.weekDayIndex = timeSlotHumanValueColumnInfo.weekDayIndex;
            timeSlotHumanValueColumnInfo2.dateIndex = timeSlotHumanValueColumnInfo.dateIndex;
            timeSlotHumanValueColumnInfo2.timeIndex = timeSlotHumanValueColumnInfo.timeIndex;
            timeSlotHumanValueColumnInfo2.maxColumnIndexValue = timeSlotHumanValueColumnInfo.maxColumnIndexValue;
        }
    }

    C4760xfaafb8e9() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TimeSlotHumanValueColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$weekDay() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.weekDayIndex);
    }

    public void realmSet$weekDay(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.weekDayIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.weekDayIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.weekDayIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.weekDayIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$date() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateIndex);
    }

    public void realmSet$date(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$time() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timeIndex);
    }

    public void realmSet$time(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("weekDay", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("date", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("time", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TimeSlotHumanValueColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TimeSlotHumanValueColumnInfo(osSchemaInfo);
    }

    public static TimeSlotHumanValue createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TimeSlotHumanValue timeSlotHumanValue = (TimeSlotHumanValue) realm.createObjectInternal(TimeSlotHumanValue.class, true, Collections.emptyList());
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
        if (jSONObject.has("weekDay")) {
            if (jSONObject.isNull("weekDay")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$weekDay((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$weekDay(jSONObject.getString("weekDay"));
            }
        }
        if (jSONObject.has("date")) {
            if (jSONObject.isNull("date")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$date((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$date(jSONObject.getString("date"));
            }
        }
        if (jSONObject.has("time")) {
            if (jSONObject.isNull("time")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$time((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$time(jSONObject.getString("time"));
            }
        }
        return timeSlotHumanValue;
    }

    public static TimeSlotHumanValue createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TimeSlotHumanValue timeSlotHumanValue = new TimeSlotHumanValue();
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("weekDay")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$weekDay(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$weekDay((String) null);
                }
            } else if (nextName.equals("date")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$date(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$date((String) null);
                }
            } else if (!nextName.equals("time")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$time(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$time((String) null);
            }
        }
        jsonReader.endObject();
        return (TimeSlotHumanValue) realm.copyToRealm(timeSlotHumanValue, new ImportFlag[0]);
    }

    private static C4760xfaafb8e9 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class), false, Collections.emptyList());
        C4760xfaafb8e9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxy = new C4760xfaafb8e9();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxy;
    }

    public static TimeSlotHumanValue copyOrUpdate(Realm realm, TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo, TimeSlotHumanValue timeSlotHumanValue, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (timeSlotHumanValue instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHumanValue;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return timeSlotHumanValue;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(timeSlotHumanValue);
        if (realmObjectProxy2 != null) {
            return (TimeSlotHumanValue) realmObjectProxy2;
        }
        return copy(realm, timeSlotHumanValueColumnInfo, timeSlotHumanValue, z, map, set);
    }

    public static TimeSlotHumanValue copy(Realm realm, TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo, TimeSlotHumanValue timeSlotHumanValue, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(timeSlotHumanValue);
        if (realmObjectProxy != null) {
            return (TimeSlotHumanValue) realmObjectProxy;
        }
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TimeSlotHumanValue.class), timeSlotHumanValueColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(timeSlotHumanValueColumnInfo.weekDayIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$weekDay());
        osObjectBuilder.addString(timeSlotHumanValueColumnInfo.dateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$date());
        osObjectBuilder.addString(timeSlotHumanValueColumnInfo.timeIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$time());
        C4760xfaafb8e9 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(timeSlotHumanValue, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TimeSlotHumanValue timeSlotHumanValue, Map<RealmModel, Long> map) {
        if (timeSlotHumanValue instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHumanValue;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TimeSlotHumanValue.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo = (TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class);
        long createRow = OsObject.createRow(table);
        map.put(timeSlotHumanValue, Long.valueOf(createRow));
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
        String realmGet$weekDay = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$weekDay();
        if (realmGet$weekDay != null) {
            Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.weekDayIndex, createRow, realmGet$weekDay, false);
        }
        String realmGet$date = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.dateIndex, createRow, realmGet$date, false);
        }
        String realmGet$time = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.timeIndex, createRow, realmGet$time, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TimeSlotHumanValue.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo = (TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class);
        while (it.hasNext()) {
            TimeSlotHumanValue timeSlotHumanValue = (TimeSlotHumanValue) it.next();
            if (!map2.containsKey(timeSlotHumanValue)) {
                if (timeSlotHumanValue instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHumanValue;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(timeSlotHumanValue, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(timeSlotHumanValue, Long.valueOf(createRow));
                C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
                String realmGet$weekDay = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$weekDay();
                if (realmGet$weekDay != null) {
                    Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.weekDayIndex, createRow, realmGet$weekDay, false);
                }
                String realmGet$date = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.dateIndex, createRow, realmGet$date, false);
                }
                String realmGet$time = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$time();
                if (realmGet$time != null) {
                    Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.timeIndex, createRow, realmGet$time, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TimeSlotHumanValue timeSlotHumanValue, Map<RealmModel, Long> map) {
        if (timeSlotHumanValue instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHumanValue;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TimeSlotHumanValue.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo = (TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class);
        long createRow = OsObject.createRow(table);
        map.put(timeSlotHumanValue, Long.valueOf(createRow));
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
        String realmGet$weekDay = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$weekDay();
        if (realmGet$weekDay != null) {
            Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.weekDayIndex, createRow, realmGet$weekDay, false);
        } else {
            Table.nativeSetNull(nativePtr, timeSlotHumanValueColumnInfo.weekDayIndex, createRow, false);
        }
        String realmGet$date = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$date();
        if (realmGet$date != null) {
            Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.dateIndex, createRow, realmGet$date, false);
        } else {
            Table.nativeSetNull(nativePtr, timeSlotHumanValueColumnInfo.dateIndex, createRow, false);
        }
        String realmGet$time = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$time();
        if (realmGet$time != null) {
            Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.timeIndex, createRow, realmGet$time, false);
        } else {
            Table.nativeSetNull(nativePtr, timeSlotHumanValueColumnInfo.timeIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TimeSlotHumanValue.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanValueColumnInfo timeSlotHumanValueColumnInfo = (TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class);
        while (it.hasNext()) {
            TimeSlotHumanValue timeSlotHumanValue = (TimeSlotHumanValue) it.next();
            if (!map2.containsKey(timeSlotHumanValue)) {
                if (timeSlotHumanValue instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHumanValue;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(timeSlotHumanValue, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(timeSlotHumanValue, Long.valueOf(createRow));
                C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue;
                String realmGet$weekDay = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$weekDay();
                if (realmGet$weekDay != null) {
                    Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.weekDayIndex, createRow, realmGet$weekDay, false);
                } else {
                    Table.nativeSetNull(nativePtr, timeSlotHumanValueColumnInfo.weekDayIndex, createRow, false);
                }
                String realmGet$date = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$date();
                if (realmGet$date != null) {
                    Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.dateIndex, createRow, realmGet$date, false);
                } else {
                    Table.nativeSetNull(nativePtr, timeSlotHumanValueColumnInfo.dateIndex, createRow, false);
                }
                String realmGet$time = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmGet$time();
                if (realmGet$time != null) {
                    Table.nativeSetString(nativePtr, timeSlotHumanValueColumnInfo.timeIndex, createRow, realmGet$time, false);
                } else {
                    Table.nativeSetNull(nativePtr, timeSlotHumanValueColumnInfo.timeIndex, createRow, false);
                }
            }
        }
    }

    public static TimeSlotHumanValue createDetachedCopy(TimeSlotHumanValue timeSlotHumanValue, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TimeSlotHumanValue timeSlotHumanValue2;
        if (i > i2 || timeSlotHumanValue == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(timeSlotHumanValue);
        if (cacheData == null) {
            timeSlotHumanValue2 = new TimeSlotHumanValue();
            map.put(timeSlotHumanValue, new RealmObjectProxy.CacheData(i, timeSlotHumanValue2));
        } else if (i >= cacheData.minDepth) {
            return (TimeSlotHumanValue) cacheData.object;
        } else {
            cacheData.minDepth = i;
            timeSlotHumanValue2 = (TimeSlotHumanValue) cacheData.object;
        }
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface = timeSlotHumanValue2;
        C4761x4fbeca50 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface2 = timeSlotHumanValue;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$weekDay(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface2.realmGet$weekDay());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$date(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface2.realmGet$date());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface.realmSet$time(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxyinterface2.realmGet$time());
        return timeSlotHumanValue2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TimeSlotHumanValue = proxy[");
        sb.append("{weekDay:");
        String str = "null";
        sb.append(realmGet$weekDay() != null ? realmGet$weekDay() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{date:");
        sb.append(realmGet$date() != null ? realmGet$date() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{time:");
        if (realmGet$time() != null) {
            str = realmGet$time();
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
        C4760xfaafb8e9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxy = (C4760xfaafb8e9) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanvaluerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
