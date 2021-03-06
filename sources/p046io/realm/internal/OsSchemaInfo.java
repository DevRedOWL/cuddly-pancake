package p046io.realm.internal;

import java.util.Collection;

/* renamed from: io.realm.internal.OsSchemaInfo */
public class OsSchemaInfo implements NativeObject {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private long nativePtr;
    private final OsSharedRealm sharedRealm;

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j, String str);

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.nativePtr = nativeCreateFromList(convertObjectSchemaInfoListToNativePointerArray(collection));
        NativeContext.dummyContext.addReference(this);
        this.sharedRealm = null;
    }

    OsSchemaInfo(long j, OsSharedRealm osSharedRealm) {
        this.nativePtr = j;
        this.sharedRealm = osSharedRealm;
    }

    private static long[] convertObjectSchemaInfoListToNativePointerArray(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (OsObjectSchemaInfo nativePtr2 : collection) {
            jArr[i] = nativePtr2.getNativePtr();
            i++;
        }
        return jArr;
    }

    public OsObjectSchemaInfo getObjectSchemaInfo(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.nativePtr, str));
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }
}
