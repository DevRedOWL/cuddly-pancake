package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy */
public class C4784x85418d2d extends UserData implements RealmObjectProxy, C4785xcd7d828c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private UserDataColumnInfo columnInfo;
    private ProxyState<UserData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy$UserDataColumnInfo */
    static final class UserDataColumnInfo extends ColumnInfo {
        long birthdayIndex;
        long commentIndex;
        long emailIndex;
        long fullnameIndex;
        long genderIndex;
        long idIndex;
        long lastActiveIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long patronymicIndex;
        long phoneIndex;
        long providerIdIndex;
        long surnameIndex;

        UserDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(12);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.commentIndex = addColumnDetails("comment", "comment", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.surnameIndex = addColumnDetails("surname", "surname", objectSchemaInfo);
            this.patronymicIndex = addColumnDetails("patronymic", "patronymic", objectSchemaInfo);
            this.fullnameIndex = addColumnDetails(UserProfile.Fields.fullname, UserProfile.Fields.fullname, objectSchemaInfo);
            this.providerIdIndex = addColumnDetails("providerId", "providerId", objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.birthdayIndex = addColumnDetails(UserProfile.Fields.birthday, UserProfile.Fields.birthday, objectSchemaInfo);
            this.genderIndex = addColumnDetails(UserProfile.Fields.gender, UserProfile.Fields.gender, objectSchemaInfo);
            this.lastActiveIndex = addColumnDetails("lastActive", "lastActive", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new UserDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UserDataColumnInfo userDataColumnInfo = (UserDataColumnInfo) columnInfo;
            UserDataColumnInfo userDataColumnInfo2 = (UserDataColumnInfo) columnInfo2;
            userDataColumnInfo2.idIndex = userDataColumnInfo.idIndex;
            userDataColumnInfo2.commentIndex = userDataColumnInfo.commentIndex;
            userDataColumnInfo2.nameIndex = userDataColumnInfo.nameIndex;
            userDataColumnInfo2.surnameIndex = userDataColumnInfo.surnameIndex;
            userDataColumnInfo2.patronymicIndex = userDataColumnInfo.patronymicIndex;
            userDataColumnInfo2.fullnameIndex = userDataColumnInfo.fullnameIndex;
            userDataColumnInfo2.providerIdIndex = userDataColumnInfo.providerIdIndex;
            userDataColumnInfo2.emailIndex = userDataColumnInfo.emailIndex;
            userDataColumnInfo2.phoneIndex = userDataColumnInfo.phoneIndex;
            userDataColumnInfo2.birthdayIndex = userDataColumnInfo.birthdayIndex;
            userDataColumnInfo2.genderIndex = userDataColumnInfo.genderIndex;
            userDataColumnInfo2.lastActiveIndex = userDataColumnInfo.lastActiveIndex;
            userDataColumnInfo2.maxColumnIndexValue = userDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4784x85418d2d() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (UserDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$comment() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.commentIndex);
    }

    public void realmSet$comment(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.commentIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.commentIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.commentIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.commentIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$surname() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.surnameIndex);
    }

    public void realmSet$surname(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.surnameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.surnameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.surnameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.surnameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$patronymic() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.patronymicIndex);
    }

    public void realmSet$patronymic(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.patronymicIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.patronymicIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.patronymicIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.patronymicIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fullname() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fullnameIndex);
    }

    public void realmSet$fullname(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fullnameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fullnameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fullnameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fullnameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$providerId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.providerIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.providerIdIndex));
    }

    public void realmSet$providerId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.providerIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.providerIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.providerIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.providerIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$email() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emailIndex);
    }

    public void realmSet$email(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.emailIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.emailIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.emailIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.emailIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$phone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.phoneIndex);
    }

    public void realmSet$phone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.phoneIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.phoneIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.phoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.phoneIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$birthday() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.birthdayIndex);
    }

    public void realmSet$birthday(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.birthdayIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.birthdayIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.birthdayIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.birthdayIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$gender() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.genderIndex);
    }

    public void realmSet$gender(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.genderIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.genderIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.genderIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.genderIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$lastActive() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastActiveIndex);
    }

    public void realmSet$lastActive(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastActiveIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastActiveIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastActiveIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastActiveIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 12, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("comment", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("surname", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("patronymic", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(UserProfile.Fields.fullname, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("providerId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("email", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("phone", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(UserProfile.Fields.birthday, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(UserProfile.Fields.gender, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("lastActive", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UserDataColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r4 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy$UserDataColumnInfo r3 = (p046io.realm.C4784x85418d2d.UserDataColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            long r5 = r13.getLong(r1)
            long r3 = r14.findFirstLong(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy r14 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r2
        L_0x0065:
            if (r14 != 0) goto L_0x0098
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x0090
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy r14 = (p046io.realm.C4784x85418d2d) r14
            goto L_0x0098
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r14 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            int r1 = r13.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy r14 = (p046io.realm.C4784x85418d2d) r14
            goto L_0x0098
        L_0x0090:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0098:
            r12 = r14
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxyInterface r12 = (p046io.realm.C4785xcd7d828c) r12
            java.lang.String r0 = "comment"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b4
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00ad
            r12.realmSet$comment(r2)
            goto L_0x00b4
        L_0x00ad:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$comment(r0)
        L_0x00b4:
            java.lang.String r0 = "name"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c6
            r12.realmSet$name(r2)
            goto L_0x00cd
        L_0x00c6:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$name(r0)
        L_0x00cd:
            java.lang.String r0 = "surname"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e6
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00df
            r12.realmSet$surname(r2)
            goto L_0x00e6
        L_0x00df:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$surname(r0)
        L_0x00e6:
            java.lang.String r0 = "patronymic"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00ff
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f8
            r12.realmSet$patronymic(r2)
            goto L_0x00ff
        L_0x00f8:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$patronymic(r0)
        L_0x00ff:
            java.lang.String r0 = "fullname"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0118
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0111
            r12.realmSet$fullname(r2)
            goto L_0x0118
        L_0x0111:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$fullname(r0)
        L_0x0118:
            java.lang.String r0 = "providerId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0135
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x012a
            r12.realmSet$providerId(r2)
            goto L_0x0135
        L_0x012a:
            int r0 = r13.getInt(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12.realmSet$providerId(r0)
        L_0x0135:
            java.lang.String r0 = "email"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x014e
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0147
            r12.realmSet$email(r2)
            goto L_0x014e
        L_0x0147:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$email(r0)
        L_0x014e:
            java.lang.String r0 = "phone"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0167
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0160
            r12.realmSet$phone(r2)
            goto L_0x0167
        L_0x0160:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$phone(r0)
        L_0x0167:
            java.lang.String r0 = "birthday"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0180
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0179
            r12.realmSet$birthday(r2)
            goto L_0x0180
        L_0x0179:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$birthday(r0)
        L_0x0180:
            java.lang.String r0 = "gender"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0199
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0192
            r12.realmSet$gender(r2)
            goto L_0x0199
        L_0x0192:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$gender(r0)
        L_0x0199:
            java.lang.String r0 = "lastActive"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x01b2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x01ab
            r12.realmSet$lastActive(r2)
            goto L_0x01b2
        L_0x01ab:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$lastActive(r13)
        L_0x01b2:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4784x85418d2d.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData");
    }

    public static UserData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        UserData userData = new UserData();
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("comment")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$comment(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$comment((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("surname")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$surname(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$surname((String) null);
                }
            } else if (nextName.equals("patronymic")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$patronymic(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$patronymic((String) null);
                }
            } else if (nextName.equals(UserProfile.Fields.fullname)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$fullname(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$fullname((String) null);
                }
            } else if (nextName.equals("providerId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$providerId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$providerId((Integer) null);
                }
            } else if (nextName.equals("email")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$email(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$email((String) null);
                }
            } else if (nextName.equals("phone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$phone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$phone((String) null);
                }
            } else if (nextName.equals(UserProfile.Fields.birthday)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$birthday(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$birthday((String) null);
                }
            } else if (nextName.equals(UserProfile.Fields.gender)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$gender(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$gender((String) null);
                }
            } else if (!nextName.equals("lastActive")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$lastActive(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$lastActive((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (UserData) realm.copyToRealm(userData, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4784x85418d2d newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class), false, Collections.emptyList());
        C4784x85418d2d ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxy = new C4784x85418d2d();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4784x85418d2d.UserDataColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxyInterface r5 = (p046io.realm.C4785xcd7d828c) r5
            java.lang.Integer r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4784x85418d2d.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserDataRealmProxy$UserDataColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData");
    }

    public static UserData copy(Realm realm, UserDataColumnInfo userDataColumnInfo, UserData userData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(userData);
        if (realmObjectProxy != null) {
            return (UserData) realmObjectProxy;
        }
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(UserData.class), userDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(userDataColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(userDataColumnInfo.commentIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$comment());
        osObjectBuilder.addString(userDataColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(userDataColumnInfo.surnameIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$surname());
        osObjectBuilder.addString(userDataColumnInfo.patronymicIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$patronymic());
        osObjectBuilder.addString(userDataColumnInfo.fullnameIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$fullname());
        osObjectBuilder.addInteger(userDataColumnInfo.providerIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$providerId());
        osObjectBuilder.addString(userDataColumnInfo.emailIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$email());
        osObjectBuilder.addString(userDataColumnInfo.phoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$phone());
        osObjectBuilder.addString(userDataColumnInfo.birthdayIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$birthday());
        osObjectBuilder.addString(userDataColumnInfo.genderIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$gender());
        osObjectBuilder.addString(userDataColumnInfo.lastActiveIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$lastActive());
        C4784x85418d2d newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(userData, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, UserData userData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        UserData userData2 = userData;
        if (userData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UserData.class);
        long nativePtr = table.getNativePtr();
        UserDataColumnInfo userDataColumnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class);
        long j3 = userDataColumnInfo.idIndex;
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map.put(userData2, Long.valueOf(j2));
        String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.commentIndex, j2, realmGet$comment, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$surname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$surname();
        if (realmGet$surname != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.surnameIndex, j2, realmGet$surname, false);
        }
        String realmGet$patronymic = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$patronymic();
        if (realmGet$patronymic != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.patronymicIndex, j2, realmGet$patronymic, false);
        }
        String realmGet$fullname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$fullname();
        if (realmGet$fullname != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.fullnameIndex, j2, realmGet$fullname, false);
        }
        Integer realmGet$providerId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$providerId();
        if (realmGet$providerId != null) {
            Table.nativeSetLong(nativePtr, userDataColumnInfo.providerIdIndex, j2, realmGet$providerId.longValue(), false);
        }
        String realmGet$email = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.emailIndex, j2, realmGet$email, false);
        }
        String realmGet$phone = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.phoneIndex, j2, realmGet$phone, false);
        }
        String realmGet$birthday = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$birthday();
        if (realmGet$birthday != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.birthdayIndex, j2, realmGet$birthday, false);
        }
        String realmGet$gender = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$gender();
        if (realmGet$gender != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.genderIndex, j2, realmGet$gender, false);
        }
        String realmGet$lastActive = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$lastActive();
        if (realmGet$lastActive != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.lastActiveIndex, j2, realmGet$lastActive, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(UserData.class);
        long nativePtr = table.getNativePtr();
        UserDataColumnInfo userDataColumnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class);
        long j3 = userDataColumnInfo.idIndex;
        while (it.hasNext()) {
            UserData userData = (UserData) it.next();
            if (!map2.containsKey(userData)) {
                if (userData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j4 = j;
                map2.put(userData, Long.valueOf(j4));
                String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, userDataColumnInfo.commentIndex, j4, realmGet$comment, false);
                } else {
                    j2 = j3;
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.nameIndex, j4, realmGet$name, false);
                }
                String realmGet$surname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$surname();
                if (realmGet$surname != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.surnameIndex, j4, realmGet$surname, false);
                }
                String realmGet$patronymic = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$patronymic();
                if (realmGet$patronymic != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.patronymicIndex, j4, realmGet$patronymic, false);
                }
                String realmGet$fullname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$fullname();
                if (realmGet$fullname != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.fullnameIndex, j4, realmGet$fullname, false);
                }
                Integer realmGet$providerId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$providerId();
                if (realmGet$providerId != null) {
                    Table.nativeSetLong(nativePtr, userDataColumnInfo.providerIdIndex, j4, realmGet$providerId.longValue(), false);
                }
                String realmGet$email = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$email();
                if (realmGet$email != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.emailIndex, j4, realmGet$email, false);
                }
                String realmGet$phone = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.phoneIndex, j4, realmGet$phone, false);
                }
                String realmGet$birthday = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$birthday();
                if (realmGet$birthday != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.birthdayIndex, j4, realmGet$birthday, false);
                }
                String realmGet$gender = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$gender();
                if (realmGet$gender != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.genderIndex, j4, realmGet$gender, false);
                }
                String realmGet$lastActive = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$lastActive();
                if (realmGet$lastActive != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.lastActiveIndex, j4, realmGet$lastActive, false);
                }
                j3 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, UserData userData, Map<RealmModel, Long> map) {
        long j;
        UserData userData2 = userData;
        if (userData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UserData.class);
        long nativePtr = table.getNativePtr();
        UserDataColumnInfo userDataColumnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class);
        long j2 = userDataColumnInfo.idIndex;
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData2;
        if (ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id()) : j;
        map.put(userData2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.commentIndex, createRowWithPrimaryKey, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.commentIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.nameIndex, createRowWithPrimaryKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.nameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$surname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$surname();
        if (realmGet$surname != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.surnameIndex, createRowWithPrimaryKey, realmGet$surname, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.surnameIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$patronymic = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$patronymic();
        if (realmGet$patronymic != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.patronymicIndex, createRowWithPrimaryKey, realmGet$patronymic, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.patronymicIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$fullname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$fullname();
        if (realmGet$fullname != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.fullnameIndex, createRowWithPrimaryKey, realmGet$fullname, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.fullnameIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$providerId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$providerId();
        if (realmGet$providerId != null) {
            Table.nativeSetLong(nativePtr, userDataColumnInfo.providerIdIndex, createRowWithPrimaryKey, realmGet$providerId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.providerIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$email = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.emailIndex, createRowWithPrimaryKey, realmGet$email, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.emailIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$phone = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.phoneIndex, createRowWithPrimaryKey, realmGet$phone, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.phoneIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$birthday = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$birthday();
        if (realmGet$birthday != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.birthdayIndex, createRowWithPrimaryKey, realmGet$birthday, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.birthdayIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$gender = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$gender();
        if (realmGet$gender != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.genderIndex, createRowWithPrimaryKey, realmGet$gender, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.genderIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$lastActive = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$lastActive();
        if (realmGet$lastActive != null) {
            Table.nativeSetString(nativePtr, userDataColumnInfo.lastActiveIndex, createRowWithPrimaryKey, realmGet$lastActive, false);
        } else {
            Table.nativeSetNull(nativePtr, userDataColumnInfo.lastActiveIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(UserData.class);
        long nativePtr = table.getNativePtr();
        UserDataColumnInfo userDataColumnInfo = (UserDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class);
        long j3 = userDataColumnInfo.idIndex;
        while (it.hasNext()) {
            UserData userData = (UserData) it.next();
            if (!map2.containsKey(userData)) {
                if (userData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData;
                if (ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(userData, Long.valueOf(j4));
                String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, userDataColumnInfo.commentIndex, j4, realmGet$comment, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.commentIndex, j4, false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.nameIndex, j4, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.nameIndex, j4, false);
                }
                String realmGet$surname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$surname();
                if (realmGet$surname != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.surnameIndex, j4, realmGet$surname, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.surnameIndex, j4, false);
                }
                String realmGet$patronymic = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$patronymic();
                if (realmGet$patronymic != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.patronymicIndex, j4, realmGet$patronymic, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.patronymicIndex, j4, false);
                }
                String realmGet$fullname = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$fullname();
                if (realmGet$fullname != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.fullnameIndex, j4, realmGet$fullname, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.fullnameIndex, j4, false);
                }
                Integer realmGet$providerId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$providerId();
                if (realmGet$providerId != null) {
                    Table.nativeSetLong(nativePtr, userDataColumnInfo.providerIdIndex, j4, realmGet$providerId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.providerIdIndex, j4, false);
                }
                String realmGet$email = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$email();
                if (realmGet$email != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.emailIndex, j4, realmGet$email, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.emailIndex, j4, false);
                }
                String realmGet$phone = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.phoneIndex, j4, realmGet$phone, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.phoneIndex, j4, false);
                }
                String realmGet$birthday = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$birthday();
                if (realmGet$birthday != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.birthdayIndex, j4, realmGet$birthday, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.birthdayIndex, j4, false);
                }
                String realmGet$gender = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$gender();
                if (realmGet$gender != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.genderIndex, j4, realmGet$gender, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.genderIndex, j4, false);
                }
                String realmGet$lastActive = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmGet$lastActive();
                if (realmGet$lastActive != null) {
                    Table.nativeSetString(nativePtr, userDataColumnInfo.lastActiveIndex, j4, realmGet$lastActive, false);
                } else {
                    Table.nativeSetNull(nativePtr, userDataColumnInfo.lastActiveIndex, j4, false);
                }
                j3 = j2;
            }
        }
    }

    public static UserData createDetachedCopy(UserData userData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        UserData userData2;
        if (i > i2 || userData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(userData);
        if (cacheData == null) {
            userData2 = new UserData();
            map.put(userData, new RealmObjectProxy.CacheData(i, userData2));
        } else if (i >= cacheData.minDepth) {
            return (UserData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            userData2 = (UserData) cacheData.object;
        }
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData2;
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2 = userData;
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$comment(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$comment());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$surname(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$surname());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$patronymic(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$patronymic());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$fullname(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$fullname());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$providerId(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$providerId());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$email(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$email());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$phone(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$phone());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$birthday(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$birthday());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$gender(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$gender());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface.realmSet$lastActive(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$lastActive());
        return userData2;
    }

    static UserData update(Realm realm, UserDataColumnInfo userDataColumnInfo, UserData userData, UserData userData2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface = userData;
        C4785xcd7d828c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2 = userData2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(UserData.class), userDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(userDataColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(userDataColumnInfo.commentIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$comment());
        osObjectBuilder.addString(userDataColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(userDataColumnInfo.surnameIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$surname());
        osObjectBuilder.addString(userDataColumnInfo.patronymicIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$patronymic());
        osObjectBuilder.addString(userDataColumnInfo.fullnameIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$fullname());
        osObjectBuilder.addInteger(userDataColumnInfo.providerIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$providerId());
        osObjectBuilder.addString(userDataColumnInfo.emailIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$email());
        osObjectBuilder.addString(userDataColumnInfo.phoneIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$phone());
        osObjectBuilder.addString(userDataColumnInfo.birthdayIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$birthday());
        osObjectBuilder.addString(userDataColumnInfo.genderIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$gender());
        osObjectBuilder.addString(userDataColumnInfo.lastActiveIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxyinterface2.realmGet$lastActive());
        osObjectBuilder.updateExistingObject();
        return userData;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("UserData = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{comment:");
        sb.append(realmGet$comment() != null ? realmGet$comment() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{surname:");
        sb.append(realmGet$surname() != null ? realmGet$surname() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{patronymic:");
        sb.append(realmGet$patronymic() != null ? realmGet$patronymic() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fullname:");
        sb.append(realmGet$fullname() != null ? realmGet$fullname() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{providerId:");
        sb.append(realmGet$providerId() != null ? realmGet$providerId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{email:");
        sb.append(realmGet$email() != null ? realmGet$email() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{phone:");
        sb.append(realmGet$phone() != null ? realmGet$phone() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{birthday:");
        sb.append(realmGet$birthday() != null ? realmGet$birthday() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{gender:");
        sb.append(realmGet$gender() != null ? realmGet$gender() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{lastActive:");
        if (realmGet$lastActive() != null) {
            str = realmGet$lastActive();
        }
        sb.append(str);
        sb.append("}");
        sb.append("]");
        return sb.toString();
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
        C4784x85418d2d ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxy = (C4784x85418d2d) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userdatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
