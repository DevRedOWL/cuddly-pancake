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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketAccountsList;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketAccountsListRealmProxy */
public class C4710x379415fc extends TicketAccountsList implements RealmObjectProxy, C4711x22e6729d {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketAccountsListColumnInfo columnInfo;
    private ProxyState<TicketAccountsList> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketAccountsListRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketAccountsList";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketAccountsListRealmProxy$TicketAccountsListColumnInfo */
    static final class TicketAccountsListColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;

        TicketAccountsListColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketAccountsListColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketAccountsListColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketAccountsListColumnInfo ticketAccountsListColumnInfo = (TicketAccountsListColumnInfo) columnInfo;
            TicketAccountsListColumnInfo ticketAccountsListColumnInfo2 = (TicketAccountsListColumnInfo) columnInfo2;
            ticketAccountsListColumnInfo2.titleIndex = ticketAccountsListColumnInfo.titleIndex;
            ticketAccountsListColumnInfo2.maxColumnIndexValue = ticketAccountsListColumnInfo.maxColumnIndexValue;
        }
    }

    C4710x379415fc() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketAccountsListColumnInfo) realmObjectContext.getColumnInfo();
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

    public static TicketAccountsListColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketAccountsListColumnInfo(osSchemaInfo);
    }

    public static TicketAccountsList createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketAccountsList ticketAccountsList = (TicketAccountsList) realm.createObjectInternal(TicketAccountsList.class, true, Collections.emptyList());
        C4711x22e6729d ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxyinterface = ticketAccountsList;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return ticketAccountsList;
    }

    public static TicketAccountsList createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketAccountsList ticketAccountsList = new TicketAccountsList();
        C4711x22e6729d ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxyinterface = ticketAccountsList;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketAccountsList) realm.copyToRealm(ticketAccountsList, new ImportFlag[0]);
    }

    private static C4710x379415fc newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class), false, Collections.emptyList());
        C4710x379415fc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxy = new C4710x379415fc();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxy;
    }

    public static TicketAccountsList copyOrUpdate(Realm realm, TicketAccountsListColumnInfo ticketAccountsListColumnInfo, TicketAccountsList ticketAccountsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketAccountsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketAccountsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketAccountsList;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketAccountsList);
        if (realmObjectProxy2 != null) {
            return (TicketAccountsList) realmObjectProxy2;
        }
        return copy(realm, ticketAccountsListColumnInfo, ticketAccountsList, z, map, set);
    }

    public static TicketAccountsList copy(Realm realm, TicketAccountsListColumnInfo ticketAccountsListColumnInfo, TicketAccountsList ticketAccountsList, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketAccountsList);
        if (realmObjectProxy != null) {
            return (TicketAccountsList) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketAccountsList.class), ticketAccountsListColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketAccountsListColumnInfo.titleIndex, ticketAccountsList.realmGet$title());
        C4710x379415fc newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketAccountsList, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketAccountsList ticketAccountsList, Map<RealmModel, Long> map) {
        if (ticketAccountsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketAccountsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketAccountsList.class);
        long nativePtr = table.getNativePtr();
        TicketAccountsListColumnInfo ticketAccountsListColumnInfo = (TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketAccountsList, Long.valueOf(createRow));
        String realmGet$title = ticketAccountsList.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketAccountsListColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketAccountsList.class);
        long nativePtr = table.getNativePtr();
        TicketAccountsListColumnInfo ticketAccountsListColumnInfo = (TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class);
        while (it.hasNext()) {
            TicketAccountsList ticketAccountsList = (TicketAccountsList) it.next();
            if (!map.containsKey(ticketAccountsList)) {
                if (ticketAccountsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketAccountsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketAccountsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketAccountsList, Long.valueOf(createRow));
                String realmGet$title = ticketAccountsList.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketAccountsListColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketAccountsList ticketAccountsList, Map<RealmModel, Long> map) {
        if (ticketAccountsList instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketAccountsList;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketAccountsList.class);
        long nativePtr = table.getNativePtr();
        TicketAccountsListColumnInfo ticketAccountsListColumnInfo = (TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketAccountsList, Long.valueOf(createRow));
        String realmGet$title = ticketAccountsList.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketAccountsListColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketAccountsListColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketAccountsList.class);
        long nativePtr = table.getNativePtr();
        TicketAccountsListColumnInfo ticketAccountsListColumnInfo = (TicketAccountsListColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketAccountsList.class);
        while (it.hasNext()) {
            TicketAccountsList ticketAccountsList = (TicketAccountsList) it.next();
            if (!map.containsKey(ticketAccountsList)) {
                if (ticketAccountsList instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketAccountsList;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketAccountsList, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketAccountsList, Long.valueOf(createRow));
                String realmGet$title = ticketAccountsList.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketAccountsListColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketAccountsListColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static TicketAccountsList createDetachedCopy(TicketAccountsList ticketAccountsList, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketAccountsList ticketAccountsList2;
        if (i > i2 || ticketAccountsList == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketAccountsList);
        if (cacheData == null) {
            ticketAccountsList2 = new TicketAccountsList();
            map.put(ticketAccountsList, new RealmObjectProxy.CacheData(i, ticketAccountsList2));
        } else if (i >= cacheData.minDepth) {
            return (TicketAccountsList) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketAccountsList2 = (TicketAccountsList) cacheData.object;
        }
        ticketAccountsList2.realmSet$title(ticketAccountsList.realmGet$title());
        return ticketAccountsList2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketAccountsList = proxy[");
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
        C4710x379415fc ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxy = (C4710x379415fc) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketaccountslistrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
