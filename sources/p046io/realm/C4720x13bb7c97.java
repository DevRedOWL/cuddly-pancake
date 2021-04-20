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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketObject;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketObjectRealmProxy */
public class C4720x13bb7c97 extends TicketObject implements RealmObjectProxy, C4721x2e294a62 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketObjectColumnInfo columnInfo;
    private ProxyState<TicketObject> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketObjectRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketObject";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketObjectRealmProxy$TicketObjectColumnInfo */
    static final class TicketObjectColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long typeIndex;

        TicketObjectColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketObjectColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketObjectColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketObjectColumnInfo ticketObjectColumnInfo = (TicketObjectColumnInfo) columnInfo;
            TicketObjectColumnInfo ticketObjectColumnInfo2 = (TicketObjectColumnInfo) columnInfo2;
            ticketObjectColumnInfo2.idIndex = ticketObjectColumnInfo.idIndex;
            ticketObjectColumnInfo2.typeIndex = ticketObjectColumnInfo.typeIndex;
            ticketObjectColumnInfo2.maxColumnIndexValue = ticketObjectColumnInfo.maxColumnIndexValue;
        }
    }

    C4720x13bb7c97() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketObjectColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.typeIndex);
    }

    public void realmSet$type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.typeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.typeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.typeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.typeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketObjectColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketObjectColumnInfo(osSchemaInfo);
    }

    public static TicketObject createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketObject ticketObject = (TicketObject) realm.createObjectInternal(TicketObject.class, true, Collections.emptyList());
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject;
        if (jSONObject.has("id")) {
            if (!jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$id(jSONObject.getInt("id"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            }
        }
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        return ticketObject;
    }

    public static TicketObject createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketObject ticketObject = new TicketObject();
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$id(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (!nextName.equals("type")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$type(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$type((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketObject) realm.copyToRealm(ticketObject, new ImportFlag[0]);
    }

    private static C4720x13bb7c97 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class), false, Collections.emptyList());
        C4720x13bb7c97 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxy = new C4720x13bb7c97();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxy;
    }

    public static TicketObject copyOrUpdate(Realm realm, TicketObjectColumnInfo ticketObjectColumnInfo, TicketObject ticketObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketObject instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketObject;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketObject;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketObject);
        if (realmObjectProxy2 != null) {
            return (TicketObject) realmObjectProxy2;
        }
        return copy(realm, ticketObjectColumnInfo, ticketObject, z, map, set);
    }

    public static TicketObject copy(Realm realm, TicketObjectColumnInfo ticketObjectColumnInfo, TicketObject ticketObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketObject);
        if (realmObjectProxy != null) {
            return (TicketObject) realmObjectProxy;
        }
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketObject.class), ticketObjectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketObjectColumnInfo.idIndex, Integer.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(ticketObjectColumnInfo.typeIndex, ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$type());
        C4720x13bb7c97 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketObject, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketObject ticketObject, Map<RealmModel, Long> map) {
        TicketObject ticketObject2 = ticketObject;
        if (ticketObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketObject.class);
        long nativePtr = table.getNativePtr();
        TicketObjectColumnInfo ticketObjectColumnInfo = (TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketObject2, Long.valueOf(createRow));
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject2;
        Table.nativeSetLong(nativePtr, ticketObjectColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$id(), false);
        String realmGet$type = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, ticketObjectColumnInfo.typeIndex, createRow, realmGet$type, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketObject.class);
        long nativePtr = table.getNativePtr();
        TicketObjectColumnInfo ticketObjectColumnInfo = (TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class);
        while (it.hasNext()) {
            TicketObject ticketObject = (TicketObject) it.next();
            if (!map2.containsKey(ticketObject)) {
                if (ticketObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketObject, Long.valueOf(createRow));
                C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject;
                Table.nativeSetLong(nativePtr, ticketObjectColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$id(), false);
                String realmGet$type = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, ticketObjectColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketObject ticketObject, Map<RealmModel, Long> map) {
        TicketObject ticketObject2 = ticketObject;
        if (ticketObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketObject.class);
        long nativePtr = table.getNativePtr();
        TicketObjectColumnInfo ticketObjectColumnInfo = (TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketObject2, Long.valueOf(createRow));
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject2;
        Table.nativeSetLong(nativePtr, ticketObjectColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$id(), false);
        String realmGet$type = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, ticketObjectColumnInfo.typeIndex, createRow, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketObjectColumnInfo.typeIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketObject.class);
        long nativePtr = table.getNativePtr();
        TicketObjectColumnInfo ticketObjectColumnInfo = (TicketObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketObject.class);
        while (it.hasNext()) {
            TicketObject ticketObject = (TicketObject) it.next();
            if (!map2.containsKey(ticketObject)) {
                if (ticketObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketObject, Long.valueOf(createRow));
                C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject;
                Table.nativeSetLong(nativePtr, ticketObjectColumnInfo.idIndex, createRow, (long) ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$id(), false);
                String realmGet$type = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, ticketObjectColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketObjectColumnInfo.typeIndex, createRow, false);
                }
            }
        }
    }

    public static TicketObject createDetachedCopy(TicketObject ticketObject, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketObject ticketObject2;
        if (i > i2 || ticketObject == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketObject);
        if (cacheData == null) {
            ticketObject2 = new TicketObject();
            map.put(ticketObject, new RealmObjectProxy.CacheData(i, ticketObject2));
        } else if (i >= cacheData.minDepth) {
            return (TicketObject) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketObject2 = (TicketObject) cacheData.object;
        }
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface = ticketObject2;
        C4721x2e294a62 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface2 = ticketObject;
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface.realmSet$type(ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxyinterface2.realmGet$type());
        return ticketObject2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketObject = proxy[");
        sb.append("{id:");
        sb.append(realmGet$id());
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : "null");
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
        C4720x13bb7c97 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxy = (C4720x13bb7c97) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketobjectrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
