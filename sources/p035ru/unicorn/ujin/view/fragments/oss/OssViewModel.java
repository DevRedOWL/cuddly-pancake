package p035ru.unicorn.ujin.view.fragments.oss;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.oss.events.OssDataEvent;
import p035ru.unicorn.ujin.view.fragments.oss.events.OssListEvent;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssVoteAnswer;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0019H\u0014J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001e\u001a\u00020\u0019J\u0016\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u001c\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/OssViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "ossConfirmationSentLiveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getOssConfirmationSentLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "ossDataMutableLiveData", "Lru/unicorn/ujin/view/fragments/oss/events/OssDataEvent;", "getOssDataMutableLiveData", "ossListMutableLiveData", "Lru/unicorn/ujin/view/fragments/oss/events/OssListEvent;", "getOssListMutableLiveData", "ossSmsSentLiveData", "getOssSmsSentLiveData", "ossVoteLiveData", "getOssVoteLiveData", "remoteRepository", "Lru/unicorn/ujin/view/fragments/oss/OssRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/oss/OssRemoteRepository;", "remoteRepository$delegate", "Lkotlin/Lazy;", "getSmsCode", "", "id", "", "onCleared", "requestCurrentOssQuestions", "requestOssList", "sendCode", "code", "", "vote", "ossAnswerList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssVoteAnswer;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.OssViewModel */
/* compiled from: OssViewModel.kt */
public final class OssViewModel extends BaseViewModel {
    private final SingleLiveEvent<UpdateEvent> ossConfirmationSentLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<OssDataEvent> ossDataMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<OssListEvent> ossListMutableLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> ossSmsSentLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<UpdateEvent> ossVoteLiveData = new SingleLiveEvent<>();
    private final Lazy remoteRepository$delegate = LazyKt.lazy(OssViewModel$remoteRepository$2.INSTANCE);

    public final OssRemoteRepository getRemoteRepository() {
        return (OssRemoteRepository) this.remoteRepository$delegate.getValue();
    }

    public OssViewModel() {
        this.compositeDisposable.addAll(getRemoteRepository().getOssListSubject().subscribe(new Consumer<OssListEvent>(this) {
            final /* synthetic */ OssViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(OssListEvent ossListEvent) {
                OssViewModel ossViewModel = this.this$0;
                ossViewModel.showLoader.postValue(false);
                ossViewModel.getOssListMutableLiveData().postValue(ossListEvent);
            }
        }), getRemoteRepository().getOssDataSubject().subscribe(new Consumer<OssDataEvent>(this) {
            final /* synthetic */ OssViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(OssDataEvent ossDataEvent) {
                OssViewModel ossViewModel = this.this$0;
                ossViewModel.showLoader.postValue(false);
                ossViewModel.getOssDataMutableLiveData().postValue(ossDataEvent);
            }
        }), getRemoteRepository().getOssGetSmsSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ OssViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                OssViewModel ossViewModel = this.this$0;
                ossViewModel.showLoader.postValue(false);
                ossViewModel.getOssSmsSentLiveData().postValue(updateEvent);
            }
        }), getRemoteRepository().getOssVoteSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ OssViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                OssViewModel ossViewModel = this.this$0;
                ossViewModel.showLoader.postValue(false);
                ossViewModel.getOssVoteLiveData().postValue(updateEvent);
            }
        }), getRemoteRepository().getOssCodeSentSubject().subscribe(new Consumer<UpdateEvent>(this) {
            final /* synthetic */ OssViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(UpdateEvent updateEvent) {
                OssViewModel ossViewModel = this.this$0;
                ossViewModel.showLoader.postValue(false);
                ossViewModel.getOssConfirmationSentLiveData().postValue(updateEvent);
            }
        }));
    }

    public final SingleLiveEvent<OssListEvent> getOssListMutableLiveData() {
        return this.ossListMutableLiveData;
    }

    public final SingleLiveEvent<OssDataEvent> getOssDataMutableLiveData() {
        return this.ossDataMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getOssSmsSentLiveData() {
        return this.ossSmsSentLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getOssConfirmationSentLiveData() {
        return this.ossConfirmationSentLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getOssVoteLiveData() {
        return this.ossVoteLiveData;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.compositeDisposable.clear();
    }

    public final void requestOssList() {
        this.showLoader.postValue(true);
        getRemoteRepository().getOssList();
    }

    public final void requestCurrentOssQuestions(int i) {
        this.showLoader.postValue(true);
        getRemoteRepository().getOssById(i);
    }

    public final void getSmsCode(int i) {
        this.showLoader.postValue(true);
        getRemoteRepository().getSmsCode(i);
    }

    public final void sendCode(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        this.showLoader.postValue(true);
        getRemoteRepository().sendCode(i, str);
    }

    public final void vote(int i, ArrayList<OssVoteAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "ossAnswerList");
        this.showLoader.postValue(true);
        getRemoteRepository().vote(i, arrayList);
    }
}
