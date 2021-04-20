package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.List;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.util.DateUtils;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.SingleSection;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentInfoSection */
public class RentInfoSection extends SingleSection<Rent, ViewHolder> {
    public int getLayoutId() {
        return R.layout.item_rent_info_section;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, Rent rent, List<Object> list) {
        viewHolder.subtitle.setText(getDate(rent, viewHolder));
    }

    private String getDate(Rent rent, ViewHolder viewHolder) {
        if (!(rent.getTalkingInfo() == null || rent.getTalkingInfo().getStateRenta() == null || rent.getTalkingInfo().getStateRenta().getName() == null)) {
            String name = rent.getTalkingInfo().getStateRenta().getName();
            Calendar parseDate = DateUtils.parseDate(rent.realmGet$startDateHuman(), "yyyy-MM-dd HH:mm:ss");
            Calendar parseDate2 = DateUtils.parseDate(rent.realmGet$finishDateHuman(), "yyyy-MM-dd HH:mm:ss");
            if (!(parseDate == null || parseDate2 == null)) {
                if (name.equals("meeting_room") || name.equals("event_area")) {
                    return DateUtils.formatDateFromCalendar(parseDate) + " " + DateUtils.formatTimeFromCalendar(parseDate) + " - " + DateUtils.formatTimeFromCalendar(parseDate2);
                } else if (DateUtils.formatDateFromCalendar(parseDate).equals(DateUtils.formatDateFromCalendar(parseDate2))) {
                    return DateUtils.formatDateFromCalendar(parseDate);
                } else {
                    return DateUtils.formatDateFromCalendar(parseDate) + " - " + DateUtils.formatDateFromCalendar(parseDate2);
                }
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        return new ViewHolder(view);
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrentatype.talkingroom.RentInfoSection$ViewHolder */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView subtitle;

        public ViewHolder(View view) {
            super(view);
            this.subtitle = (TextView) view.findViewById(R.id.subtitle);
        }
    }
}
