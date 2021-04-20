package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.CreateRecordOut;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.RevokeIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleListIn;
import p046io.reactivex.Flowable;
import p046io.reactivex.Observable;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\fJ\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00130\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001e0\u0012J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001e0\u0012J\u0006\u0010!\u001a\u00020\"J\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u001e0\u00130\u0012J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00130\u00122\u0006\u0010'\u001a\u00020(J\u0010\u0010)\u001a\u00020\u001b2\b\u0010*\u001a\u0004\u0018\u00010 J\u000e\u0010+\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordRep;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "localRep", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "getLocalRep", "()Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "profileRep", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "getProfileRep", "()Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "toUserId", "", "getToUserId", "()I", "setToUserId", "(I)V", "cancelRecord", "Lio/reactivex/Observable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/RevokeIn;", "recordId", "createRecord", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "record", "Lru/unicorn/ujin/view/fragments/makearecord/model/CreateRecordOut;", "deleteRecordLocally", "", "id", "getAllRecords", "", "getExecutorsList", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "getUserInfo", "Lru/unicorn/ujin/data/realm/profile/User;", "loadAvailableDatesByExecutorId", "Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "loadSchedule", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleListIn;", "date", "", "setExecutor", "executor", "setUserId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep */
/* compiled from: RecordRep.kt */
public class RecordRep extends BaseRemoteRepository {
    private final LocalRepository localRep;
    private final ProfileLocalRepository profileRep = ProfileLocalRepository.Companion.getInstance();
    private int toUserId;

    public RecordRep() {
        LocalRepository instance = LocalRepository.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "LocalRepository.getInstance()");
        this.localRep = instance;
    }

    public final LocalRepository getLocalRep() {
        return this.localRep;
    }

    public final ProfileLocalRepository getProfileRep() {
        return this.profileRep;
    }

    public final int getToUserId() {
        return this.toUserId;
    }

    public final void setToUserId(int i) {
        this.toUserId = i;
    }

    public final void setUserId(int i) {
        this.toUserId = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = r1.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setExecutor(p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L_0x000d
            java.lang.Integer r1 = r1.getId()
            if (r1 == 0) goto L_0x000d
            int r1 = r1.intValue()
            goto L_0x000e
        L_0x000d:
            r1 = -1
        L_0x000e:
            r0.setUserId(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.makearecord.RecordRep.setExecutor(ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn):void");
    }

    public final Observable<List<Appointment>> getAllRecords() {
        Flowable<List<U>> flowable = this.localRep.getDataSortedByField(Appointment.class, "id").filter(RecordRep$getAllRecords$localData$1.INSTANCE).flatMapIterable(RecordRep$getAllRecords$localData$2.INSTANCE).cast(Appointment.class).toList().toFlowable();
        Intrinsics.checkNotNullExpressionValue(flowable, "localRep.getDataSortedBy…            .toFlowable()");
        Observable<List<U>> subscribeOn = flowable.toObservable().mergeWith(getApi().getAllRecords(getToken()).map(RecordRep$getAllRecords$remoteData$1.INSTANCE).filter(RecordRep$getAllRecords$remoteData$2.INSTANCE).doOnNext(new RecordRep$getAllRecords$remoteData$3(this)).onErrorReturn(RecordRep$getAllRecords$remoteData$4.INSTANCE).filter(RecordRep$getAllRecords$1.INSTANCE)).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "localData.toObservable()…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final User getUserInfo() {
        return this.profileRep.getUser();
    }

    public final Observable<List<ExecutorsIn>> getExecutorsList() {
        Observable<List<? extends RealmModel>> observable = this.localRep.getData(ExecutorsIn.class).toObservable();
        if (observable != null) {
            Observable<R> onErrorResumeNext = getApi().getExecutors(getToken()).map(RecordRep$getExecutorsList$remoteData$1.INSTANCE).doOnNext(new RecordRep$getExecutorsList$remoteData$2(this)).onErrorResumeNext(observable);
            Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "api.getExecutors(getToke…rrorResumeNext(localData)");
            Observable<R> concatMap = observable.concatMap(new RecordRep$getExecutorsList$1(onErrorResumeNext));
            Intrinsics.checkNotNullExpressionValue(concatMap, "localData\n                .concatMap {remoteData}");
            return concatMap;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.reactivex.Observable<kotlin.collections.List<ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn>>");
    }

    public final Observable<Resource<ScheduleListIn>> loadSchedule(String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        Observable<R> onErrorReturn = getApi().loadScheduleForExecutor(getToken(), this.toUserId, str).map(RecordRep$loadSchedule$1.INSTANCE).onErrorReturn(RecordRep$loadSchedule$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "api.loadScheduleForExecu…source.error(t.message) }");
        return onErrorReturn;
    }

    public final Observable<Resource<List<OpenDatesIn>>> loadAvailableDatesByExecutorId() {
        Observable<R> onErrorReturn = getApi().loadOpenDatesForExecutor(getToken(), this.toUserId).map(RecordRep$loadAvailableDatesByExecutorId$1.INSTANCE).onErrorReturn(RecordRep$loadAvailableDatesByExecutorId$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "api.loadOpenDatesForExec…source.error(t.message) }");
        return onErrorReturn;
    }

    public final Observable<Resource<Appointment>> createRecord(CreateRecordOut createRecordOut) {
        Intrinsics.checkNotNullParameter(createRecordOut, "record");
        Observable<R> onErrorReturn = getApi().makeAppoinment(getToken(), createRecordOut).map(RecordRep$createRecord$1.INSTANCE).onErrorReturn(RecordRep$createRecord$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "api.makeAppoinment(getTo…source.error(t.message) }");
        return onErrorReturn;
    }

    public final Observable<Resource<RevokeIn>> cancelRecord(int i) {
        Observable<R> onErrorReturn = getApi().revokeRecord(getToken(), i).map(RecordRep$cancelRecord$1.INSTANCE).onErrorReturn(RecordRep$cancelRecord$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "api.revokeRecord(getToke…source.error(t.message) }");
        return onErrorReturn;
    }

    public final void deleteRecordLocally(int i) {
        this.localRep.deleteById(Appointment.class, "id", i);
    }
}
