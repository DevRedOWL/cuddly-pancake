package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.ImageSize;
import p035ru.unicorn.ujin.data.realm.Size;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_SizeRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy */
public class ru_unicorn_ujin_data_realm_ImageSizeRealmProxy extends ImageSize implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ImageSizeColumnInfo columnInfo;
    private ProxyState<ImageSize> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ImageSize";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ImageSizeRealmProxy$ImageSizeColumnInfo */
    static final class ImageSizeColumnInfo extends ColumnInfo {
        long bigIndex;
        long maxColumnIndexValue;
        long smallIndex;

        ImageSizeColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.smallIndex = addColumnDetails("small", "small", objectSchemaInfo);
            this.bigIndex = addColumnDetails("big", "big", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ImageSizeColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ImageSizeColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ImageSizeColumnInfo imageSizeColumnInfo = (ImageSizeColumnInfo) columnInfo;
            ImageSizeColumnInfo imageSizeColumnInfo2 = (ImageSizeColumnInfo) columnInfo2;
            imageSizeColumnInfo2.smallIndex = imageSizeColumnInfo.smallIndex;
            imageSizeColumnInfo2.bigIndex = imageSizeColumnInfo.bigIndex;
            imageSizeColumnInfo2.maxColumnIndexValue = imageSizeColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ImageSizeRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ImageSizeColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Size realmGet$small() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.smallIndex)) {
            return null;
        }
        return (Size) this.proxyState.getRealm$realm().get(Size.class, this.proxyState.getRow$realm().getLink(this.columnInfo.smallIndex), false, Collections.emptyList());
    }

    public void realmSet$small(Size size) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (size == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.smallIndex);
                return;
            }
            this.proxyState.checkValidObject(size);
            this.proxyState.getRow$realm().setLink(this.columnInfo.smallIndex, ((RealmObjectProxy) size).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("small")) {
            if (size != null && !RealmObject.isManaged(size)) {
                size = (Size) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(size, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (size == null) {
                row$realm.nullifyLink(this.columnInfo.smallIndex);
                return;
            }
            this.proxyState.checkValidObject(size);
            row$realm.getTable().setLink(this.columnInfo.smallIndex, row$realm.getIndex(), ((RealmObjectProxy) size).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public Size realmGet$big() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.bigIndex)) {
            return null;
        }
        return (Size) this.proxyState.getRealm$realm().get(Size.class, this.proxyState.getRow$realm().getLink(this.columnInfo.bigIndex), false, Collections.emptyList());
    }

    public void realmSet$big(Size size) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (size == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.bigIndex);
                return;
            }
            this.proxyState.checkValidObject(size);
            this.proxyState.getRow$realm().setLink(this.columnInfo.bigIndex, ((RealmObjectProxy) size).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("big")) {
            if (size != null && !RealmObject.isManaged(size)) {
                size = (Size) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(size, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (size == null) {
                row$realm.nullifyLink(this.columnInfo.bigIndex);
                return;
            }
            this.proxyState.checkValidObject(size);
            row$realm.getTable().setLink(this.columnInfo.bigIndex, row$realm.getIndex(), ((RealmObjectProxy) size).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedLinkProperty("small", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_SizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("big", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_SizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ImageSizeColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ImageSizeColumnInfo(osSchemaInfo);
    }

    public static ImageSize createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("small")) {
            arrayList.add("small");
        }
        if (jSONObject.has("big")) {
            arrayList.add("big");
        }
        ImageSize imageSize = (ImageSize) realm.createObjectInternal(ImageSize.class, true, arrayList);
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize;
        if (jSONObject.has("small")) {
            if (jSONObject.isNull("small")) {
                ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$small((Size) null);
            } else {
                ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$small(ru_unicorn_ujin_data_realm_SizeRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("small"), z));
            }
        }
        if (jSONObject.has("big")) {
            if (jSONObject.isNull("big")) {
                ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$big((Size) null);
            } else {
                ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$big(ru_unicorn_ujin_data_realm_SizeRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("big"), z));
            }
        }
        return imageSize;
    }

    public static ImageSize createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ImageSize imageSize = new ImageSize();
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("small")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$small((Size) null);
                } else {
                    ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$small(ru_unicorn_ujin_data_realm_SizeRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("big")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$big((Size) null);
            } else {
                ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$big(ru_unicorn_ujin_data_realm_SizeRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (ImageSize) realm.copyToRealm(imageSize, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_ImageSizeRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxy ru_unicorn_ujin_data_realm_imagesizerealmproxy = new ru_unicorn_ujin_data_realm_ImageSizeRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_imagesizerealmproxy;
    }

    public static ImageSize copyOrUpdate(Realm realm, ImageSizeColumnInfo imageSizeColumnInfo, ImageSize imageSize, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (imageSize instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageSize;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return imageSize;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(imageSize);
        if (realmObjectProxy2 != null) {
            return (ImageSize) realmObjectProxy2;
        }
        return copy(realm, imageSizeColumnInfo, imageSize, z, map, set);
    }

    public static ImageSize copy(Realm realm, ImageSizeColumnInfo imageSizeColumnInfo, ImageSize imageSize, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(imageSize);
        if (realmObjectProxy != null) {
            return (ImageSize) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize;
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxy newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(ImageSize.class), imageSizeColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(imageSize, newProxyInstance);
        Size realmGet$small = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$small();
        if (realmGet$small == null) {
            newProxyInstance.realmSet$small((Size) null);
        } else {
            Size size = (Size) map.get(realmGet$small);
            if (size != null) {
                newProxyInstance.realmSet$small(size);
            } else {
                newProxyInstance.realmSet$small(ru_unicorn_ujin_data_realm_SizeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SizeRealmProxy.SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class), realmGet$small, z, map, set));
            }
        }
        Size realmGet$big = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$big();
        if (realmGet$big == null) {
            newProxyInstance.realmSet$big((Size) null);
        } else {
            Size size2 = (Size) map.get(realmGet$big);
            if (size2 != null) {
                newProxyInstance.realmSet$big(size2);
            } else {
                newProxyInstance.realmSet$big(ru_unicorn_ujin_data_realm_SizeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_SizeRealmProxy.SizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Size.class), realmGet$big, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, ImageSize imageSize, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        ImageSize imageSize2 = imageSize;
        Map<RealmModel, Long> map2 = map;
        if (imageSize2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageSize2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ImageSize.class);
        long nativePtr = table.getNativePtr();
        ImageSizeColumnInfo imageSizeColumnInfo = (ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class);
        long createRow = OsObject.createRow(table);
        map2.put(imageSize2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize2;
        Size realmGet$small = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$small();
        if (realmGet$small != null) {
            Long l = map2.get(realmGet$small);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm2, realmGet$small, map2));
            }
            Table.nativeSetLink(nativePtr, imageSizeColumnInfo.smallIndex, createRow, l.longValue(), false);
        }
        Size realmGet$big = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$big();
        if (realmGet$big != null) {
            Long l2 = map2.get(realmGet$big);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm2, realmGet$big, map2));
            }
            Table.nativeSetLink(nativePtr, imageSizeColumnInfo.bigIndex, createRow, l2.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(ImageSize.class);
        table.getNativePtr();
        ImageSizeColumnInfo imageSizeColumnInfo = (ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class);
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) it.next();
            if (!map.containsKey(imageSize)) {
                if (imageSize instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageSize;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(imageSize, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(imageSize, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize;
                Size realmGet$small = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$small();
                if (realmGet$small != null) {
                    Long l = map.get(realmGet$small);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm, realmGet$small, map));
                    }
                    table.setLink(imageSizeColumnInfo.smallIndex, createRow, l.longValue(), false);
                }
                Size realmGet$big = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$big();
                if (realmGet$big != null) {
                    Long l2 = map.get(realmGet$big);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insert(realm, realmGet$big, map));
                    }
                    table.setLink(imageSizeColumnInfo.bigIndex, createRow, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ImageSize imageSize, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        ImageSize imageSize2 = imageSize;
        Map<RealmModel, Long> map2 = map;
        if (imageSize2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageSize2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(ImageSize.class);
        long nativePtr = table.getNativePtr();
        ImageSizeColumnInfo imageSizeColumnInfo = (ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class);
        long createRow = OsObject.createRow(table);
        map2.put(imageSize2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize2;
        Size realmGet$small = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$small();
        if (realmGet$small != null) {
            Long l = map2.get(realmGet$small);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm2, realmGet$small, map2));
            }
            Table.nativeSetLink(nativePtr, imageSizeColumnInfo.smallIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, imageSizeColumnInfo.smallIndex, createRow);
        }
        Size realmGet$big = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$big();
        if (realmGet$big != null) {
            Long l2 = map2.get(realmGet$big);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm2, realmGet$big, map2));
            }
            Table.nativeSetLink(nativePtr, imageSizeColumnInfo.bigIndex, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, imageSizeColumnInfo.bigIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(ImageSize.class);
        long nativePtr = table.getNativePtr();
        ImageSizeColumnInfo imageSizeColumnInfo = (ImageSizeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ImageSize.class);
        while (it.hasNext()) {
            ImageSize imageSize = (ImageSize) it.next();
            if (!map2.containsKey(imageSize)) {
                if (imageSize instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) imageSize;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(imageSize, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(imageSize, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize;
                Size realmGet$small = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$small();
                if (realmGet$small != null) {
                    Long l = map2.get(realmGet$small);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm2, realmGet$small, map2));
                    }
                    Table.nativeSetLink(nativePtr, imageSizeColumnInfo.smallIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, imageSizeColumnInfo.smallIndex, createRow);
                }
                Size realmGet$big = ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmGet$big();
                if (realmGet$big != null) {
                    Long l2 = map2.get(realmGet$big);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_SizeRealmProxy.insertOrUpdate(realm2, realmGet$big, map2));
                    }
                    Table.nativeSetLink(nativePtr, imageSizeColumnInfo.bigIndex, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, imageSizeColumnInfo.bigIndex, createRow);
                }
            }
        }
    }

    public static ImageSize createDetachedCopy(ImageSize imageSize, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ImageSize imageSize2;
        if (i > i2 || imageSize == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(imageSize);
        if (cacheData == null) {
            imageSize2 = new ImageSize();
            map.put(imageSize, new RealmObjectProxy.CacheData(i, imageSize2));
        } else if (i >= cacheData.minDepth) {
            return (ImageSize) cacheData.object;
        } else {
            cacheData.minDepth = i;
            imageSize2 = (ImageSize) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface = imageSize2;
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxyInterface ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface2 = imageSize;
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$small(ru_unicorn_ujin_data_realm_SizeRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface2.realmGet$small(), i3, i2, map));
        ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface.realmSet$big(ru_unicorn_ujin_data_realm_SizeRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_imagesizerealmproxyinterface2.realmGet$big(), i3, i2, map));
        return imageSize2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ImageSize = proxy[");
        sb.append("{small:");
        Size realmGet$small = realmGet$small();
        String str = ru_unicorn_ujin_data_realm_SizeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(realmGet$small != null ? str : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{big:");
        if (realmGet$big() == null) {
            str = "null";
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
        ru_unicorn_ujin_data_realm_ImageSizeRealmProxy ru_unicorn_ujin_data_realm_imagesizerealmproxy = (ru_unicorn_ujin_data_realm_ImageSizeRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_imagesizerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_imagesizerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_imagesizerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
