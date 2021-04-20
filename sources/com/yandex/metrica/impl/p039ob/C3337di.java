package com.yandex.metrica.impl.p039ob;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.text.TextUtils;
import com.yandex.metrica.impl.p039ob.C4107tt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.di */
public class C3337di {
    /* renamed from: a */
    public List<ScanFilter> mo39906a(List<C4107tt.C4108a> list) {
        ArrayList arrayList = new ArrayList();
        for (C4107tt.C4108a a : list) {
            ScanFilter a2 = m3007a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private ScanFilter m3007a(C4107tt.C4108a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        ScanFilter.Builder builder = new ScanFilter.Builder();
        boolean z4 = false;
        if (!TextUtils.isEmpty(aVar.f4959b)) {
            builder.setDeviceName(aVar.f4959b);
            z = false;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(aVar.f4958a) && BluetoothAdapter.checkBluetoothAddress(aVar.f4958a.toUpperCase(Locale.US))) {
            builder.setDeviceAddress(aVar.f4958a);
            z = false;
        }
        if (aVar.f4960c != null) {
            z3 = m3008a(builder, aVar.f4960c);
            z2 = false;
        } else {
            z2 = z;
            z3 = true;
        }
        if (aVar.f4961d != null) {
            z3 = z3 && m3009a(builder, aVar.f4961d);
            z2 = false;
        }
        if (aVar.f4962e != null) {
            builder.setServiceUuid(aVar.f4962e.f4969a, aVar.f4962e.f4970b);
        } else {
            z4 = z2;
        }
        if (!z3 || z4) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: a */
    private boolean m3008a(ScanFilter.Builder builder, C4107tt.C4108a.C4109a aVar) {
        if (aVar.f4963a < 0) {
            return false;
        }
        if ((aVar.f4964b == null && aVar.f4965c != null) || m3010a(aVar.f4964b, aVar.f4965c)) {
            return false;
        }
        builder.setManufacturerData(aVar.f4963a, aVar.f4964b, aVar.f4965c);
        return true;
    }

    /* renamed from: a */
    private boolean m3009a(ScanFilter.Builder builder, C4107tt.C4108a.C4110b bVar) {
        if (bVar.f4966a == null) {
            return false;
        }
        if ((bVar.f4967b == null && bVar.f4968c != null) || m3010a(bVar.f4967b, bVar.f4968c)) {
            return false;
        }
        builder.setServiceData(bVar.f4966a, bVar.f4967b, bVar.f4968c);
        return true;
    }

    /* renamed from: a */
    private boolean m3010a(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || bArr.length == bArr2.length) ? false : true;
    }
}
