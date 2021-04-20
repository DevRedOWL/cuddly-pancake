package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactData;
import p046io.realm.BaseRealm;
import p046io.realm.C4786xba887464;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataRealmProxy */
public class C4792xa984038c extends ContactData implements RealmObjectProxy, C4793xd4e0c70d {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ContactDataColumnInfo columnInfo;
    private ProxyState<ContactData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ContactData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataRealmProxy$ContactDataColumnInfo */
    static final class ContactDataColumnInfo extends ColumnInfo {
        long employeeIndex;
        long maxColumnIndexValue;

        ContactDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.employeeIndex = addColumnDetails("employee", "employee", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ContactDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ContactDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ContactDataColumnInfo contactDataColumnInfo = (ContactDataColumnInfo) columnInfo;
            ContactDataColumnInfo contactDataColumnInfo2 = (ContactDataColumnInfo) columnInfo2;
            contactDataColumnInfo2.employeeIndex = contactDataColumnInfo.employeeIndex;
            contactDataColumnInfo2.maxColumnIndexValue = contactDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4792xa984038c() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ContactDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public UserProfile realmGet$employee() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.employeeIndex)) {
            return null;
        }
        return (UserProfile) this.proxyState.getRealm$realm().get(UserProfile.class, this.proxyState.getRow$realm().getLink(this.columnInfo.employeeIndex), false, Collections.emptyList());
    }

    public void realmSet$employee(UserProfile userProfile) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (userProfile == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.employeeIndex);
                return;
            }
            this.proxyState.checkValidObject(userProfile);
            this.proxyState.getRow$realm().setLink(this.columnInfo.employeeIndex, ((RealmObjectProxy) userProfile).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("employee")) {
            if (userProfile != null && !RealmObject.isManaged(userProfile)) {
                userProfile = (UserProfile) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(userProfile, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (userProfile == null) {
                row$realm.nullifyLink(this.columnInfo.employeeIndex);
                return;
            }
            this.proxyState.checkValidObject(userProfile);
            row$realm.getTable().setLink(this.columnInfo.employeeIndex, row$realm.getIndex(), ((RealmObjectProxy) userProfile).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty("employee", RealmFieldType.OBJECT, C4786xba887464.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ContactDataColumnInfo(osSchemaInfo);
    }

    public static ContactData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("employee")) {
            arrayList.add("employee");
        }
        ContactData contactData = (ContactData) realm.createObjectInternal(ContactData.class, true, arrayList);
        C4793xd4e0c70d ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxyinterface = contactData;
        if (jSONObject.has("employee")) {
            if (jSONObject.isNull("employee")) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxyinterface.realmSet$employee((UserProfile) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxyinterface.realmSet$employee(C4786xba887464.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("employee"), z));
            }
        }
        return contactData;
    }

    public static ContactData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ContactData contactData = new ContactData();
        C4793xd4e0c70d ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxyinterface = contactData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("employee")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxyinterface.realmSet$employee((UserProfile) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxyinterface.realmSet$employee(C4786xba887464.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (ContactData) realm.copyToRealm(contactData, new ImportFlag[0]);
    }

    private static C4792xa984038c newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactData.class), false, Collections.emptyList());
        C4792xa984038c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxy = new C4792xa984038c();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxy;
    }

    public static ContactData copyOrUpdate(Realm realm, ContactDataColumnInfo contactDataColumnInfo, ContactData contactData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (contactData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return contactData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(contactData);
        if (realmObjectProxy2 != null) {
            return (ContactData) realmObjectProxy2;
        }
        return copy(realm, contactDataColumnInfo, contactData, z, map, set);
    }

    public static ContactData copy(Realm realm, ContactDataColumnInfo contactDataColumnInfo, ContactData contactData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(contactData);
        if (realmObjectProxy != null) {
            return (ContactData) realmObjectProxy;
        }
        C4792xa984038c newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(ContactData.class), contactDataColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(contactData, newProxyInstance);
        UserProfile realmGet$employee = contactData.realmGet$employee();
        if (realmGet$employee == null) {
            newProxyInstance.realmSet$employee((UserProfile) null);
        } else {
            UserProfile userProfile = (UserProfile) map.get(realmGet$employee);
            if (userProfile != null) {
                newProxyInstance.realmSet$employee(userProfile);
            } else {
                newProxyInstance.realmSet$employee(C4786xba887464.copyOrUpdate(realm, (C4786xba887464.UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class), realmGet$employee, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ContactData contactData, Map<RealmModel, Long> map) {
        if (contactData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ContactData.class);
        long nativePtr = table.getNativePtr();
        ContactDataColumnInfo contactDataColumnInfo = (ContactDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactData.class);
        long createRow = OsObject.createRow(table);
        map.put(contactData, Long.valueOf(createRow));
        UserProfile realmGet$employee = contactData.realmGet$employee();
        if (realmGet$employee != null) {
            Long l = map.get(realmGet$employee);
            if (l == null) {
                l = Long.valueOf(C4786xba887464.insert(realm, realmGet$employee, map));
            }
            Table.nativeSetLink(nativePtr, contactDataColumnInfo.employeeIndex, createRow, l.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ContactData.class);
        table.getNativePtr();
        ContactDataColumnInfo contactDataColumnInfo = (ContactDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactData.class);
        while (it.hasNext()) {
            ContactData contactData = (ContactData) it.next();
            if (!map.containsKey(contactData)) {
                if (contactData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(contactData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(contactData, Long.valueOf(createRow));
                UserProfile realmGet$employee = contactData.realmGet$employee();
                if (realmGet$employee != null) {
                    Long l = map.get(realmGet$employee);
                    if (l == null) {
                        l = Long.valueOf(C4786xba887464.insert(realm, realmGet$employee, map));
                    }
                    table.setLink(contactDataColumnInfo.employeeIndex, createRow, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ContactData contactData, Map<RealmModel, Long> map) {
        if (contactData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ContactData.class);
        long nativePtr = table.getNativePtr();
        ContactDataColumnInfo contactDataColumnInfo = (ContactDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactData.class);
        long createRow = OsObject.createRow(table);
        map.put(contactData, Long.valueOf(createRow));
        UserProfile realmGet$employee = contactData.realmGet$employee();
        if (realmGet$employee != null) {
            Long l = map.get(realmGet$employee);
            if (l == null) {
                l = Long.valueOf(C4786xba887464.insertOrUpdate(realm, realmGet$employee, map));
            }
            Table.nativeSetLink(nativePtr, contactDataColumnInfo.employeeIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, contactDataColumnInfo.employeeIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ContactData.class);
        long nativePtr = table.getNativePtr();
        ContactDataColumnInfo contactDataColumnInfo = (ContactDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactData.class);
        while (it.hasNext()) {
            ContactData contactData = (ContactData) it.next();
            if (!map.containsKey(contactData)) {
                if (contactData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(contactData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(contactData, Long.valueOf(createRow));
                UserProfile realmGet$employee = contactData.realmGet$employee();
                if (realmGet$employee != null) {
                    Long l = map.get(realmGet$employee);
                    if (l == null) {
                        l = Long.valueOf(C4786xba887464.insertOrUpdate(realm, realmGet$employee, map));
                    }
                    Table.nativeSetLink(nativePtr, contactDataColumnInfo.employeeIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, contactDataColumnInfo.employeeIndex, createRow);
                }
            }
        }
    }

    public static ContactData createDetachedCopy(ContactData contactData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ContactData contactData2;
        if (i > i2 || contactData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(contactData);
        if (cacheData == null) {
            contactData2 = new ContactData();
            map.put(contactData, new RealmObjectProxy.CacheData(i, contactData2));
        } else if (i >= cacheData.minDepth) {
            return (ContactData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            contactData2 = (ContactData) cacheData.object;
        }
        contactData2.realmSet$employee(C4786xba887464.createDetachedCopy(contactData.realmGet$employee(), i + 1, i2, map));
        return contactData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ContactData = proxy[");
        sb.append("{employee:");
        sb.append(realmGet$employee() != null ? C4786xba887464.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
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
        C4792xa984038c ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxy = (C4792xa984038c) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
