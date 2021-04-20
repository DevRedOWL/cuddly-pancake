package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.data.service.FCM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyListUno;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyRentaRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateCompanyModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyConnectOUT;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyDataIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.CompanyListIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyAttachment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.NewCompanyOUT;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.SearchBodyOut;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.model.SearchType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.response.CompanyApplicationsResponse;
import p046io.reactivex.Flowable;
import p046io.reactivex.Observable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\t0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u000e2\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\bJ\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\t0\b2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0014J\u001a\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010!\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/CompanyPassRep;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "companyRentaRepository", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyRentaRepository;", "getCompanyRentaRepository", "()Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyRentaRepository;", "becomeEmployee", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "body", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/request/ApplicationToCompanyBody;", "connectToCompany", "Lio/reactivex/Observable;", "", "company", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyDataIn;", "createCompany", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyListUno;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/NewCompanyOUT;", "findCompany", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/model/CompanyListIn;", "text", "", "getCompanyApplications", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/response/CompanyApplicationsResponse;", "getCompanyById", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "id", "", "initCompany", "readApplicationNotification", "enterpriseId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CompanyPassRep */
/* compiled from: CompanyPassRep.kt */
public final class CompanyPassRep extends BaseRemoteRepository {
    private final CompanyRentaRepository companyRentaRepository = new CompanyRentaRepository();

    public final CompanyRentaRepository getCompanyRentaRepository() {
        return this.companyRentaRepository;
    }

    public final NewCompanyOUT initCompany() {
        return new NewCompanyOUT((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    public final Observable<Resource<CompanyListUno>> createCompany(NewCompanyOUT newCompanyOUT) {
        List<NewCompanyAttachment> list;
        String title = newCompanyOUT != null ? newCompanyOUT.getTitle() : null;
        String inn = newCompanyOUT != null ? newCompanyOUT.getInn() : null;
        String ogrn = newCompanyOUT != null ? newCompanyOUT.getOgrn() : null;
        String okved = newCompanyOUT != null ? newCompanyOUT.getOkved() : null;
        String actual_address = newCompanyOUT != null ? newCompanyOUT.getActual_address() : null;
        if (newCompanyOUT != null) {
            list = newCompanyOUT.getAttachments();
        } else {
            list = null;
        }
        Observable<Resource<CompanyListUno>> subscribeOn = this.companyRentaRepository.createCompany(new CreateCompanyModel(title, inn, ogrn, okved, actual_address, list)).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "companyRentaRepository.c…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Observable<Resource<CompanyListIn>> findCompany(String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        Observable<R> subscribeOn = getApi().searchCompany(getToken(), new SearchBodyOut(SearchType.ANY.getType(), str)).map(CompanyPassRep$findCompany$1.INSTANCE).onErrorReturn(CompanyPassRep$findCompany$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.searchCompany(getTok…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Observable<Resource<Object>> connectToCompany(CompanyDataIn companyDataIn) {
        Observable<R> subscribeOn = getApi().connectToCompany(getToken(), new CompanyConnectOUT(companyDataIn != null ? companyDataIn.getId() : -1)).map(CompanyPassRep$connectToCompany$1.INSTANCE).onErrorReturn(CompanyPassRep$connectToCompany$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.connectToCompany(get…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<RentCompany>> getCompanyById(int i) {
        Flowable<R> subscribeOn = getApi().getCompanyById(getToken(), i).map(CompanyPassRep$getCompanyById$1.INSTANCE).onErrorReturn(CompanyPassRep$getCompanyById$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getCompanyById(getTo…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SimpleResponse>> becomeEmployee(ApplicationToCompanyBody applicationToCompanyBody) {
        Intrinsics.checkNotNullParameter(applicationToCompanyBody, FCM.BODY);
        Flowable<R> subscribeOn = getApi().becomeEmployee(getToken(), applicationToCompanyBody).map(CompanyPassRep$becomeEmployee$1.INSTANCE).onErrorReturn(CompanyPassRep$becomeEmployee$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.becomeEmployee(getTo…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<CompanyApplicationsResponse>> getCompanyApplications() {
        Flowable<R> subscribeOn = getApi().getCompanyApplications(getToken()).filter(CompanyPassRep$getCompanyApplications$1.INSTANCE).map(CompanyPassRep$getCompanyApplications$2.INSTANCE).onErrorReturn(CompanyPassRep$getCompanyApplications$3.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getCompanyApplicatio…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SimpleResponse>> readApplicationNotification(String str) {
        Intrinsics.checkNotNullParameter(str, "enterpriseId");
        Flowable<R> subscribeOn = getApi().readApplicationNotification(getToken(), str).map(CompanyPassRep$readApplicationNotification$1.INSTANCE).onErrorReturn(CompanyPassRep$readApplicationNotification$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.readApplicationNotif…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
