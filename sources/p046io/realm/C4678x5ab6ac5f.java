package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.addhardware.ClassDevice;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_addhardware_ClassDeviceRealmProxy */
public class C4678x5ab6ac5f extends ClassDevice implements RealmObjectProxy, C4679xe6b35b9a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ClassDeviceColumnInfo columnInfo;
    private ProxyState<ClassDevice> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_addhardware_ClassDeviceRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ClassDevice";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_addhardware_ClassDeviceRealmProxy$ClassDeviceColumnInfo */
    static final class ClassDeviceColumnInfo extends ColumnInfo {
        long enabledIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long titleIndex;

        ClassDeviceColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.enabledIndex = addColumnDetails(ViewProps.ENABLED, ViewProps.ENABLED, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ClassDeviceColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ClassDeviceColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ClassDeviceColumnInfo classDeviceColumnInfo = (ClassDeviceColumnInfo) columnInfo;
            ClassDeviceColumnInfo classDeviceColumnInfo2 = (ClassDeviceColumnInfo) columnInfo2;
            classDeviceColumnInfo2.nameIndex = classDeviceColumnInfo.nameIndex;
            classDeviceColumnInfo2.titleIndex = classDeviceColumnInfo.titleIndex;
            classDeviceColumnInfo2.enabledIndex = classDeviceColumnInfo.enabledIndex;
            classDeviceColumnInfo2.maxColumnIndexValue = classDeviceColumnInfo.maxColumnIndexValue;
        }
    }

    C4678x5ab6ac5f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ClassDeviceColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$enabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.enabledIndex);
    }

    public void realmSet$enabled(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.enabledIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.enabledIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.enabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.enabledIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(ViewProps.ENABLED, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ClassDeviceColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ClassDeviceColumnInfo(osSchemaInfo);
    }

    public static ClassDevice createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ClassDevice classDevice = (ClassDevice) realm.createObjectInternal(ClassDevice.class, true, Collections.emptyList());
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has(ViewProps.ENABLED)) {
            if (jSONObject.isNull(ViewProps.ENABLED)) {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$enabled((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$enabled(jSONObject.getString(ViewProps.ENABLED));
            }
        }
        return classDevice;
    }

    public static ClassDevice createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ClassDevice classDevice = new ClassDevice();
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals(ViewProps.ENABLED)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$enabled(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$enabled((String) null);
            }
        }
        jsonReader.endObject();
        return (ClassDevice) realm.copyToRealm(classDevice, new ImportFlag[0]);
    }

    private static C4678x5ab6ac5f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ClassDevice.class), false, Collections.emptyList());
        C4678x5ab6ac5f ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxy = new C4678x5ab6ac5f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxy;
    }

    public static ClassDevice copyOrUpdate(Realm realm, ClassDeviceColumnInfo classDeviceColumnInfo, ClassDevice classDevice, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (classDevice instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) classDevice;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return classDevice;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(classDevice);
        if (realmObjectProxy2 != null) {
            return (ClassDevice) realmObjectProxy2;
        }
        return copy(realm, classDeviceColumnInfo, classDevice, z, map, set);
    }

    public static ClassDevice copy(Realm realm, ClassDeviceColumnInfo classDeviceColumnInfo, ClassDevice classDevice, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(classDevice);
        if (realmObjectProxy != null) {
            return (ClassDevice) realmObjectProxy;
        }
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ClassDevice.class), classDeviceColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(classDeviceColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(classDeviceColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(classDeviceColumnInfo.enabledIndex, ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$enabled());
        C4678x5ab6ac5f newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(classDevice, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ClassDevice classDevice, Map<RealmModel, Long> map) {
        if (classDevice instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) classDevice;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ClassDevice.class);
        long nativePtr = table.getNativePtr();
        ClassDeviceColumnInfo classDeviceColumnInfo = (ClassDeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ClassDevice.class);
        long createRow = OsObject.createRow(table);
        map.put(classDevice, Long.valueOf(createRow));
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, classDeviceColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, classDeviceColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$enabled();
        if (realmGet$enabled != null) {
            Table.nativeSetString(nativePtr, classDeviceColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ClassDevice.class);
        long nativePtr = table.getNativePtr();
        ClassDeviceColumnInfo classDeviceColumnInfo = (ClassDeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ClassDevice.class);
        while (it.hasNext()) {
            ClassDevice classDevice = (ClassDevice) it.next();
            if (!map2.containsKey(classDevice)) {
                if (classDevice instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) classDevice;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(classDevice, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(classDevice, Long.valueOf(createRow));
                C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, classDeviceColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, classDeviceColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$enabled();
                if (realmGet$enabled != null) {
                    Table.nativeSetString(nativePtr, classDeviceColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ClassDevice classDevice, Map<RealmModel, Long> map) {
        if (classDevice instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) classDevice;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ClassDevice.class);
        long nativePtr = table.getNativePtr();
        ClassDeviceColumnInfo classDeviceColumnInfo = (ClassDeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ClassDevice.class);
        long createRow = OsObject.createRow(table);
        map.put(classDevice, Long.valueOf(createRow));
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, classDeviceColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, classDeviceColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, classDeviceColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, classDeviceColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$enabled();
        if (realmGet$enabled != null) {
            Table.nativeSetString(nativePtr, classDeviceColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
        } else {
            Table.nativeSetNull(nativePtr, classDeviceColumnInfo.enabledIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ClassDevice.class);
        long nativePtr = table.getNativePtr();
        ClassDeviceColumnInfo classDeviceColumnInfo = (ClassDeviceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ClassDevice.class);
        while (it.hasNext()) {
            ClassDevice classDevice = (ClassDevice) it.next();
            if (!map2.containsKey(classDevice)) {
                if (classDevice instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) classDevice;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(classDevice, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(classDevice, Long.valueOf(createRow));
                C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, classDeviceColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, classDeviceColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, classDeviceColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, classDeviceColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmGet$enabled();
                if (realmGet$enabled != null) {
                    Table.nativeSetString(nativePtr, classDeviceColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
                } else {
                    Table.nativeSetNull(nativePtr, classDeviceColumnInfo.enabledIndex, createRow, false);
                }
            }
        }
    }

    public static ClassDevice createDetachedCopy(ClassDevice classDevice, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ClassDevice classDevice2;
        if (i > i2 || classDevice == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(classDevice);
        if (cacheData == null) {
            classDevice2 = new ClassDevice();
            map.put(classDevice, new RealmObjectProxy.CacheData(i, classDevice2));
        } else if (i >= cacheData.minDepth) {
            return (ClassDevice) cacheData.object;
        } else {
            cacheData.minDepth = i;
            classDevice2 = (ClassDevice) cacheData.object;
        }
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface = classDevice2;
        C4679xe6b35b9a ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface2 = classDevice;
        ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface.realmSet$enabled(ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxyinterface2.realmGet$enabled());
        return classDevice2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ClassDevice = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{enabled:");
        if (realmGet$enabled() != null) {
            str = realmGet$enabled();
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
        C4678x5ab6ac5f ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxy = (C4678x5ab6ac5f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_addhardware_classdevicerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
