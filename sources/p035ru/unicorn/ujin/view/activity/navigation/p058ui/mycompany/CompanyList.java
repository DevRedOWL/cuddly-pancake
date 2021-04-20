package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyList */
public class CompanyList {
    @SerializedName("enterprises")
    private List<RentCompany> rentCompany;

    public List<RentCompany> getRentCompany() {
        return this.rentCompany;
    }

    public void setRentCompany(List<RentCompany> list) {
        this.rentCompany = list;
    }
}
