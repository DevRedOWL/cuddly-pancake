package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my_team.ContactDataList;
import p046io.realm.BaseRealm;
import p046io.realm.C4786xba887464;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataListRealmProxy */
public class C4790xe661e44a extends ContactDataList implements RealmObjectProxy, C4791x5220dc0f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ContactDataListColumnInfo columnInfo;
    private RealmList<UserProfile> itemsRealmList;
    private ProxyState<ContactDataList> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataListRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ContactDataList";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_ContactDataListRealmProxy$ContactDataListColumnInfo */
    static final class ContactDataListColumnInfo extends ColumnInfo {
        long itemsIndex;
        long maxColumnIndexValue;

        ContactDataListColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.itemsIndex = addColumnDetails(FirebaseAnalytics.Param.ITEMS, FirebaseAnalytics.Param.ITEMS, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ContactDataListColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ContactDataListColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ContactDataListColumnInfo contactDataListColumnInfo = (ContactDataListColumnInfo) columnInfo;
            ContactDataListColumnInfo contactDataListColumnInfo2 = (ContactDataListColumnInfo) columnInfo2;
            contactDataListColumnInfo2.itemsIndex = contactDataListColumnInfo.itemsIndex;
            contactDataListColumnInfo2.maxColumnIndexValue = contactDataListColumnInfo.maxColumnIndexValue;
        }
    }

    C4790xe661e44a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ContactDataListColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RealmList<UserProfile> realmGet$items() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<UserProfile> realmList = this.itemsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.itemsRealmList = new RealmList<>(UserProfile.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.itemsIndex), this.proxyState.getRealm$realm());
        return this.itemsRealmList;
    }

    public void realmSet$items(RealmList<UserProfile> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains(FirebaseAnalytics.Param.ITEMS)) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<UserProfile> realmList2 = new RealmList<>();
                Iterator<UserProfile> it = realmList.iterator();
                while (it.hasNext()) {
                    UserProfile next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.itemsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    UserProfile userProfile = realmList.get(i);
                    this.proxyState.checkValidObject(userProfile);
                    modelList.addRow(((RealmObjectProxy) userProfile).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            UserProfile userProfile2 = realmList.get(i);
            this.proxyState.checkValidObject(userProfile2);
            modelList.setRow((long) i, ((RealmObjectProxy) userProfile2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty(FirebaseAnalytics.Param.ITEMS, RealmFieldType.LIST, C4786xba887464.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ContactDataListColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ContactDataListColumnInfo(osSchemaInfo);
    }

    public static ContactDataList createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has(FirebaseAnalytics.Param.ITEMS)) {
            arrayList.add(FirebaseAnalytics.Param.ITEMS);
        }
        ContactDataList contactDataList = (ContactDataList) realm.createObjectInternal(ContactDataList.class, true, arrayList);
        C4791x5220dc0f ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface = contactDataList;
        if (jSONObject.has(FirebaseAnalytics.Param.ITEMS)) {
            if (jSONObject.isNull(FirebaseAnalytics.Param.ITEMS)) {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmSet$items((RealmList<UserProfile>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmGet$items().clear();
                JSONArray jSONArray = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmGet$items().add(C4786xba887464.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return contactDataList;
    }

    public static ContactDataList createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ContactDataList contactDataList = new ContactDataList();
        C4791x5220dc0f ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface = contactDataList;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals(FirebaseAnalytics.Param.ITEMS)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmSet$items((RealmList<UserProfile>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmSet$items(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmGet$items().add(C4786xba887464.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (ContactDataList) realm.copyToRealm(contactDataList, new ImportFlag[0]);
    }

    private static C4790xe661e44a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactDataList.class), false, Collections.emptyList());
        C4790xe661e44a ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxy = new C4790xe661e44a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxy;
    }

    public static ContactDataList copyOrUpdate(Realm realm, ContactDataListColumnInfo contactDataListColumnInfo, ContactDataList contactDataList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (contactDataList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactDataList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return contactDataList;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(contactDataList);
        if (realmObjectProxy2 != null) {
            return (ContactDataList) realmObjectProxy2;
        }
        return copy(realm, contactDataListColumnInfo, contactDataList, z, map, set);
    }

    public static ContactDataList copy(Realm realm, ContactDataListColumnInfo contactDataListColumnInfo, ContactDataList contactDataList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(contactDataList);
        if (realmObjectProxy != null) {
            return (ContactDataList) realmObjectProxy;
        }
        C4790xe661e44a newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(ContactDataList.class), contactDataListColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(contactDataList, newProxyInstance);
        RealmList<UserProfile> realmGet$items = contactDataList.realmGet$items();
        if (realmGet$items != null) {
            RealmList<UserProfile> realmGet$items2 = newProxyInstance.realmGet$items();
            realmGet$items2.clear();
            for (int i = 0; i < realmGet$items.size(); i++) {
                UserProfile userProfile = realmGet$items.get(i);
                UserProfile userProfile2 = (UserProfile) map.get(userProfile);
                if (userProfile2 != null) {
                    realmGet$items2.add(userProfile2);
                } else {
                    realmGet$items2.add(C4786xba887464.copyOrUpdate(realm, (C4786xba887464.UserProfileColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) UserProfile.class), userProfile, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ContactDataList contactDataList, Map<RealmModel, Long> map) {
        if (contactDataList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactDataList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ContactDataList.class);
        table.getNativePtr();
        ContactDataListColumnInfo contactDataListColumnInfo = (ContactDataListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactDataList.class);
        long createRow = OsObject.createRow(table);
        map.put(contactDataList, Long.valueOf(createRow));
        RealmList<UserProfile> realmGet$items = contactDataList.realmGet$items();
        if (realmGet$items != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), contactDataListColumnInfo.itemsIndex);
            Iterator<UserProfile> it = realmGet$items.iterator();
            while (it.hasNext()) {
                UserProfile next = it.next();
                Long l = map.get(next);
                if (l == null) {
                    l = Long.valueOf(C4786xba887464.insert(realm, next, map));
                }
                osList.addRow(l.longValue());
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ContactDataList.class);
        table.getNativePtr();
        ContactDataListColumnInfo contactDataListColumnInfo = (ContactDataListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactDataList.class);
        while (it.hasNext()) {
            ContactDataList contactDataList = (ContactDataList) it.next();
            if (!map.containsKey(contactDataList)) {
                if (contactDataList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactDataList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(contactDataList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(contactDataList, Long.valueOf(createRow));
                RealmList<UserProfile> realmGet$items = contactDataList.realmGet$items();
                if (realmGet$items != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), contactDataListColumnInfo.itemsIndex);
                    Iterator<UserProfile> it2 = realmGet$items.iterator();
                    while (it2.hasNext()) {
                        UserProfile next = it2.next();
                        Long l = map.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4786xba887464.insert(realm, next, map));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ContactDataList contactDataList, Map<RealmModel, Long> map) {
        if (contactDataList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactDataList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ContactDataList.class);
        table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(contactDataList, Long.valueOf(createRow));
        OsList osList = new OsList(table.getUncheckedRow(createRow), ((ContactDataListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactDataList.class)).itemsIndex);
        RealmList<UserProfile> realmGet$items = contactDataList.realmGet$items();
        if (realmGet$items == null || ((long) realmGet$items.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$items != null) {
                Iterator<UserProfile> it = realmGet$items.iterator();
                while (it.hasNext()) {
                    UserProfile next = it.next();
                    Long l = map.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4786xba887464.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$items.size();
            for (int i = 0; i < size; i++) {
                UserProfile userProfile = realmGet$items.get(i);
                Long l2 = map.get(userProfile);
                if (l2 == null) {
                    l2 = Long.valueOf(C4786xba887464.insertOrUpdate(realm, userProfile, map));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ContactDataList.class);
        table.getNativePtr();
        ContactDataListColumnInfo contactDataListColumnInfo = (ContactDataListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ContactDataList.class);
        while (it.hasNext()) {
            ContactDataList contactDataList = (ContactDataList) it.next();
            if (!map.containsKey(contactDataList)) {
                if (contactDataList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) contactDataList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(contactDataList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(contactDataList, Long.valueOf(createRow));
                OsList osList = new OsList(table.getUncheckedRow(createRow), contactDataListColumnInfo.itemsIndex);
                RealmList<UserProfile> realmGet$items = contactDataList.realmGet$items();
                if (realmGet$items == null || ((long) realmGet$items.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$items != null) {
                        Iterator<UserProfile> it2 = realmGet$items.iterator();
                        while (it2.hasNext()) {
                            UserProfile next = it2.next();
                            Long l = map.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4786xba887464.insertOrUpdate(realm, next, map));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$items.size();
                    for (int i = 0; i < size; i++) {
                        UserProfile userProfile = realmGet$items.get(i);
                        Long l2 = map.get(userProfile);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4786xba887464.insertOrUpdate(realm, userProfile, map));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static ContactDataList createDetachedCopy(ContactDataList contactDataList, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ContactDataList contactDataList2;
        if (i > i2 || contactDataList == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(contactDataList);
        if (cacheData == null) {
            contactDataList2 = new ContactDataList();
            map.put(contactDataList, new RealmObjectProxy.CacheData(i, contactDataList2));
        } else if (i >= cacheData.minDepth) {
            return (ContactDataList) cacheData.object;
        } else {
            cacheData.minDepth = i;
            contactDataList2 = (ContactDataList) cacheData.object;
        }
        C4791x5220dc0f ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface = contactDataList2;
        C4791x5220dc0f ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface2 = contactDataList;
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmSet$items((RealmList<UserProfile>) null);
        } else {
            RealmList<UserProfile> realmGet$items = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface2.realmGet$items();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxyinterface.realmSet$items(realmList);
            int i3 = i + 1;
            int size = realmGet$items.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4786xba887464.createDetachedCopy(realmGet$items.get(i4), i3, i2, map));
            }
        }
        return contactDataList2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "ContactDataList = proxy[" + "{items:" + "RealmList<UserProfile>[" + realmGet$items().size() + "]" + "}" + "]";
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
        C4790xe661e44a ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxy = (C4790xe661e44a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_profile_my_team_contactdatalistrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
