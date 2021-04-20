package p035ru.unicorn.ujin.view.activity.tutorial.sapfir;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.afollestad.viewpagerdots.DotsIndicator;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.tutorial.BaseTutorialActivity;
import p035ru.unicorn.ujin.view.activity.tutorial.kortrosmsf.TutorialAdapter;

/* renamed from: ru.unicorn.ujin.view.activity.tutorial.sapfir.SapfirTutorialActivity */
public class SapfirTutorialActivity extends BaseTutorialActivity implements View.OnClickListener {
    Button btnStart;
    DotsIndicator indicator;
    ViewPager pager;
    PagerAdapter pagerAdapter;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_tutorial_sapfir);
        int intExtra = getIntent().getIntExtra(BaseTutorialActivity.ARG_ARRAY_ID, R.array.tutorial);
        this.pager = (ViewPager) findViewById(R.id.pager);
        this.indicator = (DotsIndicator) findViewById(R.id.circleIndicator);
        this.btnStart = (Button) findViewById(R.id.button_start);
        this.btnStart.setOnClickListener(this);
        this.pagerAdapter = new TutorialAdapter(getSupportFragmentManager(), intExtra, this);
        this.pager.setAdapter(this.pagerAdapter);
        this.indicator.attachViewPager(this.pager);
        findViewById(R.id.skipTutorial).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                SapfirTutorialActivity.this.lambda$onCreate$0$SapfirTutorialActivity(view);
            }
        });
        this.pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                int i2 = 0;
                SapfirTutorialActivity.this.btnStart.setVisibility(SapfirTutorialActivity.this.pagerAdapter.getCount() + -1 == i ? 0 : 4);
                if (SapfirTutorialActivity.this.pagerAdapter.getCount() - 1 == i) {
                    i2 = 4;
                }
                SapfirTutorialActivity.this.indicator.setVisibility(i2);
            }
        });
    }

    public /* synthetic */ void lambda$onCreate$0$SapfirTutorialActivity(View view) {
        this.pager.setCurrentItem(this.pagerAdapter.getCount() - 1);
    }

    public void onClick(View view) {
        setResult(-1);
        finish();
    }
}
