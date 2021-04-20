package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.messaging.Constants;
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
import p035ru.unicorn.ujin.data.realm.marketplace.SelectValue;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Field;
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
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy extends Field implements RealmObjectProxy, ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private FieldColumnInfo columnInfo;
    private RealmList<SelectValue> contentRealmList;
    private ProxyState<Field> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Field";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy$FieldColumnInfo */
    static final class FieldColumnInfo extends ColumnInfo {
        long contentIndex;
        long inputTypeIndex;
        long labelIndex;
        long maxColumnIndexValue;
        long nameIndex;
        long orderIndex;
        long placeholderIndex;
        long requiredIndex;
        long typeIndex;

        FieldColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.labelIndex = addColumnDetails(Constants.ScionAnalytics.PARAM_LABEL, Constants.ScionAnalytics.PARAM_LABEL, objectSchemaInfo);
            this.placeholderIndex = addColumnDetails(ReactTextInputShadowNode.PROP_PLACEHOLDER, ReactTextInputShadowNode.PROP_PLACEHOLDER, objectSchemaInfo);
            this.typeIndex = addColumnDetails("type", "type", objectSchemaInfo);
            this.orderIndex = addColumnDetails("order", "order", objectSchemaInfo);
            this.requiredIndex = addColumnDetails(Field.JsonFields.required, Field.JsonFields.required, objectSchemaInfo);
            this.inputTypeIndex = addColumnDetails("inputType", "inputType", objectSchemaInfo);
            this.contentIndex = addColumnDetails("content", "content", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        FieldColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new FieldColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            FieldColumnInfo fieldColumnInfo = (FieldColumnInfo) columnInfo;
            FieldColumnInfo fieldColumnInfo2 = (FieldColumnInfo) columnInfo2;
            fieldColumnInfo2.nameIndex = fieldColumnInfo.nameIndex;
            fieldColumnInfo2.labelIndex = fieldColumnInfo.labelIndex;
            fieldColumnInfo2.placeholderIndex = fieldColumnInfo.placeholderIndex;
            fieldColumnInfo2.typeIndex = fieldColumnInfo.typeIndex;
            fieldColumnInfo2.orderIndex = fieldColumnInfo.orderIndex;
            fieldColumnInfo2.requiredIndex = fieldColumnInfo.requiredIndex;
            fieldColumnInfo2.inputTypeIndex = fieldColumnInfo.inputTypeIndex;
            fieldColumnInfo2.contentIndex = fieldColumnInfo.contentIndex;
            fieldColumnInfo2.maxColumnIndexValue = fieldColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (FieldColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameIndex);
    }

    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$label() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.labelIndex);
    }

    public void realmSet$label(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.labelIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.labelIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.labelIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.labelIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$placeholder() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.placeholderIndex);
    }

    public void realmSet$placeholder(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.placeholderIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.placeholderIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.placeholderIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.placeholderIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$order() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.orderIndex);
    }

    public void realmSet$order(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.orderIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.orderIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.orderIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.orderIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Boolean realmGet$required() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.requiredIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.requiredIndex));
    }

    public void realmSet$required(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.requiredIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.requiredIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.requiredIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.requiredIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    public String realmGet$inputType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.inputTypeIndex);
    }

    public void realmSet$inputType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.inputTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.inputTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.inputTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.inputTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public RealmList<SelectValue> realmGet$content() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<SelectValue> realmList = this.contentRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.contentRealmList = new RealmList<>(SelectValue.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.contentIndex), this.proxyState.getRealm$realm());
        return this.contentRealmList;
    }

    public void realmSet$content(RealmList<SelectValue> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("content")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<SelectValue> realmList2 = new RealmList<>();
                Iterator<SelectValue> it = realmList.iterator();
                while (it.hasNext()) {
                    SelectValue next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.contentIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    SelectValue selectValue = realmList.get(i);
                    this.proxyState.checkValidObject(selectValue);
                    modelList.addRow(((RealmObjectProxy) selectValue).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            SelectValue selectValue2 = realmList.get(i);
            this.proxyState.checkValidObject(selectValue2);
            modelList.setRow((long) i, ((RealmObjectProxy) selectValue2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 8, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Constants.ScionAnalytics.PARAM_LABEL, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(ReactTextInputShadowNode.PROP_PLACEHOLDER, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("type", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("order", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Field.JsonFields.required, RealmFieldType.BOOLEAN, false, false, false);
        builder2.addPersistedProperty("inputType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("content", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FieldColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new FieldColumnInfo(osSchemaInfo);
    }

    public static p035ru.unicorn.ujin.data.realm.marketplace.Field createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("content")) {
            arrayList.add("content");
        }
        p035ru.unicorn.ujin.data.realm.marketplace.Field field = (p035ru.unicorn.ujin.data.realm.marketplace.Field) realm.createObjectInternal(p035ru.unicorn.ujin.data.realm.marketplace.Field.class, true, arrayList);
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has(Constants.ScionAnalytics.PARAM_LABEL)) {
            if (jSONObject.isNull(Constants.ScionAnalytics.PARAM_LABEL)) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$label((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$label(jSONObject.getString(Constants.ScionAnalytics.PARAM_LABEL));
            }
        }
        if (jSONObject.has(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
            if (jSONObject.isNull(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$placeholder((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$placeholder(jSONObject.getString(ReactTextInputShadowNode.PROP_PLACEHOLDER));
            }
        }
        if (jSONObject.has("type")) {
            if (jSONObject.isNull("type")) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$type((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$type(jSONObject.getString("type"));
            }
        }
        if (jSONObject.has("order")) {
            if (jSONObject.isNull("order")) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$order((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$order(jSONObject.getString("order"));
            }
        }
        if (jSONObject.has(Field.JsonFields.required)) {
            if (jSONObject.isNull(Field.JsonFields.required)) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$required((Boolean) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$required(Boolean.valueOf(jSONObject.getBoolean(Field.JsonFields.required)));
            }
        }
        if (jSONObject.has("inputType")) {
            if (jSONObject.isNull("inputType")) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$inputType((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$inputType(jSONObject.getString("inputType"));
            }
        }
        if (jSONObject.has("content")) {
            if (jSONObject.isNull("content")) {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$content((RealmList<SelectValue>) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("content");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content().add(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return field;
    }

    public static p035ru.unicorn.ujin.data.realm.marketplace.Field createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        p035ru.unicorn.ujin.data.realm.marketplace.Field field = new p035ru.unicorn.ujin.data.realm.marketplace.Field();
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals(Constants.ScionAnalytics.PARAM_LABEL)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$label(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$label((String) null);
                }
            } else if (nextName.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$placeholder(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$placeholder((String) null);
                }
            } else if (nextName.equals("type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$type((String) null);
                }
            } else if (nextName.equals("order")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$order(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$order((String) null);
                }
            } else if (nextName.equals(Field.JsonFields.required)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$required(Boolean.valueOf(jsonReader.nextBoolean()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$required((Boolean) null);
                }
            } else if (nextName.equals("inputType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$inputType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$inputType((String) null);
                }
            } else if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$content((RealmList<SelectValue>) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$content(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content().add(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (p035ru.unicorn.ujin.data.realm.marketplace.Field) realm.copyToRealm(field, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) p035ru.unicorn.ujin.data.realm.marketplace.Field.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxy;
    }

    public static p035ru.unicorn.ujin.data.realm.marketplace.Field copyOrUpdate(Realm realm, FieldColumnInfo fieldColumnInfo, p035ru.unicorn.ujin.data.realm.marketplace.Field field, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (field instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) field;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return field;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(field);
        if (realmObjectProxy2 != null) {
            return (p035ru.unicorn.ujin.data.realm.marketplace.Field) realmObjectProxy2;
        }
        return copy(realm, fieldColumnInfo, field, z, map, set);
    }

    public static p035ru.unicorn.ujin.data.realm.marketplace.Field copy(Realm realm, FieldColumnInfo fieldColumnInfo, p035ru.unicorn.ujin.data.realm.marketplace.Field field, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(field);
        if (realmObjectProxy != null) {
            return (p035ru.unicorn.ujin.data.realm.marketplace.Field) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(p035ru.unicorn.ujin.data.realm.marketplace.Field.class), fieldColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(fieldColumnInfo.nameIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(fieldColumnInfo.labelIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$label());
        osObjectBuilder.addString(fieldColumnInfo.placeholderIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$placeholder());
        osObjectBuilder.addString(fieldColumnInfo.typeIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$type());
        osObjectBuilder.addString(fieldColumnInfo.orderIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$order());
        osObjectBuilder.addBoolean(fieldColumnInfo.requiredIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$required());
        osObjectBuilder.addString(fieldColumnInfo.inputTypeIndex, ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$inputType());
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(field, newProxyInstance);
        RealmList<SelectValue> realmGet$content = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content();
        if (realmGet$content != null) {
            RealmList<SelectValue> realmGet$content2 = newProxyInstance.realmGet$content();
            realmGet$content2.clear();
            for (int i = 0; i < realmGet$content.size(); i++) {
                SelectValue selectValue = realmGet$content.get(i);
                SelectValue selectValue2 = (SelectValue) map.get(selectValue);
                if (selectValue2 != null) {
                    realmGet$content2.add(selectValue2);
                } else {
                    realmGet$content2.add(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.SelectValueColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) SelectValue.class), selectValue, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, p035ru.unicorn.ujin.data.realm.marketplace.Field field, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        p035ru.unicorn.ujin.data.realm.marketplace.Field field2 = field;
        Map<RealmModel, Long> map2 = map;
        if (field2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) field2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        long nativePtr = table.getNativePtr();
        FieldColumnInfo fieldColumnInfo = (FieldColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        long createRow = OsObject.createRow(table);
        map2.put(field2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field2;
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, fieldColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            j = createRow;
        }
        String realmGet$label = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$label();
        if (realmGet$label != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.labelIndex, j, realmGet$label, false);
        }
        String realmGet$placeholder = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$placeholder();
        if (realmGet$placeholder != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.placeholderIndex, j, realmGet$placeholder, false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.typeIndex, j, realmGet$type, false);
        }
        String realmGet$order = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$order();
        if (realmGet$order != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.orderIndex, j, realmGet$order, false);
        }
        Boolean realmGet$required = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$required();
        if (realmGet$required != null) {
            Table.nativeSetBoolean(nativePtr, fieldColumnInfo.requiredIndex, j, realmGet$required.booleanValue(), false);
        }
        String realmGet$inputType = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$inputType();
        if (realmGet$inputType != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.inputTypeIndex, j, realmGet$inputType, false);
        }
        RealmList<SelectValue> realmGet$content = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content();
        if (realmGet$content == null) {
            return j;
        }
        long j2 = j;
        OsList osList = new OsList(table.getUncheckedRow(j2), fieldColumnInfo.contentIndex);
        Iterator<SelectValue> it = realmGet$content.iterator();
        while (it.hasNext()) {
            SelectValue next = it.next();
            Long l = map2.get(next);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insert(realm2, next, map2));
            }
            osList.addRow(l.longValue());
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        long nativePtr = table.getNativePtr();
        FieldColumnInfo fieldColumnInfo = (FieldColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        while (it.hasNext()) {
            p035ru.unicorn.ujin.data.realm.marketplace.Field field = (p035ru.unicorn.ujin.data.realm.marketplace.Field) it.next();
            if (!map2.containsKey(field)) {
                if (field instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) field;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(field, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(field, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field;
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$label = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$label();
                if (realmGet$label != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.labelIndex, createRow, realmGet$label, false);
                }
                String realmGet$placeholder = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$placeholder();
                if (realmGet$placeholder != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.placeholderIndex, createRow, realmGet$placeholder, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.typeIndex, createRow, realmGet$type, false);
                }
                String realmGet$order = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$order();
                if (realmGet$order != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.orderIndex, createRow, realmGet$order, false);
                }
                Boolean realmGet$required = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$required();
                if (realmGet$required != null) {
                    Table.nativeSetBoolean(nativePtr, fieldColumnInfo.requiredIndex, createRow, realmGet$required.booleanValue(), false);
                }
                String realmGet$inputType = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$inputType();
                if (realmGet$inputType != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.inputTypeIndex, createRow, realmGet$inputType, false);
                }
                RealmList<SelectValue> realmGet$content = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content();
                if (realmGet$content != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), fieldColumnInfo.contentIndex);
                    Iterator<SelectValue> it2 = realmGet$content.iterator();
                    while (it2.hasNext()) {
                        SelectValue next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, p035ru.unicorn.ujin.data.realm.marketplace.Field field, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        p035ru.unicorn.ujin.data.realm.marketplace.Field field2 = field;
        Map<RealmModel, Long> map2 = map;
        if (field2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) field2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        long nativePtr = table.getNativePtr();
        FieldColumnInfo fieldColumnInfo = (FieldColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        long createRow = OsObject.createRow(table);
        map2.put(field2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field2;
        String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            j = createRow;
            Table.nativeSetString(nativePtr, fieldColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            j = createRow;
            Table.nativeSetNull(nativePtr, fieldColumnInfo.nameIndex, j, false);
        }
        String realmGet$label = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$label();
        if (realmGet$label != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.labelIndex, j, realmGet$label, false);
        } else {
            Table.nativeSetNull(nativePtr, fieldColumnInfo.labelIndex, j, false);
        }
        String realmGet$placeholder = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$placeholder();
        if (realmGet$placeholder != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.placeholderIndex, j, realmGet$placeholder, false);
        } else {
            Table.nativeSetNull(nativePtr, fieldColumnInfo.placeholderIndex, j, false);
        }
        String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$type();
        if (realmGet$type != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.typeIndex, j, realmGet$type, false);
        } else {
            Table.nativeSetNull(nativePtr, fieldColumnInfo.typeIndex, j, false);
        }
        String realmGet$order = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$order();
        if (realmGet$order != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.orderIndex, j, realmGet$order, false);
        } else {
            Table.nativeSetNull(nativePtr, fieldColumnInfo.orderIndex, j, false);
        }
        Boolean realmGet$required = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$required();
        if (realmGet$required != null) {
            Table.nativeSetBoolean(nativePtr, fieldColumnInfo.requiredIndex, j, realmGet$required.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, fieldColumnInfo.requiredIndex, j, false);
        }
        String realmGet$inputType = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$inputType();
        if (realmGet$inputType != null) {
            Table.nativeSetString(nativePtr, fieldColumnInfo.inputTypeIndex, j, realmGet$inputType, false);
        } else {
            Table.nativeSetNull(nativePtr, fieldColumnInfo.inputTypeIndex, j, false);
        }
        long j2 = j;
        OsList osList = new OsList(table.getUncheckedRow(j2), fieldColumnInfo.contentIndex);
        RealmList<SelectValue> realmGet$content = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content();
        if (realmGet$content == null || ((long) realmGet$content.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$content != null) {
                Iterator<SelectValue> it = realmGet$content.iterator();
                while (it.hasNext()) {
                    SelectValue next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$content.size();
            for (int i = 0; i < size; i++) {
                SelectValue selectValue = realmGet$content.get(i);
                Long l2 = map2.get(selectValue);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm2, selectValue, map2));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        long nativePtr = table.getNativePtr();
        FieldColumnInfo fieldColumnInfo = (FieldColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) p035ru.unicorn.ujin.data.realm.marketplace.Field.class);
        while (it.hasNext()) {
            p035ru.unicorn.ujin.data.realm.marketplace.Field field = (p035ru.unicorn.ujin.data.realm.marketplace.Field) it.next();
            if (!map2.containsKey(field)) {
                if (field instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) field;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(field, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(field, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field;
                String realmGet$name = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$label = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$label();
                if (realmGet$label != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.labelIndex, createRow, realmGet$label, false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.labelIndex, createRow, false);
                }
                String realmGet$placeholder = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$placeholder();
                if (realmGet$placeholder != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.placeholderIndex, createRow, realmGet$placeholder, false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.placeholderIndex, createRow, false);
                }
                String realmGet$type = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$type();
                if (realmGet$type != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.typeIndex, createRow, realmGet$type, false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.typeIndex, createRow, false);
                }
                String realmGet$order = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$order();
                if (realmGet$order != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.orderIndex, createRow, realmGet$order, false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.orderIndex, createRow, false);
                }
                Boolean realmGet$required = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$required();
                if (realmGet$required != null) {
                    Table.nativeSetBoolean(nativePtr, fieldColumnInfo.requiredIndex, createRow, realmGet$required.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.requiredIndex, createRow, false);
                }
                String realmGet$inputType = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$inputType();
                if (realmGet$inputType != null) {
                    Table.nativeSetString(nativePtr, fieldColumnInfo.inputTypeIndex, createRow, realmGet$inputType, false);
                } else {
                    Table.nativeSetNull(nativePtr, fieldColumnInfo.inputTypeIndex, createRow, false);
                }
                OsList osList = new OsList(table.getUncheckedRow(createRow), fieldColumnInfo.contentIndex);
                RealmList<SelectValue> realmGet$content = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmGet$content();
                if (realmGet$content == null || ((long) realmGet$content.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$content != null) {
                        Iterator<SelectValue> it2 = realmGet$content.iterator();
                        while (it2.hasNext()) {
                            SelectValue next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$content.size();
                    for (int i = 0; i < size; i++) {
                        SelectValue selectValue = realmGet$content.get(i);
                        Long l2 = map2.get(selectValue);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.insertOrUpdate(realm2, selectValue, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static p035ru.unicorn.ujin.data.realm.marketplace.Field createDetachedCopy(p035ru.unicorn.ujin.data.realm.marketplace.Field field, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        p035ru.unicorn.ujin.data.realm.marketplace.Field field2;
        if (i > i2 || field == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(field);
        if (cacheData == null) {
            field2 = new p035ru.unicorn.ujin.data.realm.marketplace.Field();
            map.put(field, new RealmObjectProxy.CacheData(i, field2));
        } else if (i >= cacheData.minDepth) {
            return (p035ru.unicorn.ujin.data.realm.marketplace.Field) cacheData.object;
        } else {
            cacheData.minDepth = i;
            field2 = (p035ru.unicorn.ujin.data.realm.marketplace.Field) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface = field2;
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2 = field;
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$name(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$label(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$label());
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$placeholder(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$placeholder());
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$type(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$type());
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$order(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$order());
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$required(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$required());
        ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$inputType(ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$inputType());
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$content((RealmList<SelectValue>) null);
        } else {
            RealmList<SelectValue> realmGet$content = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface2.realmGet$content();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxyinterface.realmSet$content(realmList);
            int i3 = i + 1;
            int size = realmGet$content.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_marketplace_SelectValueRealmProxy.createDetachedCopy(realmGet$content.get(i4), i3, i2, map));
            }
        }
        return field2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Field = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{label:");
        sb.append(realmGet$label() != null ? realmGet$label() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{placeholder:");
        sb.append(realmGet$placeholder() != null ? realmGet$placeholder() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{type:");
        sb.append(realmGet$type() != null ? realmGet$type() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{order:");
        sb.append(realmGet$order() != null ? realmGet$order() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{required:");
        sb.append(realmGet$required() != null ? realmGet$required() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{inputType:");
        if (realmGet$inputType() != null) {
            str = realmGet$inputType();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{content:");
        sb.append("RealmList<SelectValue>[");
        sb.append(realmGet$content().size());
        sb.append("]");
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
        ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_FieldRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_fieldrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
