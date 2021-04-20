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
import p035ru.unicorn.ujin.data.realm.FileMeta;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy */
public class ru_unicorn_ujin_data_realm_FileMetaRealmProxy extends FileMeta implements RealmObjectProxy, ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FileMetaColumnInfo columnInfo;
    private ProxyState<FileMeta> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FileMeta";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_FileMetaRealmProxy$FileMetaColumnInfo */
    static final class FileMetaColumnInfo extends ColumnInfo {
        long heightIndex;
        long maxColumnIndexValue;
        long widthIndex;

        FileMetaColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.widthIndex = addColumnDetails("width", "width", objectSchemaInfo);
            this.heightIndex = addColumnDetails("height", "height", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FileMetaColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FileMetaColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FileMetaColumnInfo fileMetaColumnInfo = (FileMetaColumnInfo) columnInfo;
            FileMetaColumnInfo fileMetaColumnInfo2 = (FileMetaColumnInfo) columnInfo2;
            fileMetaColumnInfo2.widthIndex = fileMetaColumnInfo.widthIndex;
            fileMetaColumnInfo2.heightIndex = fileMetaColumnInfo.heightIndex;
            fileMetaColumnInfo2.maxColumnIndexValue = fileMetaColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_FileMetaRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FileMetaColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$width() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.widthIndex);
    }

    public void realmSet$width(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.widthIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.widthIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.widthIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.widthIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$height() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.heightIndex);
    }

    public void realmSet$height(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.heightIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.heightIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.heightIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.heightIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("width", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("height", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FileMetaColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FileMetaColumnInfo(osSchemaInfo);
    }

    public static FileMeta createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        FileMeta fileMeta = (FileMeta) realm.createObjectInternal(FileMeta.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
        if (jSONObject.has("width")) {
            if (jSONObject.isNull("width")) {
                ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$width((String) null);
            } else {
                ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$width(jSONObject.getString("width"));
            }
        }
        if (jSONObject.has("height")) {
            if (jSONObject.isNull("height")) {
                ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$height((String) null);
            } else {
                ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$height(jSONObject.getString("height"));
            }
        }
        return fileMeta;
    }

    public static FileMeta createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        FileMeta fileMeta = new FileMeta();
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("width")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$width(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$width((String) null);
                }
            } else if (!nextName.equals("height")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$height(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$height((String) null);
            }
        }
        jsonReader.endObject();
        return (FileMeta) realm.copyToRealm(fileMeta, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_FileMetaRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_FileMetaRealmProxy ru_unicorn_ujin_data_realm_filemetarealmproxy = new ru_unicorn_ujin_data_realm_FileMetaRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_filemetarealmproxy;
    }

    public static FileMeta copyOrUpdate(Realm realm, FileMetaColumnInfo fileMetaColumnInfo, FileMeta fileMeta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (fileMeta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileMeta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return fileMeta;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(fileMeta);
        if (realmObjectProxy2 != null) {
            return (FileMeta) realmObjectProxy2;
        }
        return copy(realm, fileMetaColumnInfo, fileMeta, z, map, set);
    }

    public static FileMeta copy(Realm realm, FileMetaColumnInfo fileMetaColumnInfo, FileMeta fileMeta, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(fileMeta);
        if (realmObjectProxy != null) {
            return (FileMeta) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FileMeta.class), fileMetaColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(fileMetaColumnInfo.widthIndex, ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$width());
        osObjectBuilder.addString(fileMetaColumnInfo.heightIndex, ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$height());
        ru_unicorn_ujin_data_realm_FileMetaRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(fileMeta, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, FileMeta fileMeta, Map<RealmModel, Long> map) {
        if (fileMeta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileMeta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FileMeta.class);
        long nativePtr = table.getNativePtr();
        FileMetaColumnInfo fileMetaColumnInfo = (FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class);
        long createRow = OsObject.createRow(table);
        map.put(fileMeta, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
        String realmGet$width = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetString(nativePtr, fileMetaColumnInfo.widthIndex, createRow, realmGet$width, false);
        }
        String realmGet$height = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetString(nativePtr, fileMetaColumnInfo.heightIndex, createRow, realmGet$height, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(FileMeta.class);
        long nativePtr = table.getNativePtr();
        FileMetaColumnInfo fileMetaColumnInfo = (FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class);
        while (it.hasNext()) {
            FileMeta fileMeta = (FileMeta) it.next();
            if (!map2.containsKey(fileMeta)) {
                if (fileMeta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileMeta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(fileMeta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(fileMeta, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
                String realmGet$width = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetString(nativePtr, fileMetaColumnInfo.widthIndex, createRow, realmGet$width, false);
                }
                String realmGet$height = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetString(nativePtr, fileMetaColumnInfo.heightIndex, createRow, realmGet$height, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, FileMeta fileMeta, Map<RealmModel, Long> map) {
        if (fileMeta instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileMeta;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FileMeta.class);
        long nativePtr = table.getNativePtr();
        FileMetaColumnInfo fileMetaColumnInfo = (FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class);
        long createRow = OsObject.createRow(table);
        map.put(fileMeta, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
        String realmGet$width = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$width();
        if (realmGet$width != null) {
            Table.nativeSetString(nativePtr, fileMetaColumnInfo.widthIndex, createRow, realmGet$width, false);
        } else {
            Table.nativeSetNull(nativePtr, fileMetaColumnInfo.widthIndex, createRow, false);
        }
        String realmGet$height = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$height();
        if (realmGet$height != null) {
            Table.nativeSetString(nativePtr, fileMetaColumnInfo.heightIndex, createRow, realmGet$height, false);
        } else {
            Table.nativeSetNull(nativePtr, fileMetaColumnInfo.heightIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(FileMeta.class);
        long nativePtr = table.getNativePtr();
        FileMetaColumnInfo fileMetaColumnInfo = (FileMetaColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileMeta.class);
        while (it.hasNext()) {
            FileMeta fileMeta = (FileMeta) it.next();
            if (!map2.containsKey(fileMeta)) {
                if (fileMeta instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) fileMeta;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(fileMeta, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(fileMeta, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta;
                String realmGet$width = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$width();
                if (realmGet$width != null) {
                    Table.nativeSetString(nativePtr, fileMetaColumnInfo.widthIndex, createRow, realmGet$width, false);
                } else {
                    Table.nativeSetNull(nativePtr, fileMetaColumnInfo.widthIndex, createRow, false);
                }
                String realmGet$height = ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmGet$height();
                if (realmGet$height != null) {
                    Table.nativeSetString(nativePtr, fileMetaColumnInfo.heightIndex, createRow, realmGet$height, false);
                } else {
                    Table.nativeSetNull(nativePtr, fileMetaColumnInfo.heightIndex, createRow, false);
                }
            }
        }
    }

    public static FileMeta createDetachedCopy(FileMeta fileMeta, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        FileMeta fileMeta2;
        if (i > i2 || fileMeta == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(fileMeta);
        if (cacheData == null) {
            fileMeta2 = new FileMeta();
            map.put(fileMeta, new RealmObjectProxy.CacheData(i, fileMeta2));
        } else if (i >= cacheData.minDepth) {
            return (FileMeta) cacheData.object;
        } else {
            cacheData.minDepth = i;
            fileMeta2 = (FileMeta) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface = fileMeta2;
        ru_unicorn_ujin_data_realm_FileMetaRealmProxyInterface ru_unicorn_ujin_data_realm_filemetarealmproxyinterface2 = fileMeta;
        ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$width(ru_unicorn_ujin_data_realm_filemetarealmproxyinterface2.realmGet$width());
        ru_unicorn_ujin_data_realm_filemetarealmproxyinterface.realmSet$height(ru_unicorn_ujin_data_realm_filemetarealmproxyinterface2.realmGet$height());
        return fileMeta2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FileMeta = proxy[");
        sb.append("{width:");
        String str = "null";
        sb.append(realmGet$width() != null ? realmGet$width() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{height:");
        if (realmGet$height() != null) {
            str = realmGet$height();
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
        ru_unicorn_ujin_data_realm_FileMetaRealmProxy ru_unicorn_ujin_data_realm_filemetarealmproxy = (ru_unicorn_ujin_data_realm_FileMetaRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_filemetarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_filemetarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_filemetarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
