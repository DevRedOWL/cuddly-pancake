package p035ru.unicorn.ujin.view.fragments.makearecord;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.sections.CustomerSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordSecondStage;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseSectionFragment;", "Lru/unicorn/ujin/view/fragments/makearecord/RecordsViewModel;", "()V", "customerSection", "Lru/unicorn/ujin/view/fragments/makearecord/sections/CustomerSection;", "getCustomerSection", "()Lru/unicorn/ujin/view/fragments/makearecord/sections/CustomerSection;", "dialog", "Lcom/afollestad/materialdialogs/MaterialDialog;", "getDialog", "()Lcom/afollestad/materialdialogs/MaterialDialog;", "dialog$delegate", "Lkotlin/Lazy;", "getLayoutRes", "", "getMyToolbarTitle", "", "initSections", "", "onCreateView", "root", "Landroid/view/View;", "onNextClick", "onViewCreated", "vm", "showExecutors", "data", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordSecondStage */
/* compiled from: RecordSecondStage.kt */
public final class RecordSecondStage extends BaseSectionFragment<RecordsViewModel> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private final CustomerSection customerSection = new CustomerSection();
    private final Lazy dialog$delegate = LazyKt.lazy(new RecordSecondStage$dialog$2(this));

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

    public final MaterialDialog getDialog() {
        return (MaterialDialog) this.dialog$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_record_stage_two;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final CustomerSection getCustomerSection() {
        return this.customerSection;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        this.sectionedAdapter.addSection(this.customerSection);
    }

    public void onCreateView(View view) {
        DynamicBackgroundButton dynamicBackgroundButton;
        super.onCreateView(view);
        if (view != null && (dynamicBackgroundButton = (DynamicBackgroundButton) view.findViewById(R.id.nextBtn)) != null) {
            dynamicBackgroundButton.setOnClickListener(new RecordSecondStage$onCreateView$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void onNextClick() {
        int checkedItem = this.customerSection.getCheckedItem();
        if (this.customerSection.getCheckedItem() > -1) {
            Diffable data = this.customerSection.getData(checkedItem);
            Intrinsics.checkNotNullExpressionValue(data, "customerSection.getData(position)");
            ((RecordsViewModel) this.viewModell).setCurrentExecutor((ExecutorsIn) data);
            nextFragment(new RecordThirdStage(), false);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.positiveButton$default(MaterialDialog.message$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.error_no_executor), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.button_OK), (CharSequence) null, RecordSecondStage$onNextClick$1$1.INSTANCE, 2, (Object) null).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onViewCreated(RecordsViewModel recordsViewModel) {
        SingleLiveEvent<List<ExecutorsIn>> listOfExutors;
        if (recordsViewModel != null) {
            recordsViewModel.getExecutors();
        }
        if (recordsViewModel != null && (listOfExutors = recordsViewModel.getListOfExutors()) != null) {
            listOfExutors.observe(getViewLifecycleOwner(), new RecordSecondStage$onViewCreated$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void showExecutors(List<? extends ExecutorsIn> list) {
        if (list != null) {
            Collection collection = list;
            if (!(collection == null || collection.isEmpty())) {
                this.customerSection.setData(list);
            } else if (!getDialog().isShowing()) {
                getDialog().show();
            }
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.label_new_record);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_new_record)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/RecordSecondStage$Companion;", "", "()V", "start", "Lru/unicorn/ujin/view/fragments/makearecord/RecordSecondStage;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordSecondStage$Companion */
    /* compiled from: RecordSecondStage.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecordSecondStage start() {
            RecordSecondStage recordSecondStage = new RecordSecondStage();
            recordSecondStage.setArguments(new Bundle());
            return recordSecondStage;
        }
    }
}
