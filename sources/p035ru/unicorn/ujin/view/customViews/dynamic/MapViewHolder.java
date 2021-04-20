package p035ru.unicorn.ujin.view.customViews.dynamic;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/customViews/dynamic/MapViewHolder;", "Lru/unicorn/ujin/view/customViews/dynamic/BaseViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "item", "Lru/unicorn/ujin/view/dialogs/dataEntry/Field;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.dynamic.MapViewHolder */
/* compiled from: MapViewHolder.kt */
public final class MapViewHolder extends BaseViewHolder {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
    }

    public void bind(Field field) {
        Intrinsics.checkNotNullParameter(field, "item");
        View view = this.itemView;
        if (view != null) {
            ((MapView) view).onCreate(new Bundle());
            ((MapView) this.itemView).getMapAsync(new MapViewHolder$bind$1(this, field));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.gms.maps.MapView");
    }
}
