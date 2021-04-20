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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.AttrRenta;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_AttrRentaRealmProxy */
public class C4740x60e6319b extends AttrRenta implements RealmObjectProxy, C4741xce5ff9de {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AttrRentaColumnInfo columnInfo;
    private ProxyState<AttrRenta> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_AttrRentaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AttrRenta";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrenta_AttrRentaRealmProxy$AttrRentaColumnInfo */
    static final class AttrRentaColumnInfo extends ColumnInfo {
        long areaIndex;
        long capacityIndex;
        long floorIndex;
        long maxColumnIndexValue;

        AttrRentaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.areaIndex = addColumnDetails("area", "area", objectSchemaInfo);
            this.floorIndex = addColumnDetails("floor", "floor", objectSchemaInfo);
            this.capacityIndex = addColumnDetails("capacity", "capacity", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AttrRentaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AttrRentaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AttrRentaColumnInfo attrRentaColumnInfo = (AttrRentaColumnInfo) columnInfo;
            AttrRentaColumnInfo attrRentaColumnInfo2 = (AttrRentaColumnInfo) columnInfo2;
            attrRentaColumnInfo2.areaIndex = attrRentaColumnInfo.areaIndex;
            attrRentaColumnInfo2.floorIndex = attrRentaColumnInfo.floorIndex;
            attrRentaColumnInfo2.capacityIndex = attrRentaColumnInfo.capacityIndex;
            attrRentaColumnInfo2.maxColumnIndexValue = attrRentaColumnInfo.maxColumnIndexValue;
        }
    }

    C4740x60e6319b() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AttrRentaColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$area() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.areaIndex);
    }

    public void realmSet$area(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.areaIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.areaIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.areaIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.areaIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$floor() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.floorIndex);
    }

    public void realmSet$floor(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.floorIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.floorIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.floorIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.floorIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$capacity() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.capacityIndex);
    }

    public void realmSet$capacity(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.capacityIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.capacityIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.capacityIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.capacityIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("area", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("floor", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("capacity", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AttrRentaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AttrRentaColumnInfo(osSchemaInfo);
    }

    public static AttrRenta createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        AttrRenta attrRenta = (AttrRenta) realm.createObjectInternal(AttrRenta.class, true, Collections.emptyList());
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
        if (jSONObject.has("area")) {
            if (jSONObject.isNull("area")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$area((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$area(jSONObject.getString("area"));
            }
        }
        if (jSONObject.has("floor")) {
            if (jSONObject.isNull("floor")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$floor((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$floor(jSONObject.getString("floor"));
            }
        }
        if (jSONObject.has("capacity")) {
            if (jSONObject.isNull("capacity")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$capacity((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$capacity(jSONObject.getString("capacity"));
            }
        }
        return attrRenta;
    }

    public static AttrRenta createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        AttrRenta attrRenta = new AttrRenta();
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("area")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$area(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$area((String) null);
                }
            } else if (nextName.equals("floor")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$floor(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$floor((String) null);
                }
            } else if (!nextName.equals("capacity")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$capacity(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$capacity((String) null);
            }
        }
        jsonReader.endObject();
        return (AttrRenta) realm.copyToRealm(attrRenta, new ImportFlag[0]);
    }

    private static C4740x60e6319b newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class), false, Collections.emptyList());
        C4740x60e6319b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxy = new C4740x60e6319b();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxy;
    }

    public static AttrRenta copyOrUpdate(Realm realm, AttrRentaColumnInfo attrRentaColumnInfo, AttrRenta attrRenta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (attrRenta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) attrRenta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return attrRenta;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(attrRenta);
        if (realmObjectProxy2 != null) {
            return (AttrRenta) realmObjectProxy2;
        }
        return copy(realm, attrRentaColumnInfo, attrRenta, z, map, set);
    }

    public static AttrRenta copy(Realm realm, AttrRentaColumnInfo attrRentaColumnInfo, AttrRenta attrRenta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(attrRenta);
        if (realmObjectProxy != null) {
            return (AttrRenta) realmObjectProxy;
        }
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AttrRenta.class), attrRentaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(attrRentaColumnInfo.areaIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$area());
        osObjectBuilder.addString(attrRentaColumnInfo.floorIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$floor());
        osObjectBuilder.addString(attrRentaColumnInfo.capacityIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$capacity());
        C4740x60e6319b newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(attrRenta, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, AttrRenta attrRenta, Map<RealmModel, Long> map) {
        if (attrRenta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) attrRenta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AttrRenta.class);
        long nativePtr = table.getNativePtr();
        AttrRentaColumnInfo attrRentaColumnInfo = (AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class);
        long createRow = OsObject.createRow(table);
        map.put(attrRenta, Long.valueOf(createRow));
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
        String realmGet$area = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$area();
        if (realmGet$area != null) {
            Table.nativeSetString(nativePtr, attrRentaColumnInfo.areaIndex, createRow, realmGet$area, false);
        }
        String realmGet$floor = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, attrRentaColumnInfo.floorIndex, createRow, realmGet$floor, false);
        }
        String realmGet$capacity = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$capacity();
        if (realmGet$capacity != null) {
            Table.nativeSetString(nativePtr, attrRentaColumnInfo.capacityIndex, createRow, realmGet$capacity, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(AttrRenta.class);
        long nativePtr = table.getNativePtr();
        AttrRentaColumnInfo attrRentaColumnInfo = (AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class);
        while (it.hasNext()) {
            AttrRenta attrRenta = (AttrRenta) it.next();
            if (!map2.containsKey(attrRenta)) {
                if (attrRenta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) attrRenta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(attrRenta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(attrRenta, Long.valueOf(createRow));
                C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
                String realmGet$area = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$area();
                if (realmGet$area != null) {
                    Table.nativeSetString(nativePtr, attrRentaColumnInfo.areaIndex, createRow, realmGet$area, false);
                }
                String realmGet$floor = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, attrRentaColumnInfo.floorIndex, createRow, realmGet$floor, false);
                }
                String realmGet$capacity = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$capacity();
                if (realmGet$capacity != null) {
                    Table.nativeSetString(nativePtr, attrRentaColumnInfo.capacityIndex, createRow, realmGet$capacity, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, AttrRenta attrRenta, Map<RealmModel, Long> map) {
        if (attrRenta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) attrRenta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AttrRenta.class);
        long nativePtr = table.getNativePtr();
        AttrRentaColumnInfo attrRentaColumnInfo = (AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class);
        long createRow = OsObject.createRow(table);
        map.put(attrRenta, Long.valueOf(createRow));
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
        String realmGet$area = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$area();
        if (realmGet$area != null) {
            Table.nativeSetString(nativePtr, attrRentaColumnInfo.areaIndex, createRow, realmGet$area, false);
        } else {
            Table.nativeSetNull(nativePtr, attrRentaColumnInfo.areaIndex, createRow, false);
        }
        String realmGet$floor = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$floor();
        if (realmGet$floor != null) {
            Table.nativeSetString(nativePtr, attrRentaColumnInfo.floorIndex, createRow, realmGet$floor, false);
        } else {
            Table.nativeSetNull(nativePtr, attrRentaColumnInfo.floorIndex, createRow, false);
        }
        String realmGet$capacity = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$capacity();
        if (realmGet$capacity != null) {
            Table.nativeSetString(nativePtr, attrRentaColumnInfo.capacityIndex, createRow, realmGet$capacity, false);
        } else {
            Table.nativeSetNull(nativePtr, attrRentaColumnInfo.capacityIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(AttrRenta.class);
        long nativePtr = table.getNativePtr();
        AttrRentaColumnInfo attrRentaColumnInfo = (AttrRentaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AttrRenta.class);
        while (it.hasNext()) {
            AttrRenta attrRenta = (AttrRenta) it.next();
            if (!map2.containsKey(attrRenta)) {
                if (attrRenta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) attrRenta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(attrRenta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(attrRenta, Long.valueOf(createRow));
                C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta;
                String realmGet$area = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$area();
                if (realmGet$area != null) {
                    Table.nativeSetString(nativePtr, attrRentaColumnInfo.areaIndex, createRow, realmGet$area, false);
                } else {
                    Table.nativeSetNull(nativePtr, attrRentaColumnInfo.areaIndex, createRow, false);
                }
                String realmGet$floor = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$floor();
                if (realmGet$floor != null) {
                    Table.nativeSetString(nativePtr, attrRentaColumnInfo.floorIndex, createRow, realmGet$floor, false);
                } else {
                    Table.nativeSetNull(nativePtr, attrRentaColumnInfo.floorIndex, createRow, false);
                }
                String realmGet$capacity = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmGet$capacity();
                if (realmGet$capacity != null) {
                    Table.nativeSetString(nativePtr, attrRentaColumnInfo.capacityIndex, createRow, realmGet$capacity, false);
                } else {
                    Table.nativeSetNull(nativePtr, attrRentaColumnInfo.capacityIndex, createRow, false);
                }
            }
        }
    }

    public static AttrRenta createDetachedCopy(AttrRenta attrRenta, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        AttrRenta attrRenta2;
        if (i > i2 || attrRenta == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(attrRenta);
        if (cacheData == null) {
            attrRenta2 = new AttrRenta();
            map.put(attrRenta, new RealmObjectProxy.CacheData(i, attrRenta2));
        } else if (i >= cacheData.minDepth) {
            return (AttrRenta) cacheData.object;
        } else {
            cacheData.minDepth = i;
            attrRenta2 = (AttrRenta) cacheData.object;
        }
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface = attrRenta2;
        C4741xce5ff9de ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface2 = attrRenta;
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$area(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface2.realmGet$area());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$floor(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface2.realmGet$floor());
        ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface.realmSet$capacity(ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxyinterface2.realmGet$capacity());
        return attrRenta2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AttrRenta = proxy[");
        sb.append("{area:");
        String str = "null";
        sb.append(realmGet$area() != null ? realmGet$area() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{floor:");
        sb.append(realmGet$floor() != null ? realmGet$floor() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{capacity:");
        if (realmGet$capacity() != null) {
            str = realmGet$capacity();
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
        C4740x60e6319b ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxy = (C4740x60e6319b) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrenta_attrrentarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
