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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.TicketApplicant;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApplicantRealmProxy */
public class C4714x6f4f4848 extends TicketApplicant implements RealmObjectProxy, C4715x4b7115d1 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private TicketApplicantColumnInfo columnInfo;
    private ProxyState<TicketApplicant> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApplicantRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TicketApplicant";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_TicketApplicantRealmProxy$TicketApplicantColumnInfo */
    static final class TicketApplicantColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long titleIndex;

        TicketApplicantColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TicketApplicantColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new TicketApplicantColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            TicketApplicantColumnInfo ticketApplicantColumnInfo = (TicketApplicantColumnInfo) columnInfo;
            TicketApplicantColumnInfo ticketApplicantColumnInfo2 = (TicketApplicantColumnInfo) columnInfo2;
            ticketApplicantColumnInfo2.titleIndex = ticketApplicantColumnInfo.titleIndex;
            ticketApplicantColumnInfo2.maxColumnIndexValue = ticketApplicantColumnInfo.maxColumnIndexValue;
        }
    }

    C4714x6f4f4848() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (TicketApplicantColumnInfo) realmObjectContext.getColumnInfo();
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

    public static TicketApplicantColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new TicketApplicantColumnInfo(osSchemaInfo);
    }

    public static TicketApplicant createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        TicketApplicant ticketApplicant = (TicketApplicant) realm.createObjectInternal(TicketApplicant.class, true, Collections.emptyList());
        C4715x4b7115d1 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxyinterface = ticketApplicant;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return ticketApplicant;
    }

    public static TicketApplicant createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        TicketApplicant ticketApplicant = new TicketApplicant();
        C4715x4b7115d1 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxyinterface = ticketApplicant;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (TicketApplicant) realm.copyToRealm(ticketApplicant, new ImportFlag[0]);
    }

    private static C4714x6f4f4848 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class), false, Collections.emptyList());
        C4714x6f4f4848 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxy = new C4714x6f4f4848();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxy;
    }

    public static TicketApplicant copyOrUpdate(Realm realm, TicketApplicantColumnInfo ticketApplicantColumnInfo, TicketApplicant ticketApplicant, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (ticketApplicant instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApplicant;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return ticketApplicant;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(ticketApplicant);
        if (realmObjectProxy2 != null) {
            return (TicketApplicant) realmObjectProxy2;
        }
        return copy(realm, ticketApplicantColumnInfo, ticketApplicant, z, map, set);
    }

    public static TicketApplicant copy(Realm realm, TicketApplicantColumnInfo ticketApplicantColumnInfo, TicketApplicant ticketApplicant, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(ticketApplicant);
        if (realmObjectProxy != null) {
            return (TicketApplicant) realmObjectProxy;
        }
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(TicketApplicant.class), ticketApplicantColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(ticketApplicantColumnInfo.titleIndex, ticketApplicant.realmGet$title());
        C4714x6f4f4848 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(ticketApplicant, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, TicketApplicant ticketApplicant, Map<RealmModel, Long> map) {
        if (ticketApplicant instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApplicant;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketApplicant.class);
        long nativePtr = table.getNativePtr();
        TicketApplicantColumnInfo ticketApplicantColumnInfo = (TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketApplicant, Long.valueOf(createRow));
        String realmGet$title = ticketApplicant.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketApplicantColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketApplicant.class);
        long nativePtr = table.getNativePtr();
        TicketApplicantColumnInfo ticketApplicantColumnInfo = (TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class);
        while (it.hasNext()) {
            TicketApplicant ticketApplicant = (TicketApplicant) it.next();
            if (!map.containsKey(ticketApplicant)) {
                if (ticketApplicant instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApplicant;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketApplicant, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketApplicant, Long.valueOf(createRow));
                String realmGet$title = ticketApplicant.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketApplicantColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, TicketApplicant ticketApplicant, Map<RealmModel, Long> map) {
        if (ticketApplicant instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApplicant;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(TicketApplicant.class);
        long nativePtr = table.getNativePtr();
        TicketApplicantColumnInfo ticketApplicantColumnInfo = (TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class);
        long createRow = OsObject.createRow(table);
        map.put(ticketApplicant, Long.valueOf(createRow));
        String realmGet$title = ticketApplicant.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, ticketApplicantColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, ticketApplicantColumnInfo.titleIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(TicketApplicant.class);
        long nativePtr = table.getNativePtr();
        TicketApplicantColumnInfo ticketApplicantColumnInfo = (TicketApplicantColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) TicketApplicant.class);
        while (it.hasNext()) {
            TicketApplicant ticketApplicant = (TicketApplicant) it.next();
            if (!map.containsKey(ticketApplicant)) {
                if (ticketApplicant instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) ticketApplicant;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(ticketApplicant, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(ticketApplicant, Long.valueOf(createRow));
                String realmGet$title = ticketApplicant.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, ticketApplicantColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, ticketApplicantColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static TicketApplicant createDetachedCopy(TicketApplicant ticketApplicant, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        TicketApplicant ticketApplicant2;
        if (i > i2 || ticketApplicant == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(ticketApplicant);
        if (cacheData == null) {
            ticketApplicant2 = new TicketApplicant();
            map.put(ticketApplicant, new RealmObjectProxy.CacheData(i, ticketApplicant2));
        } else if (i >= cacheData.minDepth) {
            return (TicketApplicant) cacheData.object;
        } else {
            cacheData.minDepth = i;
            ticketApplicant2 = (TicketApplicant) cacheData.object;
        }
        ticketApplicant2.realmSet$title(ticketApplicant.realmGet$title());
        return ticketApplicant2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("TicketApplicant = proxy[");
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
        C4714x6f4f4848 ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxy = (C4714x6f4f4848) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_helpdesk_ticketapplicantrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
