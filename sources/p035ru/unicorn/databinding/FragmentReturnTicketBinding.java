package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentReturnTicketBinding */
public abstract class FragmentReturnTicketBinding extends ViewDataBinding {
    public final RadioButton btnAnother;
    public final DynamicBackgroundButton btnConfirm;
    public final RadioButton btnNotDone;
    public final RadioButton btnNotFullyCompleted;
    public final TextInputEditText etComment;
    @Bindable
    protected HelpDeskViewModel mVm;
    public final ProgressBar progressBar;
    public final RadioGroup rgReason;
    public final TextInputLayout tilComment;
    public final TextView tvTitle;

    public abstract void setVm(HelpDeskViewModel helpDeskViewModel);

    protected FragmentReturnTicketBinding(Object obj, View view, int i, RadioButton radioButton, DynamicBackgroundButton dynamicBackgroundButton, RadioButton radioButton2, RadioButton radioButton3, TextInputEditText textInputEditText, ProgressBar progressBar2, RadioGroup radioGroup, TextInputLayout textInputLayout, TextView textView) {
        super(obj, view, i);
        this.btnAnother = radioButton;
        this.btnConfirm = dynamicBackgroundButton;
        this.btnNotDone = radioButton2;
        this.btnNotFullyCompleted = radioButton3;
        this.etComment = textInputEditText;
        this.progressBar = progressBar2;
        this.rgReason = radioGroup;
        this.tilComment = textInputLayout;
        this.tvTitle = textView;
    }

    public HelpDeskViewModel getVm() {
        return this.mVm;
    }

    public static FragmentReturnTicketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentReturnTicketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentReturnTicketBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_return_ticket, viewGroup, z, obj);
    }

    public static FragmentReturnTicketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentReturnTicketBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentReturnTicketBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_return_ticket, (ViewGroup) null, false, obj);
    }

    public static FragmentReturnTicketBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentReturnTicketBinding bind(View view, Object obj) {
        return (FragmentReturnTicketBinding) bind(obj, view, R.layout.fragment_return_ticket);
    }
}
