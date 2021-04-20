package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;

/* renamed from: ru.unicorn.databinding.FragmentNewSubaccountBinding */
public abstract class FragmentNewSubaccountBinding extends ViewDataBinding {
    public final DynamicBackgroundButton btnNewSubAccount;
    public final TextInputEditText etComment;
    public final TextInputEditText etName;
    public final PhoneMaskedEditText etPhone;
    public final ProgressBar pbLoading;
    public final ItemFieldSpinnerBinding status;
    public final TextInputLayout tilComment;
    public final TextInputLayout tilNewPassword;
    public final TextInputLayout tilPhone;
    public final TabLayout tlAccessRights;
    public final TextView tvAccessRightsHint;

    protected FragmentNewSubaccountBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, PhoneMaskedEditText phoneMaskedEditText, ProgressBar progressBar, ItemFieldSpinnerBinding itemFieldSpinnerBinding, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TabLayout tabLayout, TextView textView) {
        super(obj, view, i);
        this.btnNewSubAccount = dynamicBackgroundButton;
        this.etComment = textInputEditText;
        this.etName = textInputEditText2;
        this.etPhone = phoneMaskedEditText;
        this.pbLoading = progressBar;
        this.status = itemFieldSpinnerBinding;
        setContainedBinding(this.status);
        this.tilComment = textInputLayout;
        this.tilNewPassword = textInputLayout2;
        this.tilPhone = textInputLayout3;
        this.tlAccessRights = tabLayout;
        this.tvAccessRightsHint = textView;
    }

    public static FragmentNewSubaccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentNewSubaccountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentNewSubaccountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_new_subaccount, viewGroup, z, obj);
    }

    public static FragmentNewSubaccountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentNewSubaccountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentNewSubaccountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_new_subaccount, (ViewGroup) null, false, obj);
    }

    public static FragmentNewSubaccountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentNewSubaccountBinding bind(View view, Object obj) {
        return (FragmentNewSubaccountBinding) bind(obj, view, R.layout.fragment_new_subaccount);
    }
}
