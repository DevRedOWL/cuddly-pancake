package p035ru.unicorn.ujin.metrics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "Ljava/util/ArrayList;", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.metrics.MetricsFacade$Companion$idList$2 */
/* compiled from: MerticsFacade.kt */
final class MetricsFacade$Companion$idList$2 extends Lambda implements Function0<ArrayList<String>> {
    public static final MetricsFacade$Companion$idList$2 INSTANCE = new MetricsFacade$Companion$idList$2();

    MetricsFacade$Companion$idList$2() {
        super(0);
    }

    public final ArrayList<String> invoke() {
        TestDevices[] values = TestDevices.values();
        Collection arrayList = new ArrayList(values.length);
        for (TestDevices aid : values) {
            arrayList.add(aid.getAid());
        }
        return (ArrayList) ((List) arrayList);
    }
}
