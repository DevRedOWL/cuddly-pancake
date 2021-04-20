package p035ru.unicorn.ujin.view.fragments.anotherPass;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Building;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.AnotherPassRemoteRepository;
import p035ru.unicorn.ujin.view.fragments.anotherPass.adapters.Contact;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherArchivePassListEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.events.AnotherPassListEvent;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.PassListFilterData;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.PassListRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.AnotherPassResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 q2\u00020\u0001:\u0001qB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020\u000bJ\b\u0010^\u001a\u00020\\H\u0007J\u0010\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020aH\u0007J\u0006\u0010b\u001a\u00020\\J\u000e\u0010b\u001a\u00020\\2\u0006\u0010c\u001a\u00020dJ\n\u0010e\u001a\u0004\u0018\u00010fH\u0002J\u0012\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010`\u001a\u00020dH\u0002J\b\u0010g\u001a\u00020\\H\u0007J\u0006\u0010h\u001a\u00020\\J\u0006\u0010i\u001a\u00020\\J\u000e\u0010j\u001a\u00020\\2\u0006\u0010`\u001a\u00020aJ\b\u0010k\u001a\u00020\\H\u0002J\u0006\u0010l\u001a\u00020\\J\b\u0010m\u001a\u00020\\H\u0002J\u0006\u0010n\u001a\u00020\\J\u0006\u0010o\u001a\u00020\\J\u0006\u0010p\u001a\u00020\\R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001a\u0010%\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00101\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001f\"\u0004\b3\u0010!R \u00104\u001a\b\u0012\u0004\u0012\u00020\u001d0)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\n¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\rR\u001d\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000209080\n¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\rR\u001a\u0010C\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\n¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\rR\u001a\u0010I\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020L0<¢\u0006\b\n\u0000\u001a\u0004\bM\u0010@R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020O0<¢\u0006\b\n\u0000\u001a\u0004\bP\u0010@R\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020L0\n¢\u0006\b\n\u0000\u001a\u0004\bR\u0010\rR\u000e\u0010S\u001a\u00020TX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010U\u001a\u00020V8FX\u0002¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bW\u0010X¨\u0006r"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/AnotherPassViewModel;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "()V", "checkSaveData", "", "getCheckSaveData", "()Z", "setCheckSaveData", "(Z)V", "chooseContactObservable", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/Contact;", "getChooseContactObservable", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "setChooseContactObservable", "(Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;)V", "copyAnotherPassBody", "Lru/unicorn/ujin/view/fragments/anotherPass/request/CreateAnotherPassRequestBody;", "getCopyAnotherPassBody", "()Lru/unicorn/ujin/view/fragments/anotherPass/request/CreateAnotherPassRequestBody;", "setCopyAnotherPassBody", "(Lru/unicorn/ujin/view/fragments/anotherPass/request/CreateAnotherPassRequestBody;)V", "copyAnotherPassBodyDocument", "Lru/unicorn/ujin/view/fragments/anotherPass/request/IdentityDocument;", "getCopyAnotherPassBodyDocument", "()Lru/unicorn/ujin/view/fragments/anotherPass/request/IdentityDocument;", "setCopyAnotherPassBodyDocument", "(Lru/unicorn/ujin/view/fragments/anotherPass/request/IdentityDocument;)V", "copyAnotherPassBodyVehicle", "Lru/unicorn/ujin/view/fragments/anotherPass/request/VehicleData;", "getCopyAnotherPassBodyVehicle", "()Lru/unicorn/ujin/view/fragments/anotherPass/request/VehicleData;", "setCopyAnotherPassBodyVehicle", "(Lru/unicorn/ujin/view/fragments/anotherPass/request/VehicleData;)V", "createAnotherPassBody", "getCreateAnotherPassBody", "setCreateAnotherPassBody", "createAnotherPassBodyDocument", "getCreateAnotherPassBodyDocument", "setCreateAnotherPassBodyDocument", "createAnotherPassBodyDocumentObservable", "Landroidx/databinding/ObservableField;", "getCreateAnotherPassBodyDocumentObservable", "()Landroidx/databinding/ObservableField;", "setCreateAnotherPassBodyDocumentObservable", "(Landroidx/databinding/ObservableField;)V", "createAnotherPassBodyObservable", "getCreateAnotherPassBodyObservable", "setCreateAnotherPassBodyObservable", "createAnotherPassBodyVehicle", "getCreateAnotherPassBodyVehicle", "setCreateAnotherPassBodyVehicle", "createAnotherPassBodyVehicleObservable", "getCreateAnotherPassBodyVehicleObservable", "setCreateAnotherPassBodyVehicleObservable", "createAnotherPassMutableLiveData", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/anotherPass/response/AnotherPassResponse;", "getCreateAnotherPassMutableLiveData", "enterpriseListMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "getEnterpriseListMutableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getAnotherPassMutableLiveData", "getGetAnotherPassMutableLiveData", "hasBuildingTime", "getHasBuildingTime", "setHasBuildingTime", "inviteTextMutableLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getInviteTextMutableLiveData", "isAutoShowing", "setAutoShowing", "myArchivePassListMutableLiveData", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherArchivePassListEvent;", "getMyArchivePassListMutableLiveData", "myPassListMutableLiveData", "Lru/unicorn/ujin/view/fragments/anotherPass/events/AnotherPassListEvent;", "getMyPassListMutableLiveData", "mySearchArchivePassListMutableLiveData", "getMySearchArchivePassListMutableLiveData", "profileLocalRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileLocalRepository;", "remoteRepository", "Lru/unicorn/ujin/view/fragments/AnotherPassRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/AnotherPassRemoteRepository;", "remoteRepository$delegate", "Lkotlin/Lazy;", "changeUserData", "", "contact", "createAnotherPass", "getAnotherPass", "id", "", "getArchivePassList", "search", "", "getBuilding", "Lru/unicorn/ujin/data/realm/Building;", "getEnterpriseList", "getPassList", "initPassBody", "requestText", "saveArrayData", "saveData", "setDefaultTimeForTemporyPass", "setOnetimeStrategy", "setTemporaryStrategy", "updateUserData", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel */
/* compiled from: AnotherPassViewModel.kt */
public final class AnotherPassViewModel extends BaseViewModel {
    public static final String ARCHIVED_NO = "no";
    public static final String ARCHIVED_ONLY = "only";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private boolean checkSaveData;
    private SingleLiveEvent<Contact> chooseContactObservable = new SingleLiveEvent<>();
    public CreateAnotherPassRequestBody copyAnotherPassBody;
    private IdentityDocument copyAnotherPassBodyDocument = new IdentityDocument("", "", "");
    private VehicleData copyAnotherPassBodyVehicle = new VehicleData("", "");
    public CreateAnotherPassRequestBody createAnotherPassBody;
    private IdentityDocument createAnotherPassBodyDocument = new IdentityDocument("", "", "");
    private ObservableField<IdentityDocument> createAnotherPassBodyDocumentObservable = new ObservableField<>();
    private ObservableField<CreateAnotherPassRequestBody> createAnotherPassBodyObservable = new ObservableField<>();
    private VehicleData createAnotherPassBodyVehicle = new VehicleData("", "");
    private ObservableField<VehicleData> createAnotherPassBodyVehicleObservable = new ObservableField<>();
    private final SingleLiveEvent<Resource<AnotherPassResponse>> createAnotherPassMutableLiveData = new SingleLiveEvent<>();
    private final MutableLiveData<List<RentCompany>> enterpriseListMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<Resource<AnotherPassResponse>> getAnotherPassMutableLiveData = new SingleLiveEvent<>();
    private boolean hasBuildingTime;
    private final SingleLiveEvent<UpdateEvent> inviteTextMutableLiveData = new SingleLiveEvent<>();
    private boolean isAutoShowing;
    private final MutableLiveData<AnotherArchivePassListEvent> myArchivePassListMutableLiveData = new MutableLiveData<>();
    private final MutableLiveData<AnotherPassListEvent> myPassListMutableLiveData = new MutableLiveData<>();
    private final SingleLiveEvent<AnotherArchivePassListEvent> mySearchArchivePassListMutableLiveData = new SingleLiveEvent<>();
    private final ProfileLocalRepository profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
    private final Lazy remoteRepository$delegate = LazyKt.lazy(AnotherPassViewModel$remoteRepository$2.INSTANCE);

    public final AnotherPassRemoteRepository getRemoteRepository() {
        return (AnotherPassRemoteRepository) this.remoteRepository$delegate.getValue();
    }

    public AnotherPassViewModel() {
        initPassBody();
        getEnterpriseList();
    }

    public final MutableLiveData<AnotherPassListEvent> getMyPassListMutableLiveData() {
        return this.myPassListMutableLiveData;
    }

    public final MutableLiveData<AnotherArchivePassListEvent> getMyArchivePassListMutableLiveData() {
        return this.myArchivePassListMutableLiveData;
    }

    public final SingleLiveEvent<AnotherArchivePassListEvent> getMySearchArchivePassListMutableLiveData() {
        return this.mySearchArchivePassListMutableLiveData;
    }

    public final SingleLiveEvent<UpdateEvent> getInviteTextMutableLiveData() {
        return this.inviteTextMutableLiveData;
    }

    public final SingleLiveEvent<Resource<AnotherPassResponse>> getCreateAnotherPassMutableLiveData() {
        return this.createAnotherPassMutableLiveData;
    }

    public final MutableLiveData<List<RentCompany>> getEnterpriseListMutableLiveData() {
        return this.enterpriseListMutableLiveData;
    }

    public final CreateAnotherPassRequestBody getCreateAnotherPassBody() {
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBody;
        if (createAnotherPassRequestBody == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        return createAnotherPassRequestBody;
    }

    public final void setCreateAnotherPassBody(CreateAnotherPassRequestBody createAnotherPassRequestBody) {
        Intrinsics.checkNotNullParameter(createAnotherPassRequestBody, "<set-?>");
        this.createAnotherPassBody = createAnotherPassRequestBody;
    }

    public final ObservableField<CreateAnotherPassRequestBody> getCreateAnotherPassBodyObservable() {
        return this.createAnotherPassBodyObservable;
    }

    public final void setCreateAnotherPassBodyObservable(ObservableField<CreateAnotherPassRequestBody> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.createAnotherPassBodyObservable = observableField;
    }

    public final VehicleData getCreateAnotherPassBodyVehicle() {
        return this.createAnotherPassBodyVehicle;
    }

    public final void setCreateAnotherPassBodyVehicle(VehicleData vehicleData) {
        Intrinsics.checkNotNullParameter(vehicleData, "<set-?>");
        this.createAnotherPassBodyVehicle = vehicleData;
    }

    public final ObservableField<VehicleData> getCreateAnotherPassBodyVehicleObservable() {
        return this.createAnotherPassBodyVehicleObservable;
    }

    public final void setCreateAnotherPassBodyVehicleObservable(ObservableField<VehicleData> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.createAnotherPassBodyVehicleObservable = observableField;
    }

    public final IdentityDocument getCreateAnotherPassBodyDocument() {
        return this.createAnotherPassBodyDocument;
    }

    public final void setCreateAnotherPassBodyDocument(IdentityDocument identityDocument) {
        Intrinsics.checkNotNullParameter(identityDocument, "<set-?>");
        this.createAnotherPassBodyDocument = identityDocument;
    }

    public final ObservableField<IdentityDocument> getCreateAnotherPassBodyDocumentObservable() {
        return this.createAnotherPassBodyDocumentObservable;
    }

    public final void setCreateAnotherPassBodyDocumentObservable(ObservableField<IdentityDocument> observableField) {
        Intrinsics.checkNotNullParameter(observableField, "<set-?>");
        this.createAnotherPassBodyDocumentObservable = observableField;
    }

    public final SingleLiveEvent<Contact> getChooseContactObservable() {
        return this.chooseContactObservable;
    }

    public final void setChooseContactObservable(SingleLiveEvent<Contact> singleLiveEvent) {
        Intrinsics.checkNotNullParameter(singleLiveEvent, "<set-?>");
        this.chooseContactObservable = singleLiveEvent;
    }

    public final SingleLiveEvent<Resource<AnotherPassResponse>> getGetAnotherPassMutableLiveData() {
        return this.getAnotherPassMutableLiveData;
    }

    public final boolean getHasBuildingTime() {
        return this.hasBuildingTime;
    }

    public final void setHasBuildingTime(boolean z) {
        this.hasBuildingTime = z;
    }

    public final CreateAnotherPassRequestBody getCopyAnotherPassBody() {
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.copyAnotherPassBody;
        if (createAnotherPassRequestBody == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
        }
        return createAnotherPassRequestBody;
    }

    public final void setCopyAnotherPassBody(CreateAnotherPassRequestBody createAnotherPassRequestBody) {
        Intrinsics.checkNotNullParameter(createAnotherPassRequestBody, "<set-?>");
        this.copyAnotherPassBody = createAnotherPassRequestBody;
    }

    public final VehicleData getCopyAnotherPassBodyVehicle() {
        return this.copyAnotherPassBodyVehicle;
    }

    public final void setCopyAnotherPassBodyVehicle(VehicleData vehicleData) {
        Intrinsics.checkNotNullParameter(vehicleData, "<set-?>");
        this.copyAnotherPassBodyVehicle = vehicleData;
    }

    public final IdentityDocument getCopyAnotherPassBodyDocument() {
        return this.copyAnotherPassBodyDocument;
    }

    public final void setCopyAnotherPassBodyDocument(IdentityDocument identityDocument) {
        Intrinsics.checkNotNullParameter(identityDocument, "<set-?>");
        this.copyAnotherPassBodyDocument = identityDocument;
    }

    public final boolean getCheckSaveData() {
        return this.checkSaveData;
    }

    public final void setCheckSaveData(boolean z) {
        this.checkSaveData = z;
    }

    public final boolean isAutoShowing() {
        return this.isAutoShowing;
    }

    public final void setAutoShowing(boolean z) {
        this.isAutoShowing = z;
    }

    public final void initPassBody() {
        ArrayList arrayList = r2;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = r2;
        ArrayList arrayList4 = new ArrayList();
        CreateAnotherPassRequestBody createAnotherPassRequestBody = r1;
        CreateAnotherPassRequestBody createAnotherPassRequestBody2 = new CreateAnotherPassRequestBody("", "", "", "", "", "", "", "", "", "", "", "", "", "temporary", 0, arrayList, "", arrayList3, "");
        this.createAnotherPassBody = createAnotherPassRequestBody;
        ObservableField<CreateAnotherPassRequestBody> observableField = this.createAnotherPassBodyObservable;
        CreateAnotherPassRequestBody createAnotherPassRequestBody3 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        observableField.set(createAnotherPassRequestBody3);
        this.createAnotherPassBodyVehicle = new VehicleData("", "");
        this.createAnotherPassBodyVehicleObservable.set(this.createAnotherPassBodyVehicle);
        this.createAnotherPassBodyDocument = new IdentityDocument("", "", "");
        this.createAnotherPassBodyDocumentObservable.set(this.createAnotherPassBodyDocument);
        this.chooseContactObservable.setValue(new Contact("", "", "", "", "", "", ""));
        saveData();
        boolean z = false;
        this.checkSaveData = false;
        this.isAutoShowing = false;
        Building building = getBuilding();
        String str = null;
        CharSequence startWorkTime = building != null ? building.getStartWorkTime() : null;
        if (!(startWorkTime == null || StringsKt.isBlank(startWorkTime))) {
            Building building2 = getBuilding();
            if (building2 != null) {
                str = building2.getEndWorkTime();
            }
            CharSequence charSequence = str;
            if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
                z = true;
            }
        }
        this.hasBuildingTime = z;
    }

    private final Building getBuilding() {
        String buildingId;
        Apartment currentApartment = this.profileLocalRepository.getCurrentApartment();
        if (currentApartment == null || (buildingId = currentApartment.getBuildingId()) == null) {
            return null;
        }
        return getBuilding(buildingId);
    }

    private final Building getBuilding(String str) {
        return this.profileLocalRepository.getBuilding(str);
    }

    public final void setTemporaryStrategy() {
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody != null) {
            createAnotherPassRequestBody.setStrategy("temporary");
        }
        this.createAnotherPassBodyObservable.notifyChange();
    }

    public final void setOnetimeStrategy() {
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody != null) {
            createAnotherPassRequestBody.setStrategy("onetime");
            createAnotherPassRequestBody.setDateTo(createAnotherPassRequestBody.getDateFrom());
        }
        this.createAnotherPassBodyObservable.notifyChange();
    }

    public final void changeUserData(Contact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.copyAnotherPassBody;
        if (createAnotherPassRequestBody == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
        }
        String surname = contact.getSurname();
        if (surname == null) {
            surname = "";
        }
        createAnotherPassRequestBody.setSurname(surname);
        CreateAnotherPassRequestBody createAnotherPassRequestBody2 = this.copyAnotherPassBody;
        if (createAnotherPassRequestBody2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
        }
        String name = contact.getName();
        if (name == null) {
            name = contact.getDisplayName();
        }
        if (name == null) {
            name = "";
        }
        createAnotherPassRequestBody2.setName(name);
        CreateAnotherPassRequestBody createAnotherPassRequestBody3 = this.copyAnotherPassBody;
        if (createAnotherPassRequestBody3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
        }
        String patronymic = contact.getPatronymic();
        if (patronymic == null) {
            patronymic = "";
        }
        createAnotherPassRequestBody3.setPatronymic(patronymic);
        CreateAnotherPassRequestBody createAnotherPassRequestBody4 = this.copyAnotherPassBody;
        if (createAnotherPassRequestBody4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
        }
        String phone = contact.getPhone();
        if (phone == null) {
            phone = "";
        }
        createAnotherPassRequestBody4.setPhone(phone);
        CreateAnotherPassRequestBody createAnotherPassRequestBody5 = this.copyAnotherPassBody;
        if (createAnotherPassRequestBody5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
        }
        String email = contact.getEmail();
        if (email == null) {
            email = "";
        }
        createAnotherPassRequestBody5.setEmail(email);
        CreateAnotherPassRequestBody createAnotherPassRequestBody6 = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody6 != null) {
            String surname2 = contact.getSurname();
            if (surname2 == null) {
                surname2 = "";
            }
            createAnotherPassRequestBody6.setSurname(surname2);
        }
        CreateAnotherPassRequestBody createAnotherPassRequestBody7 = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody7 != null) {
            String name2 = contact.getName();
            if (name2 == null) {
                name2 = contact.getDisplayName();
            }
            if (name2 == null) {
                name2 = "";
            }
            createAnotherPassRequestBody7.setName(name2);
        }
        CreateAnotherPassRequestBody createAnotherPassRequestBody8 = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody8 != null) {
            String patronymic2 = contact.getPatronymic();
            if (patronymic2 == null) {
                patronymic2 = "";
            }
            createAnotherPassRequestBody8.setPatronymic(patronymic2);
        }
        CreateAnotherPassRequestBody createAnotherPassRequestBody9 = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody9 != null) {
            String phone2 = contact.getPhone();
            if (phone2 == null) {
                phone2 = "";
            }
            createAnotherPassRequestBody9.setPhone(phone2);
        }
        CreateAnotherPassRequestBody createAnotherPassRequestBody10 = this.createAnotherPassBodyObservable.get();
        if (createAnotherPassRequestBody10 != null) {
            String email2 = contact.getEmail();
            if (email2 == null) {
                email2 = "";
            }
            createAnotherPassRequestBody10.setEmail(email2);
        }
        this.createAnotherPassBodyObservable.notifyChange();
    }

    public final void updateUserData() {
        if (this.copyAnotherPassBody != null && this.checkSaveData) {
            new ArrayList().add(this.copyAnotherPassBodyDocument);
            new ArrayList().add(this.copyAnotherPassBodyVehicle);
            CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody2 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody.setSurname(createAnotherPassRequestBody2.getSurname());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody3 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody3 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody4 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody3.setName(createAnotherPassRequestBody4.getName());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody5 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody5 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody6 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody5.setPatronymic(createAnotherPassRequestBody6.getPatronymic());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody7 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody7 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody8 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody7.setPhone(createAnotherPassRequestBody8.getPhone());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody9 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody9 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody10 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody9.setEmail(createAnotherPassRequestBody10.getEmail());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody11 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody11 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody12 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody11.setCompany(createAnotherPassRequestBody12.getCompany());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody13 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody13 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody14 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody13.setEnterpriseId(createAnotherPassRequestBody14.getEnterpriseId());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody15 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody15 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody16 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody15.setSlotId(createAnotherPassRequestBody16.getSlotId());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody17 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody17 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody18 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody17.setDateFrom(createAnotherPassRequestBody18.getDateFrom());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody19 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody19 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody20 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody19.setDateTo(createAnotherPassRequestBody20.getDateTo());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody21 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody21 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody22 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody21.setTimeFrom(createAnotherPassRequestBody22.getTimeFrom());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody23 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody23 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody24 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody23.setTimeTo(createAnotherPassRequestBody24.getTimeTo());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody25 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody25 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody26 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody26 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody25.setPersonsCount(createAnotherPassRequestBody26.getPersonsCount());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody27 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody27 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody28 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody28 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody27.setComment(createAnotherPassRequestBody28.getComment());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody29 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody29 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody30 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody30 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody29.setStrategy(createAnotherPassRequestBody30.getStrategy());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody31 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody31 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody32 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody32 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody31.setVehicles(createAnotherPassRequestBody32.getVehicles());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody33 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody33 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody34 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody33.setIdentityDocuments(createAnotherPassRequestBody34.getIdentityDocuments());
            }
            CreateAnotherPassRequestBody createAnotherPassRequestBody35 = this.createAnotherPassBodyObservable.get();
            if (createAnotherPassRequestBody35 != null) {
                CreateAnotherPassRequestBody createAnotherPassRequestBody36 = this.copyAnotherPassBody;
                if (createAnotherPassRequestBody36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("copyAnotherPassBody");
                }
                createAnotherPassRequestBody35.setBirthday(createAnotherPassRequestBody36.getBirthday());
            }
            this.createAnotherPassBodyObservable.notifyChange();
            this.checkSaveData = false;
        }
    }

    public final void saveData() {
        saveArrayData();
        this.copyAnotherPassBodyDocument = new IdentityDocument(this.createAnotherPassBodyDocument.getType(), this.createAnotherPassBodyDocument.getNumber(), this.createAnotherPassBodyDocument.getIssuedDate());
        this.copyAnotherPassBodyVehicle = new VehicleData(this.createAnotherPassBodyVehicle.getBrand(), this.createAnotherPassBodyVehicle.getNumber());
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.copyAnotherPassBodyDocument);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.copyAnotherPassBodyVehicle);
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBody;
        if (createAnotherPassRequestBody == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String phone = createAnotherPassRequestBody.getPhone();
        CreateAnotherPassRequestBody createAnotherPassRequestBody2 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String name = createAnotherPassRequestBody2.getName();
        CreateAnotherPassRequestBody createAnotherPassRequestBody3 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String surname = createAnotherPassRequestBody3.getSurname();
        CreateAnotherPassRequestBody createAnotherPassRequestBody4 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String patronymic = createAnotherPassRequestBody4.getPatronymic();
        CreateAnotherPassRequestBody createAnotherPassRequestBody5 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String company = createAnotherPassRequestBody5.getCompany();
        CreateAnotherPassRequestBody createAnotherPassRequestBody6 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String enterpriseId = createAnotherPassRequestBody6.getEnterpriseId();
        CreateAnotherPassRequestBody createAnotherPassRequestBody7 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String slotId = createAnotherPassRequestBody7.getSlotId();
        CreateAnotherPassRequestBody createAnotherPassRequestBody8 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String dateFrom = createAnotherPassRequestBody8.getDateFrom();
        CreateAnotherPassRequestBody createAnotherPassRequestBody9 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String dateTo = createAnotherPassRequestBody9.getDateTo();
        CreateAnotherPassRequestBody createAnotherPassRequestBody10 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String timeFrom = createAnotherPassRequestBody10.getTimeFrom();
        CreateAnotherPassRequestBody createAnotherPassRequestBody11 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String timeTo = createAnotherPassRequestBody11.getTimeTo();
        CreateAnotherPassRequestBody createAnotherPassRequestBody12 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String personsCount = createAnotherPassRequestBody12.getPersonsCount();
        CreateAnotherPassRequestBody createAnotherPassRequestBody13 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String comment = createAnotherPassRequestBody13.getComment();
        CreateAnotherPassRequestBody createAnotherPassRequestBody14 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String strategy = createAnotherPassRequestBody14.getStrategy();
        CreateAnotherPassRequestBody createAnotherPassRequestBody15 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        String email = createAnotherPassRequestBody15.getEmail();
        CreateAnotherPassRequestBody createAnotherPassRequestBody16 = this.createAnotherPassBody;
        if (createAnotherPassRequestBody16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        this.copyAnotherPassBody = new CreateAnotherPassRequestBody(phone, name, surname, patronymic, company, enterpriseId, slotId, dateFrom, dateTo, timeFrom, timeTo, personsCount, comment, strategy, 0, arrayList2, email, arrayList, createAnotherPassRequestBody16.getBirthday());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void saveArrayData() {
        /*
            r7 = this;
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r7.createAnotherPassBody
            java.lang.String r1 = "createAnotherPassBody"
            if (r0 != 0) goto L_0x0009
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0009:
            java.lang.String r0 = r0.getStrategy()
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "(this as java.lang.String).toLowerCase()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.String r2 = "onetime"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x005c
            boolean r0 = r7.isAutoShowing
            if (r0 == 0) goto L_0x005c
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData> r0 = r7.createAnotherPassBodyVehicleObservable
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData) r0
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.getNumber()
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0044
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            goto L_0x0045
        L_0x0044:
            r0 = 1
        L_0x0045:
            if (r0 != 0) goto L_0x005c
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r7.createAnotherPassBody
            if (r0 != 0) goto L_0x004e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x004e:
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData[] r5 = new p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData[r4]
            ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData r6 = r7.createAnotherPassBodyVehicle
            r5[r3] = r6
            java.util.ArrayList r5 = kotlin.collections.CollectionsKt.arrayListOf(r5)
            r0.setVehicles(r5)
            goto L_0x006b
        L_0x005c:
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r7.createAnotherPassBody
            if (r0 != 0) goto L_0x0063
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0063:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0.setVehicles(r5)
        L_0x006b:
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody> r0 = r7.createAnotherPassBodyObservable
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody) r0
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = r0.getBirthday()
            goto L_0x007b
        L_0x007a:
            r0 = r2
        L_0x007b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x0088
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r0 = 0
            goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            if (r0 == 0) goto L_0x00c9
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument> r0 = r7.createAnotherPassBodyDocumentObservable
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = r0.getNumber()
            goto L_0x009b
        L_0x009a:
            r0 = r2
        L_0x009b:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x00a8
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = 0
            goto L_0x00a9
        L_0x00a8:
            r0 = 1
        L_0x00a9:
            if (r0 == 0) goto L_0x00c9
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument> r0 = r7.createAnotherPassBodyDocumentObservable
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x00b9
            java.lang.String r2 = r0.getIssuedDate()
        L_0x00b9:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00c6
            boolean r0 = kotlin.text.StringsKt.isBlank(r2)
            if (r0 == 0) goto L_0x00c4
            goto L_0x00c6
        L_0x00c4:
            r0 = 0
            goto L_0x00c7
        L_0x00c6:
            r0 = 1
        L_0x00c7:
            if (r0 != 0) goto L_0x00ec
        L_0x00c9:
            androidx.databinding.ObservableField<ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument> r0 = r7.createAnotherPassBodyDocumentObservable
            java.lang.Object r0 = r0.get()
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r0 = (p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument) r0
            if (r0 == 0) goto L_0x00d8
            java.lang.String r2 = "russian_federation_passport"
            r0.setType(r2)
        L_0x00d8:
            ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody r0 = r7.createAnotherPassBody
            if (r0 != 0) goto L_0x00df
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00df:
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument[] r1 = new p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument[r4]
            ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument r2 = r7.createAnotherPassBodyDocument
            r1[r3] = r2
            java.util.ArrayList r1 = kotlin.collections.CollectionsKt.arrayListOf(r1)
            r0.setIdentityDocuments(r1)
        L_0x00ec:
            return
        L_0x00ed:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel.saveArrayData():void");
    }

    public final void getPassList() {
        PassListRequestBody passListRequestBody = new PassListRequestBody(new PassListFilterData("no"), "");
        this.compositeDisposable.add(getRemoteRepository().getMyPassListSubject().subscribe(new AnotherPassViewModel$getPassList$1(this)));
        this.showLoader.postValue(true);
        getRemoteRepository().getPassList(passListRequestBody);
    }

    public final void getArchivePassList() {
        PassListRequestBody passListRequestBody = new PassListRequestBody(new PassListFilterData(ARCHIVED_ONLY), "");
        this.compositeDisposable.add(getRemoteRepository().getMyArchivePassListSubject().subscribe(new AnotherPassViewModel$getArchivePassList$1(this)));
        this.showLoader.postValue(true);
        getRemoteRepository().getArchivePassList(passListRequestBody);
    }

    public final void getArchivePassList(String str) {
        Intrinsics.checkNotNullParameter(str, "search");
        PassListRequestBody passListRequestBody = new PassListRequestBody(new PassListFilterData(ARCHIVED_ONLY), str);
        this.compositeDisposable.add(getRemoteRepository().getMyArchivePassListSubject().subscribe(new AnotherPassViewModel$getArchivePassList$2(this)));
        this.showLoader.postValue(true);
        getRemoteRepository().getArchivePassList(passListRequestBody);
    }

    public final void createAnotherPass() {
        saveArrayData();
        setDefaultTimeForTemporyPass();
        AnotherPassRemoteRepository remoteRepository = getRemoteRepository();
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBody;
        if (createAnotherPassRequestBody == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        remoteRepository.createAnotherPass(createAnotherPassRequestBody).doOnSubscribe(new AnotherPassViewModel$createAnotherPass$1(this)).doOnTerminate(new AnotherPassViewModel$createAnotherPass$2(this)).doOnError(new AnotherPassViewModel$createAnotherPass$3(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnotherPassViewModel$createAnotherPass$4(this));
    }

    private final void setDefaultTimeForTemporyPass() {
        CreateAnotherPassRequestBody createAnotherPassRequestBody = this.createAnotherPassBody;
        if (createAnotherPassRequestBody == null) {
            Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
        }
        if (Intrinsics.areEqual((Object) createAnotherPassRequestBody.getStrategy(), (Object) "temporary")) {
            CreateAnotherPassRequestBody createAnotherPassRequestBody2 = this.createAnotherPassBody;
            if (createAnotherPassRequestBody2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
            }
            createAnotherPassRequestBody2.setTimeFrom("00:00");
            CreateAnotherPassRequestBody createAnotherPassRequestBody3 = this.createAnotherPassBody;
            if (createAnotherPassRequestBody3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("createAnotherPassBody");
            }
            createAnotherPassRequestBody3.setTimeTo("23:59");
        }
    }

    public final void getAnotherPass(int i) {
        getRemoteRepository().getAnotherPass(i).doOnSubscribe(new AnotherPassViewModel$getAnotherPass$1(this)).doOnTerminate(new AnotherPassViewModel$getAnotherPass$2(this)).doOnError(new AnotherPassViewModel$getAnotherPass$3(this)).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnotherPassViewModel$getAnotherPass$4(this));
    }

    public final void getEnterpriseList() {
        getRemoteRepository().getEnterpriseList().doOnError(new AnotherPassViewModel$getEnterpriseList$1(this)).filter(AnotherPassViewModel$getEnterpriseList$2.INSTANCE).flatMapIterable(AnotherPassViewModel$getEnterpriseList$3.INSTANCE).cast(RentCompany.class).filter(AnotherPassViewModel$getEnterpriseList$4.INSTANCE).toList().subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new AnotherPassViewModel$getEnterpriseList$5(this));
    }

    public final void requestText(int i) {
        this.compositeDisposable.add(getRemoteRepository().getInviteTextSubject().subscribe(new AnotherPassViewModel$requestText$1(this)));
        this.showLoader.postValue(true);
        getRemoteRepository().requestInviteText(i);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/AnotherPassViewModel$Companion;", "", "()V", "ARCHIVED_NO", "", "ARCHIVED_ONLY", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel$Companion */
    /* compiled from: AnotherPassViewModel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
