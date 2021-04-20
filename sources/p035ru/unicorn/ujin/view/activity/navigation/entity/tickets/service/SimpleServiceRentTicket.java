package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.service;

import android.os.Parcel;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.AbstractServiceTicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.service.SimpleServiceRentTicket */
public class SimpleServiceRentTicket extends AbstractServiceTicket implements AbstractServiceTicket.IHasRentID {

    /* renamed from: id */
    private int f6730id;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public String getTicketTextForTicket() {
        return getTicketText();
    }

    public int getRentId() {
        return this.f6730id;
    }

    public void setId(int i) {
        this.f6730id = i;
    }

    public String getName() {
        return (this.sectionTitle == null || this.sectionTitle.isEmpty()) ? "Сервисная заявка" : this.sectionTitle;
    }

    public boolean isCorrect() {
        return super.isCorrect() && getRentId() != 0;
    }
}
