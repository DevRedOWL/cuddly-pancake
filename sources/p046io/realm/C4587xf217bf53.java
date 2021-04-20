package p046io.realm;

import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;

/* renamed from: io.realm.io_realm_sync_permissions_PermissionUserRealmProxy$PermissionUserColumnInfo */
final class C4587xf217bf53 extends ColumnInfo {
    long idIndex;
    long maxColumnIndexValue;
    long roleIndex;

    C4587xf217bf53(OsSchemaInfo osSchemaInfo) {
        super(2);
        OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(C4586xa102e1bc.INTERNAL_CLASS_NAME);
        this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
        this.roleIndex = addColumnDetails("role", "role", objectSchemaInfo);
        addBacklinkDetails(osSchemaInfo, "roles", io_realm_sync_permissions_RoleRealmProxy$ClassNameHelper.INTERNAL_CLASS_NAME, "members");
        this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
    }

    C4587xf217bf53(ColumnInfo columnInfo, boolean z) {
        super(columnInfo, z);
        copy(columnInfo, this);
    }

    /* access modifiers changed from: protected */
    public final ColumnInfo copy(boolean z) {
        return new C4587xf217bf53(this, z);
    }

    /* access modifiers changed from: protected */
    public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
        C4587xf217bf53 io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo = (C4587xf217bf53) columnInfo;
        C4587xf217bf53 io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo2 = (C4587xf217bf53) columnInfo2;
        io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo2.idIndex = io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo.idIndex;
        io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo2.roleIndex = io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo.roleIndex;
        io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo2.maxColumnIndexValue = io_realm_sync_permissions_permissionuserrealmproxy_permissionusercolumninfo.maxColumnIndexValue;
    }
}
