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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketState;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketStateRealmProxy */
public class C4726x470e297 extends TicketState implements RealmObjectProxy, C4727x7c26a462 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketStateColumnInfo columnInfo;
    private ProxyState<TicketState> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketStateRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketState";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketStateRealmProxy$TicketStateColumnInfo */
    static final class TicketStateColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long slugIndex;
        long titleIndex;

        TicketStateColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.slugIndex = addColumnDetails("slug", "slug", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketStateColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketStateColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketStateColumnInfo ticketStateColumnInfo = (TicketStateColumnInfo) columnInfo;
            TicketStateColumnInfo ticketStateColumnInfo2 = (TicketStateColumnInfo) columnInfo2;
            ticketStateColumnInfo2.titleIndex = ticketStateColumnInfo.titleIndex;
            ticketStateColumnInfo2.slugIndex = ticketStateColumnInfo.slugIndex;
            ticketStateColumnInfo2.maxColumnIndexValue = ticketStateColumnInfo.maxColumnIndexValue;
        }
    }

    C4726x470e297() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketStateColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$slug() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.slugIndex);
    }

    public void realmSet$slug(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.slugIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.slugIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.slugIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.slugIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("slug", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketStateColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketStateColumnInfo(osSchemaInfo);
    }

    public static TicketState createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketState ticketState = (TicketState) realm.createObjectInternal(TicketState.class, true, Collections.emptyList());
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("slug")) {
            if (jSONObject.isNull("slug")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$slug((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$slug(jSONObject.getString("slug"));
            }
        }
        return ticketState;
    }

    public static TicketState createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketState ticketState = new TicketState();
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("slug")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$slug(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$slug((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketState) realm.copyToRealm(ticketState, new ImportFlag[0]);
    }

    private static C4726x470e297 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class), false, Collections.emptyList());
        C4726x470e297 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxy = new C4726x470e297();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxy;
    }

    public static TicketState copyOrUpdate(Realm realm, TicketStateColumnInfo ticketStateColumnInfo, TicketState ticketState, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketState;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketState);
        if (realmObjectProxy2 != null) {
            return (TicketState) realmObjectProxy2;
        }
        return copy(realm, ticketStateColumnInfo, ticketState, z, map, set);
    }

    public static TicketState copy(Realm realm, TicketStateColumnInfo ticketStateColumnInfo, TicketState ticketState, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketState);
        if (realmObjectProxy != null) {
            return (TicketState) realmObjectProxy;
        }
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketState.class), ticketStateColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketStateColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(ticketStateColumnInfo.slugIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$slug());
        C4726x470e297 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketState, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketState ticketState, Map<RealmModel, Long> map) {
        if (ticketState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketState.class);
        long nativePtr = table.getNativePtr();
        TicketStateColumnInfo ticketStateColumnInfo = (TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketState, Long.valueOf(createRow));
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketStateColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, ticketStateColumnInfo.slugIndex, createRow, realmGet$slug, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketState.class);
        long nativePtr = table.getNativePtr();
        TicketStateColumnInfo ticketStateColumnInfo = (TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class);
        while (it.hasNext()) {
            TicketState ticketState = (TicketState) it.next();
            if (!map2.containsKey(ticketState)) {
                if (ticketState instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketState;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketState, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketState, Long.valueOf(createRow));
                C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketStateColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(nativePtr, ticketStateColumnInfo.slugIndex, createRow, realmGet$slug, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketState ticketState, Map<RealmModel, Long> map) {
        if (ticketState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketState.class);
        long nativePtr = table.getNativePtr();
        TicketStateColumnInfo ticketStateColumnInfo = (TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketState, Long.valueOf(createRow));
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketStateColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketStateColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$slug();
        if (realmGet$slug != null) {
            Table.nativeSetString(nativePtr, ticketStateColumnInfo.slugIndex, createRow, realmGet$slug, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketStateColumnInfo.slugIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketState.class);
        long nativePtr = table.getNativePtr();
        TicketStateColumnInfo ticketStateColumnInfo = (TicketStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketState.class);
        while (it.hasNext()) {
            TicketState ticketState = (TicketState) it.next();
            if (!map2.containsKey(ticketState)) {
                if (ticketState instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketState;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketState, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketState, Long.valueOf(createRow));
                C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketStateColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketStateColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$slug = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmGet$slug();
                if (realmGet$slug != null) {
                    Table.nativeSetString(nativePtr, ticketStateColumnInfo.slugIndex, createRow, realmGet$slug, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketStateColumnInfo.slugIndex, createRow, false);
                }
            }
        }
    }

    public static TicketState createDetachedCopy(TicketState ticketState, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketState ticketState2;
        if (i > i2 || ticketState == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketState);
        if (cacheData == null) {
            ticketState2 = new TicketState();
            map.put(ticketState, new RealmObjectProxy.CacheData(i, ticketState2));
        } else if (i >= cacheData.minDepth) {
            return (TicketState) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketState2 = (TicketState) cacheData.object;
        }
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface = ticketState2;
        C4727x7c26a462 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface2 = ticketState;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface.realmSet$slug(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxyinterface2.realmGet$slug());
        return ticketState2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketState = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{slug:");
        if (realmGet$slug() != null) {
            str = realmGet$slug();
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
        C4726x470e297 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxy = (C4726x470e297) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketstaterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
