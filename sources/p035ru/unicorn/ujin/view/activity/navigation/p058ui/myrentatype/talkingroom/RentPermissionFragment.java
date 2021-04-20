package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.BaseSectionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentPermissionFragment */
public class RentPermissionFragment extends BaseSectionFragment<MyRentaViewModel> {
    RentInfoSection rentInfoSection;

    public void onViewCreated(MyRentaViewModel myRentaViewModel) {
    }

    private RentPermissionFragment() {
    }

    public static RentPermissionFragment start(AbstractRentTicket abstractRentTicket) {
        RentPermissionFragment rentPermissionFragment = new RentPermissionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        rentPermissionFragment.setArguments(bundle);
        return rentPermissionFragment;
    }

    /* access modifiers changed from: protected */
    public void initSections() {
        if (this.rentInfoSection == null) {
            this.rentInfoSection = new RentInfoSection();
        }
        this.sectionedAdapter.addSection(this.rentInfoSection);
    }

    public MyRentaViewModel getViewModell() {
        return (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
    }

    /* access modifiers changed from: protected */
    public String getMyToolbarTitle() {
        return getRent().getLocalTicketTypeName();
    }

    public AbstractRentTicket getRent() {
        return (AbstractRentTicket) getArguments().getParcelable("rent");
    }
}
