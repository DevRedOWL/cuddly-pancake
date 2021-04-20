package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.databinding.FragmentPassSettingsBinding;
import p035ru.unicorn.databinding.ItemImageBinding;
import p035ru.unicorn.ujin.ble.data.AvailablePassType;
import p035ru.unicorn.ujin.view.activity.navigation.data.SimpleData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "types", "", "Lru/unicorn/ujin/ble/data/AvailablePassType;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.PassSettingsFragment$getAllAvailableType$1 */
/* compiled from: PassSettingsFragment.kt */
final class PassSettingsFragment$getAllAvailableType$1 extends Lambda implements Function1<List<? extends AvailablePassType>, Unit> {
    final /* synthetic */ PassSettingsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsFragment$getAllAvailableType$1(PassSettingsFragment passSettingsFragment) {
        super(1);
        this.this$0 = passSettingsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends AvailablePassType>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<? extends AvailablePassType> list) {
        Intrinsics.checkNotNullParameter(list, "types");
        Iterable<AvailablePassType> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (AvailablePassType type : iterable) {
            arrayList.add(type.getType());
        }
        Set set = CollectionsKt.toSet((List) arrayList);
        ConstraintLayout constraintLayout = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).choose1.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "viewDataBinding.choose1.parent");
        constraintLayout.setVisibility(this.this$0.isVisible(set.contains(SimpleData.CARD)));
        ConstraintLayout constraintLayout2 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).choose2.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "viewDataBinding.choose2.parent");
        constraintLayout2.setVisibility(this.this$0.isVisible(set.contains("finger")));
        ConstraintLayout constraintLayout3 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).choose3.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "viewDataBinding.choose3.parent");
        constraintLayout3.setVisibility(this.this$0.isVisible(set.contains("ble")));
        ConstraintLayout constraintLayout4 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).choose4.parent;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "viewDataBinding.choose4.parent");
        constraintLayout4.setVisibility(this.this$0.isVisible(set.contains("face")));
        ItemImageBinding itemImageBinding = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id2;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding, "viewDataBinding.passIcon.id2");
        itemImageBinding.setVisible(Boolean.valueOf(set.contains("ble")));
        ItemImageBinding itemImageBinding2 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id3;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding2, "viewDataBinding.passIcon.id3");
        itemImageBinding2.setVisible(Boolean.valueOf(set.contains(SimpleData.CARD)));
        ItemImageBinding itemImageBinding3 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id4;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding3, "viewDataBinding.passIcon.id4");
        itemImageBinding3.setVisible(Boolean.valueOf(set.contains("face")));
        ItemImageBinding itemImageBinding4 = ((FragmentPassSettingsBinding) this.this$0.getViewDataBinding()).passIcon.id5;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding4, "viewDataBinding.passIcon.id5");
        itemImageBinding4.setVisible(Boolean.valueOf(set.contains("finger")));
    }
}
