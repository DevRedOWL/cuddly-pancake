package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.Pair;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.mobileid.Api;
import p035ru.unicorn.ujin.MainApplication;
import p035ru.unicorn.ujin.ble.BleRepo;
import p035ru.unicorn.ujin.ble.data.AvailablePassType;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.PassRepo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.RequestAccessState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.Started;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger.FingerIterationAnswer;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileLocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.Flowable;
import p046io.reactivex.Maybe;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000É\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001j\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010`\u001a\u0002022\u0006\u0010a\u001a\u00020*J\u000e\u0010b\u001a\u0002022\u0006\u0010c\u001a\u00020*J\u0016\u0010b\u001a\u0002022\u0006\u0010d\u001a\u00020*2\u0006\u0010c\u001a\u00020*J\u0006\u0010e\u001a\u000202J\u0006\u0010f\u001a\u000202J\u0006\u0010g\u001a\u000202J\u000e\u0010h\u001a\u0002022\u0006\u0010i\u001a\u00020*J\r\u0010;\u001a\u00020jH\u0002¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020HH\u0002J\u0006\u0010m\u001a\u000202J\u0006\u0010n\u001a\u000202J\u000e\u0010o\u001a\u0002022\u0006\u0010p\u001a\u00020*J\u000e\u0010q\u001a\u0002022\u0006\u0010r\u001a\u00020sJ\u000e\u0010t\u001a\u0002022\u0006\u0010u\u001a\u00020sJ\u000e\u0010v\u001a\u0002022\u0006\u0010w\u001a\u00020*J\b\u0010x\u001a\u000202H\u0014J\u0010\u0010y\u001a\u0002022\u0006\u0010z\u001a\u00020{H\u0002J\b\u0010|\u001a\u000202H\u0002J\u0006\u0010}\u001a\u000202J\u0006\u0010~\u001a\u000202J\u0006\u0010\u001a\u000202J\u0016\u0010\u0001\u001a\u0004\u0018\u00010W2\t\u0010\u0001\u001a\u0004\u0018\u00010WH\u0002J\u000f\u0010\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020*J\u0007\u0010\u0001\u001a\u000202J\u000f\u0010\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020*J#\u0010\u0001\u001a\u0002022\u0006\u0010d\u001a\u00020*2\u0007\u0010\u0001\u001a\u00020R2\t\u0010\u0001\u001a\u0004\u0018\u00010*J\u0014\u0010\u0001\u001a\u00020H2\t\u0010\u0001\u001a\u0004\u0018\u00010WH\u0002R,\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00060\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\t\"\u0004\b\u001b\u0010\u000bR&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00060\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR#\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0#0\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011R \u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\r¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0011R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\r¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0011R\u001a\u0010/\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200X\u0004¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000204X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001b\u00109\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\tR \u0010B\u001a\b\u0012\u0004\u0012\u00020C0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0011\"\u0004\bE\u0010FR \u0010G\u001a\b\u0012\u0004\u0012\u00020H0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0011\"\u0004\bJ\u0010FR \u0010K\u001a\b\u0012\u0004\u0012\u00020H0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0011\"\u0004\bM\u0010FR \u0010N\u001a\b\u0012\u0004\u0012\u00020H0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0011\"\u0004\bP\u0010FR \u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\t\"\u0004\bT\u0010\u000bR \u0010U\u001a\b\u0012\u0004\u0012\u00020W0VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R&\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\t\"\u0004\b_\u0010\u000b¨\u0006\u0001"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "addressListMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "getAddressListMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setAddressListMutableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "allAssignKey", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "getAllAssignKey", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "allBleDevice", "Lru/unicorn/ujin/ble/data/BleReader;", "getAllBleDevice", "assignKeys", "getAssignKeys", "setAssignKeys", "availablePassType", "Lru/unicorn/ujin/ble/data/AvailablePassType;", "getAvailablePassType", "setAvailablePassType", "bleKeyDataFilterBy", "getBleKeyDataFilterBy", "setBleKeyDataFilterBy", "bleReaderDataFilterBy", "getBleReaderDataFilterBy", "setBleReaderDataFilterBy", "currentBleDevice", "Landroid/util/Pair;", "getCurrentBleDevice", "currentPhoto", "Landroid/graphics/Bitmap;", "getCurrentPhoto", "setCurrentPhoto", "iterationError", "", "getIterationError", "iterationResult", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/FingerIterationAnswer;", "getIterationResult", "onRequestKeyViaInternetResult", "Lkotlin/Function1;", "Lorg/mobileid/Api$RequestKeyResult;", "", "passRepo", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassRepo;", "getPassRepo", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassRepo;", "setPassRepo", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassRepo;)V", "requestAccessListener", "Lorg/mobileid/Api$RequestAccessListener;", "getRequestAccessListener", "()Lorg/mobileid/Api$RequestAccessListener;", "requestAccessListener$delegate", "Lkotlin/Lazy;", "requestAccessState", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/RequestAccessState;", "getRequestAccessState", "saveBleGateResult", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/GateStatus;", "getSaveBleGateResult", "setSaveBleGateResult", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "saveBleResult", "", "getSaveBleResult", "setSaveBleResult", "saveFaceResult", "getSaveFaceResult", "setSaveFaceResult", "savePhotoResult", "getSavePhotoResult", "setSavePhotoResult", "selectedFingerReader", "", "getSelectedFingerReader", "setSelectedFingerReader", "userData", "Landroidx/databinding/ObservableField;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "getUserData", "()Landroidx/databinding/ObservableField;", "setUserData", "(Landroidx/databinding/ObservableField;)V", "userMutableLiveData", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "getUserMutableLiveData", "setUserMutableLiveData", "addAdress", "text", "deleteByInterfaceType", "interfaceType", "sn", "getAdress", "getAllAvailableType", "getAssignKey", "getMyPassBy", "passType", "ru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM$getRequestAccessListener$1", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM$getRequestAccessListener$1;", "hasAddress", "loadAllAssignKey", "loadAllBleDevice", "loadBleBy", "type", "loadPassDeviceRemote", "serialNumber", "", "migrateKey", "phoneUnique", "onBarcodeRecieve", "mobileQR", "onCleared", "onRequestAccessResult", "result", "Lorg/mobileid/Api$RequestAccessResult;", "onRequestAccessStarted", "onSaveClick", "removeGateObserve", "sendPhotoToSever", "setGender", "user", "startAddBle", "startObserve", "startScanCard", "startScanFinger", "iterCount", "param", "userValid", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM */
/* compiled from: PassProfileVM.kt */
public final class PassProfileVM extends BaseViewModel {
    private MutableLiveData<Resource<List<ProfileAdress>>> addressListMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<List<BleKeyData>> allAssignKey = new SingleLiveEvent<>();
    private final SingleLiveEvent<List<BleReader>> allBleDevice = new SingleLiveEvent<>();
    private MutableLiveData<List<BleKeyData>> assignKeys = new MutableLiveData<>();
    private MutableLiveData<List<AvailablePassType>> availablePassType = new MutableLiveData<>();
    private MutableLiveData<List<BleKeyData>> bleKeyDataFilterBy = new MutableLiveData<>();
    private MutableLiveData<List<BleReader>> bleReaderDataFilterBy = new MutableLiveData<>();
    private final SingleLiveEvent<Pair<BleReader, BleKeyData>> currentBleDevice = new SingleLiveEvent<>();
    private MutableLiveData<Bitmap> currentPhoto = new MutableLiveData<>();
    private final SingleLiveEvent<String> iterationError = new SingleLiveEvent<>();
    private final SingleLiveEvent<FingerIterationAnswer> iterationResult = new SingleLiveEvent<>();
    private final Function1<Api.RequestKeyResult, Unit> onRequestKeyViaInternetResult;
    private PassRepo passRepo = new PassRepo();
    private final Lazy requestAccessListener$delegate = LazyKt.lazy(new PassProfileVM$requestAccessListener$2(this));
    private final MutableLiveData<RequestAccessState> requestAccessState = new MutableLiveData<>();
    private SingleLiveEvent<GateStatus> saveBleGateResult = new SingleLiveEvent<>();
    private SingleLiveEvent<Boolean> saveBleResult = new SingleLiveEvent<>();
    private SingleLiveEvent<Boolean> saveFaceResult = new SingleLiveEvent<>();
    private SingleLiveEvent<Boolean> savePhotoResult = new SingleLiveEvent<>();
    private MutableLiveData<Integer> selectedFingerReader = new MutableLiveData<>();
    private ObservableField<UserProfile> userData = new ObservableField<>();
    private MutableLiveData<Resource<ProfileData>> userMutableLiveData = new MutableLiveData<>();

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileVM$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Api.MobileQRCheckResult.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Api.RequestKeyResult.values().length];

        static {
            $EnumSwitchMapping$0[Api.MobileQRCheckResult.VALID.ordinal()] = 1;
            $EnumSwitchMapping$0[Api.MobileQRCheckResult.ALREADY_EXISTS.ordinal()] = 2;
            $EnumSwitchMapping$1[Api.RequestKeyResult.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Api.RequestKeyResult.REJECTED.ordinal()] = 2;
            $EnumSwitchMapping$1[Api.RequestKeyResult.UNKNOWN.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final Api.RequestAccessListener getRequestAccessListener() {
        return (Api.RequestAccessListener) this.requestAccessListener$delegate.getValue();
    }

    public PassProfileVM() {
        ProfileData profileDataLocal = new MyProfileLocalRepository().getProfileDataLocal();
        this.userData.set(profileDataLocal != null ? profileDataLocal.getProfile() : null);
        getAdress();
        loadAllBleDevice();
        this.onRequestKeyViaInternetResult = new PassProfileVM$onRequestKeyViaInternetResult$1(this);
    }

    public final PassRepo getPassRepo() {
        return this.passRepo;
    }

    public final void setPassRepo(PassRepo passRepo2) {
        Intrinsics.checkNotNullParameter(passRepo2, "<set-?>");
        this.passRepo = passRepo2;
    }

    public final ObservableField<UserProfile> getUserData() {
        return this.userData;
    }

    public final void setUserData(ObservableField<UserProfile> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.userData = observableField;
    }

    public final MutableLiveData<Resource<ProfileData>> getUserMutableLiveData() {
        return this.userMutableLiveData;
    }

    public final void setUserMutableLiveData(MutableLiveData<Resource<ProfileData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.userMutableLiveData = mutableLiveData;
    }

    public final MutableLiveData<Resource<List<ProfileAdress>>> getAddressListMutableLiveData() {
        return this.addressListMutableLiveData;
    }

    public final void setAddressListMutableLiveData(MutableLiveData<Resource<List<ProfileAdress>>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.addressListMutableLiveData = mutableLiveData;
    }

    public final MutableLiveData<Bitmap> getCurrentPhoto() {
        return this.currentPhoto;
    }

    public final void setCurrentPhoto(MutableLiveData<Bitmap> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.currentPhoto = mutableLiveData;
    }

    public final SingleLiveEvent<Boolean> getSavePhotoResult() {
        return this.savePhotoResult;
    }

    public final void setSavePhotoResult(SingleLiveEvent<Boolean> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.savePhotoResult = singleLiveEvent;
    }

    public final SingleLiveEvent<Boolean> getSaveFaceResult() {
        return this.saveFaceResult;
    }

    public final void setSaveFaceResult(SingleLiveEvent<Boolean> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.saveFaceResult = singleLiveEvent;
    }

    public final SingleLiveEvent<Boolean> getSaveBleResult() {
        return this.saveBleResult;
    }

    public final void setSaveBleResult(SingleLiveEvent<Boolean> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.saveBleResult = singleLiveEvent;
    }

    public final SingleLiveEvent<GateStatus> getSaveBleGateResult() {
        return this.saveBleGateResult;
    }

    public final void setSaveBleGateResult(SingleLiveEvent<GateStatus> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.saveBleGateResult = singleLiveEvent;
    }

    public final MutableLiveData<List<BleKeyData>> getBleKeyDataFilterBy() {
        return this.bleKeyDataFilterBy;
    }

    public final void setBleKeyDataFilterBy(MutableLiveData<List<BleKeyData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bleKeyDataFilterBy = mutableLiveData;
    }

    public final MutableLiveData<List<AvailablePassType>> getAvailablePassType() {
        return this.availablePassType;
    }

    public final void setAvailablePassType(MutableLiveData<List<AvailablePassType>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.availablePassType = mutableLiveData;
    }

    public final SingleLiveEvent<FingerIterationAnswer> getIterationResult() {
        return this.iterationResult;
    }

    public final SingleLiveEvent<String> getIterationError() {
        return this.iterationError;
    }

    public final MutableLiveData<List<BleReader>> getBleReaderDataFilterBy() {
        return this.bleReaderDataFilterBy;
    }

    public final void setBleReaderDataFilterBy(MutableLiveData<List<BleReader>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.bleReaderDataFilterBy = mutableLiveData;
    }

    public final MutableLiveData<Integer> getSelectedFingerReader() {
        return this.selectedFingerReader;
    }

    public final void setSelectedFingerReader(MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.selectedFingerReader = mutableLiveData;
    }

    public final MutableLiveData<List<BleKeyData>> getAssignKeys() {
        return this.assignKeys;
    }

    public final void setAssignKeys(MutableLiveData<List<BleKeyData>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.assignKeys = mutableLiveData;
    }

    public final SingleLiveEvent<Pair<BleReader, BleKeyData>> getCurrentBleDevice() {
        return this.currentBleDevice;
    }

    public final SingleLiveEvent<List<BleReader>> getAllBleDevice() {
        return this.allBleDevice;
    }

    public final SingleLiveEvent<List<BleKeyData>> getAllAssignKey() {
        return this.allAssignKey;
    }

    public final MutableLiveData<RequestAccessState> getRequestAccessState() {
        return this.requestAccessState;
    }

    public final void onSaveClick() {
        UserProfile userProfile = this.userData.get();
        this.passRepo.validateAndSaveProfile(userProfile);
        if (!hasAddress()) {
            SingleLiveEvent singleLiveEvent = this.showError;
            Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "showError");
            singleLiveEvent.setValue("Создайте хотя бы один адрес проживания");
        } else if (userValid(userProfile)) {
            this.passRepo.saveCurrent(setGender(userProfile)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$onSaveClick$s$1(this));
        } else {
            SingleLiveEvent singleLiveEvent2 = this.showError;
            Intrinsics.checkNotNullExpressionValue(singleLiveEvent2, "showError");
            singleLiveEvent2.setValue("Заполните все обязательные поля");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile setGender(p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile r10) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0011
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r1 = r10.getUserdata()
            if (r1 == 0) goto L_0x0011
            java.lang.String r1 = r1.getGender()
            if (r1 == 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = r0
        L_0x0012:
            r2 = 2
            r3 = 0
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            java.lang.String r5 = "(this as java.lang.String).toLowerCase()"
            r6 = 0
            if (r1 == 0) goto L_0x0037
            if (r1 == 0) goto L_0x0031
            java.lang.String r7 = r1.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            if (r7 == 0) goto L_0x0037
            java.lang.String r8 = "му"
            boolean r7 = kotlin.text.StringsKt.startsWith$default(r7, r8, r3, r2, r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x0038
        L_0x0031:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x0037:
            r7 = r6
        L_0x0038:
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0041
            java.lang.String r0 = "male"
            goto L_0x005e
        L_0x0041:
            if (r1 == 0) goto L_0x0053
            if (r1 == 0) goto L_0x004d
            java.lang.String r1 = r1.toLowerCase()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            goto L_0x0054
        L_0x004d:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            r10.<init>(r4)
            throw r10
        L_0x0053:
            r1 = r6
        L_0x0054:
            java.lang.String r4 = "жен"
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r1, r4, r3, r2, r6)
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "female"
        L_0x005e:
            if (r10 == 0) goto L_0x0069
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r1 = r10.getUserdata()
            if (r1 == 0) goto L_0x0069
            r1.setGender(r0)
        L_0x0069:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM.setGender(ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile):ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r5.getUserdata();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean userValid(p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000e
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r1 = r5.getUserdata()
            if (r1 == 0) goto L_0x000e
            java.lang.String r1 = r1.getPatronymic()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            int r1 = r1.length()
            if (r1 != 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r1 = 0
            goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            if (r1 != 0) goto L_0x007a
            if (r5 == 0) goto L_0x002e
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r1 = r5.getUserdata()
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r1.getSurname()
            goto L_0x002f
        L_0x002e:
            r1 = r0
        L_0x002f:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x003c
            int r1 = r1.length()
            if (r1 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r1 = 0
            goto L_0x003d
        L_0x003c:
            r1 = 1
        L_0x003d:
            if (r1 != 0) goto L_0x007a
            if (r5 == 0) goto L_0x004c
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r1 = r5.getUserdata()
            if (r1 == 0) goto L_0x004c
            java.lang.String r1 = r1.getName()
            goto L_0x004d
        L_0x004c:
            r1 = r0
        L_0x004d:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x005a
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r1 = 0
            goto L_0x005b
        L_0x005a:
            r1 = 1
        L_0x005b:
            if (r1 != 0) goto L_0x007a
            if (r5 == 0) goto L_0x0069
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r5 = r5.getUserdata()
            if (r5 == 0) goto L_0x0069
            java.lang.String r0 = r5.getEmail()
        L_0x0069:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0076
            int r5 = r0.length()
            if (r5 != 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r5 = 0
            goto L_0x0077
        L_0x0076:
            r5 = 1
        L_0x0077:
            if (r5 != 0) goto L_0x007a
            r2 = 1
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM.userValid(ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0014: MOVE  (r0v6 java.util.Collection) = (r0v5 java.util.List)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private final boolean hasAddress() {
        /*
            r3 = this;
            androidx.lifecycle.MutableLiveData<ru.unicorn.ujin.data.realm.Resource<java.util.List<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress>>> r0 = r3.addressListMutableLiveData
            java.lang.Object r0 = r0.getValue()
            ru.unicorn.ujin.data.realm.Resource r0 = (p035ru.unicorn.ujin.data.realm.Resource) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r0.getData()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x001f
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r2 = 1
        L_0x001f:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM.hasAddress():boolean");
    }

    public final void addAdress(String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        this.passRepo.createAddress(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$addAdress$subscribe$1(this));
    }

    public final void getAdress() {
        this.passRepo.getListAdress().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$getAdress$subscribe$1(this));
    }

    public final void sendPhotoToSever() {
        Bitmap value = this.currentPhoto.getValue();
        if (value != null) {
            PassRepo passRepo2 = this.passRepo;
            Intrinsics.checkNotNullExpressionValue(value, "picture");
            passRepo2.sendFaceData(value).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$sendPhotoToSever$$inlined$let$lambda$1(this), new PassProfileVM$sendPhotoToSever$$inlined$let$lambda$2(this));
        }
    }

    public final void startAddBle(String str) {
        Intrinsics.checkNotNullParameter(str, "sn");
        this.compositeDisposable.add(this.passRepo.enableBleReader(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$startAddBle$1(this), new PassProfileVM$startAddBle$2(this)));
    }

    public final void startScanFinger(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, "sn");
        this.compositeDisposable.add(this.passRepo.sendFingerData(str, i, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$startScanFinger$1(this), new PassProfileVM$startScanFinger$2(this)));
    }

    public final void startScanCard(String str) {
        Intrinsics.checkNotNullParameter(str, "sn");
        this.compositeDisposable.add(this.passRepo.sendCardData(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$startScanCard$1(this), new PassProfileVM$startScanCard$2(this)));
    }

    public final void getMyPassBy(String str) {
        Intrinsics.checkNotNullParameter(str, "passType");
        LocalRepository.getInstance().getData(BleKeyData.class).flatMapIterable(PassProfileVM$getMyPassBy$dataLocal$1.INSTANCE).cast(BleKeyData.class).filter(new PassProfileVM$getMyPassBy$dataLocal$2(str)).filter(PassProfileVM$getMyPassBy$dataLocal$3.INSTANCE).toList().toFlowable().mergeWith(new BleRepo().loadMyPassDevice().filter(PassProfileVM$getMyPassBy$dateRemote$1.INSTANCE).flatMapIterable(PassProfileVM$getMyPassBy$dateRemote$2.INSTANCE).filter(new PassProfileVM$getMyPassBy$dateRemote$3(str)).filter(PassProfileVM$getMyPassBy$dateRemote$4.INSTANCE).toList().toFlowable()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$getMyPassBy$1(this), new PassProfileVM$getMyPassBy$2(this));
    }

    public final void deleteByInterfaceType(String str) {
        Intrinsics.checkNotNullParameter(str, "interfaceType");
        this.compositeDisposable.add(new PassRepo().deleteKey(str).flatMap(PassProfileVM$deleteByInterfaceType$1.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$deleteByInterfaceType$2(this), new PassProfileVM$deleteByInterfaceType$3(this)));
    }

    public final void deleteByInterfaceType(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "sn");
        Intrinsics.checkNotNullParameter(str2, "interfaceType");
        this.compositeDisposable.add(new PassRepo().deleteKey(str, str2).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$deleteByInterfaceType$4(this), new PassProfileVM$deleteByInterfaceType$5(this)));
    }

    public final void getAllAvailableType() {
        this.compositeDisposable.add(this.passRepo.loadAllAvailableSystem().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$getAllAvailableType$1(this), new PassProfileVM$getAllAvailableType$2(this)));
    }

    public final void getAssignKey() {
        this.compositeDisposable.add(this.passRepo.getAssignKey().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$getAssignKey$1(this), new PassProfileVM$getAssignKey$2(this)));
    }

    public final void loadBleBy(String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        this.compositeDisposable.add(new BleRepo().loadBleByInterfaceType(str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$loadBleBy$1(this), new PassProfileVM$loadBleBy$2(this)));
    }

    public final void loadPassDeviceRemote(long j) {
        Maybe<R> flatMap;
        Maybe<R> subscribeOn;
        Maybe<R> observeOn;
        BleRepo bleRepo = new BleRepo();
        Maybe<BleReader> loadBleBySn = bleRepo.loadBleBySn(j);
        if (loadBleBySn != null && (flatMap = loadBleBySn.flatMap(new PassProfileVM$loadPassDeviceRemote$1(bleRepo), PassProfileVM$loadPassDeviceRemote$2.INSTANCE)) != null && (subscribeOn = flatMap.subscribeOn(Schedulers.m6765io())) != null && (observeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread())) != null) {
            Disposable subscribe = observeOn.subscribe((Consumer<? super R>) new PassProfileVM$loadPassDeviceRemote$3(this));
        }
    }

    public final void loadAllBleDevice() {
        this.compositeDisposable.add(new BleRepo().loadBleByInterfaceType(PASS_TYPE.BLE.getType()).toFlowable().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$loadAllBleDevice$1(this)));
    }

    public final void onBarcodeRecieve(String str) {
        Intrinsics.checkNotNullParameter(str, "mobileQR");
        int i = WhenMappings.$EnumSwitchMapping$0[Api.checkMobileQR$default(Api.INSTANCE, str, (CoroutineScope) null, 2, (Object) null).ordinal()];
        if (i == 1) {
            Log.d("TAG", "XXX onBarcodeRecieve VALID");
            Api api = Api.INSTANCE;
            Context context = MainApplication.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "MainApplication.getContext()");
            Api.requestKeyViaInternetAsync$default(api, context, str, this.onRequestKeyViaInternetResult, (CoroutineScope) null, 8, (Object) null);
        } else if (i != 2) {
            Log.d("TAG", "XXX onBarcodeRecieve UNKNOWN");
            this.saveBleGateResult.setValue(GateStatus.ERROR);
        } else {
            Log.d("TAG", "XXX onBarcodeRecieve ALREADY_EXISTS");
            this.saveBleGateResult.setValue(GateStatus.ERROR);
        }
    }

    public final void loadAllAssignKey() {
        Flowable<List<BleKeyData>> subscribeOn;
        Flowable<List<BleKeyData>> observeOn;
        Disposable subscribe;
        Flowable<List<BleKeyData>> loadAssignBleKey = new BleRepo().loadAssignBleKey();
        if (loadAssignBleKey != null && (subscribeOn = loadAssignBleKey.subscribeOn(Schedulers.m6765io())) != null && (observeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe = observeOn.subscribe((Consumer<? super List<BleKeyData>>) new PassProfileVM$loadAllAssignKey$1(this))) != null) {
            this.compositeDisposable.add(subscribe);
        }
    }

    /* renamed from: getRequestAccessListener  reason: collision with other method in class */
    private final PassProfileVM$getRequestAccessListener$1 m8528getRequestAccessListener() {
        return new PassProfileVM$getRequestAccessListener$1(this);
    }

    /* access modifiers changed from: private */
    public final void onRequestAccessStarted() {
        this.requestAccessState.setValue(Started.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final void onRequestAccessResult(Api.RequestAccessResult requestAccessResult) {
        this.requestAccessState.setValue(RequestAccessState.Companion.valueOf(requestAccessResult));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        super.onCleared();
        this.bleKeyDataFilterBy.setValue(null);
        this.userMutableLiveData.setValue(null);
        this.saveBleResult.setValue(null);
        this.saveBleGateResult.setValue(null);
    }

    public final void startObserve() {
        Api api = Api.INSTANCE;
        Context context = MainApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "MainApplication.getContext()");
        api.addRequesterListener(context, getRequestAccessListener());
    }

    public final void removeGateObserve() {
        Api api = Api.INSTANCE;
        Context context = MainApplication.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "MainApplication.getContext()");
        api.removeRequesterListener(context, getRequestAccessListener());
    }

    public final void migrateKey(long j) {
        this.compositeDisposable.add(new BleRepo().loadGateReader().toFlowable().filter(PassProfileVM$migrateKey$1.INSTANCE).map(PassProfileVM$migrateKey$2.INSTANCE).flatMap(new PassProfileVM$migrateKey$3(j)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new PassProfileVM$migrateKey$4(this), PassProfileVM$migrateKey$5.INSTANCE));
    }
}
