package p035ru.unicorn.ujin.view.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import p035ru.unicorn.ujin.market.MarketFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.MainSmartFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.navigation.SmartNavFragment;
import p035ru.unicorn.ujin.view.fragments.chats.ChatListFragment;

/* renamed from: ru.unicorn.ujin.view.adapters.NavigationViewPagerAdapter */
public class NavigationViewPagerAdapter extends FragmentPagerAdapter {
    private int count;

    public NavigationViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public Fragment getItem(int i) {
        if (i == 0) {
            return MainSmartFragment.start();
        }
        if (i == 1) {
            return SmartNavFragment.start(2);
        }
        if (i == 2) {
            return SmartNavFragment.start(3);
        }
        if (i == 3) {
            return new MarketFragment();
        }
        if (i != 4) {
            return new Fragment();
        }
        return new ChatListFragment();
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }
}
