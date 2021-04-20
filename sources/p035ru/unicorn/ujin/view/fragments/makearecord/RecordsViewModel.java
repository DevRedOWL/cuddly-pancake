package p035ru.unicorn.ujin.view.fragments.makearecord;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import com.facebook.common.util.UriUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.dynamic.DatePickerViewHolder;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachRepo;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.CreateRecordOut;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.RevokeIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleListIn;
import p046io.reactivex.Observable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020%J\u0006\u0010T\u001a\u00020RJ\u0006\u0010U\u001a\u00020RJ\u0006\u0010V\u001a\u00020RJ.\u0010W\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060Y\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060Y0X2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0006\u0010[\u001a\u00020RJ\u0006\u0010\\\u001a\u00020RJ\u0006\u0010]\u001a\u00020RJ\u0010\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u0006H\u0002J\u0010\u0010a\u001a\u00020_2\u0006\u0010b\u001a\u00020cH\u0002J\u0006\u0010d\u001a\u00020RJ\u0006\u0010e\u001a\u00020RJ\u0010\u0010e\u001a\u00020R2\b\u0010Z\u001a\u0004\u0018\u00010%J\u000e\u0010f\u001a\u00020R2\u0006\u0010g\u001a\u00020\u0018J\u0010\u0010h\u001a\u00020R2\b\u0010i\u001a\u0004\u0018\u000102R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R0\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00190\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010R&\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060)0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001a\u0010,\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u0002020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u000e\"\u0004\b4\u0010\u0010R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u000506X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R \u0010;\u001a\b\u0012\u0004\u0012\u00020%0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R,\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00050)06X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R \u0010A\u001a\b\u0012\u0004\u0012\u00020%0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R\u000e\u0010D\u001a\u00020EX\u0004¢\u0006\u0002\n\u0000R&\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020G0)0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\nR&\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0)0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\b\"\u0004\bM\u0010\nR \u0010N\u001a\b\u0012\u0004\u0012\u00020%0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u000e\"\u0004\bP\u0010\u0010¨\u0006j"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "activeRecordLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "getActiveRecordLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setActiveRecordLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "appointment", "Landroidx/databinding/ObservableField;", "getAppointment", "()Landroidx/databinding/ObservableField;", "setAppointment", "(Landroidx/databinding/ObservableField;)V", "archiveRecordLiveData", "getArchiveRecordLiveData", "setArchiveRecordLiveData", "attachRep", "Lru/unicorn/ujin/view/fragments/base/attach/AttachRepo;", "attachesLiveData", "Ljava/util/HashSet;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "Lkotlin/collections/HashSet;", "getAttachesLiveData", "setAttachesLiveData", "choosenCell", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "getChoosenCell", "setChoosenCell", "choosenDate", "Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "getChoosenDate", "setChoosenDate", "comment", "", "getComment", "setComment", "createRecordResult", "Lru/unicorn/ujin/data/realm/Resource;", "getCreateRecordResult", "setCreateRecordResult", "deafaultDate", "getDeafaultDate", "()Ljava/lang/String;", "setDeafaultDate", "(Ljava/lang/String;)V", "executorsIn", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "getExecutorsIn", "setExecutorsIn", "listOfExutors", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "getListOfExutors", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "setListOfExutors", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "name", "getName", "setName", "openDates", "getOpenDates", "setOpenDates", "patronimic", "getPatronimic", "setPatronimic", "recordRep", "Lru/unicorn/ujin/view/fragments/makearecord/RecordRep;", "revokeResult", "Lru/unicorn/ujin/view/fragments/makearecord/model/RevokeIn;", "getRevokeResult", "setRevokeResult", "scheduleData", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleListIn;", "getScheduleData", "setScheduleData", "surname", "getSurname", "setSurname", "attachFile", "", "filePath", "cancelRecord", "clearData", "createRecord", "divideActiveAndArchiveData", "Lkotlin/Pair;", "", "data", "getAll", "getExecutors", "initFio", "isPast", "", "appoinment", "isValidRecord", "record", "Lru/unicorn/ujin/view/fragments/makearecord/model/CreateRecordOut;", "loadAvailableDates", "loadScheduler", "removeFile", "file", "setCurrentExecutor", "executor", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel */
/* compiled from: RecordsViewModel.kt */
public final class RecordsViewModel extends BaseViewModel {
    private MutableLiveData<List<Appointment>> activeRecordLiveData;
    private ObservableField<Appointment> appointment;
    private MutableLiveData<List<Appointment>> archiveRecordLiveData;
    /* access modifiers changed from: private */
    public final AttachRepo attachRep = new AttachRepo();
    private MutableLiveData<HashSet<AttachablePreview>> attachesLiveData;
    private ObservableField<ScheduleCellsIn> choosenCell;
    private ObservableField<OpenDatesIn> choosenDate;
    private ObservableField<String> comment;
    private MutableLiveData<Resource<Appointment>> createRecordResult;
    private String deafaultDate;
    private ObservableField<ExecutorsIn> executorsIn;
    private SingleLiveEvent<List<ExecutorsIn>> listOfExutors;
    private ObservableField<String> name;
    private SingleLiveEvent<Resource<List<OpenDatesIn>>> openDates;
    private ObservableField<String> patronimic;
    /* access modifiers changed from: private */
    public final RecordRep recordRep = new RecordRep();
    private MutableLiveData<Resource<RevokeIn>> revokeResult;
    private MutableLiveData<Resource<ScheduleListIn>> scheduleData;
    private ObservableField<String> surname;

    private final boolean isValidRecord(CreateRecordOut createRecordOut) {
        return true;
    }

    public RecordsViewModel() {
        String formatDate = DateUtils.formatDate(new Date());
        Intrinsics.checkNotNullExpressionValue(formatDate, "DateUtils.formatDate(Date())");
        this.deafaultDate = formatDate;
        this.listOfExutors = new SingleLiveEvent<>();
        this.scheduleData = new MutableLiveData<>();
        this.openDates = new SingleLiveEvent<>();
        this.revokeResult = new MutableLiveData<>();
        this.createRecordResult = new MutableLiveData<>();
        this.attachesLiveData = new MutableLiveData<>();
        this.name = new ObservableField<>();
        this.surname = new ObservableField<>();
        this.patronimic = new ObservableField<>();
        this.executorsIn = new ObservableField<>();
        this.choosenDate = new ObservableField<>();
        this.choosenCell = new ObservableField<>();
        this.comment = new ObservableField<>();
        this.activeRecordLiveData = new MutableLiveData<>();
        this.archiveRecordLiveData = new MutableLiveData<>();
        this.appointment = new ObservableField<>();
        initFio();
        getExecutors();
        this.attachesLiveData.setValue(new HashSet());
    }

    public final String getDeafaultDate() {
        return this.deafaultDate;
    }

    public final void setDeafaultDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deafaultDate = str;
    }

    public final SingleLiveEvent<List<ExecutorsIn>> getListOfExutors() {
        return this.listOfExutors;
    }

    public final void setListOfExutors(SingleLiveEvent<List<ExecutorsIn>> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.listOfExutors = singleLiveEvent;
    }

    public final MutableLiveData<Resource<ScheduleListIn>> getScheduleData() {
        return this.scheduleData;
    }

    public final void setScheduleData(MutableLiveData<Resource<ScheduleListIn>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.scheduleData = mutableLiveData;
    }

    public final SingleLiveEvent<Resource<List<OpenDatesIn>>> getOpenDates() {
        return this.openDates;
    }

    public final void setOpenDates(SingleLiveEvent<Resource<List<OpenDatesIn>>> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.openDates = singleLiveEvent;
    }

    public final MutableLiveData<Resource<RevokeIn>> getRevokeResult() {
        return this.revokeResult;
    }

    public final void setRevokeResult(MutableLiveData<Resource<RevokeIn>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.revokeResult = mutableLiveData;
    }

    public final MutableLiveData<Resource<Appointment>> getCreateRecordResult() {
        return this.createRecordResult;
    }

    public final void setCreateRecordResult(MutableLiveData<Resource<Appointment>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.createRecordResult = mutableLiveData;
    }

    public final MutableLiveData<HashSet<AttachablePreview>> getAttachesLiveData() {
        return this.attachesLiveData;
    }

    public final void setAttachesLiveData(MutableLiveData<HashSet<AttachablePreview>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.attachesLiveData = mutableLiveData;
    }

    public final ObservableField<String> getName() {
        return this.name;
    }

    public final void setName(ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.name = observableField;
    }

    public final ObservableField<String> getSurname() {
        return this.surname;
    }

    public final void setSurname(ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.surname = observableField;
    }

    public final ObservableField<String> getPatronimic() {
        return this.patronimic;
    }

    public final void setPatronimic(ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.patronimic = observableField;
    }

    public final ObservableField<ExecutorsIn> getExecutorsIn() {
        return this.executorsIn;
    }

    public final void setExecutorsIn(ObservableField<ExecutorsIn> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.executorsIn = observableField;
    }

    public final ObservableField<OpenDatesIn> getChoosenDate() {
        return this.choosenDate;
    }

    public final void setChoosenDate(ObservableField<OpenDatesIn> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.choosenDate = observableField;
    }

    public final ObservableField<ScheduleCellsIn> getChoosenCell() {
        return this.choosenCell;
    }

    public final void setChoosenCell(ObservableField<ScheduleCellsIn> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.choosenCell = observableField;
    }

    public final ObservableField<String> getComment() {
        return this.comment;
    }

    public final void setComment(ObservableField<String> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.comment = observableField;
    }

    public final MutableLiveData<List<Appointment>> getActiveRecordLiveData() {
        return this.activeRecordLiveData;
    }

    public final void setActiveRecordLiveData(MutableLiveData<List<Appointment>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.activeRecordLiveData = mutableLiveData;
    }

    public final MutableLiveData<List<Appointment>> getArchiveRecordLiveData() {
        return this.archiveRecordLiveData;
    }

    public final void setArchiveRecordLiveData(MutableLiveData<List<Appointment>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.archiveRecordLiveData = mutableLiveData;
    }

    public final ObservableField<Appointment> getAppointment() {
        return this.appointment;
    }

    public final void setAppointment(ObservableField<Appointment> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.appointment = observableField;
    }

    public final void initFio() {
        User userInfo = this.recordRep.getUserInfo();
        this.name.set(userInfo.getName());
        this.surname.set(userInfo.getSurname());
        this.patronimic.set(userInfo.getPatronymic());
    }

    public final void getAll() {
        this.recordRep.getAllRecords().map(new RecordsViewModel$getAll$s$1(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new RecordsViewModel$getAll$s$2(this)).doOnTerminate(new RecordsViewModel$getAll$s$3(this)).subscribe(new RecordsViewModel$getAll$s$4(this));
    }

    /* access modifiers changed from: private */
    public final Pair<List<Appointment>, List<Appointment>> divideActiveAndArchiveData(List<? extends Appointment> list) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (Appointment appointment2 : list) {
            if (isPast(appointment2)) {
                arrayList2.add(appointment2);
            } else {
                arrayList.add(0, appointment2);
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new RecordsViewModel$divideActiveAndArchiveData$$inlined$sortBy$1());
        }
        if (arrayList2.size() > 1) {
            CollectionsKt.sortWith(arrayList2, new RecordsViewModel$divideActiveAndArchiveData$$inlined$sortBy$2());
        }
        return new Pair<>(arrayList, arrayList2);
    }

    private final boolean isPast(Appointment appointment2) {
        Calendar parseDate = DateUtils.parseDate(appointment2.getDate(), DatePickerViewHolder.DATE_FORMAT);
        if (parseDate != null) {
            return DateUtils.isPastDate(parseDate);
        }
        return false;
    }

    public final void getExecutors() {
        this.recordRep.getExecutorsList().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RecordsViewModel$getExecutors$subscribe$1(this));
    }

    public final void loadScheduler(String str) {
        this.scheduleData.setValue(Resource.loading());
        RecordRep recordRep2 = this.recordRep;
        if (str == null) {
            str = this.deafaultDate;
        }
        recordRep2.loadSchedule(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RecordsViewModel$loadScheduler$subscribe$1(this));
    }

    public final void loadScheduler() {
        loadScheduler(this.deafaultDate);
    }

    public final void setCurrentExecutor(ExecutorsIn executorsIn2) {
        this.executorsIn.set(executorsIn2);
        this.recordRep.setExecutor(executorsIn2);
    }

    public final void loadAvailableDates() {
        this.openDates.setValue(Resource.loading());
        this.scheduleData.setValue(Resource.loading());
        this.recordRep.loadAvailableDatesByExecutorId().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new RecordsViewModel$loadAvailableDates$subscribe$1(this));
    }

    public final void createRecord() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String timeEnd;
        String timeStart;
        String date;
        Integer id;
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.surname.get();
        sb.append(charSequence == null || StringsKt.isBlank(charSequence) ? "" : Intrinsics.stringPlus(this.surname.get(), " "));
        CharSequence charSequence2 = this.name.get();
        if (charSequence2 == null || StringsKt.isBlank(charSequence2)) {
            str = "";
        } else {
            str = Intrinsics.stringPlus(this.name.get(), " ");
        }
        sb.append(str);
        CharSequence charSequence3 = this.patronimic.get();
        if (charSequence3 == null || StringsKt.isBlank(charSequence3)) {
            str2 = "";
        } else {
            str2 = this.patronimic.get();
        }
        sb.append(str2);
        String sb2 = sb.toString();
        ExecutorsIn executorsIn2 = this.executorsIn.get();
        int intValue = (executorsIn2 == null || (id = executorsIn2.getId()) == null) ? -1 : id.intValue();
        OpenDatesIn openDatesIn = this.choosenDate.get();
        if (openDatesIn == null || (date = openDatesIn.getDate()) == null) {
            str3 = "";
        } else {
            str3 = date;
        }
        ScheduleCellsIn scheduleCellsIn = this.choosenCell.get();
        if (scheduleCellsIn == null || (timeStart = scheduleCellsIn.getTimeStart()) == null) {
            str4 = "";
        } else {
            str4 = timeStart;
        }
        ScheduleCellsIn scheduleCellsIn2 = this.choosenCell.get();
        if (scheduleCellsIn2 == null || (timeEnd = scheduleCellsIn2.getTimeEnd()) == null) {
            str5 = "";
        } else {
            str5 = timeEnd;
        }
        String str7 = this.comment.get();
        if (str7 != null) {
            str6 = str7;
        } else {
            str6 = "";
        }
        Intrinsics.checkNotNullExpressionValue(str6, "comment.get() ?: \"\"");
        CreateRecordOut createRecordOut = new CreateRecordOut(intValue, str3, str4, str5, str6, sb2, (List) null, 64, (DefaultConstructorMarker) null);
        if (isValidRecord(createRecordOut)) {
            Observable.fromArray(this.attachesLiveData.getValue()).filter(RecordsViewModel$createRecord$1.INSTANCE).flatMapIterable(RecordsViewModel$createRecord$2.INSTANCE).flatMap(new RecordsViewModel$createRecord$3(this)).map(RecordsViewModel$createRecord$4.INSTANCE).filter(RecordsViewModel$createRecord$5.INSTANCE).toList().toObservable().map(new RecordsViewModel$createRecord$6(createRecordOut)).flatMap(new RecordsViewModel$createRecord$7(this, createRecordOut)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new RecordsViewModel$createRecord$8(this)).doOnTerminate(new RecordsViewModel$createRecord$9(this)).subscribe(new RecordsViewModel$createRecord$10(this));
        }
    }

    public final void cancelRecord() {
        Integer id;
        Appointment appointment2 = this.appointment.get();
        if (appointment2 != null && (id = appointment2.getId()) != null) {
            int intValue = id.intValue();
            this.recordRep.cancelRecord(intValue).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new RecordsViewModel$cancelRecord$$inlined$let$lambda$1(intValue, this)).doOnSubscribe(new RecordsViewModel$cancelRecord$$inlined$let$lambda$2(this)).doOnTerminate(new RecordsViewModel$cancelRecord$$inlined$let$lambda$3(this)).subscribe(new RecordsViewModel$cancelRecord$$inlined$let$lambda$4(this));
        }
    }

    public final void clearData() {
        initFio();
        this.attachesLiveData.setValue(new HashSet());
        this.comment.set("");
    }

    public final void attachFile(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        AttachablePreview createFileObject = this.attachRep.createFileObject(str, "");
        HashSet value = this.attachesLiveData.getValue();
        if (value != null) {
            value.add(createFileObject);
            this.attachesLiveData.setValue(value);
        }
    }

    public final void removeFile(AttachablePreview attachablePreview) {
        Intrinsics.checkNotNullParameter(attachablePreview, UriUtil.LOCAL_FILE_SCHEME);
        HashSet value = this.attachesLiveData.getValue();
        if (value != null) {
            Iterator it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AttachablePreview attachablePreview2 = (AttachablePreview) it.next();
                if (Intrinsics.areEqual((Object) attachablePreview2.imageUrl(), (Object) attachablePreview.imageUrl())) {
                    value.remove(attachablePreview2);
                    break;
                }
            }
            this.attachesLiveData.setValue(value);
        }
    }
}
