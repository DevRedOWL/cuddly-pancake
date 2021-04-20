package p035ru.unicorn.ujin.data.repository;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.enums.Flavor;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.BaseMarketRemoteRepository$appName$2 */
/* compiled from: BaseMarketRemoteRepository.kt */
final class BaseMarketRemoteRepository$appName$2 extends Lambda implements Function0<String> {
    public static final BaseMarketRemoteRepository$appName$2 INSTANCE = new BaseMarketRemoteRepository$appName$2();

    BaseMarketRemoteRepository$appName$2() {
        super(0);
    }

    public final String invoke() {
        return Flavor.Companion.getByFlavor("kortros").getAppName();
    }
}
