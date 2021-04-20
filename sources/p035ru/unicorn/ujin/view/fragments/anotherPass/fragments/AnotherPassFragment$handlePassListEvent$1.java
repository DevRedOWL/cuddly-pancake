package p035ru.unicorn.ujin.view.fragments.anotherPass.fragments;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "position", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassFragment$handlePassListEvent$1 */
/* compiled from: AnotherPassFragment.kt */
final class AnotherPassFragment$handlePassListEvent$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ ArrayList $list;
    final /* synthetic */ AnotherPassFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnotherPassFragment$handlePassListEvent$1(AnotherPassFragment anotherPassFragment, ArrayList arrayList) {
        super(1);
        this.this$0 = anotherPassFragment;
        this.$list = arrayList;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AnotherPassFragment anotherPassFragment = this.this$0;
        Object obj = this.$list.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "list[position]");
        anotherPassFragment.handlePassClick((Passe) obj);
    }
}
