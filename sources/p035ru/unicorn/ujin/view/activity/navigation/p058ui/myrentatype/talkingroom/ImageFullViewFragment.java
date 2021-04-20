package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.List;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ImageFullViewFragment */
public class ImageFullViewFragment extends BaseFragment {
    private static final String ARG_IMAGE_COUNT = "arg_image_count";
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    private MyRentaViewModel rentaViewModel;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_pager;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    private ImageFullViewFragment() {
    }

    public static ImageFullViewFragment start(int i) {
        ImageFullViewFragment imageFullViewFragment = new ImageFullViewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_IMAGE_COUNT, i);
        imageFullViewFragment.setArguments(bundle);
        return imageFullViewFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        View inflate = layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.f6913pb = (ProgressBar) inflate.findViewById(R.id.pb);
        this.pager = (ViewPager) inflate.findViewById(R.id.pager);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.rentaViewModel.getImagesMutableLiveData().observe(this, new Observer() {
            public final void onChanged(Object obj) {
                ImageFullViewFragment.this.initAdapter((List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void initAdapter(final List<String> list) {
        this.pagerAdapter = new ImageFullAdapter(getActivity().getSupportFragmentManager(), list);
        this.pager.setAdapter(this.pagerAdapter);
        this.pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                BaseActivity access$000 = ImageFullViewFragment.this.getBaseActivity();
                access$000.setTextTitle((i + 1) + " из " + list.size());
            }
        });
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        int i = getArguments().getInt(ARG_IMAGE_COUNT);
        BaseActivity baseActivity = getBaseActivity();
        baseActivity.setTextTitle("1 из " + i);
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
    }
}
