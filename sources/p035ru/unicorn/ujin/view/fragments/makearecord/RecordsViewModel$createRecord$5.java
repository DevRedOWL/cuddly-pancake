package p035ru.unicorn.ujin.view.fragments.makearecord;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "id", "", "test", "(Ljava/lang/Integer;)Z"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.RecordsViewModel$createRecord$5 */
/* compiled from: RecordsViewModel.kt */
final class RecordsViewModel$createRecord$5<T> implements Predicate<Integer> {
    public static final RecordsViewModel$createRecord$5 INSTANCE = new RecordsViewModel$createRecord$5();

    RecordsViewModel$createRecord$5() {
    }

    public final boolean test(Integer num) {
        Intrinsics.checkNotNullParameter(num, "id");
        return num.intValue() != 0;
    }
}
