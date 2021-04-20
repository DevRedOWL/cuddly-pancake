package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.LinksData;
import p035ru.unicorn.ujin.data.realm.MetaData;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/OfferResponseData;", "", "offers", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Offer;", "links", "Lru/unicorn/ujin/data/realm/LinksData;", "meta", "Lru/unicorn/ujin/data/realm/MetaData;", "(Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/LinksData;Lru/unicorn/ujin/data/realm/MetaData;)V", "getLinks", "()Lru/unicorn/ujin/data/realm/LinksData;", "getMeta", "()Lru/unicorn/ujin/data/realm/MetaData;", "getOffers", "()Lio/realm/RealmList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.OfferResponseData */
/* compiled from: OfferResponse.kt */
public final class OfferResponseData {
    private final LinksData links;
    private final MetaData meta;
    private final RealmList<Offer> offers;

    public static /* synthetic */ OfferResponseData copy$default(OfferResponseData offerResponseData, RealmList<Offer> realmList, LinksData linksData, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = offerResponseData.offers;
        }
        if ((i & 2) != 0) {
            linksData = offerResponseData.links;
        }
        if ((i & 4) != 0) {
            metaData = offerResponseData.meta;
        }
        return offerResponseData.copy(realmList, linksData, metaData);
    }

    public final RealmList<Offer> component1() {
        return this.offers;
    }

    public final LinksData component2() {
        return this.links;
    }

    public final MetaData component3() {
        return this.meta;
    }

    public final OfferResponseData copy(RealmList<Offer> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        return new OfferResponseData(realmList, linksData, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferResponseData)) {
            return false;
        }
        OfferResponseData offerResponseData = (OfferResponseData) obj;
        return Intrinsics.areEqual((Object) this.offers, (Object) offerResponseData.offers) && Intrinsics.areEqual((Object) this.links, (Object) offerResponseData.links) && Intrinsics.areEqual((Object) this.meta, (Object) offerResponseData.meta);
    }

    public int hashCode() {
        RealmList<Offer> realmList = this.offers;
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
        return "OfferResponseData(offers=" + this.offers + ", links=" + this.links + ", meta=" + this.meta + ")";
    }

    public OfferResponseData(RealmList<Offer> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        this.offers = realmList;
        this.links = linksData;
        this.meta = metaData;
    }

    public final RealmList<Offer> getOffers() {
        return this.offers;
    }

    public final LinksData getLinks() {
        return this.links;
    }

    public final MetaData getMeta() {
        return this.meta;
    }
}
