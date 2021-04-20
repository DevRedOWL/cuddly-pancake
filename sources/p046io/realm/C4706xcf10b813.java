package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceFile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceMessages;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketRating;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject;
import p046io.realm.BaseRealm;
import p046io.realm.C4702x12a70883;
import p046io.realm.C4704x27ddec53;
import p046io.realm.C4724xb050ad75;
import p046io.realm.C4746x72770240;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy */
public class C4706xcf10b813 extends ServiceTicket implements RealmObjectProxy, C4707xa3193a66 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServiceTicketColumnInfo columnInfo;
    private RealmList<ServiceFile> fileListRealmList;
    private RealmList<ServiceMessages> messageListRealmList;
    private ProxyState<ServiceTicket> proxyState;
    private RealmList<TicketRating> ratingListRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ServiceTicket";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy$ServiceTicketColumnInfo */
    static final class ServiceTicketColumnInfo extends ColumnInfo {
        long chatIdIndex;
        long cityIndex;
        long fileListIndex;
        long maxColumnIndexValue;
        long messageLastMessageIndex;
        long messageListIndex;
        long numberIndex;
        long objectIdIndex;
        long objectTitleIndex;
        long objectTypeIndex;
        long objectTypeNameIndex;
        long performerEmailIndex;
        long performerFioIndex;
        long performerIdIndex;
        long performerPhoneIndex;
        long ratingIndex;
        long ratingListIndex;
        long rentInfoObjectIndex;
        long sectionIdIndex;
        long ticketAddressIndex;
        long ticketApartmentIndex;
        long ticketDtEndIndex;
        long ticketDtFinishIndex;
        long ticketDtStartIndex;
        long ticketIdIndex;
        long ticketStateIdIndex;
        long ticketStateTitleIndex;
        long ticketTextIndex;
        long ticketTitleIndex;
        long ticketTypeIndex;
        long ticketTypeSlugIndex;
        long ticketTypeTitleIndex;
        long ticketUrgencyIdIndex;
        long ticketUrgencyIndex;
        long unreadIndex;
        long userdataEmailIndex;
        long userdataFioIndex;
        long userdataIdIndex;
        long userdataPhoneIndex;

        ServiceTicketColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(38);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.ticketIdIndex = addColumnDetails("ticketId", "ticketId", objectSchemaInfo);
            this.numberIndex = addColumnDetails(CardFragment.ARG_NUMBER, CardFragment.ARG_NUMBER, objectSchemaInfo);
            this.userdataIdIndex = addColumnDetails("userdataId", "userdataId", objectSchemaInfo);
            this.performerIdIndex = addColumnDetails("performerId", "performerId", objectSchemaInfo);
            this.ticketStateIdIndex = addColumnDetails("ticketStateId", "ticketStateId", objectSchemaInfo);
            this.ticketStateTitleIndex = addColumnDetails("ticketStateTitle", "ticketStateTitle", objectSchemaInfo);
            this.ticketDtStartIndex = addColumnDetails("ticketDtStart", "ticketDtStart", objectSchemaInfo);
            this.ticketDtEndIndex = addColumnDetails("ticketDtEnd", "ticketDtEnd", objectSchemaInfo);
            this.ticketDtFinishIndex = addColumnDetails("ticketDtFinish", "ticketDtFinish", objectSchemaInfo);
            this.ticketTitleIndex = addColumnDetails("ticketTitle", "ticketTitle", objectSchemaInfo);
            this.ticketTextIndex = addColumnDetails("ticketText", "ticketText", objectSchemaInfo);
            this.ticketUrgencyIdIndex = addColumnDetails("ticketUrgencyId", "ticketUrgencyId", objectSchemaInfo);
            this.chatIdIndex = addColumnDetails("chatId", "chatId", objectSchemaInfo);
            this.ticketApartmentIndex = addColumnDetails("ticketApartment", "ticketApartment", objectSchemaInfo);
            this.sectionIdIndex = addColumnDetails("sectionId", "sectionId", objectSchemaInfo);
            this.userdataFioIndex = addColumnDetails("userdataFio", "userdataFio", objectSchemaInfo);
            this.userdataPhoneIndex = addColumnDetails("userdataPhone", "userdataPhone", objectSchemaInfo);
            this.userdataEmailIndex = addColumnDetails("userdataEmail", "userdataEmail", objectSchemaInfo);
            this.ticketAddressIndex = addColumnDetails("ticketAddress", "ticketAddress", objectSchemaInfo);
            this.performerFioIndex = addColumnDetails("performerFio", "performerFio", objectSchemaInfo);
            this.performerEmailIndex = addColumnDetails("performerEmail", "performerEmail", objectSchemaInfo);
            this.performerPhoneIndex = addColumnDetails("performerPhone", "performerPhone", objectSchemaInfo);
            this.ticketUrgencyIndex = addColumnDetails("ticketUrgency", "ticketUrgency", objectSchemaInfo);
            this.ticketTypeIndex = addColumnDetails("ticketType", "ticketType", objectSchemaInfo);
            this.ticketTypeSlugIndex = addColumnDetails("ticketTypeSlug", "ticketTypeSlug", objectSchemaInfo);
            this.ticketTypeTitleIndex = addColumnDetails("ticketTypeTitle", "ticketTypeTitle", objectSchemaInfo);
            this.messageLastMessageIndex = addColumnDetails("messageLastMessage", "messageLastMessage", objectSchemaInfo);
            this.cityIndex = addColumnDetails("city", "city", objectSchemaInfo);
            this.objectIdIndex = addColumnDetails("objectId", "objectId", objectSchemaInfo);
            this.objectTitleIndex = addColumnDetails("objectTitle", "objectTitle", objectSchemaInfo);
            this.objectTypeIndex = addColumnDetails("objectType", "objectType", objectSchemaInfo);
            this.objectTypeNameIndex = addColumnDetails("objectTypeName", "objectTypeName", objectSchemaInfo);
            this.rentInfoObjectIndex = addColumnDetails("rentInfoObject", "rentInfoObject", objectSchemaInfo);
            this.unreadIndex = addColumnDetails("unread", "unread", objectSchemaInfo);
            this.fileListIndex = addColumnDetails("fileList", "fileList", objectSchemaInfo);
            this.messageListIndex = addColumnDetails("messageList", "messageList", objectSchemaInfo);
            this.ratingListIndex = addColumnDetails("ratingList", "ratingList", objectSchemaInfo);
            this.ratingIndex = addColumnDetails("rating", "rating", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServiceTicketColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServiceTicketColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServiceTicketColumnInfo serviceTicketColumnInfo = (ServiceTicketColumnInfo) columnInfo;
            ServiceTicketColumnInfo serviceTicketColumnInfo2 = (ServiceTicketColumnInfo) columnInfo2;
            serviceTicketColumnInfo2.ticketIdIndex = serviceTicketColumnInfo.ticketIdIndex;
            serviceTicketColumnInfo2.numberIndex = serviceTicketColumnInfo.numberIndex;
            serviceTicketColumnInfo2.userdataIdIndex = serviceTicketColumnInfo.userdataIdIndex;
            serviceTicketColumnInfo2.performerIdIndex = serviceTicketColumnInfo.performerIdIndex;
            serviceTicketColumnInfo2.ticketStateIdIndex = serviceTicketColumnInfo.ticketStateIdIndex;
            serviceTicketColumnInfo2.ticketStateTitleIndex = serviceTicketColumnInfo.ticketStateTitleIndex;
            serviceTicketColumnInfo2.ticketDtStartIndex = serviceTicketColumnInfo.ticketDtStartIndex;
            serviceTicketColumnInfo2.ticketDtEndIndex = serviceTicketColumnInfo.ticketDtEndIndex;
            serviceTicketColumnInfo2.ticketDtFinishIndex = serviceTicketColumnInfo.ticketDtFinishIndex;
            serviceTicketColumnInfo2.ticketTitleIndex = serviceTicketColumnInfo.ticketTitleIndex;
            serviceTicketColumnInfo2.ticketTextIndex = serviceTicketColumnInfo.ticketTextIndex;
            serviceTicketColumnInfo2.ticketUrgencyIdIndex = serviceTicketColumnInfo.ticketUrgencyIdIndex;
            serviceTicketColumnInfo2.chatIdIndex = serviceTicketColumnInfo.chatIdIndex;
            serviceTicketColumnInfo2.ticketApartmentIndex = serviceTicketColumnInfo.ticketApartmentIndex;
            serviceTicketColumnInfo2.sectionIdIndex = serviceTicketColumnInfo.sectionIdIndex;
            serviceTicketColumnInfo2.userdataFioIndex = serviceTicketColumnInfo.userdataFioIndex;
            serviceTicketColumnInfo2.userdataPhoneIndex = serviceTicketColumnInfo.userdataPhoneIndex;
            serviceTicketColumnInfo2.userdataEmailIndex = serviceTicketColumnInfo.userdataEmailIndex;
            serviceTicketColumnInfo2.ticketAddressIndex = serviceTicketColumnInfo.ticketAddressIndex;
            serviceTicketColumnInfo2.performerFioIndex = serviceTicketColumnInfo.performerFioIndex;
            serviceTicketColumnInfo2.performerEmailIndex = serviceTicketColumnInfo.performerEmailIndex;
            serviceTicketColumnInfo2.performerPhoneIndex = serviceTicketColumnInfo.performerPhoneIndex;
            serviceTicketColumnInfo2.ticketUrgencyIndex = serviceTicketColumnInfo.ticketUrgencyIndex;
            serviceTicketColumnInfo2.ticketTypeIndex = serviceTicketColumnInfo.ticketTypeIndex;
            serviceTicketColumnInfo2.ticketTypeSlugIndex = serviceTicketColumnInfo.ticketTypeSlugIndex;
            serviceTicketColumnInfo2.ticketTypeTitleIndex = serviceTicketColumnInfo.ticketTypeTitleIndex;
            serviceTicketColumnInfo2.messageLastMessageIndex = serviceTicketColumnInfo.messageLastMessageIndex;
            serviceTicketColumnInfo2.cityIndex = serviceTicketColumnInfo.cityIndex;
            serviceTicketColumnInfo2.objectIdIndex = serviceTicketColumnInfo.objectIdIndex;
            serviceTicketColumnInfo2.objectTitleIndex = serviceTicketColumnInfo.objectTitleIndex;
            serviceTicketColumnInfo2.objectTypeIndex = serviceTicketColumnInfo.objectTypeIndex;
            serviceTicketColumnInfo2.objectTypeNameIndex = serviceTicketColumnInfo.objectTypeNameIndex;
            serviceTicketColumnInfo2.rentInfoObjectIndex = serviceTicketColumnInfo.rentInfoObjectIndex;
            serviceTicketColumnInfo2.unreadIndex = serviceTicketColumnInfo.unreadIndex;
            serviceTicketColumnInfo2.fileListIndex = serviceTicketColumnInfo.fileListIndex;
            serviceTicketColumnInfo2.messageListIndex = serviceTicketColumnInfo.messageListIndex;
            serviceTicketColumnInfo2.ratingListIndex = serviceTicketColumnInfo.ratingListIndex;
            serviceTicketColumnInfo2.ratingIndex = serviceTicketColumnInfo.ratingIndex;
            serviceTicketColumnInfo2.maxColumnIndexValue = serviceTicketColumnInfo.maxColumnIndexValue;
        }
    }

    C4706xcf10b813() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServiceTicketColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$ticketId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketIdIndex);
    }

    public void realmSet$ticketId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'ticketId' cannot be changed after object was created.");
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

    public String realmGet$userdataId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userdataIdIndex);
    }

    public void realmSet$userdataId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userdataIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userdataIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userdataIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userdataIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$performerId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.performerIdIndex);
    }

    public void realmSet$performerId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.performerIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.performerIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.performerIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.performerIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketStateId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketStateIdIndex);
    }

    public void realmSet$ticketStateId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketStateIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketStateIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketStateIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketStateIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketStateTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketStateTitleIndex);
    }

    public void realmSet$ticketStateTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketStateTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketStateTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketStateTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketStateTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketDtStart() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketDtStartIndex);
    }

    public void realmSet$ticketDtStart(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketDtStartIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketDtStartIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketDtStartIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketDtStartIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketDtEnd() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketDtEndIndex);
    }

    public void realmSet$ticketDtEnd(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketDtEndIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketDtEndIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketDtEndIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketDtEndIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketDtFinish() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketDtFinishIndex);
    }

    public void realmSet$ticketDtFinish(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketDtFinishIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketDtFinishIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketDtFinishIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketDtFinishIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketTitleIndex);
    }

    public void realmSet$ticketTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketTextIndex);
    }

    public void realmSet$ticketText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketTextIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketTextIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketTextIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketTextIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketUrgencyId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketUrgencyIdIndex);
    }

    public void realmSet$ticketUrgencyId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketUrgencyIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketUrgencyIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketUrgencyIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketUrgencyIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$chatId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.chatIdIndex);
    }

    public void realmSet$chatId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.chatIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.chatIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.chatIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.chatIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketApartment() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketApartmentIndex);
    }

    public void realmSet$ticketApartment(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketApartmentIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketApartmentIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketApartmentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketApartmentIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$userdataFio() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userdataFioIndex);
    }

    public void realmSet$userdataFio(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userdataFioIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userdataFioIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userdataFioIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userdataFioIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$userdataPhone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userdataPhoneIndex);
    }

    public void realmSet$userdataPhone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userdataPhoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userdataPhoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userdataPhoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userdataPhoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$userdataEmail() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userdataEmailIndex);
    }

    public void realmSet$userdataEmail(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userdataEmailIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userdataEmailIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userdataEmailIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userdataEmailIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketAddressIndex);
    }

    public void realmSet$ticketAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketAddressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketAddressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketAddressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketAddressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$performerFio() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.performerFioIndex);
    }

    public void realmSet$performerFio(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.performerFioIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.performerFioIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.performerFioIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.performerFioIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$performerEmail() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.performerEmailIndex);
    }

    public void realmSet$performerEmail(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.performerEmailIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.performerEmailIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.performerEmailIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.performerEmailIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$performerPhone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.performerPhoneIndex);
    }

    public void realmSet$performerPhone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.performerPhoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.performerPhoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.performerPhoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.performerPhoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketUrgency() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketUrgencyIndex);
    }

    public void realmSet$ticketUrgency(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketUrgencyIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketUrgencyIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketUrgencyIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketUrgencyIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketTypeIndex);
    }

    public void realmSet$ticketType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketTypeSlug() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketTypeSlugIndex);
    }

    public void realmSet$ticketTypeSlug(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketTypeSlugIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketTypeSlugIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketTypeSlugIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketTypeSlugIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ticketTypeTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ticketTypeTitleIndex);
    }

    public void realmSet$ticketTypeTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ticketTypeTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ticketTypeTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ticketTypeTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ticketTypeTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$messageLastMessage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.messageLastMessageIndex);
    }

    public void realmSet$messageLastMessage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.messageLastMessageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.messageLastMessageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.messageLastMessageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.messageLastMessageIndex, row$realm.getIndex(), str, true);
            }
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

    public int realmGet$objectId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.objectIdIndex);
    }

    public void realmSet$objectId(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.objectIdIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.objectIdIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$objectTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.objectTitleIndex);
    }

    public void realmSet$objectTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.objectTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.objectTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.objectTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.objectTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$objectType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.objectTypeIndex);
    }

    public void realmSet$objectType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.objectTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.objectTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.objectTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.objectTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$objectTypeName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.objectTypeNameIndex);
    }

    public void realmSet$objectTypeName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.objectTypeNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.objectTypeNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.objectTypeNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.objectTypeNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RentInfoObject realmGet$rentInfoObject() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.rentInfoObjectIndex)) {
            return null;
        }
        return (RentInfoObject) this.proxyState.getRealm$realm().get(RentInfoObject.class, this.proxyState.getRow$realm().getLink(this.columnInfo.rentInfoObjectIndex), false, Collections.emptyList());
    }

    public void realmSet$rentInfoObject(RentInfoObject rentInfoObject) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (rentInfoObject == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.rentInfoObjectIndex);
                return;
            }
            this.proxyState.checkValidObject(rentInfoObject);
            this.proxyState.getRow$realm().setLink(this.columnInfo.rentInfoObjectIndex, ((RealmObjectProxy) rentInfoObject).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("rentInfoObject")) {
            if (rentInfoObject != null && !RealmObject.isManaged(rentInfoObject)) {
                rentInfoObject = (RentInfoObject) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(rentInfoObject, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (rentInfoObject == null) {
                row$realm.nullifyLink(this.columnInfo.rentInfoObjectIndex);
                return;
            }
            this.proxyState.checkValidObject(rentInfoObject);
            row$realm.getTable().setLink(this.columnInfo.rentInfoObjectIndex, row$realm.getIndex(), ((RealmObjectProxy) rentInfoObject).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public String realmGet$unread() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.unreadIndex);
    }

    public void realmSet$unread(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.unreadIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.unreadIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.unreadIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.unreadIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<ServiceFile> realmGet$fileList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<ServiceFile> realmList = this.fileListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.fileListRealmList = new RealmList<>(ServiceFile.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.fileListIndex), this.proxyState.getRealm$realm());
        return this.fileListRealmList;
    }

    public void realmSet$fileList(RealmList<ServiceFile> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("fileList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<ServiceFile> realmList2 = new RealmList<>();
                Iterator<ServiceFile> it = realmList.iterator();
                while (it.hasNext()) {
                    ServiceFile next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.fileListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    ServiceFile serviceFile = realmList.get(i);
                    this.proxyState.checkValidObject(serviceFile);
                    modelList.addRow(((RealmObjectProxy) serviceFile).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            ServiceFile serviceFile2 = realmList.get(i);
            this.proxyState.checkValidObject(serviceFile2);
            modelList.setRow((long) i, ((RealmObjectProxy) serviceFile2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<ServiceMessages> realmGet$messageList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<ServiceMessages> realmList = this.messageListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.messageListRealmList = new RealmList<>(ServiceMessages.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.messageListIndex), this.proxyState.getRealm$realm());
        return this.messageListRealmList;
    }

    public void realmSet$messageList(RealmList<ServiceMessages> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("messageList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<ServiceMessages> realmList2 = new RealmList<>();
                Iterator<ServiceMessages> it = realmList.iterator();
                while (it.hasNext()) {
                    ServiceMessages next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.messageListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    ServiceMessages serviceMessages = realmList.get(i);
                    this.proxyState.checkValidObject(serviceMessages);
                    modelList.addRow(((RealmObjectProxy) serviceMessages).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            ServiceMessages serviceMessages2 = realmList.get(i);
            this.proxyState.checkValidObject(serviceMessages2);
            modelList.setRow((long) i, ((RealmObjectProxy) serviceMessages2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<TicketRating> realmGet$ratingList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<TicketRating> realmList = this.ratingListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.ratingListRealmList = new RealmList<>(TicketRating.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.ratingListIndex), this.proxyState.getRealm$realm());
        return this.ratingListRealmList;
    }

    public void realmSet$ratingList(RealmList<TicketRating> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("ratingList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<TicketRating> realmList2 = new RealmList<>();
                Iterator<TicketRating> it = realmList.iterator();
                while (it.hasNext()) {
                    TicketRating next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.ratingListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    TicketRating ticketRating = realmList.get(i);
                    this.proxyState.checkValidObject(ticketRating);
                    modelList.addRow(((RealmObjectProxy) ticketRating).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            TicketRating ticketRating2 = realmList.get(i);
            this.proxyState.checkValidObject(ticketRating2);
            modelList.setRow((long) i, ((RealmObjectProxy) ticketRating2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Float realmGet$rating() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.ratingIndex)) {
            return null;
        }
        return Float.valueOf(this.proxyState.getRow$realm().getFloat(this.columnInfo.ratingIndex));
    }

    public void realmSet$rating(Float f) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (f == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ratingIndex);
            } else {
                this.proxyState.getRow$realm().setFloat(this.columnInfo.ratingIndex, f.floatValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (f == null) {
                row$realm.getTable().setNull(this.columnInfo.ratingIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setFloat(this.columnInfo.ratingIndex, row$realm.getIndex(), f.floatValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 38, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("ticketId", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty(CardFragment.ARG_NUMBER, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("userdataId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("performerId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketStateId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketStateTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketDtStart", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketDtEnd", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketDtFinish", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketText", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketUrgencyId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("chatId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketApartment", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sectionId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("userdataFio", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("userdataPhone", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("userdataEmail", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketAddress", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("performerFio", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("performerEmail", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("performerPhone", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketUrgency", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketTypeSlug", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ticketTypeTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("messageLastMessage", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("city", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("objectId", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("objectTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("objectType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("objectTypeName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("rentInfoObject", RealmFieldType.OBJECT, C4746x72770240.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("unread", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("fileList", RealmFieldType.LIST, C4702x12a70883.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("messageList", RealmFieldType.LIST, C4704x27ddec53.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("ratingList", RealmFieldType.LIST, C4724xb050ad75.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("rating", RealmFieldType.FLOAT, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServiceTicketColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServiceTicketColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0405  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = "ticketId"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy$ServiceTicketColumnInfo r4 = (p046io.realm.C4706xcf10b813.ServiceTicketColumnInfo) r4
            long r4 = r4.ticketIdIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            java.lang.String r6 = r14.getString(r1)
            long r4 = r3.findFirstString(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy r3 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r3 = r2
        L_0x0067:
            java.lang.String r4 = "ratingList"
            java.lang.String r5 = "messageList"
            java.lang.String r6 = "fileList"
            java.lang.String r7 = "rentInfoObject"
            if (r3 != 0) goto L_0x00c2
            boolean r3 = r14.has(r7)
            if (r3 == 0) goto L_0x007a
            r0.add(r7)
        L_0x007a:
            boolean r3 = r14.has(r6)
            if (r3 == 0) goto L_0x0083
            r0.add(r6)
        L_0x0083:
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x008c
            r0.add(r5)
        L_0x008c:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x0095
            r0.add(r4)
        L_0x0095:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00ba
            boolean r3 = r14.isNull(r1)
            r8 = 1
            if (r3 == 0) goto L_0x00ac
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy r3 = (p046io.realm.C4706xcf10b813) r3
            goto L_0x00c2
        L_0x00ac:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            java.lang.String r1 = r14.getString(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r8, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy r3 = (p046io.realm.C4706xcf10b813) r3
            goto L_0x00c2
        L_0x00ba:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'ticketId'."
            r13.<init>(r14)
            throw r13
        L_0x00c2:
            r0 = r3
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxyInterface r0 = (p046io.realm.C4707xa3193a66) r0
            java.lang.String r1 = "number"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00de
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00d7
            r0.realmSet$number(r2)
            goto L_0x00de
        L_0x00d7:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$number(r1)
        L_0x00de:
            java.lang.String r1 = "userdataId"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x00f8
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x00f1
            r0.realmSet$userdataId(r2)
            goto L_0x00f8
        L_0x00f1:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$userdataId(r1)
        L_0x00f8:
            java.lang.String r1 = "performerId"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0111
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x010a
            r0.realmSet$performerId(r2)
            goto L_0x0111
        L_0x010a:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$performerId(r1)
        L_0x0111:
            java.lang.String r1 = "ticketStateId"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x012a
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0123
            r0.realmSet$ticketStateId(r2)
            goto L_0x012a
        L_0x0123:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketStateId(r1)
        L_0x012a:
            java.lang.String r1 = "ticketStateTitle"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0143
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x013c
            r0.realmSet$ticketStateTitle(r2)
            goto L_0x0143
        L_0x013c:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketStateTitle(r1)
        L_0x0143:
            java.lang.String r1 = "ticketDtStart"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x015c
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0155
            r0.realmSet$ticketDtStart(r2)
            goto L_0x015c
        L_0x0155:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketDtStart(r1)
        L_0x015c:
            java.lang.String r1 = "ticketDtEnd"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x0175
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x016e
            r0.realmSet$ticketDtEnd(r2)
            goto L_0x0175
        L_0x016e:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketDtEnd(r1)
        L_0x0175:
            java.lang.String r1 = "ticketDtFinish"
            boolean r8 = r14.has(r1)
            if (r8 == 0) goto L_0x018e
            boolean r8 = r14.isNull(r1)
            if (r8 == 0) goto L_0x0187
            r0.realmSet$ticketDtFinish(r2)
            goto L_0x018e
        L_0x0187:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketDtFinish(r1)
        L_0x018e:
            java.lang.String r1 = "ticketTitle"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01ab
            java.lang.String r1 = "ticketTitle"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01a2
            r0.realmSet$ticketTitle(r2)
            goto L_0x01ab
        L_0x01a2:
            java.lang.String r1 = "ticketTitle"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketTitle(r1)
        L_0x01ab:
            java.lang.String r1 = "ticketText"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01c8
            java.lang.String r1 = "ticketText"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01bf
            r0.realmSet$ticketText(r2)
            goto L_0x01c8
        L_0x01bf:
            java.lang.String r1 = "ticketText"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketText(r1)
        L_0x01c8:
            java.lang.String r1 = "ticketUrgencyId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x01e5
            java.lang.String r1 = "ticketUrgencyId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01dc
            r0.realmSet$ticketUrgencyId(r2)
            goto L_0x01e5
        L_0x01dc:
            java.lang.String r1 = "ticketUrgencyId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketUrgencyId(r1)
        L_0x01e5:
            java.lang.String r1 = "chatId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0202
            java.lang.String r1 = "chatId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x01f9
            r0.realmSet$chatId(r2)
            goto L_0x0202
        L_0x01f9:
            java.lang.String r1 = "chatId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$chatId(r1)
        L_0x0202:
            java.lang.String r1 = "ticketApartment"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x021f
            java.lang.String r1 = "ticketApartment"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0216
            r0.realmSet$ticketApartment(r2)
            goto L_0x021f
        L_0x0216:
            java.lang.String r1 = "ticketApartment"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketApartment(r1)
        L_0x021f:
            java.lang.String r1 = "sectionId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x023c
            java.lang.String r1 = "sectionId"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0233
            r0.realmSet$sectionId(r2)
            goto L_0x023c
        L_0x0233:
            java.lang.String r1 = "sectionId"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$sectionId(r1)
        L_0x023c:
            java.lang.String r1 = "userdataFio"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x025c
            java.lang.String r1 = "userdataFio"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0252
            r0.realmSet$userdataFio(r2)
            goto L_0x025c
        L_0x0252:
            java.lang.String r1 = "userdataFio"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$userdataFio(r1)
        L_0x025c:
            java.lang.String r1 = "userdataPhone"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x027c
            java.lang.String r1 = "userdataPhone"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0272
            r0.realmSet$userdataPhone(r2)
            goto L_0x027c
        L_0x0272:
            java.lang.String r1 = "userdataPhone"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$userdataPhone(r1)
        L_0x027c:
            java.lang.String r1 = "userdataEmail"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x029c
            java.lang.String r1 = "userdataEmail"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0292
            r0.realmSet$userdataEmail(r2)
            goto L_0x029c
        L_0x0292:
            java.lang.String r1 = "userdataEmail"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$userdataEmail(r1)
        L_0x029c:
            java.lang.String r1 = "ticketAddress"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02b9
            java.lang.String r1 = "ticketAddress"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02b0
            r0.realmSet$ticketAddress(r2)
            goto L_0x02b9
        L_0x02b0:
            java.lang.String r1 = "ticketAddress"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketAddress(r1)
        L_0x02b9:
            java.lang.String r1 = "performerFio"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02d6
            java.lang.String r1 = "performerFio"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02cd
            r0.realmSet$performerFio(r2)
            goto L_0x02d6
        L_0x02cd:
            java.lang.String r1 = "performerFio"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$performerFio(r1)
        L_0x02d6:
            java.lang.String r1 = "performerEmail"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x02f3
            java.lang.String r1 = "performerEmail"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x02ea
            r0.realmSet$performerEmail(r2)
            goto L_0x02f3
        L_0x02ea:
            java.lang.String r1 = "performerEmail"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$performerEmail(r1)
        L_0x02f3:
            java.lang.String r1 = "performerPhone"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0310
            java.lang.String r1 = "performerPhone"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0307
            r0.realmSet$performerPhone(r2)
            goto L_0x0310
        L_0x0307:
            java.lang.String r1 = "performerPhone"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$performerPhone(r1)
        L_0x0310:
            java.lang.String r1 = "ticketUrgency"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x032d
            java.lang.String r1 = "ticketUrgency"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0324
            r0.realmSet$ticketUrgency(r2)
            goto L_0x032d
        L_0x0324:
            java.lang.String r1 = "ticketUrgency"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketUrgency(r1)
        L_0x032d:
            java.lang.String r1 = "ticketType"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x034a
            java.lang.String r1 = "ticketType"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0341
            r0.realmSet$ticketType(r2)
            goto L_0x034a
        L_0x0341:
            java.lang.String r1 = "ticketType"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketType(r1)
        L_0x034a:
            java.lang.String r1 = "ticketTypeSlug"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0367
            java.lang.String r1 = "ticketTypeSlug"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x035e
            r0.realmSet$ticketTypeSlug(r2)
            goto L_0x0367
        L_0x035e:
            java.lang.String r1 = "ticketTypeSlug"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketTypeSlug(r1)
        L_0x0367:
            java.lang.String r1 = "ticketTypeTitle"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0384
            java.lang.String r1 = "ticketTypeTitle"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x037b
            r0.realmSet$ticketTypeTitle(r2)
            goto L_0x0384
        L_0x037b:
            java.lang.String r1 = "ticketTypeTitle"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$ticketTypeTitle(r1)
        L_0x0384:
            java.lang.String r1 = "messageLastMessage"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03a1
            java.lang.String r1 = "messageLastMessage"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0398
            r0.realmSet$messageLastMessage(r2)
            goto L_0x03a1
        L_0x0398:
            java.lang.String r1 = "messageLastMessage"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$messageLastMessage(r1)
        L_0x03a1:
            java.lang.String r1 = "city"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03be
            java.lang.String r1 = "city"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x03b5
            r0.realmSet$city(r2)
            goto L_0x03be
        L_0x03b5:
            java.lang.String r1 = "city"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$city(r1)
        L_0x03be:
            java.lang.String r1 = "objectId"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03e0
            java.lang.String r1 = "objectId"
            boolean r1 = r14.isNull(r1)
            if (r1 != 0) goto L_0x03d8
            java.lang.String r1 = "objectId"
            int r1 = r14.getInt(r1)
            r0.realmSet$objectId(r1)
            goto L_0x03e0
        L_0x03d8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'objectId' to null."
            r13.<init>(r14)
            throw r13
        L_0x03e0:
            java.lang.String r1 = "objectTitle"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x03fd
            java.lang.String r1 = "objectTitle"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x03f4
            r0.realmSet$objectTitle(r2)
            goto L_0x03fd
        L_0x03f4:
            java.lang.String r1 = "objectTitle"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$objectTitle(r1)
        L_0x03fd:
            java.lang.String r1 = "objectType"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x041a
            java.lang.String r1 = "objectType"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0411
            r0.realmSet$objectType(r2)
            goto L_0x041a
        L_0x0411:
            java.lang.String r1 = "objectType"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$objectType(r1)
        L_0x041a:
            java.lang.String r1 = "objectTypeName"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0437
            java.lang.String r1 = "objectTypeName"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x042e
            r0.realmSet$objectTypeName(r2)
            goto L_0x0437
        L_0x042e:
            java.lang.String r1 = "objectTypeName"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$objectTypeName(r1)
        L_0x0437:
            boolean r1 = r14.has(r7)
            if (r1 == 0) goto L_0x0452
            boolean r1 = r14.isNull(r7)
            if (r1 == 0) goto L_0x0447
            r0.realmSet$rentInfoObject(r2)
            goto L_0x0452
        L_0x0447:
            org.json.JSONObject r1 = r14.getJSONObject(r7)
            ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentInfoObject r1 = p046io.realm.C4746x72770240.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$rentInfoObject(r1)
        L_0x0452:
            java.lang.String r1 = "unread"
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L_0x0472
            java.lang.String r1 = "unread"
            boolean r1 = r14.isNull(r1)
            if (r1 == 0) goto L_0x0468
            r0.realmSet$unread(r2)
            goto L_0x0472
        L_0x0468:
            java.lang.String r1 = "unread"
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$unread(r1)
        L_0x0472:
            boolean r1 = r14.has(r6)
            if (r1 == 0) goto L_0x04a6
            boolean r1 = r14.isNull(r6)
            if (r1 == 0) goto L_0x0482
            r0.realmSet$fileList(r2)
            goto L_0x04a6
        L_0x0482:
            io.realm.RealmList r1 = r0.realmGet$fileList()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r6)
            r6 = 0
        L_0x048e:
            int r7 = r1.length()
            if (r6 >= r7) goto L_0x04a6
            org.json.JSONObject r7 = r1.getJSONObject(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceFile r7 = p046io.realm.C4702x12a70883.createOrUpdateUsingJsonObject(r13, r7, r15)
            io.realm.RealmList r8 = r0.realmGet$fileList()
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x048e
        L_0x04a6:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x04da
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x04b6
            r0.realmSet$messageList(r2)
            goto L_0x04da
        L_0x04b6:
            io.realm.RealmList r1 = r0.realmGet$messageList()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r5)
            r5 = 0
        L_0x04c2:
            int r6 = r1.length()
            if (r5 >= r6) goto L_0x04da
            org.json.JSONObject r6 = r1.getJSONObject(r5)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceMessages r6 = p046io.realm.C4704x27ddec53.createOrUpdateUsingJsonObject(r13, r6, r15)
            io.realm.RealmList r7 = r0.realmGet$messageList()
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x04c2
        L_0x04da:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x050e
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x04ea
            r0.realmSet$ratingList(r2)
            goto L_0x050e
        L_0x04ea:
            io.realm.RealmList r1 = r0.realmGet$ratingList()
            r1.clear()
            org.json.JSONArray r1 = r14.getJSONArray(r4)
            r4 = 0
        L_0x04f6:
            int r5 = r1.length()
            if (r4 >= r5) goto L_0x050e
            org.json.JSONObject r5 = r1.getJSONObject(r4)
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketRating r5 = p046io.realm.C4724xb050ad75.createOrUpdateUsingJsonObject(r13, r5, r15)
            io.realm.RealmList r6 = r0.realmGet$ratingList()
            r6.add(r5)
            int r4 = r4 + 1
            goto L_0x04f6
        L_0x050e:
            java.lang.String r13 = "rating"
            boolean r13 = r14.has(r13)
            if (r13 == 0) goto L_0x0530
            java.lang.String r13 = "rating"
            boolean r13 = r14.isNull(r13)
            if (r13 == 0) goto L_0x0522
            r0.realmSet$rating(r2)
            goto L_0x0530
        L_0x0522:
            java.lang.String r13 = "rating"
            double r13 = r14.getDouble(r13)
            float r13 = (float) r13
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            r0.realmSet$rating(r13)
        L_0x0530:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4706xcf10b813.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket");
    }

    public static ServiceTicket createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ServiceTicket serviceTicket = new ServiceTicket();
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("ticketId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketId((String) null);
                }
                z = true;
            } else if (nextName.equals(CardFragment.ARG_NUMBER)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$number(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$number((String) null);
                }
            } else if (nextName.equals("userdataId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataId((String) null);
                }
            } else if (nextName.equals("performerId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerId((String) null);
                }
            } else if (nextName.equals("ticketStateId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketStateId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketStateId((String) null);
                }
            } else if (nextName.equals("ticketStateTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketStateTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketStateTitle((String) null);
                }
            } else if (nextName.equals("ticketDtStart")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtStart(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtStart((String) null);
                }
            } else if (nextName.equals("ticketDtEnd")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtEnd(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtEnd((String) null);
                }
            } else if (nextName.equals("ticketDtFinish")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtFinish(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtFinish((String) null);
                }
            } else if (nextName.equals("ticketTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTitle((String) null);
                }
            } else if (nextName.equals("ticketText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketText((String) null);
                }
            } else if (nextName.equals("ticketUrgencyId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketUrgencyId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketUrgencyId((String) null);
                }
            } else if (nextName.equals("chatId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$chatId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$chatId((String) null);
                }
            } else if (nextName.equals("ticketApartment")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketApartment(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketApartment((String) null);
                }
            } else if (nextName.equals("sectionId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$sectionId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$sectionId((String) null);
                }
            } else if (nextName.equals("userdataFio")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataFio(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataFio((String) null);
                }
            } else if (nextName.equals("userdataPhone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataPhone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataPhone((String) null);
                }
            } else if (nextName.equals("userdataEmail")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataEmail(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataEmail((String) null);
                }
            } else if (nextName.equals("ticketAddress")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketAddress(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketAddress((String) null);
                }
            } else if (nextName.equals("performerFio")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerFio(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerFio((String) null);
                }
            } else if (nextName.equals("performerEmail")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerEmail(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerEmail((String) null);
                }
            } else if (nextName.equals("performerPhone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerPhone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerPhone((String) null);
                }
            } else if (nextName.equals("ticketUrgency")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketUrgency(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketUrgency((String) null);
                }
            } else if (nextName.equals("ticketType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketType((String) null);
                }
            } else if (nextName.equals("ticketTypeSlug")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTypeSlug(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTypeSlug((String) null);
                }
            } else if (nextName.equals("ticketTypeTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTypeTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTypeTitle((String) null);
                }
            } else if (nextName.equals("messageLastMessage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageLastMessage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageLastMessage((String) null);
                }
            } else if (nextName.equals("city")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$city(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$city((String) null);
                }
            } else if (nextName.equals("objectId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectId(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'objectId' to null.");
                }
            } else if (nextName.equals("objectTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectTitle((String) null);
                }
            } else if (nextName.equals("objectType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectType((String) null);
                }
            } else if (nextName.equals("objectTypeName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectTypeName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectTypeName((String) null);
                }
            } else if (nextName.equals("rentInfoObject")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$rentInfoObject((RentInfoObject) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$rentInfoObject(C4746x72770240.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("unread")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$unread(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$unread((String) null);
                }
            } else if (nextName.equals("fileList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$fileList((RealmList<ServiceFile>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$fileList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$fileList().add(C4702x12a70883.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("messageList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageList((RealmList<ServiceMessages>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageList().add(C4704x27ddec53.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("ratingList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ratingList((RealmList<TicketRating>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ratingList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ratingList().add(C4724xb050ad75.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("rating")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$rating(Float.valueOf((float) jsonReader.nextDouble()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$rating((Float) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ServiceTicket) realm.copyToRealm(serviceTicket, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'ticketId'.");
    }

    private static C4706xcf10b813 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicket.class), false, Collections.emptyList());
        C4706xcf10b813 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxy = new C4706xcf10b813();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4706xcf10b813.ServiceTicketColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.ticketIdIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxyInterface r5 = (p046io.realm.C4707xa3193a66) r5
            java.lang.String r5 = r5.realmGet$ticketId()
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4706xcf10b813.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ServiceTicketRealmProxy$ServiceTicketColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket");
    }

    public static ServiceTicket copy(Realm realm, ServiceTicketColumnInfo serviceTicketColumnInfo, ServiceTicket serviceTicket, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        ServiceTicketColumnInfo serviceTicketColumnInfo2 = serviceTicketColumnInfo;
        ServiceTicket serviceTicket2 = serviceTicket;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(serviceTicket2);
        if (realmObjectProxy != null) {
            return (ServiceTicket) realmObjectProxy;
        }
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceTicket.class), serviceTicketColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.numberIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$number());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketStateIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketStateTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketDtStartIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtStart());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketDtEndIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtEnd());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketDtFinishIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtFinish());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTextIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketText());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketUrgencyIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgencyId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.chatIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$chatId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketApartmentIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketApartment());
        osObjectBuilder.addString(serviceTicketColumnInfo2.sectionIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$sectionId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataFioIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataFio());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataPhoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataPhone());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataEmailIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataEmail());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketAddressIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketAddress());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerFioIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerFio());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerEmailIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerEmail());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerPhoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerPhone());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketUrgencyIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgency());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTypeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketType());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTypeSlugIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeSlug());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTypeTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.messageLastMessageIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageLastMessage());
        osObjectBuilder.addString(serviceTicketColumnInfo2.cityIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$city());
        osObjectBuilder.addInteger(serviceTicketColumnInfo2.objectIdIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectId()));
        osObjectBuilder.addString(serviceTicketColumnInfo2.objectTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.objectTypeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectType());
        osObjectBuilder.addString(serviceTicketColumnInfo2.objectTypeNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTypeName());
        osObjectBuilder.addString(serviceTicketColumnInfo2.unreadIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$unread());
        osObjectBuilder.addFloat(serviceTicketColumnInfo2.ratingIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rating());
        C4706xcf10b813 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(serviceTicket2, newProxyInstance);
        RentInfoObject realmGet$rentInfoObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rentInfoObject();
        if (realmGet$rentInfoObject == null) {
            newProxyInstance.realmSet$rentInfoObject((RentInfoObject) null);
        } else {
            RentInfoObject rentInfoObject = (RentInfoObject) map2.get(realmGet$rentInfoObject);
            if (rentInfoObject != null) {
                newProxyInstance.realmSet$rentInfoObject(rentInfoObject);
            } else {
                newProxyInstance.realmSet$rentInfoObject(C4746x72770240.copyOrUpdate(realm, (C4746x72770240.RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class), realmGet$rentInfoObject, z, map, set));
            }
        }
        RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$fileList();
        if (realmGet$fileList != null) {
            RealmList<ServiceFile> realmGet$fileList2 = newProxyInstance.realmGet$fileList();
            realmGet$fileList2.clear();
            for (int i = 0; i < realmGet$fileList.size(); i++) {
                ServiceFile serviceFile = realmGet$fileList.get(i);
                ServiceFile serviceFile2 = (ServiceFile) map2.get(serviceFile);
                if (serviceFile2 != null) {
                    realmGet$fileList2.add(serviceFile2);
                } else {
                    realmGet$fileList2.add(C4702x12a70883.copyOrUpdate(realm, (C4702x12a70883.ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class), serviceFile, z, map, set));
                }
            }
        }
        RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageList();
        if (realmGet$messageList != null) {
            RealmList<ServiceMessages> realmGet$messageList2 = newProxyInstance.realmGet$messageList();
            realmGet$messageList2.clear();
            for (int i2 = 0; i2 < realmGet$messageList.size(); i2++) {
                ServiceMessages serviceMessages = realmGet$messageList.get(i2);
                ServiceMessages serviceMessages2 = (ServiceMessages) map2.get(serviceMessages);
                if (serviceMessages2 != null) {
                    realmGet$messageList2.add(serviceMessages2);
                } else {
                    realmGet$messageList2.add(C4704x27ddec53.copyOrUpdate(realm, (C4704x27ddec53.ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class), serviceMessages, z, map, set));
                }
            }
        }
        RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ratingList();
        if (realmGet$ratingList != null) {
            RealmList<TicketRating> realmGet$ratingList2 = newProxyInstance.realmGet$ratingList();
            realmGet$ratingList2.clear();
            for (int i3 = 0; i3 < realmGet$ratingList.size(); i3++) {
                TicketRating ticketRating = realmGet$ratingList.get(i3);
                TicketRating ticketRating2 = (TicketRating) map2.get(ticketRating);
                if (ticketRating2 != null) {
                    realmGet$ratingList2.add(ticketRating2);
                } else {
                    realmGet$ratingList2.add(C4724xb050ad75.copyOrUpdate(realm, (C4724xb050ad75.TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class), ticketRating, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ServiceTicket serviceTicket, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        ServiceTicket serviceTicket2 = serviceTicket;
        Map<RealmModel, Long> map2 = map;
        if (serviceTicket2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicket2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ServiceTicket.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketColumnInfo serviceTicketColumnInfo = (ServiceTicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicket.class);
        long j5 = serviceTicketColumnInfo.ticketIdIndex;
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket2;
        String realmGet$ticketId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketId();
        if (realmGet$ticketId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j5);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j5, realmGet$ticketId);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j5, realmGet$ticketId);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$ticketId);
            j2 = j;
        }
        map2.put(serviceTicket2, Long.valueOf(j2));
        String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.numberIndex, j2, realmGet$number, false);
        } else {
            j3 = j2;
        }
        String realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataId();
        if (realmGet$userdataId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataIdIndex, j3, realmGet$userdataId, false);
        }
        String realmGet$performerId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerId();
        if (realmGet$performerId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerIdIndex, j3, realmGet$performerId, false);
        }
        String realmGet$ticketStateId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateId();
        if (realmGet$ticketStateId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateIdIndex, j3, realmGet$ticketStateId, false);
        }
        String realmGet$ticketStateTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateTitle();
        if (realmGet$ticketStateTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateTitleIndex, j3, realmGet$ticketStateTitle, false);
        }
        String realmGet$ticketDtStart = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtStart();
        if (realmGet$ticketDtStart != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtStartIndex, j3, realmGet$ticketDtStart, false);
        }
        String realmGet$ticketDtEnd = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtEnd();
        if (realmGet$ticketDtEnd != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtEndIndex, j3, realmGet$ticketDtEnd, false);
        }
        String realmGet$ticketDtFinish = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtFinish();
        if (realmGet$ticketDtFinish != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtFinishIndex, j3, realmGet$ticketDtFinish, false);
        }
        String realmGet$ticketTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTitle();
        if (realmGet$ticketTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTitleIndex, j3, realmGet$ticketTitle, false);
        }
        String realmGet$ticketText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketText();
        if (realmGet$ticketText != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTextIndex, j3, realmGet$ticketText, false);
        }
        String realmGet$ticketUrgencyId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgencyId();
        if (realmGet$ticketUrgencyId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIdIndex, j3, realmGet$ticketUrgencyId, false);
        }
        String realmGet$chatId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$chatId();
        if (realmGet$chatId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.chatIdIndex, j3, realmGet$chatId, false);
        }
        String realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketApartment();
        if (realmGet$ticketApartment != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketApartmentIndex, j3, realmGet$ticketApartment, false);
        }
        String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$sectionId();
        if (realmGet$sectionId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.sectionIdIndex, j3, realmGet$sectionId, false);
        }
        String realmGet$userdataFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataFio();
        if (realmGet$userdataFio != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataFioIndex, j3, realmGet$userdataFio, false);
        }
        String realmGet$userdataPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataPhone();
        if (realmGet$userdataPhone != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataPhoneIndex, j3, realmGet$userdataPhone, false);
        }
        String realmGet$userdataEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataEmail();
        if (realmGet$userdataEmail != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataEmailIndex, j3, realmGet$userdataEmail, false);
        }
        String realmGet$ticketAddress = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketAddress();
        if (realmGet$ticketAddress != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketAddressIndex, j3, realmGet$ticketAddress, false);
        }
        String realmGet$performerFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerFio();
        if (realmGet$performerFio != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerFioIndex, j3, realmGet$performerFio, false);
        }
        String realmGet$performerEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerEmail();
        if (realmGet$performerEmail != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerEmailIndex, j3, realmGet$performerEmail, false);
        }
        String realmGet$performerPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerPhone();
        if (realmGet$performerPhone != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerPhoneIndex, j3, realmGet$performerPhone, false);
        }
        String realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgency();
        if (realmGet$ticketUrgency != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIndex, j3, realmGet$ticketUrgency, false);
        }
        String realmGet$ticketType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketType();
        if (realmGet$ticketType != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeIndex, j3, realmGet$ticketType, false);
        }
        String realmGet$ticketTypeSlug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeSlug();
        if (realmGet$ticketTypeSlug != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeSlugIndex, j3, realmGet$ticketTypeSlug, false);
        }
        String realmGet$ticketTypeTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeTitle();
        if (realmGet$ticketTypeTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeTitleIndex, j3, realmGet$ticketTypeTitle, false);
        }
        String realmGet$messageLastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageLastMessage();
        if (realmGet$messageLastMessage != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.messageLastMessageIndex, j3, realmGet$messageLastMessage, false);
        }
        String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.cityIndex, j3, realmGet$city, false);
        }
        Table.nativeSetLong(nativePtr, serviceTicketColumnInfo.objectIdIndex, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectId(), false);
        String realmGet$objectTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTitle();
        if (realmGet$objectTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTitleIndex, j3, realmGet$objectTitle, false);
        }
        String realmGet$objectType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectType();
        if (realmGet$objectType != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeIndex, j3, realmGet$objectType, false);
        }
        String realmGet$objectTypeName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTypeName();
        if (realmGet$objectTypeName != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeNameIndex, j3, realmGet$objectTypeName, false);
        }
        RentInfoObject realmGet$rentInfoObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rentInfoObject();
        if (realmGet$rentInfoObject != null) {
            Long l = map2.get(realmGet$rentInfoObject);
            if (l == null) {
                l = Long.valueOf(C4746x72770240.insert(realm2, realmGet$rentInfoObject, map2));
            }
            Table.nativeSetLink(nativePtr, serviceTicketColumnInfo.rentInfoObjectIndex, j3, l.longValue(), false);
        }
        String realmGet$unread = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$unread();
        if (realmGet$unread != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.unreadIndex, j3, realmGet$unread, false);
        }
        RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$fileList();
        if (realmGet$fileList != null) {
            j4 = j3;
            OsList osList = new OsList(table.getUncheckedRow(j4), serviceTicketColumnInfo.fileListIndex);
            Iterator<ServiceFile> it = realmGet$fileList.iterator();
            while (it.hasNext()) {
                ServiceFile next = it.next();
                Long l2 = map2.get(next);
                if (l2 == null) {
                    l2 = Long.valueOf(C4702x12a70883.insert(realm2, next, map2));
                }
                osList.addRow(l2.longValue());
            }
        } else {
            j4 = j3;
        }
        RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageList();
        if (realmGet$messageList != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j4), serviceTicketColumnInfo.messageListIndex);
            Iterator<ServiceMessages> it2 = realmGet$messageList.iterator();
            while (it2.hasNext()) {
                ServiceMessages next2 = it2.next();
                Long l3 = map2.get(next2);
                if (l3 == null) {
                    l3 = Long.valueOf(C4704x27ddec53.insert(realm2, next2, map2));
                }
                osList2.addRow(l3.longValue());
            }
        }
        RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ratingList();
        if (realmGet$ratingList != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(j4), serviceTicketColumnInfo.ratingListIndex);
            Iterator<TicketRating> it3 = realmGet$ratingList.iterator();
            while (it3.hasNext()) {
                TicketRating next3 = it3.next();
                Long l4 = map2.get(next3);
                if (l4 == null) {
                    l4 = Long.valueOf(C4724xb050ad75.insert(realm2, next3, map2));
                }
                osList3.addRow(l4.longValue());
            }
        }
        Float realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rating();
        if (realmGet$rating == null) {
            return j4;
        }
        long j6 = j4;
        Table.nativeSetFloat(nativePtr, serviceTicketColumnInfo.ratingIndex, j4, realmGet$rating.floatValue(), false);
        return j6;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ServiceTicket.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketColumnInfo serviceTicketColumnInfo = (ServiceTicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicket.class);
        long j6 = serviceTicketColumnInfo.ticketIdIndex;
        while (it.hasNext()) {
            ServiceTicket serviceTicket = (ServiceTicket) it.next();
            if (!map2.containsKey(serviceTicket)) {
                if (serviceTicket instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicket;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceTicket, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket;
                String realmGet$ticketId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketId();
                if (realmGet$ticketId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j6);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j6, realmGet$ticketId);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j6, realmGet$ticketId);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$ticketId);
                    j2 = j;
                }
                map2.put(serviceTicket, Long.valueOf(j2));
                String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    j4 = j2;
                    j3 = j6;
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.numberIndex, j2, realmGet$number, false);
                } else {
                    j4 = j2;
                    j3 = j6;
                }
                String realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataId();
                if (realmGet$userdataId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataIdIndex, j4, realmGet$userdataId, false);
                }
                String realmGet$performerId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerId();
                if (realmGet$performerId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerIdIndex, j4, realmGet$performerId, false);
                }
                String realmGet$ticketStateId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateId();
                if (realmGet$ticketStateId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateIdIndex, j4, realmGet$ticketStateId, false);
                }
                String realmGet$ticketStateTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateTitle();
                if (realmGet$ticketStateTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateTitleIndex, j4, realmGet$ticketStateTitle, false);
                }
                String realmGet$ticketDtStart = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtStart();
                if (realmGet$ticketDtStart != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtStartIndex, j4, realmGet$ticketDtStart, false);
                }
                String realmGet$ticketDtEnd = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtEnd();
                if (realmGet$ticketDtEnd != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtEndIndex, j4, realmGet$ticketDtEnd, false);
                }
                String realmGet$ticketDtFinish = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtFinish();
                if (realmGet$ticketDtFinish != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtFinishIndex, j4, realmGet$ticketDtFinish, false);
                }
                String realmGet$ticketTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTitle();
                if (realmGet$ticketTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTitleIndex, j4, realmGet$ticketTitle, false);
                }
                String realmGet$ticketText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketText();
                if (realmGet$ticketText != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTextIndex, j4, realmGet$ticketText, false);
                }
                String realmGet$ticketUrgencyId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgencyId();
                if (realmGet$ticketUrgencyId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIdIndex, j4, realmGet$ticketUrgencyId, false);
                }
                String realmGet$chatId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$chatId();
                if (realmGet$chatId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.chatIdIndex, j4, realmGet$chatId, false);
                }
                String realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketApartment();
                if (realmGet$ticketApartment != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketApartmentIndex, j4, realmGet$ticketApartment, false);
                }
                String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$sectionId();
                if (realmGet$sectionId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.sectionIdIndex, j4, realmGet$sectionId, false);
                }
                String realmGet$userdataFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataFio();
                if (realmGet$userdataFio != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataFioIndex, j4, realmGet$userdataFio, false);
                }
                String realmGet$userdataPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataPhone();
                if (realmGet$userdataPhone != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataPhoneIndex, j4, realmGet$userdataPhone, false);
                }
                String realmGet$userdataEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataEmail();
                if (realmGet$userdataEmail != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataEmailIndex, j4, realmGet$userdataEmail, false);
                }
                String realmGet$ticketAddress = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketAddress();
                if (realmGet$ticketAddress != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketAddressIndex, j4, realmGet$ticketAddress, false);
                }
                String realmGet$performerFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerFio();
                if (realmGet$performerFio != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerFioIndex, j4, realmGet$performerFio, false);
                }
                String realmGet$performerEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerEmail();
                if (realmGet$performerEmail != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerEmailIndex, j4, realmGet$performerEmail, false);
                }
                String realmGet$performerPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerPhone();
                if (realmGet$performerPhone != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerPhoneIndex, j4, realmGet$performerPhone, false);
                }
                String realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgency();
                if (realmGet$ticketUrgency != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIndex, j4, realmGet$ticketUrgency, false);
                }
                String realmGet$ticketType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketType();
                if (realmGet$ticketType != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeIndex, j4, realmGet$ticketType, false);
                }
                String realmGet$ticketTypeSlug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeSlug();
                if (realmGet$ticketTypeSlug != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeSlugIndex, j4, realmGet$ticketTypeSlug, false);
                }
                String realmGet$ticketTypeTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeTitle();
                if (realmGet$ticketTypeTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeTitleIndex, j4, realmGet$ticketTypeTitle, false);
                }
                String realmGet$messageLastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageLastMessage();
                if (realmGet$messageLastMessage != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.messageLastMessageIndex, j4, realmGet$messageLastMessage, false);
                }
                String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.cityIndex, j4, realmGet$city, false);
                }
                Table.nativeSetLong(nativePtr, serviceTicketColumnInfo.objectIdIndex, j4, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectId(), false);
                String realmGet$objectTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTitle();
                if (realmGet$objectTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTitleIndex, j4, realmGet$objectTitle, false);
                }
                String realmGet$objectType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectType();
                if (realmGet$objectType != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeIndex, j4, realmGet$objectType, false);
                }
                String realmGet$objectTypeName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTypeName();
                if (realmGet$objectTypeName != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeNameIndex, j4, realmGet$objectTypeName, false);
                }
                RentInfoObject realmGet$rentInfoObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rentInfoObject();
                if (realmGet$rentInfoObject != null) {
                    Long l = map2.get(realmGet$rentInfoObject);
                    if (l == null) {
                        l = Long.valueOf(C4746x72770240.insert(realm2, realmGet$rentInfoObject, map2));
                    }
                    table.setLink(serviceTicketColumnInfo.rentInfoObjectIndex, j4, l.longValue(), false);
                }
                String realmGet$unread = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$unread();
                if (realmGet$unread != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.unreadIndex, j4, realmGet$unread, false);
                }
                RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$fileList();
                if (realmGet$fileList != null) {
                    j5 = j4;
                    OsList osList = new OsList(table.getUncheckedRow(j5), serviceTicketColumnInfo.fileListIndex);
                    Iterator<ServiceFile> it2 = realmGet$fileList.iterator();
                    while (it2.hasNext()) {
                        ServiceFile next = it2.next();
                        Long l2 = map2.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4702x12a70883.insert(realm2, next, map2));
                        }
                        osList.addRow(l2.longValue());
                    }
                } else {
                    j5 = j4;
                }
                RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageList();
                if (realmGet$messageList != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j5), serviceTicketColumnInfo.messageListIndex);
                    Iterator<ServiceMessages> it3 = realmGet$messageList.iterator();
                    while (it3.hasNext()) {
                        ServiceMessages next2 = it3.next();
                        Long l3 = map2.get(next2);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4704x27ddec53.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l3.longValue());
                    }
                }
                RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ratingList();
                if (realmGet$ratingList != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(j5), serviceTicketColumnInfo.ratingListIndex);
                    Iterator<TicketRating> it4 = realmGet$ratingList.iterator();
                    while (it4.hasNext()) {
                        TicketRating next3 = it4.next();
                        Long l4 = map2.get(next3);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4724xb050ad75.insert(realm2, next3, map2));
                        }
                        osList3.addRow(l4.longValue());
                    }
                }
                Float realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rating();
                if (realmGet$rating != null) {
                    Table.nativeSetFloat(nativePtr, serviceTicketColumnInfo.ratingIndex, j5, realmGet$rating.floatValue(), false);
                }
                j6 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ServiceTicket serviceTicket, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        ServiceTicket serviceTicket2 = serviceTicket;
        Map<RealmModel, Long> map2 = map;
        if (serviceTicket2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicket2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ServiceTicket.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketColumnInfo serviceTicketColumnInfo = (ServiceTicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicket.class);
        long j3 = serviceTicketColumnInfo.ticketIdIndex;
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket2;
        String realmGet$ticketId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketId();
        if (realmGet$ticketId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$ticketId);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$ticketId) : j;
        map2.put(serviceTicket2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.numberIndex, createRowWithPrimaryKey, realmGet$number, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.numberIndex, j2, false);
        }
        String realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataId();
        if (realmGet$userdataId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataIdIndex, j2, realmGet$userdataId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataIdIndex, j2, false);
        }
        String realmGet$performerId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerId();
        if (realmGet$performerId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerIdIndex, j2, realmGet$performerId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerIdIndex, j2, false);
        }
        String realmGet$ticketStateId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateId();
        if (realmGet$ticketStateId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateIdIndex, j2, realmGet$ticketStateId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketStateIdIndex, j2, false);
        }
        String realmGet$ticketStateTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateTitle();
        if (realmGet$ticketStateTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateTitleIndex, j2, realmGet$ticketStateTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketStateTitleIndex, j2, false);
        }
        String realmGet$ticketDtStart = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtStart();
        if (realmGet$ticketDtStart != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtStartIndex, j2, realmGet$ticketDtStart, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketDtStartIndex, j2, false);
        }
        String realmGet$ticketDtEnd = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtEnd();
        if (realmGet$ticketDtEnd != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtEndIndex, j2, realmGet$ticketDtEnd, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketDtEndIndex, j2, false);
        }
        String realmGet$ticketDtFinish = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtFinish();
        if (realmGet$ticketDtFinish != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtFinishIndex, j2, realmGet$ticketDtFinish, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketDtFinishIndex, j2, false);
        }
        String realmGet$ticketTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTitle();
        if (realmGet$ticketTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTitleIndex, j2, realmGet$ticketTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTitleIndex, j2, false);
        }
        String realmGet$ticketText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketText();
        if (realmGet$ticketText != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTextIndex, j2, realmGet$ticketText, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTextIndex, j2, false);
        }
        String realmGet$ticketUrgencyId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgencyId();
        if (realmGet$ticketUrgencyId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIdIndex, j2, realmGet$ticketUrgencyId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketUrgencyIdIndex, j2, false);
        }
        String realmGet$chatId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$chatId();
        if (realmGet$chatId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.chatIdIndex, j2, realmGet$chatId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.chatIdIndex, j2, false);
        }
        String realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketApartment();
        if (realmGet$ticketApartment != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketApartmentIndex, j2, realmGet$ticketApartment, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketApartmentIndex, j2, false);
        }
        String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$sectionId();
        if (realmGet$sectionId != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.sectionIdIndex, j2, realmGet$sectionId, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.sectionIdIndex, j2, false);
        }
        String realmGet$userdataFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataFio();
        if (realmGet$userdataFio != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataFioIndex, j2, realmGet$userdataFio, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataFioIndex, j2, false);
        }
        String realmGet$userdataPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataPhone();
        if (realmGet$userdataPhone != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataPhoneIndex, j2, realmGet$userdataPhone, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataPhoneIndex, j2, false);
        }
        String realmGet$userdataEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataEmail();
        if (realmGet$userdataEmail != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataEmailIndex, j2, realmGet$userdataEmail, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataEmailIndex, j2, false);
        }
        String realmGet$ticketAddress = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketAddress();
        if (realmGet$ticketAddress != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketAddressIndex, j2, realmGet$ticketAddress, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketAddressIndex, j2, false);
        }
        String realmGet$performerFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerFio();
        if (realmGet$performerFio != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerFioIndex, j2, realmGet$performerFio, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerFioIndex, j2, false);
        }
        String realmGet$performerEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerEmail();
        if (realmGet$performerEmail != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerEmailIndex, j2, realmGet$performerEmail, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerEmailIndex, j2, false);
        }
        String realmGet$performerPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerPhone();
        if (realmGet$performerPhone != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerPhoneIndex, j2, realmGet$performerPhone, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerPhoneIndex, j2, false);
        }
        String realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgency();
        if (realmGet$ticketUrgency != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIndex, j2, realmGet$ticketUrgency, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketUrgencyIndex, j2, false);
        }
        String realmGet$ticketType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketType();
        if (realmGet$ticketType != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeIndex, j2, realmGet$ticketType, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTypeIndex, j2, false);
        }
        String realmGet$ticketTypeSlug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeSlug();
        if (realmGet$ticketTypeSlug != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeSlugIndex, j2, realmGet$ticketTypeSlug, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTypeSlugIndex, j2, false);
        }
        String realmGet$ticketTypeTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeTitle();
        if (realmGet$ticketTypeTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeTitleIndex, j2, realmGet$ticketTypeTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTypeTitleIndex, j2, false);
        }
        String realmGet$messageLastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageLastMessage();
        if (realmGet$messageLastMessage != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.messageLastMessageIndex, j2, realmGet$messageLastMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.messageLastMessageIndex, j2, false);
        }
        String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$city();
        if (realmGet$city != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.cityIndex, j2, realmGet$city, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.cityIndex, j2, false);
        }
        Table.nativeSetLong(nativePtr, serviceTicketColumnInfo.objectIdIndex, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectId(), false);
        String realmGet$objectTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTitle();
        if (realmGet$objectTitle != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTitleIndex, j2, realmGet$objectTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.objectTitleIndex, j2, false);
        }
        String realmGet$objectType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectType();
        if (realmGet$objectType != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeIndex, j2, realmGet$objectType, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.objectTypeIndex, j2, false);
        }
        String realmGet$objectTypeName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTypeName();
        if (realmGet$objectTypeName != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeNameIndex, j2, realmGet$objectTypeName, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.objectTypeNameIndex, j2, false);
        }
        RentInfoObject realmGet$rentInfoObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rentInfoObject();
        if (realmGet$rentInfoObject != null) {
            Long l = map2.get(realmGet$rentInfoObject);
            if (l == null) {
                l = Long.valueOf(C4746x72770240.insertOrUpdate(realm2, realmGet$rentInfoObject, map2));
            }
            Table.nativeSetLink(nativePtr, serviceTicketColumnInfo.rentInfoObjectIndex, j2, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, serviceTicketColumnInfo.rentInfoObjectIndex, j2);
        }
        String realmGet$unread = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$unread();
        if (realmGet$unread != null) {
            Table.nativeSetString(nativePtr, serviceTicketColumnInfo.unreadIndex, j2, realmGet$unread, false);
        } else {
            Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.unreadIndex, j2, false);
        }
        long j4 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j4), serviceTicketColumnInfo.fileListIndex);
        RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$fileList();
        if (realmGet$fileList == null || ((long) realmGet$fileList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$fileList != null) {
                Iterator<ServiceFile> it = realmGet$fileList.iterator();
                while (it.hasNext()) {
                    ServiceFile next = it.next();
                    Long l2 = map2.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4702x12a70883.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int i = 0;
            for (int size = realmGet$fileList.size(); i < size; size = size) {
                ServiceFile serviceFile = realmGet$fileList.get(i);
                Long l3 = map2.get(serviceFile);
                if (l3 == null) {
                    l3 = Long.valueOf(C4702x12a70883.insertOrUpdate(realm2, serviceFile, map2));
                }
                osList.setRow((long) i, l3.longValue());
                i++;
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j4), serviceTicketColumnInfo.messageListIndex);
        RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageList();
        if (realmGet$messageList == null || ((long) realmGet$messageList.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$messageList != null) {
                Iterator<ServiceMessages> it2 = realmGet$messageList.iterator();
                while (it2.hasNext()) {
                    ServiceMessages next2 = it2.next();
                    Long l4 = map2.get(next2);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4704x27ddec53.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l4.longValue());
                }
            }
        } else {
            int size2 = realmGet$messageList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ServiceMessages serviceMessages = realmGet$messageList.get(i2);
                Long l5 = map2.get(serviceMessages);
                if (l5 == null) {
                    l5 = Long.valueOf(C4704x27ddec53.insertOrUpdate(realm2, serviceMessages, map2));
                }
                osList2.setRow((long) i2, l5.longValue());
            }
        }
        OsList osList3 = new OsList(table.getUncheckedRow(j4), serviceTicketColumnInfo.ratingListIndex);
        RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ratingList();
        if (realmGet$ratingList == null || ((long) realmGet$ratingList.size()) != osList3.size()) {
            osList3.removeAll();
            if (realmGet$ratingList != null) {
                Iterator<TicketRating> it3 = realmGet$ratingList.iterator();
                while (it3.hasNext()) {
                    TicketRating next3 = it3.next();
                    Long l6 = map2.get(next3);
                    if (l6 == null) {
                        l6 = Long.valueOf(C4724xb050ad75.insertOrUpdate(realm2, next3, map2));
                    }
                    osList3.addRow(l6.longValue());
                }
            }
        } else {
            int size3 = realmGet$ratingList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                TicketRating ticketRating = realmGet$ratingList.get(i3);
                Long l7 = map2.get(ticketRating);
                if (l7 == null) {
                    l7 = Long.valueOf(C4724xb050ad75.insertOrUpdate(realm2, ticketRating, map2));
                }
                osList3.setRow((long) i3, l7.longValue());
            }
        }
        Float realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rating();
        if (realmGet$rating != null) {
            long j5 = j4;
            Table.nativeSetFloat(nativePtr, serviceTicketColumnInfo.ratingIndex, j4, realmGet$rating.floatValue(), false);
            return j5;
        }
        long j6 = j4;
        Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ratingIndex, j6, false);
        return j6;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ServiceTicket.class);
        long nativePtr = table.getNativePtr();
        ServiceTicketColumnInfo serviceTicketColumnInfo = (ServiceTicketColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceTicket.class);
        long j5 = serviceTicketColumnInfo.ticketIdIndex;
        while (it.hasNext()) {
            ServiceTicket serviceTicket = (ServiceTicket) it.next();
            if (!map2.containsKey(serviceTicket)) {
                if (serviceTicket instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) serviceTicket;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(serviceTicket, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket;
                String realmGet$ticketId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketId();
                if (realmGet$ticketId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$ticketId);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j5, realmGet$ticketId) : j;
                map2.put(serviceTicket, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.numberIndex, createRowWithPrimaryKey, realmGet$number, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j5;
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.numberIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$userdataId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataId();
                if (realmGet$userdataId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataIdIndex, j3, realmGet$userdataId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataIdIndex, j3, false);
                }
                String realmGet$performerId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerId();
                if (realmGet$performerId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerIdIndex, j3, realmGet$performerId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerIdIndex, j3, false);
                }
                String realmGet$ticketStateId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateId();
                if (realmGet$ticketStateId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateIdIndex, j3, realmGet$ticketStateId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketStateIdIndex, j3, false);
                }
                String realmGet$ticketStateTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketStateTitle();
                if (realmGet$ticketStateTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketStateTitleIndex, j3, realmGet$ticketStateTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketStateTitleIndex, j3, false);
                }
                String realmGet$ticketDtStart = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtStart();
                if (realmGet$ticketDtStart != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtStartIndex, j3, realmGet$ticketDtStart, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketDtStartIndex, j3, false);
                }
                String realmGet$ticketDtEnd = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtEnd();
                if (realmGet$ticketDtEnd != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtEndIndex, j3, realmGet$ticketDtEnd, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketDtEndIndex, j3, false);
                }
                String realmGet$ticketDtFinish = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketDtFinish();
                if (realmGet$ticketDtFinish != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketDtFinishIndex, j3, realmGet$ticketDtFinish, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketDtFinishIndex, j3, false);
                }
                String realmGet$ticketTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTitle();
                if (realmGet$ticketTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTitleIndex, j3, realmGet$ticketTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTitleIndex, j3, false);
                }
                String realmGet$ticketText = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketText();
                if (realmGet$ticketText != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTextIndex, j3, realmGet$ticketText, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTextIndex, j3, false);
                }
                String realmGet$ticketUrgencyId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgencyId();
                if (realmGet$ticketUrgencyId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIdIndex, j3, realmGet$ticketUrgencyId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketUrgencyIdIndex, j3, false);
                }
                String realmGet$chatId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$chatId();
                if (realmGet$chatId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.chatIdIndex, j3, realmGet$chatId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.chatIdIndex, j3, false);
                }
                String realmGet$ticketApartment = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketApartment();
                if (realmGet$ticketApartment != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketApartmentIndex, j3, realmGet$ticketApartment, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketApartmentIndex, j3, false);
                }
                String realmGet$sectionId = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$sectionId();
                if (realmGet$sectionId != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.sectionIdIndex, j3, realmGet$sectionId, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.sectionIdIndex, j3, false);
                }
                String realmGet$userdataFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataFio();
                if (realmGet$userdataFio != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataFioIndex, j3, realmGet$userdataFio, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataFioIndex, j3, false);
                }
                String realmGet$userdataPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataPhone();
                if (realmGet$userdataPhone != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataPhoneIndex, j3, realmGet$userdataPhone, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataPhoneIndex, j3, false);
                }
                String realmGet$userdataEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$userdataEmail();
                if (realmGet$userdataEmail != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.userdataEmailIndex, j3, realmGet$userdataEmail, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.userdataEmailIndex, j3, false);
                }
                String realmGet$ticketAddress = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketAddress();
                if (realmGet$ticketAddress != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketAddressIndex, j3, realmGet$ticketAddress, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketAddressIndex, j3, false);
                }
                String realmGet$performerFio = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerFio();
                if (realmGet$performerFio != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerFioIndex, j3, realmGet$performerFio, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerFioIndex, j3, false);
                }
                String realmGet$performerEmail = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerEmail();
                if (realmGet$performerEmail != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerEmailIndex, j3, realmGet$performerEmail, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerEmailIndex, j3, false);
                }
                String realmGet$performerPhone = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$performerPhone();
                if (realmGet$performerPhone != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.performerPhoneIndex, j3, realmGet$performerPhone, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.performerPhoneIndex, j3, false);
                }
                String realmGet$ticketUrgency = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketUrgency();
                if (realmGet$ticketUrgency != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketUrgencyIndex, j3, realmGet$ticketUrgency, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketUrgencyIndex, j3, false);
                }
                String realmGet$ticketType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketType();
                if (realmGet$ticketType != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeIndex, j3, realmGet$ticketType, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTypeIndex, j3, false);
                }
                String realmGet$ticketTypeSlug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeSlug();
                if (realmGet$ticketTypeSlug != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeSlugIndex, j3, realmGet$ticketTypeSlug, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTypeSlugIndex, j3, false);
                }
                String realmGet$ticketTypeTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ticketTypeTitle();
                if (realmGet$ticketTypeTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.ticketTypeTitleIndex, j3, realmGet$ticketTypeTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.ticketTypeTitleIndex, j3, false);
                }
                String realmGet$messageLastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageLastMessage();
                if (realmGet$messageLastMessage != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.messageLastMessageIndex, j3, realmGet$messageLastMessage, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.messageLastMessageIndex, j3, false);
                }
                String realmGet$city = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$city();
                if (realmGet$city != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.cityIndex, j3, realmGet$city, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.cityIndex, j3, false);
                }
                Table.nativeSetLong(nativePtr, serviceTicketColumnInfo.objectIdIndex, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectId(), false);
                String realmGet$objectTitle = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTitle();
                if (realmGet$objectTitle != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTitleIndex, j3, realmGet$objectTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.objectTitleIndex, j3, false);
                }
                String realmGet$objectType = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectType();
                if (realmGet$objectType != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeIndex, j3, realmGet$objectType, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.objectTypeIndex, j3, false);
                }
                String realmGet$objectTypeName = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$objectTypeName();
                if (realmGet$objectTypeName != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.objectTypeNameIndex, j3, realmGet$objectTypeName, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.objectTypeNameIndex, j3, false);
                }
                RentInfoObject realmGet$rentInfoObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rentInfoObject();
                if (realmGet$rentInfoObject != null) {
                    Long l = map2.get(realmGet$rentInfoObject);
                    if (l == null) {
                        l = Long.valueOf(C4746x72770240.insertOrUpdate(realm2, realmGet$rentInfoObject, map2));
                    }
                    Table.nativeSetLink(nativePtr, serviceTicketColumnInfo.rentInfoObjectIndex, j3, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, serviceTicketColumnInfo.rentInfoObjectIndex, j3);
                }
                String realmGet$unread = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$unread();
                if (realmGet$unread != null) {
                    Table.nativeSetString(nativePtr, serviceTicketColumnInfo.unreadIndex, j3, realmGet$unread, false);
                } else {
                    Table.nativeSetNull(nativePtr, serviceTicketColumnInfo.unreadIndex, j3, false);
                }
                long j6 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j6), serviceTicketColumnInfo.fileListIndex);
                RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$fileList();
                if (realmGet$fileList == null || ((long) realmGet$fileList.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$fileList != null) {
                        Iterator<ServiceFile> it2 = realmGet$fileList.iterator();
                        while (it2.hasNext()) {
                            ServiceFile next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(C4702x12a70883.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int i = 0;
                    for (int size = realmGet$fileList.size(); i < size; size = size) {
                        ServiceFile serviceFile = realmGet$fileList.get(i);
                        Long l3 = map2.get(serviceFile);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4702x12a70883.insertOrUpdate(realm2, serviceFile, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                        i++;
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j6), serviceTicketColumnInfo.messageListIndex);
                RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$messageList();
                if (realmGet$messageList == null || ((long) realmGet$messageList.size()) != osList2.size()) {
                    j4 = nativePtr;
                    osList2.removeAll();
                    if (realmGet$messageList != null) {
                        Iterator<ServiceMessages> it3 = realmGet$messageList.iterator();
                        while (it3.hasNext()) {
                            ServiceMessages next2 = it3.next();
                            Long l4 = map2.get(next2);
                            if (l4 == null) {
                                l4 = Long.valueOf(C4704x27ddec53.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l4.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$messageList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        ServiceMessages serviceMessages = realmGet$messageList.get(i2);
                        Long l5 = map2.get(serviceMessages);
                        if (l5 == null) {
                            l5 = Long.valueOf(C4704x27ddec53.insertOrUpdate(realm2, serviceMessages, map2));
                        }
                        osList2.setRow((long) i2, l5.longValue());
                        i2++;
                        nativePtr = nativePtr;
                    }
                    j4 = nativePtr;
                }
                OsList osList3 = new OsList(table.getUncheckedRow(j6), serviceTicketColumnInfo.ratingListIndex);
                RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$ratingList();
                if (realmGet$ratingList == null || ((long) realmGet$ratingList.size()) != osList3.size()) {
                    osList3.removeAll();
                    if (realmGet$ratingList != null) {
                        Iterator<TicketRating> it4 = realmGet$ratingList.iterator();
                        while (it4.hasNext()) {
                            TicketRating next3 = it4.next();
                            Long l6 = map2.get(next3);
                            if (l6 == null) {
                                l6 = Long.valueOf(C4724xb050ad75.insertOrUpdate(realm2, next3, map2));
                            }
                            osList3.addRow(l6.longValue());
                        }
                    }
                } else {
                    int size3 = realmGet$ratingList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        TicketRating ticketRating = realmGet$ratingList.get(i3);
                        Long l7 = map2.get(ticketRating);
                        if (l7 == null) {
                            l7 = Long.valueOf(C4724xb050ad75.insertOrUpdate(realm2, ticketRating, map2));
                        }
                        osList3.setRow((long) i3, l7.longValue());
                    }
                }
                Float realmGet$rating = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmGet$rating();
                if (realmGet$rating != null) {
                    Table.nativeSetFloat(j4, serviceTicketColumnInfo.ratingIndex, j6, realmGet$rating.floatValue(), false);
                } else {
                    Table.nativeSetNull(j4, serviceTicketColumnInfo.ratingIndex, j6, false);
                }
                j5 = j2;
                nativePtr = j4;
            }
        }
    }

    public static ServiceTicket createDetachedCopy(ServiceTicket serviceTicket, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ServiceTicket serviceTicket2;
        if (i > i2 || serviceTicket == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(serviceTicket);
        if (cacheData == null) {
            serviceTicket2 = new ServiceTicket();
            map.put(serviceTicket, new RealmObjectProxy.CacheData(i, serviceTicket2));
        } else if (i >= cacheData.minDepth) {
            return (ServiceTicket) cacheData.object;
        } else {
            cacheData.minDepth = i;
            serviceTicket2 = (ServiceTicket) cacheData.object;
        }
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket2;
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2 = serviceTicket;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$number(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$number());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketStateId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketStateId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketStateTitle(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketStateTitle());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtStart(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketDtStart());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtEnd(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketDtEnd());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketDtFinish(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketDtFinish());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTitle(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketTitle());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketText(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketText());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketUrgencyId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketUrgencyId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$chatId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$chatId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketApartment(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketApartment());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$sectionId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$sectionId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataFio(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataFio());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataPhone(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataPhone());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$userdataEmail(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataEmail());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketAddress(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketAddress());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerFio(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerFio());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerEmail(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerEmail());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$performerPhone(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerPhone());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketUrgency(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketUrgency());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketType(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketType());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTypeSlug(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketTypeSlug());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ticketTypeTitle(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketTypeTitle());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageLastMessage(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$messageLastMessage());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$city(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$city());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectId(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectId());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectTitle(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectTitle());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectType(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectType());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$objectTypeName(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectTypeName());
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$rentInfoObject(C4746x72770240.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$rentInfoObject(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$unread(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$unread());
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$fileList((RealmList<ServiceFile>) null);
        } else {
            RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$fileList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$fileList(realmList);
            int size = realmGet$fileList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4702x12a70883.createDetachedCopy(realmGet$fileList.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageList((RealmList<ServiceMessages>) null);
        } else {
            RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$messageList();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$messageList(realmList2);
            int size2 = realmGet$messageList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                realmList2.add(C4704x27ddec53.createDetachedCopy(realmGet$messageList.get(i5), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ratingList((RealmList<TicketRating>) null);
        } else {
            RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ratingList();
            RealmList realmList3 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$ratingList(realmList3);
            int size3 = realmGet$ratingList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                realmList3.add(C4724xb050ad75.createDetachedCopy(realmGet$ratingList.get(i6), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface.realmSet$rating(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$rating());
        return serviceTicket2;
    }

    static ServiceTicket update(Realm realm, ServiceTicketColumnInfo serviceTicketColumnInfo, ServiceTicket serviceTicket, ServiceTicket serviceTicket2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ServiceTicketColumnInfo serviceTicketColumnInfo2 = serviceTicketColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface = serviceTicket;
        C4707xa3193a66 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2 = serviceTicket2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ServiceTicket.class), serviceTicketColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.numberIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$number());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketStateIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketStateId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketStateTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketStateTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketDtStartIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketDtStart());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketDtEndIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketDtEnd());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketDtFinishIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketDtFinish());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTextIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketText());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketUrgencyIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketUrgencyId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.chatIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$chatId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketApartmentIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketApartment());
        osObjectBuilder.addString(serviceTicketColumnInfo2.sectionIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$sectionId());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataFioIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataFio());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataPhoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataPhone());
        osObjectBuilder.addString(serviceTicketColumnInfo2.userdataEmailIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$userdataEmail());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketAddressIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketAddress());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerFioIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerFio());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerEmailIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerEmail());
        osObjectBuilder.addString(serviceTicketColumnInfo2.performerPhoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$performerPhone());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketUrgencyIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketUrgency());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTypeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketType());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTypeSlugIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketTypeSlug());
        osObjectBuilder.addString(serviceTicketColumnInfo2.ticketTypeTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ticketTypeTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.messageLastMessageIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$messageLastMessage());
        osObjectBuilder.addString(serviceTicketColumnInfo2.cityIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$city());
        osObjectBuilder.addInteger(serviceTicketColumnInfo2.objectIdIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectId()));
        osObjectBuilder.addString(serviceTicketColumnInfo2.objectTitleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectTitle());
        osObjectBuilder.addString(serviceTicketColumnInfo2.objectTypeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectType());
        osObjectBuilder.addString(serviceTicketColumnInfo2.objectTypeNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$objectTypeName());
        RentInfoObject realmGet$rentInfoObject = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$rentInfoObject();
        if (realmGet$rentInfoObject == null) {
            osObjectBuilder.addNull(serviceTicketColumnInfo2.rentInfoObjectIndex);
        } else {
            RentInfoObject rentInfoObject = (RentInfoObject) map2.get(realmGet$rentInfoObject);
            if (rentInfoObject != null) {
                osObjectBuilder.addObject(serviceTicketColumnInfo2.rentInfoObjectIndex, rentInfoObject);
            } else {
                osObjectBuilder.addObject(serviceTicketColumnInfo2.rentInfoObjectIndex, C4746x72770240.copyOrUpdate(realm, (C4746x72770240.RentInfoObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentInfoObject.class), realmGet$rentInfoObject, true, map, set));
            }
        }
        osObjectBuilder.addString(serviceTicketColumnInfo2.unreadIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$unread());
        RealmList<ServiceFile> realmGet$fileList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$fileList();
        if (realmGet$fileList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$fileList.size(); i++) {
                ServiceFile serviceFile = realmGet$fileList.get(i);
                ServiceFile serviceFile2 = (ServiceFile) map2.get(serviceFile);
                if (serviceFile2 != null) {
                    realmList.add(serviceFile2);
                } else {
                    realmList.add(C4702x12a70883.copyOrUpdate(realm, (C4702x12a70883.ServiceFileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceFile.class), serviceFile, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(serviceTicketColumnInfo2.fileListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(serviceTicketColumnInfo2.fileListIndex, new RealmList());
        }
        RealmList<ServiceMessages> realmGet$messageList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$messageList();
        if (realmGet$messageList != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$messageList.size(); i2++) {
                ServiceMessages serviceMessages = realmGet$messageList.get(i2);
                ServiceMessages serviceMessages2 = (ServiceMessages) map2.get(serviceMessages);
                if (serviceMessages2 != null) {
                    realmList2.add(serviceMessages2);
                } else {
                    realmList2.add(C4704x27ddec53.copyOrUpdate(realm, (C4704x27ddec53.ServiceMessagesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ServiceMessages.class), serviceMessages, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(serviceTicketColumnInfo2.messageListIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(serviceTicketColumnInfo2.messageListIndex, new RealmList());
        }
        RealmList<TicketRating> realmGet$ratingList = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$ratingList();
        if (realmGet$ratingList != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$ratingList.size(); i3++) {
                TicketRating ticketRating = realmGet$ratingList.get(i3);
                TicketRating ticketRating2 = (TicketRating) map2.get(ticketRating);
                if (ticketRating2 != null) {
                    realmList3.add(ticketRating2);
                } else {
                    realmList3.add(C4724xb050ad75.copyOrUpdate(realm, (C4724xb050ad75.TicketRatingColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketRating.class), ticketRating, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(serviceTicketColumnInfo2.ratingListIndex, realmList3);
        } else {
            osObjectBuilder.addObjectList(serviceTicketColumnInfo2.ratingListIndex, new RealmList());
        }
        osObjectBuilder.addFloat(serviceTicketColumnInfo2.ratingIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxyinterface2.realmGet$rating());
        osObjectBuilder.updateExistingObject();
        return serviceTicket;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ServiceTicket = proxy[");
        sb.append("{ticketId:");
        Object obj = "null";
        sb.append(realmGet$ticketId() != null ? realmGet$ticketId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{number:");
        sb.append(realmGet$number() != null ? realmGet$number() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{userdataId:");
        sb.append(realmGet$userdataId() != null ? realmGet$userdataId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{performerId:");
        sb.append(realmGet$performerId() != null ? realmGet$performerId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketStateId:");
        sb.append(realmGet$ticketStateId() != null ? realmGet$ticketStateId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketStateTitle:");
        sb.append(realmGet$ticketStateTitle() != null ? realmGet$ticketStateTitle() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketDtStart:");
        sb.append(realmGet$ticketDtStart() != null ? realmGet$ticketDtStart() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketDtEnd:");
        sb.append(realmGet$ticketDtEnd() != null ? realmGet$ticketDtEnd() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketDtFinish:");
        sb.append(realmGet$ticketDtFinish() != null ? realmGet$ticketDtFinish() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketTitle:");
        sb.append(realmGet$ticketTitle() != null ? realmGet$ticketTitle() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketText:");
        sb.append(realmGet$ticketText() != null ? realmGet$ticketText() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketUrgencyId:");
        sb.append(realmGet$ticketUrgencyId() != null ? realmGet$ticketUrgencyId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{chatId:");
        sb.append(realmGet$chatId() != null ? realmGet$chatId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketApartment:");
        sb.append(realmGet$ticketApartment() != null ? realmGet$ticketApartment() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{sectionId:");
        sb.append(realmGet$sectionId() != null ? realmGet$sectionId() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{userdataFio:");
        sb.append(realmGet$userdataFio() != null ? realmGet$userdataFio() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{userdataPhone:");
        sb.append(realmGet$userdataPhone() != null ? realmGet$userdataPhone() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{userdataEmail:");
        sb.append(realmGet$userdataEmail() != null ? realmGet$userdataEmail() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketAddress:");
        sb.append(realmGet$ticketAddress() != null ? realmGet$ticketAddress() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{performerFio:");
        sb.append(realmGet$performerFio() != null ? realmGet$performerFio() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{performerEmail:");
        sb.append(realmGet$performerEmail() != null ? realmGet$performerEmail() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{performerPhone:");
        sb.append(realmGet$performerPhone() != null ? realmGet$performerPhone() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketUrgency:");
        sb.append(realmGet$ticketUrgency() != null ? realmGet$ticketUrgency() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketType:");
        sb.append(realmGet$ticketType() != null ? realmGet$ticketType() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketTypeSlug:");
        sb.append(realmGet$ticketTypeSlug() != null ? realmGet$ticketTypeSlug() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{ticketTypeTitle:");
        sb.append(realmGet$ticketTypeTitle() != null ? realmGet$ticketTypeTitle() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{messageLastMessage:");
        sb.append(realmGet$messageLastMessage() != null ? realmGet$messageLastMessage() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{city:");
        sb.append(realmGet$city() != null ? realmGet$city() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{objectId:");
        sb.append(realmGet$objectId());
        sb.append("}");
        sb.append(",");
        sb.append("{objectTitle:");
        sb.append(realmGet$objectTitle() != null ? realmGet$objectTitle() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{objectType:");
        sb.append(realmGet$objectType() != null ? realmGet$objectType() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{objectTypeName:");
        sb.append(realmGet$objectTypeName() != null ? realmGet$objectTypeName() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{rentInfoObject:");
        sb.append(realmGet$rentInfoObject() != null ? C4746x72770240.ClassNameHelper.INTERNAL_CLASS_NAME : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{unread:");
        sb.append(realmGet$unread() != null ? realmGet$unread() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{fileList:");
        sb.append("RealmList<ServiceFile>[");
        sb.append(realmGet$fileList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{messageList:");
        sb.append("RealmList<ServiceMessages>[");
        sb.append(realmGet$messageList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{ratingList:");
        sb.append("RealmList<TicketRating>[");
        sb.append(realmGet$ratingList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{rating:");
        Object obj2 = obj;
        if (realmGet$rating() != null) {
            obj2 = realmGet$rating();
        }
        sb.append(obj2);
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
        C4706xcf10b813 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxy = (C4706xcf10b813) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_serviceticketrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
