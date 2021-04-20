package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.util.Log;
import java.util.List;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.entity.KolyaSuccesModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateCompanyModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response.CompanyObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.Permissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.response.CompanyApplicationsResponse;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.reactivex.Flowable;
import p046io.reactivex.Observable;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyRentaRepository */
public class CompanyRentaRepository extends BaseRemoteRepository {
    public Flowable<Resource<List<RentCompany>>> getCompanyList() {
        Log.d("TAG", "XXX token " + getToken());
        return getApi().getCompanyList(getToken(), 0).map($$Lambda$CompanyRentaRepository$S01OGQzgiyoIMbuZPsZCaVwUWQM.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$peia96nrF1vtyi9aGEN90zekHGY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Observable<Resource<CompanyListUno>> createCompany(CreateCompanyModel createCompanyModel) {
        return getApi().createCompany(getToken(), new CreateCompanyModel.CreateCompanyObject(createCompanyModel)).map($$Lambda$CompanyRentaRepository$U_axtZDGzsb1SM9QCnmWaqjhXSo.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$B4vZHz4JdLgedZC1IQe9Q4kx3w.INSTANCE);
    }

    public Flowable<Resource<CompanyListUno>> updateCompany(CreateCompanyModel createCompanyModel) {
        return getApi().updateCompany(getToken(), createCompanyModel.getId(), new CreateCompanyModel.CreateCompanyObject(createCompanyModel)).map($$Lambda$CompanyRentaRepository$9Ph2E_kkKcGSkUDsHoTAO1914Zs.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$PoLt7_1mg64pHBA2cA4fuktKFsI.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<KolyaSuccesModel>> deleteCompany(CreateCompanyModel createCompanyModel) {
        return getApi().deleteCompany(getToken(), createCompanyModel.getId()).map($$Lambda$CompanyRentaRepository$XDpXVeEXP1HjXXtgoeSHBz4Sfhg.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$yQsPHaXLY8nJuzZxlPHUwF9cfS0.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<EmployerList>> getCompanuyEmployersList(Integer num) {
        return getApi().getEmployersListByCompanyId(getToken(), num.intValue()).map($$Lambda$CompanyRentaRepository$0BKk3Tj0icB0ZDgmm2KCSkfuCOw.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$n2RPtOzoPeFfiL8R9WicFij880A.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<EmployerListSingle>> setPermissions(List<String> list, UserProfile userProfile, Integer num) {
        return getApi().setPermissions(getToken(), num.intValue(), userProfile.getUserdata().getId().intValue(), new Permissions(list)).map($$Lambda$CompanyRentaRepository$q6Xp909AxRkP2ycc03m2lPJ7o3U.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$abvapKXEthvnyvVVS80oZz_3SQM.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<SimpleResponse>> setEmployeePlace(String str, String str2) {
        return getApi().setEmployeePlace(getToken(), str, str2).map($$Lambda$CompanyRentaRepository$YlHEVzE3gCeeNs8cEQMbSySdOIE.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$jnA8Z2Zk74zszsOWoSv2TjnSdN0.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<CompanyApplicationsResponse>> getCompanyApplications() {
        return getApi().getCompanyApplications(getToken()).map($$Lambda$CompanyRentaRepository$iGIGcfV1YXZvJknqNHtiWFWxO5E.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$KRL98iSFWMxHj6g1nXwuEpNtL9M.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<SimpleResponse>> readApplicationNotification(String str) {
        return getApi().readApplicationNotification(getToken(), str).map($$Lambda$CompanyRentaRepository$9TmjgYCXkCMNjIyfmu8aAGtZRdA.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$GjuG2UxFuRuJ5fWs8MPx049aAiA.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<RentCompany>> getCompanyById(Integer num) {
        return getApi().getCompanyById(getToken(), num.intValue()).map($$Lambda$CompanyRentaRepository$fETCiwEtf_9Er1xadDgWbYxfUMs.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$rWnxCqea23NjjZ6saMowk3JahyM.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<CompanyObject>>> getEnterpriseCompanyObjects(Integer num) {
        return getApi().getEnterpriseCompanyObjects(getToken(), num.intValue()).map($$Lambda$CompanyRentaRepository$ZNk4eUwTSV0TxeJ_hHSlfBuappI.INSTANCE).onErrorReturn($$Lambda$CompanyRentaRepository$oseboaLoPKwyERBf8T7S5qulhW4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }
}
