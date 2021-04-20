package p035ru.unicorn.ujin.data.entities.chats;

import com.google.gson.annotations.SerializedName;
import com.stfalcon.chatkit.commons.models.IUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, mo51343d2 = {"Lru/unicorn/ujin/data/entities/chats/Author;", "Lcom/stfalcon/chatkit/commons/models/IUser;", "Lio/realm/RealmObject;", "authorId", "", "fullName", "avatarUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthorId", "()Ljava/lang/String;", "setAuthorId", "(Ljava/lang/String;)V", "getAvatarUrl", "setAvatarUrl", "getFullName", "setFullName", "getAvatar", "getId", "getName", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.entities.chats.Author */
/* compiled from: Author.kt */
public class Author extends RealmObject implements IUser, ru_unicorn_ujin_data_entities_chats_AuthorRealmProxyInterface {
    @SerializedName("id")
    private String authorId;
    @SerializedName("ava")
    private String avatarUrl;
    @SerializedName("name")
    private String fullName;

    public Author() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$authorId() {
        return this.authorId;
    }

    public String realmGet$avatarUrl() {
        return this.avatarUrl;
    }

    public String realmGet$fullName() {
        return this.fullName;
    }

    public void realmSet$authorId(String str) {
        this.authorId = str;
    }

    public void realmSet$avatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void realmSet$fullName(String str) {
        this.fullName = str;
    }

    public final String getAuthorId() {
        return realmGet$authorId();
    }

    public final void setAuthorId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$authorId(str);
    }

    public final String getFullName() {
        return realmGet$fullName();
    }

    public final void setFullName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$fullName(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Author(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public final String getAvatarUrl() {
        return realmGet$avatarUrl();
    }

    public final void setAvatarUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$avatarUrl(str);
    }

    public Author(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "authorId");
        Intrinsics.checkNotNullParameter(str2, "fullName");
        Intrinsics.checkNotNullParameter(str3, "avatarUrl");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$authorId(str);
        realmSet$fullName(str2);
        realmSet$avatarUrl(str3);
    }

    public String getAvatar() {
        if (StringsKt.startsWith$default(realmGet$avatarUrl(), "https:/", false, 2, (Object) null)) {
            return realmGet$avatarUrl();
        }
        return realmGet$fullName();
    }

    public String getName() {
        return realmGet$fullName();
    }

    public String getId() {
        return realmGet$authorId();
    }
}
