package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.SelectValue;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¨\u0006\r¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/dynamic/SpinnerViewHolder$bind$1$1", "Landroid/widget/AdapterView$OnItemSelectedListener;", "onItemSelected", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "pos", "", "id", "", "onNothingSelected", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.SpinnerViewHolder$bind$$inlined$also$lambda$1 */
/* compiled from: SpinnerViewHolder.kt */
public final class SpinnerViewHolder$bind$$inlined$also$lambda$1 implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ Field $item$inlined;
    final /* synthetic */ ArrayList $selectValues;
    final /* synthetic */ SpinnerViewHolder this$0;

    public void onNothingSelected(AdapterView<?> adapterView) {
        Intrinsics.checkNotNullParameter(adapterView, CategoryItem.Fields.parent);
    }

    SpinnerViewHolder$bind$$inlined$also$lambda$1(ArrayList arrayList, SpinnerViewHolder spinnerViewHolder, Field field) {
        this.$selectValues = arrayList;
        this.this$0 = spinnerViewHolder;
        this.$item$inlined = field;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Intrinsics.checkNotNullParameter(adapterView, CategoryItem.Fields.parent);
        Intrinsics.checkNotNullParameter(view, "view");
        this.this$0.getOnValueChanged().invoke(((SelectValue) this.$selectValues.get(i)).getValue());
        this.this$0.getSetValidFlag().invoke(Boolean.valueOf(this.this$0.isValueValid(((SelectValue) this.$selectValues.get(i)).getValue())), this.$item$inlined.getName());
    }
}
