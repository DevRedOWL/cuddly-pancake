package p035ru.unicorn.ujin.p057di.koin;

import android.app.Application;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.mobileid.factory.Modules;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Lorg/koin/core/KoinApplication;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.di.koin.KoinData$init$1 */
/* compiled from: KoinData.kt */
final class KoinData$init$1 extends Lambda implements Function1<KoinApplication, Unit> {
    final /* synthetic */ Application $app;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    KoinData$init$1(Application application) {
        super(1);
        this.$app = application;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KoinApplication) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(KoinApplication koinApplication) {
        Intrinsics.checkNotNullParameter(koinApplication, "$receiver");
        KoinExtKt.androidLogger$default(koinApplication, (Level) null, 1, (Object) null);
        KoinExtKt.androidContext(koinApplication, this.$app);
        koinApplication.modules(Modules.Companion.getMobileIdAppModules());
    }
}
