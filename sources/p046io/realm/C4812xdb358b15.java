package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEvents;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoEventsList;
import p046io.realm.BaseRealm;
import p046io.realm.C4814x4a38c7d7;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsListRealmProxy */
public class C4812xdb358b15 extends VideoEventsList implements RealmObjectProxy, C4813x7044a9a4 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VideoEventsListColumnInfo columnInfo;
    private RealmList<VideoEvents> datesRealmList;
    private ProxyState<VideoEventsList> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsListRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VideoEventsList";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoEventsListRealmProxy$VideoEventsListColumnInfo */
    static final class VideoEventsListColumnInfo extends ColumnInfo {
        long datesIndex;
        long maxColumnIndexValue;

        VideoEventsListColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.datesIndex = addColumnDetails("dates", "dates", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VideoEventsListColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new VideoEventsListColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VideoEventsListColumnInfo videoEventsListColumnInfo = (VideoEventsListColumnInfo) columnInfo;
            VideoEventsListColumnInfo videoEventsListColumnInfo2 = (VideoEventsListColumnInfo) columnInfo2;
            videoEventsListColumnInfo2.datesIndex = videoEventsListColumnInfo.datesIndex;
            videoEventsListColumnInfo2.maxColumnIndexValue = videoEventsListColumnInfo.maxColumnIndexValue;
        }
    }

    C4812xdb358b15() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (VideoEventsListColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RealmList<VideoEvents> realmGet$dates() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<VideoEvents> realmList = this.datesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.datesRealmList = new RealmList<>(VideoEvents.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.datesIndex), this.proxyState.getRealm$realm());
        return this.datesRealmList;
    }

    public void realmSet$dates(RealmList<VideoEvents> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("dates")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<VideoEvents> realmList2 = new RealmList<>();
                Iterator<VideoEvents> it = realmList.iterator();
                while (it.hasNext()) {
                    VideoEvents next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.datesIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    VideoEvents videoEvents = realmList.get(i);
                    this.proxyState.checkValidObject(videoEvents);
                    modelList.addRow(((RealmObjectProxy) videoEvents).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            VideoEvents videoEvents2 = realmList.get(i);
            this.proxyState.checkValidObject(videoEvents2);
            modelList.setRow((long) i, ((RealmObjectProxy) videoEvents2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty("dates", RealmFieldType.LIST, C4814x4a38c7d7.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VideoEventsListColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VideoEventsListColumnInfo(osSchemaInfo);
    }

    public static VideoEventsList createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("dates")) {
            arrayList.add("dates");
        }
        VideoEventsList videoEventsList = (VideoEventsList) realm.createObjectInternal(VideoEventsList.class, true, arrayList);
        C4813x7044a9a4 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface = videoEventsList;
        if (jSONObject.has("dates")) {
            if (jSONObject.isNull("dates")) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmSet$dates((RealmList<VideoEvents>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmGet$dates().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("dates");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmGet$dates().add(C4814x4a38c7d7.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return videoEventsList;
    }

    public static VideoEventsList createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        VideoEventsList videoEventsList = new VideoEventsList();
        C4813x7044a9a4 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface = videoEventsList;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("dates")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmSet$dates((RealmList<VideoEvents>) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmSet$dates(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmGet$dates().add(C4814x4a38c7d7.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (VideoEventsList) realm.copyToRealm(videoEventsList, new ImportFlag[0]);
    }

    private static C4812xdb358b15 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEventsList.class), false, Collections.emptyList());
        C4812xdb358b15 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxy = new C4812xdb358b15();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxy;
    }

    public static VideoEventsList copyOrUpdate(Realm realm, VideoEventsListColumnInfo videoEventsListColumnInfo, VideoEventsList videoEventsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (videoEventsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEventsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return videoEventsList;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(videoEventsList);
        if (realmObjectProxy2 != null) {
            return (VideoEventsList) realmObjectProxy2;
        }
        return copy(realm, videoEventsListColumnInfo, videoEventsList, z, map, set);
    }

    public static VideoEventsList copy(Realm realm, VideoEventsListColumnInfo videoEventsListColumnInfo, VideoEventsList videoEventsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(videoEventsList);
        if (realmObjectProxy != null) {
            return (VideoEventsList) realmObjectProxy;
        }
        C4812xdb358b15 newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(VideoEventsList.class), videoEventsListColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(videoEventsList, newProxyInstance);
        RealmList<VideoEvents> realmGet$dates = videoEventsList.realmGet$dates();
        if (realmGet$dates != null) {
            RealmList<VideoEvents> realmGet$dates2 = newProxyInstance.realmGet$dates();
            realmGet$dates2.clear();
            for (int i = 0; i < realmGet$dates.size(); i++) {
                VideoEvents videoEvents = realmGet$dates.get(i);
                VideoEvents videoEvents2 = (VideoEvents) map.get(videoEvents);
                if (videoEvents2 != null) {
                    realmGet$dates2.add(videoEvents2);
                } else {
                    realmGet$dates2.add(C4814x4a38c7d7.copyOrUpdate(realm, (C4814x4a38c7d7.VideoEventsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEvents.class), videoEvents, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, VideoEventsList videoEventsList, Map<RealmModel, Long> map) {
        if (videoEventsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEventsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoEventsList.class);
        table.getNativePtr();
        VideoEventsListColumnInfo videoEventsListColumnInfo = (VideoEventsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEventsList.class);
        long createRow = OsObject.createRow(table);
        map.put(videoEventsList, Long.valueOf(createRow));
        RealmList<VideoEvents> realmGet$dates = videoEventsList.realmGet$dates();
        if (realmGet$dates != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), videoEventsListColumnInfo.datesIndex);
            Iterator<VideoEvents> it = realmGet$dates.iterator();
            while (it.hasNext()) {
                VideoEvents next = it.next();
                Long l = map.get(next);
                if (l == null) {
                    l = Long.valueOf(C4814x4a38c7d7.insert(realm, next, map));
                }
                osList.addRow(l.longValue());
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VideoEventsList.class);
        table.getNativePtr();
        VideoEventsListColumnInfo videoEventsListColumnInfo = (VideoEventsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEventsList.class);
        while (it.hasNext()) {
            VideoEventsList videoEventsList = (VideoEventsList) it.next();
            if (!map.containsKey(videoEventsList)) {
                if (videoEventsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEventsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(videoEventsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(videoEventsList, Long.valueOf(createRow));
                RealmList<VideoEvents> realmGet$dates = videoEventsList.realmGet$dates();
                if (realmGet$dates != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), videoEventsListColumnInfo.datesIndex);
                    Iterator<VideoEvents> it2 = realmGet$dates.iterator();
                    while (it2.hasNext()) {
                        VideoEvents next = it2.next();
                        Long l = map.get(next);
                        if (l == null) {
                            l = Long.valueOf(C4814x4a38c7d7.insert(realm, next, map));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, VideoEventsList videoEventsList, Map<RealmModel, Long> map) {
        if (videoEventsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEventsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoEventsList.class);
        table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(videoEventsList, Long.valueOf(createRow));
        OsList osList = new OsList(table.getUncheckedRow(createRow), ((VideoEventsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEventsList.class)).datesIndex);
        RealmList<VideoEvents> realmGet$dates = videoEventsList.realmGet$dates();
        if (realmGet$dates == null || ((long) realmGet$dates.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$dates != null) {
                Iterator<VideoEvents> it = realmGet$dates.iterator();
                while (it.hasNext()) {
                    VideoEvents next = it.next();
                    Long l = map.get(next);
                    if (l == null) {
                        l = Long.valueOf(C4814x4a38c7d7.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$dates.size();
            for (int i = 0; i < size; i++) {
                VideoEvents videoEvents = realmGet$dates.get(i);
                Long l2 = map.get(videoEvents);
                if (l2 == null) {
                    l2 = Long.valueOf(C4814x4a38c7d7.insertOrUpdate(realm, videoEvents, map));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VideoEventsList.class);
        table.getNativePtr();
        VideoEventsListColumnInfo videoEventsListColumnInfo = (VideoEventsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoEventsList.class);
        while (it.hasNext()) {
            VideoEventsList videoEventsList = (VideoEventsList) it.next();
            if (!map.containsKey(videoEventsList)) {
                if (videoEventsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoEventsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(videoEventsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(videoEventsList, Long.valueOf(createRow));
                OsList osList = new OsList(table.getUncheckedRow(createRow), videoEventsListColumnInfo.datesIndex);
                RealmList<VideoEvents> realmGet$dates = videoEventsList.realmGet$dates();
                if (realmGet$dates == null || ((long) realmGet$dates.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$dates != null) {
                        Iterator<VideoEvents> it2 = realmGet$dates.iterator();
                        while (it2.hasNext()) {
                            VideoEvents next = it2.next();
                            Long l = map.get(next);
                            if (l == null) {
                                l = Long.valueOf(C4814x4a38c7d7.insertOrUpdate(realm, next, map));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$dates.size();
                    for (int i = 0; i < size; i++) {
                        VideoEvents videoEvents = realmGet$dates.get(i);
                        Long l2 = map.get(videoEvents);
                        if (l2 == null) {
                            l2 = Long.valueOf(C4814x4a38c7d7.insertOrUpdate(realm, videoEvents, map));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static VideoEventsList createDetachedCopy(VideoEventsList videoEventsList, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        VideoEventsList videoEventsList2;
        if (i > i2 || videoEventsList == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(videoEventsList);
        if (cacheData == null) {
            videoEventsList2 = new VideoEventsList();
            map.put(videoEventsList, new RealmObjectProxy.CacheData(i, videoEventsList2));
        } else if (i >= cacheData.minDepth) {
            return (VideoEventsList) cacheData.object;
        } else {
            cacheData.minDepth = i;
            videoEventsList2 = (VideoEventsList) cacheData.object;
        }
        C4813x7044a9a4 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface = videoEventsList2;
        C4813x7044a9a4 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface2 = videoEventsList;
        if (i == i2) {
            ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmSet$dates((RealmList<VideoEvents>) null);
        } else {
            RealmList<VideoEvents> realmGet$dates = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface2.realmGet$dates();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxyinterface.realmSet$dates(realmList);
            int i3 = i + 1;
            int size = realmGet$dates.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(C4814x4a38c7d7.createDetachedCopy(realmGet$dates.get(i4), i3, i2, map));
            }
        }
        return videoEventsList2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "VideoEventsList = proxy[" + "{dates:" + "RealmList<VideoEvents>[" + realmGet$dates().size() + "]" + "}" + "]";
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
        C4812xdb358b15 ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxy = (C4812xdb358b15) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_video_videoeventslistrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
