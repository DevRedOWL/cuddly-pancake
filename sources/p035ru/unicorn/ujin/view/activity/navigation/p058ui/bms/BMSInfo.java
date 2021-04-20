package p035ru.unicorn.ujin.view.activity.navigation.p058ui.bms;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4681xaf5175d3;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.bms.BMSInfo */
public class BMSInfo extends RealmObject implements C4681xaf5175d3 {
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("title")
    @PrimaryKey
    @Expose
    private String title;

    public String realmGet$text() {
        return this.text;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$text(String str) {
        this.text = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public BMSInfo() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getTitle() {
        return realmGet$title();
    }

    public void setTitle(String str) {
        realmSet$title(str);
    }

    public String getText() {
        return realmGet$text();
    }

    public void setText(String str) {
        realmSet$text(str);
    }
}
