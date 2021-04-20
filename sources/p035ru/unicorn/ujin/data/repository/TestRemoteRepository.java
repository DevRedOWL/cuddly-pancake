package p035ru.unicorn.ujin.data.repository;

import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.CabinetProfile;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.data.repository.TestRemoteRepository */
public class TestRemoteRepository extends BaseTestRemoteRepository {
    String key = "68532980";

    public Flowable<Resource<CabinetProfile>> getMyProfileData() {
        return getApi().getProfileData("68532980").onErrorReturn($$Lambda$TestRemoteRepository$TV3PlIWRWhMlwGzHovZya8UY1LY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<CabinetProfile>>> getTeam() {
        return getApi().getTeamData("68532980").onErrorReturn($$Lambda$TestRemoteRepository$pgukQ2AW5IIGy_22D4iRdGQIn4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<RentInfo>>> getRentaList() {
        return getApi().getRentaList("68532980").onErrorReturn($$Lambda$TestRemoteRepository$wDFpod84fhbZvpLcXYtXGa4QcuI.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<TalkingInfo>>> getTalkingRoomList() {
        return getApi().getTalkingList("68532980").onErrorReturn($$Lambda$TestRemoteRepository$Ep_f_pHezFmI5pYnL70rOAXR3w.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }
}
