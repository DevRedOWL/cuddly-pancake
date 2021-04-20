package p033co.infinum.goldeneye.extensions;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, mo51343d2 = {"co/infinum/goldeneye/extensions/TextureViewKt$onSurfaceUpdate$1", "Landroid/view/TextureView$SurfaceTextureListener;", "onSurfaceTextureAvailable", "", "surface", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.extensions.TextureViewKt$onSurfaceUpdate$1 */
/* compiled from: TextureView.kt */
public final class TextureViewKt$onSurfaceUpdate$1 implements TextureView.SurfaceTextureListener {
    final /* synthetic */ Function1 $onAvailable;
    final /* synthetic */ Function1 $onSizeChanged;
    final /* synthetic */ TextureView $this_onSurfaceUpdate;

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    TextureViewKt$onSurfaceUpdate$1(TextureView textureView, Function1 function1, Function1 function12) {
        this.$this_onSurfaceUpdate = textureView;
        this.$onSizeChanged = function1;
        this.$onAvailable = function12;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.$onSizeChanged.invoke(this.$this_onSurfaceUpdate);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.$onAvailable.invoke(this.$this_onSurfaceUpdate);
    }
}
