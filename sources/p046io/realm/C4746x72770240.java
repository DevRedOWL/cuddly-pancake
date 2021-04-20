package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p046io.realm.BaseRealm;
import p046io.realm.C4794x165b0474;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoObjectRealmProxy */
public class C4746x72770240 extends RentInfoObject implements RealmObjectProxy, C4747x9e0f12d9 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Integer> childrensRealmList;
    private RentInfoObjectColumnInfo columnInfo;
    private RealmList<RentAttributes> desiredAttributesRealmList;
    private ProxyState<RentInfoObject> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoObjectRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentInfoObject";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentInfoObjectRealmProxy$RentInfoObjectColumnInfo */
    static final class RentInfoObjectColumnInfo extends ColumnInfo {
        long childrensIndex;
        long desiredAttributesIndex;
        long enterpriseIdIndex;
        long finishDateIndex;
        long maxColumnIndexValue;
        long startDateIndex;

        RentInfoObjectColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.startDateIndex = addColumnDetails("startDate", "startDate", objectSchemaInfo);
            this.finishDateIndex = addColumnDetails("finishDate", "finishDate", objectSchemaInfo);
            this.enterpriseIdIndex = addColumnDetails("enterpriseId", "enterpriseId", objectSchemaInfo);
            this.childrensIndex = addColumnDetails("childrens", "childrens", objectSchemaInfo);
            this.desiredAttributesIndex = addColumnDetails("desiredAttributes", "desiredAttributes", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentInfoObjectColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentInfoObjectColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentInfoObjectColumnInfo rentInfoObjectColumnInfo = (RentInfoObjectColumnInfo) columnInfo;
            RentInfoObjectColumnInfo rentInfoObjectColumnInfo2 = (RentInfoObjectColumnInfo) columnInfo2;
            rentInfoObjectColumnInfo2.startDateIndex = rentInfoObjectColumnInfo.startDateIndex;
            rentInfoObjectColumnInfo2.finishDateIndex = rentInfoObjectColumnInfo.finishDateIndex;
            rentInfoObjectColumnInfo2.enterpriseIdIndex = rentInfoObjectColumnInfo.enterpriseIdIndex;
            rentInfoObjectColumnInfo2.childrensIndex = rentInfoObjectColumnInfo.childrensIndex;
            rentInfoObjectColumnInfo2.desiredAttributesIndex = rentInfoObjectColumnInfo.desiredAttributesIndex;
            rentInfoObjectColumnInfo2.maxColumnIndexValue = rentInfoObjectColumnInfo.maxColumnIndexValue;
        }
    }

    C4746x72770240() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentInfoObjectColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$startDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.startDateIndex);
    }

    public void realmSet$startDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startDateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.startDateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.startDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.startDateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$finishDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.finishDateIndex);
    }

    public void realmSet$finishDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.finishDateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.finishDateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.finishDateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.finishDateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$enterpriseId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.enterpriseIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.enterpriseIdIndex));
    }

    public void realmSet$enterpriseId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.enterpriseIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.enterpriseIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.enterpriseIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.enterpriseIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public RealmList<Integer> realmGet$childrens() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Integer> realmList = this.childrensRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.childrensRealmList = new RealmList<>(Integer.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.childrensIndex, RealmFieldType.INTEGER_LIST), this.proxyState.getRealm$realm());
        return this.childrensRealmList;
    }

    public void realmSet$childrens(RealmList<Integer> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("childrens"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.childrensIndex, RealmFieldType.INTEGER_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<Integer> it = realmList.iterator();
                while (it.hasNext()) {
                    Integer next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addLong(next.longValue());
                    }
                }
            }
        }
    }

    public RealmList<RentAttributes> realmGet$desiredAttributes() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<RentAttributes> realmList = this.desiredAttributesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.desiredAttributesRealmList = new RealmList<>(RentAttributes.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.desiredAttributesIndex), this.proxyState.getRealm$realm());
        return this.desiredAttributesRealmList;
    }

    public void realmSet$desiredAttributes(RealmList<RentAttributes> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("desiredAttributes")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<RentAttributes> realmList2 = new RealmList<>();
                Iterator<RentAttributes> it = realmList.iterator();
                while (it.hasNext()) {
                    RentAttributes next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.desiredAttributesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    RentAttributes rentAttributes = realmList.get(i);
                    this.proxyState.checkValidObject(rentAttributes);
                    modelList.addRow(((RealmObjectProxy) rentAttributes).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            RentAttributes rentAttributes2 = realmList.get(i);
            this.proxyState.checkValidObject(rentAttributes2);
            modelList.setRow((long) i, ((RealmObjectProxy) rentAttributes2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("startDate", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("finishDate", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("enterpriseId", RealmFieldType.INTEGER, false, false, false);
        builder.addPersistedValueListProperty("childrens", RealmFieldType.INTEGER_LIST, false);
        builder.addPersistedLinkProperty("desiredAttributes", RealmFieldType.LIST, C4794x165b0474.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentInfoObjectColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentInfoObjectColumnInfo(osSchemaInfo);
    }

    public static RentInfoObject createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("childrens")) {
            arrayList.add("childrens");
        }
        if (jSONObject.has("desiredAttributes")) {
            arrayList.add("desiredAttributes");
        }
        RentInfoObject rentInfoObject = (RentInfoObject) realm.createObjectInternal(RentInfoObject.class, true, arrayList);
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject;
        if (jSONObject.has("startDate")) {
            if (jSONObject.isNull("startDate")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$startDate((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$startDate(jSONObject.getString("startDate"));
            }
        }
        if (jSONObject.has("finishDate")) {
            if (jSONObject.isNull("finishDate")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$finishDate((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$finishDate(jSONObject.getString("finishDate"));
            }
        }
        if (jSONObject.has("enterpriseId")) {
            if (jSONObject.isNull("enterpriseId")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$enterpriseId((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$enterpriseId(Integer.valueOf(jSONObject.getInt("enterpriseId")));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens(), jSONObject, "childrens");
        if (jSONObject.has("desiredAttributes")) {
            if (jSONObject.isNull("desiredAttributes")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$desiredAttributes((RealmList<RentAttributes>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("desiredAttributes");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes().add(C4794x165b0474.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return rentInfoObject;
    }

    public static RentInfoObject createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentInfoObject rentInfoObject = new RentInfoObject();
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("startDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$startDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$startDate((String) null);
                }
            } else if (nextName.equals("finishDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$finishDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$finishDate((String) null);
                }
            } else if (nextName.equals("enterpriseId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$enterpriseId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$enterpriseId((Integer) null);
                }
            } else if (nextName.equals("childrens")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$childrens(ProxyUtils.createRealmListWithJsonStream(Integer.class, jsonReader));
            } else if (!nextName.equals("desiredAttributes")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$desiredAttributes((RealmList<RentAttributes>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$desiredAttributes(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes().add(C4794x165b0474.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (RentInfoObject) realm.copyToRealm(rentInfoObject, new ImportFlag[0]);
    }

    private static C4746x72770240 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class), false, Collections.emptyList());
        C4746x72770240 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxy = new C4746x72770240();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxy;
    }

    public static RentInfoObject copyOrUpdate(Realm realm, RentInfoObjectColumnInfo rentInfoObjectColumnInfo, RentInfoObject rentInfoObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentInfoObject instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfoObject;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentInfoObject;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentInfoObject);
        if (realmObjectProxy2 != null) {
            return (RentInfoObject) realmObjectProxy2;
        }
        return copy(realm, rentInfoObjectColumnInfo, rentInfoObject, z, map, set);
    }

    public static RentInfoObject copy(Realm realm, RentInfoObjectColumnInfo rentInfoObjectColumnInfo, RentInfoObject rentInfoObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentInfoObject);
        if (realmObjectProxy != null) {
            return (RentInfoObject) realmObjectProxy;
        }
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentInfoObject.class), rentInfoObjectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentInfoObjectColumnInfo.startDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$startDate());
        osObjectBuilder.addString(rentInfoObjectColumnInfo.finishDateIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$finishDate());
        osObjectBuilder.addInteger(rentInfoObjectColumnInfo.enterpriseIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$enterpriseId());
        osObjectBuilder.addIntegerList(rentInfoObjectColumnInfo.childrensIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens());
        C4746x72770240 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentInfoObject, newProxyInstance);
        RealmList<RentAttributes> realmGet$desiredAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes();
        if (realmGet$desiredAttributes != null) {
            RealmList<RentAttributes> realmGet$desiredAttributes2 = newProxyInstance.realmGet$desiredAttributes();
            realmGet$desiredAttributes2.clear();
            for (int i = 0; i < realmGet$desiredAttributes.size(); i++) {
                RentAttributes rentAttributes = realmGet$desiredAttributes.get(i);
                RentAttributes rentAttributes2 = (RentAttributes) map.get(rentAttributes);
                if (rentAttributes2 != null) {
                    realmGet$desiredAttributes2.add(rentAttributes2);
                } else {
                    realmGet$desiredAttributes2.add(C4794x165b0474.copyOrUpdate(realm, (C4794x165b0474.RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class), rentAttributes, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentInfoObject rentInfoObject, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        RentInfoObject rentInfoObject2 = rentInfoObject;
        Map<RealmModel, Long> map2 = map;
        if (rentInfoObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfoObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentInfoObject.class);
        long nativePtr = table.getNativePtr();
        RentInfoObjectColumnInfo rentInfoObjectColumnInfo = (RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class);
        long createRow = OsObject.createRow(table);
        map2.put(rentInfoObject2, Long.valueOf(createRow));
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject2;
        String realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$startDate();
        if (realmGet$startDate != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.startDateIndex, createRow, realmGet$startDate, false);
        } else {
            j = createRow;
        }
        String realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$finishDate();
        if (realmGet$finishDate != null) {
            Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.finishDateIndex, j, realmGet$finishDate, false);
        }
        Integer realmGet$enterpriseId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$enterpriseId();
        if (realmGet$enterpriseId != null) {
            Table.nativeSetLong(nativePtr, rentInfoObjectColumnInfo.enterpriseIdIndex, j, realmGet$enterpriseId.longValue(), false);
        }
        RealmList<Integer> realmGet$childrens = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens();
        if (realmGet$childrens != null) {
            j2 = j;
            OsList osList = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.childrensIndex);
            Iterator<Integer> it = realmGet$childrens.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addLong(next.longValue());
                }
            }
        } else {
            j2 = j;
        }
        RealmList<RentAttributes> realmGet$desiredAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes();
        if (realmGet$desiredAttributes != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.desiredAttributesIndex);
            Iterator<RentAttributes> it2 = realmGet$desiredAttributes.iterator();
            while (it2.hasNext()) {
                RentAttributes next2 = it2.next();
                Long l = map2.get(next2);
                if (l == null) {
                    l = Long.valueOf(C4794x165b0474.insert(realm2, next2, map2));
                }
                osList2.addRow(l.longValue());
            }
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentInfoObject.class);
        long nativePtr = table.getNativePtr();
        RentInfoObjectColumnInfo rentInfoObjectColumnInfo = (RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class);
        while (it.hasNext()) {
            RentInfoObject rentInfoObject = (RentInfoObject) it.next();
            if (!map2.containsKey(rentInfoObject)) {
                if (rentInfoObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfoObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentInfoObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentInfoObject, Long.valueOf(createRow));
                C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject;
                String realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$startDate();
                if (realmGet$startDate != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.startDateIndex, createRow, realmGet$startDate, false);
                } else {
                    j = createRow;
                }
                String realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$finishDate();
                if (realmGet$finishDate != null) {
                    Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.finishDateIndex, j, realmGet$finishDate, false);
                }
                Integer realmGet$enterpriseId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$enterpriseId();
                if (realmGet$enterpriseId != null) {
                    Table.nativeSetLong(nativePtr, rentInfoObjectColumnInfo.enterpriseIdIndex, j, realmGet$enterpriseId.longValue(), false);
                }
                RealmList<Integer> realmGet$childrens = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens();
                if (realmGet$childrens != null) {
                    j2 = j;
                    OsList osList = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.childrensIndex);
                    Iterator<Integer> it2 = realmGet$childrens.iterator();
                    while (it2.hasNext()) {
                        Integer next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addLong(next.longValue());
                        }
                    }
                } else {
                    j2 = j;
                }
                RealmList<RentAttributes> realmGet$desiredAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes();
                if (realmGet$desiredAttributes != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.desiredAttributesIndex);
                    Iterator<RentAttributes> it3 = realmGet$desiredAttributes.iterator();
                    while (it3.hasNext()) {
                        RentAttributes next2 = it3.next();
                        Long l = map2.get(next2);
                        if (l == null) {
                            l = Long.valueOf(C4794x165b0474.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentInfoObject rentInfoObject, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        RentInfoObject rentInfoObject2 = rentInfoObject;
        Map<RealmModel, Long> map2 = map;
        if (rentInfoObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfoObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(RentInfoObject.class);
        long nativePtr = table.getNativePtr();
        RentInfoObjectColumnInfo rentInfoObjectColumnInfo = (RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class);
        long createRow = OsObject.createRow(table);
        map2.put(rentInfoObject2, Long.valueOf(createRow));
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject2;
        String realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$startDate();
        if (realmGet$startDate != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.startDateIndex, createRow, realmGet$startDate, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, rentInfoObjectColumnInfo.startDateIndex, j, false);
        }
        String realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$finishDate();
        if (realmGet$finishDate != null) {
            Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.finishDateIndex, j, realmGet$finishDate, false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoObjectColumnInfo.finishDateIndex, j, false);
        }
        Integer realmGet$enterpriseId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$enterpriseId();
        if (realmGet$enterpriseId != null) {
            Table.nativeSetLong(nativePtr, rentInfoObjectColumnInfo.enterpriseIdIndex, j, realmGet$enterpriseId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentInfoObjectColumnInfo.enterpriseIdIndex, j, false);
        }
        long j2 = j;
        OsList osList = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.childrensIndex);
        osList.removeAll();
        RealmList<Integer> realmGet$childrens = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens();
        if (realmGet$childrens != null) {
            Iterator<Integer> it = realmGet$childrens.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addLong(next.longValue());
                }
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.desiredAttributesIndex);
        RealmList<RentAttributes> realmGet$desiredAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes();
        if (realmGet$desiredAttributes == null || ((long) realmGet$desiredAttributes.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$desiredAttributes != null) {
                Iterator<RentAttributes> it2 = realmGet$desiredAttributes.iterator();
                while (it2.hasNext()) {
                    RentAttributes next2 = it2.next();
                    Long l = map2.get(next2);
                    if (l == null) {
                        l = Long.valueOf(C4794x165b0474.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$desiredAttributes.size();
            for (int i = 0; i < size; i++) {
                RentAttributes rentAttributes = realmGet$desiredAttributes.get(i);
                Long l2 = map2.get(rentAttributes);
                if (l2 == null) {
                    l2 = Long.valueOf(C4794x165b0474.insertOrUpdate(realm2, rentAttributes, map2));
                }
                osList2.setRow((long) i, l2.longValue());
            }
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(RentInfoObject.class);
        long nativePtr = table.getNativePtr();
        RentInfoObjectColumnInfo rentInfoObjectColumnInfo = (RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class);
        while (it.hasNext()) {
            RentInfoObject rentInfoObject = (RentInfoObject) it.next();
            if (!map2.containsKey(rentInfoObject)) {
                if (rentInfoObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentInfoObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentInfoObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentInfoObject, Long.valueOf(createRow));
                C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject;
                String realmGet$startDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$startDate();
                if (realmGet$startDate != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.startDateIndex, createRow, realmGet$startDate, false);
                } else {
                    j = createRow;
                    Table.nativeSetNull(nativePtr, rentInfoObjectColumnInfo.startDateIndex, j, false);
                }
                String realmGet$finishDate = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$finishDate();
                if (realmGet$finishDate != null) {
                    Table.nativeSetString(nativePtr, rentInfoObjectColumnInfo.finishDateIndex, j, realmGet$finishDate, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoObjectColumnInfo.finishDateIndex, j, false);
                }
                Integer realmGet$enterpriseId = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$enterpriseId();
                if (realmGet$enterpriseId != null) {
                    Table.nativeSetLong(nativePtr, rentInfoObjectColumnInfo.enterpriseIdIndex, j, realmGet$enterpriseId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentInfoObjectColumnInfo.enterpriseIdIndex, j, false);
                }
                long j2 = j;
                OsList osList = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.childrensIndex);
                osList.removeAll();
                RealmList<Integer> realmGet$childrens = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens();
                if (realmGet$childrens != null) {
                    Iterator<Integer> it2 = realmGet$childrens.iterator();
                    while (it2.hasNext()) {
                        Integer next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addLong(next.longValue());
                        }
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j2), rentInfoObjectColumnInfo.desiredAttributesIndex);
                RealmList<RentAttributes> realmGet$desiredAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$desiredAttributes();
                if (realmGet$desiredAttributes == null || ((long) realmGet$desiredAttributes.size()) != osList2.size()) {
                    osList2.removeAll();
                    if (realmGet$desiredAttributes != null) {
                        Iterator<RentAttributes> it3 = realmGet$desiredAttributes.iterator();
                        while (it3.hasNext()) {
                            RentAttributes next2 = it3.next();
                            Long l = map2.get(next2);
                            if (l == null) {
                                l = Long.valueOf(C4794x165b0474.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$desiredAttributes.size();
                    for (int i = 0; i < size; i++) {
                        RentAttributes rentAttributes = realmGet$desiredAttributes.get(i);
                        Long l2 = map2.get(rentAttributes);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4794x165b0474.insertOrUpdate(realm2, rentAttributes, map2));
                        }
                        osList2.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static RentInfoObject createDetachedCopy(RentInfoObject rentInfoObject, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentInfoObject rentInfoObject2;
        if (i > i2 || rentInfoObject == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentInfoObject);
        if (cacheData == null) {
            rentInfoObject2 = new RentInfoObject();
            map.put(rentInfoObject, new RealmObjectProxy.CacheData(i, rentInfoObject2));
        } else if (i >= cacheData.minDepth) {
            return (RentInfoObject) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentInfoObject2 = (RentInfoObject) cacheData.object;
        }
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface = rentInfoObject2;
        C4747x9e0f12d9 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface2 = rentInfoObject;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$startDate(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface2.realmGet$startDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$finishDate(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface2.realmGet$finishDate());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$enterpriseId(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface2.realmGet$enterpriseId());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$childrens(new RealmList());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmGet$childrens().addAll(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface2.realmGet$childrens());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$desiredAttributes((RealmList<RentAttributes>) null);
        } else {
            RealmList<RentAttributes> realmGet$desiredAttributes = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface2.realmGet$desiredAttributes();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxyinterface.realmSet$desiredAttributes(realmList);
            int i3 = i + 1;
            int size = realmGet$desiredAttributes.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4794x165b0474.createDetachedCopy(realmGet$desiredAttributes.get(i4), i3, i2, map));
            }
        }
        return rentInfoObject2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentInfoObject = proxy[");
        sb.append("{startDate:");
        Object obj = "null";
        sb.append(realmGet$startDate() != null ? realmGet$startDate() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{finishDate:");
        sb.append(realmGet$finishDate() != null ? realmGet$finishDate() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{enterpriseId:");
        Object obj2 = obj;
        if (realmGet$enterpriseId() != null) {
            obj2 = realmGet$enterpriseId();
        }
        sb.append(obj2);
        sb.append("}");
        sb.append(",");
        sb.append("{childrens:");
        sb.append("RealmList<Integer>[");
        sb.append(realmGet$childrens().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{desiredAttributes:");
        sb.append("RealmList<RentAttributes>[");
        sb.append(realmGet$desiredAttributes().size());
        sb.append("]");
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
        C4746x72770240 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxy = (C4746x72770240) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentinfoobjectrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
