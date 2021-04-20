package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserVehicleRealmProxy */
public class C4788xc3a2b227 extends UserVehicle implements RealmObjectProxy, C4789xfdd56d2 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private UserVehicleColumnInfo columnInfo;
    private ProxyState<UserVehicle> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserVehicleRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserVehicle";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_UserVehicleRealmProxy$UserVehicleColumnInfo */
    static final class UserVehicleColumnInfo extends ColumnInfo {
        long brandIndex;
        long commentIndex;
        long createdAtIndex;
        long deletedIndex;
        long idIndex;
        long maxColumnIndexValue;
        long numberIndex;
        long updatedAtIndex;
        long userDataIdIndex;

        UserVehicleColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.userDataIdIndex = addColumnDetails("userDataId", "userDataId", objectSchemaInfo);
            this.brandIndex = addColumnDetails(CardFragment.ARG_BRAND, CardFragment.ARG_BRAND, objectSchemaInfo);
            this.numberIndex = addColumnDetails(CardFragment.ARG_NUMBER, CardFragment.ARG_NUMBER, objectSchemaInfo);
            this.commentIndex = addColumnDetails("comment", "comment", objectSchemaInfo);
            this.createdAtIndex = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtIndex = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.deletedIndex = addColumnDetails("deleted", "deleted", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        UserVehicleColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new UserVehicleColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UserVehicleColumnInfo userVehicleColumnInfo = (UserVehicleColumnInfo) columnInfo;
            UserVehicleColumnInfo userVehicleColumnInfo2 = (UserVehicleColumnInfo) columnInfo2;
            userVehicleColumnInfo2.idIndex = userVehicleColumnInfo.idIndex;
            userVehicleColumnInfo2.userDataIdIndex = userVehicleColumnInfo.userDataIdIndex;
            userVehicleColumnInfo2.brandIndex = userVehicleColumnInfo.brandIndex;
            userVehicleColumnInfo2.numberIndex = userVehicleColumnInfo.numberIndex;
            userVehicleColumnInfo2.commentIndex = userVehicleColumnInfo.commentIndex;
            userVehicleColumnInfo2.createdAtIndex = userVehicleColumnInfo.createdAtIndex;
            userVehicleColumnInfo2.updatedAtIndex = userVehicleColumnInfo.updatedAtIndex;
            userVehicleColumnInfo2.deletedIndex = userVehicleColumnInfo.deletedIndex;
            userVehicleColumnInfo2.maxColumnIndexValue = userVehicleColumnInfo.maxColumnIndexValue;
        }
    }

    C4788xc3a2b227() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (UserVehicleColumnInfo) realmObjectContext.getColumnInfo();
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
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$userDataId() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.userDataIdIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.userDataIdIndex));
    }

    public void realmSet$userDataId(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userDataIdIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.userDataIdIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.userDataIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.userDataIdIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$brand() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.brandIndex);
    }

    public void realmSet$brand(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.brandIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.brandIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.brandIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.brandIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$number() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.numberIndex);
    }

    public void realmSet$number(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.numberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.numberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.numberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.numberIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.createdAtIndex);
    }

    public void realmSet$createdAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.createdAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.createdAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.createdAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.createdAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.updatedAtIndex);
    }

    public void realmSet$updatedAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.updatedAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.updatedAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.updatedAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.updatedAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$deleted() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.deletedIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.deletedIndex));
    }

    public void realmSet$deleted(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deletedIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.deletedIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.deletedIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.deletedIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 8, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("userDataId", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty(CardFragment.ARG_BRAND, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(CardFragment.ARG_NUMBER, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("comment", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("createdAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("updatedAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("deleted", RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserVehicleColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UserVehicleColumnInfo(osSchemaInfo);
    }

    public static UserVehicle createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        UserVehicle userVehicle = (UserVehicle) realm.createObjectInternal(UserVehicle.class, true, Collections.emptyList());
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$id((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$id(Integer.valueOf(jSONObject.getInt("id")));
            }
        }
        if (jSONObject.has("userDataId")) {
            if (jSONObject.isNull("userDataId")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$userDataId((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$userDataId(Integer.valueOf(jSONObject.getInt("userDataId")));
            }
        }
        if (jSONObject.has(CardFragment.ARG_BRAND)) {
            if (jSONObject.isNull(CardFragment.ARG_BRAND)) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$brand((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$brand(jSONObject.getString(CardFragment.ARG_BRAND));
            }
        }
        if (jSONObject.has(CardFragment.ARG_NUMBER)) {
            if (jSONObject.isNull(CardFragment.ARG_NUMBER)) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$number((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$number(jSONObject.getString(CardFragment.ARG_NUMBER));
            }
        }
        if (jSONObject.has("comment")) {
            if (jSONObject.isNull("comment")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$comment((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$comment(jSONObject.getString("comment"));
            }
        }
        if (jSONObject.has("createdAt")) {
            if (jSONObject.isNull("createdAt")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$createdAt((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$createdAt(jSONObject.getString("createdAt"));
            }
        }
        if (jSONObject.has("updatedAt")) {
            if (jSONObject.isNull("updatedAt")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$updatedAt((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$updatedAt(jSONObject.getString("updatedAt"));
            }
        }
        if (jSONObject.has("deleted")) {
            if (jSONObject.isNull("deleted")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$deleted((Boolean) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$deleted(Boolean.valueOf(jSONObject.getBoolean("deleted")));
            }
        }
        return userVehicle;
    }

    public static UserVehicle createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        UserVehicle userVehicle = new UserVehicle();
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (nextName.equals("userDataId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$userDataId(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$userDataId((Integer) null);
                }
            } else if (nextName.equals(CardFragment.ARG_BRAND)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$brand(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$brand((String) null);
                }
            } else if (nextName.equals(CardFragment.ARG_NUMBER)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$number(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$number((String) null);
                }
            } else if (nextName.equals("comment")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$comment(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$comment((String) null);
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$createdAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$createdAt((String) null);
                }
            } else if (nextName.equals("updatedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$updatedAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$updatedAt((String) null);
                }
            } else if (!nextName.equals("deleted")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$deleted(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$deleted((Boolean) null);
            }
        }
        jsonReader.endObject();
        return (UserVehicle) realm.copyToRealm(userVehicle, new ImportFlag[0]);
    }

    private static C4788xc3a2b227 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class), false, Collections.emptyList());
        C4788xc3a2b227 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxy = new C4788xc3a2b227();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxy;
    }

    public static UserVehicle copyOrUpdate(Realm realm, UserVehicleColumnInfo userVehicleColumnInfo, UserVehicle userVehicle, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (userVehicle instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userVehicle;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return userVehicle;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(userVehicle);
        if (realmObjectProxy2 != null) {
            return (UserVehicle) realmObjectProxy2;
        }
        return copy(realm, userVehicleColumnInfo, userVehicle, z, map, set);
    }

    public static UserVehicle copy(Realm realm, UserVehicleColumnInfo userVehicleColumnInfo, UserVehicle userVehicle, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(userVehicle);
        if (realmObjectProxy != null) {
            return (UserVehicle) realmObjectProxy;
        }
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(UserVehicle.class), userVehicleColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(userVehicleColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(userVehicleColumnInfo.userDataIdIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$userDataId());
        osObjectBuilder.addString(userVehicleColumnInfo.brandIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$brand());
        osObjectBuilder.addString(userVehicleColumnInfo.numberIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$number());
        osObjectBuilder.addString(userVehicleColumnInfo.commentIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$comment());
        osObjectBuilder.addString(userVehicleColumnInfo.createdAtIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addString(userVehicleColumnInfo.updatedAtIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$updatedAt());
        osObjectBuilder.addBoolean(userVehicleColumnInfo.deletedIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$deleted());
        C4788xc3a2b227 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(userVehicle, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, UserVehicle userVehicle, Map<RealmModel, Long> map) {
        UserVehicle userVehicle2 = userVehicle;
        if (userVehicle2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userVehicle2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UserVehicle.class);
        long nativePtr = table.getNativePtr();
        UserVehicleColumnInfo userVehicleColumnInfo = (UserVehicleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class);
        long createRow = OsObject.createRow(table);
        map.put(userVehicle2, Long.valueOf(createRow));
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, userVehicleColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        }
        Integer realmGet$userDataId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$userDataId();
        if (realmGet$userDataId != null) {
            Table.nativeSetLong(nativePtr, userVehicleColumnInfo.userDataIdIndex, createRow, realmGet$userDataId.longValue(), false);
        }
        String realmGet$brand = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$brand();
        if (realmGet$brand != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.brandIndex, createRow, realmGet$brand, false);
        }
        String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.numberIndex, createRow, realmGet$number, false);
        }
        String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.commentIndex, createRow, realmGet$comment, false);
        }
        String realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.createdAtIndex, createRow, realmGet$createdAt, false);
        }
        String realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.updatedAtIndex, createRow, realmGet$updatedAt, false);
        }
        Boolean realmGet$deleted = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$deleted();
        if (realmGet$deleted != null) {
            Table.nativeSetBoolean(nativePtr, userVehicleColumnInfo.deletedIndex, createRow, realmGet$deleted.booleanValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(UserVehicle.class);
        long nativePtr = table.getNativePtr();
        UserVehicleColumnInfo userVehicleColumnInfo = (UserVehicleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class);
        while (it.hasNext()) {
            UserVehicle userVehicle = (UserVehicle) it.next();
            if (!map2.containsKey(userVehicle)) {
                if (userVehicle instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userVehicle;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userVehicle, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(userVehicle, Long.valueOf(createRow));
                C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, userVehicleColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                }
                Integer realmGet$userDataId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$userDataId();
                if (realmGet$userDataId != null) {
                    Table.nativeSetLong(nativePtr, userVehicleColumnInfo.userDataIdIndex, createRow, realmGet$userDataId.longValue(), false);
                }
                String realmGet$brand = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$brand();
                if (realmGet$brand != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.brandIndex, createRow, realmGet$brand, false);
                }
                String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.numberIndex, createRow, realmGet$number, false);
                }
                String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.commentIndex, createRow, realmGet$comment, false);
                }
                String realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.createdAtIndex, createRow, realmGet$createdAt, false);
                }
                String realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.updatedAtIndex, createRow, realmGet$updatedAt, false);
                }
                Boolean realmGet$deleted = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$deleted();
                if (realmGet$deleted != null) {
                    Table.nativeSetBoolean(nativePtr, userVehicleColumnInfo.deletedIndex, createRow, realmGet$deleted.booleanValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, UserVehicle userVehicle, Map<RealmModel, Long> map) {
        UserVehicle userVehicle2 = userVehicle;
        if (userVehicle2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userVehicle2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(UserVehicle.class);
        long nativePtr = table.getNativePtr();
        UserVehicleColumnInfo userVehicleColumnInfo = (UserVehicleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class);
        long createRow = OsObject.createRow(table);
        map.put(userVehicle2, Long.valueOf(createRow));
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, userVehicleColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.idIndex, createRow, false);
        }
        Integer realmGet$userDataId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$userDataId();
        if (realmGet$userDataId != null) {
            Table.nativeSetLong(nativePtr, userVehicleColumnInfo.userDataIdIndex, createRow, realmGet$userDataId.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.userDataIdIndex, createRow, false);
        }
        String realmGet$brand = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$brand();
        if (realmGet$brand != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.brandIndex, createRow, realmGet$brand, false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.brandIndex, createRow, false);
        }
        String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.numberIndex, createRow, realmGet$number, false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.numberIndex, createRow, false);
        }
        String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$comment();
        if (realmGet$comment != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.commentIndex, createRow, realmGet$comment, false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.commentIndex, createRow, false);
        }
        String realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.createdAtIndex, createRow, realmGet$createdAt, false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.createdAtIndex, createRow, false);
        }
        String realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(nativePtr, userVehicleColumnInfo.updatedAtIndex, createRow, realmGet$updatedAt, false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.updatedAtIndex, createRow, false);
        }
        Boolean realmGet$deleted = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$deleted();
        if (realmGet$deleted != null) {
            Table.nativeSetBoolean(nativePtr, userVehicleColumnInfo.deletedIndex, createRow, realmGet$deleted.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, userVehicleColumnInfo.deletedIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(UserVehicle.class);
        long nativePtr = table.getNativePtr();
        UserVehicleColumnInfo userVehicleColumnInfo = (UserVehicleColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserVehicle.class);
        while (it.hasNext()) {
            UserVehicle userVehicle = (UserVehicle) it.next();
            if (!map2.containsKey(userVehicle)) {
                if (userVehicle instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) userVehicle;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(userVehicle, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(userVehicle, Long.valueOf(createRow));
                C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, userVehicleColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.idIndex, createRow, false);
                }
                Integer realmGet$userDataId = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$userDataId();
                if (realmGet$userDataId != null) {
                    Table.nativeSetLong(nativePtr, userVehicleColumnInfo.userDataIdIndex, createRow, realmGet$userDataId.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.userDataIdIndex, createRow, false);
                }
                String realmGet$brand = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$brand();
                if (realmGet$brand != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.brandIndex, createRow, realmGet$brand, false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.brandIndex, createRow, false);
                }
                String realmGet$number = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$number();
                if (realmGet$number != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.numberIndex, createRow, realmGet$number, false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.numberIndex, createRow, false);
                }
                String realmGet$comment = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$comment();
                if (realmGet$comment != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.commentIndex, createRow, realmGet$comment, false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.commentIndex, createRow, false);
                }
                String realmGet$createdAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.createdAtIndex, createRow, realmGet$createdAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.createdAtIndex, createRow, false);
                }
                String realmGet$updatedAt = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(nativePtr, userVehicleColumnInfo.updatedAtIndex, createRow, realmGet$updatedAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.updatedAtIndex, createRow, false);
                }
                Boolean realmGet$deleted = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmGet$deleted();
                if (realmGet$deleted != null) {
                    Table.nativeSetBoolean(nativePtr, userVehicleColumnInfo.deletedIndex, createRow, realmGet$deleted.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, userVehicleColumnInfo.deletedIndex, createRow, false);
                }
            }
        }
    }

    public static UserVehicle createDetachedCopy(UserVehicle userVehicle, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        UserVehicle userVehicle2;
        if (i > i2 || userVehicle == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(userVehicle);
        if (cacheData == null) {
            userVehicle2 = new UserVehicle();
            map.put(userVehicle, new RealmObjectProxy.CacheData(i, userVehicle2));
        } else if (i >= cacheData.minDepth) {
            return (UserVehicle) cacheData.object;
        } else {
            cacheData.minDepth = i;
            userVehicle2 = (UserVehicle) cacheData.object;
        }
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface = userVehicle2;
        C4789xfdd56d2 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2 = userVehicle;
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$userDataId(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$userDataId());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$brand(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$brand());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$number(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$number());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$comment(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$comment());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$createdAt(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$createdAt());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$updatedAt(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$updatedAt());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface.realmSet$deleted(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxyinterface2.realmGet$deleted());
        return userVehicle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UserVehicle = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{id:"
            r0.append(r1)
            java.lang.Integer r1 = r5.realmGet$id()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.Integer r1 = r5.realmGet$id()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{userDataId:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$userDataId()
            if (r4 == 0) goto L_0x0043
            java.lang.Integer r4 = r5.realmGet$userDataId()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{brand:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$brand()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.realmGet$brand()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{number:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$number()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$number()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{comment:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$comment()
            if (r4 == 0) goto L_0x0094
            java.lang.String r4 = r5.realmGet$comment()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{createdAt:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$createdAt()
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r5.realmGet$createdAt()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{updatedAt:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$updatedAt()
            if (r4 == 0) goto L_0x00ca
            java.lang.String r4 = r5.realmGet$updatedAt()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "{deleted:"
            r0.append(r3)
            java.lang.Boolean r3 = r5.realmGet$deleted()
            if (r3 == 0) goto L_0x00e4
            java.lang.Boolean r2 = r5.realmGet$deleted()
        L_0x00e4:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4788xc3a2b227.toString():java.lang.String");
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
        C4788xc3a2b227 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxy = (C4788xc3a2b227) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_uservehiclerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
