package p032ch.qoqa.glide.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo51343d2 = {"Lch/qoqa/glide/svg/SvgBitmapTranscoder;", "Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder;", "Lcom/caverock/androidsvg/SVG;", "Landroid/graphics/Bitmap;", "()V", "transcode", "Lcom/bumptech/glide/load/engine/Resource;", "toTranscode", "options", "Lcom/bumptech/glide/load/Options;", "library_release"}, mo51344k = 1, mo51345mv = {1, 1, 11})
/* renamed from: ch.qoqa.glide.svg.SvgBitmapTranscoder */
/* compiled from: SvgBitmapTranscoder.kt */
public final class SvgBitmapTranscoder implements ResourceTranscoder<SVG, Bitmap> {
    public Resource<Bitmap> transcode(Resource<SVG> resource, Options options) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(resource, "toTranscode");
        Intrinsics.checkParameterIsNotNull(options, "options");
        SVG svg = resource.get();
        Intrinsics.checkExpressionValueIsNotNull(svg, "svg");
        Integer valueOf = Integer.valueOf((int) svg.getDocumentWidth());
        boolean z = true;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = (int) (svg.getDocumentViewBox().right - svg.getDocumentViewBox().left);
        }
        Integer valueOf2 = Integer.valueOf((int) svg.getDocumentHeight());
        if (valueOf2.intValue() <= 0) {
            z = false;
        }
        if (!z) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            i2 = valueOf2.intValue();
        } else {
            i2 = (int) (svg.getDocumentViewBox().bottom - svg.getDocumentViewBox().top);
        }
        PictureDrawable pictureDrawable = new PictureDrawable(svg.renderToPicture(i, i2));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawPicture(pictureDrawable.getPicture());
        return new SimpleResource<>(createBitmap);
    }
}
