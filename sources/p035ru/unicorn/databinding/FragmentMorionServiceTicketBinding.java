package p035ru.unicorn.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

/* renamed from: ru.unicorn.databinding.FragmentMorionServiceTicketBinding */
public abstract class FragmentMorionServiceTicketBinding extends ViewDataBinding {
    public final DynamicBackgroundButton btnConfirm;
    public final DynamicBackgroundButton btnGoChat;
    public final DynamicBackgroundButton btnReturn;
    public final ItemLabelUnderlineWithArrowBinding first;
    public final ItemLabelValueBinding fiveth;
    public final ItemLabelValueBinding fourth;

    /* renamed from: ll */
    public final LinearLayout f6574ll;
    @Bindable
    protected ServiceTicket mTicket;
    public final ProgressBar progressBar;
    public final RecyclerView rvFileList;
    public final ItemLabelValueBinding second;
    public final ItemLabelValueBinding third;
    public final ConstraintLayout ticketLayout;
    public final TextView tvFilesTitle;
    public final TextView tvTicketNumber;
    public final TextView tvTicketTitle;

    public abstract void setTicket(ServiceTicket serviceTicket);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentMorionServiceTicketBinding(Object obj, View view, int i, DynamicBackgroundButton dynamicBackgroundButton, DynamicBackgroundButton dynamicBackgroundButton2, DynamicBackgroundButton dynamicBackgroundButton3, ItemLabelUnderlineWithArrowBinding itemLabelUnderlineWithArrowBinding, ItemLabelValueBinding itemLabelValueBinding, ItemLabelValueBinding itemLabelValueBinding2, LinearLayout linearLayout, ProgressBar progressBar2, RecyclerView recyclerView, ItemLabelValueBinding itemLabelValueBinding3, ItemLabelValueBinding itemLabelValueBinding4, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.btnConfirm = dynamicBackgroundButton;
        this.btnGoChat = dynamicBackgroundButton2;
        this.btnReturn = dynamicBackgroundButton3;
        this.first = itemLabelUnderlineWithArrowBinding;
        setContainedBinding(this.first);
        this.fiveth = itemLabelValueBinding;
        setContainedBinding(this.fiveth);
        this.fourth = itemLabelValueBinding2;
        setContainedBinding(this.fourth);
        this.f6574ll = linearLayout;
        this.progressBar = progressBar2;
        this.rvFileList = recyclerView;
        this.second = itemLabelValueBinding3;
        setContainedBinding(this.second);
        this.third = itemLabelValueBinding4;
        setContainedBinding(this.third);
        this.ticketLayout = constraintLayout;
        this.tvFilesTitle = textView;
        this.tvTicketNumber = textView2;
        this.tvTicketTitle = textView3;
    }

    public ServiceTicket getTicket() {
        return this.mTicket;
    }

    public static FragmentMorionServiceTicketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMorionServiceTicketBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentMorionServiceTicketBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_morion_service_ticket, viewGroup, z, obj);
    }

    public static FragmentMorionServiceTicketBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMorionServiceTicketBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentMorionServiceTicketBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_morion_service_ticket, (ViewGroup) null, false, obj);
    }

    public static FragmentMorionServiceTicketBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentMorionServiceTicketBinding bind(View view, Object obj) {
        return (FragmentMorionServiceTicketBinding) bind(obj, view, R.layout.fragment_morion_service_ticket);
    }
}
