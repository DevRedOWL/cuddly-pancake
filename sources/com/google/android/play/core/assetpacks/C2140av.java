package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2279br;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.google.android.play.core.assetpacks.av */
final class C2140av extends C2279br {

    /* renamed from: a */
    private final File f1567a;

    /* renamed from: b */
    private final File f1568b;

    /* renamed from: c */
    private final NavigableMap<Long, File> f1569c = new TreeMap();

    C2140av(File file, File file2) throws IOException {
        this.f1567a = file;
        this.f1568b = file2;
        List<File> a = C2201db.m1059a(this.f1567a, this.f1568b);
        if (!a.isEmpty()) {
            long j = 0;
            for (File next : a) {
                this.f1569c.put(Long.valueOf(j), next);
                j += next.length();
            }
            return;
        }
        throw new C2155bj(String.format("Virtualized slice archive empty for %s, %s", new Object[]{this.f1567a, this.f1568b}));
    }

    /* renamed from: d */
    private final InputStream m930d(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f1569c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C2155bj(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    /* renamed from: a */
    public final long mo33662a() {
        Map.Entry<Long, File> lastEntry = this.f1569c.lastEntry();
        return lastEntry.getKey().longValue() + lastEntry.getValue().length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo33663b(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new C2155bj(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo33662a()) {
            Long floorKey = this.f1569c.floorKey(Long.valueOf(j));
            Long floorKey2 = this.f1569c.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new C2139au(m930d(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m930d(j, floorKey));
            Collection values = this.f1569c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C2184cl(Collections.enumeration(values)));
            }
            arrayList.add(new C2139au(new FileInputStream((File) this.f1569c.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C2155bj(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo33662a()), Long.valueOf(j3)}));
    }

    public final void close() {
    }
}
