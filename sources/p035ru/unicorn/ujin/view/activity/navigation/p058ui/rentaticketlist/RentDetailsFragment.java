package p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.KeyValueSection;
import p035ru.unicorn.ujin.view.activity.navigation.entity.IKeyValueData;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.CoworkingRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.OfficeRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonProps;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.ButtonSection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.ImageFullViewFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingRoomFragment;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.rentaticketlist.RentDetailsFragment */
public class RentDetailsFragment extends BaseSectionFragment<MyRentaViewModel> {
    public static final String ARG_ID = "arg_id";
    private KeyValueSection attributesSection;
    private ButtonSection buttonSection;
    private StringListSection childrenList;
    private RentImageSection rentImageSection;

    private RentDetailsFragment() {
    }

    public static RentDetailsFragment start(AbstractRentTicket abstractRentTicket) {
        RentDetailsFragment rentDetailsFragment = new RentDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        rentDetailsFragment.setArguments(bundle);
        return rentDetailsFragment;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.attributesSection == null) {
            this.attributesSection = new KeyValueSection();
            this.attributesSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentDetailsFragment.this.lambda$initSections$0$RentDetailsFragment((IKeyValueData) obj);
                }
            });
        }
        if (this.rentImageSection == null) {
            this.rentImageSection = new RentImageSection();
            this.rentImageSection.imageClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentDetailsFragment.this.showPreview((List) obj);
                }
            });
        }
        if (this.buttonSection == null) {
            this.buttonSection = new ButtonSection();
            this.buttonSection.setData(new ButtonProps(getString(R.string.label_change_rent)));
            this.buttonSection.getSpecialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    RentDetailsFragment.this.lambda$initSections$1$RentDetailsFragment((ButtonProps) obj);
                }
            });
        }
        if (this.childrenList == null) {
            this.childrenList = new StringListSection();
        }
        this.sectionedAdapter.addSection(this.attributesSection);
        this.sectionedAdapter.addSection(this.childrenList);
        this.sectionedAdapter.addSection(this.rentImageSection);
        if (!getRent().isCreate()) {
            this.sectionedAdapter.addSection(this.buttonSection);
        }
    }

    public /* synthetic */ void lambda$initSections$1$RentDetailsFragment(ButtonProps buttonProps) throws Exception {
        onButtonClick();
    }

    /* access modifiers changed from: private */
    /* renamed from: onClick */
    public void lambda$initSections$0$RentDetailsFragment(IKeyValueData iKeyValueData) {
        StringListSection stringListSection = this.childrenList;
        stringListSection.show(!stringListSection.isShown());
    }

    private void onButtonClick() {
        nextFragment(TalkingRoomFragment.start(getRent()), false, AbstractRentTicket.FRAGMENT_TAG);
    }

    public MyRentaViewModel getViewModell() {
        return (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
    }

    public void onViewCreated(MyRentaViewModel myRentaViewModel) {
        AbstractRentTicket rent = getRent();
        if (rent.getDetailDataType() == AbstractRentTicket.DetailType.byId) {
            myRentaViewModel.getRentaInfoAttributes(Integer.valueOf(((AbstractRentTicketWithId) getRent()).getRentId()));
            myRentaViewModel.getTalkingInfoMutableLiveData().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    RentDetailsFragment.this.showAttributes((List) obj);
                }
            });
        } else if (rent.getDetailDataType() != AbstractRentTicket.DetailType.byTypeId && rent.getDetailDataType() == AbstractRentTicket.DetailType.byFilter) {
            this.attributesSection.setData(((OfficeRentTicket) getRent()).mo67643to());
        }
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getRent().getLocalTicketTypeName();
    }

    /* access modifiers changed from: private */
    public void showAttributes(List<IKeyValueData> list) {
        if (getRent() instanceof CoworkingRentTicket) {
            CoworkingRentTicket coworkingRentTicket = (CoworkingRentTicket) getRent();
            coworkingRentTicket.appendChild(list, coworkingRentTicket.getChildren().size());
            this.childrenList.setData(coworkingRentTicket.getChildList());
        }
        if (getRent() instanceof AbstractRentTicketWithId) {
            this.rentImageSection.setData(((AbstractRentTicketWithId) getRent()).getImageUrls());
        }
        this.attributesSection.setData(getRent().generateFinishInfo(list));
    }

    /* access modifiers changed from: private */
    public void showPreview(List<SomeString> list) {
        nextFragment(ImageFullViewFragment.start(list.size()), false);
    }

    public AbstractRentTicket getRent() {
        return (AbstractRentTicket) getArguments().getParcelable("rent");
    }
}
