package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleItemIn;", "", "()V", "cellDuration", "", "getCellDuration", "()I", "setCellDuration", "(I)V", "cells", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/ScheduleCellsIn;", "getCells", "()Ljava/util/List;", "setCells", "(Ljava/util/List;)V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "dayOfWeek", "getDayOfWeek", "setDayOfWeek", "description", "getDescription", "setDescription", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.ScheduleItemIn */
/* compiled from: ScheduleListIn.kt */
public class ScheduleItemIn {
    @SerializedName("cell_duration")
    private int cellDuration;
    private List<? extends ScheduleCellsIn> cells = CollectionsKt.emptyList();
    private String date = "0";
    @SerializedName("day_of_week")
    private int dayOfWeek;
    private String description;

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

    public final int getCellDuration() {
        return this.cellDuration;
    }

    public final void setCellDuration(int i) {
        this.cellDuration = i;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final List<ScheduleCellsIn> getCells() {
        return this.cells;
    }

    public final void setCells(List<? extends ScheduleCellsIn> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cells = list;
    }
}
