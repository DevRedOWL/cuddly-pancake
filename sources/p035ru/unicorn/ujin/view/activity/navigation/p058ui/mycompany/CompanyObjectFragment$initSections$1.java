package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.TeamMapper;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my_team/TeamMapper;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.CompanyObjectFragment$initSections$1 */
/* compiled from: CompanyObjectFragment.kt */
final class CompanyObjectFragment$initSections$1<T> implements Consumer<TeamMapper> {
    final /* synthetic */ CompanyObjectFragment this$0;

    CompanyObjectFragment$initSections$1(CompanyObjectFragment companyObjectFragment) {
        this.this$0 = companyObjectFragment;
    }

    public final void accept(TeamMapper teamMapper) {
        CompanyObjectFragment companyObjectFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(teamMapper, "it");
        companyObjectFragment.showDetail(teamMapper);
    }
}
