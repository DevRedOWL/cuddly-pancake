package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.Flavors;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Pass;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassIn;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020\fJ\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001eJ\u000e\u0010/\u001a\u00020-2\u0006\u00100\u001a\u00020#J\u0006\u00101\u001a\u00020-J\u0006\u00102\u001a\u00020-J\u0006\u00103\u001a\u00020-J\u0006\u00104\u001a\u00020-J\u0006\u00105\u001a\u00020-J\b\u00106\u001a\u000207H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R#\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00050\u00130\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0016\"\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001a\"\u0004\b)\u0010*¨\u00068"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/CoronaViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "addressListMutable", "Landroidx/lifecycle/MutableLiveData;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "getAddressListMutable", "()Landroidx/lifecycle/MutableLiveData;", "addressRepo", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/AddressRepo;", "createPassDTO", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/CreatePassDTO;", "getCreatePassDTO", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/CreatePassDTO;", "setCreatePassDTO", "(Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/CreatePassDTO;)V", "createPassMutable", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "getCreatePassMutable", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "currentAddress", "Landroidx/databinding/ObservableField;", "getCurrentAddress", "()Landroidx/databinding/ObservableField;", "passDetailMutable", "getPassDetailMutable", "passListMutable", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassIn;", "getPassListMutable", "passRepo", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/PassRepo;", "qrCOde", "", "getQrCOde", "setQrCOde", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "tempPass", "getTempPass", "setTempPass", "(Landroidx/databinding/ObservableField;)V", "createTemporyPass", "currentPass", "", "pass", "getBarcode", "id", "getCurrentPass", "getCurrentPassDetail", "getPassList", "onCreteClick", "onSendToMailClick", "valid", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaViewModel */
/* compiled from: CoronaViewModel.kt */
public final class CoronaViewModel extends BaseViewModel {
    private final MutableLiveData<List<ProfileAdress>> addressListMutable = new MutableLiveData<>();
    private final AddressRepo addressRepo = new AddressRepo();
    public CreatePassDTO createPassDTO;
    private final SingleLiveEvent<Resource<Pass>> createPassMutable = new SingleLiveEvent<>();
    private final ObservableField<ProfileAdress> currentAddress = new ObservableField<>();
    private final SingleLiveEvent<Resource<Pass>> passDetailMutable = new SingleLiveEvent<>();
    private final MutableLiveData<Resource<List<PassIn>>> passListMutable = new MutableLiveData<>();
    /* access modifiers changed from: private */
    public final PassRepo passRepo = new PassRepo();
    private SingleLiveEvent<String> qrCOde = new SingleLiveEvent<>();
    private ObservableField<CreatePassDTO> tempPass = new ObservableField<>();

    public CoronaViewModel() {
        this.addressRepo.getListAdressAny().filter(CoronaViewModel$subscribe$1.INSTANCE).map(CoronaViewModel$subscribe$2.INSTANCE).filter(CoronaViewModel$subscribe$3.INSTANCE).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new CoronaViewModel$subscribe$4(this));
    }

    public final MutableLiveData<Resource<List<PassIn>>> getPassListMutable() {
        return this.passListMutable;
    }

    public final MutableLiveData<List<ProfileAdress>> getAddressListMutable() {
        return this.addressListMutable;
    }

    public final SingleLiveEvent<Resource<Pass>> getCreatePassMutable() {
        return this.createPassMutable;
    }

    public final SingleLiveEvent<Resource<Pass>> getPassDetailMutable() {
        return this.passDetailMutable;
    }

    public final ObservableField<ProfileAdress> getCurrentAddress() {
        return this.currentAddress;
    }

    public final SingleLiveEvent<String> getQrCOde() {
        return this.qrCOde;
    }

    public final void setQrCOde(SingleLiveEvent<String> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.qrCOde = singleLiveEvent;
    }

    public final ObservableField<CreatePassDTO> getTempPass() {
        return this.tempPass;
    }

    public final void setTempPass(ObservableField<CreatePassDTO> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.tempPass = observableField;
    }

    public final CreatePassDTO getCreatePassDTO() {
        CreatePassDTO createPassDTO2 = this.createPassDTO;
        if (createPassDTO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createPassDTO");
        }
        return createPassDTO2;
    }

    public final void setCreatePassDTO(CreatePassDTO createPassDTO2) {
        Intrinsics.checkNotNullParameter(createPassDTO2, "<set-?>");
        this.createPassDTO = createPassDTO2;
    }

    public final void getPassList() {
        this.passRepo.getPassList().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new CoronaViewModel$getPassList$subscribe$1(this));
    }

    public final void currentPass(PassIn passIn) {
        Intrinsics.checkNotNullParameter(passIn, Flavors.PASS);
        this.passRepo.setCurrentPass(passIn);
        getCurrentPass();
    }

    public final void getCurrentPass() {
        PassIn currentPass = this.passRepo.getCurrentPass();
        if (currentPass != null) {
            Disposable subscribe = this.passRepo.getPassById(currentPass.getId()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new CoronaViewModel$getCurrentPass$$inlined$let$lambda$1(this));
            if (subscribe != null) {
                this.compositeDisposable.add(subscribe);
            }
        }
    }

    public final void getCurrentPassDetail() {
        this.passDetailMutable.setValue(Resource.success(0, "", this.passRepo.getCurrentPassDetail()));
    }

    public final CreatePassDTO createTemporyPass() {
        this.createPassDTO = this.passRepo.generateTemPass();
        ObservableField<CreatePassDTO> observableField = this.tempPass;
        CreatePassDTO createPassDTO2 = this.createPassDTO;
        if (createPassDTO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createPassDTO");
        }
        observableField.set(createPassDTO2);
        CreatePassDTO createPassDTO3 = this.createPassDTO;
        if (createPassDTO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createPassDTO");
        }
        return createPassDTO3;
    }

    public final void onCreteClick() {
        if (valid()) {
            this.passRepo.createPass(this.tempPass, this.currentAddress).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new CoronaViewModel$onCreteClick$subscribe$1(this));
            return;
        }
        SingleLiveEvent singleLiveEvent = this.showError;
        Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "showError");
        singleLiveEvent.setValue("Заполните обязательные поля");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r0.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean valid() {
        /*
            r4 = this;
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO> r0 = r4.tempPass
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO) r0
            r1 = 0
            if (r0 == 0) goto L_0x0018
            androidx.databinding.ObservableField r0 = r0.getText()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 != 0) goto L_0x0075
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.ProfileAdress> r0 = r4.currentAddress
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0075
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO> r0 = r4.tempPass
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO) r0
            if (r0 == 0) goto L_0x004a
            androidx.databinding.ObservableField r0 = r0.getTimeAsText()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x004b
        L_0x004a:
            r0 = r1
        L_0x004b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0058
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r0 = 0
            goto L_0x0059
        L_0x0058:
            r0 = 1
        L_0x0059:
            if (r0 != 0) goto L_0x0075
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO> r0 = r4.tempPass
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.activity.navigation.ui.corona.model.CreatePassDTO r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.CreatePassDTO) r0
            if (r0 == 0) goto L_0x0072
            androidx.databinding.ObservableField r0 = r0.getTimeInMillis()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r0.get()
            r1 = r0
            java.lang.Long r1 = (java.lang.Long) r1
        L_0x0072:
            if (r1 == 0) goto L_0x0075
            r2 = 1
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.CoronaViewModel.valid():boolean");
    }

    public final void onSendToMailClick() {
        this.passRepo.sendToMail().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new CoronaViewModel$onSendToMailClick$subscribe$1(this), new CoronaViewModel$onSendToMailClick$subscribe$2(this));
    }

    public final void getBarcode(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.compositeDisposable.add(this.passRepo.loadQrCode(str).doOnNext(new CoronaViewModel$getBarcode$1(str)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new CoronaViewModel$getBarcode$2(this), new CoronaViewModel$getBarcode$3(this)));
    }
}
