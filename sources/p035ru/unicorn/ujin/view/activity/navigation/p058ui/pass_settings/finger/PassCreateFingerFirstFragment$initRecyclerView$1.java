package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerFirstFragment$initRecyclerView$1 */
/* compiled from: PassCreateFingerFirstFragment.kt */
final class PassCreateFingerFirstFragment$initRecyclerView$1<T> implements Consumer<BleReader> {
    final /* synthetic */ PassCreateFingerFirstFragment this$0;

    PassCreateFingerFirstFragment$initRecyclerView$1(PassCreateFingerFirstFragment passCreateFingerFirstFragment) {
        this.this$0 = passCreateFingerFirstFragment;
    }

    public final void accept(BleReader bleReader) {
        MutableLiveData<Integer> selectedFingerReader;
        PassProfileVM passProfileVM = (PassProfileVM) this.this$0.getViewModell();
        if (passProfileVM != null && (selectedFingerReader = passProfileVM.getSelectedFingerReader()) != null) {
            selectedFingerReader.setValue(Integer.valueOf(this.this$0.bleReaderSection.getSelectedPosition()));
        }
    }
}
