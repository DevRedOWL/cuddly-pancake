package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p046io.realm.BaseRealm;
import p046io.realm.C4786xba887464;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy */
public class C4780xf0c1c3b9 extends ProfileData implements RealmObjectProxy, C4781x6803e980 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ProfileDataColumnInfo columnInfo;
    private ProxyState<ProfileData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ProfileData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy$ProfileDataColumnInfo */
    static final class ProfileDataColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long profileIndex;

        ProfileDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.profileIndex = addColumnDetails("profile", "profile", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ProfileDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ProfileDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ProfileDataColumnInfo profileDataColumnInfo = (ProfileDataColumnInfo) columnInfo;
            ProfileDataColumnInfo profileDataColumnInfo2 = (ProfileDataColumnInfo) columnInfo2;
            profileDataColumnInfo2.idIndex = profileDataColumnInfo.idIndex;
            profileDataColumnInfo2.profileIndex = profileDataColumnInfo.profileIndex;
            profileDataColumnInfo2.maxColumnIndexValue = profileDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4780xf0c1c3b9() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ProfileDataColumnInfo) realmObjectContext.getColumnInfo();
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

    public UserProfile realmGet$profile() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.profileIndex)) {
            return null;
        }
        return (UserProfile) this.proxyState.getRealm$realm().get(UserProfile.class, this.proxyState.getRow$realm().getLink(this.columnInfo.profileIndex), false, Collections.emptyList());
    }

    public void realmSet$profile(UserProfile userProfile) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (userProfile == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.profileIndex);
                return;
            }
            this.proxyState.checkValidObject(userProfile);
            this.proxyState.getRow$realm().setLink(this.columnInfo.profileIndex, ((RealmObjectProxy) userProfile).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("profile")) {
            if (userProfile != null && !RealmObject.isManaged(userProfile)) {
                userProfile = (UserProfile) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(userProfile, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (userProfile == null) {
                row$realm.nullifyLink(this.columnInfo.profileIndex);
                return;
            }
            this.proxyState.checkValidObject(userProfile);
            row$realm.getTable().setLink(this.columnInfo.profileIndex, row$realm.getIndex(), ((RealmObjectProxy) userProfile).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder.addPersistedLinkProperty("profile", RealmFieldType.OBJECT, C4786xba887464.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ProfileDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ProfileDataColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "id"
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r3 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy$ProfileDataColumnInfo r2 = (p046io.realm.C4780xf0c1c3b9.ProfileDataColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r12)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            long r4 = r15.getLong(r12)
            long r2 = r1.findFirstLong(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r11
        L_0x006c:
            java.lang.String r2 = "profile"
            if (r1 != 0) goto L_0x00a7
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r12)
            if (r1 == 0) goto L_0x009f
            boolean r1 = r15.isNull(r12)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy r1 = (p046io.realm.C4780xf0c1c3b9) r1
            goto L_0x00a7
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r1 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            int r3 = r15.getInt(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy r1 = (p046io.realm.C4780xf0c1c3b9) r1
            goto L_0x00a7
        L_0x009f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            r3 = r1
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxyInterface r3 = (p046io.realm.C4781x6803e980) r3
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00c5
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00ba
            r3.realmSet$profile(r11)
            goto L_0x00c5
        L_0x00ba:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile r0 = p046io.realm.C4786xba887464.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$profile(r0)
        L_0x00c5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4780xf0c1c3b9.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData");
    }

    public static ProfileData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ProfileData profileData = new ProfileData();
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (!nextName.equals("profile")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmSet$profile((UserProfile) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmSet$profile(C4786xba887464.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (ProfileData) realm.copyToRealm(profileData, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static C4780xf0c1c3b9 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileData.class), false, Collections.emptyList());
        C4780xf0c1c3b9 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxy = new C4780xf0c1c3b9();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData copyOrUpdate(p046io.realm.Realm r8, p046io.realm.C4780xf0c1c3b9.ProfileDataColumnInfo r9, p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData r1 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData> r2 = p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.ProfileData.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxyInterface r5 = (p046io.realm.C4781x6803e980) r5
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
            io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy r1 = new io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy     // Catch:{ all -> 0x0092 }
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
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.C4780xf0c1c3b9.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_ProfileDataRealmProxy$ProfileDataColumnInfo, ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.ProfileData");
    }

    public static ProfileData copy(Realm realm, ProfileDataColumnInfo profileDataColumnInfo, ProfileData profileData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(profileData);
        if (realmObjectProxy != null) {
            return (ProfileData) realmObjectProxy;
        }
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ProfileData.class), profileDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(profileDataColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id());
        C4780xf0c1c3b9 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(profileData, newProxyInstance);
        UserProfile realmGet$profile = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$profile();
        if (realmGet$profile == null) {
            newProxyInstance.realmSet$profile((UserProfile) null);
        } else {
            UserProfile userProfile = (UserProfile) map.get(realmGet$profile);
            if (userProfile != null) {
                newProxyInstance.realmSet$profile(userProfile);
            } else {
                newProxyInstance.realmSet$profile(C4786xba887464.copyOrUpdate(realm, (C4786xba887464.UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class), realmGet$profile, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ProfileData profileData, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        ProfileData profileData2 = profileData;
        Map<RealmModel, Long> map2 = map;
        if (profileData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ProfileData.class);
        long nativePtr = table.getNativePtr();
        ProfileDataColumnInfo profileDataColumnInfo = (ProfileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileData.class);
        long j3 = profileDataColumnInfo.idIndex;
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(profileData2, Long.valueOf(j2));
        UserProfile realmGet$profile = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$profile();
        if (realmGet$profile != null) {
            Long l = map2.get(realmGet$profile);
            if (l == null) {
                l = Long.valueOf(C4786xba887464.insert(realm2, realmGet$profile, map2));
            }
            Table.nativeSetLink(nativePtr, profileDataColumnInfo.profileIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ProfileData.class);
        long nativePtr = table.getNativePtr();
        ProfileDataColumnInfo profileDataColumnInfo = (ProfileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileData.class);
        long j2 = profileDataColumnInfo.idIndex;
        while (it.hasNext()) {
            ProfileData profileData = (ProfileData) it.next();
            if (!map2.containsKey(profileData)) {
                if (profileData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(profileData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j3 = j;
                map2.put(profileData, Long.valueOf(j3));
                UserProfile realmGet$profile = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$profile();
                if (realmGet$profile != null) {
                    Long l = map2.get(realmGet$profile);
                    if (l == null) {
                        l = Long.valueOf(C4786xba887464.insert(realm2, realmGet$profile, map2));
                    }
                    table.setLink(profileDataColumnInfo.profileIndex, j3, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ProfileData profileData, Map<RealmModel, Long> map) {
        long j;
        if (profileData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ProfileData.class);
        long nativePtr = table.getNativePtr();
        ProfileDataColumnInfo profileDataColumnInfo = (ProfileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileData.class);
        long j2 = profileDataColumnInfo.idIndex;
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData;
        if (ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id()) : j;
        map.put(profileData, Long.valueOf(createRowWithPrimaryKey));
        UserProfile realmGet$profile = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$profile();
        if (realmGet$profile != null) {
            Long l = map.get(realmGet$profile);
            if (l == null) {
                l = Long.valueOf(C4786xba887464.insertOrUpdate(realm, realmGet$profile, map));
            }
            Table.nativeSetLink(nativePtr, profileDataColumnInfo.profileIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, profileDataColumnInfo.profileIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ProfileData.class);
        long nativePtr = table.getNativePtr();
        ProfileDataColumnInfo profileDataColumnInfo = (ProfileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ProfileData.class);
        long j3 = profileDataColumnInfo.idIndex;
        while (it.hasNext()) {
            ProfileData profileData = (ProfileData) it.next();
            if (!map2.containsKey(profileData)) {
                if (profileData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) profileData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(profileData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData;
                if (ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(profileData, Long.valueOf(j4));
                UserProfile realmGet$profile = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmGet$profile();
                if (realmGet$profile != null) {
                    Long l = map2.get(realmGet$profile);
                    if (l == null) {
                        l = Long.valueOf(C4786xba887464.insertOrUpdate(realm2, realmGet$profile, map2));
                    }
                    j2 = j3;
                    Table.nativeSetLink(nativePtr, profileDataColumnInfo.profileIndex, j4, l.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeNullifyLink(nativePtr, profileDataColumnInfo.profileIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static ProfileData createDetachedCopy(ProfileData profileData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ProfileData profileData2;
        if (i > i2 || profileData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(profileData);
        if (cacheData == null) {
            profileData2 = new ProfileData();
            map.put(profileData, new RealmObjectProxy.CacheData(i, profileData2));
        } else if (i >= cacheData.minDepth) {
            return (ProfileData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            profileData2 = (ProfileData) cacheData.object;
        }
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData2;
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface2 = profileData;
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface.realmSet$profile(C4786xba887464.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface2.realmGet$profile(), i + 1, i2, map));
        return profileData2;
    }

    static ProfileData update(Realm realm, ProfileDataColumnInfo profileDataColumnInfo, ProfileData profileData, ProfileData profileData2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface = profileData;
        C4781x6803e980 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface2 = profileData2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ProfileData.class), profileDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(profileDataColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface2.realmGet$id());
        UserProfile realmGet$profile = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxyinterface2.realmGet$profile();
        if (realmGet$profile == null) {
            osObjectBuilder.addNull(profileDataColumnInfo.profileIndex);
        } else {
            UserProfile userProfile = (UserProfile) map.get(realmGet$profile);
            if (userProfile != null) {
                osObjectBuilder.addObject(profileDataColumnInfo.profileIndex, userProfile);
            } else {
                osObjectBuilder.addObject(profileDataColumnInfo.profileIndex, C4786xba887464.copyOrUpdate(realm, (C4786xba887464.UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class), realmGet$profile, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return profileData;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ProfileData = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{profile:");
        if (realmGet$profile() != null) {
            str = C4786xba887464.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        C4780xf0c1c3b9 ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxy = (C4780xf0c1c3b9) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_kotlin_profiledatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
