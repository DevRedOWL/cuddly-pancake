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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mainsmart.section.MoreIconsInfo;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_MoreIconsInfoRealmProxy */
public class C4734x3e5f4d91 extends MoreIconsInfo implements RealmObjectProxy, C4735x8687f2a8 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private MoreIconsInfoColumnInfo columnInfo;
    private ProxyState<MoreIconsInfo> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_MoreIconsInfoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MoreIconsInfo";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_MoreIconsInfoRealmProxy$MoreIconsInfoColumnInfo */
    static final class MoreIconsInfoColumnInfo extends ColumnInfo {
        long dtIndex;
        long maxColumnIndexValue;
        long serialnumberIndex;
        long stateIndex;
        long stateMachineIndex;
        long titleIndex;

        MoreIconsInfoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.serialnumberIndex = addColumnDetails("serialnumber", "serialnumber", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.stateIndex = addColumnDetails("state", "state", objectSchemaInfo);
            this.stateMachineIndex = addColumnDetails("stateMachine", "stateMachine", objectSchemaInfo);
            this.dtIndex = addColumnDetails("dt", "dt", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        MoreIconsInfoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new MoreIconsInfoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            MoreIconsInfoColumnInfo moreIconsInfoColumnInfo = (MoreIconsInfoColumnInfo) columnInfo;
            MoreIconsInfoColumnInfo moreIconsInfoColumnInfo2 = (MoreIconsInfoColumnInfo) columnInfo2;
            moreIconsInfoColumnInfo2.serialnumberIndex = moreIconsInfoColumnInfo.serialnumberIndex;
            moreIconsInfoColumnInfo2.titleIndex = moreIconsInfoColumnInfo.titleIndex;
            moreIconsInfoColumnInfo2.stateIndex = moreIconsInfoColumnInfo.stateIndex;
            moreIconsInfoColumnInfo2.stateMachineIndex = moreIconsInfoColumnInfo.stateMachineIndex;
            moreIconsInfoColumnInfo2.dtIndex = moreIconsInfoColumnInfo.dtIndex;
            moreIconsInfoColumnInfo2.maxColumnIndexValue = moreIconsInfoColumnInfo.maxColumnIndexValue;
        }
    }

    C4734x3e5f4d91() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (MoreIconsInfoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$serialnumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.serialnumberIndex);
    }

    public void realmSet$serialnumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.serialnumberIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.serialnumberIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.serialnumberIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.serialnumberIndex, row$realm.getIndex(), str, true);
            }
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

    public String realmGet$state() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateIndex);
    }

    public void realmSet$state(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$stateMachine() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.stateMachineIndex);
    }

    public void realmSet$stateMachine(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.stateMachineIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.stateMachineIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.stateMachineIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.stateMachineIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$dt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.dtIndex);
    }

    public void realmSet$dt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.dtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.dtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.dtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.dtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("serialnumber", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("state", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("stateMachine", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("dt", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MoreIconsInfoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new MoreIconsInfoColumnInfo(osSchemaInfo);
    }

    public static MoreIconsInfo createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        MoreIconsInfo moreIconsInfo = (MoreIconsInfo) realm.createObjectInternal(MoreIconsInfo.class, true, Collections.emptyList());
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
        if (jSONObject.has("serialnumber")) {
            if (jSONObject.isNull("serialnumber")) {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$serialnumber((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$serialnumber(jSONObject.getString("serialnumber"));
            }
        }
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("state")) {
            if (jSONObject.isNull("state")) {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$state((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$state(jSONObject.getString("state"));
            }
        }
        if (jSONObject.has("stateMachine")) {
            if (jSONObject.isNull("stateMachine")) {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$stateMachine((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$stateMachine(jSONObject.getString("stateMachine"));
            }
        }
        if (jSONObject.has("dt")) {
            if (jSONObject.isNull("dt")) {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$dt((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$dt(jSONObject.getString("dt"));
            }
        }
        return moreIconsInfo;
    }

    public static MoreIconsInfo createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        MoreIconsInfo moreIconsInfo = new MoreIconsInfo();
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("serialnumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$serialnumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$serialnumber((String) null);
                }
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("state")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$state(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$state((String) null);
                }
            } else if (nextName.equals("stateMachine")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$stateMachine(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$stateMachine((String) null);
                }
            } else if (!nextName.equals("dt")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$dt(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$dt((String) null);
            }
        }
        jsonReader.endObject();
        return (MoreIconsInfo) realm.copyToRealm(moreIconsInfo, new ImportFlag[0]);
    }

    private static C4734x3e5f4d91 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) MoreIconsInfo.class), false, Collections.emptyList());
        C4734x3e5f4d91 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxy = new C4734x3e5f4d91();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxy;
    }

    public static MoreIconsInfo copyOrUpdate(Realm realm, MoreIconsInfoColumnInfo moreIconsInfoColumnInfo, MoreIconsInfo moreIconsInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (moreIconsInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) moreIconsInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return moreIconsInfo;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(moreIconsInfo);
        if (realmObjectProxy2 != null) {
            return (MoreIconsInfo) realmObjectProxy2;
        }
        return copy(realm, moreIconsInfoColumnInfo, moreIconsInfo, z, map, set);
    }

    public static MoreIconsInfo copy(Realm realm, MoreIconsInfoColumnInfo moreIconsInfoColumnInfo, MoreIconsInfo moreIconsInfo, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(moreIconsInfo);
        if (realmObjectProxy != null) {
            return (MoreIconsInfo) realmObjectProxy;
        }
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(MoreIconsInfo.class), moreIconsInfoColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(moreIconsInfoColumnInfo.serialnumberIndex, ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$serialnumber());
        osObjectBuilder.addString(moreIconsInfoColumnInfo.titleIndex, ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(moreIconsInfoColumnInfo.stateIndex, ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$state());
        osObjectBuilder.addString(moreIconsInfoColumnInfo.stateMachineIndex, ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$stateMachine());
        osObjectBuilder.addString(moreIconsInfoColumnInfo.dtIndex, ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$dt());
        C4734x3e5f4d91 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(moreIconsInfo, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, MoreIconsInfo moreIconsInfo, Map<RealmModel, Long> map) {
        if (moreIconsInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) moreIconsInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(MoreIconsInfo.class);
        long nativePtr = table.getNativePtr();
        MoreIconsInfoColumnInfo moreIconsInfoColumnInfo = (MoreIconsInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MoreIconsInfo.class);
        long createRow = OsObject.createRow(table);
        map.put(moreIconsInfo, Long.valueOf(createRow));
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
        String realmGet$serialnumber = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$serialnumber();
        if (realmGet$serialnumber != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.serialnumberIndex, createRow, realmGet$serialnumber, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateIndex, createRow, realmGet$state, false);
        }
        String realmGet$stateMachine = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$stateMachine();
        if (realmGet$stateMachine != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateMachineIndex, createRow, realmGet$stateMachine, false);
        }
        String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.dtIndex, createRow, realmGet$dt, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(MoreIconsInfo.class);
        long nativePtr = table.getNativePtr();
        MoreIconsInfoColumnInfo moreIconsInfoColumnInfo = (MoreIconsInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MoreIconsInfo.class);
        while (it.hasNext()) {
            MoreIconsInfo moreIconsInfo = (MoreIconsInfo) it.next();
            if (!map2.containsKey(moreIconsInfo)) {
                if (moreIconsInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) moreIconsInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(moreIconsInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(moreIconsInfo, Long.valueOf(createRow));
                C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
                String realmGet$serialnumber = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$serialnumber();
                if (realmGet$serialnumber != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.serialnumberIndex, createRow, realmGet$serialnumber, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateIndex, createRow, realmGet$state, false);
                }
                String realmGet$stateMachine = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$stateMachine();
                if (realmGet$stateMachine != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateMachineIndex, createRow, realmGet$stateMachine, false);
                }
                String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$dt();
                if (realmGet$dt != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.dtIndex, createRow, realmGet$dt, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, MoreIconsInfo moreIconsInfo, Map<RealmModel, Long> map) {
        if (moreIconsInfo instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) moreIconsInfo;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(MoreIconsInfo.class);
        long nativePtr = table.getNativePtr();
        MoreIconsInfoColumnInfo moreIconsInfoColumnInfo = (MoreIconsInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MoreIconsInfo.class);
        long createRow = OsObject.createRow(table);
        map.put(moreIconsInfo, Long.valueOf(createRow));
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
        String realmGet$serialnumber = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$serialnumber();
        if (realmGet$serialnumber != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.serialnumberIndex, createRow, realmGet$serialnumber, false);
        } else {
            Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.serialnumberIndex, createRow, false);
        }
        String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$state();
        if (realmGet$state != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateIndex, createRow, realmGet$state, false);
        } else {
            Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.stateIndex, createRow, false);
        }
        String realmGet$stateMachine = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$stateMachine();
        if (realmGet$stateMachine != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateMachineIndex, createRow, realmGet$stateMachine, false);
        } else {
            Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.stateMachineIndex, createRow, false);
        }
        String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$dt();
        if (realmGet$dt != null) {
            Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.dtIndex, createRow, realmGet$dt, false);
        } else {
            Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.dtIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(MoreIconsInfo.class);
        long nativePtr = table.getNativePtr();
        MoreIconsInfoColumnInfo moreIconsInfoColumnInfo = (MoreIconsInfoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) MoreIconsInfo.class);
        while (it.hasNext()) {
            MoreIconsInfo moreIconsInfo = (MoreIconsInfo) it.next();
            if (!map2.containsKey(moreIconsInfo)) {
                if (moreIconsInfo instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) moreIconsInfo;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(moreIconsInfo, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(moreIconsInfo, Long.valueOf(createRow));
                C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo;
                String realmGet$serialnumber = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$serialnumber();
                if (realmGet$serialnumber != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.serialnumberIndex, createRow, realmGet$serialnumber, false);
                } else {
                    Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.serialnumberIndex, createRow, false);
                }
                String realmGet$title = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$state = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$state();
                if (realmGet$state != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateIndex, createRow, realmGet$state, false);
                } else {
                    Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.stateIndex, createRow, false);
                }
                String realmGet$stateMachine = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$stateMachine();
                if (realmGet$stateMachine != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.stateMachineIndex, createRow, realmGet$stateMachine, false);
                } else {
                    Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.stateMachineIndex, createRow, false);
                }
                String realmGet$dt = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmGet$dt();
                if (realmGet$dt != null) {
                    Table.nativeSetString(nativePtr, moreIconsInfoColumnInfo.dtIndex, createRow, realmGet$dt, false);
                } else {
                    Table.nativeSetNull(nativePtr, moreIconsInfoColumnInfo.dtIndex, createRow, false);
                }
            }
        }
    }

    public static MoreIconsInfo createDetachedCopy(MoreIconsInfo moreIconsInfo, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        MoreIconsInfo moreIconsInfo2;
        if (i > i2 || moreIconsInfo == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(moreIconsInfo);
        if (cacheData == null) {
            moreIconsInfo2 = new MoreIconsInfo();
            map.put(moreIconsInfo, new RealmObjectProxy.CacheData(i, moreIconsInfo2));
        } else if (i >= cacheData.minDepth) {
            return (MoreIconsInfo) cacheData.object;
        } else {
            cacheData.minDepth = i;
            moreIconsInfo2 = (MoreIconsInfo) cacheData.object;
        }
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface = moreIconsInfo2;
        C4735x8687f2a8 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface2 = moreIconsInfo;
        ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$serialnumber(ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface2.realmGet$serialnumber());
        ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$title(ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$state(ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface2.realmGet$state());
        ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$stateMachine(ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface2.realmGet$stateMachine());
        ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface.realmSet$dt(ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxyinterface2.realmGet$dt());
        return moreIconsInfo2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("MoreIconsInfo = proxy[");
        sb.append("{serialnumber:");
        String str = "null";
        sb.append(realmGet$serialnumber() != null ? realmGet$serialnumber() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{state:");
        sb.append(realmGet$state() != null ? realmGet$state() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{stateMachine:");
        sb.append(realmGet$stateMachine() != null ? realmGet$stateMachine() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{dt:");
        if (realmGet$dt() != null) {
            str = realmGet$dt();
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
        C4734x3e5f4d91 ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxy = (C4734x3e5f4d91) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_mainsmart_section_moreiconsinforealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
