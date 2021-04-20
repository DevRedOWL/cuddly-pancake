package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk;

import com.google.android.material.tabs.TabLayout;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TabLayoutSimple */
public class TabLayoutSimple implements TabLayout.OnTabSelectedListener {
    final TabSelectorSimple tabSelectorSimple;

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.TabLayoutSimple$TabSelectorSimple */
    public interface TabSelectorSimple {
        void onTabSelect(TabLayout.Tab tab);
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabUnselected(TabLayout.Tab tab) {
    }

    public TabLayoutSimple(TabSelectorSimple tabSelectorSimple2) {
        this.tabSelectorSimple = tabSelectorSimple2;
    }

    public void onTabSelected(TabLayout.Tab tab) {
        this.tabSelectorSimple.onTabSelect(tab);
    }
}
