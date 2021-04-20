package p035ru.unicorn.ujin.data.repository;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.MainApplication;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/data/repository/ResourceProvider;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.BaseMarketRemoteRepository$resourceProvider$2 */
/* compiled from: BaseMarketRemoteRepository.kt */
final class BaseMarketRemoteRepository$resourceProvider$2 extends Lambda implements Function0<ResourceProvider> {
    public static final BaseMarketRemoteRepository$resourceProvider$2 INSTANCE = new BaseMarketRemoteRepository$resourceProvider$2();

    BaseMarketRemoteRepository$resourceProvider$2() {
        super(0);
    }

    public final ResourceProvider invoke() {
        Context context = MainApplication.mContext;
        Intrinsics.checkNotNullExpressionValue(context, "MainApplication.mContext");
        return new ResourceProvider(context);
    }
}
