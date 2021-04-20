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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.RentAttributes;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_RentAttributesRealmProxy */
public class C4794x165b0474 extends RentAttributes implements RealmObjectProxy, C4795x4c784b25 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentAttributesColumnInfo columnInfo;
    private ProxyState<RentAttributes> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_RentAttributesRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentAttributes";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_RentAttributesRealmProxy$RentAttributesColumnInfo */
    static final class RentAttributesColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;
        long valueIndex;

        RentAttributesColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentAttributesColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentAttributesColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentAttributesColumnInfo rentAttributesColumnInfo = (RentAttributesColumnInfo) columnInfo;
            RentAttributesColumnInfo rentAttributesColumnInfo2 = (RentAttributesColumnInfo) columnInfo2;
            rentAttributesColumnInfo2.titleIndex = rentAttributesColumnInfo.titleIndex;
            rentAttributesColumnInfo2.valueIndex = rentAttributesColumnInfo.valueIndex;
            rentAttributesColumnInfo2.maxColumnIndexValue = rentAttributesColumnInfo.maxColumnIndexValue;
        }
    }

    C4794x165b0474() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentAttributesColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$value() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.valueIndex);
    }

    public void realmSet$value(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.valueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.valueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.valueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.valueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentAttributesColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentAttributesColumnInfo(osSchemaInfo);
    }

    public static RentAttributes createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RentAttributes rentAttributes = (RentAttributes) realm.createObjectInternal(RentAttributes.class, true, Collections.emptyList());
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        return rentAttributes;
    }

    public static RentAttributes createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentAttributes rentAttributes = new RentAttributes();
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$value(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$value((String) null);
            }
        }
        jsonReader.endObject();
        return (RentAttributes) realm.copyToRealm(rentAttributes, new ImportFlag[0]);
    }

    private static C4794x165b0474 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class), false, Collections.emptyList());
        C4794x165b0474 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxy = new C4794x165b0474();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxy;
    }

    public static RentAttributes copyOrUpdate(Realm realm, RentAttributesColumnInfo rentAttributesColumnInfo, RentAttributes rentAttributes, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentAttributes instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttributes;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentAttributes;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentAttributes);
        if (realmObjectProxy2 != null) {
            return (RentAttributes) realmObjectProxy2;
        }
        return copy(realm, rentAttributesColumnInfo, rentAttributes, z, map, set);
    }

    public static RentAttributes copy(Realm realm, RentAttributesColumnInfo rentAttributesColumnInfo, RentAttributes rentAttributes, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentAttributes);
        if (realmObjectProxy != null) {
            return (RentAttributes) realmObjectProxy;
        }
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentAttributes.class), rentAttributesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentAttributesColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(rentAttributesColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$value());
        C4794x165b0474 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentAttributes, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentAttributes rentAttributes, Map<RealmModel, Long> map) {
        if (rentAttributes instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttributes;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentAttributes.class);
        long nativePtr = table.getNativePtr();
        RentAttributesColumnInfo rentAttributesColumnInfo = (RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class);
        long createRow = OsObject.createRow(table);
        map.put(rentAttributes, Long.valueOf(createRow));
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentAttributesColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, rentAttributesColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentAttributes.class);
        long nativePtr = table.getNativePtr();
        RentAttributesColumnInfo rentAttributesColumnInfo = (RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class);
        while (it.hasNext()) {
            RentAttributes rentAttributes = (RentAttributes) it.next();
            if (!map2.containsKey(rentAttributes)) {
                if (rentAttributes instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttributes;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentAttributes, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentAttributes, Long.valueOf(createRow));
                C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentAttributesColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, rentAttributesColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentAttributes rentAttributes, Map<RealmModel, Long> map) {
        if (rentAttributes instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttributes;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentAttributes.class);
        long nativePtr = table.getNativePtr();
        RentAttributesColumnInfo rentAttributesColumnInfo = (RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class);
        long createRow = OsObject.createRow(table);
        map.put(rentAttributes, Long.valueOf(createRow));
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentAttributesColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, rentAttributesColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, rentAttributesColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, rentAttributesColumnInfo.valueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentAttributes.class);
        long nativePtr = table.getNativePtr();
        RentAttributesColumnInfo rentAttributesColumnInfo = (RentAttributesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttributes.class);
        while (it.hasNext()) {
            RentAttributes rentAttributes = (RentAttributes) it.next();
            if (!map2.containsKey(rentAttributes)) {
                if (rentAttributes instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttributes;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentAttributes, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentAttributes, Long.valueOf(createRow));
                C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentAttributesColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentAttributesColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, rentAttributesColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentAttributesColumnInfo.valueIndex, createRow, false);
                }
            }
        }
    }

    public static RentAttributes createDetachedCopy(RentAttributes rentAttributes, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentAttributes rentAttributes2;
        if (i > i2 || rentAttributes == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentAttributes);
        if (cacheData == null) {
            rentAttributes2 = new RentAttributes();
            map.put(rentAttributes, new RealmObjectProxy.CacheData(i, rentAttributes2));
        } else if (i >= cacheData.minDepth) {
            return (RentAttributes) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentAttributes2 = (RentAttributes) cacheData.object;
        }
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface = rentAttributes2;
        C4795x4c784b25 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface2 = rentAttributes;
        ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxyinterface2.realmGet$value());
        return rentAttributes2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentAttributes = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        if (realmGet$value() != null) {
            str = realmGet$value();
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
        C4794x165b0474 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxy = (C4794x165b0474) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_rentattributesrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
