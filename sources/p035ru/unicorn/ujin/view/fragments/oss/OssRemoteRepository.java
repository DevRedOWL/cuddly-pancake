package p035ru.unicorn.ujin.view.fragments.oss;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.fragments.oss.events.OssDataEvent;
import p035ru.unicorn.ujin.view.fragments.oss.events.OssListEvent;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssConfirm;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssGetSms;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssVote;
import p035ru.unicorn.ujin.view.fragments.oss.response.OssVoteAnswer;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bJ\u001c\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR5\u0010\u000e\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR5\u0010\u0011\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/OssRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "ossCodeSentSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "kotlin.jvm.PlatformType", "getOssCodeSentSubject", "()Lio/reactivex/subjects/PublishSubject;", "ossDataSubject", "Lru/unicorn/ujin/view/fragments/oss/events/OssDataEvent;", "getOssDataSubject", "ossGetSmsSubject", "getOssGetSmsSubject", "ossListSubject", "Lru/unicorn/ujin/view/fragments/oss/events/OssListEvent;", "getOssListSubject", "ossVoteSubject", "getOssVoteSubject", "getOssById", "", "id", "", "getOssList", "getSmsCode", "sendCode", "code", "", "vote", "ossAnswerList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/oss/response/OssVoteAnswer;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.oss.OssRemoteRepository */
/* compiled from: OssRemoteRepository.kt */
public final class OssRemoteRepository extends BaseRemoteRepository {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_CONFIRM = "Не удалось подтвердить ваш голос СМСкой. Попробуйте позже";
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_GET_SMS = "Произошла ошибка, попробуйте позже";
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD_OSS_DATA = "Не удалось загрузить подробную информацию о голосовании, попробуйте позже";
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_LOAD_OSS_LIST = "Не удалось загрузить список голосований, попробуйте позже";
    /* access modifiers changed from: private */
    public static final String UNABLE_TO_VOTE = "Ответы не сохранены, попробуйте еще раз";
    private final PublishSubject<UpdateEvent> ossCodeSentSubject = PublishSubject.create();
    private final PublishSubject<OssDataEvent> ossDataSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> ossGetSmsSubject = PublishSubject.create();
    private final PublishSubject<OssListEvent> ossListSubject = PublishSubject.create();
    private final PublishSubject<UpdateEvent> ossVoteSubject = PublishSubject.create();

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/oss/OssRemoteRepository$Companion;", "", "()V", "UNABLE_TO_CONFIRM", "", "getUNABLE_TO_CONFIRM", "()Ljava/lang/String;", "UNABLE_TO_GET_SMS", "getUNABLE_TO_GET_SMS", "UNABLE_TO_LOAD_OSS_DATA", "getUNABLE_TO_LOAD_OSS_DATA", "UNABLE_TO_LOAD_OSS_LIST", "getUNABLE_TO_LOAD_OSS_LIST", "UNABLE_TO_VOTE", "getUNABLE_TO_VOTE", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.oss.OssRemoteRepository$Companion */
    /* compiled from: OssRemoteRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getUNABLE_TO_LOAD_OSS_LIST() {
            return OssRemoteRepository.UNABLE_TO_LOAD_OSS_LIST;
        }

        public final String getUNABLE_TO_LOAD_OSS_DATA() {
            return OssRemoteRepository.UNABLE_TO_LOAD_OSS_DATA;
        }

        public final String getUNABLE_TO_GET_SMS() {
            return OssRemoteRepository.UNABLE_TO_GET_SMS;
        }

        public final String getUNABLE_TO_VOTE() {
            return OssRemoteRepository.UNABLE_TO_VOTE;
        }

        public final String getUNABLE_TO_CONFIRM() {
            return OssRemoteRepository.UNABLE_TO_CONFIRM;
        }
    }

    public final PublishSubject<OssListEvent> getOssListSubject() {
        return this.ossListSubject;
    }

    public final PublishSubject<OssDataEvent> getOssDataSubject() {
        return this.ossDataSubject;
    }

    public final PublishSubject<UpdateEvent> getOssGetSmsSubject() {
        return this.ossGetSmsSubject;
    }

    public final PublishSubject<UpdateEvent> getOssCodeSentSubject() {
        return this.ossCodeSentSubject;
    }

    public final PublishSubject<UpdateEvent> getOssVoteSubject() {
        return this.ossVoteSubject;
    }

    public final void getOssList() {
        getApi().getOssList(getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new OssRemoteRepository$getOssList$1(this), new OssRemoteRepository$getOssList$2(this));
    }

    public final void getOssById(int i) {
        getApi().getOssById(getToken(), i).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new OssRemoteRepository$getOssById$1(this), new OssRemoteRepository$getOssById$2(this));
    }

    public final void getSmsCode(int i) {
        getApi().getOssSmsCode(getToken(), new OssGetSms(i)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new OssRemoteRepository$getSmsCode$1(this), new OssRemoteRepository$getSmsCode$2(this));
    }

    public final void sendCode(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        getApi().confirmOss(getToken(), new OssConfirm(i, str)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new OssRemoteRepository$sendCode$1(this), new OssRemoteRepository$sendCode$2(this));
    }

    public final void vote(int i, ArrayList<OssVoteAnswer> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "ossAnswerList");
        getApi().voteOss(getToken(), new OssVote(i, arrayList)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new OssRemoteRepository$vote$1(this), new OssRemoteRepository$vote$2(this));
    }
}
