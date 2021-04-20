package p035ru.unicorn.ujin.data.api.response.hardware;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/hardware/SerialNumberResponseData;", "", "serialNumber", "", "(J)V", "getSerialNumber", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.hardware.SerialNumberResponseData */
/* compiled from: SerialNumberResponse.kt */
public final class SerialNumberResponseData {
    @SerializedName("serialnumber")
    private final long serialNumber;

    public static /* synthetic */ SerialNumberResponseData copy$default(SerialNumberResponseData serialNumberResponseData, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = serialNumberResponseData.serialNumber;
        }
        return serialNumberResponseData.copy(j);
    }

    public final long component1() {
        return this.serialNumber;
    }

    public final SerialNumberResponseData copy(long j) {
        return new SerialNumberResponseData(j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SerialNumberResponseData) && this.serialNumber == ((SerialNumberResponseData) obj).serialNumber;
        }
        return true;
    }

    public int hashCode() {
        return Long.valueOf(this.serialNumber).hashCode();
    }

    public String toString() {
        return "SerialNumberResponseData(serialNumber=" + this.serialNumber + ")";
    }

    public SerialNumberResponseData(long j) {
        this.serialNumber = j;
    }

    public final long getSerialNumber() {
        return this.serialNumber;
    }
}
