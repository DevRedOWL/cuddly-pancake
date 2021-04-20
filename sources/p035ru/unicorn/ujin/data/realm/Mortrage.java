package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.StringUtils;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.Mortrage */
public class Mortrage extends RealmObject implements ru_unicorn_ujin_data_realm_MortrageRealmProxyInterface {
    @SerializedName("img_logo")
    private byte[] imgLogoBytes;
    private String logo;
    private RealmList<String> text;
    private String title;

    public byte[] realmGet$imgLogoBytes() {
        return this.imgLogoBytes;
    }

    public String realmGet$logo() {
        return this.logo;
    }

    public RealmList realmGet$text() {
        return this.text;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$imgLogoBytes(byte[] bArr) {
        this.imgLogoBytes = bArr;
    }

    public void realmSet$logo(String str) {
        this.logo = str;
    }

    public void realmSet$text(RealmList realmList) {
        this.text = realmList;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public Mortrage() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$text(new RealmList());
    }

    public String getTitle() {
        return (String) StringUtils.defaultIfEmpty(realmGet$title(), "");
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getLogo() {
        return (String) StringUtils.defaultIfEmpty(realmGet$logo(), "");
    }

    public void setLogo(String str) {
        realmSet$logo(str);
    }

    public byte[] getImgLogoBytes() {
        return realmGet$imgLogoBytes() == null ? new byte[0] : realmGet$imgLogoBytes();
    }

    public void setImgLogoBytes(byte[] bArr) {
        realmSet$imgLogoBytes(bArr);
    }

    public void setText(RealmList<String> realmList) {
        realmSet$text(realmList);
    }

    public RealmList<String> getText() {
        return realmGet$text() == null ? new RealmList<>() : realmGet$text();
    }
}
