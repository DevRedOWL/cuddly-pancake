package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassProfileEditBinding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.ProfileAdress;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonProps;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0014J\b\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020&0)H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020$H\u0002J\b\u0010/\u001a\u00020+H\u0002J\u0012\u00100\u001a\u00020+2\b\u00101\u001a\u0004\u0018\u00010&H\u0016J\u0010\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020$H\u0016J\u001e\u00104\u001a\u00020+2\u0014\u00105\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020807\u0018\u000106H\u0002J\b\u00109\u001a\u00020+H\u0002J\u0018\u0010:\u001a\u00020+2\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020;\u0018\u000106H\u0002J\u0010\u0010<\u001a\u00020+2\u0006\u0010=\u001a\u00020\u001cH\u0002J\u0012\u0010>\u001a\u00020+2\b\u0010?\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010@\u001a\u00020+H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006A"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassEditProfileFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/PassProfileVM;", "Lru/unicorn/databinding/FragmentPassProfileEditBinding;", "()V", "adressSection", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;", "getAdressSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;", "setAdressSection", "(Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/AddressSection;)V", "buttonSection", "Lru/unicorn/ujin/view/activity/navigation/ui/domofonprikamya/ButtonSection;", "getButtonSection", "()Lru/unicorn/ujin/view/activity/navigation/ui/domofonprikamya/ButtonSection;", "setButtonSection", "(Lru/unicorn/ujin/view/activity/navigation/ui/domofonprikamya/ButtonSection;)V", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "sectionedAdapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getSectionedAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "tv", "Landroid/widget/TextView;", "getTv", "()Landroid/widget/TextView;", "setTv", "(Landroid/widget/TextView;)V", "getLayoutRes", "", "getMyToolbarTitle", "", "getTextLabel", "Landroid/view/View;", "id", "initRightButtonList", "Ljava/util/ArrayList;", "initSection", "", "initSectionedAdapter", "onAddAdressClick", "text", "onButtonAddAdressClick", "onCreateView", "root", "onFileChoose", "filePath", "onGetAddressList", "data", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/ProfileAdress;", "onSaveClick", "onSaveProfile", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/ProfileData;", "onTextClick", "v", "onViewCreated", "viewModell", "showToolbar", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassEditProfileFragment */
/* compiled from: PassEditProfileFragment.kt */
public final class PassEditProfileFragment extends BaseBindingFragment<PassProfileVM, FragmentPassProfileEditBinding> {
    private HashMap _$_findViewCache;
    private AddressSection adressSection = new AddressSection(false);
    private ButtonSection buttonSection = new ButtonSection();

    /* renamed from: rv */
    public RecyclerView f6839rv;
    private final SectionedAdapter sectionedAdapter = new SectionedAdapter();

    /* renamed from: tv */
    public TextView f6840tv;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassEditProfileFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 2;
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
        return R.layout.fragment_pass_profile_edit;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    public final RecyclerView getRv() {
        RecyclerView recyclerView = this.f6839rv;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        return recyclerView;
    }

    public final void setRv(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.f6839rv = recyclerView;
    }

    public final TextView getTv() {
        TextView textView = this.f6840tv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        return textView;
    }

    public final void setTv(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f6840tv = textView;
    }

    public final SectionedAdapter getSectionedAdapter() {
        return this.sectionedAdapter;
    }

    public final AddressSection getAdressSection() {
        return this.adressSection;
    }

    public final void setAdressSection(AddressSection addressSection) {
        Intrinsics.checkNotNullParameter(addressSection, "<set-?>");
        this.adressSection = addressSection;
    }

    public final ButtonSection getButtonSection() {
        return this.buttonSection;
    }

    public final void setButtonSection(ButtonSection buttonSection2) {
        Intrinsics.checkNotNullParameter(buttonSection2, "<set-?>");
        this.buttonSection = buttonSection2;
    }

    public void onCreateView(View view) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f6840tv = new TextView(activity);
        }
        initSectionedAdapter();
        initSection();
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassProfileVM passProfileVM) {
        SingleLiveEvent singleLiveEvent;
        MutableLiveData<Resource<List<ProfileAdress>>> addressListMutableLiveData;
        MutableLiveData<Resource<ProfileData>> userMutableLiveData;
        FragmentPassProfileEditBinding fragmentPassProfileEditBinding = (FragmentPassProfileEditBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentPassProfileEditBinding, "viewDataBinding");
        fragmentPassProfileEditBinding.setVm(passProfileVM);
        if (passProfileVM != null) {
            passProfileVM.getAdress();
        }
        if (!(passProfileVM == null || (userMutableLiveData = passProfileVM.getUserMutableLiveData()) == null)) {
            userMutableLiveData.observe(this, new PassEditProfileFragment$onViewCreated$1(this));
        }
        if (!(passProfileVM == null || (addressListMutableLiveData = passProfileVM.getAddressListMutableLiveData()) == null)) {
            addressListMutableLiveData.observe(this, new PassEditProfileFragment$onViewCreated$2(this));
        }
        if (passProfileVM != null && (singleLiveEvent = passProfileVM.showError) != null) {
            singleLiveEvent.observe(this, new PassEditProfileFragment$onViewCreated$3(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onGetAddressList(Resource<List<ProfileAdress>> resource) {
        FragmentActivity activity;
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                this.adressSection.setData(resource.getData());
            } else if (i == 2 && (activity = getActivity()) != null) {
                Intrinsics.checkNotNullExpressionValue(activity, "it");
                MaterialDialog.message$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.label_error), (CharSequence) null, (Function1) null, 6, (Object) null).show();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void onTextClick(TextView textView) {
        if (textView.getId() == 1234) {
            onSaveClick();
        }
        TextView textView2 = this.f6840tv;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        textView2.setOnClickListener((View.OnClickListener) null);
    }

    private final void onSaveClick() {
        ProgressBar progressBar = ((FragmentPassProfileEditBinding) getViewDataBinding()).pbar;
        Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pbar");
        progressBar.setVisibility(0);
        ((PassProfileVM) getViewModell()).onSaveClick();
    }

    /* access modifiers changed from: private */
    public final void onSaveProfile(Resource<ProfileData> resource) {
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[status.ordinal()];
            if (i == 1) {
                popFragment();
            } else if (i == 2) {
                showErrorMessage(resource.getMessage());
                TextView textView = this.f6840tv;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tv");
                }
                textView.setOnClickListener(new PassEditProfileFragment$onSaveProfile$1(this));
            }
        }
    }

    private final ArrayList<View> initRightButtonList() {
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(getTextLabel(1234));
        return arrayList;
    }

    private final View getTextLabel(int i) {
        TextView textView = this.f6840tv;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        textView.setText(getString(R.string.label_ready));
        TextView textView2 = this.f6840tv;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        textView2.setId(i);
        TextView textView3 = this.f6840tv;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        textView3.setTextColor(getResources().getColor(R.color.brandAppSchemaIconColor));
        TextView textView4 = this.f6840tv;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        textView4.setOnClickListener(new PassEditProfileFragment$getTextLabel$1(this));
        TextView textView5 = this.f6840tv;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tv");
        }
        return textView5;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_edit_my_profile);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_edit_my_profile)");
        return string;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().setToolbarRight(initRightButtonList());
    }

    private final void initSectionedAdapter() {
        RecyclerView recyclerView = ((FragmentPassProfileEditBinding) getViewDataBinding()).f6586rv;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "viewDataBinding.rv");
        this.f6839rv = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerView recyclerView2 = this.f6839rv;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.f6839rv;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rv");
        }
        recyclerView3.setAdapter(this.sectionedAdapter);
    }

    private final void initSection() {
        this.sectionedAdapter.addSection(this.adressSection);
        this.sectionedAdapter.addSection(this.buttonSection);
        this.buttonSection.setData(new ButtonProps(getString(R.string.buttton_add_adress)));
        this.buttonSection.getSpecialClicks().subscribe(new PassEditProfileFragment$initSection$1(this));
    }

    /* access modifiers changed from: private */
    public final void onButtonAddAdressClick() {
        this.buttonSection.setData(new ButtonProps(getString(R.string.btn_save_adress)));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog materialDialog = new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null);
            MaterialDialog materialDialog2 = materialDialog;
            DialogInputExtKt.input$default(materialDialog2, (String) null, (Integer) null, (CharSequence) null, (Integer) null, 0, (Integer) null, false, false, new C5907xe69b1dde(this), 255, (Object) null);
            MaterialDialog.positiveButton$default(materialDialog2, Integer.valueOf(R.string.btn_save_adress), (CharSequence) null, (Function1) null, 6, (Object) null);
            MaterialDialog.title$default(materialDialog, Integer.valueOf(R.string.label_your_adress), (String) null, 2, (Object) null);
            materialDialog.show();
        }
    }

    /* access modifiers changed from: private */
    public final void onAddAdressClick(String str) {
        ((PassProfileVM) getViewModell()).addAdress(str);
    }
}
