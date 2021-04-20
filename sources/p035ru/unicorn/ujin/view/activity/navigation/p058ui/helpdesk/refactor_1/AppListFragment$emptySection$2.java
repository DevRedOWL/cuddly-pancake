package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.SomeString;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.EmptySection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lru/unicorn/ujin/view/activity/navigation/ui/helpdesk/EmptySection;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppListFragment$emptySection$2 */
/* compiled from: AppListFragment.kt */
final class AppListFragment$emptySection$2 extends Lambda implements Function0<EmptySection> {
    final /* synthetic */ AppListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppListFragment$emptySection$2(AppListFragment appListFragment) {
        super(0);
        this.this$0 = appListFragment;
    }

    public final EmptySection invoke() {
        EmptySection emptySection = new EmptySection(false, 14);
        emptySection.setData(new SomeString(this.this$0.getString(R.string.empty_ticket_list)));
        return emptySection;
    }
}
