package p035ru.unicorn.ujin.view.dialogs.flatChoose;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X.¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "apartmentList", "", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "clickListener", "Lkotlin/Function2;", "", "", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
@Deprecated(message = "Use ApartmentListFragment instead")
/* renamed from: ru.unicorn.ujin.view.dialogs.flatChoose.FlatChooseDialog */
/* compiled from: FlatChooseDialog.kt */
public final class FlatChooseDialog extends DialogFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public List<? extends Apartment> apartmentList;
    /* access modifiers changed from: private */
    public Function2<? super String, ? super Integer, Unit> clickListener;

    @JvmStatic
    public static final FlatChooseDialog newInstance(List<? extends Apartment> list, Function2<? super String, ? super Integer, Unit> function2) {
        return Companion.newInstance(list, function2);
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

    public static final /* synthetic */ List access$getApartmentList$p(FlatChooseDialog flatChooseDialog) {
        List<? extends Apartment> list = flatChooseDialog.apartmentList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apartmentList");
        }
        return list;
    }

    public static final /* synthetic */ Function2 access$getClickListener$p(FlatChooseDialog flatChooseDialog) {
        Function2<? super String, ? super Integer, Unit> function2 = flatChooseDialog.clickListener;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickListener");
        }
        return function2;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\tH\u0007¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseDialog$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/dialogs/flatChoose/FlatChooseDialog;", "apartmentList", "", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "clickListener", "Lkotlin/Function2;", "", "", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.dialogs.flatChoose.FlatChooseDialog$Companion */
    /* compiled from: FlatChooseDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final FlatChooseDialog newInstance(List<? extends Apartment> list, Function2<? super String, ? super Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(list, "apartmentList");
            Intrinsics.checkNotNullParameter(function2, "clickListener");
            FlatChooseDialog flatChooseDialog = new FlatChooseDialog();
            flatChooseDialog.apartmentList = list;
            flatChooseDialog.clickListener = function2;
            return flatChooseDialog;
        }
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        View inflate = layoutInflater.inflate(R.layout.dialog_flat_choose, viewGroup);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C5619R.C5622id.recyclerData);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        List<? extends Apartment> list = this.apartmentList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("apartmentList");
        }
        Function2<? super String, ? super Integer, Unit> function2 = this.clickListener;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickListener");
        }
        recyclerView.setAdapter(new FlatChooseAdapter(list, function2));
    }
}
