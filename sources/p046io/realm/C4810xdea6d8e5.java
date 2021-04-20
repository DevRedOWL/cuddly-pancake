package p046io.realm;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.video.VideoDates;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoDatesRealmProxy */
public class C4810xdea6d8e5 extends VideoDates implements RealmObjectProxy, C4811x4ea5e5d4 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private VideoDatesColumnInfo columnInfo;
    private RealmList<Long> datesRealmList;
    private ProxyState<VideoDates> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoDatesRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "VideoDates";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_video_VideoDatesRealmProxy$VideoDatesColumnInfo */
    static final class VideoDatesColumnInfo extends ColumnInfo {
        long datesIndex;
        long maxColumnIndexValue;

        VideoDatesColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.datesIndex = addColumnDetails("dates", "dates", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        VideoDatesColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new VideoDatesColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            VideoDatesColumnInfo videoDatesColumnInfo = (VideoDatesColumnInfo) columnInfo;
            VideoDatesColumnInfo videoDatesColumnInfo2 = (VideoDatesColumnInfo) columnInfo2;
            videoDatesColumnInfo2.datesIndex = videoDatesColumnInfo.datesIndex;
            videoDatesColumnInfo2.maxColumnIndexValue = videoDatesColumnInfo.maxColumnIndexValue;
        }
    }

    C4810xdea6d8e5() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (VideoDatesColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RealmList<Long> realmGet$dates() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Long> realmList = this.datesRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.datesRealmList = new RealmList<>(Long.class, this.proxyState.getRow$realm().getValueList(this.columnInfo.datesIndex, RealmFieldType.INTEGER_LIST), this.proxyState.getRealm$realm());
        return this.datesRealmList;
    }

    public void realmSet$dates(RealmList<Long> realmList) {
        if (!this.proxyState.isUnderConstruction() || (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("dates"))) {
            this.proxyState.getRealm$realm().checkIfValid();
            OsList valueList = this.proxyState.getRow$realm().getValueList(this.columnInfo.datesIndex, RealmFieldType.INTEGER_LIST);
            valueList.removeAll();
            if (realmList != null) {
                Iterator<Long> it = realmList.iterator();
                while (it.hasNext()) {
                    Long next = it.next();
                    if (next == null) {
                        valueList.addNull();
                    } else {
                        valueList.addLong(next.longValue());
                    }
                }
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedValueListProperty("dates", RealmFieldType.INTEGER_LIST, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static VideoDatesColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new VideoDatesColumnInfo(osSchemaInfo);
    }

    public static VideoDates createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("dates")) {
            arrayList.add("dates");
        }
        VideoDates videoDates = (VideoDates) realm.createObjectInternal(VideoDates.class, true, arrayList);
        ProxyUtils.setRealmListWithJsonObject(videoDates.realmGet$dates(), jSONObject, "dates");
        return videoDates;
    }

    public static VideoDates createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        VideoDates videoDates = new VideoDates();
        C4811x4ea5e5d4 ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxyinterface = videoDates;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("dates")) {
                ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxyinterface.realmSet$dates(ProxyUtils.createRealmListWithJsonStream(Long.class, jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return (VideoDates) realm.copyToRealm(videoDates, new ImportFlag[0]);
    }

    private static C4810xdea6d8e5 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoDates.class), false, Collections.emptyList());
        C4810xdea6d8e5 ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxy = new C4810xdea6d8e5();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxy;
    }

    public static VideoDates copyOrUpdate(Realm realm, VideoDatesColumnInfo videoDatesColumnInfo, VideoDates videoDates, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (videoDates instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoDates;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return videoDates;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(videoDates);
        if (realmObjectProxy2 != null) {
            return (VideoDates) realmObjectProxy2;
        }
        return copy(realm, videoDatesColumnInfo, videoDates, z, map, set);
    }

    public static VideoDates copy(Realm realm, VideoDatesColumnInfo videoDatesColumnInfo, VideoDates videoDates, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(videoDates);
        if (realmObjectProxy != null) {
            return (VideoDates) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(VideoDates.class), videoDatesColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addLongList(videoDatesColumnInfo.datesIndex, videoDates.realmGet$dates());
        C4810xdea6d8e5 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(videoDates, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, VideoDates videoDates, Map<RealmModel, Long> map) {
        if (videoDates instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoDates;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoDates.class);
        table.getNativePtr();
        VideoDatesColumnInfo videoDatesColumnInfo = (VideoDatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoDates.class);
        long createRow = OsObject.createRow(table);
        map.put(videoDates, Long.valueOf(createRow));
        RealmList<Long> realmGet$dates = videoDates.realmGet$dates();
        if (realmGet$dates != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), videoDatesColumnInfo.datesIndex);
            Iterator<Long> it = realmGet$dates.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addLong(next.longValue());
                }
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VideoDates.class);
        table.getNativePtr();
        VideoDatesColumnInfo videoDatesColumnInfo = (VideoDatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoDates.class);
        while (it.hasNext()) {
            VideoDates videoDates = (VideoDates) it.next();
            if (!map.containsKey(videoDates)) {
                if (videoDates instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoDates;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(videoDates, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(videoDates, Long.valueOf(createRow));
                RealmList<Long> realmGet$dates = videoDates.realmGet$dates();
                if (realmGet$dates != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), videoDatesColumnInfo.datesIndex);
                    Iterator<Long> it2 = realmGet$dates.iterator();
                    while (it2.hasNext()) {
                        Long next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addLong(next.longValue());
                        }
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, VideoDates videoDates, Map<RealmModel, Long> map) {
        if (videoDates instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoDates;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(VideoDates.class);
        table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(videoDates, Long.valueOf(createRow));
        OsList osList = new OsList(table.getUncheckedRow(createRow), ((VideoDatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoDates.class)).datesIndex);
        osList.removeAll();
        RealmList<Long> realmGet$dates = videoDates.realmGet$dates();
        if (realmGet$dates != null) {
            Iterator<Long> it = realmGet$dates.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                if (next == null) {
                    osList.addNull();
                } else {
                    osList.addLong(next.longValue());
                }
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(VideoDates.class);
        table.getNativePtr();
        VideoDatesColumnInfo videoDatesColumnInfo = (VideoDatesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) VideoDates.class);
        while (it.hasNext()) {
            VideoDates videoDates = (VideoDates) it.next();
            if (!map.containsKey(videoDates)) {
                if (videoDates instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) videoDates;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(videoDates, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(videoDates, Long.valueOf(createRow));
                OsList osList = new OsList(table.getUncheckedRow(createRow), videoDatesColumnInfo.datesIndex);
                osList.removeAll();
                RealmList<Long> realmGet$dates = videoDates.realmGet$dates();
                if (realmGet$dates != null) {
                    Iterator<Long> it2 = realmGet$dates.iterator();
                    while (it2.hasNext()) {
                        Long next = it2.next();
                        if (next == null) {
                            osList.addNull();
                        } else {
                            osList.addLong(next.longValue());
                        }
                    }
                }
            }
        }
    }

    public static VideoDates createDetachedCopy(VideoDates videoDates, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        VideoDates videoDates2;
        if (i > i2 || videoDates == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(videoDates);
        if (cacheData == null) {
            videoDates2 = new VideoDates();
            map.put(videoDates, new RealmObjectProxy.CacheData(i, videoDates2));
        } else if (i >= cacheData.minDepth) {
            return (VideoDates) cacheData.object;
        } else {
            cacheData.minDepth = i;
            videoDates2 = (VideoDates) cacheData.object;
        }
        C4811x4ea5e5d4 ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxyinterface = videoDates2;
        ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxyinterface.realmSet$dates(new RealmList());
        ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxyinterface.realmGet$dates().addAll(videoDates.realmGet$dates());
        return videoDates2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "VideoDates = proxy[" + "{dates:" + "RealmList<Long>[" + realmGet$dates().size() + "]" + "}" + "]";
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
        C4810xdea6d8e5 ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxy = (C4810xdea6d8e5) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_video_videodatesrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
