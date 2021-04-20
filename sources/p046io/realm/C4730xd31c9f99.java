package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets;
import p046io.realm.BaseRealm;
import p046io.realm.C4710x379415fc;
import p046io.realm.C4712x67ea0478;
import p046io.realm.C4714x6f4f4848;
import p046io.realm.C4716x3c51d27a;
import p046io.realm.C4718xb56c6186;
import p046io.realm.C4722x782e3a14;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy */
public class C4730xd31c9f99 extends Tickets implements RealmObjectProxy, C4731x1ef269a0 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketsColumnInfo columnInfo;
    private ProxyState<Tickets> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Tickets";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy$TicketsColumnInfo */
    static final class TicketsColumnInfo extends ColumnInfo {
        long cityIndex;
        long hasDebtsIndex;
        long idIndex;
        long maxColumnIndexValue;
        long ticketAccountsListIndex;
        long ticketApartmentIndex;
        long ticketApplicantIndex;
        long ticketChatDataIndex;
        long ticketIndex;
        long ticketPerformerIndex;

        TicketsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.ticketChatDataIndex = addColumnDetails("ticketChatData", "ticketChatData", objectSchemaInfo);
            this.cityIndex = addColumnDetails("city", "city", objectSchemaInfo);
            this.hasDebtsIndex = addColumnDetails("hasDebts", "hasDebts", objectSchemaInfo);
            this.ticketPerformerIndex = addColumnDetails("ticketPerformer", "ticketPerformer", objectSchemaInfo);
            this.ticketApplicantIndex = addColumnDetails("ticketApplicant", "ticketApplicant", objectSchemaInfo);
            this.ticketApartmentIndex = addColumnDetails("ticketApartment", "ticketApartment", objectSchemaInfo);
            this.ticketAccountsListIndex = addColumnDetails("ticketAccountsList", "ticketAccountsList", objectSchemaInfo);
            this.ticketIndex = addColumnDetails("ticket", "ticket", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketsColumnInfo ticketsColumnInfo = (TicketsColumnInfo) columnInfo;
            TicketsColumnInfo ticketsColumnInfo2 = (TicketsColumnInfo) columnInfo2;
            ticketsColumnInfo2.idIndex = ticketsColumnInfo.idIndex;
            ticketsColumnInfo2.ticketChatDataIndex = ticketsColumnInfo.ticketChatDataIndex;
            ticketsColumnInfo2.cityIndex = ticketsColumnInfo.cityIndex;
            ticketsColumnInfo2.hasDebtsIndex = ticketsColumnInfo.hasDebtsIndex;
            ticketsColumnInfo2.ticketPerformerIndex = ticketsColumnInfo.ticketPerformerIndex;
            ticketsColumnInfo2.ticketApplicantIndex = ticketsColumnInfo.ticketApplicantIndex;
            ticketsColumnInfo2.ticketApartmentIndex = ticketsColumnInfo.ticketApartmentIndex;
            ticketsColumnInfo2.ticketAccountsListIndex = ticketsColumnInfo.ticketAccountsListIndex;
            ticketsColumnInfo2.ticketIndex = ticketsColumnInfo.ticketIndex;
            ticketsColumnInfo2.maxColumnIndexValue = ticketsColumnInfo.maxColumnIndexValue;
        }
    }

    C4730xd31c9f99() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketsColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public TicketChatData realmGet$ticketChatData() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketChatDataIndex)) {
            return null;
        }
        return (TicketChatData) this.proxyState.getRealm$realm().get(TicketChatData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketChatDataIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketChatData(TicketChatData ticketChatData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketChatData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketChatDataIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketChatData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketChatDataIndex, ((RealmObjectProxy) ticketChatData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketChatData")) {
            if (ticketChatData != null && !RealmObject.isManaged(ticketChatData)) {
                ticketChatData = (TicketChatData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketChatData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketChatData == null) {
                row$realm.nullifyLink(this.columnInfo.ticketChatDataIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketChatData);
            row$realm.getTable().setLink(this.columnInfo.ticketChatDataIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketChatData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$city() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.cityIndex);
    }

    public void realmSet$city(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.cityIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.cityIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.cityIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.cityIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public boolean realmGet$hasDebts() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.hasDebtsIndex);
    }

    public void realmSet$hasDebts(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.hasDebtsIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.hasDebtsIndex, row$realm.getIndex(), z, true);
        }
    }

    public TicketPerformer realmGet$ticketPerformer() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketPerformerIndex)) {
            return null;
        }
        return (TicketPerformer) this.proxyState.getRealm$realm().get(TicketPerformer.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketPerformerIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketPerformer(TicketPerformer ticketPerformer) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketPerformer == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketPerformerIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketPerformer);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketPerformerIndex, ((RealmObjectProxy) ticketPerformer).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketPerformer")) {
            if (ticketPerformer != null && !RealmObject.isManaged(ticketPerformer)) {
                ticketPerformer = (TicketPerformer) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketPerformer, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketPerformer == null) {
                row$realm.nullifyLink(this.columnInfo.ticketPerformerIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketPerformer);
            row$realm.getTable().setLink(this.columnInfo.ticketPerformerIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketPerformer).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TicketApplicant realmGet$ticketApplicant() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketApplicantIndex)) {
            return null;
        }
        return (TicketApplicant) this.proxyState.getRealm$realm().get(TicketApplicant.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketApplicantIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketApplicant(TicketApplicant ticketApplicant) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketApplicant == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketApplicantIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketApplicant);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketApplicantIndex, ((RealmObjectProxy) ticketApplicant).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketApplicant")) {
            if (ticketApplicant != null && !RealmObject.isManaged(ticketApplicant)) {
                ticketApplicant = (TicketApplicant) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketApplicant, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketApplicant == null) {
                row$realm.nullifyLink(this.columnInfo.ticketApplicantIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketApplicant);
            row$realm.getTable().setLink(this.columnInfo.ticketApplicantIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketApplicant).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TicketApartment realmGet$ticketApartment() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketApartmentIndex)) {
            return null;
        }
        return (TicketApartment) this.proxyState.getRealm$realm().get(TicketApartment.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketApartmentIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketApartment(TicketApartment ticketApartment) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketApartment == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketApartmentIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketApartment);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketApartmentIndex, ((RealmObjectProxy) ticketApartment).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketApartment")) {
            if (ticketApartment != null && !RealmObject.isManaged(ticketApartment)) {
                ticketApartment = (TicketApartment) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketApartment, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketApartment == null) {
                row$realm.nullifyLink(this.columnInfo.ticketApartmentIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketApartment);
            row$realm.getTable().setLink(this.columnInfo.ticketApartmentIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketApartment).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TicketAccountsList realmGet$ticketAccountsList() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketAccountsListIndex)) {
            return null;
        }
        return (TicketAccountsList) this.proxyState.getRealm$realm().get(TicketAccountsList.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketAccountsListIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketAccountsList(TicketAccountsList ticketAccountsList) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketAccountsList == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketAccountsListIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketAccountsList);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketAccountsListIndex, ((RealmObjectProxy) ticketAccountsList).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketAccountsList")) {
            if (ticketAccountsList != null && !RealmObject.isManaged(ticketAccountsList)) {
                ticketAccountsList = (TicketAccountsList) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketAccountsList, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketAccountsList == null) {
                row$realm.nullifyLink(this.columnInfo.ticketAccountsListIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketAccountsList);
            row$realm.getTable().setLink(this.columnInfo.ticketAccountsListIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketAccountsList).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TicketInfo realmGet$ticket() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketIndex)) {
            return null;
        }
        return (TicketInfo) this.proxyState.getRealm$realm().get(TicketInfo.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketIndex), false, Collections.emptyList());
    }

    public void realmSet$ticket(TicketInfo ticketInfo) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketInfo == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketInfo);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketIndex, ((RealmObjectProxy) ticketInfo).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticket")) {
            if (ticketInfo != null && !RealmObject.isManaged(ticketInfo)) {
                ticketInfo = (TicketInfo) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketInfo, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketInfo == null) {
                row$realm.nullifyLink(this.columnInfo.ticketIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketInfo);
            row$realm.getTable().setLink(this.columnInfo.ticketIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketInfo).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 9, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder.addPersistedLinkProperty("ticketChatData", RealmFieldType.OBJECT, C4716x3c51d27a.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("city", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("hasDebts", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedLinkProperty("ticketPerformer", RealmFieldType.OBJECT, C4722x782e3a14.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("ticketApplicant", RealmFieldType.OBJECT, C4714x6f4f4848.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("ticketApartment", RealmFieldType.OBJECT, C4712x67ea0478.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("ticketAccountsList", RealmFieldType.OBJECT, C4710x379415fc.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("ticket", RealmFieldType.OBJECT, C4718xb56c6186.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketsColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 6
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0063
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy$TicketsColumnInfo r4 = (p046io.realm.C4730xd31c9f99.TicketsColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            r7 = -1
            if (r6 != 0) goto L_0x0030
            long r9 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r9)
            goto L_0x0031
        L_0x0030:
            r4 = r7
        L_0x0031:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x005e }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x005e }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x005e }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005e }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy     // Catch:{ all -> 0x005e }
            r3.<init>()     // Catch:{ all -> 0x005e }
            r6.clear()
            goto L_0x0064
        L_0x005e:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0063:
            r3 = r2
        L_0x0064:
            java.lang.String r4 = "ticket"
            java.lang.String r5 = "ticketAccountsList"
            java.lang.String r6 = "ticketApartment"
            java.lang.String r7 = "ticketApplicant"
            java.lang.String r8 = "ticketPerformer"
            java.lang.String r9 = "ticketChatData"
            if (r3 != 0) goto L_0x00d9
            boolean r3 = r14.has(r9)
            if (r3 == 0) goto L_0x007b
            r0.add(r9)
        L_0x007b:
            boolean r3 = r14.has(r8)
            if (r3 == 0) goto L_0x0084
            r0.add(r8)
        L_0x0084:
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x008d
            r0.add(r7)
        L_0x008d:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0096
            r0.add(r6)
        L_0x0096:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x009f
            r0.add(r5)
        L_0x009f:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x00a8
            r0.add(r4)
        L_0x00a8:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00d1
            boolean r3 = r14.isNull(r1)
            r10 = 1
            if (r3 == 0) goto L_0x00bf
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r10, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy r3 = (p046io.realm.C4730xd31c9f99) r3
            goto L_0x00d9
        L_0x00bf:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r10, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy r3 = (p046io.realm.C4730xd31c9f99) r3
            goto L_0x00d9
        L_0x00d1:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00d9:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxyInterface r0 = (p046io.realm.C4731x1ef269a0) r0
            boolean r1 = r14.has(r9)
            if (r1 == 0) goto L_0x00f7
            boolean r1 = r14.isNull(r9)
            if (r1 == 0) goto L_0x00ec
            r0.realmSet$ticketChatData(r2)
            goto L_0x00f7
        L_0x00ec:
            org.json.JSONObject r1 = r14.getJSONObject(r9)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData r1 = p046io.realm.C4716x3c51d27a.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketChatData(r1)
        L_0x00f7:
            java.lang.String r1 = "city"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x0110
            boolean r9 = r14.isNull(r1)
            if (r9 == 0) goto L_0x0109
            r0.realmSet$city(r2)
            goto L_0x0110
        L_0x0109:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$city(r1)
        L_0x0110:
            java.lang.String r1 = "hasDebts"
            boolean r9 = r14.has(r1)
            if (r9 == 0) goto L_0x012e
            boolean r9 = r14.isNull(r1)
            if (r9 != 0) goto L_0x0126
            boolean r1 = r14.getBoolean(r1)
            r0.realmSet$hasDebts(r1)
            goto L_0x012e
        L_0x0126:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'hasDebts' to null."
            r13.<init>(r14)
            throw r13
        L_0x012e:
            boolean r1 = r14.has(r8)
            if (r1 == 0) goto L_0x0149
            boolean r1 = r14.isNull(r8)
            if (r1 == 0) goto L_0x013e
            r0.realmSet$ticketPerformer(r2)
            goto L_0x0149
        L_0x013e:
            org.json.JSONObject r1 = r14.getJSONObject(r8)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketPerformer r1 = p046io.realm.C4722x782e3a14.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketPerformer(r1)
        L_0x0149:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0164
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0159
            r0.realmSet$ticketApplicant(r2)
            goto L_0x0164
        L_0x0159:
            org.json.JSONObject r1 = r14.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApplicant r1 = p046io.realm.C4714x6f4f4848.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketApplicant(r1)
        L_0x0164:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x017f
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0174
            r0.realmSet$ticketApartment(r2)
            goto L_0x017f
        L_0x0174:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketApartment r1 = p046io.realm.C4712x67ea0478.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketApartment(r1)
        L_0x017f:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x019a
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x018f
            r0.realmSet$ticketAccountsList(r2)
            goto L_0x019a
        L_0x018f:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketAccountsList r1 = p046io.realm.C4710x379415fc.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketAccountsList(r1)
        L_0x019a:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x01b5
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x01aa
            r0.realmSet$ticket(r2)
            goto L_0x01b5
        L_0x01aa:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo r13 = p046io.realm.C4718xb56c6186.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$ticket(r13)
        L_0x01b5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4730xd31c9f99.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets");
    }

    public static Tickets createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Tickets tickets = new Tickets();
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("ticketChatData")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketChatData((TicketChatData) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketChatData(C4716x3c51d27a.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("city")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$city(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$city((String) null);
                }
            } else if (nextName.equals("hasDebts")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$hasDebts(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasDebts' to null.");
                }
            } else if (nextName.equals("ticketPerformer")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketPerformer((TicketPerformer) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketPerformer(C4722x782e3a14.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("ticketApplicant")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketApplicant((TicketApplicant) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketApplicant(C4714x6f4f4848.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("ticketApartment")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketApartment((TicketApartment) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketApartment(C4712x67ea0478.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("ticketAccountsList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketAccountsList((TicketAccountsList) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketAccountsList(C4710x379415fc.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("ticket")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticket((TicketInfo) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticket(C4718xb56c6186.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Tickets) realm.copyToRealm(tickets, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4730xd31c9f99 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tickets.class), false, Collections.emptyList());
        C4730xd31c9f99 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxy = new C4730xd31c9f99();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4730xd31c9f99.TicketsColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.Tickets.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxyInterface r5 = (p046io.realm.C4731x1ef269a0) r5
            int r5 = r5.realmGet$id()
            long r5 = (long) r5
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x006a
            r0 = 0
            goto L_0x008e
        L_0x006a:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0088 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0088 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0088 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0088 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0088 }
            r0.clear()
            goto L_0x008d
        L_0x0088:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008d:
            r0 = r11
        L_0x008e:
            r3 = r1
            if (r0 == 0) goto L_0x009b
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4730xd31c9f99.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketsRealmProxy$TicketsColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.Tickets");
    }

    public static Tickets copy(Realm realm, TicketsColumnInfo ticketsColumnInfo, Tickets tickets, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(tickets);
        if (realmObjectProxy != null) {
            return (Tickets) realmObjectProxy;
        }
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Tickets.class), ticketsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketsColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(ticketsColumnInfo.cityIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$city());
        osObjectBuilder.addBoolean(ticketsColumnInfo.hasDebtsIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$hasDebts()));
        C4730xd31c9f99 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(tickets, newProxyInstance);
        TicketChatData realmGet$ticketChatData = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketChatData();
        if (realmGet$ticketChatData == null) {
            newProxyInstance.realmSet$ticketChatData((TicketChatData) null);
        } else {
            TicketChatData ticketChatData = (TicketChatData) map.get(realmGet$ticketChatData);
            if (ticketChatData != null) {
                newProxyInstance.realmSet$ticketChatData(ticketChatData);
            } else {
                newProxyInstance.realmSet$ticketChatData(C4716x3c51d27a.copyOrUpdate(realm, (C4716x3c51d27a.TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class), realmGet$ticketChatData, z, map, set));
            }
        }
        TicketPerformer realmGet$ticketPerformer = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketPerformer();
        if (realmGet$ticketPerformer == null) {
            newProxyInstance.realmSet$ticketPerformer((TicketPerformer) null);
        } else {
            TicketPerformer ticketPerformer = (TicketPerformer) map.get(realmGet$ticketPerformer);
            if (ticketPerformer != null) {
                newProxyInstance.realmSet$ticketPerformer(ticketPerformer);
            } else {
                newProxyInstance.realmSet$ticketPerformer(C4722x782e3a14.copyOrUpdate(realm, (C4722x782e3a14.TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class), realmGet$ticketPerformer, z, map, set));
            }
        }
        TicketApplicant realmGet$ticketApplicant = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApplicant();
        if (realmGet$ticketApplicant == null) {
            newProxyInstance.realmSet$ticketApplicant((TicketApplicant) null);
        } else {
            TicketApplicant ticketApplicant = (TicketApplicant) map.get(realmGet$ticketApplicant);
            if (ticketApplicant != null) {
                newProxyInstance.realmSet$ticketApplicant(ticketApplicant);
            } else {
                newProxyInstance.realmSet$ticketApplicant(C4714x6f4f4848.copyOrUpdate(realm, (C4714x6f4f4848.TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class), realmGet$ticketApplicant, z, map, set));
            }
        }
        TicketApartment realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApartment();
        if (realmGet$ticketApartment == null) {
            newProxyInstance.realmSet$ticketApartment((TicketApartment) null);
        } else {
            TicketApartment ticketApartment = (TicketApartment) map.get(realmGet$ticketApartment);
            if (ticketApartment != null) {
                newProxyInstance.realmSet$ticketApartment(ticketApartment);
            } else {
                newProxyInstance.realmSet$ticketApartment(C4712x67ea0478.copyOrUpdate(realm, (C4712x67ea0478.TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class), realmGet$ticketApartment, z, map, set));
            }
        }
        TicketAccountsList realmGet$ticketAccountsList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketAccountsList();
        if (realmGet$ticketAccountsList == null) {
            newProxyInstance.realmSet$ticketAccountsList((TicketAccountsList) null);
        } else {
            TicketAccountsList ticketAccountsList = (TicketAccountsList) map.get(realmGet$ticketAccountsList);
            if (ticketAccountsList != null) {
                newProxyInstance.realmSet$ticketAccountsList(ticketAccountsList);
            } else {
                newProxyInstance.realmSet$ticketAccountsList(C4710x379415fc.copyOrUpdate(realm, (C4710x379415fc.TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class), realmGet$ticketAccountsList, z, map, set));
            }
        }
        TicketInfo realmGet$ticket = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticket();
        if (realmGet$ticket == null) {
            newProxyInstance.realmSet$ticket((TicketInfo) null);
        } else {
            TicketInfo ticketInfo = (TicketInfo) map.get(realmGet$ticket);
            if (ticketInfo != null) {
                newProxyInstance.realmSet$ticket(ticketInfo);
            } else {
                newProxyInstance.realmSet$ticket(C4718xb56c6186.copyOrUpdate(realm, (C4718xb56c6186.TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class), realmGet$ticket, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Tickets tickets, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Tickets tickets2 = tickets;
        Map<RealmModel, Long> map2 = map;
        if (tickets2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tickets2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Tickets.class);
        long nativePtr = table.getNativePtr();
        TicketsColumnInfo ticketsColumnInfo = (TicketsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tickets.class);
        long j3 = ticketsColumnInfo.idIndex;
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(tickets2, Long.valueOf(j2));
        TicketChatData realmGet$ticketChatData = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketChatData();
        if (realmGet$ticketChatData != null) {
            Long l = map2.get(realmGet$ticketChatData);
            if (l == null) {
                l = Long.valueOf(C4716x3c51d27a.insert(realm2, realmGet$ticketChatData, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketChatDataIndex, j2, l.longValue(), false);
        }
        String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, ticketsColumnInfo.cityIndex, j2, realmGet$city, false);
        }
        Table.nativeSetBoolean(nativePtr, ticketsColumnInfo.hasDebtsIndex, j2, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$hasDebts(), false);
        TicketPerformer realmGet$ticketPerformer = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketPerformer();
        if (realmGet$ticketPerformer != null) {
            Long l2 = map2.get(realmGet$ticketPerformer);
            if (l2 == null) {
                l2 = Long.valueOf(C4722x782e3a14.insert(realm2, realmGet$ticketPerformer, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketPerformerIndex, j2, l2.longValue(), false);
        }
        TicketApplicant realmGet$ticketApplicant = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApplicant();
        if (realmGet$ticketApplicant != null) {
            Long l3 = map2.get(realmGet$ticketApplicant);
            if (l3 == null) {
                l3 = Long.valueOf(C4714x6f4f4848.insert(realm2, realmGet$ticketApplicant, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketApplicantIndex, j2, l3.longValue(), false);
        }
        TicketApartment realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApartment();
        if (realmGet$ticketApartment != null) {
            Long l4 = map2.get(realmGet$ticketApartment);
            if (l4 == null) {
                l4 = Long.valueOf(C4712x67ea0478.insert(realm2, realmGet$ticketApartment, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketApartmentIndex, j2, l4.longValue(), false);
        }
        TicketAccountsList realmGet$ticketAccountsList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketAccountsList();
        if (realmGet$ticketAccountsList != null) {
            Long l5 = map2.get(realmGet$ticketAccountsList);
            if (l5 == null) {
                l5 = Long.valueOf(C4710x379415fc.insert(realm2, realmGet$ticketAccountsList, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketAccountsListIndex, j2, l5.longValue(), false);
        }
        TicketInfo realmGet$ticket = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticket();
        if (realmGet$ticket != null) {
            Long l6 = map2.get(realmGet$ticket);
            if (l6 == null) {
                l6 = Long.valueOf(C4718xb56c6186.insert(realm2, realmGet$ticket, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketIndex, j2, l6.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Tickets.class);
        long nativePtr = table.getNativePtr();
        TicketsColumnInfo ticketsColumnInfo = (TicketsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tickets.class);
        long j2 = ticketsColumnInfo.idIndex;
        while (it.hasNext()) {
            Tickets tickets = (Tickets) it.next();
            if (!map2.containsKey(tickets)) {
                if (tickets instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tickets;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(tickets, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j3 = j;
                map2.put(tickets, Long.valueOf(j3));
                TicketChatData realmGet$ticketChatData = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketChatData();
                if (realmGet$ticketChatData != null) {
                    Long l = map2.get(realmGet$ticketChatData);
                    if (l == null) {
                        l = Long.valueOf(C4716x3c51d27a.insert(realm2, realmGet$ticketChatData, map2));
                    }
                    table.setLink(ticketsColumnInfo.ticketChatDataIndex, j3, l.longValue(), false);
                }
                String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, ticketsColumnInfo.cityIndex, j3, realmGet$city, false);
                }
                Table.nativeSetBoolean(nativePtr, ticketsColumnInfo.hasDebtsIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$hasDebts(), false);
                TicketPerformer realmGet$ticketPerformer = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketPerformer();
                if (realmGet$ticketPerformer != null) {
                    Long l2 = map2.get(realmGet$ticketPerformer);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4722x782e3a14.insert(realm2, realmGet$ticketPerformer, map2));
                    }
                    table.setLink(ticketsColumnInfo.ticketPerformerIndex, j3, l2.longValue(), false);
                }
                TicketApplicant realmGet$ticketApplicant = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApplicant();
                if (realmGet$ticketApplicant != null) {
                    Long l3 = map2.get(realmGet$ticketApplicant);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4714x6f4f4848.insert(realm2, realmGet$ticketApplicant, map2));
                    }
                    table.setLink(ticketsColumnInfo.ticketApplicantIndex, j3, l3.longValue(), false);
                }
                TicketApartment realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApartment();
                if (realmGet$ticketApartment != null) {
                    Long l4 = map2.get(realmGet$ticketApartment);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4712x67ea0478.insert(realm2, realmGet$ticketApartment, map2));
                    }
                    table.setLink(ticketsColumnInfo.ticketApartmentIndex, j3, l4.longValue(), false);
                }
                TicketAccountsList realmGet$ticketAccountsList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketAccountsList();
                if (realmGet$ticketAccountsList != null) {
                    Long l5 = map2.get(realmGet$ticketAccountsList);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4710x379415fc.insert(realm2, realmGet$ticketAccountsList, map2));
                    }
                    table.setLink(ticketsColumnInfo.ticketAccountsListIndex, j3, l5.longValue(), false);
                }
                TicketInfo realmGet$ticket = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticket();
                if (realmGet$ticket != null) {
                    Long l6 = map2.get(realmGet$ticket);
                    if (l6 == null) {
                        l6 = Long.valueOf(C4718xb56c6186.insert(realm2, realmGet$ticket, map2));
                    }
                    table.setLink(ticketsColumnInfo.ticketIndex, j3, l6.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Tickets tickets, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Tickets tickets2 = tickets;
        Map<RealmModel, Long> map2 = map;
        if (tickets2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tickets2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Tickets.class);
        long nativePtr = table.getNativePtr();
        TicketsColumnInfo ticketsColumnInfo = (TicketsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tickets.class);
        long j = ticketsColumnInfo.idIndex;
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(tickets2, Long.valueOf(createRowWithPrimaryKey));
        TicketChatData realmGet$ticketChatData = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketChatData();
        if (realmGet$ticketChatData != null) {
            Long l = map2.get(realmGet$ticketChatData);
            if (l == null) {
                l = Long.valueOf(C4716x3c51d27a.insertOrUpdate(realm2, realmGet$ticketChatData, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketChatDataIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketChatDataIndex, createRowWithPrimaryKey);
        }
        String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, ticketsColumnInfo.cityIndex, createRowWithPrimaryKey, realmGet$city, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketsColumnInfo.cityIndex, createRowWithPrimaryKey, false);
        }
        Table.nativeSetBoolean(nativePtr, ticketsColumnInfo.hasDebtsIndex, createRowWithPrimaryKey, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$hasDebts(), false);
        TicketPerformer realmGet$ticketPerformer = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketPerformer();
        if (realmGet$ticketPerformer != null) {
            Long l2 = map2.get(realmGet$ticketPerformer);
            if (l2 == null) {
                l2 = Long.valueOf(C4722x782e3a14.insertOrUpdate(realm2, realmGet$ticketPerformer, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketPerformerIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketPerformerIndex, createRowWithPrimaryKey);
        }
        TicketApplicant realmGet$ticketApplicant = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApplicant();
        if (realmGet$ticketApplicant != null) {
            Long l3 = map2.get(realmGet$ticketApplicant);
            if (l3 == null) {
                l3 = Long.valueOf(C4714x6f4f4848.insertOrUpdate(realm2, realmGet$ticketApplicant, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketApplicantIndex, createRowWithPrimaryKey, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketApplicantIndex, createRowWithPrimaryKey);
        }
        TicketApartment realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApartment();
        if (realmGet$ticketApartment != null) {
            Long l4 = map2.get(realmGet$ticketApartment);
            if (l4 == null) {
                l4 = Long.valueOf(C4712x67ea0478.insertOrUpdate(realm2, realmGet$ticketApartment, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketApartmentIndex, createRowWithPrimaryKey, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketApartmentIndex, createRowWithPrimaryKey);
        }
        TicketAccountsList realmGet$ticketAccountsList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketAccountsList();
        if (realmGet$ticketAccountsList != null) {
            Long l5 = map2.get(realmGet$ticketAccountsList);
            if (l5 == null) {
                l5 = Long.valueOf(C4710x379415fc.insertOrUpdate(realm2, realmGet$ticketAccountsList, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketAccountsListIndex, createRowWithPrimaryKey, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketAccountsListIndex, createRowWithPrimaryKey);
        }
        TicketInfo realmGet$ticket = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticket();
        if (realmGet$ticket != null) {
            Long l6 = map2.get(realmGet$ticket);
            if (l6 == null) {
                l6 = Long.valueOf(C4718xb56c6186.insertOrUpdate(realm2, realmGet$ticket, map2));
            }
            Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketIndex, createRowWithPrimaryKey, l6.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Tickets.class);
        long nativePtr = table.getNativePtr();
        TicketsColumnInfo ticketsColumnInfo = (TicketsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Tickets.class);
        long j3 = ticketsColumnInfo.idIndex;
        while (it.hasNext()) {
            Tickets tickets = (Tickets) it.next();
            if (!map2.containsKey(tickets)) {
                if (tickets instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) tickets;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(tickets, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(tickets, Long.valueOf(j4));
                TicketChatData realmGet$ticketChatData = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketChatData();
                if (realmGet$ticketChatData != null) {
                    Long l = map2.get(realmGet$ticketChatData);
                    if (l == null) {
                        l = Long.valueOf(C4716x3c51d27a.insertOrUpdate(realm2, realmGet$ticketChatData, map2));
                    }
                    j2 = j3;
                    Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketChatDataIndex, j4, l.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketChatDataIndex, j4);
                }
                String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, ticketsColumnInfo.cityIndex, j4, realmGet$city, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketsColumnInfo.cityIndex, j4, false);
                }
                Table.nativeSetBoolean(nativePtr, ticketsColumnInfo.hasDebtsIndex, j4, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$hasDebts(), false);
                TicketPerformer realmGet$ticketPerformer = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketPerformer();
                if (realmGet$ticketPerformer != null) {
                    Long l2 = map2.get(realmGet$ticketPerformer);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4722x782e3a14.insertOrUpdate(realm2, realmGet$ticketPerformer, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketPerformerIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketPerformerIndex, j4);
                }
                TicketApplicant realmGet$ticketApplicant = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApplicant();
                if (realmGet$ticketApplicant != null) {
                    Long l3 = map2.get(realmGet$ticketApplicant);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4714x6f4f4848.insertOrUpdate(realm2, realmGet$ticketApplicant, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketApplicantIndex, j4, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketApplicantIndex, j4);
                }
                TicketApartment realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketApartment();
                if (realmGet$ticketApartment != null) {
                    Long l4 = map2.get(realmGet$ticketApartment);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4712x67ea0478.insertOrUpdate(realm2, realmGet$ticketApartment, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketApartmentIndex, j4, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketApartmentIndex, j4);
                }
                TicketAccountsList realmGet$ticketAccountsList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticketAccountsList();
                if (realmGet$ticketAccountsList != null) {
                    Long l5 = map2.get(realmGet$ticketAccountsList);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4710x379415fc.insertOrUpdate(realm2, realmGet$ticketAccountsList, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketAccountsListIndex, j4, l5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketAccountsListIndex, j4);
                }
                TicketInfo realmGet$ticket = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmGet$ticket();
                if (realmGet$ticket != null) {
                    Long l6 = map2.get(realmGet$ticket);
                    if (l6 == null) {
                        l6 = Long.valueOf(C4718xb56c6186.insertOrUpdate(realm2, realmGet$ticket, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketsColumnInfo.ticketIndex, j4, l6.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketsColumnInfo.ticketIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static Tickets createDetachedCopy(Tickets tickets, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Tickets tickets2;
        if (i > i2 || tickets == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(tickets);
        if (cacheData == null) {
            tickets2 = new Tickets();
            map.put(tickets, new RealmObjectProxy.CacheData(i, tickets2));
        } else if (i >= cacheData.minDepth) {
            return (Tickets) cacheData.object;
        } else {
            cacheData.minDepth = i;
            tickets2 = (Tickets) cacheData.object;
        }
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets2;
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2 = tickets;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$id());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketChatData(C4716x3c51d27a.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketChatData(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$city(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$city());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$hasDebts(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$hasDebts());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketPerformer(C4722x782e3a14.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketPerformer(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketApplicant(C4714x6f4f4848.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketApplicant(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketApartment(C4712x67ea0478.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketApartment(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticketAccountsList(C4710x379415fc.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketAccountsList(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface.realmSet$ticket(C4718xb56c6186.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticket(), i3, i2, map));
        return tickets2;
    }

    static Tickets update(Realm realm, TicketsColumnInfo ticketsColumnInfo, Tickets tickets, Tickets tickets2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface = tickets;
        C4731x1ef269a0 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2 = tickets2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Tickets.class), ticketsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketsColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$id()));
        TicketChatData realmGet$ticketChatData = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketChatData();
        if (realmGet$ticketChatData == null) {
            osObjectBuilder.addNull(ticketsColumnInfo.ticketChatDataIndex);
        } else {
            TicketChatData ticketChatData = (TicketChatData) map.get(realmGet$ticketChatData);
            if (ticketChatData != null) {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketChatDataIndex, ticketChatData);
            } else {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketChatDataIndex, C4716x3c51d27a.copyOrUpdate(realm, (C4716x3c51d27a.TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class), realmGet$ticketChatData, true, map, set));
            }
        }
        osObjectBuilder.addString(ticketsColumnInfo.cityIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$city());
        osObjectBuilder.addBoolean(ticketsColumnInfo.hasDebtsIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$hasDebts()));
        TicketPerformer realmGet$ticketPerformer = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketPerformer();
        if (realmGet$ticketPerformer == null) {
            osObjectBuilder.addNull(ticketsColumnInfo.ticketPerformerIndex);
        } else {
            TicketPerformer ticketPerformer = (TicketPerformer) map.get(realmGet$ticketPerformer);
            if (ticketPerformer != null) {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketPerformerIndex, ticketPerformer);
            } else {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketPerformerIndex, C4722x782e3a14.copyOrUpdate(realm, (C4722x782e3a14.TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class), realmGet$ticketPerformer, true, map, set));
            }
        }
        TicketApplicant realmGet$ticketApplicant = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketApplicant();
        if (realmGet$ticketApplicant == null) {
            osObjectBuilder.addNull(ticketsColumnInfo.ticketApplicantIndex);
        } else {
            TicketApplicant ticketApplicant = (TicketApplicant) map.get(realmGet$ticketApplicant);
            if (ticketApplicant != null) {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketApplicantIndex, ticketApplicant);
            } else {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketApplicantIndex, C4714x6f4f4848.copyOrUpdate(realm, (C4714x6f4f4848.TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class), realmGet$ticketApplicant, true, map, set));
            }
        }
        TicketApartment realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketApartment();
        if (realmGet$ticketApartment == null) {
            osObjectBuilder.addNull(ticketsColumnInfo.ticketApartmentIndex);
        } else {
            TicketApartment ticketApartment = (TicketApartment) map.get(realmGet$ticketApartment);
            if (ticketApartment != null) {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketApartmentIndex, ticketApartment);
            } else {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketApartmentIndex, C4712x67ea0478.copyOrUpdate(realm, (C4712x67ea0478.TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class), realmGet$ticketApartment, true, map, set));
            }
        }
        TicketAccountsList realmGet$ticketAccountsList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticketAccountsList();
        if (realmGet$ticketAccountsList == null) {
            osObjectBuilder.addNull(ticketsColumnInfo.ticketAccountsListIndex);
        } else {
            TicketAccountsList ticketAccountsList = (TicketAccountsList) map.get(realmGet$ticketAccountsList);
            if (ticketAccountsList != null) {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketAccountsListIndex, ticketAccountsList);
            } else {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketAccountsListIndex, C4710x379415fc.copyOrUpdate(realm, (C4710x379415fc.TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class), realmGet$ticketAccountsList, true, map, set));
            }
        }
        TicketInfo realmGet$ticket = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxyinterface2.realmGet$ticket();
        if (realmGet$ticket == null) {
            osObjectBuilder.addNull(ticketsColumnInfo.ticketIndex);
        } else {
            TicketInfo ticketInfo = (TicketInfo) map.get(realmGet$ticket);
            if (ticketInfo != null) {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketIndex, ticketInfo);
            } else {
                osObjectBuilder.addObject(ticketsColumnInfo.ticketIndex, C4718xb56c6186.copyOrUpdate(realm, (C4718xb56c6186.TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class), realmGet$ticket, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return tickets;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Tickets = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{ticketChatData:");
        String str = "null";
        sb.append(realmGet$ticketChatData() != null ? C4716x3c51d27a.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{city:");
        sb.append(realmGet$city() != null ? realmGet$city() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{hasDebts:");
        sb.append(realmGet$hasDebts());
        sb.append("}");
        sb.append(",");
        sb.append("{ticketPerformer:");
        sb.append(realmGet$ticketPerformer() != null ? C4722x782e3a14.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketApplicant:");
        sb.append(realmGet$ticketApplicant() != null ? C4714x6f4f4848.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketApartment:");
        sb.append(realmGet$ticketApartment() != null ? C4712x67ea0478.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketAccountsList:");
        sb.append(realmGet$ticketAccountsList() != null ? C4710x379415fc.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticket:");
        if (realmGet$ticket() != null) {
            str = C4718xb56c6186.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4730xd31c9f99 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxy = (C4730xd31c9f99) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
