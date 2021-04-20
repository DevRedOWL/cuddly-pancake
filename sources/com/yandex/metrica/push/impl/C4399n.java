package com.yandex.metrica.push.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.push.impl.n */
public class C4399n implements Parcelable {
    public static final Parcelable.Creator<C4399n> CREATOR = new Parcelable.Creator<C4399n>() {
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C4399n[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C4399n(parcel);
        }
    };

    /* renamed from: a */
    public final String f5556a;

    /* renamed from: b */
    public final String f5557b;

    /* renamed from: c */
    public final String f5558c;

    /* renamed from: d */
    public final C4411u f5559d;

    /* renamed from: e */
    public final String f5560e;

    /* renamed from: f */
    public final String f5561f;

    /* renamed from: g */
    public final int f5562g;

    /* renamed from: h */
    public final boolean f5563h;

    /* renamed from: i */
    public final boolean f5564i;

    /* renamed from: j */
    public final Bundle f5565j;

    /* renamed from: k */
    public final boolean f5566k;

    /* renamed from: l */
    public final boolean f5567l;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ C4399n(C4401a aVar, byte b) {
        this(aVar);
    }

    private C4399n(C4401a aVar) {
        this.f5556a = aVar.f5568a;
        this.f5557b = aVar.f5569b;
        this.f5558c = aVar.f5570c;
        this.f5559d = aVar.f5571d;
        this.f5560e = aVar.f5572e;
        this.f5561f = aVar.f5573f;
        this.f5562g = aVar.f5574g;
        this.f5563h = aVar.f5575h;
        this.f5564i = aVar.f5576i;
        this.f5565j = aVar.f5577j;
        this.f5566k = aVar.f5578k;
        this.f5567l = aVar.f5579l;
    }

    /* renamed from: a */
    public static C4401a m6586a() {
        return new C4401a();
    }

    /* renamed from: com.yandex.metrica.push.impl.n$a */
    public static class C4401a {

        /* renamed from: a */
        String f5568a;

        /* renamed from: b */
        String f5569b;

        /* renamed from: c */
        String f5570c;

        /* renamed from: d */
        C4411u f5571d;

        /* renamed from: e */
        String f5572e;

        /* renamed from: f */
        String f5573f;

        /* renamed from: g */
        int f5574g = 0;

        /* renamed from: h */
        boolean f5575h = false;

        /* renamed from: i */
        boolean f5576i = false;

        /* renamed from: j */
        Bundle f5577j;

        /* renamed from: k */
        boolean f5578k;

        /* renamed from: l */
        boolean f5579l = false;

        C4401a() {
        }

        /* renamed from: a */
        public C4401a mo42110a(String str) {
            this.f5568a = str;
            return this;
        }

        /* renamed from: b */
        public C4401a mo42113b(String str) {
            this.f5569b = str;
            return this;
        }

        /* renamed from: c */
        public C4401a mo42115c(String str) {
            this.f5570c = str;
            return this;
        }

        /* renamed from: a */
        public C4401a mo42109a(C4411u uVar) {
            this.f5571d = uVar;
            return this;
        }

        /* renamed from: d */
        public C4401a mo42117d(String str) {
            this.f5572e = str;
            return this;
        }

        /* renamed from: e */
        public C4401a mo42119e(String str) {
            this.f5573f = str;
            return this;
        }

        /* renamed from: a */
        public C4401a mo42107a(int i) {
            this.f5574g = i;
            return this;
        }

        /* renamed from: a */
        public C4401a mo42111a(boolean z) {
            this.f5575h = z;
            return this;
        }

        /* renamed from: b */
        public C4401a mo42114b(boolean z) {
            this.f5576i = z;
            return this;
        }

        /* renamed from: a */
        public C4401a mo42108a(Bundle bundle) {
            this.f5577j = bundle == null ? null : new Bundle(bundle);
            return this;
        }

        /* renamed from: c */
        public C4401a mo42116c(boolean z) {
            this.f5578k = z;
            return this;
        }

        /* renamed from: d */
        public C4401a mo42118d(boolean z) {
            this.f5579l = z;
            return this;
        }

        /* renamed from: a */
        public C4399n mo42112a() {
            return new C4399n(this, (byte) 0);
        }
    }

    protected C4399n(Parcel parcel) {
        this.f5556a = parcel.readString();
        this.f5557b = parcel.readString();
        this.f5558c = parcel.readString();
        this.f5559d = C4411u.m6705a(parcel.readString());
        this.f5560e = parcel.readString();
        this.f5561f = parcel.readString();
        this.f5562g = parcel.readInt();
        this.f5563h = m6588a(parcel);
        this.f5564i = m6588a(parcel);
        this.f5565j = parcel.readBundle(getClass().getClassLoader());
        this.f5566k = m6588a(parcel);
        this.f5567l = m6588a(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5556a);
        parcel.writeString(this.f5557b);
        parcel.writeString(this.f5558c);
        C4411u uVar = this.f5559d;
        parcel.writeString(uVar == null ? null : uVar.mo42213a());
        parcel.writeString(this.f5560e);
        parcel.writeString(this.f5561f);
        parcel.writeInt(this.f5562g);
        m6587a(parcel, this.f5563h);
        m6587a(parcel, this.f5564i);
        parcel.writeBundle(this.f5565j);
        m6587a(parcel, this.f5566k);
        m6587a(parcel, this.f5567l);
    }

    /* renamed from: a */
    private static boolean m6588a(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    /* renamed from: a */
    private static void m6587a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
