package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.HashMap;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.ChooseSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.ChooseRentFragment;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.MorionTicketFragmentE */
public class MorionTicketFragmentE extends AbstractTicketFragment {
    public void onViewCreated(HelpDeskViewModel helpDeskViewModel) {
    }

    public HelpDeskViewModel getViewModell() {
        return (HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class);
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        super.initSections();
        this.chooseTypeSection.setData(createTicketTypeData());
        this.chooseRentSection.setData(createTicketRentData());
        this.chooseRentSection.getOnCkick().distinct().subscribe(new Consumer() {
            public final void accept(Object obj) {
                MorionTicketFragmentE.this.chooseRent((SomeString) obj);
            }
        });
        this.createTicketSection.setData(createTicketTitleTextData());
        this.createTicketSection.setPlaceholderText(getResources().getString(R.string.ticket_text_placeholder));
        this.sectionedAdapter.addSection(this.alertSection);
        this.sectionedAdapter.addSection(this.chooseTypeSection);
        this.sectionedAdapter.addSection(this.chooseRentSection);
        this.sectionedAdapter.addSection(this.createTicketSection);
        this.sectionedAdapter.addSection(this.btnCreate);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getITicket().getName();
    }

    private SomeString createTicketRentData() {
        String string = getString(R.string.label_rent_room);
        if (getITicket() instanceof AbstractRentTicketWithId) {
            string = ((AbstractRentTicketWithId) getITicket()).getRentTitle();
        } else if (getITicket() instanceof AbstractRentTicket) {
            string = ((AbstractRentTicket) getITicket()).getLocalTicketTypeName();
        }
        SomeString someString = new SomeString(string);
        HashMap hashMap = new HashMap();
        hashMap.put("name", string);
        hashMap.put(ChooseSection.ARROW_VISABILITY, true);
        someString.setValues(hashMap);
        return someString;
    }

    /* access modifiers changed from: private */
    public void chooseRent(SomeString someString) {
        AbstractRentTicket abstractRentTicket = (AbstractRentTicket) saveTitleAndText();
        if (abstractRentTicket.getLocalTicketType() != AbstractRentTicket.RentTicketTypes.NoType) {
            nextFragment(RentDetailsFragment.start(abstractRentTicket), false);
        } else {
            nextFragment(ChooseRentFragment.start(abstractRentTicket), false);
        }
    }
}
