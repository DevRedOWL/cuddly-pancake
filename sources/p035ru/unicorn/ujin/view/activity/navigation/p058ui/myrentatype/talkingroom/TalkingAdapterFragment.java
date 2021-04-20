package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager2.widget.ViewPager2;
import javax.annotation.Nullable;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.MyRentaViewModel;
import p035ru.unicorn.ujin.view.fragments.BaseFragment;
import p035ru.unicorn.ujin.view.toolbar.ToolbarButtons;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.TalkingAdapterFragment */
public class TalkingAdapterFragment extends BaseFragment {
    private int propId;
    /* access modifiers changed from: private */
    public MyRentaViewModel rentaViewModel;
    private ViewPager2 viewPager2;

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.fragment_prfile_renta_talking_sheduler_adapter;
    }

    /* access modifiers changed from: protected */
    public String metricsScreenName() {
        return null;
    }

    public static TalkingAdapterFragment start(AbstractRentTicket abstractRentTicket) {
        TalkingAdapterFragment talkingAdapterFragment = new TalkingAdapterFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("rent", abstractRentTicket);
        talkingAdapterFragment.setArguments(bundle);
        return talkingAdapterFragment;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        setHasOptionsMenu(true);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(getLayoutRes(), viewGroup, false);
        this.viewPager2 = (ViewPager2) viewGroup2.findViewById(R.id.view_pager);
        ViewPagerFragmentStateAdapter viewPagerFragmentStateAdapter = new ViewPagerFragmentStateAdapter(getChildFragmentManager(), getLifecycle());
        viewPagerFragmentStateAdapter.setAbstractRentTicket((AbstractRentTicket) getArguments().getParcelable("rent"));
        this.viewPager2.setAdapter(viewPagerFragmentStateAdapter);
        this.viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                TalkingAdapterFragment.this.rentaViewModel.onDateChange(TalkingAdapterFragment.this.getRent().getRentId(), i);
            }

            public void onPageScrolled(int i, float f, int i2) {
                super.onPageScrolled(i, f, i2);
            }
        });
        return viewGroup2;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        this.rentaViewModel = (MyRentaViewModel) ViewModelProviders.m11of((Fragment) this, (ViewModelProvider.Factory) ViewmodelFactorys.getInstance()).get(MyRentaViewModel.class);
        this.rentaViewModel.getCurrentDay().observe(getViewLifecycleOwner(), new Observer() {
            public final void onChanged(Object obj) {
                TalkingAdapterFragment.this.changePosition((Integer) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void changePosition(Integer num) {
        this.viewPager2.setCurrentItem(Math.abs(num.intValue()));
    }

    /* access modifiers changed from: protected */
    public void showToolbar() {
        getBaseActivity().setToolbarLeft(ToolbarButtons.BACK);
        getBaseActivity().setTextTitle(getRent().getLocalTicketTypeName());
    }

    public AbstractRentTicketWithId getRent() {
        return (AbstractRentTicketWithId) getArguments().getParcelable("rent");
    }
}
