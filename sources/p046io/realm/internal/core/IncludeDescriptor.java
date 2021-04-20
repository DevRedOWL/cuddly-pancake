package p046io.realm.internal.core;

import java.util.EnumSet;
import p046io.realm.RealmFieldType;
import p046io.realm.internal.NativeObject;
import p046io.realm.internal.Table;
import p046io.realm.internal.fields.FieldDescriptor;

/* renamed from: io.realm.internal.core.IncludeDescriptor */
public class IncludeDescriptor implements NativeObject {
    private static final long nativeFinalizerMethodPtr = nativeGetFinalizerMethodPtr();
    private final long nativePtr;

    private static native long nativeCreate(long j, long[] jArr, long[] jArr2);

    private static native long nativeGetFinalizerMethodPtr();

    public static IncludeDescriptor createInstance(FieldDescriptor.SchemaProxy schemaProxy, Table table, String str) {
        FieldDescriptor createFieldDescriptor = FieldDescriptor.createFieldDescriptor(schemaProxy, table, str, EnumSet.of(RealmFieldType.OBJECT, RealmFieldType.LIST, RealmFieldType.LINKING_OBJECTS), EnumSet.of(RealmFieldType.LINKING_OBJECTS));
        return new IncludeDescriptor(table, createFieldDescriptor.getColumnIndices(), createFieldDescriptor.getNativeTablePointers());
    }

    private IncludeDescriptor(Table table, long[] jArr, long[] jArr2) {
        this.nativePtr = nativeCreate(table.getNativePtr(), jArr, jArr2);
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getNativeFinalizerPtr() {
        return nativeFinalizerMethodPtr;
    }
}
