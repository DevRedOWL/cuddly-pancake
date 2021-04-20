package p035ru.unicorn.ujin.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import androidx.core.graphics.BitmapCompat;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: ru.unicorn.ujin.util.FileUtil */
public class FileUtil {
    public static String DOWNLOAD_PATH = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();

    public static String getBase64(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[0];
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile != null) {
            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
        } else {
            try {
                bArr = readFile(new File(str));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Base64.encodeToString(bArr, 0).replace("\n", "");
    }

    public static byte[] readFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length();
            int i = (int) length;
            if (((long) i) == length) {
                byte[] bArr = new byte[i];
                randomAccessFile.readFully(bArr);
                return bArr;
            }
            throw new IOException("File size >= 2 GB");
        } finally {
            randomAccessFile.close();
        }
    }

    public static boolean hasFileInFiolder(String str, String str2) {
        return new File(str2, str).exists();
    }

    public static String createFileNameIncremental(String str, String str2) {
        if (!hasFileInFiolder(str, str2)) {
            return str;
        }
        File file = new File(str2, str);
        int lastIndexOf = str.lastIndexOf(".");
        String str3 = "";
        int i = 1;
        while (file.exists()) {
            str3 = str.substring(0, lastIndexOf) + "(" + i + ")" + str.substring(lastIndexOf);
            file = new File(str2, str3);
            i++;
        }
        return str3;
    }

    public static void saveFile(String str, String str2) {
        File file = new File(str2, str);
        try {
            file.mkdirs();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getFileName(String str) {
        return str.substring(str.lastIndexOf("/") + 1);
    }

    public static String encodeTobase64(Bitmap bitmap) {
        int width = (bitmap.getWidth() * 1024) / bitmap.getHeight();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, 1024, false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Log.d("TAG", "xxx file size " + width + " " + bitmap.getWidth() + "" + bitmap.getHeight() + BitmapCompat.getAllocationByteCount(createScaledBitmap));
        return Base64.encodeToString(byteArray, 0);
    }

    public static Bitmap decodeBase64(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            return new byte[0];
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String biteArrayToBase64(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }
}
