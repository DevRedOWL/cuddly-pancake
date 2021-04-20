package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicketRouter;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.HelpDeskViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.morionserviceticket.RentInfoFragment;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.MyRentaFragment */
public class MyRentaFragment extends BaseFragment {
    private static final String ARG_MODE = "arg_mode";
    public static final int MODE_ACCOMPLISHMENT_CHOOSE_RENT = 5;
    public static final int MODE_ADD_ROOM_TO_EMPLOYEE = 4;
    public static final int MODE_CHOOSE = 2;
    public static final int MODE_SERVICE_CHOOSE_RENT = 3;
    public static final int MODE_SHOW_ALL = 1;
    private Button btnAddMember;
    private EmptySection emptySection;
    private boolean isEditMode;
    private MyRentaSection myRentaSection;
    private RentaSection rentaSection;
    private RentaTypeSection rentaTypeSection;
    private MyRentaViewModel rentaViewModel;

    /* renamed from: rv */
    private RecyclerView f6811rv;
    private SectionedAdapter sectionedAdapter;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_choose_renta;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private MyRentaFragment() {
    }

    public static MyRentaFragment start(int i) {
        MyRentaFragment myRentaFragment = new MyRentaFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_mode", i);
        myRentaFragment.setArguments(bundle);
        return myRentaFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        int i = 0;
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6811rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnAddMember = (Button) inflate.findViewById(R.id.button);
        this.btnAddMember.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                MyRentaFragment.this.lambda$onCreateView$0$MyRentaFragment(view);
            }
        });
        int i2 = getArguments().getInt("arg_mode");
        Button button = this.btnAddMember;
        if (i2 == 2 || i2 == 4) {
            i = 4;
        }
        button.setVisibility(i);
        initAdapter();
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$MyRentaFragment(View view) {
        nextFragment(start(2), false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.f6913pb.setVisibility(0);
        int i = getArguments().getInt("arg_mode");
        if (i == 1) {
            this.rentaViewModel.getMyRentaUniqe();
            this.rentaViewModel.getMyRentLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    MyRentaFragment.this.showMyRenta((List) obj);
                }
            });
        } else if (i == 2) {
            this.rentaViewModel.showAvailableRenta();
            this.rentaViewModel.getRentTypeMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    MyRentaFragment.this.showAllAvailableType((List) obj);
                }
            });
        } else if (i == 3) {
            this.rentaViewModel.getChooseRentaUniqe();
            this.rentaViewModel.getRentInfoUniqueMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    MyRentaFragment.this.showMyRenta((List) obj);
                }
            });
        } else if (i == 4) {
            this.rentaViewModel.getMyRentaUniqeNoFilter();
            this.rentaViewModel.getMyRentLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    MyRentaFragment.this.showMyRenta((List) obj);
                }
            });
        } else if (i == 5) {
            this.rentaViewModel.getAccomplishmentChooseRentaUniqe();
            this.rentaViewModel.getAccomplishmentInfoUniqueMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
                public final void onChanged(Object obj) {
                    MyRentaFragment.this.showMyRenta((List) obj);
                }
            });
        }
    }

    private void showPeriods(Map<Integer, List<RentInfo>> map) {
        this.f6913pb.setVisibility(8);
        this.rentaSection.show(!map.isEmpty());
        this.emptySection.show(map.isEmpty());
        if (map.isEmpty()) {
            this.emptySection.setData(new SomeString("Нет арендованных помещений"));
            return;
        }
        if (getArguments().getInt("arg_mode") == 1) {
            this.rentaSection.setPeriods(map);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, List<RentInfo>> value : map.entrySet()) {
            arrayList.add(((List) value.getValue()).get(0));
        }
        this.rentaSection.setData(arrayList);
    }

    /* access modifiers changed from: private */
    public void showAllAvailableType(List<RentType> list) {
        this.f6913pb.setVisibility(8);
        this.emptySection.show(list.isEmpty());
        if (list.isEmpty()) {
            this.emptySection.setData(new SomeString("Нет доступных помещений"));
        } else {
            this.rentaTypeSection.setData(list);
        }
    }

    /* access modifiers changed from: private */
    public void showMyRenta(List<RentInfo> list) {
        this.f6913pb.setVisibility(8);
        int i = getArguments().getInt("arg_mode");
        boolean z = false;
        this.rentaSection.show(!list.isEmpty() || i == 1);
        MyRentaSection myRentaSection2 = this.myRentaSection;
        if (!list.isEmpty() || i != 1) {
            z = true;
        }
        myRentaSection2.show(z);
        this.emptySection.show(list.isEmpty());
        if (list.isEmpty()) {
            this.emptySection.setData(new SomeString("Нет арендованных помещений"));
        } else if (i == 1 || i == 4) {
            this.myRentaSection.setData(list);
        } else {
            this.rentaSection.setData(list);
        }
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6811rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6811rv.setAdapter(this.sectionedAdapter);
        if (this.myRentaSection == null) {
            this.myRentaSection = new MyRentaSection();
            this.myRentaSection.getSpecialClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onRentaClick((RentInfo) obj);
                }
            });
            this.myRentaSection.deleteClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onDeleteRent((RentInfo) obj);
                }
            });
            this.myRentaSection.manageClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onManageRent((RentInfo) obj);
                }
            });
            if (getArguments().getInt("arg_mode") == 4) {
                this.myRentaSection.setShowProps(false);
            }
        }
        if (this.rentaSection == null) {
            this.rentaSection = new RentaSection();
            this.rentaSection.getSpecialClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onRentaClick((RentInfo) obj);
                }
            });
            this.rentaSection.deleteClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onDeleteRent((RentInfo) obj);
                }
            });
            this.rentaSection.manageClick().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onManageRent((RentInfo) obj);
                }
            });
        }
        if (this.rentaTypeSection == null) {
            this.rentaTypeSection = new RentaTypeSection();
            this.rentaTypeSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    MyRentaFragment.this.onRentaTypeClick((RentType) obj);
                }
            });
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection(false, 14);
        }
        this.sectionedAdapter.addSection(this.emptySection);
        int i = getArguments().getInt("arg_mode");
        if (i == 1) {
            this.sectionedAdapter.addSection(this.myRentaSection);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.sectionedAdapter.addSection(this.myRentaSection);
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            this.sectionedAdapter.addSection(this.rentaSection);
        } else {
            this.sectionedAdapter.addSection(this.rentaTypeSection);
        }
    }

    /* access modifiers changed from: private */
    public void onManageRent(RentInfo rentInfo) {
        nextFragment(RentEmployeeListFragment.Companion.newInstance(rentInfo.getId().intValue(), rentInfo.getPropRenta().getTitle()), false);
    }

    /* access modifiers changed from: private */
    public void onRentaTypeClick(RentType rentType) {
        ITicketRouter.getInstance().ticketRouter((BaseFragment) this, rentType);
    }

    /* access modifiers changed from: private */
    public void onRentaClick(RentInfo rentInfo) {
        int i = getArguments().getInt("arg_mode");
        if (i != 1) {
            if (i != 3) {
                if (i == 4) {
                    ((HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class)).getCurrentRentInfo().setValue(rentInfo);
                    backFragment();
                    return;
                } else if (i != 5) {
                    return;
                }
            }
            ((HelpDeskViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(HelpDeskViewModel.class)).getCurrentRentInfo().setValue(rentInfo);
            backFragment();
            return;
        }
        this.rentaViewModel.getCurrent().setValue(rentInfo);
        nextFragment(RentInfoFragment.newInstance(rentInfo.getPropRenta().getId().intValue()), false);
    }

    /* access modifiers changed from: private */
    public void onDeleteRent(RentInfo rentInfo) {
        this.rentaViewModel.getCurrent().setValue(rentInfo);
        new AlertDialog.Builder(getBaseActivity()).setTitle((CharSequence) getString(R.string.dialog_title_delete)).setPositiveButton((int) R.string.dialog_title_delete_button, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(rentInfo) {
            private final /* synthetic */ RentInfo f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                MyRentaFragment.this.lambda$onDeleteRent$1$MyRentaFragment(this.f$1, dialogInterface, i);
            }
        }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) $$Lambda$MyRentaFragment$KGcjS6Q6rUiI1T7xKceOM6Ndlkw.INSTANCE).create().show();
    }

    public /* synthetic */ void lambda$onDeleteRent$1$MyRentaFragment(RentInfo rentInfo, DialogInterface dialogInterface, int i) {
        deleteRent(rentInfo.getId());
        dialogInterface.dismiss();
    }

    private void deleteRent(Integer num) {
        this.rentaViewModel.delete(num);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        if (getArguments().getInt("arg_mode") == 4) {
            getBaseActivity().setTextTitle("Изменить помещение");
        } else {
            getBaseActivity().setTextTitle(getString(R.string.title_renta));
        }
    }
}
