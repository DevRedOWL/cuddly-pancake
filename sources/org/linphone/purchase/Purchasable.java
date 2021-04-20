package org.linphone.purchase;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Purchasable {
    private String description;
    private long expire;

    /* renamed from: id */
    private String f6361id;
    private String price;
    private String purchasePayload;
    private String purchasePayloadSignature;
    private String title;
    private String userData;

    public Purchasable(String str) {
        this.f6361id = str;
    }

    public String getId() {
        return this.f6361id;
    }

    public String getTitle() {
        return this.title;
    }

    public Purchasable setTitle(String str) {
        this.title = str;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Purchasable setDescription(String str) {
        this.description = str;
        return this;
    }

    public String getPrice() {
        return this.price;
    }

    public Purchasable setPrice(String str) {
        this.price = str;
        return this;
    }

    public long getExpire() {
        return this.expire;
    }

    public String getExpireDate() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(new Date(this.expire));
    }

    public Purchasable setExpire(long j) {
        this.expire = j;
        return this;
    }

    public Purchasable setPayloadAndSignature(String str, String str2) {
        this.purchasePayload = str;
        this.purchasePayloadSignature = str2;
        return this;
    }

    public String getPayload() {
        return this.purchasePayload;
    }

    public String getPayloadSignature() {
        return this.purchasePayloadSignature;
    }

    public Purchasable setUserData(String str) {
        this.userData = str;
        return this;
    }

    public String getUserData() {
        return this.userData;
    }
}
