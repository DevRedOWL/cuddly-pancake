package p035ru.unicorn.ujin.metrics;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, mo51343d2 = {"Lru/unicorn/ujin/metrics/TestDevices;", "", "aid", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAid", "()Ljava/lang/String;", "Vlad", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.metrics.TestDevices */
/* compiled from: TestDevices.kt */
public enum TestDevices {
    Vlad("d3b051b9-12c1-47b0-9552-98a78432cd2e");
    
    private final String aid;

    private TestDevices(String str) {
        this.aid = str;
    }

    public final String getAid() {
        return this.aid;
    }
}
