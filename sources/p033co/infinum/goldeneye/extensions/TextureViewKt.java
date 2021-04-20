package p033co.infinum.goldeneye.extensions;

import android.view.TextureView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¨\u0006\u0006"}, mo51343d2 = {"onSurfaceUpdate", "", "Landroid/view/TextureView;", "onAvailable", "Lkotlin/Function1;", "onSizeChanged", "goldeneye_release"}, mo51344k = 2, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.TextureViewKt */
/* compiled from: TextureView.kt */
public final class TextureViewKt {
    public static final void onSurfaceUpdate(TextureView textureView, Function1<? super TextureView, Unit> function1, Function1<? super TextureView, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(textureView, "receiver$0");
        Intrinsics.checkParameterIsNotNull(function1, "onAvailable");
        Intrinsics.checkParameterIsNotNull(function12, "onSizeChanged");
        if (textureView.isAvailable()) {
            function1.invoke(textureView);
        }
        textureView.setSurfaceTextureListener(new TextureViewKt$onSurfaceUpdate$1(textureView, function12, function1));
    }
}
