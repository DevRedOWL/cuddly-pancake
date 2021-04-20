package p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.Validator;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ver2.SelectorAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ver2.WordsAdapter;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonConnectionTicketFragment */
public class DomofonConnectionTicketFragment extends BaseFragment {
    private Button btn;
    private DomofonPrikamyaViewModel domofonPrikamyaViewModel;

    /* renamed from: pb */
    private ProgressBar f6765pb;

    /* renamed from: rv */
    private RecyclerView f6766rv;
    private SelectorAdapter selectorAdapter;
    private WordsAdapter wordsAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_domofon_prokamya_conn;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static DomofonConnectionTicketFragment start() {
        DomofonConnectionTicketFragment domofonConnectionTicketFragment = new DomofonConnectionTicketFragment();
        domofonConnectionTicketFragment.setArguments(new Bundle());
        return domofonConnectionTicketFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6766rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6765pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btn = (Button) inflate.findViewById(R.id.btn_make);
        this.btn.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                DomofonConnectionTicketFragment.this.lambda$onCreateView$0$DomofonConnectionTicketFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$DomofonConnectionTicketFragment(View view) {
        onBtnClick();
    }

    private void onBtnClick() {
        List data = this.wordsAdapter.getData();
        int i = 0;
        while (i < data.size()) {
            if (!((ServiceFields) data.get(i)).getRequired().booleanValue() || (((ServiceFields) data.get(i)).getValue() != null && !((ServiceFields) data.get(i)).getValue().isEmpty())) {
                if (((ServiceFields) data.get(i)).getType().equals("phone")) {
                    if (((ServiceFields) data.get(i)).getValue() == null || ((ServiceFields) data.get(i)).getValue().isEmpty()) {
                        this.wordsAdapter.showError(i, "обязательное поле");
                        return;
                    } else if (!Validator.isPhoneValid(((ServiceFields) data.get(i)).getValue())) {
                        this.wordsAdapter.showError(i, "Формат телефона не верный");
                        return;
                    }
                }
                if (((ServiceFields) data.get(i)).getType().equals("email")) {
                    if (((ServiceFields) data.get(i)).getValue() == null || ((ServiceFields) data.get(i)).getValue().isEmpty()) {
                        this.wordsAdapter.showError(i, "обязательное поле");
                        return;
                    } else if (!Validator.isEmailValid(((ServiceFields) data.get(i)).getValue())) {
                        this.wordsAdapter.showError(i, "Формат электронной почты не верный");
                        return;
                    }
                }
                i++;
            } else {
                this.wordsAdapter.showError(i, "обязательное поле");
                return;
            }
        }
        this.domofonPrikamyaViewModel.sendData(data);
        this.domofonPrikamyaViewModel.getSendDataResult().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DomofonConnectionTicketFragment.this.showResult((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonConnectionTicketFragment$1 */
    static /* synthetic */ class C58241 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.DomofonConnectionTicketFragment.C58241.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showResult(Resource<Void> resource) {
        if (resource != null) {
            int i = C58241.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6765pb.setVisibility(0);
            } else if (i == 2 || i == 3) {
                this.f6765pb.setVisibility(8);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getContext(), resource.getMessage());
                createDialogBuilder.setPositiveButton((int) R.string.button_OK, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DomofonConnectionTicketFragment.this.lambda$showResult$1$DomofonConnectionTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            }
        }
    }

    public /* synthetic */ void lambda$showResult$1$DomofonConnectionTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    /* access modifiers changed from: private */
    public void onGetServiceFields(Resource<List<ServiceFields>> resource) {
        if (resource != null) {
            int i = C58241.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6765pb.setVisibility(0);
            } else if (i == 2) {
                this.f6765pb.setVisibility(8);
                this.wordsAdapter.setData(resource.getData());
            } else if (i == 3) {
                this.f6765pb.setVisibility(8);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getContext(), resource.getMessage());
                createDialogBuilder.setPositiveButton((int) R.string.button_OK, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DomofonConnectionTicketFragment.this.lambda$onGetServiceFields$2$DomofonConnectionTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            }
        }
    }

    public /* synthetic */ void lambda$onGetServiceFields$2$DomofonConnectionTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        initAdapter();
        this.domofonPrikamyaViewModel = (DomofonPrikamyaViewModel) ViewModelProviders.m10of((Fragment) this).get(DomofonPrikamyaViewModel.class);
        this.domofonPrikamyaViewModel.getService(1);
        this.domofonPrikamyaViewModel.getServiceFieldsMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                DomofonConnectionTicketFragment.this.onGetServiceFields((Resource) obj);
            }
        });
    }

    private void initAdapter() {
        this.f6766rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6766rv.addItemDecoration(new DividerItemDecoration(getActivity(), 1));
        if (this.wordsAdapter == null) {
            this.wordsAdapter = new WordsAdapter();
            this.wordsAdapter.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomofonConnectionTicketFragment.this.onSelectorClick(((Integer) obj).intValue());
                }
            });
        }
        if (this.selectorAdapter == null) {
            this.selectorAdapter = new SelectorAdapter();
            this.selectorAdapter.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    DomofonConnectionTicketFragment.this.onSelect(((Integer) obj).intValue());
                }
            });
        }
        this.f6766rv.setAdapter(this.wordsAdapter);
    }

    /* access modifiers changed from: private */
    public void onSelect(int i) {
        Integer value = this.domofonPrikamyaViewModel.getMutableLiveDataPosition().getValue();
        List list = (List) this.domofonPrikamyaViewModel.getServiceFieldsMutableLiveData().getValue().getData();
        ((ServiceFields) list.get(value.intValue())).setValue(((ServiceFields) list.get(value.intValue())).getItems().get(i).getValue());
        this.wordsAdapter.changeItem(value.intValue(), (ServiceFields) list.get(value.intValue()));
        this.f6766rv.setAdapter(this.wordsAdapter);
    }

    /* access modifiers changed from: private */
    public void onSelectorClick(int i) {
        this.domofonPrikamyaViewModel.getMutableLiveDataPosition().setValue(Integer.valueOf(i));
        this.selectorAdapter.setData(((ServiceFields) this.wordsAdapter.getData().get(i)).getItems());
        this.f6766rv.setAdapter(this.selectorAdapter);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_user_data));
    }
}
