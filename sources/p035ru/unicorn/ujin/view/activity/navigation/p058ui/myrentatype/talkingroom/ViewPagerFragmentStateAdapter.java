package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.Calendar;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.ViewPagerFragmentStateAdapter */
public class ViewPagerFragmentStateAdapter extends FragmentStateAdapter {
    private AbstractRentTicket abstractRentTicket;

    /* renamed from: c */
    private Calendar f6834c = Calendar.getInstance();
    private int currentPosition = 0;

    public int getItemCount() {
        return 365;
    }

    public ViewPagerFragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.f6834c.setTimeInMillis(System.currentTimeMillis());
        if (this.f6834c.get(11) > 20) {
            this.f6834c.add(6, 1);
            this.f6834c.set(10, 1);
        }
    }

    public Fragment createFragment(int i) {
        int i2 = i - this.currentPosition;
        this.currentPosition = i;
        this.f6834c.add(6, i2);
        return TalkingRoomSchedulerFragment.start(this.abstractRentTicket, DateUtils.formatDateYYYYMMDD(this.f6834c.getTime()));
    }

    public void setAbstractRentTicket(AbstractRentTicket abstractRentTicket2) {
        this.abstractRentTicket = abstractRentTicket2;
    }
}
