package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4717x4e01e3df;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TicketChatData */
public class TicketChatData extends RealmObject implements C4717x4e01e3df {
    @SerializedName("id")

    /* renamed from: id */
    private int f6782id;
    @SerializedName("last_message")
    private String lastMessage;
    @SerializedName("not_read")
    private Integer notRead;

    public int realmGet$id() {
        return this.f6782id;
    }

    public String realmGet$lastMessage() {
        return this.lastMessage;
    }

    public Integer realmGet$notRead() {
        return this.notRead;
    }

    public void realmSet$id(int i) {
        this.f6782id = i;
    }

    public void realmSet$lastMessage(String str) {
        this.lastMessage = str;
    }

    public void realmSet$notRead(Integer num) {
        this.notRead = num;
    }

    public TicketChatData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getId() {
        return realmGet$id();
    }

    public void setId(int i) {
        realmSet$id(i);
    }

    public String getLastMessage() {
        return realmGet$lastMessage();
    }

    public void setLastMessage(String str) {
        realmSet$lastMessage(str);
    }

    public Integer getNotRead() {
        return realmGet$notRead();
    }

    public void setNotRead(Integer num) {
        realmSet$notRead(num);
    }
}
