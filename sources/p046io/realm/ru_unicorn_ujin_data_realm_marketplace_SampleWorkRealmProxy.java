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
import p035ru.unicorn.ujin.data.realm.marketplace.SampleWork;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy extends SampleWork implements RealmObjectProxy, C4623x4c2f6c68 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SampleWorkColumnInfo columnInfo;
    private ProxyState<SampleWork> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "SampleWork";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy$SampleWorkColumnInfo */
    static final class SampleWorkColumnInfo extends ColumnInfo {
        long imageIndex;
        long maxColumnIndexValue;
        long previewIndex;

        SampleWorkColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.previewIndex = addColumnDetails(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        SampleWorkColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new SampleWorkColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SampleWorkColumnInfo sampleWorkColumnInfo = (SampleWorkColumnInfo) columnInfo;
            SampleWorkColumnInfo sampleWorkColumnInfo2 = (SampleWorkColumnInfo) columnInfo2;
            sampleWorkColumnInfo2.imageIndex = sampleWorkColumnInfo.imageIndex;
            sampleWorkColumnInfo2.previewIndex = sampleWorkColumnInfo.previewIndex;
            sampleWorkColumnInfo2.maxColumnIndexValue = sampleWorkColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (SampleWorkColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imageIndex);
    }

    public void realmSet$image(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$preview() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.previewIndex);
    }

    public void realmSet$preview(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.previewIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.previewIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.previewIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.previewIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("image", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static SampleWorkColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SampleWorkColumnInfo(osSchemaInfo);
    }

    public static SampleWork createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        SampleWork sampleWork = (SampleWork) realm.createObjectInternal(SampleWork.class, true, Collections.emptyList());
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
        if (jSONObject.has("image")) {
            if (jSONObject.isNull("image")) {
                ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$image((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$image(jSONObject.getString("image"));
            }
        }
        if (jSONObject.has(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (jSONObject.isNull(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$preview((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$preview(jSONObject.getString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW));
            }
        }
        return sampleWork;
    }

    public static SampleWork createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        SampleWork sampleWork = new SampleWork();
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("image")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$image(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$image((String) null);
                }
            } else if (!nextName.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$preview(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$preview((String) null);
            }
        }
        jsonReader.endObject();
        return (SampleWork) realm.copyToRealm(sampleWork, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) SampleWork.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxy;
    }

    public static SampleWork copyOrUpdate(Realm realm, SampleWorkColumnInfo sampleWorkColumnInfo, SampleWork sampleWork, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (sampleWork instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sampleWork;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return sampleWork;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(sampleWork);
        if (realmObjectProxy2 != null) {
            return (SampleWork) realmObjectProxy2;
        }
        return copy(realm, sampleWorkColumnInfo, sampleWork, z, map, set);
    }

    public static SampleWork copy(Realm realm, SampleWorkColumnInfo sampleWorkColumnInfo, SampleWork sampleWork, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(sampleWork);
        if (realmObjectProxy != null) {
            return (SampleWork) realmObjectProxy;
        }
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(SampleWork.class), sampleWorkColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(sampleWorkColumnInfo.imageIndex, ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$image());
        osObjectBuilder.addString(sampleWorkColumnInfo.previewIndex, ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$preview());
        ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(sampleWork, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, SampleWork sampleWork, Map<RealmModel, Long> map) {
        if (sampleWork instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sampleWork;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SampleWork.class);
        long nativePtr = table.getNativePtr();
        SampleWorkColumnInfo sampleWorkColumnInfo = (SampleWorkColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SampleWork.class);
        long createRow = OsObject.createRow(table);
        map.put(sampleWork, Long.valueOf(createRow));
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
        String realmGet$image = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(nativePtr, sampleWorkColumnInfo.imageIndex, createRow, realmGet$image, false);
        }
        String realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, sampleWorkColumnInfo.previewIndex, createRow, realmGet$preview, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SampleWork.class);
        long nativePtr = table.getNativePtr();
        SampleWorkColumnInfo sampleWorkColumnInfo = (SampleWorkColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SampleWork.class);
        while (it.hasNext()) {
            SampleWork sampleWork = (SampleWork) it.next();
            if (!map2.containsKey(sampleWork)) {
                if (sampleWork instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sampleWork;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sampleWork, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(sampleWork, Long.valueOf(createRow));
                C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
                String realmGet$image = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Table.nativeSetString(nativePtr, sampleWorkColumnInfo.imageIndex, createRow, realmGet$image, false);
                }
                String realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, sampleWorkColumnInfo.previewIndex, createRow, realmGet$preview, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, SampleWork sampleWork, Map<RealmModel, Long> map) {
        if (sampleWork instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sampleWork;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(SampleWork.class);
        long nativePtr = table.getNativePtr();
        SampleWorkColumnInfo sampleWorkColumnInfo = (SampleWorkColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SampleWork.class);
        long createRow = OsObject.createRow(table);
        map.put(sampleWork, Long.valueOf(createRow));
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
        String realmGet$image = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(nativePtr, sampleWorkColumnInfo.imageIndex, createRow, realmGet$image, false);
        } else {
            Table.nativeSetNull(nativePtr, sampleWorkColumnInfo.imageIndex, createRow, false);
        }
        String realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, sampleWorkColumnInfo.previewIndex, createRow, realmGet$preview, false);
        } else {
            Table.nativeSetNull(nativePtr, sampleWorkColumnInfo.previewIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(SampleWork.class);
        long nativePtr = table.getNativePtr();
        SampleWorkColumnInfo sampleWorkColumnInfo = (SampleWorkColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SampleWork.class);
        while (it.hasNext()) {
            SampleWork sampleWork = (SampleWork) it.next();
            if (!map2.containsKey(sampleWork)) {
                if (sampleWork instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) sampleWork;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(sampleWork, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(sampleWork, Long.valueOf(createRow));
                C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork;
                String realmGet$image = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Table.nativeSetString(nativePtr, sampleWorkColumnInfo.imageIndex, createRow, realmGet$image, false);
                } else {
                    Table.nativeSetNull(nativePtr, sampleWorkColumnInfo.imageIndex, createRow, false);
                }
                String realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, sampleWorkColumnInfo.previewIndex, createRow, realmGet$preview, false);
                } else {
                    Table.nativeSetNull(nativePtr, sampleWorkColumnInfo.previewIndex, createRow, false);
                }
            }
        }
    }

    public static SampleWork createDetachedCopy(SampleWork sampleWork, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        SampleWork sampleWork2;
        if (i > i2 || sampleWork == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(sampleWork);
        if (cacheData == null) {
            sampleWork2 = new SampleWork();
            map.put(sampleWork, new RealmObjectProxy.CacheData(i, sampleWork2));
        } else if (i >= cacheData.minDepth) {
            return (SampleWork) cacheData.object;
        } else {
            cacheData.minDepth = i;
            sampleWork2 = (SampleWork) cacheData.object;
        }
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface = sampleWork2;
        C4623x4c2f6c68 ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface2 = sampleWork;
        ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface2.realmGet$image());
        ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface.realmSet$preview(ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxyinterface2.realmGet$preview());
        return sampleWork2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("SampleWork = proxy[");
        sb.append("{image:");
        String str = "null";
        sb.append(realmGet$image() != null ? realmGet$image() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{preview:");
        if (realmGet$preview() != null) {
            str = realmGet$preview();
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
        ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_SampleWorkRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_sampleworkrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
