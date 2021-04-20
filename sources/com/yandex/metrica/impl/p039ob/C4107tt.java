package com.yandex.metrica.impl.p039ob;

import android.os.ParcelUuid;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.tt */
public class C4107tt {

    /* renamed from: a */
    public final C4112b f4954a;

    /* renamed from: b */
    public final List<C4108a> f4955b;

    /* renamed from: c */
    public final long f4956c;

    /* renamed from: d */
    public final long f4957d;

    /* renamed from: com.yandex.metrica.impl.ob.tt$b */
    public static class C4112b {

        /* renamed from: a */
        public final C4113a f4971a;

        /* renamed from: b */
        public final C4114b f4972b;

        /* renamed from: c */
        public final C4115c f4973c;

        /* renamed from: d */
        public final C4116d f4974d;

        /* renamed from: e */
        public final long f4975e;

        /* renamed from: com.yandex.metrica.impl.ob.tt$b$a */
        public enum C4113a {
            ALL_MATCHES,
            FIRST_MATCH,
            MATCH_LOST
        }

        /* renamed from: com.yandex.metrica.impl.ob.tt$b$b */
        public enum C4114b {
            AGGRESSIVE,
            STICKY
        }

        /* renamed from: com.yandex.metrica.impl.ob.tt$b$c */
        public enum C4115c {
            ONE_AD,
            FEW_AD,
            MAX_AD
        }

        /* renamed from: com.yandex.metrica.impl.ob.tt$b$d */
        public enum C4116d {
            LOW_POWER,
            BALANCED,
            LOW_LATENCY
        }

        public C4112b(C4113a aVar, C4114b bVar, C4115c cVar, C4116d dVar, long j) {
            this.f4971a = aVar;
            this.f4972b = bVar;
            this.f4973c = cVar;
            this.f4974d = dVar;
            this.f4975e = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4112b bVar = (C4112b) obj;
            if (this.f4975e == bVar.f4975e && this.f4971a == bVar.f4971a && this.f4972b == bVar.f4972b && this.f4973c == bVar.f4973c && this.f4974d == bVar.f4974d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.f4975e;
            return (((((((this.f4971a.hashCode() * 31) + this.f4972b.hashCode()) * 31) + this.f4973c.hashCode()) * 31) + this.f4974d.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "Settings{callbackType=" + this.f4971a + ", matchMode=" + this.f4972b + ", numOfMatches=" + this.f4973c + ", scanMode=" + this.f4974d + ", reportDelay=" + this.f4975e + '}';
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.tt$a */
    public static class C4108a {

        /* renamed from: a */
        public final String f4958a;

        /* renamed from: b */
        public final String f4959b;

        /* renamed from: c */
        public final C4109a f4960c;

        /* renamed from: d */
        public final C4110b f4961d;

        /* renamed from: e */
        public final C4111c f4962e;

        /* renamed from: com.yandex.metrica.impl.ob.tt$a$a */
        public static class C4109a {

            /* renamed from: a */
            public final int f4963a;

            /* renamed from: b */
            public final byte[] f4964b;

            /* renamed from: c */
            public final byte[] f4965c;

            public C4109a(int i, byte[] bArr, byte[] bArr2) {
                this.f4963a = i;
                this.f4964b = bArr;
                this.f4965c = bArr2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C4109a aVar = (C4109a) obj;
                if (this.f4963a == aVar.f4963a && Arrays.equals(this.f4964b, aVar.f4964b)) {
                    return Arrays.equals(this.f4965c, aVar.f4965c);
                }
                return false;
            }

            public int hashCode() {
                return (((this.f4963a * 31) + Arrays.hashCode(this.f4964b)) * 31) + Arrays.hashCode(this.f4965c);
            }

            public String toString() {
                return "ManufacturerData{manufacturerId=" + this.f4963a + ", data=" + Arrays.toString(this.f4964b) + ", dataMask=" + Arrays.toString(this.f4965c) + '}';
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.tt$a$b */
        public static class C4110b {

            /* renamed from: a */
            public final ParcelUuid f4966a;

            /* renamed from: b */
            public final byte[] f4967b;

            /* renamed from: c */
            public final byte[] f4968c;

            public C4110b(String str, byte[] bArr, byte[] bArr2) {
                this.f4966a = ParcelUuid.fromString(str);
                this.f4967b = bArr;
                this.f4968c = bArr2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C4110b bVar = (C4110b) obj;
                if (this.f4966a.equals(bVar.f4966a) && Arrays.equals(this.f4967b, bVar.f4967b)) {
                    return Arrays.equals(this.f4968c, bVar.f4968c);
                }
                return false;
            }

            public int hashCode() {
                return (((this.f4966a.hashCode() * 31) + Arrays.hashCode(this.f4967b)) * 31) + Arrays.hashCode(this.f4968c);
            }

            public String toString() {
                return "ServiceData{uuid=" + this.f4966a + ", data=" + Arrays.toString(this.f4967b) + ", dataMask=" + Arrays.toString(this.f4968c) + '}';
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.tt$a$c */
        public static class C4111c {

            /* renamed from: a */
            public final ParcelUuid f4969a;

            /* renamed from: b */
            public final ParcelUuid f4970b;

            public C4111c(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
                this.f4969a = parcelUuid;
                this.f4970b = parcelUuid2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                C4111c cVar = (C4111c) obj;
                if (!this.f4969a.equals(cVar.f4969a)) {
                    return false;
                }
                ParcelUuid parcelUuid = this.f4970b;
                ParcelUuid parcelUuid2 = cVar.f4970b;
                if (parcelUuid != null) {
                    return parcelUuid.equals(parcelUuid2);
                }
                if (parcelUuid2 == null) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode = this.f4969a.hashCode() * 31;
                ParcelUuid parcelUuid = this.f4970b;
                return hashCode + (parcelUuid != null ? parcelUuid.hashCode() : 0);
            }

            public String toString() {
                return "ServiceUuid{uuid=" + this.f4969a + ", uuidMask=" + this.f4970b + '}';
            }
        }

        public C4108a(String str, String str2, C4109a aVar, C4110b bVar, C4111c cVar) {
            this.f4958a = str;
            this.f4959b = str2;
            this.f4960c = aVar;
            this.f4961d = bVar;
            this.f4962e = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C4108a aVar = (C4108a) obj;
            String str = this.f4958a;
            if (str == null ? aVar.f4958a != null : !str.equals(aVar.f4958a)) {
                return false;
            }
            String str2 = this.f4959b;
            if (str2 == null ? aVar.f4959b != null : !str2.equals(aVar.f4959b)) {
                return false;
            }
            C4109a aVar2 = this.f4960c;
            if (aVar2 == null ? aVar.f4960c != null : !aVar2.equals(aVar.f4960c)) {
                return false;
            }
            C4110b bVar = this.f4961d;
            if (bVar == null ? aVar.f4961d != null : !bVar.equals(aVar.f4961d)) {
                return false;
            }
            C4111c cVar = this.f4962e;
            C4111c cVar2 = aVar.f4962e;
            if (cVar != null) {
                return cVar.equals(cVar2);
            }
            if (cVar2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f4958a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f4959b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            C4109a aVar = this.f4960c;
            int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            C4110b bVar = this.f4961d;
            int hashCode4 = (hashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            C4111c cVar = this.f4962e;
            if (cVar != null) {
                i = cVar.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            return "Filter{deviceAddress='" + this.f4958a + '\'' + ", deviceName='" + this.f4959b + '\'' + ", data=" + this.f4960c + ", serviceData=" + this.f4961d + ", serviceUuid=" + this.f4962e + '}';
        }
    }

    public C4107tt(C4112b bVar, List<C4108a> list, long j, long j2) {
        this.f4954a = bVar;
        this.f4955b = list;
        this.f4956c = j;
        this.f4957d = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4107tt ttVar = (C4107tt) obj;
        if (this.f4956c == ttVar.f4956c && this.f4957d == ttVar.f4957d && this.f4954a.equals(ttVar.f4954a)) {
            return this.f4955b.equals(ttVar.f4955b);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f4956c;
        long j2 = this.f4957d;
        return (((((this.f4954a.hashCode() * 31) + this.f4955b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "BleCollectingConfig{settings=" + this.f4954a + ", scanFilters=" + this.f4955b + ", sameBeaconMinReportingInterval=" + this.f4956c + ", firstDelay=" + this.f4957d + '}';
    }
}
