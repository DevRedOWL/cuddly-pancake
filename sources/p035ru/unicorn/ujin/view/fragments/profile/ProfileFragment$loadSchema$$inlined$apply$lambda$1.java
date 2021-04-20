package p035ru.unicorn.ujin.view.fragments.profile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "schema", "Lru/unicorn/ujin/view/activity/navigation/entity/schema/Schema;", "invoke", "ru/unicorn/ujin/view/fragments/profile/ProfileFragment$loadSchema$1$13"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment$loadSchema$$inlined$apply$lambda$1 */
/* compiled from: ProfileFragment.kt */
final class ProfileFragment$loadSchema$$inlined$apply$lambda$1 extends Lambda implements Function1<Schema, Unit> {
    final /* synthetic */ ProfileFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileFragment$loadSchema$$inlined$apply$lambda$1(ProfileFragment profileFragment) {
        super(1);
        this.this$0 = profileFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Schema) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Schema schema) {
        Intrinsics.checkNotNullParameter(schema, "schema");
        this.this$0.handleProfileButtonClick(schema);
    }
}
