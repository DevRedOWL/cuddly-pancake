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
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.AudioUrl;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_AudioUrlRealmProxy */
public class C4652xadba3b3e extends AudioUrl implements RealmObjectProxy, C4653xcfc9179b {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private AudioUrlColumnInfo columnInfo;
    private ProxyState<AudioUrl> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_AudioUrlRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AudioUrl";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_AudioUrlRealmProxy$AudioUrlColumnInfo */
    static final class AudioUrlColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long urlIndex;

        AudioUrlColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AudioUrlColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new AudioUrlColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            AudioUrlColumnInfo audioUrlColumnInfo = (AudioUrlColumnInfo) columnInfo;
            AudioUrlColumnInfo audioUrlColumnInfo2 = (AudioUrlColumnInfo) columnInfo2;
            audioUrlColumnInfo2.urlIndex = audioUrlColumnInfo.urlIndex;
            audioUrlColumnInfo2.maxColumnIndexValue = audioUrlColumnInfo.maxColumnIndexValue;
        }
    }

    C4652xadba3b3e() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (AudioUrlColumnInfo) realmObjectContext.getColumnInfo();
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

    public static AudioUrlColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new AudioUrlColumnInfo(osSchemaInfo);
    }

    public static AudioUrl createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        AudioUrl audioUrl = (AudioUrl) realm.createObjectInternal(AudioUrl.class, true, Collections.emptyList());
        C4653xcfc9179b ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxyinterface = audioUrl;
        if (jSONObject.has("url")) {
            if (jSONObject.isNull("url")) {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxyinterface.realmSet$url((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxyinterface.realmSet$url(jSONObject.getString("url"));
            }
        }
        return audioUrl;
    }

    public static AudioUrl createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        AudioUrl audioUrl = new AudioUrl();
        C4653xcfc9179b ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxyinterface = audioUrl;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("url")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxyinterface.realmSet$url(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxyinterface.realmSet$url((String) null);
            }
        }
        jsonReader.endObject();
        return (AudioUrl) realm.copyToRealm(audioUrl, new ImportFlag[0]);
    }

    private static C4652xadba3b3e newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) AudioUrl.class), false, Collections.emptyList());
        C4652xadba3b3e ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxy = new C4652xadba3b3e();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxy;
    }

    public static AudioUrl copyOrUpdate(Realm realm, AudioUrlColumnInfo audioUrlColumnInfo, AudioUrl audioUrl, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (audioUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) audioUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return audioUrl;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(audioUrl);
        if (realmObjectProxy2 != null) {
            return (AudioUrl) realmObjectProxy2;
        }
        return copy(realm, audioUrlColumnInfo, audioUrl, z, map, set);
    }

    public static AudioUrl copy(Realm realm, AudioUrlColumnInfo audioUrlColumnInfo, AudioUrl audioUrl, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(audioUrl);
        if (realmObjectProxy != null) {
            return (AudioUrl) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(AudioUrl.class), audioUrlColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(audioUrlColumnInfo.urlIndex, audioUrl.realmGet$url());
        C4652xadba3b3e newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(audioUrl, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, AudioUrl audioUrl, Map<RealmModel, Long> map) {
        if (audioUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) audioUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AudioUrl.class);
        long nativePtr = table.getNativePtr();
        AudioUrlColumnInfo audioUrlColumnInfo = (AudioUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AudioUrl.class);
        long createRow = OsObject.createRow(table);
        map.put(audioUrl, Long.valueOf(createRow));
        String realmGet$url = audioUrl.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, audioUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(AudioUrl.class);
        long nativePtr = table.getNativePtr();
        AudioUrlColumnInfo audioUrlColumnInfo = (AudioUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AudioUrl.class);
        while (it.hasNext()) {
            AudioUrl audioUrl = (AudioUrl) it.next();
            if (!map.containsKey(audioUrl)) {
                if (audioUrl instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) audioUrl;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(audioUrl, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(audioUrl, Long.valueOf(createRow));
                String realmGet$url = audioUrl.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, audioUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, AudioUrl audioUrl, Map<RealmModel, Long> map) {
        if (audioUrl instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) audioUrl;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(AudioUrl.class);
        long nativePtr = table.getNativePtr();
        AudioUrlColumnInfo audioUrlColumnInfo = (AudioUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AudioUrl.class);
        long createRow = OsObject.createRow(table);
        map.put(audioUrl, Long.valueOf(createRow));
        String realmGet$url = audioUrl.realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(nativePtr, audioUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
        } else {
            Table.nativeSetNull(nativePtr, audioUrlColumnInfo.urlIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(AudioUrl.class);
        long nativePtr = table.getNativePtr();
        AudioUrlColumnInfo audioUrlColumnInfo = (AudioUrlColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) AudioUrl.class);
        while (it.hasNext()) {
            AudioUrl audioUrl = (AudioUrl) it.next();
            if (!map.containsKey(audioUrl)) {
                if (audioUrl instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) audioUrl;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(audioUrl, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(audioUrl, Long.valueOf(createRow));
                String realmGet$url = audioUrl.realmGet$url();
                if (realmGet$url != null) {
                    Table.nativeSetString(nativePtr, audioUrlColumnInfo.urlIndex, createRow, realmGet$url, false);
                } else {
                    Table.nativeSetNull(nativePtr, audioUrlColumnInfo.urlIndex, createRow, false);
                }
            }
        }
    }

    public static AudioUrl createDetachedCopy(AudioUrl audioUrl, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        AudioUrl audioUrl2;
        if (i > i2 || audioUrl == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(audioUrl);
        if (cacheData == null) {
            audioUrl2 = new AudioUrl();
            map.put(audioUrl, new RealmObjectProxy.CacheData(i, audioUrl2));
        } else if (i >= cacheData.minDepth) {
            return (AudioUrl) cacheData.object;
        } else {
            cacheData.minDepth = i;
            audioUrl2 = (AudioUrl) cacheData.object;
        }
        audioUrl2.realmSet$url(audioUrl.realmGet$url());
        return audioUrl2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("AudioUrl = proxy[");
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
        C4652xadba3b3e ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxy = (C4652xadba3b3e) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_scenario_audiourlrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
