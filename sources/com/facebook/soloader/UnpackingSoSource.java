package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class UnpackingSoSource extends DirectorySoSource {
    private static final String DEPS_FILE_NAME = "dso_deps";
    private static final String LOCK_FILE_NAME = "dso_lock";
    private static final String MANIFEST_FILE_NAME = "dso_manifest";
    private static final byte MANIFEST_VERSION = 1;
    private static final byte STATE_CLEAN = 1;
    private static final byte STATE_DIRTY = 0;
    private static final String STATE_FILE_NAME = "dso_state";
    private static final String TAG = "fb-UnpackingSoSource";
    @Nullable
    private String[] mAbis;
    protected final Context mContext;
    @Nullable
    protected String mCorruptedLib;
    private final Map<String, Object> mLibsBeingLoaded = new HashMap();

    /* access modifiers changed from: protected */
    public abstract Unpacker makeUnpacker() throws IOException;

    protected UnpackingSoSource(Context context, String str) {
        super(getSoStorePath(context, str), 1);
        this.mContext = context;
    }

    protected UnpackingSoSource(Context context, File file) {
        super(file, 1);
        this.mContext = context;
    }

    public static File getSoStorePath(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    public String[] getSoSourceAbis() {
        String[] strArr = this.mAbis;
        return strArr == null ? super.getSoSourceAbis() : strArr;
    }

    public void setSoSourceAbis(String[] strArr) {
        this.mAbis = strArr;
    }

    public static class Dso {
        public final String hash;
        public final String name;

        public Dso(String str, String str2) {
            this.name = str;
            this.hash = str2;
        }
    }

    public static final class DsoManifest {
        public final Dso[] dsos;

        public DsoManifest(Dso[] dsoArr) {
            this.dsos = dsoArr;
        }

        static final DsoManifest read(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    Dso[] dsoArr = new Dso[readInt];
                    for (int i = 0; i < readInt; i++) {
                        dsoArr[i] = new Dso(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new DsoManifest(dsoArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void write(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.dsos.length);
            int i = 0;
            while (true) {
                Dso[] dsoArr = this.dsos;
                if (i < dsoArr.length) {
                    dataOutput.writeUTF(dsoArr[i].name);
                    dataOutput.writeUTF(this.dsos[i].hash);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    protected static final class InputDso implements Closeable {
        public final InputStream content;
        public final Dso dso;

        public InputDso(Dso dso2, InputStream inputStream) {
            this.dso = dso2;
            this.content = inputStream;
        }

        public void close() throws IOException {
            this.content.close();
        }
    }

    protected static abstract class InputDsoIterator implements Closeable {
        public void close() throws IOException {
        }

        public abstract boolean hasNext();

        public abstract InputDso next() throws IOException;

        protected InputDsoIterator() {
        }
    }

    protected static abstract class Unpacker implements Closeable {
        public void close() throws IOException {
        }

        /* access modifiers changed from: protected */
        public abstract DsoManifest getDsoManifest() throws IOException;

        /* access modifiers changed from: protected */
        public abstract InputDsoIterator openDsoIterator() throws IOException;

        protected Unpacker() {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r4 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeState(java.io.File r3, byte r4) throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0022 }
            r0.write(r4)     // Catch:{ all -> 0x0022 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0022 }
            r0.setLength(r3)     // Catch:{ all -> 0x0022 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0022 }
            r3.sync()     // Catch:{ all -> 0x0022 }
            r0.close()
            return
        L_0x0022:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.writeState(java.io.File, byte):void");
    }

    private void deleteUnmentionedFiles(Dso[] dsoArr) throws IOException {
        String[] list = this.soDirectory.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(STATE_FILE_NAME) && !str.equals(LOCK_FILE_NAME) && !str.equals(DEPS_FILE_NAME) && !str.equals(MANIFEST_FILE_NAME)) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < dsoArr.length) {
                        if (dsoArr[i].name.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.soDirectory, str);
                        Log.v(TAG, "deleting unaccounted-for file " + file);
                        SysUtil.dumbDeleteRecursive(file);
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.soDirectory);
    }

    private void extractDso(InputDso inputDso, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        Log.i(TAG, "extracting DSO " + inputDso.dso.name);
        if (this.soDirectory.setWritable(true, true)) {
            File file = new File(this.soDirectory, inputDso.dso.name);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException e) {
                Log.w(TAG, "error overwriting " + file + " trying to delete and start over", e);
                SysUtil.dumbDeleteRecursive(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                int available = inputDso.content.available();
                if (available > 1) {
                    SysUtil.fallocateIfSupported(randomAccessFile.getFD(), (long) available);
                }
                SysUtil.copyBytes(randomAccessFile, inputDso.content, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e2) {
                SysUtil.dumbDeleteRecursive(file);
                throw e2;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            throw new IOException("cannot make directory writable for us: " + this.soDirectory);
        }
    }

    private void regenerate(byte b, DsoManifest dsoManifest, InputDsoIterator inputDsoIterator) throws IOException {
        Log.v(TAG, "regenerating DSO store " + getClass().getName());
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.soDirectory, MANIFEST_FILE_NAME), "rw");
        DsoManifest dsoManifest2 = null;
        if (b == 1) {
            try {
                dsoManifest2 = DsoManifest.read(randomAccessFile);
            } catch (Exception e) {
                Log.i(TAG, "error reading existing DSO manifest", e);
            }
        }
        if (dsoManifest2 == null) {
            dsoManifest2 = new DsoManifest(new Dso[0]);
        }
        deleteUnmentionedFiles(dsoManifest.dsos);
        byte[] bArr = new byte[32768];
        while (inputDsoIterator.hasNext()) {
            InputDso next = inputDsoIterator.next();
            boolean z = true;
            int i = 0;
            while (z) {
                try {
                    if (i >= dsoManifest2.dsos.length) {
                        break;
                    }
                    if (dsoManifest2.dsos[i].name.equals(next.dso.name) && dsoManifest2.dsos[i].hash.equals(next.dso.hash)) {
                        z = false;
                    }
                    i++;
                } catch (Throwable th) {
                    if (next != null) {
                        try {
                            next.close();
                        } catch (Throwable th2) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable th3) {
                                r10.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    throw th;
                }
            }
            if (z) {
                extractDso(next, bArr);
            }
            if (next != null) {
                next.close();
            }
        }
        randomAccessFile.close();
        Log.v(TAG, "Finished regenerating DSO store " + getClass().getName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00de, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00df, code lost:
        if (r2 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e5, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e9, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ec, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ed, code lost:
        if (r0 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f3, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00fa, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ff, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0100, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0103, code lost:
        throw r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean refreshLocked(com.facebook.soloader.FileLocker r12, int r13, byte[] r14) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "fb-UnpackingSoSource"
            java.io.File r6 = new java.io.File
            java.io.File r1 = r11.soDirectory
            java.lang.String r2 = "dso_state"
            r6.<init>(r1, r2)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r1.<init>(r6, r2)
            r8 = 1
            r3 = 0
            byte r4 = r1.readByte()     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            if (r4 == r8) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            r4.<init>()     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            java.lang.String r5 = "dso store "
            r4.append(r5)     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            java.io.File r5 = r11.soDirectory     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            r4.append(r5)     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            java.lang.String r5 = " regeneration interrupted: wiping clean"
            r4.append(r5)     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            java.lang.String r4 = r4.toString()     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
            android.util.Log.v(r0, r4)     // Catch:{ EOFException -> 0x0036, all -> 0x0038 }
        L_0x0036:
            r4 = 0
            goto L_0x0044
        L_0x0038:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x003a }
        L_0x003a:
            r13 = move-exception
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r14 = move-exception
            r12.addSuppressed(r14)
        L_0x0043:
            throw r13
        L_0x0044:
            r1.close()
            java.io.File r5 = new java.io.File
            java.io.File r1 = r11.soDirectory
            java.lang.String r7 = "dso_deps"
            r5.<init>(r1, r7)
            r1 = 0
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile
            r7.<init>(r5, r2)
            long r9 = r7.length()     // Catch:{ all -> 0x00f8 }
            int r2 = (int) r9     // Catch:{ all -> 0x00f8 }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00f8 }
            int r9 = r7.read(r2)     // Catch:{ all -> 0x00f8 }
            int r10 = r2.length     // Catch:{ all -> 0x00f8 }
            if (r9 == r10) goto L_0x006b
            java.lang.String r4 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r0, r4)     // Catch:{ all -> 0x00f8 }
            r4 = 0
        L_0x006b:
            boolean r2 = java.util.Arrays.equals(r2, r14)     // Catch:{ all -> 0x00f8 }
            if (r2 != 0) goto L_0x0077
            java.lang.String r2 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r0, r2)     // Catch:{ all -> 0x00f8 }
            r4 = 0
        L_0x0077:
            if (r4 == 0) goto L_0x0080
            r2 = r13 & 2
            if (r2 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r0 = r1
            goto L_0x00a3
        L_0x0080:
            java.lang.String r1 = "so store dirty: regenerating"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x00f8 }
            writeState(r6, r3)     // Catch:{ all -> 0x00f8 }
            com.facebook.soloader.UnpackingSoSource$Unpacker r0 = r11.makeUnpacker()     // Catch:{ all -> 0x00f8 }
            com.facebook.soloader.UnpackingSoSource$DsoManifest r1 = r0.getDsoManifest()     // Catch:{ all -> 0x00ea }
            com.facebook.soloader.UnpackingSoSource$InputDsoIterator r2 = r0.openDsoIterator()     // Catch:{ all -> 0x00ea }
            r11.regenerate(r4, r1, r2)     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ all -> 0x00ea }
        L_0x009d:
            if (r0 == 0) goto L_0x007e
            r0.close()     // Catch:{ all -> 0x00f8 }
            goto L_0x007e
        L_0x00a3:
            r7.close()
            if (r0 != 0) goto L_0x00a9
            return r3
        L_0x00a9:
            com.facebook.soloader.UnpackingSoSource$1 r9 = new com.facebook.soloader.UnpackingSoSource$1
            r1 = r9
            r2 = r11
            r3 = r5
            r4 = r14
            r5 = r0
            r7 = r12
            r1.<init>(r3, r4, r5, r6, r7)
            r12 = r13 & 1
            if (r12 == 0) goto L_0x00d8
            java.lang.Thread r12 = new java.lang.Thread
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "SoSync:"
            r13.append(r14)
            java.io.File r14 = r11.soDirectory
            java.lang.String r14 = r14.getName()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r9, r13)
            r12.start()
            goto L_0x00db
        L_0x00d8:
            r9.run()
        L_0x00db:
            return r8
        L_0x00dc:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00de }
        L_0x00de:
            r13 = move-exception
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch:{ all -> 0x00ea }
        L_0x00e9:
            throw r13     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r13 = move-exception
            if (r0 == 0) goto L_0x00f7
            r0.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f7
        L_0x00f3:
            r14 = move-exception
            r12.addSuppressed(r14)     // Catch:{ all -> 0x00f8 }
        L_0x00f7:
            throw r13     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r13 = move-exception
            r7.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x00ff:
            r14 = move-exception
            r12.addSuppressed(r14)
        L_0x0103:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.refreshLocked(com.facebook.soloader.FileLocker, int, byte[]):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getDepsBlock() throws java.io.IOException {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            com.facebook.soloader.UnpackingSoSource$Unpacker r1 = r5.makeUnpacker()
            com.facebook.soloader.UnpackingSoSource$DsoManifest r2 = r1.getDsoManifest()     // Catch:{ all -> 0x0038 }
            com.facebook.soloader.UnpackingSoSource$Dso[] r2 = r2.dsos     // Catch:{ all -> 0x0038 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0038 }
            int r3 = r2.length     // Catch:{ all -> 0x0038 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0038 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0038 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.name     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            r4 = r2[r3]     // Catch:{ all -> 0x0038 }
            java.lang.String r4 = r4.hash     // Catch:{ all -> 0x0038 }
            r0.writeString(r4)     // Catch:{ all -> 0x0038 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.close()
        L_0x0030:
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r2 = move-exception
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0045:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.UnpackingSoSource.getDepsBlock():byte[]");
    }

    /* access modifiers changed from: protected */
    public void prepare(int i) throws IOException {
        SysUtil.mkdirOrThrow(this.soDirectory);
        FileLocker lock = FileLocker.lock(new File(this.soDirectory, LOCK_FILE_NAME));
        try {
            Log.v(TAG, "locked dso store " + this.soDirectory);
            if (refreshLocked(lock, i, getDepsBlock())) {
                lock = null;
            } else {
                Log.i(TAG, "dso store is up-to-date: " + this.soDirectory);
            }
            if (lock == null) {
                Log.v(TAG, "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
            }
        } finally {
            if (lock != null) {
                Log.v(TAG, "releasing dso store lock for " + this.soDirectory);
                lock.close();
            } else {
                Log.v(TAG, "not releasing dso store lock for " + this.soDirectory + " (syncer thread started)");
            }
        }
    }

    private Object getLibraryLock(String str) {
        Object obj;
        synchronized (this.mLibsBeingLoaded) {
            obj = this.mLibsBeingLoaded.get(str);
            if (obj == null) {
                obj = new Object();
                this.mLibsBeingLoaded.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    public synchronized void prepare(String str) throws IOException {
        synchronized (getLibraryLock(str)) {
            this.mCorruptedLib = str;
            prepare(2);
        }
    }

    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int loadLibraryFrom;
        synchronized (getLibraryLock(str)) {
            loadLibraryFrom = loadLibraryFrom(str, i, this.soDirectory, threadPolicy);
        }
        return loadLibraryFrom;
    }
}
