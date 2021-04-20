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
import p035ru.unicorn.ujin.view.activity.navigation.api.DeviceModel;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_api_DeviceModelRealmProxy */
public class C4637x5b79bd5a extends DeviceModel implements RealmObjectProxy, C4638x2c6434ff {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DeviceModelColumnInfo columnInfo;
    private ProxyState<DeviceModel> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_api_DeviceModelRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DeviceModel";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_api_DeviceModelRealmProxy$DeviceModelColumnInfo */
    static final class DeviceModelColumnInfo extends ColumnInfo {
        long classNameIndex;
        long classTitleIndex;
        long enabledIndex;
        long fwalfaIndex;
        long fwbetaIndex;
        long fwstableIndex;
        long isCheckIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long titleIndex;

        DeviceModelColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.classNameIndex = addColumnDetails("className", "className", objectSchemaInfo);
            this.classTitleIndex = addColumnDetails("classTitle", "classTitle", objectSchemaInfo);
            this.enabledIndex = addColumnDetails(ViewProps.ENABLED, ViewProps.ENABLED, objectSchemaInfo);
            this.fwstableIndex = addColumnDetails("fwstable", "fwstable", objectSchemaInfo);
            this.fwalfaIndex = addColumnDetails("fwalfa", "fwalfa", objectSchemaInfo);
            this.fwbetaIndex = addColumnDetails("fwbeta", "fwbeta", objectSchemaInfo);
            this.isCheckIndex = addColumnDetails("isCheck", "isCheck", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DeviceModelColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DeviceModelColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DeviceModelColumnInfo deviceModelColumnInfo = (DeviceModelColumnInfo) columnInfo;
            DeviceModelColumnInfo deviceModelColumnInfo2 = (DeviceModelColumnInfo) columnInfo2;
            deviceModelColumnInfo2.nameIndex = deviceModelColumnInfo.nameIndex;
            deviceModelColumnInfo2.titleIndex = deviceModelColumnInfo.titleIndex;
            deviceModelColumnInfo2.classNameIndex = deviceModelColumnInfo.classNameIndex;
            deviceModelColumnInfo2.classTitleIndex = deviceModelColumnInfo.classTitleIndex;
            deviceModelColumnInfo2.enabledIndex = deviceModelColumnInfo.enabledIndex;
            deviceModelColumnInfo2.fwstableIndex = deviceModelColumnInfo.fwstableIndex;
            deviceModelColumnInfo2.fwalfaIndex = deviceModelColumnInfo.fwalfaIndex;
            deviceModelColumnInfo2.fwbetaIndex = deviceModelColumnInfo.fwbetaIndex;
            deviceModelColumnInfo2.isCheckIndex = deviceModelColumnInfo.isCheckIndex;
            deviceModelColumnInfo2.maxColumnIndexValue = deviceModelColumnInfo.maxColumnIndexValue;
        }
    }

    C4637x5b79bd5a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DeviceModelColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$className() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.classNameIndex);
    }

    public void realmSet$className(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.classNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.classNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.classNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.classNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$classTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.classTitleIndex);
    }

    public void realmSet$classTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.classTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.classTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.classTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.classTitleIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$fwstable() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fwstableIndex);
    }

    public void realmSet$fwstable(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fwstableIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fwstableIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fwstableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fwstableIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fwalfa() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fwalfaIndex);
    }

    public void realmSet$fwalfa(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fwalfaIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fwalfaIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fwalfaIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fwalfaIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$fwbeta() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fwbetaIndex);
    }

    public void realmSet$fwbeta(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fwbetaIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fwbetaIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fwbetaIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fwbetaIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public boolean realmGet$isCheck() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isCheckIndex);
    }

    public void realmSet$isCheck(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isCheckIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isCheckIndex, row$realm.getIndex(), z, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 9, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("className", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("classTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(ViewProps.ENABLED, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fwstable", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fwalfa", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("fwbeta", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("isCheck", RealmFieldType.BOOLEAN, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DeviceModelColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DeviceModelColumnInfo(osSchemaInfo);
    }

    public static DeviceModel createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        DeviceModel deviceModel = (DeviceModel) realm.createObjectInternal(DeviceModel.class, true, Collections.emptyList());
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("className")) {
            if (jSONObject.isNull("className")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$className((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$className(jSONObject.getString("className"));
            }
        }
        if (jSONObject.has("classTitle")) {
            if (jSONObject.isNull("classTitle")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$classTitle((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$classTitle(jSONObject.getString("classTitle"));
            }
        }
        if (jSONObject.has(ViewProps.ENABLED)) {
            if (jSONObject.isNull(ViewProps.ENABLED)) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$enabled((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$enabled(jSONObject.getString(ViewProps.ENABLED));
            }
        }
        if (jSONObject.has("fwstable")) {
            if (jSONObject.isNull("fwstable")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwstable((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwstable(jSONObject.getString("fwstable"));
            }
        }
        if (jSONObject.has("fwalfa")) {
            if (jSONObject.isNull("fwalfa")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwalfa((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwalfa(jSONObject.getString("fwalfa"));
            }
        }
        if (jSONObject.has("fwbeta")) {
            if (jSONObject.isNull("fwbeta")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwbeta((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwbeta(jSONObject.getString("fwbeta"));
            }
        }
        if (jSONObject.has("isCheck")) {
            if (!jSONObject.isNull("isCheck")) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$isCheck(jSONObject.getBoolean("isCheck"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isCheck' to null.");
            }
        }
        return deviceModel;
    }

    public static DeviceModel createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DeviceModel deviceModel = new DeviceModel();
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("className")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$className(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$className((String) null);
                }
            } else if (nextName.equals("classTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$classTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$classTitle((String) null);
                }
            } else if (nextName.equals(ViewProps.ENABLED)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$enabled(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$enabled((String) null);
                }
            } else if (nextName.equals("fwstable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwstable(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwstable((String) null);
                }
            } else if (nextName.equals("fwalfa")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwalfa(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwalfa((String) null);
                }
            } else if (nextName.equals("fwbeta")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwbeta(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwbeta((String) null);
                }
            } else if (!nextName.equals("isCheck")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$isCheck(jsonReader.nextBoolean());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'isCheck' to null.");
            }
        }
        jsonReader.endObject();
        return (DeviceModel) realm.copyToRealm(deviceModel, new ImportFlag[0]);
    }

    private static C4637x5b79bd5a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DeviceModel.class), false, Collections.emptyList());
        C4637x5b79bd5a ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxy = new C4637x5b79bd5a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxy;
    }

    public static DeviceModel copyOrUpdate(Realm realm, DeviceModelColumnInfo deviceModelColumnInfo, DeviceModel deviceModel, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (deviceModel instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) deviceModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return deviceModel;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(deviceModel);
        if (realmObjectProxy2 != null) {
            return (DeviceModel) realmObjectProxy2;
        }
        return copy(realm, deviceModelColumnInfo, deviceModel, z, map, set);
    }

    public static DeviceModel copy(Realm realm, DeviceModelColumnInfo deviceModelColumnInfo, DeviceModel deviceModel, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(deviceModel);
        if (realmObjectProxy != null) {
            return (DeviceModel) realmObjectProxy;
        }
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DeviceModel.class), deviceModelColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(deviceModelColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(deviceModelColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(deviceModelColumnInfo.classNameIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$className());
        osObjectBuilder.addString(deviceModelColumnInfo.classTitleIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$classTitle());
        osObjectBuilder.addString(deviceModelColumnInfo.enabledIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$enabled());
        osObjectBuilder.addString(deviceModelColumnInfo.fwstableIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwstable());
        osObjectBuilder.addString(deviceModelColumnInfo.fwalfaIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwalfa());
        osObjectBuilder.addString(deviceModelColumnInfo.fwbetaIndex, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwbeta());
        osObjectBuilder.addBoolean(deviceModelColumnInfo.isCheckIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$isCheck()));
        C4637x5b79bd5a newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(deviceModel, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, DeviceModel deviceModel, Map<RealmModel, Long> map) {
        if (deviceModel instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) deviceModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DeviceModel.class);
        long nativePtr = table.getNativePtr();
        DeviceModelColumnInfo deviceModelColumnInfo = (DeviceModelColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DeviceModel.class);
        long createRow = OsObject.createRow(table);
        map.put(deviceModel, Long.valueOf(createRow));
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$className = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$className();
        if (realmGet$className != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.classNameIndex, createRow, realmGet$className, false);
        }
        String realmGet$classTitle = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$classTitle();
        if (realmGet$classTitle != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.classTitleIndex, createRow, realmGet$classTitle, false);
        }
        String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$enabled();
        if (realmGet$enabled != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
        }
        String realmGet$fwstable = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwstable();
        if (realmGet$fwstable != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwstableIndex, createRow, realmGet$fwstable, false);
        }
        String realmGet$fwalfa = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwalfa();
        if (realmGet$fwalfa != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwalfaIndex, createRow, realmGet$fwalfa, false);
        }
        String realmGet$fwbeta = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwbeta();
        if (realmGet$fwbeta != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwbetaIndex, createRow, realmGet$fwbeta, false);
        }
        Table.nativeSetBoolean(nativePtr, deviceModelColumnInfo.isCheckIndex, createRow, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$isCheck(), false);
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DeviceModel.class);
        long nativePtr = table.getNativePtr();
        DeviceModelColumnInfo deviceModelColumnInfo = (DeviceModelColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DeviceModel.class);
        while (it.hasNext()) {
            DeviceModel deviceModel = (DeviceModel) it.next();
            if (!map2.containsKey(deviceModel)) {
                if (deviceModel instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) deviceModel;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(deviceModel, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(deviceModel, Long.valueOf(createRow));
                C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$className = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$className();
                if (realmGet$className != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.classNameIndex, createRow, realmGet$className, false);
                }
                String realmGet$classTitle = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$classTitle();
                if (realmGet$classTitle != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.classTitleIndex, createRow, realmGet$classTitle, false);
                }
                String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$enabled();
                if (realmGet$enabled != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
                }
                String realmGet$fwstable = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwstable();
                if (realmGet$fwstable != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwstableIndex, createRow, realmGet$fwstable, false);
                }
                String realmGet$fwalfa = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwalfa();
                if (realmGet$fwalfa != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwalfaIndex, createRow, realmGet$fwalfa, false);
                }
                String realmGet$fwbeta = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwbeta();
                if (realmGet$fwbeta != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwbetaIndex, createRow, realmGet$fwbeta, false);
                }
                Table.nativeSetBoolean(nativePtr, deviceModelColumnInfo.isCheckIndex, createRow, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$isCheck(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DeviceModel deviceModel, Map<RealmModel, Long> map) {
        if (deviceModel instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) deviceModel;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DeviceModel.class);
        long nativePtr = table.getNativePtr();
        DeviceModelColumnInfo deviceModelColumnInfo = (DeviceModelColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DeviceModel.class);
        long createRow = OsObject.createRow(table);
        map.put(deviceModel, Long.valueOf(createRow));
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$className = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$className();
        if (realmGet$className != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.classNameIndex, createRow, realmGet$className, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.classNameIndex, createRow, false);
        }
        String realmGet$classTitle = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$classTitle();
        if (realmGet$classTitle != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.classTitleIndex, createRow, realmGet$classTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.classTitleIndex, createRow, false);
        }
        String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$enabled();
        if (realmGet$enabled != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.enabledIndex, createRow, false);
        }
        String realmGet$fwstable = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwstable();
        if (realmGet$fwstable != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwstableIndex, createRow, realmGet$fwstable, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.fwstableIndex, createRow, false);
        }
        String realmGet$fwalfa = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwalfa();
        if (realmGet$fwalfa != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwalfaIndex, createRow, realmGet$fwalfa, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.fwalfaIndex, createRow, false);
        }
        String realmGet$fwbeta = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwbeta();
        if (realmGet$fwbeta != null) {
            Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwbetaIndex, createRow, realmGet$fwbeta, false);
        } else {
            Table.nativeSetNull(nativePtr, deviceModelColumnInfo.fwbetaIndex, createRow, false);
        }
        Table.nativeSetBoolean(nativePtr, deviceModelColumnInfo.isCheckIndex, createRow, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$isCheck(), false);
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DeviceModel.class);
        long nativePtr = table.getNativePtr();
        DeviceModelColumnInfo deviceModelColumnInfo = (DeviceModelColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DeviceModel.class);
        while (it.hasNext()) {
            DeviceModel deviceModel = (DeviceModel) it.next();
            if (!map2.containsKey(deviceModel)) {
                if (deviceModel instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) deviceModel;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(deviceModel, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(deviceModel, Long.valueOf(createRow));
                C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$className = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$className();
                if (realmGet$className != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.classNameIndex, createRow, realmGet$className, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.classNameIndex, createRow, false);
                }
                String realmGet$classTitle = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$classTitle();
                if (realmGet$classTitle != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.classTitleIndex, createRow, realmGet$classTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.classTitleIndex, createRow, false);
                }
                String realmGet$enabled = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$enabled();
                if (realmGet$enabled != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.enabledIndex, createRow, realmGet$enabled, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.enabledIndex, createRow, false);
                }
                String realmGet$fwstable = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwstable();
                if (realmGet$fwstable != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwstableIndex, createRow, realmGet$fwstable, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.fwstableIndex, createRow, false);
                }
                String realmGet$fwalfa = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwalfa();
                if (realmGet$fwalfa != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwalfaIndex, createRow, realmGet$fwalfa, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.fwalfaIndex, createRow, false);
                }
                String realmGet$fwbeta = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$fwbeta();
                if (realmGet$fwbeta != null) {
                    Table.nativeSetString(nativePtr, deviceModelColumnInfo.fwbetaIndex, createRow, realmGet$fwbeta, false);
                } else {
                    Table.nativeSetNull(nativePtr, deviceModelColumnInfo.fwbetaIndex, createRow, false);
                }
                Table.nativeSetBoolean(nativePtr, deviceModelColumnInfo.isCheckIndex, createRow, ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmGet$isCheck(), false);
            }
        }
    }

    public static DeviceModel createDetachedCopy(DeviceModel deviceModel, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DeviceModel deviceModel2;
        if (i > i2 || deviceModel == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(deviceModel);
        if (cacheData == null) {
            deviceModel2 = new DeviceModel();
            map.put(deviceModel, new RealmObjectProxy.CacheData(i, deviceModel2));
        } else if (i >= cacheData.minDepth) {
            return (DeviceModel) cacheData.object;
        } else {
            cacheData.minDepth = i;
            deviceModel2 = (DeviceModel) cacheData.object;
        }
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface = deviceModel2;
        C4638x2c6434ff ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2 = deviceModel;
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$className(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$className());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$classTitle(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$classTitle());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$enabled(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$enabled());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwstable(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$fwstable());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwalfa(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$fwalfa());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$fwbeta(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$fwbeta());
        ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface.realmSet$isCheck(ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxyinterface2.realmGet$isCheck());
        return deviceModel2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DeviceModel = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{className:");
        sb.append(realmGet$className() != null ? realmGet$className() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{classTitle:");
        sb.append(realmGet$classTitle() != null ? realmGet$classTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{enabled:");
        sb.append(realmGet$enabled() != null ? realmGet$enabled() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fwstable:");
        sb.append(realmGet$fwstable() != null ? realmGet$fwstable() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fwalfa:");
        sb.append(realmGet$fwalfa() != null ? realmGet$fwalfa() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fwbeta:");
        if (realmGet$fwbeta() != null) {
            str = realmGet$fwbeta();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{isCheck:");
        sb.append(realmGet$isCheck());
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
        C4637x5b79bd5a ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxy = (C4637x5b79bd5a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_api_devicemodelrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
