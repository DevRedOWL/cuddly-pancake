package net.alhazmy13.mediapicker.Video;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import net.alhazmy13.mediapicker.FileProcessing;

class VideoProcessing {
    VideoProcessing() {
    }

    static List<String> processMultiVideos(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 18 && intent.getData() == null) {
            ClipData clipData = intent.getClipData();
            for (int i = 0; i < clipData.getItemCount(); i++) {
                arrayList.add(FileProcessing.getPath(context, clipData.getItemAt(i).getUri()));
            }
        }
        return arrayList;
    }
}
