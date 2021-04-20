package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4719xebc98253;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketInfo */
public class TicketInfo extends RealmObject implements C4719xebc98253 {
    @SerializedName("date_end")
    long dateEnd;
    @SerializedName("date_finish")
    long dateFinish;
    @SerializedName("date_start")
    long dateStart;
    @SerializedName("id")
    @PrimaryKey

    /* renamed from: id */
    int f6783id;
    @SerializedName("number")
    String number;
    @SerializedName("section_id")
    String sectionId;
    @SerializedName("text")
    String text;
    @SerializedName("object")
    TicketObject ticketObject;
    @SerializedName("state")
    TicketState ticketState;
    @SerializedName("urgency")
    TicketUrgency ticketUrgency;
    @SerializedName("title")
    String title;

    public long realmGet$dateEnd() {
        return this.dateEnd;
    }

    public long realmGet$dateFinish() {
        return this.dateFinish;
    }

    public long realmGet$dateStart() {
        return this.dateStart;
    }

    public int realmGet$id() {
        return this.f6783id;
    }

    public String realmGet$number() {
        return this.number;
    }

    public String realmGet$sectionId() {
        return this.sectionId;
    }

    public String realmGet$text() {
        return this.text;
    }

    public TicketObject realmGet$ticketObject() {
        return this.ticketObject;
    }

    public TicketState realmGet$ticketState() {
        return this.ticketState;
    }

    public TicketUrgency realmGet$ticketUrgency() {
        return this.ticketUrgency;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$dateEnd(long j) {
        this.dateEnd = j;
    }

    public void realmSet$dateFinish(long j) {
        this.dateFinish = j;
    }

    public void realmSet$dateStart(long j) {
        this.dateStart = j;
    }

    public void realmSet$id(int i) {
        this.f6783id = i;
    }

    public void realmSet$number(String str) {
        this.number = str;
    }

    public void realmSet$sectionId(String str) {
        this.sectionId = str;
    }

    public void realmSet$text(String str) {
        this.text = str;
    }

    public void realmSet$ticketObject(TicketObject ticketObject2) {
        this.ticketObject = ticketObject2;
    }

    public void realmSet$ticketState(TicketState ticketState2) {
        this.ticketState = ticketState2;
    }

    public void realmSet$ticketUrgency(TicketUrgency ticketUrgency2) {
        this.ticketUrgency = ticketUrgency2;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public TicketInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public TicketState getTicketState() {
        return realmGet$ticketState();
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getText() {
        return realmGet$text();
    }

    public void setText(String str) {
        realmSet$text(str);
    }

    public TicketUrgency getTicketUrgency() {
        return realmGet$ticketUrgency();
    }

    public void setTicketUrgency(TicketUrgency ticketUrgency2) {
        realmSet$ticketUrgency(ticketUrgency2);
    }

    public long getDateStart() {
        return realmGet$dateStart();
    }

    public void setDateStart(long j) {
        realmSet$dateStart(j);
    }

    public long getDateEnd() {
        return realmGet$dateEnd();
    }

    public void setDateEnd(long j) {
        realmSet$dateEnd(j);
    }

    public long getDateFinish() {
        return realmGet$dateFinish();
    }

    public void setDateFinish(long j) {
        realmSet$dateFinish(j);
    }

    public void setTicketState(TicketState ticketState2) {
        realmSet$ticketState(ticketState2);
    }

    public TicketObject getTicketObject() {
        return realmGet$ticketObject();
    }

    public void setTicketObject(TicketObject ticketObject2) {
        realmSet$ticketObject(ticketObject2);
    }

    public String getNumber() {
        return realmGet$number();
    }

    public String getSectionId() {
        return realmGet$sectionId();
    }

    public void setSectionId(String str) {
        realmSet$sectionId(str);
    }
}
