package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/Appointments;", "", "appointments", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "(Ljava/util/List;)V", "getAppointments", "()Ljava/util/List;", "setAppointments", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.Appointments */
/* compiled from: Appointments.kt */
public final class Appointments {
    private List<? extends Appointment> appointments;

    public Appointments() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Appointments copy$default(Appointments appointments2, List<? extends Appointment> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = appointments2.appointments;
        }
        return appointments2.copy(list);
    }

    public final List<Appointment> component1() {
        return this.appointments;
    }

    public final Appointments copy(List<? extends Appointment> list) {
        return new Appointments(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Appointments) && Intrinsics.areEqual((Object) this.appointments, (Object) ((Appointments) obj).appointments);
        }
        return true;
    }

    public int hashCode() {
        List<? extends Appointment> list = this.appointments;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Appointments(appointments=" + this.appointments + ")";
    }

    public Appointments(List<? extends Appointment> list) {
        this.appointments = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Appointments(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<Appointment> getAppointments() {
        return this.appointments;
    }

    public final void setAppointments(List<? extends Appointment> list) {
        this.appointments = list;
    }
}
