package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p035ru.unicorn.ujin.data.realm.profile.Apartment;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
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
import p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_UserRealmProxy extends User implements RealmObjectProxy, ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Apartment> apartmentListRealmList;
    private UserColumnInfo columnInfo;
    private RealmList<Apartment> commerceListRealmList;
    private ProxyState<User> proxyState;
    private RealmList<SubAccount> subAccountListRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy$UserColumnInfo */
    static final class UserColumnInfo extends ColumnInfo {
        long aidIndex;
        long apartmentListIndex;
        long avatarIndex;
        long balanceIndex;
        long birthdayIndex;
        long commerceListIndex;
        long demoIndex;
        long demoTokenIndex;
        long emailIndex;
        long fcmTokenIndex;
        long firstTimeSinceLoginIndex;
        long fullNameIndex;
        long genderIndex;
        long hideAccountFullTextIndex;
        long hideAccountIndex;
        long hideAccountTextIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long patronymicIndex;
        long phoneIndex;
        long roleIdIndex;
        long stageIndex;
        long statusIndex;
        long subAccountListIndex;
        long surnameIndex;
        long tokenIndex;
        long userLoggenInIndex;

        UserColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(27);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.fullNameIndex = addColumnDetails("fullName", "fullName", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.surnameIndex = addColumnDetails("surname", "surname", objectSchemaInfo);
            this.patronymicIndex = addColumnDetails("patronymic", "patronymic", objectSchemaInfo);
            this.birthdayIndex = addColumnDetails(UserProfile.Fields.birthday, UserProfile.Fields.birthday, objectSchemaInfo);
            this.emailIndex = addColumnDetails("email", "email", objectSchemaInfo);
            this.phoneIndex = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.avatarIndex = addColumnDetails("avatar", "avatar", objectSchemaInfo);
            this.balanceIndex = addColumnDetails("balance", "balance", objectSchemaInfo);
            this.statusIndex = addColumnDetails(NotificationCompat.CATEGORY_STATUS, NotificationCompat.CATEGORY_STATUS, objectSchemaInfo);
            this.roleIdIndex = addColumnDetails("roleId", "roleId", objectSchemaInfo);
            this.genderIndex = addColumnDetails(UserProfile.Fields.gender, UserProfile.Fields.gender, objectSchemaInfo);
            this.hideAccountIndex = addColumnDetails("hideAccount", "hideAccount", objectSchemaInfo);
            this.hideAccountTextIndex = addColumnDetails("hideAccountText", "hideAccountText", objectSchemaInfo);
            this.hideAccountFullTextIndex = addColumnDetails("hideAccountFullText", "hideAccountFullText", objectSchemaInfo);
            this.stageIndex = addColumnDetails("stage", "stage", objectSchemaInfo);
            this.demoIndex = addColumnDetails("demo", "demo", objectSchemaInfo);
            this.apartmentListIndex = addColumnDetails("apartmentList", "apartmentList", objectSchemaInfo);
            this.commerceListIndex = addColumnDetails("commerceList", "commerceList", objectSchemaInfo);
            this.subAccountListIndex = addColumnDetails("subAccountList", "subAccountList", objectSchemaInfo);
            this.fcmTokenIndex = addColumnDetails("fcmToken", "fcmToken", objectSchemaInfo);
            this.aidIndex = addColumnDetails("aid", "aid", objectSchemaInfo);
            this.firstTimeSinceLoginIndex = addColumnDetails("firstTimeSinceLogin", "firstTimeSinceLogin", objectSchemaInfo);
            this.userLoggenInIndex = addColumnDetails("userLoggenIn", "userLoggenIn", objectSchemaInfo);
            this.demoTokenIndex = addColumnDetails("demoToken", "demoToken", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new UserColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UserColumnInfo userColumnInfo = (UserColumnInfo) columnInfo;
            UserColumnInfo userColumnInfo2 = (UserColumnInfo) columnInfo2;
            userColumnInfo2.idIndex = userColumnInfo.idIndex;
            userColumnInfo2.tokenIndex = userColumnInfo.tokenIndex;
            userColumnInfo2.fullNameIndex = userColumnInfo.fullNameIndex;
            userColumnInfo2.nameIndex = userColumnInfo.nameIndex;
            userColumnInfo2.surnameIndex = userColumnInfo.surnameIndex;
            userColumnInfo2.patronymicIndex = userColumnInfo.patronymicIndex;
            userColumnInfo2.birthdayIndex = userColumnInfo.birthdayIndex;
            userColumnInfo2.emailIndex = userColumnInfo.emailIndex;
            userColumnInfo2.phoneIndex = userColumnInfo.phoneIndex;
            userColumnInfo2.avatarIndex = userColumnInfo.avatarIndex;
            userColumnInfo2.balanceIndex = userColumnInfo.balanceIndex;
            userColumnInfo2.statusIndex = userColumnInfo.statusIndex;
            userColumnInfo2.roleIdIndex = userColumnInfo.roleIdIndex;
            userColumnInfo2.genderIndex = userColumnInfo.genderIndex;
            userColumnInfo2.hideAccountIndex = userColumnInfo.hideAccountIndex;
            userColumnInfo2.hideAccountTextIndex = userColumnInfo.hideAccountTextIndex;
            userColumnInfo2.hideAccountFullTextIndex = userColumnInfo.hideAccountFullTextIndex;
            userColumnInfo2.stageIndex = userColumnInfo.stageIndex;
            userColumnInfo2.demoIndex = userColumnInfo.demoIndex;
            userColumnInfo2.apartmentListIndex = userColumnInfo.apartmentListIndex;
            userColumnInfo2.commerceListIndex = userColumnInfo.commerceListIndex;
            userColumnInfo2.subAccountListIndex = userColumnInfo.subAccountListIndex;
            userColumnInfo2.fcmTokenIndex = userColumnInfo.fcmTokenIndex;
            userColumnInfo2.aidIndex = userColumnInfo.aidIndex;
            userColumnInfo2.firstTimeSinceLoginIndex = userColumnInfo.firstTimeSinceLoginIndex;
            userColumnInfo2.userLoggenInIndex = userColumnInfo.userLoggenInIndex;
            userColumnInfo2.demoTokenIndex = userColumnInfo.demoTokenIndex;
            userColumnInfo2.maxColumnIndexValue = userColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_UserRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (UserColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public String realmGet$token() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.tokenIndex);
    }

    public void realmSet$token(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.tokenIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'token' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.tokenIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'token' to null.");
        }
    }

    public String realmGet$fullName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fullNameIndex);
    }

    public void realmSet$fullName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.fullNameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'fullName' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.fullNameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'fullName' to null.");
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
    }

    public String realmGet$surname() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.surnameIndex);
    }

    public void realmSet$surname(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.surnameIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'surname' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.surnameIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'surname' to null.");
        }
    }

    public String realmGet$patronymic() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.patronymicIndex);
    }

    public void realmSet$patronymic(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.patronymicIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'patronymic' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.patronymicIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'patronymic' to null.");
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
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.phoneIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.phoneIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'phone' to null.");
        }
    }

    public String realmGet$avatar() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.avatarIndex);
    }

    public void realmSet$avatar(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.avatarIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'avatar' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.avatarIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'avatar' to null.");
        }
    }

    public int realmGet$balance() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.balanceIndex);
    }

    public void realmSet$balance(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.balanceIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.balanceIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public int realmGet$status() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.statusIndex);
    }

    public void realmSet$status(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.statusIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.statusIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public int realmGet$roleId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.roleIdIndex);
    }

    public void realmSet$roleId(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.roleIdIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.roleIdIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public int realmGet$gender() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.genderIndex);
    }

    public void realmSet$gender(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.genderIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.genderIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public int realmGet$hideAccount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.hideAccountIndex);
    }

    public void realmSet$hideAccount(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.hideAccountIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.hideAccountIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$hideAccountText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hideAccountTextIndex);
    }

    public void realmSet$hideAccountText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.hideAccountTextIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'hideAccountText' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.hideAccountTextIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'hideAccountText' to null.");
        }
    }

    public String realmGet$hideAccountFullText() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.hideAccountFullTextIndex);
    }

    public void realmSet$hideAccountFullText(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.hideAccountFullTextIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'hideAccountFullText' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.hideAccountFullTextIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'hideAccountFullText' to null.");
        }
    }

    public int realmGet$stage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.stageIndex);
    }

    public void realmSet$stage(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.stageIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.stageIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public int realmGet$demo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.demoIndex);
    }

    public void realmSet$demo(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.demoIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.demoIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public RealmList<Apartment> realmGet$apartmentList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Apartment> realmList = this.apartmentListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.apartmentListRealmList = new RealmList<>(Apartment.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.apartmentListIndex), this.proxyState.getRealm$realm());
        return this.apartmentListRealmList;
    }

    public void realmSet$apartmentList(RealmList<Apartment> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("apartmentList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Apartment> realmList2 = new RealmList<>();
                Iterator<Apartment> it = realmList.iterator();
                while (it.hasNext()) {
                    Apartment next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.apartmentListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Apartment apartment = realmList.get(i);
                    this.proxyState.checkValidObject(apartment);
                    modelList.addRow(((RealmObjectProxy) apartment).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Apartment apartment2 = realmList.get(i);
            this.proxyState.checkValidObject(apartment2);
            modelList.setRow((long) i, ((RealmObjectProxy) apartment2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<Apartment> realmGet$commerceList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Apartment> realmList = this.commerceListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.commerceListRealmList = new RealmList<>(Apartment.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.commerceListIndex), this.proxyState.getRealm$realm());
        return this.commerceListRealmList;
    }

    public void realmSet$commerceList(RealmList<Apartment> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("commerceList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Apartment> realmList2 = new RealmList<>();
                Iterator<Apartment> it = realmList.iterator();
                while (it.hasNext()) {
                    Apartment next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.commerceListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Apartment apartment = realmList.get(i);
                    this.proxyState.checkValidObject(apartment);
                    modelList.addRow(((RealmObjectProxy) apartment).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Apartment apartment2 = realmList.get(i);
            this.proxyState.checkValidObject(apartment2);
            modelList.setRow((long) i, ((RealmObjectProxy) apartment2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<SubAccount> realmGet$subAccountList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<SubAccount> realmList = this.subAccountListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.subAccountListRealmList = new RealmList<>(SubAccount.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.subAccountListIndex), this.proxyState.getRealm$realm());
        return this.subAccountListRealmList;
    }

    public void realmSet$subAccountList(RealmList<SubAccount> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("subAccountList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<SubAccount> realmList2 = new RealmList<>();
                Iterator<SubAccount> it = realmList.iterator();
                while (it.hasNext()) {
                    SubAccount next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.subAccountListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    SubAccount subAccount = realmList.get(i);
                    this.proxyState.checkValidObject(subAccount);
                    modelList.addRow(((RealmObjectProxy) subAccount).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            SubAccount subAccount2 = realmList.get(i);
            this.proxyState.checkValidObject(subAccount2);
            modelList.setRow((long) i, ((RealmObjectProxy) subAccount2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public String realmGet$fcmToken() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fcmTokenIndex);
    }

    public void realmSet$fcmToken(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.fcmTokenIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'fcmToken' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.fcmTokenIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'fcmToken' to null.");
        }
    }

    public String realmGet$aid() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.aidIndex);
    }

    public void realmSet$aid(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.aidIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'aid' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.aidIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'aid' to null.");
        }
    }

    public boolean realmGet$firstTimeSinceLogin() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.firstTimeSinceLoginIndex);
    }

    public void realmSet$firstTimeSinceLogin(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.firstTimeSinceLoginIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.firstTimeSinceLoginIndex, row$realm.getIndex(), z, true);
        }
    }

    public boolean realmGet$userLoggenIn() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.userLoggenInIndex);
    }

    public void realmSet$userLoggenIn(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.userLoggenInIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.userLoggenInIndex, row$realm.getIndex(), z, true);
        }
    }

    public String realmGet$demoToken() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.demoTokenIndex);
    }

    public void realmSet$demoToken(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.demoTokenIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'demoToken' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.demoTokenIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'demoToken' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 27, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("token", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("fullName", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("surname", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("patronymic", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty(UserProfile.Fields.birthday, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("email", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("phone", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("avatar", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("balance", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty(NotificationCompat.CATEGORY_STATUS, RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("roleId", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty(UserProfile.Fields.gender, RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("hideAccount", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("hideAccountText", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("hideAccountFullText", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("stage", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("demo", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedLinkProperty("apartmentList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("commerceList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("subAccountList", RealmFieldType.LIST, ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder3 = builder;
        builder3.addPersistedProperty("fcmToken", RealmFieldType.STRING, false, false, true);
        builder3.addPersistedProperty("aid", RealmFieldType.STRING, false, false, true);
        builder3.addPersistedProperty("firstTimeSinceLogin", RealmFieldType.BOOLEAN, false, false, true);
        builder3.addPersistedProperty("userLoggenIn", RealmFieldType.BOOLEAN, false, false, true);
        builder3.addPersistedProperty("demoToken", RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UserColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.User createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r1 = 3
            r9.<init>(r1)
            java.lang.String r10 = "id"
            r11 = 0
            if (r8 == 0) goto L_0x0068
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r1 = p035ru.unicorn.ujin.data.realm.profile.User.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r3 = p035ru.unicorn.ujin.data.realm.profile.User.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy$UserColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy.UserColumnInfo) r2
            long r2 = r2.idIndex
            r4 = -1
            boolean r6 = r15.isNull(r10)
            if (r6 != 0) goto L_0x0033
            long r4 = r15.getLong(r10)
            long r4 = r1.findFirstLong(r2, r4)
        L_0x0033:
            r2 = -1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0068
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r2 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r2 = r2.get()
            r12 = r2
            io.realm.BaseRealm$RealmObjectContext r12 = (p046io.realm.BaseRealm.RealmObjectContext) r12
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r4)     // Catch:{ all -> 0x0063 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0063 }
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r2 = p035ru.unicorn.ujin.data.realm.profile.User.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0063 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0063 }
            r1 = r12
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0063 }
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy     // Catch:{ all -> 0x0063 }
            r1.<init>()     // Catch:{ all -> 0x0063 }
            r12.clear()
            goto L_0x0069
        L_0x0063:
            r0 = move-exception
            r12.clear()
            throw r0
        L_0x0068:
            r1 = r11
        L_0x0069:
            java.lang.String r2 = "subAccountList"
            java.lang.String r3 = "commerceList"
            java.lang.String r4 = "apartmentList"
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r15.has(r4)
            if (r1 == 0) goto L_0x007a
            r9.add(r4)
        L_0x007a:
            boolean r1 = r15.has(r3)
            if (r1 == 0) goto L_0x0083
            r9.add(r3)
        L_0x0083:
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x008c
            r9.add(r2)
        L_0x008c:
            boolean r1 = r15.has(r10)
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r15.isNull(r10)
            r5 = 1
            if (r1 == 0) goto L_0x00a2
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r1 = p035ru.unicorn.ujin.data.realm.profile.User.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r11, r5, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy) r1
            goto L_0x00bb
        L_0x00a2:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r1 = p035ru.unicorn.ujin.data.realm.profile.User.class
            long r12 = r15.getLong(r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r6, r5, r9)
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy) r1
            goto L_0x00bb
        L_0x00b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            r5 = r1
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface) r5
            java.lang.String r6 = "token"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x00d8
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x00d1
            r5.realmSet$token(r11)
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$token(r6)
        L_0x00d8:
            java.lang.String r6 = "fullName"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x00f1
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x00ea
            r5.realmSet$fullName(r11)
            goto L_0x00f1
        L_0x00ea:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$fullName(r6)
        L_0x00f1:
            java.lang.String r6 = "name"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x010a
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x0103
            r5.realmSet$name(r11)
            goto L_0x010a
        L_0x0103:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$name(r6)
        L_0x010a:
            java.lang.String r6 = "surname"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x0123
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x011c
            r5.realmSet$surname(r11)
            goto L_0x0123
        L_0x011c:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$surname(r6)
        L_0x0123:
            java.lang.String r6 = "patronymic"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x013c
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x0135
            r5.realmSet$patronymic(r11)
            goto L_0x013c
        L_0x0135:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$patronymic(r6)
        L_0x013c:
            java.lang.String r6 = "birthday"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x0155
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x014e
            r5.realmSet$birthday(r11)
            goto L_0x0155
        L_0x014e:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$birthday(r6)
        L_0x0155:
            java.lang.String r6 = "email"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x016e
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x0167
            r5.realmSet$email(r11)
            goto L_0x016e
        L_0x0167:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$email(r6)
        L_0x016e:
            java.lang.String r6 = "phone"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x0187
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x0180
            r5.realmSet$phone(r11)
            goto L_0x0187
        L_0x0180:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$phone(r6)
        L_0x0187:
            java.lang.String r6 = "avatar"
            boolean r9 = r15.has(r6)
            if (r9 == 0) goto L_0x01a0
            boolean r9 = r15.isNull(r6)
            if (r9 == 0) goto L_0x0199
            r5.realmSet$avatar(r11)
            goto L_0x01a0
        L_0x0199:
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$avatar(r6)
        L_0x01a0:
            java.lang.String r6 = "balance"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x01c2
            java.lang.String r6 = "balance"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x01ba
            java.lang.String r6 = "balance"
            int r6 = r15.getInt(r6)
            r5.realmSet$balance(r6)
            goto L_0x01c2
        L_0x01ba:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'balance' to null."
            r0.<init>(r1)
            throw r0
        L_0x01c2:
            java.lang.String r6 = "status"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x01e4
            java.lang.String r6 = "status"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x01dc
            java.lang.String r6 = "status"
            int r6 = r15.getInt(r6)
            r5.realmSet$status(r6)
            goto L_0x01e4
        L_0x01dc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'status' to null."
            r0.<init>(r1)
            throw r0
        L_0x01e4:
            java.lang.String r6 = "roleId"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x0206
            java.lang.String r6 = "roleId"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x01fe
            java.lang.String r6 = "roleId"
            int r6 = r15.getInt(r6)
            r5.realmSet$roleId(r6)
            goto L_0x0206
        L_0x01fe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'roleId' to null."
            r0.<init>(r1)
            throw r0
        L_0x0206:
            java.lang.String r6 = "gender"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = "gender"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x0220
            java.lang.String r6 = "gender"
            int r6 = r15.getInt(r6)
            r5.realmSet$gender(r6)
            goto L_0x0228
        L_0x0220:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'gender' to null."
            r0.<init>(r1)
            throw r0
        L_0x0228:
            java.lang.String r6 = "hideAccount"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x024a
            java.lang.String r6 = "hideAccount"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x0242
            java.lang.String r6 = "hideAccount"
            int r6 = r15.getInt(r6)
            r5.realmSet$hideAccount(r6)
            goto L_0x024a
        L_0x0242:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'hideAccount' to null."
            r0.<init>(r1)
            throw r0
        L_0x024a:
            java.lang.String r6 = "hideAccountText"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x0267
            java.lang.String r6 = "hideAccountText"
            boolean r6 = r15.isNull(r6)
            if (r6 == 0) goto L_0x025e
            r5.realmSet$hideAccountText(r11)
            goto L_0x0267
        L_0x025e:
            java.lang.String r6 = "hideAccountText"
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$hideAccountText(r6)
        L_0x0267:
            java.lang.String r6 = "hideAccountFullText"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x0284
            java.lang.String r6 = "hideAccountFullText"
            boolean r6 = r15.isNull(r6)
            if (r6 == 0) goto L_0x027b
            r5.realmSet$hideAccountFullText(r11)
            goto L_0x0284
        L_0x027b:
            java.lang.String r6 = "hideAccountFullText"
            java.lang.String r6 = r15.getString(r6)
            r5.realmSet$hideAccountFullText(r6)
        L_0x0284:
            java.lang.String r6 = "stage"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x02a6
            java.lang.String r6 = "stage"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x029e
            java.lang.String r6 = "stage"
            int r6 = r15.getInt(r6)
            r5.realmSet$stage(r6)
            goto L_0x02a6
        L_0x029e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'stage' to null."
            r0.<init>(r1)
            throw r0
        L_0x02a6:
            java.lang.String r6 = "demo"
            boolean r6 = r15.has(r6)
            if (r6 == 0) goto L_0x02c8
            java.lang.String r6 = "demo"
            boolean r6 = r15.isNull(r6)
            if (r6 != 0) goto L_0x02c0
            java.lang.String r6 = "demo"
            int r6 = r15.getInt(r6)
            r5.realmSet$demo(r6)
            goto L_0x02c8
        L_0x02c0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'demo' to null."
            r0.<init>(r1)
            throw r0
        L_0x02c8:
            boolean r6 = r15.has(r4)
            if (r6 == 0) goto L_0x02fc
            boolean r6 = r15.isNull(r4)
            if (r6 == 0) goto L_0x02d8
            r5.realmSet$apartmentList(r11)
            goto L_0x02fc
        L_0x02d8:
            io.realm.RealmList r6 = r5.realmGet$apartmentList()
            r6.clear()
            org.json.JSONArray r4 = r15.getJSONArray(r4)
            r6 = 0
        L_0x02e4:
            int r9 = r4.length()
            if (r6 >= r9) goto L_0x02fc
            org.json.JSONObject r9 = r4.getJSONObject(r6)
            ru.unicorn.ujin.data.realm.profile.Apartment r9 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createOrUpdateUsingJsonObject(r14, r9, r8)
            io.realm.RealmList r10 = r5.realmGet$apartmentList()
            r10.add(r9)
            int r6 = r6 + 1
            goto L_0x02e4
        L_0x02fc:
            boolean r4 = r15.has(r3)
            if (r4 == 0) goto L_0x0330
            boolean r4 = r15.isNull(r3)
            if (r4 == 0) goto L_0x030c
            r5.realmSet$commerceList(r11)
            goto L_0x0330
        L_0x030c:
            io.realm.RealmList r4 = r5.realmGet$commerceList()
            r4.clear()
            org.json.JSONArray r3 = r15.getJSONArray(r3)
            r4 = 0
        L_0x0318:
            int r6 = r3.length()
            if (r4 >= r6) goto L_0x0330
            org.json.JSONObject r6 = r3.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.profile.Apartment r6 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createOrUpdateUsingJsonObject(r14, r6, r8)
            io.realm.RealmList r9 = r5.realmGet$commerceList()
            r9.add(r6)
            int r4 = r4 + 1
            goto L_0x0318
        L_0x0330:
            boolean r3 = r15.has(r2)
            if (r3 == 0) goto L_0x0364
            boolean r3 = r15.isNull(r2)
            if (r3 == 0) goto L_0x0340
            r5.realmSet$subAccountList(r11)
            goto L_0x0364
        L_0x0340:
            io.realm.RealmList r3 = r5.realmGet$subAccountList()
            r3.clear()
            org.json.JSONArray r2 = r15.getJSONArray(r2)
            r3 = 0
        L_0x034c:
            int r4 = r2.length()
            if (r3 >= r4) goto L_0x0364
            org.json.JSONObject r4 = r2.getJSONObject(r3)
            ru.unicorn.ujin.data.api.response.SubAccount r4 = p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createOrUpdateUsingJsonObject(r14, r4, r8)
            io.realm.RealmList r6 = r5.realmGet$subAccountList()
            r6.add(r4)
            int r3 = r3 + 1
            goto L_0x034c
        L_0x0364:
            java.lang.String r0 = "fcmToken"
            boolean r0 = r15.has(r0)
            if (r0 == 0) goto L_0x0381
            java.lang.String r0 = "fcmToken"
            boolean r0 = r15.isNull(r0)
            if (r0 == 0) goto L_0x0378
            r5.realmSet$fcmToken(r11)
            goto L_0x0381
        L_0x0378:
            java.lang.String r0 = "fcmToken"
            java.lang.String r0 = r15.getString(r0)
            r5.realmSet$fcmToken(r0)
        L_0x0381:
            java.lang.String r0 = "aid"
            boolean r0 = r15.has(r0)
            if (r0 == 0) goto L_0x039e
            java.lang.String r0 = "aid"
            boolean r0 = r15.isNull(r0)
            if (r0 == 0) goto L_0x0395
            r5.realmSet$aid(r11)
            goto L_0x039e
        L_0x0395:
            java.lang.String r0 = "aid"
            java.lang.String r0 = r15.getString(r0)
            r5.realmSet$aid(r0)
        L_0x039e:
            java.lang.String r0 = "firstTimeSinceLogin"
            boolean r0 = r15.has(r0)
            if (r0 == 0) goto L_0x03c0
            java.lang.String r0 = "firstTimeSinceLogin"
            boolean r0 = r15.isNull(r0)
            if (r0 != 0) goto L_0x03b8
            java.lang.String r0 = "firstTimeSinceLogin"
            boolean r0 = r15.getBoolean(r0)
            r5.realmSet$firstTimeSinceLogin(r0)
            goto L_0x03c0
        L_0x03b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'firstTimeSinceLogin' to null."
            r0.<init>(r1)
            throw r0
        L_0x03c0:
            java.lang.String r0 = "userLoggenIn"
            boolean r0 = r15.has(r0)
            if (r0 == 0) goto L_0x03e5
            java.lang.String r0 = "userLoggenIn"
            boolean r0 = r15.isNull(r0)
            if (r0 != 0) goto L_0x03dd
            java.lang.String r0 = "userLoggenIn"
            boolean r0 = r15.getBoolean(r0)
            r5.realmSet$userLoggenIn(r0)
            goto L_0x03e5
        L_0x03dd:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'userLoggenIn' to null."
            r0.<init>(r1)
            throw r0
        L_0x03e5:
            java.lang.String r0 = "demoToken"
            boolean r0 = r15.has(r0)
            if (r0 == 0) goto L_0x0402
            java.lang.String r0 = "demoToken"
            boolean r0 = r15.isNull(r0)
            if (r0 == 0) goto L_0x03f9
            r5.realmSet$demoToken(r11)
            goto L_0x0402
        L_0x03f9:
            java.lang.String r0 = "demoToken"
            java.lang.String r0 = r15.getString(r0)
            r5.realmSet$demoToken(r0)
        L_0x0402:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.User");
    }

    public static User createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        User user = new User();
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("token")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$token(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$token((String) null);
                }
            } else if (nextName.equals("fullName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$fullName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$fullName((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("surname")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$surname(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$surname((String) null);
                }
            } else if (nextName.equals("patronymic")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$patronymic(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$patronymic((String) null);
                }
            } else if (nextName.equals(UserProfile.Fields.birthday)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$birthday(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$birthday((String) null);
                }
            } else if (nextName.equals("email")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$email(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$email((String) null);
                }
            } else if (nextName.equals("phone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$phone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$phone((String) null);
                }
            } else if (nextName.equals("avatar")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$avatar(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$avatar((String) null);
                }
            } else if (nextName.equals("balance")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$balance(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'balance' to null.");
                }
            } else if (nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$status(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
                }
            } else if (nextName.equals("roleId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$roleId(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'roleId' to null.");
                }
            } else if (nextName.equals(UserProfile.Fields.gender)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$gender(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'gender' to null.");
                }
            } else if (nextName.equals("hideAccount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccount(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hideAccount' to null.");
                }
            } else if (nextName.equals("hideAccountText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccountText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccountText((String) null);
                }
            } else if (nextName.equals("hideAccountFullText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccountFullText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccountFullText((String) null);
                }
            } else if (nextName.equals("stage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$stage(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'stage' to null.");
                }
            } else if (nextName.equals("demo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$demo(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'demo' to null.");
                }
            } else if (nextName.equals("apartmentList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$apartmentList((RealmList<Apartment>) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$apartmentList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$apartmentList().add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("commerceList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$commerceList((RealmList<Apartment>) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$commerceList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$commerceList().add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("subAccountList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$subAccountList((RealmList<SubAccount>) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$subAccountList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$subAccountList().add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("fcmToken")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$fcmToken(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$fcmToken((String) null);
                }
            } else if (nextName.equals("aid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$aid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$aid((String) null);
                }
            } else if (nextName.equals("firstTimeSinceLogin")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$firstTimeSinceLogin(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'firstTimeSinceLogin' to null.");
                }
            } else if (nextName.equals("userLoggenIn")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$userLoggenIn(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userLoggenIn' to null.");
                }
            } else if (!nextName.equals("demoToken")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$demoToken(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$demoToken((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (User) realm.copyToRealm(user, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_UserRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_UserRealmProxy ru_unicorn_ujin_data_realm_profile_userrealmproxy = new ru_unicorn_ujin_data_realm_profile_UserRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_userrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.User copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy.UserColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.User r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.User r1 = (p035ru.unicorn.ujin.data.realm.profile.User) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.User> r2 = p035ru.unicorn.ujin.data.realm.profile.User.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface) r5
            long r5 = r5.realmGet$id()
            long r3 = r2.findFirstLong(r3, r5)
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0069
            r0 = 0
            goto L_0x008d
        L_0x0069:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0087 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0087 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0087 }
            io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0087 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0087 }
            r0.clear()
            goto L_0x008c
        L_0x0087:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x008c:
            r0 = r11
        L_0x008d:
            r3 = r1
            if (r0 == 0) goto L_0x009a
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.profile.User r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.profile.User r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxy$UserColumnInfo, ru.unicorn.ujin.data.realm.profile.User, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.User");
    }

    public static User copy(Realm realm, UserColumnInfo userColumnInfo, User user, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        UserColumnInfo userColumnInfo2 = userColumnInfo;
        User user2 = user;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(user2);
        if (realmObjectProxy != null) {
            return (User) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(User.class), userColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(userColumnInfo2.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(userColumnInfo2.tokenIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$token());
        osObjectBuilder.addString(userColumnInfo2.fullNameIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fullName());
        osObjectBuilder.addString(userColumnInfo2.nameIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(userColumnInfo2.surnameIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$surname());
        osObjectBuilder.addString(userColumnInfo2.patronymicIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$patronymic());
        osObjectBuilder.addString(userColumnInfo2.birthdayIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$birthday());
        osObjectBuilder.addString(userColumnInfo2.emailIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$email());
        osObjectBuilder.addString(userColumnInfo2.phoneIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$phone());
        osObjectBuilder.addString(userColumnInfo2.avatarIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$avatar());
        osObjectBuilder.addInteger(userColumnInfo2.balanceIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$balance()));
        osObjectBuilder.addInteger(userColumnInfo2.statusIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$status()));
        osObjectBuilder.addInteger(userColumnInfo2.roleIdIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$roleId()));
        osObjectBuilder.addInteger(userColumnInfo2.genderIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$gender()));
        osObjectBuilder.addInteger(userColumnInfo2.hideAccountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccount()));
        osObjectBuilder.addString(userColumnInfo2.hideAccountTextIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountText());
        osObjectBuilder.addString(userColumnInfo2.hideAccountFullTextIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountFullText());
        osObjectBuilder.addInteger(userColumnInfo2.stageIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$stage()));
        osObjectBuilder.addInteger(userColumnInfo2.demoIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demo()));
        osObjectBuilder.addString(userColumnInfo2.fcmTokenIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fcmToken());
        osObjectBuilder.addString(userColumnInfo2.aidIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$aid());
        osObjectBuilder.addBoolean(userColumnInfo2.firstTimeSinceLoginIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$firstTimeSinceLogin()));
        osObjectBuilder.addBoolean(userColumnInfo2.userLoggenInIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$userLoggenIn()));
        osObjectBuilder.addString(userColumnInfo2.demoTokenIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demoToken());
        ru_unicorn_ujin_data_realm_profile_UserRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(user2, newProxyInstance);
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$apartmentList();
        if (realmGet$apartmentList != null) {
            RealmList<Apartment> realmGet$apartmentList2 = newProxyInstance.realmGet$apartmentList();
            realmGet$apartmentList2.clear();
            for (int i = 0; i < realmGet$apartmentList.size(); i++) {
                Apartment apartment = realmGet$apartmentList.get(i);
                Apartment apartment2 = (Apartment) map2.get(apartment);
                if (apartment2 != null) {
                    realmGet$apartmentList2.add(apartment2);
                } else {
                    realmGet$apartmentList2.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class), apartment, z, map, set));
                }
            }
        }
        RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$commerceList();
        if (realmGet$commerceList != null) {
            RealmList<Apartment> realmGet$commerceList2 = newProxyInstance.realmGet$commerceList();
            realmGet$commerceList2.clear();
            for (int i2 = 0; i2 < realmGet$commerceList.size(); i2++) {
                Apartment apartment3 = realmGet$commerceList.get(i2);
                Apartment apartment4 = (Apartment) map2.get(apartment3);
                if (apartment4 != null) {
                    realmGet$commerceList2.add(apartment4);
                } else {
                    realmGet$commerceList2.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class), apartment3, z, map, set));
                }
            }
        }
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$subAccountList();
        if (realmGet$subAccountList != null) {
            RealmList<SubAccount> realmGet$subAccountList2 = newProxyInstance.realmGet$subAccountList();
            realmGet$subAccountList2.clear();
            for (int i3 = 0; i3 < realmGet$subAccountList.size(); i3++) {
                SubAccount subAccount = realmGet$subAccountList.get(i3);
                SubAccount subAccount2 = (SubAccount) map2.get(subAccount);
                if (subAccount2 != null) {
                    realmGet$subAccountList2.add(subAccount2);
                } else {
                    realmGet$subAccountList2.add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class), subAccount, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, User user, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        User user2 = user;
        Map<RealmModel, Long> map2 = map;
        if (user2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) user2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(User.class);
        long nativePtr = table.getNativePtr();
        UserColumnInfo userColumnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class);
        long j5 = userColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j5, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j5, Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        long j6 = j;
        map2.put(user2, Long.valueOf(j6));
        String realmGet$token = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            j2 = j6;
            Table.nativeSetString(nativePtr, userColumnInfo.tokenIndex, j6, realmGet$token, false);
        } else {
            j2 = j6;
        }
        String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.fullNameIndex, j2, realmGet$fullName, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$surname = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$surname();
        if (realmGet$surname != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.surnameIndex, j2, realmGet$surname, false);
        }
        String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$patronymic();
        if (realmGet$patronymic != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.patronymicIndex, j2, realmGet$patronymic, false);
        }
        String realmGet$birthday = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$birthday();
        if (realmGet$birthday != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.birthdayIndex, j2, realmGet$birthday, false);
        }
        String realmGet$email = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.emailIndex, j2, realmGet$email, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.phoneIndex, j2, realmGet$phone, false);
        }
        String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$avatar();
        if (realmGet$avatar != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.avatarIndex, j2, realmGet$avatar, false);
        }
        long j7 = nativePtr;
        long j8 = j2;
        Table.nativeSetLong(j7, userColumnInfo.balanceIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$balance(), false);
        Table.nativeSetLong(j7, userColumnInfo.statusIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$status(), false);
        Table.nativeSetLong(j7, userColumnInfo.roleIdIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$roleId(), false);
        Table.nativeSetLong(j7, userColumnInfo.genderIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$gender(), false);
        Table.nativeSetLong(j7, userColumnInfo.hideAccountIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccount(), false);
        String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountText();
        if (realmGet$hideAccountText != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.hideAccountTextIndex, j2, realmGet$hideAccountText, false);
        }
        String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountFullText();
        if (realmGet$hideAccountFullText != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.hideAccountFullTextIndex, j2, realmGet$hideAccountFullText, false);
        }
        long j9 = nativePtr;
        long j10 = j2;
        Table.nativeSetLong(j9, userColumnInfo.stageIndex, j10, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$stage(), false);
        Table.nativeSetLong(j9, userColumnInfo.demoIndex, j10, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demo(), false);
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$apartmentList();
        if (realmGet$apartmentList != null) {
            j3 = j2;
            OsList osList = new OsList(table.getUncheckedRow(j3), userColumnInfo.apartmentListIndex);
            Iterator<Apartment> it = realmGet$apartmentList.iterator();
            while (it.hasNext()) {
                Apartment next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        } else {
            j3 = j2;
        }
        RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$commerceList();
        if (realmGet$commerceList != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j3), userColumnInfo.commerceListIndex);
            Iterator<Apartment> it2 = realmGet$commerceList.iterator();
            while (it2.hasNext()) {
                Apartment next2 = it2.next();
                Long l2 = map2.get(next2);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm2, next2, map2));
                }
                osList2.addRow(l2.longValue());
            }
        }
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$subAccountList();
        if (realmGet$subAccountList != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(j3), userColumnInfo.subAccountListIndex);
            Iterator<SubAccount> it3 = realmGet$subAccountList.iterator();
            while (it3.hasNext()) {
                SubAccount next3 = it3.next();
                Long l3 = map2.get(next3);
                if (l3 == null) {
                    l3 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm2, next3, map2));
                }
                osList3.addRow(l3.longValue());
            }
        }
        String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fcmToken();
        if (realmGet$fcmToken != null) {
            j4 = j3;
            Table.nativeSetString(nativePtr, userColumnInfo.fcmTokenIndex, j3, realmGet$fcmToken, false);
        } else {
            j4 = j3;
        }
        String realmGet$aid = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$aid();
        if (realmGet$aid != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.aidIndex, j4, realmGet$aid, false);
        }
        long j11 = nativePtr;
        long j12 = j4;
        Table.nativeSetBoolean(j11, userColumnInfo.firstTimeSinceLoginIndex, j12, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
        Table.nativeSetBoolean(j11, userColumnInfo.userLoggenInIndex, j12, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$userLoggenIn(), false);
        String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demoToken();
        if (realmGet$demoToken != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.demoTokenIndex, j4, realmGet$demoToken, false);
        }
        return j4;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(User.class);
        long nativePtr = table.getNativePtr();
        UserColumnInfo userColumnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class);
        long j6 = userColumnInfo.idIndex;
        while (it.hasNext()) {
            User user = (User) it.next();
            if (!map2.containsKey(user)) {
                if (user instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) user;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(user, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j6, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j7 = j;
                map2.put(user, Long.valueOf(j7));
                String realmGet$token = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, userColumnInfo.tokenIndex, j7, realmGet$token, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                }
                String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fullName();
                if (realmGet$fullName != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.fullNameIndex, j3, realmGet$fullName, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.nameIndex, j3, realmGet$name, false);
                }
                String realmGet$surname = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$surname();
                if (realmGet$surname != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.surnameIndex, j3, realmGet$surname, false);
                }
                String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$patronymic();
                if (realmGet$patronymic != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.patronymicIndex, j3, realmGet$patronymic, false);
                }
                String realmGet$birthday = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$birthday();
                if (realmGet$birthday != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.birthdayIndex, j3, realmGet$birthday, false);
                }
                String realmGet$email = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$email();
                if (realmGet$email != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.emailIndex, j3, realmGet$email, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.phoneIndex, j3, realmGet$phone, false);
                }
                String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$avatar();
                if (realmGet$avatar != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.avatarIndex, j3, realmGet$avatar, false);
                }
                long j8 = j3;
                Table.nativeSetLong(nativePtr, userColumnInfo.balanceIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$balance(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.statusIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$status(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.roleIdIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$roleId(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.genderIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$gender(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.hideAccountIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccount(), false);
                String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountText();
                if (realmGet$hideAccountText != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.hideAccountTextIndex, j3, realmGet$hideAccountText, false);
                }
                String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountFullText();
                if (realmGet$hideAccountFullText != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.hideAccountFullTextIndex, j3, realmGet$hideAccountFullText, false);
                }
                long j9 = j3;
                Table.nativeSetLong(nativePtr, userColumnInfo.stageIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$stage(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.demoIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demo(), false);
                RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$apartmentList();
                if (realmGet$apartmentList != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), userColumnInfo.apartmentListIndex);
                    Iterator<Apartment> it2 = realmGet$apartmentList.iterator();
                    while (it2.hasNext()) {
                        Apartment next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                } else {
                    j4 = j3;
                }
                RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$commerceList();
                if (realmGet$commerceList != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j4), userColumnInfo.commerceListIndex);
                    Iterator<Apartment> it3 = realmGet$commerceList.iterator();
                    while (it3.hasNext()) {
                        Apartment next2 = it3.next();
                        Long l2 = map2.get(next2);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l2.longValue());
                    }
                }
                RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$subAccountList();
                if (realmGet$subAccountList != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(j4), userColumnInfo.subAccountListIndex);
                    Iterator<SubAccount> it4 = realmGet$subAccountList.iterator();
                    while (it4.hasNext()) {
                        SubAccount next3 = it4.next();
                        Long l3 = map2.get(next3);
                        if (l3 == null) {
                            l3 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm2, next3, map2));
                        }
                        osList3.addRow(l3.longValue());
                    }
                }
                String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fcmToken();
                if (realmGet$fcmToken != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, userColumnInfo.fcmTokenIndex, j4, realmGet$fcmToken, false);
                } else {
                    j5 = j4;
                }
                String realmGet$aid = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$aid();
                if (realmGet$aid != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.aidIndex, j5, realmGet$aid, false);
                }
                long j10 = nativePtr;
                long j11 = j5;
                Table.nativeSetBoolean(j10, userColumnInfo.firstTimeSinceLoginIndex, j11, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
                Table.nativeSetBoolean(j10, userColumnInfo.userLoggenInIndex, j11, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$userLoggenIn(), false);
                String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demoToken();
                if (realmGet$demoToken != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.demoTokenIndex, j5, realmGet$demoToken, false);
                }
                j6 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, User user, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        User user2 = user;
        Map<RealmModel, Long> map2 = map;
        if (user2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) user2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(User.class);
        long nativePtr = table.getNativePtr();
        UserColumnInfo userColumnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class);
        long j4 = userColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user2;
        if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j4, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j4, Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()));
        }
        long j5 = j;
        map2.put(user2, Long.valueOf(j5));
        String realmGet$token = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            j2 = j5;
            Table.nativeSetString(nativePtr, userColumnInfo.tokenIndex, j5, realmGet$token, false);
        } else {
            j2 = j5;
            Table.nativeSetNull(nativePtr, userColumnInfo.tokenIndex, j2, false);
        }
        String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.fullNameIndex, j2, realmGet$fullName, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.fullNameIndex, j2, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.nameIndex, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.nameIndex, j2, false);
        }
        String realmGet$surname = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$surname();
        if (realmGet$surname != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.surnameIndex, j2, realmGet$surname, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.surnameIndex, j2, false);
        }
        String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$patronymic();
        if (realmGet$patronymic != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.patronymicIndex, j2, realmGet$patronymic, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.patronymicIndex, j2, false);
        }
        String realmGet$birthday = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$birthday();
        if (realmGet$birthday != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.birthdayIndex, j2, realmGet$birthday, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.birthdayIndex, j2, false);
        }
        String realmGet$email = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.emailIndex, j2, realmGet$email, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.emailIndex, j2, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.phoneIndex, j2, realmGet$phone, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.phoneIndex, j2, false);
        }
        String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$avatar();
        if (realmGet$avatar != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.avatarIndex, j2, realmGet$avatar, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.avatarIndex, j2, false);
        }
        long j6 = nativePtr;
        long j7 = j2;
        Table.nativeSetLong(j6, userColumnInfo.balanceIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$balance(), false);
        Table.nativeSetLong(j6, userColumnInfo.statusIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$status(), false);
        Table.nativeSetLong(j6, userColumnInfo.roleIdIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$roleId(), false);
        Table.nativeSetLong(j6, userColumnInfo.genderIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$gender(), false);
        Table.nativeSetLong(j6, userColumnInfo.hideAccountIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccount(), false);
        String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountText();
        if (realmGet$hideAccountText != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.hideAccountTextIndex, j2, realmGet$hideAccountText, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.hideAccountTextIndex, j2, false);
        }
        String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountFullText();
        if (realmGet$hideAccountFullText != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.hideAccountFullTextIndex, j2, realmGet$hideAccountFullText, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.hideAccountFullTextIndex, j2, false);
        }
        long j8 = nativePtr;
        long j9 = j2;
        Table.nativeSetLong(j8, userColumnInfo.stageIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$stage(), false);
        Table.nativeSetLong(j8, userColumnInfo.demoIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demo(), false);
        long j10 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j10), userColumnInfo.apartmentListIndex);
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$apartmentList();
        if (realmGet$apartmentList == null || ((long) realmGet$apartmentList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$apartmentList != null) {
                Iterator<Apartment> it = realmGet$apartmentList.iterator();
                while (it.hasNext()) {
                    Apartment next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int i = 0;
            for (int size = realmGet$apartmentList.size(); i < size; size = size) {
                Apartment apartment = realmGet$apartmentList.get(i);
                Long l2 = map2.get(apartment);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, apartment, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j10), userColumnInfo.commerceListIndex);
        RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$commerceList();
        if (realmGet$commerceList == null || ((long) realmGet$commerceList.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$commerceList != null) {
                Iterator<Apartment> it2 = realmGet$commerceList.iterator();
                while (it2.hasNext()) {
                    Apartment next2 = it2.next();
                    Long l3 = map2.get(next2);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l3.longValue());
                }
            }
        } else {
            int size2 = realmGet$commerceList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Apartment apartment2 = realmGet$commerceList.get(i2);
                Long l4 = map2.get(apartment2);
                if (l4 == null) {
                    l4 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, apartment2, map2));
                }
                osList2.setRow((long) i2, l4.longValue());
            }
        }
        OsList osList3 = new OsList(table.getUncheckedRow(j10), userColumnInfo.subAccountListIndex);
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$subAccountList();
        if (realmGet$subAccountList == null || ((long) realmGet$subAccountList.size()) != osList3.size()) {
            osList3.removeAll();
            if (realmGet$subAccountList != null) {
                Iterator<SubAccount> it3 = realmGet$subAccountList.iterator();
                while (it3.hasNext()) {
                    SubAccount next3 = it3.next();
                    Long l5 = map2.get(next3);
                    if (l5 == null) {
                        l5 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, next3, map2));
                    }
                    osList3.addRow(l5.longValue());
                }
            }
        } else {
            int size3 = realmGet$subAccountList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                SubAccount subAccount = realmGet$subAccountList.get(i3);
                Long l6 = map2.get(subAccount);
                if (l6 == null) {
                    l6 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, subAccount, map2));
                }
                osList3.setRow((long) i3, l6.longValue());
            }
        }
        String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fcmToken();
        if (realmGet$fcmToken != null) {
            j3 = j10;
            Table.nativeSetString(nativePtr, userColumnInfo.fcmTokenIndex, j10, realmGet$fcmToken, false);
        } else {
            j3 = j10;
            Table.nativeSetNull(nativePtr, userColumnInfo.fcmTokenIndex, j3, false);
        }
        String realmGet$aid = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$aid();
        if (realmGet$aid != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.aidIndex, j3, realmGet$aid, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.aidIndex, j3, false);
        }
        long j11 = nativePtr;
        long j12 = j3;
        Table.nativeSetBoolean(j11, userColumnInfo.firstTimeSinceLoginIndex, j12, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
        Table.nativeSetBoolean(j11, userColumnInfo.userLoggenInIndex, j12, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$userLoggenIn(), false);
        String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demoToken();
        if (realmGet$demoToken != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.demoTokenIndex, j3, realmGet$demoToken, false);
        } else {
            Table.nativeSetNull(nativePtr, userColumnInfo.demoTokenIndex, j3, false);
        }
        return j3;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(User.class);
        long nativePtr = table.getNativePtr();
        UserColumnInfo userColumnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) User.class);
        long j6 = userColumnInfo.idIndex;
        while (it.hasNext()) {
            User user = (User) it.next();
            if (!map2.containsKey(user)) {
                if (user instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) user;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(user, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user;
                if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j6, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$id()));
                }
                long j7 = j;
                map2.put(user, Long.valueOf(j7));
                String realmGet$token = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, userColumnInfo.tokenIndex, j7, realmGet$token, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, userColumnInfo.tokenIndex, j7, false);
                }
                String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fullName();
                if (realmGet$fullName != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.fullNameIndex, j3, realmGet$fullName, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.fullNameIndex, j3, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.nameIndex, j3, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.nameIndex, j3, false);
                }
                String realmGet$surname = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$surname();
                if (realmGet$surname != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.surnameIndex, j3, realmGet$surname, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.surnameIndex, j3, false);
                }
                String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$patronymic();
                if (realmGet$patronymic != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.patronymicIndex, j3, realmGet$patronymic, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.patronymicIndex, j3, false);
                }
                String realmGet$birthday = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$birthday();
                if (realmGet$birthday != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.birthdayIndex, j3, realmGet$birthday, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.birthdayIndex, j3, false);
                }
                String realmGet$email = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$email();
                if (realmGet$email != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.emailIndex, j3, realmGet$email, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.emailIndex, j3, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.phoneIndex, j3, realmGet$phone, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.phoneIndex, j3, false);
                }
                String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$avatar();
                if (realmGet$avatar != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.avatarIndex, j3, realmGet$avatar, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.avatarIndex, j3, false);
                }
                long j8 = j3;
                Table.nativeSetLong(nativePtr, userColumnInfo.balanceIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$balance(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.statusIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$status(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.roleIdIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$roleId(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.genderIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$gender(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.hideAccountIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccount(), false);
                String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountText();
                if (realmGet$hideAccountText != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.hideAccountTextIndex, j3, realmGet$hideAccountText, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.hideAccountTextIndex, j3, false);
                }
                String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$hideAccountFullText();
                if (realmGet$hideAccountFullText != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.hideAccountFullTextIndex, j3, realmGet$hideAccountFullText, false);
                } else {
                    Table.nativeSetNull(nativePtr, userColumnInfo.hideAccountFullTextIndex, j3, false);
                }
                long j9 = j3;
                Table.nativeSetLong(nativePtr, userColumnInfo.stageIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$stage(), false);
                Table.nativeSetLong(nativePtr, userColumnInfo.demoIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demo(), false);
                long j10 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j10), userColumnInfo.apartmentListIndex);
                RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$apartmentList();
                if (realmGet$apartmentList == null || ((long) realmGet$apartmentList.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$apartmentList != null) {
                        Iterator<Apartment> it2 = realmGet$apartmentList.iterator();
                        while (it2.hasNext()) {
                            Apartment next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int i = 0;
                    for (int size = realmGet$apartmentList.size(); i < size; size = size) {
                        Apartment apartment = realmGet$apartmentList.get(i);
                        Long l2 = map2.get(apartment);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, apartment, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j10), userColumnInfo.commerceListIndex);
                RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$commerceList();
                if (realmGet$commerceList == null || ((long) realmGet$commerceList.size()) != osList2.size()) {
                    j4 = nativePtr;
                    osList2.removeAll();
                    if (realmGet$commerceList != null) {
                        Iterator<Apartment> it3 = realmGet$commerceList.iterator();
                        while (it3.hasNext()) {
                            Apartment next2 = it3.next();
                            Long l3 = map2.get(next2);
                            if (l3 == null) {
                                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$commerceList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Apartment apartment2 = realmGet$commerceList.get(i2);
                        Long l4 = map2.get(apartment2);
                        if (l4 == null) {
                            l4 = Long.valueOf(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.insertOrUpdate(realm2, apartment2, map2));
                        }
                        osList2.setRow((long) i2, l4.longValue());
                        i2++;
                        nativePtr = nativePtr;
                    }
                    j4 = nativePtr;
                }
                OsList osList3 = new OsList(table.getUncheckedRow(j10), userColumnInfo.subAccountListIndex);
                RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$subAccountList();
                if (realmGet$subAccountList == null || ((long) realmGet$subAccountList.size()) != osList3.size()) {
                    osList3.removeAll();
                    if (realmGet$subAccountList != null) {
                        Iterator<SubAccount> it4 = realmGet$subAccountList.iterator();
                        while (it4.hasNext()) {
                            SubAccount next3 = it4.next();
                            Long l5 = map2.get(next3);
                            if (l5 == null) {
                                l5 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, next3, map2));
                            }
                            osList3.addRow(l5.longValue());
                        }
                    }
                } else {
                    int size3 = realmGet$subAccountList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        SubAccount subAccount = realmGet$subAccountList.get(i3);
                        Long l6 = map2.get(subAccount);
                        if (l6 == null) {
                            l6 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, subAccount, map2));
                        }
                        osList3.setRow((long) i3, l6.longValue());
                    }
                }
                String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$fcmToken();
                if (realmGet$fcmToken != null) {
                    j5 = j10;
                    Table.nativeSetString(j4, userColumnInfo.fcmTokenIndex, j10, realmGet$fcmToken, false);
                } else {
                    j5 = j10;
                    Table.nativeSetNull(j4, userColumnInfo.fcmTokenIndex, j5, false);
                }
                String realmGet$aid = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$aid();
                if (realmGet$aid != null) {
                    Table.nativeSetString(j4, userColumnInfo.aidIndex, j5, realmGet$aid, false);
                } else {
                    Table.nativeSetNull(j4, userColumnInfo.aidIndex, j5, false);
                }
                long j11 = j4;
                long j12 = j5;
                Table.nativeSetBoolean(j11, userColumnInfo.firstTimeSinceLoginIndex, j12, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
                Table.nativeSetBoolean(j11, userColumnInfo.userLoggenInIndex, j12, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$userLoggenIn(), false);
                String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmGet$demoToken();
                if (realmGet$demoToken != null) {
                    Table.nativeSetString(j4, userColumnInfo.demoTokenIndex, j5, realmGet$demoToken, false);
                } else {
                    Table.nativeSetNull(j4, userColumnInfo.demoTokenIndex, j5, false);
                }
                j6 = j2;
                nativePtr = j4;
            }
        }
    }

    public static User createDetachedCopy(User user, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        User user2;
        if (i > i2 || user == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(user);
        if (cacheData == null) {
            user2 = new User();
            map.put(user, new RealmObjectProxy.CacheData(i, user2));
        } else if (i >= cacheData.minDepth) {
            return (User) cacheData.object;
        } else {
            cacheData.minDepth = i;
            user2 = (User) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user2;
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2 = user;
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$token(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$token());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$fullName(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$fullName());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$surname(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$surname());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$patronymic(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$patronymic());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$birthday(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$birthday());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$email(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$email());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$phone(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$phone());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$avatar(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$avatar());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$balance(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$balance());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$status(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$status());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$roleId(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$roleId());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$gender(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$gender());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccount(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$hideAccount());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccountText(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$hideAccountText());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$hideAccountFullText(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$hideAccountFullText());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$stage(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$stage());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$demo(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$demo());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$apartmentList((RealmList<Apartment>) null);
        } else {
            RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$apartmentList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$apartmentList(realmList);
            int i3 = i + 1;
            int size = realmGet$apartmentList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createDetachedCopy(realmGet$apartmentList.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$commerceList((RealmList<Apartment>) null);
        } else {
            RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$commerceList();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$commerceList(realmList2);
            int i5 = i + 1;
            int size2 = realmGet$commerceList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                realmList2.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createDetachedCopy(realmGet$commerceList.get(i6), i5, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$subAccountList((RealmList<SubAccount>) null);
        } else {
            RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$subAccountList();
            RealmList realmList3 = new RealmList();
            ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$subAccountList(realmList3);
            int i7 = i + 1;
            int size3 = realmGet$subAccountList.size();
            for (int i8 = 0; i8 < size3; i8++) {
                realmList3.add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createDetachedCopy(realmGet$subAccountList.get(i8), i7, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$fcmToken(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$fcmToken());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$aid(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$aid());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$firstTimeSinceLogin(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$firstTimeSinceLogin());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$userLoggenIn(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$userLoggenIn());
        ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface.realmSet$demoToken(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$demoToken());
        return user2;
    }

    static User update(Realm realm, UserColumnInfo userColumnInfo, User user, User user2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        UserColumnInfo userColumnInfo2 = userColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface = user;
        ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2 = user2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(User.class), userColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(userColumnInfo2.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(userColumnInfo2.tokenIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$token());
        osObjectBuilder.addString(userColumnInfo2.fullNameIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$fullName());
        osObjectBuilder.addString(userColumnInfo2.nameIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(userColumnInfo2.surnameIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$surname());
        osObjectBuilder.addString(userColumnInfo2.patronymicIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$patronymic());
        osObjectBuilder.addString(userColumnInfo2.birthdayIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$birthday());
        osObjectBuilder.addString(userColumnInfo2.emailIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$email());
        osObjectBuilder.addString(userColumnInfo2.phoneIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$phone());
        osObjectBuilder.addString(userColumnInfo2.avatarIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$avatar());
        osObjectBuilder.addInteger(userColumnInfo2.balanceIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$balance()));
        osObjectBuilder.addInteger(userColumnInfo2.statusIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$status()));
        osObjectBuilder.addInteger(userColumnInfo2.roleIdIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$roleId()));
        osObjectBuilder.addInteger(userColumnInfo2.genderIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$gender()));
        osObjectBuilder.addInteger(userColumnInfo2.hideAccountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$hideAccount()));
        osObjectBuilder.addString(userColumnInfo2.hideAccountTextIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$hideAccountText());
        osObjectBuilder.addString(userColumnInfo2.hideAccountFullTextIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$hideAccountFullText());
        osObjectBuilder.addInteger(userColumnInfo2.stageIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$stage()));
        osObjectBuilder.addInteger(userColumnInfo2.demoIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$demo()));
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$apartmentList();
        if (realmGet$apartmentList != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$apartmentList.size(); i++) {
                Apartment apartment = realmGet$apartmentList.get(i);
                Apartment apartment2 = (Apartment) map2.get(apartment);
                if (apartment2 != null) {
                    realmList.add(apartment2);
                } else {
                    realmList.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class), apartment, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo2.apartmentListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo2.apartmentListIndex, new RealmList());
        }
        RealmList<Apartment> realmGet$commerceList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$commerceList();
        if (realmGet$commerceList != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$commerceList.size(); i2++) {
                Apartment apartment3 = realmGet$commerceList.get(i2);
                Apartment apartment4 = (Apartment) map2.get(apartment3);
                if (apartment4 != null) {
                    realmList2.add(apartment4);
                } else {
                    realmList2.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.ApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Apartment.class), apartment3, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo2.commerceListIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo2.commerceListIndex, new RealmList());
        }
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$subAccountList();
        if (realmGet$subAccountList != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$subAccountList.size(); i3++) {
                SubAccount subAccount = realmGet$subAccountList.get(i3);
                SubAccount subAccount2 = (SubAccount) map2.get(subAccount);
                if (subAccount2 != null) {
                    realmList3.add(subAccount2);
                } else {
                    realmList3.add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class), subAccount, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo2.subAccountListIndex, realmList3);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo2.subAccountListIndex, new RealmList());
        }
        osObjectBuilder.addString(userColumnInfo2.fcmTokenIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$fcmToken());
        osObjectBuilder.addString(userColumnInfo2.aidIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$aid());
        osObjectBuilder.addBoolean(userColumnInfo2.firstTimeSinceLoginIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$firstTimeSinceLogin()));
        osObjectBuilder.addBoolean(userColumnInfo2.userLoggenInIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$userLoggenIn()));
        osObjectBuilder.addString(userColumnInfo2.demoTokenIndex, ru_unicorn_ujin_data_realm_profile_userrealmproxyinterface2.realmGet$demoToken());
        osObjectBuilder.updateExistingObject();
        return user;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("User = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{token:");
        sb.append(realmGet$token());
        sb.append("}");
        sb.append(",");
        sb.append("{fullName:");
        sb.append(realmGet$fullName());
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name());
        sb.append("}");
        sb.append(",");
        sb.append("{surname:");
        sb.append(realmGet$surname());
        sb.append("}");
        sb.append(",");
        sb.append("{patronymic:");
        sb.append(realmGet$patronymic());
        sb.append("}");
        sb.append(",");
        sb.append("{birthday:");
        String str = "null";
        sb.append(realmGet$birthday() != null ? realmGet$birthday() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{email:");
        if (realmGet$email() != null) {
            str = realmGet$email();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{phone:");
        sb.append(realmGet$phone());
        sb.append("}");
        sb.append(",");
        sb.append("{avatar:");
        sb.append(realmGet$avatar());
        sb.append("}");
        sb.append(",");
        sb.append("{balance:");
        sb.append(realmGet$balance());
        sb.append("}");
        sb.append(",");
        sb.append("{status:");
        sb.append(realmGet$status());
        sb.append("}");
        sb.append(",");
        sb.append("{roleId:");
        sb.append(realmGet$roleId());
        sb.append("}");
        sb.append(",");
        sb.append("{gender:");
        sb.append(realmGet$gender());
        sb.append("}");
        sb.append(",");
        sb.append("{hideAccount:");
        sb.append(realmGet$hideAccount());
        sb.append("}");
        sb.append(",");
        sb.append("{hideAccountText:");
        sb.append(realmGet$hideAccountText());
        sb.append("}");
        sb.append(",");
        sb.append("{hideAccountFullText:");
        sb.append(realmGet$hideAccountFullText());
        sb.append("}");
        sb.append(",");
        sb.append("{stage:");
        sb.append(realmGet$stage());
        sb.append("}");
        sb.append(",");
        sb.append("{demo:");
        sb.append(realmGet$demo());
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentList:");
        sb.append("RealmList<Apartment>[");
        sb.append(realmGet$apartmentList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{commerceList:");
        sb.append("RealmList<Apartment>[");
        sb.append(realmGet$commerceList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{subAccountList:");
        sb.append("RealmList<SubAccount>[");
        sb.append(realmGet$subAccountList().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{fcmToken:");
        sb.append(realmGet$fcmToken());
        sb.append("}");
        sb.append(",");
        sb.append("{aid:");
        sb.append(realmGet$aid());
        sb.append("}");
        sb.append(",");
        sb.append("{firstTimeSinceLogin:");
        sb.append(realmGet$firstTimeSinceLogin());
        sb.append("}");
        sb.append(",");
        sb.append("{userLoggenIn:");
        sb.append(realmGet$userLoggenIn());
        sb.append("}");
        sb.append(",");
        sb.append("{demoToken:");
        sb.append(realmGet$demoToken());
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
        ru_unicorn_ujin_data_realm_profile_UserRealmProxy ru_unicorn_ujin_data_realm_profile_userrealmproxy = (ru_unicorn_ujin_data_realm_profile_UserRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_userrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_userrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_userrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
