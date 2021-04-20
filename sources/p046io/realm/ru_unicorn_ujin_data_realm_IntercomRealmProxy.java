package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.Intercom;
import p035ru.unicorn.ujin.data.realm.IntercomVal;
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
import p046io.realm.ru_unicorn_ujin_data_realm_IntercomValRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy */
public class ru_unicorn_ujin_data_realm_IntercomRealmProxy extends Intercom implements RealmObjectProxy, ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private IntercomColumnInfo columnInfo;
    private RealmList<IntercomVal> intercomRealmList;
    private ProxyState<Intercom> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Intercom";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_IntercomRealmProxy$IntercomColumnInfo */
    static final class IntercomColumnInfo extends ColumnInfo {
        long enabledIndex;
        long gotophoneIndex;
        long intercomIndex;
        long maxColumnIndexValue;
        long onlyoutIndex;

        IntercomColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.intercomIndex = addColumnDetails("intercom", "intercom", objectSchemaInfo);
            this.gotophoneIndex = addColumnDetails("gotophone", "gotophone", objectSchemaInfo);
            this.onlyoutIndex = addColumnDetails("onlyout", "onlyout", objectSchemaInfo);
            this.enabledIndex = addColumnDetails(ViewProps.ENABLED, ViewProps.ENABLED, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        IntercomColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new IntercomColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            IntercomColumnInfo intercomColumnInfo = (IntercomColumnInfo) columnInfo;
            IntercomColumnInfo intercomColumnInfo2 = (IntercomColumnInfo) columnInfo2;
            intercomColumnInfo2.intercomIndex = intercomColumnInfo.intercomIndex;
            intercomColumnInfo2.gotophoneIndex = intercomColumnInfo.gotophoneIndex;
            intercomColumnInfo2.onlyoutIndex = intercomColumnInfo.onlyoutIndex;
            intercomColumnInfo2.enabledIndex = intercomColumnInfo.enabledIndex;
            intercomColumnInfo2.maxColumnIndexValue = intercomColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_IntercomRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (IntercomColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RealmList<IntercomVal> realmGet$intercom() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<IntercomVal> realmList = this.intercomRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.intercomRealmList = new RealmList<>(IntercomVal.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.intercomIndex), this.proxyState.getRealm$realm());
        return this.intercomRealmList;
    }

    public void realmSet$intercom(RealmList<IntercomVal> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("intercom")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<IntercomVal> realmList2 = new RealmList<>();
                Iterator<IntercomVal> it = realmList.iterator();
                while (it.hasNext()) {
                    IntercomVal next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.intercomIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    IntercomVal intercomVal = realmList.get(i);
                    this.proxyState.checkValidObject(intercomVal);
                    modelList.addRow(((RealmObjectProxy) intercomVal).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            IntercomVal intercomVal2 = realmList.get(i);
            this.proxyState.checkValidObject(intercomVal2);
            modelList.setRow((long) i, ((RealmObjectProxy) intercomVal2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public Integer realmGet$gotophone() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.gotophoneIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.gotophoneIndex));
    }

    public void realmSet$gotophone(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.gotophoneIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.gotophoneIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.gotophoneIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.gotophoneIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Integer realmGet$onlyout() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.onlyoutIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.onlyoutIndex));
    }

    public void realmSet$onlyout(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.onlyoutIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.onlyoutIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.onlyoutIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.onlyoutIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public Boolean realmGet$enabled() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.enabledIndex)) {
            return null;
        }
        return Boolean.valueOf(this.proxyState.getRow$realm().getBoolean(this.columnInfo.enabledIndex));
    }

    public void realmSet$enabled(Boolean bool) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (bool == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.enabledIndex);
            } else {
                this.proxyState.getRow$realm().setBoolean(this.columnInfo.enabledIndex, bool.booleanValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (bool == null) {
                row$realm.getTable().setNull(this.columnInfo.enabledIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setBoolean(this.columnInfo.enabledIndex, row$realm.getIndex(), bool.booleanValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        builder.addPersistedLinkProperty("intercom", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_IntercomValRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("gotophone", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("onlyout", RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty(ViewProps.ENABLED, RealmFieldType.BOOLEAN, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static IntercomColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new IntercomColumnInfo(osSchemaInfo);
    }

    public static Intercom createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("intercom")) {
            arrayList.add("intercom");
        }
        Intercom intercom = (Intercom) realm.createObjectInternal(Intercom.class, true, arrayList);
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom;
        if (jSONObject.has("intercom")) {
            if (jSONObject.isNull("intercom")) {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$intercom((RealmList<IntercomVal>) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("intercom");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom().add(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("gotophone")) {
            if (jSONObject.isNull("gotophone")) {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$gotophone((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$gotophone(Integer.valueOf(jSONObject.getInt("gotophone")));
            }
        }
        if (jSONObject.has("onlyout")) {
            if (jSONObject.isNull("onlyout")) {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$onlyout((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$onlyout(Integer.valueOf(jSONObject.getInt("onlyout")));
            }
        }
        if (jSONObject.has(ViewProps.ENABLED)) {
            if (jSONObject.isNull(ViewProps.ENABLED)) {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$enabled((Boolean) null);
            } else {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$enabled(Boolean.valueOf(jSONObject.getBoolean(ViewProps.ENABLED)));
            }
        }
        return intercom;
    }

    public static Intercom createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Intercom intercom = new Intercom();
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("intercom")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$intercom((RealmList<IntercomVal>) null);
                } else {
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$intercom(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom().add(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("gotophone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$gotophone(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$gotophone((Integer) null);
                }
            } else if (nextName.equals("onlyout")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$onlyout(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$onlyout((Integer) null);
                }
            } else if (!nextName.equals(ViewProps.ENABLED)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$enabled(Boolean.valueOf(jsonReader.nextBoolean()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$enabled((Boolean) null);
            }
        }
        jsonReader.endObject();
        return (Intercom) realm.copyToRealm(intercom, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_IntercomRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intercom.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_IntercomRealmProxy ru_unicorn_ujin_data_realm_intercomrealmproxy = new ru_unicorn_ujin_data_realm_IntercomRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_intercomrealmproxy;
    }

    public static Intercom copyOrUpdate(Realm realm, IntercomColumnInfo intercomColumnInfo, Intercom intercom, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (intercom instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercom;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return intercom;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(intercom);
        if (realmObjectProxy2 != null) {
            return (Intercom) realmObjectProxy2;
        }
        return copy(realm, intercomColumnInfo, intercom, z, map, set);
    }

    public static Intercom copy(Realm realm, IntercomColumnInfo intercomColumnInfo, Intercom intercom, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(intercom);
        if (realmObjectProxy != null) {
            return (Intercom) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Intercom.class), intercomColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(intercomColumnInfo.gotophoneIndex, ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$gotophone());
        osObjectBuilder.addInteger(intercomColumnInfo.onlyoutIndex, ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$onlyout());
        osObjectBuilder.addBoolean(intercomColumnInfo.enabledIndex, ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$enabled());
        ru_unicorn_ujin_data_realm_IntercomRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(intercom, newProxyInstance);
        RealmList<IntercomVal> realmGet$intercom = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom();
        if (realmGet$intercom != null) {
            RealmList<IntercomVal> realmGet$intercom2 = newProxyInstance.realmGet$intercom();
            realmGet$intercom2.clear();
            for (int i = 0; i < realmGet$intercom.size(); i++) {
                IntercomVal intercomVal = realmGet$intercom.get(i);
                IntercomVal intercomVal2 = (IntercomVal) map.get(intercomVal);
                if (intercomVal2 != null) {
                    realmGet$intercom2.add(intercomVal2);
                } else {
                    realmGet$intercom2.add(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_IntercomValRealmProxy.IntercomValColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) IntercomVal.class), intercomVal, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Intercom intercom, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Intercom intercom2 = intercom;
        Map<RealmModel, Long> map2 = map;
        if (intercom2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercom2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Intercom.class);
        long nativePtr = table.getNativePtr();
        IntercomColumnInfo intercomColumnInfo = (IntercomColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intercom.class);
        long createRow = OsObject.createRow(table);
        map2.put(intercom2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom2;
        RealmList<IntercomVal> realmGet$intercom = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom();
        if (realmGet$intercom != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), intercomColumnInfo.intercomIndex);
            Iterator<IntercomVal> it = realmGet$intercom.iterator();
            while (it.hasNext()) {
                IntercomVal next = it.next();
                Long l = map2.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l.longValue());
            }
        }
        Integer realmGet$gotophone = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$gotophone();
        if (realmGet$gotophone != null) {
            j = createRow;
            Table.nativeSetLong(nativePtr, intercomColumnInfo.gotophoneIndex, createRow, realmGet$gotophone.longValue(), false);
        } else {
            j = createRow;
        }
        Integer realmGet$onlyout = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$onlyout();
        if (realmGet$onlyout != null) {
            Table.nativeSetLong(nativePtr, intercomColumnInfo.onlyoutIndex, j, realmGet$onlyout.longValue(), false);
        }
        Boolean realmGet$enabled = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$enabled();
        if (realmGet$enabled != null) {
            Table.nativeSetBoolean(nativePtr, intercomColumnInfo.enabledIndex, j, realmGet$enabled.booleanValue(), false);
        }
        return j;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Intercom.class);
        long nativePtr = table.getNativePtr();
        IntercomColumnInfo intercomColumnInfo = (IntercomColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intercom.class);
        while (it.hasNext()) {
            Intercom intercom = (Intercom) it.next();
            if (!map2.containsKey(intercom)) {
                if (intercom instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercom;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(intercom, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(intercom, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom;
                RealmList<IntercomVal> realmGet$intercom = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom();
                if (realmGet$intercom != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), intercomColumnInfo.intercomIndex);
                    Iterator<IntercomVal> it2 = realmGet$intercom.iterator();
                    while (it2.hasNext()) {
                        IntercomVal next = it2.next();
                        Long l = map2.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insert(realm2, next, map2));
                        }
                        osList.addRow(l.longValue());
                    }
                }
                Integer realmGet$gotophone = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$gotophone();
                if (realmGet$gotophone != null) {
                    j = createRow;
                    Table.nativeSetLong(nativePtr, intercomColumnInfo.gotophoneIndex, createRow, realmGet$gotophone.longValue(), false);
                } else {
                    j = createRow;
                }
                Integer realmGet$onlyout = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$onlyout();
                if (realmGet$onlyout != null) {
                    Table.nativeSetLong(nativePtr, intercomColumnInfo.onlyoutIndex, j, realmGet$onlyout.longValue(), false);
                }
                Boolean realmGet$enabled = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$enabled();
                if (realmGet$enabled != null) {
                    Table.nativeSetBoolean(nativePtr, intercomColumnInfo.enabledIndex, j, realmGet$enabled.booleanValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Intercom intercom, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Intercom intercom2 = intercom;
        Map<RealmModel, Long> map2 = map;
        if (intercom2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercom2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Intercom.class);
        long nativePtr = table.getNativePtr();
        IntercomColumnInfo intercomColumnInfo = (IntercomColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intercom.class);
        long createRow = OsObject.createRow(table);
        map2.put(intercom2, Long.valueOf(createRow));
        OsList osList = new OsList(table.getUncheckedRow(createRow), intercomColumnInfo.intercomIndex);
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom2;
        RealmList<IntercomVal> realmGet$intercom = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom();
        if (realmGet$intercom == null || ((long) realmGet$intercom.size()) != osList.size()) {
            j = createRow;
            osList.removeAll();
            if (realmGet$intercom != null) {
                Iterator<IntercomVal> it = realmGet$intercom.iterator();
                while (it.hasNext()) {
                    IntercomVal next = it.next();
                    Long l = map2.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$intercom.size();
            int i = 0;
            while (i < size) {
                IntercomVal intercomVal = realmGet$intercom.get(i);
                Long l2 = map2.get(intercomVal);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm2, intercomVal, map2));
                }
                osList.setRow((long) i, l2.longValue());
                i++;
                createRow = createRow;
            }
            j = createRow;
        }
        Integer realmGet$gotophone = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$gotophone();
        if (realmGet$gotophone != null) {
            j2 = j;
            Table.nativeSetLong(nativePtr, intercomColumnInfo.gotophoneIndex, j, realmGet$gotophone.longValue(), false);
        } else {
            j2 = j;
            Table.nativeSetNull(nativePtr, intercomColumnInfo.gotophoneIndex, j2, false);
        }
        Integer realmGet$onlyout = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$onlyout();
        if (realmGet$onlyout != null) {
            Table.nativeSetLong(nativePtr, intercomColumnInfo.onlyoutIndex, j2, realmGet$onlyout.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, intercomColumnInfo.onlyoutIndex, j2, false);
        }
        Boolean realmGet$enabled = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$enabled();
        if (realmGet$enabled != null) {
            Table.nativeSetBoolean(nativePtr, intercomColumnInfo.enabledIndex, j2, realmGet$enabled.booleanValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, intercomColumnInfo.enabledIndex, j2, false);
        }
        return j2;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Intercom.class);
        long nativePtr = table.getNativePtr();
        IntercomColumnInfo intercomColumnInfo = (IntercomColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Intercom.class);
        while (it.hasNext()) {
            Intercom intercom = (Intercom) it.next();
            if (!map2.containsKey(intercom)) {
                if (intercom instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) intercom;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(intercom, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(intercom, Long.valueOf(createRow));
                OsList osList = new OsList(table.getUncheckedRow(createRow), intercomColumnInfo.intercomIndex);
                ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom;
                RealmList<IntercomVal> realmGet$intercom = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$intercom();
                if (realmGet$intercom == null || ((long) realmGet$intercom.size()) != osList.size()) {
                    j = createRow;
                    osList.removeAll();
                    if (realmGet$intercom != null) {
                        Iterator<IntercomVal> it2 = realmGet$intercom.iterator();
                        while (it2.hasNext()) {
                            IntercomVal next = it2.next();
                            Long l = map2.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$intercom.size();
                    int i = 0;
                    while (i < size) {
                        IntercomVal intercomVal = realmGet$intercom.get(i);
                        Long l2 = map2.get(intercomVal);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.insertOrUpdate(realm2, intercomVal, map2));
                        }
                        osList.setRow((long) i, l2.longValue());
                        i++;
                        createRow = createRow;
                    }
                    j = createRow;
                }
                Integer realmGet$gotophone = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$gotophone();
                if (realmGet$gotophone != null) {
                    Table.nativeSetLong(nativePtr, intercomColumnInfo.gotophoneIndex, j, realmGet$gotophone.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomColumnInfo.gotophoneIndex, j, false);
                }
                Integer realmGet$onlyout = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$onlyout();
                if (realmGet$onlyout != null) {
                    Table.nativeSetLong(nativePtr, intercomColumnInfo.onlyoutIndex, j, realmGet$onlyout.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomColumnInfo.onlyoutIndex, j, false);
                }
                Boolean realmGet$enabled = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmGet$enabled();
                if (realmGet$enabled != null) {
                    Table.nativeSetBoolean(nativePtr, intercomColumnInfo.enabledIndex, j, realmGet$enabled.booleanValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, intercomColumnInfo.enabledIndex, j, false);
                }
            }
        }
    }

    public static Intercom createDetachedCopy(Intercom intercom, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Intercom intercom2;
        if (i > i2 || intercom == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(intercom);
        if (cacheData == null) {
            intercom2 = new Intercom();
            map.put(intercom, new RealmObjectProxy.CacheData(i, intercom2));
        } else if (i >= cacheData.minDepth) {
            return (Intercom) cacheData.object;
        } else {
            cacheData.minDepth = i;
            intercom2 = (Intercom) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface = intercom2;
        ru_unicorn_ujin_data_realm_IntercomRealmProxyInterface ru_unicorn_ujin_data_realm_intercomrealmproxyinterface2 = intercom;
        if (i == i2) {
            ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$intercom((RealmList<IntercomVal>) null);
        } else {
            RealmList<IntercomVal> realmGet$intercom = ru_unicorn_ujin_data_realm_intercomrealmproxyinterface2.realmGet$intercom();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$intercom(realmList);
            int i3 = i + 1;
            int size = realmGet$intercom.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_IntercomValRealmProxy.createDetachedCopy(realmGet$intercom.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$gotophone(ru_unicorn_ujin_data_realm_intercomrealmproxyinterface2.realmGet$gotophone());
        ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$onlyout(ru_unicorn_ujin_data_realm_intercomrealmproxyinterface2.realmGet$onlyout());
        ru_unicorn_ujin_data_realm_intercomrealmproxyinterface.realmSet$enabled(ru_unicorn_ujin_data_realm_intercomrealmproxyinterface2.realmGet$enabled());
        return intercom2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Intercom = proxy[");
        sb.append("{intercom:");
        sb.append("RealmList<IntercomVal>[");
        sb.append(realmGet$intercom().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{gotophone:");
        Object obj = "null";
        sb.append(realmGet$gotophone() != null ? realmGet$gotophone() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{onlyout:");
        sb.append(realmGet$onlyout() != null ? realmGet$onlyout() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{enabled:");
        if (realmGet$enabled() != null) {
            obj = realmGet$enabled();
        }
        sb.append(obj);
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
        ru_unicorn_ujin_data_realm_IntercomRealmProxy ru_unicorn_ujin_data_realm_intercomrealmproxy = (ru_unicorn_ujin_data_realm_IntercomRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_intercomrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_intercomrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_intercomrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
