package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.marketplace.Field;
import p035ru.unicorn.ujin.data.realm.marketplace.OrderAction;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsList;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy extends OrderAction implements RealmObjectProxy, C4614x1663cccd {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private OrderActionColumnInfo columnInfo;
    private RealmList<Field> fieldsRealmList;
    private ProxyState<OrderAction> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "OrderAction";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy$OrderActionColumnInfo */
    static final class OrderActionColumnInfo extends ColumnInfo {
        long extraIndex;
        long fieldsIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;
        long typeIndex;

        OrderActionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.extraIndex = addColumnDetails("extra", "extra", objectSchemaInfo);
            this.fieldsIndex = addColumnDetails("fields", "fields", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OrderActionColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new OrderActionColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            OrderActionColumnInfo orderActionColumnInfo = (OrderActionColumnInfo) columnInfo;
            OrderActionColumnInfo orderActionColumnInfo2 = (OrderActionColumnInfo) columnInfo2;
            orderActionColumnInfo2.idIndex = orderActionColumnInfo.idIndex;
            orderActionColumnInfo2.typeIndex = orderActionColumnInfo.typeIndex;
            orderActionColumnInfo2.extraIndex = orderActionColumnInfo.extraIndex;
            orderActionColumnInfo2.fieldsIndex = orderActionColumnInfo.fieldsIndex;
            orderActionColumnInfo2.titleIndex = orderActionColumnInfo.titleIndex;
            orderActionColumnInfo2.maxColumnIndexValue = orderActionColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (OrderActionColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$extra() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.extraIndex);
    }

    public void realmSet$extra(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.extraIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.extraIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.extraIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.extraIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<Field> realmGet$fields() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Field> realmList = this.fieldsRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.fieldsRealmList = new RealmList<>(Field.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.fieldsIndex), this.proxyState.getRealm$realm());
        return this.fieldsRealmList;
    }

    public void realmSet$fields(RealmList<Field> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("fields")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<Field> realmList2 = new RealmList<>();
                Iterator<Field> it = realmList.iterator();
                while (it.hasNext()) {
                    Field next = it.next();
                    if (next == null || RealmObject.isManaged(next)) {
                        realmList2.add(next);
                    } else {
                        realmList2.add(realm.copyToRealm(next, new ImportFlag[0]));
                    }
                }
                realmList = realmList2;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.fieldsIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    Field field = realmList.get(i);
                    this.proxyState.checkValidObject(field);
                    modelList.addRow(((RealmObjectProxy) field).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            Field field2 = realmList.get(i);
            this.proxyState.checkValidObject(field2);
            modelList.setRow((long) i, ((RealmObjectProxy) field2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
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
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("extra", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("fields", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OrderActionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new OrderActionColumnInfo(osSchemaInfo);
    }

    public static OrderAction createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("fields")) {
            arrayList.add("fields");
        }
        OrderAction orderAction = (OrderAction) realm.createObjectInternal(OrderAction.class, true, arrayList);
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$id((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$id(jSONObject.getString("id"));
            }
        }
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("extra")) {
            if (jSONObject.isNull("extra")) {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$extra((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$extra(jSONObject.getString("extra"));
            }
        }
        if (jSONObject.has("fields")) {
            if (jSONObject.isNull("fields")) {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$fields((RealmList<Field>) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields().add(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        return orderAction;
    }

    public static OrderAction createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        OrderAction orderAction = new OrderAction();
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$id((String) null);
                }
            } else if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("extra")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$extra(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$extra((String) null);
                }
            } else if (nextName.equals("fields")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$fields((RealmList<Field>) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$fields(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields().add(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("title")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$title((String) null);
            }
        }
        jsonReader.endObject();
        return (OrderAction) realm.copyToRealm(orderAction, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderAction.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxy;
    }

    public static OrderAction copyOrUpdate(Realm realm, OrderActionColumnInfo orderActionColumnInfo, OrderAction orderAction, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (orderAction instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderAction;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return orderAction;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(orderAction);
        if (realmObjectProxy2 != null) {
            return (OrderAction) realmObjectProxy2;
        }
        return copy(realm, orderActionColumnInfo, orderAction, z, map, set);
    }

    public static OrderAction copy(Realm realm, OrderActionColumnInfo orderActionColumnInfo, OrderAction orderAction, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(orderAction);
        if (realmObjectProxy != null) {
            return (OrderAction) realmObjectProxy;
        }
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(OrderAction.class), orderActionColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(orderActionColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(orderActionColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(orderActionColumnInfo.extraIndex, ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$extra());
        osObjectBuilder.addString(orderActionColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(orderAction, newProxyInstance);
        RealmList<Field> realmGet$fields = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields();
        if (realmGet$fields != null) {
            RealmList<Field> realmGet$fields2 = newProxyInstance.realmGet$fields();
            realmGet$fields2.clear();
            for (int i = 0; i < realmGet$fields.size(); i++) {
                Field field = realmGet$fields.get(i);
                Field field2 = (Field) map.get(field);
                if (field2 != null) {
                    realmGet$fields2.add(field2);
                } else {
                    realmGet$fields2.add(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.FieldColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Field.class), field, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, OrderAction orderAction, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        OrderAction orderAction2 = orderAction;
        Map<RealmModel, Long> map2 = map;
        if (orderAction2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderAction2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(OrderAction.class);
        long nativePtr = table.getNativePtr();
        OrderActionColumnInfo orderActionColumnInfo = (OrderActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderAction.class);
        long createRow = OsObject.createRow(table);
        map2.put(orderAction2, Long.valueOf(createRow));
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, orderActionColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            j = createRow;
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, orderActionColumnInfo.typeIndex, j, realmGet$type, false);
        }
        String realmGet$extra = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$extra();
        if (realmGet$extra != null) {
            Table.nativeSetString(nativePtr, orderActionColumnInfo.extraIndex, j, realmGet$extra, false);
        }
        RealmList<Field> realmGet$fields = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields();
        if (realmGet$fields != null) {
            j2 = j;
            OsList osList = new OsList(table.getUncheckedRow(j2), orderActionColumnInfo.fieldsIndex);
            Iterator<Field> it = realmGet$fields.iterator();
            while (it.hasNext()) {
                Field next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        } else {
            j2 = j;
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$title();
        if (realmGet$title == null) {
            return j2;
        }
        long j3 = j2;
        Table.nativeSetString(nativePtr, orderActionColumnInfo.titleIndex, j2, realmGet$title, false);
        return j3;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(OrderAction.class);
        long nativePtr = table.getNativePtr();
        OrderActionColumnInfo orderActionColumnInfo = (OrderActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderAction.class);
        while (it.hasNext()) {
            OrderAction orderAction = (OrderAction) it.next();
            if (!map2.containsKey(orderAction)) {
                if (orderAction instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderAction;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(orderAction, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(orderAction, Long.valueOf(createRow));
                C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.idIndex, createRow, realmGet$id, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                String realmGet$extra = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$extra();
                if (realmGet$extra != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.extraIndex, createRow, realmGet$extra, false);
                }
                RealmList<Field> realmGet$fields = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields();
                if (realmGet$fields != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), orderActionColumnInfo.fieldsIndex);
                    Iterator<Field> it2 = realmGet$fields.iterator();
                    while (it2.hasNext()) {
                        Field next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, OrderAction orderAction, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        OrderAction orderAction2 = orderAction;
        Map<RealmModel, Long> map2 = map;
        if (orderAction2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderAction2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(OrderAction.class);
        long nativePtr = table.getNativePtr();
        OrderActionColumnInfo orderActionColumnInfo = (OrderActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderAction.class);
        long createRow = OsObject.createRow(table);
        map2.put(orderAction2, Long.valueOf(createRow));
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, orderActionColumnInfo.idIndex, createRow, realmGet$id, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, orderActionColumnInfo.idIndex, j, false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, orderActionColumnInfo.typeIndex, j, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, orderActionColumnInfo.typeIndex, j, false);
        }
        String realmGet$extra = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$extra();
        if (realmGet$extra != null) {
            Table.nativeSetString(nativePtr, orderActionColumnInfo.extraIndex, j, realmGet$extra, false);
        } else {
            Table.nativeSetNull(nativePtr, orderActionColumnInfo.extraIndex, j, false);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), orderActionColumnInfo.fieldsIndex);
        RealmList<Field> realmGet$fields = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields();
        if (realmGet$fields == null || ((long) realmGet$fields.size()) != osList.size()) {
            j2 = j3;
            osList.removeAll();
            if (realmGet$fields != null) {
                Iterator<Field> it = realmGet$fields.iterator();
                while (it.hasNext()) {
                    Field next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$fields.size();
            int i = 0;
            while (i < size) {
                Field field = realmGet$fields.get(i);
                Long l2 = map2.get(field);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm2, field, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
                j3 = j3;
            }
            j2 = j3;
        }
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            long j4 = j2;
            Table.nativeSetString(nativePtr, orderActionColumnInfo.titleIndex, j2, realmGet$title, false);
            return j4;
        }
        long j5 = j2;
        Table.nativeSetNull(nativePtr, orderActionColumnInfo.titleIndex, j5, false);
        return j5;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(OrderAction.class);
        long nativePtr = table.getNativePtr();
        OrderActionColumnInfo orderActionColumnInfo = (OrderActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderAction.class);
        while (it.hasNext()) {
            OrderAction orderAction = (OrderAction) it.next();
            if (!map2.containsKey(orderAction)) {
                if (orderAction instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderAction;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(orderAction, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(orderAction, Long.valueOf(createRow));
                C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.idIndex, createRow, realmGet$id, false);
                } else {
                    Table.nativeSetNull(nativePtr, orderActionColumnInfo.idIndex, createRow, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, orderActionColumnInfo.typeIndex, createRow, false);
                }
                String realmGet$extra = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$extra();
                if (realmGet$extra != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.extraIndex, createRow, realmGet$extra, false);
                } else {
                    Table.nativeSetNull(nativePtr, orderActionColumnInfo.extraIndex, createRow, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(createRow), orderActionColumnInfo.fieldsIndex);
                RealmList<Field> realmGet$fields = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$fields();
                if (realmGet$fields == null || ((long) realmGet$fields.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$fields != null) {
                        Iterator<Field> it2 = realmGet$fields.iterator();
                        while (it2.hasNext()) {
                            Field next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$fields.size();
                    for (int i = 0; i < size; i++) {
                        Field field = realmGet$fields.get(i);
                        Long l2 = map2.get(field);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.insertOrUpdate(realm2, field, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, orderActionColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, orderActionColumnInfo.titleIndex, createRow, false);
                }
            }
        }
    }

    public static OrderAction createDetachedCopy(OrderAction orderAction, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        OrderAction orderAction2;
        if (i > i2 || orderAction == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(orderAction);
        if (cacheData == null) {
            orderAction2 = new OrderAction();
            map.put(orderAction, new RealmObjectProxy.CacheData(i, orderAction2));
        } else if (i >= cacheData.minDepth) {
            return (OrderAction) cacheData.object;
        } else {
            cacheData.minDepth = i;
            orderAction2 = (OrderAction) cacheData.object;
        }
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface = orderAction2;
        C4614x1663cccd ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface2 = orderAction;
        ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$extra(ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface2.realmGet$extra());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$fields((RealmList<Field>) null);
        } else {
            RealmList<Field> realmGet$fields = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface2.realmGet$fields();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$fields(realmList);
            int i3 = i + 1;
            int size = realmGet$fields.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy.createDetachedCopy(realmGet$fields.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxyinterface2.realmGet$title());
        return orderAction2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("OrderAction = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{extra:");
        sb.append(realmGet$extra() != null ? realmGet$extra() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{fields:");
        sb.append("RealmList<Field>[");
        sb.append(realmGet$fields().size());
        sb.append("]");
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
        ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_OrderActionRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_orderactionrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
