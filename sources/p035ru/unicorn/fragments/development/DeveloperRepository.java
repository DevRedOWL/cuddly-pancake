package p035ru.unicorn.fragments.development;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.developerPage.DeveloperPageData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/fragments/development/DeveloperRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "requestDevelopmentData", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/developerPage/DeveloperPageData;", "complexId", "", "flatId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.fragments.development.DeveloperRepository */
/* compiled from: DeveloperRepository.kt */
public final class DeveloperRepository extends BaseRemoteRepository {
    public final Flowable<Resource<DeveloperPageData>> requestDevelopmentData(String str, String str2) {
        Flowable<R> subscribeOn = getApi().getConstructionInfo(getAppName(), getToken(), str, str2).map(DeveloperRepository$requestDevelopmentData$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getConstructionInfo(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
