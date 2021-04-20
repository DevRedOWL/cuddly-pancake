package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p035ru.unicorn.ujin.view.customViews.VerticalSchedulerHumanView;
import p035ru.unicorn.ujin.view.customViews.VerticalSchedulerView;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.TimeSlots */
public class TimeSlots implements VerticalSchedulerView.ISlots, VerticalSchedulerHumanView.IHumanSlots {
    @SerializedName("finish_date")
    @Expose
    private long finishDate;
    @SerializedName("human_finish_date")
    public String humanFinishDate;
    @SerializedName("human_start_date")
    public String humanStartDate;
    @SerializedName("is_busy")
    @Expose
    private boolean isBusy;
    @SerializedName("start_date")
    @Expose
    private long startDate;
    @SerializedName("human")
    TimeSlotHuman timeSlotHuman;

    public boolean isBusy() {
        return this.isBusy;
    }

    public void setBusy(boolean z) {
        this.isBusy = z;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }

    public long getFinishDate() {
        return this.finishDate;
    }

    public void setFinishDate(long j) {
        this.finishDate = j;
    }

    public boolean isSlotBusy() {
        return !isBusy();
    }

    public TimeSlotHuman slotStartHuman() {
        return this.timeSlotHuman;
    }

    public TimeSlotHuman slotFinishHuman() {
        return this.timeSlotHuman;
    }

    public long slotStart() {
        return this.startDate;
    }

    public long slotFinish() {
        return this.finishDate;
    }
}
