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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApartment;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApartmentRealmProxy */
public class C4712x67ea0478 extends TicketApartment implements RealmObjectProxy, C4713x1cef0fa1 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketApartmentColumnInfo columnInfo;
    private ProxyState<TicketApartment> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApartmentRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketApartment";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApartmentRealmProxy$TicketApartmentColumnInfo */
    static final class TicketApartmentColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;

        TicketApartmentColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketApartmentColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketApartmentColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketApartmentColumnInfo ticketApartmentColumnInfo = (TicketApartmentColumnInfo) columnInfo;
            TicketApartmentColumnInfo ticketApartmentColumnInfo2 = (TicketApartmentColumnInfo) columnInfo2;
            ticketApartmentColumnInfo2.titleIndex = ticketApartmentColumnInfo.titleIndex;
            ticketApartmentColumnInfo2.maxColumnIndexValue = ticketApartmentColumnInfo.maxColumnIndexValue;
        }
    }

    C4712x67ea0478() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketApartmentColumnInfo) realmObjectContext.getColumnInfo();
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

    public static TicketApartmentColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketApartmentColumnInfo(osSchemaInfo);
    }

    public static TicketApartment createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketApartment ticketApartment = (TicketApartment) realm.createObjectInternal(TicketApartment.class, true, Collections.emptyList());
        C4713x1cef0fa1 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxyinterface = ticketApartment;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return ticketApartment;
    }

    public static TicketApartment createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketApartment ticketApartment = new TicketApartment();
        C4713x1cef0fa1 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxyinterface = ticketApartment;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketApartment) realm.copyToRealm(ticketApartment, new ImportFlag[0]);
    }

    private static C4712x67ea0478 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class), false, Collections.emptyList());
        C4712x67ea0478 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxy = new C4712x67ea0478();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxy;
    }

    public static TicketApartment copyOrUpdate(Realm realm, TicketApartmentColumnInfo ticketApartmentColumnInfo, TicketApartment ticketApartment, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketApartment instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApartment;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketApartment;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketApartment);
        if (realmObjectProxy2 != null) {
            return (TicketApartment) realmObjectProxy2;
        }
        return copy(realm, ticketApartmentColumnInfo, ticketApartment, z, map, set);
    }

    public static TicketApartment copy(Realm realm, TicketApartmentColumnInfo ticketApartmentColumnInfo, TicketApartment ticketApartment, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketApartment);
        if (realmObjectProxy != null) {
            return (TicketApartment) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketApartment.class), ticketApartmentColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketApartmentColumnInfo.titleIndex, ticketApartment.realmGet$title());
        C4712x67ea0478 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketApartment, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketApartment ticketApartment, Map<RealmModel, Long> map) {
        if (ticketApartment instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApartment;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketApartment.class);
        long nativePtr = table.getNativePtr();
        TicketApartmentColumnInfo ticketApartmentColumnInfo = (TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketApartment, Long.valueOf(createRow));
        String realmGet$title = ticketApartment.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketApartmentColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketApartment.class);
        long nativePtr = table.getNativePtr();
        TicketApartmentColumnInfo ticketApartmentColumnInfo = (TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class);
        while (it.hasNext()) {
            TicketApartment ticketApartment = (TicketApartment) it.next();
            if (!map.containsKey(ticketApartment)) {
                if (ticketApartment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApartment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketApartment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketApartment, Long.valueOf(createRow));
                String realmGet$title = ticketApartment.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketApartmentColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketApartment ticketApartment, Map<RealmModel, Long> map) {
        if (ticketApartment instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApartment;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketApartment.class);
        long nativePtr = table.getNativePtr();
        TicketApartmentColumnInfo ticketApartmentColumnInfo = (TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketApartment, Long.valueOf(createRow));
        String realmGet$title = ticketApartment.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketApartmentColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketApartmentColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketApartment.class);
        long nativePtr = table.getNativePtr();
        TicketApartmentColumnInfo ticketApartmentColumnInfo = (TicketApartmentColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApartment.class);
        while (it.hasNext()) {
            TicketApartment ticketApartment = (TicketApartment) it.next();
            if (!map.containsKey(ticketApartment)) {
                if (ticketApartment instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApartment;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketApartment, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketApartment, Long.valueOf(createRow));
                String realmGet$title = ticketApartment.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketApartmentColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketApartmentColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static TicketApartment createDetachedCopy(TicketApartment ticketApartment, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketApartment ticketApartment2;
        if (i > i2 || ticketApartment == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketApartment);
        if (cacheData == null) {
            ticketApartment2 = new TicketApartment();
            map.put(ticketApartment, new RealmObjectProxy.CacheData(i, ticketApartment2));
        } else if (i >= cacheData.minDepth) {
            return (TicketApartment) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketApartment2 = (TicketApartment) cacheData.object;
        }
        ticketApartment2.realmSet$title(ticketApartment.realmGet$title());
        return ticketApartment2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketApartment = proxy[");
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
        C4712x67ea0478 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxy = (C4712x67ea0478) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapartmentrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
