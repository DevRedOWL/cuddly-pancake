package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J&\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0016¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassThirdFragment;", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/BaseAnotherPassFragment;", "()V", "metricsScreenName", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onViewCreated", "view", "saveValues", "showToolbar", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment */
/* compiled from: AnotherPassThirdFragment.kt */
public final class AnotherPassThirdFragment extends BaseAnotherPassFragment {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;

    @JvmStatic
    public static final AnotherPassThirdFragment newInstance() {
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
        return "Экран информации о госте";
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
            textView.setOnClickListener(new AnotherPassThirdFragment$showToolbar$$inlined$apply$lambda$1(this));
            Unit unit = Unit.INSTANCE;
            viewArr[0] = textView;
            baseActivity.setToolbarRight(CollectionsKt.arrayListOf(viewArr));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_another_pass_third, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        CreateAnotherPassRequestBody createAnotherPassBody = getPassViewModel().getCreateAnotherPassBody();
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName)).setText(createAnotherPassBody.getName());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname)).setText(createAnotherPassBody.getSurname());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic)).setText(createAnotherPassBody.getPatronymic());
        ((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).setText(createAnotherPassBody.getPhone());
        ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etCompany)).setText(createAnotherPassBody.getCompany());
        if (createAnotherPassBody.getCategory() != 0) {
            TextInputLayout textInputLayout = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilNumber);
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilNumber");
            textInputLayout.setVisibility(0);
            TextInputLayout textInputLayout2 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilBrand);
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "tilBrand");
            textInputLayout2.setVisibility(0);
            ArrayList<VehicleData> vehicles = createAnotherPassBody.getVehicles();
            if (vehicles != null && (!vehicles.isEmpty())) {
                ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etLicencePlate)).setText(vehicles.get(0).getNumber());
                ((TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBrand)).setText(vehicles.get(0).getBrand());
                return;
            }
            return;
        }
        TextInputLayout textInputLayout3 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilNumber);
        Intrinsics.checkNotNullExpressionValue(textInputLayout3, "tilNumber");
        textInputLayout3.setVisibility(8);
        TextInputLayout textInputLayout4 = (TextInputLayout) _$_findCachedViewById(C5619R.C5622id.tilBrand);
        Intrinsics.checkNotNullExpressionValue(textInputLayout4, "tilBrand");
        textInputLayout4.setVisibility(8);
    }

    public void onPause() {
        super.onPause();
        saveValues();
    }

    /* access modifiers changed from: private */
    public final void saveValues() {
        ArrayList arrayList;
        CreateAnotherPassRequestBody createAnotherPassBody = getPassViewModel().getCreateAnotherPassBody();
        TextInputEditText textInputEditText = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etName");
        createAnotherPassBody.setName(String.valueOf(textInputEditText.getText()));
        TextInputEditText textInputEditText2 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etSurname);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etSurname");
        createAnotherPassBody.setSurname(String.valueOf(textInputEditText2.getText()));
        TextInputEditText textInputEditText3 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etCompany);
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "etCompany");
        createAnotherPassBody.setCompany(String.valueOf(textInputEditText3.getText()));
        TextInputEditText textInputEditText4 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etPatronymic);
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "etPatronymic");
        createAnotherPassBody.setPatronymic(String.valueOf(textInputEditText4.getText()));
        createAnotherPassBody.setPhone(((PhoneMaskedEditText) _$_findCachedViewById(C5619R.C5622id.etPhone)).getValue());
        if (createAnotherPassBody.getCategory() == 1) {
            arrayList = new ArrayList();
            TextInputEditText textInputEditText5 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etBrand);
            Intrinsics.checkNotNullExpressionValue(textInputEditText5, "etBrand");
            String valueOf = String.valueOf(textInputEditText5.getText());
            TextInputEditText textInputEditText6 = (TextInputEditText) _$_findCachedViewById(C5619R.C5622id.etLicencePlate);
            Intrinsics.checkNotNullExpressionValue(textInputEditText6, "etLicencePlate");
            arrayList.add(new VehicleData(valueOf, String.valueOf(textInputEditText6.getText())));
        } else {
            arrayList = null;
        }
        createAnotherPassBody.setVehicles(arrayList);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassThirdFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/fragments/anotherPass/fragments/AnotherPassThirdFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassThirdFragment$Companion */
    /* compiled from: AnotherPassThirdFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final AnotherPassThirdFragment newInstance() {
            return new AnotherPassThirdFragment();
        }
    }
}
