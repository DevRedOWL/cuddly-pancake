package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.ErrorCode;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicket;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListFragment */
public class CounterListFragment extends BaseFragment {
    private CounterListSection counterListSection;
    private CounterViewModel counterViewModel;
    private EmptySection emptySection;
    private boolean hasMonthDetail = false;

    /* renamed from: pb */
    private ProgressBar f6794pb;

    /* renamed from: rv */
    private RecyclerView f6795rv;
    private SectionedAdapter sectionedAdapter;
    private SendDataSection sendDataSection;
    private Button sendMeasures;
    private TextView tvNovification;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.counter_list_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6795rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.sendMeasures = (Button) inflate.findViewById(R.id.btn_send_measures);
        this.tvNovification = (TextView) inflate.findViewById(R.id.tvNotification);
        this.f6794pb = (ProgressBar) inflate.findViewById(R.id.pb);
        initAdapter();
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.counterViewModel = (CounterViewModel) ViewModelProviders.m10of((Fragment) this).get(CounterViewModel.class);
        this.counterViewModel.getMeasureList();
        this.counterViewModel.getMeasuresListResourceSingleEvent().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                CounterListFragment.this.showList((Resource) obj);
            }
        });
        this.counterViewModel.getShowLoader().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                CounterListFragment.this.lambda$onViewCreated$0$CounterListFragment((Boolean) obj);
            }
        });
        this.counterViewModel.getButtonParams();
    }

    public /* synthetic */ void lambda$onViewCreated$0$CounterListFragment(Boolean bool) {
        showLoader(bool, this.f6794pb);
    }

    /* access modifiers changed from: private */
    public void showButton(ActualCountersData actualCountersData) {
        this.sendMeasures.setText(actualCountersData.getButtonName());
        this.sendMeasures.setVisibility(0);
        if (actualCountersData.isShowButton()) {
            this.sendMeasures.setEnabled(true);
            this.tvNovification.setVisibility(8);
        } else {
            this.sendMeasures.setEnabled(false);
            this.tvNovification.setVisibility(0);
            if (actualCountersData.getNotification() != null) {
                this.tvNovification.setText(actualCountersData.getNotification());
            }
        }
        this.hasMonthDetail = actualCountersData.isHasAutomatedCommercialAccountingSystem();
        this.sendMeasures.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CounterListFragment.this.lambda$showButton$1$CounterListFragment(view);
            }
        });
        if (StringUtils.isNotBlank(actualCountersData.getErrorMessage())) {
            DialogHelper.showDialog((Context) getActivity(), actualCountersData.getErrorMessage());
        }
    }

    public /* synthetic */ void lambda$showButton$1$CounterListFragment(View view) {
        sendMeasures((Integer) null);
    }

    private void sendMeasures(Integer num) {
        if (!this.sendMeasures.getText().equals(getString(R.string.btn_send_measures))) {
            showSendValueList();
        } else if (checkHasNewValue(this.sendDataSection.getData())) {
            this.counterViewModel.sendMeasures(this.sendDataSection.getData(), this.hasMonthDetail, num);
            this.counterViewModel.getResultOnSendMeasures().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CounterListFragment.this.showResultOnMeasureSend((Resource) obj);
                }
            });
            this.counterViewModel.getResultOnSendMeasuresString().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    CounterListFragment.this.showResultOnMeasureSendString((Resource) obj);
                }
            });
        } else {
            showMessage("Заполните показания всех счетчиков");
        }
    }

    private boolean checkHasNewValue(List<MeasuresData> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCurrentValue().doubleValue() == Utils.DOUBLE_EPSILON) {
                return false;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).getCurrentValue().doubleValue() != -1.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListFragment$1 */
    static /* synthetic */ class C58501 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.CounterListFragment.C58501.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showResultOnMeasureSend(Resource<ServiceTicket> resource) {
        if (resource != null) {
            int i = C58501.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6794pb.setVisibility(0);
            } else if (i != 2) {
                if (i == 3) {
                    this.f6794pb.setVisibility(4);
                    if (ErrorCode.Companion.getCodeByValue(resource.getErrorCode()) == ErrorCode.INCORRECT_VALUE) {
                        showErrorDialog(resource.getMessage());
                        return;
                    } else {
                        DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f6794pb.setVisibility(4);
            FragmentActivity activity = getActivity();
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(activity, "По Вашему обращению создана заявка " + resource.getData().getTicketId());
            createDialogBuilder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CounterListFragment.this.lambda$showResultOnMeasureSend$2$CounterListFragment(dialogInterface, i);
                }
            });
            createDialogBuilder.create().show();
        }
    }

    public /* synthetic */ void lambda$showResultOnMeasureSend$2$CounterListFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    /* access modifiers changed from: private */
    public void showResultOnMeasureSendString(Resource<String> resource) {
        if (resource != null) {
            int i = C58501.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6794pb.setVisibility(0);
            } else if (i != 2) {
                if (i == 3) {
                    this.f6794pb.setVisibility(4);
                    if (ErrorCode.Companion.getCodeByValue(resource.getErrorCode()) == ErrorCode.INCORRECT_VALUE) {
                        showErrorDialog(resource.getMessage());
                        return;
                    } else {
                        DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f6794pb.setVisibility(4);
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), resource.getData());
            createDialogBuilder.setPositiveButton((int) R.string.button_ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    CounterListFragment.this.lambda$showResultOnMeasureSendString$3$CounterListFragment(dialogInterface, i);
                }
            });
            createDialogBuilder.create().show();
        }
    }

    public /* synthetic */ void lambda$showResultOnMeasureSendString$3$CounterListFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }

    public void showErrorDialog(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
        builder.setMessage((CharSequence) str);
        builder.setNegativeButton((int) R.string.button_cancel_2, (DialogInterface.OnClickListener) $$Lambda$CounterListFragment$8Uc74S3LMqfWtx_YEM1LRQRkyTo.INSTANCE);
        builder.setPositiveButton((int) R.string.send_measures, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                CounterListFragment.this.lambda$showErrorDialog$5$CounterListFragment(dialogInterface, i);
            }
        });
        builder.create().show();
    }

    public /* synthetic */ void lambda$showErrorDialog$5$CounterListFragment(DialogInterface dialogInterface, int i) {
        sendMeasures(1);
        dialogInterface.dismiss();
    }

    private void showSendValueList() {
        this.counterListSection.show(false);
        this.sendDataSection.show(true);
        this.sendMeasures.setText(R.string.btn_send_measures);
    }

    /* access modifiers changed from: private */
    public void showList(Resource<List<MeasuresData>> resource) {
        if (resource != null) {
            int i = C58501.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i != 2) {
                if (i == 3) {
                    DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
                }
            } else if (resource.getData() == null || resource.getData().isEmpty()) {
                this.emptySection.setData(new SomeString("Нет данных для отображения"));
            } else {
                this.counterListSection.setData(resource.getData());
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < resource.getData().size(); i2++) {
                    arrayList.add(((MeasuresData) resource.getData().get(i2)).cloneForSending());
                }
                this.sendDataSection.setData(arrayList);
                this.counterViewModel.getActualCountersData().observe(this, new Observer() {
                    public final void onChanged(Object obj) {
                        CounterListFragment.this.showButton((ActualCountersData) obj);
                    }
                });
            }
        }
    }

    private void initAdapter() {
        this.f6795rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6795rv.addItemDecoration(new DividerItemDecoration(getActivity(), 1));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6795rv.setAdapter(this.sectionedAdapter);
        if (this.counterListSection == null) {
            this.counterListSection = new CounterListSection();
            this.counterListSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CounterListFragment.this.onItemClick((MeasuresData) obj);
                }
            });
        }
        if (this.sendDataSection == null) {
            this.sendDataSection = new SendDataSection();
            this.sendDataSection.show(false);
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
        }
        this.sectionedAdapter.addSection(this.counterListSection);
        this.sectionedAdapter.addSection(this.sendDataSection);
        this.sectionedAdapter.addSection(this.emptySection);
    }

    /* access modifiers changed from: private */
    public void onItemClick(MeasuresData measuresData) {
        nextFragment(CounterFragment.start(measuresData.getSignalId(), Boolean.valueOf(this.hasMonthDetail), measuresData.getTitle(), measuresData.getSerialNumber()), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_smart_8));
    }
}
