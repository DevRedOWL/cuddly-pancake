package p035ru.unicorn.ujin.data.api;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.CabinetProfile;
import p046io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J$\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J$\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'¨\u0006\u000e"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/TestPro100Api;", "", "getProfileData", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/CabinetProfile;", "token", "", "getRentaList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentInfo;", "getTalkingList", "Lru/unicorn/ujin/view/activity/navigation/ui/myrentatype/talkingroom/TalkingInfo;", "getTeamData", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.TestPro100Api */
/* compiled from: TestPro100Api.kt */
public interface TestPro100Api {
    @GET("1")
    Flowable<Resource<CabinetProfile>> getProfileData(@Query("key") String str);

    @GET("get-renta")
    Flowable<Resource<List<RentInfo>>> getRentaList(@Query("key") String str);

    @GET("get-talking")
    Flowable<Resource<List<TalkingInfo>>> getTalkingList(@Query("key") String str);

    @GET("get-team")
    Flowable<Resource<List<CabinetProfile>>> getTeamData(@Query("key") String str);
}
