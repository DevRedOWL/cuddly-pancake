package p035ru.unicorn.ujin.view.activity.navigation.repository;

import com.facebook.react.uimanager.ViewProps;
import com.google.gson.Gson;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.api.response.NewsListResponseData;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.PassCard;
import p035ru.unicorn.ujin.data.realm.PassCardUno;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.SipParametrs;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.util.AppUtils;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p035ru.unicorn.ujin.view.activity.navigation.api.SerialNumber;
import p035ru.unicorn.ujin.view.activity.navigation.api.SignalSettings;
import p035ru.unicorn.ujin.view.activity.navigation.data.Action;
import p035ru.unicorn.ujin.view.activity.navigation.entity.intellect.Intellect;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.ScenarioList;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schemas;
import p035ru.unicorn.ujin.view.activity.navigation.entity.video.C5788Video;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms.BMSInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ServiceFields;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServicesList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.Room;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.Icons;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.FormFormat;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.Options;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.scenario_settings.OptionsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.AccountPaymentLink;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.AccountTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.Operation;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.Tickets;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoDates;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEventsList;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoUrl;
import p035ru.unicorn.ujin.view.activity.navigation.repository.base.UserResponse;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository */
public class RemoteRepository extends BaseRemoteRepository {
    public static final String CAR = "vehicle";
    public static final String GUEST = "guest";

    public void getDynamicRequest() {
    }

    public Flowable<Resource<UserResponse>> autorize(String str, String str2) {
        return getApi().getAutorize(getAppName(), str, str2).map($$Lambda$RemoteRepository$bTfOQ1ZbYOH6NCT0Y8nTIYVmgY.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$xjtRYV1z_YPwI8Y_lW8titHbbY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread());
    }

    public Flowable<Resource<SipParametrs>> getSipParams(String str) {
        return getApi().getSip(getAppName(), getToken(), str).map($$Lambda$RemoteRepository$CFHSao5kWVCUsT_jFNwsWm8i8DA.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$sXorMTkrONk2dn6V0yYd0PakOw.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> sendToken(String str, String str2, String str3, String str4) {
        return getApi().sendFCMToken(getAppName(), getToken(), str2, str3, str4, AppUtils.getPhoneMac()).onErrorReturn($$Lambda$RemoteRepository$kN1AcFged_gCZoPdlscwfY5V6Yw.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> deleteToken(String str, String str2) {
        return getApi().deleteFCMToken(getAppName(), str, str2).onErrorReturn($$Lambda$RemoteRepository$vPNykimEMwJtQxCOZuJVasUUE.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> openDoor() {
        return getApi().openDoor(getAppName(), getToken()).map($$Lambda$RemoteRepository$WHeMIR5hTaT8dcwVhORcSy1QG3w.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$JONhEcHIOg3iSQrYqlofGRG0mP8.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> restorePasswordStepOne(String str, Integer num) {
        return getApi().restorePasswordStepOne(getAppName(), str, num).map($$Lambda$RemoteRepository$x18LL1pmACYgeoyBz_BYFeBCfOc.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$Xx5qnheX6gz0CG0aeKf09kvadY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<UserResponse>> restorePasswordStepTwo(String str, Integer num, Integer num2) {
        return getApi().restorePasswordStepTwo(getAppName(), str, num, num2).map($$Lambda$RemoteRepository$AyQVn7Z91KdAIXsJqYgQLlL2Os.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$GPZYANpoulqEzvMU3tKnwKDIg.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<User>> getUserInfo() {
        return getApi().getUserInfo(getAppName(), getToken()).filter($$Lambda$RemoteRepository$BY9EO9Hq1XR1Q6rbnlddcFe7Y8.INSTANCE).map($$Lambda$RemoteRepository$rgp_WCnDde2NG8rm41ObuqBU.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$1Ivrqyaiwei6FmLCPitFy8E_tI4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ boolean lambda$getUserInfo$12(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public Flowable<Resource<ScenarioList>> getScanario() {
        return getApi().getScenario(getAppName(), getToken()).map($$Lambda$RemoteRepository$gc1JkiTQpz_Lx6_e0FpUjenUb0.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$IRtNngTQKBjJlIkzlHsh8GiFmng.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ScenarioList>> getScanarioFlowable() {
        return getApi().getScenario(getAppName(), getToken()).map($$Lambda$RemoteRepository$PljeG_Mb2qW20dat3ilEEE13sx4.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Intellect>> getIntellect() {
        return getApi().getIntellect(getAppName(), getToken()).map($$Lambda$RemoteRepository$_t146lsPMnHpcSWa1Bo4HmUZRCM.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$T7PQAA53qzUytGXFPJKkbOrENE.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Room>> getRooms() {
        return getApi().getRooms(getAppName(), getToken()).map($$Lambda$RemoteRepository$7CX8w69fNhElJ8LU5DpDw2gCdls.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$97xUal0A8RlknqrtteWdzAbeMDs.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<C5788Video>>> getVideoPreview() {
        return getApi().getVideoPreview(getAppName(), getToken()).map($$Lambda$RemoteRepository$RCo_tp1tfYy4kxGdpu_7NwSTik.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$7wyFSJY_crY9F89ePyaFOjg65gk.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Action>> getConserjNumber() {
        return getApi().getConserjNumber(getAppName(), getToken()).map($$Lambda$RemoteRepository$MWubTWhdcHawbUvwAe_rIa17Q.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<CardData>> getCarCardOrder(String str, String str2, String str3, Long l, Long l2, String str4, Boolean bool) {
        return getApi().getCarCard(getAppName(), str, str2, str3, l, l2, str4, CAR, getToken(), bool).map($$Lambda$RemoteRepository$7uomjuHmeaKlktlrtHSaOxedilo.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$4LHOruPNIly6iHYfOEEmDGneRY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ Resource lambda$getCarCardOrder$25(Resource resource) throws Exception {
        return Resource.success(resource.getError(), resource.getMessage(), resource.getData() != null ? ((PassCardUno) resource.getData()).getCardData() : null);
    }

    public Flowable<Resource<CardData>> getGuestCardOrder(String str, String str2, Long l, Long l2, String str3, Boolean bool) {
        return getApi().getGuestOrder(getAppName(), str, str2, str2, l, l2, str3, GUEST, getToken(), bool).map($$Lambda$RemoteRepository$dxrxL5CByiOUpbp5vwoCB713Ews.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$yQDNyNMdUgRRc6QbHwFRgVbiVHQ.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ Resource lambda$getGuestCardOrder$27(Resource resource) throws Exception {
        return Resource.success(resource.getError(), resource.getMessage(), resource.getData() != null ? ((PassCardUno) resource.getData()).getCardData() : null);
    }

    public Flowable<Resource<AccountTicket>> getOperations(String str, int i) {
        return getApi().getOperations(getAppName(), getToken(), str, i).map($$Lambda$RemoteRepository$JQrBafD2yjPvmcCc44OtvIwZUig.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$TF4sxZH0Swi9qHCZdiMovvv5SSA.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Operation>> getOperationDescription(String str, int i, String str2) {
        return getApi().getOperationDescription(getAppName(), getToken(), str, i, str2).map($$Lambda$RemoteRepository$B55i6oTELu25bQWKVTD70_6rV24.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$r1DMmHwx9WBXxiBeuTGEDG0evf4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<AccountPaymentLink>> getAccountPaymentLink(String str, int i, BigDecimal bigDecimal) {
        return getApi().getAccountPaymentLink(getAppName(), getToken(), str, i, bigDecimal).map($$Lambda$RemoteRepository$HUwGzQn3YQFdnPCgBtATXEFcY.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$BYTti2iexNG5FeLwiT_4xyhyLEU.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<Tickets>>> getTickets(String str) {
        return getApi().getTickets(getAppName(), getToken(), str).map($$Lambda$RemoteRepository$MnKYYh6ryWAHuNbV3iB9fY6x9u8.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$0EcaWInt3L_2TFjPDUqys1ufDZQ.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> sendTicketToMail() {
        return getApi().sendTicket(getAppName(), getToken()).map($$Lambda$RemoteRepository$OZ4n_NFSZIEqyI9zJpVxO0eASfg.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$hUC22_drSFKlX_iyZLDO3GuPyso.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Icons>> getIcons() {
        return getApi().getIcons(getAppName(), ViewProps.TOP, getToken()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<ScenarioList>> sendActiveScenario(int i, int i2) {
        return getApi().setScenario(getAppName(), getToken(), i, i2).map($$Lambda$RemoteRepository$xowt3KabStbvvQf0AUj7HA10TY.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$xUkCdqV1ya_CIJ13C_oxiuBl8.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> deleteRoom(Integer num) {
        return getApi().deleteRoom(getAppName(), getToken(), String.valueOf(num)).map($$Lambda$RemoteRepository$KjyNqf7QGw4my_w4ADL2WJMeGQ.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$mL33RhBlx6vajtMpGk3Mz_BwVY.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> addRoom(String str) {
        return getApi().updateRoom(getAppName(), getToken(), str).map($$Lambda$RemoteRepository$RcC5i1rfsxCwQtIokTzdmXhoT8.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$YhyOanxRcH6mRXbUfGUKRPZ0l5U.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<OptionsList> getScenarioOptions(int i) {
        return getApi().getScenarioOptions(getAppName(), getToken(), i).map($$Lambda$RemoteRepository$5dWYiweT7Yqv9NA5vnwj81f4fLg.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ OptionsList lambda$getScenarioOptions$45(Resource resource) throws Exception {
        return (OptionsList) resource.getData();
    }

    public Flowable<Resource<Void>> saveState(Options options) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(new Gson().toJson((Object) options));
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        return getApi().saveSettings(getAppName(), getToken(), jSONObject).map($$Lambda$RemoteRepository$XeMaCYHAySWYTsyhkIjZuugIeI.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$bjpzWCuycl06Cl2HgKtnh5NmzOA.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<ClassDevice>>> getClassDevice() {
        return getApi().getClassDevice(getAppName(), getToken()).map($$Lambda$RemoteRepository$09U70pNR1MK_Y3OQIvqUGVhMAI.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$cBhcADKMyf5Q9fquLj_Hdr2rJYs.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<DeviceModel>>> getDeviceModel(String str) {
        return getApi().getDeviceModel(getAppName(), getToken(), str).map($$Lambda$RemoteRepository$GpgJH0kMPQEPPJR59xJ2sR6pvEU.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$Ryxzo8tzSmwfWg77pa484ejzIM.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<SerialNumber>> addHardware(String str, String str2, Integer num) {
        return getApi().addHardware(getAppName(), str, str2, num, getToken()).map($$Lambda$RemoteRepository$C_gL2ct99MSnPBY3dbd4x6ytuVQ.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$Q4U9tXu0ymSJ1SoI19ppD1oFNlg.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<SignalSettings>> getWindowsSettings(Long l) {
        return getApi().getWindowSetting(getAppName(), l, "show-map", getToken()).map($$Lambda$RemoteRepository$UUT4aYSnaKfVbpoji9dG3niwDiQ.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$m20iglLqXDO08VccQQKm8Y0L_M.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> deleteHardware(String str) {
        return getApi().deleteHardware(getAppName(), str, getToken()).map($$Lambda$RemoteRepository$mcqAPZTaqJPW2j5RM_UILnGb69k.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$hoqMdWEyYztJw7UPpmOXPLPEwx0.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<SignalCode>> saveCode(String str, String str2) {
        return getApi().saveCode(getAppName(), str, str2, getToken()).map($$Lambda$RemoteRepository$VpXsIrXQDEmIjmZEwgMyOLmr1B8.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$T8GMg09Cs0EUMoxHlGB9R5XhUgA.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> updateDevice(String str, String str2) {
        return getApi().updateHardware(getAppName(), str, str2, getToken()).map($$Lambda$RemoteRepository$CJAkWoHndPP6Dlaor8tJFB6rBM.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$LYSkd0WacZsX8vDzMButdtV3V0.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> updateDeviceRoom(String str, Integer num) {
        return getApi().updateDeviceRoom(getAppName(), str, num, getToken()).map($$Lambda$RemoteRepository$LdVC64R4qly049cu0ZqFmYThlr0.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$9f1BwGcIyRj8E5M4OUJSe3zhBTE.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Schemas> getSchema(boolean z) {
        return getApi().getSchema(getAppName(), getToken(), z ^ true ? 1 : 0).map($$Lambda$RemoteRepository$yG5KjNhm3ktxs88izrVE9UXXGWQ.INSTANCE).filter($$Lambda$RemoteRepository$8_Qz9v4vYiLw_of20vNuPCkelqk.INSTANCE).map($$Lambda$wBjaGCFaMdic0VcMkC832jR6IA.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ boolean lambda$getSchema$65(Resource resource) throws Exception {
        return resource.getData() != null;
    }

    public Flowable<Resource<Void>> senDynamicRequest(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.contains("https://api-product.mysmartflat.ru/api/")) {
            sb.append("https://api-product.mysmartflat.ru/api/");
        }
        if (str.contains("/api/")) {
            str = str.split("/api/")[1];
        }
        sb.append(str);
        if (!str.contains("/?")) {
            sb.append("/?");
            sb.append("token=");
            sb.append(getToken());
        } else {
            sb.append("&token=");
            sb.append(getToken());
        }
        return getApi().senDynamicRequest(getAppName(), getToken(), sb.toString()).map($$Lambda$RemoteRepository$mwL1UDBB56rjIXuVxmx31f2QFw8.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$tNBHQjkMFrZzcFAA0WsVezhEm8A.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ Resource lambda$senDynamicRequest$66(Resource resource) throws Exception {
        if (resource.getMessage() == null || resource.getMessage().isEmpty()) {
            return Resource.success(resource.getError(), resource.getMessage(), resource.getData());
        }
        return Resource.success(1, resource.getMessage(), resource.getData());
    }

    public Flowable<Resource<Void>> senDynamicRequestCustomUrl(String str, String str2) {
        return getApi().senDynamicRequest(getAppName(), getToken(), str, str2).map($$Lambda$RemoteRepository$8pNwbHRwA25hz0ydgoqpTMAN0.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$WW6uyveYWHnSfJa8i7F2Ui2gzSQ.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    static /* synthetic */ Resource lambda$senDynamicRequestCustomUrl$68(Resource resource) throws Exception {
        if (resource.getMessage() == null || resource.getMessage().isEmpty()) {
            return Resource.success(resource.getError(), resource.getMessage(), resource.getData());
        }
        return Resource.success(1, resource.getMessage(), resource.getData());
    }

    public Flowable<Resource<BMSInfo>> getBMSInfo() {
        return getApi().getBMSInfo(getAppName(), getToken()).map($$Lambda$RemoteRepository$4pxwotQniKpN2Yey2UwUcrTwPNU.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$eYgtGeQR14wxyIjzCB8AlPMz5A.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<ServiceData>>> getServiceList() {
        return getApi().getSubscriptions(getAppName(), getToken()).map($$Lambda$RemoteRepository$kNUp7Kbx1Lx3kv3PnuEvpplg3zI.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$rszLNV0BoVsVL7CrBdUaNlbRvkQ.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<ServiceFields>>> getRequestFields(int i) {
        return getApi().getRequestFields(getAppName(), getToken(), i).map($$Lambda$RemoteRepository$zFVZ82S1ni_M7THVDD0ILEyp0.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$noNWvgiYJPbwXAnh5HkQGZeqEoQ.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> sendServiceFields(Map<String, String> map, int i) {
        return getApi().createRequest(getAppName(), getToken(), i, map).map($$Lambda$RemoteRepository$gFVR0INxuq32ob0g3TLguYnHl0Y.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$ixe9ypPWike7eJSHrI4yxvUPI_4.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Intercom>> getIntercom() {
        return getApi().getIntercom(getAppName(), getToken()).map($$Lambda$RemoteRepository$7khyHgKZadoqfeJcy7Dkpfwn494.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$GkOqtybJdrHYomsq88_bd_MweOk.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<PassCard>> getAllCard() {
        return getApi().getAllCard(getAppName(), getToken()).map($$Lambda$RemoteRepository$BdxusqM4aRCsmizmbpPDwLyA8V4.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$MGyMI9BcP_WRkA_69uhY8lov8YQ.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<Void>> deleteCard(String str) {
        return getApi().deleteCard(getAppName(), getToken(), str).map($$Lambda$RemoteRepository$ibIDc8GiPq3ESoyaUi6gwJtYAD4.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$mWC5PbWtltllJeIbKI19dVN3CR8.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<VideoDates>> getAvailableDate(String str, String str2) {
        if (str2.isEmpty()) {
            return getApi().getAvailableVideoDates(getAppName(), str, getToken()).map($$Lambda$RemoteRepository$gPvtOaPlBbwjaif148oyUg9xF94.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$xAmCiNXey_tw_OEq1qvG6CCwoPE.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        }
        return getApi().getAvailableVideoDatesUrl(str2 + "videoarchive/get-archive-dates/", getAppName(), str, getToken()).map($$Lambda$RemoteRepository$ZIIcqJg1cTpth5z8FqCCsRIuoio.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$MikYPAtuw1PNG3qleZWiDS9kLww.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<VideoEventsList>> getArchiveDateEvents(String str, String str2, String str3) {
        if (str3 == null || str3.isEmpty()) {
            return getApi().getArchiveDateEvents(getAppName(), str, str2, getToken()).map($$Lambda$RemoteRepository$fIowbvJf9B_ZUbZvOgpG4hcXTc.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$I4lH6ykdGDJILIU8Y4G9YXHDPD8.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
        }
        return getApi().getArchiveDateEventsUrl(str3 + "videoarchive/get-archive-date-events/", getAppName(), str, str2, getToken()).map($$Lambda$RemoteRepository$AfEXRXBsgUYTUuyZXtZEkk4Kio0.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$qPM68Q43Zr4MOxp397taTlsmm3g.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<VideoUrl>> getArchiveStream(String str, String str2, String str3) {
        if (str3.isEmpty()) {
            return getApi().getArchiveStream(getAppName(), str, str2, getToken()).map($$Lambda$RemoteRepository$GoMt0e0LlM7JmpAd_GdIey8OGA.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$OaUTbBEEkyZq1LRUDRPBn2RxA.INSTANCE).subscribeOn(Schedulers.m6765io());
        }
        return getApi().getArchiveStreamUrl(str3 + "videoarchive/get-archive-stream/", getAppName(), str, str2, getToken()).map($$Lambda$RemoteRepository$xNb7iYLb9Thb_7TYzhrgdG87UE.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$srxomN7hPv6Ff9SBbFHss8lLUtM.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<List<DomServicesList>>> getServicesList() {
        return getApi().getDomListServices(getAppName(), getToken()).map($$Lambda$RemoteRepository$tYBJ36KMpK8Q5bc_YzAQrtC_t8A.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$OwoEP0JkpgFTQVd_1cVSTBdGGtk.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<NewsListResponseData>> getNewsList() {
        return getApi().getNewsList(getToken()).map($$Lambda$RemoteRepository$pDnS4khVRov_miocC_OgTCXQYs.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$mu45E5OTThwTQBXTqFwe3VV4h2Q.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<News>> getNewsById(String str) {
        return getApi().getNewsById(getToken(), str).map($$Lambda$RemoteRepository$SFLkkKXcf8NBg22rs7mn3vkoo2s.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$pt2fkV0J63RngP2gmbc_rUxJRI.INSTANCE).subscribeOn(Schedulers.m6765io());
    }

    public Flowable<Resource<FormFormat>> getFormaData() {
        return getApi().getFormResource(getToken()).map($$Lambda$RemoteRepository$7p3XSVdfuwhn6W7ydyKQBBONIRg.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$oG70BIAks3zEx6gRbkyK0KqlAw.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io());
    }

    public void inserLog(String str) {
        getApi().insertLog("123445678", "qaz", str, "1516349").map($$Lambda$RemoteRepository$ZC97xOJd_VuMy5SxZ9gG_Hq2h4.INSTANCE).onErrorReturn($$Lambda$RemoteRepository$qQG8YjUl5EkZiBIBUTwHRuXZE.INSTANCE).startWith(Resource.loading()).subscribeOn(Schedulers.m6765io()).subscribe();
    }
}
