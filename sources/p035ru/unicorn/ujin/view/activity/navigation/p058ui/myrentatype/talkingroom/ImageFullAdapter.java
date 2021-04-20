package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ImageFullAdapter */
public class ImageFullAdapter extends FragmentStatePagerAdapter {
    private List<String> images;

    public ImageFullAdapter(FragmentManager fragmentManager, List<String> list) {
        super(fragmentManager);
        this.images = list;
    }

    public Fragment getItem(int i) {
        return ImageFragment.newInstance(this.images.get(i));
    }

    public int getCount() {
        return this.images.size();
    }
}
