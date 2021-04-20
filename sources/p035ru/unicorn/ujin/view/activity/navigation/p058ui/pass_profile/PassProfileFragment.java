package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassProfileBinding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0014J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0012\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u001e\u0010&\u001a\u00020 2\u0014\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)\u0018\u00010(H\u0002J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassProfileBinding;", "()V", "adressSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressInfoSection;", "getAdressSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressInfoSection;", "setAdressSection", "(Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressInfoSection;)V", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "sectionedAdapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getSectionedAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getImageIcon", "Landroid/view/View;", "res", "", "id", "getLayoutRes", "getMyToolbarTitle", "", "initRightButtonList", "Ljava/util/ArrayList;", "initSection", "", "initSectionedAdapter", "onCreateView", "root", "onFileChoose", "filePath", "onGetAddressList", "data", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "onIconClick", "v", "onViewCreated", "viewModell", "showExitDialog", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileFragment */
/* compiled from: PassProfileFragment.kt */
public final class PassProfileFragment extends BaseBindingFragment<PassProfileVM, FragmentPassProfileBinding> {
    private HashMap _$_findViewCache;
    private AddressInfoSection adressSection = new AddressInfoSection();

    /* renamed from: rv */
    public RecyclerView f6841rv;
    private final SectionedAdapter sectionedAdapter = new SectionedAdapter();

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_pass_profile;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final RecyclerView getRv() {
        RecyclerView recyclerView = this.f6841rv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        return recyclerView;
    }

    public final void setRv(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.f6841rv = recyclerView;
    }

    public final SectionedAdapter getSectionedAdapter() {
        return this.sectionedAdapter;
    }

    public final AddressInfoSection getAdressSection() {
        return this.adressSection;
    }

    public final void setAdressSection(AddressInfoSection addressInfoSection) {
        Intrinsics.checkNotNullParameter(addressInfoSection, "<set-?>");
        this.adressSection = addressInfoSection;
    }

    public void onCreateView(View view) {
        initSectionedAdapter();
        initSection();
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        MutableLiveData<Resource<List<ProfileAdress>>> addressListMutableLiveData;
        FragmentPassProfileBinding fragmentPassProfileBinding = (FragmentPassProfileBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentPassProfileBinding, "viewDataBinding");
        fragmentPassProfileBinding.setVm(passProfileVM);
        if (passProfileVM != null && (addressListMutableLiveData = passProfileVM.getAddressListMutableLiveData()) != null) {
            addressListMutableLiveData.observe(this, new PassProfileFragment$onViewCreated$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onGetAddressList(Resource<List<ProfileAdress>> resource) {
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null && WhenMappings.$EnumSwitchMapping$0[status.ordinal()] == 1) {
            this.adressSection.setData(resource.getData());
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().setToolbarRight(initRightButtonList());
    }

    private final ArrayList<View> initRightButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(getImageIcon(R.drawable.profile_edit, 456));
        arrayList.add(getImageIcon(R.drawable.profile_exit, 123));
        return arrayList;
    }

    private final View getImageIcon(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(60, 0, 0, 0);
        ImageView imageView = new ImageView(getActivity());
        imageView.setImageResource(i);
        imageView.setId(i2);
        imageView.setLayoutParams(layoutParams);
        imageView.setOnClickListener(new PassProfileFragment$getImageIcon$1(this));
        return imageView;
    }

    /* access modifiers changed from: private */
    public final void onIconClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == 123) {
            showExitDialog();
        } else if (valueOf != null && valueOf.intValue() == 456) {
            nextFragment(new PassEditProfileFragment(), false);
        }
    }

    private final void showExitDialog() {
        new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.profileLogoutDialogTitle)).setMessage((CharSequence) getString(R.string.profileAreYouSureToLogout)).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new PassProfileFragment$showExitDialog$1(this)).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) PassProfileFragment$showExitDialog$2.INSTANCE).create().show();
    }

    private final void initSectionedAdapter() {
        RecyclerView recyclerView = ((FragmentPassProfileBinding) getViewDataBinding()).f6585rv;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "viewDataBinding.rv");
        this.f6841rv = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView2 = this.f6841rv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.f6841rv;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        recyclerView3.setAdapter(this.sectionedAdapter);
    }

    private final void initSection() {
        if (!this.sectionedAdapter.contains(this.adressSection).booleanValue()) {
            this.sectionedAdapter.addSection(this.adressSection);
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_my_profile);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_my_profile)");
        return string;
    }
}
