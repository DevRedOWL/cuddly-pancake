package p035ru.unicorn.ujin.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.data.developerPage.CarouselPhoto;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.adapters.PhotosPagerResourceIdsAdapter;
import p035ru.unicorn.ujin.view.adapters.PhotosPagerUrlsAdapter;
import p051me.relex.circleindicator.CircleIndicator;

/* renamed from: ru.unicorn.ujin.view.activity.UrlCarouselViewActivity */
public class UrlCarouselViewActivity extends AppCompatActivity {
    public static final String POSITION = "position";
    public static final String RESOURCE_IDS = "resourceIds";
    public static final String SHOW_TABS = "showTabs";
    public static final String TITLE = "title";
    public static final String URLS = "urls";
    CircleIndicator circleIndicator;
    private Flavor flavor;
    private ArrayList<CarouselPhoto> images;
    private ArrayList<Integer> imagesResourceIds;
    private int position;
    private boolean showTabs;
    TabLayout tabLayoutPhotoTitles;
    private String title;
    TextView tvTitle;
    ViewPager viewPagerPhotos;

    public static void start(Context context, ArrayList<CarouselPhoto> arrayList, ArrayList<Integer> arrayList2, String str, int i, boolean z) {
        Intent intent = new Intent(context, UrlCarouselViewActivity.class);
        intent.putExtra(SHOW_TABS, false);
        intent.putExtra(URLS, arrayList);
        intent.putExtra("title", str);
        intent.putExtra(RESOURCE_IDS, arrayList2);
        intent.putExtra("position", i);
        intent.putExtra(SHOW_TABS, z);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView((int) R.layout.activity_url_carousel_view);
        this.flavor = Flavor.getByFlavor("kortros");
        findViewById(R.id.imageBack).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                UrlCarouselViewActivity.this.lambda$onCreate$0$UrlCarouselViewActivity(view);
            }
        });
        initData();
        initViews();
    }

    public /* synthetic */ void lambda$onCreate$0$UrlCarouselViewActivity(View view) {
        onBackPressed();
    }

    private void initViews() {
        boolean z;
        ArrayList<Integer> arrayList;
        ArrayList<CarouselPhoto> arrayList2;
        ArrayList<Integer> arrayList3;
        this.tabLayoutPhotoTitles = (TabLayout) findViewById(R.id.tabPhotoTitles);
        this.viewPagerPhotos = (ViewPager) findViewById(R.id.viewPagerPhotos);
        this.tvTitle = (TextView) findViewById(R.id.textTitle);
        this.circleIndicator = (CircleIndicator) findViewById(R.id.ciViewPager);
        this.tabLayoutPhotoTitles.setupWithViewPager(this.viewPagerPhotos);
        ArrayList<CarouselPhoto> arrayList4 = this.images;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            this.viewPagerPhotos.setAdapter(new PhotosPagerResourceIdsAdapter(this.imagesResourceIds));
        } else {
            this.viewPagerPhotos.setAdapter(new PhotosPagerUrlsAdapter(this.images));
        }
        TabLayout tabLayout = this.tabLayoutPhotoTitles;
        tabLayout.selectTab(tabLayout.getTabAt(this.position));
        if (StringUtils.isNotEmpty(this.title)) {
            this.tvTitle.setText(this.title);
        } else {
            this.tvTitle.setVisibility(8);
            findViewById(R.id.imageTitle).setVisibility(this.flavor.isHasImageLogo() ? 0 : 8);
        }
        if (!this.showTabs) {
            this.tabLayoutPhotoTitles.setVisibility(8);
            return;
        }
        ArrayList<CarouselPhoto> arrayList5 = this.images;
        if (arrayList5 != null && arrayList5.size() > 0) {
            Iterator<CarouselPhoto> it = this.images.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (StringUtils.isNotEmpty(it.next().getTitle())) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (!z || (((arrayList2 = this.images) == null || arrayList2.size() <= 1) && ((arrayList3 = this.imagesResourceIds) == null || arrayList3.size() <= 1))) {
            ArrayList<CarouselPhoto> arrayList6 = this.images;
            if ((arrayList6 != null && arrayList6.size() == 1) || ((arrayList = this.imagesResourceIds) != null && arrayList.size() == 1)) {
                this.tabLayoutPhotoTitles.setVisibility(8);
            }
            this.circleIndicator.setVisibility(8);
            return;
        }
        this.tabLayoutPhotoTitles.setVisibility(8);
        this.circleIndicator.setViewPager(this.viewPagerPhotos);
        this.circleIndicator.setVisibility(0);
    }

    private void initData() {
        try {
            this.images = (ArrayList) getIntent().getSerializableExtra(URLS);
            this.imagesResourceIds = getIntent().getIntegerArrayListExtra(RESOURCE_IDS);
            this.title = getIntent().getStringExtra("title");
            this.position = getIntent().getIntExtra("position", 0);
            this.showTabs = getIntent().getBooleanExtra(SHOW_TABS, true);
        } catch (Exception unused) {
            Toast.makeText(getApplicationContext(), R.string.error_getting_data, 1).show();
            finish();
        }
    }
}
