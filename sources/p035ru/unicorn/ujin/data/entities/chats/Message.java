package p035ru.unicorn.ujin.data.entities.chats;

import com.google.gson.annotations.SerializedName;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.MessageContentType;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\b\u00103\u001a\u000204H\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\n\u00105\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u00106\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u00107\u001a\u000208H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R \u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018¨\u00069"}, mo51343d2 = {"Lru/unicorn/ujin/data/entities/chats/Message;", "Lcom/stfalcon/chatkit/commons/models/IMessage;", "Lcom/stfalcon/chatkit/commons/models/MessageContentType$Image;", "id", "", "autor", "", "timestamp", "", "img", "link", "type", "my", "deleted", "", "system", "message", "fileList", "", "Lru/unicorn/ujin/data/entities/chats/Attachment;", "poll", "Lru/unicorn/ujin/data/entities/chats/Poll;", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZZLjava/lang/String;Ljava/util/List;Lru/unicorn/ujin/data/entities/chats/Poll;)V", "getAutor", "()Ljava/lang/String;", "getDeleted", "()Z", "setDeleted", "(Z)V", "getFileList", "()Ljava/util/List;", "setFileList", "(Ljava/util/List;)V", "getId", "()I", "getImg", "getLink", "getMessage", "setMessage", "(Ljava/lang/String;)V", "getMy", "getPoll", "()Lru/unicorn/ujin/data/entities/chats/Poll;", "setPoll", "(Lru/unicorn/ujin/data/entities/chats/Poll;)V", "getSystem", "setSystem", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "getCreatedAt", "Ljava/util/Date;", "getImageUrl", "getText", "getUser", "Lru/unicorn/ujin/data/entities/chats/Author;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.entities.chats.Message */
/* compiled from: Message.kt */
public final class Message implements IMessage, MessageContentType.C2912Image {
    private final String autor;
    private boolean deleted;
    @SerializedName("files")
    private List<Attachment> fileList;

    /* renamed from: id */
    private final int f6626id;
    private final String img;
    private final String link;
    @SerializedName("text")
    private String message;

    /* renamed from: my */
    private final int f6627my;
    private Poll poll;
    private boolean system;
    @SerializedName("dt")
    private final Long timestamp;
    private final String type;

    public Message(int i, String str, Long l, String str2, String str3, String str4, int i2, boolean z, boolean z2, String str5, List<Attachment> list, Poll poll2) {
        this.f6626id = i;
        this.autor = str;
        this.timestamp = l;
        this.img = str2;
        this.link = str3;
        this.type = str4;
        this.f6627my = i2;
        this.deleted = z;
        this.system = z2;
        this.message = str5;
        this.fileList = list;
        this.poll = poll2;
    }

    public final int getId() {
        return this.f6626id;
    }

    public final String getAutor() {
        return this.autor;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getImg() {
        return this.img;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getType() {
        return this.type;
    }

    public final int getMy() {
        return this.f6627my;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final void setDeleted(boolean z) {
        this.deleted = z;
    }

    public final boolean getSystem() {
        return this.system;
    }

    public final void setSystem(boolean z) {
        this.system = z;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final List<Attachment> getFileList() {
        return this.fileList;
    }

    public final void setFileList(List<Attachment> list) {
        this.fileList = list;
    }

    public final Poll getPoll() {
        return this.poll;
    }

    public final void setPoll(Poll poll2) {
        this.poll = poll2;
    }

    public String getImageUrl() {
        List<Attachment> list = this.fileList;
        if (list == null || !(!list.isEmpty()) || this.deleted) {
            return null;
        }
        return list.get(0).getPreview();
    }

    /* renamed from: getId  reason: collision with other method in class */
    public String m8472getId() {
        return String.valueOf(this.f6626id);
    }

    public Date getCreatedAt() {
        Long l = this.timestamp;
        return new Date((l != null ? l.longValue() : 0) * ((long) 1000));
    }

    public Author getUser() {
        String valueOf = String.valueOf(this.f6627my);
        String str = this.autor;
        if (str == null) {
            str = "";
        }
        return new Author(valueOf, str, (String) null, 4, (DefaultConstructorMarker) null);
    }

    public String getText() {
        return this.message;
    }
}
