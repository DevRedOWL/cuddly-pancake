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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.domofonprikamya.FilesUrl;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_FilesUrlRealmProxy */
public class C4686xbd7f885e extends FilesUrl implements RealmObjectProxy, C4687x4dd88e7b {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FilesUrlColumnInfo columnInfo;
    private ProxyState<FilesUrl> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_FilesUrlRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FilesUrl";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_FilesUrlRealmProxy$FilesUrlColumnInfo */
    static final class FilesUrlColumnInfo extends ColumnInfo {
        long fileNameIndex;
        long maxColumnIndexValue;

        FilesUrlColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.fileNameIndex = addColumnDetails("fileName", "fileName", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FilesUrlColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FilesUrlColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FilesUrlColumnInfo filesUrlColumnInfo = (FilesUrlColumnInfo) columnInfo;
            FilesUrlColumnInfo filesUrlColumnInfo2 = (FilesUrlColumnInfo) columnInfo2;
            filesUrlColumnInfo2.fileNameIndex = filesUrlColumnInfo.fileNameIndex;
            filesUrlColumnInfo2.maxColumnIndexValue = filesUrlColumnInfo.maxColumnIndexValue;
        }
    }

    C4686xbd7f885e() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FilesUrlColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$fileName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.fileNameIndex);
    }

    public void realmSet$fileName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.fileNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.fileNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.fileNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.fileNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("fileName", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FilesUrlColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FilesUrlColumnInfo(osSchemaInfo);
    }

    public static FilesUrl createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        FilesUrl filesUrl = (FilesUrl) realm.createObjectInternal(FilesUrl.class, true, Collections.emptyList());
        C4687x4dd88e7b ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxyinterface = filesUrl;
        if (jSONObject.has("fileName")) {
            if (jSONObject.isNull("fileName")) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxyinterface.realmSet$fileName((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxyinterface.realmSet$fileName(jSONObject.getString("fileName"));
            }
        }
        return filesUrl;
    }

    public static FilesUrl createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        FilesUrl filesUrl = new FilesUrl();
        C4687x4dd88e7b ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxyinterface = filesUrl;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("fileName")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxyinterface.realmSet$fileName(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxyinterface.realmSet$fileName((String) null);
            }
        }
        jsonReader.endObject();
        return (FilesUrl) realm.copyToRealm(filesUrl, new ImportFlag[0]);
    }

    private static C4686xbd7f885e newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class), false, Collections.emptyList());
        C4686xbd7f885e ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxy = new C4686xbd7f885e();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxy;
    }

    public static FilesUrl copyOrUpdate(Realm realm, FilesUrlColumnInfo filesUrlColumnInfo, FilesUrl filesUrl, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (filesUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) filesUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return filesUrl;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(filesUrl);
        if (realmObjectProxy2 != null) {
            return (FilesUrl) realmObjectProxy2;
        }
        return copy(realm, filesUrlColumnInfo, filesUrl, z, map, set);
    }

    public static FilesUrl copy(Realm realm, FilesUrlColumnInfo filesUrlColumnInfo, FilesUrl filesUrl, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(filesUrl);
        if (realmObjectProxy != null) {
            return (FilesUrl) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(FilesUrl.class), filesUrlColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(filesUrlColumnInfo.fileNameIndex, filesUrl.realmGet$fileName());
        C4686xbd7f885e newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(filesUrl, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, FilesUrl filesUrl, Map<RealmModel, Long> map) {
        if (filesUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) filesUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FilesUrl.class);
        long nativePtr = table.getNativePtr();
        FilesUrlColumnInfo filesUrlColumnInfo = (FilesUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class);
        long createRow = OsObject.createRow(table);
        map.put(filesUrl, Long.valueOf(createRow));
        String realmGet$fileName = filesUrl.realmGet$fileName();
        if (realmGet$fileName != null) {
            Table.nativeSetString(nativePtr, filesUrlColumnInfo.fileNameIndex, createRow, realmGet$fileName, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(FilesUrl.class);
        long nativePtr = table.getNativePtr();
        FilesUrlColumnInfo filesUrlColumnInfo = (FilesUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class);
        while (it.hasNext()) {
            FilesUrl filesUrl = (FilesUrl) it.next();
            if (!map.containsKey(filesUrl)) {
                if (filesUrl instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) filesUrl;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(filesUrl, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(filesUrl, Long.valueOf(createRow));
                String realmGet$fileName = filesUrl.realmGet$fileName();
                if (realmGet$fileName != null) {
                    Table.nativeSetString(nativePtr, filesUrlColumnInfo.fileNameIndex, createRow, realmGet$fileName, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, FilesUrl filesUrl, Map<RealmModel, Long> map) {
        if (filesUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) filesUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(FilesUrl.class);
        long nativePtr = table.getNativePtr();
        FilesUrlColumnInfo filesUrlColumnInfo = (FilesUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class);
        long createRow = OsObject.createRow(table);
        map.put(filesUrl, Long.valueOf(createRow));
        String realmGet$fileName = filesUrl.realmGet$fileName();
        if (realmGet$fileName != null) {
            Table.nativeSetString(nativePtr, filesUrlColumnInfo.fileNameIndex, createRow, realmGet$fileName, false);
        } else {
            Table.nativeSetNull(nativePtr, filesUrlColumnInfo.fileNameIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(FilesUrl.class);
        long nativePtr = table.getNativePtr();
        FilesUrlColumnInfo filesUrlColumnInfo = (FilesUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FilesUrl.class);
        while (it.hasNext()) {
            FilesUrl filesUrl = (FilesUrl) it.next();
            if (!map.containsKey(filesUrl)) {
                if (filesUrl instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) filesUrl;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(filesUrl, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(filesUrl, Long.valueOf(createRow));
                String realmGet$fileName = filesUrl.realmGet$fileName();
                if (realmGet$fileName != null) {
                    Table.nativeSetString(nativePtr, filesUrlColumnInfo.fileNameIndex, createRow, realmGet$fileName, false);
                } else {
                    Table.nativeSetNull(nativePtr, filesUrlColumnInfo.fileNameIndex, createRow, false);
                }
            }
        }
    }

    public static FilesUrl createDetachedCopy(FilesUrl filesUrl, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        FilesUrl filesUrl2;
        if (i > i2 || filesUrl == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(filesUrl);
        if (cacheData == null) {
            filesUrl2 = new FilesUrl();
            map.put(filesUrl, new RealmObjectProxy.CacheData(i, filesUrl2));
        } else if (i >= cacheData.minDepth) {
            return (FilesUrl) cacheData.object;
        } else {
            cacheData.minDepth = i;
            filesUrl2 = (FilesUrl) cacheData.object;
        }
        filesUrl2.realmSet$fileName(filesUrl.realmGet$fileName());
        return filesUrl2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("FilesUrl = proxy[");
        sb.append("{fileName:");
        sb.append(realmGet$fileName() != null ? realmGet$fileName() : "null");
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
        C4686xbd7f885e ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxy = (C4686xbd7f885e) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_domofonprikamya_filesurlrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
