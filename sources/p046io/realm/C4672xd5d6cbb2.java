package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Services;
import p046io.realm.BaseRealm;
import p046io.realm.C4666xdf5d9ae8;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_ServicesRealmProxy */
public class C4672xd5d6cbb2 extends Services implements RealmObjectProxy, C4673x815c9a7 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ServicesColumnInfo columnInfo;
    private ProxyState<Services> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_ServicesRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Services";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_ServicesRealmProxy$ServicesColumnInfo */
    static final class ServicesColumnInfo extends ColumnInfo {
        long billsItemIndex;
        long bmsInfoItemIndex;
        long bmsTicketItemIndex;
        long countersItemIndex;
        long maxColumnIndexValue;

        ServicesColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.countersItemIndex = addColumnDetails("countersItem", "countersItem", objectSchemaInfo);
            this.billsItemIndex = addColumnDetails("billsItem", "billsItem", objectSchemaInfo);
            this.bmsInfoItemIndex = addColumnDetails("bmsInfoItem", "bmsInfoItem", objectSchemaInfo);
            this.bmsTicketItemIndex = addColumnDetails("bmsTicketItem", "bmsTicketItem", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ServicesColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ServicesColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ServicesColumnInfo servicesColumnInfo = (ServicesColumnInfo) columnInfo;
            ServicesColumnInfo servicesColumnInfo2 = (ServicesColumnInfo) columnInfo2;
            servicesColumnInfo2.countersItemIndex = servicesColumnInfo.countersItemIndex;
            servicesColumnInfo2.billsItemIndex = servicesColumnInfo.billsItemIndex;
            servicesColumnInfo2.bmsInfoItemIndex = servicesColumnInfo.bmsInfoItemIndex;
            servicesColumnInfo2.bmsTicketItemIndex = servicesColumnInfo.bmsTicketItemIndex;
            servicesColumnInfo2.maxColumnIndexValue = servicesColumnInfo.maxColumnIndexValue;
        }
    }

    C4672xd5d6cbb2() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ServicesColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public SchemaItem realmGet$countersItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.countersItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.countersItemIndex), false, Collections.emptyList());
    }

    public void realmSet$countersItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.countersItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.countersItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("countersItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.countersItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.countersItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$billsItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.billsItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.billsItemIndex), false, Collections.emptyList());
    }

    public void realmSet$billsItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.billsItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.billsItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("billsItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.billsItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.billsItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$bmsInfoItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.bmsInfoItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.bmsInfoItemIndex), false, Collections.emptyList());
    }

    public void realmSet$bmsInfoItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.bmsInfoItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.bmsInfoItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("bmsInfoItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.bmsInfoItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.bmsInfoItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$bmsTicketItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.bmsTicketItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.bmsTicketItemIndex), false, Collections.emptyList());
    }

    public void realmSet$bmsTicketItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.bmsTicketItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.bmsTicketItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("bmsTicketItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.bmsTicketItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.bmsTicketItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        builder.addPersistedLinkProperty("countersItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("billsItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("bmsInfoItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("bmsTicketItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ServicesColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ServicesColumnInfo(osSchemaInfo);
    }

    public static Services createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(4);
        if (jSONObject.has("countersItem")) {
            arrayList.add("countersItem");
        }
        if (jSONObject.has("billsItem")) {
            arrayList.add("billsItem");
        }
        if (jSONObject.has("bmsInfoItem")) {
            arrayList.add("bmsInfoItem");
        }
        if (jSONObject.has("bmsTicketItem")) {
            arrayList.add("bmsTicketItem");
        }
        Services services = (Services) realm.createObjectInternal(Services.class, true, arrayList);
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services;
        if (jSONObject.has("countersItem")) {
            if (jSONObject.isNull("countersItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$countersItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$countersItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("countersItem"), z));
            }
        }
        if (jSONObject.has("billsItem")) {
            if (jSONObject.isNull("billsItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$billsItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$billsItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("billsItem"), z));
            }
        }
        if (jSONObject.has("bmsInfoItem")) {
            if (jSONObject.isNull("bmsInfoItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsInfoItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsInfoItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("bmsInfoItem"), z));
            }
        }
        if (jSONObject.has("bmsTicketItem")) {
            if (jSONObject.isNull("bmsTicketItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsTicketItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsTicketItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("bmsTicketItem"), z));
            }
        }
        return services;
    }

    public static Services createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Services services = new Services();
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("countersItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$countersItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$countersItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("billsItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$billsItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$billsItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("bmsInfoItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsInfoItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsInfoItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("bmsTicketItem")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsTicketItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsTicketItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (Services) realm.copyToRealm(services, new ImportFlag[0]);
    }

    private static C4672xd5d6cbb2 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class), false, Collections.emptyList());
        C4672xd5d6cbb2 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxy = new C4672xd5d6cbb2();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxy;
    }

    public static Services copyOrUpdate(Realm realm, ServicesColumnInfo servicesColumnInfo, Services services, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (services instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) services;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return services;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(services);
        if (realmObjectProxy2 != null) {
            return (Services) realmObjectProxy2;
        }
        return copy(realm, servicesColumnInfo, services, z, map, set);
    }

    public static Services copy(Realm realm, ServicesColumnInfo servicesColumnInfo, Services services, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(services);
        if (realmObjectProxy != null) {
            return (Services) realmObjectProxy;
        }
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services;
        C4672xd5d6cbb2 newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(Services.class), servicesColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(services, newProxyInstance);
        SchemaItem realmGet$countersItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$countersItem();
        if (realmGet$countersItem == null) {
            newProxyInstance.realmSet$countersItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem = (SchemaItem) map.get(realmGet$countersItem);
            if (schemaItem != null) {
                newProxyInstance.realmSet$countersItem(schemaItem);
            } else {
                newProxyInstance.realmSet$countersItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$countersItem, z, map, set));
            }
        }
        SchemaItem realmGet$billsItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$billsItem();
        if (realmGet$billsItem == null) {
            newProxyInstance.realmSet$billsItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem2 = (SchemaItem) map.get(realmGet$billsItem);
            if (schemaItem2 != null) {
                newProxyInstance.realmSet$billsItem(schemaItem2);
            } else {
                newProxyInstance.realmSet$billsItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$billsItem, z, map, set));
            }
        }
        SchemaItem realmGet$bmsInfoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsInfoItem();
        if (realmGet$bmsInfoItem == null) {
            newProxyInstance.realmSet$bmsInfoItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem3 = (SchemaItem) map.get(realmGet$bmsInfoItem);
            if (schemaItem3 != null) {
                newProxyInstance.realmSet$bmsInfoItem(schemaItem3);
            } else {
                newProxyInstance.realmSet$bmsInfoItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$bmsInfoItem, z, map, set));
            }
        }
        SchemaItem realmGet$bmsTicketItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsTicketItem();
        if (realmGet$bmsTicketItem == null) {
            newProxyInstance.realmSet$bmsTicketItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem4 = (SchemaItem) map.get(realmGet$bmsTicketItem);
            if (schemaItem4 != null) {
                newProxyInstance.realmSet$bmsTicketItem(schemaItem4);
            } else {
                newProxyInstance.realmSet$bmsTicketItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$bmsTicketItem, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Services services, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Services services2 = services;
        Map<RealmModel, Long> map2 = map;
        if (services2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) services2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Services.class);
        long nativePtr = table.getNativePtr();
        ServicesColumnInfo servicesColumnInfo = (ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class);
        long createRow = OsObject.createRow(table);
        map2.put(services2, Long.valueOf(createRow));
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services2;
        SchemaItem realmGet$countersItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$countersItem();
        if (realmGet$countersItem != null) {
            Long l = map2.get(realmGet$countersItem);
            if (l == null) {
                l = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$countersItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.countersItemIndex, createRow, l.longValue(), false);
        }
        SchemaItem realmGet$billsItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$billsItem();
        if (realmGet$billsItem != null) {
            Long l2 = map2.get(realmGet$billsItem);
            if (l2 == null) {
                l2 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$billsItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.billsItemIndex, createRow, l2.longValue(), false);
        }
        SchemaItem realmGet$bmsInfoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsInfoItem();
        if (realmGet$bmsInfoItem != null) {
            Long l3 = map2.get(realmGet$bmsInfoItem);
            if (l3 == null) {
                l3 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$bmsInfoItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.bmsInfoItemIndex, createRow, l3.longValue(), false);
        }
        SchemaItem realmGet$bmsTicketItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsTicketItem();
        if (realmGet$bmsTicketItem != null) {
            Long l4 = map2.get(realmGet$bmsTicketItem);
            if (l4 == null) {
                l4 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$bmsTicketItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.bmsTicketItemIndex, createRow, l4.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Services.class);
        table.getNativePtr();
        ServicesColumnInfo servicesColumnInfo = (ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class);
        while (it.hasNext()) {
            Services services = (Services) it.next();
            if (!map.containsKey(services)) {
                if (services instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) services;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(services, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(services, Long.valueOf(createRow));
                C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services;
                SchemaItem realmGet$countersItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$countersItem();
                if (realmGet$countersItem != null) {
                    Long l = map.get(realmGet$countersItem);
                    if (l == null) {
                        l = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$countersItem, map));
                    }
                    table.setLink(servicesColumnInfo.countersItemIndex, createRow, l.longValue(), false);
                }
                SchemaItem realmGet$billsItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$billsItem();
                if (realmGet$billsItem != null) {
                    Long l2 = map.get(realmGet$billsItem);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$billsItem, map));
                    }
                    table.setLink(servicesColumnInfo.billsItemIndex, createRow, l2.longValue(), false);
                }
                SchemaItem realmGet$bmsInfoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsInfoItem();
                if (realmGet$bmsInfoItem != null) {
                    Long l3 = map.get(realmGet$bmsInfoItem);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$bmsInfoItem, map));
                    }
                    table.setLink(servicesColumnInfo.bmsInfoItemIndex, createRow, l3.longValue(), false);
                }
                SchemaItem realmGet$bmsTicketItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsTicketItem();
                if (realmGet$bmsTicketItem != null) {
                    Long l4 = map.get(realmGet$bmsTicketItem);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$bmsTicketItem, map));
                    }
                    table.setLink(servicesColumnInfo.bmsTicketItemIndex, createRow, l4.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Services services, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Services services2 = services;
        Map<RealmModel, Long> map2 = map;
        if (services2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) services2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Services.class);
        long nativePtr = table.getNativePtr();
        ServicesColumnInfo servicesColumnInfo = (ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class);
        long createRow = OsObject.createRow(table);
        map2.put(services2, Long.valueOf(createRow));
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services2;
        SchemaItem realmGet$countersItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$countersItem();
        if (realmGet$countersItem != null) {
            Long l = map2.get(realmGet$countersItem);
            if (l == null) {
                l = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$countersItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.countersItemIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, servicesColumnInfo.countersItemIndex, createRow);
        }
        SchemaItem realmGet$billsItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$billsItem();
        if (realmGet$billsItem != null) {
            Long l2 = map2.get(realmGet$billsItem);
            if (l2 == null) {
                l2 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$billsItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.billsItemIndex, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, servicesColumnInfo.billsItemIndex, createRow);
        }
        SchemaItem realmGet$bmsInfoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsInfoItem();
        if (realmGet$bmsInfoItem != null) {
            Long l3 = map2.get(realmGet$bmsInfoItem);
            if (l3 == null) {
                l3 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$bmsInfoItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.bmsInfoItemIndex, createRow, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, servicesColumnInfo.bmsInfoItemIndex, createRow);
        }
        SchemaItem realmGet$bmsTicketItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsTicketItem();
        if (realmGet$bmsTicketItem != null) {
            Long l4 = map2.get(realmGet$bmsTicketItem);
            if (l4 == null) {
                l4 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$bmsTicketItem, map2));
            }
            Table.nativeSetLink(nativePtr, servicesColumnInfo.bmsTicketItemIndex, createRow, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, servicesColumnInfo.bmsTicketItemIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Services.class);
        long nativePtr = table.getNativePtr();
        ServicesColumnInfo servicesColumnInfo = (ServicesColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Services.class);
        while (it.hasNext()) {
            Services services = (Services) it.next();
            if (!map2.containsKey(services)) {
                if (services instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) services;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(services, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(services, Long.valueOf(createRow));
                C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services;
                SchemaItem realmGet$countersItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$countersItem();
                if (realmGet$countersItem != null) {
                    Long l = map2.get(realmGet$countersItem);
                    if (l == null) {
                        l = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$countersItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, servicesColumnInfo.countersItemIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, servicesColumnInfo.countersItemIndex, createRow);
                }
                SchemaItem realmGet$billsItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$billsItem();
                if (realmGet$billsItem != null) {
                    Long l2 = map2.get(realmGet$billsItem);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$billsItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, servicesColumnInfo.billsItemIndex, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, servicesColumnInfo.billsItemIndex, createRow);
                }
                SchemaItem realmGet$bmsInfoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsInfoItem();
                if (realmGet$bmsInfoItem != null) {
                    Long l3 = map2.get(realmGet$bmsInfoItem);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$bmsInfoItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, servicesColumnInfo.bmsInfoItemIndex, createRow, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, servicesColumnInfo.bmsInfoItemIndex, createRow);
                }
                SchemaItem realmGet$bmsTicketItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmGet$bmsTicketItem();
                if (realmGet$bmsTicketItem != null) {
                    Long l4 = map2.get(realmGet$bmsTicketItem);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$bmsTicketItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, servicesColumnInfo.bmsTicketItemIndex, createRow, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, servicesColumnInfo.bmsTicketItemIndex, createRow);
                }
            }
        }
    }

    public static Services createDetachedCopy(Services services, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Services services2;
        if (i > i2 || services == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(services);
        if (cacheData == null) {
            services2 = new Services();
            map.put(services, new RealmObjectProxy.CacheData(i, services2));
        } else if (i >= cacheData.minDepth) {
            return (Services) cacheData.object;
        } else {
            cacheData.minDepth = i;
            services2 = (Services) cacheData.object;
        }
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface = services2;
        C4673x815c9a7 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface2 = services;
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$countersItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface2.realmGet$countersItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$billsItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface2.realmGet$billsItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsInfoItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface2.realmGet$bmsInfoItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface.realmSet$bmsTicketItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxyinterface2.realmGet$bmsTicketItem(), i3, i2, map));
        return services2;
    }

    public String toString() {
        String str;
        String str2;
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Services = proxy[");
        sb.append("{countersItem:");
        SchemaItem realmGet$countersItem = realmGet$countersItem();
        String str3 = C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(realmGet$countersItem != null ? str3 : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{billsItem:");
        if (realmGet$billsItem() != null) {
            str = str3;
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{bmsInfoItem:");
        if (realmGet$bmsInfoItem() != null) {
            str2 = str3;
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{bmsTicketItem:");
        if (realmGet$bmsTicketItem() == null) {
            str3 = "null";
        }
        sb.append(str3);
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
        C4672xd5d6cbb2 ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxy = (C4672xd5d6cbb2) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_servicesrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
