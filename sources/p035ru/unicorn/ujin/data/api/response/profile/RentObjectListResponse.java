package p035ru.unicorn.ujin.data.api.response.profile;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.LinksData;
import p035ru.unicorn.ujin.data.realm.MetaData;
import p035ru.unicorn.ujin.data.realm.profile.RentObject;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/profile/RentObjectListResponse;", "", "property", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/profile/RentObject;", "links", "Lru/unicorn/ujin/data/realm/LinksData;", "meta", "Lru/unicorn/ujin/data/realm/MetaData;", "(Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/LinksData;Lru/unicorn/ujin/data/realm/MetaData;)V", "getLinks", "()Lru/unicorn/ujin/data/realm/LinksData;", "getMeta", "()Lru/unicorn/ujin/data/realm/MetaData;", "getProperty", "()Lio/realm/RealmList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.profile.RentObjectListResponse */
/* compiled from: RentObjectListResponse.kt */
public final class RentObjectListResponse {
    private final LinksData links;
    private final MetaData meta;
    private final RealmList<RentObject> property;

    public static /* synthetic */ RentObjectListResponse copy$default(RentObjectListResponse rentObjectListResponse, RealmList<RentObject> realmList, LinksData linksData, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = rentObjectListResponse.property;
        }
        if ((i & 2) != 0) {
            linksData = rentObjectListResponse.links;
        }
        if ((i & 4) != 0) {
            metaData = rentObjectListResponse.meta;
        }
        return rentObjectListResponse.copy(realmList, linksData, metaData);
    }

    public final RealmList<RentObject> component1() {
        return this.property;
    }

    public final LinksData component2() {
        return this.links;
    }

    public final MetaData component3() {
        return this.meta;
    }

    public final RentObjectListResponse copy(RealmList<RentObject> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(realmList, "property");
        return new RentObjectListResponse(realmList, linksData, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RentObjectListResponse)) {
            return false;
        }
        RentObjectListResponse rentObjectListResponse = (RentObjectListResponse) obj;
        return Intrinsics.areEqual((Object) this.property, (Object) rentObjectListResponse.property) && Intrinsics.areEqual((Object) this.links, (Object) rentObjectListResponse.links) && Intrinsics.areEqual((Object) this.meta, (Object) rentObjectListResponse.meta);
    }

    public int hashCode() {
        RealmList<RentObject> realmList = this.property;
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
        return "RentObjectListResponse(property=" + this.property + ", links=" + this.links + ", meta=" + this.meta + ")";
    }

    public RentObjectListResponse(RealmList<RentObject> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(realmList, "property");
        this.property = realmList;
        this.links = linksData;
        this.meta = metaData;
    }

    public final RealmList<RentObject> getProperty() {
        return this.property;
    }

    public final LinksData getLinks() {
        return this.links;
    }

    public final MetaData getMeta() {
        return this.meta;
    }
}
