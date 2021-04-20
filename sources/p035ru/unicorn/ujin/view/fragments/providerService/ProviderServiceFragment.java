package p035ru.unicorn.ujin.view.fragments.providerService;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.ResourceV2;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.dynamic.DynamicLayoutManager;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Actions;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ButtonField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickAction;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ClickActionData;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Detail;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DetailedInfoField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DividerField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TextField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TitleField;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u00017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u0010 \u001a\u00020\u001d2\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"H\u0002J\u0012\u0010%\u001a\u00020\u001d2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0004H\u0014J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u00020\u001d2\u0006\u00105\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00106\u001a\u00020\u001dH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u00068"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment;", "Lru/unicorn/ujin/view/fragments/BaseFragment;", "()V", "productState", "", "getProductState", "()Ljava/lang/String;", "setProductState", "(Ljava/lang/String;)V", "provider", "getProvider", "setProvider", "providerServiceViewModel", "Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceViewModel;", "getProviderServiceViewModel", "()Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceViewModel;", "providerServiceViewModel$delegate", "Lkotlin/Lazy;", "serviceId", "", "getServiceId", "()Ljava/lang/Integer;", "setServiceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "getTitle", "setTitle", "handleActiveProviderInfo", "", "event", "Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoEvent;", "handleApiCall", "liveData", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "Lru/unicorn/ujin/data/realm/ResourceV2;", "", "handleButtonClick", "url", "handleDeleteActiveProviderInfo", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "handleProviderInfo", "Lru/unicorn/ujin/view/fragments/providerService/ProviderInfoEvent;", "metricsScreenName", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment */
/* compiled from: ProviderServiceFragment.kt */
public final class ProviderServiceFragment extends BaseFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String PRODUCT_STATE_ACTIVE = "active";
    public static final String PRODUCT_STATE_AVAILABLE = "available";
    public static final String PRODUCT_STATE_DEBT = "debt";
    public static final String PRODUCT_STATE_DISABLED = "disabled";
    public static final String PRODUCT_STATE_UNAVAILABLE = "unavailable";
    private HashMap _$_findViewCache;
    public String productState;
    private String provider = "";
    private final Lazy providerServiceViewModel$delegate = LazyKt.lazy(new ProviderServiceFragment$providerServiceViewModel$2(this));
    private Integer serviceId = -1;
    public String title;

    @Metadata(mo51341bv = {1, 0, 3}, mo51344k = 3, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[ResourceV2.Status.values().length];

        static {
            $EnumSwitchMapping$0[ResourceV2.Status.LOADING.ordinal()] = 1;
            $EnumSwitchMapping$0[ResourceV2.Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$0[ResourceV2.Status.ERROR.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final ProviderServiceViewModel getProviderServiceViewModel() {
        return (ProviderServiceViewModel) this.providerServiceViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void handleButtonClick(String str) {
    }

    @JvmStatic
    public static final ProviderServiceFragment newInstance(String str, String str2, String str3, Integer num) {
        return Companion.newInstance(str, str2, str3, num);
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
        return "Услуги ЭРТХ";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getProvider() {
        return this.provider;
    }

    public final void setProvider(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.provider = str;
    }

    public final Integer getServiceId() {
        return this.serviceId;
    }

    public final void setServiceId(Integer num) {
        this.serviceId = num;
    }

    public final String getProductState() {
        String str = this.productState;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("productState");
        }
        return str;
    }

    public final void setProductState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productState = str;
    }

    public final String getTitle() {
        String str = this.title;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("title");
        }
        return str;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().showImageLogo();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_provider_service, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        getProviderServiceViewModel().showLoader.observe(getViewLifecycleOwner(), new ProviderServiceFragment$onViewCreated$1(this));
        getProviderServiceViewModel().getProviderInfoLiveData().observe(getViewLifecycleOwner(), new ProviderServiceFragment$onViewCreated$2(this));
        getProviderServiceViewModel().getActiveProviderInfoLiveData().observe(getViewLifecycleOwner(), new ProviderServiceFragment$onViewCreated$3(this));
        getProviderServiceViewModel().getDeleteActiveProviderInfoLiveData().observe(getViewLifecycleOwner(), new ProviderServiceFragment$onViewCreated$4(this));
        if (!Intrinsics.areEqual((Object) this.provider, (Object) "")) {
            String str = this.productState;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productState");
            }
            int hashCode = str.hashCode();
            if (hashCode != -1422950650) {
                if (hashCode != -733902135) {
                    if (hashCode == -665462704 && str.equals(PRODUCT_STATE_UNAVAILABLE)) {
                        getProviderServiceViewModel().requestProviderServiceInfo(this.provider);
                    }
                } else if (str.equals("available")) {
                    getProviderServiceViewModel().requestProviderServiceInfo(this.provider);
                }
            } else if (str.equals("active")) {
                ProviderServiceViewModel providerServiceViewModel = getProviderServiceViewModel();
                Integer num = this.serviceId;
                providerServiceViewModel.requestActiveProviderServiceInfo(num != null ? num.intValue() : -1);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void handleDeleteActiveProviderInfo(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            new AlertDialog.Builder(getBaseActivity()).setMessage("Вы вышли из договора, через некоторое время он исчезнет из списка").setPositiveButton(R.string.ok, new ProviderServiceFragment$handleDeleteActiveProviderInfo$1(this)).show();
        } else {
            showMessage(updateEvent.getMessage());
        }
    }

    /* access modifiers changed from: private */
    public final void handleActiveProviderInfo(ActiveProviderInfoEvent activeProviderInfoEvent) {
        Service service;
        Tariff tariff;
        String title2;
        Contract contract;
        Double balance;
        Contract contract2;
        String number;
        Service service2;
        String title3;
        if (activeProviderInfoEvent.getSuccess()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            recyclerView.setLayoutManager(new DynamicLayoutManager(context, 1, false));
            ArrayList arrayList = new ArrayList();
            ActiveProviderService service3 = activeProviderInfoEvent.getService();
            if (!(service3 == null || (service2 = service3.getService()) == null || (title3 = service2.getTitle()) == null)) {
                arrayList.add(new TitleField("<br>" + title3, "primary", "center", (String) null, 8, (DefaultConstructorMarker) null));
            }
            ActiveProviderService service4 = activeProviderInfoEvent.getService();
            if (!(service4 == null || (contract2 = service4.getContract()) == null || (number = contract2.getNumber()) == null)) {
                arrayList.add(new TitleField("<br>Договор №<br>" + number + "<br>", "bold", "center", (String) null, 8, (DefaultConstructorMarker) null));
            }
            arrayList.add(new DividerField(1));
            ArrayList arrayList2 = new ArrayList();
            ActiveProviderService service5 = activeProviderInfoEvent.getService();
            if (!(service5 == null || (contract = service5.getContract()) == null || (balance = contract.getBalance()) == null)) {
                arrayList2.add(new Detail("Баланс", String.valueOf(balance.doubleValue())));
            }
            ActiveProviderService service6 = activeProviderInfoEvent.getService();
            if (!(service6 == null || (service = service6.getService()) == null || (tariff = service.getTariff()) == null || (title2 = tariff.getTitle()) == null)) {
                arrayList2.add(new Detail("Тарифный план", title2));
            }
            Unit unit = Unit.INSTANCE;
            arrayList.add(new DetailedInfoField(arrayList2));
            arrayList.add(new TextField("<br><br>", "primary", "center", (String) null, 8, (DefaultConstructorMarker) null));
            arrayList.add(new ButtonField("Выйти из договора", ButtonField.Type.styleStroked, "", new Actions(new ClickAction(ClickAction.Type.customClick, new ClickActionData((String) null, (ArrayList<String>) null, (ArrayList<String>) null, (String) null, (Map<String, String>) null, (HashMap<String, Object>) null, (String) null))), new C6077x5b4c22e0(this, activeProviderInfoEvent), ProviderServiceFragment$handleActiveProviderInfo$1$5.INSTANCE, ProviderServiceFragment$handleActiveProviderInfo$1$6.INSTANCE));
            recyclerView.setAdapter(new DataEntryAdapter(arrayList));
            return;
        }
        ActiveProviderInfoEvent activeProviderInfoEvent2 = activeProviderInfoEvent;
        showMessage(activeProviderInfoEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleProviderInfo(ProviderInfoEvent providerInfoEvent) {
        Available available;
        if (providerInfoEvent.getSuccess()) {
            String str = this.productState;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productState");
            }
            if (Intrinsics.areEqual((Object) str, (Object) PRODUCT_STATE_UNAVAILABLE)) {
                Unavailable unavailable = providerInfoEvent.getUnavailable();
                if (unavailable != null) {
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                    ArrayList arrayList = new ArrayList();
                    StringBuilder sb = new StringBuilder();
                    sb.append("<br>");
                    String str2 = this.title;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("title");
                    }
                    sb.append(str2);
                    sb.append("<br>");
                    arrayList.add(new TitleField(sb.toString(), "primary", "center", (String) null, 8, (DefaultConstructorMarker) null));
                    String title2 = unavailable.getTitle();
                    if (title2 != null) {
                        Boolean.valueOf(arrayList.add(new TextField("<br>" + title2 + "<br>", "bold", "center", (String) null, 8, (DefaultConstructorMarker) null)));
                    }
                    String description = unavailable.getDescription();
                    if (description != null) {
                        Boolean.valueOf(arrayList.add(new TextField("<br>" + description + "<br>", "primary", "center", (String) null, 8, (DefaultConstructorMarker) null)));
                    }
                    String formButtonText = unavailable.getFormButtonText();
                    if (formButtonText != null) {
                        Boolean.valueOf(arrayList.add(new ButtonField(formButtonText, ButtonField.Type.styleFilled, "", new Actions(new ClickAction(ClickAction.Type.openUrlAndCallback, new ClickActionData((String) null, (ArrayList<String>) null, (ArrayList<String>) null, unavailable.getFormButtonUrl(), (Map<String, String>) null, (HashMap<String, Object>) null, (String) null))), new ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$1(arrayList, unavailable, this), ProviderServiceFragment$handleProviderInfo$1$1$3$2.INSTANCE, ProviderServiceFragment$handleProviderInfo$1$1$3$3.INSTANCE)));
                    }
                    String helpText = unavailable.getHelpText();
                    if (helpText != null) {
                        Boolean.valueOf(arrayList.add(new TextField("<br>" + helpText + "<br>", "primary", "center", (String) null, 8, (DefaultConstructorMarker) null)));
                    }
                    String helpButtonText = unavailable.getHelpButtonText();
                    if (helpButtonText != null) {
                        Boolean.valueOf(arrayList.add(new ButtonField(helpButtonText, ButtonField.Type.styleStroked, "", new Actions(new ClickAction("phone", new ClickActionData((String) null, (ArrayList<String>) null, (ArrayList<String>) null, unavailable.getHelpPhone(), (Map<String, String>) null, (HashMap<String, Object>) null, (String) null))), ProviderServiceFragment$handleProviderInfo$1$1$5$1.INSTANCE, ProviderServiceFragment$handleProviderInfo$1$1$5$2.INSTANCE, ProviderServiceFragment$handleProviderInfo$1$1$5$3.INSTANCE)));
                    }
                    recyclerView.setAdapter(new DataEntryAdapter(arrayList));
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            }
            String str3 = this.productState;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("productState");
            }
            if (Intrinsics.areEqual((Object) str3, (Object) "available") && (available = providerInfoEvent.getAvailable()) != null) {
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
                Context context = recyclerView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                recyclerView2.setLayoutManager(new DynamicLayoutManager(context, 1, false));
                ArrayList arrayList2 = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<br>");
                String str4 = this.title;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("title");
                }
                sb2.append(str4);
                sb2.append("<br>");
                TitleField titleField = r9;
                TitleField titleField2 = new TitleField(sb2.toString(), "primary", "center", (String) null, 8, (DefaultConstructorMarker) null);
                arrayList2.add(titleField);
                String description2 = available.getDescription();
                if (description2 != null) {
                    TextField textField = r9;
                    TextField textField2 = new TextField("<br>" + description2 + "<br>", "primary", "center", (String) null, 8, (DefaultConstructorMarker) null);
                    Boolean.valueOf(arrayList2.add(textField));
                }
                EditField editField = new EditField("text", "Номер договора/телефон/e-mail", "", "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
                editField.setName(CardFragment.ARG_NUMBER);
                editField.setRequired(true);
                Unit unit2 = Unit.INSTANCE;
                arrayList2.add(editField);
                EditField editField2 = new EditField("password", "Пароль", "", "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
                editField2.setName("password");
                editField2.setRequired(true);
                Unit unit3 = Unit.INSTANCE;
                arrayList2.add(editField2);
                String submitButtonText = available.getSubmitButtonText();
                if (submitButtonText != null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(CardFragment.ARG_NUMBER);
                    arrayList3.add("password");
                    Unit unit4 = Unit.INSTANCE;
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(CardFragment.ARG_NUMBER);
                    arrayList4.add("password");
                    Unit unit5 = Unit.INSTANCE;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("provider", this.provider);
                    String str5 = this.title;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("title");
                    }
                    pairArr[1] = new Pair("title", str5);
                    Map mapOf = MapsKt.mapOf(pairArr);
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(CardFragment.ARG_NUMBER, "");
                    hashMap2.put("password", "");
                    hashMap2.put("provider", "");
                    hashMap2.put("title", "");
                    Unit unit6 = Unit.INSTANCE;
                    hashMap.put("data", hashMap2);
                    Unit unit7 = Unit.INSTANCE;
                    Boolean.valueOf(arrayList2.add(new ButtonField(submitButtonText, ButtonField.Type.styleFilled, "", new Actions(new ClickAction(ClickAction.Type.apiCall, new ClickActionData((String) null, arrayList3, arrayList4, "v2/client/resident/profile/related/contracts/create/", mapOf, hashMap, (String) null))), new ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$2(arrayList2, available, this), new ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$3(arrayList2, available, this), ProviderServiceFragment$handleProviderInfo$2$1$4$6.INSTANCE)));
                }
                String formText = available.getFormText();
                if (formText != null) {
                    Boolean.valueOf(arrayList2.add(new TextField("<br>" + formText + "<br>", "primary", "center", (String) null, 8, (DefaultConstructorMarker) null)));
                }
                String formButtonText2 = available.getFormButtonText();
                if (formButtonText2 != null) {
                    Boolean.valueOf(arrayList2.add(new ButtonField(formButtonText2, ButtonField.Type.styleFilled, "", new Actions(new ClickAction(ClickAction.Type.openUrlAndCallback, new ClickActionData((String) null, (ArrayList<String>) null, (ArrayList<String>) null, available.getFormButtonUrl(), (Map<String, String>) null, (HashMap<String, Object>) null, (String) null))), new ProviderServiceFragment$handleProviderInfo$$inlined$let$lambda$4(arrayList2, available, this), ProviderServiceFragment$handleProviderInfo$2$1$6$2.INSTANCE, ProviderServiceFragment$handleProviderInfo$2$1$6$3.INSTANCE)));
                }
                recyclerView2.setAdapter(new DataEntryAdapter(arrayList2));
                Unit unit8 = Unit.INSTANCE;
                return;
            }
            return;
        }
        showMessage(providerInfoEvent.getMessage());
    }

    /* access modifiers changed from: private */
    public final void handleApiCall(SingleLiveEvent<ResourceV2<Object>> singleLiveEvent) {
        singleLiveEvent.observe(getViewLifecycleOwner(), new ProviderServiceFragment$handleApiCall$1(this));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment$Companion;", "", "()V", "PRODUCT_STATE_ACTIVE", "", "PRODUCT_STATE_AVAILABLE", "PRODUCT_STATE_DEBT", "PRODUCT_STATE_DISABLED", "PRODUCT_STATE_UNAVAILABLE", "newInstance", "Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment;", "title", "provider", "productState", "serviceId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/unicorn/ujin/view/fragments/providerService/ProviderServiceFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.providerService.ProviderServiceFragment$Companion */
    /* compiled from: ProviderServiceFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ProviderServiceFragment newInstance(String str, String str2, String str3, Integer num) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "provider");
            Intrinsics.checkNotNullParameter(str3, "productState");
            ProviderServiceFragment providerServiceFragment = new ProviderServiceFragment();
            providerServiceFragment.setTitle(str);
            providerServiceFragment.setProductState(str3);
            providerServiceFragment.setProvider(str2);
            providerServiceFragment.setServiceId(num);
            return providerServiceFragment;
        }
    }
}
