package p035ru.unicorn.ujin.view.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Flat;
import p035ru.unicorn.ujin.view.adapters.FlatAdapter;
import p035ru.unicorn.ujin.view.dialogs.SelectorDialog;
import p035ru.unicorn.ujin.view.fragments.searchFilter.ApartmentListEvent;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateSearchFavouriteFlatEvent;

/* renamed from: ru.unicorn.ujin.view.fragments.FlatListFragment */
public class FlatListFragment extends BaseFragment {
    private static final int SORT_PRICE_ASC = 0;
    private static final int SORT_PRICE_DESC = 1;
    private static final int SORT_SQUARE_ASC = 2;
    private static final int SORT_SQUARE_DESC = 3;
    private static int sortType;
    ApartmentListEvent apartmentListEvent;
    private ArrayList<Flat> arrayFlats = new ArrayList<>();
    private Comparator<Flat> comparatorPriceAsc = $$Lambda$FlatListFragment$_Bh1s6pUqSmVkKT7TVVp476wAM.INSTANCE;
    private Comparator<Flat> comparatorPriceDesc = $$Lambda$FlatListFragment$emnSmICIWent6MZ7K0bDFSPIPDM.INSTANCE;
    private Comparator<Flat> comparatorSquareAsc = $$Lambda$FlatListFragment$GW7IVJoikekOai7ghizJ6AhAFK4.INSTANCE;
    private Comparator<Flat> comparatorSquareDesc = $$Lambda$FlatListFragment$fpEYhgIb5MWojiiGkiQOKFrjlhA.INSTANCE;
    String currentComplexId;
    private FlatAdapter flatAdapter;
    private RecyclerView rvFlatList;
    private ArrayList<String> sortTypes;
    TextView textSortType;
    TextView textView_your_flat;
    private String token;
    private View view;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static FlatListFragment newInstance(ApartmentListEvent apartmentListEvent2, String str) {
        FlatListFragment flatListFragment = new FlatListFragment();
        flatListFragment.apartmentListEvent = apartmentListEvent2;
        flatListFragment.arrayFlats = apartmentListEvent2.getApartmentList();
        flatListFragment.currentComplexId = str;
        return flatListFragment;
    }

    public void onCreate(Bundle bundle) {
        sortType = 0;
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(this.apartmentListEvent.getComplexTitle());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_flats, viewGroup, false);
        this.textSortType = (TextView) this.view.findViewById(R.id.textView_sort_select_ID);
        this.sortTypes = new ArrayList<>();
        this.sortTypes.add("По возрастанию цены");
        this.sortTypes.add("По убыванию цены");
        this.sortTypes.add("По увеличению площади");
        this.sortTypes.add("По уменьшению площади");
        this.textSortType.setText(this.sortTypes.get(0));
        ((RelativeLayout) this.view.findViewById(R.id.relativeLayout_sort_ID)).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatListFragment.this.lambda$onCreateView$1$FlatListFragment(view);
            }
        });
        this.rvFlatList = (RecyclerView) this.view.findViewById(R.id.ListView_flats_ID);
        this.flatAdapter = new FlatAdapter(this.arrayFlats, this.viewModel, new FlatAdapter.OnFlatSelectedListener() {
            public final void onFlatSelected(String str, int i) {
                FlatListFragment.this.lambda$onCreateView$2$FlatListFragment(str, i);
            }
        });
        this.rvFlatList.setAdapter(this.flatAdapter);
        this.rvFlatList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.textView_your_flat = (TextView) this.view.findViewById(R.id.textView_your_flat_ID);
        this.token = ProfileLocalRepository.Companion.getInstance().getUserToken();
        showFlats();
        return this.view;
    }

    public /* synthetic */ void lambda$onCreateView$1$FlatListFragment(View view2) {
        SelectorDialog selectorDialog = new SelectorDialog();
        selectorDialog.setData(new ArrayList(this.sortTypes));
        selectorDialog.setClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FlatListFragment.this.lambda$null$0$FlatListFragment(view);
            }
        });
        selectorDialog.show(getFragmentManager(), "");
    }

    public /* synthetic */ void lambda$null$0$FlatListFragment(View view2) {
        handleSort((Integer) view2.getTag());
    }

    public /* synthetic */ void lambda$onCreateView$2$FlatListFragment(String str, int i) {
        getBaseActivity().showFlat(str, Integer.valueOf(i), this.currentComplexId);
    }

    public void onResume() {
        super.onResume();
        this.viewModel.getSearchFavouriteFlatUpdateMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                FlatListFragment.this.lambda$onResume$3$FlatListFragment((UpdateSearchFavouriteFlatEvent) obj);
            }
        });
        this.textSortType.setText(this.sortTypes.get(sortType));
        handleSort(Integer.valueOf(sortType));
    }

    public /* synthetic */ void lambda$onResume$3$FlatListFragment(UpdateSearchFavouriteFlatEvent updateSearchFavouriteFlatEvent) {
        Flat flatById = this.viewModel.getFlatById(updateSearchFavouriteFlatEvent.getFlatId());
        if (flatById != null) {
            this.flatAdapter.updateItem(updateSearchFavouriteFlatEvent.getPosition(), flatById);
        }
    }

    private void handleSort(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            Collections.sort(this.arrayFlats, this.comparatorPriceAsc);
        } else if (intValue == 1) {
            Collections.sort(this.arrayFlats, this.comparatorPriceDesc);
        } else if (intValue == 2) {
            Collections.sort(this.arrayFlats, this.comparatorSquareAsc);
        } else if (intValue == 3) {
            Collections.sort(this.arrayFlats, this.comparatorSquareDesc);
        }
        sortType = num.intValue();
        this.flatAdapter.setItems(this.arrayFlats);
        this.textSortType.setText(this.sortTypes.get(num.intValue()));
    }

    static /* synthetic */ int lambda$new$5(Flat flat, Flat flat2) {
        return flat.getPrice().compareTo(flat2.getPrice()) * -1;
    }

    static /* synthetic */ int lambda$new$6(Flat flat, Flat flat2) {
        if (flat.getSquare().equals(flat2.getSquare())) {
            return 0;
        }
        return flat.getSquare().doubleValue() > flat2.getSquare().doubleValue() ? 1 : -1;
    }

    static /* synthetic */ int lambda$new$7(Flat flat, Flat flat2) {
        if (flat.getSquare().equals(flat2.getSquare())) {
            return 0;
        }
        return flat.getSquare().doubleValue() > flat2.getSquare().doubleValue() ? -1 : 1;
    }

    private void showFlats() {
        this.flatAdapter.setData(this.arrayFlats);
        this.flatAdapter.notifyDataSetChanged();
        TextView textView = this.textView_your_flat;
        textView.setText("Вам подходят " + this.apartmentListEvent.getEnding());
    }
}
