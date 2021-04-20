package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.content.Intent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.WebViewActivity;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.CheckboxField;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.CheckboxViewHolder$bind$2 */
/* compiled from: CheckboxViewHolder.kt */
final class CheckboxViewHolder$bind$2 implements View.OnClickListener {
    final /* synthetic */ CheckboxField $checkboxField;
    final /* synthetic */ CheckboxViewHolder this$0;

    CheckboxViewHolder$bind$2(CheckboxViewHolder checkboxViewHolder, CheckboxField checkboxField) {
        this.this$0 = checkboxViewHolder;
        this.$checkboxField = checkboxField;
    }

    public final void onClick(View view) {
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        Intent putExtra = new Intent(view2.getContext(), WebViewActivity.class).putExtra("url", this.$checkboxField.getUrl());
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(itemView.context,…y.URL, checkboxField.url)");
        View view3 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        view3.getContext().startActivity(putExtra);
    }
}
