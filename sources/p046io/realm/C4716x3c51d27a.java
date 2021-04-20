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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketChatData;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketChatDataRealmProxy */
public class C4716x3c51d27a extends TicketChatData implements RealmObjectProxy, C4717x4e01e3df {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketChatDataColumnInfo columnInfo;
    private ProxyState<TicketChatData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketChatDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketChatData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketChatDataRealmProxy$TicketChatDataColumnInfo */
    static final class TicketChatDataColumnInfo extends ColumnInfo {
        long idIndex;
        long lastMessageIndex;
        long maxColumnIndexValue;
        long notReadIndex;

        TicketChatDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.lastMessageIndex = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.notReadIndex = addColumnDetails("notRead", "notRead", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketChatDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketChatDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketChatDataColumnInfo ticketChatDataColumnInfo = (TicketChatDataColumnInfo) columnInfo;
            TicketChatDataColumnInfo ticketChatDataColumnInfo2 = (TicketChatDataColumnInfo) columnInfo2;
            ticketChatDataColumnInfo2.idIndex = ticketChatDataColumnInfo.idIndex;
            ticketChatDataColumnInfo2.lastMessageIndex = ticketChatDataColumnInfo.lastMessageIndex;
            ticketChatDataColumnInfo2.notReadIndex = ticketChatDataColumnInfo.notReadIndex;
            ticketChatDataColumnInfo2.maxColumnIndexValue = ticketChatDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4716x3c51d27a() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketChatDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public int realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex);
    }

    public void realmSet$id(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$lastMessage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.lastMessageIndex);
    }

    public void realmSet$lastMessage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.lastMessageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.lastMessageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.lastMessageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.lastMessageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$notRead() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.notReadIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.notReadIndex));
    }

    public void realmSet$notRead(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.notReadIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.notReadIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.notReadIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.notReadIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("lastMessage", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("notRead", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketChatDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketChatDataColumnInfo(osSchemaInfo);
    }

    public static TicketChatData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketChatData ticketChatData = (TicketChatData) realm.createObjectInternal(TicketChatData.class, true, Collections.emptyList());
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData;
        if (jSONObject.has("id")) {
            if (!jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$id(jSONObject.getInt("id"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
        }
        if (jSONObject.has("lastMessage")) {
            if (jSONObject.isNull("lastMessage")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$lastMessage((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$lastMessage(jSONObject.getString("lastMessage"));
            }
        }
        if (jSONObject.has("notRead")) {
            if (jSONObject.isNull("notRead")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$notRead((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$notRead(Integer.valueOf(jSONObject.getInt("notRead")));
            }
        }
        return ticketChatData;
    }

    public static TicketChatData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketChatData ticketChatData = new TicketChatData();
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$id(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("lastMessage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$lastMessage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$lastMessage((String) null);
                }
            } else if (!nextName.equals("notRead")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$notRead(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$notRead((Integer) null);
            }
        }
        jsonReader.endObject();
        return (TicketChatData) realm.copyToRealm(ticketChatData, new ImportFlag[0]);
    }

    private static C4716x3c51d27a newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class), false, Collections.emptyList());
        C4716x3c51d27a ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxy = new C4716x3c51d27a();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxy;
    }

    public static TicketChatData copyOrUpdate(Realm realm, TicketChatDataColumnInfo ticketChatDataColumnInfo, TicketChatData ticketChatData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketChatData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketChatData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketChatData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketChatData);
        if (realmObjectProxy2 != null) {
            return (TicketChatData) realmObjectProxy2;
        }
        return copy(realm, ticketChatDataColumnInfo, ticketChatData, z, map, set);
    }

    public static TicketChatData copy(Realm realm, TicketChatDataColumnInfo ticketChatDataColumnInfo, TicketChatData ticketChatData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketChatData);
        if (realmObjectProxy != null) {
            return (TicketChatData) realmObjectProxy;
        }
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketChatData.class), ticketChatDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketChatDataColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(ticketChatDataColumnInfo.lastMessageIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$lastMessage());
        osObjectBuilder.addInteger(ticketChatDataColumnInfo.notReadIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$notRead());
        C4716x3c51d27a newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketChatData, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketChatData ticketChatData, Map<RealmModel, Long> map) {
        TicketChatData ticketChatData2 = ticketChatData;
        if (ticketChatData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketChatData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketChatData.class);
        long nativePtr = table.getNativePtr();
        TicketChatDataColumnInfo ticketChatDataColumnInfo = (TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketChatData2, Long.valueOf(createRow));
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData2;
        Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$id(), false);
        String realmGet$lastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(nativePtr, ticketChatDataColumnInfo.lastMessageIndex, createRow, realmGet$lastMessage, false);
        }
        Integer realmGet$notRead = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$notRead();
        if (realmGet$notRead != null) {
            Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.notReadIndex, createRow, realmGet$notRead.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketChatData.class);
        long nativePtr = table.getNativePtr();
        TicketChatDataColumnInfo ticketChatDataColumnInfo = (TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class);
        while (it.hasNext()) {
            TicketChatData ticketChatData = (TicketChatData) it.next();
            if (!map2.containsKey(ticketChatData)) {
                if (ticketChatData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketChatData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketChatData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketChatData, Long.valueOf(createRow));
                C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData;
                Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$id(), false);
                String realmGet$lastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$lastMessage();
                if (realmGet$lastMessage != null) {
                    Table.nativeSetString(nativePtr, ticketChatDataColumnInfo.lastMessageIndex, createRow, realmGet$lastMessage, false);
                }
                Integer realmGet$notRead = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$notRead();
                if (realmGet$notRead != null) {
                    Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.notReadIndex, createRow, realmGet$notRead.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketChatData ticketChatData, Map<RealmModel, Long> map) {
        TicketChatData ticketChatData2 = ticketChatData;
        if (ticketChatData2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketChatData2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketChatData.class);
        long nativePtr = table.getNativePtr();
        TicketChatDataColumnInfo ticketChatDataColumnInfo = (TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketChatData2, Long.valueOf(createRow));
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData2;
        Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$id(), false);
        String realmGet$lastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(nativePtr, ticketChatDataColumnInfo.lastMessageIndex, createRow, realmGet$lastMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketChatDataColumnInfo.lastMessageIndex, createRow, false);
        }
        Integer realmGet$notRead = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$notRead();
        if (realmGet$notRead != null) {
            Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.notReadIndex, createRow, realmGet$notRead.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketChatDataColumnInfo.notReadIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketChatData.class);
        long nativePtr = table.getNativePtr();
        TicketChatDataColumnInfo ticketChatDataColumnInfo = (TicketChatDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketChatData.class);
        while (it.hasNext()) {
            TicketChatData ticketChatData = (TicketChatData) it.next();
            if (!map2.containsKey(ticketChatData)) {
                if (ticketChatData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketChatData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketChatData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketChatData, Long.valueOf(createRow));
                C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData;
                Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$id(), false);
                String realmGet$lastMessage = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$lastMessage();
                if (realmGet$lastMessage != null) {
                    Table.nativeSetString(nativePtr, ticketChatDataColumnInfo.lastMessageIndex, createRow, realmGet$lastMessage, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketChatDataColumnInfo.lastMessageIndex, createRow, false);
                }
                Integer realmGet$notRead = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmGet$notRead();
                if (realmGet$notRead != null) {
                    Table.nativeSetLong(nativePtr, ticketChatDataColumnInfo.notReadIndex, createRow, realmGet$notRead.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketChatDataColumnInfo.notReadIndex, createRow, false);
                }
            }
        }
    }

    public static TicketChatData createDetachedCopy(TicketChatData ticketChatData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketChatData ticketChatData2;
        if (i > i2 || ticketChatData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketChatData);
        if (cacheData == null) {
            ticketChatData2 = new TicketChatData();
            map.put(ticketChatData, new RealmObjectProxy.CacheData(i, ticketChatData2));
        } else if (i >= cacheData.minDepth) {
            return (TicketChatData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketChatData2 = (TicketChatData) cacheData.object;
        }
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface = ticketChatData2;
        C4717x4e01e3df ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface2 = ticketChatData;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$lastMessage(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface2.realmGet$lastMessage());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface.realmSet$notRead(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxyinterface2.realmGet$notRead());
        return ticketChatData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketChatData = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{lastMessage:");
        Object obj = "null";
        sb.append(realmGet$lastMessage() != null ? realmGet$lastMessage() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{notRead:");
        Object obj2 = obj;
        if (realmGet$notRead() != null) {
            obj2 = realmGet$notRead();
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
        C4716x3c51d27a ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxy = (C4716x3c51d27a) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketchatdatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
