package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.util.ArrayList;
import java.util.Calendar;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.Constants;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogBuilder;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.TimeTableObj;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.ProfileTabFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.MorionTicketFragmentE;
import p035ru.unicorn.ujin.view.customViews.HorizontalSchdulerView2;
import p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingRoomSchedulerFragment */
public class TalkingRoomSchedulerFragment extends BaseFragment implements VerticalSchedulerHumanView.IDateChoose {
    private HorizontalSchdulerView2 horizontalSchdulerView;
    private HorizontalScrollView layout;
    private int propId;
    private MyRentaViewModel rentaViewModel;

    /* renamed from: sv */
    private ScrollView f6833sv;
    private TextView tvGoNext;
    private VerticalSchedulerHumanView verticalSchedulerView;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_renta_talking_sheduler;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static TalkingRoomSchedulerFragment start(AbstractRentTicket abstractRentTicket, String str) {
        TalkingRoomSchedulerFragment talkingRoomSchedulerFragment = new TalkingRoomSchedulerFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        bundle.putString(Constants.ARG_DATE, str);
        talkingRoomSchedulerFragment.setArguments(bundle);
        return talkingRoomSchedulerFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.layout = (HorizontalScrollView) viewGroup2.findViewById(R.id.hh);
        this.f6833sv = (ScrollView) viewGroup2.findViewById(R.id.sv);
        this.verticalSchedulerView = new VerticalSchedulerHumanView(requireActivity(), getArguments().getString(Constants.ARG_DATE));
        this.f6833sv.addView(this.verticalSchedulerView);
        this.verticalSchedulerView.setOnTouchListener(C5892x69ea2493.INSTANCE);
        this.verticalSchedulerView.setiDateChoose(this);
        this.f6913pb = (ProgressBar) viewGroup2.findViewById(R.id.pb);
        return viewGroup2;
    }

    static /* synthetic */ boolean lambda$onCreateView$0(View view, MotionEvent motionEvent) {
        return motionEvent.getAction() != 1;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.propId = getRent().getRentId();
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.rentaViewModel.getCurrentDay().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TalkingRoomSchedulerFragment.this.changePosition((Integer) obj);
            }
        });
        this.rentaViewModel.timeTableSlots.observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TalkingRoomSchedulerFragment.this.showTimeSlots((Resource) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void changePosition(Integer num) {
        this.verticalSchedulerView.clearResult();
        this.verticalSchedulerView.setStatus(VerticalSchedulerHumanView.STATUS.LOADING);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingRoomSchedulerFragment$2 */
    static /* synthetic */ class C58982 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingRoomSchedulerFragment.C58982.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showTimeSlots(Resource<TimeTableObj> resource) {
        if (resource != null) {
            int i = C58982.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.verticalSchedulerView.setStatus(VerticalSchedulerHumanView.STATUS.LOADING);
            } else if (i != 2) {
                if (i == 3) {
                    this.verticalSchedulerView.setStatus(VerticalSchedulerHumanView.STATUS.ERROR);
                }
            } else if (resource.getData() == null || resource.getData().getTimeSlotsHumanList() == null) {
                this.verticalSchedulerView.setStatus(VerticalSchedulerHumanView.STATUS.ERROR);
            } else {
                this.verticalSchedulerView.setHumanSlotsList(resource.getData().getTimeSlotsHumanList(), resource.getData().isAllDayIsFree(), resource.getData().date);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getString(R.string.label_date_time));
        getBaseActivity().setToolbarRight(getParams());
    }

    private ArrayList<View> getParams() {
        ArrayList<View> arrayList = new ArrayList<>();
        this.tvGoNext = new TextView(getActivity());
        this.tvGoNext.setText(getString(R.string.activate));
        this.tvGoNext.setTextSize(17.0f);
        this.tvGoNext.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorLineInActive));
        arrayList.add(this.tvGoNext);
        return arrayList;
    }

    private void creteRent(Pair<String, String> pair) {
        this.tvGoNext.setOnClickListener((View.OnClickListener) null);
        AbstractRentTicket.RentTicketTypes localTicketType = getRent().getLocalTicketType();
        if (localTicketType == AbstractRentTicket.RentTicketTypes.TalkingRoom) {
            this.f6913pb.setVisibility(0);
            this.rentaViewModel.createRent(this.propId, (String) pair.first, (String) pair.second);
            this.rentaViewModel.getTalkingRentaMake().observe(this, new Observer() {
                public final void onChanged(Object obj) {
                    TalkingRoomSchedulerFragment.this.onMakeRentResult((Resource) obj);
                }
            });
        } else if (localTicketType == AbstractRentTicket.RentTicketTypes.EventArea) {
            AbstractRentTicketWithId rent = getRent();
            rent.setStartDate((String) pair.first);
            rent.setFinishDate((String) pair.second);
            nextFragment(MorionTicketFragmentE.start(rent), false);
        }
    }

    /* access modifiers changed from: private */
    public void onMakeRentResult(Resource<TalkinkRentaObject> resource) {
        if (resource != null) {
            int i = C58982.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.f6913pb.setVisibility(8);
                if (resource.getData() != null) {
                    showDialogResult(resource.getData().getRent().getState().getName());
                }
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    public void showDialogResult(String str) {
        String str2;
        if (str != null) {
            if (str.toLowerCase().equals("accepted")) {
                str2 = getString(R.string.label_rent_approve);
            } else {
                str2 = getString(R.string.label_rent_on_review);
            }
            new DialogBuilder.Builder(getActivity()).subtitle(str2).subTitleTextColor(R.color.brandSecondaryDark).subtitleGravity(17).buttonNegativeColor(0).callback(new DialogBuilder.OnButtonDialogClick() {
                public void onNegativeClick(AlertDialog alertDialog) {
                }

                public void onPositiveClick(AlertDialog alertDialog) {
                    TalkingRoomSchedulerFragment.this.nextFragment(ProfileTabFragment.start(), true);
                    alertDialog.dismiss();
                }
            }).build();
        }
    }

    public AbstractRentTicketWithId getRent() {
        return (AbstractRentTicketWithId) getArguments().getParcelable("rent");
    }

    public void onDestroyView() {
        this.verticalSchedulerView.clearResult();
        super.onDestroyView();
    }

    public void onDateChoose(Pair<String, String> pair) {
        if (pair == null || ((String) pair.first).equals("")) {
            this.tvGoNext.setOnClickListener((View.OnClickListener) null);
            this.tvGoNext.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorLineInActive));
            return;
        }
        this.tvGoNext.setOnClickListener(new View.OnClickListener(pair) {
            private final /* synthetic */ Pair f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                TalkingRoomSchedulerFragment.this.lambda$onDateChoose$1$TalkingRoomSchedulerFragment(this.f$1, view);
            }
        });
        this.tvGoNext.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorLine));
    }

    public /* synthetic */ void lambda$onDateChoose$1$TalkingRoomSchedulerFragment(Pair pair, View view) {
        creteRent(pair);
    }

    public void onChangeFormCalendar(Calendar calendar) {
        this.rentaViewModel.onDateChange(getRent().getRentId(), calendar);
    }
}
