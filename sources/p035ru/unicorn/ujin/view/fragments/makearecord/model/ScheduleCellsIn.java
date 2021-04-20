package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0000H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "()V", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "isOpen", "", "()Z", "setOpen", "(Z)V", "timeEnd", "", "getTimeEnd", "()Ljava/lang/String;", "setTimeEnd", "(Ljava/lang/String;)V", "timeStart", "getTimeStart", "setTimeStart", "title", "getTitle", "setTitle", "areContentsTheSame", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleCellsIn */
/* compiled from: ScheduleListIn.kt */
public class ScheduleCellsIn implements Diffable<ScheduleCellsIn> {
    private int duration;
    @SerializedName("is_open")
    private boolean isOpen;
    @SerializedName("time_end")
    private String timeEnd = "";
    @SerializedName("time_start")
    private String timeStart = "";
    private String title = "";

    public final String getTimeStart() {
        return this.timeStart;
    }

    public final void setTimeStart(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeStart = str;
    }

    public final String getTimeEnd() {
        return this.timeEnd;
    }

    public final void setTimeEnd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeEnd = str;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public final void setOpen(boolean z) {
        this.isOpen = z;
    }

    public boolean areItemsTheSame(ScheduleCellsIn scheduleCellsIn) {
        return this.timeStart.equals(scheduleCellsIn != null ? scheduleCellsIn.timeStart : null);
    }

    public boolean areContentsTheSame(ScheduleCellsIn scheduleCellsIn) {
        return this.timeStart.equals(scheduleCellsIn != null ? scheduleCellsIn.timeStart : null);
    }
}
