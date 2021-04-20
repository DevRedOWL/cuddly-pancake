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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEvents;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsRealmProxy */
public class C4814x4a38c7d7 extends VideoEvents implements RealmObjectProxy, C4815x8acca722 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VideoEventsColumnInfo columnInfo;
    private ProxyState<VideoEvents> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VideoEvents";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsRealmProxy$VideoEventsColumnInfo */
    static final class VideoEventsColumnInfo extends ColumnInfo {
        long durationIndex;
        long idIndex;
        long maxColumnIndexValue;
        long timestampIndex;

        VideoEventsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.timestampIndex = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.durationIndex = addColumnDetails("duration", "duration", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VideoEventsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new VideoEventsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VideoEventsColumnInfo videoEventsColumnInfo = (VideoEventsColumnInfo) columnInfo;
            VideoEventsColumnInfo videoEventsColumnInfo2 = (VideoEventsColumnInfo) columnInfo2;
            videoEventsColumnInfo2.idIndex = videoEventsColumnInfo.idIndex;
            videoEventsColumnInfo2.timestampIndex = videoEventsColumnInfo.timestampIndex;
            videoEventsColumnInfo2.durationIndex = videoEventsColumnInfo.durationIndex;
            videoEventsColumnInfo2.maxColumnIndexValue = videoEventsColumnInfo.maxColumnIndexValue;
        }
    }

    C4814x4a38c7d7() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (VideoEventsColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$timestamp() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.timestampIndex);
    }

    public void realmSet$timestamp(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.timestampIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.timestampIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.timestampIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.timestampIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$duration() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.durationIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.durationIndex));
    }

    public void realmSet$duration(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.durationIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.durationIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.durationIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.durationIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("timestamp", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("duration", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VideoEventsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VideoEventsColumnInfo(osSchemaInfo);
    }

    public static VideoEvents createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        VideoEvents videoEvents = (VideoEvents) realm.createObjectInternal(VideoEvents.class, true, Collections.emptyList());
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("timestamp")) {
            if (jSONObject.isNull("timestamp")) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$timestamp((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$timestamp(jSONObject.getString("timestamp"));
            }
        }
        if (jSONObject.has("duration")) {
            if (jSONObject.isNull("duration")) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$duration((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$duration(Integer.valueOf(jSONObject.getInt("duration")));
            }
        }
        return videoEvents;
    }

    public static VideoEvents createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        VideoEvents videoEvents = new VideoEvents();
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("timestamp")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$timestamp(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$timestamp((String) null);
                }
            } else if (!nextName.equals("duration")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$duration(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$duration((Integer) null);
            }
        }
        jsonReader.endObject();
        return (VideoEvents) realm.copyToRealm(videoEvents, new ImportFlag[0]);
    }

    private static C4814x4a38c7d7 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class), false, Collections.emptyList());
        C4814x4a38c7d7 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxy = new C4814x4a38c7d7();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxy;
    }

    public static VideoEvents copyOrUpdate(Realm realm, VideoEventsColumnInfo videoEventsColumnInfo, VideoEvents videoEvents, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (videoEvents instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEvents;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return videoEvents;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(videoEvents);
        if (realmObjectProxy2 != null) {
            return (VideoEvents) realmObjectProxy2;
        }
        return copy(realm, videoEventsColumnInfo, videoEvents, z, map, set);
    }

    public static VideoEvents copy(Realm realm, VideoEventsColumnInfo videoEventsColumnInfo, VideoEvents videoEvents, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(videoEvents);
        if (realmObjectProxy != null) {
            return (VideoEvents) realmObjectProxy;
        }
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(VideoEvents.class), videoEventsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(videoEventsColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(videoEventsColumnInfo.timestampIndex, ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$timestamp());
        osObjectBuilder.addInteger(videoEventsColumnInfo.durationIndex, ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$duration());
        C4814x4a38c7d7 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(videoEvents, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, VideoEvents videoEvents, Map<RealmModel, Long> map) {
        if (videoEvents instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEvents;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoEvents.class);
        long nativePtr = table.getNativePtr();
        VideoEventsColumnInfo videoEventsColumnInfo = (VideoEventsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class);
        long createRow = OsObject.createRow(table);
        map.put(videoEvents, Long.valueOf(createRow));
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, videoEventsColumnInfo.idIndex, createRow, realmGet$id, false);
        }
        String realmGet$timestamp = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(nativePtr, videoEventsColumnInfo.timestampIndex, createRow, realmGet$timestamp, false);
        }
        Integer realmGet$duration = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$duration();
        if (realmGet$duration != null) {
            Table.nativeSetLong(nativePtr, videoEventsColumnInfo.durationIndex, createRow, realmGet$duration.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(VideoEvents.class);
        long nativePtr = table.getNativePtr();
        VideoEventsColumnInfo videoEventsColumnInfo = (VideoEventsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class);
        while (it.hasNext()) {
            VideoEvents videoEvents = (VideoEvents) it.next();
            if (!map2.containsKey(videoEvents)) {
                if (videoEvents instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEvents;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(videoEvents, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(videoEvents, Long.valueOf(createRow));
                C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, videoEventsColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$timestamp = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$timestamp();
                if (realmGet$timestamp != null) {
                    Table.nativeSetString(nativePtr, videoEventsColumnInfo.timestampIndex, createRow, realmGet$timestamp, false);
                }
                Integer realmGet$duration = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$duration();
                if (realmGet$duration != null) {
                    Table.nativeSetLong(nativePtr, videoEventsColumnInfo.durationIndex, createRow, realmGet$duration.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, VideoEvents videoEvents, Map<RealmModel, Long> map) {
        if (videoEvents instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEvents;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoEvents.class);
        long nativePtr = table.getNativePtr();
        VideoEventsColumnInfo videoEventsColumnInfo = (VideoEventsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class);
        long createRow = OsObject.createRow(table);
        map.put(videoEvents, Long.valueOf(createRow));
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
        String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(nativePtr, videoEventsColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            Table.nativeSetNull(nativePtr, videoEventsColumnInfo.idIndex, createRow, false);
        }
        String realmGet$timestamp = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(nativePtr, videoEventsColumnInfo.timestampIndex, createRow, realmGet$timestamp, false);
        } else {
            Table.nativeSetNull(nativePtr, videoEventsColumnInfo.timestampIndex, createRow, false);
        }
        Integer realmGet$duration = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$duration();
        if (realmGet$duration != null) {
            Table.nativeSetLong(nativePtr, videoEventsColumnInfo.durationIndex, createRow, realmGet$duration.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, videoEventsColumnInfo.durationIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(VideoEvents.class);
        long nativePtr = table.getNativePtr();
        VideoEventsColumnInfo videoEventsColumnInfo = (VideoEventsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class);
        while (it.hasNext()) {
            VideoEvents videoEvents = (VideoEvents) it.next();
            if (!map2.containsKey(videoEvents)) {
                if (videoEvents instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEvents;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(videoEvents, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(videoEvents, Long.valueOf(createRow));
                C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents;
                String realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, videoEventsColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoEventsColumnInfo.idIndex, createRow, false);
                }
                String realmGet$timestamp = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$timestamp();
                if (realmGet$timestamp != null) {
                    Table.nativeSetString(nativePtr, videoEventsColumnInfo.timestampIndex, createRow, realmGet$timestamp, false);
                } else {
                    Table.nativeSetNull(nativePtr, videoEventsColumnInfo.timestampIndex, createRow, false);
                }
                Integer realmGet$duration = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmGet$duration();
                if (realmGet$duration != null) {
                    Table.nativeSetLong(nativePtr, videoEventsColumnInfo.durationIndex, createRow, realmGet$duration.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, videoEventsColumnInfo.durationIndex, createRow, false);
                }
            }
        }
    }

    public static VideoEvents createDetachedCopy(VideoEvents videoEvents, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        VideoEvents videoEvents2;
        if (i > i2 || videoEvents == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(videoEvents);
        if (cacheData == null) {
            videoEvents2 = new VideoEvents();
            map.put(videoEvents, new RealmObjectProxy.CacheData(i, videoEvents2));
        } else if (i >= cacheData.minDepth) {
            return (VideoEvents) cacheData.object;
        } else {
            cacheData.minDepth = i;
            videoEvents2 = (VideoEvents) cacheData.object;
        }
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface = videoEvents2;
        C4815x8acca722 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface2 = videoEvents;
        ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$timestamp(ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface2.realmGet$timestamp());
        ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface.realmSet$duration(ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxyinterface2.realmGet$duration());
        return videoEvents2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("VideoEvents = proxy[");
        sb.append("{id:");
        Object obj = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{timestamp:");
        sb.append(realmGet$timestamp() != null ? realmGet$timestamp() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{duration:");
        Object obj2 = obj;
        if (realmGet$duration() != null) {
            obj2 = realmGet$duration();
        }
        sb.append(obj2);
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
        C4814x4a38c7d7 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxy = (C4814x4a38c7d7) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
