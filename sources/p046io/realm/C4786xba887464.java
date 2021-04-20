package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle;
import p046io.realm.BaseRealm;
import p046io.realm.C4750xebfdbb8f;
import p046io.realm.C4782x594eae38;
import p046io.realm.C4784x85418d2d;
import p046io.realm.C4788xc3a2b227;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserProfileRealmProxy */
public class C4786xba887464 extends UserProfile implements RealmObjectProxy, C4787xe7d1c935 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private UserProfileColumnInfo columnInfo;
    private RealmList<RentPermissions> permissionsRealmList;
    private ProxyState<UserProfile> proxyState;
    private RealmList<UserVehicle> vehiclesRealmList;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserProfileRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserProfile";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserProfileRealmProxy$UserProfileColumnInfo */
    static final class UserProfileColumnInfo extends ColumnInfo {
        long isVerifiedIndex;
        long maxColumnIndexValue;
        long meIndex;
        long permissionsIndex;
        long positionIndex;
        long propertyIdIndex;
        long userdataIndex;
        long vehiclesIndex;

        UserProfileColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.userdataIndex = addColumnDetails("userdata", "userdata", objectSchemaInfo);
            this.positionIndex = addColumnDetails("position", "position", objectSchemaInfo);
            this.vehiclesIndex = addColumnDetails("vehicles", "vehicles", objectSchemaInfo);
            this.permissionsIndex = addColumnDetails("permissions", "permissions", objectSchemaInfo);
            this.meIndex = addColumnDetails("me", "me", objectSchemaInfo);
            this.isVerifiedIndex = addColumnDetails("isVerified", "isVerified", objectSchemaInfo);
            this.propertyIdIndex = addColumnDetails("propertyId", "propertyId", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserProfileColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new UserProfileColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UserProfileColumnInfo userProfileColumnInfo = (UserProfileColumnInfo) columnInfo;
            UserProfileColumnInfo userProfileColumnInfo2 = (UserProfileColumnInfo) columnInfo2;
            userProfileColumnInfo2.userdataIndex = userProfileColumnInfo.userdataIndex;
            userProfileColumnInfo2.positionIndex = userProfileColumnInfo.positionIndex;
            userProfileColumnInfo2.vehiclesIndex = userProfileColumnInfo.vehiclesIndex;
            userProfileColumnInfo2.permissionsIndex = userProfileColumnInfo.permissionsIndex;
            userProfileColumnInfo2.meIndex = userProfileColumnInfo.meIndex;
            userProfileColumnInfo2.isVerifiedIndex = userProfileColumnInfo.isVerifiedIndex;
            userProfileColumnInfo2.propertyIdIndex = userProfileColumnInfo.propertyIdIndex;
            userProfileColumnInfo2.maxColumnIndexValue = userProfileColumnInfo.maxColumnIndexValue;
        }
    }

    C4786xba887464() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (UserProfileColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public UserData realmGet$userdata() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.userdataIndex)) {
            return null;
        }
        return (UserData) this.proxyState.getRealm$realm().get(UserData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.userdataIndex), false, Collections.emptyList());
    }

    public void realmSet$userdata(UserData userData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (userData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.userdataIndex);
                return;
            }
            this.proxyState.checkValidObject(userData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.userdataIndex, ((RealmObjectProxy) userData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("userdata")) {
            if (userData != null && !RealmObject.isManaged(userData)) {
                userData = (UserData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(userData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (userData == null) {
                row$realm.nullifyLink(this.columnInfo.userdataIndex);
                return;
            }
            this.proxyState.checkValidObject(userData);
            row$realm.getTable().setLink(this.columnInfo.userdataIndex, row$realm.getIndex(), ((RealmObjectProxy) userData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public UserCompany realmGet$position() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.positionIndex)) {
            return null;
        }
        return (UserCompany) this.proxyState.getRealm$realm().get(UserCompany.class, this.proxyState.getRow$realm().getLink(this.columnInfo.positionIndex), false, Collections.emptyList());
    }

    public void realmSet$position(UserCompany userCompany) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (userCompany == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.positionIndex);
                return;
            }
            this.proxyState.checkValidObject(userCompany);
            this.proxyState.getRow$realm().setLink(this.columnInfo.positionIndex, ((RealmObjectProxy) userCompany).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("position")) {
            if (userCompany != null && !RealmObject.isManaged(userCompany)) {
                userCompany = (UserCompany) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(userCompany, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (userCompany == null) {
                row$realm.nullifyLink(this.columnInfo.positionIndex);
                return;
            }
            this.proxyState.checkValidObject(userCompany);
            row$realm.getTable().setLink(this.columnInfo.positionIndex, row$realm.getIndex(), ((RealmObjectProxy) userCompany).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<UserVehicle> realmGet$vehicles() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<UserVehicle> realmList = this.vehiclesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.vehiclesRealmList = new RealmList<>(UserVehicle.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.vehiclesIndex), this.proxyState.getRealm$realm());
        return this.vehiclesRealmList;
    }

    public void realmSet$vehicles(RealmList<UserVehicle> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("vehicles")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<UserVehicle> realmList2 = new RealmList<>();
                Iterator<UserVehicle> it = realmList.iterator();
                while (it.hasNext()) {
                    UserVehicle next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.vehiclesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    UserVehicle userVehicle = realmList.get(i);
                    this.proxyState.checkValidObject(userVehicle);
                    modelList.addRow(((RealmObjectProxy) userVehicle).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            UserVehicle userVehicle2 = realmList.get(i);
            this.proxyState.checkValidObject(userVehicle2);
            modelList.setRow((long) i, ((RealmObjectProxy) userVehicle2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public RealmList<RentPermissions> realmGet$permissions() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<RentPermissions> realmList = this.permissionsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.permissionsRealmList = new RealmList<>(RentPermissions.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.permissionsIndex), this.proxyState.getRealm$realm());
        return this.permissionsRealmList;
    }

    public void realmSet$permissions(RealmList<RentPermissions> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("permissions")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<RentPermissions> realmList2 = new RealmList<>();
                Iterator<RentPermissions> it = realmList.iterator();
                while (it.hasNext()) {
                    RentPermissions next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.permissionsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    RentPermissions rentPermissions = realmList.get(i);
                    this.proxyState.checkValidObject(rentPermissions);
                    modelList.addRow(((RealmObjectProxy) rentPermissions).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            RentPermissions rentPermissions2 = realmList.get(i);
            this.proxyState.checkValidObject(rentPermissions2);
            modelList.setRow((long) i, ((RealmObjectProxy) rentPermissions2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Boolean realmGet$me() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.meIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.meIndex));
    }

    public void realmSet$me(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.meIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.meIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.meIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.meIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Boolean realmGet$isVerified() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.isVerifiedIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.isVerifiedIndex));
    }

    public void realmSet$isVerified(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isVerifiedIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.isVerifiedIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.isVerifiedIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.isVerifiedIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public Integer realmGet$propertyId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.propertyIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.propertyIdIndex));
    }

    public void realmSet$propertyId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.propertyIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.propertyIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.propertyIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.propertyIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        builder.addPersistedLinkProperty("userdata", RealmFieldType.OBJECT, C4784x85418d2d.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("position", RealmFieldType.OBJECT, C4782x594eae38.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("vehicles", RealmFieldType.LIST, C4788xc3a2b227.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("permissions", RealmFieldType.LIST, C4750xebfdbb8f.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("me", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("isVerified", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("propertyId", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserProfileColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UserProfileColumnInfo(osSchemaInfo);
    }

    public static UserProfile createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(4);
        if (jSONObject.has("userdata")) {
            arrayList.add("userdata");
        }
        if (jSONObject.has("position")) {
            arrayList.add("position");
        }
        if (jSONObject.has("vehicles")) {
            arrayList.add("vehicles");
        }
        if (jSONObject.has("permissions")) {
            arrayList.add("permissions");
        }
        UserProfile userProfile = (UserProfile) realm.createObjectInternal(UserProfile.class, true, arrayList);
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile;
        if (jSONObject.has("userdata")) {
            if (jSONObject.isNull("userdata")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$userdata((UserData) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$userdata(C4784x85418d2d.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("userdata"), z));
            }
        }
        if (jSONObject.has("position")) {
            if (jSONObject.isNull("position")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$position((UserCompany) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$position(C4782x594eae38.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("position"), z));
            }
        }
        if (jSONObject.has("vehicles")) {
            if (jSONObject.isNull("vehicles")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$vehicles((RealmList<UserVehicle>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("vehicles");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles().add(C4788xc3a2b227.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("permissions")) {
            if (jSONObject.isNull("permissions")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$permissions((RealmList<RentPermissions>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions().clear();
                JSONArray jSONArray2 = jSONObject.getJSONArray("permissions");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions().add(C4750xebfdbb8f.createOrUpdateUsingJsonObject(realm, jSONArray2.getJSONObject(i2), z));
                }
            }
        }
        if (jSONObject.has("me")) {
            if (jSONObject.isNull("me")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$me((Boolean) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$me(Boolean.valueOf(jSONObject.getBoolean("me")));
            }
        }
        if (jSONObject.has("isVerified")) {
            if (jSONObject.isNull("isVerified")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$isVerified((Boolean) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$isVerified(Boolean.valueOf(jSONObject.getBoolean("isVerified")));
            }
        }
        if (jSONObject.has("propertyId")) {
            if (jSONObject.isNull("propertyId")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$propertyId((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$propertyId(Integer.valueOf(jSONObject.getInt("propertyId")));
            }
        }
        return userProfile;
    }

    public static UserProfile createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        UserProfile userProfile = new UserProfile();
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("userdata")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$userdata((UserData) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$userdata(C4784x85418d2d.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("position")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$position((UserCompany) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$position(C4782x594eae38.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("vehicles")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$vehicles((RealmList<UserVehicle>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$vehicles(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles().add(C4788xc3a2b227.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("permissions")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$permissions((RealmList<RentPermissions>) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$permissions(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions().add(C4750xebfdbb8f.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("me")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$me(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$me((Boolean) null);
                }
            } else if (nextName.equals("isVerified")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$isVerified(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$isVerified((Boolean) null);
                }
            } else if (!nextName.equals("propertyId")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$propertyId(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$propertyId((Integer) null);
            }
        }
        jsonReader.endObject();
        return (UserProfile) realm.copyToRealm(userProfile, new ImportFlag[0]);
    }

    private static C4786xba887464 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class), false, Collections.emptyList());
        C4786xba887464 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxy = new C4786xba887464();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxy;
    }

    public static UserProfile copyOrUpdate(Realm realm, UserProfileColumnInfo userProfileColumnInfo, UserProfile userProfile, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (userProfile instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userProfile;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return userProfile;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(userProfile);
        if (realmObjectProxy2 != null) {
            return (UserProfile) realmObjectProxy2;
        }
        return copy(realm, userProfileColumnInfo, userProfile, z, map, set);
    }

    public static UserProfile copy(Realm realm, UserProfileColumnInfo userProfileColumnInfo, UserProfile userProfile, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        UserProfileColumnInfo userProfileColumnInfo2 = userProfileColumnInfo;
        UserProfile userProfile2 = userProfile;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(userProfile2);
        if (realmObjectProxy != null) {
            return (UserProfile) realmObjectProxy;
        }
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(UserProfile.class), userProfileColumnInfo2.maxColumnIndexValue, set);
        osObjectBuilder.addBoolean(userProfileColumnInfo2.meIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$me());
        osObjectBuilder.addBoolean(userProfileColumnInfo2.isVerifiedIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$isVerified());
        osObjectBuilder.addInteger(userProfileColumnInfo2.propertyIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$propertyId());
        C4786xba887464 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map2.put(userProfile2, newProxyInstance);
        UserData realmGet$userdata = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$userdata();
        if (realmGet$userdata == null) {
            newProxyInstance.realmSet$userdata((UserData) null);
        } else {
            UserData userData = (UserData) map2.get(realmGet$userdata);
            if (userData != null) {
                newProxyInstance.realmSet$userdata(userData);
            } else {
                newProxyInstance.realmSet$userdata(C4784x85418d2d.copyOrUpdate(realm, (C4784x85418d2d.UserDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserData.class), realmGet$userdata, z, map, set));
            }
        }
        UserCompany realmGet$position = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$position();
        if (realmGet$position == null) {
            newProxyInstance.realmSet$position((UserCompany) null);
        } else {
            UserCompany userCompany = (UserCompany) map2.get(realmGet$position);
            if (userCompany != null) {
                newProxyInstance.realmSet$position(userCompany);
            } else {
                newProxyInstance.realmSet$position(C4782x594eae38.copyOrUpdate(realm, (C4782x594eae38.UserCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserCompany.class), realmGet$position, z, map, set));
            }
        }
        RealmList<UserVehicle> realmGet$vehicles = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles();
        if (realmGet$vehicles != null) {
            RealmList<UserVehicle> realmGet$vehicles2 = newProxyInstance.realmGet$vehicles();
            realmGet$vehicles2.clear();
            for (int i = 0; i < realmGet$vehicles.size(); i++) {
                UserVehicle userVehicle = realmGet$vehicles.get(i);
                UserVehicle userVehicle2 = (UserVehicle) map2.get(userVehicle);
                if (userVehicle2 != null) {
                    realmGet$vehicles2.add(userVehicle2);
                } else {
                    realmGet$vehicles2.add(C4788xc3a2b227.copyOrUpdate(realm, (C4788xc3a2b227.UserVehicleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class), userVehicle, z, map, set));
                }
            }
        }
        RealmList<RentPermissions> realmGet$permissions = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions();
        if (realmGet$permissions != null) {
            RealmList<RentPermissions> realmGet$permissions2 = newProxyInstance.realmGet$permissions();
            realmGet$permissions2.clear();
            for (int i2 = 0; i2 < realmGet$permissions.size(); i2++) {
                RentPermissions rentPermissions = realmGet$permissions.get(i2);
                RentPermissions rentPermissions2 = (RentPermissions) map2.get(rentPermissions);
                if (rentPermissions2 != null) {
                    realmGet$permissions2.add(rentPermissions2);
                } else {
                    realmGet$permissions2.add(C4750xebfdbb8f.copyOrUpdate(realm, (C4750xebfdbb8f.RentPermissionsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentPermissions.class), rentPermissions, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, UserProfile userProfile, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        UserProfile userProfile2 = userProfile;
        Map<RealmModel, Long> map2 = map;
        if (userProfile2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userProfile2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(UserProfile.class);
        long nativePtr = table.getNativePtr();
        UserProfileColumnInfo userProfileColumnInfo = (UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class);
        long createRow = OsObject.createRow(table);
        map2.put(userProfile2, Long.valueOf(createRow));
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile2;
        UserData realmGet$userdata = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$userdata();
        if (realmGet$userdata != null) {
            Long l = map2.get(realmGet$userdata);
            if (l == null) {
                l = Long.valueOf(C4784x85418d2d.insert(realm2, realmGet$userdata, map2));
            }
            j = createRow;
            Table.nativeSetLink(nativePtr, userProfileColumnInfo.userdataIndex, createRow, l.longValue(), false);
        } else {
            j = createRow;
        }
        UserCompany realmGet$position = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$position();
        if (realmGet$position != null) {
            Long l2 = map2.get(realmGet$position);
            if (l2 == null) {
                l2 = Long.valueOf(C4782x594eae38.insert(realm2, realmGet$position, map2));
            }
            Table.nativeSetLink(nativePtr, userProfileColumnInfo.positionIndex, j, l2.longValue(), false);
        }
        RealmList<UserVehicle> realmGet$vehicles = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles();
        if (realmGet$vehicles != null) {
            j2 = j;
            OsList osList = new OsList(table.getUncheckedRow(j2), userProfileColumnInfo.vehiclesIndex);
            Iterator<UserVehicle> it = realmGet$vehicles.iterator();
            while (it.hasNext()) {
                UserVehicle next = it.next();
                Long l3 = map2.get(next);
                if (l3 == null) {
                    l3 = Long.valueOf(C4788xc3a2b227.insert(realm2, next, map2));
                }
                osList.addRow(l3.longValue());
            }
        } else {
            j2 = j;
        }
        RealmList<RentPermissions> realmGet$permissions = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions();
        if (realmGet$permissions != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(j2), userProfileColumnInfo.permissionsIndex);
            Iterator<RentPermissions> it2 = realmGet$permissions.iterator();
            while (it2.hasNext()) {
                RentPermissions next2 = it2.next();
                Long l4 = map2.get(next2);
                if (l4 == null) {
                    l4 = Long.valueOf(C4750xebfdbb8f.insert(realm2, next2, map2));
                }
                osList2.addRow(l4.longValue());
            }
        }
        Boolean realmGet$me = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$me();
        if (realmGet$me != null) {
            j3 = j2;
            Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.meIndex, j2, realmGet$me.booleanValue(), false);
        } else {
            j3 = j2;
        }
        Boolean realmGet$isVerified = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$isVerified();
        if (realmGet$isVerified != null) {
            Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.isVerifiedIndex, j3, realmGet$isVerified.booleanValue(), false);
        }
        Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$propertyId();
        if (realmGet$propertyId != null) {
            Table.nativeSetLong(nativePtr, userProfileColumnInfo.propertyIdIndex, j3, realmGet$propertyId.longValue(), false);
        }
        return j3;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(UserProfile.class);
        long nativePtr = table.getNativePtr();
        UserProfileColumnInfo userProfileColumnInfo = (UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class);
        while (it.hasNext()) {
            UserProfile userProfile = (UserProfile) it.next();
            if (!map2.containsKey(userProfile)) {
                if (userProfile instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userProfile;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userProfile, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(userProfile, Long.valueOf(createRow));
                C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile;
                UserData realmGet$userdata = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$userdata();
                if (realmGet$userdata != null) {
                    Long l = map2.get(realmGet$userdata);
                    if (l == null) {
                        l = Long.valueOf(C4784x85418d2d.insert(realm2, realmGet$userdata, map2));
                    }
                    j = createRow;
                    table.setLink(userProfileColumnInfo.userdataIndex, createRow, l.longValue(), false);
                } else {
                    j = createRow;
                }
                UserCompany realmGet$position = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$position();
                if (realmGet$position != null) {
                    Long l2 = map2.get(realmGet$position);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4782x594eae38.insert(realm2, realmGet$position, map2));
                    }
                    table.setLink(userProfileColumnInfo.positionIndex, j, l2.longValue(), false);
                }
                RealmList<UserVehicle> realmGet$vehicles = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles();
                if (realmGet$vehicles != null) {
                    j2 = j;
                    OsList osList = new OsList(table.getUncheckedRow(j2), userProfileColumnInfo.vehiclesIndex);
                    Iterator<UserVehicle> it2 = realmGet$vehicles.iterator();
                    while (it2.hasNext()) {
                        UserVehicle next = it2.next();
                        Long l3 = map2.get(next);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4788xc3a2b227.insert(realm2, next, map2));
                        }
                        osList.addRow(l3.longValue());
                    }
                } else {
                    j2 = j;
                }
                RealmList<RentPermissions> realmGet$permissions = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions();
                if (realmGet$permissions != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(j2), userProfileColumnInfo.permissionsIndex);
                    Iterator<RentPermissions> it3 = realmGet$permissions.iterator();
                    while (it3.hasNext()) {
                        RentPermissions next2 = it3.next();
                        Long l4 = map2.get(next2);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4750xebfdbb8f.insert(realm2, next2, map2));
                        }
                        osList2.addRow(l4.longValue());
                    }
                }
                Boolean realmGet$me = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$me();
                if (realmGet$me != null) {
                    j3 = j2;
                    Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.meIndex, j2, realmGet$me.booleanValue(), false);
                } else {
                    j3 = j2;
                }
                Boolean realmGet$isVerified = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$isVerified();
                if (realmGet$isVerified != null) {
                    Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.isVerifiedIndex, j3, realmGet$isVerified.booleanValue(), false);
                }
                Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$propertyId();
                if (realmGet$propertyId != null) {
                    Table.nativeSetLong(nativePtr, userProfileColumnInfo.propertyIdIndex, j3, realmGet$propertyId.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, UserProfile userProfile, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        UserProfile userProfile2 = userProfile;
        Map<RealmModel, Long> map2 = map;
        if (userProfile2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userProfile2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(UserProfile.class);
        long nativePtr = table.getNativePtr();
        UserProfileColumnInfo userProfileColumnInfo = (UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class);
        long createRow = OsObject.createRow(table);
        map2.put(userProfile2, Long.valueOf(createRow));
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile2;
        UserData realmGet$userdata = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$userdata();
        if (realmGet$userdata != null) {
            Long l = map2.get(realmGet$userdata);
            if (l == null) {
                l = Long.valueOf(C4784x85418d2d.insertOrUpdate(realm2, realmGet$userdata, map2));
            }
            j = createRow;
            Table.nativeSetLink(nativePtr, userProfileColumnInfo.userdataIndex, createRow, l.longValue(), false);
        } else {
            j = createRow;
            Table.nativeNullifyLink(nativePtr, userProfileColumnInfo.userdataIndex, j);
        }
        UserCompany realmGet$position = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$position();
        if (realmGet$position != null) {
            Long l2 = map2.get(realmGet$position);
            if (l2 == null) {
                l2 = Long.valueOf(C4782x594eae38.insertOrUpdate(realm2, realmGet$position, map2));
            }
            Table.nativeSetLink(nativePtr, userProfileColumnInfo.positionIndex, j, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, userProfileColumnInfo.positionIndex, j);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), userProfileColumnInfo.vehiclesIndex);
        RealmList<UserVehicle> realmGet$vehicles = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles();
        if (realmGet$vehicles == null || ((long) realmGet$vehicles.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$vehicles != null) {
                Iterator<UserVehicle> it = realmGet$vehicles.iterator();
                while (it.hasNext()) {
                    UserVehicle next = it.next();
                    Long l3 = map2.get(next);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4788xc3a2b227.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l3.longValue());
                }
            }
        } else {
            int i = 0;
            for (int size = realmGet$vehicles.size(); i < size; size = size) {
                UserVehicle userVehicle = realmGet$vehicles.get(i);
                Long l4 = map2.get(userVehicle);
                if (l4 == null) {
                    l4 = Long.valueOf(C4788xc3a2b227.insertOrUpdate(realm2, userVehicle, map2));
                }
                osList.setRow((long) i, l4.longValue());
                i++;
            }
        }
        OsList osList2 = new OsList(table.getUncheckedRow(j3), userProfileColumnInfo.permissionsIndex);
        RealmList<RentPermissions> realmGet$permissions = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions();
        if (realmGet$permissions == null || ((long) realmGet$permissions.size()) != osList2.size()) {
            osList2.removeAll();
            if (realmGet$permissions != null) {
                Iterator<RentPermissions> it2 = realmGet$permissions.iterator();
                while (it2.hasNext()) {
                    RentPermissions next2 = it2.next();
                    Long l5 = map2.get(next2);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4750xebfdbb8f.insertOrUpdate(realm2, next2, map2));
                    }
                    osList2.addRow(l5.longValue());
                }
            }
        } else {
            int size2 = realmGet$permissions.size();
            for (int i2 = 0; i2 < size2; i2++) {
                RentPermissions rentPermissions = realmGet$permissions.get(i2);
                Long l6 = map2.get(rentPermissions);
                if (l6 == null) {
                    l6 = Long.valueOf(C4750xebfdbb8f.insertOrUpdate(realm2, rentPermissions, map2));
                }
                osList2.setRow((long) i2, l6.longValue());
            }
        }
        Boolean realmGet$me = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$me();
        if (realmGet$me != null) {
            j2 = j3;
            Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.meIndex, j3, realmGet$me.booleanValue(), false);
        } else {
            j2 = j3;
            Table.nativeSetNull(nativePtr, userProfileColumnInfo.meIndex, j2, false);
        }
        Boolean realmGet$isVerified = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$isVerified();
        if (realmGet$isVerified != null) {
            Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.isVerifiedIndex, j2, realmGet$isVerified.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userProfileColumnInfo.isVerifiedIndex, j2, false);
        }
        Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$propertyId();
        if (realmGet$propertyId != null) {
            Table.nativeSetLong(nativePtr, userProfileColumnInfo.propertyIdIndex, j2, realmGet$propertyId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userProfileColumnInfo.propertyIdIndex, j2, false);
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(UserProfile.class);
        long nativePtr = table.getNativePtr();
        UserProfileColumnInfo userProfileColumnInfo = (UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class);
        while (it.hasNext()) {
            UserProfile userProfile = (UserProfile) it.next();
            if (!map2.containsKey(userProfile)) {
                if (userProfile instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userProfile;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userProfile, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(userProfile, Long.valueOf(createRow));
                C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile;
                UserData realmGet$userdata = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$userdata();
                if (realmGet$userdata != null) {
                    Long l = map2.get(realmGet$userdata);
                    if (l == null) {
                        l = Long.valueOf(C4784x85418d2d.insertOrUpdate(realm2, realmGet$userdata, map2));
                    }
                    j = createRow;
                    Table.nativeSetLink(nativePtr, userProfileColumnInfo.userdataIndex, createRow, l.longValue(), false);
                } else {
                    j = createRow;
                    Table.nativeNullifyLink(nativePtr, userProfileColumnInfo.userdataIndex, j);
                }
                UserCompany realmGet$position = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$position();
                if (realmGet$position != null) {
                    Long l2 = map2.get(realmGet$position);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4782x594eae38.insertOrUpdate(realm2, realmGet$position, map2));
                    }
                    Table.nativeSetLink(nativePtr, userProfileColumnInfo.positionIndex, j, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, userProfileColumnInfo.positionIndex, j);
                }
                long j4 = j;
                OsList osList = new OsList(table.getUncheckedRow(j4), userProfileColumnInfo.vehiclesIndex);
                RealmList<UserVehicle> realmGet$vehicles = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$vehicles();
                if (realmGet$vehicles == null || ((long) realmGet$vehicles.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$vehicles != null) {
                        Iterator<UserVehicle> it2 = realmGet$vehicles.iterator();
                        while (it2.hasNext()) {
                            UserVehicle next = it2.next();
                            Long l3 = map2.get(next);
                            if (l3 == null) {
                                l3 = Long.valueOf(C4788xc3a2b227.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l3.longValue());
                        }
                    }
                } else {
                    int i = 0;
                    for (int size = realmGet$vehicles.size(); i < size; size = size) {
                        UserVehicle userVehicle = realmGet$vehicles.get(i);
                        Long l4 = map2.get(userVehicle);
                        if (l4 == null) {
                            l4 = Long.valueOf(C4788xc3a2b227.insertOrUpdate(realm2, userVehicle, map2));
                        }
                        osList.setRow((long) i, l4.longValue());
                        i++;
                    }
                }
                OsList osList2 = new OsList(table.getUncheckedRow(j4), userProfileColumnInfo.permissionsIndex);
                RealmList<RentPermissions> realmGet$permissions = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$permissions();
                if (realmGet$permissions == null || ((long) realmGet$permissions.size()) != osList2.size()) {
                    j2 = j4;
                    osList2.removeAll();
                    if (realmGet$permissions != null) {
                        Iterator<RentPermissions> it3 = realmGet$permissions.iterator();
                        while (it3.hasNext()) {
                            RentPermissions next2 = it3.next();
                            Long l5 = map2.get(next2);
                            if (l5 == null) {
                                l5 = Long.valueOf(C4750xebfdbb8f.insertOrUpdate(realm2, next2, map2));
                            }
                            osList2.addRow(l5.longValue());
                        }
                    }
                } else {
                    int size2 = realmGet$permissions.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        RentPermissions rentPermissions = realmGet$permissions.get(i2);
                        Long l6 = map2.get(rentPermissions);
                        if (l6 == null) {
                            l6 = Long.valueOf(C4750xebfdbb8f.insertOrUpdate(realm2, rentPermissions, map2));
                        }
                        osList2.setRow((long) i2, l6.longValue());
                        i2++;
                        j4 = j4;
                    }
                    j2 = j4;
                }
                Boolean realmGet$me = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$me();
                if (realmGet$me != null) {
                    j3 = j2;
                    Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.meIndex, j2, realmGet$me.booleanValue(), false);
                } else {
                    j3 = j2;
                    Table.nativeSetNull(nativePtr, userProfileColumnInfo.meIndex, j3, false);
                }
                Boolean realmGet$isVerified = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$isVerified();
                if (realmGet$isVerified != null) {
                    Table.nativeSetBoolean(nativePtr, userProfileColumnInfo.isVerifiedIndex, j3, realmGet$isVerified.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userProfileColumnInfo.isVerifiedIndex, j3, false);
                }
                Integer realmGet$propertyId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmGet$propertyId();
                if (realmGet$propertyId != null) {
                    Table.nativeSetLong(nativePtr, userProfileColumnInfo.propertyIdIndex, j3, realmGet$propertyId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userProfileColumnInfo.propertyIdIndex, j3, false);
                }
            }
        }
    }

    public static UserProfile createDetachedCopy(UserProfile userProfile, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        UserProfile userProfile2;
        if (i > i2 || userProfile == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(userProfile);
        if (cacheData == null) {
            userProfile2 = new UserProfile();
            map.put(userProfile, new RealmObjectProxy.CacheData(i, userProfile2));
        } else if (i >= cacheData.minDepth) {
            return (UserProfile) cacheData.object;
        } else {
            cacheData.minDepth = i;
            userProfile2 = (UserProfile) cacheData.object;
        }
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface = userProfile2;
        C4787xe7d1c935 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2 = userProfile;
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$userdata(C4784x85418d2d.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$userdata(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$position(C4782x594eae38.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$position(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$vehicles((RealmList<UserVehicle>) null);
        } else {
            RealmList<UserVehicle> realmGet$vehicles = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$vehicles();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$vehicles(realmList);
            int size = realmGet$vehicles.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4788xc3a2b227.createDetachedCopy(realmGet$vehicles.get(i4), i3, i2, map));
            }
        }
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$permissions((RealmList<RentPermissions>) null);
        } else {
            RealmList<RentPermissions> realmGet$permissions = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$permissions();
            RealmList realmList2 = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$permissions(realmList2);
            int size2 = realmGet$permissions.size();
            for (int i5 = 0; i5 < size2; i5++) {
                realmList2.add(C4750xebfdbb8f.createDetachedCopy(realmGet$permissions.get(i5), i3, i2, map));
            }
        }
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$me(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$me());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$isVerified(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$isVerified());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface.realmSet$propertyId(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxyinterface2.realmGet$propertyId());
        return userProfile2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("UserProfile = proxy[");
        sb.append("{userdata:");
        Object obj = "null";
        sb.append(realmGet$userdata() != null ? C4784x85418d2d.ClassNameHelper.INTERNAL_CLASS_NAME : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{position:");
        sb.append(realmGet$position() != null ? C4782x594eae38.ClassNameHelper.INTERNAL_CLASS_NAME : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{vehicles:");
        sb.append("RealmList<UserVehicle>[");
        sb.append(realmGet$vehicles().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{permissions:");
        sb.append("RealmList<RentPermissions>[");
        sb.append(realmGet$permissions().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{me:");
        sb.append(realmGet$me() != null ? realmGet$me() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{isVerified:");
        sb.append(realmGet$isVerified() != null ? realmGet$isVerified() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{propertyId:");
        if (realmGet$propertyId() != null) {
            obj = realmGet$propertyId();
        }
        sb.append(obj);
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
        C4786xba887464 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxy = (C4786xba887464) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_userprofilerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
