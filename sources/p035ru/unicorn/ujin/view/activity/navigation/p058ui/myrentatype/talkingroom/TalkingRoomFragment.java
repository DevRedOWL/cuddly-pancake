package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentInfo;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentaDescriptionFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.coworking.CoworkingFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.TalkingRoomSection;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingRoomFragment */
public class TalkingRoomFragment extends BaseFragment {
    private static final String ARG_FINISH = "arg_finish";
    private static final String ARG_PROP_ID = "arg_prop_id";
    private static final String ARG_PROP_TYPE = "arg_prop_name";
    private static final String ARG_START = "arg_start";
    private MyRentaViewModel rentaViewModel;

    /* renamed from: rv */
    private RecyclerView f6832rv;
    private SectionedAdapter sectionedAdapter;
    private TalkingRoomSection talkingSection;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_renta_talking;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private TalkingRoomFragment() {
    }

    public static TalkingRoomFragment start(AbstractRentTicket abstractRentTicket) {
        TalkingRoomFragment talkingRoomFragment = new TalkingRoomFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        talkingRoomFragment.setArguments(bundle);
        return talkingRoomFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6832rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        initAdapter();
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.f6913pb.setVisibility(0);
        AbstractRentTicket abstractRentTicket = (AbstractRentTicket) getArguments().getParcelable("rent");
        int rentTypeId = abstractRentTicket.getRentTypeId();
        String str = "";
        String str2 = (abstractRentTicket.getStartDate() == null || !abstractRentTicket.getStartDate().contains(" ")) ? str : abstractRentTicket.getStartDate().split(" ")[0];
        if (abstractRentTicket.getFinishDate() != null && abstractRentTicket.getFinishDate().contains(" ")) {
            str = abstractRentTicket.getFinishDate().split(" ")[0];
        }
        this.rentaViewModel.getTalkingRoom(String.valueOf(rentTypeId), str2, str);
        this.rentaViewModel.getTalkingMutableLiveData().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TalkingRoomFragment.this.showTalkingList((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingRoomFragment$1 */
    static /* synthetic */ class C58961 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.TalkingRoomFragment.C58961.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showTalkingList(Resource<List<TalkingData>> resource) {
        if (resource != null) {
            int i = C58961.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i == 2) {
                this.talkingSection.setData(resource.getData());
                this.f6913pb.setVisibility(8);
            } else if (i == 3) {
                this.f6913pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void initAdapter() {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6832rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6832rv.setNestedScrollingEnabled(true);
        this.f6832rv.setAdapter(this.sectionedAdapter);
        if (this.talkingSection == null) {
            this.talkingSection = new TalkingRoomSection(true);
            this.talkingSection.imageClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TalkingRoomFragment.this.lambda$initAdapter$0$TalkingRoomFragment((List) obj);
                }
            });
            this.talkingSection.specialClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    TalkingRoomFragment.this.lambda$initAdapter$1$TalkingRoomFragment((TalkingData) obj);
                }
            });
        }
        this.sectionedAdapter.addSection(this.talkingSection);
    }

    /* access modifiers changed from: private */
    /* renamed from: showScheduler */
    public void lambda$initAdapter$1$TalkingRoomFragment(TalkingData talkingData) {
        AbstractRentTicketWithId abstractRentTicketWithId = (AbstractRentTicketWithId) getRent();
        abstractRentTicketWithId.setRentId(talkingData.getId());
        abstractRentTicketWithId.setRentTitle(talkingData.getTitle());
        abstractRentTicketWithId.setImageUrls(SomeString.create(talkingData.getData()));
        String type = talkingData.getType();
        if (((type.hashCode() == -1140748987 && type.equals("coworking")) ? (char) 0 : 65535) != 0) {
            nextFragment(TalkingAdapterFragment.start(abstractRentTicketWithId), false);
            return;
        }
        this.rentaViewModel.getCurrentCowork().setValue(talkingData);
        nextFragment(CoworkingFragment.start(abstractRentTicketWithId), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: showPreview */
    public void lambda$initAdapter$0$TalkingRoomFragment(List<String> list) {
        this.rentaViewModel.getImagesMutableLiveData().setValue(list);
        nextFragment(ImageFullViewFragment.start(list.size()), false);
    }

    private void onRentaClick(RentInfo rentInfo) {
        this.rentaViewModel.getCurrent().setValue(rentInfo);
        nextFragment(RentaDescriptionFragment.start(rentInfo.getPropRenta().getTitle()), false);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getRent().getLocalTicketTypeName());
    }

    public AbstractRentTicket getRent() {
        return (AbstractRentTicket) getArguments().getParcelable("rent");
    }

    public void onDestroyView() {
        this.rentaViewModel.getCurrentDay().setValue(0);
        super.onDestroyView();
    }
}
