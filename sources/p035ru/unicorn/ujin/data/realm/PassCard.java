package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.PassCard */
public class PassCard extends RealmObject implements ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface {
    @SerializedName("passes")
    private RealmList<CardData> cardDataList;

    public RealmList realmGet$cardDataList() {
        return this.cardDataList;
    }

    public void realmSet$cardDataList(RealmList realmList) {
        this.cardDataList = realmList;
    }

    public PassCard() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList<CardData> getCardDataList() {
        return realmGet$cardDataList();
    }

    public void setCardDataList(RealmList<CardData> realmList) {
        realmSet$cardDataList(realmList);
    }
}
