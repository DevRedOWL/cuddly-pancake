package p007at.nineyards.anyline.modules.debitcard;

import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.models.AnylineRawResult;

/* renamed from: at.nineyards.anyline.modules.debitcard.DebitCardResult */
public class DebitCardResult {

    /* renamed from: a */
    private String f618a;

    /* renamed from: b */
    private String f619b;

    /* renamed from: c */
    private String f620c;

    public DebitCardResult() {
    }

    DebitCardResult(AnylineRawResult anylineRawResult) {
        this.f618a = anylineRawResult.getResult("bc_name");
        this.f619b = anylineRawResult.getResult("bc_iban");
        this.f620c = anylineRawResult.getResult("bc_bic");
    }

    public String getCardHolderName() {
        return this.f618a;
    }

    public void setCardHolderName(String str) {
        this.f618a = str;
    }

    public String getIban() {
        return this.f619b;
    }

    public void setIban(String str) {
        this.f619b = str;
    }

    public String getBic() {
        return this.f620c;
    }

    public void setBic(String str) {
        this.f620c = str;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cardHolderName", getCardHolderName());
            jSONObject.put("iban", getIban());
            jSONObject.put("bic", getBic());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return this.f618a + ", " + this.f619b + ", " + this.f620c;
    }
}
