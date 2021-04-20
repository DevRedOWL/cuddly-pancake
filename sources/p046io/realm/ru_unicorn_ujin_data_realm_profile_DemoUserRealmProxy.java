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
import p035ru.unicorn.ujin.data.realm.profile.DemoUser;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy */
public class ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy extends DemoUser implements RealmObjectProxy, ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Apartment> apartmentListRealmList;
    private DemoUserColumnInfo columnInfo;
    private ProxyState<DemoUser> proxyState;
    private RealmList<SubAccount> subAccountListRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DemoUser";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy$DemoUserColumnInfo */
    static final class DemoUserColumnInfo extends ColumnInfo {
        long aidIndex;
        long apartmentListIndex;
        long avatarIndex;
        long balanceIndex;
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

        DemoUserColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(25);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.tokenIndex = addColumnDetails("token", "token", objectSchemaInfo);
            this.fullNameIndex = addColumnDetails("fullName", "fullName", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.surnameIndex = addColumnDetails("surname", "surname", objectSchemaInfo);
            this.patronymicIndex = addColumnDetails("patronymic", "patronymic", objectSchemaInfo);
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
            this.subAccountListIndex = addColumnDetails("subAccountList", "subAccountList", objectSchemaInfo);
            this.fcmTokenIndex = addColumnDetails("fcmToken", "fcmToken", objectSchemaInfo);
            this.aidIndex = addColumnDetails("aid", "aid", objectSchemaInfo);
            this.firstTimeSinceLoginIndex = addColumnDetails("firstTimeSinceLogin", "firstTimeSinceLogin", objectSchemaInfo);
            this.userLoggenInIndex = addColumnDetails("userLoggenIn", "userLoggenIn", objectSchemaInfo);
            this.demoTokenIndex = addColumnDetails("demoToken", "demoToken", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DemoUserColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DemoUserColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DemoUserColumnInfo demoUserColumnInfo = (DemoUserColumnInfo) columnInfo;
            DemoUserColumnInfo demoUserColumnInfo2 = (DemoUserColumnInfo) columnInfo2;
            demoUserColumnInfo2.idIndex = demoUserColumnInfo.idIndex;
            demoUserColumnInfo2.tokenIndex = demoUserColumnInfo.tokenIndex;
            demoUserColumnInfo2.fullNameIndex = demoUserColumnInfo.fullNameIndex;
            demoUserColumnInfo2.nameIndex = demoUserColumnInfo.nameIndex;
            demoUserColumnInfo2.surnameIndex = demoUserColumnInfo.surnameIndex;
            demoUserColumnInfo2.patronymicIndex = demoUserColumnInfo.patronymicIndex;
            demoUserColumnInfo2.emailIndex = demoUserColumnInfo.emailIndex;
            demoUserColumnInfo2.phoneIndex = demoUserColumnInfo.phoneIndex;
            demoUserColumnInfo2.avatarIndex = demoUserColumnInfo.avatarIndex;
            demoUserColumnInfo2.balanceIndex = demoUserColumnInfo.balanceIndex;
            demoUserColumnInfo2.statusIndex = demoUserColumnInfo.statusIndex;
            demoUserColumnInfo2.roleIdIndex = demoUserColumnInfo.roleIdIndex;
            demoUserColumnInfo2.genderIndex = demoUserColumnInfo.genderIndex;
            demoUserColumnInfo2.hideAccountIndex = demoUserColumnInfo.hideAccountIndex;
            demoUserColumnInfo2.hideAccountTextIndex = demoUserColumnInfo.hideAccountTextIndex;
            demoUserColumnInfo2.hideAccountFullTextIndex = demoUserColumnInfo.hideAccountFullTextIndex;
            demoUserColumnInfo2.stageIndex = demoUserColumnInfo.stageIndex;
            demoUserColumnInfo2.demoIndex = demoUserColumnInfo.demoIndex;
            demoUserColumnInfo2.apartmentListIndex = demoUserColumnInfo.apartmentListIndex;
            demoUserColumnInfo2.subAccountListIndex = demoUserColumnInfo.subAccountListIndex;
            demoUserColumnInfo2.fcmTokenIndex = demoUserColumnInfo.fcmTokenIndex;
            demoUserColumnInfo2.aidIndex = demoUserColumnInfo.aidIndex;
            demoUserColumnInfo2.firstTimeSinceLoginIndex = demoUserColumnInfo.firstTimeSinceLoginIndex;
            demoUserColumnInfo2.userLoggenInIndex = demoUserColumnInfo.userLoggenInIndex;
            demoUserColumnInfo2.demoTokenIndex = demoUserColumnInfo.demoTokenIndex;
            demoUserColumnInfo2.maxColumnIndexValue = demoUserColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DemoUserColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$email() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emailIndex);
    }

    public void realmSet$email(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.emailIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.emailIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'email' to null.");
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 25, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, true);
        builder2.addPersistedProperty("token", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("fullName", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("surname", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("patronymic", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty("email", RealmFieldType.STRING, false, false, true);
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

    public static DemoUserColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DemoUserColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.DemoUser createOrUpdateUsingJsonObject(p046io.realm.Realm r11, org.json.JSONObject r12, boolean r13) throws org.json.JSONException {
        /*
            java.util.ArrayList r7 = new java.util.ArrayList
            r1 = 2
            r7.<init>(r1)
            java.lang.String r8 = "id"
            r9 = 0
            if (r13 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r1 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            io.realm.internal.Table r1 = r11.getTable(r1)
            io.realm.RealmSchema r2 = r11.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r3 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy$DemoUserColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.DemoUserColumnInfo) r2
            long r2 = r2.idIndex
            r4 = -1
            boolean r6 = r12.isNull(r8)
            if (r6 != 0) goto L_0x002f
            long r4 = r12.getLong(r8)
            long r4 = r1.findFirstLong(r2, r4)
        L_0x002f:
            r2 = -1
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r2 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r2 = r2.get()
            r10 = r2
            io.realm.BaseRealm$RealmObjectContext r10 = (p046io.realm.BaseRealm.RealmObjectContext) r10
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r4)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r1 = r11.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r2 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x005f }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r1 = r10
            r2 = r11
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            r10.clear()
            goto L_0x0065
        L_0x005f:
            r0 = move-exception
            r10.clear()
            throw r0
        L_0x0064:
            r1 = r9
        L_0x0065:
            java.lang.String r2 = "subAccountList"
            java.lang.String r3 = "apartmentList"
            if (r1 != 0) goto L_0x00ac
            boolean r1 = r12.has(r3)
            if (r1 == 0) goto L_0x0074
            r7.add(r3)
        L_0x0074:
            boolean r1 = r12.has(r2)
            if (r1 == 0) goto L_0x007d
            r7.add(r2)
        L_0x007d:
            boolean r1 = r12.has(r8)
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r12.isNull(r8)
            r4 = 1
            if (r1 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r1 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            io.realm.RealmModel r1 = r11.createObjectInternal(r1, r9, r4, r7)
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy) r1
            goto L_0x00ac
        L_0x0093:
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r1 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            long r5 = r12.getLong(r8)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            io.realm.RealmModel r1 = r11.createObjectInternal(r1, r5, r4, r7)
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy) r1
            goto L_0x00ac
        L_0x00a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00ac:
            r4 = r1
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface r4 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface) r4
            java.lang.String r5 = "token"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x00c9
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x00c2
            r4.realmSet$token(r9)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$token(r5)
        L_0x00c9:
            java.lang.String r5 = "fullName"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x00e2
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x00db
            r4.realmSet$fullName(r9)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$fullName(r5)
        L_0x00e2:
            java.lang.String r5 = "name"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x00fb
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x00f4
            r4.realmSet$name(r9)
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$name(r5)
        L_0x00fb:
            java.lang.String r5 = "surname"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x0114
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x010d
            r4.realmSet$surname(r9)
            goto L_0x0114
        L_0x010d:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$surname(r5)
        L_0x0114:
            java.lang.String r5 = "patronymic"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x012d
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x0126
            r4.realmSet$patronymic(r9)
            goto L_0x012d
        L_0x0126:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$patronymic(r5)
        L_0x012d:
            java.lang.String r5 = "email"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x0146
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x013f
            r4.realmSet$email(r9)
            goto L_0x0146
        L_0x013f:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$email(r5)
        L_0x0146:
            java.lang.String r5 = "phone"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x015f
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x0158
            r4.realmSet$phone(r9)
            goto L_0x015f
        L_0x0158:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$phone(r5)
        L_0x015f:
            java.lang.String r5 = "avatar"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x0178
            boolean r6 = r12.isNull(r5)
            if (r6 == 0) goto L_0x0171
            r4.realmSet$avatar(r9)
            goto L_0x0178
        L_0x0171:
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$avatar(r5)
        L_0x0178:
            java.lang.String r5 = "balance"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x0196
            boolean r6 = r12.isNull(r5)
            if (r6 != 0) goto L_0x018e
            int r5 = r12.getInt(r5)
            r4.realmSet$balance(r5)
            goto L_0x0196
        L_0x018e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'balance' to null."
            r0.<init>(r1)
            throw r0
        L_0x0196:
            java.lang.String r5 = "status"
            boolean r6 = r12.has(r5)
            if (r6 == 0) goto L_0x01b4
            boolean r6 = r12.isNull(r5)
            if (r6 != 0) goto L_0x01ac
            int r5 = r12.getInt(r5)
            r4.realmSet$status(r5)
            goto L_0x01b4
        L_0x01ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'status' to null."
            r0.<init>(r1)
            throw r0
        L_0x01b4:
            java.lang.String r5 = "roleId"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x01d6
            java.lang.String r5 = "roleId"
            boolean r5 = r12.isNull(r5)
            if (r5 != 0) goto L_0x01ce
            java.lang.String r5 = "roleId"
            int r5 = r12.getInt(r5)
            r4.realmSet$roleId(r5)
            goto L_0x01d6
        L_0x01ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'roleId' to null."
            r0.<init>(r1)
            throw r0
        L_0x01d6:
            java.lang.String r5 = "gender"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x01f8
            java.lang.String r5 = "gender"
            boolean r5 = r12.isNull(r5)
            if (r5 != 0) goto L_0x01f0
            java.lang.String r5 = "gender"
            int r5 = r12.getInt(r5)
            r4.realmSet$gender(r5)
            goto L_0x01f8
        L_0x01f0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'gender' to null."
            r0.<init>(r1)
            throw r0
        L_0x01f8:
            java.lang.String r5 = "hideAccount"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x021a
            java.lang.String r5 = "hideAccount"
            boolean r5 = r12.isNull(r5)
            if (r5 != 0) goto L_0x0212
            java.lang.String r5 = "hideAccount"
            int r5 = r12.getInt(r5)
            r4.realmSet$hideAccount(r5)
            goto L_0x021a
        L_0x0212:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'hideAccount' to null."
            r0.<init>(r1)
            throw r0
        L_0x021a:
            java.lang.String r5 = "hideAccountText"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x0237
            java.lang.String r5 = "hideAccountText"
            boolean r5 = r12.isNull(r5)
            if (r5 == 0) goto L_0x022e
            r4.realmSet$hideAccountText(r9)
            goto L_0x0237
        L_0x022e:
            java.lang.String r5 = "hideAccountText"
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$hideAccountText(r5)
        L_0x0237:
            java.lang.String r5 = "hideAccountFullText"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x0254
            java.lang.String r5 = "hideAccountFullText"
            boolean r5 = r12.isNull(r5)
            if (r5 == 0) goto L_0x024b
            r4.realmSet$hideAccountFullText(r9)
            goto L_0x0254
        L_0x024b:
            java.lang.String r5 = "hideAccountFullText"
            java.lang.String r5 = r12.getString(r5)
            r4.realmSet$hideAccountFullText(r5)
        L_0x0254:
            java.lang.String r5 = "stage"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x0276
            java.lang.String r5 = "stage"
            boolean r5 = r12.isNull(r5)
            if (r5 != 0) goto L_0x026e
            java.lang.String r5 = "stage"
            int r5 = r12.getInt(r5)
            r4.realmSet$stage(r5)
            goto L_0x0276
        L_0x026e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'stage' to null."
            r0.<init>(r1)
            throw r0
        L_0x0276:
            java.lang.String r5 = "demo"
            boolean r5 = r12.has(r5)
            if (r5 == 0) goto L_0x0298
            java.lang.String r5 = "demo"
            boolean r5 = r12.isNull(r5)
            if (r5 != 0) goto L_0x0290
            java.lang.String r5 = "demo"
            int r5 = r12.getInt(r5)
            r4.realmSet$demo(r5)
            goto L_0x0298
        L_0x0290:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'demo' to null."
            r0.<init>(r1)
            throw r0
        L_0x0298:
            boolean r5 = r12.has(r3)
            if (r5 == 0) goto L_0x02cc
            boolean r5 = r12.isNull(r3)
            if (r5 == 0) goto L_0x02a8
            r4.realmSet$apartmentList(r9)
            goto L_0x02cc
        L_0x02a8:
            io.realm.RealmList r5 = r4.realmGet$apartmentList()
            r5.clear()
            org.json.JSONArray r3 = r12.getJSONArray(r3)
            r5 = 0
        L_0x02b4:
            int r6 = r3.length()
            if (r5 >= r6) goto L_0x02cc
            org.json.JSONObject r6 = r3.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.profile.Apartment r6 = p046io.realm.ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createOrUpdateUsingJsonObject(r11, r6, r13)
            io.realm.RealmList r7 = r4.realmGet$apartmentList()
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x02b4
        L_0x02cc:
            boolean r3 = r12.has(r2)
            if (r3 == 0) goto L_0x0300
            boolean r3 = r12.isNull(r2)
            if (r3 == 0) goto L_0x02dc
            r4.realmSet$subAccountList(r9)
            goto L_0x0300
        L_0x02dc:
            io.realm.RealmList r3 = r4.realmGet$subAccountList()
            r3.clear()
            org.json.JSONArray r2 = r12.getJSONArray(r2)
            r3 = 0
        L_0x02e8:
            int r5 = r2.length()
            if (r3 >= r5) goto L_0x0300
            org.json.JSONObject r5 = r2.getJSONObject(r3)
            ru.unicorn.ujin.data.api.response.SubAccount r5 = p046io.realm.ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createOrUpdateUsingJsonObject(r11, r5, r13)
            io.realm.RealmList r6 = r4.realmGet$subAccountList()
            r6.add(r5)
            int r3 = r3 + 1
            goto L_0x02e8
        L_0x0300:
            java.lang.String r0 = "fcmToken"
            boolean r0 = r12.has(r0)
            if (r0 == 0) goto L_0x031d
            java.lang.String r0 = "fcmToken"
            boolean r0 = r12.isNull(r0)
            if (r0 == 0) goto L_0x0314
            r4.realmSet$fcmToken(r9)
            goto L_0x031d
        L_0x0314:
            java.lang.String r0 = "fcmToken"
            java.lang.String r0 = r12.getString(r0)
            r4.realmSet$fcmToken(r0)
        L_0x031d:
            java.lang.String r0 = "aid"
            boolean r0 = r12.has(r0)
            if (r0 == 0) goto L_0x033a
            java.lang.String r0 = "aid"
            boolean r0 = r12.isNull(r0)
            if (r0 == 0) goto L_0x0331
            r4.realmSet$aid(r9)
            goto L_0x033a
        L_0x0331:
            java.lang.String r0 = "aid"
            java.lang.String r0 = r12.getString(r0)
            r4.realmSet$aid(r0)
        L_0x033a:
            java.lang.String r0 = "firstTimeSinceLogin"
            boolean r0 = r12.has(r0)
            if (r0 == 0) goto L_0x035c
            java.lang.String r0 = "firstTimeSinceLogin"
            boolean r0 = r12.isNull(r0)
            if (r0 != 0) goto L_0x0354
            java.lang.String r0 = "firstTimeSinceLogin"
            boolean r0 = r12.getBoolean(r0)
            r4.realmSet$firstTimeSinceLogin(r0)
            goto L_0x035c
        L_0x0354:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'firstTimeSinceLogin' to null."
            r0.<init>(r1)
            throw r0
        L_0x035c:
            java.lang.String r0 = "userLoggenIn"
            boolean r0 = r12.has(r0)
            if (r0 == 0) goto L_0x0381
            java.lang.String r0 = "userLoggenIn"
            boolean r0 = r12.isNull(r0)
            if (r0 != 0) goto L_0x0379
            java.lang.String r0 = "userLoggenIn"
            boolean r0 = r12.getBoolean(r0)
            r4.realmSet$userLoggenIn(r0)
            goto L_0x0381
        L_0x0379:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'userLoggenIn' to null."
            r0.<init>(r1)
            throw r0
        L_0x0381:
            java.lang.String r0 = "demoToken"
            boolean r0 = r12.has(r0)
            if (r0 == 0) goto L_0x039e
            java.lang.String r0 = "demoToken"
            boolean r0 = r12.isNull(r0)
            if (r0 == 0) goto L_0x0395
            r4.realmSet$demoToken(r9)
            goto L_0x039e
        L_0x0395:
            java.lang.String r0 = "demoToken"
            java.lang.String r0 = r12.getString(r0)
            r4.realmSet$demoToken(r0)
        L_0x039e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.profile.DemoUser");
    }

    public static DemoUser createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DemoUser demoUser = new DemoUser();
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("token")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$token(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$token((String) null);
                }
            } else if (nextName.equals("fullName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$fullName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$fullName((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("surname")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$surname(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$surname((String) null);
                }
            } else if (nextName.equals("patronymic")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$patronymic(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$patronymic((String) null);
                }
            } else if (nextName.equals("email")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$email(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$email((String) null);
                }
            } else if (nextName.equals("phone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$phone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$phone((String) null);
                }
            } else if (nextName.equals("avatar")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$avatar(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$avatar((String) null);
                }
            } else if (nextName.equals("balance")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$balance(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'balance' to null.");
                }
            } else if (nextName.equals(NotificationCompat.CATEGORY_STATUS)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$status(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'status' to null.");
                }
            } else if (nextName.equals("roleId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$roleId(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'roleId' to null.");
                }
            } else if (nextName.equals(UserProfile.Fields.gender)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$gender(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'gender' to null.");
                }
            } else if (nextName.equals("hideAccount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccount(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hideAccount' to null.");
                }
            } else if (nextName.equals("hideAccountText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccountText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccountText((String) null);
                }
            } else if (nextName.equals("hideAccountFullText")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccountFullText(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccountFullText((String) null);
                }
            } else if (nextName.equals("stage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$stage(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'stage' to null.");
                }
            } else if (nextName.equals("demo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$demo(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'demo' to null.");
                }
            } else if (nextName.equals("apartmentList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$apartmentList((RealmList<Apartment>) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$apartmentList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$apartmentList().add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("subAccountList")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$subAccountList((RealmList<SubAccount>) null);
                } else {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$subAccountList(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$subAccountList().add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("fcmToken")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$fcmToken(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$fcmToken((String) null);
                }
            } else if (nextName.equals("aid")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$aid(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$aid((String) null);
                }
            } else if (nextName.equals("firstTimeSinceLogin")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$firstTimeSinceLogin(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'firstTimeSinceLogin' to null.");
                }
            } else if (nextName.equals("userLoggenIn")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$userLoggenIn(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'userLoggenIn' to null.");
                }
            } else if (!nextName.equals("demoToken")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$demoToken(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$demoToken((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (DemoUser) realm.copyToRealm(demoUser, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DemoUser.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy ru_unicorn_ujin_data_realm_profile_demouserrealmproxy = new ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_profile_demouserrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.profile.DemoUser copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.DemoUserColumnInfo r9, p035ru.unicorn.ujin.data.realm.profile.DemoUser r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.profile.DemoUser r1 = (p035ru.unicorn.ujin.data.realm.profile.DemoUser) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x008c
            java.lang.Class<ru.unicorn.ujin.data.realm.profile.DemoUser> r2 = p035ru.unicorn.ujin.data.realm.profile.DemoUser.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy     // Catch:{ all -> 0x0087 }
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
            ru.unicorn.ujin.data.realm.profile.DemoUser r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x009e
        L_0x009a:
            ru.unicorn.ujin.data.realm.profile.DemoUser r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x009e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy$DemoUserColumnInfo, ru.unicorn.ujin.data.realm.profile.DemoUser, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.profile.DemoUser");
    }

    public static DemoUser copy(Realm realm, DemoUserColumnInfo demoUserColumnInfo, DemoUser demoUser, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        DemoUserColumnInfo demoUserColumnInfo2 = demoUserColumnInfo;
        DemoUser demoUser2 = demoUser;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(demoUser2);
        if (realmObjectProxy != null) {
            return (DemoUser) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DemoUser.class), demoUserColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(demoUserColumnInfo2.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(demoUserColumnInfo2.tokenIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$token());
        osObjectBuilder.addString(demoUserColumnInfo2.fullNameIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fullName());
        osObjectBuilder.addString(demoUserColumnInfo2.nameIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(demoUserColumnInfo2.surnameIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$surname());
        osObjectBuilder.addString(demoUserColumnInfo2.patronymicIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$patronymic());
        osObjectBuilder.addString(demoUserColumnInfo2.emailIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$email());
        osObjectBuilder.addString(demoUserColumnInfo2.phoneIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$phone());
        osObjectBuilder.addString(demoUserColumnInfo2.avatarIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$avatar());
        osObjectBuilder.addInteger(demoUserColumnInfo2.balanceIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$balance()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.statusIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$status()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.roleIdIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$roleId()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.genderIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$gender()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.hideAccountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccount()));
        osObjectBuilder.addString(demoUserColumnInfo2.hideAccountTextIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountText());
        osObjectBuilder.addString(demoUserColumnInfo2.hideAccountFullTextIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountFullText());
        osObjectBuilder.addInteger(demoUserColumnInfo2.stageIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$stage()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.demoIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demo()));
        osObjectBuilder.addString(demoUserColumnInfo2.fcmTokenIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fcmToken());
        osObjectBuilder.addString(demoUserColumnInfo2.aidIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$aid());
        osObjectBuilder.addBoolean(demoUserColumnInfo2.firstTimeSinceLoginIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$firstTimeSinceLogin()));
        osObjectBuilder.addBoolean(demoUserColumnInfo2.userLoggenInIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$userLoggenIn()));
        osObjectBuilder.addString(demoUserColumnInfo2.demoTokenIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demoToken());
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(demoUser2, newProxyInstance);
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$apartmentList();
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
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$subAccountList();
        if (realmGet$subAccountList != null) {
            RealmList<SubAccount> realmGet$subAccountList2 = newProxyInstance.realmGet$subAccountList();
            realmGet$subAccountList2.clear();
            for (int i2 = 0; i2 < realmGet$subAccountList.size(); i2++) {
                SubAccount subAccount = realmGet$subAccountList.get(i2);
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

    public static long insert(Realm realm, DemoUser demoUser, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        long j4;
        Realm realm2 = realm;
        DemoUser demoUser2 = demoUser;
        Map<RealmModel, Long> map2 = map;
        if (demoUser2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) demoUser2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(DemoUser.class);
        long nativePtr = table.getNativePtr();
        DemoUserColumnInfo demoUserColumnInfo = (DemoUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DemoUser.class);
        long j5 = demoUserColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser2;
        Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id());
        if (valueOf != null) {
            j = Table.nativeFindFirstInt(nativePtr, j5, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j5, Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        long j6 = j;
        map2.put(demoUser2, Long.valueOf(j6));
        String realmGet$token = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            j2 = j6;
            Table.nativeSetString(nativePtr, demoUserColumnInfo.tokenIndex, j6, realmGet$token, false);
        } else {
            j2 = j6;
        }
        String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.fullNameIndex, j2, realmGet$fullName, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.nameIndex, j2, realmGet$name, false);
        }
        String realmGet$surname = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$surname();
        if (realmGet$surname != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.surnameIndex, j2, realmGet$surname, false);
        }
        String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$patronymic();
        if (realmGet$patronymic != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.patronymicIndex, j2, realmGet$patronymic, false);
        }
        String realmGet$email = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.emailIndex, j2, realmGet$email, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.phoneIndex, j2, realmGet$phone, false);
        }
        String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$avatar();
        if (realmGet$avatar != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.avatarIndex, j2, realmGet$avatar, false);
        }
        long j7 = nativePtr;
        long j8 = j2;
        Table.nativeSetLong(j7, demoUserColumnInfo.balanceIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$balance(), false);
        Table.nativeSetLong(j7, demoUserColumnInfo.statusIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$status(), false);
        Table.nativeSetLong(j7, demoUserColumnInfo.roleIdIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$roleId(), false);
        Table.nativeSetLong(j7, demoUserColumnInfo.genderIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$gender(), false);
        Table.nativeSetLong(j7, demoUserColumnInfo.hideAccountIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccount(), false);
        String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountText();
        if (realmGet$hideAccountText != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountTextIndex, j2, realmGet$hideAccountText, false);
        }
        String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountFullText();
        if (realmGet$hideAccountFullText != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountFullTextIndex, j2, realmGet$hideAccountFullText, false);
        }
        long j9 = nativePtr;
        long j10 = j2;
        Table.nativeSetLong(j9, demoUserColumnInfo.stageIndex, j10, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$stage(), false);
        Table.nativeSetLong(j9, demoUserColumnInfo.demoIndex, j10, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demo(), false);
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$apartmentList();
        if (realmGet$apartmentList != null) {
            j3 = j2;
            OsList osList = new OsList(table.getUncheckedRow(j3), demoUserColumnInfo.apartmentListIndex);
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
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$subAccountList();
        if (realmGet$subAccountList != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j3), demoUserColumnInfo.subAccountListIndex);
            Iterator<SubAccount> it2 = realmGet$subAccountList.iterator();
            while (it2.hasNext()) {
                SubAccount next2 = it2.next();
                Long l2 = map2.get(next2);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm2, next2, map2));
                }
                osList2.addRow(l2.longValue());
            }
        }
        String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fcmToken();
        if (realmGet$fcmToken != null) {
            j4 = j3;
            Table.nativeSetString(nativePtr, demoUserColumnInfo.fcmTokenIndex, j3, realmGet$fcmToken, false);
        } else {
            j4 = j3;
        }
        String realmGet$aid = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$aid();
        if (realmGet$aid != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.aidIndex, j4, realmGet$aid, false);
        }
        long j11 = nativePtr;
        long j12 = j4;
        Table.nativeSetBoolean(j11, demoUserColumnInfo.firstTimeSinceLoginIndex, j12, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
        Table.nativeSetBoolean(j11, demoUserColumnInfo.userLoggenInIndex, j12, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$userLoggenIn(), false);
        String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demoToken();
        if (realmGet$demoToken != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.demoTokenIndex, j4, realmGet$demoToken, false);
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
        Table table = realm2.getTable(DemoUser.class);
        long nativePtr = table.getNativePtr();
        DemoUserColumnInfo demoUserColumnInfo = (DemoUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DemoUser.class);
        long j6 = demoUserColumnInfo.idIndex;
        while (it.hasNext()) {
            DemoUser demoUser = (DemoUser) it.next();
            if (!map2.containsKey(demoUser)) {
                if (demoUser instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) demoUser;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(demoUser, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser;
                Long valueOf = Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id());
                if (valueOf != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j6, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                long j7 = j;
                map2.put(demoUser, Long.valueOf(j7));
                String realmGet$token = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.tokenIndex, j7, realmGet$token, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                }
                String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fullName();
                if (realmGet$fullName != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.fullNameIndex, j3, realmGet$fullName, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.nameIndex, j3, realmGet$name, false);
                }
                String realmGet$surname = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$surname();
                if (realmGet$surname != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.surnameIndex, j3, realmGet$surname, false);
                }
                String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$patronymic();
                if (realmGet$patronymic != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.patronymicIndex, j3, realmGet$patronymic, false);
                }
                String realmGet$email = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$email();
                if (realmGet$email != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.emailIndex, j3, realmGet$email, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.phoneIndex, j3, realmGet$phone, false);
                }
                String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$avatar();
                if (realmGet$avatar != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.avatarIndex, j3, realmGet$avatar, false);
                }
                long j8 = j3;
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.balanceIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$balance(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.statusIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$status(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.roleIdIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$roleId(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.genderIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$gender(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.hideAccountIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccount(), false);
                String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountText();
                if (realmGet$hideAccountText != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountTextIndex, j3, realmGet$hideAccountText, false);
                }
                String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountFullText();
                if (realmGet$hideAccountFullText != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountFullTextIndex, j3, realmGet$hideAccountFullText, false);
                }
                long j9 = j3;
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.stageIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$stage(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.demoIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demo(), false);
                RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$apartmentList();
                if (realmGet$apartmentList != null) {
                    j4 = j3;
                    OsList osList = new OsList(table.getUncheckedRow(j4), demoUserColumnInfo.apartmentListIndex);
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
                RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$subAccountList();
                if (realmGet$subAccountList != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j4), demoUserColumnInfo.subAccountListIndex);
                    Iterator<SubAccount> it3 = realmGet$subAccountList.iterator();
                    while (it3.hasNext()) {
                        SubAccount next2 = it3.next();
                        Long l2 = map2.get(next2);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l2.longValue());
                    }
                }
                String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fcmToken();
                if (realmGet$fcmToken != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.fcmTokenIndex, j4, realmGet$fcmToken, false);
                } else {
                    j5 = j4;
                }
                String realmGet$aid = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$aid();
                if (realmGet$aid != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.aidIndex, j5, realmGet$aid, false);
                }
                long j10 = nativePtr;
                long j11 = j5;
                Table.nativeSetBoolean(j10, demoUserColumnInfo.firstTimeSinceLoginIndex, j11, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
                Table.nativeSetBoolean(j10, demoUserColumnInfo.userLoggenInIndex, j11, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$userLoggenIn(), false);
                String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demoToken();
                if (realmGet$demoToken != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.demoTokenIndex, j5, realmGet$demoToken, false);
                }
                j6 = j2;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DemoUser demoUser, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        DemoUser demoUser2 = demoUser;
        Map<RealmModel, Long> map2 = map;
        if (demoUser2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) demoUser2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(DemoUser.class);
        long nativePtr = table.getNativePtr();
        DemoUserColumnInfo demoUserColumnInfo = (DemoUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DemoUser.class);
        long j4 = demoUserColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser2;
        if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()) != null) {
            j = Table.nativeFindFirstInt(nativePtr, j4, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id());
        } else {
            j = -1;
        }
        if (j == -1) {
            j = OsObject.createRowWithPrimaryKey(table, j4, Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()));
        }
        long j5 = j;
        map2.put(demoUser2, Long.valueOf(j5));
        String realmGet$token = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$token();
        if (realmGet$token != null) {
            j2 = j5;
            Table.nativeSetString(nativePtr, demoUserColumnInfo.tokenIndex, j5, realmGet$token, false);
        } else {
            j2 = j5;
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.tokenIndex, j2, false);
        }
        String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fullName();
        if (realmGet$fullName != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.fullNameIndex, j2, realmGet$fullName, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.fullNameIndex, j2, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.nameIndex, j2, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.nameIndex, j2, false);
        }
        String realmGet$surname = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$surname();
        if (realmGet$surname != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.surnameIndex, j2, realmGet$surname, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.surnameIndex, j2, false);
        }
        String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$patronymic();
        if (realmGet$patronymic != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.patronymicIndex, j2, realmGet$patronymic, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.patronymicIndex, j2, false);
        }
        String realmGet$email = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$email();
        if (realmGet$email != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.emailIndex, j2, realmGet$email, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.emailIndex, j2, false);
        }
        String realmGet$phone = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.phoneIndex, j2, realmGet$phone, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.phoneIndex, j2, false);
        }
        String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$avatar();
        if (realmGet$avatar != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.avatarIndex, j2, realmGet$avatar, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.avatarIndex, j2, false);
        }
        long j6 = nativePtr;
        long j7 = j2;
        Table.nativeSetLong(j6, demoUserColumnInfo.balanceIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$balance(), false);
        Table.nativeSetLong(j6, demoUserColumnInfo.statusIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$status(), false);
        Table.nativeSetLong(j6, demoUserColumnInfo.roleIdIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$roleId(), false);
        Table.nativeSetLong(j6, demoUserColumnInfo.genderIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$gender(), false);
        Table.nativeSetLong(j6, demoUserColumnInfo.hideAccountIndex, j7, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccount(), false);
        String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountText();
        if (realmGet$hideAccountText != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountTextIndex, j2, realmGet$hideAccountText, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.hideAccountTextIndex, j2, false);
        }
        String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountFullText();
        if (realmGet$hideAccountFullText != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountFullTextIndex, j2, realmGet$hideAccountFullText, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.hideAccountFullTextIndex, j2, false);
        }
        long j8 = nativePtr;
        long j9 = j2;
        Table.nativeSetLong(j8, demoUserColumnInfo.stageIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$stage(), false);
        Table.nativeSetLong(j8, demoUserColumnInfo.demoIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demo(), false);
        long j10 = j2;
        OsList osList = new OsList(table.getUncheckedRow(j10), demoUserColumnInfo.apartmentListIndex);
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$apartmentList();
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
        OsList osList2 = new OsList(table.getUncheckedRow(j10), demoUserColumnInfo.subAccountListIndex);
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$subAccountList();
        if (realmGet$subAccountList == null || ((long) realmGet$subAccountList.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$subAccountList != null) {
                Iterator<SubAccount> it2 = realmGet$subAccountList.iterator();
                while (it2.hasNext()) {
                    SubAccount next2 = it2.next();
                    Long l3 = map2.get(next2);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l3.longValue());
                }
            }
        } else {
            int size2 = realmGet$subAccountList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                SubAccount subAccount = realmGet$subAccountList.get(i2);
                Long l4 = map2.get(subAccount);
                if (l4 == null) {
                    l4 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, subAccount, map2));
                }
                osList2.setRow((long) i2, l4.longValue());
            }
        }
        String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fcmToken();
        if (realmGet$fcmToken != null) {
            j3 = j10;
            Table.nativeSetString(nativePtr, demoUserColumnInfo.fcmTokenIndex, j10, realmGet$fcmToken, false);
        } else {
            j3 = j10;
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.fcmTokenIndex, j3, false);
        }
        String realmGet$aid = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$aid();
        if (realmGet$aid != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.aidIndex, j3, realmGet$aid, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.aidIndex, j3, false);
        }
        long j11 = nativePtr;
        long j12 = j3;
        Table.nativeSetBoolean(j11, demoUserColumnInfo.firstTimeSinceLoginIndex, j12, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
        Table.nativeSetBoolean(j11, demoUserColumnInfo.userLoggenInIndex, j12, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$userLoggenIn(), false);
        String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demoToken();
        if (realmGet$demoToken != null) {
            Table.nativeSetString(nativePtr, demoUserColumnInfo.demoTokenIndex, j3, realmGet$demoToken, false);
        } else {
            Table.nativeSetNull(nativePtr, demoUserColumnInfo.demoTokenIndex, j3, false);
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
        Table table = realm2.getTable(DemoUser.class);
        long nativePtr = table.getNativePtr();
        DemoUserColumnInfo demoUserColumnInfo = (DemoUserColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DemoUser.class);
        long j6 = demoUserColumnInfo.idIndex;
        while (it.hasNext()) {
            DemoUser demoUser = (DemoUser) it.next();
            if (!map2.containsKey(demoUser)) {
                if (demoUser instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) demoUser;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(demoUser, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser;
                if (Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()) != null) {
                    j = Table.nativeFindFirstInt(nativePtr, j6, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id());
                } else {
                    j = -1;
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j6, Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$id()));
                }
                long j7 = j;
                map2.put(demoUser, Long.valueOf(j7));
                String realmGet$token = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$token();
                if (realmGet$token != null) {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.tokenIndex, j7, realmGet$token, false);
                } else {
                    j3 = j7;
                    j2 = j6;
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.tokenIndex, j7, false);
                }
                String realmGet$fullName = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fullName();
                if (realmGet$fullName != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.fullNameIndex, j3, realmGet$fullName, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.fullNameIndex, j3, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.nameIndex, j3, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.nameIndex, j3, false);
                }
                String realmGet$surname = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$surname();
                if (realmGet$surname != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.surnameIndex, j3, realmGet$surname, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.surnameIndex, j3, false);
                }
                String realmGet$patronymic = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$patronymic();
                if (realmGet$patronymic != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.patronymicIndex, j3, realmGet$patronymic, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.patronymicIndex, j3, false);
                }
                String realmGet$email = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$email();
                if (realmGet$email != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.emailIndex, j3, realmGet$email, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.emailIndex, j3, false);
                }
                String realmGet$phone = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$phone();
                if (realmGet$phone != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.phoneIndex, j3, realmGet$phone, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.phoneIndex, j3, false);
                }
                String realmGet$avatar = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$avatar();
                if (realmGet$avatar != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.avatarIndex, j3, realmGet$avatar, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.avatarIndex, j3, false);
                }
                long j8 = j3;
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.balanceIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$balance(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.statusIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$status(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.roleIdIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$roleId(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.genderIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$gender(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.hideAccountIndex, j8, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccount(), false);
                String realmGet$hideAccountText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountText();
                if (realmGet$hideAccountText != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountTextIndex, j3, realmGet$hideAccountText, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.hideAccountTextIndex, j3, false);
                }
                String realmGet$hideAccountFullText = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$hideAccountFullText();
                if (realmGet$hideAccountFullText != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.hideAccountFullTextIndex, j3, realmGet$hideAccountFullText, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.hideAccountFullTextIndex, j3, false);
                }
                long j9 = j3;
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.stageIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$stage(), false);
                Table.nativeSetLong(nativePtr, demoUserColumnInfo.demoIndex, j9, (long) ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demo(), false);
                long j10 = j3;
                OsList osList = new OsList(table.getUncheckedRow(j10), demoUserColumnInfo.apartmentListIndex);
                RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$apartmentList();
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
                OsList osList2 = new OsList(table.getUncheckedRow(j10), demoUserColumnInfo.subAccountListIndex);
                RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$subAccountList();
                if (realmGet$subAccountList == null || ((long) realmGet$subAccountList.size()) != osList2.size()) {
                    j4 = j10;
                    osList2.removeAll();
                    if (realmGet$subAccountList != null) {
                        Iterator<SubAccount> it3 = realmGet$subAccountList.iterator();
                        while (it3.hasNext()) {
                            SubAccount next2 = it3.next();
                            Long l3 = map2.get(next2);
                            if (l3 == null) {
                                l3 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l3.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$subAccountList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        SubAccount subAccount = realmGet$subAccountList.get(i2);
                        Long l4 = map2.get(subAccount);
                        if (l4 == null) {
                            l4 = Long.valueOf(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.insertOrUpdate(realm2, subAccount, map2));
                        }
                        osList2.setRow((long) i2, l4.longValue());
                        i2++;
                        j10 = j10;
                    }
                    j4 = j10;
                }
                String realmGet$fcmToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$fcmToken();
                if (realmGet$fcmToken != null) {
                    j5 = j4;
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.fcmTokenIndex, j4, realmGet$fcmToken, false);
                } else {
                    j5 = j4;
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.fcmTokenIndex, j5, false);
                }
                String realmGet$aid = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$aid();
                if (realmGet$aid != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.aidIndex, j5, realmGet$aid, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.aidIndex, j5, false);
                }
                long j11 = nativePtr;
                long j12 = j5;
                Table.nativeSetBoolean(j11, demoUserColumnInfo.firstTimeSinceLoginIndex, j12, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$firstTimeSinceLogin(), false);
                Table.nativeSetBoolean(j11, demoUserColumnInfo.userLoggenInIndex, j12, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$userLoggenIn(), false);
                String realmGet$demoToken = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmGet$demoToken();
                if (realmGet$demoToken != null) {
                    Table.nativeSetString(nativePtr, demoUserColumnInfo.demoTokenIndex, j5, realmGet$demoToken, false);
                } else {
                    Table.nativeSetNull(nativePtr, demoUserColumnInfo.demoTokenIndex, j5, false);
                }
                j6 = j2;
            }
        }
    }

    public static DemoUser createDetachedCopy(DemoUser demoUser, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DemoUser demoUser2;
        if (i > i2 || demoUser == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(demoUser);
        if (cacheData == null) {
            demoUser2 = new DemoUser();
            map.put(demoUser, new RealmObjectProxy.CacheData(i, demoUser2));
        } else if (i >= cacheData.minDepth) {
            return (DemoUser) cacheData.object;
        } else {
            cacheData.minDepth = i;
            demoUser2 = (DemoUser) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser2;
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2 = demoUser;
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$token(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$token());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$fullName(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$fullName());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$surname(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$surname());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$patronymic(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$patronymic());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$email(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$email());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$phone(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$phone());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$avatar(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$avatar());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$balance(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$balance());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$status(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$status());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$roleId(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$roleId());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$gender(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$gender());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccount(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$hideAccount());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccountText(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$hideAccountText());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$hideAccountFullText(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$hideAccountFullText());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$stage(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$stage());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$demo(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$demo());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$apartmentList((RealmList<Apartment>) null);
        } else {
            RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$apartmentList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$apartmentList(realmList);
            int i3 = i + 1;
            int size = realmGet$apartmentList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_profile_ApartmentRealmProxy.createDetachedCopy(realmGet$apartmentList.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$subAccountList((RealmList<SubAccount>) null);
        } else {
            RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$subAccountList();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$subAccountList(realmList2);
            int i5 = i + 1;
            int size2 = realmGet$subAccountList.size();
            for (int i6 = 0; i6 < size2; i6++) {
                realmList2.add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.createDetachedCopy(realmGet$subAccountList.get(i6), i5, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$fcmToken(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$fcmToken());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$aid(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$aid());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$firstTimeSinceLogin(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$firstTimeSinceLogin());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$userLoggenIn(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$userLoggenIn());
        ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface.realmSet$demoToken(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$demoToken());
        return demoUser2;
    }

    static DemoUser update(Realm realm, DemoUserColumnInfo demoUserColumnInfo, DemoUser demoUser, DemoUser demoUser2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        DemoUserColumnInfo demoUserColumnInfo2 = demoUserColumnInfo;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface = demoUser;
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2 = demoUser2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DemoUser.class), demoUserColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(demoUserColumnInfo2.idIndex, Long.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$id()));
        osObjectBuilder.addString(demoUserColumnInfo2.tokenIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$token());
        osObjectBuilder.addString(demoUserColumnInfo2.fullNameIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$fullName());
        osObjectBuilder.addString(demoUserColumnInfo2.nameIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$name());
        osObjectBuilder.addString(demoUserColumnInfo2.surnameIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$surname());
        osObjectBuilder.addString(demoUserColumnInfo2.patronymicIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$patronymic());
        osObjectBuilder.addString(demoUserColumnInfo2.emailIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$email());
        osObjectBuilder.addString(demoUserColumnInfo2.phoneIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$phone());
        osObjectBuilder.addString(demoUserColumnInfo2.avatarIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$avatar());
        osObjectBuilder.addInteger(demoUserColumnInfo2.balanceIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$balance()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.statusIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$status()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.roleIdIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$roleId()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.genderIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$gender()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.hideAccountIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$hideAccount()));
        osObjectBuilder.addString(demoUserColumnInfo2.hideAccountTextIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$hideAccountText());
        osObjectBuilder.addString(demoUserColumnInfo2.hideAccountFullTextIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$hideAccountFullText());
        osObjectBuilder.addInteger(demoUserColumnInfo2.stageIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$stage()));
        osObjectBuilder.addInteger(demoUserColumnInfo2.demoIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$demo()));
        RealmList<Apartment> realmGet$apartmentList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$apartmentList();
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
            osObjectBuilder.addObjectList(demoUserColumnInfo2.apartmentListIndex, realmList);
        } else {
            osObjectBuilder.addObjectList(demoUserColumnInfo2.apartmentListIndex, new RealmList());
        }
        RealmList<SubAccount> realmGet$subAccountList = ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$subAccountList();
        if (realmGet$subAccountList != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$subAccountList.size(); i2++) {
                SubAccount subAccount = realmGet$subAccountList.get(i2);
                SubAccount subAccount2 = (SubAccount) map2.get(subAccount);
                if (subAccount2 != null) {
                    realmList2.add(subAccount2);
                } else {
                    realmList2.add(ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_api_response_SubAccountRealmProxy.SubAccountColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SubAccount.class), subAccount, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(demoUserColumnInfo2.subAccountListIndex, realmList2);
        } else {
            osObjectBuilder.addObjectList(demoUserColumnInfo2.subAccountListIndex, new RealmList());
        }
        osObjectBuilder.addString(demoUserColumnInfo2.fcmTokenIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$fcmToken());
        osObjectBuilder.addString(demoUserColumnInfo2.aidIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$aid());
        osObjectBuilder.addBoolean(demoUserColumnInfo2.firstTimeSinceLoginIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$firstTimeSinceLogin()));
        osObjectBuilder.addBoolean(demoUserColumnInfo2.userLoggenInIndex, Boolean.valueOf(ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$userLoggenIn()));
        osObjectBuilder.addString(demoUserColumnInfo2.demoTokenIndex, ru_unicorn_ujin_data_realm_profile_demouserrealmproxyinterface2.realmGet$demoToken());
        osObjectBuilder.updateExistingObject();
        return demoUser;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "DemoUser = proxy[" + "{id:" + realmGet$id() + "}" + "," + "{token:" + realmGet$token() + "}" + "," + "{fullName:" + realmGet$fullName() + "}" + "," + "{name:" + realmGet$name() + "}" + "," + "{surname:" + realmGet$surname() + "}" + "," + "{patronymic:" + realmGet$patronymic() + "}" + "," + "{email:" + realmGet$email() + "}" + "," + "{phone:" + realmGet$phone() + "}" + "," + "{avatar:" + realmGet$avatar() + "}" + "," + "{balance:" + realmGet$balance() + "}" + "," + "{status:" + realmGet$status() + "}" + "," + "{roleId:" + realmGet$roleId() + "}" + "," + "{gender:" + realmGet$gender() + "}" + "," + "{hideAccount:" + realmGet$hideAccount() + "}" + "," + "{hideAccountText:" + realmGet$hideAccountText() + "}" + "," + "{hideAccountFullText:" + realmGet$hideAccountFullText() + "}" + "," + "{stage:" + realmGet$stage() + "}" + "," + "{demo:" + realmGet$demo() + "}" + "," + "{apartmentList:" + "RealmList<Apartment>[" + realmGet$apartmentList().size() + "]" + "}" + "," + "{subAccountList:" + "RealmList<SubAccount>[" + realmGet$subAccountList().size() + "]" + "}" + "," + "{fcmToken:" + realmGet$fcmToken() + "}" + "," + "{aid:" + realmGet$aid() + "}" + "," + "{firstTimeSinceLogin:" + realmGet$firstTimeSinceLogin() + "}" + "," + "{userLoggenIn:" + realmGet$userLoggenIn() + "}" + "," + "{demoToken:" + realmGet$demoToken() + "}" + "]";
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
        ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy ru_unicorn_ujin_data_realm_profile_demouserrealmproxy = (ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_profile_demouserrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_profile_demouserrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_profile_demouserrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
