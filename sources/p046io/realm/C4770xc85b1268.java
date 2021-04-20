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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrentatype.talkingroom.RentState;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentStateRealmProxy */
public class C4770xc85b1268 extends RentState implements RealmObjectProxy, C4771x6b36afb1 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RentStateColumnInfo columnInfo;
    private ProxyState<RentState> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentStateRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RentState";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_RentStateRealmProxy$RentStateColumnInfo */
    static final class RentStateColumnInfo extends ColumnInfo {
        long displayNameIndex;
        long idIndex;
        long maxColumnIndexValue;
        long nameIndex;

        RentStateColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.displayNameIndex = addColumnDetails("displayName", "displayName", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        RentStateColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new RentStateColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            RentStateColumnInfo rentStateColumnInfo = (RentStateColumnInfo) columnInfo;
            RentStateColumnInfo rentStateColumnInfo2 = (RentStateColumnInfo) columnInfo2;
            rentStateColumnInfo2.idIndex = rentStateColumnInfo.idIndex;
            rentStateColumnInfo2.nameIndex = rentStateColumnInfo.nameIndex;
            rentStateColumnInfo2.displayNameIndex = rentStateColumnInfo.displayNameIndex;
            rentStateColumnInfo2.maxColumnIndexValue = rentStateColumnInfo.maxColumnIndexValue;
        }
    }

    C4770xc85b1268() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (RentStateColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.idIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.idIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.idIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
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

    public String realmGet$displayName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.displayNameIndex);
    }

    public void realmSet$displayName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.displayNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.displayNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.displayNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.displayNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("name", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("displayName", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RentStateColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new RentStateColumnInfo(osSchemaInfo);
    }

    public static RentState createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        RentState rentState = (RentState) realm.createObjectInternal(RentState.class, true, Collections.emptyList());
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState;
        if (jSONObject.has("id")) {
            if (jSONObject.isNull("id")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$id((Integer) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$id(Integer.valueOf(jSONObject.getInt("id")));
            }
        }
        if (jSONObject.has("name")) {
            if (jSONObject.isNull("name")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$name((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$name(jSONObject.getString("name"));
            }
        }
        if (jSONObject.has("displayName")) {
            if (jSONObject.isNull("displayName")) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$displayName((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$displayName(jSONObject.getString("displayName"));
            }
        }
        return rentState;
    }

    public static RentState createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        RentState rentState = new RentState();
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$id((Integer) null);
                }
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$name((String) null);
                }
            } else if (!nextName.equals("displayName")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$displayName(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$displayName((String) null);
            }
        }
        jsonReader.endObject();
        return (RentState) realm.copyToRealm(rentState, new ImportFlag[0]);
    }

    private static C4770xc85b1268 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class), false, Collections.emptyList());
        C4770xc85b1268 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxy = new C4770xc85b1268();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxy;
    }

    public static RentState copyOrUpdate(Realm realm, RentStateColumnInfo rentStateColumnInfo, RentState rentState, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (rentState instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentState;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return rentState;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(rentState);
        if (realmObjectProxy2 != null) {
            return (RentState) realmObjectProxy2;
        }
        return copy(realm, rentStateColumnInfo, rentState, z, map, set);
    }

    public static RentState copy(Realm realm, RentStateColumnInfo rentStateColumnInfo, RentState rentState, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(rentState);
        if (realmObjectProxy != null) {
            return (RentState) realmObjectProxy;
        }
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(RentState.class), rentStateColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(rentStateColumnInfo.idIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(rentStateColumnInfo.nameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(rentStateColumnInfo.displayNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$displayName());
        C4770xc85b1268 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(rentState, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, RentState rentState, Map<RealmModel, Long> map) {
        RentState rentState2 = rentState;
        if (rentState2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentState2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentState.class);
        long nativePtr = table.getNativePtr();
        RentStateColumnInfo rentStateColumnInfo = (RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class);
        long createRow = OsObject.createRow(table);
        map.put(rentState2, Long.valueOf(createRow));
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, rentStateColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, rentStateColumnInfo.nameIndex, createRow, realmGet$name, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, rentStateColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentState.class);
        long nativePtr = table.getNativePtr();
        RentStateColumnInfo rentStateColumnInfo = (RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class);
        while (it.hasNext()) {
            RentState rentState = (RentState) it.next();
            if (!map2.containsKey(rentState)) {
                if (rentState instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentState;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentState, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentState, Long.valueOf(createRow));
                C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, rentStateColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, rentStateColumnInfo.nameIndex, createRow, realmGet$name, false);
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, rentStateColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, RentState rentState, Map<RealmModel, Long> map) {
        RentState rentState2 = rentState;
        if (rentState2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentState2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(RentState.class);
        long nativePtr = table.getNativePtr();
        RentStateColumnInfo rentStateColumnInfo = (RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class);
        long createRow = OsObject.createRow(table);
        map.put(rentState2, Long.valueOf(createRow));
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState2;
        Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(nativePtr, rentStateColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, rentStateColumnInfo.idIndex, createRow, false);
        }
        String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, rentStateColumnInfo.nameIndex, createRow, realmGet$name, false);
        } else {
            Table.nativeSetNull(nativePtr, rentStateColumnInfo.nameIndex, createRow, false);
        }
        String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$displayName();
        if (realmGet$displayName != null) {
            Table.nativeSetString(nativePtr, rentStateColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
        } else {
            Table.nativeSetNull(nativePtr, rentStateColumnInfo.displayNameIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(RentState.class);
        long nativePtr = table.getNativePtr();
        RentStateColumnInfo rentStateColumnInfo = (RentStateColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RentState.class);
        while (it.hasNext()) {
            RentState rentState = (RentState) it.next();
            if (!map2.containsKey(rentState)) {
                if (rentState instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) rentState;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(rentState, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(rentState, Long.valueOf(createRow));
                C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState;
                Integer realmGet$id = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(nativePtr, rentStateColumnInfo.idIndex, createRow, realmGet$id.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, rentStateColumnInfo.idIndex, createRow, false);
                }
                String realmGet$name = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, rentStateColumnInfo.nameIndex, createRow, realmGet$name, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentStateColumnInfo.nameIndex, createRow, false);
                }
                String realmGet$displayName = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmGet$displayName();
                if (realmGet$displayName != null) {
                    Table.nativeSetString(nativePtr, rentStateColumnInfo.displayNameIndex, createRow, realmGet$displayName, false);
                } else {
                    Table.nativeSetNull(nativePtr, rentStateColumnInfo.displayNameIndex, createRow, false);
                }
            }
        }
    }

    public static RentState createDetachedCopy(RentState rentState, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        RentState rentState2;
        if (i > i2 || rentState == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(rentState);
        if (cacheData == null) {
            rentState2 = new RentState();
            map.put(rentState, new RealmObjectProxy.CacheData(i, rentState2));
        } else if (i >= cacheData.minDepth) {
            return (RentState) cacheData.object;
        } else {
            cacheData.minDepth = i;
            rentState2 = (RentState) cacheData.object;
        }
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface = rentState2;
        C4771x6b36afb1 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface2 = rentState;
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$id(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$name(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface2.realmGet$name());
        ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface.realmSet$displayName(ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxyinterface2.realmGet$displayName());
        return rentState2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("RentState = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{displayName:");
        if (realmGet$displayName() != null) {
            str = realmGet$displayName();
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
        C4770xc85b1268 ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxy = (C4770xc85b1268) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_myrentatype_talkingroom_rentstaterealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
