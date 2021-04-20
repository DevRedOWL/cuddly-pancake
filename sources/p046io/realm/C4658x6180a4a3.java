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
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.DialogButtons;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_DialogButtonsRealmProxy */
public class C4658x6180a4a3 extends DialogButtons implements RealmObjectProxy, C4659x7b226fd6 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private DialogButtonsColumnInfo columnInfo;
    private ProxyState<DialogButtons> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_DialogButtonsRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DialogButtons";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_schema_DialogButtonsRealmProxy$DialogButtonsColumnInfo */
    static final class DialogButtonsColumnInfo extends ColumnInfo {
        long actionIndex;
        long actionValueIndex;
        long maxColumnIndexValue;
        long nameIndex;

        DialogButtonsColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.actionIndex = addColumnDetails("action", "action", objectSchemaInfo);
            this.actionValueIndex = addColumnDetails("actionValue", "actionValue", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        DialogButtonsColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new DialogButtonsColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            DialogButtonsColumnInfo dialogButtonsColumnInfo = (DialogButtonsColumnInfo) columnInfo;
            DialogButtonsColumnInfo dialogButtonsColumnInfo2 = (DialogButtonsColumnInfo) columnInfo2;
            dialogButtonsColumnInfo2.nameIndex = dialogButtonsColumnInfo.nameIndex;
            dialogButtonsColumnInfo2.actionIndex = dialogButtonsColumnInfo.actionIndex;
            dialogButtonsColumnInfo2.actionValueIndex = dialogButtonsColumnInfo.actionValueIndex;
            dialogButtonsColumnInfo2.maxColumnIndexValue = dialogButtonsColumnInfo.maxColumnIndexValue;
        }
    }

    C4658x6180a4a3() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (DialogButtonsColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$action() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionIndex);
    }

    public void realmSet$action(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$actionValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionValueIndex);
    }

    public void realmSet$actionValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionValueIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionValueIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionValueIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionValueIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("action", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("actionValue", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DialogButtonsColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new DialogButtonsColumnInfo(osSchemaInfo);
    }

    public static DialogButtons createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        DialogButtons dialogButtons = (DialogButtons) realm.createObjectInternal(DialogButtons.class, true, Collections.emptyList());
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("action")) {
            if (jSONObject.isNull("action")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$action((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$action(jSONObject.getString("action"));
            }
        }
        if (jSONObject.has("actionValue")) {
            if (jSONObject.isNull("actionValue")) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$actionValue((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$actionValue(jSONObject.getString("actionValue"));
            }
        }
        return dialogButtons;
    }

    public static DialogButtons createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        DialogButtons dialogButtons = new DialogButtons();
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("action")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$action(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$action((String) null);
                }
            } else if (!nextName.equals("actionValue")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$actionValue(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$actionValue((String) null);
            }
        }
        jsonReader.endObject();
        return (DialogButtons) realm.copyToRealm(dialogButtons, new ImportFlag[0]);
    }

    private static C4658x6180a4a3 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class), false, Collections.emptyList());
        C4658x6180a4a3 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxy = new C4658x6180a4a3();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxy;
    }

    public static DialogButtons copyOrUpdate(Realm realm, DialogButtonsColumnInfo dialogButtonsColumnInfo, DialogButtons dialogButtons, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (dialogButtons instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) dialogButtons;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return dialogButtons;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(dialogButtons);
        if (realmObjectProxy2 != null) {
            return (DialogButtons) realmObjectProxy2;
        }
        return copy(realm, dialogButtonsColumnInfo, dialogButtons, z, map, set);
    }

    public static DialogButtons copy(Realm realm, DialogButtonsColumnInfo dialogButtonsColumnInfo, DialogButtons dialogButtons, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(dialogButtons);
        if (realmObjectProxy != null) {
            return (DialogButtons) realmObjectProxy;
        }
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(DialogButtons.class), dialogButtonsColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(dialogButtonsColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(dialogButtonsColumnInfo.actionIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$action());
        osObjectBuilder.addString(dialogButtonsColumnInfo.actionValueIndex, ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$actionValue());
        C4658x6180a4a3 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(dialogButtons, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, DialogButtons dialogButtons, Map<RealmModel, Long> map) {
        if (dialogButtons instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) dialogButtons;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DialogButtons.class);
        long nativePtr = table.getNativePtr();
        DialogButtonsColumnInfo dialogButtonsColumnInfo = (DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class);
        long createRow = OsObject.createRow(table);
        map.put(dialogButtons, Long.valueOf(createRow));
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$action();
        if (realmGet$action != null) {
            Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionIndex, createRow, realmGet$action, false);
        }
        String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$actionValue();
        if (realmGet$actionValue != null) {
            Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionValueIndex, createRow, realmGet$actionValue, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DialogButtons.class);
        long nativePtr = table.getNativePtr();
        DialogButtonsColumnInfo dialogButtonsColumnInfo = (DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class);
        while (it.hasNext()) {
            DialogButtons dialogButtons = (DialogButtons) it.next();
            if (!map2.containsKey(dialogButtons)) {
                if (dialogButtons instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) dialogButtons;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(dialogButtons, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(dialogButtons, Long.valueOf(createRow));
                C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$action();
                if (realmGet$action != null) {
                    Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionIndex, createRow, realmGet$action, false);
                }
                String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$actionValue();
                if (realmGet$actionValue != null) {
                    Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionValueIndex, createRow, realmGet$actionValue, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, DialogButtons dialogButtons, Map<RealmModel, Long> map) {
        if (dialogButtons instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) dialogButtons;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(DialogButtons.class);
        long nativePtr = table.getNativePtr();
        DialogButtonsColumnInfo dialogButtonsColumnInfo = (DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class);
        long createRow = OsObject.createRow(table);
        map.put(dialogButtons, Long.valueOf(createRow));
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, dialogButtonsColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$action();
        if (realmGet$action != null) {
            Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionIndex, createRow, realmGet$action, false);
        } else {
            Table.nativeSetNull(nativePtr, dialogButtonsColumnInfo.actionIndex, createRow, false);
        }
        String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$actionValue();
        if (realmGet$actionValue != null) {
            Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionValueIndex, createRow, realmGet$actionValue, false);
        } else {
            Table.nativeSetNull(nativePtr, dialogButtonsColumnInfo.actionValueIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(DialogButtons.class);
        long nativePtr = table.getNativePtr();
        DialogButtonsColumnInfo dialogButtonsColumnInfo = (DialogButtonsColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) DialogButtons.class);
        while (it.hasNext()) {
            DialogButtons dialogButtons = (DialogButtons) it.next();
            if (!map2.containsKey(dialogButtons)) {
                if (dialogButtons instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) dialogButtons;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(dialogButtons, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(dialogButtons, Long.valueOf(createRow));
                C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons;
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, dialogButtonsColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$action = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$action();
                if (realmGet$action != null) {
                    Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionIndex, createRow, realmGet$action, false);
                } else {
                    Table.nativeSetNull(nativePtr, dialogButtonsColumnInfo.actionIndex, createRow, false);
                }
                String realmGet$actionValue = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmGet$actionValue();
                if (realmGet$actionValue != null) {
                    Table.nativeSetString(nativePtr, dialogButtonsColumnInfo.actionValueIndex, createRow, realmGet$actionValue, false);
                } else {
                    Table.nativeSetNull(nativePtr, dialogButtonsColumnInfo.actionValueIndex, createRow, false);
                }
            }
        }
    }

    public static DialogButtons createDetachedCopy(DialogButtons dialogButtons, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        DialogButtons dialogButtons2;
        if (i > i2 || dialogButtons == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(dialogButtons);
        if (cacheData == null) {
            dialogButtons2 = new DialogButtons();
            map.put(dialogButtons, new RealmObjectProxy.CacheData(i, dialogButtons2));
        } else if (i >= cacheData.minDepth) {
            return (DialogButtons) cacheData.object;
        } else {
            cacheData.minDepth = i;
            dialogButtons2 = (DialogButtons) cacheData.object;
        }
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface = dialogButtons2;
        C4659x7b226fd6 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface2 = dialogButtons;
        ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$action(ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface2.realmGet$action());
        ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface.realmSet$actionValue(ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxyinterface2.realmGet$actionValue());
        return dialogButtons2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("DialogButtons = proxy[");
        sb.append("{name:");
        String str = "null";
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{action:");
        sb.append(realmGet$action() != null ? realmGet$action() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{actionValue:");
        if (realmGet$actionValue() != null) {
            str = realmGet$actionValue();
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
        C4658x6180a4a3 ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxy = (C4658x6180a4a3) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_schema_dialogbuttonsrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
