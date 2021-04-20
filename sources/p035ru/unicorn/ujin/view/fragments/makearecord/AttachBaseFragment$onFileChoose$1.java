package p035ru.unicorn.ujin.view.fragments.makearecord;

import com.obsez.android.lib.filechooser.ChooserDialog;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "path", "", "kotlin.jvm.PlatformType", "pathFile", "Ljava/io/File;", "onChoosePath"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.AttachBaseFragment$onFileChoose$1 */
/* compiled from: AttachBaseFragment.kt */
final class AttachBaseFragment$onFileChoose$1 implements ChooserDialog.Result {
    final /* synthetic */ AttachBaseFragment this$0;

    AttachBaseFragment$onFileChoose$1(AttachBaseFragment attachBaseFragment) {
        this.this$0 = attachBaseFragment;
    }

    public final void onChoosePath(String str, File file) {
        AttachBaseFragment attachBaseFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(file, "pathFile");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "pathFile.path");
        attachBaseFragment.onFileChoose(path);
    }
}
