package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.view.View;
import android.widget.PopupMenu;
import androidx.fragment.app.FragmentActivity;
import com.afollestad.materialdialogs.DialogBehavior;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseBindingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.FullProfileMapper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0006H\u0014J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014J\u001b\u0010\u0014\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0010H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/ApplicationToCompanyFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/BaseBindingFragment;", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/PassCompanyVM;", "Lru/unicorn/databinding/FragmentApplicationToCompanyBinding;", "()V", "enterpriseId", "", "enterpriseTitle", "getGenderValue", "title", "getLayoutRes", "", "getMyToolbarTitle", "isValid", "", "onFileChoose", "", "filePath", "onViewCreated", "viewModell", "showGenderDialog", "values", "", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/FullProfileMapper$GENDER;", "([Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/FullProfileMapper$GENDER;)V", "showSuccessMessage", "Companion", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment */
/* compiled from: ApplicationToCompanyFragment.kt */
public final class ApplicationToCompanyFragment extends BaseBindingFragment<PassCompanyVM, FragmentApplicationToCompanyBinding> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    /* access modifiers changed from: private */
    public String enterpriseId;
    /* access modifiers changed from: private */
    public String enterpriseTitle;

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
    public int getLayoutRes() {
        return R.layout.fragment_application_to_company;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onFileChoose(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        r3 = (r3 = r6.getApplicationToCompanyBodyObservable()).get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM r6) {
        /*
            r5 = this;
            androidx.databinding.ViewDataBinding r0 = r5.getViewDataBinding()
            ru.unicorn.databinding.FragmentApplicationToCompanyBinding r0 = (p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding) r0
            java.lang.String r1 = "viewDataBinding"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r0.setVm(r6)
            java.lang.String r0 = r5.enterpriseId
            if (r0 == 0) goto L_0x0041
            if (r6 == 0) goto L_0x0017
            r6.clearApplicationToCompanyBody()
        L_0x0017:
            if (r6 == 0) goto L_0x002a
            androidx.databinding.ObservableField r1 = r6.getApplicationToCompanyBodyObservable()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r1.get()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody) r1
            if (r1 == 0) goto L_0x002a
            r1.setEnterpriseId(r0)
        L_0x002a:
            java.lang.String r0 = r5.enterpriseTitle
            if (r0 == 0) goto L_0x0041
            if (r6 == 0) goto L_0x0041
            androidx.databinding.ObservableField r1 = r6.getApplicationToCompanyBodyObservable()
            if (r1 == 0) goto L_0x0041
            java.lang.Object r1 = r1.get()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody) r1
            if (r1 == 0) goto L_0x0041
            r1.setEnterpriseTitle(r0)
        L_0x0041:
            if (r6 == 0) goto L_0x0057
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r6.getShowSuccess()
            if (r0 == 0) goto L_0x0057
            androidx.lifecycle.LifecycleOwner r1 = r5.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$2 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$2
            r2.<init>(r5)
            androidx.lifecycle.Observer r2 = (androidx.lifecycle.Observer) r2
            r0.observe(r1, r2)
        L_0x0057:
            if (r6 == 0) goto L_0x006b
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r6.showError
            if (r0 == 0) goto L_0x006b
            androidx.lifecycle.LifecycleOwner r1 = r5.getViewLifecycleOwner()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$3 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$3
            r2.<init>(r5)
            androidx.lifecycle.Observer r2 = (androidx.lifecycle.Observer) r2
            r0.observe(r1, r2)
        L_0x006b:
            androidx.databinding.ViewDataBinding r0 = r5.getViewDataBinding()
            ru.unicorn.databinding.FragmentApplicationToCompanyBinding r0 = (p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding) r0
            ru.unicorn.ujin.view.customViews.DynamicBackgroundButton r0 = r0.btnSendApp
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$4 r1 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$4
            r1.<init>(r5, r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            androidx.databinding.ViewDataBinding r0 = r5.getViewDataBinding()
            ru.unicorn.databinding.FragmentApplicationToCompanyBinding r0 = (p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding) r0
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r0 = r0.birthday
            com.google.android.material.textfield.TextInputEditText r0 = r0.etValue
            r1 = 0
            r0.setFocusable(r1)
            r2 = 0
            if (r6 == 0) goto L_0x00a1
            androidx.databinding.ObservableField r3 = r6.getApplicationToCompanyBodyObservable()
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r3 = r3.get()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r3 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody) r3
            if (r3 == 0) goto L_0x00a1
            java.lang.String r3 = r3.getBirthday()
            goto L_0x00a2
        L_0x00a1:
            r3 = r2
        L_0x00a2:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x00af
            boolean r3 = kotlin.text.StringsKt.isBlank(r3)
            if (r3 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r3 = 0
            goto L_0x00b0
        L_0x00af:
            r3 = 1
        L_0x00b0:
            if (r3 != 0) goto L_0x00e8
            if (r6 == 0) goto L_0x00c6
            androidx.databinding.ObservableField r3 = r6.getApplicationToCompanyBodyObservable()
            if (r3 == 0) goto L_0x00c6
            java.lang.Object r3 = r3.get()
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.request.ApplicationToCompanyBody r3 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.request.ApplicationToCompanyBody) r3
            if (r3 == 0) goto L_0x00c6
            java.lang.String r2 = r3.getBirthday()
        L_0x00c6:
            java.lang.String r3 = "yyyy-MM-dd"
            java.util.Calendar r2 = p035ru.unicorn.ujin.util.DateUtils.parseDate(r2, r3)
            androidx.databinding.ViewDataBinding r3 = r5.getViewDataBinding()
            ru.unicorn.databinding.FragmentApplicationToCompanyBinding r3 = (p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding) r3
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r3 = r3.birthday
            com.google.android.material.textfield.TextInputEditText r3 = r3.etValue
            java.lang.String r4 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.util.Date r2 = r2.getTime()
            java.lang.String r2 = p035ru.unicorn.ujin.util.DateUtils.formatDate((java.util.Date) r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
        L_0x00e8:
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$$inlined$apply$lambda$1 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$$inlined$apply$lambda$1
            r2.<init>(r5, r6)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            androidx.databinding.ViewDataBinding r6 = r5.getViewDataBinding()
            ru.unicorn.databinding.FragmentApplicationToCompanyBinding r6 = (p035ru.unicorn.databinding.FragmentApplicationToCompanyBinding) r6
            ru.unicorn.databinding.ItemApplicationToCompanyBinding r6 = r6.gender
            com.google.android.material.textfield.TextInputEditText r6 = r6.etValue
            r6.setFocusable(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$$inlined$apply$lambda$2 r0 = new ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$onViewCreated$$inlined$apply$lambda$2
            r0.<init>(r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.ApplicationToCompanyFragment.onViewCreated(ru.unicorn.ujin.view.activity.navigation.ui.pass.company.PassCompanyVM):void");
    }

    /* access modifiers changed from: private */
    public final void showGenderDialog(FullProfileMapper.GENDER[] genderArr) {
        PopupMenu popupMenu = new PopupMenu(getContext(), ((FragmentApplicationToCompanyBinding) getViewDataBinding()).gender.etValue);
        int length = genderArr.length;
        for (int i = 0; i < length; i++) {
            popupMenu.getMenu().add(i, R.id.menu, i, genderArr[i].getVal());
        }
        popupMenu.setOnMenuItemClickListener(new ApplicationToCompanyFragment$showGenderDialog$1(this));
        popupMenu.show();
    }

    /* access modifiers changed from: private */
    public final String getGenderValue(String str) {
        CharSequence charSequence = str;
        if (!(charSequence == null || StringsKt.isBlank(charSequence)) && str.length() >= 3) {
            FullProfileMapper.GENDER[] values = FullProfileMapper.GENDER.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                FullProfileMapper.GENDER gender = values[i];
                if (!Intrinsics.areEqual((Object) gender.getVal(), (Object) str)) {
                    String val = gender.getVal();
                    Intrinsics.checkNotNullExpressionValue(val, "gender.getVal()");
                    CharSequence charSequence2 = val;
                    if (str != null) {
                        String substring = str.substring(0, 3);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (!StringsKt.contains$default(charSequence2, (CharSequence) substring, false, 2, (Object) null)) {
                            i++;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                String name = gender.name();
                if (name != null) {
                    String lowerCase = name.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return "";
    }

    /* access modifiers changed from: private */
    public final void showSuccessMessage() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            MaterialDialog.positiveButton$default(MaterialDialog.message$default(MaterialDialog.title$default(new MaterialDialog(activity, (DialogBehavior) null, 2, (DefaultConstructorMarker) null), Integer.valueOf(R.string.label_connect_success), (String) null, 2, (Object) null), Integer.valueOf(R.string.connect_company_message), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.return_to_cabinet), (CharSequence) null, new C5904x3d600e79(this), 2, (Object) null).show();
            return;
        }
    }

    public final boolean isValid() {
        boolean z;
        TextInputEditText textInputEditText = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).position.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "viewDataBinding.position.etValue");
        TextInputEditText textInputEditText2 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).surname.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "viewDataBinding.surname.etValue");
        TextInputEditText textInputEditText3 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).name.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText3, "viewDataBinding.name.etValue");
        TextInputEditText textInputEditText4 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).patronymic.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText4, "viewDataBinding.patronymic.etValue");
        TextInputEditText textInputEditText5 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).gender.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText5, "viewDataBinding.gender.etValue");
        TextInputEditText textInputEditText6 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).birthday.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText6, "viewDataBinding.birthday.etValue");
        TextInputEditText textInputEditText7 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).email.etValue;
        Intrinsics.checkNotNullExpressionValue(textInputEditText7, "viewDataBinding.email.etValue");
        CharSequence valueOf = String.valueOf(textInputEditText.getText());
        boolean z2 = true;
        if (valueOf == null || StringsKt.isBlank(valueOf)) {
            textInputEditText.requestFocus();
            TextInputLayout textInputLayout = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).position.tilValue;
            Intrinsics.checkNotNullExpressionValue(textInputLayout, "viewDataBinding.position.tilValue");
            textInputLayout.setError(getResources().getString(R.string.label_compulsory_field));
            z = false;
        } else {
            z = true;
        }
        CharSequence valueOf2 = String.valueOf(textInputEditText2.getText());
        if (valueOf2 == null || StringsKt.isBlank(valueOf2)) {
            if (z) {
                textInputEditText2.requestFocus();
            }
            TextInputLayout textInputLayout2 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).surname.tilValue;
            Intrinsics.checkNotNullExpressionValue(textInputLayout2, "viewDataBinding.surname.tilValue");
            textInputLayout2.setError(getResources().getString(R.string.label_compulsory_field));
            z = false;
        }
        CharSequence valueOf3 = String.valueOf(textInputEditText3.getText());
        if (valueOf3 == null || StringsKt.isBlank(valueOf3)) {
            if (z) {
                textInputEditText3.requestFocus();
            }
            TextInputLayout textInputLayout3 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).name.tilValue;
            Intrinsics.checkNotNullExpressionValue(textInputLayout3, "viewDataBinding.name.tilValue");
            textInputLayout3.setError(getResources().getString(R.string.label_compulsory_field));
            z = false;
        }
        CharSequence valueOf4 = String.valueOf(textInputEditText4.getText());
        if (valueOf4 == null || StringsKt.isBlank(valueOf4)) {
            if (z) {
                textInputEditText4.requestFocus();
            }
            TextInputLayout textInputLayout4 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).patronymic.tilValue;
            Intrinsics.checkNotNullExpressionValue(textInputLayout4, "viewDataBinding.patronymic.tilValue");
            textInputLayout4.setError(getResources().getString(R.string.label_compulsory_field));
            z = false;
        }
        CharSequence valueOf5 = String.valueOf(textInputEditText5.getText());
        if (valueOf5 == null || StringsKt.isBlank(valueOf5)) {
            if (z) {
                textInputEditText5.requestFocus();
            }
            TextInputLayout textInputLayout5 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).gender.tilValue;
            Intrinsics.checkNotNullExpressionValue(textInputLayout5, "viewDataBinding.gender.tilValue");
            textInputLayout5.setError(getResources().getString(R.string.label_compulsory_field));
            z = false;
        }
        CharSequence valueOf6 = String.valueOf(textInputEditText6.getText());
        if (valueOf6 == null || StringsKt.isBlank(valueOf6)) {
            if (z) {
                textInputEditText6.requestFocus();
            }
            TextInputLayout textInputLayout6 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).birthday.tilValue;
            Intrinsics.checkNotNullExpressionValue(textInputLayout6, "viewDataBinding.birthday.tilValue");
            textInputLayout6.setError(getResources().getString(R.string.label_compulsory_field));
            z = false;
        }
        CharSequence valueOf7 = String.valueOf(textInputEditText7.getText());
        if (valueOf7 != null && !StringsKt.isBlank(valueOf7)) {
            z2 = false;
        }
        if (!z2) {
            return z;
        }
        if (z) {
            textInputEditText7.requestFocus();
        }
        TextInputLayout textInputLayout7 = ((FragmentApplicationToCompanyBinding) getViewDataBinding()).email.tilValue;
        Intrinsics.checkNotNullExpressionValue(textInputLayout7, "viewDataBinding.email.tilValue");
        textInputLayout7.setError(getResources().getString(R.string.label_compulsory_field));
        return false;
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        String string = getString(R.string.fill_personal_information);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.fill_personal_information)");
        return string;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/ApplicationToCompanyFragment$Companion;", "", "()V", "newInstance", "Lru/unicorn/ujin/view/activity/navigation/ui/pass/company/ApplicationToCompanyFragment;", "enterpriseId", "", "enterpriseTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.ApplicationToCompanyFragment$Companion */
    /* compiled from: ApplicationToCompanyFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApplicationToCompanyFragment newInstance(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "enterpriseId");
            Intrinsics.checkNotNullParameter(str2, "enterpriseTitle");
            ApplicationToCompanyFragment applicationToCompanyFragment = new ApplicationToCompanyFragment();
            applicationToCompanyFragment.enterpriseId = str;
            applicationToCompanyFragment.enterpriseTitle = str2;
            return applicationToCompanyFragment;
        }
    }
}
