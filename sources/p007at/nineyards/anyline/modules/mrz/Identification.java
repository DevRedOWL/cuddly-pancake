package p007at.nineyards.anyline.modules.mrz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import p007at.nineyards.anyline.models.AnylineRawResult;

/* renamed from: at.nineyards.anyline.modules.mrz.Identification */
public class Identification {

    /* renamed from: a */
    private String f671a;

    /* renamed from: b */
    private String f672b;

    /* renamed from: c */
    private String f673c;

    /* renamed from: d */
    private String f674d;
    @Deprecated

    /* renamed from: e */
    private String f675e;

    /* renamed from: f */
    private String f676f;

    /* renamed from: g */
    private String f677g;

    /* renamed from: h */
    private String f678h;

    /* renamed from: i */
    private String f679i;

    /* renamed from: j */
    private String f680j;

    /* renamed from: k */
    private String f681k;

    /* renamed from: l */
    private String f682l;

    /* renamed from: m */
    private String f683m;

    /* renamed from: n */
    private String f684n;

    /* renamed from: o */
    private String f685o;

    /* renamed from: p */
    private String f686p;

    /* renamed from: q */
    private String f687q;

    /* renamed from: r */
    private boolean f688r;

    /* renamed from: s */
    private String f689s;

    public Identification() {
    }

    public Identification(AnylineRawResult anylineRawResult) {
        this.f671a = anylineRawResult.getResult("type");
        this.f673c = anylineRawResult.getResult("surname");
        this.f674d = anylineRawResult.getResult("given_names");
        this.f672b = anylineRawResult.getResult("nr");
        this.f681k = anylineRawResult.getResult("checkdigit_number");
        this.f675e = anylineRawResult.getResult("code");
        this.f677g = anylineRawResult.getResult("nationality_country_code");
        this.f676f = anylineRawResult.getResult("issuing_country_code");
        this.f678h = anylineRawResult.getResult("dob");
        this.f683m = anylineRawResult.getResult("checkdigit_dob");
        this.f679i = anylineRawResult.getResult("expiration_date");
        this.f682l = anylineRawResult.getResult("checkdigit_expiration");
        this.f680j = anylineRawResult.getResult("sex");
        this.f684n = anylineRawResult.getResult("checkdigit_final");
        this.f685o = anylineRawResult.getResult("personal_number");
        this.f686p = anylineRawResult.getResult("checkdigit_personal_number");
        this.f687q = anylineRawResult.getResult("personal_number2");
        this.f688r = "1".equals(anylineRawResult.getResult("all_check_digits_valid"));
        this.f689s = anylineRawResult.getResult("mrz_string");
    }

    /* renamed from: a */
    private static Date m302a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd");
        if (str != null) {
            try {
                Date parse = simpleDateFormat.parse(str);
                if (parse != null && str.equals(simpleDateFormat.format(parse))) {
                    return parse;
                }
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public String getDocumentNumber() {
        return this.f672b;
    }

    public void setDocumentNumber(String str) {
        this.f672b = str;
    }

    public String getSurNames() {
        return this.f673c;
    }

    public void setSurNames(String str) {
        this.f673c = str;
    }

    public String getGivenNames() {
        return this.f674d;
    }

    public void setGivenNames(String str) {
        this.f674d = str;
    }

    @Deprecated
    public String getCountryCode() {
        return this.f675e;
    }

    @Deprecated
    public void setCountryCode(String str) {
        this.f675e = str;
    }

    public String getIssuingCountryCode() {
        return this.f676f;
    }

    public void setIssuingCountryCode(String str) {
        this.f676f = str;
    }

    public String getNationalityCountryCode() {
        return this.f677g;
    }

    public void setNationalityCountryCode(String str) {
        this.f677g = str;
    }

    public String getDayOfBirth() {
        return this.f678h;
    }

    public void setDayOfBirth(String str) {
        this.f678h = str;
    }

    public Date getDayOfBirthObject() {
        return m302a(this.f678h);
    }

    public String getExpirationDate() {
        return this.f679i;
    }

    public void setExpirationDate(String str) {
        this.f679i = str;
    }

    public Date getExpirationDateObject() {
        return m302a(this.f679i);
    }

    public String getDocumentType() {
        return this.f671a;
    }

    public void setDocumentType(String str) {
        this.f671a = str;
    }

    public String getSex() {
        return this.f680j;
    }

    public void setSex(String str) {
        this.f680j = str;
    }

    public String getCheckDigitNumber() {
        return this.f681k;
    }

    public void setCheckDigitNumber(String str) {
        this.f681k = str;
    }

    public String getCheckDigitExpirationDate() {
        return this.f682l;
    }

    public void setCheckDigitExpirationDate(String str) {
        this.f682l = str;
    }

    public String getCheckDigitDayOfBirth() {
        return this.f683m;
    }

    public void setCheckDigitDayOfBirth(String str) {
        this.f683m = str;
    }

    public String getCheckDigitFinal() {
        return this.f684n;
    }

    public void setCheckDigitFinal(String str) {
        this.f684n = str;
    }

    public String getPersonalNumber() {
        return this.f685o;
    }

    public void setPersonalNumber(String str) {
        this.f685o = str;
    }

    public String getCheckDigitPersonalNumber() {
        return this.f686p;
    }

    public void setCheckDigitPersonalNumber(String str) {
        this.f686p = str;
    }

    public String getPersonalNumber2() {
        return this.f687q;
    }

    public void setPersonalNumber2(String str) {
        this.f687q = str;
    }

    public boolean areAllCheckDigitsValid() {
        return this.f688r;
    }

    public void setAllCheckDigitsValid(boolean z) {
        this.f688r = z;
    }

    public String getMrzString() {
        return this.f689s;
    }

    public void setMrzString(String str) {
        this.f689s = str;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("documentType", getDocumentType());
            jSONObject.put("documentNumber", getDocumentNumber());
            jSONObject.put("surNames", getSurNames());
            jSONObject.put("givenNames", getGivenNames());
            jSONObject.put("countryCode", getCountryCode());
            jSONObject.put("issuingCountryCode", getIssuingCountryCode());
            jSONObject.put("nationalityCountryCode", getNationalityCountryCode());
            jSONObject.put("dayOfBirth", getDayOfBirth());
            jSONObject.put("expirationDate", getExpirationDate());
            jSONObject.put("sex", getSex());
            jSONObject.put("personalNumber", getPersonalNumber());
            jSONObject.put("personalNumber2", getPersonalNumber2());
            jSONObject.put("checkDigitNumber", getCheckDigitNumber());
            jSONObject.put("checkDigitPersonalNumber", getCheckDigitPersonalNumber());
            jSONObject.put("checkDigitDayOfBirth", getCheckDigitDayOfBirth());
            jSONObject.put("checkDigitExpirationDate", getCheckDigitExpirationDate());
            jSONObject.put("checkDigitFinal", getCheckDigitFinal());
            jSONObject.put("allCheckDigitsValid", areAllCheckDigitsValid());
            jSONObject.put("dayOfBirthObject", getDayOfBirthObject());
            jSONObject.put("expirationDateObject", getExpirationDateObject());
            jSONObject.put("mrzString", getMrzString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return this.f671a + ", " + this.f672b + " #" + this.f681k + ", " + this.f673c + ", " + this.f674d + ", " + this.f675e + ", " + this.f676f + ", " + this.f677g + ", " + this.f678h + " #" + this.f683m + ", " + this.f679i + " #" + this.f682l + "  ##" + this.f684n;
    }
}
