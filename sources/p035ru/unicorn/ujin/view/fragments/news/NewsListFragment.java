package p035ru.unicorn.ujin.view.fragments.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.api.response.NewsListResponseData;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.AppStage;
import p035ru.unicorn.ujin.view.activity.bottomNavigationActivity.StageActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.adapters.AdapterNews;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p046io.realm.RealmList;

/* renamed from: ru.unicorn.ujin.view.fragments.news.NewsListFragment */
public class NewsListFragment extends BaseFragment implements AdapterNews.OnItemClickListener {
    private ImageView imageMenu;
    private AdapterNews mAdapter;
    private RecyclerView mList;
    private RealmList<News> newsList = new RealmList<>();
    private ArrayList<News> result = new ArrayList<>();
    private SimpleViewModel simpleViewModel;
    private TextView tvNoNews;
    View view;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static NewsListFragment newInstance() {
        return new NewsListFragment();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: private */
    public void handleEvent(Resource<NewsListResponseData> resource) {
        if (!resource.getStatus().equals(Resource.Status.SUCCESS)) {
            Toast.makeText(getActivity(), resource.getMessage(), 1).show();
        } else if (resource.getData() == null || (resource.getData() != null && (resource.getData().getNewsList() == null || resource.getData().getNewsList().isEmpty()))) {
            showNoNewsMessage();
        } else {
            hideNoNewsMessage();
            this.newsList = resource.getData().getNewsList();
            this.result = new ArrayList<>(this.newsList);
            this.mAdapter.setNewsList(this.result);
        }
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        if (((StageActivity) getBaseActivity()).getAppStage() == AppStage.SMARTFLAT) {
            getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        } else {
            getBaseActivity().setToolbarLeft(ToolbarButtons.PROFILE);
        }
        if (Flavor.getByFlavor("kortros").isHasImageLogo()) {
            getBaseActivity().showImageLogo();
        } else {
            getBaseActivity().setTextTitle(getString(R.string.title_news));
        }
    }

    private void showNoNewsMessage() {
        this.mList.setVisibility(8);
        this.tvNoNews.setVisibility(0);
    }

    private void hideNoNewsMessage() {
        this.mList.setVisibility(0);
        this.tvNoNews.setVisibility(8);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view = layoutInflater.inflate(R.layout.fragment_news, viewGroup, false);
        this.mList = (RecyclerView) this.view.findViewById(R.id.ListView_news_ID);
        this.tvNoNews = (TextView) this.view.findViewById(R.id.tvNoNewsMessage);
        initList();
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
        this.simpleViewModel.getNewsList();
        this.simpleViewModel.getNewsListEventSingleLiveEvent().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                NewsListFragment.this.handleEvent((Resource) obj);
            }
        });
        return this.view;
    }

    private void initList() {
        this.mAdapter = new AdapterNews(this.view.getContext(), this.result);
        this.mAdapter.setOnItemClickListener(this);
        this.mList.addItemDecoration(new DividerItemDecoration(this.mList.getContext(), 1));
        this.mList.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.mList.setAdapter(this.mAdapter);
    }

    public void onItemClick(News news) {
        this.simpleViewModel.getNewsMutableLiveData().setValue(news);
        nextFragment(NewspieceFragment.newInstance(news.getId()), false, (String) null);
    }
}
