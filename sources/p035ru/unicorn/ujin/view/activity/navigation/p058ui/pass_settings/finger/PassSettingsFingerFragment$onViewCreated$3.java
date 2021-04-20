package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
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
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassSettingsFingerFragment$onViewCreated$3 */
/* compiled from: PassSettingsFingerFragment.kt */
final class PassSettingsFingerFragment$onViewCreated$3 extends Lambda implements Function1<List<? extends BleKeyData>, Unit> {
    final /* synthetic */ PassSettingsFingerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsFingerFragment$onViewCreated$3(PassSettingsFingerFragment passSettingsFingerFragment) {
        super(1);
        this.this$0 = passSettingsFingerFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends BleKeyData>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<? extends BleKeyData> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        boolean z = list.size() == 1;
        LinearLayout linearLayout = (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent);
        Intrinsics.checkNotNullExpressionValue(linearLayout, CategoryItem.Fields.parent);
        ExtensionKt.setVisible(linearLayout, true ^ list.isEmpty());
        LinearLayout linearLayout2 = (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent);
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
            DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.deleteFinger);
            Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "deleteFinger");
            ExtensionKt.setVisible(dynamicBackgroundButton, z);
            for (BleKeyData bleKeyData : list) {
                LinearLayout linearLayout3 = (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent);
                View inflate = LayoutInflater.from(this.this$0.getContext()).inflate(R.layout.item_pass_finger_2, (LinearLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.parent), false);
                if (inflate != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    View view = constraintLayout;
                    TextView textView = (TextView) view.findViewById(C5619R.C5622id.label);
                    Intrinsics.checkNotNullExpressionValue(textView, Constants.ScionAnalytics.PARAM_LABEL);
                    textView.setText(bleKeyData.getKeyTitle());
                    ImageView imageView = (ImageView) view.findViewById(C5619R.C5622id.arrow);
                    Intrinsics.checkNotNullExpressionValue(imageView, "arrow");
                    ExtensionKt.setVisible(imageView, !z);
                    if (!z) {
                        constraintLayout.setOnClickListener(new C5921xeaf904a4(bleKeyData, this, z));
                    } else {
                        ((DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.deleteFinger)).setOnClickListener(new C5922xeaf904a5(bleKeyData, this, z));
                    }
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
