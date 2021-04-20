package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/OpenDatesIn;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "dayOfWeek", "", "getDayOfWeek", "()I", "setDayOfWeek", "(I)V", "dayOfWeekHuman", "getDayOfWeekHuman", "setDayOfWeekHuman", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.OpenDatesIn */
/* compiled from: ExecutorOpenDatesIn.kt */
public class OpenDatesIn implements Diffable<OpenDatesIn> {
    private String date = "";
    @SerializedName("day_of_week")
    private int dayOfWeek = 1;
    @SerializedName("day_of_week_human")
    private String dayOfWeekHuman = "";

    public final String getDate() {
        return this.date;
    }

    public final void setDate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.date = str;
    }

    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final void setDayOfWeek(int i) {
        this.dayOfWeek = i;
    }

    public final String getDayOfWeekHuman() {
        return this.dayOfWeekHuman;
    }

    public final void setDayOfWeekHuman(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dayOfWeekHuman = str;
    }

    public boolean areItemsTheSame(OpenDatesIn openDatesIn) {
        return Intrinsics.areEqual((Object) this.date, (Object) openDatesIn != null ? openDatesIn.date : null);
    }

    public boolean areContentsTheSame(OpenDatesIn openDatesIn) {
        return Intrinsics.areEqual((Object) this.dayOfWeekHuman, (Object) openDatesIn != null ? openDatesIn.dayOfWeekHuman : null);
    }
}
