package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.Set;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentChildren;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragmentE;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.coworking.CoworkingFragment */
public class CoworkingFragment extends BaseSectionFragment<MyRentaViewModel> {
    public static final String ARG_FINISH = "arg_finish";
    public static final String ARG_START = "arg_start";
    private CoworkingChildSection coworkingChildSection;
    private ClickableImageSection imageSection;
    private TalkingData talkingData;
    private TextView textView;

    public static CoworkingFragment start(AbstractRentTicket abstractRentTicket) {
        CoworkingFragment coworkingFragment = new CoworkingFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        coworkingFragment.setArguments(bundle);
        return coworkingFragment;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.coworkingChildSection == null) {
            this.coworkingChildSection = new CoworkingChildSection();
            this.coworkingChildSection.getChildrenSet().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CoworkingFragment.this.lambda$initSections$0$CoworkingFragment((Set) obj);
                }
            });
        }
        if (this.imageSection == null) {
            this.imageSection = new ClickableImageSection();
            this.imageSection.getOnImageClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CoworkingFragment.this.lambda$initSections$1$CoworkingFragment((TalkingData) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.imageSection);
        this.sectionedAdapter.addSection(this.coworkingChildSection);
    }

    /* access modifiers changed from: private */
    /* renamed from: showPreview */
    public void lambda$initSections$1$CoworkingFragment(TalkingData talkingData2) {
        nextFragment(PreviewImageFragment.start(talkingData2.getTitle(), talkingData2.getSchema().getPreview().getUrl(), talkingData2.getSchema().getUrl()), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: onDataChanged */
    public void lambda$initSections$0$CoworkingFragment(Set<RentChildren> set) {
        getViewModell().getChoosenRentChildren().setValue(set);
        ((HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class)).getChoosenRentChildren().setValue(set);
        if (set.size() == 0) {
            this.textView.setOnClickListener((View.OnClickListener) null);
            return;
        }
        new RentInfo();
        CoworkingRentTicket coworkingRentTicket = (CoworkingRentTicket) getRent();
        coworkingRentTicket.setChildren(set);
        this.textView.setOnClickListener(new View.OnClickListener(coworkingRentTicket) {
            private final /* synthetic */ CoworkingRentTicket f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                CoworkingFragment.this.lambda$onDataChanged$2$CoworkingFragment(this.f$1, view);
            }
        });
    }

    public /* synthetic */ void lambda$onDataChanged$2$CoworkingFragment(CoworkingRentTicket coworkingRentTicket, View view) {
        nextFragment(MorionTicketFragmentE.start(coworkingRentTicket), false);
    }

    public MyRentaViewModel getViewModell() {
        return (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
    }

    public void onViewCreated(MyRentaViewModel myRentaViewModel) {
        myRentaViewModel.getCurrentCowork().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CoworkingFragment.this.showData((TalkingData) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showData(TalkingData talkingData2) {
        this.talkingData = talkingData2;
        this.imageSection.setData(talkingData2);
        this.coworkingChildSection.setData(talkingData2.getRentChildren());
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getRent().getRentTitle();
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        super.showToolbar();
        getBaseActivity().setToolbarRight(createText());
    }

    private ArrayList<View> createText() {
        ArrayList<View> arrayList = new ArrayList<>();
        this.textView = new TextView(getActivity());
        this.textView.setText(getString(R.string.next));
        this.textView.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorAccent));
        this.textView.setTextSize(17.0f);
        arrayList.add(this.textView);
        return arrayList;
    }

    public AbstractRentTicketWithId getRent() {
        return (AbstractRentTicketWithId) getArguments().getParcelable("rent");
    }
}
