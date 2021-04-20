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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.Ticket;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketRealmProxy */
public class C4808x39dc6d46 extends Ticket implements RealmObjectProxy, C4809xc44aae93 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketColumnInfo columnInfo;
    private ProxyState<Ticket> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Ticket";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketRealmProxy$TicketColumnInfo */
    static final class TicketColumnInfo extends ColumnInfo {
        long accountIndex;
        long dateTitleIndex;
        long idIndex;
        long maxColumnIndexValue;
        long measureIndex;
        long paidIndex;
        long sumIndex;

        TicketColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.dateTitleIndex = addColumnDetails("dateTitle", "dateTitle", objectSchemaInfo);
            this.sumIndex = addColumnDetails("sum", "sum", objectSchemaInfo);
            this.measureIndex = addColumnDetails("measure", "measure", objectSchemaInfo);
            this.paidIndex = addColumnDetails("paid", "paid", objectSchemaInfo);
            this.accountIndex = addColumnDetails("account", "account", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketColumnInfo ticketColumnInfo = (TicketColumnInfo) columnInfo;
            TicketColumnInfo ticketColumnInfo2 = (TicketColumnInfo) columnInfo2;
            ticketColumnInfo2.idIndex = ticketColumnInfo.idIndex;
            ticketColumnInfo2.dateTitleIndex = ticketColumnInfo.dateTitleIndex;
            ticketColumnInfo2.sumIndex = ticketColumnInfo.sumIndex;
            ticketColumnInfo2.measureIndex = ticketColumnInfo.measureIndex;
            ticketColumnInfo2.paidIndex = ticketColumnInfo.paidIndex;
            ticketColumnInfo2.accountIndex = ticketColumnInfo.accountIndex;
            ticketColumnInfo2.maxColumnIndexValue = ticketColumnInfo.maxColumnIndexValue;
        }
    }

    C4808x39dc6d46() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketColumnInfo) realmObjectContext.getColumnInfo();
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
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
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

    public Integer realmGet$account() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.accountIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.accountIndex));
    }

    public void realmSet$account(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.accountIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.accountIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.accountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.accountIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("dateTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sum", RealmFieldType.DOUBLE, false, false, false);
        builder2.addPersistedProperty("measure", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("paid", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("account", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketColumnInfo(osSchemaInfo);
    }

    public static Ticket createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Ticket ticket = (Ticket) realm.createObjectInternal(Ticket.class, true, Collections.emptyList());
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("dateTitle")) {
            if (jSONObject.isNull("dateTitle")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$dateTitle((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$dateTitle(jSONObject.getString("dateTitle"));
            }
        }
        if (jSONObject.has("sum")) {
            if (jSONObject.isNull("sum")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$sum((Double) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$sum(Double.valueOf(jSONObject.getDouble("sum")));
            }
        }
        if (jSONObject.has("measure")) {
            if (jSONObject.isNull("measure")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$measure((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$measure(jSONObject.getString("measure"));
            }
        }
        if (jSONObject.has("paid")) {
            if (jSONObject.isNull("paid")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$paid((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$paid(Integer.valueOf(jSONObject.getInt("paid")));
            }
        }
        if (jSONObject.has("account")) {
            if (jSONObject.isNull("account")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$account((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$account(Integer.valueOf(jSONObject.getInt("account")));
            }
        }
        return ticket;
    }

    public static Ticket createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Ticket ticket = new Ticket();
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("dateTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$dateTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$dateTitle((String) null);
                }
            } else if (nextName.equals("sum")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$sum(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$sum((Double) null);
                }
            } else if (nextName.equals("measure")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$measure(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$measure((String) null);
                }
            } else if (nextName.equals("paid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$paid(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$paid((Integer) null);
                }
            } else if (!nextName.equals("account")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$account(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$account((Integer) null);
            }
        }
        jsonReader.endObject();
        return (Ticket) realm.copyToRealm(ticket, new ImportFlag[0]);
    }

    private static C4808x39dc6d46 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Ticket.class), false, Collections.emptyList());
        C4808x39dc6d46 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxy = new C4808x39dc6d46();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxy;
    }

    public static Ticket copyOrUpdate(Realm realm, TicketColumnInfo ticketColumnInfo, Ticket ticket, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticket instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticket;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticket;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticket);
        if (realmObjectProxy2 != null) {
            return (Ticket) realmObjectProxy2;
        }
        return copy(realm, ticketColumnInfo, ticket, z, map, set);
    }

    public static Ticket copy(Realm realm, TicketColumnInfo ticketColumnInfo, Ticket ticket, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticket);
        if (realmObjectProxy != null) {
            return (Ticket) realmObjectProxy;
        }
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Ticket.class), ticketColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(ticketColumnInfo.dateTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$dateTitle());
        osObjectBuilder.addDouble(ticketColumnInfo.sumIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$sum());
        osObjectBuilder.addString(ticketColumnInfo.measureIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$measure());
        osObjectBuilder.addInteger(ticketColumnInfo.paidIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$paid());
        osObjectBuilder.addInteger(ticketColumnInfo.accountIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$account());
        C4808x39dc6d46 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticket, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Ticket ticket, Map<RealmModel, Long> map) {
        Ticket ticket2 = ticket;
        if (ticket2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticket2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Ticket.class);
        long nativePtr = table.getNativePtr();
        TicketColumnInfo ticketColumnInfo = (TicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Ticket.class);
        long createRow = OsObject.createRow(table);
        map.put(ticket2, Long.valueOf(createRow));
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, ticketColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$dateTitle();
        if (realmGet$dateTitle != null) {
            Table.nativeSetString(nativePtr, ticketColumnInfo.dateTitleIndex, createRow, realmGet$dateTitle, false);
        }
        Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$sum();
        if (realmGet$sum != null) {
            Table.nativeSetDouble(nativePtr, ticketColumnInfo.sumIndex, createRow, realmGet$sum.doubleValue(), false);
        }
        String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, ticketColumnInfo.measureIndex, createRow, realmGet$measure, false);
        }
        Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$paid();
        if (realmGet$paid != null) {
            Table.nativeSetLong(nativePtr, ticketColumnInfo.paidIndex, createRow, realmGet$paid.longValue(), false);
        }
        Integer realmGet$account = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$account();
        if (realmGet$account != null) {
            Table.nativeSetLong(nativePtr, ticketColumnInfo.accountIndex, createRow, realmGet$account.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Ticket.class);
        long nativePtr = table.getNativePtr();
        TicketColumnInfo ticketColumnInfo = (TicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Ticket.class);
        while (it.hasNext()) {
            Ticket ticket = (Ticket) it.next();
            if (!map2.containsKey(ticket)) {
                if (ticket instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticket;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticket, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticket, Long.valueOf(createRow));
                C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, ticketColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$dateTitle();
                if (realmGet$dateTitle != null) {
                    Table.nativeSetString(nativePtr, ticketColumnInfo.dateTitleIndex, createRow, realmGet$dateTitle, false);
                }
                Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$sum();
                if (realmGet$sum != null) {
                    Table.nativeSetDouble(nativePtr, ticketColumnInfo.sumIndex, createRow, realmGet$sum.doubleValue(), false);
                }
                String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, ticketColumnInfo.measureIndex, createRow, realmGet$measure, false);
                }
                Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$paid();
                if (realmGet$paid != null) {
                    Table.nativeSetLong(nativePtr, ticketColumnInfo.paidIndex, createRow, realmGet$paid.longValue(), false);
                }
                Integer realmGet$account = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$account();
                if (realmGet$account != null) {
                    Table.nativeSetLong(nativePtr, ticketColumnInfo.accountIndex, createRow, realmGet$account.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Ticket ticket, Map<RealmModel, Long> map) {
        Ticket ticket2 = ticket;
        if (ticket2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticket2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Ticket.class);
        long nativePtr = table.getNativePtr();
        TicketColumnInfo ticketColumnInfo = (TicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Ticket.class);
        long createRow = OsObject.createRow(table);
        map.put(ticket2, Long.valueOf(createRow));
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, ticketColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketColumnInfo.idIndex, createRow, false);
        }
        String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$dateTitle();
        if (realmGet$dateTitle != null) {
            Table.nativeSetString(nativePtr, ticketColumnInfo.dateTitleIndex, createRow, realmGet$dateTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketColumnInfo.dateTitleIndex, createRow, false);
        }
        Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$sum();
        if (realmGet$sum != null) {
            Table.nativeSetDouble(nativePtr, ticketColumnInfo.sumIndex, createRow, realmGet$sum.doubleValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketColumnInfo.sumIndex, createRow, false);
        }
        String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$measure();
        if (realmGet$measure != null) {
            Table.nativeSetString(nativePtr, ticketColumnInfo.measureIndex, createRow, realmGet$measure, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketColumnInfo.measureIndex, createRow, false);
        }
        Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$paid();
        if (realmGet$paid != null) {
            Table.nativeSetLong(nativePtr, ticketColumnInfo.paidIndex, createRow, realmGet$paid.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketColumnInfo.paidIndex, createRow, false);
        }
        Integer realmGet$account = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$account();
        if (realmGet$account != null) {
            Table.nativeSetLong(nativePtr, ticketColumnInfo.accountIndex, createRow, realmGet$account.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketColumnInfo.accountIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Ticket.class);
        long nativePtr = table.getNativePtr();
        TicketColumnInfo ticketColumnInfo = (TicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Ticket.class);
        while (it.hasNext()) {
            Ticket ticket = (Ticket) it.next();
            if (!map2.containsKey(ticket)) {
                if (ticket instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticket;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticket, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticket, Long.valueOf(createRow));
                C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, ticketColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketColumnInfo.idIndex, createRow, false);
                }
                String realmGet$dateTitle = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$dateTitle();
                if (realmGet$dateTitle != null) {
                    Table.nativeSetString(nativePtr, ticketColumnInfo.dateTitleIndex, createRow, realmGet$dateTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketColumnInfo.dateTitleIndex, createRow, false);
                }
                Double realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$sum();
                if (realmGet$sum != null) {
                    Table.nativeSetDouble(nativePtr, ticketColumnInfo.sumIndex, createRow, realmGet$sum.doubleValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketColumnInfo.sumIndex, createRow, false);
                }
                String realmGet$measure = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$measure();
                if (realmGet$measure != null) {
                    Table.nativeSetString(nativePtr, ticketColumnInfo.measureIndex, createRow, realmGet$measure, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketColumnInfo.measureIndex, createRow, false);
                }
                Integer realmGet$paid = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$paid();
                if (realmGet$paid != null) {
                    Table.nativeSetLong(nativePtr, ticketColumnInfo.paidIndex, createRow, realmGet$paid.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketColumnInfo.paidIndex, createRow, false);
                }
                Integer realmGet$account = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmGet$account();
                if (realmGet$account != null) {
                    Table.nativeSetLong(nativePtr, ticketColumnInfo.accountIndex, createRow, realmGet$account.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketColumnInfo.accountIndex, createRow, false);
                }
            }
        }
    }

    public static Ticket createDetachedCopy(Ticket ticket, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Ticket ticket2;
        if (i > i2 || ticket == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticket);
        if (cacheData == null) {
            ticket2 = new Ticket();
            map.put(ticket, new RealmObjectProxy.CacheData(i, ticket2));
        } else if (i >= cacheData.minDepth) {
            return (Ticket) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticket2 = (Ticket) cacheData.object;
        }
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface = ticket2;
        C4809xc44aae93 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2 = ticket;
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$dateTitle(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2.realmGet$dateTitle());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$sum(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2.realmGet$sum());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$measure(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2.realmGet$measure());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$paid(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2.realmGet$paid());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface.realmSet$account(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxyinterface2.realmGet$account());
        return ticket2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ticket = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.String r1 = r5.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r5.realmGet$id()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{dateTitle:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$dateTitle()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r5.realmGet$dateTitle()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{sum:"
            r0.append(r4)
            java.lang.Double r4 = r5.realmGet$sum()
            if (r4 == 0) goto L_0x005e
            java.lang.Double r4 = r5.realmGet$sum()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{measure:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$measure()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$measure()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{paid:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$paid()
            if (r4 == 0) goto L_0x0094
            java.lang.Integer r4 = r5.realmGet$paid()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{account:"
            r0.append(r3)
            java.lang.Integer r3 = r5.realmGet$account()
            if (r3 == 0) goto L_0x00ae
            java.lang.Integer r2 = r5.realmGet$account()
        L_0x00ae:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4808x39dc6d46.toString():java.lang.String");
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
        C4808x39dc6d46 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxy = (C4808x39dc6d46) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
