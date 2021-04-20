package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Camera;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy */
public class ru_unicorn_ujin_data_realm_CameraRealmProxy extends Camera implements RealmObjectProxy, ru_unicorn_ujin_data_realm_CameraRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CameraColumnInfo columnInfo;
    private ProxyState<Camera> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Camera";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_CameraRealmProxy$CameraColumnInfo */
    static final class CameraColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long previewIndex;
        long videourlIndex;

        CameraColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.videourlIndex = addColumnDetails("videourl", "videourl", objectSchemaInfo);
            this.previewIndex = addColumnDetails(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CameraColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CameraColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CameraColumnInfo cameraColumnInfo = (CameraColumnInfo) columnInfo;
            CameraColumnInfo cameraColumnInfo2 = (CameraColumnInfo) columnInfo2;
            cameraColumnInfo2.videourlIndex = cameraColumnInfo.videourlIndex;
            cameraColumnInfo2.previewIndex = cameraColumnInfo.previewIndex;
            cameraColumnInfo2.maxColumnIndexValue = cameraColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_CameraRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CameraColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$videourl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.videourlIndex);
    }

    public void realmSet$videourl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.videourlIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'videourl' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.videourlIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'videourl' to null.");
        }
    }

    public String realmGet$preview() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.previewIndex);
    }

    public void realmSet$preview(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str != null) {
                this.proxyState.getRow$realm().setString(this.columnInfo.previewIndex, str);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'preview' to null.");
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str != null) {
                row$realm.getTable().setString(this.columnInfo.previewIndex, row$realm.getIndex(), str, true);
                return;
            }
            throw new IllegalArgumentException("Trying to set non-nullable field 'preview' to null.");
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("videourl", RealmFieldType.STRING, false, false, true);
        builder2.addPersistedProperty(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RealmFieldType.STRING, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CameraColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CameraColumnInfo(osSchemaInfo);
    }

    public static Camera createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Camera camera = (Camera) realm.createObjectInternal(Camera.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
        if (jSONObject.has("videourl")) {
            if (jSONObject.isNull("videourl")) {
                ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$videourl((String) null);
            } else {
                ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$videourl(jSONObject.getString("videourl"));
            }
        }
        if (jSONObject.has(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (jSONObject.isNull(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$preview((String) null);
            } else {
                ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$preview(jSONObject.getString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW));
            }
        }
        return camera;
    }

    public static Camera createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Camera camera = new Camera();
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("videourl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$videourl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$videourl((String) null);
                }
            } else if (!nextName.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$preview(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$preview((String) null);
            }
        }
        jsonReader.endObject();
        return (Camera) realm.copyToRealm(camera, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_CameraRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_CameraRealmProxy ru_unicorn_ujin_data_realm_camerarealmproxy = new ru_unicorn_ujin_data_realm_CameraRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_camerarealmproxy;
    }

    public static Camera copyOrUpdate(Realm realm, CameraColumnInfo cameraColumnInfo, Camera camera, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (camera instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) camera;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return camera;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(camera);
        if (realmObjectProxy2 != null) {
            return (Camera) realmObjectProxy2;
        }
        return copy(realm, cameraColumnInfo, camera, z, map, set);
    }

    public static Camera copy(Realm realm, CameraColumnInfo cameraColumnInfo, Camera camera, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(camera);
        if (realmObjectProxy != null) {
            return (Camera) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Camera.class), cameraColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cameraColumnInfo.videourlIndex, ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$videourl());
        osObjectBuilder.addString(cameraColumnInfo.previewIndex, ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$preview());
        ru_unicorn_ujin_data_realm_CameraRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(camera, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Camera camera, Map<RealmModel, Long> map) {
        if (camera instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) camera;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Camera.class);
        long nativePtr = table.getNativePtr();
        CameraColumnInfo cameraColumnInfo = (CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class);
        long createRow = OsObject.createRow(table);
        map.put(camera, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
        String realmGet$videourl = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$videourl();
        if (realmGet$videourl != null) {
            Table.nativeSetString(nativePtr, cameraColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
        }
        String realmGet$preview = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, cameraColumnInfo.previewIndex, createRow, realmGet$preview, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Camera.class);
        long nativePtr = table.getNativePtr();
        CameraColumnInfo cameraColumnInfo = (CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class);
        while (it.hasNext()) {
            Camera camera = (Camera) it.next();
            if (!map2.containsKey(camera)) {
                if (camera instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) camera;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(camera, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(camera, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
                String realmGet$videourl = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$videourl();
                if (realmGet$videourl != null) {
                    Table.nativeSetString(nativePtr, cameraColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
                }
                String realmGet$preview = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, cameraColumnInfo.previewIndex, createRow, realmGet$preview, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Camera camera, Map<RealmModel, Long> map) {
        if (camera instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) camera;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Camera.class);
        long nativePtr = table.getNativePtr();
        CameraColumnInfo cameraColumnInfo = (CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class);
        long createRow = OsObject.createRow(table);
        map.put(camera, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
        String realmGet$videourl = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$videourl();
        if (realmGet$videourl != null) {
            Table.nativeSetString(nativePtr, cameraColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
        } else {
            Table.nativeSetNull(nativePtr, cameraColumnInfo.videourlIndex, createRow, false);
        }
        String realmGet$preview = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, cameraColumnInfo.previewIndex, createRow, realmGet$preview, false);
        } else {
            Table.nativeSetNull(nativePtr, cameraColumnInfo.previewIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Camera.class);
        long nativePtr = table.getNativePtr();
        CameraColumnInfo cameraColumnInfo = (CameraColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Camera.class);
        while (it.hasNext()) {
            Camera camera = (Camera) it.next();
            if (!map2.containsKey(camera)) {
                if (camera instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) camera;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(camera, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(camera, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera;
                String realmGet$videourl = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$videourl();
                if (realmGet$videourl != null) {
                    Table.nativeSetString(nativePtr, cameraColumnInfo.videourlIndex, createRow, realmGet$videourl, false);
                } else {
                    Table.nativeSetNull(nativePtr, cameraColumnInfo.videourlIndex, createRow, false);
                }
                String realmGet$preview = ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, cameraColumnInfo.previewIndex, createRow, realmGet$preview, false);
                } else {
                    Table.nativeSetNull(nativePtr, cameraColumnInfo.previewIndex, createRow, false);
                }
            }
        }
    }

    public static Camera createDetachedCopy(Camera camera, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Camera camera2;
        if (i > i2 || camera == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(camera);
        if (cacheData == null) {
            camera2 = new Camera();
            map.put(camera, new RealmObjectProxy.CacheData(i, camera2));
        } else if (i >= cacheData.minDepth) {
            return (Camera) cacheData.object;
        } else {
            cacheData.minDepth = i;
            camera2 = (Camera) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface = camera2;
        ru_unicorn_ujin_data_realm_CameraRealmProxyInterface ru_unicorn_ujin_data_realm_camerarealmproxyinterface2 = camera;
        ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$videourl(ru_unicorn_ujin_data_realm_camerarealmproxyinterface2.realmGet$videourl());
        ru_unicorn_ujin_data_realm_camerarealmproxyinterface.realmSet$preview(ru_unicorn_ujin_data_realm_camerarealmproxyinterface2.realmGet$preview());
        return camera2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "Camera = proxy[" + "{videourl:" + realmGet$videourl() + "}" + "," + "{preview:" + realmGet$preview() + "}" + "]";
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
        ru_unicorn_ujin_data_realm_CameraRealmProxy ru_unicorn_ujin_data_realm_camerarealmproxy = (ru_unicorn_ujin_data_realm_CameraRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_camerarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_camerarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_camerarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
