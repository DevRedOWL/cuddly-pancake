package p035ru.unicorn.ujin.view.activity.tutorial.kortrosmsf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.enums.Flavor;
import p035ru.unicorn.ujin.view.activity.tutorial.BaseTutorialActivity;
import p051me.relex.circleindicator.CircleIndicator;

/* renamed from: ru.unicorn.ujin.view.activity.tutorial.kortrosmsf.TutorialActivity */
public class TutorialActivity extends BaseTutorialActivity implements View.OnClickListener {
    Button btnNext;
    Button btnSkip;
    Button btnStart;
    boolean hasSupportMessage;
    CircleIndicator indicator;
    ViewPager pager;
    PagerAdapter pagerAdapter;
    LinearLayout supportLayout;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_tutorial);
        int intExtra = getIntent().getIntExtra(BaseTutorialActivity.ARG_ARRAY_ID, R.array.tutorial);
        final boolean booleanExtra = getIntent().getBooleanExtra(BaseTutorialActivity.ARG_SHOW_LAST_STEP, false);
        this.hasSupportMessage = Flavor.getByFlavor("kortros").isHasTutorialSupportMessage();
        this.pager = (ViewPager) findViewById(R.id.pager);
        this.indicator = (CircleIndicator) findViewById(R.id.indicator);
        this.btnSkip = (Button) findViewById(R.id.button_skip);
        this.btnNext = (Button) findViewById(R.id.button_next);
        this.btnStart = (Button) findViewById(R.id.button_start);
        this.supportLayout = (LinearLayout) findViewById(R.id.supportLayout);
        this.btnNext.setOnClickListener(this);
        this.btnSkip.setOnClickListener(this);
        this.btnStart.setOnClickListener(this);
        this.pagerAdapter = new TutorialAdapter(getSupportFragmentManager(), intExtra, this);
        this.pager.setAdapter(this.pagerAdapter);
        this.indicator.setViewPager(this.pager);
        this.pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                int i2 = 0;
                int i3 = i == 0 ? 0 : 4;
                int i4 = TutorialActivity.this.pagerAdapter.getCount() + -1 == i ? 0 : 4;
                if (!TutorialActivity.this.hasSupportMessage || TutorialActivity.this.pagerAdapter.getCount() - 1 != i || !booleanExtra) {
                    i2 = 4;
                }
                TutorialActivity.this.btnNext.setVisibility(i3);
                TutorialActivity.this.btnSkip.setVisibility(i3);
                TutorialActivity.this.btnStart.setVisibility(i4);
                TutorialActivity.this.supportLayout.setVisibility(i2);
            }
        });
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_next:
                ViewPager viewPager = this.pager;
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                return;
            case R.id.button_skip:
            case R.id.button_start:
                setResult(-1, new Intent());
                finish();
                return;
            default:
                return;
        }
    }
}
