package p035ru.unicorn.ujin.view.fragments.makearecord;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.base.attach.AttachablePreview;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "list", "Ljava/util/HashSet;", "Lru/unicorn/ujin/view/fragments/base/attach/AttachablePreview;", "Lkotlin/collections/HashSet;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$1 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$createRecord$1<T> implements Predicate<HashSet<AttachablePreview>> {
    public static final RecordsViewModel$createRecord$1 INSTANCE = new RecordsViewModel$createRecord$1();

    RecordsViewModel$createRecord$1() {
    }

    public final boolean test(HashSet<AttachablePreview> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "list");
        return !hashSet.isEmpty();
    }
}
