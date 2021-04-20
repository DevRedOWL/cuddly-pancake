package net.alhazmy13.mediapicker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class Utility {
    private static final String TAG = "Utility";

    public static String compressImage(String str) throws IOException {
        File file = new File(str);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
        bufferedOutputStream.close();
        return str;
    }

    public static String getRandomString() {
        return UUID.randomUUID().toString();
    }

    public static void createFolder(String str) {
        try {
            File file = new File(str.substring(0, str.lastIndexOf("/")));
            Log.d(TAG, "createFolder: " + file.exists());
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (Exception e) {
            Log.w(TAG, "creating file error: ", e);
        }
    }

    public static void compressAndRotateIfNeeded(File file, File file2, int i, int i2, int i3) throws IOException {
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (!(i3 == 0 || i2 == 0)) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absolutePath, options);
            options.inSampleSize = calculateInSampleSize(options, i2, i3);
            options.inJustDecodeBounds = false;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
        if (decodeFile == null) {
            Log.d("compress", "bitmap is null");
            return;
        }
        int cameraPhotoOrientation = getCameraPhotoOrientation(file);
        Matrix matrix = new Matrix();
        matrix.postRotate((float) cameraPhotoOrientation, ((float) decodeFile.getWidth()) / 2.0f, ((float) decodeFile.getHeight()) / 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, options.outWidth, options.outHeight, matrix, true);
        FileOutputStream fileOutputStream = new FileOutputStream(file2.getAbsoluteFile());
        createBitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    private static int getCameraPhotoOrientation(File file) throws IOException {
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }
}
