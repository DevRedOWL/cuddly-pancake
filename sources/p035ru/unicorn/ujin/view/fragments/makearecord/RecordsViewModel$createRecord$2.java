package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p046io.reactivex.functions.Function;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007H\n¢\u0006\u0002\b\b"}, mo51343d2 = {"<anonymous>", "", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "kotlin.jvm.PlatformType", "", "data", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "apply"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$2 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$createRecord$2<T, R> implements Function<HashSet<AttachablePreview>, Iterable<? extends AttachablePreview>> {
    public static final RecordsViewModel$createRecord$2 INSTANCE = new RecordsViewModel$createRecord$2();

    RecordsViewModel$createRecord$2() {
    }

    public final Iterable<AttachablePreview> apply(HashSet<AttachablePreview> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "data");
        return hashSet;
    }
}
