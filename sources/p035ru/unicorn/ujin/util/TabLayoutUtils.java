package p035ru.unicorn.ujin.util;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

/* renamed from: ru.unicorn.ujin.util.TabLayoutUtils */
public class TabLayoutUtils {
    public static void enableTabs(TabLayout tabLayout, Boolean bool) {
        ViewGroup tabViewGroup = getTabViewGroup(tabLayout);
        if (tabViewGroup != null) {
            for (int i = 0; i < tabViewGroup.getChildCount(); i++) {
                View childAt = tabViewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.setEnabled(bool.booleanValue());
                }
            }
        }
    }

    public static View getTabView(TabLayout tabLayout, int i) {
        ViewGroup tabViewGroup = getTabViewGroup(tabLayout);
        if (tabViewGroup == null || tabViewGroup.getChildCount() <= i) {
            return null;
        }
        return tabViewGroup.getChildAt(i);
    }

    private static ViewGroup getTabViewGroup(TabLayout tabLayout) {
        View childAt;
        if (tabLayout == null || tabLayout.getChildCount() <= 0 || (childAt = tabLayout.getChildAt(0)) == null || !(childAt instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) childAt;
    }
}
