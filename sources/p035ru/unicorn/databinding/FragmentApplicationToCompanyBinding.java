package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentApplicationToCompanyBinding */
public abstract class FragmentApplicationToCompanyBinding extends ViewDataBinding {
    public final ItemApplicationToCompanyBinding birthday;
    public final DynamicBackgroundButton btnSendApp;
    public final ItemApplicationToCompanyBinding email;
    public final ItemApplicationToCompanyBinding gender;
    @Bindable
    protected PassCompanyVM mVm;
    public final ItemApplicationToCompanyBinding name;
    public final ItemApplicationToCompanyBinding patronymic;
    public final ProgressBar pbLoading;
    public final ItemApplicationToCompanyBinding position;
    public final ItemApplicationToCompanyBinding surname;

    public abstract void setVm(PassCompanyVM passCompanyVM);

    protected FragmentApplicationToCompanyBinding(Object obj, View view, int i, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding, DynamicBackgroundButton dynamicBackgroundButton, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding2, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding3, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding4, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding5, ProgressBar progressBar, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding6, ItemApplicationToCompanyBinding itemApplicationToCompanyBinding7) {
        super(obj, view, i);
        this.birthday = itemApplicationToCompanyBinding;
        setContainedBinding(this.birthday);
        this.btnSendApp = dynamicBackgroundButton;
        this.email = itemApplicationToCompanyBinding2;
        setContainedBinding(this.email);
        this.gender = itemApplicationToCompanyBinding3;
        setContainedBinding(this.gender);
        this.name = itemApplicationToCompanyBinding4;
        setContainedBinding(this.name);
        this.patronymic = itemApplicationToCompanyBinding5;
        setContainedBinding(this.patronymic);
        this.pbLoading = progressBar;
        this.position = itemApplicationToCompanyBinding6;
        setContainedBinding(this.position);
        this.surname = itemApplicationToCompanyBinding7;
        setContainedBinding(this.surname);
    }

    public PassCompanyVM getVm() {
        return this.mVm;
    }

    public static FragmentApplicationToCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentApplicationToCompanyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentApplicationToCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_application_to_company, viewGroup, z, obj);
    }

    public static FragmentApplicationToCompanyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentApplicationToCompanyBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentApplicationToCompanyBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_application_to_company, (ViewGroup) null, false, obj);
    }

    public static FragmentApplicationToCompanyBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentApplicationToCompanyBinding bind(View view, Object obj) {
        return (FragmentApplicationToCompanyBinding) bind(obj, view, R.layout.fragment_application_to_company);
    }
}
