package p035ru.unicorn.ujin.view.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherArchivePassListEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherPassListEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.PassListRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.AnotherPassResponse;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.enterprise.EnterpriseListResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001aJ\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00110\u0010J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017R5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/AnotherPassRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "inviteTextSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "kotlin.jvm.PlatformType", "getInviteTextSubject", "()Lio/reactivex/subjects/PublishSubject;", "myArchivePassListSubject", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherArchivePassListEvent;", "getMyArchivePassListSubject", "myPassListSubject", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherPassListEvent;", "getMyPassListSubject", "createAnotherPass", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/AnotherPassResponse;", "body", "Lru/unicorn/ujin/view/fragments/anotherPass/request/CreateAnotherPassRequestBody;", "getAnotherPass", "id", "", "getArchivePassList", "", "Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListRequestBody;", "getEnterpriseList", "Lru/unicorn/ujin/view/fragments/anotherPass/response/enterprise/EnterpriseListResponse;", "getPassList", "requestInviteText", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.AnotherPassRemoteRepository */
/* compiled from: AnotherPassRemoteRepository.kt */
public final class AnotherPassRemoteRepository extends BaseRemoteRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD = "Не удалось загрузить данные. Попробуйте позже";
    private final PublishSubject<UpdateEvent> inviteTextSubject = PublishSubject.create();
    private final PublishSubject<AnotherArchivePassListEvent> myArchivePassListSubject = PublishSubject.create();
    private final PublishSubject<AnotherPassListEvent> myPassListSubject = PublishSubject.create();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/AnotherPassRemoteRepository$Companion;", "", "()V", "UNABLE_TO_LOAD", "", "getUNABLE_TO_LOAD", "()Ljava/lang/String;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.AnotherPassRemoteRepository$Companion */
    /* compiled from: AnotherPassRemoteRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUNABLE_TO_LOAD() {
            return AnotherPassRemoteRepository.UNABLE_TO_LOAD;
        }
    }

    public final PublishSubject<AnotherPassListEvent> getMyPassListSubject() {
        return this.myPassListSubject;
    }

    public final PublishSubject<AnotherArchivePassListEvent> getMyArchivePassListSubject() {
        return this.myArchivePassListSubject;
    }

    public final PublishSubject<UpdateEvent> getInviteTextSubject() {
        return this.inviteTextSubject;
    }

    public final void getPassList(PassListRequestBody passListRequestBody) {
        Intrinsics.checkNotNullParameter(passListRequestBody, FCM.BODY);
        getApi().getAnotherPassList(getToken(), passListRequestBody).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnotherPassRemoteRepository$getPassList$1(this), new AnotherPassRemoteRepository$getPassList$2(this));
    }

    public final void getArchivePassList(PassListRequestBody passListRequestBody) {
        Intrinsics.checkNotNullParameter(passListRequestBody, FCM.BODY);
        getApi().getAnotherPassList(getToken(), passListRequestBody).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnotherPassRemoteRepository$getArchivePassList$1(this), new AnotherPassRemoteRepository$getArchivePassList$2(this));
    }

    public final Flowable<Resource<AnotherPassResponse>> createAnotherPass(CreateAnotherPassRequestBody createAnotherPassRequestBody) {
        Intrinsics.checkNotNullParameter(createAnotherPassRequestBody, FCM.BODY);
        Flowable<R> subscribeOn = getApi().createAnotherPass(getToken(), createAnotherPassRequestBody).map(AnotherPassRemoteRepository$createAnotherPass$1.INSTANCE).onErrorReturn(AnotherPassRemoteRepository$createAnotherPass$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.createAnotherPass(ge…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<AnotherPassResponse>> getAnotherPass(int i) {
        Flowable<R> subscribeOn = getApi().getAnotherPass(getToken(), i).map(AnotherPassRemoteRepository$getAnotherPass$1.INSTANCE).onErrorReturn(AnotherPassRemoteRepository$getAnotherPass$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getAnotherPass(getTo…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<EnterpriseListResponse>> getEnterpriseList() {
        Flowable<R> subscribeOn = getApi().getEnterpriseList(getToken()).map(AnotherPassRemoteRepository$getEnterpriseList$1.INSTANCE).onErrorReturn(AnotherPassRemoteRepository$getEnterpriseList$2.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getEnterpriseList(ge…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void requestInviteText(int i) {
        getApi().getAnotherPassInviteText(getToken(), i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnotherPassRemoteRepository$requestInviteText$1(this), new AnotherPassRemoteRepository$requestInviteText$2(this));
    }
}
