package org.videolan.libvlc.util;

import android.net.Uri;
import android.os.Build;
import java.io.File;

public class AndroidUtil {
    public static final boolean isJellyBeanMR2OrLater;
    public static final boolean isKitKatOrLater = (isLolliPopOrLater || Build.VERSION.SDK_INT >= 19);
    public static final boolean isLolliPopOrLater = (isMarshMallowOrLater || Build.VERSION.SDK_INT >= 21);
    public static final boolean isMarshMallowOrLater = (isNougatOrLater || Build.VERSION.SDK_INT >= 23);
    public static final boolean isNougatMR1OrLater = (isOOrLater || Build.VERSION.SDK_INT >= 25);
    public static final boolean isNougatOrLater = (isNougatMR1OrLater || Build.VERSION.SDK_INT >= 24);
    public static final boolean isOOrLater = (isPOrLater || Build.VERSION.SDK_INT >= 26);
    public static final boolean isPOrLater = (Build.VERSION.SDK_INT >= 28);

    static {
        boolean z = true;
        if (!isKitKatOrLater && Build.VERSION.SDK_INT < 18) {
            z = false;
        }
        isJellyBeanMR2OrLater = z;
    }

    public static File UriToFile(Uri uri) {
        return new File(uri.getPath().replaceFirst("file://", ""));
    }

    public static Uri PathToUri(String str) {
        return Uri.fromFile(new File(str));
    }

    public static Uri LocationToUri(String str) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() != null) {
            return parse;
        }
        throw new IllegalArgumentException("location has no scheme");
    }

    public static Uri FileToUri(File file) {
        return Uri.fromFile(file);
    }
}
