package p035ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel;

import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "requestSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "kotlin.jvm.PlatformType", "getRequestSubject", "()Lio/reactivex/subjects/PublishSubject;", "requestBuy", "", "requestRent", "requestTashir", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.RozmarinRemoteRepository */
/* compiled from: RozmarinRemoteRepository.kt */
public final class RozmarinRemoteRepository extends BaseRemoteRepository {
    /* access modifiers changed from: private */
    public static final String BUY = "Покупка";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String RENT = "Аренда";
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_SEND_REQUEST;
    private final PublishSubject<UpdateEvent> requestSubject = PublishSubject.create();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/chats/viewModel/chatViewModel/RozmarinRemoteRepository$Companion;", "", "()V", "BUY", "", "getBUY", "()Ljava/lang/String;", "RENT", "getRENT", "UNABLE_TO_SEND_REQUEST", "getUNABLE_TO_SEND_REQUEST", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.chats.viewModel.chatViewModel.RozmarinRemoteRepository$Companion */
    /* compiled from: RozmarinRemoteRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUNABLE_TO_SEND_REQUEST() {
            return RozmarinRemoteRepository.UNABLE_TO_SEND_REQUEST;
        }

        public final String getRENT() {
            return RozmarinRemoteRepository.RENT;
        }

        public final String getBUY() {
            return RozmarinRemoteRepository.BUY;
        }
    }

    static {
        String str;
        Resources resources;
        Context context = MainApplication.mContext;
        if (context == null || (resources = context.getResources()) == null || (str = resources.getString(R.string.unableToSendRozmarinRequest)) == null) {
            str = "";
        }
        Intrinsics.checkNotNullExpressionValue(str, "MainApplication.mContext…st)\n                ?: \"\"");
        UNABLE_TO_SEND_REQUEST = str;
    }

    public final PublishSubject<UpdateEvent> getRequestSubject() {
        return this.requestSubject;
    }

    public final void requestTashir() {
        getApi().requestTashir(getAppName(), getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RozmarinRemoteRepository$requestTashir$1(this), new RozmarinRemoteRepository$requestTashir$2(this));
    }

    public final void requestBuy() {
        getApi().requestParking(getAppName(), getToken(), BUY).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RozmarinRemoteRepository$requestBuy$1(this), new RozmarinRemoteRepository$requestBuy$2(this));
    }

    public final void requestRent() {
        getApi().requestParking(getAppName(), getToken(), RENT).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RozmarinRemoteRepository$requestRent$1(this), new RozmarinRemoteRepository$requestRent$2(this));
    }
}
