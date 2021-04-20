package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Price */
public class Price extends RealmObject implements ru_unicorn_ujin_data_realm_PriceRealmProxyInterface {
    @SerializedName("type_apartment")
    private Integer apartmentType;
    private String text;
    @SerializedName("count_text")
    private String textCount;
    private String title;

    public Integer realmGet$apartmentType() {
        return this.apartmentType;
    }

    public String realmGet$text() {
        return this.text;
    }

    public String realmGet$textCount() {
        return this.textCount;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$apartmentType(Integer num) {
        this.apartmentType = num;
    }

    public void realmSet$text(String str) {
        this.text = str;
    }

    public void realmSet$textCount(String str) {
        this.textCount = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public Price() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getTitle() {
        return (String) StringUtils.defaultIfEmpty(realmGet$title(), "");
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getCountText() {
        return (String) StringUtils.defaultIfEmpty(realmGet$textCount(), "");
    }

    public void setCountText(String str) {
        realmSet$textCount(str);
    }

    public void setText(String str) {
        realmSet$text(str);
    }

    public String getText() {
        return (String) StringUtils.defaultIfEmpty(realmGet$text(), "");
    }

    public void setTypeApartment(Integer num) {
        realmSet$apartmentType(num);
    }

    public Integer getTypeApartment() {
        return Integer.valueOf(realmGet$apartmentType() == null ? 0 : realmGet$apartmentType().intValue());
    }
}
