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
import p035ru.unicorn.ujin.data.realm.Action;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy */
public class ru_unicorn_ujin_data_realm_ActionRealmProxy extends Action implements RealmObjectProxy, ru_unicorn_ujin_data_realm_ActionRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ActionColumnInfo columnInfo;
    private ProxyState<Action> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Action";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_ActionRealmProxy$ActionColumnInfo */
    static final class ActionColumnInfo extends ColumnInfo {
        long actionNumberIndex;
        long actionTitleIndex;
        long actionTypeIndex;
        long maxColumnIndexValue;

        ActionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.actionTypeIndex = addColumnDetails("actionType", "actionType", objectSchemaInfo);
            this.actionTitleIndex = addColumnDetails("actionTitle", "actionTitle", objectSchemaInfo);
            this.actionNumberIndex = addColumnDetails("actionNumber", "actionNumber", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ActionColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ActionColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ActionColumnInfo actionColumnInfo = (ActionColumnInfo) columnInfo;
            ActionColumnInfo actionColumnInfo2 = (ActionColumnInfo) columnInfo2;
            actionColumnInfo2.actionTypeIndex = actionColumnInfo.actionTypeIndex;
            actionColumnInfo2.actionTitleIndex = actionColumnInfo.actionTitleIndex;
            actionColumnInfo2.actionNumberIndex = actionColumnInfo.actionNumberIndex;
            actionColumnInfo2.maxColumnIndexValue = actionColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_ActionRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ActionColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$actionType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionTypeIndex);
    }

    public void realmSet$actionType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionTypeIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$actionTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionTitleIndex);
    }

    public void realmSet$actionTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$actionNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.actionNumberIndex);
    }

    public void realmSet$actionNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.actionNumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.actionNumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.actionNumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.actionNumberIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("actionType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("actionTitle", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("actionNumber", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ActionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ActionColumnInfo(osSchemaInfo);
    }

    public static Action createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Action action = (Action) realm.createObjectInternal(Action.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
        if (jSONObject.has("actionType")) {
            if (jSONObject.isNull("actionType")) {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionType((String) null);
            } else {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionType(jSONObject.getString("actionType"));
            }
        }
        if (jSONObject.has("actionTitle")) {
            if (jSONObject.isNull("actionTitle")) {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionTitle((String) null);
            } else {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionTitle(jSONObject.getString("actionTitle"));
            }
        }
        if (jSONObject.has("actionNumber")) {
            if (jSONObject.isNull("actionNumber")) {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionNumber((String) null);
            } else {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionNumber(jSONObject.getString("actionNumber"));
            }
        }
        return action;
    }

    public static Action createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Action action = new Action();
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("actionType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionType((String) null);
                }
            } else if (nextName.equals("actionTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionTitle((String) null);
                }
            } else if (!nextName.equals("actionNumber")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionNumber(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionNumber((String) null);
            }
        }
        jsonReader.endObject();
        return (Action) realm.copyToRealm(action, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_ActionRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_ActionRealmProxy ru_unicorn_ujin_data_realm_actionrealmproxy = new ru_unicorn_ujin_data_realm_ActionRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_actionrealmproxy;
    }

    public static Action copyOrUpdate(Realm realm, ActionColumnInfo actionColumnInfo, Action action, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (action instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) action;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return action;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(action);
        if (realmObjectProxy2 != null) {
            return (Action) realmObjectProxy2;
        }
        return copy(realm, actionColumnInfo, action, z, map, set);
    }

    public static Action copy(Realm realm, ActionColumnInfo actionColumnInfo, Action action, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(action);
        if (realmObjectProxy != null) {
            return (Action) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Action.class), actionColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(actionColumnInfo.actionTypeIndex, ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionType());
        osObjectBuilder.addString(actionColumnInfo.actionTitleIndex, ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionTitle());
        osObjectBuilder.addString(actionColumnInfo.actionNumberIndex, ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionNumber());
        ru_unicorn_ujin_data_realm_ActionRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(action, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Action action, Map<RealmModel, Long> map) {
        if (action instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) action;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Action.class);
        long nativePtr = table.getNativePtr();
        ActionColumnInfo actionColumnInfo = (ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class);
        long createRow = OsObject.createRow(table);
        map.put(action, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
        String realmGet$actionType = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionType();
        if (realmGet$actionType != null) {
            Table.nativeSetString(nativePtr, actionColumnInfo.actionTypeIndex, createRow, realmGet$actionType, false);
        }
        String realmGet$actionTitle = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionTitle();
        if (realmGet$actionTitle != null) {
            Table.nativeSetString(nativePtr, actionColumnInfo.actionTitleIndex, createRow, realmGet$actionTitle, false);
        }
        String realmGet$actionNumber = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionNumber();
        if (realmGet$actionNumber != null) {
            Table.nativeSetString(nativePtr, actionColumnInfo.actionNumberIndex, createRow, realmGet$actionNumber, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Action.class);
        long nativePtr = table.getNativePtr();
        ActionColumnInfo actionColumnInfo = (ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class);
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (!map2.containsKey(action)) {
                if (action instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) action;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(action, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(action, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
                String realmGet$actionType = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionType();
                if (realmGet$actionType != null) {
                    Table.nativeSetString(nativePtr, actionColumnInfo.actionTypeIndex, createRow, realmGet$actionType, false);
                }
                String realmGet$actionTitle = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionTitle();
                if (realmGet$actionTitle != null) {
                    Table.nativeSetString(nativePtr, actionColumnInfo.actionTitleIndex, createRow, realmGet$actionTitle, false);
                }
                String realmGet$actionNumber = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionNumber();
                if (realmGet$actionNumber != null) {
                    Table.nativeSetString(nativePtr, actionColumnInfo.actionNumberIndex, createRow, realmGet$actionNumber, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Action action, Map<RealmModel, Long> map) {
        if (action instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) action;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Action.class);
        long nativePtr = table.getNativePtr();
        ActionColumnInfo actionColumnInfo = (ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class);
        long createRow = OsObject.createRow(table);
        map.put(action, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
        String realmGet$actionType = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionType();
        if (realmGet$actionType != null) {
            Table.nativeSetString(nativePtr, actionColumnInfo.actionTypeIndex, createRow, realmGet$actionType, false);
        } else {
            Table.nativeSetNull(nativePtr, actionColumnInfo.actionTypeIndex, createRow, false);
        }
        String realmGet$actionTitle = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionTitle();
        if (realmGet$actionTitle != null) {
            Table.nativeSetString(nativePtr, actionColumnInfo.actionTitleIndex, createRow, realmGet$actionTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, actionColumnInfo.actionTitleIndex, createRow, false);
        }
        String realmGet$actionNumber = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionNumber();
        if (realmGet$actionNumber != null) {
            Table.nativeSetString(nativePtr, actionColumnInfo.actionNumberIndex, createRow, realmGet$actionNumber, false);
        } else {
            Table.nativeSetNull(nativePtr, actionColumnInfo.actionNumberIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Action.class);
        long nativePtr = table.getNativePtr();
        ActionColumnInfo actionColumnInfo = (ActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Action.class);
        while (it.hasNext()) {
            Action action = (Action) it.next();
            if (!map2.containsKey(action)) {
                if (action instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) action;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(action, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(action, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action;
                String realmGet$actionType = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionType();
                if (realmGet$actionType != null) {
                    Table.nativeSetString(nativePtr, actionColumnInfo.actionTypeIndex, createRow, realmGet$actionType, false);
                } else {
                    Table.nativeSetNull(nativePtr, actionColumnInfo.actionTypeIndex, createRow, false);
                }
                String realmGet$actionTitle = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionTitle();
                if (realmGet$actionTitle != null) {
                    Table.nativeSetString(nativePtr, actionColumnInfo.actionTitleIndex, createRow, realmGet$actionTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, actionColumnInfo.actionTitleIndex, createRow, false);
                }
                String realmGet$actionNumber = ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmGet$actionNumber();
                if (realmGet$actionNumber != null) {
                    Table.nativeSetString(nativePtr, actionColumnInfo.actionNumberIndex, createRow, realmGet$actionNumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, actionColumnInfo.actionNumberIndex, createRow, false);
                }
            }
        }
    }

    public static Action createDetachedCopy(Action action, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Action action2;
        if (i > i2 || action == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(action);
        if (cacheData == null) {
            action2 = new Action();
            map.put(action, new RealmObjectProxy.CacheData(i, action2));
        } else if (i >= cacheData.minDepth) {
            return (Action) cacheData.object;
        } else {
            cacheData.minDepth = i;
            action2 = (Action) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface = action2;
        ru_unicorn_ujin_data_realm_ActionRealmProxyInterface ru_unicorn_ujin_data_realm_actionrealmproxyinterface2 = action;
        ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionType(ru_unicorn_ujin_data_realm_actionrealmproxyinterface2.realmGet$actionType());
        ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionTitle(ru_unicorn_ujin_data_realm_actionrealmproxyinterface2.realmGet$actionTitle());
        ru_unicorn_ujin_data_realm_actionrealmproxyinterface.realmSet$actionNumber(ru_unicorn_ujin_data_realm_actionrealmproxyinterface2.realmGet$actionNumber());
        return action2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Action = proxy[");
        sb.append("{actionType:");
        String str = "null";
        sb.append(realmGet$actionType() != null ? realmGet$actionType() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{actionTitle:");
        sb.append(realmGet$actionTitle() != null ? realmGet$actionTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{actionNumber:");
        if (realmGet$actionNumber() != null) {
            str = realmGet$actionNumber();
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
        ru_unicorn_ujin_data_realm_ActionRealmProxy ru_unicorn_ujin_data_realm_actionrealmproxy = (ru_unicorn_ujin_data_realm_ActionRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_actionrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_actionrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_actionrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
