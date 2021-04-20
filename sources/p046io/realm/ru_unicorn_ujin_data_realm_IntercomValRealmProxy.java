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
import p035ru.unicorn.ujin.data.realm.IntercomVal;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy */
public class ru_unicorn_ujin_data_realm_IntercomValRealmProxy extends IntercomVal implements RealmObjectProxy, ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private IntercomValColumnInfo columnInfo;
    private ProxyState<IntercomVal> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "IntercomVal";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy$IntercomValColumnInfo */
    static final class IntercomValColumnInfo extends ColumnInfo {
        long archiveAvailableIndex;
        long buttonCaptionIndex;
        long codeIndex;
        long idCameraIndex;
        long isButtonNeedHideIndex;
        long maxColumnIndexValue;
        long mjpegNewIndex;
        long nameIndex;
        long openUrlIndex;
        long previewIndex;
        long rtmpIndex;
        long urlIndex;

        IntercomValColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(11);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.openUrlIndex = addColumnDetails("openUrl", "openUrl", objectSchemaInfo);
            this.rtmpIndex = addColumnDetails("rtmp", "rtmp", objectSchemaInfo);
            this.codeIndex = addColumnDetails("code", "code", objectSchemaInfo);
            this.mjpegNewIndex = addColumnDetails("mjpegNew", "mjpegNew", objectSchemaInfo);
            this.idCameraIndex = addColumnDetails("idCamera", "idCamera", objectSchemaInfo);
            this.previewIndex = addColumnDetails(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, objectSchemaInfo);
            this.buttonCaptionIndex = addColumnDetails("buttonCaption", "buttonCaption", objectSchemaInfo);
            this.archiveAvailableIndex = addColumnDetails("archiveAvailable", "archiveAvailable", objectSchemaInfo);
            this.isButtonNeedHideIndex = addColumnDetails("isButtonNeedHide", "isButtonNeedHide", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        IntercomValColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new IntercomValColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            IntercomValColumnInfo intercomValColumnInfo = (IntercomValColumnInfo) columnInfo;
            IntercomValColumnInfo intercomValColumnInfo2 = (IntercomValColumnInfo) columnInfo2;
            intercomValColumnInfo2.nameIndex = intercomValColumnInfo.nameIndex;
            intercomValColumnInfo2.urlIndex = intercomValColumnInfo.urlIndex;
            intercomValColumnInfo2.openUrlIndex = intercomValColumnInfo.openUrlIndex;
            intercomValColumnInfo2.rtmpIndex = intercomValColumnInfo.rtmpIndex;
            intercomValColumnInfo2.codeIndex = intercomValColumnInfo.codeIndex;
            intercomValColumnInfo2.mjpegNewIndex = intercomValColumnInfo.mjpegNewIndex;
            intercomValColumnInfo2.idCameraIndex = intercomValColumnInfo.idCameraIndex;
            intercomValColumnInfo2.previewIndex = intercomValColumnInfo.previewIndex;
            intercomValColumnInfo2.buttonCaptionIndex = intercomValColumnInfo.buttonCaptionIndex;
            intercomValColumnInfo2.archiveAvailableIndex = intercomValColumnInfo.archiveAvailableIndex;
            intercomValColumnInfo2.isButtonNeedHideIndex = intercomValColumnInfo.isButtonNeedHideIndex;
            intercomValColumnInfo2.maxColumnIndexValue = intercomValColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_IntercomValRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (IntercomValColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$url() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.urlIndex);
    }

    public void realmSet$url(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.urlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.urlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.urlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.urlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$openUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.openUrlIndex);
    }

    public void realmSet$openUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.openUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.openUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.openUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.openUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$rtmp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.rtmpIndex);
    }

    public void realmSet$rtmp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.rtmpIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.rtmpIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.rtmpIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.rtmpIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$code() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.codeIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.codeIndex));
    }

    public void realmSet$code(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.codeIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.codeIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.codeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.codeIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$mjpegNew() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.mjpegNewIndex);
    }

    public void realmSet$mjpegNew(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.mjpegNewIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.mjpegNewIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.mjpegNewIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.mjpegNewIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$idCamera() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idCameraIndex);
    }

    public void realmSet$idCamera(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idCameraIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idCameraIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idCameraIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idCameraIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$buttonCaption() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.buttonCaptionIndex);
    }

    public void realmSet$buttonCaption(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buttonCaptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.buttonCaptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.buttonCaptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.buttonCaptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$archiveAvailable() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.archiveAvailableIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.archiveAvailableIndex));
    }

    public void realmSet$archiveAvailable(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.archiveAvailableIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.archiveAvailableIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.archiveAvailableIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.archiveAvailableIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public int realmGet$isButtonNeedHide() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.isButtonNeedHideIndex);
    }

    public void realmSet$isButtonNeedHide(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.isButtonNeedHideIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.isButtonNeedHideIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 11, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("openUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("rtmp", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("code", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("mjpegNew", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("idCamera", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buttonCaption", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("archiveAvailable", RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("isButtonNeedHide", RealmFieldType.INTEGER, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static IntercomValColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new IntercomValColumnInfo(osSchemaInfo);
    }

    public static IntercomVal createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        IntercomVal intercomVal = (IntercomVal) realm.createObjectInternal(IntercomVal.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        if (jSONObject.has("openUrl")) {
            if (jSONObject.isNull("openUrl")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$openUrl((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$openUrl(jSONObject.getString("openUrl"));
            }
        }
        if (jSONObject.has("rtmp")) {
            if (jSONObject.isNull("rtmp")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$rtmp((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$rtmp(jSONObject.getString("rtmp"));
            }
        }
        if (jSONObject.has("code")) {
            if (jSONObject.isNull("code")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$code((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$code(Integer.valueOf(jSONObject.getInt("code")));
            }
        }
        if (jSONObject.has("mjpegNew")) {
            if (jSONObject.isNull("mjpegNew")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$mjpegNew((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$mjpegNew(jSONObject.getString("mjpegNew"));
            }
        }
        if (jSONObject.has("idCamera")) {
            if (jSONObject.isNull("idCamera")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$idCamera((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$idCamera(jSONObject.getString("idCamera"));
            }
        }
        if (jSONObject.has(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (jSONObject.isNull(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$preview((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$preview(jSONObject.getString(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW));
            }
        }
        if (jSONObject.has("buttonCaption")) {
            if (jSONObject.isNull("buttonCaption")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$buttonCaption((String) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$buttonCaption(jSONObject.getString("buttonCaption"));
            }
        }
        if (jSONObject.has("archiveAvailable")) {
            if (jSONObject.isNull("archiveAvailable")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$archiveAvailable((Boolean) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$archiveAvailable(Boolean.valueOf(jSONObject.getBoolean("archiveAvailable")));
            }
        }
        if (jSONObject.has("isButtonNeedHide")) {
            if (!jSONObject.isNull("isButtonNeedHide")) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$isButtonNeedHide(jSONObject.getInt("isButtonNeedHide"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isButtonNeedHide' to null.");
            }
        }
        return intercomVal;
    }

    public static IntercomVal createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        IntercomVal intercomVal = new IntercomVal();
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$url((String) null);
                }
            } else if (nextName.equals("openUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$openUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$openUrl((String) null);
                }
            } else if (nextName.equals("rtmp")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$rtmp(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$rtmp((String) null);
                }
            } else if (nextName.equals("code")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$code(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$code((Integer) null);
                }
            } else if (nextName.equals("mjpegNew")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$mjpegNew(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$mjpegNew((String) null);
                }
            } else if (nextName.equals("idCamera")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$idCamera(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$idCamera((String) null);
                }
            } else if (nextName.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$preview(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$preview((String) null);
                }
            } else if (nextName.equals("buttonCaption")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$buttonCaption(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$buttonCaption((String) null);
                }
            } else if (nextName.equals("archiveAvailable")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$archiveAvailable(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$archiveAvailable((Boolean) null);
                }
            } else if (!nextName.equals("isButtonNeedHide")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$isButtonNeedHide(jsonReader.nextInt());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'isButtonNeedHide' to null.");
            }
        }
        jsonReader.endObject();
        return (IntercomVal) realm.copyToRealm(intercomVal, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_IntercomValRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_IntercomValRealmProxy ru_unicorn_ujin_data_realm_intercomvalrealmproxy = new ru_unicorn_ujin_data_realm_IntercomValRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_intercomvalrealmproxy;
    }

    public static IntercomVal copyOrUpdate(Realm realm, IntercomValColumnInfo intercomValColumnInfo, IntercomVal intercomVal, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (intercomVal instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercomVal;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return intercomVal;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(intercomVal);
        if (realmObjectProxy2 != null) {
            return (IntercomVal) realmObjectProxy2;
        }
        return copy(realm, intercomValColumnInfo, intercomVal, z, map, set);
    }

    public static IntercomVal copy(Realm realm, IntercomValColumnInfo intercomValColumnInfo, IntercomVal intercomVal, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(intercomVal);
        if (realmObjectProxy != null) {
            return (IntercomVal) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(IntercomVal.class), intercomValColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(intercomValColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(intercomValColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$url());
        osObjectBuilder.addString(intercomValColumnInfo.openUrlIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$openUrl());
        osObjectBuilder.addString(intercomValColumnInfo.rtmpIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$rtmp());
        osObjectBuilder.addInteger(intercomValColumnInfo.codeIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$code());
        osObjectBuilder.addString(intercomValColumnInfo.mjpegNewIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$mjpegNew());
        osObjectBuilder.addString(intercomValColumnInfo.idCameraIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$idCamera());
        osObjectBuilder.addString(intercomValColumnInfo.previewIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$preview());
        osObjectBuilder.addString(intercomValColumnInfo.buttonCaptionIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$buttonCaption());
        osObjectBuilder.addBoolean(intercomValColumnInfo.archiveAvailableIndex, ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$archiveAvailable());
        osObjectBuilder.addInteger(intercomValColumnInfo.isButtonNeedHideIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$isButtonNeedHide()));
        ru_unicorn_ujin_data_realm_IntercomValRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(intercomVal, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, IntercomVal intercomVal, Map<RealmModel, Long> map) {
        IntercomVal intercomVal2 = intercomVal;
        if (intercomVal2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercomVal2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(IntercomVal.class);
        long nativePtr = table.getNativePtr();
        IntercomValColumnInfo intercomValColumnInfo = (IntercomValColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class);
        long createRow = OsObject.createRow(table);
        map.put(intercomVal2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal2;
        String realmGet$name = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        String realmGet$openUrl = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$openUrl();
        if (realmGet$openUrl != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.openUrlIndex, createRow, realmGet$openUrl, false);
        }
        String realmGet$rtmp = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$rtmp();
        if (realmGet$rtmp != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.rtmpIndex, createRow, realmGet$rtmp, false);
        }
        Integer realmGet$code = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(nativePtr, intercomValColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
        }
        String realmGet$mjpegNew = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$mjpegNew();
        if (realmGet$mjpegNew != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.mjpegNewIndex, createRow, realmGet$mjpegNew, false);
        }
        String realmGet$idCamera = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$idCamera();
        if (realmGet$idCamera != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.idCameraIndex, createRow, realmGet$idCamera, false);
        }
        String realmGet$preview = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.previewIndex, createRow, realmGet$preview, false);
        }
        String realmGet$buttonCaption = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$buttonCaption();
        if (realmGet$buttonCaption != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.buttonCaptionIndex, createRow, realmGet$buttonCaption, false);
        }
        Boolean realmGet$archiveAvailable = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$archiveAvailable();
        if (realmGet$archiveAvailable != null) {
            Table.nativeSetBoolean(nativePtr, intercomValColumnInfo.archiveAvailableIndex, createRow, realmGet$archiveAvailable.booleanValue(), false);
        }
        Table.nativeSetLong(nativePtr, intercomValColumnInfo.isButtonNeedHideIndex, createRow, (long) ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$isButtonNeedHide(), false);
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(IntercomVal.class);
        long nativePtr = table.getNativePtr();
        IntercomValColumnInfo intercomValColumnInfo = (IntercomValColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class);
        while (it.hasNext()) {
            IntercomVal intercomVal = (IntercomVal) it.next();
            if (!map2.containsKey(intercomVal)) {
                if (intercomVal instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercomVal;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(intercomVal, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(intercomVal, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal;
                String realmGet$name = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
                String realmGet$openUrl = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$openUrl();
                if (realmGet$openUrl != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.openUrlIndex, createRow, realmGet$openUrl, false);
                }
                String realmGet$rtmp = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$rtmp();
                if (realmGet$rtmp != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.rtmpIndex, createRow, realmGet$rtmp, false);
                }
                Integer realmGet$code = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(nativePtr, intercomValColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
                }
                String realmGet$mjpegNew = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$mjpegNew();
                if (realmGet$mjpegNew != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.mjpegNewIndex, createRow, realmGet$mjpegNew, false);
                }
                String realmGet$idCamera = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$idCamera();
                if (realmGet$idCamera != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.idCameraIndex, createRow, realmGet$idCamera, false);
                }
                String realmGet$preview = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.previewIndex, createRow, realmGet$preview, false);
                }
                String realmGet$buttonCaption = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$buttonCaption();
                if (realmGet$buttonCaption != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.buttonCaptionIndex, createRow, realmGet$buttonCaption, false);
                }
                Boolean realmGet$archiveAvailable = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$archiveAvailable();
                if (realmGet$archiveAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, intercomValColumnInfo.archiveAvailableIndex, createRow, realmGet$archiveAvailable.booleanValue(), false);
                }
                Table.nativeSetLong(nativePtr, intercomValColumnInfo.isButtonNeedHideIndex, createRow, (long) ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$isButtonNeedHide(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, IntercomVal intercomVal, Map<RealmModel, Long> map) {
        IntercomVal intercomVal2 = intercomVal;
        if (intercomVal2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercomVal2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(IntercomVal.class);
        long nativePtr = table.getNativePtr();
        IntercomValColumnInfo intercomValColumnInfo = (IntercomValColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class);
        long createRow = OsObject.createRow(table);
        map.put(intercomVal2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal2;
        String realmGet$name = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.urlIndex, createRow, false);
        }
        String realmGet$openUrl = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$openUrl();
        if (realmGet$openUrl != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.openUrlIndex, createRow, realmGet$openUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.openUrlIndex, createRow, false);
        }
        String realmGet$rtmp = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$rtmp();
        if (realmGet$rtmp != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.rtmpIndex, createRow, realmGet$rtmp, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.rtmpIndex, createRow, false);
        }
        Integer realmGet$code = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(nativePtr, intercomValColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.codeIndex, createRow, false);
        }
        String realmGet$mjpegNew = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$mjpegNew();
        if (realmGet$mjpegNew != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.mjpegNewIndex, createRow, realmGet$mjpegNew, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.mjpegNewIndex, createRow, false);
        }
        String realmGet$idCamera = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$idCamera();
        if (realmGet$idCamera != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.idCameraIndex, createRow, realmGet$idCamera, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.idCameraIndex, createRow, false);
        }
        String realmGet$preview = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.previewIndex, createRow, realmGet$preview, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.previewIndex, createRow, false);
        }
        String realmGet$buttonCaption = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$buttonCaption();
        if (realmGet$buttonCaption != null) {
            Table.nativeSetString(nativePtr, intercomValColumnInfo.buttonCaptionIndex, createRow, realmGet$buttonCaption, false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.buttonCaptionIndex, createRow, false);
        }
        Boolean realmGet$archiveAvailable = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$archiveAvailable();
        if (realmGet$archiveAvailable != null) {
            Table.nativeSetBoolean(nativePtr, intercomValColumnInfo.archiveAvailableIndex, createRow, realmGet$archiveAvailable.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, intercomValColumnInfo.archiveAvailableIndex, createRow, false);
        }
        Table.nativeSetLong(nativePtr, intercomValColumnInfo.isButtonNeedHideIndex, createRow, (long) ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$isButtonNeedHide(), false);
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(IntercomVal.class);
        long nativePtr = table.getNativePtr();
        IntercomValColumnInfo intercomValColumnInfo = (IntercomValColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class);
        while (it.hasNext()) {
            IntercomVal intercomVal = (IntercomVal) it.next();
            if (!map2.containsKey(intercomVal)) {
                if (intercomVal instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercomVal;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(intercomVal, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(intercomVal, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal;
                String realmGet$name = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.urlIndex, createRow, false);
                }
                String realmGet$openUrl = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$openUrl();
                if (realmGet$openUrl != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.openUrlIndex, createRow, realmGet$openUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.openUrlIndex, createRow, false);
                }
                String realmGet$rtmp = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$rtmp();
                if (realmGet$rtmp != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.rtmpIndex, createRow, realmGet$rtmp, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.rtmpIndex, createRow, false);
                }
                Integer realmGet$code = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(nativePtr, intercomValColumnInfo.codeIndex, createRow, realmGet$code.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.codeIndex, createRow, false);
                }
                String realmGet$mjpegNew = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$mjpegNew();
                if (realmGet$mjpegNew != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.mjpegNewIndex, createRow, realmGet$mjpegNew, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.mjpegNewIndex, createRow, false);
                }
                String realmGet$idCamera = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$idCamera();
                if (realmGet$idCamera != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.idCameraIndex, createRow, realmGet$idCamera, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.idCameraIndex, createRow, false);
                }
                String realmGet$preview = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.previewIndex, createRow, realmGet$preview, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.previewIndex, createRow, false);
                }
                String realmGet$buttonCaption = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$buttonCaption();
                if (realmGet$buttonCaption != null) {
                    Table.nativeSetString(nativePtr, intercomValColumnInfo.buttonCaptionIndex, createRow, realmGet$buttonCaption, false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.buttonCaptionIndex, createRow, false);
                }
                Boolean realmGet$archiveAvailable = ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$archiveAvailable();
                if (realmGet$archiveAvailable != null) {
                    Table.nativeSetBoolean(nativePtr, intercomValColumnInfo.archiveAvailableIndex, createRow, realmGet$archiveAvailable.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomValColumnInfo.archiveAvailableIndex, createRow, false);
                }
                Table.nativeSetLong(nativePtr, intercomValColumnInfo.isButtonNeedHideIndex, createRow, (long) ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmGet$isButtonNeedHide(), false);
            }
        }
    }

    public static IntercomVal createDetachedCopy(IntercomVal intercomVal, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        IntercomVal intercomVal2;
        if (i > i2 || intercomVal == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(intercomVal);
        if (cacheData == null) {
            intercomVal2 = new IntercomVal();
            map.put(intercomVal, new RealmObjectProxy.CacheData(i, intercomVal2));
        } else if (i >= cacheData.minDepth) {
            return (IntercomVal) cacheData.object;
        } else {
            cacheData.minDepth = i;
            intercomVal2 = (IntercomVal) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface = intercomVal2;
        ru_unicorn_ujin_data_realm_IntercomValRealmProxyInterface ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2 = intercomVal;
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$openUrl(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$openUrl());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$rtmp(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$rtmp());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$code(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$code());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$mjpegNew(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$mjpegNew());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$idCamera(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$idCamera());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$preview(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$preview());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$buttonCaption(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$buttonCaption());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$archiveAvailable(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$archiveAvailable());
        ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface.realmSet$isButtonNeedHide(ru_unicorn_ujin_data_realm_intercomvalrealmproxyinterface2.realmGet$isButtonNeedHide());
        return intercomVal2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v41, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v43, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r5 = this;
            boolean r0 = p046io.realm.RealmObject.isValid(r5)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "Invalid object"
            return r0
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IntercomVal = proxy["
            r0.<init>(r1)
            java.lang.String r1 = "{name:"
            r0.append(r1)
            java.lang.String r1 = r5.realmGet$name()
            java.lang.String r2 = "null"
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = r5.realmGet$name()
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r3 = ","
            r0.append(r3)
            java.lang.String r4 = "{url:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$url()
            if (r4 == 0) goto L_0x0043
            java.lang.String r4 = r5.realmGet$url()
            goto L_0x0044
        L_0x0043:
            r4 = r2
        L_0x0044:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{openUrl:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$openUrl()
            if (r4 == 0) goto L_0x005e
            java.lang.String r4 = r5.realmGet$openUrl()
            goto L_0x005f
        L_0x005e:
            r4 = r2
        L_0x005f:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{rtmp:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$rtmp()
            if (r4 == 0) goto L_0x0079
            java.lang.String r4 = r5.realmGet$rtmp()
            goto L_0x007a
        L_0x0079:
            r4 = r2
        L_0x007a:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{code:"
            r0.append(r4)
            java.lang.Integer r4 = r5.realmGet$code()
            if (r4 == 0) goto L_0x0094
            java.lang.Integer r4 = r5.realmGet$code()
            goto L_0x0095
        L_0x0094:
            r4 = r2
        L_0x0095:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{mjpegNew:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$mjpegNew()
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r5.realmGet$mjpegNew()
            goto L_0x00b0
        L_0x00af:
            r4 = r2
        L_0x00b0:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{idCamera:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$idCamera()
            if (r4 == 0) goto L_0x00ca
            java.lang.String r4 = r5.realmGet$idCamera()
            goto L_0x00cb
        L_0x00ca:
            r4 = r2
        L_0x00cb:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{preview:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$preview()
            if (r4 == 0) goto L_0x00e5
            java.lang.String r4 = r5.realmGet$preview()
            goto L_0x00e6
        L_0x00e5:
            r4 = r2
        L_0x00e6:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{buttonCaption:"
            r0.append(r4)
            java.lang.String r4 = r5.realmGet$buttonCaption()
            if (r4 == 0) goto L_0x0100
            java.lang.String r4 = r5.realmGet$buttonCaption()
            goto L_0x0101
        L_0x0100:
            r4 = r2
        L_0x0101:
            r0.append(r4)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r4 = "{archiveAvailable:"
            r0.append(r4)
            java.lang.Boolean r4 = r5.realmGet$archiveAvailable()
            if (r4 == 0) goto L_0x011a
            java.lang.Boolean r2 = r5.realmGet$archiveAvailable()
        L_0x011a:
            r0.append(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r2 = "{isButtonNeedHide:"
            r0.append(r2)
            int r2 = r5.realmGet$isButtonNeedHide()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy.toString():java.lang.String");
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
        ru_unicorn_ujin_data_realm_IntercomValRealmProxy ru_unicorn_ujin_data_realm_intercomvalrealmproxy = (ru_unicorn_ujin_data_realm_IntercomValRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_intercomvalrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_intercomvalrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_intercomvalrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
