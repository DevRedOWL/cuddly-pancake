package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import com.facebook.common.util.UriUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyListUno;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateMyCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyDataIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachRepo;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p046io.reactivex.Observable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020>J\u0016\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u0002062\u0006\u0010A\u001a\u000206J\u0006\u0010B\u001a\u00020>J\u0006\u0010C\u001a\u00020>J\u0006\u0010D\u001a\u00020>J\u0006\u0010E\u001a\u00020>J\u0006\u0010F\u001a\u00020>J\u000e\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u000206J\u0006\u0010I\u001a\u00020>J\b\u0010J\u001a\u00020>H\u0014J\u000e\u0010K\u001a\u00020>2\u0006\u0010L\u001a\u00020\u0017J\u000e\u0010M\u001a\u00020>2\u0006\u0010N\u001a\u00020\u001eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0017\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060&¢\u0006\b\n\u0000\u001a\u0004\b7\u0010*R\u001c\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006P"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "allFieldValid", "Landroidx/databinding/ObservableField;", "", "getAllFieldValid", "()Landroidx/databinding/ObservableField;", "applicationToCompanyBody", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/request/ApplicationToCompanyBody;", "getApplicationToCompanyBody", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/request/ApplicationToCompanyBody;", "setApplicationToCompanyBody", "(Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/request/ApplicationToCompanyBody;)V", "applicationToCompanyBodyObservable", "getApplicationToCompanyBodyObservable", "setApplicationToCompanyBodyObservable", "(Landroidx/databinding/ObservableField;)V", "attachRep", "Lru/unicorn/ujin/view/fragments/base/attach/AttachRepo;", "attachesLiveData", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/HashSet;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "getAttachesLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setAttachesLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "companyList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "getCompanyList", "setCompanyList", "companyPassRep", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/CompanyPassRep;", "getCompanyPassRep", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/CompanyPassRep;", "createCompanyResult", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyListUno;", "getCreateCompanyResult", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "currentCompany", "getCurrentCompany", "currentCompanyOUT", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "getCurrentCompanyOUT", "newCompany", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyOUT;", "getNewCompany", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "showSuccess", "", "getShowSuccess", "user", "Lru/unicorn/ujin/data/realm/profile/User;", "getUser", "()Lru/unicorn/ujin/data/realm/profile/User;", "setUser", "(Lru/unicorn/ujin/data/realm/profile/User;)V", "", "attachFile", "filePath", "mode", "becomeEmployee", "clearApplicationToCompanyBody", "clearedSearchResult", "connectTo", "createCompany", "findCompany", "text", "getCompanyById", "onCleared", "removeFile", "file", "showInfoAboutCompany", "company", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM */
/* compiled from: PassCompanyVM.kt */
public final class PassCompanyVM extends BaseViewModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String INN = CreateMyCompanyFragment.INN;
    /* access modifiers changed from: private */
    public static final String OGRN = "ogrn";
    /* access modifiers changed from: private */
    public static final String RENT = "rent_agreement";
    private final ObservableField<Boolean> allFieldValid = new ObservableField<>();
    private ApplicationToCompanyBody applicationToCompanyBody;
    private ObservableField<ApplicationToCompanyBody> applicationToCompanyBodyObservable = new ObservableField<>();
    /* access modifiers changed from: private */
    public final AttachRepo attachRep = new AttachRepo();
    private MutableLiveData<HashSet<AttachablePreview>> attachesLiveData = new MutableLiveData<>();
    private MutableLiveData<List<CompanyDataIn>> companyList = new MutableLiveData<>();
    private final CompanyPassRep companyPassRep = new CompanyPassRep();
    private final SingleLiveEvent<Resource<CompanyListUno>> createCompanyResult = new SingleLiveEvent<>();
    private final ObservableField<CompanyDataIn> currentCompany = new ObservableField<>();
    private final ObservableField<RentCompany> currentCompanyOUT = new ObservableField<>();
    private final ObservableField<NewCompanyOUT> newCompany = new ObservableField<>();
    private final ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private final SingleLiveEvent<String> showSuccess = new SingleLiveEvent<>();
    private User user;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.Calendar] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PassCompanyVM() {
        /*
            r12 = this;
            r12.<init>()
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository$Companion r0 = p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository.Companion
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r0 = r0.getInstance()
            r12.profileLocalRepository = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r12.companyList = r0
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = new ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent
            r0.<init>()
            r12.createCompanyResult = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r12.newCompany = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r12.currentCompany = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r12.currentCompanyOUT = r0
            ru.unicorn.ujin.view.fragments.base.attach.AttachRepo r0 = new ru.unicorn.ujin.view.fragments.base.attach.AttachRepo
            r0.<init>()
            r12.attachRep = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r12.attachesLiveData = r0
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = new ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent
            r0.<init>()
            r12.showSuccess = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r12.allFieldValid = r0
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CompanyPassRep r0 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CompanyPassRep
            r0.<init>()
            r12.companyPassRep = r0
            androidx.databinding.ObservableField r0 = new androidx.databinding.ObservableField
            r0.<init>()
            r12.applicationToCompanyBodyObservable = r0
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CompanyPassRep r0 = r12.companyPassRep
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyOUT r0 = r0.initCompany()
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyOUT> r1 = r12.newCompany
            r1.set(r0)
            androidx.lifecycle.MutableLiveData<java.util.HashSet<ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview>> r0 = r12.attachesLiveData
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.setValue(r1)
            r12.allFieldValid()
            ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository r0 = r12.profileLocalRepository
            ru.unicorn.ujin.data.realm.profile.User r0 = r0.getUser()
            r12.user = r0
            ru.unicorn.ujin.data.realm.profile.User r0 = r12.user
            r1 = 0
            if (r0 == 0) goto L_0x0082
            java.lang.String r0 = r0.getBirthday()
            goto L_0x0083
        L_0x0082:
            r0 = r1
        L_0x0083:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0090
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r0 = 0
            goto L_0x0091
        L_0x0090:
            r0 = 1
        L_0x0091:
            if (r0 == 0) goto L_0x0094
            goto L_0x00a2
        L_0x0094:
            ru.unicorn.ujin.data.realm.profile.User r0 = r12.user
            if (r0 == 0) goto L_0x009c
            java.lang.String r1 = r0.getBirthday()
        L_0x009c:
            java.lang.String r0 = "dd.MM.yyyy"
            java.util.Calendar r1 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r1, r0)
        L_0x00a2:
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r0 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x00b2
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L_0x00b2
            r5 = r2
            goto L_0x00b3
        L_0x00b2:
            r5 = r3
        L_0x00b3:
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            if (r2 == 0) goto L_0x00bf
            java.lang.String r2 = r2.getSurname()
            if (r2 == 0) goto L_0x00bf
            r6 = r2
            goto L_0x00c0
        L_0x00bf:
            r6 = r3
        L_0x00c0:
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            if (r2 == 0) goto L_0x00cc
            java.lang.String r2 = r2.getPatronymic()
            if (r2 == 0) goto L_0x00cc
            r7 = r2
            goto L_0x00cd
        L_0x00cc:
            r7 = r3
        L_0x00cd:
            if (r1 == 0) goto L_0x00d9
            java.util.Date r1 = r1.getTime()
            java.lang.String r1 = p035ru.unicorn.ujin.util.DateUtils.formatDateYYYYMMDD(r1)
            r9 = r1
            goto L_0x00da
        L_0x00d9:
            r9 = r3
        L_0x00da:
            java.lang.String r1 = "if (calendar != null) Da…DD(calendar.time) else \"\""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            ru.unicorn.ujin.data.realm.profile.User r1 = r12.user
            if (r1 == 0) goto L_0x00eb
            java.lang.String r1 = r1.getEmail()
            if (r1 == 0) goto L_0x00eb
            r10 = r1
            goto L_0x00ec
        L_0x00eb:
            r10 = r3
        L_0x00ec:
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r8 = ""
            java.lang.String r11 = ""
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.applicationToCompanyBody = r0
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody> r0 = r12.applicationToCompanyBodyObservable
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r1 = r12.applicationToCompanyBody
            r0.set(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM.<init>():void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM$Companion;", "", "()V", "INN", "", "getINN", "()Ljava/lang/String;", "OGRN", "getOGRN", "RENT", "getRENT", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$Companion */
    /* compiled from: PassCompanyVM.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getINN() {
            return PassCompanyVM.INN;
        }

        public final String getOGRN() {
            return PassCompanyVM.OGRN;
        }

        public final String getRENT() {
            return PassCompanyVM.RENT;
        }
    }

    public final MutableLiveData<List<CompanyDataIn>> getCompanyList() {
        return this.companyList;
    }

    public final void setCompanyList(MutableLiveData<List<CompanyDataIn>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.companyList = mutableLiveData;
    }

    public final SingleLiveEvent<Resource<CompanyListUno>> getCreateCompanyResult() {
        return this.createCompanyResult;
    }

    public final ObservableField<NewCompanyOUT> getNewCompany() {
        return this.newCompany;
    }

    public final ObservableField<CompanyDataIn> getCurrentCompany() {
        return this.currentCompany;
    }

    public final ObservableField<RentCompany> getCurrentCompanyOUT() {
        return this.currentCompanyOUT;
    }

    public final MutableLiveData<HashSet<AttachablePreview>> getAttachesLiveData() {
        return this.attachesLiveData;
    }

    public final void setAttachesLiveData(MutableLiveData<HashSet<AttachablePreview>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.attachesLiveData = mutableLiveData;
    }

    public final SingleLiveEvent<String> getShowSuccess() {
        return this.showSuccess;
    }

    public final ObservableField<Boolean> getAllFieldValid() {
        return this.allFieldValid;
    }

    public final CompanyPassRep getCompanyPassRep() {
        return this.companyPassRep;
    }

    public final ApplicationToCompanyBody getApplicationToCompanyBody() {
        return this.applicationToCompanyBody;
    }

    public final void setApplicationToCompanyBody(ApplicationToCompanyBody applicationToCompanyBody2) {
        Intrinsics.checkNotNullParameter(applicationToCompanyBody2, "<set-?>");
        this.applicationToCompanyBody = applicationToCompanyBody2;
    }

    public final ObservableField<ApplicationToCompanyBody> getApplicationToCompanyBodyObservable() {
        return this.applicationToCompanyBodyObservable;
    }

    public final void setApplicationToCompanyBodyObservable(ObservableField<ApplicationToCompanyBody> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.applicationToCompanyBodyObservable = observableField;
    }

    public final User getUser() {
        return this.user;
    }

    public final void setUser(User user2) {
        this.user = user2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Calendar] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clearApplicationToCompanyBody() {
        /*
            r12 = this;
            ru.unicorn.ujin.data.realm.profile.User r0 = r12.user
            r1 = 0
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.getBirthday()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0018
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x001c
            goto L_0x002a
        L_0x001c:
            ru.unicorn.ujin.data.realm.profile.User r0 = r12.user
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r0.getBirthday()
        L_0x0024:
            java.lang.String r0 = "dd.MM.yyyy"
            java.util.Calendar r1 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r1, r0)
        L_0x002a:
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r0 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L_0x003a
            r5 = r2
            goto L_0x003b
        L_0x003a:
            r5 = r3
        L_0x003b:
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            if (r2 == 0) goto L_0x0047
            java.lang.String r2 = r2.getSurname()
            if (r2 == 0) goto L_0x0047
            r6 = r2
            goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            ru.unicorn.ujin.data.realm.profile.User r2 = r12.user
            if (r2 == 0) goto L_0x0054
            java.lang.String r2 = r2.getPatronymic()
            if (r2 == 0) goto L_0x0054
            r7 = r2
            goto L_0x0055
        L_0x0054:
            r7 = r3
        L_0x0055:
            if (r1 == 0) goto L_0x0061
            java.util.Date r1 = r1.getTime()
            java.lang.String r1 = p035ru.unicorn.ujin.util.DateUtils.formatDateYYYYMMDD(r1)
            r9 = r1
            goto L_0x0062
        L_0x0061:
            r9 = r3
        L_0x0062:
            java.lang.String r1 = "if (calendar != null) Da…DD(calendar.time) else \"\""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)
            ru.unicorn.ujin.data.realm.profile.User r1 = r12.user
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r1.getEmail()
            if (r1 == 0) goto L_0x0073
            r10 = r1
            goto L_0x0074
        L_0x0073:
            r10 = r3
        L_0x0074:
            java.lang.String r3 = ""
            java.lang.String r4 = ""
            java.lang.String r8 = ""
            java.lang.String r11 = ""
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.applicationToCompanyBody = r0
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody> r0 = r12.applicationToCompanyBodyObservable
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r1 = r12.applicationToCompanyBody
            r0.set(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM.clearApplicationToCompanyBody():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void createCompany() {
        /*
            r8 = this;
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyOUT> r0 = r8.newCompany
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.model.NewCompanyOUT r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT) r0
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.getTitle()
            goto L_0x0011
        L_0x0010:
            r2 = r1
        L_0x0011:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0020
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            if (r2 != 0) goto L_0x01b2
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = r0.getInn()
            goto L_0x002b
        L_0x002a:
            r2 = r1
        L_0x002b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0038
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            if (r2 != 0) goto L_0x01b2
            if (r0 == 0) goto L_0x0042
            java.lang.String r2 = r0.getOgrn()
            goto L_0x0043
        L_0x0042:
            r2 = r1
        L_0x0043:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0050
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r2 = 0
            goto L_0x0051
        L_0x0050:
            r2 = 1
        L_0x0051:
            if (r2 != 0) goto L_0x01b2
            if (r0 == 0) goto L_0x005a
            java.lang.String r2 = r0.getActual_address()
            goto L_0x005b
        L_0x005a:
            r2 = r1
        L_0x005b:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0068
            boolean r2 = kotlin.text.StringsKt.isBlank(r2)
            if (r2 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r2 = 0
            goto L_0x0069
        L_0x0068:
            r2 = 1
        L_0x0069:
            if (r2 == 0) goto L_0x006d
            goto L_0x01b2
        L_0x006d:
            androidx.lifecycle.MutableLiveData<java.util.HashSet<ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview>> r2 = r8.attachesLiveData
            java.lang.Object r2 = r2.getValue()
            java.util.HashSet r2 = (java.util.HashSet) r2
            if (r2 == 0) goto L_0x009c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x007d:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0097
            java.lang.Object r5 = r2.next()
            r6 = r5
            ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview r6 = (p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview) r6
            java.lang.String r6 = r6.type()
            java.lang.String r7 = INN
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x007d
            goto L_0x0098
        L_0x0097:
            r5 = r1
        L_0x0098:
            r2 = r5
            ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview r2 = (p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview) r2
            goto L_0x009d
        L_0x009c:
            r2 = r1
        L_0x009d:
            if (r2 != 0) goto L_0x00ac
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<ru.unicorn.ujin.data.realm.Resource<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyListUno>> r0 = r8.createCompanyResult
            java.lang.String r1 = "Добавьте файл или фото ИНН"
            ru.unicorn.ujin.data.realm.Resource r1 = p035ru.unicorn.ujin.data.realm.Resource.error(r1)
            r0.postValue(r1)
            goto L_0x01bd
        L_0x00ac:
            androidx.lifecycle.MutableLiveData<java.util.HashSet<ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview>> r2 = r8.attachesLiveData
            java.lang.Object r2 = r2.getValue()
            java.util.HashSet r2 = (java.util.HashSet) r2
            if (r2 == 0) goto L_0x00db
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00bc:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00d6
            java.lang.Object r5 = r2.next()
            r6 = r5
            ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview r6 = (p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview) r6
            java.lang.String r6 = r6.type()
            java.lang.String r7 = OGRN
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x00bc
            goto L_0x00d7
        L_0x00d6:
            r5 = r1
        L_0x00d7:
            r2 = r5
            ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview r2 = (p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview) r2
            goto L_0x00dc
        L_0x00db:
            r2 = r1
        L_0x00dc:
            if (r2 != 0) goto L_0x00eb
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<ru.unicorn.ujin.data.realm.Resource<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyListUno>> r0 = r8.createCompanyResult
            java.lang.String r1 = "Добавьте файл или фото ОГРН"
            ru.unicorn.ujin.data.realm.Resource r1 = p035ru.unicorn.ujin.data.realm.Resource.error(r1)
            r0.postValue(r1)
            goto L_0x01bd
        L_0x00eb:
            androidx.lifecycle.MutableLiveData<java.util.HashSet<ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview>> r2 = r8.attachesLiveData
            java.lang.Object r2 = r2.getValue()
            java.util.HashSet r2 = (java.util.HashSet) r2
            if (r2 == 0) goto L_0x0117
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00fb:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0115
            java.lang.Object r5 = r2.next()
            r6 = r5
            ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview r6 = (p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview) r6
            java.lang.String r6 = r6.type()
            java.lang.String r7 = RENT
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x00fb
            r1 = r5
        L_0x0115:
            ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview r1 = (p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview) r1
        L_0x0117:
            if (r1 != 0) goto L_0x0126
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<ru.unicorn.ujin.data.realm.Resource<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyListUno>> r0 = r8.createCompanyResult
            java.lang.String r1 = "Добавьте файл или фото договора аренды"
            ru.unicorn.ujin.data.realm.Resource r1 = p035ru.unicorn.ujin.data.realm.Resource.error(r1)
            r0.postValue(r1)
            goto L_0x01bd
        L_0x0126:
            if (r0 == 0) goto L_0x01bd
            java.util.HashSet[] r1 = new java.util.HashSet[r4]
            androidx.lifecycle.MutableLiveData<java.util.HashSet<ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview>> r2 = r8.attachesLiveData
            java.lang.Object r2 = r2.getValue()
            java.util.HashSet r2 = (java.util.HashSet) r2
            r1[r3] = r2
            io.reactivex.Observable r1 = p046io.reactivex.Observable.fromArray(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$1 r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM$createCompany$4$1.INSTANCE
            io.reactivex.functions.Predicate r2 = (p046io.reactivex.functions.Predicate) r2
            io.reactivex.Observable r1 = r1.filter(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$2 r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM$createCompany$4$2.INSTANCE
            io.reactivex.functions.Function r2 = (p046io.reactivex.functions.Function) r2
            io.reactivex.Observable r1 = r1.flatMapIterable(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$1 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$1
            r2.<init>(r8)
            io.reactivex.functions.Function r2 = (p046io.reactivex.functions.Function) r2
            io.reactivex.Observable r1 = r1.flatMap(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$4 r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM$createCompany$4$4.INSTANCE
            io.reactivex.functions.Function r2 = (p046io.reactivex.functions.Function) r2
            io.reactivex.Observable r1 = r1.map(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$5 r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM$createCompany$4$5.INSTANCE
            io.reactivex.functions.Predicate r2 = (p046io.reactivex.functions.Predicate) r2
            io.reactivex.Observable r1 = r1.filter(r2)
            io.reactivex.Single r1 = r1.toList()
            io.reactivex.Observable r1 = r1.toObservable()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$6 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$4$6
            r2.<init>(r0)
            io.reactivex.functions.Function r2 = (p046io.reactivex.functions.Function) r2
            io.reactivex.Observable r1 = r1.map(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$2 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$2
            r2.<init>(r0, r8)
            io.reactivex.functions.Function r2 = (p046io.reactivex.functions.Function) r2
            io.reactivex.Observable r0 = r1.flatMap(r2)
            io.reactivex.Scheduler r1 = p046io.reactivex.schedulers.Schedulers.m6765io()
            io.reactivex.Observable r0 = r0.subscribeOn(r1)
            io.reactivex.Scheduler r1 = p046io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r0 = r0.observeOn(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$3 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$3
            r1.<init>(r8)
            io.reactivex.functions.Consumer r1 = (p046io.reactivex.functions.Consumer) r1
            io.reactivex.Observable r0 = r0.doOnSubscribe(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$4 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$4
            r1.<init>(r8)
            io.reactivex.functions.Action r1 = (p046io.reactivex.functions.Action) r1
            io.reactivex.Observable r0 = r0.doOnTerminate(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$5 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM$createCompany$$inlined$let$lambda$5
            r1.<init>(r8)
            io.reactivex.functions.Consumer r1 = (p046io.reactivex.functions.Consumer) r1
            r0.subscribe(r1)
            goto L_0x01bd
        L_0x01b2:
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent<ru.unicorn.ujin.data.realm.Resource<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyListUno>> r0 = r8.createCompanyResult
            java.lang.String r1 = "Заполните все обязательные поля"
            ru.unicorn.ujin.data.realm.Resource r1 = p035ru.unicorn.ujin.data.realm.Resource.error(r1)
            r0.postValue(r1)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM.createCompany():void");
    }

    public final void findCompany(String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        Observable.just(str).switchMap(new PassCompanyVM$findCompany$s$1(this)).filter(PassCompanyVM$findCompany$s$2.INSTANCE).map(PassCompanyVM$findCompany$s$3.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassCompanyVM$findCompany$s$4(this));
    }

    public final void allFieldValid() {
        NewCompanyOUT newCompanyOUT = this.newCompany.get();
        ObservableField<Boolean> observableField = this.allFieldValid;
        String str = null;
        CharSequence title = newCompanyOUT != null ? newCompanyOUT.getTitle() : null;
        boolean z = false;
        if (!(title == null || title.length() == 0)) {
            CharSequence inn = newCompanyOUT != null ? newCompanyOUT.getInn() : null;
            if (!(inn == null || inn.length() == 0)) {
                CharSequence ogrn = newCompanyOUT != null ? newCompanyOUT.getOgrn() : null;
                if (!(ogrn == null || ogrn.length() == 0)) {
                    if (newCompanyOUT != null) {
                        str = newCompanyOUT.getActual_address();
                    }
                    CharSequence charSequence = str;
                    if (!(charSequence == null || charSequence.length() == 0)) {
                        z = true;
                    }
                }
            }
        }
        observableField.set(Boolean.valueOf(z));
    }

    public final void showInfoAboutCompany(CompanyDataIn companyDataIn) {
        Intrinsics.checkNotNullParameter(companyDataIn, "company");
        this.currentCompany.set(companyDataIn);
    }

    public final void connectTo() {
        this.companyPassRep.connectToCompany(this.currentCompany.get()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassCompanyVM$connectTo$s$1(this));
    }

    public final void clearedSearchResult() {
        this.companyList = new MutableLiveData<>();
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        clearedSearchResult();
    }

    public final void getCompanyById() {
        CompanyDataIn companyDataIn = this.currentCompany.get();
        if (companyDataIn != null) {
            this.companyPassRep.getCompanyById(companyDataIn.getId()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassCompanyVM$getCompanyById$$inlined$let$lambda$1(this, companyDataIn));
        }
    }

    public final void attachFile(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        Intrinsics.checkNotNullParameter(str2, "mode");
        AttachablePreview createFileObject = this.attachRep.createFileObject(str, str2);
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

    public final void becomeEmployee() {
        ApplicationToCompanyBody applicationToCompanyBody2 = this.applicationToCompanyBodyObservable.get();
        if (applicationToCompanyBody2 != null) {
            CompanyPassRep companyPassRep2 = this.companyPassRep;
            Intrinsics.checkNotNullExpressionValue(applicationToCompanyBody2, "it");
            companyPassRep2.becomeEmployee(applicationToCompanyBody2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassCompanyVM$becomeEmployee$$inlined$let$lambda$1(this));
        }
    }
}
