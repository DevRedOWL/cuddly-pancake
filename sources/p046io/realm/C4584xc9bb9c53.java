package p046io.realm;

import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;

/* renamed from: io.realm.io_realm_sync_permissions_ClassPermissionsRealmProxy$ClassPermissionsColumnInfo */
final class C4584xc9bb9c53 extends ColumnInfo {
    long maxColumnIndexValue;
    long nameIndex;
    long permissionsIndex;

    C4584xc9bb9c53(OsSchemaInfo osSchemaInfo) {
        super(2);
        OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(C4583x3a7fdb6e.INTERNAL_CLASS_NAME);
        this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
        this.permissionsIndex = addColumnDetails("permissions", "permissions", objectSchemaInfo);
        this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
    }

    C4584xc9bb9c53(ColumnInfo columnInfo, boolean z) {
        super(columnInfo, z);
        copy(columnInfo, this);
    }

    /* access modifiers changed from: protected */
    public final ColumnInfo copy(boolean z) {
        return new C4584xc9bb9c53(this, z);
    }

    /* access modifiers changed from: protected */
    public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
        C4584xc9bb9c53 io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo = (C4584xc9bb9c53) columnInfo;
        C4584xc9bb9c53 io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo2 = (C4584xc9bb9c53) columnInfo2;
        io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo2.nameIndex = io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo.nameIndex;
        io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo2.permissionsIndex = io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo.permissionsIndex;
        io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo2.maxColumnIndexValue = io_realm_sync_permissions_classpermissionsrealmproxy_classpermissionscolumninfo.maxColumnIndexValue;
    }
}
