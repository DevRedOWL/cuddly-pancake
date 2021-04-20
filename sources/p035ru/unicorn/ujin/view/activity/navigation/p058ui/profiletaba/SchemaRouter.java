package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.FakeFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketListFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.SchemaRouter */
public class SchemaRouter {
    public static final String ARG_POSITION = "arg_position";
    public static final int CABINET = 7;
    public static final String CANCEL = "cancel";
    public static final int CHAT = 5;
    public static final String CORONA = "my_pass";
    public static final String DIALOGUE = "dialogue";
    public static final int HOTKEYS = 6;
    public static final String MARKET = "marketplace";
    public static final String NEWS = "news";
    public static final String PARKING = "parking";
    public static final int PARTNER = 4;
    public static final int SECURITY = 2;
    public static final int SMART = 1;
    public static final int START = 0;
    public static final String TASHIR = "tashir";
    public static final String TEAM = "team";
    public static final int USLUGI = 3;
    private final BaseActivity baseActivity;
    private final BaseFragment baseFragment;
    private ProfileTabViewModel profileTabViewModel;
    private Schema schema;
    private SimpleViewModel simpleViewModel;

    public SchemaRouter(BaseActivity baseActivity2, BaseFragment baseFragment2) {
        this.baseActivity = baseActivity2;
        this.baseFragment = baseFragment2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getFragmentByAction(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r9) {
        /*
            r8 = this;
            r8.schema = r9
            java.lang.String r0 = r9.getAction()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r1) {
                case -1349088399: goto L_0x0046;
                case -447181342: goto L_0x003c;
                case -233842216: goto L_0x0032;
                case 117588: goto L_0x0028;
                case 3045982: goto L_0x001e;
                case 96634189: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0050
        L_0x0014:
            java.lang.String r1 = "empty"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 3
            goto L_0x0051
        L_0x001e:
            java.lang.String r1 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 1
            goto L_0x0051
        L_0x0028:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 0
            goto L_0x0051
        L_0x0032:
            java.lang.String r1 = "dialogue"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 5
            goto L_0x0051
        L_0x003c:
            java.lang.String r1 = "call_method"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 2
            goto L_0x0051
        L_0x0046:
            java.lang.String r1 = "custom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0050
            r0 = 4
            goto L_0x0051
        L_0x0050:
            r0 = -1
        L_0x0051:
            if (r0 == 0) goto L_0x00be
            if (r0 == r7) goto L_0x00b6
            if (r0 == r6) goto L_0x00ae
            if (r0 == r5) goto L_0x009a
            if (r0 == r4) goto L_0x0062
            if (r0 == r3) goto L_0x005e
            goto L_0x00c7
        L_0x005e:
            r8.showDynamicDialog()
            goto L_0x00c7
        L_0x0062:
            java.lang.String r0 = r9.getActionValue()
            java.lang.String r1 = "rent"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0096
            ru.unicorn.ujin.view.fragments.BaseFragment r0 = r8.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.base.ViewmodelFactorys r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys.getInstance()
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.m11of((androidx.fragment.app.Fragment) r0, (androidx.lifecycle.ViewModelProvider.Factory) r1)
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel) r0
            r8.profileTabViewModel = r0
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel r0 = r8.profileTabViewModel
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r0.getRentInfoByName()
            ru.unicorn.ujin.view.fragments.BaseFragment r1 = r8.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.-$$Lambda$SchemaRouter$EKJe6x-Gth78Ws1zTBNuGCdVNs4 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.-$$Lambda$SchemaRouter$EKJe6x-Gth78Ws1zTBNuGCdVNs4
            r2.<init>()
            r0.observe(r1, r2)
            r8.doCustomRentWork(r9)
            goto L_0x00c7
        L_0x0096:
            r8.doCustomWork(r9)
            goto L_0x00c7
        L_0x009a:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r8.baseActivity
            java.lang.String r1 = r9.getActionValue()
            java.lang.String r9 = r9.getDescription()
            ru.unicorn.ujin.view.activity.navigation.ui.empty.EmptyFragment r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.empty.EmptyFragment.start(r1, r9)
            java.lang.String r1 = ""
            r0.onNextFragment(r9, r2, r1)
            goto L_0x00c7
        L_0x00ae:
            java.lang.String r9 = r9.getActionValue()
            r8.callMethod(r9)
            goto L_0x00c7
        L_0x00b6:
            java.lang.String r9 = r9.getActionValue()
            r8.callTo(r9)
            goto L_0x00c7
        L_0x00be:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r8.baseActivity
            java.lang.String r9 = r9.getActionValue()
            r0.showUrl(r9)
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter.getFragmentByAction(ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema):void");
    }

    /* access modifiers changed from: private */
    public void snowChoosenTypeFragment(RentType rentType) {
        ITicketRouter.getInstance().ticketRouter(this.baseFragment, rentType);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void doCustomWork(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getActionValue()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            switch(r1) {
                case -1878592593: goto L_0x00bf;
                case -1322977561: goto L_0x00b5;
                case -880874965: goto L_0x00aa;
                case -793201736: goto L_0x009f;
                case -324146763: goto L_0x0094;
                case 97672: goto L_0x008a;
                case 3046160: goto L_0x0080;
                case 3304406: goto L_0x0076;
                case 3377875: goto L_0x006b;
                case 3555933: goto L_0x0060;
                case 98127112: goto L_0x0054;
                case 112202875: goto L_0x0049;
                case 300911179: goto L_0x003d;
                case 957830652: goto L_0x0032;
                case 1142272250: goto L_0x0026;
                case 1508948676: goto L_0x001a;
                case 1837962808: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x00c9
        L_0x000f:
            java.lang.String r1 = "domofon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x001a:
            java.lang.String r1 = "my_pass"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 14
            goto L_0x00ca
        L_0x0026:
            java.lang.String r1 = "domofon2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 9
            goto L_0x00ca
        L_0x0032:
            java.lang.String r1 = "counter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 4
            goto L_0x00ca
        L_0x003d:
            java.lang.String r1 = "marketplace"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 16
            goto L_0x00ca
        L_0x0049:
            java.lang.String r1 = "video"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 0
            goto L_0x00ca
        L_0x0054:
            java.lang.String r1 = "gates"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 8
            goto L_0x00ca
        L_0x0060:
            java.lang.String r1 = "team"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 15
            goto L_0x00ca
        L_0x006b:
            java.lang.String r1 = "news"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 12
            goto L_0x00ca
        L_0x0076:
            java.lang.String r1 = "kvit"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 3
            goto L_0x00ca
        L_0x0080:
            java.lang.String r1 = "card"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 2
            goto L_0x00ca
        L_0x008a:
            java.lang.String r1 = "bms"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 5
            goto L_0x00ca
        L_0x0094:
            java.lang.String r1 = "domru_product"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 13
            goto L_0x00ca
        L_0x009f:
            java.lang.String r1 = "parking"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 11
            goto L_0x00ca
        L_0x00aa:
            java.lang.String r1 = "tashir"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 10
            goto L_0x00ca
        L_0x00b5:
            java.lang.String r1 = "tickets"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 6
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r1 = "create_ticket"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c9
            r0 = 7
            goto L_0x00ca
        L_0x00c9:
            r0 = -1
        L_0x00ca:
            switch(r0) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x01ae;
                case 2: goto L_0x01a4;
                case 3: goto L_0x019a;
                case 4: goto L_0x018f;
                case 5: goto L_0x0184;
                case 6: goto L_0x0177;
                case 7: goto L_0x016d;
                case 8: goto L_0x0148;
                case 9: goto L_0x013c;
                case 10: goto L_0x0130;
                case 11: goto L_0x0124;
                case 12: goto L_0x0118;
                case 13: goto L_0x00f7;
                case 14: goto L_0x00eb;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00cf;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            goto L_0x01c5
        L_0x00cf:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.market.MarketFragment r0 = new ru.unicorn.ujin.market.MarketFragment
            r0.<init>()
            java.lang.String r1 = "market_place"
            r5.nextFragment(r0, r3, r1)
            goto L_0x01c5
        L_0x00dd:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.mycompany.MyRentaCompanyFragment
            r0.<init>()
            java.lang.String r1 = "company_list"
            r5.nextFragment(r0, r3, r1)
            goto L_0x01c5
        L_0x00eb:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.corona.CoronaFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x00f7:
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r5 = r4.simpleViewModel
            androidx.lifecycle.MutableLiveData r5 = r5.getCurrentSchema()
            java.lang.Object r5 = r5.getValue()
            ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r5 = (p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema) r5
            if (r5 == 0) goto L_0x01c5
            ru.unicorn.ujin.view.fragments.BaseFragment r0 = r4.baseFragment
            java.lang.String r1 = r5.getDomRuId()
            java.lang.String r5 = r5.getTitle()
            ru.unicorn.ujin.view.activity.navigation.ui.domservice.DomServiceListFragment r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceListFragment.start(r1, r5)
            r0.nextFragment(r5, r3)
            goto L_0x01c5
        L_0x0118:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.fragments.news.NewsListFragment r0 = new ru.unicorn.ujin.view.fragments.news.NewsListFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x0124:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.fragments.rozmarin.ParkingFragment r0 = new ru.unicorn.ujin.view.fragments.rozmarin.ParkingFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x0130:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.fragments.rozmarin.TashirFragment r0 = new ru.unicorn.ujin.view.fragments.rozmarin.TashirFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x013c:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.domofonprikamya.DomofonPrikamyaFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x0148:
            ru.unicorn.ujin.enums.Flavor r0 = p035ru.unicorn.ujin.enums.Flavor.current()
            boolean r0 = r0.isWithVideoPreview()
            if (r0 == 0) goto L_0x015d
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.GatesViewPagerFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x015d:
            ru.unicorn.ujin.view.fragments.BaseFragment r0 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$Companion r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesFragment.Companion
            java.lang.String r5 = r5.getTitle()
            ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment r5 = r1.start(r5)
            r0.nextFragment(r5, r3)
            goto L_0x01c5
        L_0x016d:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.ApplicationListFragment r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ApplicationListFragment.startStage(r2)
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x0177:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppViewPagerFragment
            r0.<init>()
            java.lang.String r1 = p035ru.unicorn.ujin.view.fragments.FR_TAGS.TAG_TICKETS
            r5.nextFragment(r0, r3, r1)
            goto L_0x01c5
        L_0x0184:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x018f:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListFragment r0 = new ru.unicorn.ujin.view.activity.navigation.ui.measures.CounterListFragment
            r0.<init>()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x019a:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.tickets.TicketsFragment r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.TicketsFragment.start()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x01a4:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.card.CardListFragment r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardListFragment.start()
            r5.nextFragment(r0, r3)
            goto L_0x01c5
        L_0x01ae:
            ru.unicorn.ujin.view.fragments.BaseFragment r0 = r4.baseFragment
            java.lang.String r5 = r5.getTitle()
            ru.unicorn.ujin.view.activity.navigation.ui.domofon.DomofonFragment r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofon.DomofonFragment.start(r5)
            r0.nextFragment(r5, r3)
            goto L_0x01c5
        L_0x01bc:
            ru.unicorn.ujin.view.fragments.BaseFragment r5 = r4.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.video.VideoPreviewFragment r0 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoPreviewFragment.start(r3)
            r5.nextFragment(r0, r3)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter.doCustomWork(ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema):void");
    }

    private void doCustomRentWork(Schema schema2) {
        String title = schema2.getTitle();
        String actionValue = schema2.getActionValue();
        if (!this.baseFragment.getString(R.string.title_news).equals(title)) {
            if (schema2.getActionValue().equals(TEAM)) {
                this.baseFragment.nextFragment(new MyRentaCompanyFragment(), false);
            } else if (this.baseFragment.getString(R.string.title_arenda).equals(title)) {
                this.baseFragment.nextFragment(MyRentaFragment.start(1), false);
            } else if (actionValue.toLowerCase().contains("rent_tickets")) {
                this.baseFragment.nextFragment(TicketListFragment.start("property_type", schema2.getSectionId(), schema2.getSectionTitle(), schema2.getTitle()), false);
            } else if (actionValue.toLowerCase().contains("rent_event_services")) {
                this.baseFragment.nextFragment(new FakeFragment(), false);
            } else if (actionValue.toLowerCase().contains("rent_")) {
                this.profileTabViewModel.getTypeByName(actionValue.toLowerCase().replace("rent_", ""));
            }
        }
    }

    private void showDynamicDialog() {
        Schema schema2 = this.schema;
        if (schema2 != null && schema2.getAction().equals("dialogue") && this.schema.getDialogButtons() != null && !this.schema.getDialogButtons().isEmpty()) {
            AlertDialog.Builder createDialogBuilder = DialogHelper.createDialogBuilder(this.baseActivity, this.schema.getAlertMessage());
            for (int i = 0; i < this.schema.getDialogButtons().size(); i++) {
                DialogButtons dialogButtons = this.schema.getDialogButtons().get(i);
                if (dialogButtons.getActionValue() != null) {
                    createDialogBuilder.setPositiveButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogButtons) {
                        private final /* synthetic */ DialogButtons f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SchemaRouter.this.lambda$showDynamicDialog$0$SchemaRouter(this.f$1, dialogInterface, i);
                        }
                    });
                } else if (dialogButtons.getAction().equals("cancel")) {
                    createDialogBuilder.setNegativeButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogButtons) {
                        private final /* synthetic */ DialogButtons f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SchemaRouter.this.lambda$showDynamicDialog$1$SchemaRouter(this.f$1, dialogInterface, i);
                        }
                    });
                } else {
                    createDialogBuilder.setNeutralButton((CharSequence) dialogButtons.getName(), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(dialogButtons) {
                        private final /* synthetic */ DialogButtons f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            SchemaRouter.this.lambda$showDynamicDialog$2$SchemaRouter(this.f$1, dialogInterface, i);
                        }
                    });
                }
            }
            createDialogBuilder.create().show();
        }
    }

    public /* synthetic */ void lambda$showDynamicDialog$0$SchemaRouter(DialogButtons dialogButtons, DialogInterface dialogInterface, int i) {
        makeAction(dialogButtons, dialogInterface);
    }

    public /* synthetic */ void lambda$showDynamicDialog$1$SchemaRouter(DialogButtons dialogButtons, DialogInterface dialogInterface, int i) {
        makeAction(dialogButtons, dialogInterface);
    }

    public /* synthetic */ void lambda$showDynamicDialog$2$SchemaRouter(DialogButtons dialogButtons, DialogInterface dialogInterface, int i) {
        makeAction(dialogButtons, dialogInterface);
    }

    private void callTo(String str) {
        this.baseActivity.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str)));
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.SchemaRouter$1 */
    static /* synthetic */ class C59281 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter.C59281.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void handleAction(Resource<Void> resource) {
        if (resource != null) {
            int i = C59281.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.baseFragment.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.baseFragment.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) this.baseActivity, resource.getMessage());
            } else if (i == 3) {
                this.baseFragment.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) this.baseActivity, resource.getMessage());
            }
        }
    }

    private void callMethod(String str) {
        this.simpleViewModel.sendDynamicRequest(str);
        this.simpleViewModel.getSendDynamiceRequest().observe(this.baseFragment, new Observer() {
            public final void onChanged(Object obj) {
                SchemaRouter.this.handleAction((Resource) obj);
            }
        });
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void makeAction(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAction()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r1) {
                case -1349088399: goto L_0x0044;
                case -447181342: goto L_0x003a;
                case -233842216: goto L_0x0030;
                case 117588: goto L_0x0026;
                case 3045982: goto L_0x001c;
                case 96634189: goto L_0x0012;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x004e
        L_0x0012:
            java.lang.String r1 = "empty"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 3
            goto L_0x004f
        L_0x001c:
            java.lang.String r1 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 1
            goto L_0x004f
        L_0x0026:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 0
            goto L_0x004f
        L_0x0030:
            java.lang.String r1 = "dialogue"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 5
            goto L_0x004f
        L_0x003a:
            java.lang.String r1 = "call_method"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 2
            goto L_0x004f
        L_0x0044:
            java.lang.String r1 = "custom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004e
            r0 = 4
            goto L_0x004f
        L_0x004e:
            r0 = -1
        L_0x004f:
            if (r0 == 0) goto L_0x00c2
            if (r0 == r7) goto L_0x00ba
            if (r0 == r6) goto L_0x00b2
            if (r0 == r5) goto L_0x00a0
            if (r0 == r4) goto L_0x0060
            if (r0 == r3) goto L_0x005c
            goto L_0x00cb
        L_0x005c:
            r8.showDynamicDialog()
            goto L_0x00cb
        L_0x0060:
            ru.unicorn.ujin.view.activity.navigation.ui.navigation.SimpleViewModel r0 = r8.simpleViewModel
            androidx.lifecycle.MutableLiveData r0 = r0.getCurrentSchema()
            r0.setValue(r9)
            java.lang.String r0 = r9.getActionValue()
            java.lang.String r1 = "rent_"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00cb
            ru.unicorn.ujin.view.fragments.BaseFragment r0 = r8.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.base.ViewmodelFactorys r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys.getInstance()
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.m11of((androidx.fragment.app.Fragment) r0, (androidx.lifecycle.ViewModelProvider.Factory) r1)
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel r0 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel) r0
            r8.profileTabViewModel = r0
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.ProfileTabViewModel r0 = r8.profileTabViewModel
            ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent r0 = r0.getRentInfoByName()
            ru.unicorn.ujin.view.fragments.BaseFragment r1 = r8.baseFragment
            ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.-$$Lambda$SchemaRouter$EKJe6x-Gth78Ws1zTBNuGCdVNs4 r2 = new ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.-$$Lambda$SchemaRouter$EKJe6x-Gth78Ws1zTBNuGCdVNs4
            r2.<init>()
            r0.observe(r1, r2)
            r8.doCustomRentWork(r9)
            r8.doCustomWork(r9)
            goto L_0x00cb
        L_0x00a0:
            ru.unicorn.ujin.view.fragments.BaseFragment r0 = r8.baseFragment
            java.lang.String r1 = r9.getActionValue()
            java.lang.String r9 = r9.getDescription()
            ru.unicorn.ujin.view.activity.navigation.ui.empty.EmptyFragment r9 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.empty.EmptyFragment.start(r1, r9)
            r0.nextFragment(r9, r2)
            goto L_0x00cb
        L_0x00b2:
            java.lang.String r9 = r9.getActionValue()
            r8.callMethod(r9)
            goto L_0x00cb
        L_0x00ba:
            java.lang.String r9 = r9.getActionValue()
            r8.callTo(r9)
            goto L_0x00cb
        L_0x00c2:
            ru.unicorn.ujin.view.activity.BaseActivity r0 = r8.baseActivity
            java.lang.String r9 = r9.getActionValue()
            r0.showUrl(r9)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter.makeAction(ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void makeAction(p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons r6, android.content.DialogInterface r7) {
        /*
            r5 = this;
            java.lang.String r0 = r6.getAction()
            int r1 = r0.hashCode()
            r2 = -1367724422(0xffffffffae7a2e7a, float:-5.68847E-11)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002e
            r2 = -447181342(0xffffffffe5588de2, float:-6.3915527E22)
            if (r1 == r2) goto L_0x0024
            r2 = 3045982(0x2e7a5e, float:4.26833E-39)
            if (r1 == r2) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r1 = "call"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "call_method"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "cancel"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 2
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            if (r0 == r4) goto L_0x0044
            if (r0 == r3) goto L_0x0040
            goto L_0x0053
        L_0x0040:
            r7.dismiss()
            goto L_0x0053
        L_0x0044:
            java.lang.String r6 = r6.getActionValue()
            r5.callMethod(r6)
            goto L_0x0053
        L_0x004c:
            java.lang.String r6 = r6.getActionValue()
            r5.callTo(r6)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.SchemaRouter.makeAction(ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons, android.content.DialogInterface):void");
    }
}
