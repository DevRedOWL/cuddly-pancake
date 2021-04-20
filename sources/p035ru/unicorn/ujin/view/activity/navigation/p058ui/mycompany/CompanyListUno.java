package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import com.google.gson.annotations.SerializedName;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyListUno */
public class CompanyListUno {
    @SerializedName("enterprise")
    private RentCompany rentCompany;

    public RentCompany getRentCompany() {
        return this.rentCompany;
    }

    public void setRentCompany(RentCompany rentCompany2) {
        this.rentCompany = rentCompany2;
    }
}
