package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.ApiValues;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.EditField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectField;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.TextField;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0014J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J\b\u0010\u001a\u001a\u00020\bH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFifthFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "()V", "companyList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectValue;", "Lkotlin/collections/ArrayList;", "initForm", "", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onViewCreated", "view", "showData", "rentCompanyList", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFifthFragment */
/* compiled from: AnotherPathFifthFragment.kt */
public final class AnotherPassFifthFragment extends BaseAnotherPassFragment {
    public static final String COMPANY_FIELD = "company";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String OFFICE_FIELD = "office";
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public ArrayList<SelectValue> companyList = new ArrayList<>();

    @JvmStatic
    public static final AnotherPassFifthFragment newInstance() {
        return Companion.newInstance();
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
        return "Экран выбора компании и офиса для гостевого пропуска";
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.parkingNewPass));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        View[] viewArr = new View[1];
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_toolbar_blue_button, getBaseActivity().llButtonsRight, false);
        if (inflate != null) {
            TextView textView = (TextView) inflate;
            textView.setText(getString(R.string.parkingNextStep));
            textView.setOnClickListener(new AnotherPassFifthFragment$showToolbar$$inlined$apply$lambda$1(this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_fifth, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
        getPassViewModel().getEnterpriseListMutableLiveData().observe(getViewLifecycleOwner(), new AnotherPassFifthFragment$onViewCreated$1(this));
        getPassViewModel().getEnterpriseList();
    }

    public void onPause() {
        super.onPause();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvDynamic");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            String str = ((DataEntryAdapter) adapter).getParamsMap(0).get("company");
            if (str == null) {
                str = "";
            }
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvDynamic");
            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                String str2 = ((DataEntryAdapter) adapter2).getParamsMap(1).get(OFFICE_FIELD);
                if (str2 == null) {
                    str2 = "";
                }
                CreateAnotherPassRequestBody createAnotherPassBody = getPassViewModel().getCreateAnotherPassBody();
                createAnotherPassBody.setEnterpriseId(str);
                createAnotherPassBody.setComment(str2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
    }

    /* access modifiers changed from: private */
    public final void showData(List<RentCompany> list) {
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(8);
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            for (RentCompany next : list) {
                String id = next.getId();
                if (id != null) {
                    ArrayList<SelectValue> arrayList = this.companyList;
                    String str = id.toString();
                    String title = next.getTitle();
                    Intrinsics.checkNotNullExpressionValue(title, "item.title");
                    arrayList.add(new SelectValue(str, title));
                }
            }
        }
        initForm();
    }

    private final void initForm() {
        ArrayList arrayList = new ArrayList();
        if (this.companyList.isEmpty()) {
            String string = getString(R.string.empty_company_list);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.empty_company_list)");
            arrayList.add(new TextField(string, "primary", "start", (String) null, 8, (DefaultConstructorMarker) null));
        } else {
            SelectField selectField = new SelectField(getResources().getString(R.string.company), "", this.companyList.get(0).getValue(), this.companyList, (ApiValues) null);
            selectField.setName("company");
            selectField.setRequired(true);
            Unit unit = Unit.INSTANCE;
            EditField editField = new EditField("text", getResources().getString(R.string.label_office), "", "", (Function2) null, (Function1) null, 48, (DefaultConstructorMarker) null);
            editField.setName(OFFICE_FIELD);
            editField.setRequired(true);
            Unit unit2 = Unit.INSTANCE;
            arrayList.addAll(CollectionsKt.listOf(selectField, editField));
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvDynamic);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(new DataEntryAdapter(arrayList));
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFifthFragment$Companion;", "", "()V", "COMPANY_FIELD", "", "OFFICE_FIELD", "newInstance", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassFifthFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFifthFragment$Companion */
    /* compiled from: AnotherPathFifthFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AnotherPassFifthFragment newInstance() {
            return new AnotherPassFifthFragment();
        }
    }
}
