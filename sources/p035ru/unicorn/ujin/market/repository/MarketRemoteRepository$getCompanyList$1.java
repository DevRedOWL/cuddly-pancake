package p035ru.unicorn.ujin.market.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.marketplace.CompanyListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ServiceData;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CompanyListResponseData;", "kotlin.jvm.PlatformType", "resource", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.repository.MarketRemoteRepository$getCompanyList$1 */
/* compiled from: MarketRemoteRepository.kt */
final class MarketRemoteRepository$getCompanyList$1<T, R> implements Function<Resource<CompanyListResponseData>, Resource<CompanyListResponseData>> {
    public static final MarketRemoteRepository$getCompanyList$1 INSTANCE = new MarketRemoteRepository$getCompanyList$1();

    MarketRemoteRepository$getCompanyList$1() {
    }

    public final Resource<CompanyListResponseData> apply(Resource<CompanyListResponseData> resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        ServiceData service = resource.getService();
        return Resource.success(Integer.valueOf((service != null ? service.getError() : null) == null ? 0 : 1), resource.getMessage(), resource.getData());
    }
}
