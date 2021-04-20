package p046io.realm;

import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.fields.FieldDescriptor;

/* renamed from: io.realm.SchemaConnector */
class SchemaConnector implements FieldDescriptor.SchemaProxy {
    private final RealmSchema schema;

    public SchemaConnector(RealmSchema realmSchema) {
        this.schema = realmSchema;
    }

    public boolean hasCache() {
        return this.schema.haveColumnInfo();
    }

    public ColumnInfo getColumnInfo(String str) {
        return this.schema.getColumnInfo(str);
    }

    public long getNativeTablePtr(String str) {
        return this.schema.getTable(str).getNativePtr();
    }
}
