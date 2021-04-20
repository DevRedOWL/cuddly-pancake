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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy extends PreviewImage implements RealmObjectProxy, C4617x60d71890 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PreviewImageColumnInfo columnInfo;
    private ProxyState<PreviewImage> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PreviewImage";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy$PreviewImageColumnInfo */
    static final class PreviewImageColumnInfo extends ColumnInfo {
        long bytesIndex;
        long heightIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long urlIndex;
        long widthIndex;

        PreviewImageColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.bytesIndex = addColumnDetails("bytes", "bytes", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.widthIndex = addColumnDetails("width", "width", objectSchemaInfo);
            this.heightIndex = addColumnDetails("height", "height", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PreviewImageColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PreviewImageColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PreviewImageColumnInfo previewImageColumnInfo = (PreviewImageColumnInfo) columnInfo;
            PreviewImageColumnInfo previewImageColumnInfo2 = (PreviewImageColumnInfo) columnInfo2;
            previewImageColumnInfo2.idIndex = previewImageColumnInfo.idIndex;
            previewImageColumnInfo2.bytesIndex = previewImageColumnInfo.bytesIndex;
            previewImageColumnInfo2.nameIndex = previewImageColumnInfo.nameIndex;
            previewImageColumnInfo2.urlIndex = previewImageColumnInfo.urlIndex;
            previewImageColumnInfo2.widthIndex = previewImageColumnInfo.widthIndex;
            previewImageColumnInfo2.heightIndex = previewImageColumnInfo.heightIndex;
            previewImageColumnInfo2.maxColumnIndexValue = previewImageColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PreviewImageColumnInfo) realmObjectContext.getColumnInfo();
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 6, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("bytes", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("width", RealmFieldType.FLOAT, false, false, false);
        builder2.addPersistedProperty("height", RealmFieldType.FLOAT, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PreviewImageColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PreviewImageColumnInfo(osSchemaInfo);
    }

    public static PreviewImage createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        PreviewImage previewImage = (PreviewImage) realm.createObjectInternal(PreviewImage.class, true, Collections.emptyList());
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("bytes")) {
            if (jSONObject.isNull("bytes")) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$bytes((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$bytes(jSONObject.getString("bytes"));
            }
        }
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        if (jSONObject.has("width")) {
            if (jSONObject.isNull("width")) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$width((Float) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$width(Float.valueOf((float) jSONObject.getDouble("width")));
            }
        }
        if (jSONObject.has("height")) {
            if (jSONObject.isNull("height")) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$height((Float) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$height(Float.valueOf((float) jSONObject.getDouble("height")));
            }
        }
        return previewImage;
    }

    public static PreviewImage createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        PreviewImage previewImage = new PreviewImage();
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("bytes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$bytes(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$bytes((String) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("url")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$url(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$url((String) null);
                }
            } else if (nextName.equals("width")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$width(Float.valueOf((float) jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$width((Float) null);
                }
            } else if (!nextName.equals("height")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$height(Float.valueOf((float) jsonReader.nextDouble()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$height((Float) null);
            }
        }
        jsonReader.endObject();
        return (PreviewImage) realm.copyToRealm(previewImage, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxy = new ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxy;
    }

    public static PreviewImage copyOrUpdate(Realm realm, PreviewImageColumnInfo previewImageColumnInfo, PreviewImage previewImage, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (previewImage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) previewImage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return previewImage;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(previewImage);
        if (realmObjectProxy2 != null) {
            return (PreviewImage) realmObjectProxy2;
        }
        return copy(realm, previewImageColumnInfo, previewImage, z, map, set);
    }

    public static PreviewImage copy(Realm realm, PreviewImageColumnInfo previewImageColumnInfo, PreviewImage previewImage, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(previewImage);
        if (realmObjectProxy != null) {
            return (PreviewImage) realmObjectProxy;
        }
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(PreviewImage.class), previewImageColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(previewImageColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(previewImageColumnInfo.bytesIndex, ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$bytes());
        osObjectBuilder.addString(previewImageColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(previewImageColumnInfo.urlIndex, ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$url());
        osObjectBuilder.addFloat(previewImageColumnInfo.widthIndex, ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$width());
        osObjectBuilder.addFloat(previewImageColumnInfo.heightIndex, ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$height());
        ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(previewImage, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, PreviewImage previewImage, Map<RealmModel, Long> map) {
        if (previewImage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) previewImage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(PreviewImage.class);
        long nativePtr = table.getNativePtr();
        PreviewImageColumnInfo previewImageColumnInfo = (PreviewImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class);
        long createRow = OsObject.createRow(table);
        map.put(previewImage, Long.valueOf(createRow));
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$bytes();
        if (realmGet$bytes != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetFloat(nativePtr, previewImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
        }
        Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetFloat(nativePtr, previewImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(PreviewImage.class);
        long nativePtr = table.getNativePtr();
        PreviewImageColumnInfo previewImageColumnInfo = (PreviewImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class);
        while (it.hasNext()) {
            PreviewImage previewImage = (PreviewImage) it.next();
            if (!map2.containsKey(previewImage)) {
                if (previewImage instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) previewImage;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(previewImage, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(previewImage, Long.valueOf(createRow));
                C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$bytes();
                if (realmGet$bytes != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
                Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetFloat(nativePtr, previewImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
                }
                Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetFloat(nativePtr, previewImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, PreviewImage previewImage, Map<RealmModel, Long> map) {
        if (previewImage instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) previewImage;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(PreviewImage.class);
        long nativePtr = table.getNativePtr();
        PreviewImageColumnInfo previewImageColumnInfo = (PreviewImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class);
        long createRow = OsObject.createRow(table);
        map.put(previewImage, Long.valueOf(createRow));
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, previewImageColumnInfo.idIndex, createRow, false);
        }
        String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$bytes();
        if (realmGet$bytes != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
        } else {
            Table.nativeSetNull(nativePtr, previewImageColumnInfo.bytesIndex, createRow, false);
        }
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, previewImageColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, previewImageColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, previewImageColumnInfo.urlIndex, createRow, false);
        }
        Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetFloat(nativePtr, previewImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, previewImageColumnInfo.widthIndex, createRow, false);
        }
        Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetFloat(nativePtr, previewImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, previewImageColumnInfo.heightIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(PreviewImage.class);
        long nativePtr = table.getNativePtr();
        PreviewImageColumnInfo previewImageColumnInfo = (PreviewImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PreviewImage.class);
        while (it.hasNext()) {
            PreviewImage previewImage = (PreviewImage) it.next();
            if (!map2.containsKey(previewImage)) {
                if (previewImage instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) previewImage;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(previewImage, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(previewImage, Long.valueOf(createRow));
                C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, previewImageColumnInfo.idIndex, createRow, false);
                }
                String realmGet$bytes = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$bytes();
                if (realmGet$bytes != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.bytesIndex, createRow, realmGet$bytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, previewImageColumnInfo.bytesIndex, createRow, false);
                }
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, previewImageColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$url = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, previewImageColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, previewImageColumnInfo.urlIndex, createRow, false);
                }
                Float realmGet$width = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetFloat(nativePtr, previewImageColumnInfo.widthIndex, createRow, realmGet$width.floatValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, previewImageColumnInfo.widthIndex, createRow, false);
                }
                Float realmGet$height = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetFloat(nativePtr, previewImageColumnInfo.heightIndex, createRow, realmGet$height.floatValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, previewImageColumnInfo.heightIndex, createRow, false);
                }
            }
        }
    }

    public static PreviewImage createDetachedCopy(PreviewImage previewImage, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        PreviewImage previewImage2;
        if (i > i2 || previewImage == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(previewImage);
        if (cacheData == null) {
            previewImage2 = new PreviewImage();
            map.put(previewImage, new RealmObjectProxy.CacheData(i, previewImage2));
        } else if (i >= cacheData.minDepth) {
            return (PreviewImage) cacheData.object;
        } else {
            cacheData.minDepth = i;
            previewImage2 = (PreviewImage) cacheData.object;
        }
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface = previewImage2;
        C4617x60d71890 ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2 = previewImage;
        ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$bytes(ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2.realmGet$bytes());
        ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$url(ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2.realmGet$url());
        ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$width(ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2.realmGet$width());
        ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface.realmSet$height(ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxyinterface2.realmGet$height());
        return previewImage2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PreviewImage = proxy[");
        sb.append("{id:");
        Object obj = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{bytes:");
        sb.append(realmGet$bytes() != null ? realmGet$bytes() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{url:");
        sb.append(realmGet$url() != null ? realmGet$url() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{width:");
        sb.append(realmGet$width() != null ? realmGet$width() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{height:");
        if (realmGet$height() != null) {
            obj = realmGet$height();
        }
        sb.append(obj);
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
        ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxy = (ru_unicorn_ujin_data_realm_marketplace_PreviewImageRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_previewimagerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
