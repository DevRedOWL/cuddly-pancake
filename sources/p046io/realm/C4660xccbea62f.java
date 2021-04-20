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
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Guard;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.SchemaItem;
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

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_GuardRealmProxy */
public class C4660xccbea62f extends Guard implements RealmObjectProxy, C4661xb73f6bca {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private GuardColumnInfo columnInfo;
    private ProxyState<Guard> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_GuardRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Guard";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_GuardRealmProxy$GuardColumnInfo */
    static final class GuardColumnInfo extends ColumnInfo {
        long accessItemIndex;
        long gatesItemIndex;
        long guardItemIndex;
        long maxColumnIndexValue;
        long passItemIndex;
        long videoItemIndex;

        GuardColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.videoItemIndex = addColumnDetails("videoItem", "videoItem", objectSchemaInfo);
            this.accessItemIndex = addColumnDetails("accessItem", "accessItem", objectSchemaInfo);
            this.passItemIndex = addColumnDetails("passItem", "passItem", objectSchemaInfo);
            this.gatesItemIndex = addColumnDetails("gatesItem", "gatesItem", objectSchemaInfo);
            this.guardItemIndex = addColumnDetails("guardItem", "guardItem", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GuardColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new GuardColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            GuardColumnInfo guardColumnInfo = (GuardColumnInfo) columnInfo;
            GuardColumnInfo guardColumnInfo2 = (GuardColumnInfo) columnInfo2;
            guardColumnInfo2.videoItemIndex = guardColumnInfo.videoItemIndex;
            guardColumnInfo2.accessItemIndex = guardColumnInfo.accessItemIndex;
            guardColumnInfo2.passItemIndex = guardColumnInfo.passItemIndex;
            guardColumnInfo2.gatesItemIndex = guardColumnInfo.gatesItemIndex;
            guardColumnInfo2.guardItemIndex = guardColumnInfo.guardItemIndex;
            guardColumnInfo2.maxColumnIndexValue = guardColumnInfo.maxColumnIndexValue;
        }
    }

    C4660xccbea62f() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (GuardColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public SchemaItem realmGet$videoItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.videoItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.videoItemIndex), false, Collections.emptyList());
    }

    public void realmSet$videoItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.videoItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.videoItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("videoItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.videoItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.videoItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$accessItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.accessItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.accessItemIndex), false, Collections.emptyList());
    }

    public void realmSet$accessItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.accessItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.accessItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("accessItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.accessItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.accessItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$passItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.passItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.passItemIndex), false, Collections.emptyList());
    }

    public void realmSet$passItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.passItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.passItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("passItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.passItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.passItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$gatesItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.gatesItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.gatesItemIndex), false, Collections.emptyList());
    }

    public void realmSet$gatesItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.gatesItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.gatesItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("gatesItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.gatesItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.gatesItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public SchemaItem realmGet$guardItem() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.guardItemIndex)) {
            return null;
        }
        return (SchemaItem) this.proxyState.getRealm$realm().get(SchemaItem.class, this.proxyState.getRow$realm().getLink(this.columnInfo.guardItemIndex), false, Collections.emptyList());
    }

    public void realmSet$guardItem(SchemaItem schemaItem) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (schemaItem == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.guardItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            this.proxyState.getRow$realm().setLink(this.columnInfo.guardItemIndex, ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("guardItem")) {
            if (schemaItem != null && !RealmObject.isManaged(schemaItem)) {
                schemaItem = (SchemaItem) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(schemaItem, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (schemaItem == null) {
                row$realm.nullifyLink(this.columnInfo.guardItemIndex);
                return;
            }
            this.proxyState.checkValidObject(schemaItem);
            row$realm.getTable().setLink(this.columnInfo.guardItemIndex, row$realm.getIndex(), ((RealmObjectProxy) schemaItem).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        builder.addPersistedLinkProperty("videoItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("accessItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("passItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("gatesItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("guardItem", RealmFieldType.OBJECT, C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GuardColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new GuardColumnInfo(osSchemaInfo);
    }

    public static Guard createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(5);
        if (jSONObject.has("videoItem")) {
            arrayList.add("videoItem");
        }
        if (jSONObject.has("accessItem")) {
            arrayList.add("accessItem");
        }
        if (jSONObject.has("passItem")) {
            arrayList.add("passItem");
        }
        if (jSONObject.has("gatesItem")) {
            arrayList.add("gatesItem");
        }
        if (jSONObject.has("guardItem")) {
            arrayList.add("guardItem");
        }
        Guard guard = (Guard) realm.createObjectInternal(Guard.class, true, arrayList);
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard;
        if (jSONObject.has("videoItem")) {
            if (jSONObject.isNull("videoItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$videoItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$videoItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("videoItem"), z));
            }
        }
        if (jSONObject.has("accessItem")) {
            if (jSONObject.isNull("accessItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$accessItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$accessItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("accessItem"), z));
            }
        }
        if (jSONObject.has("passItem")) {
            if (jSONObject.isNull("passItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$passItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$passItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("passItem"), z));
            }
        }
        if (jSONObject.has("gatesItem")) {
            if (jSONObject.isNull("gatesItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$gatesItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$gatesItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("gatesItem"), z));
            }
        }
        if (jSONObject.has("guardItem")) {
            if (jSONObject.isNull("guardItem")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$guardItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$guardItem(C4666xdf5d9ae8.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("guardItem"), z));
            }
        }
        return guard;
    }

    public static Guard createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Guard guard = new Guard();
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("videoItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$videoItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$videoItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("accessItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$accessItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$accessItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("passItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$passItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$passItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("gatesItem")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$gatesItem((SchemaItem) null);
                } else {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$gatesItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("guardItem")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$guardItem((SchemaItem) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$guardItem(C4666xdf5d9ae8.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (Guard) realm.copyToRealm(guard, new ImportFlag[0]);
    }

    private static C4660xccbea62f newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class), false, Collections.emptyList());
        C4660xccbea62f ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxy = new C4660xccbea62f();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxy;
    }

    public static Guard copyOrUpdate(Realm realm, GuardColumnInfo guardColumnInfo, Guard guard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (guard instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) guard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return guard;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(guard);
        if (realmObjectProxy2 != null) {
            return (Guard) realmObjectProxy2;
        }
        return copy(realm, guardColumnInfo, guard, z, map, set);
    }

    public static Guard copy(Realm realm, GuardColumnInfo guardColumnInfo, Guard guard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(guard);
        if (realmObjectProxy != null) {
            return (Guard) realmObjectProxy;
        }
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard;
        C4660xccbea62f newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(Guard.class), guardColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(guard, newProxyInstance);
        SchemaItem realmGet$videoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$videoItem();
        if (realmGet$videoItem == null) {
            newProxyInstance.realmSet$videoItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem = (SchemaItem) map.get(realmGet$videoItem);
            if (schemaItem != null) {
                newProxyInstance.realmSet$videoItem(schemaItem);
            } else {
                newProxyInstance.realmSet$videoItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$videoItem, z, map, set));
            }
        }
        SchemaItem realmGet$accessItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$accessItem();
        if (realmGet$accessItem == null) {
            newProxyInstance.realmSet$accessItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem2 = (SchemaItem) map.get(realmGet$accessItem);
            if (schemaItem2 != null) {
                newProxyInstance.realmSet$accessItem(schemaItem2);
            } else {
                newProxyInstance.realmSet$accessItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$accessItem, z, map, set));
            }
        }
        SchemaItem realmGet$passItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$passItem();
        if (realmGet$passItem == null) {
            newProxyInstance.realmSet$passItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem3 = (SchemaItem) map.get(realmGet$passItem);
            if (schemaItem3 != null) {
                newProxyInstance.realmSet$passItem(schemaItem3);
            } else {
                newProxyInstance.realmSet$passItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$passItem, z, map, set));
            }
        }
        SchemaItem realmGet$gatesItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$gatesItem();
        if (realmGet$gatesItem == null) {
            newProxyInstance.realmSet$gatesItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem4 = (SchemaItem) map.get(realmGet$gatesItem);
            if (schemaItem4 != null) {
                newProxyInstance.realmSet$gatesItem(schemaItem4);
            } else {
                newProxyInstance.realmSet$gatesItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$gatesItem, z, map, set));
            }
        }
        SchemaItem realmGet$guardItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$guardItem();
        if (realmGet$guardItem == null) {
            newProxyInstance.realmSet$guardItem((SchemaItem) null);
        } else {
            SchemaItem schemaItem5 = (SchemaItem) map.get(realmGet$guardItem);
            if (schemaItem5 != null) {
                newProxyInstance.realmSet$guardItem(schemaItem5);
            } else {
                newProxyInstance.realmSet$guardItem(C4666xdf5d9ae8.copyOrUpdate(realm, (C4666xdf5d9ae8.SchemaItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SchemaItem.class), realmGet$guardItem, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Guard guard, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Guard guard2 = guard;
        Map<RealmModel, Long> map2 = map;
        if (guard2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) guard2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Guard.class);
        long nativePtr = table.getNativePtr();
        GuardColumnInfo guardColumnInfo = (GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class);
        long createRow = OsObject.createRow(table);
        map2.put(guard2, Long.valueOf(createRow));
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard2;
        SchemaItem realmGet$videoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$videoItem();
        if (realmGet$videoItem != null) {
            Long l = map2.get(realmGet$videoItem);
            if (l == null) {
                l = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$videoItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.videoItemIndex, createRow, l.longValue(), false);
        }
        SchemaItem realmGet$accessItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$accessItem();
        if (realmGet$accessItem != null) {
            Long l2 = map2.get(realmGet$accessItem);
            if (l2 == null) {
                l2 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$accessItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.accessItemIndex, createRow, l2.longValue(), false);
        }
        SchemaItem realmGet$passItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$passItem();
        if (realmGet$passItem != null) {
            Long l3 = map2.get(realmGet$passItem);
            if (l3 == null) {
                l3 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$passItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.passItemIndex, createRow, l3.longValue(), false);
        }
        SchemaItem realmGet$gatesItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$gatesItem();
        if (realmGet$gatesItem != null) {
            Long l4 = map2.get(realmGet$gatesItem);
            if (l4 == null) {
                l4 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$gatesItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.gatesItemIndex, createRow, l4.longValue(), false);
        }
        SchemaItem realmGet$guardItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$guardItem();
        if (realmGet$guardItem != null) {
            Long l5 = map2.get(realmGet$guardItem);
            if (l5 == null) {
                l5 = Long.valueOf(C4666xdf5d9ae8.insert(realm2, realmGet$guardItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.guardItemIndex, createRow, l5.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Guard.class);
        table.getNativePtr();
        GuardColumnInfo guardColumnInfo = (GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class);
        while (it.hasNext()) {
            Guard guard = (Guard) it.next();
            if (!map.containsKey(guard)) {
                if (guard instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) guard;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(guard, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(guard, Long.valueOf(createRow));
                C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard;
                SchemaItem realmGet$videoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$videoItem();
                if (realmGet$videoItem != null) {
                    Long l = map.get(realmGet$videoItem);
                    if (l == null) {
                        l = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$videoItem, map));
                    }
                    table.setLink(guardColumnInfo.videoItemIndex, createRow, l.longValue(), false);
                }
                SchemaItem realmGet$accessItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$accessItem();
                if (realmGet$accessItem != null) {
                    Long l2 = map.get(realmGet$accessItem);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$accessItem, map));
                    }
                    table.setLink(guardColumnInfo.accessItemIndex, createRow, l2.longValue(), false);
                }
                SchemaItem realmGet$passItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$passItem();
                if (realmGet$passItem != null) {
                    Long l3 = map.get(realmGet$passItem);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$passItem, map));
                    }
                    table.setLink(guardColumnInfo.passItemIndex, createRow, l3.longValue(), false);
                }
                SchemaItem realmGet$gatesItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$gatesItem();
                if (realmGet$gatesItem != null) {
                    Long l4 = map.get(realmGet$gatesItem);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$gatesItem, map));
                    }
                    table.setLink(guardColumnInfo.gatesItemIndex, createRow, l4.longValue(), false);
                }
                SchemaItem realmGet$guardItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$guardItem();
                if (realmGet$guardItem != null) {
                    Long l5 = map.get(realmGet$guardItem);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4666xdf5d9ae8.insert(realm, realmGet$guardItem, map));
                    }
                    table.setLink(guardColumnInfo.guardItemIndex, createRow, l5.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Guard guard, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Guard guard2 = guard;
        Map<RealmModel, Long> map2 = map;
        if (guard2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) guard2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Guard.class);
        long nativePtr = table.getNativePtr();
        GuardColumnInfo guardColumnInfo = (GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class);
        long createRow = OsObject.createRow(table);
        map2.put(guard2, Long.valueOf(createRow));
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard2;
        SchemaItem realmGet$videoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$videoItem();
        if (realmGet$videoItem != null) {
            Long l = map2.get(realmGet$videoItem);
            if (l == null) {
                l = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$videoItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.videoItemIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, guardColumnInfo.videoItemIndex, createRow);
        }
        SchemaItem realmGet$accessItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$accessItem();
        if (realmGet$accessItem != null) {
            Long l2 = map2.get(realmGet$accessItem);
            if (l2 == null) {
                l2 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$accessItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.accessItemIndex, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, guardColumnInfo.accessItemIndex, createRow);
        }
        SchemaItem realmGet$passItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$passItem();
        if (realmGet$passItem != null) {
            Long l3 = map2.get(realmGet$passItem);
            if (l3 == null) {
                l3 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$passItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.passItemIndex, createRow, l3.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, guardColumnInfo.passItemIndex, createRow);
        }
        SchemaItem realmGet$gatesItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$gatesItem();
        if (realmGet$gatesItem != null) {
            Long l4 = map2.get(realmGet$gatesItem);
            if (l4 == null) {
                l4 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$gatesItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.gatesItemIndex, createRow, l4.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, guardColumnInfo.gatesItemIndex, createRow);
        }
        SchemaItem realmGet$guardItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$guardItem();
        if (realmGet$guardItem != null) {
            Long l5 = map2.get(realmGet$guardItem);
            if (l5 == null) {
                l5 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$guardItem, map2));
            }
            Table.nativeSetLink(nativePtr, guardColumnInfo.guardItemIndex, createRow, l5.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, guardColumnInfo.guardItemIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Guard.class);
        long nativePtr = table.getNativePtr();
        GuardColumnInfo guardColumnInfo = (GuardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Guard.class);
        while (it.hasNext()) {
            Guard guard = (Guard) it.next();
            if (!map2.containsKey(guard)) {
                if (guard instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) guard;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(guard, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(guard, Long.valueOf(createRow));
                C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard;
                SchemaItem realmGet$videoItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$videoItem();
                if (realmGet$videoItem != null) {
                    Long l = map2.get(realmGet$videoItem);
                    if (l == null) {
                        l = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$videoItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, guardColumnInfo.videoItemIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, guardColumnInfo.videoItemIndex, createRow);
                }
                SchemaItem realmGet$accessItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$accessItem();
                if (realmGet$accessItem != null) {
                    Long l2 = map2.get(realmGet$accessItem);
                    if (l2 == null) {
                        l2 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$accessItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, guardColumnInfo.accessItemIndex, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, guardColumnInfo.accessItemIndex, createRow);
                }
                SchemaItem realmGet$passItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$passItem();
                if (realmGet$passItem != null) {
                    Long l3 = map2.get(realmGet$passItem);
                    if (l3 == null) {
                        l3 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$passItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, guardColumnInfo.passItemIndex, createRow, l3.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, guardColumnInfo.passItemIndex, createRow);
                }
                SchemaItem realmGet$gatesItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$gatesItem();
                if (realmGet$gatesItem != null) {
                    Long l4 = map2.get(realmGet$gatesItem);
                    if (l4 == null) {
                        l4 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$gatesItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, guardColumnInfo.gatesItemIndex, createRow, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, guardColumnInfo.gatesItemIndex, createRow);
                }
                SchemaItem realmGet$guardItem = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmGet$guardItem();
                if (realmGet$guardItem != null) {
                    Long l5 = map2.get(realmGet$guardItem);
                    if (l5 == null) {
                        l5 = Long.valueOf(C4666xdf5d9ae8.insertOrUpdate(realm2, realmGet$guardItem, map2));
                    }
                    Table.nativeSetLink(nativePtr, guardColumnInfo.guardItemIndex, createRow, l5.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, guardColumnInfo.guardItemIndex, createRow);
                }
            }
        }
    }

    public static Guard createDetachedCopy(Guard guard, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Guard guard2;
        if (i > i2 || guard == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(guard);
        if (cacheData == null) {
            guard2 = new Guard();
            map.put(guard, new RealmObjectProxy.CacheData(i, guard2));
        } else if (i >= cacheData.minDepth) {
            return (Guard) cacheData.object;
        } else {
            cacheData.minDepth = i;
            guard2 = (Guard) cacheData.object;
        }
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface = guard2;
        C4661xb73f6bca ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface2 = guard;
        int i3 = i + 1;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$videoItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface2.realmGet$videoItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$accessItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface2.realmGet$accessItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$passItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface2.realmGet$passItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$gatesItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface2.realmGet$gatesItem(), i3, i2, map));
        ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface.realmSet$guardItem(C4666xdf5d9ae8.createDetachedCopy(ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxyinterface2.realmGet$guardItem(), i3, i2, map));
        return guard2;
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Guard = proxy[");
        sb.append("{videoItem:");
        SchemaItem realmGet$videoItem = realmGet$videoItem();
        String str4 = C4666xdf5d9ae8.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(realmGet$videoItem != null ? str4 : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{accessItem:");
        if (realmGet$accessItem() != null) {
            str = str4;
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{passItem:");
        if (realmGet$passItem() != null) {
            str2 = str4;
        } else {
            str2 = "null";
        }
        sb.append(str2);
        sb.append("}");
        sb.append(",");
        sb.append("{gatesItem:");
        if (realmGet$gatesItem() != null) {
            str3 = str4;
        } else {
            str3 = "null";
        }
        sb.append(str3);
        sb.append("}");
        sb.append(",");
        sb.append("{guardItem:");
        if (realmGet$guardItem() == null) {
            str4 = "null";
        }
        sb.append(str4);
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
        C4660xccbea62f ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxy = (C4660xccbea62f) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_guardrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
