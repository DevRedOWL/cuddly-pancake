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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDetail;
import p046io.realm.BaseRealm;
import p046io.realm.C4804xd885bb4;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDetailRealmProxy */
public class C4806xa0f8f737 extends TicketDetail implements RealmObjectProxy, C4807xe35bc3c2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketDetailColumnInfo columnInfo;
    private RealmList<TicketDescription> descriptionsRealmList;
    private ProxyState<TicketDetail> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDetailRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketDetail";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDetailRealmProxy$TicketDetailColumnInfo */
    static final class TicketDetailColumnInfo extends ColumnInfo {
        long dateTitleIndex;
        long descriptionsIndex;
        long maxColumnIndexValue;
        long measureIndex;
        long paidIndex;
        long receiptsNumberIndex;
        long sumIndex;

        TicketDetailColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.receiptsNumberIndex = addColumnDetails("receiptsNumber", "receiptsNumber", objectSchemaInfo);
            this.paidIndex = addColumnDetails("paid", "paid", objectSchemaInfo);
            this.dateTitleIndex = addColumnDetails("dateTitle", "dateTitle", objectSchemaInfo);
            this.descriptionsIndex = addColumnDetails("descriptions", "descriptions", objectSchemaInfo);
            this.sumIndex = addColumnDetails("sum", "sum", objectSchemaInfo);
            this.measureIndex = addColumnDetails("measure", "measure", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketDetailColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketDetailColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketDetailColumnInfo ticketDetailColumnInfo = (TicketDetailColumnInfo) columnInfo;
            TicketDetailColumnInfo ticketDetailColumnInfo2 = (TicketDetailColumnInfo) columnInfo2;
            ticketDetailColumnInfo2.receiptsNumberIndex = ticketDetailColumnInfo.receiptsNumberIndex;
            ticketDetailColumnInfo2.paidIndex = ticketDetailColumnInfo.paidIndex;
            ticketDetailColumnInfo2.dateTitleIndex = ticketDetailColumnInfo.dateTitleIndex;
            ticketDetailColumnInfo2.descriptionsIndex = ticketDetailColumnInfo.descriptionsIndex;
            ticketDetailColumnInfo2.sumIndex = ticketDetailColumnInfo.sumIndex;
            ticketDetailColumnInfo2.measureIndex = ticketDetailColumnInfo.measureIndex;
            ticketDetailColumnInfo2.maxColumnIndexValue = ticketDetailColumnInfo.maxColumnIndexValue;
        }
    }

    C4806xa0f8f737() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketDetailColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$receiptsNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.receiptsNumberIndex);
    }

    public void realmSet$receiptsNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.receiptsNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.receiptsNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.receiptsNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.receiptsNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$paid() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.paidIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.paidIndex));
    }

    public void realmSet$paid(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.paidIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.paidIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.paidIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.paidIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$dateTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dateTitleIndex);
    }

    public void realmSet$dateTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dateTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dateTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dateTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dateTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<TicketDescription> realmGet$descriptions() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<TicketDescription> realmList = this.descriptionsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.descriptionsRealmList = new RealmList<>(TicketDescription.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.descriptionsIndex), this.proxyState.getRealm$realm());
        return this.descriptionsRealmList;
    }

    public void realmSet$descriptions(RealmList<TicketDescription> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("descriptions")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<TicketDescription> realmList2 = new RealmList<>();
                Iterator<TicketDescription> it = realmList.iterator();
                while (it.hasNext()) {
                    TicketDescription next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.descriptionsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    TicketDescription ticketDescription = realmList.get(i);
                    this.proxyState.checkValidObject(ticketDescription);
                    modelList.addRow(((RealmObjectProxy) ticketDescription).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            TicketDescription ticketDescription2 = realmList.get(i);
            this.proxyState.checkValidObject(ticketDescription2);
            modelList.setRow((long) i, ((RealmObjectProxy) ticketDescription2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Double realmGet$sum() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.sumIndex)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.sumIndex));
    }

    public void realmSet$sum(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sumIndex);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.sumIndex, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.sumIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.sumIndex, row$realm.getIndex(), d.doubleValue(), true);
            }
        }
    }

    public String realmGet$measure() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.measureIndex);
    }

    public void realmSet$measure(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.measureIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.measureIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.measureIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.measureIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("receiptsNumber", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("paid", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("dateTitle", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("descriptions", RealmFieldType.LIST, C4804xd885bb4.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("sum", RealmFieldType.DOUBLE, false, false, false);
        builder3.addPersistedProperty("measure", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketDetailColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketDetailColumnInfo(osSchemaInfo);
    }

    public static TicketDetail createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("descriptions")) {
            arrayList.add("descriptions");
        }
        TicketDetail ticketDetail = (TicketDetail) realm.createObjectInternal(TicketDetail.class, true, arrayList);
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail;
        if (jSONObject.has("receiptsNumber")) {
            if (jSONObject.isNull("receiptsNumber")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$receiptsNumber((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$receiptsNumber(jSONObject.getString("receiptsNumber"));
            }
        }
        if (jSONObject.has("paid")) {
            if (jSONObject.isNull("paid")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$paid((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$paid(Integer.valueOf(jSONObject.getInt("paid")));
            }
        }
        if (jSONObject.has("dateTitle")) {
            if (jSONObject.isNull("dateTitle")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$dateTitle((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$dateTitle(jSONObject.getString("dateTitle"));
            }
        }
        if (jSONObject.has("descriptions")) {
            if (jSONObject.isNull("descriptions")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$descriptions((RealmList<TicketDescription>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("descriptions");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions().add(C4804xd885bb4.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("sum")) {
            if (jSONObject.isNull("sum")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$sum((Double) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$sum(Double.valueOf(jSONObject.getDouble("sum")));
            }
        }
        if (jSONObject.has("measure")) {
            if (jSONObject.isNull("measure")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$measure((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$measure(jSONObject.getString("measure"));
            }
        }
        return ticketDetail;
    }

    public static TicketDetail createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketDetail ticketDetail = new TicketDetail();
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("receiptsNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$receiptsNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$receiptsNumber((String) null);
                }
            } else if (nextName.equals("paid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$paid(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$paid((Integer) null);
                }
            } else if (nextName.equals("dateTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$dateTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$dateTitle((String) null);
                }
            } else if (nextName.equals("descriptions")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$descriptions((RealmList<TicketDescription>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$descriptions(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions().add(C4804xd885bb4.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("sum")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$sum(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$sum((Double) null);
                }
            } else if (!nextName.equals("measure")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$measure(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$measure((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketDetail) realm.copyToRealm(ticketDetail, new ImportFlag[0]);
    }

    private static C4806xa0f8f737 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDetail.class), false, Collections.emptyList());
        C4806xa0f8f737 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxy = new C4806xa0f8f737();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxy;
    }

    public static TicketDetail copyOrUpdate(Realm realm, TicketDetailColumnInfo ticketDetailColumnInfo, TicketDetail ticketDetail, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketDetail instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDetail;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketDetail;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketDetail);
        if (realmObjectProxy2 != null) {
            return (TicketDetail) realmObjectProxy2;
        }
        return copy(realm, ticketDetailColumnInfo, ticketDetail, z, map, set);
    }

    public static TicketDetail copy(Realm realm, TicketDetailColumnInfo ticketDetailColumnInfo, TicketDetail ticketDetail, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketDetail);
        if (realmObjectProxy != null) {
            return (TicketDetail) realmObjectProxy;
        }
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketDetail.class), ticketDetailColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketDetailColumnInfo.receiptsNumberIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$receiptsNumber());
        osObjectBuilder.addInteger(ticketDetailColumnInfo.paidIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$paid());
        osObjectBuilder.addString(ticketDetailColumnInfo.dateTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$dateTitle());
        osObjectBuilder.addDouble(ticketDetailColumnInfo.sumIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$sum());
        osObjectBuilder.addString(ticketDetailColumnInfo.measureIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$measure());
        C4806xa0f8f737 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketDetail, newProxyInstance);
        RealmList<TicketDescription> realmGet$descriptions = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions();
        if (realmGet$descriptions != null) {
            RealmList<TicketDescription> realmGet$descriptions2 = newProxyInstance.realmGet$descriptions();
            realmGet$descriptions2.clear();
            for (int i = 0; i < realmGet$descriptions.size(); i++) {
                TicketDescription ticketDescription = realmGet$descriptions.get(i);
                TicketDescription ticketDescription2 = (TicketDescription) map.get(ticketDescription);
                if (ticketDescription2 != null) {
                    realmGet$descriptions2.add(ticketDescription2);
                } else {
                    realmGet$descriptions2.add(C4804xd885bb4.copyOrUpdate(realm, (C4804xd885bb4.TicketDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class), ticketDescription, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketDetail ticketDetail, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        TicketDetail ticketDetail2 = ticketDetail;
        Map<RealmModel, Long> map2 = map;
        if (ticketDetail2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDetail2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TicketDetail.class);
        long nativePtr = table.getNativePtr();
        TicketDetailColumnInfo ticketDetailColumnInfo = (TicketDetailColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDetail.class);
        long createRow = OsObject.createRow(table);
        map2.put(ticketDetail2, Long.valueOf(createRow));
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail2;
        String realmGet$receiptsNumber = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$receiptsNumber();
        if (realmGet$receiptsNumber != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, ticketDetailColumnInfo.receiptsNumberIndex, createRow, realmGet$receiptsNumber, false);
        } else {
            j = createRow;
        }
        Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$paid();
        if (realmGet$paid != null) {
            Table.nativeSetLong(nativePtr, ticketDetailColumnInfo.paidIndex, j, realmGet$paid.longValue(), false);
        }
        String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$dateTitle();
        if (realmGet$dateTitle != null) {
            Table.nativeSetString(nativePtr, ticketDetailColumnInfo.dateTitleIndex, j, realmGet$dateTitle, false);
        }
        RealmList<TicketDescription> realmGet$descriptions = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions();
        if (realmGet$descriptions != null) {
            j2 = j;
            OsList osList = new OsList(table.getUncheckedRow(j2), ticketDetailColumnInfo.descriptionsIndex);
            Iterator<TicketDescription> it = realmGet$descriptions.iterator();
            while (it.hasNext()) {
                TicketDescription next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(C4804xd885bb4.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        } else {
            j2 = j;
        }
        Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$sum();
        if (realmGet$sum != null) {
            j3 = j2;
            Table.nativeSetDouble(nativePtr, ticketDetailColumnInfo.sumIndex, j2, realmGet$sum.doubleValue(), false);
        } else {
            j3 = j2;
        }
        String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, ticketDetailColumnInfo.measureIndex, j3, realmGet$measure, false);
        }
        return j3;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TicketDetail.class);
        long nativePtr = table.getNativePtr();
        TicketDetailColumnInfo ticketDetailColumnInfo = (TicketDetailColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDetail.class);
        while (it.hasNext()) {
            TicketDetail ticketDetail = (TicketDetail) it.next();
            if (!map2.containsKey(ticketDetail)) {
                if (ticketDetail instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDetail;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketDetail, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketDetail, Long.valueOf(createRow));
                C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail;
                String realmGet$receiptsNumber = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$receiptsNumber();
                if (realmGet$receiptsNumber != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, ticketDetailColumnInfo.receiptsNumberIndex, createRow, realmGet$receiptsNumber, false);
                } else {
                    j = createRow;
                }
                Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$paid();
                if (realmGet$paid != null) {
                    Table.nativeSetLong(nativePtr, ticketDetailColumnInfo.paidIndex, j, realmGet$paid.longValue(), false);
                }
                String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$dateTitle();
                if (realmGet$dateTitle != null) {
                    Table.nativeSetString(nativePtr, ticketDetailColumnInfo.dateTitleIndex, j, realmGet$dateTitle, false);
                }
                RealmList<TicketDescription> realmGet$descriptions = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions();
                if (realmGet$descriptions != null) {
                    j2 = j;
                    OsList osList = new OsList(table.getUncheckedRow(j2), ticketDetailColumnInfo.descriptionsIndex);
                    Iterator<TicketDescription> it2 = realmGet$descriptions.iterator();
                    while (it2.hasNext()) {
                        TicketDescription next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4804xd885bb4.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j2 = j;
                }
                Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$sum();
                if (realmGet$sum != null) {
                    j3 = j2;
                    Table.nativeSetDouble(nativePtr, ticketDetailColumnInfo.sumIndex, j2, realmGet$sum.doubleValue(), false);
                } else {
                    j3 = j2;
                }
                String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, ticketDetailColumnInfo.measureIndex, j3, realmGet$measure, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketDetail ticketDetail, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        TicketDetail ticketDetail2 = ticketDetail;
        Map<RealmModel, Long> map2 = map;
        if (ticketDetail2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDetail2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TicketDetail.class);
        long nativePtr = table.getNativePtr();
        TicketDetailColumnInfo ticketDetailColumnInfo = (TicketDetailColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDetail.class);
        long createRow = OsObject.createRow(table);
        map2.put(ticketDetail2, Long.valueOf(createRow));
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail2;
        String realmGet$receiptsNumber = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$receiptsNumber();
        if (realmGet$receiptsNumber != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, ticketDetailColumnInfo.receiptsNumberIndex, createRow, realmGet$receiptsNumber, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.receiptsNumberIndex, j, false);
        }
        Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$paid();
        if (realmGet$paid != null) {
            Table.nativeSetLong(nativePtr, ticketDetailColumnInfo.paidIndex, j, realmGet$paid.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.paidIndex, j, false);
        }
        String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$dateTitle();
        if (realmGet$dateTitle != null) {
            Table.nativeSetString(nativePtr, ticketDetailColumnInfo.dateTitleIndex, j, realmGet$dateTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.dateTitleIndex, j, false);
        }
        long j4 = j;
        OsList osList = new OsList(table.getUncheckedRow(j4), ticketDetailColumnInfo.descriptionsIndex);
        RealmList<TicketDescription> realmGet$descriptions = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions();
        if (realmGet$descriptions == null || ((long) realmGet$descriptions.size()) != osList.size()) {
            j2 = j4;
            osList.removeAll();
            if (realmGet$descriptions != null) {
                Iterator<TicketDescription> it = realmGet$descriptions.iterator();
                while (it.hasNext()) {
                    TicketDescription next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4804xd885bb4.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$descriptions.size();
            int i = 0;
            while (i < size) {
                TicketDescription ticketDescription = realmGet$descriptions.get(i);
                Long l2 = map2.get(ticketDescription);
                if (l2 == null) {
                    l2 = Long.valueOf(C4804xd885bb4.insertOrUpdate(realm2, ticketDescription, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
                j4 = j4;
            }
            j2 = j4;
        }
        Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$sum();
        if (realmGet$sum != null) {
            j3 = j2;
            Table.nativeSetDouble(nativePtr, ticketDetailColumnInfo.sumIndex, j2, realmGet$sum.doubleValue(), false);
        } else {
            j3 = j2;
            Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.sumIndex, j3, false);
        }
        String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, ticketDetailColumnInfo.measureIndex, j3, realmGet$measure, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.measureIndex, j3, false);
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TicketDetail.class);
        long nativePtr = table.getNativePtr();
        TicketDetailColumnInfo ticketDetailColumnInfo = (TicketDetailColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDetail.class);
        while (it.hasNext()) {
            TicketDetail ticketDetail = (TicketDetail) it.next();
            if (!map2.containsKey(ticketDetail)) {
                if (ticketDetail instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDetail;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketDetail, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketDetail, Long.valueOf(createRow));
                C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail;
                String realmGet$receiptsNumber = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$receiptsNumber();
                if (realmGet$receiptsNumber != null) {
                    j = createRow;
                    Table.nativeSetString(nativePtr, ticketDetailColumnInfo.receiptsNumberIndex, createRow, realmGet$receiptsNumber, false);
                } else {
                    j = createRow;
                    Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.receiptsNumberIndex, j, false);
                }
                Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$paid();
                if (realmGet$paid != null) {
                    Table.nativeSetLong(nativePtr, ticketDetailColumnInfo.paidIndex, j, realmGet$paid.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.paidIndex, j, false);
                }
                String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$dateTitle();
                if (realmGet$dateTitle != null) {
                    Table.nativeSetString(nativePtr, ticketDetailColumnInfo.dateTitleIndex, j, realmGet$dateTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.dateTitleIndex, j, false);
                }
                long j4 = j;
                OsList osList = new OsList(table.getUncheckedRow(j4), ticketDetailColumnInfo.descriptionsIndex);
                RealmList<TicketDescription> realmGet$descriptions = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$descriptions();
                if (realmGet$descriptions == null || ((long) realmGet$descriptions.size()) != osList.size()) {
                    j2 = j4;
                    osList.removeAll();
                    if (realmGet$descriptions != null) {
                        Iterator<TicketDescription> it2 = realmGet$descriptions.iterator();
                        while (it2.hasNext()) {
                            TicketDescription next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4804xd885bb4.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$descriptions.size();
                    int i = 0;
                    while (i < size) {
                        TicketDescription ticketDescription = realmGet$descriptions.get(i);
                        Long l2 = map2.get(ticketDescription);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4804xd885bb4.insertOrUpdate(realm2, ticketDescription, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        j4 = j4;
                    }
                    j2 = j4;
                }
                Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$sum();
                if (realmGet$sum != null) {
                    j3 = j2;
                    Table.nativeSetDouble(nativePtr, ticketDetailColumnInfo.sumIndex, j2, realmGet$sum.doubleValue(), false);
                } else {
                    j3 = j2;
                    Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.sumIndex, j3, false);
                }
                String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, ticketDetailColumnInfo.measureIndex, j3, realmGet$measure, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDetailColumnInfo.measureIndex, j3, false);
                }
            }
        }
    }

    public static TicketDetail createDetachedCopy(TicketDetail ticketDetail, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketDetail ticketDetail2;
        if (i > i2 || ticketDetail == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketDetail);
        if (cacheData == null) {
            ticketDetail2 = new TicketDetail();
            map.put(ticketDetail, new RealmObjectProxy.CacheData(i, ticketDetail2));
        } else if (i >= cacheData.minDepth) {
            return (TicketDetail) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketDetail2 = (TicketDetail) cacheData.object;
        }
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface = ticketDetail2;
        C4807xe35bc3c2 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2 = ticketDetail;
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$receiptsNumber(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2.realmGet$receiptsNumber());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$paid(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2.realmGet$paid());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$dateTitle(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2.realmGet$dateTitle());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$descriptions((RealmList<TicketDescription>) null);
        } else {
            RealmList<TicketDescription> realmGet$descriptions = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2.realmGet$descriptions();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$descriptions(realmList);
            int i3 = i + 1;
            int size = realmGet$descriptions.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4804xd885bb4.createDetachedCopy(realmGet$descriptions.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$sum(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2.realmGet$sum());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface.realmSet$measure(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxyinterface2.realmGet$measure());
        return ticketDetail2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketDetail = proxy[");
        sb.append("{receiptsNumber:");
        String str = "null";
        sb.append(realmGet$receiptsNumber() != null ? realmGet$receiptsNumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{paid:");
        sb.append(realmGet$paid() != null ? realmGet$paid() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dateTitle:");
        sb.append(realmGet$dateTitle() != null ? realmGet$dateTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{descriptions:");
        sb.append("RealmList<TicketDescription>[");
        sb.append(realmGet$descriptions().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{sum:");
        sb.append(realmGet$sum() != null ? realmGet$sum() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{measure:");
        if (realmGet$measure() != null) {
            str = realmGet$measure();
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
        C4806xa0f8f737 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxy = (C4806xa0f8f737) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdetailrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
