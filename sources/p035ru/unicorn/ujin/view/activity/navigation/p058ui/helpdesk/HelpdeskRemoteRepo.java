package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import java.util.List;
import p035ru.unicorn.ujin.data.api.response.chats.FileUploadData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentObjectBody;
import p046io.reactivex.BackpressureStrategy;
import p046io.reactivex.Flowable;
import p046io.reactivex.Single;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.HelpdeskRemoteRepo */
class HelpdeskRemoteRepo extends BaseRemoteRepository {
    public static final String WITH_MESSAGES = "1";

    HelpdeskRemoteRepo() {
    }

    public Flowable<Resource<List<ServiceTicket>>> getTickets() {
        return getApi().getServiceTickets(getAppName(), getToken()).map($$Lambda$HelpdeskRemoteRepo$NeQR4UrZRZxuYdNBNNUnbksOPww.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$lROgnN6mQdK9wgbvCmGOFHgmqE.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ServiceTicket>> updateTickets(String str, String str2, String str3, String str4) {
        return getApi().updateTicket(str, str2, str3, str4, getAppName(), getToken()).map($$Lambda$HelpdeskRemoteRepo$RkWXGxDbHVcw9KsTg5LUiGoqgQ.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$6ewSj5LqIqBAT2qNFBABlFuPJ1Y.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<FileUploadData>> uploadFileForServiceTicket(String str, String str2, String str3) {
        return getApi().uploadFileForServiceTicket(getAppName(), getToken(), str, str2, str3).map($$Lambda$HelpdeskRemoteRepo$aGcON1qcdkHYqLiCNNg9aIM4Cr4.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$MAIKNZYNH2M_gB9ETVH77hFCpi0.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Single<Resource<FileUploadData>> uploadFileForServiceTickeSingle(String str, String str2, String str3) {
        return getApi().uploadFileForServiceTicketSingle(getAppName(), getToken(), str, str2, str3).map($$Lambda$HelpdeskRemoteRepo$ZgGHkBlhlsrHrF9RIRDNHVe3NA.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$qCntgHLrb687XX2aoJH6Z2k5h6M.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ServiceTicket>> getTicketDescription(String str) {
        return getApi().getTicketById(str, "1", getAppName(), getToken()).map($$Lambda$HelpdeskRemoteRepo$_dl5AoZZ1X8gpXIlGNc295eEjN8.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$ffoXenTmNMsaKo7YA_TqSDGKbI.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ServiceMessages>> sendComment(String str, String str2, String str3) {
        return getApi().sendComment(str, str2, str3, getAppName(), getToken()).map($$Lambda$HelpdeskRemoteRepo$oCSVGxYIA3LLkEpqQ07YaZII8.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$IBfMcWyPGDOQEeOBD7spqxNfPgk.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> attachFileToMessage(String str, String str2, String str3) {
        return getApi().attachFileToMessage(getAppName(), str, str2, str3).map($$Lambda$HelpdeskRemoteRepo$w4hWbS5yPzaOWacXZ0LW5csiDH8.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$6tMLU6wDTsZvakm6tilhDf0l0qo.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<FileUploadData>> uploadFile(String str, String str2) {
        return getApi().uploadFile(getAppName(), getToken(), str, str2).map($$Lambda$HelpdeskRemoteRepo$YAapaQo6OzmmB2qmjBXx1bmWG48.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$MS6jxbwFjXrHz8utkYiSlFwUeiI.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).toFlowable(BackpressureStrategy.BUFFER);
    }

    public Flowable<Resource<CreateTicket>> sendMorionTicket(ITicket iTicket) {
        return getApi().createTicket(getToken(), new RentObjectBody(iTicket)).map($$Lambda$HelpdeskRemoteRepo$Lmf57GOkR15xLBkrv9CntyqwuMk.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$YHmZlGjnFadK1Ff1FlCLZ8CTWfs.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<RentTicketList>> getRentTickets(String[] strArr, String str) {
        return getApi().getRentsTicket(getToken(), RentObject.create2(strArr, str)).map($$Lambda$HelpdeskRemoteRepo$vMXrAGkcvq9k1gdhLB68Y47GhU.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$YwFT2Y9i07sdJT7lVe0xdv9RBY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<KolyaSuccesModel>> changeTicketState(int i, String str) {
        if (i == 0) {
            return getApi().returnTicketAsNotComplete(getToken(), str).map($$Lambda$HelpdeskRemoteRepo$CMabet9WIQGtgKlF3ZHPsahow.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$26XaqP1xFiE8n74L5OwEUooE4fY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
        }
        if (i == 1) {
            return getApi().confirmTicketAsFinished(getToken(), str).map($$Lambda$HelpdeskRemoteRepo$oD1ouMWKSWbpQC7UtmHN_2kDGg.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$JyI96pr5n4NzZ4QEgO_ePD2NME.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
        }
        if (i != 2) {
            return Flowable.empty();
        }
        return getApi().cancelTicket(getToken(), str).map($$Lambda$HelpdeskRemoteRepo$cp4TjiHTjazZ3vOSjWKBqxg48ps.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$7oXZOp2fAk5jfURuWPWedEO3JlU.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<Resource<ServiceTicketTypeList>> getAvailableTypes() {
        return getApi().getTicketAvailableType(getToken()).map($$Lambda$HelpdeskRemoteRepo$jnZvZ5C5KAyClX7pfQvWKxskH4.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$5ydsylBpjNnkMb30l4sXj5qfTc.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<Resource<CreateTicket>> evaluateTicket(String str, int i, String str2) {
        return getApi().evaluateTicket(getToken(), str, i, str2).map($$Lambda$HelpdeskRemoteRepo$eXMBkKe3Y6o0Trq9THI7kZTFCE.INSTANCE).onErrorReturn($$Lambda$HelpdeskRemoteRepo$SnTd8C2zTLeFideGFuAGLMuvTU.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }
}
