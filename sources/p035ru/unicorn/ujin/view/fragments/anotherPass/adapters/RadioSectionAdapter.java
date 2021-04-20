package p035ru.unicorn.ujin.view.fragments.anotherPass.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002$%B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0010J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u001c\u0010\u001b\u001a\u00020\u00162\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0010H\u0016J\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0010J\u0014\u0010\"\u001a\u00020\u00162\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/view/dialogs/dataEntry/SelectValue;", "onSectionSelectedListener", "Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$OnSectionSelectedListener;", "(Ljava/util/List;Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$OnSectionSelectedListener;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getOnSectionSelectedListener$app_kortrosRelease", "()Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$OnSectionSelectedListener;", "selectedItem", "", "getSelectedItem", "()I", "setSelectedItem", "(I)V", "addItem", "", "item", "getItem", "position", "getItemCount", "onBindViewHolder", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "i", "selectItem", "setItems", "items", "OnSectionSelectedListener", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.RadioSectionAdapter */
/* compiled from: RadioSectionAdapter.kt */
public final class RadioSectionAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<SelectValue> data;
    private final OnSectionSelectedListener onSectionSelectedListener;
    private int selectedItem = -1;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$OnSectionSelectedListener;", "", "onSectionSelected", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.RadioSectionAdapter$OnSectionSelectedListener */
    /* compiled from: RadioSectionAdapter.kt */
    public interface OnSectionSelectedListener {
        void onSectionSelected(int i);
    }

    public final List<SelectValue> getData() {
        return this.data;
    }

    public final void setData(List<SelectValue> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public RadioSectionAdapter(List<SelectValue> list, OnSectionSelectedListener onSectionSelectedListener2) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(onSectionSelectedListener2, "onSectionSelectedListener");
        this.data = list;
        this.onSectionSelectedListener = onSectionSelectedListener2;
    }

    public final OnSectionSelectedListener getOnSectionSelectedListener$app_kortrosRelease() {
        return this.onSectionSelectedListener;
    }

    public final int getSelectedItem() {
        return this.selectedItem;
    }

    public final void setSelectedItem(int i) {
        this.selectedItem = i;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        viewHolder.bind(i);
    }

    public int getItemCount() {
        return this.data.size();
    }

    public final SelectValue getItem(int i) {
        return this.data.get(i);
    }

    public final void setItems(List<SelectValue> list) {
        Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
        this.data = list;
        notifyDataSetChanged();
    }

    public final void addItem(SelectValue selectValue) {
        Intrinsics.checkNotNullParameter(selectValue, "item");
        this.data.add(selectValue);
        notifyItemInserted(getItemCount() - 1);
    }

    public final void selectItem(int i) {
        this.selectedItem = i;
        this.onSectionSelectedListener.onSectionSelected(i);
        notifyItemChanged(i);
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_radio_section, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…o_section, parent, false)");
        return new ViewHolder(this, inflate);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/fragments/anotherPass/adapters/RadioSectionAdapter;Landroid/view/View;)V", "bind", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.adapters.RadioSectionAdapter$ViewHolder */
    /* compiled from: RadioSectionAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ RadioSectionAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(RadioSectionAdapter radioSectionAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = radioSectionAdapter;
        }

        public final void bind(int i) {
            SelectValue selectValue = this.this$0.getData().get(i);
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RadioButton radioButton = (RadioButton) view.findViewById(C5619R.C5622id.btnRadio);
            Intrinsics.checkNotNullExpressionValue(radioButton, "itemView.btnRadio");
            radioButton.setChecked(i == this.this$0.getSelectedItem());
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(C5619R.C5622id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tvTitle");
            textView.setText(selectValue.getText());
            View.OnClickListener radioSectionAdapter$ViewHolder$bind$clickListener$1 = new RadioSectionAdapter$ViewHolder$bind$clickListener$1(this, i);
            this.itemView.setOnClickListener(radioSectionAdapter$ViewHolder$bind$clickListener$1);
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            ((RadioButton) view3.findViewById(C5619R.C5622id.btnRadio)).setOnClickListener(radioSectionAdapter$ViewHolder$bind$clickListener$1);
        }
    }
}
