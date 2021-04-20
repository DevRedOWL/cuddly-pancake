package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import com.karumi.dexter.Dexter;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.FragmentShowRecordBinding;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.base.attach.section.DownLoadAttachSection;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.RevokeIn;
import p035ru.unicorn.ujin.view.service.DownloadService;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 B2\u00020\u0001:\u0001BB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020\u0014J\b\u0010%\u001a\u00020&H\u0014J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000200H\u0002J\u000e\u00104\u001a\u0002002\u0006\u00105\u001a\u000206J\u0018\u00107\u001a\u0002002\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109H\u0002J\u001a\u0010;\u001a\u0002002\u0006\u0010<\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0016\u0010=\u001a\u0002002\f\u0010>\u001a\b\u0012\u0004\u0012\u0002020?H\u0002J\b\u0010@\u001a\u000200H\u0014J\u0010\u0010A\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006C"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/ShowRecordFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "adapter", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "getAdapter", "()Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;", "setAdapter", "(Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/SectionedAdapter;)V", "binding", "Lru/unicorn/databinding/FragmentShowRecordBinding;", "getBinding", "()Lru/unicorn/databinding/FragmentShowRecordBinding;", "setBinding", "(Lru/unicorn/databinding/FragmentShowRecordBinding;)V", "downloadSection", "Lru/unicorn/ujin/view/fragments/base/attach/section/DownLoadAttachSection;", "getDownloadSection", "()Lru/unicorn/ujin/view/fragments/base/attach/section/DownLoadAttachSection;", "position", "", "revokeBtn", "Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "getRevokeBtn", "()Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;", "setRevokeBtn", "(Lru/unicorn/ujin/view/customViews/DynamicBackgroundButton;)V", "sectionedAdapter", "getSectionedAdapter", "setSectionedAdapter", "vm", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "getVm", "()Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "setVm", "(Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;)V", "getLayoutRes", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDownloadClick", "", "file", "Lru/unicorn/ujin/data/realm/FileData;", "onRevokeClick", "onRevokeDialogResult", "success", "", "onRevokeResult", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/RevokeIn;", "onViewCreated", "view", "showFileList", "fileList", "Lio/realm/RealmList;", "showToolbar", "startDownload", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ShowRecordFragment */
/* compiled from: ShowRecordFragment.kt */
public final class ShowRecordFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private SectionedAdapter adapter = new SectionedAdapter();
    public FragmentShowRecordBinding binding;
    private final DownLoadAttachSection downloadSection = new DownLoadAttachSection();
    /* access modifiers changed from: private */
    public int position;
    public DynamicBackgroundButton revokeBtn;
    private SectionedAdapter sectionedAdapter = new SectionedAdapter();

    /* renamed from: vm */
    public RecordsViewModel f6925vm;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ShowRecordFragment$WhenMappings */
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

    public final int getLayoutRes() {
        return R.layout.fragment_show_record;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final DynamicBackgroundButton getRevokeBtn() {
        DynamicBackgroundButton dynamicBackgroundButton = this.revokeBtn;
        if (dynamicBackgroundButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("revokeBtn");
        }
        return dynamicBackgroundButton;
    }

    public final void setRevokeBtn(DynamicBackgroundButton dynamicBackgroundButton) {
        Intrinsics.checkNotNullParameter(dynamicBackgroundButton, "<set-?>");
        this.revokeBtn = dynamicBackgroundButton;
    }

    public final RecordsViewModel getVm() {
        RecordsViewModel recordsViewModel = this.f6925vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        return recordsViewModel;
    }

    public final void setVm(RecordsViewModel recordsViewModel) {
        Intrinsics.checkNotNullParameter(recordsViewModel, "<set-?>");
        this.f6925vm = recordsViewModel;
    }

    public final FragmentShowRecordBinding getBinding() {
        FragmentShowRecordBinding fragmentShowRecordBinding = this.binding;
        if (fragmentShowRecordBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return fragmentShowRecordBinding;
    }

    public final void setBinding(FragmentShowRecordBinding fragmentShowRecordBinding) {
        Intrinsics.checkNotNullParameter(fragmentShowRecordBinding, "<set-?>");
        this.binding = fragmentShowRecordBinding;
    }

    public final SectionedAdapter getSectionedAdapter() {
        return this.sectionedAdapter;
    }

    public final void setSectionedAdapter(SectionedAdapter sectionedAdapter2) {
        Intrinsics.checkNotNullParameter(sectionedAdapter2, "<set-?>");
        this.sectionedAdapter = sectionedAdapter2;
    }

    public final DownLoadAttachSection getDownloadSection() {
        return this.downloadSection;
    }

    public final SectionedAdapter getAdapter() {
        return this.adapter;
    }

    public final void setAdapter(SectionedAdapter sectionedAdapter2) {
        Intrinsics.checkNotNullParameter(sectionedAdapter2, "<set-?>");
        this.adapter = sectionedAdapter2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        if (inflate != null) {
            ViewGroup viewGroup2 = (ViewGroup) inflate;
            ViewDataBinding inflate2 = DataBindingUtil.inflate(layoutInflater, getLayoutRes(), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "DataBindingUtil.inflate(…tRes(), container, false)");
            this.binding = (FragmentShowRecordBinding) inflate2;
            FragmentShowRecordBinding fragmentShowRecordBinding = this.binding;
            if (fragmentShowRecordBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            View root = fragmentShowRecordBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.root");
            View findViewById = root.findViewById(C5619R.C5622id.fourth);
            Intrinsics.checkNotNullExpressionValue(findViewById, "binding.root.fourth");
            TextView textView = (TextView) findViewById.findViewById(C5619R.C5622id.subtitle);
            Intrinsics.checkNotNullExpressionValue(textView, "binding.root.fourth.subtitle");
            textView.setMaxLines(Integer.MAX_VALUE);
            FragmentShowRecordBinding fragmentShowRecordBinding2 = this.binding;
            if (fragmentShowRecordBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            View root2 = fragmentShowRecordBinding2.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "binding.root");
            View findViewById2 = root2.findViewById(C5619R.C5622id.fourth);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "binding.root.fourth");
            TextView textView2 = (TextView) findViewById2.findViewById(C5619R.C5622id.subtitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.root.fourth.subtitle");
            textView2.setEllipsize((TextUtils.TruncateAt) null);
            FragmentShowRecordBinding fragmentShowRecordBinding3 = this.binding;
            if (fragmentShowRecordBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            fragmentShowRecordBinding3.nextBtn.setOnClickListener(new ShowRecordFragment$onCreateView$1(this));
            FragmentShowRecordBinding fragmentShowRecordBinding4 = this.binding;
            if (fragmentShowRecordBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            return fragmentShowRecordBinding4.getRoot();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* access modifiers changed from: private */
    public final void onRevokeClick() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.negativeButton$default(MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.label_revoke_record), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_yes), (CharSequence) null, new ShowRecordFragment$onRevokeClick$$inlined$let$lambda$1(this), 2, (Object) null), Integer.valueOf(R.string.button_no), (CharSequence) null, ShowRecordFragment$onRevokeClick$1$2.INSTANCE, 2, (Object) null).show();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        RealmList<FileData> attachments;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(RecordsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(th…rdsViewModel::class.java)");
        this.f6925vm = (RecordsViewModel) viewModel;
        FragmentShowRecordBinding fragmentShowRecordBinding = this.binding;
        if (fragmentShowRecordBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        RecordsViewModel recordsViewModel = this.f6925vm;
        if (recordsViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        fragmentShowRecordBinding.setVm(recordsViewModel);
        FragmentShowRecordBinding fragmentShowRecordBinding2 = this.binding;
        if (fragmentShowRecordBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        fragmentShowRecordBinding2.setIsEditMode(false);
        if (getArguments() != null) {
            if (this.position == 0) {
                FragmentShowRecordBinding fragmentShowRecordBinding3 = this.binding;
                if (fragmentShowRecordBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                DynamicBackgroundButton dynamicBackgroundButton = fragmentShowRecordBinding3.nextBtn;
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "binding.nextBtn");
                dynamicBackgroundButton.setVisibility(0);
            } else {
                FragmentShowRecordBinding fragmentShowRecordBinding4 = this.binding;
                if (fragmentShowRecordBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                DynamicBackgroundButton dynamicBackgroundButton2 = fragmentShowRecordBinding4.nextBtn;
                Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton2, "binding.nextBtn");
                dynamicBackgroundButton2.setVisibility(4);
            }
        }
        FragmentShowRecordBinding fragmentShowRecordBinding5 = this.binding;
        if (fragmentShowRecordBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        RecyclerView recyclerView = fragmentShowRecordBinding5.rvFileList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(this.sectionedAdapter);
        RecordsViewModel recordsViewModel2 = this.f6925vm;
        if (recordsViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        Appointment appointment = recordsViewModel2.getAppointment().get();
        if (!(appointment == null || (attachments = appointment.getAttachments()) == null || !(!attachments.isEmpty()))) {
            showFileList(attachments);
        }
        RecordsViewModel recordsViewModel3 = this.f6925vm;
        if (recordsViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel3.showLoader.observe(getViewLifecycleOwner(), new ShowRecordFragment$onViewCreated$4(this));
        RecordsViewModel recordsViewModel4 = this.f6925vm;
        if (recordsViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vm");
        }
        recordsViewModel4.getRevokeResult().observe(getViewLifecycleOwner(), new ShowRecordFragment$onViewCreated$5(this));
    }

    /* access modifiers changed from: private */
    public final void onRevokeResult(Resource<RevokeIn> resource) {
        Resource.Status status;
        if (resource != null && (status = resource.getStatus()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                onRevokeDialogResult(true);
            } else if (i == 2) {
                onRevokeDialogResult(false);
            }
        }
    }

    public final void onRevokeDialogResult(boolean z) {
        int i = z ? R.string.label_revoke_success : R.string.label_revoke_error;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.positiveButton$default(MaterialDialog.title$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(i), (String) null, 2, (Object) null), Integer.valueOf(R.string.button_ok), (CharSequence) null, new ShowRecordFragment$onRevokeDialogResult$$inlined$let$lambda$1(this, i), 2, (Object) null).show();
        }
    }

    private final void showFileList(RealmList<FileData> realmList) {
        if (!this.sectionedAdapter.contains(this.downloadSection).booleanValue()) {
            this.sectionedAdapter.addSection(this.downloadSection);
            this.downloadSection.getOnClick().subscribe(new ShowRecordFragment$showFileList$1(this));
            this.downloadSection.setData(CollectionsKt.toList(realmList));
            this.downloadSection.show(true);
        }
    }

    /* access modifiers changed from: private */
    public final void onDownloadClick(FileData fileData) {
        Dexter.withActivity(getActivity()).withPermission("android.permission.WRITE_EXTERNAL_STORAGE").withListener(new ShowRecordFragment$onDownloadClick$1(this, fileData)).check();
    }

    /* access modifiers changed from: private */
    public final void startDownload(FileData fileData) {
        Intent intent = new Intent(getBaseActivity(), DownloadService.class);
        intent.putExtra(DownloadService.ARG_URL, fileData.getUrl());
        intent.putExtra(DownloadService.ARG_FILE_NAME, fileData.getName());
        getBaseActivity().startService(intent);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_new_record));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/ShowRecordFragment$Companion;", "", "()V", "start", "Lru/unicorn/ujin/view/fragments/makearecord/ShowRecordFragment;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.ShowRecordFragment$Companion */
    /* compiled from: ShowRecordFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ShowRecordFragment start(int i) {
            ShowRecordFragment showRecordFragment = new ShowRecordFragment();
            showRecordFragment.position = i;
            return showRecordFragment;
        }
    }
}
