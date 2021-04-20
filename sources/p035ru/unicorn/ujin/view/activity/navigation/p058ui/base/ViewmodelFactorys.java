package p035ru.unicorn.ujin.view.activity.navigation.p058ui.base;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.HashMap;
import java.util.Map;
import p035ru.unicorn.fragments.development.DeveloperViewModel;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.market.model.MarketViewModel;
import p035ru.unicorn.ujin.serviceticket.presentation.ServiceTicketViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.GatesViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.CoronaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.MyRentaCompanyViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company.PassCompanyVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.MyProfileViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabViewModel;
import p035ru.unicorn.ujin.view.activity.viewmodel.ThirdPhaseViewModel;
import p035ru.unicorn.ujin.view.fragments.anotherPass.AnotherPassViewModel;
import p035ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.base.ViewmodelFactorys */
public class ViewmodelFactorys implements ViewModelProvider.Factory {
    private static ViewmodelFactorys instance;
    private final Map<Class<? extends ViewModel>, ViewModel> viewModels = new HashMap();

    private ViewmodelFactorys() {
    }

    public static ViewmodelFactorys getInstance() {
        if (instance == null) {
            instance = new ViewmodelFactorys();
        }
        return instance;
    }

    public <T extends ViewModel> T create(Class<T> cls) {
        if (this.viewModels.containsKey(cls)) {
            return (ViewModel) this.viewModels.get(cls);
        }
        if (cls.isAssignableFrom(ProfileTabViewModel.class)) {
            T profileTabViewModel = new ProfileTabViewModel();
            this.viewModels.put(cls, profileTabViewModel);
            return profileTabViewModel;
        } else if (cls.isAssignableFrom(MyProfileViewModel.class)) {
            T myProfileViewModel = new MyProfileViewModel();
            this.viewModels.put(cls, myProfileViewModel);
            return myProfileViewModel;
        } else if (cls.isAssignableFrom(MyRentaViewModel.class)) {
            T myRentaViewModel = new MyRentaViewModel();
            this.viewModels.put(cls, myRentaViewModel);
            return myRentaViewModel;
        } else if (cls.isAssignableFrom(ThirdPhaseViewModel.class)) {
            T thirdPhaseViewModel = new ThirdPhaseViewModel();
            this.viewModels.put(cls, thirdPhaseViewModel);
            return thirdPhaseViewModel;
        } else if (cls.isAssignableFrom(HelpDeskViewModel.class)) {
            T helpDeskViewModel = new HelpDeskViewModel();
            this.viewModels.put(cls, helpDeskViewModel);
            return helpDeskViewModel;
        } else if (cls.isAssignableFrom(MyRentaCompanyViewModel.class)) {
            T myRentaCompanyViewModel = new MyRentaCompanyViewModel();
            this.viewModels.put(cls, myRentaCompanyViewModel);
            return myRentaCompanyViewModel;
        } else if (cls.isAssignableFrom(SimpleViewModel.class)) {
            T simpleViewModel = new SimpleViewModel();
            this.viewModels.put(cls, simpleViewModel);
            return simpleViewModel;
        } else if (cls.isAssignableFrom(DeveloperViewModel.class)) {
            T developerViewModel = new DeveloperViewModel();
            this.viewModels.put(cls, developerViewModel);
            return developerViewModel;
        } else if (cls.isAssignableFrom(CoronaViewModel.class)) {
            T coronaViewModel = new CoronaViewModel();
            this.viewModels.put(cls, coronaViewModel);
            return coronaViewModel;
        } else if (cls.isAssignableFrom(PassProfileVM.class)) {
            T passProfileVM = new PassProfileVM();
            this.viewModels.put(cls, passProfileVM);
            return passProfileVM;
        } else if (cls.isAssignableFrom(PassCompanyVM.class)) {
            T passCompanyVM = new PassCompanyVM();
            this.viewModels.put(cls, passCompanyVM);
            return passCompanyVM;
        } else if (cls.isAssignableFrom(ProfileViewModel.class)) {
            T profileViewModel = new ProfileViewModel();
            this.viewModels.put(cls, profileViewModel);
            return profileViewModel;
        } else if (cls.isAssignableFrom(RecordsViewModel.class)) {
            T recordsViewModel = new RecordsViewModel();
            this.viewModels.put(cls, recordsViewModel);
            return recordsViewModel;
        } else if (cls.isAssignableFrom(ProfileSelectionVM.class)) {
            T profileSelectionVM = new ProfileSelectionVM();
            this.viewModels.put(cls, profileSelectionVM);
            return profileSelectionVM;
        } else if (cls.isAssignableFrom(ServiceTicketViewModel.class)) {
            T serviceTicketViewModel = new ServiceTicketViewModel();
            this.viewModels.put(cls, serviceTicketViewModel);
            return serviceTicketViewModel;
        } else if (cls.isAssignableFrom(AnotherPassViewModel.class)) {
            T anotherPassViewModel = new AnotherPassViewModel();
            this.viewModels.put(cls, anotherPassViewModel);
            return anotherPassViewModel;
        } else if (cls.isAssignableFrom(GatesViewModel.class)) {
            T gatesViewModel = new GatesViewModel();
            this.viewModels.put(cls, gatesViewModel);
            return gatesViewModel;
        } else if (cls.isAssignableFrom(MarketViewModel.class)) {
            T marketViewModel = new MarketViewModel();
            this.viewModels.put(cls, marketViewModel);
            return marketViewModel;
        } else {
            throw new IllegalStateException("no such type " + cls.getName());
        }
    }

    public void clear() {
        this.viewModels.clear();
    }

    public void clear(Class<? extends ViewModel> cls) {
        this.viewModels.remove(cls);
    }
}
