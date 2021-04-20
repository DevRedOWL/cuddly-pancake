package p033co.infinum.goldeneye;

import java.io.File;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, mo51343d2 = {"Lco/infinum/goldeneye/VideoCallback;", "", "onError", "", "t", "", "onVideoRecorded", "file", "Ljava/io/File;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.VideoCallback */
/* compiled from: Callbacks.kt */
public interface VideoCallback {
    void onError(Throwable th);

    void onVideoRecorded(File file);
}
