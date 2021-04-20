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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoUrl;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoUrlRealmProxy */
public class C4816xc56fdf8f extends VideoUrl implements RealmObjectProxy, C4817xeb68be6a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VideoUrlColumnInfo columnInfo;
    private ProxyState<VideoUrl> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoUrlRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VideoUrl";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoUrlRealmProxy$VideoUrlColumnInfo */
    static final class VideoUrlColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long urlIndex;

        VideoUrlColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VideoUrlColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new VideoUrlColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VideoUrlColumnInfo videoUrlColumnInfo = (VideoUrlColumnInfo) columnInfo;
            VideoUrlColumnInfo videoUrlColumnInfo2 = (VideoUrlColumnInfo) columnInfo2;
            videoUrlColumnInfo2.urlIndex = videoUrlColumnInfo.urlIndex;
            videoUrlColumnInfo2.maxColumnIndexValue = videoUrlColumnInfo.maxColumnIndexValue;
        }
    }

    C4816xc56fdf8f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (VideoUrlColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("url", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VideoUrlColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VideoUrlColumnInfo(osSchemaInfo);
    }

    public static VideoUrl createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        VideoUrl videoUrl = (VideoUrl) realm.createObjectInternal(VideoUrl.class, true, Collections.emptyList());
        C4817xeb68be6a ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxyinterface = videoUrl;
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        return videoUrl;
    }

    public static VideoUrl createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        VideoUrl videoUrl = new VideoUrl();
        C4817xeb68be6a ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxyinterface = videoUrl;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("url")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxyinterface.realmSet$url(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxyinterface.realmSet$url((String) null);
            }
        }
        jsonReader.endObject();
        return (VideoUrl) realm.copyToRealm(videoUrl, new ImportFlag[0]);
    }

    private static C4816xc56fdf8f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoUrl.class), false, Collections.emptyList());
        C4816xc56fdf8f ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxy = new C4816xc56fdf8f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxy;
    }

    public static VideoUrl copyOrUpdate(Realm realm, VideoUrlColumnInfo videoUrlColumnInfo, VideoUrl videoUrl, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (videoUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return videoUrl;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(videoUrl);
        if (realmObjectProxy2 != null) {
            return (VideoUrl) realmObjectProxy2;
        }
        return copy(realm, videoUrlColumnInfo, videoUrl, z, map, set);
    }

    public static VideoUrl copy(Realm realm, VideoUrlColumnInfo videoUrlColumnInfo, VideoUrl videoUrl, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(videoUrl);
        if (realmObjectProxy != null) {
            return (VideoUrl) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(VideoUrl.class), videoUrlColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(videoUrlColumnInfo.urlIndex, videoUrl.realmGet$url());
        C4816xc56fdf8f newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(videoUrl, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, VideoUrl videoUrl, Map<RealmModel, Long> map) {
        if (videoUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoUrl.class);
        long nativePtr = table.getNativePtr();
        VideoUrlColumnInfo videoUrlColumnInfo = (VideoUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoUrl.class);
        long createRow = OsObject.createRow(table);
        map.put(videoUrl, Long.valueOf(createRow));
        String realmGet$url = videoUrl.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, videoUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VideoUrl.class);
        long nativePtr = table.getNativePtr();
        VideoUrlColumnInfo videoUrlColumnInfo = (VideoUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoUrl.class);
        while (it.hasNext()) {
            VideoUrl videoUrl = (VideoUrl) it.next();
            if (!map.containsKey(videoUrl)) {
                if (videoUrl instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoUrl;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(videoUrl, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(videoUrl, Long.valueOf(createRow));
                String realmGet$url = videoUrl.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, videoUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, VideoUrl videoUrl, Map<RealmModel, Long> map) {
        if (videoUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoUrl.class);
        long nativePtr = table.getNativePtr();
        VideoUrlColumnInfo videoUrlColumnInfo = (VideoUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoUrl.class);
        long createRow = OsObject.createRow(table);
        map.put(videoUrl, Long.valueOf(createRow));
        String realmGet$url = videoUrl.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, videoUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, videoUrlColumnInfo.urlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VideoUrl.class);
        long nativePtr = table.getNativePtr();
        VideoUrlColumnInfo videoUrlColumnInfo = (VideoUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoUrl.class);
        while (it.hasNext()) {
            VideoUrl videoUrl = (VideoUrl) it.next();
            if (!map.containsKey(videoUrl)) {
                if (videoUrl instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoUrl;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(videoUrl, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(videoUrl, Long.valueOf(createRow));
                String realmGet$url = videoUrl.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, videoUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoUrlColumnInfo.urlIndex, createRow, false);
                }
            }
        }
    }

    public static VideoUrl createDetachedCopy(VideoUrl videoUrl, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        VideoUrl videoUrl2;
        if (i > i2 || videoUrl == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(videoUrl);
        if (cacheData == null) {
            videoUrl2 = new VideoUrl();
            map.put(videoUrl, new RealmObjectProxy.CacheData(i, videoUrl2));
        } else if (i >= cacheData.minDepth) {
            return (VideoUrl) cacheData.object;
        } else {
            cacheData.minDepth = i;
            videoUrl2 = (VideoUrl) cacheData.object;
        }
        videoUrl2.realmSet$url(videoUrl.realmGet$url());
        return videoUrl2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("VideoUrl = proxy[");
        sb.append("{url:");
        sb.append(realmGet$url() != null ? realmGet$url() : "null");
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
        C4816xc56fdf8f ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxy = (C4816xc56fdf8f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_video_videourlrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
