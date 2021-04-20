package net.alhazmy13.mediapicker.Image;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import net.alhazmy13.mediapicker.FileProcessing;

class ImageProcessing {
    ImageProcessing() {
    }

    public static List<String> processMultiImage(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 18 && intent.getData() == null) {
            ClipData clipData = intent.getClipData();
            int i = 0;
            while (true) {
                if (i >= (clipData != null ? clipData.getItemCount() : 0)) {
                    break;
                }
                arrayList.add(FileProcessing.getPath(context, clipData.getItemAt(i).getUri()));
                i++;
            }
        }
        return arrayList;
    }
}
