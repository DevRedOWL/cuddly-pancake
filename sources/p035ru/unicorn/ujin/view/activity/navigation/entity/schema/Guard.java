package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4661xb73f6bca;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard */
public class Guard extends RealmObject implements C4661xb73f6bca {
    @SerializedName("access")
    private SchemaItem accessItem;
    @SerializedName("gates")
    private SchemaItem gatesItem;
    @SerializedName("guard")
    private SchemaItem guardItem;
    @SerializedName("pass")
    private SchemaItem passItem;
    @SerializedName("video")
    private SchemaItem videoItem;

    public SchemaItem realmGet$accessItem() {
        return this.accessItem;
    }

    public SchemaItem realmGet$gatesItem() {
        return this.gatesItem;
    }

    public SchemaItem realmGet$guardItem() {
        return this.guardItem;
    }

    public SchemaItem realmGet$passItem() {
        return this.passItem;
    }

    public SchemaItem realmGet$videoItem() {
        return this.videoItem;
    }

    public void realmSet$accessItem(SchemaItem schemaItem) {
        this.accessItem = schemaItem;
    }

    public void realmSet$gatesItem(SchemaItem schemaItem) {
        this.gatesItem = schemaItem;
    }

    public void realmSet$guardItem(SchemaItem schemaItem) {
        this.guardItem = schemaItem;
    }

    public void realmSet$passItem(SchemaItem schemaItem) {
        this.passItem = schemaItem;
    }

    public void realmSet$videoItem(SchemaItem schemaItem) {
        this.videoItem = schemaItem;
    }

    public Guard() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public SchemaItem getAccessItem() {
        return realmGet$accessItem();
    }

    public SchemaItem getVideoItem() {
        return realmGet$videoItem();
    }

    public void setVideoItem(SchemaItem schemaItem) {
        realmSet$videoItem(schemaItem);
    }

    public void setAccessItem(SchemaItem schemaItem) {
        realmSet$accessItem(schemaItem);
    }

    public SchemaItem getPassItem() {
        return realmGet$passItem();
    }

    public void setPassItem(SchemaItem schemaItem) {
        realmSet$passItem(schemaItem);
    }

    public SchemaItem getGatesItem() {
        return realmGet$gatesItem();
    }

    public void setGatesItem(SchemaItem schemaItem) {
        realmSet$gatesItem(schemaItem);
    }

    public SchemaItem getGuardItem() {
        return realmGet$guardItem();
    }

    public void setGuardItem(SchemaItem schemaItem) {
        realmSet$guardItem(schemaItem);
    }
}
