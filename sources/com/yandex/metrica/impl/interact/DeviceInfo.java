package com.yandex.metrica.impl.interact;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3213bt;
import com.yandex.metrica.impl.p039ob.C3350dr;
import com.yandex.metrica.impl.p039ob.C3357du;
import com.yandex.metrica.impl.p039ob.C3358dv;
import com.yandex.metrica.impl.p039ob.C3364dz;
import com.yandex.metrica.impl.p039ob.C4179v;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class DeviceInfo {

    /* renamed from: a */
    private static final Object f2463a = new Object();

    /* renamed from: b */
    private static volatile DeviceInfo f2464b;
    public final String appPlatform;
    public final String deviceRootStatus;
    public final List<String> deviceRootStatusMarkers;
    public final String deviceType;
    public String locale;
    public final String manufacturer;
    public final String model;
    public final String osVersion;
    public final String platform;
    public final String platformDeviceId;
    public final float scaleFactor;
    public final int screenDpi;
    public final int screenHeight;
    public final int screenWidth;

    public static DeviceInfo getInstance(Context context) {
        if (f2464b == null) {
            synchronized (f2463a) {
                if (f2464b == null) {
                    f2464b = new DeviceInfo(context, C4179v.m5795a(context));
                }
            }
        }
        return f2464b;
    }

    DeviceInfo(Context context, C4179v vVar) {
        this.platform = vVar.f5204a;
        this.appPlatform = vVar.f5204a;
        this.platformDeviceId = vVar.mo41660a();
        this.manufacturer = vVar.f5205b;
        this.model = vVar.f5206c;
        this.osVersion = vVar.f5207d;
        this.screenWidth = vVar.f5209f.f5219a;
        this.screenHeight = vVar.f5209f.f5220b;
        this.screenDpi = vVar.f5209f.f5221c;
        this.scaleFactor = vVar.f5209f.f5222d;
        this.deviceType = vVar.f5210g;
        this.deviceRootStatus = vVar.f5211h;
        this.deviceRootStatusMarkers = new ArrayList(vVar.f5212i);
        this.locale = C3213bt.m2393a(context.getResources().getConfiguration().locale);
        C3350dr.m3043a().mo39930a(this, C3364dz.class, C3358dv.m3057a(new C3357du<C3364dz>() {
            /* renamed from: a */
            public void mo39399a(C3364dz dzVar) {
                DeviceInfo.this.locale = dzVar.f3092a;
            }
        }).mo39939a());
    }
}
