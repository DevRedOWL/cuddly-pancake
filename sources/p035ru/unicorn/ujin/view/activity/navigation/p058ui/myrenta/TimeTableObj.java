package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView;
import p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeTableObj */
public class TimeTableObj {
    @SerializedName("free_day")
    @Expose
    private boolean allDayIsFree;
    @SerializedName("date")
    public String date;
    @SerializedName("day_of_week")
    public String dayOfWeek;
    @SerializedName("timeslots")
    @Expose
    private List<TimeSlots> timeSlotsList;

    public boolean isAllDayIsFree() {
        return this.allDayIsFree;
    }

    public void setAllDayIsFree(boolean z) {
        this.allDayIsFree = z;
    }

    public List<VerticalSchedulerView.ISlots> getTimeSlotsList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.timeSlotsList.size(); i++) {
            arrayList.add(this.timeSlotsList.get(i));
        }
        return arrayList;
    }

    public List<VerticalSchedulerHumanView.IHumanSlots> getTimeSlotsHumanList() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.timeSlotsList.size(); i++) {
            arrayList.add(this.timeSlotsList.get(i));
        }
        return arrayList;
    }

    public void setTimeSlotsList(List<TimeSlots> list) {
        this.timeSlotsList = list;
    }
}
