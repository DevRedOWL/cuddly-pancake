package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import java.util.HashMap;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ButtonModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.DynamicButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.IButtonData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ApplicationListFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ChooseSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.CreateTicketSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.fragments.FR_TAGS;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.AbstractTicketFragment */
public abstract class AbstractTicketFragment extends BaseSectionFragment<HelpDeskViewModel> {
    protected AlertSection alertSection;
    protected DynamicButtonSection btnCreate;
    protected ChooseSection chooseRentSection;
    protected ChooseSection chooseTypeSection;
    protected CreateTicketSection createTicketSection;
    protected EmptySection emptySection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_create_ticket;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged() {
    }

    public static AbstractTicketFragment start(ITicket iTicket) {
        AbstractTicketFragment abstractTicketFragment;
        if (iTicket.getGlobalTicketType() == ITicket.GlobalTicketTypes.Rent) {
            abstractTicketFragment = new MorionTicketFragmentE();
        } else {
            abstractTicketFragment = new ServiceTicketFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", iTicket);
        abstractTicketFragment.setArguments(bundle);
        return abstractTicketFragment;
    }

    /* access modifiers changed from: protected */
    public ITicket saveTitleAndText() {
        TicketInfo ticketInfo = new TicketInfo();
        ticketInfo.setTitle(this.createTicketSection.getTicketTitile());
        ticketInfo.setText(this.createTicketSection.getTicketText());
        ITicket iTicket = getITicket();
        iTicket.saveTicketTitle(ticketInfo.getTitle());
        iTicket.saveTicketText(ticketInfo.getText());
        return iTicket;
    }

    public ITicket getITicket() {
        return (ITicket) getArguments().getParcelable("rent");
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.alertSection == null) {
            this.alertSection = new AlertSection();
            this.alertSection.setData(new SomeString(""));
        }
        if (this.chooseTypeSection == null) {
            this.chooseTypeSection = new ChooseSection();
        }
        if (this.chooseRentSection == null) {
            this.chooseRentSection = new ChooseSection();
        }
        if (this.createTicketSection == null) {
            this.createTicketSection = new CreateTicketSection();
        }
        if (this.btnCreate == null) {
            this.btnCreate = new DynamicButtonSection();
            this.btnCreate.setData(new ButtonModel("Создать"));
            subscribeBtnCreate();
        }
    }

    private Disposable subscribeBtnCreate() {
        return this.btnCreate.getSomeAction().subscribe(new Consumer() {
            public final void accept(Object obj) {
                AbstractTicketFragment.this.lambda$subscribeBtnCreate$0$AbstractTicketFragment((IButtonData) obj);
            }
        });
    }

    public /* synthetic */ void lambda$subscribeBtnCreate$0$AbstractTicketFragment(IButtonData iButtonData) throws Exception {
        createMyTicket(getITicket());
    }

    /* access modifiers changed from: protected */
    public SomeString createTicketTitleTextData() {
        SomeString someString = new SomeString(getITicket().getGlobalTicketType() == ITicket.GlobalTicketTypes.Rent ? "rent" : NotificationCompat.CATEGORY_SERVICE);
        HashMap hashMap = new HashMap();
        hashMap.put("arg_title", getITicket().loadTicketTitle());
        hashMap.put(MorionTicketFragment.TEXT, getITicket().loadTicketText());
        someString.setValues(hashMap);
        return someString;
    }

    /* access modifiers changed from: package-private */
    public void createMyTicket(ITicket iTicket) {
        saveTitleAndText();
        ((HelpDeskViewModel) getViewModell()).getCreateTicket().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                AbstractTicketFragment.this.onTicketCreate((Resource) obj);
            }
        });
        ((HelpDeskViewModel) getViewModell()).sendMorionTicket(iTicket);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.AbstractTicketFragment$1 */
    static /* synthetic */ class C59291 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.AbstractTicketFragment.C59291.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public void onTicketCreate(Resource<CreateTicket> resource) {
        String str;
        if (resource != null) {
            int i = C59291.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(4);
                new ArrayList().add(BaseActivity.FRAGMENT_ABSTRACT_TICKET);
                this.btnCreate.setEnabled(true);
                AlertDialog.Builder positiveButton = new AlertDialog.Builder(getBaseActivity()).setPositiveButton((int) R.string.ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        AbstractTicketFragment.this.lambda$onTicketCreate$1$AbstractTicketFragment(dialogInterface, i);
                    }
                });
                if (resource.getData() != null) {
                    str = resource.getData().getTicket().getTicket().getTitle() + "\n" + resource.getData().getTicket().getTicket().getText();
                } else {
                    str = "Произошла ошибка, попробуйте позже";
                }
                positiveButton.setMessage((CharSequence) str).setCancelable(false).show();
            } else if (i == 2) {
                this.f6913pb.setVisibility(4);
                this.btnCreate.setEnabled(true);
                AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(getActivity(), resource.getMessage());
                createDialogBuilder.setPositiveButton((CharSequence) getString(R.string.button_ok), (DialogInterface.OnClickListener) $$Lambda$AbstractTicketFragment$_xcMZWUCaUW0TNdh3qi0wV__EgY.INSTANCE);
                createDialogBuilder.create().show();
            } else if (i == 3) {
                this.f6913pb.setVisibility(0);
                this.btnCreate.setEnabled(false);
            }
        }
    }

    public /* synthetic */ void lambda$onTicketCreate$1$AbstractTicketFragment(DialogInterface dialogInterface, int i) {
        nextFragment(SmartNavFragment.start(3), true, BaseActivity.FRAGMENT_SERVICE);
        nextFragment(ApplicationListFragment.startStage(0), false, FR_TAGS.TAG_TICKETS);
    }

    /* access modifiers changed from: protected */
    public SomeString createTicketTypeData() {
        String str;
        if (getITicket().getSectionTitle() == null || getITicket().getSectionTitle().isEmpty()) {
            str = getITicket().getGlobalTicketType() == ITicket.GlobalTicketTypes.Service ? "Сервисная заявка" : "Аренда помещения";
        } else {
            str = getITicket().getSectionTitle();
        }
        SomeString someString = new SomeString(str);
        HashMap hashMap = new HashMap();
        hashMap.put("name", "Тип заявки");
        hashMap.put(ChooseSection.ARROW_VISABILITY, false);
        someString.setValues(hashMap);
        this.chooseTypeSection.setData(someString);
        return someString;
    }

    /* access modifiers changed from: protected */
    public void setTicketTitleText() {
        SomeString someString = new SomeString(getITicket().getGlobalTicketType().name().equals(ITicket.GlobalTicketTypes.Service.name()) ? NotificationCompat.CATEGORY_SERVICE : "rent");
        HashMap hashMap = new HashMap();
        if (getITicket() != null) {
            hashMap.put("arg_title", getITicket().loadTicketTitle());
            hashMap.put(MorionTicketFragment.TEXT, getITicket().loadTicketText());
        }
        someString.setValues(hashMap);
        this.createTicketSection.setData(someString);
    }
}
