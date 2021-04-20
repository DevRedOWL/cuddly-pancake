package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;

/* renamed from: ru.unicorn.databinding.FragmentFourthStageBinding */
public abstract class FragmentFourthStageBinding extends ViewDataBinding {
    public final DynamicBackgroundButton changeBtn;
    public final TextInputEditText etTitleTicket;
    @Bindable
    protected RecordsViewModel mVm;
    public final DynamicBackgroundButton nextBtn;

    /* renamed from: pb */
    public final ProgressBar f6569pb;

    /* renamed from: rv */
    public final RecyclerView f6570rv;

    /* renamed from: sv */
    public final ScrollView f6571sv;
    public final TextInputLayout tilTitle;
    public final TextView tvLabelFio;
    public final TextView tvStage;
    public final View underline;

    public abstract void setVm(RecordsViewModel recordsViewModel);

    protected FragmentFourthStageBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, TextInputEditText textInputEditText, DynamicBackgroundButton dynamicBackgroundButton2, ProgressBar progressBar, RecyclerView recyclerView, ScrollView scrollView, TextInputLayout textInputLayout, TextView textView, TextView textView2, View view2) {
        super(obj, view, i);
        this.changeBtn = dynamicBackgroundButton;
        this.etTitleTicket = textInputEditText;
        this.nextBtn = dynamicBackgroundButton2;
        this.f6569pb = progressBar;
        this.f6570rv = recyclerView;
        this.f6571sv = scrollView;
        this.tilTitle = textInputLayout;
        this.tvLabelFio = textView;
        this.tvStage = textView2;
        this.underline = view2;
    }

    public RecordsViewModel getVm() {
        return this.mVm;
    }

    public static FragmentFourthStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFourthStageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentFourthStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_fourth_stage, viewGroup, z, obj);
    }

    public static FragmentFourthStageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFourthStageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentFourthStageBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_fourth_stage, (ViewGroup) null, false, obj);
    }

    public static FragmentFourthStageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFourthStageBinding bind(View view, Object obj) {
        return (FragmentFourthStageBinding) bind(obj, view, R.layout.fragment_fourth_stage);
    }
}
