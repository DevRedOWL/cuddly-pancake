package p035ru.unicorn.ujin.view.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.Observer;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Favourite;
import p035ru.unicorn.ujin.view.adapters.AdapterFavorites;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;

/* renamed from: ru.unicorn.ujin.view.fragments.FavouritesListFragment */
public class FavouritesListFragment extends BaseFragment implements AdapterFavorites.OnItemClickListener {
    private ArrayList<Favourite> arrayFavorites = new ArrayList<>();
    private AdapterFavorites mAdapter;
    private ListView mList;
    private ProfileLocalRepository profileLocalRepository;
    private TextView textEmptyMessage;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static FavouritesListFragment newInstance() {
        return new FavouritesListFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.viewModel.getModelUpdateMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                FavouritesListFragment.this.handleEvent((UpdateEvent) obj);
            }
        });
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        getBaseActivity().showImageLogo();
    }

    /* access modifiers changed from: protected */
    public void handleEvent(UpdateEvent updateEvent) {
        if (updateEvent.getSuccess()) {
            refreshFavorites();
        } else {
            Toast.makeText(getActivity(), updateEvent.getMessage(), 1).show();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_love, viewGroup, false);
        this.textEmptyMessage = (TextView) inflate.findViewById(R.id.textView_loveFlat_ID);
        this.textEmptyMessage.setText(R.string.noFavouritesYet);
        this.mList = (ListView) inflate.findViewById(R.id.ListView_love_flats_ID);
        this.mAdapter = new AdapterFavorites(inflate.getContext(), this.viewModel);
        this.mAdapter.setOnItemClickListener(this);
        this.mList.setAdapter(this.mAdapter);
        this.profileLocalRepository = ProfileLocalRepository.Companion.getInstance();
        if (this.profileLocalRepository.isDemo()) {
            showEmptyListMessage();
        } else {
            refreshEmptyListMessage();
        }
        this.viewModel.requestUpdateFavouritesList(this.profileLocalRepository.getUserToken());
        return inflate;
    }

    private void refreshEmptyListMessage() {
        if (this.viewModel.getFavouritesList().size() > 0) {
            hideEmptyListMessage();
        } else {
            showEmptyListMessage();
        }
    }

    private void showEmptyListMessage() {
        this.textEmptyMessage.setVisibility(0);
        this.mList.setVisibility(4);
    }

    private void hideEmptyListMessage() {
        this.textEmptyMessage.setVisibility(4);
        this.mList.setVisibility(0);
    }

    private void refreshFavorites() {
        refreshEmptyListMessage();
        this.mAdapter.notifyDataSetChanged();
    }

    public void onItemClick(String str) {
        getBaseActivity().showFavouriteFlat(str);
    }
}
