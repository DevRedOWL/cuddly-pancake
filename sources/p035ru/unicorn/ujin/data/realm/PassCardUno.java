package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxyInterface;

/* renamed from: ru.unicorn.ujin.data.realm.PassCardUno */
public class PassCardUno extends RealmObject implements ru_unicorn_ujin_data_realm_PassCardUnoRealmProxyInterface {
    @SerializedName("pass")
    private CardData cardData;

    public CardData realmGet$cardData() {
        return this.cardData;
    }

    public void realmSet$cardData(CardData cardData2) {
        this.cardData = cardData2;
    }

    public PassCardUno() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public CardData getCardData() {
        return realmGet$cardData();
    }

    public void setCardData(CardData cardData2) {
        realmSet$cardData(cardData2);
    }
}
