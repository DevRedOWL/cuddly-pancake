package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany;

import android.view.View;
import android.widget.RadioButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.ChooseObjectListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.ChooseObjectListAdapter$ViewHolder$bind$clickListener$1 */
/* compiled from: ChooseObjectListAdapter.kt */
final class ChooseObjectListAdapter$ViewHolder$bind$clickListener$1 implements View.OnClickListener {
    final /* synthetic */ int $position;
    final /* synthetic */ ChooseObjectListAdapter.ViewHolder this$0;

    ChooseObjectListAdapter$ViewHolder$bind$clickListener$1(ChooseObjectListAdapter.ViewHolder viewHolder, int i) {
        this.this$0 = viewHolder;
        this.$position = i;
    }

    public final void onClick(View view) {
        int selectedItem = this.this$0.this$0.getSelectedItem();
        this.this$0.this$0.setSelectedItem(this.this$0.getAdapterPosition());
        this.this$0.this$0.getOnObjectSelectedListener$app_kortrosRelease().onObjectSelected(this.$position);
        this.this$0.this$0.notifyItemChanged(selectedItem);
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        RadioButton radioButton = (RadioButton) view2.findViewById(C5619R.C5622id.btnRadio);
        Intrinsics.checkNotNullExpressionValue(radioButton, "itemView.btnRadio");
        radioButton.setChecked(this.$position == this.this$0.this$0.getSelectedItem());
    }
}
