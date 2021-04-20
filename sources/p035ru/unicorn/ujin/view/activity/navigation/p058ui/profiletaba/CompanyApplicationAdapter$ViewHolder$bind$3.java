package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profiletaba.CompanyApplicationAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profiletaba.CompanyApplicationAdapter$ViewHolder$bind$3 */
/* compiled from: CompanyApplicationAdapter.kt */
final class CompanyApplicationAdapter$ViewHolder$bind$3 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ CompanyApplicationAdapter.ViewHolder this$0;

    CompanyApplicationAdapter$ViewHolder$bind$3(CompanyApplicationAdapter.ViewHolder viewHolder, int i) {
        this.this$0 = viewHolder;
        this.$position = i;
    }

    public final void onClick(View view) {
        this.this$0.this$0.getOnItemClickedListener$app_kortrosRelease().onApprovedClicked(this.$position);
    }
}
