package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.LinksData;
import p035ru.unicorn.ujin.data.realm.MetaData;
import p035ru.unicorn.ujin.data.realm.marketplace.Tag;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/TagListResponseData;", "", "tags", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Tag;", "links", "Lru/unicorn/ujin/data/realm/LinksData;", "meta", "Lru/unicorn/ujin/data/realm/MetaData;", "(Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/LinksData;Lru/unicorn/ujin/data/realm/MetaData;)V", "getLinks", "()Lru/unicorn/ujin/data/realm/LinksData;", "getMeta", "()Lru/unicorn/ujin/data/realm/MetaData;", "getTags", "()Lio/realm/RealmList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.TagListResponseData */
/* compiled from: TagListResponse.kt */
public final class TagListResponseData {
    private final LinksData links;
    private final MetaData meta;
    private final RealmList<Tag> tags;

    public static /* synthetic */ TagListResponseData copy$default(TagListResponseData tagListResponseData, RealmList<Tag> realmList, LinksData linksData, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = tagListResponseData.tags;
        }
        if ((i & 2) != 0) {
            linksData = tagListResponseData.links;
        }
        if ((i & 4) != 0) {
            metaData = tagListResponseData.meta;
        }
        return tagListResponseData.copy(realmList, linksData, metaData);
    }

    public final RealmList<Tag> component1() {
        return this.tags;
    }

    public final LinksData component2() {
        return this.links;
    }

    public final MetaData component3() {
        return this.meta;
    }

    public final TagListResponseData copy(RealmList<Tag> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        return new TagListResponseData(realmList, linksData, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagListResponseData)) {
            return false;
        }
        TagListResponseData tagListResponseData = (TagListResponseData) obj;
        return Intrinsics.areEqual((Object) this.tags, (Object) tagListResponseData.tags) && Intrinsics.areEqual((Object) this.links, (Object) tagListResponseData.links) && Intrinsics.areEqual((Object) this.meta, (Object) tagListResponseData.meta);
    }

    public int hashCode() {
        RealmList<Tag> realmList = this.tags;
        int i = 0;
        int hashCode = (realmList != null ? realmList.hashCode() : 0) * 31;
        LinksData linksData = this.links;
        int hashCode2 = (hashCode + (linksData != null ? linksData.hashCode() : 0)) * 31;
        MetaData metaData = this.meta;
        if (metaData != null) {
            i = metaData.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TagListResponseData(tags=" + this.tags + ", links=" + this.links + ", meta=" + this.meta + ")";
    }

    public TagListResponseData(RealmList<Tag> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        this.tags = realmList;
        this.links = linksData;
        this.meta = metaData;
    }

    public final RealmList<Tag> getTags() {
        return this.tags;
    }

    public final LinksData getLinks() {
        return this.links;
    }

    public final MetaData getMeta() {
        return this.meta;
    }
}
