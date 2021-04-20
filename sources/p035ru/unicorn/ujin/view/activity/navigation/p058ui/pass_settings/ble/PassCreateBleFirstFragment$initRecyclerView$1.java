package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import p035ru.unicorn.databinding.FragmentPassBleFirstBinding;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/ble/data/BleReader;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleFirstFragment$initRecyclerView$1 */
/* compiled from: PassCreateBleFirstFragment.kt */
final class PassCreateBleFirstFragment$initRecyclerView$1<T> implements Consumer<BleReader> {
    final /* synthetic */ PassCreateBleFirstFragment this$0;

    PassCreateBleFirstFragment$initRecyclerView$1(PassCreateBleFirstFragment passCreateBleFirstFragment) {
        this.this$0 = passCreateBleFirstFragment;
    }

    public final void accept(BleReader bleReader) {
        MutableLiveData<Integer> selectedFingerReader;
        ((FragmentPassBleFirstBinding) this.this$0.getViewDataBinding()).f6577sv.postDelayed(new Runnable(this) {
            final /* synthetic */ PassCreateBleFirstFragment$initRecyclerView$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                ((FragmentPassBleFirstBinding) this.this$0.this$0.getViewDataBinding()).f6577sv.fullScroll(130);
            }
        }, 300);
        PassProfileVM passProfileVM = (PassProfileVM) this.this$0.getViewModell();
        if (passProfileVM != null && (selectedFingerReader = passProfileVM.getSelectedFingerReader()) != null) {
            selectedFingerReader.setValue(Integer.valueOf(this.this$0.bleReaderSection.getSelectedPosition()));
        }
    }
}
