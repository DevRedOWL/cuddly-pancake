package p035ru.unicorn.ujin.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/DevicesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/unicorn/ujin/view/adapters/DevicesAdapter$ViewHolder;", "data", "", "Lru/unicorn/ujin/view/activity/navigation/api/DeviceModel;", "(Ljava/util/List;)V", "context", "Landroid/content/Context;", "getData", "()Ljava/util/List;", "setData", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.DevicesAdapter */
/* compiled from: DevicesAdapter.kt */
public final class DevicesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private List<? extends DeviceModel> data;

    public DevicesAdapter(List<? extends DeviceModel> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
    }

    public final List<DeviceModel> getData() {
        return this.data;
    }

    public final void setData(List<? extends DeviceModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        viewHolder.bind((DeviceModel) this.data.get(i));
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, CategoryItem.Fields.parent);
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        Context context3 = this.context;
        if (context3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        View inflate = LayoutInflater.from(context3).inflate(R.layout.item_devices, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(cont…m_devices, parent, false)");
        return new ViewHolder(this, inflate);
    }

    public int getItemCount() {
        return this.data.size();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/adapters/DevicesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lru/unicorn/ujin/view/adapters/DevicesAdapter;Landroid/view/View;)V", "bind", "", "deviceModel", "Lru/unicorn/ujin/view/activity/navigation/api/DeviceModel;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.adapters.DevicesAdapter$ViewHolder */
    /* compiled from: DevicesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        final /* synthetic */ DevicesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(DevicesAdapter devicesAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = devicesAdapter;
        }

        public final void bind(DeviceModel deviceModel) {
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ((CheckBox) view.findViewById(C5619R.C5622id.checkbox)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(C5619R.C5622id.title);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.title");
            textView.setText(deviceModel.getTitle());
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            CheckBox checkBox = (CheckBox) view3.findViewById(C5619R.C5622id.checkbox);
            Intrinsics.checkNotNullExpressionValue(checkBox, "itemView.checkbox");
            checkBox.setChecked(deviceModel.realmGet$isCheck());
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ((CheckBox) view4.findViewById(C5619R.C5622id.checkbox)).setOnCheckedChangeListener(new DevicesAdapter$ViewHolder$bind$1(this));
        }
    }
}
