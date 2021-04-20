package p035ru.unicorn.ujin.view.fragments.providerService;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.api.request.AuthBody;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "activeProviderInfoSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoEvent;", "kotlin.jvm.PlatformType", "getActiveProviderInfoSubject", "()Lio/reactivex/subjects/PublishSubject;", "deleteActiveProviderInfoSubject", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getDeleteActiveProviderInfoSubject", "providerInfoSubject", "Lru/unicorn/ujin/view/fragments/providerService/ProviderInfoEvent;", "getProviderInfoSubject", "deleteActiveProviderInfo", "", "serviceId", "", "getActiveProviderInfo", "getProviderInfo", "provider", "", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceRemoteRepository */
/* compiled from: ProviderServiceRemoteRepository.kt */
public final class ProviderServiceRemoteRepository extends BaseRemoteRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_DELETE_PROVIDER = "Не удалось отвязать услугу. Попробуйте повторить позднее";
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD_PROVIDER_INFO = "Не удалось загрузить информацию по услуге. Попробуйте повторить позднее";
    private final PublishSubject<ActiveProviderInfoEvent> activeProviderInfoSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> deleteActiveProviderInfoSubject = PublishSubject.create();
    private final PublishSubject<ProviderInfoEvent> providerInfoSubject = PublishSubject.create();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceRemoteRepository$Companion;", "", "()V", "UNABLE_TO_DELETE_PROVIDER", "", "getUNABLE_TO_DELETE_PROVIDER", "()Ljava/lang/String;", "UNABLE_TO_LOAD_PROVIDER_INFO", "getUNABLE_TO_LOAD_PROVIDER_INFO", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceRemoteRepository$Companion */
    /* compiled from: ProviderServiceRemoteRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUNABLE_TO_LOAD_PROVIDER_INFO() {
            return ProviderServiceRemoteRepository.UNABLE_TO_LOAD_PROVIDER_INFO;
        }

        public final String getUNABLE_TO_DELETE_PROVIDER() {
            return ProviderServiceRemoteRepository.UNABLE_TO_DELETE_PROVIDER;
        }
    }

    public final PublishSubject<ProviderInfoEvent> getProviderInfoSubject() {
        return this.providerInfoSubject;
    }

    public final PublishSubject<ActiveProviderInfoEvent> getActiveProviderInfoSubject() {
        return this.activeProviderInfoSubject;
    }

    public final PublishSubject<UpdateEvent> getDeleteActiveProviderInfoSubject() {
        return this.deleteActiveProviderInfoSubject;
    }

    public final void getProviderInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "provider");
        getApi().getProviderInfo(getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProviderServiceRemoteRepository$getProviderInfo$1(this), new ProviderServiceRemoteRepository$getProviderInfo$2(this));
    }

    public final void getActiveProviderInfo(int i) {
        Pro100Api api = getApi();
        String token = getToken();
        AuthBody authBody = new AuthBody("api-token", getToken());
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        Unit unit = Unit.INSTANCE;
        api.getActiveProviderInfo(token, new ActiveProviderInfoData(authBody, new ActiveProviderData(arrayList))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProviderServiceRemoteRepository$getActiveProviderInfo$2(this), new ProviderServiceRemoteRepository$getActiveProviderInfo$3(this));
    }

    public final void deleteActiveProviderInfo(int i) {
        getApi().deleteActiveProviderInfo(getToken(), new DeleteActiveProviderInfoData(new AuthBody("api-token", getToken()), new DeleteActiveProviderData(i))).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProviderServiceRemoteRepository$deleteActiveProviderInfo$1(this), new ProviderServiceRemoteRepository$deleteActiveProviderInfo$2(this));
    }
}
