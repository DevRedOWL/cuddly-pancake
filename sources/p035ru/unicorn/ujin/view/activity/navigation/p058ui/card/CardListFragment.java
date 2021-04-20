package p035ru.unicorn.ujin.view.activity.navigation.p058ui.card;

import android.content.Context;
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
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.PassCard;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SectionedAdapter;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.repository.RemoteRepository;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.card.CardListFragment */
public class CardListFragment extends BaseFragment {
    private Button btnAddCode;
    private CardListSection cardListSection;
    private EmptySection emptySection;

    /* renamed from: pb */
    private ProgressBar f6745pb;

    /* renamed from: rv */
    private RecyclerView f6746rv;
    private SectionedAdapter sectionedAdapter;
    private SimpleViewModel simpleViewModel;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_card_list;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static CardListFragment start() {
        return new CardListFragment();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.btnAddCode = (Button) inflate.findViewById(R.id.btn_add_code);
        this.f6746rv = (RecyclerView) inflate.findViewById(R.id.rv);
        this.f6745pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.btnAddCode.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CardListFragment.this.lambda$onCreateView$0$CardListFragment(view);
            }
        });
        return inflate;
    }

    public /* synthetic */ void lambda$onCreateView$0$CardListFragment(View view) {
        nextFragment(CardFragment.start(true), false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.sectionedAdapter = new SectionedAdapter();
        this.f6746rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f6746rv.setAdapter(this.sectionedAdapter);
        if (this.cardListSection == null) {
            this.cardListSection = new CardListSection();
            this.cardListSection.simpleClicks().subscribe(new Consumer() {
                public final void accept(Object obj) {
                    CardListFragment.this.onItemClick((CardData) obj);
                }
            });
        }
        if (this.emptySection == null) {
            this.emptySection = new EmptySection();
        }
        this.sectionedAdapter.addSection(this.cardListSection);
        this.sectionedAdapter.addSection(this.emptySection);
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m10of((Fragment) this).get(SimpleViewModel.class);
        this.simpleViewModel.getAllCard();
        this.simpleViewModel.getPassCardEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CardListFragment.this.showCardList((Resource) obj);
            }
        });
        this.simpleViewModel.getAppendDataLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                CardListFragment.this.onCreateTicket((Resource) obj);
            }
        });
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.card.CardListFragment$1 */
    static /* synthetic */ class C58081 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardListFragment.C58081.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onCreateTicket(Resource<CardData> resource) {
        if (resource != null) {
            int i = C58081.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6745pb.setVisibility(0);
            } else if (i == 2) {
                this.f6745pb.setVisibility(8);
                this.simpleViewModel.getAllCard();
            } else if (i == 3) {
                this.f6745pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: private */
    public void onItemClick(CardData cardData) {
        if (cardData.getViewId().intValue() != R.id.delete_card) {
            boolean equals = cardData.getType().equals(RemoteRepository.CAR);
            if (equals) {
                nextFragment(CardFragment.startVehicle(false, equals, cardData.getIdNumber(), cardData.getBrand(), cardData.getGuestFullname(), cardData.getComment(), cardData.getDateStart(), cardData.getDateEnd(), cardData.getId()), false);
            } else {
                nextFragment(CardFragment.startGuest(false, equals, cardData.getGuestFullname(), cardData.getGuestPhone(), cardData.getComment(), cardData.getDateStart(), cardData.getDateEnd(), cardData.getId()), false);
            }
        } else {
            new AlertDialog.Builder(getContext()).setTitle((CharSequence) getResources().getString(R.string.detetePass)).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(cardData) {
                private final /* synthetic */ CardData f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    CardListFragment.this.lambda$onItemClick$1$CardListFragment(this.f$1, dialogInterface, i);
                }
            }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) $$Lambda$CardListFragment$CXhP98c77bewZubjydHhe74dRWI.INSTANCE).show();
        }
    }

    public /* synthetic */ void lambda$onItemClick$1$CardListFragment(CardData cardData, DialogInterface dialogInterface, int i) {
        this.simpleViewModel.deleteCard(cardData.getId());
    }

    /* access modifiers changed from: private */
    public void showCardList(Resource<PassCard> resource) {
        if (resource != null) {
            int i = C58081.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6745pb.setVisibility(0);
            } else if (i == 2) {
                this.f6745pb.setVisibility(8);
                RealmList<CardData> cardDataList = resource.getData().getCardDataList();
                if (cardDataList == null || cardDataList.isEmpty()) {
                    this.cardListSection.show(false);
                    this.emptySection.show(true);
                    this.emptySection.setData(new SomeString("Нет пропусков"));
                    return;
                }
                this.emptySection.show(false);
                this.cardListSection.show(true);
                this.cardListSection.setData(resource.getData().getCardDataList());
            } else if (i == 3) {
                this.f6745pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    private void onOrderHandler(Resource<String> resource) {
        if (resource != null) {
            int i = C58081.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6745pb.setVisibility(0);
            } else if (i == 2) {
                this.f6745pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            } else if (i == 3) {
                this.f6745pb.setVisibility(8);
                DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setTextTitle(getString(R.string.toolbar_label_card_list));
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
