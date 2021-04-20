package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zan();
    final String zaa;
    final ArrayList<zal> zab;
    private final int zac;

    zam(int i, String str, ArrayList<zal> arrayList) {
        this.zac = i;
        this.zaa = str;
        this.zab = arrayList;
    }

    zam(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zal> arrayList;
        this.zac = 1;
        this.zaa = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zal(next, map.get(next)));
            }
        }
        this.zab = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zac);
        SafeParcelWriter.writeString(parcel, 2, this.zaa, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zab, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
