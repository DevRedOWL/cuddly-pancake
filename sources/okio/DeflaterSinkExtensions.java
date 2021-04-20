package okio;

import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b¨\u0006\u0005"}, mo51343d2 = {"deflate", "Lokio/DeflaterSink;", "Lokio/Sink;", "deflater", "Ljava/util/zip/Deflater;", "jvm"}, mo51344k = 2, mo51345mv = {1, 1, 11})
/* renamed from: okio.-DeflaterSinkExtensions  reason: invalid class name */
/* compiled from: DeflaterSink.kt */
public final class DeflaterSinkExtensions {
    public static /* bridge */ /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        Intrinsics.checkParameterIsNotNull(sink, "$receiver");
        Intrinsics.checkParameterIsNotNull(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static final DeflaterSink deflate(Sink sink, Deflater deflater) {
        Intrinsics.checkParameterIsNotNull(sink, "$receiver");
        Intrinsics.checkParameterIsNotNull(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
