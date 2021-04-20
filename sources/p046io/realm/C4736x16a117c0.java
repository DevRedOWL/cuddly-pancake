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
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.measures.ActualCountersData;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_measures_ActualCountersDataRealmProxy */
public class C4736x16a117c0 extends ActualCountersData implements RealmObjectProxy, C4737x34252d59 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private ActualCountersDataColumnInfo columnInfo;
    private ProxyState<ActualCountersData> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_measures_ActualCountersDataRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "ActualCountersData";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_view_activity_navigation_ui_measures_ActualCountersDataRealmProxy$ActualCountersDataColumnInfo */
    static final class ActualCountersDataColumnInfo extends ColumnInfo {
        long buttonNameIndex;
        long errorMessageIndex;
        long hasAutomatedCommercialAccountingSystemIndex;
        long maxColumnIndexValue;
        long notificationIndex;
        long showButtonIndex;

        ActualCountersDataColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.showButtonIndex = addColumnDetails("showButton", "showButton", objectSchemaInfo);
            this.notificationIndex = addColumnDetails("notification", "notification", objectSchemaInfo);
            this.buttonNameIndex = addColumnDetails("buttonName", "buttonName", objectSchemaInfo);
            this.hasAutomatedCommercialAccountingSystemIndex = addColumnDetails("hasAutomatedCommercialAccountingSystem", "hasAutomatedCommercialAccountingSystem", objectSchemaInfo);
            this.errorMessageIndex = addColumnDetails("errorMessage", "errorMessage", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        ActualCountersDataColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new ActualCountersDataColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            ActualCountersDataColumnInfo actualCountersDataColumnInfo = (ActualCountersDataColumnInfo) columnInfo;
            ActualCountersDataColumnInfo actualCountersDataColumnInfo2 = (ActualCountersDataColumnInfo) columnInfo2;
            actualCountersDataColumnInfo2.showButtonIndex = actualCountersDataColumnInfo.showButtonIndex;
            actualCountersDataColumnInfo2.notificationIndex = actualCountersDataColumnInfo.notificationIndex;
            actualCountersDataColumnInfo2.buttonNameIndex = actualCountersDataColumnInfo.buttonNameIndex;
            actualCountersDataColumnInfo2.hasAutomatedCommercialAccountingSystemIndex = actualCountersDataColumnInfo.hasAutomatedCommercialAccountingSystemIndex;
            actualCountersDataColumnInfo2.errorMessageIndex = actualCountersDataColumnInfo.errorMessageIndex;
            actualCountersDataColumnInfo2.maxColumnIndexValue = actualCountersDataColumnInfo.maxColumnIndexValue;
        }
    }

    C4736x16a117c0() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (ActualCountersDataColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public boolean realmGet$showButton() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.showButtonIndex);
    }

    public void realmSet$showButton(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.showButtonIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.showButtonIndex, row$realm.getIndex(), z, true);
        }
    }

    public String realmGet$notification() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.notificationIndex);
    }

    public void realmSet$notification(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.notificationIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.notificationIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.notificationIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.notificationIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$buttonName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.buttonNameIndex);
    }

    public void realmSet$buttonName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buttonNameIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.buttonNameIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.buttonNameIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.buttonNameIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public boolean realmGet$hasAutomatedCommercialAccountingSystem() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.hasAutomatedCommercialAccountingSystemIndex);
    }

    public void realmSet$hasAutomatedCommercialAccountingSystem(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.hasAutomatedCommercialAccountingSystemIndex, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.hasAutomatedCommercialAccountingSystemIndex, row$realm.getIndex(), z, true);
        }
    }

    public String realmGet$errorMessage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.errorMessageIndex);
    }

    public void realmSet$errorMessage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.errorMessageIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.errorMessageIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.errorMessageIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.errorMessageIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("showButton", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty("notification", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buttonName", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("hasAutomatedCommercialAccountingSystem", RealmFieldType.BOOLEAN, false, false, true);
        builder2.addPersistedProperty("errorMessage", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ActualCountersDataColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new ActualCountersDataColumnInfo(osSchemaInfo);
    }

    public static ActualCountersData createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ActualCountersData actualCountersData = (ActualCountersData) realm.createObjectInternal(ActualCountersData.class, true, Collections.emptyList());
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
        if (jSONObject.has("showButton")) {
            if (!jSONObject.isNull("showButton")) {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$showButton(jSONObject.getBoolean("showButton"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'showButton' to null.");
            }
        }
        if (jSONObject.has("notification")) {
            if (jSONObject.isNull("notification")) {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$notification((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$notification(jSONObject.getString("notification"));
            }
        }
        if (jSONObject.has("buttonName")) {
            if (jSONObject.isNull("buttonName")) {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$buttonName((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$buttonName(jSONObject.getString("buttonName"));
            }
        }
        if (jSONObject.has("hasAutomatedCommercialAccountingSystem")) {
            if (!jSONObject.isNull("hasAutomatedCommercialAccountingSystem")) {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$hasAutomatedCommercialAccountingSystem(jSONObject.getBoolean("hasAutomatedCommercialAccountingSystem"));
            } else {
                throw new IllegalArgumentException("Trying to set non-nullable field 'hasAutomatedCommercialAccountingSystem' to null.");
            }
        }
        if (jSONObject.has("errorMessage")) {
            if (jSONObject.isNull("errorMessage")) {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$errorMessage((String) null);
            } else {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$errorMessage(jSONObject.getString("errorMessage"));
            }
        }
        return actualCountersData;
    }

    public static ActualCountersData createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        ActualCountersData actualCountersData = new ActualCountersData();
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("showButton")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$showButton(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'showButton' to null.");
                }
            } else if (nextName.equals("notification")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$notification(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$notification((String) null);
                }
            } else if (nextName.equals("buttonName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$buttonName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$buttonName((String) null);
                }
            } else if (nextName.equals("hasAutomatedCommercialAccountingSystem")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$hasAutomatedCommercialAccountingSystem(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'hasAutomatedCommercialAccountingSystem' to null.");
                }
            } else if (!nextName.equals("errorMessage")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$errorMessage(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$errorMessage((String) null);
            }
        }
        jsonReader.endObject();
        return (ActualCountersData) realm.copyToRealm(actualCountersData, new ImportFlag[0]);
    }

    private static C4736x16a117c0 newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) ActualCountersData.class), false, Collections.emptyList());
        C4736x16a117c0 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxy = new C4736x16a117c0();
        realmObjectContext.clear();
        return ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxy;
    }

    public static ActualCountersData copyOrUpdate(Realm realm, ActualCountersDataColumnInfo actualCountersDataColumnInfo, ActualCountersData actualCountersData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (actualCountersData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) actualCountersData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return actualCountersData;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(actualCountersData);
        if (realmObjectProxy2 != null) {
            return (ActualCountersData) realmObjectProxy2;
        }
        return copy(realm, actualCountersDataColumnInfo, actualCountersData, z, map, set);
    }

    public static ActualCountersData copy(Realm realm, ActualCountersDataColumnInfo actualCountersDataColumnInfo, ActualCountersData actualCountersData, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(actualCountersData);
        if (realmObjectProxy != null) {
            return (ActualCountersData) realmObjectProxy;
        }
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(ActualCountersData.class), actualCountersDataColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addBoolean(actualCountersDataColumnInfo.showButtonIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$showButton()));
        osObjectBuilder.addString(actualCountersDataColumnInfo.notificationIndex, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$notification());
        osObjectBuilder.addString(actualCountersDataColumnInfo.buttonNameIndex, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$buttonName());
        osObjectBuilder.addBoolean(actualCountersDataColumnInfo.hasAutomatedCommercialAccountingSystemIndex, Boolean.valueOf(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$hasAutomatedCommercialAccountingSystem()));
        osObjectBuilder.addString(actualCountersDataColumnInfo.errorMessageIndex, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$errorMessage());
        C4736x16a117c0 newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(actualCountersData, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, ActualCountersData actualCountersData, Map<RealmModel, Long> map) {
        if (actualCountersData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) actualCountersData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ActualCountersData.class);
        long nativePtr = table.getNativePtr();
        ActualCountersDataColumnInfo actualCountersDataColumnInfo = (ActualCountersDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ActualCountersData.class);
        long createRow = OsObject.createRow(table);
        map.put(actualCountersData, Long.valueOf(createRow));
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
        Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.showButtonIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$showButton(), false);
        String realmGet$notification = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$notification();
        if (realmGet$notification != null) {
            Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.notificationIndex, createRow, realmGet$notification, false);
        }
        String realmGet$buttonName = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$buttonName();
        if (realmGet$buttonName != null) {
            Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.buttonNameIndex, createRow, realmGet$buttonName, false);
        }
        Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.hasAutomatedCommercialAccountingSystemIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$hasAutomatedCommercialAccountingSystem(), false);
        String realmGet$errorMessage = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$errorMessage();
        if (realmGet$errorMessage != null) {
            Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.errorMessageIndex, createRow, realmGet$errorMessage, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ActualCountersData.class);
        long nativePtr = table.getNativePtr();
        ActualCountersDataColumnInfo actualCountersDataColumnInfo = (ActualCountersDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ActualCountersData.class);
        while (it.hasNext()) {
            ActualCountersData actualCountersData = (ActualCountersData) it.next();
            if (!map2.containsKey(actualCountersData)) {
                if (actualCountersData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) actualCountersData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(actualCountersData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(actualCountersData, Long.valueOf(createRow));
                C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
                Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.showButtonIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$showButton(), false);
                String realmGet$notification = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$notification();
                if (realmGet$notification != null) {
                    Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.notificationIndex, createRow, realmGet$notification, false);
                }
                String realmGet$buttonName = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$buttonName();
                if (realmGet$buttonName != null) {
                    Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.buttonNameIndex, createRow, realmGet$buttonName, false);
                }
                Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.hasAutomatedCommercialAccountingSystemIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$hasAutomatedCommercialAccountingSystem(), false);
                String realmGet$errorMessage = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$errorMessage();
                if (realmGet$errorMessage != null) {
                    Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.errorMessageIndex, createRow, realmGet$errorMessage, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, ActualCountersData actualCountersData, Map<RealmModel, Long> map) {
        if (actualCountersData instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) actualCountersData;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(ActualCountersData.class);
        long nativePtr = table.getNativePtr();
        ActualCountersDataColumnInfo actualCountersDataColumnInfo = (ActualCountersDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ActualCountersData.class);
        long createRow = OsObject.createRow(table);
        map.put(actualCountersData, Long.valueOf(createRow));
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
        Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.showButtonIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$showButton(), false);
        String realmGet$notification = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$notification();
        if (realmGet$notification != null) {
            Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.notificationIndex, createRow, realmGet$notification, false);
        } else {
            Table.nativeSetNull(nativePtr, actualCountersDataColumnInfo.notificationIndex, createRow, false);
        }
        String realmGet$buttonName = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$buttonName();
        if (realmGet$buttonName != null) {
            Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.buttonNameIndex, createRow, realmGet$buttonName, false);
        } else {
            Table.nativeSetNull(nativePtr, actualCountersDataColumnInfo.buttonNameIndex, createRow, false);
        }
        Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.hasAutomatedCommercialAccountingSystemIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$hasAutomatedCommercialAccountingSystem(), false);
        String realmGet$errorMessage = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$errorMessage();
        if (realmGet$errorMessage != null) {
            Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.errorMessageIndex, createRow, realmGet$errorMessage, false);
        } else {
            Table.nativeSetNull(nativePtr, actualCountersDataColumnInfo.errorMessageIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(ActualCountersData.class);
        long nativePtr = table.getNativePtr();
        ActualCountersDataColumnInfo actualCountersDataColumnInfo = (ActualCountersDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) ActualCountersData.class);
        while (it.hasNext()) {
            ActualCountersData actualCountersData = (ActualCountersData) it.next();
            if (!map2.containsKey(actualCountersData)) {
                if (actualCountersData instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) actualCountersData;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(actualCountersData, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(actualCountersData, Long.valueOf(createRow));
                C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData;
                Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.showButtonIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$showButton(), false);
                String realmGet$notification = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$notification();
                if (realmGet$notification != null) {
                    Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.notificationIndex, createRow, realmGet$notification, false);
                } else {
                    Table.nativeSetNull(nativePtr, actualCountersDataColumnInfo.notificationIndex, createRow, false);
                }
                String realmGet$buttonName = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$buttonName();
                if (realmGet$buttonName != null) {
                    Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.buttonNameIndex, createRow, realmGet$buttonName, false);
                } else {
                    Table.nativeSetNull(nativePtr, actualCountersDataColumnInfo.buttonNameIndex, createRow, false);
                }
                Table.nativeSetBoolean(nativePtr, actualCountersDataColumnInfo.hasAutomatedCommercialAccountingSystemIndex, createRow, ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$hasAutomatedCommercialAccountingSystem(), false);
                String realmGet$errorMessage = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmGet$errorMessage();
                if (realmGet$errorMessage != null) {
                    Table.nativeSetString(nativePtr, actualCountersDataColumnInfo.errorMessageIndex, createRow, realmGet$errorMessage, false);
                } else {
                    Table.nativeSetNull(nativePtr, actualCountersDataColumnInfo.errorMessageIndex, createRow, false);
                }
            }
        }
    }

    public static ActualCountersData createDetachedCopy(ActualCountersData actualCountersData, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        ActualCountersData actualCountersData2;
        if (i > i2 || actualCountersData == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(actualCountersData);
        if (cacheData == null) {
            actualCountersData2 = new ActualCountersData();
            map.put(actualCountersData, new RealmObjectProxy.CacheData(i, actualCountersData2));
        } else if (i >= cacheData.minDepth) {
            return (ActualCountersData) cacheData.object;
        } else {
            cacheData.minDepth = i;
            actualCountersData2 = (ActualCountersData) cacheData.object;
        }
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface = actualCountersData2;
        C4737x34252d59 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface2 = actualCountersData;
        ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$showButton(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface2.realmGet$showButton());
        ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$notification(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface2.realmGet$notification());
        ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$buttonName(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface2.realmGet$buttonName());
        ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$hasAutomatedCommercialAccountingSystem(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface2.realmGet$hasAutomatedCommercialAccountingSystem());
        ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface.realmSet$errorMessage(ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxyinterface2.realmGet$errorMessage());
        return actualCountersData2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("ActualCountersData = proxy[");
        sb.append("{showButton:");
        sb.append(realmGet$showButton());
        sb.append("}");
        sb.append(",");
        sb.append("{notification:");
        String str = "null";
        sb.append(realmGet$notification() != null ? realmGet$notification() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{buttonName:");
        sb.append(realmGet$buttonName() != null ? realmGet$buttonName() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{hasAutomatedCommercialAccountingSystem:");
        sb.append(realmGet$hasAutomatedCommercialAccountingSystem());
        sb.append("}");
        sb.append(",");
        sb.append("{errorMessage:");
        if (realmGet$errorMessage() != null) {
            str = realmGet$errorMessage();
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
        C4736x16a117c0 ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxy = (C4736x16a117c0) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_view_activity_navigation_ui_measures_actualcountersdatarealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
