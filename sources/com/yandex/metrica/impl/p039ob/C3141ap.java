package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ap */
public class C3141ap implements Parcelable {
    public static final Parcelable.Creator<C3141ap> CREATOR = new Parcelable.Creator<C3141ap>() {
        /* renamed from: a */
        public C3141ap createFromParcel(Parcel parcel) {
            return new C3141ap(parcel);
        }

        /* renamed from: a */
        public C3141ap[] newArray(int i) {
            return new C3141ap[i];
        }
    };

    /* renamed from: a */
    private ResultReceiver f2581a;

    /* renamed from: b */
    private List<String> f2582b;

    /* renamed from: c */
    private Map<String, String> f2583c;

    public int describeContents() {
        return 0;
    }

    public C3141ap(List<String> list, Map<String, String> map, ResultReceiver resultReceiver) {
        HashMap hashMap;
        this.f2582b = list;
        this.f2581a = resultReceiver;
        if (map != null) {
            hashMap = new HashMap(map);
        }
        this.f2583c = hashMap;
    }

    /* renamed from: a */
    public boolean mo39505a(C4143uk ukVar) {
        boolean equals;
        boolean isEmpty;
        if (C3306cx.m2861a((Collection) this.f2582b)) {
            return true;
        }
        if (ukVar == null) {
            return false;
        }
        boolean z = true;
        for (String next : this.f2582b) {
            if ("yandex_mobile_metrica_device_id".equals(next)) {
                isEmpty = TextUtils.isEmpty(ukVar.f5088b);
            } else if ("yandex_mobile_metrica_uuid".equals(next)) {
                isEmpty = TextUtils.isEmpty(ukVar.f5087a);
            } else if ("appmetrica_device_id_hash".equals(next)) {
                isEmpty = TextUtils.isEmpty(ukVar.f5090d);
            } else if ("yandex_mobile_metrica_report_ad_url".equals(next)) {
                isEmpty = TextUtils.isEmpty(ukVar.f5093g);
            } else if ("yandex_mobile_metrica_get_ad_url".equals(next)) {
                isEmpty = TextUtils.isEmpty(ukVar.f5092f);
            } else if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(next)) {
                equals = this.f2583c.equals(C4225we.m6009a(ukVar.f5100n));
                z &= equals;
            }
            equals = !isEmpty;
            z &= equals;
        }
        return z;
    }

    /* renamed from: a */
    public List<String> mo39504a() {
        return this.f2582b;
    }

    /* renamed from: b */
    public Map<String, String> mo39506b() {
        return this.f2583c;
    }

    /* renamed from: c */
    public ResultReceiver mo39507c() {
        return this.f2581a;
    }

    protected C3141ap(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(C4248x.class.getClassLoader());
        if (readBundle != null) {
            this.f2581a = (ResultReceiver) readBundle.getParcelable("com.yandex.metrica.CounterConfiguration.receiver");
            this.f2582b = readBundle.getStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList");
            this.f2583c = C4225we.m6009a(readBundle.getString("com.yandex.metrica.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f2583c = new HashMap();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.yandex.metrica.CounterConfiguration.receiver", this.f2581a);
        List<String> list = this.f2582b;
        if (list != null) {
            bundle.putStringArrayList("com.yandex.metrica.CounterConfiguration.identifiersList", new ArrayList(list));
        }
        Map<String, String> map = this.f2583c;
        if (map != null) {
            bundle.putString("com.yandex.metrica.CounterConfiguration.clidsForVerification", C4225we.m6008a(map));
        }
        parcel.writeBundle(bundle);
    }
}
