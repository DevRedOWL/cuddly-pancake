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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketPerformer;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketPerformerRealmProxy */
public class C4722x782e3a14 extends TicketPerformer implements RealmObjectProxy, C4723x2a576985 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketPerformerColumnInfo columnInfo;
    private ProxyState<TicketPerformer> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketPerformerRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketPerformer";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketPerformerRealmProxy$TicketPerformerColumnInfo */
    static final class TicketPerformerColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;

        TicketPerformerColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketPerformerColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketPerformerColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketPerformerColumnInfo ticketPerformerColumnInfo = (TicketPerformerColumnInfo) columnInfo;
            TicketPerformerColumnInfo ticketPerformerColumnInfo2 = (TicketPerformerColumnInfo) columnInfo2;
            ticketPerformerColumnInfo2.titleIndex = ticketPerformerColumnInfo.titleIndex;
            ticketPerformerColumnInfo2.maxColumnIndexValue = ticketPerformerColumnInfo.maxColumnIndexValue;
        }
    }

    C4722x782e3a14() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketPerformerColumnInfo) realmObjectContext.getColumnInfo();
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

    public static TicketPerformerColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketPerformerColumnInfo(osSchemaInfo);
    }

    public static TicketPerformer createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketPerformer ticketPerformer = (TicketPerformer) realm.createObjectInternal(TicketPerformer.class, true, Collections.emptyList());
        C4723x2a576985 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxyinterface = ticketPerformer;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return ticketPerformer;
    }

    public static TicketPerformer createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketPerformer ticketPerformer = new TicketPerformer();
        C4723x2a576985 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxyinterface = ticketPerformer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketPerformer) realm.copyToRealm(ticketPerformer, new ImportFlag[0]);
    }

    private static C4722x782e3a14 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class), false, Collections.emptyList());
        C4722x782e3a14 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxy = new C4722x782e3a14();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxy;
    }

    public static TicketPerformer copyOrUpdate(Realm realm, TicketPerformerColumnInfo ticketPerformerColumnInfo, TicketPerformer ticketPerformer, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketPerformer instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPerformer;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketPerformer;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketPerformer);
        if (realmObjectProxy2 != null) {
            return (TicketPerformer) realmObjectProxy2;
        }
        return copy(realm, ticketPerformerColumnInfo, ticketPerformer, z, map, set);
    }

    public static TicketPerformer copy(Realm realm, TicketPerformerColumnInfo ticketPerformerColumnInfo, TicketPerformer ticketPerformer, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketPerformer);
        if (realmObjectProxy != null) {
            return (TicketPerformer) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketPerformer.class), ticketPerformerColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketPerformerColumnInfo.titleIndex, ticketPerformer.realmGet$title());
        C4722x782e3a14 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketPerformer, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketPerformer ticketPerformer, Map<RealmModel, Long> map) {
        if (ticketPerformer instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPerformer;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketPerformer.class);
        long nativePtr = table.getNativePtr();
        TicketPerformerColumnInfo ticketPerformerColumnInfo = (TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketPerformer, Long.valueOf(createRow));
        String realmGet$title = ticketPerformer.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketPerformerColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketPerformer.class);
        long nativePtr = table.getNativePtr();
        TicketPerformerColumnInfo ticketPerformerColumnInfo = (TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class);
        while (it.hasNext()) {
            TicketPerformer ticketPerformer = (TicketPerformer) it.next();
            if (!map.containsKey(ticketPerformer)) {
                if (ticketPerformer instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPerformer;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketPerformer, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketPerformer, Long.valueOf(createRow));
                String realmGet$title = ticketPerformer.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketPerformerColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketPerformer ticketPerformer, Map<RealmModel, Long> map) {
        if (ticketPerformer instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPerformer;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketPerformer.class);
        long nativePtr = table.getNativePtr();
        TicketPerformerColumnInfo ticketPerformerColumnInfo = (TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketPerformer, Long.valueOf(createRow));
        String realmGet$title = ticketPerformer.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketPerformerColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketPerformerColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketPerformer.class);
        long nativePtr = table.getNativePtr();
        TicketPerformerColumnInfo ticketPerformerColumnInfo = (TicketPerformerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketPerformer.class);
        while (it.hasNext()) {
            TicketPerformer ticketPerformer = (TicketPerformer) it.next();
            if (!map.containsKey(ticketPerformer)) {
                if (ticketPerformer instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketPerformer;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketPerformer, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketPerformer, Long.valueOf(createRow));
                String realmGet$title = ticketPerformer.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketPerformerColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketPerformerColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static TicketPerformer createDetachedCopy(TicketPerformer ticketPerformer, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketPerformer ticketPerformer2;
        if (i > i2 || ticketPerformer == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketPerformer);
        if (cacheData == null) {
            ticketPerformer2 = new TicketPerformer();
            map.put(ticketPerformer, new RealmObjectProxy.CacheData(i, ticketPerformer2));
        } else if (i >= cacheData.minDepth) {
            return (TicketPerformer) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketPerformer2 = (TicketPerformer) cacheData.object;
        }
        ticketPerformer2.realmSet$title(ticketPerformer.realmGet$title());
        return ticketPerformer2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketPerformer = proxy[");
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
        C4722x782e3a14 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxy = (C4722x782e3a14) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketperformerrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
