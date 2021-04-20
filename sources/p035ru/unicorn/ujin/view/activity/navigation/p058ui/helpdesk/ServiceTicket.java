package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfoObject;
import p046io.realm.C4707xa3193a66;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ServiceTicket */
public class ServiceTicket extends RealmObject implements Diffable<ServiceTicket>, C4707xa3193a66 {
    @SerializedName("chat_id")
    @Expose
    private String chatId;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("files")
    @Expose
    private RealmList<ServiceFile> fileList;
    @SerializedName("message_last_message")
    @Expose
    private String messageLastMessage;
    @SerializedName("messages")
    @Expose
    private RealmList<ServiceMessages> messageList;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("object_id")
    @Expose
    private int objectId;
    @SerializedName("object_title")
    @Expose
    private String objectTitle;
    @SerializedName("object_type")
    @Expose
    private String objectType;
    @SerializedName("object_type_name")
    @Expose
    private String objectTypeName;
    @SerializedName("performer_email")
    @Expose
    private String performerEmail;
    @SerializedName("performer_fio")
    @Expose
    private String performerFio;
    @SerializedName("performer_id")
    @Expose
    private String performerId;
    @SerializedName("performer_phone")
    @Expose
    private String performerPhone;
    @SerializedName("rating")
    @Expose
    private Float rating;
    @SerializedName("rates")
    @Expose
    private RealmList<TicketRating> ratingList;
    @SerializedName("rent_form")
    @Expose
    private RentInfoObject rentInfoObject;
    @SerializedName("section_id")
    @Expose
    private String sectionId;
    @SerializedName("ticket_address")
    @Expose
    private String ticketAddress;
    @SerializedName("ticket_apartment")
    @Expose
    private String ticketApartment;
    @SerializedName("ticket_dt_end")
    @Expose
    private String ticketDtEnd;
    @SerializedName("ticket_dt_finish")
    @Expose
    private String ticketDtFinish;
    @SerializedName("ticket_dt_start")
    @Expose
    private String ticketDtStart;
    @SerializedName("ticket_id")
    @PrimaryKey
    @Expose
    private String ticketId;
    @SerializedName("ticket_state_id")
    @Expose
    private String ticketStateId;
    @SerializedName("ticket_state_title")
    @Expose
    private String ticketStateTitle;
    @SerializedName("ticket_text")
    @Expose
    private String ticketText;
    @SerializedName("ticket_title")
    @Expose
    private String ticketTitle;
    @SerializedName("ticket_type")
    @Expose
    private String ticketType;
    @SerializedName("ticket_type_slug")
    @Expose
    private String ticketTypeSlug;
    @SerializedName("ticket_type_title")
    @Expose
    private String ticketTypeTitle;
    @SerializedName("ticket_urgency")
    @Expose
    private String ticketUrgency;
    @SerializedName("ticket_urgency_id")
    @Expose
    private String ticketUrgencyId;
    @SerializedName("unread")
    @Expose
    private String unread;
    @SerializedName("userdata_email")
    @Expose
    private String userdataEmail;
    @SerializedName("userdata_fio")
    @Expose
    private String userdataFio;
    @SerializedName("userdata_id")
    @Expose
    private String userdataId;
    @SerializedName("userdata_phone")
    @Expose
    private String userdataPhone;

    public String realmGet$chatId() {
        return this.chatId;
    }

    public String realmGet$city() {
        return this.city;
    }

    public RealmList realmGet$fileList() {
        return this.fileList;
    }

    public String realmGet$messageLastMessage() {
        return this.messageLastMessage;
    }

    public RealmList realmGet$messageList() {
        return this.messageList;
    }

    public String realmGet$number() {
        return this.number;
    }

    public int realmGet$objectId() {
        return this.objectId;
    }

    public String realmGet$objectTitle() {
        return this.objectTitle;
    }

    public String realmGet$objectType() {
        return this.objectType;
    }

    public String realmGet$objectTypeName() {
        return this.objectTypeName;
    }

    public String realmGet$performerEmail() {
        return this.performerEmail;
    }

    public String realmGet$performerFio() {
        return this.performerFio;
    }

    public String realmGet$performerId() {
        return this.performerId;
    }

    public String realmGet$performerPhone() {
        return this.performerPhone;
    }

    public Float realmGet$rating() {
        return this.rating;
    }

    public RealmList realmGet$ratingList() {
        return this.ratingList;
    }

    public RentInfoObject realmGet$rentInfoObject() {
        return this.rentInfoObject;
    }

    public String realmGet$sectionId() {
        return this.sectionId;
    }

    public String realmGet$ticketAddress() {
        return this.ticketAddress;
    }

    public String realmGet$ticketApartment() {
        return this.ticketApartment;
    }

    public String realmGet$ticketDtEnd() {
        return this.ticketDtEnd;
    }

    public String realmGet$ticketDtFinish() {
        return this.ticketDtFinish;
    }

    public String realmGet$ticketDtStart() {
        return this.ticketDtStart;
    }

    public String realmGet$ticketId() {
        return this.ticketId;
    }

    public String realmGet$ticketStateId() {
        return this.ticketStateId;
    }

    public String realmGet$ticketStateTitle() {
        return this.ticketStateTitle;
    }

    public String realmGet$ticketText() {
        return this.ticketText;
    }

    public String realmGet$ticketTitle() {
        return this.ticketTitle;
    }

    public String realmGet$ticketType() {
        return this.ticketType;
    }

    public String realmGet$ticketTypeSlug() {
        return this.ticketTypeSlug;
    }

    public String realmGet$ticketTypeTitle() {
        return this.ticketTypeTitle;
    }

    public String realmGet$ticketUrgency() {
        return this.ticketUrgency;
    }

    public String realmGet$ticketUrgencyId() {
        return this.ticketUrgencyId;
    }

    public String realmGet$unread() {
        return this.unread;
    }

    public String realmGet$userdataEmail() {
        return this.userdataEmail;
    }

    public String realmGet$userdataFio() {
        return this.userdataFio;
    }

    public String realmGet$userdataId() {
        return this.userdataId;
    }

    public String realmGet$userdataPhone() {
        return this.userdataPhone;
    }

    public void realmSet$chatId(String str) {
        this.chatId = str;
    }

    public void realmSet$city(String str) {
        this.city = str;
    }

    public void realmSet$fileList(RealmList realmList) {
        this.fileList = realmList;
    }

    public void realmSet$messageLastMessage(String str) {
        this.messageLastMessage = str;
    }

    public void realmSet$messageList(RealmList realmList) {
        this.messageList = realmList;
    }

    public void realmSet$number(String str) {
        this.number = str;
    }

    public void realmSet$objectId(int i) {
        this.objectId = i;
    }

    public void realmSet$objectTitle(String str) {
        this.objectTitle = str;
    }

    public void realmSet$objectType(String str) {
        this.objectType = str;
    }

    public void realmSet$objectTypeName(String str) {
        this.objectTypeName = str;
    }

    public void realmSet$performerEmail(String str) {
        this.performerEmail = str;
    }

    public void realmSet$performerFio(String str) {
        this.performerFio = str;
    }

    public void realmSet$performerId(String str) {
        this.performerId = str;
    }

    public void realmSet$performerPhone(String str) {
        this.performerPhone = str;
    }

    public void realmSet$rating(Float f) {
        this.rating = f;
    }

    public void realmSet$ratingList(RealmList realmList) {
        this.ratingList = realmList;
    }

    public void realmSet$rentInfoObject(RentInfoObject rentInfoObject2) {
        this.rentInfoObject = rentInfoObject2;
    }

    public void realmSet$sectionId(String str) {
        this.sectionId = str;
    }

    public void realmSet$ticketAddress(String str) {
        this.ticketAddress = str;
    }

    public void realmSet$ticketApartment(String str) {
        this.ticketApartment = str;
    }

    public void realmSet$ticketDtEnd(String str) {
        this.ticketDtEnd = str;
    }

    public void realmSet$ticketDtFinish(String str) {
        this.ticketDtFinish = str;
    }

    public void realmSet$ticketDtStart(String str) {
        this.ticketDtStart = str;
    }

    public void realmSet$ticketId(String str) {
        this.ticketId = str;
    }

    public void realmSet$ticketStateId(String str) {
        this.ticketStateId = str;
    }

    public void realmSet$ticketStateTitle(String str) {
        this.ticketStateTitle = str;
    }

    public void realmSet$ticketText(String str) {
        this.ticketText = str;
    }

    public void realmSet$ticketTitle(String str) {
        this.ticketTitle = str;
    }

    public void realmSet$ticketType(String str) {
        this.ticketType = str;
    }

    public void realmSet$ticketTypeSlug(String str) {
        this.ticketTypeSlug = str;
    }

    public void realmSet$ticketTypeTitle(String str) {
        this.ticketTypeTitle = str;
    }

    public void realmSet$ticketUrgency(String str) {
        this.ticketUrgency = str;
    }

    public void realmSet$ticketUrgencyId(String str) {
        this.ticketUrgencyId = str;
    }

    public void realmSet$unread(String str) {
        this.unread = str;
    }

    public void realmSet$userdataEmail(String str) {
        this.userdataEmail = str;
    }

    public void realmSet$userdataFio(String str) {
        this.userdataFio = str;
    }

    public void realmSet$userdataId(String str) {
        this.userdataId = str;
    }

    public void realmSet$userdataPhone(String str) {
        this.userdataPhone = str;
    }

    public ServiceTicket() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList<ServiceFile> getFileList() {
        return realmGet$fileList() == null ? new RealmList<>() : realmGet$fileList();
    }

    public void setFileList(RealmList<ServiceFile> realmList) {
        realmSet$fileList(realmList);
    }

    public RealmList<ServiceMessages> getMessageList() {
        return realmGet$messageList();
    }

    public void setMessageList(RealmList<ServiceMessages> realmList) {
        realmSet$messageList(realmList);
    }

    public String getTicketId() {
        return realmGet$ticketId();
    }

    public void setTicketId(String str) {
        realmSet$ticketId(str);
    }

    public String getUserdataId() {
        return realmGet$userdataId();
    }

    public void setUserdataId(String str) {
        realmSet$userdataId(str);
    }

    public String getPerformerId() {
        return realmGet$performerId();
    }

    public void setPerformerId(String str) {
        realmSet$performerId(str);
    }

    public String getTicketStateId() {
        return realmGet$ticketStateId();
    }

    public void setTicketStateId(String str) {
        realmSet$ticketStateId(str);
    }

    public String getTicketStateTitle() {
        return realmGet$ticketStateTitle();
    }

    public void setTicketStateTitle(String str) {
        realmSet$ticketStateTitle(str);
    }

    public String getTicketDtStart() {
        return realmGet$ticketDtStart();
    }

    public String getHumanDate() {
        return DateUtils.formatDate(new Date(Long.parseLong(getTicketDtStart()) * 1000));
    }

    public void setTicketDtStart(String str) {
        realmSet$ticketDtStart(str);
    }

    public String getTicketDtFinish() {
        return realmGet$ticketDtFinish();
    }

    public void setTicketDtFinish(String str) {
        realmSet$ticketDtFinish(str);
    }

    public String getTicketDtEnd() {
        return realmGet$ticketDtEnd();
    }

    public String getHumanEndDate() {
        if (getTicketDtEnd() == null || getTicketDtEnd().equals("0")) {
            return getTicketDtEnd();
        }
        return DateUtils.formatDate(new Date(Long.parseLong(getTicketDtEnd()) * 1000));
    }

    public void setTicketDtEnd(String str) {
        realmSet$ticketDtEnd(str);
    }

    public String getTicketTitle() {
        return realmGet$ticketTitle();
    }

    public void setTicketTitle(String str) {
        realmSet$ticketTitle(str);
    }

    public String getTicketText() {
        return realmGet$ticketText();
    }

    public void setTicketText(String str) {
        realmSet$ticketText(str);
    }

    public String getTicketApartment() {
        return realmGet$ticketApartment();
    }

    public void setTicketApartment(String str) {
        realmSet$ticketApartment(str);
    }

    public String getSectionId() {
        return realmGet$sectionId();
    }

    public void setSectionId(String str) {
        realmSet$sectionId(str);
    }

    public String getChatId() {
        return realmGet$chatId();
    }

    public void setChatId(String str) {
        realmSet$chatId(str);
    }

    public String getTicketType() {
        return realmGet$ticketType();
    }

    public void setTicketType(String str) {
        realmSet$ticketType(str);
    }

    public String getMessageLastMessage() {
        return realmGet$messageLastMessage();
    }

    public void setMessageLastMessage(String str) {
        realmSet$messageLastMessage(str);
    }

    public String getCity() {
        return realmGet$city();
    }

    public void setCity(String str) {
        realmSet$city(str);
    }

    public String getUnread() {
        return realmGet$unread();
    }

    public void setUnread(String str) {
        realmSet$unread(str);
    }

    public String getTicketUrgency() {
        return realmGet$ticketUrgency();
    }

    public void setTicketUrgency(String str) {
        realmSet$ticketUrgency(str);
    }

    public String getTicketUrgencyId() {
        return realmGet$ticketUrgencyId();
    }

    public void setTicketUrgencyId(String str) {
        realmSet$ticketUrgencyId(str);
    }

    public String getUserdataFio() {
        return realmGet$userdataFio();
    }

    public void setUserdataFio(String str) {
        realmSet$userdataFio(str);
    }

    public String getUserdataPhone() {
        return realmGet$userdataPhone();
    }

    public void setUserdataPhone(String str) {
        realmSet$userdataPhone(str);
    }

    public String getUserdataEmail() {
        return realmGet$userdataEmail();
    }

    public void setUserdataEmail(String str) {
        realmSet$userdataEmail(str);
    }

    public String getTicketAddress() {
        return realmGet$ticketAddress();
    }

    public void setTicketAddress(String str) {
        realmSet$ticketAddress(str);
    }

    public String getPerformerFio() {
        return realmGet$performerFio();
    }

    public void setPerformerFio(String str) {
        realmSet$performerFio(str);
    }

    public String getPerformerEmail() {
        return realmGet$performerEmail();
    }

    public void setPerformerEmail(String str) {
        realmSet$performerEmail(str);
    }

    public String getPerformerPhone() {
        return realmGet$performerPhone();
    }

    public void setPerformerPhone(String str) {
        realmSet$performerPhone(str);
    }

    public int getObjectId() {
        return realmGet$objectId();
    }

    public void setObjectId(int i) {
        realmSet$objectId(i);
    }

    public String getObjectTitle() {
        return realmGet$objectTitle();
    }

    public void setObjectTitle(String str) {
        realmSet$objectTitle(str);
    }

    public String getObjectType() {
        return realmGet$objectType();
    }

    public RentInfoObject getRentInfoObject() {
        return realmGet$rentInfoObject();
    }

    public void setRentInfoObject(RentInfoObject rentInfoObject2) {
        realmSet$rentInfoObject(rentInfoObject2);
    }

    public void setObjectType(String str) {
        realmSet$objectType(str);
    }

    public String getObjectTypeName() {
        return realmGet$objectTypeName();
    }

    public void setObjectTypeName(String str) {
        realmSet$objectTypeName(str);
    }

    public static List<ServiceTicket> filterData(List<ServiceTicket> list, int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            TicketType byNumber = TicketType.getByNumber(list.get(i2).getTicketStateId());
            boolean z = byNumber != null && (byNumber.equals(TicketType.CLOSED) || byNumber.equals(TicketType.CANCELED) || byNumber.equals(TicketType.DENIED));
            if (i == 0 && !z) {
                arrayList.add(list.get(i2));
            } else if (i != 0 && z) {
                arrayList.add(list.get(i2));
            }
        }
        return arrayList;
    }

    public boolean areItemsTheSame(ServiceTicket serviceTicket) {
        return realmGet$ticketId().equals(serviceTicket.realmGet$ticketId());
    }

    public boolean areContentsTheSame(ServiceTicket serviceTicket) {
        return realmGet$ticketStateId().equals(serviceTicket.realmGet$ticketStateId()) && ((realmGet$rating() == null && serviceTicket.realmGet$rating() == null) || !(realmGet$rating() == null || serviceTicket.realmGet$rating() == null || !realmGet$rating().equals(serviceTicket.realmGet$rating())));
    }

    public Float getRating() {
        return Float.valueOf(realmGet$rating() == null ? 0.0f : realmGet$rating().floatValue());
    }

    public RealmList<TicketRating> getRatingList() {
        return realmGet$ratingList();
    }

    public String getNumber() {
        return realmGet$number();
    }

    public String getTicketTypeSlug() {
        return realmGet$ticketTypeSlug();
    }

    public String getTicketTypeTitle() {
        return realmGet$ticketTypeTitle();
    }
}
