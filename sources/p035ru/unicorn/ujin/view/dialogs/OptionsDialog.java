package p035ru.unicorn.ujin.view.dialogs;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsAdapter;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fJ&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016J\u001a\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/OptionsDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "optionList", "", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "title", "", "applyOptionsList", "", "optionsList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.OptionsDialog */
/* compiled from: OptionsDialog.kt */
public final class OptionsDialog extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public List<OptionsItem> optionList;
    /* access modifiers changed from: private */
    public String title;

    @JvmStatic
    public static final OptionsDialog newInstance(String str, List<OptionsItem> list) {
        return Companion.newInstance(str, list);
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

    public static final /* synthetic */ List access$getOptionList$p(OptionsDialog optionsDialog) {
        List<OptionsItem> list = optionsDialog.optionList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionList");
        }
        return list;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/OptionsDialog$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/dialogs/OptionsDialog;", "title", "", "optionList", "", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.OptionsDialog$Companion */
    /* compiled from: OptionsDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final OptionsDialog newInstance(String str, List<OptionsItem> list) {
            Intrinsics.checkNotNullParameter(list, "optionList");
            OptionsDialog optionsDialog = new OptionsDialog();
            optionsDialog.optionList = list;
            optionsDialog.title = str;
            return optionsDialog;
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setLayout(-1, -1);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Intrinsics.checkNotNullExpressionValue(dialog, "dialog!!");
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View inflate = layoutInflater.inflate(R.layout.dialog_options, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) _$_findCachedViewById(C5619R.C5622id.tvCancel)).setOnClickListener(new OptionsDialog$onViewCreated$1(this));
        if (this.title != null) {
            TextView textView = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
            textView.setText(this.title);
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvTitle");
            textView2.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvOptions);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        List<OptionsItem> list = this.optionList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("optionList");
        }
        recyclerView.setAdapter(new OptionsAdapter(list, this));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvOptions);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvOptions");
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView2.getContext(), linearLayoutManager.getOrientation());
        dividerItemDecoration.setDrawable(recyclerView.getResources().getDrawable(R.drawable.recycler_options_divider));
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    public final void applyOptionsList(ArrayList<OptionsItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "optionsList");
        ((RecyclerView) _$_findCachedViewById(C5619R.C5622id.rvOptions)).setAdapter(new OptionsAdapter(arrayList, this));
    }
}
