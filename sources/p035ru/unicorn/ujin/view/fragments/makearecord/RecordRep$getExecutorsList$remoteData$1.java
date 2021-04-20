package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsListIn;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "kotlin.jvm.PlatformType", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsListIn;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getExecutorsList$remoteData$1 */
/* compiled from: RecordRep.kt */
final class RecordRep$getExecutorsList$remoteData$1<T, R> implements Function<Resource<ExecutorsListIn>, List<? extends ExecutorsIn>> {
    public static final RecordRep$getExecutorsList$remoteData$1 INSTANCE = new RecordRep$getExecutorsList$remoteData$1();

    RecordRep$getExecutorsList$remoteData$1() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.getItems();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn> apply(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsListIn> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r2 = r2.getData()
            ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsListIn r2 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsListIn) r2
            if (r2 == 0) goto L_0x0014
            java.util.List r2 = r2.getItems()
            if (r2 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0018:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.makearecord.RecordRep$getExecutorsList$remoteData$1.apply(ru.unicorn.ujin.data.realm.Resource):java.util.List");
    }
}
