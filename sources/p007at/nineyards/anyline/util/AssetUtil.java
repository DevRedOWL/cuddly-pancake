package p007at.nineyards.anyline.util;

import android.content.Context;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: at.nineyards.anyline.util.AssetUtil */
public class AssetUtil {

    /* renamed from: a */
    private static final String f742a = AssetUtil.class.getSimpleName();

    public static String readFile(Context context, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
        StringBuilder sb = new StringBuilder();
        String readLine = bufferedReader.readLine();
        while (readLine != null) {
            sb.append(readLine);
            readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append("\n");
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public static JSONObject getAnylineAssetsJson(Context context, String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                try {
                    return new JSONObject(sb.toString());
                } catch (JSONException e) {
                    throw new IOException("Invalid json file: " + str + " Error: " + e.getMessage());
                }
            }
        }
    }

    public static void copyAnylineAssets(Context context, JSONObject jSONObject, String str, File file, boolean z) throws JSONException, IOException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m358a(context, next, file, jSONObject2.getString(next), z);
        }
    }

    public static void copyAssetFile(Context context, String str, File file, boolean z) throws IOException {
        String str2;
        new File(file, str).getParentFile().mkdirs();
        if (!z) {
            str2 = m357a(context, str);
            String str3 = f742a;
            Log.d(str3, "Md5 hash for file " + str + ": " + str2);
        } else {
            str2 = null;
        }
        m358a(context, str, file, str2, z);
    }

    public static void copyAssetFile(Context context, String str, File file, String str2) throws IOException {
        m358a(context, str, file, str2, str2 == null);
    }

    public static void copyAssetFileWithoutPath(Context context, String str, File file, boolean z) throws IOException {
        String str2;
        if (!z) {
            str2 = m357a(context, str);
            String str3 = f742a;
            Log.d(str3, "Md5 hash for file " + str + ": " + str2);
        } else {
            str2 = null;
        }
        copyAssetFileWithoutPath(context, str, file, str2);
    }

    public static void copyAssetFileWithoutPath(Context context, String str, File file, String str2) throws IOException {
        int lastIndexOf = str.lastIndexOf(File.separator);
        if (lastIndexOf != str.length() - 1) {
            String substring = lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
            File file2 = new File(file, substring);
            file2.getParentFile().mkdirs();
            File file3 = new File(file, substring + ".md5");
            if (str2 == null || !file2.exists() || !m361a(file3, str2)) {
                file2.delete();
                m359a(context.getAssets().open(str), file2);
                if (str2 != null) {
                    m360a(str2, file3);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Second argument must be a path to a file, but is a path to a directory.");
    }

    /* renamed from: a */
    private static String m357a(Context context, String str) throws IOException {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        InputStream open = context.getAssets().open(str);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            String sb2 = sb.toString();
            open.close();
            new StringBuilder("getMd5FromAsset duration: ").append(System.currentTimeMillis() - currentTimeMillis);
            return sb2;
        } catch (NoSuchAlgorithmException e) {
            throw new IOException("Could not generate hash from file", e);
        } catch (Throwable th) {
            open.close();
            new StringBuilder("getMd5FromAsset duration: ").append(System.currentTimeMillis() - currentTimeMillis);
            throw th;
        }
    }

    /* renamed from: a */
    private static void m358a(Context context, String str, File file, String str2, boolean z) throws IOException {
        File file2 = new File(file, str);
        file2.getParentFile().mkdirs();
        if (!z && str2 != null && file2.exists()) {
            if (m361a(new File(file, str + ".md5"), str2)) {
                return;
            }
        }
        file2.delete();
        m359a(context.getAssets().open(str), file2);
        if (str2 != null) {
            m360a(str2, new File(file, str + ".md5"));
        }
    }

    /* renamed from: a */
    private static void m359a(InputStream inputStream, File file) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read != -1) {
            bufferedOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        inputStream.close();
    }

    /* renamed from: a */
    private static void m360a(String str, File file) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.flush();
        fileWriter.close();
    }

    /* renamed from: a */
    private static boolean m361a(File file, String str) throws IOException {
        if (!file.exists()) {
            return false;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null && !readLine.isEmpty()) {
                return readLine.trim().equals(str);
            }
        } catch (FileNotFoundException unused) {
        }
        return false;
    }
}
