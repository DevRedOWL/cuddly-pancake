package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;

/* renamed from: ru.unicorn.databinding.ActivityRegistrationBinding */
public abstract class ActivityRegistrationBinding extends ViewDataBinding {
    public final Barrier barrier;
    public final LinearLayout bottomView;
    public final DynamicBackgroundButton buttonEnter;
    public final CheckBox cbTerms;
    public final EditText etLogin;
    public final EditText etPassword;
    public final PhoneMaskedEditText etPhone;
    public final AppCompatImageView imageBack;
    public final AppCompatImageView imageBigLogo;
    public final ImageView ivEye;
    public final ConstraintLayout layoutCheckTermsOfUse;
    public final ConstraintLayout layoutRemindPassword;
    public final ConstraintLayout linearLayoutLoginPwdID;
    @Bindable
    protected Boolean mBackIsVisible;
    @Bindable
    protected Boolean mIsDemoButtonEnabled;
    @Bindable
    protected ProfileViewModel mVm;
    public final ConstraintLayout passwordLayout;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayoutMainID;
    public final TabLayout tabLayoutLoginRegister;
    public final TabItem tabLogin;
    public final TabItem tabRegister;
    public final TextView textRemindPassword;
    public final TextView tvCheckTerms;
    public final TextView tvDemo;
    public final TextView tvLoginHint;
    public final TextView tvLoginTerms;

    public abstract void setBackIsVisible(Boolean bool);

    public abstract void setIsDemoButtonEnabled(Boolean bool);

    public abstract void setVm(ProfileViewModel profileViewModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected ActivityRegistrationBinding(Object obj, View view, int i, Barrier barrier2, LinearLayout linearLayout, DynamicBackgroundButton dynamicBackgroundButton, CheckBox checkBox, EditText editText, EditText editText2, PhoneMaskedEditText phoneMaskedEditText, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ImageView imageView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ProgressBar progressBar2, RelativeLayout relativeLayout, TabLayout tabLayout, TabItem tabItem, TabItem tabItem2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.barrier = barrier2;
        this.bottomView = linearLayout;
        this.buttonEnter = dynamicBackgroundButton;
        this.cbTerms = checkBox;
        this.etLogin = editText;
        this.etPassword = editText2;
        this.etPhone = phoneMaskedEditText;
        this.imageBack = appCompatImageView;
        this.imageBigLogo = appCompatImageView2;
        this.ivEye = imageView;
        this.layoutCheckTermsOfUse = constraintLayout;
        this.layoutRemindPassword = constraintLayout2;
        this.linearLayoutLoginPwdID = constraintLayout3;
        this.passwordLayout = constraintLayout4;
        this.progressBar = progressBar2;
        this.relativeLayoutMainID = relativeLayout;
        this.tabLayoutLoginRegister = tabLayout;
        this.tabLogin = tabItem;
        this.tabRegister = tabItem2;
        this.textRemindPassword = textView;
        this.tvCheckTerms = textView2;
        this.tvDemo = textView3;
        this.tvLoginHint = textView4;
        this.tvLoginTerms = textView5;
    }

    public Boolean getBackIsVisible() {
        return this.mBackIsVisible;
    }

    public Boolean getIsDemoButtonEnabled() {
        return this.mIsDemoButtonEnabled;
    }

    public ProfileViewModel getVm() {
        return this.mVm;
    }

    public static ActivityRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegistrationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ActivityRegistrationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_registration, viewGroup, z, obj);
    }

    public static ActivityRegistrationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegistrationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ActivityRegistrationBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_registration, (ViewGroup) null, false, obj);
    }

    public static ActivityRegistrationBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityRegistrationBinding bind(View view, Object obj) {
        return (ActivityRegistrationBinding) bind(obj, view, R.layout.activity_registration);
    }
}
