package p035ru.unicorn.ujin.view.activity.navigation.entity.schema;

import com.google.gson.annotations.SerializedName;
import p046io.realm.C4673x815c9a7;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.entity.schema.Services */
public class Services extends RealmObject implements C4673x815c9a7 {
    @SerializedName("bills")
    private SchemaItem billsItem;
    @SerializedName("bms_info")
    private SchemaItem bmsInfoItem;
    @SerializedName("bms_ticket")
    private SchemaItem bmsTicketItem;
    @SerializedName("counters")
    private SchemaItem countersItem;

    public SchemaItem realmGet$billsItem() {
        return this.billsItem;
    }

    public SchemaItem realmGet$bmsInfoItem() {
        return this.bmsInfoItem;
    }

    public SchemaItem realmGet$bmsTicketItem() {
        return this.bmsTicketItem;
    }

    public SchemaItem realmGet$countersItem() {
        return this.countersItem;
    }

    public void realmSet$billsItem(SchemaItem schemaItem) {
        this.billsItem = schemaItem;
    }

    public void realmSet$bmsInfoItem(SchemaItem schemaItem) {
        this.bmsInfoItem = schemaItem;
    }

    public void realmSet$bmsTicketItem(SchemaItem schemaItem) {
        this.bmsTicketItem = schemaItem;
    }

    public void realmSet$countersItem(SchemaItem schemaItem) {
        this.countersItem = schemaItem;
    }

    public Services() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public SchemaItem getCountersItem() {
        return realmGet$countersItem();
    }

    public void setCountersItem(SchemaItem schemaItem) {
        realmSet$countersItem(schemaItem);
    }

    public SchemaItem getBillsItem() {
        return realmGet$billsItem();
    }

    public void setBillsItem(SchemaItem schemaItem) {
        realmSet$billsItem(schemaItem);
    }

    public SchemaItem getBmsInfoItem() {
        return realmGet$bmsInfoItem();
    }

    public void setBmsInfoItem(SchemaItem schemaItem) {
        realmSet$bmsInfoItem(schemaItem);
    }

    public SchemaItem getBmsTicketItem() {
        return realmGet$bmsTicketItem();
    }

    public void setBmsTicketItem(SchemaItem schemaItem) {
        realmSet$bmsTicketItem(schemaItem);
    }
}
