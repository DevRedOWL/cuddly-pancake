package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import com.stfalcon.chatkit.commons.models.IDialog;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p035ru.unicorn.ujin.data.entities.chats.Attachment;
import p035ru.unicorn.ujin.data.entities.chats.Author;
import p035ru.unicorn.ujin.data.entities.chats.Message;
import p035ru.unicorn.ujin.data.entities.chats.Poll;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ChatRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Chat */
public class Chat extends RealmObject implements IDialog, ru_unicorn_ujin_data_realm_ChatRealmProxyInterface {
    private String count;
    @PrimaryKey

    /* renamed from: id */
    private String f6638id;
    @SerializedName("last_autor")
    private String lastAuthor;
    @SerializedName("last_autor_img")
    private String lastAuthorImg;
    @SerializedName("last_dt")
    private String lastDate;
    @SerializedName("last_message")
    private String lastMessage;
    @SerializedName("not_read")
    private Integer notRead;
    @SerializedName("owner")
    private String ownerId;
    @SerializedName("members")
    private int participantsCount;
    @SerializedName("readonly")
    private int readOnly;
    @SerializedName("remove_caption")
    private String removeCaption;
    @SerializedName("service_type")
    private String serviceType;
    @SerializedName("sound")
    private Boolean sound;
    private String title;
    private RealmList<Author> userList;

    public String realmGet$count() {
        return this.count;
    }

    public String realmGet$id() {
        return this.f6638id;
    }

    public String realmGet$lastAuthor() {
        return this.lastAuthor;
    }

    public String realmGet$lastAuthorImg() {
        return this.lastAuthorImg;
    }

    public String realmGet$lastDate() {
        return this.lastDate;
    }

    public String realmGet$lastMessage() {
        return this.lastMessage;
    }

    public Integer realmGet$notRead() {
        return this.notRead;
    }

    public String realmGet$ownerId() {
        return this.ownerId;
    }

    public int realmGet$participantsCount() {
        return this.participantsCount;
    }

    public int realmGet$readOnly() {
        return this.readOnly;
    }

    public String realmGet$removeCaption() {
        return this.removeCaption;
    }

    public String realmGet$serviceType() {
        return this.serviceType;
    }

    public Boolean realmGet$sound() {
        return this.sound;
    }

    public String realmGet$title() {
        return this.title;
    }

    public RealmList realmGet$userList() {
        return this.userList;
    }

    public void realmSet$count(String str) {
        this.count = str;
    }

    public void realmSet$id(String str) {
        this.f6638id = str;
    }

    public void realmSet$lastAuthor(String str) {
        this.lastAuthor = str;
    }

    public void realmSet$lastAuthorImg(String str) {
        this.lastAuthorImg = str;
    }

    public void realmSet$lastDate(String str) {
        this.lastDate = str;
    }

    public void realmSet$lastMessage(String str) {
        this.lastMessage = str;
    }

    public void realmSet$notRead(Integer num) {
        this.notRead = num;
    }

    public void realmSet$ownerId(String str) {
        this.ownerId = str;
    }

    public void realmSet$participantsCount(int i) {
        this.participantsCount = i;
    }

    public void realmSet$readOnly(int i) {
        this.readOnly = i;
    }

    public void realmSet$removeCaption(String str) {
        this.removeCaption = str;
    }

    public void realmSet$serviceType(String str) {
        this.serviceType = str;
    }

    public void realmSet$sound(Boolean bool) {
        this.sound = bool;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$userList(RealmList realmList) {
        this.userList = realmList;
    }

    public void setLastMessage(IMessage iMessage) {
    }

    public Chat() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList<Author> getUserList() {
        return realmGet$userList();
    }

    public void setUserList(RealmList<Author> realmList) {
        realmSet$userList(realmList);
    }

    public String getOwnerId() {
        return realmGet$ownerId();
    }

    public void setOwnerId(String str) {
        realmSet$ownerId(str);
    }

    public Boolean getSound() {
        return Boolean.valueOf(realmGet$sound() == null ? true : realmGet$sound().booleanValue());
    }

    public void setSound(Boolean bool) {
        realmSet$sound(bool);
    }

    public String getId() {
        return realmGet$id();
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public String getDialogPhoto() {
        return realmGet$title();
    }

    public String getDialogName() {
        return realmGet$title();
    }

    public List<? extends IUser> getUsers() {
        if (realmGet$userList() != null) {
            return realmGet$userList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Author("0", "Я", ""));
        arrayList.add(new Author("1", realmGet$lastAuthor() == null ? " " : realmGet$lastAuthor(), ""));
        return arrayList;
    }

    public Message getLastMessage() {
        String str;
        if (StringUtils.isEmpty(realmGet$lastAuthor())) {
            return null;
        }
        if (StringUtils.isEmpty(realmGet$lastAuthor())) {
            str = "";
        } else {
            str = realmGet$lastAuthor() + ": " + realmGet$lastMessage();
        }
        return new Message(0, realmGet$lastAuthor(), Long.valueOf(realmGet$lastDate()), realmGet$lastAuthorImg(), "", "", 0, false, false, str, (List<Attachment>) null, (Poll) null);
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

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getCount() {
        return realmGet$count();
    }

    public void setCount(String str) {
        realmSet$count(str);
    }

    public int getUnreadCount() {
        return realmGet$notRead().intValue();
    }

    public String getLastDate() {
        return realmGet$lastDate();
    }

    public void setLastDate(String str) {
        realmSet$lastDate(str);
    }

    public String getLastAuthor() {
        return realmGet$lastAuthor();
    }

    public void setLastAuthor(String str) {
        realmSet$lastAuthor(str);
    }

    public int getReadOnly() {
        return realmGet$readOnly();
    }

    public void setReadOnly(int i) {
        realmSet$readOnly(i);
    }

    public String getLastAuthorImg() {
        return realmGet$lastAuthorImg();
    }

    public void setLastAuthorImg(String str) {
        realmSet$lastAuthorImg(str);
    }

    public String getRemoveCaption() {
        return realmGet$removeCaption();
    }

    public void setRemoveCaption(String str) {
        realmSet$removeCaption(str);
    }

    public String getServiceType() {
        return realmGet$serviceType();
    }

    public void setServiceType(String str) {
        realmSet$serviceType(str);
    }

    public int getParticipantsCount() {
        return realmGet$participantsCount();
    }

    public void setParticipantsCount(int i) {
        realmSet$participantsCount(i);
    }

    /* renamed from: ru.unicorn.ujin.data.realm.Chat$Fields */
    public class Fields {

        /* renamed from: id */
        public static final String f6639id = "id";
        public static final String serviceType = "serviceType";

        public Fields() {
        }
    }
}
