package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.widget.ProgressBar;
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
import org.mobileid.Api;
import org.mobileid.access.key.Key;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.databinding.ItemImageBinding;
import p035ru.unicorn.ujin.ble.data.BleKeyData;
import p035ru.unicorn.ujin.p057di.koin.KoinData;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.data.SimpleData;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "types", "", "Lru/unicorn/ujin/ble/data/BleKeyData;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$onViewCreated$5 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$onViewCreated$5 extends Lambda implements Function1<List<? extends BleKeyData>, Unit> {
    final /* synthetic */ PassDetailFragment2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassDetailFragment2$onViewCreated$5(PassDetailFragment2 passDetailFragment2) {
        super(1);
        this.this$0 = passDetailFragment2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends BleKeyData>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(List<? extends BleKeyData> list) {
        String id;
        Intrinsics.checkNotNullParameter(list, "types");
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.pbar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbar");
        boolean z = false;
        ExtensionKt.setVisible(progressBar, false);
        Iterable<BleKeyData> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (BleKeyData interfaceType : iterable) {
            arrayList.add(interfaceType.getInterfaceType());
        }
        Set set = CollectionsKt.toSet((List) arrayList);
        ItemImageBinding itemImageBinding = this.this$0.getBinding().itemIdPassParent.id2;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding, "binding.itemIdPassParent.id2");
        itemImageBinding.setActive(Boolean.valueOf(set.contains("ble")));
        ItemImageBinding itemImageBinding2 = this.this$0.getBinding().itemIdPassParent.id3;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding2, "binding.itemIdPassParent.id3");
        itemImageBinding2.setActive(Boolean.valueOf(set.contains(SimpleData.CARD)));
        ItemImageBinding itemImageBinding3 = this.this$0.getBinding().itemIdPassParent.id4;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding3, "binding.itemIdPassParent.id4");
        itemImageBinding3.setActive(Boolean.valueOf(set.contains("face")));
        ItemImageBinding itemImageBinding4 = this.this$0.getBinding().itemIdPassParent.id5;
        Intrinsics.checkNotNullExpressionValue(itemImageBinding4, "binding.itemIdPassParent.id5");
        itemImageBinding4.setActive(Boolean.valueOf(set.contains("finger")));
        if (KoinData.INSTANCE.isInit()) {
            Api api = Api.INSTANCE;
            BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
            Key defaultKey = api.getDefaultKey(access$getBaseActivity);
            if (!(defaultKey == null || (id = defaultKey.getId()) == null)) {
                ItemImageBinding itemImageBinding5 = this.this$0.getBinding().itemIdPassParent.id2;
                Intrinsics.checkNotNullExpressionValue(itemImageBinding5, "binding.itemIdPassParent.id2");
                if (id.length() > 0) {
                    z = true;
                }
                itemImageBinding5.setActive(Boolean.valueOf(z));
                this.this$0.getGateKey();
            }
        }
        if (!set.isEmpty()) {
            this.this$0.enableSettingIcon();
        }
    }
}
