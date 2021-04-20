package p007at.nineyards.anyline.util;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: at.nineyards.anyline.util.TempFileUtil */
public class TempFileUtil {

    /* renamed from: a */
    private static final String f751a = TempFileUtil.class.getSimpleName();

    /* renamed from: b */
    private static long f752b = 8388608;

    /* renamed from: c */
    private static float f753c = 0.5f;

    public static File createTempFileCheckCache(Context context, String str, String str2) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(context.getCacheDir(), "anyline_temp_dir");
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdir();
            return File.createTempFile(str, str2, file);
        }
        File[] listFiles = file.listFiles();
        long a = m365a(listFiles);
        long j = f752b;
        if (a > j) {
            long j2 = (long) (((float) j) * (1.0f - f753c));
            long j3 = 0;
            m366b(listFiles);
            for (int length = listFiles.length - 1; length >= 0; length--) {
                if (listFiles[length].isFile()) {
                    j3 += listFiles[length].length();
                }
                listFiles[length].delete();
                if (a - j3 < j2) {
                    break;
                }
            }
        }
        File createTempFile = File.createTempFile(str, str2, file);
        StringBuilder sb = new StringBuilder("Temp file created (with cache check) in ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append("ms");
        return createTempFile;
    }

    /* renamed from: a */
    private static long m365a(File[] fileArr) {
        long j = 0;
        for (File file : fileArr) {
            if (file.isFile()) {
                j += file.length();
            }
        }
        return j;
    }

    /* renamed from: b */
    private static void m366b(File[] fileArr) {
        C0807a[] aVarArr = new C0807a[fileArr.length];
        for (int i = 0; i < fileArr.length; i++) {
            aVarArr[i] = new C0807a(fileArr[i]);
        }
        Arrays.sort(aVarArr);
        for (int i2 = 0; i2 < fileArr.length; i2++) {
            fileArr[i2] = aVarArr[i2].f755b;
        }
    }

    /* renamed from: at.nineyards.anyline.util.TempFileUtil$a */
    private static class C0807a implements Comparable {

        /* renamed from: a */
        long f754a;

        /* renamed from: b */
        File f755b;

        public C0807a(File file) {
            this.f755b = file;
            this.f754a = file.lastModified();
        }

        public final int compareTo(Object obj) {
            long j = ((C0807a) obj).f754a;
            long j2 = this.f754a;
            if (j2 < j) {
                return -1;
            }
            return j2 == j ? 0 : 1;
        }
    }
}
