package p046io.realm;

import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;

/* renamed from: io.realm.io_realm_sync_permissions_RealmPermissionsRealmProxy$RealmPermissionsColumnInfo */
final class C4589x864ed6b3 extends ColumnInfo {
    long idIndex;
    long maxColumnIndexValue;
    long permissionsIndex;

    C4589x864ed6b3(OsSchemaInfo osSchemaInfo) {
        super(2);
        OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(C4588xa165cb7.INTERNAL_CLASS_NAME);
        this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
        this.permissionsIndex = addColumnDetails("permissions", "permissions", objectSchemaInfo);
        this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
    }

    C4589x864ed6b3(ColumnInfo columnInfo, boolean z) {
        super(columnInfo, z);
        copy(columnInfo, this);
    }

    /* access modifiers changed from: protected */
    public final ColumnInfo copy(boolean z) {
        return new C4589x864ed6b3(this, z);
    }

    /* access modifiers changed from: protected */
    public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
        C4589x864ed6b3 io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo = (C4589x864ed6b3) columnInfo;
        C4589x864ed6b3 io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo2 = (C4589x864ed6b3) columnInfo2;
        io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo2.idIndex = io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo.idIndex;
        io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo2.permissionsIndex = io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo.permissionsIndex;
        io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo2.maxColumnIndexValue = io_realm_sync_permissions_realmpermissionsrealmproxy_realmpermissionscolumninfo.maxColumnIndexValue;
    }
}
