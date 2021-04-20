package p032ch.qoqa.glide.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.module.LibraryGlideModule;
import com.caverock.androidsvg.SVG;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo51343d2 = {"Lch/qoqa/glide/svg/SvgLibraryGlideModule;", "Lcom/bumptech/glide/module/LibraryGlideModule;", "()V", "registerComponents", "", "context", "Landroid/content/Context;", "glide", "Lcom/bumptech/glide/Glide;", "registry", "Lcom/bumptech/glide/Registry;", "library_release"}, mo51344k = 1, mo51345mv = {1, 1, 11})
/* renamed from: ch.qoqa.glide.svg.SvgLibraryGlideModule */
/* compiled from: SvgLibraryGlideModule.kt */
public final class SvgLibraryGlideModule extends LibraryGlideModule {
    public void registerComponents(Context context, Glide glide, Registry registry) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(glide, "glide");
        Intrinsics.checkParameterIsNotNull(registry, "registry");
        registry.register(SVG.class, Drawable.class, new SvgDrawableTranscoder(context)).register(SVG.class, Bitmap.class, new SvgBitmapTranscoder()).append(InputStream.class, SVG.class, new SvgDecoder());
    }
}
