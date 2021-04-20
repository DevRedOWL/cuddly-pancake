package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.databinding.FragmentPassCardFirstBinding;
import p035ru.unicorn.ujin.ble.data.BleReader;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassCreateCardFirstFragment$onViewCreated$1 */
/* compiled from: PassCreateCardFirstFragment.kt */
final class PassCreateCardFirstFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ PassProfileVM $viewModell;
    final /* synthetic */ PassCreateCardFirstFragment this$0;

    PassCreateCardFirstFragment$onViewCreated$1(PassCreateCardFirstFragment passCreateCardFirstFragment, PassProfileVM passProfileVM) {
        this.this$0 = passCreateCardFirstFragment;
        this.$viewModell = passProfileVM;
    }

    public final void onClick(View view) {
        BleReader selectedReader = this.this$0.bleReaderSection.getSelectedReader();
        if (selectedReader != null) {
            ProgressBar progressBar = ((FragmentPassCardFirstBinding) this.this$0.getViewDataBinding()).f6579pb;
            Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pb");
            progressBar.setVisibility(0);
            this.$viewModell.startScanCard(String.valueOf(selectedReader.getSerialNumber()));
            ExtensionKt.observe((Fragment) this.this$0, this.$viewModell.getSavePhotoResult(), new C5913x22cb5b1f(this));
        }
    }
}
