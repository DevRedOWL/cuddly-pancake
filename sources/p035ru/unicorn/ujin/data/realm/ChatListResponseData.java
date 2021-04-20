package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4598x353731f6;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.data.realm.ChatListResponseData */
public class ChatListResponseData extends RealmObject implements C4598x353731f6 {
    @SerializedName("chats")
    private RealmList<Chat> chatList;
    @SerializedName("not_read")
    private int notReadCount;
    @SerializedName("user_id")
    private String userId;

    public RealmList realmGet$chatList() {
        return this.chatList;
    }

    public int realmGet$notReadCount() {
        return this.notReadCount;
    }

    public String realmGet$userId() {
        return this.userId;
    }

    public void realmSet$chatList(RealmList realmList) {
        this.chatList = realmList;
    }

    public void realmSet$notReadCount(int i) {
        this.notReadCount = i;
    }

    public void realmSet$userId(String str) {
        this.userId = str;
    }

    public ChatListResponseData() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getUserId() {
        return realmGet$userId();
    }

    public void setUserId(String str) {
        realmSet$userId(str);
    }

    public RealmList<Chat> getChatList() {
        return realmGet$chatList();
    }

    public void setChatList(RealmList<Chat> realmList) {
        realmSet$chatList(realmList);
    }

    public int getNotReadCount() {
        return realmGet$notReadCount();
    }

    public void setNotReadCount(int i) {
        realmSet$notReadCount(i);
    }
}
