package com.yandex.metrica;

import com.yandex.metrica.impl.p039ob.C4284yf;
import com.yandex.metrica.impl.p039ob.C4285yg;
import com.yandex.metrica.impl.p039ob.C4289yk;
import java.util.Currency;

public class Revenue {
    public final Currency currency;
    public final String payload;
    @Deprecated
    public final Double price;
    public final Long priceMicros;
    public final String productID;
    public final Integer quantity;
    public final Receipt receipt;

    private Revenue(Builder builder) {
        this.price = builder.f2389a;
        this.priceMicros = builder.f2390b;
        this.currency = builder.f2391c;
        this.quantity = builder.f2392d;
        this.productID = builder.f2393e;
        this.payload = builder.f2394f;
        this.receipt = builder.f2395g;
    }

    @Deprecated
    public static Builder newBuilder(double d, Currency currency2) {
        return new Builder(d, currency2);
    }

    public static Builder newBuilderWithMicros(long j, Currency currency2) {
        return new Builder(j, currency2);
    }

    public static class Builder {

        /* renamed from: h */
        private static final C4289yk<Currency> f2388h = new C4285yg(new C4284yf("revenue currency"));

        /* renamed from: a */
        Double f2389a;

        /* renamed from: b */
        Long f2390b;

        /* renamed from: c */
        Currency f2391c;

        /* renamed from: d */
        Integer f2392d;

        /* renamed from: e */
        String f2393e;

        /* renamed from: f */
        String f2394f;

        /* renamed from: g */
        Receipt f2395g;

        Builder(double d, Currency currency) {
            f2388h.mo40671a(currency);
            this.f2389a = Double.valueOf(d);
            this.f2391c = currency;
        }

        Builder(long j, Currency currency) {
            f2388h.mo40671a(currency);
            this.f2390b = Long.valueOf(j);
            this.f2391c = currency;
        }

        public Builder withQuantity(Integer num) {
            this.f2392d = num;
            return this;
        }

        public Builder withProductID(String str) {
            this.f2393e = str;
            return this;
        }

        public Builder withPayload(String str) {
            this.f2394f = str;
            return this;
        }

        public Builder withReceipt(Receipt receipt) {
            this.f2395g = receipt;
            return this;
        }

        public Revenue build() {
            return new Revenue(this);
        }
    }

    public static class Receipt {
        public final String data;
        public final String signature;

        private Receipt(Builder builder) {
            this.data = builder.f2396a;
            this.signature = builder.f2397b;
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public static class Builder {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public String f2396a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f2397b;

            Builder() {
            }

            public Builder withData(String str) {
                this.f2396a = str;
                return this;
            }

            public Builder withSignature(String str) {
                this.f2397b = str;
                return this;
            }

            public Receipt build() {
                return new Receipt(this);
            }
        }
    }
}
