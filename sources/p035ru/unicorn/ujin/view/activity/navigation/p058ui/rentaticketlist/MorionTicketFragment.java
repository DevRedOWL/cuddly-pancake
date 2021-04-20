package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.NoTypeRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ChooseSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicketSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ServiceTicketFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.ChooseRentFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.MorionTicketFragment */
public class MorionTicketFragment extends BaseFragment {
    private static final String ARG_RENT_FINISH = "arg_start_finish";
    public static final String ARG_RENT_ID = "arg_rent_id";
    private static final String ARG_RENT_START = "arg_start_rent";
    public static final String ARG_RENT_TITLE = "arg_rent_title";
    public static final String ARG_TICKET_TYPE = "arg_ticket_type";
    public static final String ARG_TYPE_PROPERTY = "property_type";
    public static final String ARG_TYPE_PROPERTY_SERVICE = "property_service";
    public static final String TEXT = "arg_text";
    public static final String TITLE = "arg_title";
    private AlertSection alertSection;
    private Button btnCreate;
    private ChooseSection chooseRentSection;
    private ChooseSection chooseTypeSection;
    private CreateTicketSection createTicketSection;
    private EmptySection emptySection;
    private HelpDeskViewModel helpdeskViewModel;
    private boolean isServiceTicket;

    /* renamed from: pb */
    private ProgressBar f6857pb;
    private MyRentaViewModel rentaViewModel;

    /* renamed from: rv */
    private RecyclerView f6858rv;
    private SectionedAdapter sectionedAdapter;

    private int getLayoutRes() {
        return R.layout.fragment_ticket_morion;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private MorionTicketFragment() {
    }

    public static MorionTicketFragment start(String str) {
        MorionTicketFragment morionTicketFragment = new MorionTicketFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_ticket_type", str);
        morionTicketFragment.setArguments(bundle);
        return morionTicketFragment;
    }

    public static MorionTicketFragment start(String str, String str2, int i) {
        MorionTicketFragment morionTicketFragment = new MorionTicketFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_ticket_type", str);
        bundle.putString(ARG_RENT_TITLE, str2);
        bundle.putInt(ARG_RENT_ID, i);
        morionTicketFragment.setArguments(bundle);
        return morionTicketFragment;
    }

    public static MorionTicketFragment start(String str, String str2, int i, long j, long j2) {
        MorionTicketFragment morionTicketFragment = new MorionTicketFragment();
        Bundle bundle = new Bundle();
        bundle.putString("arg_ticket_type", str);
        bundle.putString(ARG_RENT_TITLE, str2);
        bundle.putInt(ARG_RENT_ID, i);
        bundle.putLong(ARG_RENT_START, j);
        bundle.putLong(ARG_RENT_FINISH, j2);
        morionTicketFragment.setArguments(bundle);
        return morionTicketFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6858rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6857pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnCreate = (Button) inflate.findViewById(R.id.button);
        this.btnCreate.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MorionTicketFragment.this.lambda$onCreateView$0$MorionTicketFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$MorionTicketFragment(View view) {
        createTicket();
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.isServiceTicket = getArguments().getString("arg_ticket_type").equals("property_service");
        this.helpdeskViewModel = (HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class);
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.helpdeskViewModel.showBadge(false);
        initAdapter();
    }

    private void restoreData(TicketInfo ticketInfo) {
        HashMap hashMap = new HashMap();
        if (ticketInfo != null) {
            hashMap.put("arg_title", ticketInfo.getTitle());
            hashMap.put(TEXT, ticketInfo.getText());
        }
        SomeString someString = new SomeString(getType().equals("property_type") ? "rent" : NotificationCompat.CATEGORY_SERVICE);
        someString.setValues(hashMap);
        this.createTicketSection.setData(someString);
    }

    private void initAdapter() {
        String str;
        this.f6858rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.sectionedAdapter = new SectionedAdapter();
        this.f6858rv.setAdapter(this.sectionedAdapter);
        if (this.chooseTypeSection == null) {
            this.chooseTypeSection = new ChooseSection();
            SomeString someString = new SomeString(this.isServiceTicket ? "Сервисная заявка" : "Аренда помещения");
            HashMap hashMap = new HashMap();
            hashMap.put("name", "Тип заявки");
            hashMap.put(ChooseSection.ARROW_VISABILITY, false);
            someString.setValues(hashMap);
            this.chooseTypeSection.setData(someString);
        }
        if (this.chooseRentSection == null) {
            this.chooseRentSection = new ChooseSection();
            if (getArguments().getString(ARG_RENT_TITLE) != null) {
                str = getArguments().getString(ARG_RENT_TITLE);
            } else {
                str = "Выбрать помещение";
            }
            SomeString someString2 = new SomeString(str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("name", "Выбрать помещение");
            hashMap2.put(ChooseSection.ARROW_VISABILITY, true);
            someString2.setValues(hashMap2);
            if (this.chooseRentSection.getData() == null) {
                this.chooseRentSection.setData(someString2);
            }
            this.chooseRentSection.getOnCkick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MorionTicketFragment.this.chooseRent((SomeString) obj);
                }
            });
        }
        if (this.createTicketSection == null) {
            this.createTicketSection = new CreateTicketSection();
            this.createTicketSection.setPlaceholderText(getResources().getString(R.string.ticket_text_placeholder));
            restoreData(this.helpdeskViewModel.getCurrentTicketInfoData().getValue());
        }
        if (this.alertSection == null) {
            this.alertSection = new AlertSection();
            this.alertSection.setData(new SomeString(""));
        }
        if (getArguments().getString("arg_ticket_type").equals("property_type")) {
            this.sectionedAdapter.addSection(this.alertSection);
        }
        this.sectionedAdapter.addSection(this.chooseTypeSection);
        this.sectionedAdapter.addSection(this.chooseRentSection);
        this.sectionedAdapter.addSection(this.createTicketSection);
    }

    /* access modifiers changed from: private */
    public void chooseRent(SomeString someString) {
        TicketInfo ticketInfo = new TicketInfo();
        ticketInfo.setTitle(this.createTicketSection.getTicketTitile());
        ticketInfo.setText(this.createTicketSection.getTicketText());
        this.helpdeskViewModel.saveTitleText(ticketInfo);
        getArguments().getString("arg_ticket_type");
        if (getArguments().getInt(ARG_RENT_ID, -1) != -1) {
            getArguments().getLong(ARG_RENT_START, -1);
            getArguments().getLong(ARG_RENT_FINISH, -1);
            return;
        }
        nextFragment(ChooseRentFragment.start(new NoTypeRentTicket()), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        ToolbarButtons toolbarButtons = ToolbarButtons.BACK_TO;
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK_TO);
        getArguments().getString("arg_ticket_type");
        getBaseActivity().setTextTitle(getString(R.string.label_create_ticket));
    }

    private String getType() {
        return getArguments().getString("arg_ticket_type");
    }

    private void createTicket() {
        boolean equals = getArguments().getString("arg_ticket_type").equals("property_type");
        String ticketText = this.createTicketSection.getTicketText();
        String ticketTitile = this.createTicketSection.getTicketTitile();
        if (ticketText.isEmpty() || ticketTitile.isEmpty()) {
            DialogHelper.showDialog((Context) getActivity(), "Поля не могут быть пустыми");
        } else if (((SomeString) this.chooseRentSection.getData()).getSomeString().toLowerCase().contains("выбрать")) {
            DialogHelper.showDialog((Context) getActivity(), "Выберите помещение");
        } else {
            getArguments().getInt(ARG_RENT_ID);
            getArguments().getLong(ARG_RENT_START, -1);
            getArguments().getLong(ARG_RENT_FINISH, -1);
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.MorionTicketFragment$1 */
    static /* synthetic */ class C59311 {
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
                int[] r0 = $SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status     // Catch:{ NoSuchFieldError -> 0x002a }
                ru.unicorn.ujin.data.realm.Resource$Status r1 = p035ru.unicorn.ujin.data.realm.Resource.Status.LOADING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragment.C59311.<clinit>():void");
        }
    }

    private void onTicketCreate(Resource<CreateTicket> resource) {
        if (resource != null) {
            int i = C59311.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6857pb.setVisibility(4);
                nextFragment(ServiceTicketFragment.start(String.valueOf(resource.getData().getTicket().getTicket().getId())), false);
            } else if (i == 2) {
                this.f6857pb.setVisibility(4);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), resource.getMessage());
                createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        MorionTicketFragment.this.lambda$onTicketCreate$1$MorionTicketFragment(dialogInterface, i);
                    }
                });
                createDialogBuilder.create().show();
            } else if (i == 3) {
                this.f6857pb.setVisibility(0);
            }
        }
    }

    public /* synthetic */ void lambda$onTicketCreate$1$MorionTicketFragment(DialogInterface dialogInterface, int i) {
        backFragment();
    }
}
