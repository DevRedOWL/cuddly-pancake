package p035ru.unicorn.ujin.data.api.response.chats;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/chats/SearchContactsResponseDataContact;", "", "id", "", "name", "avatar", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getId", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.chats.SearchContactsResponseDataContact */
/* compiled from: SearchContactsResponse.kt */
public final class SearchContactsResponseDataContact {
    private final String avatar;

    /* renamed from: id */
    private final String f6617id;
    private final String name;

    public static /* synthetic */ SearchContactsResponseDataContact copy$default(SearchContactsResponseDataContact searchContactsResponseDataContact, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchContactsResponseDataContact.f6617id;
        }
        if ((i & 2) != 0) {
            str2 = searchContactsResponseDataContact.name;
        }
        if ((i & 4) != 0) {
            str3 = searchContactsResponseDataContact.avatar;
        }
        return searchContactsResponseDataContact.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f6617id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.avatar;
    }

    public final SearchContactsResponseDataContact copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "avatar");
        return new SearchContactsResponseDataContact(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchContactsResponseDataContact)) {
            return false;
        }
        SearchContactsResponseDataContact searchContactsResponseDataContact = (SearchContactsResponseDataContact) obj;
        return Intrinsics.areEqual((Object) this.f6617id, (Object) searchContactsResponseDataContact.f6617id) && Intrinsics.areEqual((Object) this.name, (Object) searchContactsResponseDataContact.name) && Intrinsics.areEqual((Object) this.avatar, (Object) searchContactsResponseDataContact.avatar);
    }

    public int hashCode() {
        String str = this.f6617id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.avatar;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "SearchContactsResponseDataContact(id=" + this.f6617id + ", name=" + this.name + ", avatar=" + this.avatar + ")";
    }

    public SearchContactsResponseDataContact(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "avatar");
        this.f6617id = str;
        this.name = str2;
        this.avatar = str3;
    }

    public final String getId() {
        return this.f6617id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }
}
