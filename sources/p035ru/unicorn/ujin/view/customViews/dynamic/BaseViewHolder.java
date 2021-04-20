package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H&R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR,\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "onValueChanged", "Lkotlin/Function1;", "", "", "getOnValueChanged", "()Lkotlin/jvm/functions/Function1;", "setOnValueChanged", "(Lkotlin/jvm/functions/Function1;)V", "setValidFlag", "Lkotlin/Function2;", "", "getSetValidFlag", "()Lkotlin/jvm/functions/Function2;", "setSetValidFlag", "(Lkotlin/jvm/functions/Function2;)V", "bind", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.BaseViewHolder */
/* compiled from: BaseViewHolder.kt */
public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    private Function1<? super String, Unit> onValueChanged = BaseViewHolder$onValueChanged$1.INSTANCE;
    private Function2<? super Boolean, ? super String, Unit> setValidFlag = BaseViewHolder$setValidFlag$1.INSTANCE;

    public abstract void bind(Field field);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public final Function1<String, Unit> getOnValueChanged() {
        return this.onValueChanged;
    }

    public final void setOnValueChanged(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onValueChanged = function1;
    }

    public final Function2<Boolean, String, Unit> getSetValidFlag() {
        return this.setValidFlag;
    }

    public final void setSetValidFlag(Function2<? super Boolean, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.setValidFlag = function2;
    }
}
