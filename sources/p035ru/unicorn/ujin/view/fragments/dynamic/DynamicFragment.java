package p035ru.unicorn.ujin.view.fragments.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.Layout;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001dH\u0002J$\u0010$\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0'0&2\u0006\u0010)\u001a\u00020\u0010H\u0002J$\u0010*\u001a\u00020\"2\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0+0&2\u0006\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0010H\u0014J,\u00100\u001a\n 2*\u0004\u0018\u000101012\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020\"H\u0016J\u001a\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u0002012\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0018\u0010<\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001dH\u0002J\b\u0010>\u001a\u00020\"H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006@"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/dynamic/DynamicFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "dynamicFormViewModel", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;", "getDynamicFormViewModel", "()Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;", "setDynamicFormViewModel", "(Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;)V", "layoutId", "", "getLayoutId", "()I", "setLayoutId", "(I)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "toolbarButton", "Lru/unicorn/ujin/view/toolbar/ToolbarButtons;", "getToolbarButton", "()Lru/unicorn/ujin/view/toolbar/ToolbarButtons;", "setToolbarButton", "(Lru/unicorn/ujin/view/toolbar/ToolbarButtons;)V", "vehicleNumberEditTextList", "Ljava/util/ArrayList;", "Landroid/widget/EditText;", "Lkotlin/collections/ArrayList;", "getVehicleNumberEditTextList", "()Ljava/util/ArrayList;", "disableVehicleNumberKeyboard", "", "editText", "handleApiCallV1", "liveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "handleAction", "handleApiCallV2", "Lru/unicorn/ujin/data/realm/ResourceV2;", "handleEvent", "event", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onViewCreated", "view", "setupVehicleNumberKeyboard", "hint", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment */
/* compiled from: DynamicFragment.kt */
public final class DynamicFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public DynamicFormViewModel dynamicFormViewModel;
    private int layoutId = -1;
    private String title;
    public ToolbarButtons toolbarButton;
    private final ArrayList<EditText> vehicleNumberEditTextList = new ArrayList<>();

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[ResourceV2.Status.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[Resource.Status.values().length];

        static {
            $EnumSwitchMapping$0[ResourceV2.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[ResourceV2.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[ResourceV2.Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$1[Resource.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$1[Resource.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1[Resource.Status.ERROR.ordinal()] = 3;
        }
    }

    @JvmStatic
    public static final DynamicFragment newInstance(int i, ToolbarButtons toolbarButtons) {
        return Companion.newInstance(i, toolbarButtons);
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
    public String metricsScreenName() {
        return "Динамическая форма";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if ((r0.length() == 0) == true) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void showToolbar() {
        /*
            r3 = this;
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r3.getBaseActivity()
            ru.unicorn.ujin.view.toolbar.ToolbarButtons r1 = r3.toolbarButton
            if (r1 != 0) goto L_0x000d
            java.lang.String r2 = "toolbarButton"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x000d:
            r0.setToolbarLeft(r1)
            java.lang.String r0 = r3.title
            if (r0 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x0025
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            if (r0 != 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != r1) goto L_0x0025
            goto L_0x002f
        L_0x0025:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r3.getBaseActivity()
            java.lang.String r1 = r3.title
            r0.setTextTitle(r1)
            goto L_0x0036
        L_0x002f:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r3.getBaseActivity()
            r0.showImageLogo()
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment.showToolbar():void");
    }

    public final DynamicFormViewModel getDynamicFormViewModel() {
        DynamicFormViewModel dynamicFormViewModel2 = this.dynamicFormViewModel;
        if (dynamicFormViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicFormViewModel");
        }
        return dynamicFormViewModel2;
    }

    public final void setDynamicFormViewModel(DynamicFormViewModel dynamicFormViewModel2) {
        Intrinsics.checkNotNullParameter(dynamicFormViewModel2, "<set-?>");
        this.dynamicFormViewModel = dynamicFormViewModel2;
    }

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final void setLayoutId(int i) {
        this.layoutId = i;
    }

    public final ToolbarButtons getToolbarButton() {
        ToolbarButtons toolbarButtons = this.toolbarButton;
        if (toolbarButtons == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarButton");
        }
        return toolbarButtons;
    }

    public final void setToolbarButton(ToolbarButtons toolbarButtons) {
        Intrinsics.checkNotNullParameter(toolbarButtons, "<set-?>");
        this.toolbarButton = toolbarButtons;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final ArrayList<EditText> getVehicleNumberEditTextList() {
        return this.vehicleNumberEditTextList;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_dynamic, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ViewModel viewModel = ViewModelProviders.m10of((Fragment) this).get(DynamicFormViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProviders.of(Dy…ormViewModel::class.java)");
        this.dynamicFormViewModel = (DynamicFormViewModel) viewModel;
        DynamicFormViewModel dynamicFormViewModel2 = this.dynamicFormViewModel;
        if (dynamicFormViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicFormViewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        dynamicFormViewModel2.showLoader.observe(lifecycleOwner, new DynamicFragment$onViewCreated$1(this));
        DynamicFormViewModel dynamicFormViewModel3 = this.dynamicFormViewModel;
        if (dynamicFormViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicFormViewModel");
        }
        dynamicFormViewModel3.getDynamicFormLiveData().observe(lifecycleOwner, new DynamicFragment$onViewCreated$2(this));
        DynamicFormViewModel dynamicFormViewModel4 = this.dynamicFormViewModel;
        if (dynamicFormViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicFormViewModel");
        }
        dynamicFormViewModel4.getLayout(this.layoutId);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(DynamicFormEvent dynamicFormEvent) {
        ArrayList<HashMap<String, Object>> componentList;
        boolean z = false;
        if (dynamicFormEvent.getSuccess()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            Layout layout = dynamicFormEvent.getLayout();
            if (!(layout == null || (componentList = layout.getComponentList()) == null)) {
                recyclerView.setAdapter(DataEntryAdapter.Companion.parseHashMap(componentList, new DynamicFragment$handleEvent$$inlined$apply$lambda$1(recyclerView, this, dynamicFormEvent), new DynamicFragment$handleEvent$$inlined$apply$lambda$2(recyclerView, this, dynamicFormEvent), new DynamicFragment$handleEvent$$inlined$apply$lambda$3(recyclerView, this, dynamicFormEvent), new DynamicFragment$handleEvent$$inlined$apply$lambda$4(recyclerView, this, dynamicFormEvent)));
            }
            Layout layout2 = dynamicFormEvent.getLayout();
            this.title = layout2 != null ? layout2.getTitle() : null;
            showToolbar();
            return;
        }
        if (dynamicFormEvent.getMessage().length() > 0) {
            z = true;
        }
        if (z) {
            showMessage(dynamicFormEvent.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public final void setupVehicleNumberKeyboard(EditText editText, EditText editText2) {
        getBaseActivity().addEditTextToVehicleMask(editText, editText2);
        getBaseActivity().hideSoftKeyboard(getBaseActivity());
    }

    /* access modifiers changed from: private */
    public final void disableVehicleNumberKeyboard(EditText editText) {
        getBaseActivity().removeEditTextFromVehicleMask(editText);
        getBaseActivity().hideSoftKeyboard(getBaseActivity());
    }

    public void onDetach() {
        super.onDetach();
        Iterator<EditText> it = this.vehicleNumberEditTextList.iterator();
        while (it.hasNext()) {
            getBaseActivity().removeEditTextFromVehicleMask(it.next());
        }
    }

    /* access modifiers changed from: private */
    public final void handleApiCallV2(SingleLiveEvent<ResourceV2<Object>> singleLiveEvent, String str) {
        singleLiveEvent.observe(getViewLifecycleOwner(), new DynamicFragment$handleApiCallV2$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void handleApiCallV1(SingleLiveEvent<Resource<Object>> singleLiveEvent, String str) {
        singleLiveEvent.observe(getViewLifecycleOwner(), new DynamicFragment$handleApiCallV1$1(this, str));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/dynamic/DynamicFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFragment;", "id", "", "leftButton", "Lru/unicorn/ujin/view/toolbar/ToolbarButtons;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.dynamic.DynamicFragment$Companion */
    /* compiled from: DynamicFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DynamicFragment newInstance(int i, ToolbarButtons toolbarButtons) {
            Intrinsics.checkNotNullParameter(toolbarButtons, "leftButton");
            DynamicFragment dynamicFragment = new DynamicFragment();
            dynamicFragment.setLayoutId(i);
            dynamicFragment.setToolbarButton(toolbarButtons);
            return dynamicFragment;
        }
    }
}
