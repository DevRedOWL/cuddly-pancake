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
import p035ru.unicorn.ujin.view.activity.navigation.entity.scenario.State;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_StateRealmProxy */
public class C4656xbdeaa6ca extends State implements RealmObjectProxy, C4657x400ae98f {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private StateColumnInfo columnInfo;
    private ProxyState<State> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_StateRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "State";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_entity_scenario_StateRealmProxy$StateColumnInfo */
    static final class StateColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long stateIndex;
        long whenIndex;

        StateColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.whenIndex = addColumnDetails("when", "when", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        StateColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new StateColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            StateColumnInfo stateColumnInfo = (StateColumnInfo) columnInfo;
            StateColumnInfo stateColumnInfo2 = (StateColumnInfo) columnInfo2;
            stateColumnInfo2.stateIndex = stateColumnInfo.stateIndex;
            stateColumnInfo2.whenIndex = stateColumnInfo.whenIndex;
            stateColumnInfo2.maxColumnIndexValue = stateColumnInfo.maxColumnIndexValue;
        }
    }

    C4656xbdeaa6ca() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (StateColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.stateIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.stateIndex));
    }

    public void realmSet$state(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.stateIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.stateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.stateIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$when() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.whenIndex);
    }

    public void realmSet$when(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.whenIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.whenIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.whenIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.whenIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("state", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("when", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StateColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new StateColumnInfo(osSchemaInfo);
    }

    public static State createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        State state = (State) realm.createObjectInternal(State.class, true, Collections.emptyList());
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state;
        if (jSONObject.has("state")) {
            if (jSONObject.isNull("state")) {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$state((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$state(Integer.valueOf(jSONObject.getInt("state")));
            }
        }
        if (jSONObject.has("when")) {
            if (jSONObject.isNull("when")) {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$when((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$when(jSONObject.getString("when"));
            }
        }
        return state;
    }

    public static State createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        State state = new State();
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("state")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$state(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$state((Integer) null);
                }
            } else if (!nextName.equals("when")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$when(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$when((String) null);
            }
        }
        jsonReader.endObject();
        return (State) realm.copyToRealm(state, new ImportFlag[0]);
    }

    private static C4656xbdeaa6ca newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class), false, Collections.emptyList());
        C4656xbdeaa6ca ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxy = new C4656xbdeaa6ca();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxy;
    }

    public static State copyOrUpdate(Realm realm, StateColumnInfo stateColumnInfo, State state, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (state instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) state;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return state;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(state);
        if (realmObjectProxy2 != null) {
            return (State) realmObjectProxy2;
        }
        return copy(realm, stateColumnInfo, state, z, map, set);
    }

    public static State copy(Realm realm, StateColumnInfo stateColumnInfo, State state, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(state);
        if (realmObjectProxy != null) {
            return (State) realmObjectProxy;
        }
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(State.class), stateColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(stateColumnInfo.stateIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$state());
        osObjectBuilder.addString(stateColumnInfo.whenIndex, ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$when());
        C4656xbdeaa6ca newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(state, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, State state, Map<RealmModel, Long> map) {
        State state2 = state;
        if (state2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) state2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(State.class);
        long nativePtr = table.getNativePtr();
        StateColumnInfo stateColumnInfo = (StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class);
        long createRow = OsObject.createRow(table);
        map.put(state2, Long.valueOf(createRow));
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state2;
        Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetLong(nativePtr, stateColumnInfo.stateIndex, createRow, realmGet$state.longValue(), false);
        }
        String realmGet$when = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$when();
        if (realmGet$when != null) {
            Table.nativeSetString(nativePtr, stateColumnInfo.whenIndex, createRow, realmGet$when, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(State.class);
        long nativePtr = table.getNativePtr();
        StateColumnInfo stateColumnInfo = (StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class);
        while (it.hasNext()) {
            State state = (State) it.next();
            if (!map2.containsKey(state)) {
                if (state instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) state;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(state, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(state, Long.valueOf(createRow));
                C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state;
                Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetLong(nativePtr, stateColumnInfo.stateIndex, createRow, realmGet$state.longValue(), false);
                }
                String realmGet$when = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$when();
                if (realmGet$when != null) {
                    Table.nativeSetString(nativePtr, stateColumnInfo.whenIndex, createRow, realmGet$when, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, State state, Map<RealmModel, Long> map) {
        State state2 = state;
        if (state2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) state2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(State.class);
        long nativePtr = table.getNativePtr();
        StateColumnInfo stateColumnInfo = (StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class);
        long createRow = OsObject.createRow(table);
        map.put(state2, Long.valueOf(createRow));
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state2;
        Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetLong(nativePtr, stateColumnInfo.stateIndex, createRow, realmGet$state.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, stateColumnInfo.stateIndex, createRow, false);
        }
        String realmGet$when = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$when();
        if (realmGet$when != null) {
            Table.nativeSetString(nativePtr, stateColumnInfo.whenIndex, createRow, realmGet$when, false);
        } else {
            Table.nativeSetNull(nativePtr, stateColumnInfo.whenIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(State.class);
        long nativePtr = table.getNativePtr();
        StateColumnInfo stateColumnInfo = (StateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) State.class);
        while (it.hasNext()) {
            State state = (State) it.next();
            if (!map2.containsKey(state)) {
                if (state instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) state;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(state, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(state, Long.valueOf(createRow));
                C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state;
                Integer realmGet$state = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetLong(nativePtr, stateColumnInfo.stateIndex, createRow, realmGet$state.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, stateColumnInfo.stateIndex, createRow, false);
                }
                String realmGet$when = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmGet$when();
                if (realmGet$when != null) {
                    Table.nativeSetString(nativePtr, stateColumnInfo.whenIndex, createRow, realmGet$when, false);
                } else {
                    Table.nativeSetNull(nativePtr, stateColumnInfo.whenIndex, createRow, false);
                }
            }
        }
    }

    public static State createDetachedCopy(State state, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        State state2;
        if (i > i2 || state == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(state);
        if (cacheData == null) {
            state2 = new State();
            map.put(state, new RealmObjectProxy.CacheData(i, state2));
        } else if (i >= cacheData.minDepth) {
            return (State) cacheData.object;
        } else {
            cacheData.minDepth = i;
            state2 = (State) cacheData.object;
        }
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface = state2;
        C4657x400ae98f ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface2 = state;
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$state(ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface2.realmGet$state());
        ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface.realmSet$when(ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxyinterface2.realmGet$when());
        return state2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("State = proxy[");
        sb.append("{state:");
        String str = "null";
        sb.append(realmGet$state() != null ? realmGet$state() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{when:");
        if (realmGet$when() != null) {
            str = realmGet$when();
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
        C4656xbdeaa6ca ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxy = (C4656xbdeaa6ca) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_entity_scenario_staterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
