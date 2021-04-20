package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.jakewharton.rxbinding2.view.RxView;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicetCompleteFragment */
public class DomServicetCompleteFragment extends BaseFragment {
    private DomServiceViewModel domServiceViewModel;
    private Button sendButton;
    private DomServiceViewModel viewModelFactory;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_dom_complete;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DomServicetCompleteFragment start(int i) {
        DomServicetCompleteFragment domServicetCompleteFragment = new DomServicetCompleteFragment();
        new Bundle();
        return domServicetCompleteFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.sendButton = (Button) inflate.findViewById(R.id.send);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.domServiceViewModel = (DomServiceViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) DomServiceViewmodelFactory.getInstance()).get(DomServiceViewModel.class);
        RxView.clicks(this.sendButton).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DomServicetCompleteFragment.this.lambda$onViewCreated$0$DomServicetCompleteFragment(obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewCreated$0$DomServicetCompleteFragment(Object obj) throws Exception {
        onTicketClick();
    }

    private void onTicketClick() {
        nextFragment(SmartNavFragment.start(3), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.label_connection_request_compleate));
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
