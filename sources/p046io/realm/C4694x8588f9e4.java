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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domservice.DomServiceCategory;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceCategoryRealmProxy */
public class C4694x8588f9e4 extends DomServiceCategory implements RealmObjectProxy, C4695xc94f73b5 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DomServiceCategoryColumnInfo columnInfo;
    private ProxyState<DomServiceCategory> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceCategoryRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DomServiceCategory";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domservice_DomServiceCategoryRealmProxy$DomServiceCategoryColumnInfo */
    static final class DomServiceCategoryColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long nameIndex;
        long titleIndex;

        DomServiceCategoryColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DomServiceCategoryColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DomServiceCategoryColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DomServiceCategoryColumnInfo domServiceCategoryColumnInfo = (DomServiceCategoryColumnInfo) columnInfo;
            DomServiceCategoryColumnInfo domServiceCategoryColumnInfo2 = (DomServiceCategoryColumnInfo) columnInfo2;
            domServiceCategoryColumnInfo2.nameIndex = domServiceCategoryColumnInfo.nameIndex;
            domServiceCategoryColumnInfo2.titleIndex = domServiceCategoryColumnInfo.titleIndex;
            domServiceCategoryColumnInfo2.maxColumnIndexValue = domServiceCategoryColumnInfo.maxColumnIndexValue;
        }
    }

    C4694x8588f9e4() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DomServiceCategoryColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DomServiceCategoryColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DomServiceCategoryColumnInfo(osSchemaInfo);
    }

    public static DomServiceCategory createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        DomServiceCategory domServiceCategory = (DomServiceCategory) realm.createObjectInternal(DomServiceCategory.class, true, Collections.emptyList());
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return domServiceCategory;
    }

    public static DomServiceCategory createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DomServiceCategory domServiceCategory = new DomServiceCategory();
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (DomServiceCategory) realm.copyToRealm(domServiceCategory, new ImportFlag[0]);
    }

    private static C4694x8588f9e4 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class), false, Collections.emptyList());
        C4694x8588f9e4 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxy = new C4694x8588f9e4();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxy;
    }

    public static DomServiceCategory copyOrUpdate(Realm realm, DomServiceCategoryColumnInfo domServiceCategoryColumnInfo, DomServiceCategory domServiceCategory, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (domServiceCategory instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceCategory;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return domServiceCategory;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(domServiceCategory);
        if (realmObjectProxy2 != null) {
            return (DomServiceCategory) realmObjectProxy2;
        }
        return copy(realm, domServiceCategoryColumnInfo, domServiceCategory, z, map, set);
    }

    public static DomServiceCategory copy(Realm realm, DomServiceCategoryColumnInfo domServiceCategoryColumnInfo, DomServiceCategory domServiceCategory, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(domServiceCategory);
        if (realmObjectProxy != null) {
            return (DomServiceCategory) realmObjectProxy;
        }
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DomServiceCategory.class), domServiceCategoryColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(domServiceCategoryColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(domServiceCategoryColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$title());
        C4694x8588f9e4 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(domServiceCategory, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, DomServiceCategory domServiceCategory, Map<RealmModel, Long> map) {
        if (domServiceCategory instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceCategory;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DomServiceCategory.class);
        long nativePtr = table.getNativePtr();
        DomServiceCategoryColumnInfo domServiceCategoryColumnInfo = (DomServiceCategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class);
        long createRow = OsObject.createRow(table);
        map.put(domServiceCategory, Long.valueOf(createRow));
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DomServiceCategory.class);
        long nativePtr = table.getNativePtr();
        DomServiceCategoryColumnInfo domServiceCategoryColumnInfo = (DomServiceCategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class);
        while (it.hasNext()) {
            DomServiceCategory domServiceCategory = (DomServiceCategory) it.next();
            if (!map2.containsKey(domServiceCategory)) {
                if (domServiceCategory instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceCategory;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServiceCategory, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServiceCategory, Long.valueOf(createRow));
                C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DomServiceCategory domServiceCategory, Map<RealmModel, Long> map) {
        if (domServiceCategory instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceCategory;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DomServiceCategory.class);
        long nativePtr = table.getNativePtr();
        DomServiceCategoryColumnInfo domServiceCategoryColumnInfo = (DomServiceCategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class);
        long createRow = OsObject.createRow(table);
        map.put(domServiceCategory, Long.valueOf(createRow));
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceCategoryColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, domServiceCategoryColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DomServiceCategory.class);
        long nativePtr = table.getNativePtr();
        DomServiceCategoryColumnInfo domServiceCategoryColumnInfo = (DomServiceCategoryColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DomServiceCategory.class);
        while (it.hasNext()) {
            DomServiceCategory domServiceCategory = (DomServiceCategory) it.next();
            if (!map2.containsKey(domServiceCategory)) {
                if (domServiceCategory instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) domServiceCategory;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(domServiceCategory, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(domServiceCategory, Long.valueOf(createRow));
                C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceCategoryColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, domServiceCategoryColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, domServiceCategoryColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static DomServiceCategory createDetachedCopy(DomServiceCategory domServiceCategory, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DomServiceCategory domServiceCategory2;
        if (i > i2 || domServiceCategory == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(domServiceCategory);
        if (cacheData == null) {
            domServiceCategory2 = new DomServiceCategory();
            map.put(domServiceCategory, new RealmObjectProxy.CacheData(i, domServiceCategory2));
        } else if (i >= cacheData.minDepth) {
            return (DomServiceCategory) cacheData.object;
        } else {
            cacheData.minDepth = i;
            domServiceCategory2 = (DomServiceCategory) cacheData.object;
        }
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface = domServiceCategory2;
        C4695xc94f73b5 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface2 = domServiceCategory;
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxyinterface2.realmGet$title());
        return domServiceCategory2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DomServiceCategory = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() != null) {
            str = realmGet$title();
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
        C4694x8588f9e4 ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxy = (C4694x8588f9e4) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domservice_domservicecategoryrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
