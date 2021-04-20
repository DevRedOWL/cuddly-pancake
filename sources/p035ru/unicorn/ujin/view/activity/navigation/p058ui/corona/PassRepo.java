package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.graphics.Bitmap;
import androidx.databinding.ObservableField;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.data.AvailablePassType;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.data.QrCode;
import p035ru.unicorn.ujin.data.QrCodeForSave;
import p035ru.unicorn.ujin.data.api.Pro100Api;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.QRIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.FingerIterationAnswer;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;
import p046io.realm.RealmModel;
import p059rx.subjects.BehaviorSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001e0\u001d0\u001c2\u0006\u0010#\u001a\u00020\u0016J.\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001d0\u001c2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0&J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u001c2\u0006\u0010+\u001a\u00020\u0016J\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u001c2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0016J$\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u001c2\u0006\u0010.\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010\u0016J\u001a\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u001c2\u0006\u0010,\u001a\u00020\u0016J\u0006\u00101\u001a\u00020'J\u0012\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u001cJ\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001c2\u0006\u0010+\u001a\u00020\u0016J\u0018\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001e0\u001d0\u001cJ\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001d0\u001c2\u0006\u00108\u001a\u000209J\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001e0\u001d0\u001cJ\u0012\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<030\u001cJ\u001a\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u001d0\u001c2\u0006\u00108\u001a\u00020\u0016J\u001c\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u001d0\u001c2\b\u0010A\u001a\u0004\u0018\u00010BJ\u001a\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u001c2\u0006\u0010,\u001a\u00020\u0016J\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u001d0\u001c2\u0006\u0010E\u001a\u00020FJ,\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u001d0\u001c2\u0006\u0010,\u001a\u00020\u00162\u0006\u0010I\u001a\u0002092\b\u0010J\u001a\u0004\u0018\u00010\u0016J\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001d0\u001cJ\u001a\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0\u001d0\u001c2\u0006\u00108\u001a\u000209J\u000e\u0010M\u001a\u00020*2\u0006\u0010N\u001a\u00020\fJ\u0010\u0010O\u001a\u00020*2\b\u0010P\u001a\u0004\u0018\u00010BR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R#\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001e0\u001d0\u001c8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006Q"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassRepo;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "addressRepo", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/AddressRepo;", "currentPass", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;", "getCurrentPass", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;", "setCurrentPass", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;)V", "currentPassDetail", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "getCurrentPassDetail", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "setCurrentPassDetail", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;)V", "localRep", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "kotlin.jvm.PlatformType", "messageSubject", "Lrx/subjects/BehaviorSubject;", "", "getMessageSubject", "()Lrx/subjects/BehaviorSubject;", "myProfileRemoteRepository", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/MyProfileRemoteRepository;", "passList", "Lio/reactivex/Flowable;", "Lru/unicorn/ujin/data/realm/Resource;", "", "getPassList", "()Lio/reactivex/Flowable;", "createAddress", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "adress", "createPass", "tempPass", "Landroidx/databinding/ObservableField;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/CreatePassDTO;", "currentAddress", "deleteKey", "", "interfaceType", "sn", "enableBleGateReader", "readerSn", "uniqeValue", "enableBleReader", "generateTemPass", "getAssignKey", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "getKeyByInterfaceType", "getListAdress", "getPassById", "id", "", "hasAdress", "loadAllAvailableSystem", "Lru/unicorn/ujin/ble/data/AvailablePassType;", "loadQrCode", "Lru/unicorn/ujin/data/QrCode;", "saveCurrent", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "userProfile", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "sendCardData", "sendFaceData", "picture", "Landroid/graphics/Bitmap;", "sendFingerData", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/FingerIterationAnswer;", "iterCount", "param", "sendToMail", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/QRIn;", "setPassDetail", "passDetail", "validateAndSaveProfile", "user", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo */
/* compiled from: PassRepo.kt */
public final class PassRepo extends BaseRemoteRepository {
    private final AddressRepo addressRepo = new AddressRepo();
    private PassIn currentPass;
    private Pass currentPassDetail;
    private final LocalRepository localRep = LocalRepository.getInstance();
    private final BehaviorSubject<String> messageSubject;
    private final MyProfileRemoteRepository myProfileRemoteRepository = new MyProfileRemoteRepository();

    public final void validateAndSaveProfile(UserProfile userProfile) {
    }

    public PassRepo() {
        BehaviorSubject<String> create = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "BehaviorSubject.create()");
        this.messageSubject = create;
    }

    public final BehaviorSubject<String> getMessageSubject() {
        return this.messageSubject;
    }

    public final PassIn getCurrentPass() {
        return this.currentPass;
    }

    public final void setCurrentPass(PassIn passIn) {
        this.currentPass = passIn;
    }

    public final Pass getCurrentPassDetail() {
        return this.currentPassDetail;
    }

    public final void setCurrentPassDetail(Pass pass) {
        this.currentPassDetail = pass;
    }

    public final Flowable<Resource<List<PassIn>>> getPassList() {
        Flowable<R> subscribeOn = getApi().passList(getToken()).map(PassRepo$passList$1.INSTANCE).onErrorReturn(PassRepo$passList$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.passList(getToken())…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Pass>> getPassById(int i) {
        Flowable<R> subscribeOn = getApi().passById(getToken(), i).map(PassRepo$getPassById$1.INSTANCE).onErrorReturn(PassRepo$getPassById$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.passById(getToken(),…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final void setPassDetail(Pass pass) {
        Intrinsics.checkNotNullParameter(pass, "passDetail");
        this.currentPassDetail = pass;
    }

    public final CreatePassDTO generateTemPass() {
        CreatePassDTO createPassDTO = new CreatePassDTO((ObservableField) null, (ObservableField) null, (ObservableField) null, (ObservableField) null, 15, (DefaultConstructorMarker) null);
        createPassDTO.getTimeAsText().set("Выберите дату");
        return createPassDTO;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r1 = r5.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p046io.reactivex.Flowable<p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass>> createPass(androidx.databinding.ObservableField<p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO> r5, androidx.databinding.ObservableField<p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "tempPass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "currentAddress"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Object r5 = r5.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO r5 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO) r5
            r0 = 0
            if (r5 == 0) goto L_0x0020
            androidx.databinding.ObservableField r1 = r5.getText()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0021
        L_0x0020:
            r1 = r0
        L_0x0021:
            if (r1 == 0) goto L_0x002e
            androidx.databinding.ObservableField r1 = r5.getText()
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0030
        L_0x002e:
            java.lang.String r1 = "Пустая заявка"
        L_0x0030:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r5 == 0) goto L_0x0041
            androidx.databinding.ObservableField r5 = r5.getTimeAsText()
            java.lang.Object r5 = r5.get()
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x004a
        L_0x0041:
            java.util.Date r5 = new java.util.Date
            r5.<init>()
            java.lang.String r5 = p035ru.unicorn.ujin.util.DateUtils.formatDateYYYYMMDD(r5)
        L_0x004a:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            ru.unicorn.ujin.data.api.Pro100Api r2 = r4.getApi()
            java.lang.String r3 = r4.getToken()
            java.lang.Object r6 = r6.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress) r6
            if (r6 == 0) goto L_0x0066
            int r6 = r6.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x0066:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            io.reactivex.Flowable r5 = r2.createWalkPass(r3, r6, r5, r1)
            ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$createPass$1 r6 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassRepo$createPass$1.INSTANCE
            io.reactivex.functions.Function r6 = (p046io.reactivex.functions.Function) r6
            io.reactivex.Flowable r5 = r5.map(r6)
            ru.unicorn.ujin.view.activity.navigation.ui.corona.PassRepo$createPass$2 r6 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassRepo$createPass$2.INSTANCE
            io.reactivex.functions.Function r6 = (p046io.reactivex.functions.Function) r6
            io.reactivex.Flowable r5 = r5.onErrorReturn(r6)
            io.reactivex.Scheduler r6 = p046io.reactivex.schedulers.Schedulers.m6765io()
            io.reactivex.Flowable r5 = r5.subscribeOn(r6)
            java.lang.String r6 = "api\n                .cre…scribeOn(Schedulers.io())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassRepo.createPass(androidx.databinding.ObservableField, androidx.databinding.ObservableField):io.reactivex.Flowable");
    }

    public final Flowable<Resource<QRIn>> sendToMail() {
        Pro100Api api = getApi();
        String token = getToken();
        PassIn passIn = this.currentPass;
        Intrinsics.checkNotNull(passIn);
        Flowable<R> subscribeOn = api.sendQRtoMail(token, passIn.getId(), "active", "email").map(PassRepo$sendToMail$1.INSTANCE).onErrorReturn(PassRepo$sendToMail$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.sendQRtoMail(getToke…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<QRIn>> sendToMail(int i) {
        Flowable<R> subscribeOn = getApi().sendQRtoMail(getToken(), i, "active", "email").map(PassRepo$sendToMail$3.INSTANCE).onErrorReturn(PassRepo$sendToMail$4.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.sendQRtoMail(getToke…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<List<ProfileAdress>>> createAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "adress");
        return this.addressRepo.createAddress(str);
    }

    public final Flowable<Resource<List<ProfileAdress>>> getListAdress() {
        return this.addressRepo.getListAdressAny();
    }

    public final Flowable<Resource<List<ProfileAdress>>> hasAdress() {
        return this.addressRepo.getListAdressAny();
    }

    public final Flowable<Resource<ProfileData>> saveCurrent(UserProfile userProfile) {
        UserData userdata;
        if (!(userProfile == null || (userdata = userProfile.getUserdata()) == null)) {
            userdata.setGender("");
        }
        Flowable<Resource<ProfileData>> subscribeOn = this.myProfileRemoteRepository.updateProfile(userProfile).onErrorReturn(PassRepo$saveCurrent$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "myProfileRemoteRepositor…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<QrCode>> loadQrCode(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        Flowable<R> take = LocalRepository.getInstance().getElementById((Class<? extends RealmModel>) QrCodeForSave.class, str, "id").filter(PassRepo$loadQrCode$localQr$1.INSTANCE).cast(QrCodeForSave.class).map(PassRepo$loadQrCode$localQr$2.INSTANCE).map(PassRepo$loadQrCode$localQr$3.INSTANCE).concatWith(getApi().loadQrCode(str, getToken()).map(PassRepo$loadQrCode$remoteQr$1.INSTANCE).onErrorReturn(PassRepo$loadQrCode$remoteQr$2.INSTANCE).subscribeOn(Schedulers.m6765io())).take(1);
        Intrinsics.checkNotNullExpressionValue(take, "localQr.concatWith (remoteQr).take(1)");
        return take;
    }

    public final Flowable<BleKeyData> getKeyByInterfaceType(String str) {
        Intrinsics.checkNotNullParameter(str, "interfaceType");
        Flowable<U> cast = LocalRepository.getInstance().getElementById((Class<? extends RealmModel>) BleKeyData.class, str, "interfaceType").filter(PassRepo$getKeyByInterfaceType$1.INSTANCE).cast(BleKeyData.class);
        Intrinsics.checkNotNullExpressionValue(cast, "LocalRepository\n        …t(BleKeyData::class.java)");
        return cast;
    }

    public final Flowable<Resource<Unit>> sendFaceData(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "picture");
        Flowable<R> subscribeOn = getKeyByInterfaceType("face").flatMap(new PassRepo$sendFaceData$1(this, bitmap)).map(PassRepo$sendFaceData$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "getKeyByInterfaceType(\"f…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<FingerIterationAnswer>> sendFingerData(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "sn");
        Flowable<R> subscribeOn = getApi().sendFingerData(getToken(), PASS_TYPE.FINGER.getType(), str, i, str2).map(PassRepo$sendFingerData$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.sendFingerData(\n    …scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Unit>> enableBleReader(String str) {
        Intrinsics.checkNotNullParameter(str, "sn");
        Flowable<R> flatMap = getKeyByInterfaceType("ble").flatMap(new PassRepo$enableBleReader$1(this, str));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getKeyByInterfaceType(\"b…s.io())\n                }");
        return flatMap;
    }

    public final Flowable<Resource<Unit>> enableBleGateReader(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "readerSn");
        Flowable<R> subscribeOn = getApi().sendGateData(getToken(), PASS_TYPE.BLE.getType(), "0", str, str2).map(PassRepo$enableBleGateReader$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.sendGateData(getToke…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Unit>> sendCardData(String str) {
        Intrinsics.checkNotNullParameter(str, "sn");
        Flowable<R> subscribeOn = getApi().sendCardData(getToken(), PASS_TYPE.CARD.getType(), str).map(PassRepo$sendCardData$1.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.sendCardData(\n      …scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Unit>> deleteKey(String str) {
        Intrinsics.checkNotNullParameter(str, "interfaceType");
        Flowable<R> subscribeOn = getKeyByInterfaceType(str).flatMap(new PassRepo$deleteKey$1(this, str)).map(PassRepo$deleteKey$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "getKeyByInterfaceType(in…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<Unit>> deleteKey(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "sn");
        Intrinsics.checkNotNullParameter(str2, "interfaceType");
        Flowable<R> subscribeOn = getApi().deletePassKey(str, str2, 1, getToken()).map(PassRepo$deleteKey$3.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.deletePassKey(sn, in…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<List<AvailablePassType>> loadAllAvailableSystem() {
        Flowable<List<U>> subscribeOn = LocalRepository.getInstance().getData(AvailablePassType.class).filter(PassRepo$loadAllAvailableSystem$1.INSTANCE).flatMapIterable(PassRepo$loadAllAvailableSystem$2.INSTANCE).cast(AvailablePassType.class).toList().toFlowable().subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "LocalRepository\n        …scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<List<BleKeyData>> getAssignKey() {
        Flowable<List<U>> subscribeOn = LocalRepository.getInstance().getData(BleKeyData.class).filter(PassRepo$getAssignKey$1.INSTANCE).flatMapIterable(PassRepo$getAssignKey$2.INSTANCE).cast(BleKeyData.class).filter(PassRepo$getAssignKey$3.INSTANCE).toList().toFlowable().subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "LocalRepository\n        …scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
