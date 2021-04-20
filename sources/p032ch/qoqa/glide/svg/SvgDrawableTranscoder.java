package p032ch.qoqa.glide.svg;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo51343d2 = {"Lch/qoqa/glide/svg/SvgDrawableTranscoder;", "Lcom/bumptech/glide/load/resource/transcode/ResourceTranscoder;", "Lcom/caverock/androidsvg/SVG;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bitmapTranscoder", "Lch/qoqa/glide/svg/SvgBitmapTranscoder;", "transcode", "Lcom/bumptech/glide/load/engine/Resource;", "toTranscode", "options", "Lcom/bumptech/glide/load/Options;", "library_release"}, mo51344k = 1, mo51345mv = {1, 1, 11})
/* renamed from: ch.qoqa.glide.svg.SvgDrawableTranscoder */
/* compiled from: SvgDrawableTranscoder.kt */
public final class SvgDrawableTranscoder implements ResourceTranscoder<SVG, Drawable> {
    private final SvgBitmapTranscoder bitmapTranscoder = new SvgBitmapTranscoder();
    private final Context context;

    public SvgDrawableTranscoder(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    public Resource<Drawable> transcode(Resource<SVG> resource, Options options) {
        Intrinsics.checkParameterIsNotNull(resource, "toTranscode");
        Intrinsics.checkParameterIsNotNull(options, "options");
        return new SimpleResource<>(new BitmapDrawable(this.context.getResources(), this.bitmapTranscoder.transcode(resource, options).get()));
    }
}
