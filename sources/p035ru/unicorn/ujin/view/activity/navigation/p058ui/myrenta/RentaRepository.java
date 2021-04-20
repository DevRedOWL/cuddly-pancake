package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.EmployerListSingle;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Rent;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.Renters;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkinkRentaObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject;
import p046io.reactivex.Completable;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentaRepository */
public class RentaRepository extends BaseRemoteRepository {
    public Flowable<Resource<List<RentInfo>>> getRentaList() {
        return getApi().getRentaList(getToken()).map($$Lambda$RentaRepository$CNLI0vuP9OwyOwWZ_eDPcie3Qg4.INSTANCE).onErrorReturn($$Lambda$RentaRepository$eTgcYucBS_Y6hHJDzdjWNC5854A.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<RentType>>> getRentTypeList() {
        return getApi().getRentaTypeList(getToken()).map($$Lambda$RentaRepository$JKg3mMO1ZbK6elA4X1IbEEjdz7w.INSTANCE).onErrorReturn($$Lambda$RentaRepository$ZLTM8CreiaPnpTnhjdB7dD5o0wM.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<TimeTableObj>> getTimeSlotsList(String str, String str2) {
        return getApi().getPropTimeTable(getToken(), str, str2).map($$Lambda$RentaRepository$EaUVgWH585LukFluN8rHHVRCzcg.INSTANCE).onErrorReturn($$Lambda$RentaRepository$VoYCvpOA_thqtUx1C_Vm7VL8418.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<TalkingInfo>>> getTalkingRoomList(String str, String str2, String str3) {
        return getApi().getRentsByType(getToken(), str, str2, str3).map($$Lambda$RentaRepository$K6HplQeOP7_YnMsrCoYBEWOeYno.INSTANCE).onErrorReturn($$Lambda$RentaRepository$FpJmKxCclcA10EEObYAKs50kH8c.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<TalkinkRentaObject>> creteRent(int i, Long l, Long l2) {
        return getApi().createRent(getToken(), String.valueOf(i), l.longValue(), l2.longValue()).map($$Lambda$RentaRepository$dgEKc8W_Zcpf6Co22ruqk2CuR4.INSTANCE).onErrorReturn($$Lambda$RentaRepository$szy75Q7_r3rG6eEok836EY0PcY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<TalkinkRentaObject>> creteRent2(int i, String str, String str2) {
        return getApi().createRent2(getToken(), String.valueOf(i), str, str2).map($$Lambda$RentaRepository$xK_JAFQ12jfj2x9QuF07b_jSrns.INSTANCE).onErrorReturn($$Lambda$RentaRepository$Ger75Xpv_iuk0_pxXo6byfv09Q.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Completable deleteRents(Integer num) {
        return getApi().deleteRent(getToken(), new DeleteRentBody(num.intValue())).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Rent>> getRentInfoById(int i) {
        return getApi().getRentById(getToken(), String.valueOf(i)).map($$Lambda$RentaRepository$Kbqzghs7utyWK7QrcHl2ADnbYy8.INSTANCE).onErrorReturn($$Lambda$RentaRepository$mnYrn7Q1IP2W3dbjJG8JOvdAFY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<CompanyList>> getAsImDirector(int i) {
        return getApi().getCompanyList(getToken(), i).map($$Lambda$RentaRepository$BITm2RyHzXwLCRiFRo6A042BBek.INSTANCE).onErrorReturn($$Lambda$RentaRepository$KPaPgNRQ0Ck0O1Qkex1op3s16oQ.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<EmployerListSingle>> managePermission(List<Renters> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(list.get(i).getUserdataId());
        }
        if (list.get(0).isAddRole()) {
            return addToRent(list, arrayList);
        }
        return removeRent(list.get(0).getRentId().toString(), arrayList);
    }

    public Flowable<Resource<EmployerListSingle>> addToRent(List<Renters> list, List<Integer> list2) {
        return getApi().addToRent(getToken(), list.get(0).getRentId().intValue(), new UserDataIdList(list2)).map($$Lambda$RentaRepository$dJH42kLKOAnYaAeLRBAliVPYu10.INSTANCE).onErrorReturn($$Lambda$RentaRepository$_6DNLks8aaXonkauHrKpajObnE.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<EmployerListSingle>> removeRent(String str, List<Integer> list) {
        return getApi().removeFromRent(getToken(), str, new UserDataIdList(list)).map($$Lambda$RentaRepository$b9sP5cIixy_CC4U_Bm89nHkOLv4.INSTANCE).onErrorReturn($$Lambda$RentaRepository$VdkiQrgfa8sB9VWj_cvzI04g_ro.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<CompanyList>> getData() {
        return getApi().getEnterpriseWithEmployers(getToken()).map($$Lambda$RentaRepository$dxmtfBdrleccrvN4dxAhRGPX9g.INSTANCE).onErrorReturn($$Lambda$RentaRepository$A2YzVxbK3PWTAVkFFg8Hdv2TRM4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<TicketPropertyObject>>> getAvailableProperties() {
        return getApi().getAvailableProperties(getToken()).map($$Lambda$RentaRepository$wi72_wmZsmzJhrBJrB8VwjS98J8.INSTANCE).onErrorReturn($$Lambda$RentaRepository$NBGyREbaKApAuRPBp7jriPE3x9o.INSTANCE).subscribeOn(Schedulers.m6765io());
    }
}
