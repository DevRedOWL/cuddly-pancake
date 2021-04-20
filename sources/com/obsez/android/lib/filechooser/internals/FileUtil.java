package com.obsez.android.lib.filechooser.internals;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.support.p001v4.media.session.PlaybackStateCompat;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.regex.Pattern;

public class FileUtil {
    public static String getExtension(File file) {
        if (file == null) {
            return null;
        }
        int lastIndexOf = file.getName().lastIndexOf(".");
        return lastIndexOf >= 0 ? file.getName().substring(lastIndexOf) : "";
    }

    public static String getExtensionWithoutDot(File file) {
        String extension = getExtension(file);
        if (extension.length() == 0) {
            return extension;
        }
        return extension.substring(1);
    }

    public static String getReadableFileSize(long j) {
        float f;
        DecimalFormat decimalFormat = new DecimalFormat("###.#");
        String str = " KB";
        if (j > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            f = (float) (j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            if (f > 1024.0f) {
                f /= 1024.0f;
                if (f > 1024.0f) {
                    f /= 1024.0f;
                    str = " GB";
                } else {
                    str = " MB";
                }
            }
        } else {
            f = 0.0f;
        }
        return String.valueOf(decimalFormat.format((double) f) + str);
    }

    public static String getStoragePath(Context context, boolean z) {
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        try {
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = cls.getMethod("getPath", new Class[0]);
            Method method3 = cls.getMethod("isRemovable", new Class[0]);
            Object invoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(invoke);
            for (int i = 0; i < length; i++) {
                Object obj = Array.get(invoke, i);
                String str = (String) method2.invoke(obj, new Object[0]);
                if (z == ((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                    return str;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e2) {
            e2.printStackTrace();
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static long readSDCard(Context context, Boolean bool) {
        return readSDCard(context, bool, false);
    }

    public static long readSDCard(Context context, Boolean bool, Boolean bool2) {
        long j;
        long j2;
        long j3;
        new DecimalFormat("0.00");
        if (getStoragePath(context, bool.booleanValue()) == null) {
            return -1;
        }
        StatFs statFs = new StatFs(getStoragePath(context, bool.booleanValue()));
        if (Build.VERSION.SDK_INT > 18) {
            j = statFs.getBlockSizeLong();
            j3 = statFs.getBlockCountLong();
            j2 = statFs.getFreeBlocksLong();
        } else {
            j = (long) statFs.getBlockSize();
            j3 = (long) statFs.getBlockCount();
            j2 = (long) statFs.getFreeBlocks();
        }
        if (bool2.booleanValue()) {
            j3 = j2;
        }
        return j3 * j;
    }

    public static class NewFolderFilter implements InputFilter {
        private final int maxLength;
        private final Pattern pattern;

        public NewFolderFilter() {
            this(255, "^[^/<>|\\\\:&;#\n\r\t?*~\u0000-\u001f]*$");
        }

        public NewFolderFilter(int i) {
            this(i, "^[^/<>|\\\\:&;#\n\r\t?*~\u0000-\u001f]*$");
        }

        public NewFolderFilter(String str) {
            this(255, str);
        }

        public NewFolderFilter(int i, String str) {
            this.maxLength = i;
            this.pattern = Pattern.compile(str);
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (this.pattern.matcher(charSequence).matches()) {
                int length = this.maxLength - (spanned.length() - (i4 - i3));
                if (length <= 0) {
                    return "";
                }
                if (length >= i2 - i) {
                    return null;
                }
                int i5 = length + i;
                if (!Character.isHighSurrogate(charSequence.charAt(i5 - 1)) || i5 - 1 != i) {
                    return charSequence.subSequence(i, i5).toString();
                }
                return "";
            } else if (charSequence instanceof SpannableStringBuilder) {
                return spanned.subSequence(i3, i4);
            } else {
                return "";
            }
        }
    }
}
