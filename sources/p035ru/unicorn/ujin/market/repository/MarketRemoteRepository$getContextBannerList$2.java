package p035ru.unicorn.ujin.market.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001aF\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0002 \u0004*\"\u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "kotlin.jvm.PlatformType", "throwable", "", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getContextBannerList$2 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getContextBannerList$2<T, R> implements Function<Throwable, Resource<List<? extends ContextBanner>>> {
    public static final MarketRemoteRepository$getContextBannerList$2 INSTANCE = new MarketRemoteRepository$getContextBannerList$2();

    MarketRemoteRepository$getContextBannerList$2() {
    }

    public final Resource<List<ContextBanner>> apply(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "throwable");
        return Resource.error(th.getMessage());
    }
}
