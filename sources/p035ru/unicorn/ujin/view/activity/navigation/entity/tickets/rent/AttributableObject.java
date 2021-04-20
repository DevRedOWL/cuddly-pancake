package p035ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.tickets.rent.AttributableObject */
public class AttributableObject {
    private String key;
    private boolean required;
    private String title;
    private String type;
    private String units;

    public AttributableObject(String str, String str2, String str3, String str4, boolean z) {
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.units = str4;
        this.required = z;
    }

    public AttributableObject(String str, String str2, String str3, String str4) {
        this.key = str;
        this.type = str2;
        this.title = str3;
        this.units = str4;
        this.required = false;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getUnits() {
        return this.units;
    }

    public void setUnits(String str) {
        this.units = str;
    }

    public boolean isRequired() {
        return this.required;
    }

    public void setRequired(boolean z) {
        this.required = z;
    }
}
