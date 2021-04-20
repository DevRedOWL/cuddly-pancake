package p035ru.unicorn.ujin.view.customViews.options;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/options/TextViewHolder;", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.options.TextViewHolder */
/* compiled from: TextViewHolder.kt */
public final class TextViewHolder extends BaseOptionsViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(OptionsItem optionsItem, DialogFragment dialogFragment) {
        Intrinsics.checkNotNullParameter(optionsItem, "item");
        Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(C5619R.C5622id.tvText);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvText");
        textView.setText(optionsItem.getLabel());
        this.itemView.setOnClickListener(new TextViewHolder$bind$1(optionsItem, dialogFragment));
    }
}
