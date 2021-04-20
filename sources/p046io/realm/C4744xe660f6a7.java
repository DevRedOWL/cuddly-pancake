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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentAttribute;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentAttributeRealmProxy */
public class C4744xe660f6a7 extends RentAttribute implements RealmObjectProxy, C4745xc9a42252 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentAttributeColumnInfo columnInfo;
    private ProxyState<RentAttribute> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentAttributeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentAttribute";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_RentAttributeRealmProxy$RentAttributeColumnInfo */
    static final class RentAttributeColumnInfo extends ColumnInfo {
        long keyIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long valueIndex;

        RentAttributeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.keyIndex = addColumnDetails("key", "key", objectSchemaInfo);
            this.valueIndex = addColumnDetails("value", "value", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentAttributeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentAttributeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentAttributeColumnInfo rentAttributeColumnInfo = (RentAttributeColumnInfo) columnInfo;
            RentAttributeColumnInfo rentAttributeColumnInfo2 = (RentAttributeColumnInfo) columnInfo2;
            rentAttributeColumnInfo2.keyIndex = rentAttributeColumnInfo.keyIndex;
            rentAttributeColumnInfo2.valueIndex = rentAttributeColumnInfo.valueIndex;
            rentAttributeColumnInfo2.titleIndex = rentAttributeColumnInfo.titleIndex;
            rentAttributeColumnInfo2.maxColumnIndexValue = rentAttributeColumnInfo.maxColumnIndexValue;
        }
    }

    C4744xe660f6a7() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentAttributeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$key() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.keyIndex);
    }

    public void realmSet$key(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.keyIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.keyIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.keyIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.keyIndex, row$realm.getIndex(), str, true);
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("key", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("value", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentAttributeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentAttributeColumnInfo(osSchemaInfo);
    }

    public static RentAttribute createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RentAttribute rentAttribute = (RentAttribute) realm.createObjectInternal(RentAttribute.class, true, Collections.emptyList());
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
        if (jSONObject.has("key")) {
            if (jSONObject.isNull("key")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$key((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$key(jSONObject.getString("key"));
            }
        }
        if (jSONObject.has("value")) {
            if (jSONObject.isNull("value")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$value((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$value(jSONObject.getString("value"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return rentAttribute;
    }

    public static RentAttribute createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentAttribute rentAttribute = new RentAttribute();
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("key")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$key(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$key((String) null);
                }
            } else if (nextName.equals("value")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$value(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$value((String) null);
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (RentAttribute) realm.copyToRealm(rentAttribute, new ImportFlag[0]);
    }

    private static C4744xe660f6a7 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttribute.class), false, Collections.emptyList());
        C4744xe660f6a7 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxy = new C4744xe660f6a7();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxy;
    }

    public static RentAttribute copyOrUpdate(Realm realm, RentAttributeColumnInfo rentAttributeColumnInfo, RentAttribute rentAttribute, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentAttribute instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttribute;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentAttribute;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentAttribute);
        if (realmObjectProxy2 != null) {
            return (RentAttribute) realmObjectProxy2;
        }
        return copy(realm, rentAttributeColumnInfo, rentAttribute, z, map, set);
    }

    public static RentAttribute copy(Realm realm, RentAttributeColumnInfo rentAttributeColumnInfo, RentAttribute rentAttribute, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentAttribute);
        if (realmObjectProxy != null) {
            return (RentAttribute) realmObjectProxy;
        }
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentAttribute.class), rentAttributeColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(rentAttributeColumnInfo.keyIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$key());
        osObjectBuilder.addString(rentAttributeColumnInfo.valueIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$value());
        osObjectBuilder.addString(rentAttributeColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$title());
        C4744xe660f6a7 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentAttribute, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentAttribute rentAttribute, Map<RealmModel, Long> map) {
        if (rentAttribute instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttribute;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentAttribute.class);
        long nativePtr = table.getNativePtr();
        RentAttributeColumnInfo rentAttributeColumnInfo = (RentAttributeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttribute.class);
        long createRow = OsObject.createRow(table);
        map.put(rentAttribute, Long.valueOf(createRow));
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
        String realmGet$key = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, rentAttributeColumnInfo.keyIndex, createRow, realmGet$key, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, rentAttributeColumnInfo.valueIndex, createRow, realmGet$value, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentAttributeColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentAttribute.class);
        long nativePtr = table.getNativePtr();
        RentAttributeColumnInfo rentAttributeColumnInfo = (RentAttributeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttribute.class);
        while (it.hasNext()) {
            RentAttribute rentAttribute = (RentAttribute) it.next();
            if (!map2.containsKey(rentAttribute)) {
                if (rentAttribute instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttribute;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentAttribute, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentAttribute, Long.valueOf(createRow));
                C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
                String realmGet$key = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(nativePtr, rentAttributeColumnInfo.keyIndex, createRow, realmGet$key, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, rentAttributeColumnInfo.valueIndex, createRow, realmGet$value, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentAttributeColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentAttribute rentAttribute, Map<RealmModel, Long> map) {
        if (rentAttribute instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttribute;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentAttribute.class);
        long nativePtr = table.getNativePtr();
        RentAttributeColumnInfo rentAttributeColumnInfo = (RentAttributeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttribute.class);
        long createRow = OsObject.createRow(table);
        map.put(rentAttribute, Long.valueOf(createRow));
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
        String realmGet$key = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(nativePtr, rentAttributeColumnInfo.keyIndex, createRow, realmGet$key, false);
        } else {
            Table.nativeSetNull(nativePtr, rentAttributeColumnInfo.keyIndex, createRow, false);
        }
        String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(nativePtr, rentAttributeColumnInfo.valueIndex, createRow, realmGet$value, false);
        } else {
            Table.nativeSetNull(nativePtr, rentAttributeColumnInfo.valueIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, rentAttributeColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, rentAttributeColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentAttribute.class);
        long nativePtr = table.getNativePtr();
        RentAttributeColumnInfo rentAttributeColumnInfo = (RentAttributeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentAttribute.class);
        while (it.hasNext()) {
            RentAttribute rentAttribute = (RentAttribute) it.next();
            if (!map2.containsKey(rentAttribute)) {
                if (rentAttribute instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentAttribute;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentAttribute, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentAttribute, Long.valueOf(createRow));
                C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute;
                String realmGet$key = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(nativePtr, rentAttributeColumnInfo.keyIndex, createRow, realmGet$key, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentAttributeColumnInfo.keyIndex, createRow, false);
                }
                String realmGet$value = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(nativePtr, rentAttributeColumnInfo.valueIndex, createRow, realmGet$value, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentAttributeColumnInfo.valueIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, rentAttributeColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentAttributeColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static RentAttribute createDetachedCopy(RentAttribute rentAttribute, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentAttribute rentAttribute2;
        if (i > i2 || rentAttribute == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentAttribute);
        if (cacheData == null) {
            rentAttribute2 = new RentAttribute();
            map.put(rentAttribute, new RealmObjectProxy.CacheData(i, rentAttribute2));
        } else if (i >= cacheData.minDepth) {
            return (RentAttribute) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentAttribute2 = (RentAttribute) cacheData.object;
        }
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface = rentAttribute2;
        C4745xc9a42252 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface2 = rentAttribute;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$key(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface2.realmGet$key());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$value(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface2.realmGet$value());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxyinterface2.realmGet$title());
        return rentAttribute2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentAttribute = proxy[");
        sb.append("{key:");
        String str = "null";
        sb.append(realmGet$key() != null ? realmGet$key() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{value:");
        sb.append(realmGet$value() != null ? realmGet$value() : str);
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
        C4744xe660f6a7 ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxy = (C4744xe660f6a7) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_rentattributerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
