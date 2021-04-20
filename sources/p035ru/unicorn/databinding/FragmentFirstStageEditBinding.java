package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFirstStageEditBinding */
public abstract class FragmentFirstStageEditBinding extends ViewDataBinding {
    public final TextInputEditText editName;
    public final TextInputEditText editPatronimic;
    public final TextInputEditText editSurname;
    public final Guideline guideline4;

    /* renamed from: ll */
    public final LinearLayout f6568ll;
    @Bindable
    protected RecordsViewModel mVm;
    public final DynamicBackgroundButton nextBtn;
    public final TextInputLayout tilName;
    public final TextInputLayout tilPatronymic;
    public final TextInputLayout tilSurname;
    public final TextView tvLabelFio;
    public final TextView tvStage;

    public abstract void setVm(RecordsViewModel recordsViewModel);

    protected FragmentFirstStageEditBinding(Object obj, View view, int i, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3, Guideline guideline, LinearLayout linearLayout, DynamicBackgroundButton dynamicBackgroundButton, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.editName = textInputEditText;
        this.editPatronimic = textInputEditText2;
        this.editSurname = textInputEditText3;
        this.guideline4 = guideline;
        this.f6568ll = linearLayout;
        this.nextBtn = dynamicBackgroundButton;
        this.tilName = textInputLayout;
        this.tilPatronymic = textInputLayout2;
        this.tilSurname = textInputLayout3;
        this.tvLabelFio = textView;
        this.tvStage = textView2;
    }

    public RecordsViewModel getVm() {
        return this.mVm;
    }

    public static FragmentFirstStageEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFirstStageEditBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentFirstStageEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_first_stage_edit, viewGroup, z, obj);
    }

    public static FragmentFirstStageEditBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFirstStageEditBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentFirstStageEditBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_first_stage_edit, (ViewGroup) null, false, obj);
    }

    public static FragmentFirstStageEditBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFirstStageEditBinding bind(View view, Object obj) {
        return (FragmentFirstStageEditBinding) bind(obj, view, R.layout.fragment_first_stage_edit);
    }
}
