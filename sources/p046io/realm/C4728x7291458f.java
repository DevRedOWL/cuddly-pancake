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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketUrgency;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketUrgencyRealmProxy */
public class C4728x7291458f extends TicketUrgency implements RealmObjectProxy, C4729xb67a186a {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketUrgencyColumnInfo columnInfo;
    private ProxyState<TicketUrgency> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketUrgencyRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketUrgency";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketUrgencyRealmProxy$TicketUrgencyColumnInfo */
    static final class TicketUrgencyColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;

        TicketUrgencyColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketUrgencyColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketUrgencyColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketUrgencyColumnInfo ticketUrgencyColumnInfo = (TicketUrgencyColumnInfo) columnInfo;
            TicketUrgencyColumnInfo ticketUrgencyColumnInfo2 = (TicketUrgencyColumnInfo) columnInfo2;
            ticketUrgencyColumnInfo2.titleIndex = ticketUrgencyColumnInfo.titleIndex;
            ticketUrgencyColumnInfo2.maxColumnIndexValue = ticketUrgencyColumnInfo.maxColumnIndexValue;
        }
    }

    C4728x7291458f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketUrgencyColumnInfo) realmObjectContext.getColumnInfo();
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketUrgencyColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketUrgencyColumnInfo(osSchemaInfo);
    }

    public static TicketUrgency createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketUrgency ticketUrgency = (TicketUrgency) realm.createObjectInternal(TicketUrgency.class, true, Collections.emptyList());
        C4729xb67a186a ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxyinterface = ticketUrgency;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return ticketUrgency;
    }

    public static TicketUrgency createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketUrgency ticketUrgency = new TicketUrgency();
        C4729xb67a186a ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxyinterface = ticketUrgency;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketUrgency) realm.copyToRealm(ticketUrgency, new ImportFlag[0]);
    }

    private static C4728x7291458f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class), false, Collections.emptyList());
        C4728x7291458f ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxy = new C4728x7291458f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxy;
    }

    public static TicketUrgency copyOrUpdate(Realm realm, TicketUrgencyColumnInfo ticketUrgencyColumnInfo, TicketUrgency ticketUrgency, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketUrgency instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketUrgency;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketUrgency;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketUrgency);
        if (realmObjectProxy2 != null) {
            return (TicketUrgency) realmObjectProxy2;
        }
        return copy(realm, ticketUrgencyColumnInfo, ticketUrgency, z, map, set);
    }

    public static TicketUrgency copy(Realm realm, TicketUrgencyColumnInfo ticketUrgencyColumnInfo, TicketUrgency ticketUrgency, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketUrgency);
        if (realmObjectProxy != null) {
            return (TicketUrgency) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketUrgency.class), ticketUrgencyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketUrgencyColumnInfo.titleIndex, ticketUrgency.realmGet$title());
        C4728x7291458f newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketUrgency, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketUrgency ticketUrgency, Map<RealmModel, Long> map) {
        if (ticketUrgency instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketUrgency;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketUrgency.class);
        long nativePtr = table.getNativePtr();
        TicketUrgencyColumnInfo ticketUrgencyColumnInfo = (TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketUrgency, Long.valueOf(createRow));
        String realmGet$title = ticketUrgency.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketUrgencyColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketUrgency.class);
        long nativePtr = table.getNativePtr();
        TicketUrgencyColumnInfo ticketUrgencyColumnInfo = (TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class);
        while (it.hasNext()) {
            TicketUrgency ticketUrgency = (TicketUrgency) it.next();
            if (!map.containsKey(ticketUrgency)) {
                if (ticketUrgency instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketUrgency;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketUrgency, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketUrgency, Long.valueOf(createRow));
                String realmGet$title = ticketUrgency.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketUrgencyColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketUrgency ticketUrgency, Map<RealmModel, Long> map) {
        if (ticketUrgency instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketUrgency;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketUrgency.class);
        long nativePtr = table.getNativePtr();
        TicketUrgencyColumnInfo ticketUrgencyColumnInfo = (TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketUrgency, Long.valueOf(createRow));
        String realmGet$title = ticketUrgency.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketUrgencyColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketUrgencyColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketUrgency.class);
        long nativePtr = table.getNativePtr();
        TicketUrgencyColumnInfo ticketUrgencyColumnInfo = (TicketUrgencyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketUrgency.class);
        while (it.hasNext()) {
            TicketUrgency ticketUrgency = (TicketUrgency) it.next();
            if (!map.containsKey(ticketUrgency)) {
                if (ticketUrgency instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketUrgency;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketUrgency, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketUrgency, Long.valueOf(createRow));
                String realmGet$title = ticketUrgency.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketUrgencyColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketUrgencyColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static TicketUrgency createDetachedCopy(TicketUrgency ticketUrgency, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketUrgency ticketUrgency2;
        if (i > i2 || ticketUrgency == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketUrgency);
        if (cacheData == null) {
            ticketUrgency2 = new TicketUrgency();
            map.put(ticketUrgency, new RealmObjectProxy.CacheData(i, ticketUrgency2));
        } else if (i >= cacheData.minDepth) {
            return (TicketUrgency) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketUrgency2 = (TicketUrgency) cacheData.object;
        }
        ticketUrgency2.realmSet$title(ticketUrgency.realmGet$title());
        return ticketUrgency2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketUrgency = proxy[");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : "null");
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
        C4728x7291458f ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxy = (C4728x7291458f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketurgencyrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
