package p035ru.unicorn.ujin.view.activity.tutorial.kortrosmsf;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/* renamed from: ru.unicorn.ujin.view.activity.tutorial.kortrosmsf.TutorialAdapter */
public class TutorialAdapter extends FragmentPagerAdapter {
    private TypedArray typedArray;

    public TutorialAdapter(FragmentManager fragmentManager, int i, Context context) {
        super(fragmentManager);
        this.typedArray = context.getResources().obtainTypedArray(i);
    }

    public Fragment getItem(int i) {
        return TutorialFragment.newInstance(this.typedArray.getResourceId(i, 0));
    }

    public int getCount() {
        return this.typedArray.length();
    }
}
