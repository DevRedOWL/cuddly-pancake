package com.yandex.metrica.impl.p039ob;

import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.uu */
public class C4155uu {

    /* renamed from: a */
    private Integer f5155a;

    /* renamed from: b */
    private final Integer f5156b;

    /* renamed from: c */
    private final Integer f5157c;

    /* renamed from: d */
    private final Integer f5158d;

    /* renamed from: e */
    private final Integer f5159e;

    /* renamed from: f */
    private final String f5160f;

    /* renamed from: g */
    private final String f5161g;

    /* renamed from: h */
    private final boolean f5162h;

    /* renamed from: i */
    private final int f5163i;

    /* renamed from: j */
    private final Integer f5164j;

    /* renamed from: k */
    private final Long f5165k;

    /* renamed from: com.yandex.metrica.impl.ob.uu$b */
    static abstract class C4157b {

        /* renamed from: a */
        static final Integer f5166a = Integer.MAX_VALUE;

        /* renamed from: b */
        static final Integer f5167b = Integer.MAX_VALUE;

        /* renamed from: c */
        static final Integer f5168c = Integer.MAX_VALUE;

        /* renamed from: d */
        static final Integer f5169d = Integer.MAX_VALUE;

        /* renamed from: e */
        static final Integer f5170e = Integer.MAX_VALUE;

        /* renamed from: f */
        private final C4226wf f5171f;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract C4155uu mo41632a(CellInfo cellInfo);

        public C4157b() {
            this(new C4226wf());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C4155uu mo41633a(Integer num, Integer num2, CellSignalStrength cellSignalStrength, Integer num3, Integer num4, boolean z, int i, Integer num5, long j) {
            Integer num6;
            Integer num7;
            Integer num8;
            Integer num9;
            Integer num10 = num;
            Integer num11 = num2;
            Integer num12 = num3;
            Integer num13 = num4;
            Integer num14 = num5;
            if (num10 != null) {
                if (num10 == f5166a) {
                    num10 = null;
                }
                num6 = num10;
            } else {
                num6 = null;
            }
            if (num11 != null) {
                if (num11 == f5167b) {
                    num11 = null;
                }
                num7 = num11;
            } else {
                num7 = null;
            }
            Integer valueOf = cellSignalStrength != null ? Integer.valueOf(cellSignalStrength.getDbm()) : null;
            if (num13 != null) {
                if (num13 == f5168c) {
                    num13 = null;
                }
                num8 = num13;
            } else {
                num8 = null;
            }
            if (num12 != null) {
                if (num12 == f5169d) {
                    num12 = null;
                }
                num9 = num12;
            } else {
                num9 = null;
            }
            return new C4155uu(num8, num9, num7, num6, (String) null, (String) null, valueOf, z, i, (num14 == null || num14 == f5170e) ? null : num14, m5724a(j));
        }

        /* renamed from: a */
        private Long m5724a(long j) {
            Long l = null;
            if (j <= 0) {
                return null;
            }
            long d = this.f5171f.mo41766d(j, TimeUnit.NANOSECONDS);
            if (d > 0 && d < TimeUnit.HOURS.toSeconds(1)) {
                l = Long.valueOf(d);
            }
            if (l != null) {
                return l;
            }
            long a = this.f5171f.mo41763a(j, TimeUnit.NANOSECONDS);
            return (a <= 0 || a >= TimeUnit.HOURS.toSeconds(1)) ? l : Long.valueOf(a);
        }

        public C4157b(C4226wf wfVar) {
            this.f5171f = wfVar;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uu$c */
    static class C4158c extends C4157b {
        C4158c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4155uu mo41632a(CellInfo cellInfo) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
            return mo41633a(Integer.valueOf(cellIdentity.getCid()), Integer.valueOf(cellIdentity.getLac()), cellInfoGsm.getCellSignalStrength(), Integer.valueOf(cellIdentity.getMnc()), Integer.valueOf(cellIdentity.getMcc()), cellInfoGsm.isRegistered(), 1, (Integer) null, cellInfoGsm.getTimeStamp());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uu$a */
    static class C4156a extends C4157b {
        C4156a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4155uu mo41632a(CellInfo cellInfo) {
            CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            return mo41633a((Integer) null, (Integer) null, cellInfoCdma.getCellSignalStrength(), (Integer) null, (Integer) null, cellInfoCdma.isRegistered(), 2, (Integer) null, cellInfoCdma.getTimeStamp());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uu$d */
    static class C4159d extends C4157b {
        C4159d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4155uu mo41632a(CellInfo cellInfo) {
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            CellIdentityLte cellIdentity = cellInfoLte.getCellIdentity();
            return mo41633a(Integer.valueOf(cellIdentity.getCi()), Integer.valueOf(cellIdentity.getTac()), cellInfoLte.getCellSignalStrength(), Integer.valueOf(cellIdentity.getMnc()), Integer.valueOf(cellIdentity.getMcc()), cellInfoLte.isRegistered(), 4, Integer.valueOf(cellIdentity.getPci()), cellInfoLte.getTimeStamp());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.uu$e */
    static class C4160e extends C4157b {
        C4160e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C4155uu mo41632a(CellInfo cellInfo) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            CellIdentityWcdma cellIdentity = cellInfoWcdma.getCellIdentity();
            return mo41633a(Integer.valueOf(cellIdentity.getCid()), Integer.valueOf(cellIdentity.getLac()), cellInfoWcdma.getCellSignalStrength(), Integer.valueOf(cellIdentity.getMnc()), Integer.valueOf(cellIdentity.getMcc()), cellInfoWcdma.isRegistered(), 3, Integer.valueOf(cellIdentity.getPsc()), cellInfoWcdma.getTimeStamp());
        }
    }

    public C4155uu(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5, boolean z, int i, Integer num6, Long l) {
        this.f5156b = num;
        this.f5157c = num2;
        this.f5158d = num3;
        this.f5159e = num4;
        this.f5160f = str;
        this.f5161g = str2;
        this.f5155a = num5;
        this.f5162h = z;
        this.f5163i = i;
        this.f5164j = num6;
        this.f5165k = l;
    }

    /* renamed from: a */
    public static C4155uu m5709a(CellInfo cellInfo) {
        C4157b b = m5710b(cellInfo);
        if (b == null) {
            return null;
        }
        return b.mo41632a(cellInfo);
    }

    /* renamed from: b */
    public static C4157b m5710b(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoGsm) {
            return new C4158c();
        }
        if (cellInfo instanceof CellInfoCdma) {
            return new C4156a();
        }
        if (cellInfo instanceof CellInfoLte) {
            return new C4159d();
        }
        if (!C3306cx.m2857a(18) || !(cellInfo instanceof CellInfoWcdma)) {
            return null;
        }
        return new C4160e();
    }

    /* renamed from: a */
    public Integer mo41619a() {
        return this.f5155a;
    }

    /* renamed from: b */
    public Integer mo41621b() {
        return this.f5156b;
    }

    /* renamed from: c */
    public Integer mo41622c() {
        return this.f5157c;
    }

    /* renamed from: d */
    public Integer mo41623d() {
        return this.f5158d;
    }

    /* renamed from: e */
    public Integer mo41624e() {
        return this.f5159e;
    }

    /* renamed from: f */
    public String mo41625f() {
        return this.f5160f;
    }

    /* renamed from: g */
    public String mo41626g() {
        return this.f5161g;
    }

    /* renamed from: h */
    public boolean mo41627h() {
        return this.f5162h;
    }

    /* renamed from: a */
    public void mo41620a(Integer num) {
        this.f5155a = num;
    }

    /* renamed from: i */
    public int mo41628i() {
        return this.f5163i;
    }

    /* renamed from: j */
    public Integer mo41629j() {
        return this.f5164j;
    }

    /* renamed from: k */
    public Long mo41630k() {
        return this.f5165k;
    }

    public String toString() {
        return "CellDescription{mSignalStrength=" + this.f5155a + ", mMobileCountryCode=" + this.f5156b + ", mMobileNetworkCode=" + this.f5157c + ", mLocationAreaCode=" + this.f5158d + ", mCellId=" + this.f5159e + ", mOperatorName='" + this.f5160f + '\'' + ", mNetworkType='" + this.f5161g + '\'' + ", mConnected=" + this.f5162h + ", mCellType=" + this.f5163i + ", mPci=" + this.f5164j + ", mLastVisibleTimeOffset=" + this.f5165k + '}';
    }
}
