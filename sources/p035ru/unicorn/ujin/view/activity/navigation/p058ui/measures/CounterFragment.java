package p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.google.android.material.tabs.TabLayout;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterFragment */
public class CounterFragment extends BaseFragment implements View.OnClickListener {
    private static final String ARG_HAS_MONTH_DETAIL = "arg_has_month_detail";
    private static final String ARG_SERIAL_NUMBER = "arg_sn";
    private static final String ARG_SIGNAL_ID = "arg_signal_id";
    private static final String ARG_TITLE = "arg_title";
    public static final int KVARTAL = 2;
    public static final int MOHTH = 1;
    public static final int WEEK = 0;
    public static final int YEARH = 3;
    private ImageView arrowLeft;
    private ImageView arrowRight;
    private TextView counterCurrentValue;
    /* access modifiers changed from: private */
    public CounterGraphSection counterGraphSection;
    private CounterLegendSection counterLegendSection;
    private CounterValueSection counterValueSection;
    /* access modifiers changed from: private */
    public CounterViewModel counterViewModel;
    private TextView dateTitle;
    /* access modifiers changed from: private */
    public long finish = 0;
    private boolean hasMonthDetail = false;
    @BindView(2131363521)
    private TabLayout layout;

    /* renamed from: rv */
    private RecyclerView f6793rv;
    private SectionedAdapter sectionedAdapter;
    private String serialNumber;
    /* access modifiers changed from: private */
    public String signalID;
    /* access modifiers changed from: private */
    public long start = 0;
    private ImageView status;
    TabLayout.OnTabSelectedListener tabSelectedListener = new TabLayout.OnTabSelectedListener() {
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            Calendar instance = Calendar.getInstance();
            instance.set(instance.get(1), instance.get(2), instance.get(5), 0, 0, 0);
            int intValue = Integer.valueOf(tab.getTag().toString()).intValue();
            if (intValue == 0) {
                CounterFragment.this.counterGraphSection.setType(0);
                long unused = CounterFragment.this.finish = instance.getTimeInMillis() / 1000;
                instance.set(7, 2);
                long unused2 = CounterFragment.this.start = instance.getTimeInMillis() / 1000;
            } else if (intValue == 1) {
                CounterFragment.this.counterGraphSection.setType(1);
                long unused3 = CounterFragment.this.finish = instance.getTimeInMillis() / 1000;
                instance.set(5, 1);
                long unused4 = CounterFragment.this.start = instance.getTimeInMillis() / 1000;
            } else if (intValue != 2) {
                if (intValue == 3) {
                    CounterFragment.this.counterGraphSection.setType(3);
                    long unused5 = CounterFragment.this.finish = instance.getTimeInMillis() / 1000;
                    instance.set(6, 1);
                    long unused6 = CounterFragment.this.start = instance.getTimeInMillis() / 1000;
                }
            } else if (CounterFragment.this.counterGraphSection.getType() != 2) {
                CounterFragment.this.counterGraphSection.setType(2);
                long unused7 = CounterFragment.this.finish = instance.getTimeInMillis() / 1000;
                int i = instance.get(2);
                if (i < 3) {
                    instance.set(2, 0);
                } else if (i < 6) {
                    instance.set(2, 3);
                } else if (i < 9) {
                    instance.set(2, 6);
                } else {
                    instance.set(2, 9);
                }
                instance.set(5, 1);
                long unused8 = CounterFragment.this.start = instance.getTimeInMillis() / 1000;
            }
            CounterFragment.this.counterViewModel.getMeasureV3(CounterFragment.this.signalID, Long.valueOf(CounterFragment.this.start), Long.valueOf(CounterFragment.this.finish));
            CounterFragment.this.counterViewModel.getTitle().setValue(Long.valueOf(CounterFragment.this.start * 1000));
            CounterFragment.this.checkAvailableNextDate();
        }
    };
    private String title;
    private TextView tvTitle;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.counter_fragment;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static CounterFragment start(String str, Boolean bool, String str2, String str3) {
        CounterFragment counterFragment = new CounterFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_SIGNAL_ID, str);
        bundle.putString("arg_title", str2);
        bundle.putString(ARG_SERIAL_NUMBER, str3);
        bundle.putBoolean(ARG_HAS_MONTH_DETAIL, bool.booleanValue());
        counterFragment.setArguments(bundle);
        return counterFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.counterViewModel = (CounterViewModel) ViewModelProviders.m10of((Fragment) this).get(CounterViewModel.class);
        this.counterViewModel.getDate().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                CounterFragment.this.showMeasureByDate((String) obj);
            }
        });
        this.counterViewModel.getTitle().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                CounterFragment.this.showTabTitle((Long) obj);
            }
        });
        this.counterViewModel.getTitle().setValue(Long.valueOf(Calendar.getInstance().getTimeInMillis()));
        this.counterViewModel.getPosition().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                CounterFragment.this.onChoosePosition((Integer) obj);
            }
        });
        this.counterViewModel.getMeasureResSingleEvent().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                CounterFragment.this.showValue((Resource) obj);
            }
        });
        return layoutInflater.inflate(getLayoutRes(), viewGroup, false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.layout = (TabLayout) view.findViewById(R.id.tab);
        this.dateTitle = (TextView) view.findViewById(R.id.text_date);
        this.f6793rv = (RecyclerView) view.findViewById(R.id.rv);
        this.arrowLeft = (ImageView) view.findViewById(R.id.arrow_left);
        this.arrowRight = (ImageView) view.findViewById(R.id.arrow_right);
        this.arrowRight.setEnabled(false);
        this.status = (ImageView) view.findViewById(R.id.iv_check);
        this.tvTitle = (TextView) view.findViewById(R.id.label_current);
        this.counterCurrentValue = (TextView) view.findViewById(R.id.value);
        this.hasMonthDetail = getArguments().getBoolean(ARG_HAS_MONTH_DETAIL, false);
        this.signalID = getArguments().getString(ARG_SIGNAL_ID, "0");
        this.title = getArguments().getString("arg_title", "0");
        this.serialNumber = getArguments().getString(ARG_SERIAL_NUMBER, "0");
        this.arrowRight.setOnClickListener(this);
        this.arrowLeft.setOnClickListener(this);
        initTabs();
        initAdapter();
        this.tabSelectedListener.onTabSelected(this.layout.getTabAt(0));
    }

    /* access modifiers changed from: private */
    public void onChoosePosition(Integer num) {
        Measures value = this.counterViewModel.getMeasures().getValue();
        if (value != null) {
            this.counterGraphSection.setPosition(num.intValue());
            this.counterGraphSection.setData(value);
            this.counterGraphSection.notifySectionChanged();
            this.counterLegendSection.setData(addColor(value, num.intValue()));
        }
    }

    /* access modifiers changed from: private */
    public void showTabTitle(Long l) {
        String str;
        TabLayout tabLayout = this.layout;
        int intValue = Integer.valueOf(tabLayout.getTabAt(tabLayout.getSelectedTabPosition()).getTag().toString()).intValue();
        if (intValue == 0) {
            str = DateUtils.getWeekPeriodByCurrentTime(l.longValue());
        } else if (intValue == 1) {
            str = DateUtils.getMonthPeriodByCurrentTime(l);
        } else if (intValue != 2) {
            str = intValue != 3 ? "" : DateUtils.getYearhPeriod(l);
        } else {
            str = DateUtils.getDecadePeriodByCurrentTime(l);
        }
        this.dateTitle.setText(str);
    }

    /* access modifiers changed from: private */
    public void showMeasureByDate(String str) {
        Calendar instance = Calendar.getInstance();
        instance.set(instance.get(1), instance.get(2), instance.get(5), 0, 0, 0);
        if (this.hasMonthDetail) {
            this.counterGraphSection.setType(0);
            instance.set(7, 2);
            this.counterViewModel.getMeasureV3(this.signalID, Long.valueOf(instance.getTimeInMillis() / 1000), Long.valueOf(instance.getTimeInMillis() / 1000));
            return;
        }
        this.counterGraphSection.setType(2);
        long timeInMillis = instance.getTimeInMillis() / 1000;
        int i = instance.get(2);
        if (i < 3) {
            instance.set(2, 0);
        } else if (i < 6) {
            instance.set(2, 3);
        } else if (i < 9) {
            instance.set(2, 6);
        } else {
            instance.set(2, 9);
        }
        instance.set(5, 1);
        this.counterViewModel.getMeasureV3(this.signalID, Long.valueOf(instance.getTimeInMillis() / 1000), Long.valueOf(timeInMillis));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterFragment$2 */
    static /* synthetic */ class C58492 {
        static final /* synthetic */ int[] $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = new int[Resource.Status.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                ru.unicorn.ujin.data.realm.Resource$Status[] r0 = p035ru.unicorn.ujin.data.realm.Resource.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status = r0
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x0014 }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x001f }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.CounterFragment.C58492.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showValue(Resource<Measures> resource) {
        if (resource != null) {
            int i = C58492.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.counterViewModel.getMeasures().setValue(resource.getData());
                Measures data = resource.getData();
                if (data != null) {
                    this.counterCurrentValue.setText(data.getLines().getCurrentValueCounter() + " " + data.getLines().getUnitName());
                    this.status.setImageResource(data.getLines().getCounterStatus().toLowerCase().equals("показания сверены") ? R.drawable.ic_svg_status_ok : R.drawable.ic_svg_status_alarma);
                    this.counterValueSection.show(false);
                    this.counterGraphSection.show(true);
                    this.counterGraphSection.setData(data);
                    this.counterLegendSection.show(false);
                }
            } else if (i == 2) {
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private List<Legend> addColor(Measures measures, int i) {
        List<Legend> list = measures.getLegend().get(i);
        for (int i2 = 0; i2 < measures.getGraph().get(i).getLines().size(); i2++) {
            list.get(i2).setColor(measures.getGraph().get(i).getLines().get(i2).getColor());
        }
        return list;
    }

    private Measures addSuum(Measures measures) {
        for (int i = 0; i < measures.getGraph().size(); i++) {
            List list = measures.getLegend().get(i);
            double d = 0.0d;
            for (int i2 = 0; i2 < list.size(); i2++) {
                d += ((Legend) list.get(i2)).getPrice().doubleValue();
            }
            measures.getGraph().get(i).setSum(new DecimalFormat("#0.00").format(d));
        }
        return measures;
    }

    private void initTabs() {
        TabLayout.Tab tag = this.layout.newTab().setText((CharSequence) "Неделя").setTag(0);
        TabLayout.Tab tag2 = this.layout.newTab().setText((CharSequence) "Месяц").setTag(1);
        TabLayout.Tab tag3 = this.layout.newTab().setText((CharSequence) "Квартал").setTag(2);
        TabLayout.Tab tag4 = this.layout.newTab().setText((CharSequence) "Год").setTag(3);
        boolean z = this.hasMonthDetail;
        if (z) {
            this.layout.addTab(tag, z);
            this.layout.addTab(tag2);
        }
        this.layout.addTab(tag3, !this.hasMonthDetail);
        this.layout.addTab(tag4);
        this.layout.addOnTabSelectedListener(this.tabSelectedListener);
    }

    private void setClickable(TabLayout tabLayout, int i, boolean z) {
        View childAt = tabLayout.getChildAt(i);
        childAt.setEnabled(false);
        childAt.setClickable(z);
    }

    private void initAdapter() {
        this.f6793rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6793rv.setAdapter(this.sectionedAdapter);
        if (this.counterValueSection == null) {
            this.counterValueSection = new CounterValueSection();
            this.counterValueSection.getOnClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CounterFragment.this.onValueClick((Integer) obj);
                }
            });
        }
        if (this.counterGraphSection == null) {
            this.counterGraphSection = new CounterGraphSection();
            this.counterGraphSection.show(false);
        }
        if (this.counterLegendSection == null) {
            this.counterLegendSection = new CounterLegendSection();
            this.counterLegendSection.show(false);
        }
        this.sectionedAdapter.addSection(this.counterValueSection);
        this.sectionedAdapter.addSection(this.counterGraphSection);
        this.sectionedAdapter.addSection(this.counterLegendSection);
    }

    /* access modifiers changed from: private */
    public void onValueClick(Integer num) {
        this.counterViewModel.getPosition().setValue(num);
        this.counterValueSection.show(false);
        this.counterGraphSection.show(true);
        this.counterLegendSection.show(true);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.arrow_left:
                changeDate(false);
                return;
            case R.id.arrow_right:
                changeDate(true);
                return;
            default:
                return;
        }
    }

    private void changeDate(boolean z) {
        TabLayout tabLayout = this.layout;
        int intValue = Integer.valueOf(tabLayout.getTabAt(tabLayout.getSelectedTabPosition()).getTag().toString()).intValue();
        if (intValue == 0) {
            this.counterGraphSection.setType(0);
            this.start = DateUtils.getRollWeekField(6, z, Long.valueOf(this.start * 1000), 7, true) / 1000;
            this.finish = DateUtils.getRollWeekField(6, z, Long.valueOf(this.finish * 1000), 7, false) / 1000;
        } else if (intValue == 1) {
            this.counterGraphSection.setType(1);
            this.start = DateUtils.getRollMonthField(2, z, Long.valueOf(this.start * 1000), 1, true) / 1000;
            this.finish = DateUtils.getRollMonthField(2, z, Long.valueOf(this.finish * 1000), 1, false) / 1000;
        } else if (intValue == 2) {
            this.counterGraphSection.setType(2);
            this.start = DateUtils.getRollDecadeField(2, z, Long.valueOf(this.start * 1000), 3, true) / 1000;
            this.finish = DateUtils.getRollDecadeField(2, z, Long.valueOf(this.finish * 1000), 3, false) / 1000;
        } else if (intValue == 3) {
            this.counterGraphSection.setType(3);
            this.start = DateUtils.getRollYeahField(1, z, Long.valueOf(this.start * 1000), 1, true) / 1000;
            this.finish = DateUtils.getRollYeahField(1, z, Long.valueOf(this.finish * 1000), 1, false) / 1000;
        }
        this.counterViewModel.getMeasureV3(this.signalID, Long.valueOf(this.start), Long.valueOf(this.finish));
        this.counterViewModel.getTitle().setValue(Long.valueOf(this.start * 1000));
        checkAvailableNextDate();
    }

    /* access modifiers changed from: private */
    public void checkAvailableNextDate() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.start * 1000);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(this.finish * 1000);
        if (DateUtils.isSameDate(Calendar.getInstance(), instance) || DateUtils.isSameDate(Calendar.getInstance(), instance2)) {
            this.arrowRight.setColorFilter(getResources().getColor(R.color.gray_1), PorterDuff.Mode.SRC_IN);
            this.arrowRight.setEnabled(false);
            return;
        }
        this.arrowRight.setColorFilter(getResources().getColor(R.color.textPrimary), PorterDuff.Mode.SRC_IN);
        this.arrowRight.setEnabled(true);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        BaseActivity baseActivity = getBaseActivity();
        String str = this.title;
        baseActivity.setToolbarCenter(str, "S/N " + this.serialNumber);
    }
}
