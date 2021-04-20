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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.ticket.TicketDescription;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDescriptionRealmProxy */
public class C4804xd885bb4 extends TicketDescription implements RealmObjectProxy, C4805x1fb91be5 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketDescriptionColumnInfo columnInfo;
    private ProxyState<TicketDescription> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDescriptionRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketDescription";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_ticket_TicketDescriptionRealmProxy$TicketDescriptionColumnInfo */
    static final class TicketDescriptionColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long sumIndex;
        long titleIndex;

        TicketDescriptionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.sumIndex = addColumnDetails("sum", "sum", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketDescriptionColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketDescriptionColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketDescriptionColumnInfo ticketDescriptionColumnInfo = (TicketDescriptionColumnInfo) columnInfo;
            TicketDescriptionColumnInfo ticketDescriptionColumnInfo2 = (TicketDescriptionColumnInfo) columnInfo2;
            ticketDescriptionColumnInfo2.titleIndex = ticketDescriptionColumnInfo.titleIndex;
            ticketDescriptionColumnInfo2.sumIndex = ticketDescriptionColumnInfo.sumIndex;
            ticketDescriptionColumnInfo2.maxColumnIndexValue = ticketDescriptionColumnInfo.maxColumnIndexValue;
        }
    }

    C4804xd885bb4() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketDescriptionColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$sum() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sumIndex);
    }

    public void realmSet$sum(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sumIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sumIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sumIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sumIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("sum", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketDescriptionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketDescriptionColumnInfo(osSchemaInfo);
    }

    public static TicketDescription createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketDescription ticketDescription = (TicketDescription) realm.createObjectInternal(TicketDescription.class, true, Collections.emptyList());
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("sum")) {
            if (jSONObject.isNull("sum")) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$sum((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$sum(jSONObject.getString("sum"));
            }
        }
        return ticketDescription;
    }

    public static TicketDescription createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketDescription ticketDescription = new TicketDescription();
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("sum")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$sum(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$sum((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketDescription) realm.copyToRealm(ticketDescription, new ImportFlag[0]);
    }

    private static C4804xd885bb4 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class), false, Collections.emptyList());
        C4804xd885bb4 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxy = new C4804xd885bb4();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxy;
    }

    public static TicketDescription copyOrUpdate(Realm realm, TicketDescriptionColumnInfo ticketDescriptionColumnInfo, TicketDescription ticketDescription, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketDescription instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDescription;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketDescription;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketDescription);
        if (realmObjectProxy2 != null) {
            return (TicketDescription) realmObjectProxy2;
        }
        return copy(realm, ticketDescriptionColumnInfo, ticketDescription, z, map, set);
    }

    public static TicketDescription copy(Realm realm, TicketDescriptionColumnInfo ticketDescriptionColumnInfo, TicketDescription ticketDescription, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketDescription);
        if (realmObjectProxy != null) {
            return (TicketDescription) realmObjectProxy;
        }
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketDescription.class), ticketDescriptionColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketDescriptionColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(ticketDescriptionColumnInfo.sumIndex, ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$sum());
        C4804xd885bb4 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketDescription, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketDescription ticketDescription, Map<RealmModel, Long> map) {
        if (ticketDescription instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDescription;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketDescription.class);
        long nativePtr = table.getNativePtr();
        TicketDescriptionColumnInfo ticketDescriptionColumnInfo = (TicketDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketDescription, Long.valueOf(createRow));
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$sum();
        if (realmGet$sum != null) {
            Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.sumIndex, createRow, realmGet$sum, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketDescription.class);
        long nativePtr = table.getNativePtr();
        TicketDescriptionColumnInfo ticketDescriptionColumnInfo = (TicketDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class);
        while (it.hasNext()) {
            TicketDescription ticketDescription = (TicketDescription) it.next();
            if (!map2.containsKey(ticketDescription)) {
                if (ticketDescription instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDescription;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketDescription, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketDescription, Long.valueOf(createRow));
                C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$sum();
                if (realmGet$sum != null) {
                    Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.sumIndex, createRow, realmGet$sum, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketDescription ticketDescription, Map<RealmModel, Long> map) {
        if (ticketDescription instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDescription;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketDescription.class);
        long nativePtr = table.getNativePtr();
        TicketDescriptionColumnInfo ticketDescriptionColumnInfo = (TicketDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketDescription, Long.valueOf(createRow));
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDescriptionColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$sum();
        if (realmGet$sum != null) {
            Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.sumIndex, createRow, realmGet$sum, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketDescriptionColumnInfo.sumIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketDescription.class);
        long nativePtr = table.getNativePtr();
        TicketDescriptionColumnInfo ticketDescriptionColumnInfo = (TicketDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketDescription.class);
        while (it.hasNext()) {
            TicketDescription ticketDescription = (TicketDescription) it.next();
            if (!map2.containsKey(ticketDescription)) {
                if (ticketDescription instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketDescription;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketDescription, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketDescription, Long.valueOf(createRow));
                C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription;
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDescriptionColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$sum = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmGet$sum();
                if (realmGet$sum != null) {
                    Table.nativeSetString(nativePtr, ticketDescriptionColumnInfo.sumIndex, createRow, realmGet$sum, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketDescriptionColumnInfo.sumIndex, createRow, false);
                }
            }
        }
    }

    public static TicketDescription createDetachedCopy(TicketDescription ticketDescription, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketDescription ticketDescription2;
        if (i > i2 || ticketDescription == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketDescription);
        if (cacheData == null) {
            ticketDescription2 = new TicketDescription();
            map.put(ticketDescription, new RealmObjectProxy.CacheData(i, ticketDescription2));
        } else if (i >= cacheData.minDepth) {
            return (TicketDescription) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketDescription2 = (TicketDescription) cacheData.object;
        }
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface = ticketDescription2;
        C4805x1fb91be5 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface2 = ticketDescription;
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface.realmSet$sum(ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxyinterface2.realmGet$sum());
        return ticketDescription2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketDescription = proxy[");
        sb.append("{title:");
        String str = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{sum:");
        if (realmGet$sum() != null) {
            str = realmGet$sum();
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
        C4804xd885bb4 ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxy = (C4804xd885bb4) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_ticket_ticketdescriptionrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
