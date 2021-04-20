package p033co.infinum.goldeneye.config.camera2;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p033co.infinum.goldeneye.models.VideoQuality;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Lco/infinum/goldeneye/models/VideoQuality;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.VideoConfigImpl$supportedVideoQualities$2 */
/* compiled from: VideoConfigImpl.kt */
final class VideoConfigImpl$supportedVideoQualities$2 extends Lambda implements Function0<List<? extends VideoQuality>> {
    final /* synthetic */ VideoConfigImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoConfigImpl$supportedVideoQualities$2(VideoConfigImpl videoConfigImpl) {
        super(0);
        this.this$0 = videoConfigImpl;
    }

    public final List<VideoQuality> invoke() {
        Integer intOrNull = StringsKt.toIntOrNull(this.this$0.f1134id);
        if (intOrNull == null) {
            return CollectionsKt.emptyList();
        }
        int intValue = intOrNull.intValue();
        VideoQuality[] values = VideoQuality.values();
        Collection arrayList = new ArrayList();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            VideoQuality videoQuality = values[i];
            if (CamcorderProfile.hasProfile(intValue, videoQuality.getKey()) && videoQuality != VideoQuality.UNKNOWN) {
                arrayList.add(videoQuality);
            }
        }
        return (List) arrayList;
    }
}
