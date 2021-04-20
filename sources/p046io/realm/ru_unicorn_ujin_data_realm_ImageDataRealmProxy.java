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
import p035ru.unicorn.ujin.data.realm.ImageData;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.android.JsonUtils;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy */
public class ru_unicorn_ujin_data_realm_ImageDataRealmProxy extends ImageData implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ImageDataColumnInfo columnInfo;
    private ProxyState<ImageData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ImageData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ImageDataRealmProxy$ImageDataColumnInfo */
    static final class ImageDataColumnInfo extends ColumnInfo {
        long heightIndex;
        long imageBytesIndex;
        long imgIndex;
        long maxColumnIndexValue;
        long sourceIndex;
        long thumbnailIndex;
        long titleIndex;
        long widthIndex;

        ImageDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.sourceIndex = addColumnDetails("source", "source", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.imgIndex = addColumnDetails("img", "img", objectSchemaInfo);
            this.thumbnailIndex = addColumnDetails("thumbnail", "thumbnail", objectSchemaInfo);
            this.widthIndex = addColumnDetails("width", "width", objectSchemaInfo);
            this.heightIndex = addColumnDetails("height", "height", objectSchemaInfo);
            this.imageBytesIndex = addColumnDetails("imageBytes", "imageBytes", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ImageDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ImageDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ImageDataColumnInfo imageDataColumnInfo = (ImageDataColumnInfo) columnInfo;
            ImageDataColumnInfo imageDataColumnInfo2 = (ImageDataColumnInfo) columnInfo2;
            imageDataColumnInfo2.sourceIndex = imageDataColumnInfo.sourceIndex;
            imageDataColumnInfo2.titleIndex = imageDataColumnInfo.titleIndex;
            imageDataColumnInfo2.imgIndex = imageDataColumnInfo.imgIndex;
            imageDataColumnInfo2.thumbnailIndex = imageDataColumnInfo.thumbnailIndex;
            imageDataColumnInfo2.widthIndex = imageDataColumnInfo.widthIndex;
            imageDataColumnInfo2.heightIndex = imageDataColumnInfo.heightIndex;
            imageDataColumnInfo2.imageBytesIndex = imageDataColumnInfo.imageBytesIndex;
            imageDataColumnInfo2.maxColumnIndexValue = imageDataColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ImageDataRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ImageDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$source() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sourceIndex);
    }

    public void realmSet$source(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sourceIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sourceIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sourceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sourceIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$img() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imgIndex);
    }

    public void realmSet$img(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imgIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imgIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imgIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imgIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$thumbnail() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.thumbnailIndex);
    }

    public void realmSet$thumbnail(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.thumbnailIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.thumbnailIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.thumbnailIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.thumbnailIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$width() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.widthIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.widthIndex));
    }

    public void realmSet$width(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.widthIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.widthIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.widthIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.widthIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$height() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.heightIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.heightIndex));
    }

    public void realmSet$height(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.heightIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.heightIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.heightIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.heightIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public byte[] realmGet$imageBytes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBinaryByteArray(this.columnInfo.imageBytesIndex);
    }

    public void realmSet$imageBytes(byte[] bArr) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bArr == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imageBytesIndex);
            } else {
                this.proxyState.getRow$realm().setBinaryByteArray(this.columnInfo.imageBytesIndex, bArr);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bArr == null) {
                row$realm.getTable().setNull(this.columnInfo.imageBytesIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBinaryByteArray(this.columnInfo.imageBytesIndex, row$realm.getIndex(), bArr, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("source", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("img", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("thumbnail", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("width", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("height", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("imageBytes", RealmFieldType.BINARY, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ImageDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ImageDataColumnInfo(osSchemaInfo);
    }

    public static ImageData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ImageData imageData = (ImageData) realm.createObjectInternal(ImageData.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData;
        if (jSONObject.has("source")) {
            if (jSONObject.isNull("source")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$source((String) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$source(jSONObject.getString("source"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("img")) {
            if (jSONObject.isNull("img")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$img((String) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$img(jSONObject.getString("img"));
            }
        }
        if (jSONObject.has("thumbnail")) {
            if (jSONObject.isNull("thumbnail")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$thumbnail((String) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$thumbnail(jSONObject.getString("thumbnail"));
            }
        }
        if (jSONObject.has("width")) {
            if (jSONObject.isNull("width")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$width((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$width(Integer.valueOf(jSONObject.getInt("width")));
            }
        }
        if (jSONObject.has("height")) {
            if (jSONObject.isNull("height")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$height((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$height(Integer.valueOf(jSONObject.getInt("height")));
            }
        }
        if (jSONObject.has("imageBytes")) {
            if (jSONObject.isNull("imageBytes")) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$imageBytes((byte[]) null);
            } else {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$imageBytes(JsonUtils.stringToBytes(jSONObject.getString("imageBytes")));
            }
        }
        return imageData;
    }

    public static ImageData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ImageData imageData = new ImageData();
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("source")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$source(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$source((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("img")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$img(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$img((String) null);
                }
            } else if (nextName.equals("thumbnail")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$thumbnail(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$thumbnail((String) null);
                }
            } else if (nextName.equals("width")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$width(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$width((Integer) null);
                }
            } else if (nextName.equals("height")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$height(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$height((Integer) null);
                }
            } else if (!nextName.equals("imageBytes")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$imageBytes(JsonUtils.stringToBytes(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$imageBytes((byte[]) null);
            }
        }
        jsonReader.endObject();
        return (ImageData) realm.copyToRealm(imageData, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_ImageDataRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ImageDataRealmProxy ru_unicorn_ujin_data_realm_imagedatarealmproxy = new ru_unicorn_ujin_data_realm_ImageDataRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_imagedatarealmproxy;
    }

    public static ImageData copyOrUpdate(Realm realm, ImageDataColumnInfo imageDataColumnInfo, ImageData imageData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (imageData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return imageData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(imageData);
        if (realmObjectProxy2 != null) {
            return (ImageData) realmObjectProxy2;
        }
        return copy(realm, imageDataColumnInfo, imageData, z, map, set);
    }

    public static ImageData copy(Realm realm, ImageDataColumnInfo imageDataColumnInfo, ImageData imageData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(imageData);
        if (realmObjectProxy != null) {
            return (ImageData) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ImageData.class), imageDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(imageDataColumnInfo.sourceIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$source());
        osObjectBuilder.addString(imageDataColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(imageDataColumnInfo.imgIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$img());
        osObjectBuilder.addString(imageDataColumnInfo.thumbnailIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$thumbnail());
        osObjectBuilder.addInteger(imageDataColumnInfo.widthIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$width());
        osObjectBuilder.addInteger(imageDataColumnInfo.heightIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$height());
        osObjectBuilder.addByteArray(imageDataColumnInfo.imageBytesIndex, ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$imageBytes());
        ru_unicorn_ujin_data_realm_ImageDataRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(imageData, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ImageData imageData, Map<RealmModel, Long> map) {
        ImageData imageData2 = imageData;
        if (imageData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ImageData.class);
        long nativePtr = table.getNativePtr();
        ImageDataColumnInfo imageDataColumnInfo = (ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class);
        long createRow = OsObject.createRow(table);
        map.put(imageData2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData2;
        String realmGet$source = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$source();
        if (realmGet$source != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.sourceIndex, createRow, realmGet$source, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$img = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$img();
        if (realmGet$img != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.imgIndex, createRow, realmGet$img, false);
        }
        String realmGet$thumbnail = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$thumbnail();
        if (realmGet$thumbnail != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.thumbnailIndex, createRow, realmGet$thumbnail, false);
        }
        Integer realmGet$width = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetLong(nativePtr, imageDataColumnInfo.widthIndex, createRow, realmGet$width.longValue(), false);
        }
        Integer realmGet$height = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetLong(nativePtr, imageDataColumnInfo.heightIndex, createRow, realmGet$height.longValue(), false);
        }
        byte[] realmGet$imageBytes = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$imageBytes();
        if (realmGet$imageBytes != null) {
            Table.nativeSetByteArray(nativePtr, imageDataColumnInfo.imageBytesIndex, createRow, realmGet$imageBytes, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ImageData.class);
        long nativePtr = table.getNativePtr();
        ImageDataColumnInfo imageDataColumnInfo = (ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class);
        while (it.hasNext()) {
            ImageData imageData = (ImageData) it.next();
            if (!map2.containsKey(imageData)) {
                if (imageData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(imageData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(imageData, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData;
                String realmGet$source = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$source();
                if (realmGet$source != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.sourceIndex, createRow, realmGet$source, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$img = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$img();
                if (realmGet$img != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.imgIndex, createRow, realmGet$img, false);
                }
                String realmGet$thumbnail = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$thumbnail();
                if (realmGet$thumbnail != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.thumbnailIndex, createRow, realmGet$thumbnail, false);
                }
                Integer realmGet$width = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetLong(nativePtr, imageDataColumnInfo.widthIndex, createRow, realmGet$width.longValue(), false);
                }
                Integer realmGet$height = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetLong(nativePtr, imageDataColumnInfo.heightIndex, createRow, realmGet$height.longValue(), false);
                }
                byte[] realmGet$imageBytes = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$imageBytes();
                if (realmGet$imageBytes != null) {
                    Table.nativeSetByteArray(nativePtr, imageDataColumnInfo.imageBytesIndex, createRow, realmGet$imageBytes, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ImageData imageData, Map<RealmModel, Long> map) {
        ImageData imageData2 = imageData;
        if (imageData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ImageData.class);
        long nativePtr = table.getNativePtr();
        ImageDataColumnInfo imageDataColumnInfo = (ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class);
        long createRow = OsObject.createRow(table);
        map.put(imageData2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData2;
        String realmGet$source = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$source();
        if (realmGet$source != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.sourceIndex, createRow, realmGet$source, false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.sourceIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$img = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$img();
        if (realmGet$img != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.imgIndex, createRow, realmGet$img, false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.imgIndex, createRow, false);
        }
        String realmGet$thumbnail = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$thumbnail();
        if (realmGet$thumbnail != null) {
            Table.nativeSetString(nativePtr, imageDataColumnInfo.thumbnailIndex, createRow, realmGet$thumbnail, false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.thumbnailIndex, createRow, false);
        }
        Integer realmGet$width = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetLong(nativePtr, imageDataColumnInfo.widthIndex, createRow, realmGet$width.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.widthIndex, createRow, false);
        }
        Integer realmGet$height = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetLong(nativePtr, imageDataColumnInfo.heightIndex, createRow, realmGet$height.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.heightIndex, createRow, false);
        }
        byte[] realmGet$imageBytes = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$imageBytes();
        if (realmGet$imageBytes != null) {
            Table.nativeSetByteArray(nativePtr, imageDataColumnInfo.imageBytesIndex, createRow, realmGet$imageBytes, false);
        } else {
            Table.nativeSetNull(nativePtr, imageDataColumnInfo.imageBytesIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ImageData.class);
        long nativePtr = table.getNativePtr();
        ImageDataColumnInfo imageDataColumnInfo = (ImageDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageData.class);
        while (it.hasNext()) {
            ImageData imageData = (ImageData) it.next();
            if (!map2.containsKey(imageData)) {
                if (imageData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(imageData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(imageData, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData;
                String realmGet$source = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$source();
                if (realmGet$source != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.sourceIndex, createRow, realmGet$source, false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.sourceIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$img = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$img();
                if (realmGet$img != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.imgIndex, createRow, realmGet$img, false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.imgIndex, createRow, false);
                }
                String realmGet$thumbnail = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$thumbnail();
                if (realmGet$thumbnail != null) {
                    Table.nativeSetString(nativePtr, imageDataColumnInfo.thumbnailIndex, createRow, realmGet$thumbnail, false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.thumbnailIndex, createRow, false);
                }
                Integer realmGet$width = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetLong(nativePtr, imageDataColumnInfo.widthIndex, createRow, realmGet$width.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.widthIndex, createRow, false);
                }
                Integer realmGet$height = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetLong(nativePtr, imageDataColumnInfo.heightIndex, createRow, realmGet$height.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.heightIndex, createRow, false);
                }
                byte[] realmGet$imageBytes = ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmGet$imageBytes();
                if (realmGet$imageBytes != null) {
                    Table.nativeSetByteArray(nativePtr, imageDataColumnInfo.imageBytesIndex, createRow, realmGet$imageBytes, false);
                } else {
                    Table.nativeSetNull(nativePtr, imageDataColumnInfo.imageBytesIndex, createRow, false);
                }
            }
        }
    }

    public static ImageData createDetachedCopy(ImageData imageData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ImageData imageData2;
        if (i > i2 || imageData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(imageData);
        if (cacheData == null) {
            imageData2 = new ImageData();
            map.put(imageData, new RealmObjectProxy.CacheData(i, imageData2));
        } else if (i >= cacheData.minDepth) {
            return (ImageData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            imageData2 = (ImageData) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface = imageData2;
        ru_unicorn_ujin_data_realm_ImageDataRealmProxyInterface ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2 = imageData;
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$source(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$source());
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$img(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$img());
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$thumbnail(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$thumbnail());
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$width(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$width());
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$height(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$height());
        ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface.realmSet$imageBytes(ru_unicorn_ujin_data_realm_imagedatarealmproxyinterface2.realmGet$imageBytes());
        return imageData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ImageData = proxy[");
        sb.append("{source:");
        Object obj = "null";
        sb.append(realmGet$source() != null ? realmGet$source() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{img:");
        sb.append(realmGet$img() != null ? realmGet$img() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{thumbnail:");
        sb.append(realmGet$thumbnail() != null ? realmGet$thumbnail() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{width:");
        sb.append(realmGet$width() != null ? realmGet$width() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{height:");
        sb.append(realmGet$height() != null ? realmGet$height() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{imageBytes:");
        if (realmGet$imageBytes() != null) {
            obj = realmGet$imageBytes();
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
        ru_unicorn_ujin_data_realm_ImageDataRealmProxy ru_unicorn_ujin_data_realm_imagedatarealmproxy = (ru_unicorn_ujin_data_realm_ImageDataRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_imagedatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_imagedatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_imagedatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
