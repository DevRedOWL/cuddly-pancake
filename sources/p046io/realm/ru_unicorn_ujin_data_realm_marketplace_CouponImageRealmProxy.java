package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.marketplace.CouponImage;
import p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy extends CouponImage implements RealmObjectProxy, C4613xe0811b7c {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CouponImageColumnInfo columnInfo;
    private ProxyState<CouponImage> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CouponImage";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy$CouponImageColumnInfo */
    static final class CouponImageColumnInfo extends ColumnInfo {
        long bytesIndex;
        long heightIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long previewIndex;
        long urlIndex;
        long widthIndex;

        CouponImageColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.bytesIndex = addColumnDetails("bytes", "bytes", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.widthIndex = addColumnDetails("width", "width", objectSchemaInfo);
            this.heightIndex = addColumnDetails("height", "height", objectSchemaInfo);
            this.previewIndex = addColumnDetails(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CouponImageColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CouponImageColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CouponImageColumnInfo couponImageColumnInfo = (CouponImageColumnInfo) columnInfo;
            CouponImageColumnInfo couponImageColumnInfo2 = (CouponImageColumnInfo) columnInfo2;
            couponImageColumnInfo2.idIndex = couponImageColumnInfo.idIndex;
            couponImageColumnInfo2.bytesIndex = couponImageColumnInfo.bytesIndex;
            couponImageColumnInfo2.nameIndex = couponImageColumnInfo.nameIndex;
            couponImageColumnInfo2.urlIndex = couponImageColumnInfo.urlIndex;
            couponImageColumnInfo2.widthIndex = couponImageColumnInfo.widthIndex;
            couponImageColumnInfo2.heightIndex = couponImageColumnInfo.heightIndex;
            couponImageColumnInfo2.previewIndex = couponImageColumnInfo.previewIndex;
            couponImageColumnInfo2.maxColumnIndexValue = couponImageColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CouponImageColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$bytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.bytesIndex);
    }

    public void realmSet$bytes(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.bytesIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.bytesIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.bytesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.bytesIndex, row$realm.getIndex(), str, true);
            }
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

    public Float realmGet$width() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.widthIndex)) {
            return null;
        }
        return Float.valueOf(this.proxyState.getRow$realm().getFloat(this.columnInfo.widthIndex));
    }

    public void realmSet$width(Float f) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (f == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.widthIndex);
            } else {
                this.proxyState.getRow$realm().setFloat(this.columnInfo.widthIndex, f.floatValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (f == null) {
                row$realm.getTable().setNull(this.columnInfo.widthIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setFloat(this.columnInfo.widthIndex, row$realm.getIndex(), f.floatValue(), true);
            }
        }
    }

    public Float realmGet$height() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.heightIndex)) {
            return null;
        }
        return Float.valueOf(this.proxyState.getRow$realm().getFloat(this.columnInfo.heightIndex));
    }

    public void realmSet$height(Float f) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (f == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.heightIndex);
            } else {
                this.proxyState.getRow$realm().setFloat(this.columnInfo.heightIndex, f.floatValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (f == null) {
                row$realm.getTable().setNull(this.columnInfo.heightIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setFloat(this.columnInfo.heightIndex, row$realm.getIndex(), f.floatValue(), true);
            }
        }
    }

    public PreviewImage realmGet$preview() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.previewIndex)) {
            return null;
        }
        return (PreviewImage) this.proxyState.getRealm$realm().get(PreviewImage.class, this.proxyState.getRow$realm().getLink(this.columnInfo.previewIndex), false, Collections.emptyList());
    }

    public void realmSet$preview(PreviewImage previewImage) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (previewImage == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.previewIndex);
                return;
            }
            this.proxyState.checkValidObject(previewImage);
            this.proxyState.getRow$realm().setLink(this.columnInfo.previewIndex, ((RealmObjectProxy) previewImage).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (previewImage != null && !RealmObject.isManaged(previewImage)) {
                previewImage = (PreviewImage) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(previewImage, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (previewImage == null) {
                row$realm.nullifyLink(this.columnInfo.previewIndex);
                return;
            }
            this.proxyState.checkValidObject(previewImage);
            row$realm.getTable().setLink(this.columnInfo.previewIndex, row$realm.getIndex(), ((RealmObjectProxy) previewImage).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("bytes", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("width", RealmFieldType.FLOAT, false, false, false);
        builder2.addPersistedProperty("height", RealmFieldType.FLOAT, false, false, false);
        builder.addPersistedLinkProperty(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW, RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CouponImageColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CouponImageColumnInfo(osSchemaInfo);
    }

    public static CouponImage createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            arrayList.add(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW);
        }
        CouponImage couponImage = (CouponImage) realm.createObjectInternal(CouponImage.class, true, arrayList);
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("bytes")) {
            if (jSONObject.isNull("bytes")) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$bytes((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$bytes(jSONObject.getString("bytes"));
            }
        }
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        if (jSONObject.has("width")) {
            if (jSONObject.isNull("width")) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$width((Float) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$width(Float.valueOf((float) jSONObject.getDouble("width")));
            }
        }
        if (jSONObject.has("height")) {
            if (jSONObject.isNull("height")) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$height((Float) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$height(Float.valueOf((float) jSONObject.getDouble("height")));
            }
        }
        if (jSONObject.has(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
            if (jSONObject.isNull(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$preview((PreviewImage) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$preview(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW), z));
            }
        }
        return couponImage;
    }

    public static CouponImage createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CouponImage couponImage = new CouponImage();
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("bytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$bytes(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$bytes((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$url((String) null);
                }
            } else if (nextName.equals("width")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$width(Float.valueOf((float) jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$width((Float) null);
                }
            } else if (nextName.equals("height")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$height(Float.valueOf((float) jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$height((Float) null);
                }
            } else if (!nextName.equals(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_PREVIEW)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$preview((PreviewImage) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$preview(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (CouponImage) realm.copyToRealm(couponImage, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxy;
    }

    public static CouponImage copyOrUpdate(Realm realm, CouponImageColumnInfo couponImageColumnInfo, CouponImage couponImage, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (couponImage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) couponImage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return couponImage;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(couponImage);
        if (realmObjectProxy2 != null) {
            return (CouponImage) realmObjectProxy2;
        }
        return copy(realm, couponImageColumnInfo, couponImage, z, map, set);
    }

    public static CouponImage copy(Realm realm, CouponImageColumnInfo couponImageColumnInfo, CouponImage couponImage, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(couponImage);
        if (realmObjectProxy != null) {
            return (CouponImage) realmObjectProxy;
        }
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CouponImage.class), couponImageColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(couponImageColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(couponImageColumnInfo.bytesIndex, ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$bytes());
        osObjectBuilder.addString(couponImageColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(couponImageColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$url());
        osObjectBuilder.addFloat(couponImageColumnInfo.widthIndex, ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$width());
        osObjectBuilder.addFloat(couponImageColumnInfo.heightIndex, ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$height());
        ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(couponImage, newProxyInstance);
        PreviewImage realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$preview();
        if (realmGet$preview == null) {
            newProxyInstance.realmSet$preview((PreviewImage) null);
        } else {
            PreviewImage previewImage = (PreviewImage) map.get(realmGet$preview);
            if (previewImage != null) {
                newProxyInstance.realmSet$preview(previewImage);
            } else {
                newProxyInstance.realmSet$preview(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.PreviewImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class), realmGet$preview, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, CouponImage couponImage, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        CouponImage couponImage2 = couponImage;
        Map<RealmModel, Long> map2 = map;
        if (couponImage2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) couponImage2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CouponImage.class);
        long nativePtr = table.getNativePtr();
        CouponImageColumnInfo couponImageColumnInfo = (CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class);
        long createRow = OsObject.createRow(table);
        map2.put(couponImage2, Long.valueOf(createRow));
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$bytes();
        if (realmGet$bytes != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetFloat(nativePtr, couponImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
        }
        Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetFloat(nativePtr, couponImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
        }
        PreviewImage realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Long l = map2.get(realmGet$preview);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insert(realm2, realmGet$preview, map2));
            }
            Table.nativeSetLink(nativePtr, couponImageColumnInfo.previewIndex, createRow, l.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CouponImage.class);
        long nativePtr = table.getNativePtr();
        CouponImageColumnInfo couponImageColumnInfo = (CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class);
        while (it.hasNext()) {
            CouponImage couponImage = (CouponImage) it.next();
            if (!map2.containsKey(couponImage)) {
                if (couponImage instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) couponImage;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(couponImage, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(couponImage, Long.valueOf(createRow));
                C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$bytes();
                if (realmGet$bytes != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
                Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetFloat(nativePtr, couponImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
                }
                Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetFloat(nativePtr, couponImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
                }
                PreviewImage realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Long l = map2.get(realmGet$preview);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insert(realm2, realmGet$preview, map2));
                    }
                    table.setLink(couponImageColumnInfo.previewIndex, createRow, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CouponImage couponImage, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        CouponImage couponImage2 = couponImage;
        Map<RealmModel, Long> map2 = map;
        if (couponImage2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) couponImage2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CouponImage.class);
        long nativePtr = table.getNativePtr();
        CouponImageColumnInfo couponImageColumnInfo = (CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class);
        long createRow = OsObject.createRow(table);
        map2.put(couponImage2, Long.valueOf(createRow));
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, couponImageColumnInfo.idIndex, createRow, false);
        }
        String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$bytes();
        if (realmGet$bytes != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
        } else {
            Table.nativeSetNull(nativePtr, couponImageColumnInfo.bytesIndex, createRow, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, couponImageColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, couponImageColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, couponImageColumnInfo.urlIndex, createRow, false);
        }
        Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetFloat(nativePtr, couponImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, couponImageColumnInfo.widthIndex, createRow, false);
        }
        Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetFloat(nativePtr, couponImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, couponImageColumnInfo.heightIndex, createRow, false);
        }
        PreviewImage realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$preview();
        if (realmGet$preview != null) {
            Long l = map2.get(realmGet$preview);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insertOrUpdate(realm2, realmGet$preview, map2));
            }
            Table.nativeSetLink(nativePtr, couponImageColumnInfo.previewIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, couponImageColumnInfo.previewIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CouponImage.class);
        long nativePtr = table.getNativePtr();
        CouponImageColumnInfo couponImageColumnInfo = (CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class);
        while (it.hasNext()) {
            CouponImage couponImage = (CouponImage) it.next();
            if (!map2.containsKey(couponImage)) {
                if (couponImage instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) couponImage;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(couponImage, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(couponImage, Long.valueOf(createRow));
                C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponImageColumnInfo.idIndex, createRow, false);
                }
                String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$bytes();
                if (realmGet$bytes != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponImageColumnInfo.bytesIndex, createRow, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponImageColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, couponImageColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponImageColumnInfo.urlIndex, createRow, false);
                }
                Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetFloat(nativePtr, couponImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, couponImageColumnInfo.widthIndex, createRow, false);
                }
                Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetFloat(nativePtr, couponImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, couponImageColumnInfo.heightIndex, createRow, false);
                }
                PreviewImage realmGet$preview = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmGet$preview();
                if (realmGet$preview != null) {
                    Long l = map2.get(realmGet$preview);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.insertOrUpdate(realm2, realmGet$preview, map2));
                    }
                    Table.nativeSetLink(nativePtr, couponImageColumnInfo.previewIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, couponImageColumnInfo.previewIndex, createRow);
                }
            }
        }
    }

    public static CouponImage createDetachedCopy(CouponImage couponImage, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CouponImage couponImage2;
        if (i > i2 || couponImage == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(couponImage);
        if (cacheData == null) {
            couponImage2 = new CouponImage();
            map.put(couponImage, new RealmObjectProxy.CacheData(i, couponImage2));
        } else if (i >= cacheData.minDepth) {
            return (CouponImage) cacheData.object;
        } else {
            cacheData.minDepth = i;
            couponImage2 = (CouponImage) cacheData.object;
        }
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface = couponImage2;
        C4613xe0811b7c ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2 = couponImage;
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$bytes(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$bytes());
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$width(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$width());
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$height(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$height());
        ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface.realmSet$preview(ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxyinterface2.realmGet$preview(), i + 1, i2, map));
        return couponImage2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CouponImage = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{bytes:");
        sb.append(realmGet$bytes() != null ? realmGet$bytes() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        sb.append(realmGet$url() != null ? realmGet$url() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{width:");
        sb.append(realmGet$width() != null ? realmGet$width() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{height:");
        sb.append(realmGet$height() != null ? realmGet$height() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{preview:");
        if (realmGet$preview() != null) {
            str = ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_couponimagerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
