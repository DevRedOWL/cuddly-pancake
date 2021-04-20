package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent;

import android.os.Parcelable;
import java.util.List;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.base.ITicket;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AbstractRentTicketWithId */
public abstract class AbstractRentTicketWithId extends AbstractRentTicket implements ITicket, Parcelable {
    private List<SomeString> imageUrls;
    private int rentId;
    private String rentTitle;
    protected String sectionId;
    protected String sectionTitle;

    public int getRentId() {
        return this.rentId;
    }

    public String getName() {
        return getRentTitle();
    }

    public void setRentId(int i) {
        this.rentId = i;
    }

    public String getRentTitle() {
        return this.rentTitle;
    }

    public void setRentTitle(String str) {
        this.rentTitle = str;
    }

    public List<SomeString> getImageUrls() {
        return this.imageUrls;
    }

    public void setImageUrls(List<SomeString> list) {
        this.imageUrls = list;
    }

    public String getSectionId() {
        return this.sectionId;
    }

    public void saveSectionId(String str) {
        this.sectionId = str;
    }

    public String getSectionTitle() {
        return this.sectionTitle;
    }

    public void saveSectionTitle(String str) {
        this.sectionTitle = str;
    }
}
