package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.yandex.metrica.impl.ob.am */
public final class C3137am {
    /* renamed from: a */
    public static String m2010a(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        StringWriter stringWriter = new StringWriter();
        m2008a((Reader) inputStreamReader, (Writer) stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static String m2011a(String str) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                String a = m2010a((InputStream) fileInputStream2);
                C3306cx.m2855a((Closeable) fileInputStream2);
                return a;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                C3306cx.m2855a((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            C3306cx.m2855a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static int m2008a(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        int i = 0;
        while (true) {
            int read = reader.read(cArr, 0, 4096);
            if (-1 == read) {
                return i;
            }
            writer.write(cArr, 0, read);
            i += read;
        }
    }

    /* renamed from: b */
    public static String m2020b(String str) {
        try {
            return Base64.encodeToString(m2019a(str.getBytes("UTF-8")), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m2019a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C3306cx.m2855a((Closeable) gZIPOutputStream2);
                    C3306cx.m2855a((Closeable) byteArrayOutputStream);
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    C3306cx.m2855a((Closeable) gZIPOutputStream);
                    C3306cx.m2855a((Closeable) byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                C3306cx.m2855a((Closeable) gZIPOutputStream);
                C3306cx.m2855a((Closeable) byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            C3306cx.m2855a((Closeable) gZIPOutputStream);
            C3306cx.m2855a((Closeable) byteArrayOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m2026b(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] b = m2025b((InputStream) gZIPInputStream2);
                    C3306cx.m2855a((Closeable) gZIPInputStream2);
                    C3306cx.m2855a((Closeable) byteArrayInputStream);
                    return b;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    gZIPInputStream = gZIPInputStream2;
                    th = th2;
                    C3306cx.m2855a((Closeable) gZIPInputStream);
                    C3306cx.m2855a((Closeable) byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C3306cx.m2855a((Closeable) gZIPInputStream);
                C3306cx.m2855a((Closeable) byteArrayInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
            C3306cx.m2855a((Closeable) gZIPInputStream);
            C3306cx.m2855a((Closeable) byteArrayInputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public static String m2027c(String str) {
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        String str2 = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
            try {
                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    str2 = m2010a((InputStream) gZIPInputStream);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                gZIPInputStream = null;
            }
        } catch (Throwable unused3) {
            gZIPInputStream = null;
            byteArrayInputStream = null;
        }
        C3306cx.m2855a((Closeable) gZIPInputStream);
        C3306cx.m2855a((Closeable) byteArrayInputStream);
        return str2;
    }

    /* renamed from: b */
    public static byte[] m2025b(InputStream inputStream) throws IOException {
        return m2018a(inputStream, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public static byte[] m2018a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (-1 == read) {
                    break;
                } else if (i2 > i) {
                    break;
                } else if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                    i2 += read;
                }
            } finally {
                C3306cx.m2855a((Closeable) byteArrayOutputStream);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static String m2009a(Context context, File file) {
        byte[] b = m2024b(context, file);
        try {
            return new String(b, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str = new String(b);
            C4085tl.m5459a(context).reportError("read_share_file_with_unsupported_encoding", e);
            return str;
        }
    }

    /* renamed from: b */
    public static byte[] m2024b(Context context, File file) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                fileLock = channel.lock(0, Long.MAX_VALUE, true);
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
                    channel.read(allocate);
                    allocate.flip();
                    byte[] array = allocate.array();
                    m2015a(file.getAbsolutePath(), fileLock);
                    C3306cx.m2855a((Closeable) randomAccessFile);
                    return array;
                } catch (IOException | SecurityException unused) {
                    m2015a(file.getAbsolutePath(), fileLock);
                    C3306cx.m2855a((Closeable) randomAccessFile);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        C4085tl.m5459a(context).reportError("error_during_file_reading", th);
                        m2015a(file.getAbsolutePath(), fileLock);
                        C3306cx.m2855a((Closeable) randomAccessFile);
                        return null;
                    } catch (Throwable th2) {
                        m2015a(file.getAbsolutePath(), fileLock);
                        C3306cx.m2855a((Closeable) randomAccessFile);
                        throw th2;
                    }
                }
            } catch (IOException | SecurityException unused2) {
                fileLock = null;
                m2015a(file.getAbsolutePath(), fileLock);
                C3306cx.m2855a((Closeable) randomAccessFile);
                return null;
            } catch (Throwable th3) {
                th = th3;
                fileLock = null;
                C4085tl.m5459a(context).reportError("error_during_file_reading", th);
                m2015a(file.getAbsolutePath(), fileLock);
                C3306cx.m2855a((Closeable) randomAccessFile);
                return null;
            }
        } catch (IOException | SecurityException unused3) {
            randomAccessFile = null;
            fileLock = null;
            m2015a(file.getAbsolutePath(), fileLock);
            C3306cx.m2855a((Closeable) randomAccessFile);
            return null;
        } catch (Throwable th4) {
            th = th4;
            randomAccessFile = null;
            fileLock = null;
            C4085tl.m5459a(context).reportError("error_during_file_reading", th);
            m2015a(file.getAbsolutePath(), fileLock);
            C3306cx.m2855a((Closeable) randomAccessFile);
            return null;
        }
    }

    /* renamed from: a */
    public static void m2015a(String str, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2013a(Context context, String str, String str2) {
        try {
            if (m2023b()) {
                m2014a(str2, str, context.openFileOutput(str, 0));
                m2028c(context, context.getFileStreamPath(str));
                return;
            }
            m2014a(str2, str, context.openFileOutput(str, 1));
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static void m2012a(Context context, String str) {
        if (m2023b()) {
            m2029c(context, str);
        }
        m2021b(context, str);
    }

    /* renamed from: b */
    private static void m2021b(Context context, String str) {
        try {
            File file = new File(context.getFileStreamPath(str).getAbsolutePath());
            if (file.exists() && file.canWrite()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m2029c(Context context, String str) {
        try {
            File file = new File(context.getNoBackupFilesDir(), str);
            if (file.exists() && file.canWrite()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m2022b(Context context, String str, String str2) {
        File file = new File(context.getNoBackupFilesDir(), str);
        try {
            m2014a(str2, str, new FileOutputStream(file));
            m2028c(context, file);
        } catch (FileNotFoundException unused) {
        }
    }

    /* renamed from: c */
    public static void m2028c(final Context context, final File file) {
        if (file.exists()) {
            file.setReadable(true, false);
            if (m2023b()) {
                new File(context.getApplicationInfo().dataDir).setExecutable(true, false);
                return;
            }
            return;
        }
        C4085tl.m5459a(context).reportEvent("make_non_existed_world_readable", (Map<String, Object>) new HashMap<String, Object>() {
            {
                put("file_name", file.getName());
                put("applicationId", context.getPackageName());
            }
        });
    }

    /* renamed from: b */
    private static boolean m2023b() {
        return C3306cx.m2857a(24);
    }

    /* renamed from: a */
    private static void m2014a(String str, String str2, FileOutputStream fileOutputStream) {
        FileLock fileLock = null;
        try {
            FileChannel channel = fileOutputStream.getChannel();
            fileLock = channel.lock();
            byte[] bytes = str.getBytes("UTF-8");
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            channel.write(allocate);
            channel.force(true);
        } catch (IOException unused) {
        } catch (Throwable th) {
            m2015a(str2, fileLock);
            C3306cx.m2855a((Closeable) fileOutputStream);
            throw th;
        }
        m2015a(str2, fileLock);
        C3306cx.m2855a((Closeable) fileOutputStream);
    }

    /* renamed from: c */
    public static byte[] m2030c(byte[] bArr) {
        try {
            return MessageDigest.getInstance("MD5").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2016a(java.net.HttpURLConnection r0, com.yandex.metrica.impl.p039ob.C3949rs.C3954a.C3956b r1, java.lang.String r2, int r3) {
        /*
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x000b }
            byte[] r2 = m2018a((java.io.InputStream) r2, (int) r3)     // Catch:{ IOException -> 0x000b }
            r1.mo41120a((byte[]) r2)     // Catch:{ IOException -> 0x000b }
        L_0x000b:
            java.io.InputStream r0 = r0.getErrorStream()     // Catch:{ IOException -> 0x0016 }
            byte[] r0 = m2018a((java.io.InputStream) r0, (int) r3)     // Catch:{ IOException -> 0x0016 }
            r1.mo41122b(r0)     // Catch:{ IOException -> 0x0016 }
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3137am.m2016a(java.net.HttpURLConnection, com.yandex.metrica.impl.ob.rs$a$b, java.lang.String, int):void");
    }

    /* renamed from: a */
    public static boolean m2017a() {
        return C3306cx.m2857a(21);
    }
}
