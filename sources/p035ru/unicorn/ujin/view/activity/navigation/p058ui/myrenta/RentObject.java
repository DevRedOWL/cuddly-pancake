package p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentObject */
public class RentObject {
    @SerializedName("id")
    @Expose
    private int propertyId;
    @SerializedName("type")
    @Expose
    private String type;

    public RentObject(String str, int i) {
        this.type = str;
        this.propertyId = i;
    }

    public RentObject(String str) {
        this.type = str;
    }

    public static RentObjectBody create2(String[] strArr, String str) {
        ArrayList arrayList = new ArrayList();
        for (String rentObject : strArr) {
            arrayList.add(new RentObject(rentObject));
        }
        if (str == null || str.isEmpty()) {
            return new RentObjectBody(arrayList);
        }
        return new RentObjectBody(arrayList, str);
    }

    public int getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(int i) {
        this.propertyId = i;
    }

    public static JSONObject toJson(String str, int i) {
        RentObject rentObject;
        if (str.equals("property_service")) {
            rentObject = new RentObject(str);
        } else {
            rentObject = new RentObject("property_type", 2);
        }
        return toJson(rentObject);
    }

    public static JSONObject toJson(RentObject rentObject) {
        try {
            return new JSONObject(new Gson().toJson((Object) rentObject));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.myrenta.RentObject$RentObjectBody */
    public static class RentObjectBody {
        @SerializedName("rent")
        RentInfoObject rentInfo;
        @SerializedName("objects")
        List<RentObject> rentObject;
        @SerializedName("object")
        RentObject rentObjects;
        @SerializedName("section_id")
        String sectionId;
        @SerializedName("text")
        String text;
        @SerializedName("title")
        String title;
        @SerializedName("without_resident_available")
        int withoutResidentAvailable;

        public RentInfoObject getRentInfo() {
            return this.rentInfo;
        }

        public void setRentInfo(RentInfoObject rentInfoObject) {
            this.rentInfo = rentInfoObject;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String getText() {
            return this.text;
        }

        public void setText(String str) {
            this.text = str;
        }

        public List<RentObject> getRentObject() {
            return this.rentObject;
        }

        public void setRentObject(List<RentObject> list) {
            this.rentObject = list;
        }

        public String getSectionId() {
            return this.sectionId;
        }

        public int getWithoutResidentAvailable() {
            return this.withoutResidentAvailable;
        }

        public void setSectionId(String str) {
            this.sectionId = str;
        }

        public RentObjectBody(String str, String str2, List<RentObject> list, RentInfoObject rentInfoObject) {
            this.title = str;
            this.text = str2;
            this.rentObject = list;
            this.rentInfo = rentInfoObject;
        }

        public RentObjectBody(String str, String str2, RentObject rentObject2, RentInfoObject rentInfoObject) {
            this.title = str;
            this.text = str2;
            this.rentObjects = rentObject2;
            this.rentInfo = rentInfoObject;
        }

        public RentObjectBody(List<RentObject> list) {
            this.rentObject = list;
            this.withoutResidentAvailable = 1;
        }

        public RentObjectBody(List<RentObject> list, String str) {
            this.rentObject = list;
            this.sectionId = str;
        }
    }
}
