package p035ru.unicorn.ujin.view.fragments.news;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.data.realm.ImageData;
import p035ru.unicorn.ujin.data.realm.News;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.UrlCarouselViewActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SimpleViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;
import p051me.relex.circleindicator.CircleIndicator;

/* renamed from: ru.unicorn.ujin.view.fragments.news.NewspieceFragment */
public class NewspieceFragment extends BaseFragment {
    private static final String NEWS_FROM_PUSH = "key_news_from_push";
    public static final String NEWS_ID = "newsId";
    private CircleIndicator indicator;
    private boolean isNewsByPushClick;
    private String newsId;
    private ArrayList<ImageData> photos;
    private SimpleViewModel simpleViewModel;
    private TextView textDate;
    private TextView textNewsText;
    private TextView textNewsTitle;
    private ViewPager vpPhotos;

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return "";
    }

    public static NewspieceFragment newInstance(String str) {
        return newInstance(str, false);
    }

    public static NewspieceFragment newInstance(String str, boolean z) {
        NewspieceFragment newspieceFragment = new NewspieceFragment();
        Bundle bundle = new Bundle();
        bundle.putString(NEWS_ID, str);
        bundle.putBoolean(NEWS_FROM_PUSH, z);
        newspieceFragment.setArguments(bundle);
        return newspieceFragment;
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        if (Flavor.getByFlavor("kortros").isHasImageLogo()) {
            getBaseActivity().showImageLogo();
        } else {
            getBaseActivity().setTextTitle(getString(R.string.title_news));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_new, viewGroup, false);
        this.textNewsTitle = (TextView) inflate.findViewById(R.id.TextView_title_news_ID);
        this.textNewsText = (TextView) inflate.findViewById(R.id.textView_body_news_ID);
        this.vpPhotos = (ViewPager) inflate.findViewById(R.id.vpPhotos);
        this.indicator = (CircleIndicator) inflate.findViewById(R.id.indicator);
        this.textDate = (TextView) inflate.findViewById(R.id.textView_dt_news_ID);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.newsId = getArguments().getString(NEWS_ID);
        this.isNewsByPushClick = getArguments().getBoolean(NEWS_FROM_PUSH, false);
        showNewspiece();
        return inflate;
    }

    private void showNewspiece() {
        this.simpleViewModel = (SimpleViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(SimpleViewModel.class);
        this.simpleViewModel.getNewsByIdEventSingleLiveEvent().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                NewspieceFragment.this.showNewsById((Resource) obj);
            }
        });
        if (this.isNewsByPushClick) {
            this.simpleViewModel.getNewsById(this.newsId);
        } else {
            this.simpleViewModel.getNewsById();
        }
    }

    /* renamed from: ru.unicorn.ujin.view.fragments.news.NewspieceFragment$1 */
    static /* synthetic */ class C60341 {
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
            throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.news.NewspieceFragment.C60341.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void showNewsById(Resource<News> resource) {
        if (resource != null) {
            int i = C60341.$SwitchMap$ru$unicorn$ujin$data$realm$Resource$Status[resource.getStatus().ordinal()];
            if (i == 1) {
                this.f6913pb.setVisibility(0);
            } else if (i != 2) {
                if (i == 3) {
                    this.f6913pb.setVisibility(8);
                    DialogHelper.showDialog((Context) getActivity(), resource.getMessage());
                }
            } else if (resource.getData() != null) {
                showNews(resource.getData());
            } else {
                DialogHelper.showDialog((Context) getActivity(), getString(R.string.dialog_error_loading_news_by_id));
            }
        }
    }

    private void showNews(News news) {
        this.textNewsTitle.setText(news.getTitle());
        this.textNewsText.setText(Html.fromHtml(news.getText()));
        this.textNewsText.setMovementMethod(LinkMovementMethod.getInstance());
        this.textDate.setText(news.getDateText());
        this.photos = new ArrayList<>();
        if (news.getImageList() != null && news.getImageList().size() > 0) {
            this.photos.addAll(news.getImageList());
        } else if (news.getImageData() != null && StringUtils.isNotBlank(news.getImageData().getSource())) {
            this.photos.add(news.getImageData());
        }
        if (this.photos.isEmpty()) {
            this.vpPhotos.setVisibility(8);
            return;
        }
        this.vpPhotos.setAdapter(new NewsPhotosPagerAdapter(news.getImageList(), new Function1() {
            public final Object invoke(Object obj) {
                return NewspieceFragment.this.lambda$showNews$0$NewspieceFragment((Integer) obj);
            }
        }));
        this.vpPhotos.setPageMargin(getResources().getDimensionPixelOffset(R.dimen.padding));
        this.vpPhotos.setClipToPadding(false);
        if (news.getImageList().size() == 1) {
            this.indicator.setVisibility(8);
            return;
        }
        this.indicator.setVisibility(0);
        this.indicator.setViewPager(this.vpPhotos);
    }

    /* access modifiers changed from: private */
    /* renamed from: handlePictureClick */
    public Unit lambda$showNews$0$NewspieceFragment(Integer num) {
        ArrayList arrayList = new ArrayList();
        Iterator<ImageData> it = this.photos.iterator();
        while (it.hasNext()) {
            ImageData next = it.next();
            arrayList.add(new CarouselPhoto(next.getSource(), "", next.getTitle()));
        }
        UrlCarouselViewActivity.start(getContext(), arrayList, (ArrayList<Integer>) null, (String) null, num.intValue(), true);
        return null;
    }
}
