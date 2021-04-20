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
import p035ru.unicorn.ujin.data.realm.BeaconAction;
import p035ru.unicorn.ujin.data.realm.BeaconActionDescription;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy */
public class ru_unicorn_ujin_data_realm_BeaconActionRealmProxy extends BeaconAction implements RealmObjectProxy, ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BeaconActionColumnInfo columnInfo;
    private ProxyState<BeaconAction> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "BeaconAction";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_BeaconActionRealmProxy$BeaconActionColumnInfo */
    static final class BeaconActionColumnInfo extends ColumnInfo {
        long beaconActionDescriptionInIndex;
        long beaconActionDescriptionOutIndex;
        long maxColumnIndexValue;

        BeaconActionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.beaconActionDescriptionInIndex = addColumnDetails("beaconActionDescriptionIn", "beaconActionDescriptionIn", objectSchemaInfo);
            this.beaconActionDescriptionOutIndex = addColumnDetails("beaconActionDescriptionOut", "beaconActionDescriptionOut", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BeaconActionColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BeaconActionColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BeaconActionColumnInfo beaconActionColumnInfo = (BeaconActionColumnInfo) columnInfo;
            BeaconActionColumnInfo beaconActionColumnInfo2 = (BeaconActionColumnInfo) columnInfo2;
            beaconActionColumnInfo2.beaconActionDescriptionInIndex = beaconActionColumnInfo.beaconActionDescriptionInIndex;
            beaconActionColumnInfo2.beaconActionDescriptionOutIndex = beaconActionColumnInfo.beaconActionDescriptionOutIndex;
            beaconActionColumnInfo2.maxColumnIndexValue = beaconActionColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_BeaconActionRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BeaconActionColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public BeaconActionDescription realmGet$beaconActionDescriptionIn() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.beaconActionDescriptionInIndex)) {
            return null;
        }
        return (BeaconActionDescription) this.proxyState.getRealm$realm().get(BeaconActionDescription.class, this.proxyState.getRow$realm().getLink(this.columnInfo.beaconActionDescriptionInIndex), false, Collections.emptyList());
    }

    public void realmSet$beaconActionDescriptionIn(BeaconActionDescription beaconActionDescription) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (beaconActionDescription == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.beaconActionDescriptionInIndex);
                return;
            }
            this.proxyState.checkValidObject(beaconActionDescription);
            this.proxyState.getRow$realm().setLink(this.columnInfo.beaconActionDescriptionInIndex, ((RealmObjectProxy) beaconActionDescription).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("beaconActionDescriptionIn")) {
            if (beaconActionDescription != null && !RealmObject.isManaged(beaconActionDescription)) {
                beaconActionDescription = (BeaconActionDescription) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(beaconActionDescription, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (beaconActionDescription == null) {
                row$realm.nullifyLink(this.columnInfo.beaconActionDescriptionInIndex);
                return;
            }
            this.proxyState.checkValidObject(beaconActionDescription);
            row$realm.getTable().setLink(this.columnInfo.beaconActionDescriptionInIndex, row$realm.getIndex(), ((RealmObjectProxy) beaconActionDescription).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public BeaconActionDescription realmGet$beaconActionDescriptionOut() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.beaconActionDescriptionOutIndex)) {
            return null;
        }
        return (BeaconActionDescription) this.proxyState.getRealm$realm().get(BeaconActionDescription.class, this.proxyState.getRow$realm().getLink(this.columnInfo.beaconActionDescriptionOutIndex), false, Collections.emptyList());
    }

    public void realmSet$beaconActionDescriptionOut(BeaconActionDescription beaconActionDescription) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (beaconActionDescription == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.beaconActionDescriptionOutIndex);
                return;
            }
            this.proxyState.checkValidObject(beaconActionDescription);
            this.proxyState.getRow$realm().setLink(this.columnInfo.beaconActionDescriptionOutIndex, ((RealmObjectProxy) beaconActionDescription).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("beaconActionDescriptionOut")) {
            if (beaconActionDescription != null && !RealmObject.isManaged(beaconActionDescription)) {
                beaconActionDescription = (BeaconActionDescription) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(beaconActionDescription, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (beaconActionDescription == null) {
                row$realm.nullifyLink(this.columnInfo.beaconActionDescriptionOutIndex);
                return;
            }
            this.proxyState.checkValidObject(beaconActionDescription);
            row$realm.getTable().setLink(this.columnInfo.beaconActionDescriptionOutIndex, row$realm.getIndex(), ((RealmObjectProxy) beaconActionDescription).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 2, 0);
        builder.addPersistedLinkProperty("beaconActionDescriptionIn", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("beaconActionDescriptionOut", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BeaconActionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BeaconActionColumnInfo(osSchemaInfo);
    }

    public static BeaconAction createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(2);
        if (jSONObject.has("beaconActionDescriptionIn")) {
            arrayList.add("beaconActionDescriptionIn");
        }
        if (jSONObject.has("beaconActionDescriptionOut")) {
            arrayList.add("beaconActionDescriptionOut");
        }
        BeaconAction beaconAction = (BeaconAction) realm.createObjectInternal(BeaconAction.class, true, arrayList);
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction;
        if (jSONObject.has("beaconActionDescriptionIn")) {
            if (jSONObject.isNull("beaconActionDescriptionIn")) {
                ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionIn((BeaconActionDescription) null);
            } else {
                ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionIn(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("beaconActionDescriptionIn"), z));
            }
        }
        if (jSONObject.has("beaconActionDescriptionOut")) {
            if (jSONObject.isNull("beaconActionDescriptionOut")) {
                ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionOut((BeaconActionDescription) null);
            } else {
                ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionOut(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("beaconActionDescriptionOut"), z));
            }
        }
        return beaconAction;
    }

    public static BeaconAction createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        BeaconAction beaconAction = new BeaconAction();
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("beaconActionDescriptionIn")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionIn((BeaconActionDescription) null);
                } else {
                    ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionIn(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("beaconActionDescriptionOut")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionOut((BeaconActionDescription) null);
            } else {
                ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionOut(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (BeaconAction) realm.copyToRealm(beaconAction, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_BeaconActionRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxy ru_unicorn_ujin_data_realm_beaconactionrealmproxy = new ru_unicorn_ujin_data_realm_BeaconActionRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_beaconactionrealmproxy;
    }

    public static BeaconAction copyOrUpdate(Realm realm, BeaconActionColumnInfo beaconActionColumnInfo, BeaconAction beaconAction, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (beaconAction instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) beaconAction;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return beaconAction;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(beaconAction);
        if (realmObjectProxy2 != null) {
            return (BeaconAction) realmObjectProxy2;
        }
        return copy(realm, beaconActionColumnInfo, beaconAction, z, map, set);
    }

    public static BeaconAction copy(Realm realm, BeaconActionColumnInfo beaconActionColumnInfo, BeaconAction beaconAction, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(beaconAction);
        if (realmObjectProxy != null) {
            return (BeaconAction) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction;
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxy newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(BeaconAction.class), beaconActionColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(beaconAction, newProxyInstance);
        BeaconActionDescription realmGet$beaconActionDescriptionIn = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionIn();
        if (realmGet$beaconActionDescriptionIn == null) {
            newProxyInstance.realmSet$beaconActionDescriptionIn((BeaconActionDescription) null);
        } else {
            BeaconActionDescription beaconActionDescription = (BeaconActionDescription) map.get(realmGet$beaconActionDescriptionIn);
            if (beaconActionDescription != null) {
                newProxyInstance.realmSet$beaconActionDescriptionIn(beaconActionDescription);
            } else {
                newProxyInstance.realmSet$beaconActionDescriptionIn(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.BeaconActionDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconActionDescription.class), realmGet$beaconActionDescriptionIn, z, map, set));
            }
        }
        BeaconActionDescription realmGet$beaconActionDescriptionOut = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionOut();
        if (realmGet$beaconActionDescriptionOut == null) {
            newProxyInstance.realmSet$beaconActionDescriptionOut((BeaconActionDescription) null);
        } else {
            BeaconActionDescription beaconActionDescription2 = (BeaconActionDescription) map.get(realmGet$beaconActionDescriptionOut);
            if (beaconActionDescription2 != null) {
                newProxyInstance.realmSet$beaconActionDescriptionOut(beaconActionDescription2);
            } else {
                newProxyInstance.realmSet$beaconActionDescriptionOut(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.BeaconActionDescriptionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconActionDescription.class), realmGet$beaconActionDescriptionOut, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, BeaconAction beaconAction, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        BeaconAction beaconAction2 = beaconAction;
        Map<RealmModel, Long> map2 = map;
        if (beaconAction2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) beaconAction2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(BeaconAction.class);
        long nativePtr = table.getNativePtr();
        BeaconActionColumnInfo beaconActionColumnInfo = (BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class);
        long createRow = OsObject.createRow(table);
        map2.put(beaconAction2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction2;
        BeaconActionDescription realmGet$beaconActionDescriptionIn = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionIn();
        if (realmGet$beaconActionDescriptionIn != null) {
            Long l = map2.get(realmGet$beaconActionDescriptionIn);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm2, realmGet$beaconActionDescriptionIn, map2));
            }
            Table.nativeSetLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionInIndex, createRow, l.longValue(), false);
        }
        BeaconActionDescription realmGet$beaconActionDescriptionOut = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionOut();
        if (realmGet$beaconActionDescriptionOut != null) {
            Long l2 = map2.get(realmGet$beaconActionDescriptionOut);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm2, realmGet$beaconActionDescriptionOut, map2));
            }
            Table.nativeSetLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionOutIndex, createRow, l2.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(BeaconAction.class);
        table.getNativePtr();
        BeaconActionColumnInfo beaconActionColumnInfo = (BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class);
        while (it.hasNext()) {
            BeaconAction beaconAction = (BeaconAction) it.next();
            if (!map.containsKey(beaconAction)) {
                if (beaconAction instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) beaconAction;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(beaconAction, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(beaconAction, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction;
                BeaconActionDescription realmGet$beaconActionDescriptionIn = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionIn();
                if (realmGet$beaconActionDescriptionIn != null) {
                    Long l = map.get(realmGet$beaconActionDescriptionIn);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm, realmGet$beaconActionDescriptionIn, map));
                    }
                    table.setLink(beaconActionColumnInfo.beaconActionDescriptionInIndex, createRow, l.longValue(), false);
                }
                BeaconActionDescription realmGet$beaconActionDescriptionOut = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionOut();
                if (realmGet$beaconActionDescriptionOut != null) {
                    Long l2 = map.get(realmGet$beaconActionDescriptionOut);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insert(realm, realmGet$beaconActionDescriptionOut, map));
                    }
                    table.setLink(beaconActionColumnInfo.beaconActionDescriptionOutIndex, createRow, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, BeaconAction beaconAction, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        BeaconAction beaconAction2 = beaconAction;
        Map<RealmModel, Long> map2 = map;
        if (beaconAction2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) beaconAction2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(BeaconAction.class);
        long nativePtr = table.getNativePtr();
        BeaconActionColumnInfo beaconActionColumnInfo = (BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class);
        long createRow = OsObject.createRow(table);
        map2.put(beaconAction2, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction2;
        BeaconActionDescription realmGet$beaconActionDescriptionIn = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionIn();
        if (realmGet$beaconActionDescriptionIn != null) {
            Long l = map2.get(realmGet$beaconActionDescriptionIn);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm2, realmGet$beaconActionDescriptionIn, map2));
            }
            Table.nativeSetLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionInIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionInIndex, createRow);
        }
        BeaconActionDescription realmGet$beaconActionDescriptionOut = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionOut();
        if (realmGet$beaconActionDescriptionOut != null) {
            Long l2 = map2.get(realmGet$beaconActionDescriptionOut);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm2, realmGet$beaconActionDescriptionOut, map2));
            }
            Table.nativeSetLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionOutIndex, createRow, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionOutIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(BeaconAction.class);
        long nativePtr = table.getNativePtr();
        BeaconActionColumnInfo beaconActionColumnInfo = (BeaconActionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) BeaconAction.class);
        while (it.hasNext()) {
            BeaconAction beaconAction = (BeaconAction) it.next();
            if (!map2.containsKey(beaconAction)) {
                if (beaconAction instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) beaconAction;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(beaconAction, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(beaconAction, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction;
                BeaconActionDescription realmGet$beaconActionDescriptionIn = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionIn();
                if (realmGet$beaconActionDescriptionIn != null) {
                    Long l = map2.get(realmGet$beaconActionDescriptionIn);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm2, realmGet$beaconActionDescriptionIn, map2));
                    }
                    Table.nativeSetLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionInIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionInIndex, createRow);
                }
                BeaconActionDescription realmGet$beaconActionDescriptionOut = ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmGet$beaconActionDescriptionOut();
                if (realmGet$beaconActionDescriptionOut != null) {
                    Long l2 = map2.get(realmGet$beaconActionDescriptionOut);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.insertOrUpdate(realm2, realmGet$beaconActionDescriptionOut, map2));
                    }
                    Table.nativeSetLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionOutIndex, createRow, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, beaconActionColumnInfo.beaconActionDescriptionOutIndex, createRow);
                }
            }
        }
    }

    public static BeaconAction createDetachedCopy(BeaconAction beaconAction, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        BeaconAction beaconAction2;
        if (i > i2 || beaconAction == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(beaconAction);
        if (cacheData == null) {
            beaconAction2 = new BeaconAction();
            map.put(beaconAction, new RealmObjectProxy.CacheData(i, beaconAction2));
        } else if (i >= cacheData.minDepth) {
            return (BeaconAction) cacheData.object;
        } else {
            cacheData.minDepth = i;
            beaconAction2 = (BeaconAction) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface = beaconAction2;
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxyInterface ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface2 = beaconAction;
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionIn(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface2.realmGet$beaconActionDescriptionIn(), i3, i2, map));
        ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface.realmSet$beaconActionDescriptionOut(ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_beaconactionrealmproxyinterface2.realmGet$beaconActionDescriptionOut(), i3, i2, map));
        return beaconAction2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("BeaconAction = proxy[");
        sb.append("{beaconActionDescriptionIn:");
        BeaconActionDescription realmGet$beaconActionDescriptionIn = realmGet$beaconActionDescriptionIn();
        String str = ru_unicorn_ujin_data_realm_BeaconActionDescriptionRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
        sb.append(realmGet$beaconActionDescriptionIn != null ? str : "null");
        sb.append("}");
        sb.append(",");
        sb.append("{beaconActionDescriptionOut:");
        if (realmGet$beaconActionDescriptionOut() == null) {
            str = "null";
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
        ru_unicorn_ujin_data_realm_BeaconActionRealmProxy ru_unicorn_ujin_data_realm_beaconactionrealmproxy = (ru_unicorn_ujin_data_realm_BeaconActionRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_beaconactionrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_beaconactionrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_beaconactionrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
