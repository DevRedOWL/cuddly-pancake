package p035ru.unicorn.ujin.view.dialogs.dialogOptions;

import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.enums.OptionsType;
import p035ru.unicorn.ujin.view.customViews.options.BaseOptionsViewHolder;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/customViews/options/BaseOptionsViewHolder;", "optionsList", "", "Lru/unicorn/ujin/view/dialogs/dialogOptions/OptionsItem;", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "(Ljava/util/List;Landroidx/fragment/app/DialogFragment;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.dialogOptions.OptionsAdapter */
/* compiled from: OptionsAdapter.kt */
public final class OptionsAdapter extends RecyclerView.Adapter<BaseOptionsViewHolder> {
    private final DialogFragment dialogFragment;
    private final List<OptionsItem> optionsList;

    public OptionsAdapter(List<OptionsItem> list, DialogFragment dialogFragment2) {
        Intrinsics.checkNotNullParameter(list, "optionsList");
        Intrinsics.checkNotNullParameter(dialogFragment2, "dialogFragment");
        this.optionsList = list;
        this.dialogFragment = dialogFragment2;
    }

    public BaseOptionsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        return OptionsType.Companion.getViewHolder(i, viewGroup);
    }

    public void onBindViewHolder(BaseOptionsViewHolder baseOptionsViewHolder, int i) {
        Intrinsics.checkNotNullParameter(baseOptionsViewHolder, "holder");
        baseOptionsViewHolder.bind(this.optionsList.get(i), this.dialogFragment);
    }

    public int getItemViewType(int i) {
        return OptionsType.Companion.getType(this.optionsList.get(i).getType()).getHolderType();
    }

    public int getItemCount() {
        return this.optionsList.size();
    }
}
