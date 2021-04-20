package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.CreateMyCompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy */
public class C4738x3e33c9bd extends RentCompany implements RealmObjectProxy, C4739xa49e67fc {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentCompanyColumnInfo columnInfo;
    private RealmList<String> employeePermissionsRealmList;
    private ProxyState<RentCompany> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentCompany";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy$RentCompanyColumnInfo */
    static final class RentCompanyColumnInfo extends ColumnInfo {
        long addressIndex;
        long directorIdIndex;
        long employeePermissionsIndex;
        long idIndex;
        long innIndex;
        long isDirectorIndex;
        long isEmployeeVerifiedIndex;
        long isVerifiedIndex;
        long maxColumnIndexValue;
        long ogrnIndex;
        long okvedIndex;
        long titleIndex;

        RentCompanyColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.ogrnIndex = addColumnDetails("ogrn", "ogrn", objectSchemaInfo);
            this.innIndex = addColumnDetails(CreateMyCompanyFragment.INN, CreateMyCompanyFragment.INN, objectSchemaInfo);
            this.okvedIndex = addColumnDetails("okved", "okved", objectSchemaInfo);
            this.directorIdIndex = addColumnDetails("directorId", "directorId", objectSchemaInfo);
            this.isDirectorIndex = addColumnDetails("isDirector", "isDirector", objectSchemaInfo);
            this.addressIndex = addColumnDetails(Contact.Type.address, Contact.Type.address, objectSchemaInfo);
            this.isVerifiedIndex = addColumnDetails("isVerified", "isVerified", objectSchemaInfo);
            this.isEmployeeVerifiedIndex = addColumnDetails("isEmployeeVerified", "isEmployeeVerified", objectSchemaInfo);
            this.employeePermissionsIndex = addColumnDetails("employeePermissions", "employeePermissions", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentCompanyColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentCompanyColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentCompanyColumnInfo rentCompanyColumnInfo = (RentCompanyColumnInfo) columnInfo;
            RentCompanyColumnInfo rentCompanyColumnInfo2 = (RentCompanyColumnInfo) columnInfo2;
            rentCompanyColumnInfo2.idIndex = rentCompanyColumnInfo.idIndex;
            rentCompanyColumnInfo2.titleIndex = rentCompanyColumnInfo.titleIndex;
            rentCompanyColumnInfo2.ogrnIndex = rentCompanyColumnInfo.ogrnIndex;
            rentCompanyColumnInfo2.innIndex = rentCompanyColumnInfo.innIndex;
            rentCompanyColumnInfo2.okvedIndex = rentCompanyColumnInfo.okvedIndex;
            rentCompanyColumnInfo2.directorIdIndex = rentCompanyColumnInfo.directorIdIndex;
            rentCompanyColumnInfo2.isDirectorIndex = rentCompanyColumnInfo.isDirectorIndex;
            rentCompanyColumnInfo2.addressIndex = rentCompanyColumnInfo.addressIndex;
            rentCompanyColumnInfo2.isVerifiedIndex = rentCompanyColumnInfo.isVerifiedIndex;
            rentCompanyColumnInfo2.isEmployeeVerifiedIndex = rentCompanyColumnInfo.isEmployeeVerifiedIndex;
            rentCompanyColumnInfo2.employeePermissionsIndex = rentCompanyColumnInfo.employeePermissionsIndex;
            rentCompanyColumnInfo2.maxColumnIndexValue = rentCompanyColumnInfo.maxColumnIndexValue;
        }
    }

    C4738x3e33c9bd() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentCompanyColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$title() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.titleIndex);
    }

    public void realmSet$title(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.titleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.titleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.titleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.titleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$ogrn() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ogrnIndex);
    }

    public void realmSet$ogrn(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ogrnIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ogrnIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ogrnIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ogrnIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$inn() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.innIndex);
    }

    public void realmSet$inn(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.innIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.innIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.innIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.innIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$okved() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.okvedIndex);
    }

    public void realmSet$okved(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.okvedIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.okvedIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.okvedIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.okvedIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public int realmGet$directorId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.directorIdIndex);
    }

    public void realmSet$directorId(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.directorIdIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.directorIdIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public boolean realmGet$isDirector() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isDirectorIndex);
    }

    public void realmSet$isDirector(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isDirectorIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isDirectorIndex, row$realm.getIndex(), z, true);
        }
    }

    public String realmGet$address() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.addressIndex);
    }

    public void realmSet$address(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.addressIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.addressIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.addressIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.addressIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public boolean realmGet$isVerified() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isVerifiedIndex);
    }

    public void realmSet$isVerified(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isVerifiedIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isVerifiedIndex, row$realm.getIndex(), z, true);
        }
    }

    public boolean realmGet$isEmployeeVerified() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isEmployeeVerifiedIndex);
    }

    public void realmSet$isEmployeeVerified(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isEmployeeVerifiedIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isEmployeeVerifiedIndex, row$realm.getIndex(), z, true);
        }
    }

    public RealmList<String> realmGet$employeePermissions() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<String> realmList = this.employeePermissionsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.employeePermissionsRealmList = new RealmList<>(String.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.employeePermissionsIndex, RealmFieldType.STRING_LIST), this.proxyState.getRealm$realm());
        return this.employeePermissionsRealmList;
    }

    public void realmSet$employeePermissions(RealmList<String> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("employeePermissions"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.employeePermissionsIndex, RealmFieldType.STRING_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<String> it = realmList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addString(next);
                    }
                }
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 11, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("ogrn", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CreateMyCompanyFragment.INN, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("okved", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("directorId", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("isDirector", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty(Contact.Type.address, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isVerified", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty("isEmployeeVerified", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedValueListProperty("employeePermissions", RealmFieldType.STRING_LIST, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentCompanyColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentCompanyColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r13v9, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r13v10, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            java.lang.String r2 = "id"
            r3 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r15 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            io.realm.internal.Table r15 = r13.getTable(r15)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r5 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy$RentCompanyColumnInfo r4 = (p046io.realm.C4738x3e33c9bd.RentCompanyColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r2)
            if (r6 == 0) goto L_0x002a
            long r4 = r15.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            java.lang.String r6 = r14.getString(r2)
            long r4 = r15.findFirstString(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r15.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r15 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            io.realm.internal.ColumnInfo r10 = r15.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy r15 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy     // Catch:{ all -> 0x0061 }
            r15.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r15 = r3
        L_0x0067:
            java.lang.String r4 = "employeePermissions"
            if (r15 != 0) goto L_0x00a0
            boolean r15 = r14.has(r4)
            if (r15 == 0) goto L_0x0074
            r0.add(r4)
        L_0x0074:
            boolean r15 = r14.has(r2)
            if (r15 == 0) goto L_0x0098
            boolean r15 = r14.isNull(r2)
            if (r15 == 0) goto L_0x008a
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r15 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            io.realm.RealmModel r13 = r13.createObjectInternal(r15, r3, r1, r0)
            r15 = r13
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy r15 = (p046io.realm.C4738x3e33c9bd) r15
            goto L_0x00a0
        L_0x008a:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r15 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            java.lang.String r2 = r14.getString(r2)
            io.realm.RealmModel r13 = r13.createObjectInternal(r15, r2, r1, r0)
            r15 = r13
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy r15 = (p046io.realm.C4738x3e33c9bd) r15
            goto L_0x00a0
        L_0x0098:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00a0:
            r13 = r15
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxyInterface r13 = (p046io.realm.C4739xa49e67fc) r13
            java.lang.String r0 = "title"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x00bc
            boolean r1 = r14.isNull(r0)
            if (r1 == 0) goto L_0x00b5
            r13.realmSet$title(r3)
            goto L_0x00bc
        L_0x00b5:
            java.lang.String r0 = r14.getString(r0)
            r13.realmSet$title(r0)
        L_0x00bc:
            java.lang.String r0 = "ogrn"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r14.isNull(r0)
            if (r1 == 0) goto L_0x00ce
            r13.realmSet$ogrn(r3)
            goto L_0x00d5
        L_0x00ce:
            java.lang.String r0 = r14.getString(r0)
            r13.realmSet$ogrn(r0)
        L_0x00d5:
            java.lang.String r0 = "inn"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = r14.isNull(r0)
            if (r1 == 0) goto L_0x00e7
            r13.realmSet$inn(r3)
            goto L_0x00ee
        L_0x00e7:
            java.lang.String r0 = r14.getString(r0)
            r13.realmSet$inn(r0)
        L_0x00ee:
            java.lang.String r0 = "okved"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x0107
            boolean r1 = r14.isNull(r0)
            if (r1 == 0) goto L_0x0100
            r13.realmSet$okved(r3)
            goto L_0x0107
        L_0x0100:
            java.lang.String r0 = r14.getString(r0)
            r13.realmSet$okved(r0)
        L_0x0107:
            java.lang.String r0 = "directorId"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x0125
            boolean r1 = r14.isNull(r0)
            if (r1 != 0) goto L_0x011d
            int r0 = r14.getInt(r0)
            r13.realmSet$directorId(r0)
            goto L_0x0125
        L_0x011d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'directorId' to null."
            r13.<init>(r14)
            throw r13
        L_0x0125:
            java.lang.String r0 = "isDirector"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x0143
            boolean r1 = r14.isNull(r0)
            if (r1 != 0) goto L_0x013b
            boolean r0 = r14.getBoolean(r0)
            r13.realmSet$isDirector(r0)
            goto L_0x0143
        L_0x013b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'isDirector' to null."
            r13.<init>(r14)
            throw r13
        L_0x0143:
            java.lang.String r0 = "address"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x015c
            boolean r1 = r14.isNull(r0)
            if (r1 == 0) goto L_0x0155
            r13.realmSet$address(r3)
            goto L_0x015c
        L_0x0155:
            java.lang.String r0 = r14.getString(r0)
            r13.realmSet$address(r0)
        L_0x015c:
            java.lang.String r0 = "isVerified"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x017a
            boolean r1 = r14.isNull(r0)
            if (r1 != 0) goto L_0x0172
            boolean r0 = r14.getBoolean(r0)
            r13.realmSet$isVerified(r0)
            goto L_0x017a
        L_0x0172:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'isVerified' to null."
            r13.<init>(r14)
            throw r13
        L_0x017a:
            java.lang.String r0 = "isEmployeeVerified"
            boolean r1 = r14.has(r0)
            if (r1 == 0) goto L_0x0198
            boolean r1 = r14.isNull(r0)
            if (r1 != 0) goto L_0x0190
            boolean r0 = r14.getBoolean(r0)
            r13.realmSet$isEmployeeVerified(r0)
            goto L_0x0198
        L_0x0190:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Trying to set non-nullable field 'isEmployeeVerified' to null."
            r13.<init>(r14)
            throw r13
        L_0x0198:
            io.realm.RealmList r13 = r13.realmGet$employeePermissions()
            p046io.realm.ProxyUtils.setRealmListWithJsonObject(r13, r14, r4)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4738x3e33c9bd.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany");
    }

    public static RentCompany createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentCompany rentCompany = new RentCompany();
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("ogrn")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$ogrn(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$ogrn((String) null);
                }
            } else if (nextName.equals(CreateMyCompanyFragment.INN)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$inn(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$inn((String) null);
                }
            } else if (nextName.equals("okved")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$okved(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$okved((String) null);
                }
            } else if (nextName.equals("directorId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$directorId(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'directorId' to null.");
                }
            } else if (nextName.equals("isDirector")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$isDirector(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isDirector' to null.");
                }
            } else if (nextName.equals(Contact.Type.address)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$address(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$address((String) null);
                }
            } else if (nextName.equals("isVerified")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$isVerified(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVerified' to null.");
                }
            } else if (nextName.equals("isEmployeeVerified")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$isEmployeeVerified(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isEmployeeVerified' to null.");
                }
            } else if (nextName.equals("employeePermissions")) {
                ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$employeePermissions(ProxyUtils.createRealmListWithJsonStream(String.class, jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (RentCompany) realm.copyToRealm(rentCompany, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4738x3e33c9bd newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentCompany.class), false, Collections.emptyList());
        C4738x3e33c9bd ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxy = new C4738x3e33c9bd();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4738x3e33c9bd.RentCompanyColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxyInterface r5 = (p046io.realm.C4739xa49e67fc) r5
            java.lang.String r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x0068
        L_0x0064:
            long r3 = r2.findFirstString(r3, r5)
        L_0x0068:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0094
        L_0x0070:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x008e }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008e }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x008e }
            r12.put(r10, r2)     // Catch:{ all -> 0x008e }
            r0.clear()
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            r3 = r1
            if (r0 == 0) goto L_0x00a1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4738x3e33c9bd.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mycompany_RentCompanyRealmProxy$RentCompanyColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.mycompany.RentCompany");
    }

    public static RentCompany copy(Realm realm, RentCompanyColumnInfo rentCompanyColumnInfo, RentCompany rentCompany, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentCompany);
        if (realmObjectProxy != null) {
            return (RentCompany) realmObjectProxy;
        }
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentCompany.class), rentCompanyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentCompanyColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(rentCompanyColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(rentCompanyColumnInfo.ogrnIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$ogrn());
        osObjectBuilder.addString(rentCompanyColumnInfo.innIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$inn());
        osObjectBuilder.addString(rentCompanyColumnInfo.okvedIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$okved());
        osObjectBuilder.addInteger(rentCompanyColumnInfo.directorIdIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$directorId()));
        osObjectBuilder.addBoolean(rentCompanyColumnInfo.isDirectorIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isDirector()));
        osObjectBuilder.addString(rentCompanyColumnInfo.addressIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$address());
        osObjectBuilder.addBoolean(rentCompanyColumnInfo.isVerifiedIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isVerified()));
        osObjectBuilder.addBoolean(rentCompanyColumnInfo.isEmployeeVerifiedIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isEmployeeVerified()));
        osObjectBuilder.addStringList(rentCompanyColumnInfo.employeePermissionsIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$employeePermissions());
        C4738x3e33c9bd newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentCompany, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentCompany rentCompany, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        RentCompany rentCompany2 = rentCompany;
        if (rentCompany2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentCompany2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Realm realm2 = realm;
        Table table = realm.getTable(RentCompany.class);
        long nativePtr = table.getNativePtr();
        RentCompanyColumnInfo rentCompanyColumnInfo = (RentCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentCompany.class);
        long j4 = rentCompanyColumnInfo.idIndex;
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j4);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(rentCompany2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j3 = j2;
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.titleIndex, j2, realmGet$title, false);
        } else {
            j3 = j2;
        }
        String realmGet$ogrn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$ogrn();
        if (realmGet$ogrn != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.ogrnIndex, j3, realmGet$ogrn, false);
        }
        String realmGet$inn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$inn();
        if (realmGet$inn != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.innIndex, j3, realmGet$inn, false);
        }
        String realmGet$okved = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$okved();
        if (realmGet$okved != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.okvedIndex, j3, realmGet$okved, false);
        }
        long j5 = nativePtr;
        long j6 = j3;
        Table.nativeSetLong(j5, rentCompanyColumnInfo.directorIdIndex, j6, (long) ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$directorId(), false);
        Table.nativeSetBoolean(j5, rentCompanyColumnInfo.isDirectorIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isDirector(), false);
        String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.addressIndex, j3, realmGet$address, false);
        }
        long j7 = nativePtr;
        long j8 = j3;
        Table.nativeSetBoolean(j7, rentCompanyColumnInfo.isVerifiedIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isVerified(), false);
        Table.nativeSetBoolean(j7, rentCompanyColumnInfo.isEmployeeVerifiedIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isEmployeeVerified(), false);
        RealmList<String> realmGet$employeePermissions = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$employeePermissions();
        if (realmGet$employeePermissions == null) {
            return j3;
        }
        long j9 = j3;
        OsList osList = new OsList(table.getUncheckedRow(j9), rentCompanyColumnInfo.employeePermissionsIndex);
        Iterator<String> it = realmGet$employeePermissions.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                osList.addNull();
            } else {
                osList.addString(next);
            }
        }
        return j9;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentCompany.class);
        long nativePtr = table.getNativePtr();
        RentCompanyColumnInfo rentCompanyColumnInfo = (RentCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentCompany.class);
        long j5 = rentCompanyColumnInfo.idIndex;
        while (it.hasNext()) {
            RentCompany rentCompany = (RentCompany) it.next();
            if (!map2.containsKey(rentCompany)) {
                if (rentCompany instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentCompany;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentCompany, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j5);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j5, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j5, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(rentCompany, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j4 = j2;
                    j3 = j5;
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j4 = j2;
                    j3 = j5;
                }
                String realmGet$ogrn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$ogrn();
                if (realmGet$ogrn != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.ogrnIndex, j4, realmGet$ogrn, false);
                }
                String realmGet$inn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$inn();
                if (realmGet$inn != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.innIndex, j4, realmGet$inn, false);
                }
                String realmGet$okved = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$okved();
                if (realmGet$okved != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.okvedIndex, j4, realmGet$okved, false);
                }
                long j6 = nativePtr;
                long j7 = j4;
                Table.nativeSetLong(j6, rentCompanyColumnInfo.directorIdIndex, j7, (long) ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$directorId(), false);
                Table.nativeSetBoolean(j6, rentCompanyColumnInfo.isDirectorIndex, j7, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isDirector(), false);
                String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.addressIndex, j4, realmGet$address, false);
                }
                long j8 = nativePtr;
                long j9 = j4;
                Table.nativeSetBoolean(j8, rentCompanyColumnInfo.isVerifiedIndex, j9, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isVerified(), false);
                Table.nativeSetBoolean(j8, rentCompanyColumnInfo.isEmployeeVerifiedIndex, j9, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isEmployeeVerified(), false);
                RealmList<String> realmGet$employeePermissions = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$employeePermissions();
                if (realmGet$employeePermissions != null) {
                    OsList osList = new OsList(table.getUncheckedRow(j4), rentCompanyColumnInfo.employeePermissionsIndex);
                    Iterator<String> it2 = realmGet$employeePermissions.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                j5 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentCompany rentCompany, Map<RealmModel, Long> map) {
        long j;
        long j2;
        RentCompany rentCompany2 = rentCompany;
        if (rentCompany2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentCompany2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Realm realm2 = realm;
        Table table = realm.getTable(RentCompany.class);
        long nativePtr = table.getNativePtr();
        RentCompanyColumnInfo rentCompanyColumnInfo = (RentCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentCompany.class);
        long j3 = rentCompanyColumnInfo.idIndex;
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany2;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
        map.put(rentCompany2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            j2 = createRowWithPrimaryKey;
            Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.titleIndex, j2, false);
        }
        String realmGet$ogrn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$ogrn();
        if (realmGet$ogrn != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.ogrnIndex, j2, realmGet$ogrn, false);
        } else {
            Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.ogrnIndex, j2, false);
        }
        String realmGet$inn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$inn();
        if (realmGet$inn != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.innIndex, j2, realmGet$inn, false);
        } else {
            Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.innIndex, j2, false);
        }
        String realmGet$okved = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$okved();
        if (realmGet$okved != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.okvedIndex, j2, realmGet$okved, false);
        } else {
            Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.okvedIndex, j2, false);
        }
        long j4 = nativePtr;
        long j5 = j2;
        Table.nativeSetLong(j4, rentCompanyColumnInfo.directorIdIndex, j5, (long) ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$directorId(), false);
        Table.nativeSetBoolean(j4, rentCompanyColumnInfo.isDirectorIndex, j5, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isDirector(), false);
        String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(nativePtr, rentCompanyColumnInfo.addressIndex, j2, realmGet$address, false);
        } else {
            Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.addressIndex, j2, false);
        }
        long j6 = nativePtr;
        long j7 = j2;
        Table.nativeSetBoolean(j6, rentCompanyColumnInfo.isVerifiedIndex, j7, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isVerified(), false);
        Table.nativeSetBoolean(j6, rentCompanyColumnInfo.isEmployeeVerifiedIndex, j7, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isEmployeeVerified(), false);
        long j8 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j8), rentCompanyColumnInfo.employeePermissionsIndex);
        osList.removeAll();
        RealmList<String> realmGet$employeePermissions = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$employeePermissions();
        if (realmGet$employeePermissions != null) {
            Iterator<String> it = realmGet$employeePermissions.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addString(next);
                }
            }
        }
        return j8;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentCompany.class);
        long nativePtr = table.getNativePtr();
        RentCompanyColumnInfo rentCompanyColumnInfo = (RentCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentCompany.class);
        long j4 = rentCompanyColumnInfo.idIndex;
        while (it.hasNext()) {
            RentCompany rentCompany = (RentCompany) it.next();
            if (!map2.containsKey(rentCompany)) {
                if (rentCompany instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentCompany;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentCompany, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j4, realmGet$id) : j;
                map2.put(rentCompany, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = createRowWithPrimaryKey;
                    j2 = j4;
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j3 = createRowWithPrimaryKey;
                    j2 = j4;
                    Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$ogrn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$ogrn();
                if (realmGet$ogrn != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.ogrnIndex, j3, realmGet$ogrn, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.ogrnIndex, j3, false);
                }
                String realmGet$inn = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$inn();
                if (realmGet$inn != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.innIndex, j3, realmGet$inn, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.innIndex, j3, false);
                }
                String realmGet$okved = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$okved();
                if (realmGet$okved != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.okvedIndex, j3, realmGet$okved, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.okvedIndex, j3, false);
                }
                long j5 = nativePtr;
                long j6 = j3;
                Table.nativeSetLong(j5, rentCompanyColumnInfo.directorIdIndex, j6, (long) ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$directorId(), false);
                Table.nativeSetBoolean(j5, rentCompanyColumnInfo.isDirectorIndex, j6, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isDirector(), false);
                String realmGet$address = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$address();
                if (realmGet$address != null) {
                    Table.nativeSetString(nativePtr, rentCompanyColumnInfo.addressIndex, j3, realmGet$address, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentCompanyColumnInfo.addressIndex, j3, false);
                }
                long j7 = nativePtr;
                long j8 = j3;
                Table.nativeSetBoolean(j7, rentCompanyColumnInfo.isVerifiedIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isVerified(), false);
                Table.nativeSetBoolean(j7, rentCompanyColumnInfo.isEmployeeVerifiedIndex, j8, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$isEmployeeVerified(), false);
                OsList osList = new OsList(table.getUncheckedRow(j3), rentCompanyColumnInfo.employeePermissionsIndex);
                osList.removeAll();
                RealmList<String> realmGet$employeePermissions = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$employeePermissions();
                if (realmGet$employeePermissions != null) {
                    Iterator<String> it2 = realmGet$employeePermissions.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addString(next);
                        }
                    }
                }
                j4 = j2;
            }
        }
    }

    public static RentCompany createDetachedCopy(RentCompany rentCompany, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentCompany rentCompany2;
        if (i > i2 || rentCompany == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentCompany);
        if (cacheData == null) {
            rentCompany2 = new RentCompany();
            map.put(rentCompany, new RealmObjectProxy.CacheData(i, rentCompany2));
        } else if (i >= cacheData.minDepth) {
            return (RentCompany) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentCompany2 = (RentCompany) cacheData.object;
        }
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany2;
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2 = rentCompany;
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$ogrn(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$ogrn());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$inn(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$inn());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$okved(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$okved());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$directorId(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$directorId());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$isDirector(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$isDirector());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$address(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$address());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$isVerified(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$isVerified());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$isEmployeeVerified(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$isEmployeeVerified());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmSet$employeePermissions(new RealmList());
        ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface.realmGet$employeePermissions().addAll(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$employeePermissions());
        return rentCompany2;
    }

    static RentCompany update(Realm realm, RentCompanyColumnInfo rentCompanyColumnInfo, RentCompany rentCompany, RentCompany rentCompany2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface = rentCompany;
        C4739xa49e67fc ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2 = rentCompany2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentCompany.class), rentCompanyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentCompanyColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(rentCompanyColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(rentCompanyColumnInfo.ogrnIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$ogrn());
        osObjectBuilder.addString(rentCompanyColumnInfo.innIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$inn());
        osObjectBuilder.addString(rentCompanyColumnInfo.okvedIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$okved());
        osObjectBuilder.addInteger(rentCompanyColumnInfo.directorIdIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$directorId()));
        osObjectBuilder.addBoolean(rentCompanyColumnInfo.isDirectorIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$isDirector()));
        osObjectBuilder.addString(rentCompanyColumnInfo.addressIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$address());
        osObjectBuilder.addBoolean(rentCompanyColumnInfo.isVerifiedIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$isVerified()));
        osObjectBuilder.addBoolean(rentCompanyColumnInfo.isEmployeeVerifiedIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$isEmployeeVerified()));
        osObjectBuilder.addStringList(rentCompanyColumnInfo.employeePermissionsIndex, ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxyinterface2.realmGet$employeePermissions());
        osObjectBuilder.updateExistingObject();
        return rentCompany;
    }

    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long index = this.proxyState.getRow$realm().getIndex();
        int i = 0;
        int hashCode = (527 + (path != null ? path.hashCode() : 0)) * 31;
        if (name != null) {
            i = name.hashCode();
        }
        return ((hashCode + i) * 31) + ((int) ((index >>> 32) ^ index));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4738x3e33c9bd ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxy = (C4738x3e33c9bd) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_mycompany_rentcompanyrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
