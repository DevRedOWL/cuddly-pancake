package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency;
import p046io.realm.BaseRealm;
import p046io.realm.C4720x13bb7c97;
import p046io.realm.C4726x470e297;
import p046io.realm.C4728x7291458f;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy */
public class C4718xb56c6186 extends TicketInfo implements RealmObjectProxy, C4719xebc98253 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketInfoColumnInfo columnInfo;
    private ProxyState<TicketInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy$TicketInfoColumnInfo */
    static final class TicketInfoColumnInfo extends ColumnInfo {
        long dateEndIndex;
        long dateFinishIndex;
        long dateStartIndex;
        long idIndex;
        long maxColumnIndexValue;
        long numberIndex;
        long sectionIdIndex;
        long textIndex;
        long ticketObjectIndex;
        long ticketStateIndex;
        long ticketUrgencyIndex;
        long titleIndex;

        TicketInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.numberIndex = addColumnDetails(CardFragment.ARG_NUMBER, CardFragment.ARG_NUMBER, objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.ticketUrgencyIndex = addColumnDetails("ticketUrgency", "ticketUrgency", objectSchemaInfo);
            this.dateStartIndex = addColumnDetails(CardFragment.ARG_DATE_START, CardFragment.ARG_DATE_START, objectSchemaInfo);
            this.dateEndIndex = addColumnDetails(CardFragment.ARG_DATE_END, CardFragment.ARG_DATE_END, objectSchemaInfo);
            this.dateFinishIndex = addColumnDetails("dateFinish", "dateFinish", objectSchemaInfo);
            this.ticketStateIndex = addColumnDetails("ticketState", "ticketState", objectSchemaInfo);
            this.ticketObjectIndex = addColumnDetails("ticketObject", "ticketObject", objectSchemaInfo);
            this.sectionIdIndex = addColumnDetails("sectionId", "sectionId", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketInfoColumnInfo ticketInfoColumnInfo = (TicketInfoColumnInfo) columnInfo;
            TicketInfoColumnInfo ticketInfoColumnInfo2 = (TicketInfoColumnInfo) columnInfo2;
            ticketInfoColumnInfo2.idIndex = ticketInfoColumnInfo.idIndex;
            ticketInfoColumnInfo2.numberIndex = ticketInfoColumnInfo.numberIndex;
            ticketInfoColumnInfo2.titleIndex = ticketInfoColumnInfo.titleIndex;
            ticketInfoColumnInfo2.textIndex = ticketInfoColumnInfo.textIndex;
            ticketInfoColumnInfo2.ticketUrgencyIndex = ticketInfoColumnInfo.ticketUrgencyIndex;
            ticketInfoColumnInfo2.dateStartIndex = ticketInfoColumnInfo.dateStartIndex;
            ticketInfoColumnInfo2.dateEndIndex = ticketInfoColumnInfo.dateEndIndex;
            ticketInfoColumnInfo2.dateFinishIndex = ticketInfoColumnInfo.dateFinishIndex;
            ticketInfoColumnInfo2.ticketStateIndex = ticketInfoColumnInfo.ticketStateIndex;
            ticketInfoColumnInfo2.ticketObjectIndex = ticketInfoColumnInfo.ticketObjectIndex;
            ticketInfoColumnInfo2.sectionIdIndex = ticketInfoColumnInfo.sectionIdIndex;
            ticketInfoColumnInfo2.maxColumnIndexValue = ticketInfoColumnInfo.maxColumnIndexValue;
        }
    }

    C4718xb56c6186() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketInfoColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.numberIndex);
    }

    public void realmSet$number(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.numberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.numberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.numberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.numberIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textIndex);
    }

    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public TicketUrgency realmGet$ticketUrgency() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketUrgencyIndex)) {
            return null;
        }
        return (TicketUrgency) this.proxyState.getRealm$realm().get(TicketUrgency.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketUrgencyIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketUrgency(TicketUrgency ticketUrgency) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketUrgency == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketUrgencyIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketUrgency);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketUrgencyIndex, ((RealmObjectProxy) ticketUrgency).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketUrgency")) {
            if (ticketUrgency != null && !RealmObject.isManaged(ticketUrgency)) {
                ticketUrgency = (TicketUrgency) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketUrgency, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketUrgency == null) {
                row$realm.nullifyLink(this.columnInfo.ticketUrgencyIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketUrgency);
            row$realm.getTable().setLink(this.columnInfo.ticketUrgencyIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketUrgency).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public long realmGet$dateStart() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.dateStartIndex);
    }

    public void realmSet$dateStart(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.dateStartIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.dateStartIndex, row$realm.getIndex(), j, true);
        }
    }

    public long realmGet$dateEnd() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.dateEndIndex);
    }

    public void realmSet$dateEnd(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.dateEndIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.dateEndIndex, row$realm.getIndex(), j, true);
        }
    }

    public long realmGet$dateFinish() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.dateFinishIndex);
    }

    public void realmSet$dateFinish(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.dateFinishIndex, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.dateFinishIndex, row$realm.getIndex(), j, true);
        }
    }

    public TicketState realmGet$ticketState() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketStateIndex)) {
            return null;
        }
        return (TicketState) this.proxyState.getRealm$realm().get(TicketState.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketStateIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketState(TicketState ticketState) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketState == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketStateIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketState);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketStateIndex, ((RealmObjectProxy) ticketState).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketState")) {
            if (ticketState != null && !RealmObject.isManaged(ticketState)) {
                ticketState = (TicketState) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketState, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketState == null) {
                row$realm.nullifyLink(this.columnInfo.ticketStateIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketState);
            row$realm.getTable().setLink(this.columnInfo.ticketStateIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketState).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public TicketObject realmGet$ticketObject() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.ticketObjectIndex)) {
            return null;
        }
        return (TicketObject) this.proxyState.getRealm$realm().get(TicketObject.class, this.proxyState.getRow$realm().getLink(this.columnInfo.ticketObjectIndex), false, Collections.emptyList());
    }

    public void realmSet$ticketObject(TicketObject ticketObject) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (ticketObject == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.ticketObjectIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketObject);
            this.proxyState.getRow$realm().setLink(this.columnInfo.ticketObjectIndex, ((RealmObjectProxy) ticketObject).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("ticketObject")) {
            if (ticketObject != null && !RealmObject.isManaged(ticketObject)) {
                ticketObject = (TicketObject) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(ticketObject, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (ticketObject == null) {
                row$realm.nullifyLink(this.columnInfo.ticketObjectIndex);
                return;
            }
            this.proxyState.checkValidObject(ticketObject);
            row$realm.getTable().setLink(this.columnInfo.ticketObjectIndex, row$realm.getIndex(), ((RealmObjectProxy) ticketObject).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$sectionId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sectionIdIndex);
    }

    public void realmSet$sectionId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sectionIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sectionIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sectionIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sectionIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 11, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty(CardFragment.ARG_NUMBER, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("text", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("ticketUrgency", RealmFieldType.OBJECT, C4728x7291458f.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty(CardFragment.ARG_DATE_START, RealmFieldType.INTEGER, false, false, true);
        builder3.addPersistedProperty(CardFragment.ARG_DATE_END, RealmFieldType.INTEGER, false, false, true);
        builder3.addPersistedProperty("dateFinish", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedLinkProperty("ticketState", RealmFieldType.OBJECT, C4726x470e297.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("ticketObject", RealmFieldType.OBJECT, C4720x13bb7c97.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("sectionId", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketInfoColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0063
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy$TicketInfoColumnInfo r4 = (p046io.realm.C4718xb56c6186.TicketInfoColumnInfo) r4
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
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x005e }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005e }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy     // Catch:{ all -> 0x005e }
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
            java.lang.String r4 = "ticketObject"
            java.lang.String r5 = "ticketState"
            java.lang.String r6 = "ticketUrgency"
            if (r3 != 0) goto L_0x00b8
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0075
            r0.add(r6)
        L_0x0075:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x007e
            r0.add(r5)
        L_0x007e:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0087
            r0.add(r4)
        L_0x0087:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r14.isNull(r1)
            r7 = 1
            if (r3 == 0) goto L_0x009e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy r3 = (p046io.realm.C4718xb56c6186) r3
            goto L_0x00b8
        L_0x009e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r7, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy r3 = (p046io.realm.C4718xb56c6186) r3
            goto L_0x00b8
        L_0x00b0:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b8:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxyInterface r0 = (p046io.realm.C4719xebc98253) r0
            java.lang.String r1 = "number"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00d4
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00cd
            r0.realmSet$number(r2)
            goto L_0x00d4
        L_0x00cd:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$number(r1)
        L_0x00d4:
            java.lang.String r1 = "title"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x00ed
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00e6
            r0.realmSet$title(r2)
            goto L_0x00ed
        L_0x00e6:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00ed:
            java.lang.String r1 = "text"
            boolean r7 = r14.has(r1)
            if (r7 == 0) goto L_0x0106
            boolean r7 = r14.isNull(r1)
            if (r7 == 0) goto L_0x00ff
            r0.realmSet$text(r2)
            goto L_0x0106
        L_0x00ff:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$text(r1)
        L_0x0106:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x0121
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0116
            r0.realmSet$ticketUrgency(r2)
            goto L_0x0121
        L_0x0116:
            org.json.JSONObject r1 = r14.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketUrgency r1 = p046io.realm.C4728x7291458f.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketUrgency(r1)
        L_0x0121:
            java.lang.String r1 = "dateStart"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x013f
            boolean r6 = r14.isNull(r1)
            if (r6 != 0) goto L_0x0137
            long r6 = r14.getLong(r1)
            r0.realmSet$dateStart(r6)
            goto L_0x013f
        L_0x0137:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'dateStart' to null."
            r13.<init>(r14)
            throw r13
        L_0x013f:
            java.lang.String r1 = "dateEnd"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x015d
            boolean r6 = r14.isNull(r1)
            if (r6 != 0) goto L_0x0155
            long r6 = r14.getLong(r1)
            r0.realmSet$dateEnd(r6)
            goto L_0x015d
        L_0x0155:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'dateEnd' to null."
            r13.<init>(r14)
            throw r13
        L_0x015d:
            java.lang.String r1 = "dateFinish"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x017b
            boolean r6 = r14.isNull(r1)
            if (r6 != 0) goto L_0x0173
            long r6 = r14.getLong(r1)
            r0.realmSet$dateFinish(r6)
            goto L_0x017b
        L_0x0173:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'dateFinish' to null."
            r13.<init>(r14)
            throw r13
        L_0x017b:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0196
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x018b
            r0.realmSet$ticketState(r2)
            goto L_0x0196
        L_0x018b:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketState r1 = p046io.realm.C4726x470e297.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketState(r1)
        L_0x0196:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x01b1
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x01a6
            r0.realmSet$ticketObject(r2)
            goto L_0x01b1
        L_0x01a6:
            org.json.JSONObject r1 = r14.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketObject r13 = p046io.realm.C4720x13bb7c97.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$ticketObject(r13)
        L_0x01b1:
            java.lang.String r13 = "sectionId"
            boolean r15 = r14.has(r13)
            if (r15 == 0) goto L_0x01ca
            boolean r15 = r14.isNull(r13)
            if (r15 == 0) goto L_0x01c3
            r0.realmSet$sectionId(r2)
            goto L_0x01ca
        L_0x01c3:
            java.lang.String r13 = r14.getString(r13)
            r0.realmSet$sectionId(r13)
        L_0x01ca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4718xb56c6186.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo");
    }

    public static TicketInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketInfo ticketInfo = new TicketInfo();
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$id(jsonReader.nextInt());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals(CardFragment.ARG_NUMBER)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$number(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$number((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$text((String) null);
                }
            } else if (nextName.equals("ticketUrgency")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketUrgency((TicketUrgency) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketUrgency(C4728x7291458f.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals(CardFragment.ARG_DATE_START)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$dateStart(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateStart' to null.");
                }
            } else if (nextName.equals(CardFragment.ARG_DATE_END)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$dateEnd(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateEnd' to null.");
                }
            } else if (nextName.equals("dateFinish")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$dateFinish(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'dateFinish' to null.");
                }
            } else if (nextName.equals("ticketState")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketState((TicketState) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketState(C4726x470e297.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("ticketObject")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketObject((TicketObject) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketObject(C4720x13bb7c97.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("sectionId")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$sectionId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$sectionId((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (TicketInfo) realm.copyToRealm(ticketInfo, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4718xb56c6186 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class), false, Collections.emptyList());
        C4718xb56c6186 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxy = new C4718xb56c6186();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4718xb56c6186.TicketInfoColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008d
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxyInterface r5 = (p046io.realm.C4719xebc98253) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy     // Catch:{ all -> 0x0088 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009f
        L_0x009b:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4718xb56c6186.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketInfoRealmProxy$TicketInfoColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo");
    }

    public static TicketInfo copy(Realm realm, TicketInfoColumnInfo ticketInfoColumnInfo, TicketInfo ticketInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketInfo);
        if (realmObjectProxy != null) {
            return (TicketInfo) realmObjectProxy;
        }
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketInfo.class), ticketInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketInfoColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(ticketInfoColumnInfo.numberIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$number());
        osObjectBuilder.addString(ticketInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(ticketInfoColumnInfo.textIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$text());
        osObjectBuilder.addInteger(ticketInfoColumnInfo.dateStartIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateStart()));
        osObjectBuilder.addInteger(ticketInfoColumnInfo.dateEndIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateEnd()));
        osObjectBuilder.addInteger(ticketInfoColumnInfo.dateFinishIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateFinish()));
        osObjectBuilder.addString(ticketInfoColumnInfo.sectionIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$sectionId());
        C4718xb56c6186 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketInfo, newProxyInstance);
        TicketUrgency realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketUrgency();
        if (realmGet$ticketUrgency == null) {
            newProxyInstance.realmSet$ticketUrgency((TicketUrgency) null);
        } else {
            TicketUrgency ticketUrgency = (TicketUrgency) map.get(realmGet$ticketUrgency);
            if (ticketUrgency != null) {
                newProxyInstance.realmSet$ticketUrgency(ticketUrgency);
            } else {
                newProxyInstance.realmSet$ticketUrgency(C4728x7291458f.copyOrUpdate(realm, (C4728x7291458f.TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class), realmGet$ticketUrgency, z, map, set));
            }
        }
        TicketState realmGet$ticketState = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketState();
        if (realmGet$ticketState == null) {
            newProxyInstance.realmSet$ticketState((TicketState) null);
        } else {
            TicketState ticketState = (TicketState) map.get(realmGet$ticketState);
            if (ticketState != null) {
                newProxyInstance.realmSet$ticketState(ticketState);
            } else {
                newProxyInstance.realmSet$ticketState(C4726x470e297.copyOrUpdate(realm, (C4726x470e297.TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class), realmGet$ticketState, z, map, set));
            }
        }
        TicketObject realmGet$ticketObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketObject();
        if (realmGet$ticketObject == null) {
            newProxyInstance.realmSet$ticketObject((TicketObject) null);
        } else {
            TicketObject ticketObject = (TicketObject) map.get(realmGet$ticketObject);
            if (ticketObject != null) {
                newProxyInstance.realmSet$ticketObject(ticketObject);
            } else {
                newProxyInstance.realmSet$ticketObject(C4720x13bb7c97.copyOrUpdate(realm, (C4720x13bb7c97.TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class), realmGet$ticketObject, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketInfo ticketInfo, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        TicketInfo ticketInfo2 = ticketInfo;
        Map<RealmModel, Long> map2 = map;
        if (ticketInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TicketInfo.class);
        long nativePtr = table.getNativePtr();
        TicketInfoColumnInfo ticketInfoColumnInfo = (TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class);
        long j3 = ticketInfoColumnInfo.idIndex;
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo2;
        Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
            j2 = j;
        }
        map2.put(ticketInfo2, Long.valueOf(j2));
        String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.numberIndex, j2, realmGet$number, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.textIndex, j2, realmGet$text, false);
        }
        TicketUrgency realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketUrgency();
        if (realmGet$ticketUrgency != null) {
            Long l = map2.get(realmGet$ticketUrgency);
            if (l == null) {
                l = Long.valueOf(C4728x7291458f.insert(realm2, realmGet$ticketUrgency, map2));
            }
            Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketUrgencyIndex, j2, l.longValue(), false);
        }
        long j4 = nativePtr;
        long j5 = j2;
        Table.nativeSetLong(j4, ticketInfoColumnInfo.dateStartIndex, j5, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateStart(), false);
        Table.nativeSetLong(j4, ticketInfoColumnInfo.dateEndIndex, j5, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateEnd(), false);
        Table.nativeSetLong(j4, ticketInfoColumnInfo.dateFinishIndex, j5, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateFinish(), false);
        TicketState realmGet$ticketState = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketState();
        if (realmGet$ticketState != null) {
            Long l2 = map2.get(realmGet$ticketState);
            if (l2 == null) {
                l2 = Long.valueOf(C4726x470e297.insert(realm2, realmGet$ticketState, map2));
            }
            Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketStateIndex, j2, l2.longValue(), false);
        }
        TicketObject realmGet$ticketObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketObject();
        if (realmGet$ticketObject != null) {
            Long l3 = map2.get(realmGet$ticketObject);
            if (l3 == null) {
                l3 = Long.valueOf(C4720x13bb7c97.insert(realm2, realmGet$ticketObject, map2));
            }
            Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketObjectIndex, j2, l3.longValue(), false);
        }
        String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$sectionId();
        if (realmGet$sectionId != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.sectionIdIndex, j2, realmGet$sectionId, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TicketInfo.class);
        long nativePtr = table.getNativePtr();
        TicketInfoColumnInfo ticketInfoColumnInfo = (TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class);
        long j3 = ticketInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            TicketInfo ticketInfo = (TicketInfo) it.next();
            if (!map2.containsKey(ticketInfo)) {
                if (ticketInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo;
                Integer valueOf = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j4 = j;
                map2.put(ticketInfo, Long.valueOf(j4));
                String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.numberIndex, j4, realmGet$number, false);
                } else {
                    j2 = j3;
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.titleIndex, j4, realmGet$title, false);
                }
                String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.textIndex, j4, realmGet$text, false);
                }
                TicketUrgency realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketUrgency();
                if (realmGet$ticketUrgency != null) {
                    Long l = map2.get(realmGet$ticketUrgency);
                    if (l == null) {
                        l = Long.valueOf(C4728x7291458f.insert(realm2, realmGet$ticketUrgency, map2));
                    }
                    table.setLink(ticketInfoColumnInfo.ticketUrgencyIndex, j4, l.longValue(), false);
                }
                long j5 = nativePtr;
                long j6 = j4;
                Table.nativeSetLong(j5, ticketInfoColumnInfo.dateStartIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateStart(), false);
                Table.nativeSetLong(j5, ticketInfoColumnInfo.dateEndIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateEnd(), false);
                Table.nativeSetLong(j5, ticketInfoColumnInfo.dateFinishIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateFinish(), false);
                TicketState realmGet$ticketState = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketState();
                if (realmGet$ticketState != null) {
                    Long l2 = map2.get(realmGet$ticketState);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4726x470e297.insert(realm2, realmGet$ticketState, map2));
                    }
                    table.setLink(ticketInfoColumnInfo.ticketStateIndex, j4, l2.longValue(), false);
                }
                TicketObject realmGet$ticketObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketObject();
                if (realmGet$ticketObject != null) {
                    Long l3 = map2.get(realmGet$ticketObject);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4720x13bb7c97.insert(realm2, realmGet$ticketObject, map2));
                    }
                    table.setLink(ticketInfoColumnInfo.ticketObjectIndex, j4, l3.longValue(), false);
                }
                String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$sectionId();
                if (realmGet$sectionId != null) {
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.sectionIdIndex, j4, realmGet$sectionId, false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketInfo ticketInfo, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        TicketInfo ticketInfo2 = ticketInfo;
        Map<RealmModel, Long> map2 = map;
        if (ticketInfo2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketInfo2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(TicketInfo.class);
        long nativePtr = table.getNativePtr();
        TicketInfoColumnInfo ticketInfoColumnInfo = (TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class);
        long j = ticketInfoColumnInfo.idIndex;
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo2;
        long nativeFindFirstInt = Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()) != null ? Table.nativeFindFirstInt(nativePtr, j, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()) : -1;
        long createRowWithPrimaryKey = nativeFindFirstInt == -1 ? OsObject.createRowWithPrimaryKey(table, j, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id())) : nativeFindFirstInt;
        map2.put(ticketInfo2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.numberIndex, createRowWithPrimaryKey, realmGet$number, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.numberIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.textIndex, createRowWithPrimaryKey, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.textIndex, createRowWithPrimaryKey, false);
        }
        TicketUrgency realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketUrgency();
        if (realmGet$ticketUrgency != null) {
            Long l = map2.get(realmGet$ticketUrgency);
            if (l == null) {
                l = Long.valueOf(C4728x7291458f.insertOrUpdate(realm2, realmGet$ticketUrgency, map2));
            }
            Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketUrgencyIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketInfoColumnInfo.ticketUrgencyIndex, createRowWithPrimaryKey);
        }
        long j2 = nativePtr;
        long j3 = createRowWithPrimaryKey;
        Table.nativeSetLong(j2, ticketInfoColumnInfo.dateStartIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateStart(), false);
        Table.nativeSetLong(j2, ticketInfoColumnInfo.dateEndIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateEnd(), false);
        Table.nativeSetLong(j2, ticketInfoColumnInfo.dateFinishIndex, j3, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateFinish(), false);
        TicketState realmGet$ticketState = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketState();
        if (realmGet$ticketState != null) {
            Long l2 = map2.get(realmGet$ticketState);
            if (l2 == null) {
                l2 = Long.valueOf(C4726x470e297.insertOrUpdate(realm2, realmGet$ticketState, map2));
            }
            Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketStateIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketInfoColumnInfo.ticketStateIndex, createRowWithPrimaryKey);
        }
        TicketObject realmGet$ticketObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketObject();
        if (realmGet$ticketObject != null) {
            Long l3 = map2.get(realmGet$ticketObject);
            if (l3 == null) {
                l3 = Long.valueOf(C4720x13bb7c97.insertOrUpdate(realm2, realmGet$ticketObject, map2));
            }
            Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketObjectIndex, createRowWithPrimaryKey, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, ticketInfoColumnInfo.ticketObjectIndex, createRowWithPrimaryKey);
        }
        String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$sectionId();
        if (realmGet$sectionId != null) {
            Table.nativeSetString(nativePtr, ticketInfoColumnInfo.sectionIdIndex, createRowWithPrimaryKey, realmGet$sectionId, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.sectionIdIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(TicketInfo.class);
        long nativePtr = table.getNativePtr();
        TicketInfoColumnInfo ticketInfoColumnInfo = (TicketInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketInfo.class);
        long j3 = ticketInfoColumnInfo.idIndex;
        while (it.hasNext()) {
            TicketInfo ticketInfo = (TicketInfo) it.next();
            if (!map2.containsKey(ticketInfo)) {
                if (ticketInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo;
                if (Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$id()));
                }
                long j4 = j;
                map2.put(ticketInfo, Long.valueOf(j4));
                String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.numberIndex, j4, realmGet$number, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.numberIndex, j4, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.titleIndex, j4, false);
                }
                String realmGet$text = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.textIndex, j4, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.textIndex, j4, false);
                }
                TicketUrgency realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketUrgency();
                if (realmGet$ticketUrgency != null) {
                    Long l = map2.get(realmGet$ticketUrgency);
                    if (l == null) {
                        l = Long.valueOf(C4728x7291458f.insertOrUpdate(realm2, realmGet$ticketUrgency, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketUrgencyIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketInfoColumnInfo.ticketUrgencyIndex, j4);
                }
                long j5 = nativePtr;
                long j6 = j4;
                Table.nativeSetLong(j5, ticketInfoColumnInfo.dateStartIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateStart(), false);
                Table.nativeSetLong(j5, ticketInfoColumnInfo.dateEndIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateEnd(), false);
                Table.nativeSetLong(j5, ticketInfoColumnInfo.dateFinishIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$dateFinish(), false);
                TicketState realmGet$ticketState = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketState();
                if (realmGet$ticketState != null) {
                    Long l2 = map2.get(realmGet$ticketState);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4726x470e297.insertOrUpdate(realm2, realmGet$ticketState, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketStateIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketInfoColumnInfo.ticketStateIndex, j4);
                }
                TicketObject realmGet$ticketObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$ticketObject();
                if (realmGet$ticketObject != null) {
                    Long l3 = map2.get(realmGet$ticketObject);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4720x13bb7c97.insertOrUpdate(realm2, realmGet$ticketObject, map2));
                    }
                    Table.nativeSetLink(nativePtr, ticketInfoColumnInfo.ticketObjectIndex, j4, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, ticketInfoColumnInfo.ticketObjectIndex, j4);
                }
                String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmGet$sectionId();
                if (realmGet$sectionId != null) {
                    Table.nativeSetString(nativePtr, ticketInfoColumnInfo.sectionIdIndex, j4, realmGet$sectionId, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketInfoColumnInfo.sectionIdIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static TicketInfo createDetachedCopy(TicketInfo ticketInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketInfo ticketInfo2;
        if (i > i2 || ticketInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketInfo);
        if (cacheData == null) {
            ticketInfo2 = new TicketInfo();
            map.put(ticketInfo, new RealmObjectProxy.CacheData(i, ticketInfo2));
        } else if (i >= cacheData.minDepth) {
            return (TicketInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketInfo2 = (TicketInfo) cacheData.object;
        }
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo2;
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2 = ticketInfo;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$number(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$number());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$text(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$text());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketUrgency(C4728x7291458f.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$ticketUrgency(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$dateStart(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$dateStart());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$dateEnd(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$dateEnd());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$dateFinish(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$dateFinish());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketState(C4726x470e297.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$ticketState(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$ticketObject(C4720x13bb7c97.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$ticketObject(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface.realmSet$sectionId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$sectionId());
        return ticketInfo2;
    }

    static TicketInfo update(Realm realm, TicketInfoColumnInfo ticketInfoColumnInfo, TicketInfo ticketInfo, TicketInfo ticketInfo2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface = ticketInfo;
        C4719xebc98253 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2 = ticketInfo2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketInfo.class), ticketInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketInfoColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(ticketInfoColumnInfo.numberIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$number());
        osObjectBuilder.addString(ticketInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(ticketInfoColumnInfo.textIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$text());
        TicketUrgency realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$ticketUrgency();
        if (realmGet$ticketUrgency == null) {
            osObjectBuilder.addNull(ticketInfoColumnInfo.ticketUrgencyIndex);
        } else {
            TicketUrgency ticketUrgency = (TicketUrgency) map.get(realmGet$ticketUrgency);
            if (ticketUrgency != null) {
                osObjectBuilder.addObject(ticketInfoColumnInfo.ticketUrgencyIndex, ticketUrgency);
            } else {
                osObjectBuilder.addObject(ticketInfoColumnInfo.ticketUrgencyIndex, C4728x7291458f.copyOrUpdate(realm, (C4728x7291458f.TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class), realmGet$ticketUrgency, true, map, set));
            }
        }
        osObjectBuilder.addInteger(ticketInfoColumnInfo.dateStartIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$dateStart()));
        osObjectBuilder.addInteger(ticketInfoColumnInfo.dateEndIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$dateEnd()));
        osObjectBuilder.addInteger(ticketInfoColumnInfo.dateFinishIndex, Long.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$dateFinish()));
        TicketState realmGet$ticketState = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$ticketState();
        if (realmGet$ticketState == null) {
            osObjectBuilder.addNull(ticketInfoColumnInfo.ticketStateIndex);
        } else {
            TicketState ticketState = (TicketState) map.get(realmGet$ticketState);
            if (ticketState != null) {
                osObjectBuilder.addObject(ticketInfoColumnInfo.ticketStateIndex, ticketState);
            } else {
                osObjectBuilder.addObject(ticketInfoColumnInfo.ticketStateIndex, C4726x470e297.copyOrUpdate(realm, (C4726x470e297.TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class), realmGet$ticketState, true, map, set));
            }
        }
        TicketObject realmGet$ticketObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$ticketObject();
        if (realmGet$ticketObject == null) {
            osObjectBuilder.addNull(ticketInfoColumnInfo.ticketObjectIndex);
        } else {
            TicketObject ticketObject = (TicketObject) map.get(realmGet$ticketObject);
            if (ticketObject != null) {
                osObjectBuilder.addObject(ticketInfoColumnInfo.ticketObjectIndex, ticketObject);
            } else {
                osObjectBuilder.addObject(ticketInfoColumnInfo.ticketObjectIndex, C4720x13bb7c97.copyOrUpdate(realm, (C4720x13bb7c97.TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class), realmGet$ticketObject, true, map, set));
            }
        }
        osObjectBuilder.addString(ticketInfoColumnInfo.sectionIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxyinterface2.realmGet$sectionId());
        osObjectBuilder.updateExistingObject();
        return ticketInfo;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketInfo = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{number:");
        String str = "null";
        sb.append(realmGet$number() != null ? realmGet$number() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(realmGet$text() != null ? realmGet$text() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketUrgency:");
        sb.append(realmGet$ticketUrgency() != null ? C4728x7291458f.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dateStart:");
        sb.append(realmGet$dateStart());
        sb.append("}");
        sb.append(",");
        sb.append("{dateEnd:");
        sb.append(realmGet$dateEnd());
        sb.append("}");
        sb.append(",");
        sb.append("{dateFinish:");
        sb.append(realmGet$dateFinish());
        sb.append("}");
        sb.append(",");
        sb.append("{ticketState:");
        sb.append(realmGet$ticketState() != null ? C4726x470e297.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketObject:");
        sb.append(realmGet$ticketObject() != null ? C4720x13bb7c97.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{sectionId:");
        if (realmGet$sectionId() != null) {
            str = realmGet$sectionId();
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
        C4718xb56c6186 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxy = (C4718xb56c6186) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketinforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
