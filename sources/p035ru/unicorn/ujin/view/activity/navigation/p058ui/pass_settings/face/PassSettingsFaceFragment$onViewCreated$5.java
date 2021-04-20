package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassSettingsFaceFragment$onViewCreated$5 */
/* compiled from: PassSettingsFaceFragment.kt */
final class PassSettingsFaceFragment$onViewCreated$5 extends Lambda implements Function1<List<? extends BleKeyData>, Unit> {
    final /* synthetic */ PassSettingsFaceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsFaceFragment$onViewCreated$5(PassSettingsFaceFragment passSettingsFaceFragment) {
        super(1);
        this.this$0 = passSettingsFaceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends BleKeyData>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<? extends BleKeyData> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        LinearLayout linearLayout = (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent);
        Intrinsics.checkNotNullExpressionValue(linearLayout, CategoryItem.Fields.parent);
        Collection collection = list;
        ExtensionKt.setVisible(linearLayout, !collection.isEmpty());
        LinearLayout linearLayout2 = (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent);
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.delete_face);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "delete_face");
            ExtensionKt.setVisible(dynamicBackgroundButton, !collection.isEmpty());
            for (BleKeyData bleKeyData : list) {
                LinearLayout linearLayout3 = (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent);
                View inflate = LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.item_pass_face, (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent), false);
                if (inflate != null) {
                    View view = (ConstraintLayout) inflate;
                    TextView textView = (TextView) view.findViewById(C5619R.C5622id.label1);
                    Intrinsics.checkNotNullExpressionValue(textView, "label1");
                    textView.setText(bleKeyData.getKeyTitle());
                    TextView textView2 = (TextView) view.findViewById(C5619R.C5622id.label2);
                    Intrinsics.checkNotNullExpressionValue(textView2, "label2");
                    textView2.setText(bleKeyData.getDeviceClass());
                    TextView textView3 = (TextView) view.findViewById(C5619R.C5622id.label3);
                    Intrinsics.checkNotNullExpressionValue(textView3, "label3");
                    textView3.setText(bleKeyData.getDeviceClass());
                    Unit unit = Unit.INSTANCE;
                    linearLayout3.addView(view, 0);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                }
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
