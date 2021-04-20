package p035ru.unicorn.ujin.view.dialogs.dataEntry;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0004J\u0011\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u000bH\u0016J\u001a\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010(\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X.¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0016¨\u0006*"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "buttonTextId", "", "dataEntryList", "", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "lambdaSave", "Lkotlin/Function1;", "", "", "getLambdaSave", "()Lkotlin/jvm/functions/Function1;", "setLambdaSave", "(Lkotlin/jvm/functions/Function1;)V", "metrics", "Lru/unicorn/ujin/metrics/MetricsKeys;", "time", "title", "", "titleId", "Ljava/lang/Integer;", "getParamsMap", "", "position", "getValuesList", "", "()[Ljava/lang/String;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "validateAndHandle", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog */
/* compiled from: DataEntryDialog.kt */
public final class DataEntryDialog extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public int buttonTextId;
    /* access modifiers changed from: private */
    public List<? extends Field> dataEntryList;
    public Function1<? super Long, Unit> lambdaSave;
    private MetricsKeys metrics;
    private long time;
    /* access modifiers changed from: private */
    public String title;
    /* access modifiers changed from: private */
    public Integer titleId;

    @JvmStatic
    public static final DataEntryDialog newInstance(int i, List<? extends Field> list, int i2) {
        return Companion.newInstance(i, list, i2);
    }

    @JvmStatic
    public static final DataEntryDialog newInstance(String str, List<? extends Field> list, int i) {
        return Companion.newInstance(str, list, i);
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

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ List access$getDataEntryList$p(DataEntryDialog dataEntryDialog) {
        List<? extends Field> list = dataEntryDialog.dataEntryList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataEntryList");
        }
        return list;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryDialog$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/dialogs/dataEntry/DataEntryDialog;", "titleId", "", "dataEntryList", "", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "buttonTextId", "title", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryDialog$Companion */
    /* compiled from: DataEntryDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DataEntryDialog newInstance(int i, List<? extends Field> list, int i2) {
            Intrinsics.checkNotNullParameter(list, "dataEntryList");
            DataEntryDialog dataEntryDialog = new DataEntryDialog();
            dataEntryDialog.titleId = Integer.valueOf(i);
            dataEntryDialog.dataEntryList = list;
            dataEntryDialog.buttonTextId = i2;
            return dataEntryDialog;
        }

        @JvmStatic
        public final DataEntryDialog newInstance(String str, List<? extends Field> list, int i) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(list, "dataEntryList");
            DataEntryDialog dataEntryDialog = new DataEntryDialog();
            dataEntryDialog.title = str;
            dataEntryDialog.dataEntryList = list;
            dataEntryDialog.buttonTextId = i;
            return dataEntryDialog;
        }
    }

    public final Function1<Long, Unit> getLambdaSave() {
        Function1<? super Long, Unit> function1 = this.lambdaSave;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lambdaSave");
        }
        return function1;
    }

    public final void setLambdaSave(Function1<? super Long, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.lambdaSave = function1;
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
        }
        this.time = System.currentTimeMillis();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_data_entry, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.textCancel)).setOnClickListener(new DataEntryDialog$onViewCreated$1(this));
        Integer num = this.titleId;
        if (num != null) {
            int intValue = num.intValue();
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.textTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "textTitle");
            textView.setText(view.getContext().getString(intValue));
        } else {
            DataEntryDialog dataEntryDialog = this;
            String str = dataEntryDialog.title;
            if (str != null) {
                TextView textView2 = (TextView) dataEntryDialog._$_findCachedViewById(C5619R.C5622id.textTitle);
                Intrinsics.checkNotNullExpressionValue(textView2, "textTitle");
                textView2.setText(str);
            }
        }
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonSave);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "buttonSave");
        dynamicBackgroundButton.setText(view.getContext().getString(this.buttonTextId));
        ((DynamicBackgroundButton) _$_findCachedViewById(C5619R.C5622id.buttonSave)).setOnClickListener(new DataEntryDialog$onViewCreated$4(this));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.recyclerData);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        List<? extends Field> list = this.dataEntryList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataEntryList");
        }
        recyclerView.setAdapter(new DataEntryAdapter(list));
    }

    /* access modifiers changed from: private */
    public final void validateAndHandle() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.recyclerData);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerData");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
        } else if (((DataEntryAdapter) adapter).isFormValid()) {
            this.time = System.currentTimeMillis() - this.time;
            Function1<? super Long, Unit> function1 = this.lambdaSave;
            if (function1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lambdaSave");
            }
            function1.invoke(Long.valueOf(this.time));
        } else {
            Toast.makeText(getActivity(), R.string.emptyFieldsMessage, 1).show();
        }
    }

    public final String[] getValuesList() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.recyclerData);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerData");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return ((DataEntryAdapter) adapter).getValuesList();
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
    }

    public final Map<String, String> getParamsMap(int i) {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.recyclerData);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerData");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null) {
            return ((DataEntryAdapter) adapter).getParamsMap(i);
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.dialogs.dataEntry.DataEntryAdapter");
    }
}
