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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.rentaticketlist.TicketPropertyObject;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_TicketPropertyObjectRealmProxy */
public class C4796x4009dee4 extends TicketPropertyObject implements RealmObjectProxy, C4797x91002eb5 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketPropertyObjectColumnInfo columnInfo;
    private ProxyState<TicketPropertyObject> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_TicketPropertyObjectRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketPropertyObject";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_TicketPropertyObjectRealmProxy$TicketPropertyObjectColumnInfo */
    static final class TicketPropertyObjectColumnInfo extends ColumnInfo {
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        TicketPropertyObjectColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketPropertyObjectColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketPropertyObjectColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo = (TicketPropertyObjectColumnInfo) columnInfo;
            TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo2 = (TicketPropertyObjectColumnInfo) columnInfo2;
            ticketPropertyObjectColumnInfo2.idIndex = ticketPropertyObjectColumnInfo.idIndex;
            ticketPropertyObjectColumnInfo2.titleIndex = ticketPropertyObjectColumnInfo.titleIndex;
            ticketPropertyObjectColumnInfo2.maxColumnIndexValue = ticketPropertyObjectColumnInfo.maxColumnIndexValue;
        }
    }

    C4796x4009dee4() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketPropertyObjectColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TicketPropertyObjectColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketPropertyObjectColumnInfo(osSchemaInfo);
    }

    public static TicketPropertyObject createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketPropertyObject ticketPropertyObject = (TicketPropertyObject) realm.createObjectInternal(TicketPropertyObject.class, true, Collections.emptyList());
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$id((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$id(Integer.valueOf(jSONObject.getInt("id")));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return ticketPropertyObject;
    }

    public static TicketPropertyObject createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketPropertyObject ticketPropertyObject = new TicketPropertyObject();
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketPropertyObject) realm.copyToRealm(ticketPropertyObject, new ImportFlag[0]);
    }

    private static C4796x4009dee4 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPropertyObject.class), false, Collections.emptyList());
        C4796x4009dee4 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxy = new C4796x4009dee4();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxy;
    }

    public static TicketPropertyObject copyOrUpdate(Realm realm, TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo, TicketPropertyObject ticketPropertyObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketPropertyObject instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPropertyObject;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketPropertyObject;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketPropertyObject);
        if (realmObjectProxy2 != null) {
            return (TicketPropertyObject) realmObjectProxy2;
        }
        return copy(realm, ticketPropertyObjectColumnInfo, ticketPropertyObject, z, map, set);
    }

    public static TicketPropertyObject copy(Realm realm, TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo, TicketPropertyObject ticketPropertyObject, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketPropertyObject);
        if (realmObjectProxy != null) {
            return (TicketPropertyObject) realmObjectProxy;
        }
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketPropertyObject.class), ticketPropertyObjectColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(ticketPropertyObjectColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(ticketPropertyObjectColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$title());
        C4796x4009dee4 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketPropertyObject, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketPropertyObject ticketPropertyObject, Map<RealmModel, Long> map) {
        TicketPropertyObject ticketPropertyObject2 = ticketPropertyObject;
        if (ticketPropertyObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPropertyObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketPropertyObject.class);
        long nativePtr = table.getNativePtr();
        TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo = (TicketPropertyObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPropertyObject.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketPropertyObject2, Long.valueOf(createRow));
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, ticketPropertyObjectColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketPropertyObjectColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketPropertyObject.class);
        long nativePtr = table.getNativePtr();
        TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo = (TicketPropertyObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPropertyObject.class);
        while (it.hasNext()) {
            TicketPropertyObject ticketPropertyObject = (TicketPropertyObject) it.next();
            if (!map2.containsKey(ticketPropertyObject)) {
                if (ticketPropertyObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPropertyObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketPropertyObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketPropertyObject, Long.valueOf(createRow));
                C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, ticketPropertyObjectColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketPropertyObjectColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketPropertyObject ticketPropertyObject, Map<RealmModel, Long> map) {
        TicketPropertyObject ticketPropertyObject2 = ticketPropertyObject;
        if (ticketPropertyObject2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPropertyObject2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketPropertyObject.class);
        long nativePtr = table.getNativePtr();
        TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo = (TicketPropertyObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPropertyObject.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketPropertyObject2, Long.valueOf(createRow));
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, ticketPropertyObjectColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, ticketPropertyObjectColumnInfo.idIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketPropertyObjectColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketPropertyObjectColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(TicketPropertyObject.class);
        long nativePtr = table.getNativePtr();
        TicketPropertyObjectColumnInfo ticketPropertyObjectColumnInfo = (TicketPropertyObjectColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPropertyObject.class);
        while (it.hasNext()) {
            TicketPropertyObject ticketPropertyObject = (TicketPropertyObject) it.next();
            if (!map2.containsKey(ticketPropertyObject)) {
                if (ticketPropertyObject instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPropertyObject;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(ticketPropertyObject, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(ticketPropertyObject, Long.valueOf(createRow));
                C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, ticketPropertyObjectColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketPropertyObjectColumnInfo.idIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketPropertyObjectColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketPropertyObjectColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static TicketPropertyObject createDetachedCopy(TicketPropertyObject ticketPropertyObject, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketPropertyObject ticketPropertyObject2;
        if (i > i2 || ticketPropertyObject == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketPropertyObject);
        if (cacheData == null) {
            ticketPropertyObject2 = new TicketPropertyObject();
            map.put(ticketPropertyObject, new RealmObjectProxy.CacheData(i, ticketPropertyObject2));
        } else if (i >= cacheData.minDepth) {
            return (TicketPropertyObject) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketPropertyObject2 = (TicketPropertyObject) cacheData.object;
        }
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface = ticketPropertyObject2;
        C4797x91002eb5 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface2 = ticketPropertyObject;
        ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxyinterface2.realmGet$title());
        return ticketPropertyObject2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketPropertyObject = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        if (realmGet$title() != null) {
            str = realmGet$title();
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
        C4796x4009dee4 ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxy = (C4796x4009dee4) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_rentaticketlist_ticketpropertyobjectrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
