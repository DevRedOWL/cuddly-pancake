package net.alhazmy13.mediapicker;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileProcessing {
    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return getDataColumn(context, uri, (String) null, (String[]) null);
            }
            if (UriUtil.LOCAL_FILE_SCHEME.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if (isExternalStorageDocument(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            String str = split[0];
            if ("primary".equalsIgnoreCase(str)) {
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            } else if (Build.VERSION.SDK_INT > 20) {
                File[] externalMediaDirs = context.getExternalMediaDirs();
                if (externalMediaDirs.length <= 1) {
                    return "";
                }
                String absolutePath = externalMediaDirs[1].getAbsolutePath();
                return absolutePath.substring(0, absolutePath.indexOf("Android")) + split[1];
            } else {
                return "/storage/" + str + "/" + split[1];
            }
        } else if (isDownloadsDocument(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (TextUtils.isEmpty(documentId) || !documentId.startsWith("raw:")) {
                return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
            }
            return documentId.replaceFirst("raw:", "");
        } else if (isMediaDocument(uri)) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str2 = split2[0];
            if ("image".equals(str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDataColumn(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0031 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            if (r8 == 0) goto L_0x002b
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x002b
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x0028
            r8.close()
        L_0x0028:
            return r9
        L_0x0029:
            r9 = move-exception
            goto L_0x0033
        L_0x002b:
            if (r8 == 0) goto L_0x0030
            r8.close()
        L_0x0030:
            return r7
        L_0x0031:
            r9 = move-exception
            r8 = r7
        L_0x0033:
            if (r8 == 0) goto L_0x0038
            r8.close()
        L_0x0038:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: net.alhazmy13.mediapicker.FileProcessing.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static String getVideoPath(Uri uri, Activity activity) {
        Cursor managedQuery = activity.managedQuery(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
        if (managedQuery == null) {
            return null;
        }
        int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow("_data");
        managedQuery.moveToFirst();
        return managedQuery.getString(columnIndexOrThrow);
    }

    public static void copyDirectory(File file, File file2) {
        try {
            if (file.isDirectory()) {
                if (!file2.exists()) {
                    file2.mkdir();
                }
                for (String str : file.list()) {
                    copyDirectory(new File(file, str), new File(file2, str));
                }
                return;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }
}
