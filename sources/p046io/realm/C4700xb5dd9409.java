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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceCategory;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceTariff;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServicesList;
import p046io.realm.BaseRealm;
import p046io.realm.C4694x8588f9e4;
import p046io.realm.C4698x9da95c4a;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServicesListRealmProxy */
public class C4700xb5dd9409 extends DomServicesList implements RealmObjectProxy, C4701x34257330 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DomServicesListColumnInfo columnInfo;
    private RealmList<DomServiceTariff> domServiceTariffRealmList;
    private ProxyState<DomServicesList> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServicesListRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DomServicesList";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServicesListRealmProxy$DomServicesListColumnInfo */
    static final class DomServicesListColumnInfo extends ColumnInfo {
        long domServiceCategoryIndex;
        long domServiceTariffIndex;
        long maxColumnIndexValue;

        DomServicesListColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.domServiceCategoryIndex = addColumnDetails("domServiceCategory", "domServiceCategory", objectSchemaInfo);
            this.domServiceTariffIndex = addColumnDetails("domServiceTariff", "domServiceTariff", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DomServicesListColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DomServicesListColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DomServicesListColumnInfo domServicesListColumnInfo = (DomServicesListColumnInfo) columnInfo;
            DomServicesListColumnInfo domServicesListColumnInfo2 = (DomServicesListColumnInfo) columnInfo2;
            domServicesListColumnInfo2.domServiceCategoryIndex = domServicesListColumnInfo.domServiceCategoryIndex;
            domServicesListColumnInfo2.domServiceTariffIndex = domServicesListColumnInfo.domServiceTariffIndex;
            domServicesListColumnInfo2.maxColumnIndexValue = domServicesListColumnInfo.maxColumnIndexValue;
        }
    }

    C4700xb5dd9409() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DomServicesListColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public DomServiceCategory realmGet$domServiceCategory() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.domServiceCategoryIndex)) {
            return null;
        }
        return (DomServiceCategory) this.proxyState.getRealm$realm().get(DomServiceCategory.class, this.proxyState.getRow$realm().getLink(this.columnInfo.domServiceCategoryIndex), false, Collections.emptyList());
    }

    public void realmSet$domServiceCategory(DomServiceCategory domServiceCategory) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (domServiceCategory == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.domServiceCategoryIndex);
                return;
            }
            this.proxyState.checkValidObject(domServiceCategory);
            this.proxyState.getRow$realm().setLink(this.columnInfo.domServiceCategoryIndex, ((RealmObjectProxy) domServiceCategory).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("domServiceCategory")) {
            if (domServiceCategory != null && !RealmObject.isManaged(domServiceCategory)) {
                domServiceCategory = (DomServiceCategory) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(domServiceCategory, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (domServiceCategory == null) {
                row$realm.nullifyLink(this.columnInfo.domServiceCategoryIndex);
                return;
            }
            this.proxyState.checkValidObject(domServiceCategory);
            row$realm.getTable().setLink(this.columnInfo.domServiceCategoryIndex, row$realm.getIndex(), ((RealmObjectProxy) domServiceCategory).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<DomServiceTariff> realmGet$domServiceTariff() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<DomServiceTariff> realmList = this.domServiceTariffRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.domServiceTariffRealmList = new RealmList<>(DomServiceTariff.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.domServiceTariffIndex), this.proxyState.getRealm$realm());
        return this.domServiceTariffRealmList;
    }

    public void realmSet$domServiceTariff(RealmList<DomServiceTariff> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("domServiceTariff")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<DomServiceTariff> realmList2 = new RealmList<>();
                Iterator<DomServiceTariff> it = realmList.iterator();
                while (it.hasNext()) {
                    DomServiceTariff next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.domServiceTariffIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    DomServiceTariff domServiceTariff = realmList.get(i);
                    this.proxyState.checkValidObject(domServiceTariff);
                    modelList.addRow(((RealmObjectProxy) domServiceTariff).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            DomServiceTariff domServiceTariff2 = realmList.get(i);
            this.proxyState.checkValidObject(domServiceTariff2);
            modelList.setRow((long) i, ((RealmObjectProxy) domServiceTariff2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedLinkProperty("domServiceCategory", RealmFieldType.OBJECT, C4694x8588f9e4.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("domServiceTariff", RealmFieldType.LIST, C4698x9da95c4a.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DomServicesListColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DomServicesListColumnInfo(osSchemaInfo);
    }

    public static DomServicesList createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("domServiceCategory")) {
            arrayList.add("domServiceCategory");
        }
        if (jSONObject.has("domServiceTariff")) {
            arrayList.add("domServiceTariff");
        }
        DomServicesList domServicesList = (DomServicesList) realm.createObjectInternal(DomServicesList.class, true, arrayList);
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
        if (jSONObject.has("domServiceCategory")) {
            if (jSONObject.isNull("domServiceCategory")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceCategory((DomServiceCategory) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceCategory(C4694x8588f9e4.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("domServiceCategory"), z));
            }
        }
        if (jSONObject.has("domServiceTariff")) {
            if (jSONObject.isNull("domServiceTariff")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceTariff((RealmList<DomServiceTariff>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("domServiceTariff");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff().add(C4698x9da95c4a.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return domServicesList;
    }

    public static DomServicesList createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DomServicesList domServicesList = new DomServicesList();
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("domServiceCategory")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceCategory((DomServiceCategory) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceCategory(C4694x8588f9e4.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("domServiceTariff")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceTariff((RealmList<DomServiceTariff>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceTariff(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff().add(C4698x9da95c4a.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (DomServicesList) realm.copyToRealm(domServicesList, new ImportFlag[0]);
    }

    private static C4700xb5dd9409 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServicesList.class), false, Collections.emptyList());
        C4700xb5dd9409 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxy = new C4700xb5dd9409();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxy;
    }

    public static DomServicesList copyOrUpdate(Realm realm, DomServicesListColumnInfo domServicesListColumnInfo, DomServicesList domServicesList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (domServicesList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServicesList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return domServicesList;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(domServicesList);
        if (realmObjectProxy2 != null) {
            return (DomServicesList) realmObjectProxy2;
        }
        return copy(realm, domServicesListColumnInfo, domServicesList, z, map, set);
    }

    public static DomServicesList copy(Realm realm, DomServicesListColumnInfo domServicesListColumnInfo, DomServicesList domServicesList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(domServicesList);
        if (realmObjectProxy != null) {
            return (DomServicesList) realmObjectProxy;
        }
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
        C4700xb5dd9409 newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(DomServicesList.class), domServicesListColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(domServicesList, newProxyInstance);
        DomServiceCategory realmGet$domServiceCategory = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceCategory();
        if (realmGet$domServiceCategory == null) {
            newProxyInstance.realmSet$domServiceCategory((DomServiceCategory) null);
        } else {
            DomServiceCategory domServiceCategory = (DomServiceCategory) map.get(realmGet$domServiceCategory);
            if (domServiceCategory != null) {
                newProxyInstance.realmSet$domServiceCategory(domServiceCategory);
            } else {
                newProxyInstance.realmSet$domServiceCategory(C4694x8588f9e4.copyOrUpdate(realm, (C4694x8588f9e4.DomServiceCategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class), realmGet$domServiceCategory, z, map, set));
            }
        }
        RealmList<DomServiceTariff> realmGet$domServiceTariff = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff();
        if (realmGet$domServiceTariff != null) {
            RealmList<DomServiceTariff> realmGet$domServiceTariff2 = newProxyInstance.realmGet$domServiceTariff();
            realmGet$domServiceTariff2.clear();
            for (int i = 0; i < realmGet$domServiceTariff.size(); i++) {
                DomServiceTariff domServiceTariff = realmGet$domServiceTariff.get(i);
                DomServiceTariff domServiceTariff2 = (DomServiceTariff) map.get(domServiceTariff);
                if (domServiceTariff2 != null) {
                    realmGet$domServiceTariff2.add(domServiceTariff2);
                } else {
                    realmGet$domServiceTariff2.add(C4698x9da95c4a.copyOrUpdate(realm, (C4698x9da95c4a.DomServiceTariffColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceTariff.class), domServiceTariff, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, DomServicesList domServicesList, Map<RealmModel, Long> map) {
        if (domServicesList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServicesList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DomServicesList.class);
        long nativePtr = table.getNativePtr();
        DomServicesListColumnInfo domServicesListColumnInfo = (DomServicesListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServicesList.class);
        long createRow = OsObject.createRow(table);
        map.put(domServicesList, Long.valueOf(createRow));
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
        DomServiceCategory realmGet$domServiceCategory = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceCategory();
        if (realmGet$domServiceCategory != null) {
            Long l = map.get(realmGet$domServiceCategory);
            if (l == null) {
                l = Long.valueOf(C4694x8588f9e4.insert(realm, realmGet$domServiceCategory, map));
            }
            Table.nativeSetLink(nativePtr, domServicesListColumnInfo.domServiceCategoryIndex, createRow, l.longValue(), false);
        }
        RealmList<DomServiceTariff> realmGet$domServiceTariff = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff();
        if (realmGet$domServiceTariff != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), domServicesListColumnInfo.domServiceTariffIndex);
            Iterator<DomServiceTariff> it = realmGet$domServiceTariff.iterator();
            while (it.hasNext()) {
                DomServiceTariff next = it.next();
                Long l2 = map.get(next);
                if (l2 == null) {
                    l2 = Long.valueOf(C4698x9da95c4a.insert(realm, next, map));
                }
                osList.addRow(l2.longValue());
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(DomServicesList.class);
        table.getNativePtr();
        DomServicesListColumnInfo domServicesListColumnInfo = (DomServicesListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServicesList.class);
        while (it.hasNext()) {
            DomServicesList domServicesList = (DomServicesList) it.next();
            if (!map.containsKey(domServicesList)) {
                if (domServicesList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServicesList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(domServicesList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(domServicesList, Long.valueOf(createRow));
                C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
                DomServiceCategory realmGet$domServiceCategory = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceCategory();
                if (realmGet$domServiceCategory != null) {
                    Long l = map.get(realmGet$domServiceCategory);
                    if (l == null) {
                        l = Long.valueOf(C4694x8588f9e4.insert(realm, realmGet$domServiceCategory, map));
                    }
                    table.setLink(domServicesListColumnInfo.domServiceCategoryIndex, createRow, l.longValue(), false);
                }
                RealmList<DomServiceTariff> realmGet$domServiceTariff = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff();
                if (realmGet$domServiceTariff != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), domServicesListColumnInfo.domServiceTariffIndex);
                    Iterator<DomServiceTariff> it2 = realmGet$domServiceTariff.iterator();
                    while (it2.hasNext()) {
                        DomServiceTariff next = it2.next();
                        Long l2 = map.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4698x9da95c4a.insert(realm, next, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DomServicesList domServicesList, Map<RealmModel, Long> map) {
        if (domServicesList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServicesList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DomServicesList.class);
        long nativePtr = table.getNativePtr();
        DomServicesListColumnInfo domServicesListColumnInfo = (DomServicesListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServicesList.class);
        long createRow = OsObject.createRow(table);
        map.put(domServicesList, Long.valueOf(createRow));
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
        DomServiceCategory realmGet$domServiceCategory = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceCategory();
        if (realmGet$domServiceCategory != null) {
            Long l = map.get(realmGet$domServiceCategory);
            if (l == null) {
                l = Long.valueOf(C4694x8588f9e4.insertOrUpdate(realm, realmGet$domServiceCategory, map));
            }
            Table.nativeSetLink(nativePtr, domServicesListColumnInfo.domServiceCategoryIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, domServicesListColumnInfo.domServiceCategoryIndex, createRow);
        }
        OsList osList = new OsList(table.getUncheckedRow(createRow), domServicesListColumnInfo.domServiceTariffIndex);
        RealmList<DomServiceTariff> realmGet$domServiceTariff = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff();
        if (realmGet$domServiceTariff == null || ((long) realmGet$domServiceTariff.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$domServiceTariff != null) {
                Iterator<DomServiceTariff> it = realmGet$domServiceTariff.iterator();
                while (it.hasNext()) {
                    DomServiceTariff next = it.next();
                    Long l2 = map.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4698x9da95c4a.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$domServiceTariff.size();
            for (int i = 0; i < size; i++) {
                DomServiceTariff domServiceTariff = realmGet$domServiceTariff.get(i);
                Long l3 = map.get(domServiceTariff);
                if (l3 == null) {
                    l3 = Long.valueOf(C4698x9da95c4a.insertOrUpdate(realm, domServiceTariff, map));
                }
                osList.setRow((long) i, l3.longValue());
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(DomServicesList.class);
        long nativePtr = table.getNativePtr();
        DomServicesListColumnInfo domServicesListColumnInfo = (DomServicesListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServicesList.class);
        while (it.hasNext()) {
            DomServicesList domServicesList = (DomServicesList) it.next();
            if (!map2.containsKey(domServicesList)) {
                if (domServicesList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServicesList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServicesList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServicesList, Long.valueOf(createRow));
                C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList;
                DomServiceCategory realmGet$domServiceCategory = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceCategory();
                if (realmGet$domServiceCategory != null) {
                    Long l = map2.get(realmGet$domServiceCategory);
                    if (l == null) {
                        l = Long.valueOf(C4694x8588f9e4.insertOrUpdate(realm2, realmGet$domServiceCategory, map2));
                    }
                    j = createRow;
                    Table.nativeSetLink(nativePtr, domServicesListColumnInfo.domServiceCategoryIndex, createRow, l.longValue(), false);
                } else {
                    j = createRow;
                    Table.nativeNullifyLink(nativePtr, domServicesListColumnInfo.domServiceCategoryIndex, j);
                }
                OsList osList = new OsList(table.getUncheckedRow(j), domServicesListColumnInfo.domServiceTariffIndex);
                RealmList<DomServiceTariff> realmGet$domServiceTariff = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmGet$domServiceTariff();
                if (realmGet$domServiceTariff == null || ((long) realmGet$domServiceTariff.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$domServiceTariff != null) {
                        Iterator<DomServiceTariff> it2 = realmGet$domServiceTariff.iterator();
                        while (it2.hasNext()) {
                            DomServiceTariff next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(C4698x9da95c4a.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$domServiceTariff.size();
                    for (int i = 0; i < size; i++) {
                        DomServiceTariff domServiceTariff = realmGet$domServiceTariff.get(i);
                        Long l3 = map2.get(domServiceTariff);
                        if (l3 == null) {
                            l3 = Long.valueOf(C4698x9da95c4a.insertOrUpdate(realm2, domServiceTariff, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                    }
                }
            }
        }
    }

    public static DomServicesList createDetachedCopy(DomServicesList domServicesList, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DomServicesList domServicesList2;
        if (i > i2 || domServicesList == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(domServicesList);
        if (cacheData == null) {
            domServicesList2 = new DomServicesList();
            map.put(domServicesList, new RealmObjectProxy.CacheData(i, domServicesList2));
        } else if (i >= cacheData.minDepth) {
            return (DomServicesList) cacheData.object;
        } else {
            cacheData.minDepth = i;
            domServicesList2 = (DomServicesList) cacheData.object;
        }
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface = domServicesList2;
        C4701x34257330 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface2 = domServicesList;
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceCategory(C4694x8588f9e4.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface2.realmGet$domServiceCategory(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceTariff((RealmList<DomServiceTariff>) null);
        } else {
            RealmList<DomServiceTariff> realmGet$domServiceTariff = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface2.realmGet$domServiceTariff();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxyinterface.realmSet$domServiceTariff(realmList);
            int size = realmGet$domServiceTariff.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4698x9da95c4a.createDetachedCopy(realmGet$domServiceTariff.get(i4), i3, i2, map));
            }
        }
        return domServicesList2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DomServicesList = proxy[");
        sb.append("{domServiceCategory:");
        sb.append(realmGet$domServiceCategory() != null ? C4694x8588f9e4.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{domServiceTariff:");
        sb.append("RealmList<DomServiceTariff>[");
        sb.append(realmGet$domServiceTariff().size());
        sb.append("]");
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
        C4700xb5dd9409 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxy = (C4700xb5dd9409) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domservice_domserviceslistrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
