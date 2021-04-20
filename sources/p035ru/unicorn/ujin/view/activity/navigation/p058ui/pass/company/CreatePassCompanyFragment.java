package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentCoronaCreateCompanyBinding;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.WrapContentLinearLayoutManager;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CompanyListUno;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p035ru.unicorn.ujin.view.fragments.base.attach.section.ShowAttachSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\nH\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\u0018\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0012\u0010 \u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010!H\u0002J\u0012\u0010\"\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0014J \u0010$\u001a\u00020\u00152\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020!0&j\b\u0012\u0004\u0012\u00020!`'H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/CreatePassCompanyFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM;", "Lru/unicorn/databinding/FragmentCoronaCreateCompanyBinding;", "()V", "mAdapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getMAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "mode", "", "showAttach", "Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;", "getShowAttach", "()Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;", "setShowAttach", "(Lru/unicorn/ujin/view/fragments/base/attach/section/ShowAttachSection;)V", "getLayoutRes", "", "getMyToolbarTitle", "initAdapter", "", "initSection", "onCreateCompanyResult", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/CompanyListUno;", "onCreateView", "root", "Landroid/view/View;", "onFileChoose", "filePath", "onRemoveAttachClick", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "onViewCreated", "viewModell", "showAttaches", "files", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "showSuccessMessage", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CreatePassCompanyFragment */
/* compiled from: CreatePassCompanyFragment.kt */
public final class CreatePassCompanyFragment extends BaseBindingFragment<PassCompanyVM, FragmentCoronaCreateCompanyBinding> {
    private HashMap _$_findViewCache;
    private final SectionedAdapter mAdapter = new SectionedAdapter();
    /* access modifiers changed from: private */
    public String mode = PassCompanyVM.Companion.getINN();
    private ShowAttachSection showAttach = new ShowAttachSection();

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.CreatePassCompanyFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[Resource.Status.SUCCESS.ordinal()] = 1;
            $EnumSwitchMapping$0[Resource.Status.ERROR.ordinal()] = 2;
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
        return R.layout.fragment_corona_create_company;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ShowAttachSection getShowAttach() {
        return this.showAttach;
    }

    public final void setShowAttach(ShowAttachSection showAttachSection) {
        Intrinsics.checkNotNullParameter(showAttachSection, "<set-?>");
        this.showAttach = showAttachSection;
    }

    public final SectionedAdapter getMAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(PassCompanyVM passCompanyVM) {
        MutableLiveData<Boolean> showLoader;
        MutableLiveData<HashSet<AttachablePreview>> attachesLiveData;
        SingleLiveEvent<Resource<CompanyListUno>> createCompanyResult;
        FragmentCoronaCreateCompanyBinding fragmentCoronaCreateCompanyBinding = (FragmentCoronaCreateCompanyBinding) getViewDataBinding();
        Intrinsics.checkNotNullExpressionValue(fragmentCoronaCreateCompanyBinding, "viewDataBinding");
        fragmentCoronaCreateCompanyBinding.setVm(passCompanyVM);
        if (!(passCompanyVM == null || (createCompanyResult = passCompanyVM.getCreateCompanyResult()) == null)) {
            createCompanyResult.observe(getViewLifecycleOwner(), new CreatePassCompanyFragment$onViewCreated$1(this));
        }
        if (!(passCompanyVM == null || (attachesLiveData = passCompanyVM.getAttachesLiveData()) == null)) {
            attachesLiveData.observe(getViewLifecycleOwner(), new CreatePassCompanyFragment$onViewCreated$2(this));
        }
        if (!(passCompanyVM == null || (showLoader = passCompanyVM.getShowLoader()) == null)) {
            showLoader.observe(getViewLifecycleOwner(), new CreatePassCompanyFragment$onViewCreated$3(this));
        }
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnAddINN)).setOnClickListener(new CreatePassCompanyFragment$onViewCreated$4(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnAddOGRN)).setOnClickListener(new CreatePassCompanyFragment$onViewCreated$5(this));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.btnAddRent)).setOnClickListener(new CreatePassCompanyFragment$onViewCreated$6(this));
        initAdapter();
        initSection();
    }

    public void onCreateView(View view) {
        super.onCreateView(view);
        this.f6913pb = view != null ? (ProgressBar) view.findViewById(R.id.pb) : null;
    }

    private final void initSection() {
        if (!this.mAdapter.getSections().contains(this.showAttach)) {
            this.mAdapter.addSection(this.showAttach);
            this.showAttach.getOnClickSubject().subscribe(new CreatePassCompanyFragment$initSection$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onRemoveAttachClick(AttachablePreview attachablePreview) {
        PassCompanyVM passCompanyVM;
        if (attachablePreview != null && (passCompanyVM = (PassCompanyVM) getViewModell()) != null) {
            passCompanyVM.removeFile(attachablePreview);
        }
    }

    private final void initAdapter() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDocuments);
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(getActivity()));
        recyclerView.setAdapter(this.mAdapter);
    }

    /* access modifiers changed from: private */
    public final void showAttaches(HashSet<AttachablePreview> hashSet) {
        this.showAttach.setData(CollectionsKt.toList(hashSet));
    }

    /* access modifiers changed from: private */
    public final void onCreateCompanyResult(Resource<CompanyListUno> resource) {
        Resource.Status status = resource != null ? resource.getStatus() : null;
        if (status != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                showSuccessMessage();
            } else if (i == 2) {
                showMessage(resource.getMessage());
            }
        }
    }

    private final void showSuccessMessage() {
        new AlertDialog.Builder(getBaseActivity()).setMessage((int) R.string.label_create_success).setPositiveButton((int) R.string.button_OK, (DialogInterface.OnClickListener) new CreatePassCompanyFragment$showSuccessMessage$1(this)).show();
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_new_company);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_new_company)");
        return string;
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        ((PassCompanyVM) getViewModell()).attachFile(str, this.mode);
    }
}
