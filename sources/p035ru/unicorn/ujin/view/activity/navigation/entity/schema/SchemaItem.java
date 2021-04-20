package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import p046io.realm.C4667x3f45b731;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem */
public class SchemaItem extends RealmObject implements C4667x3f45b731 {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("mode")
    @Expose
    private String mode;

    public String realmGet$message() {
        return this.message;
    }

    public String realmGet$mode() {
        return this.mode;
    }

    public void realmSet$message(String str) {
        this.message = str;
    }

    public void realmSet$mode(String str) {
        this.mode = str;
    }

    public SchemaItem() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String getMode() {
        return realmGet$mode();
    }

    public void setMode(String str) {
        realmSet$mode(str);
    }

    public String getMessage() {
        return realmGet$message();
    }

    public void setMessage(String str) {
        realmSet$message(str);
    }
}
