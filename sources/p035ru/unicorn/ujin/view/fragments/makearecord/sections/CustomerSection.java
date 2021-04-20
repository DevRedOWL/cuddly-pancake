package p035ru.unicorn.ujin.view.fragments.makearecord.sections;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.sectionedadapter.MultiSection;
import p035ru.unicorn.ujin.view.fragments.makearecord.model.ExecutorsIn;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0005J8\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0014J\u0018\u0010\u0014\u001a\b\u0018\u00010\u0003R\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/CustomerSection;", "Lru/unicorn/ujin/view/activity/navigation/adapter/sectionedadapter/MultiSection;", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "Lru/unicorn/ujin/view/fragments/makearecord/sections/CustomerSection$ViewHolder;", "Landroid/view/View$OnClickListener;", "()V", "checkedItem", "", "getCheckedItem", "()I", "setCheckedItem", "(I)V", "bindViewHolder", "", "viewHolder", "data", "position", "payloads", "", "", "createViewHolder", "view", "Landroid/view/View;", "getLayoutId", "onClick", "v", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.CustomerSection */
/* compiled from: CustomerSection.kt */
public final class CustomerSection extends MultiSection<ExecutorsIn, ViewHolder> implements View.OnClickListener {
    private int checkedItem = -1;

    public int getLayoutId() {
        return R.layout.item_exexutors_list;
    }

    public final int getCheckedItem() {
        return this.checkedItem;
    }

    public final void setCheckedItem(int i) {
        this.checkedItem = i;
    }

    public void onClick(View view) {
        Object tag = view != null ? view.getTag() : null;
        if (tag != null) {
            this.checkedItem = getAdapterPositionForViewHolder((ViewHolder) tag);
            onChanged(0, getData().size(), (Object) null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.fragments.makearecord.sections.CustomerSection.ViewHolder");
    }

    /* access modifiers changed from: protected */
    public ViewHolder createViewHolder(View view) {
        if (view != null) {
            return new ViewHolder(this, view, this);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void bindViewHolder(ViewHolder viewHolder, ExecutorsIn executorsIn, int i, List<Object> list) {
        if (viewHolder != null) {
            viewHolder.bind(executorsIn, i);
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/sections/CustomerSection$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "onclickListener", "Landroid/view/View$OnClickListener;", "(Lru/unicorn/ujin/view/fragments/makearecord/sections/CustomerSection;Landroid/view/View;Landroid/view/View$OnClickListener;)V", "bind", "", "data", "Lru/unicorn/ujin/view/fragments/makearecord/model/ExecutorsIn;", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.makearecord.sections.CustomerSection$ViewHolder */
    /* compiled from: CustomerSection.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ CustomerSection this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CustomerSection customerSection, View view, View.OnClickListener onClickListener) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            Intrinsics.checkNotNullParameter(onClickListener, "onclickListener");
            this.this$0 = customerSection;
            view.setTag(this);
            view.setOnClickListener(onClickListener);
            ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.f6508cb);
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.cb");
            imageView.setTag(this);
            ((ImageView) view.findViewById(C5619R.C5622id.f6508cb)).setOnClickListener(onClickListener);
        }

        public final void bind(ExecutorsIn executorsIn, int i) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            textView.setText(executorsIn != null ? executorsIn.getTitle() : null);
            int i2 = i == this.this$0.getCheckedItem() ? R.drawable.ic_svg_base_check_icon : R.drawable.ic_svg_base_uncheck_icon;
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ((ImageView) view2.findViewById(C5619R.C5622id.f6508cb)).setBackgroundResource(i2);
        }
    }
}
