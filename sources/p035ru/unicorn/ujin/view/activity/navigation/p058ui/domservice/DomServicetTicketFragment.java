package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.jakewharton.rxbinding2.view.RxView;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.functions.Function;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServicetTicketFragment */
public class DomServicetTicketFragment extends BaseFragment {
    private DomServiceViewModel domServiceViewModel;
    private TextInputEditText etEtazh;
    private TextInputEditText etKvartira;
    private TextInputEditText etName;
    private TextInputEditText etNumber;
    private TextInputEditText etPodezd;
    private TextInputEditText etStreet;
    private TextInputEditText etTelephone;
    private Button sendButton;
    private TextInputLayout tilEtazh;
    private TextInputLayout tilKvartira;
    private TextInputLayout tilName;
    private TextInputLayout tilNumber;
    private TextInputLayout tilPodezd;
    private TextInputLayout tilStreet;
    private TextInputLayout tilTelephone;
    private DomServiceViewModel viewModelFactory;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_dom_ticket;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DomServicetTicketFragment start(int i) {
        DomServicetTicketFragment domServicetTicketFragment = new DomServicetTicketFragment();
        new Bundle();
        return domServicetTicketFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.etTelephone = (TextInputEditText) inflate.findViewById(R.id.et_telephone);
        this.tilTelephone = (TextInputLayout) inflate.findViewById(R.id.til_telephone);
        this.etName = (TextInputEditText) inflate.findViewById(R.id.et_name);
        this.tilName = (TextInputLayout) inflate.findViewById(R.id.til_title_name);
        this.etStreet = (TextInputEditText) inflate.findViewById(R.id.et_street);
        this.tilStreet = (TextInputLayout) inflate.findViewById(R.id.til_street);
        this.etNumber = (TextInputEditText) inflate.findViewById(R.id.et_number);
        this.tilNumber = (TextInputLayout) inflate.findViewById(R.id.til_number);
        this.etPodezd = (TextInputEditText) inflate.findViewById(R.id.et_podezd);
        this.tilPodezd = (TextInputLayout) inflate.findViewById(R.id.til_podezd);
        this.etEtazh = (TextInputEditText) inflate.findViewById(R.id.et_etazh);
        this.tilEtazh = (TextInputLayout) inflate.findViewById(R.id.til_etazh);
        this.etKvartira = (TextInputEditText) inflate.findViewById(R.id.et_kvartira);
        this.tilKvartira = (TextInputLayout) inflate.findViewById(R.id.til_kvartira);
        this.sendButton = (Button) inflate.findViewById(R.id.send);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.domServiceViewModel = (DomServiceViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) DomServiceViewmodelFactory.getInstance()).get(DomServiceViewModel.class);
        RxView.clicks(this.sendButton).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$0$DomServicetTicketFragment(obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$1$DomServicetTicketFragment((Boolean) obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$2$DomServicetTicketFragment((Boolean) obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$3$DomServicetTicketFragment((Boolean) obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$4$DomServicetTicketFragment((Boolean) obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$5$DomServicetTicketFragment((Boolean) obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).map(new Function() {
            public final Object apply(Object obj) {
                return DomServicetTicketFragment.this.lambda$onViewCreated$6$DomServicetTicketFragment((Boolean) obj);
            }
        }).filter($$Lambda$5rSgNjXAtgz3Ke0FNmbFJ3qRmtE.INSTANCE).subscribe(new Consumer() {
            public final void accept(Object obj) {
                DomServicetTicketFragment.this.lambda$onViewCreated$7$DomServicetTicketFragment((Boolean) obj);
            }
        });
    }

    public /* synthetic */ Boolean lambda$onViewCreated$0$DomServicetTicketFragment(Object obj) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etTelephone, this.tilTelephone));
    }

    public /* synthetic */ Boolean lambda$onViewCreated$1$DomServicetTicketFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etName, this.tilName));
    }

    public /* synthetic */ Boolean lambda$onViewCreated$2$DomServicetTicketFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etStreet, this.tilStreet));
    }

    public /* synthetic */ Boolean lambda$onViewCreated$3$DomServicetTicketFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etNumber, this.tilNumber));
    }

    public /* synthetic */ Boolean lambda$onViewCreated$4$DomServicetTicketFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etPodezd, this.tilPodezd));
    }

    public /* synthetic */ Boolean lambda$onViewCreated$5$DomServicetTicketFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etEtazh, this.tilEtazh));
    }

    public /* synthetic */ Boolean lambda$onViewCreated$6$DomServicetTicketFragment(Boolean bool) throws Exception {
        return Boolean.valueOf(Validator.validate(this.etKvartira, this.tilKvartira));
    }

    public /* synthetic */ void lambda$onViewCreated$7$DomServicetTicketFragment(Boolean bool) throws Exception {
        onTicketClick();
    }

    private void onTicketClick() {
        UIHelper.hideKeyboard(getContext(), this.sendButton);
        this.domServiceViewModel.sendTicketRequest();
        nextFragment(new DomServicetCompleteFragment(), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.label_connection_request));
        getBaseActivity().removeToolbarElevation();
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
