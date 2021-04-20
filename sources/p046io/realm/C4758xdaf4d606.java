package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHuman;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeSlotHumanValue;
import p046io.realm.BaseRealm;
import p046io.realm.C4760xfaafb8e9;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanRealmProxy */
public class C4758xdaf4d606 extends TimeSlotHuman implements RealmObjectProxy, C4759xeb3c1dd3 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TimeSlotHumanColumnInfo columnInfo;
    private ProxyState<TimeSlotHuman> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TimeSlotHuman";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_TimeSlotHumanRealmProxy$TimeSlotHumanColumnInfo */
    static final class TimeSlotHumanColumnInfo extends ColumnInfo {
        long finishValueIndex;
        long maxColumnIndexValue;
        long startValueIndex;

        TimeSlotHumanColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.startValueIndex = addColumnDetails("startValue", "startValue", objectSchemaInfo);
            this.finishValueIndex = addColumnDetails("finishValue", "finishValue", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TimeSlotHumanColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TimeSlotHumanColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TimeSlotHumanColumnInfo timeSlotHumanColumnInfo = (TimeSlotHumanColumnInfo) columnInfo;
            TimeSlotHumanColumnInfo timeSlotHumanColumnInfo2 = (TimeSlotHumanColumnInfo) columnInfo2;
            timeSlotHumanColumnInfo2.startValueIndex = timeSlotHumanColumnInfo.startValueIndex;
            timeSlotHumanColumnInfo2.finishValueIndex = timeSlotHumanColumnInfo.finishValueIndex;
            timeSlotHumanColumnInfo2.maxColumnIndexValue = timeSlotHumanColumnInfo.maxColumnIndexValue;
        }
    }

    C4758xdaf4d606() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TimeSlotHumanColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public TimeSlotHumanValue realmGet$startValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.startValueIndex)) {
            return null;
        }
        return (TimeSlotHumanValue) this.proxyState.getRealm$realm().get(TimeSlotHumanValue.class, this.proxyState.getRow$realm().getLink(this.columnInfo.startValueIndex), false, Collections.emptyList());
    }

    public void realmSet$startValue(TimeSlotHumanValue timeSlotHumanValue) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (timeSlotHumanValue == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.startValueIndex);
                return;
            }
            this.proxyState.checkValidObject(timeSlotHumanValue);
            this.proxyState.getRow$realm().setLink(this.columnInfo.startValueIndex, ((RealmObjectProxy) timeSlotHumanValue).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("startValue")) {
            if (timeSlotHumanValue != null && !RealmObject.isManaged(timeSlotHumanValue)) {
                timeSlotHumanValue = (TimeSlotHumanValue) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(timeSlotHumanValue, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (timeSlotHumanValue == null) {
                row$realm.nullifyLink(this.columnInfo.startValueIndex);
                return;
            }
            this.proxyState.checkValidObject(timeSlotHumanValue);
            row$realm.getTable().setLink(this.columnInfo.startValueIndex, row$realm.getIndex(), ((RealmObjectProxy) timeSlotHumanValue).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TimeSlotHumanValue realmGet$finishValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.finishValueIndex)) {
            return null;
        }
        return (TimeSlotHumanValue) this.proxyState.getRealm$realm().get(TimeSlotHumanValue.class, this.proxyState.getRow$realm().getLink(this.columnInfo.finishValueIndex), false, Collections.emptyList());
    }

    public void realmSet$finishValue(TimeSlotHumanValue timeSlotHumanValue) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (timeSlotHumanValue == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.finishValueIndex);
                return;
            }
            this.proxyState.checkValidObject(timeSlotHumanValue);
            this.proxyState.getRow$realm().setLink(this.columnInfo.finishValueIndex, ((RealmObjectProxy) timeSlotHumanValue).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("finishValue")) {
            if (timeSlotHumanValue != null && !RealmObject.isManaged(timeSlotHumanValue)) {
                timeSlotHumanValue = (TimeSlotHumanValue) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(timeSlotHumanValue, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (timeSlotHumanValue == null) {
                row$realm.nullifyLink(this.columnInfo.finishValueIndex);
                return;
            }
            this.proxyState.checkValidObject(timeSlotHumanValue);
            row$realm.getTable().setLink(this.columnInfo.finishValueIndex, row$realm.getIndex(), ((RealmObjectProxy) timeSlotHumanValue).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedLinkProperty("startValue", RealmFieldType.OBJECT, C4760xfaafb8e9.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("finishValue", RealmFieldType.OBJECT, C4760xfaafb8e9.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TimeSlotHumanColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TimeSlotHumanColumnInfo(osSchemaInfo);
    }

    public static TimeSlotHuman createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("startValue")) {
            arrayList.add("startValue");
        }
        if (jSONObject.has("finishValue")) {
            arrayList.add("finishValue");
        }
        TimeSlotHuman timeSlotHuman = (TimeSlotHuman) realm.createObjectInternal(TimeSlotHuman.class, true, arrayList);
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman;
        if (jSONObject.has("startValue")) {
            if (jSONObject.isNull("startValue")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$startValue((TimeSlotHumanValue) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$startValue(C4760xfaafb8e9.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("startValue"), z));
            }
        }
        if (jSONObject.has("finishValue")) {
            if (jSONObject.isNull("finishValue")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$finishValue((TimeSlotHumanValue) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$finishValue(C4760xfaafb8e9.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("finishValue"), z));
            }
        }
        return timeSlotHuman;
    }

    public static TimeSlotHuman createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TimeSlotHuman timeSlotHuman = new TimeSlotHuman();
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("startValue")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$startValue((TimeSlotHumanValue) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$startValue(C4760xfaafb8e9.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("finishValue")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$finishValue((TimeSlotHumanValue) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$finishValue(C4760xfaafb8e9.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (TimeSlotHuman) realm.copyToRealm(timeSlotHuman, new ImportFlag[0]);
    }

    private static C4758xdaf4d606 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class), false, Collections.emptyList());
        C4758xdaf4d606 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxy = new C4758xdaf4d606();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxy;
    }

    public static TimeSlotHuman copyOrUpdate(Realm realm, TimeSlotHumanColumnInfo timeSlotHumanColumnInfo, TimeSlotHuman timeSlotHuman, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (timeSlotHuman instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHuman;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return timeSlotHuman;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(timeSlotHuman);
        if (realmObjectProxy2 != null) {
            return (TimeSlotHuman) realmObjectProxy2;
        }
        return copy(realm, timeSlotHumanColumnInfo, timeSlotHuman, z, map, set);
    }

    public static TimeSlotHuman copy(Realm realm, TimeSlotHumanColumnInfo timeSlotHumanColumnInfo, TimeSlotHuman timeSlotHuman, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(timeSlotHuman);
        if (realmObjectProxy != null) {
            return (TimeSlotHuman) realmObjectProxy;
        }
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman;
        C4758xdaf4d606 newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(TimeSlotHuman.class), timeSlotHumanColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(timeSlotHuman, newProxyInstance);
        TimeSlotHumanValue realmGet$startValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$startValue();
        if (realmGet$startValue == null) {
            newProxyInstance.realmSet$startValue((TimeSlotHumanValue) null);
        } else {
            TimeSlotHumanValue timeSlotHumanValue = (TimeSlotHumanValue) map.get(realmGet$startValue);
            if (timeSlotHumanValue != null) {
                newProxyInstance.realmSet$startValue(timeSlotHumanValue);
            } else {
                newProxyInstance.realmSet$startValue(C4760xfaafb8e9.copyOrUpdate(realm, (C4760xfaafb8e9.TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class), realmGet$startValue, z, map, set));
            }
        }
        TimeSlotHumanValue realmGet$finishValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$finishValue();
        if (realmGet$finishValue == null) {
            newProxyInstance.realmSet$finishValue((TimeSlotHumanValue) null);
        } else {
            TimeSlotHumanValue timeSlotHumanValue2 = (TimeSlotHumanValue) map.get(realmGet$finishValue);
            if (timeSlotHumanValue2 != null) {
                newProxyInstance.realmSet$finishValue(timeSlotHumanValue2);
            } else {
                newProxyInstance.realmSet$finishValue(C4760xfaafb8e9.copyOrUpdate(realm, (C4760xfaafb8e9.TimeSlotHumanValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHumanValue.class), realmGet$finishValue, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, TimeSlotHuman timeSlotHuman, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        TimeSlotHuman timeSlotHuman2 = timeSlotHuman;
        Map<RealmModel, Long> map2 = map;
        if (timeSlotHuman2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHuman2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TimeSlotHuman.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanColumnInfo timeSlotHumanColumnInfo = (TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class);
        long createRow = OsObject.createRow(table);
        map2.put(timeSlotHuman2, Long.valueOf(createRow));
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman2;
        TimeSlotHumanValue realmGet$startValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$startValue();
        if (realmGet$startValue != null) {
            Long l = map2.get(realmGet$startValue);
            if (l == null) {
                l = Long.valueOf(C4760xfaafb8e9.insert(realm2, realmGet$startValue, map2));
            }
            Table.nativeSetLink(nativePtr, timeSlotHumanColumnInfo.startValueIndex, createRow, l.longValue(), false);
        }
        TimeSlotHumanValue realmGet$finishValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$finishValue();
        if (realmGet$finishValue != null) {
            Long l2 = map2.get(realmGet$finishValue);
            if (l2 == null) {
                l2 = Long.valueOf(C4760xfaafb8e9.insert(realm2, realmGet$finishValue, map2));
            }
            Table.nativeSetLink(nativePtr, timeSlotHumanColumnInfo.finishValueIndex, createRow, l2.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TimeSlotHuman.class);
        table.getNativePtr();
        TimeSlotHumanColumnInfo timeSlotHumanColumnInfo = (TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class);
        while (it.hasNext()) {
            TimeSlotHuman timeSlotHuman = (TimeSlotHuman) it.next();
            if (!map.containsKey(timeSlotHuman)) {
                if (timeSlotHuman instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHuman;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(timeSlotHuman, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(timeSlotHuman, Long.valueOf(createRow));
                C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman;
                TimeSlotHumanValue realmGet$startValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$startValue();
                if (realmGet$startValue != null) {
                    Long l = map.get(realmGet$startValue);
                    if (l == null) {
                        l = Long.valueOf(C4760xfaafb8e9.insert(realm, realmGet$startValue, map));
                    }
                    table.setLink(timeSlotHumanColumnInfo.startValueIndex, createRow, l.longValue(), false);
                }
                TimeSlotHumanValue realmGet$finishValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$finishValue();
                if (realmGet$finishValue != null) {
                    Long l2 = map.get(realmGet$finishValue);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4760xfaafb8e9.insert(realm, realmGet$finishValue, map));
                    }
                    table.setLink(timeSlotHumanColumnInfo.finishValueIndex, createRow, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TimeSlotHuman timeSlotHuman, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        TimeSlotHuman timeSlotHuman2 = timeSlotHuman;
        Map<RealmModel, Long> map2 = map;
        if (timeSlotHuman2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHuman2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TimeSlotHuman.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanColumnInfo timeSlotHumanColumnInfo = (TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class);
        long createRow = OsObject.createRow(table);
        map2.put(timeSlotHuman2, Long.valueOf(createRow));
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman2;
        TimeSlotHumanValue realmGet$startValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$startValue();
        if (realmGet$startValue != null) {
            Long l = map2.get(realmGet$startValue);
            if (l == null) {
                l = Long.valueOf(C4760xfaafb8e9.insertOrUpdate(realm2, realmGet$startValue, map2));
            }
            Table.nativeSetLink(nativePtr, timeSlotHumanColumnInfo.startValueIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, timeSlotHumanColumnInfo.startValueIndex, createRow);
        }
        TimeSlotHumanValue realmGet$finishValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$finishValue();
        if (realmGet$finishValue != null) {
            Long l2 = map2.get(realmGet$finishValue);
            if (l2 == null) {
                l2 = Long.valueOf(C4760xfaafb8e9.insertOrUpdate(realm2, realmGet$finishValue, map2));
            }
            Table.nativeSetLink(nativePtr, timeSlotHumanColumnInfo.finishValueIndex, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, timeSlotHumanColumnInfo.finishValueIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TimeSlotHuman.class);
        long nativePtr = table.getNativePtr();
        TimeSlotHumanColumnInfo timeSlotHumanColumnInfo = (TimeSlotHumanColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TimeSlotHuman.class);
        while (it.hasNext()) {
            TimeSlotHuman timeSlotHuman = (TimeSlotHuman) it.next();
            if (!map2.containsKey(timeSlotHuman)) {
                if (timeSlotHuman instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) timeSlotHuman;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(timeSlotHuman, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(timeSlotHuman, Long.valueOf(createRow));
                C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman;
                TimeSlotHumanValue realmGet$startValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$startValue();
                if (realmGet$startValue != null) {
                    Long l = map2.get(realmGet$startValue);
                    if (l == null) {
                        l = Long.valueOf(C4760xfaafb8e9.insertOrUpdate(realm2, realmGet$startValue, map2));
                    }
                    Table.nativeSetLink(nativePtr, timeSlotHumanColumnInfo.startValueIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, timeSlotHumanColumnInfo.startValueIndex, createRow);
                }
                TimeSlotHumanValue realmGet$finishValue = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmGet$finishValue();
                if (realmGet$finishValue != null) {
                    Long l2 = map2.get(realmGet$finishValue);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4760xfaafb8e9.insertOrUpdate(realm2, realmGet$finishValue, map2));
                    }
                    Table.nativeSetLink(nativePtr, timeSlotHumanColumnInfo.finishValueIndex, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, timeSlotHumanColumnInfo.finishValueIndex, createRow);
                }
            }
        }
    }

    public static TimeSlotHuman createDetachedCopy(TimeSlotHuman timeSlotHuman, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TimeSlotHuman timeSlotHuman2;
        if (i > i2 || timeSlotHuman == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(timeSlotHuman);
        if (cacheData == null) {
            timeSlotHuman2 = new TimeSlotHuman();
            map.put(timeSlotHuman, new RealmObjectProxy.CacheData(i, timeSlotHuman2));
        } else if (i >= cacheData.minDepth) {
            return (TimeSlotHuman) cacheData.object;
        } else {
            cacheData.minDepth = i;
            timeSlotHuman2 = (TimeSlotHuman) cacheData.object;
        }
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface = timeSlotHuman2;
        C4759xeb3c1dd3 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface2 = timeSlotHuman;
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$startValue(C4760xfaafb8e9.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface2.realmGet$startValue(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface.realmSet$finishValue(C4760xfaafb8e9.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxyinterface2.realmGet$finishValue(), i3, i2, map));
        return timeSlotHuman2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TimeSlotHuman = proxy[");
        sb.append("{startValue:");
        TimeSlotHumanValue realmGet$startValue = realmGet$startValue();
        String str = C4760xfaafb8e9.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(realmGet$startValue != null ? str : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{finishValue:");
        if (realmGet$finishValue() == null) {
            str = "null";
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
        C4758xdaf4d606 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxy = (C4758xdaf4d606) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_timeslothumanrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
