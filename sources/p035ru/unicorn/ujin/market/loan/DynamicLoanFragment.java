package p035ru.unicorn.ujin.market.loan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.api.response.Layout;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFormEvent;
import p035ru.unicorn.ujin.view.fragments.dynamic.DynamicFormViewModel;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 L2\u00020\u0001:\u0001LB\u0005¢\u0006\u0002\u0010\u0002J$\u00103\u001a\u0002042\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020807062\u0006\u00109\u001a\u00020\u0004H\u0002J$\u0010:\u001a\u0002042\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080;062\u0006\u00109\u001a\u00020\u0004H\u0002J\u0010\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020\u0004H\u0014J,\u0010@\u001a\n B*\u0004\u0018\u00010A0A2\u0006\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u001a\u0010I\u001a\u0002042\u0006\u0010J\u001a\u00020A2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010K\u001a\u000204H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020.X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u0006M"}, mo51343d2 = {"Lru/unicorn/ujin/market/loan/DynamicLoanFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "accentColor", "", "getAccentColor", "()Ljava/lang/String;", "setAccentColor", "(Ljava/lang/String;)V", "bankPhone", "getBankPhone", "setBankPhone", "bankTitle", "getBankTitle", "setBankTitle", "bannerId", "", "getBannerId", "()I", "setBannerId", "(I)V", "dynamicFormViewModel", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;", "getDynamicFormViewModel", "()Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;", "setDynamicFormViewModel", "(Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormViewModel;)V", "icon", "getIcon", "setIcon", "layoutId", "getLayoutId", "setLayoutId", "loanTitle", "getLoanTitle", "setLoanTitle", "persData", "getPersData", "setPersData", "persDataUrl", "getPersDataUrl", "setPersDataUrl", "title", "getTitle", "setTitle", "toolbarButton", "Lru/unicorn/ujin/view/toolbar/ToolbarButtons;", "getToolbarButton", "()Lru/unicorn/ujin/view/toolbar/ToolbarButtons;", "setToolbarButton", "(Lru/unicorn/ujin/view/toolbar/ToolbarButtons;)V", "handleApiCallV1", "", "liveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/Resource;", "", "handleAction", "handleApiCallV2", "Lru/unicorn/ujin/data/realm/ResourceV2;", "handleEvent", "event", "Lru/unicorn/ujin/view/fragments/dynamic/DynamicFormEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "kotlin.jvm.PlatformType", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.loan.DynamicLoanFragment */
/* compiled from: DynamicLoanFragment.kt */
public final class DynamicLoanFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    public String accentColor;
    public String bankPhone;
    public String bankTitle;
    private int bannerId = -1;
    public DynamicFormViewModel dynamicFormViewModel;
    public String icon;
    private int layoutId = -1;
    public String loanTitle;
    public String persData;
    public String persDataUrl;
    private String title;
    public ToolbarButtons toolbarButton;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.loan.DynamicLoanFragment$WhenMappings */
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
    public static final DynamicLoanFragment newInstance(int i, ToolbarButtons toolbarButtons, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return Companion.newInstance(i, toolbarButtons, i2, str, str2, str3, str4, str5, str6, str7);
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.loan.DynamicLoanFragment.showToolbar():void");
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

    public final String getAccentColor() {
        String str = this.accentColor;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("accentColor");
        }
        return str;
    }

    public final void setAccentColor(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accentColor = str;
    }

    public final String getBankPhone() {
        String str = this.bankPhone;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankPhone");
        }
        return str;
    }

    public final void setBankPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bankPhone = str;
    }

    public final int getBannerId() {
        return this.bannerId;
    }

    public final void setBannerId(int i) {
        this.bannerId = i;
    }

    public final String getPersData() {
        String str = this.persData;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("persData");
        }
        return str;
    }

    public final void setPersData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.persData = str;
    }

    public final String getPersDataUrl() {
        String str = this.persDataUrl;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("persDataUrl");
        }
        return str;
    }

    public final void setPersDataUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.persDataUrl = str;
    }

    public final String getIcon() {
        String str = this.icon;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("icon");
        }
        return str;
    }

    public final void setIcon(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final String getBankTitle() {
        String str = this.bankTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankTitle");
        }
        return str;
    }

    public final void setBankTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bankTitle = str;
    }

    public final String getLoanTitle() {
        String str = this.loanTitle;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loanTitle");
        }
        return str;
    }

    public final void setLoanTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loanTitle = str;
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
        dynamicFormViewModel2.showLoader.observe(lifecycleOwner, new DynamicLoanFragment$onViewCreated$1(this));
        DynamicFormViewModel dynamicFormViewModel3 = this.dynamicFormViewModel;
        if (dynamicFormViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicFormViewModel");
        }
        dynamicFormViewModel3.getDynamicFormLiveData().observe(lifecycleOwner, new DynamicLoanFragment$onViewCreated$2(this));
        DynamicFormViewModel dynamicFormViewModel4 = this.dynamicFormViewModel;
        if (dynamicFormViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dynamicFormViewModel");
        }
        dynamicFormViewModel4.getLayout(this.layoutId);
    }

    /* access modifiers changed from: private */
    public final void handleEvent(DynamicFormEvent dynamicFormEvent) {
        ArrayList<HashMap<String, Object>> componentList;
        HashMap<String, Object> dataFields;
        boolean z = false;
        if (dynamicFormEvent.getSuccess()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            Layout layout = dynamicFormEvent.getLayout();
            String str = null;
            if (!(layout == null || (componentList = layout.getComponentList()) == null)) {
                ArrayList parseHashMapReturnFieldList$default = DataEntryAdapter.Companion.parseHashMapReturnFieldList$default(DataEntryAdapter.Companion, componentList, new DynamicLoanFragment$handleEvent$$inlined$apply$lambda$1(recyclerView, this, dynamicFormEvent), new DynamicLoanFragment$handleEvent$$inlined$apply$lambda$2(recyclerView, this, dynamicFormEvent), (Function2) null, (Function1) null, 24, (Object) null);
                Iterator it = parseHashMapReturnFieldList$default.iterator();
                while (it.hasNext()) {
                    Field field = (Field) it.next();
                    String name = field.getName();
                    switch (name.hashCode()) {
                        case -1787429613:
                            if (!name.equals(BankLoanTitleField.JsonFields.fieldName)) {
                                continue;
                            } else if (field != null) {
                                BankLoanTitleField bankLoanTitleField = (BankLoanTitleField) field;
                                String str2 = this.icon;
                                if (str2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("icon");
                                }
                                bankLoanTitleField.setLogoUrl(str2);
                                String str3 = this.bankTitle;
                                if (str3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("bankTitle");
                                }
                                bankLoanTitleField.setTitle(str3);
                                String str4 = this.loanTitle;
                                if (str4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("loanTitle");
                                }
                                bankLoanTitleField.setText(str4);
                                String str5 = this.accentColor;
                                if (str5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("accentColor");
                                }
                                bankLoanTitleField.setTextColor(str5);
                                break;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.BankLoanTitleField");
                            }
                        case 3045982:
                            if (!name.equals("call")) {
                                continue;
                            } else if (field != null) {
                                ButtonField buttonField = (ButtonField) field;
                                ClickActionData data = buttonField.getActions().getClick().getData();
                                if (data != null) {
                                    String str6 = this.bankPhone;
                                    if (str6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("bankPhone");
                                    }
                                    data.setData(str6);
                                }
                                String str7 = this.accentColor;
                                if (str7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("accentColor");
                                }
                                buttonField.setColor(str7);
                                break;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField");
                            }
                        case 3526536:
                            if (!name.equals("send")) {
                                continue;
                            } else if (field != null) {
                                ButtonField buttonField2 = (ButtonField) field;
                                ClickActionData data2 = buttonField2.getActions().getClick().getData();
                                Map<String, String> params = data2 != null ? data2.getParams() : null;
                                if (params != null) {
                                    ((HashMap) params).put("banner_id", String.valueOf(this.bannerId));
                                    ClickActionData data3 = buttonField2.getActions().getClick().getData();
                                    if (!(data3 == null || (dataFields = data3.getDataFields()) == null)) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("banner_id", "");
                                        Unit unit = Unit.INSTANCE;
                                        dataFields.put("context", hashMap);
                                    }
                                    String str8 = this.accentColor;
                                    if (str8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("accentColor");
                                    }
                                    buttonField2.setColor(str8);
                                    break;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField");
                            }
                        case 442824608:
                            if (!name.equals("persdata")) {
                                continue;
                            } else if (field != null) {
                                CheckboxField checkboxField = (CheckboxField) field;
                                String str9 = this.persData;
                                if (str9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("persData");
                                }
                                checkboxField.setText(str9);
                                String str10 = this.persDataUrl;
                                if (str10 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("persDataUrl");
                                }
                                checkboxField.setUrl(str10);
                                break;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField");
                            }
                    }
                }
                recyclerView.setAdapter(new DataEntryAdapter(parseHashMapReturnFieldList$default));
            }
            Layout layout2 = dynamicFormEvent.getLayout();
            if (layout2 != null) {
                str = layout2.getTitle();
            }
            this.title = str;
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
    public final void handleApiCallV2(SingleLiveEvent<ResourceV2<Object>> singleLiveEvent, String str) {
        singleLiveEvent.observe(getViewLifecycleOwner(), new DynamicLoanFragment$handleApiCallV2$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void handleApiCallV1(SingleLiveEvent<Resource<Object>> singleLiveEvent, String str) {
        singleLiveEvent.observe(getViewLifecycleOwner(), new DynamicLoanFragment$handleApiCallV1$1(this, str));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JX\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/market/loan/DynamicLoanFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/market/loan/DynamicLoanFragment;", "id", "", "leftButton", "Lru/unicorn/ujin/view/toolbar/ToolbarButtons;", "bannerId", "persData", "", "persDataUrl", "accentColor", "icon", "bankTitle", "loanTitle", "bankPhone", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.market.loan.DynamicLoanFragment$Companion */
    /* compiled from: DynamicLoanFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DynamicLoanFragment newInstance(int i, ToolbarButtons toolbarButtons, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            Intrinsics.checkNotNullParameter(toolbarButtons, "leftButton");
            Intrinsics.checkNotNullParameter(str, "persData");
            Intrinsics.checkNotNullParameter(str2, "persDataUrl");
            Intrinsics.checkNotNullParameter(str3, "accentColor");
            Intrinsics.checkNotNullParameter(str4, "icon");
            Intrinsics.checkNotNullParameter(str5, "bankTitle");
            Intrinsics.checkNotNullParameter(str6, "loanTitle");
            Intrinsics.checkNotNullParameter(str7, "bankPhone");
            DynamicLoanFragment dynamicLoanFragment = new DynamicLoanFragment();
            dynamicLoanFragment.setLayoutId(i);
            dynamicLoanFragment.setToolbarButton(toolbarButtons);
            dynamicLoanFragment.setBannerId(i2);
            dynamicLoanFragment.setPersData(str);
            dynamicLoanFragment.setPersDataUrl(str2);
            dynamicLoanFragment.setAccentColor(str3);
            dynamicLoanFragment.setIcon(str4);
            dynamicLoanFragment.setBankTitle(str5);
            dynamicLoanFragment.setLoanTitle(str6);
            dynamicLoanFragment.setBankPhone(str7);
            return dynamicLoanFragment;
        }
    }
}
