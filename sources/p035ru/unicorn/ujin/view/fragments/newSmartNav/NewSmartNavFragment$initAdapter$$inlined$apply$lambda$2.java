package p035ru.unicorn.ujin.view.fragments.newSmartNav;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "schema", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "accept", "ru/unicorn/ujin/view/fragments/newSmartNav/NewSmartNavFragment$initAdapter$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.newSmartNav.NewSmartNavFragment$initAdapter$$inlined$apply$lambda$2 */
/* compiled from: NewSmartNavFragment.kt */
final class NewSmartNavFragment$initAdapter$$inlined$apply$lambda$2<T> implements Consumer<Schema> {
    final /* synthetic */ NewSmartNavFragment this$0;

    NewSmartNavFragment$initAdapter$$inlined$apply$lambda$2(NewSmartNavFragment newSmartNavFragment) {
        this.this$0 = newSmartNavFragment;
    }

    public final void accept(Schema schema) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        this.this$0.checkUpdate(schema);
    }
}
