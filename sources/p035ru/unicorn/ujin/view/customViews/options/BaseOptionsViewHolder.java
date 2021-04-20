package p035ru.unicorn.ujin.view.customViews.options;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsItem;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.options.BaseOptionsViewHolder */
/* compiled from: BaseOptionsViewHolder.kt */
public abstract class BaseOptionsViewHolder extends RecyclerView.ViewHolder {
    public abstract void bind(OptionsItem optionsItem, DialogFragment dialogFragment);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseOptionsViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }
}
