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
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.PassCardUno;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy */
public class ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy extends PassCardUno implements RealmObjectProxy, ru_unicorn_ujin_data_realm_PassCardUnoRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PassCardUnoColumnInfo columnInfo;
    private ProxyState<PassCardUno> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PassCardUno";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy$PassCardUnoColumnInfo */
    static final class PassCardUnoColumnInfo extends ColumnInfo {
        long cardDataIndex;
        long maxColumnIndexValue;

        PassCardUnoColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.cardDataIndex = addColumnDetails("cardData", "cardData", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PassCardUnoColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PassCardUnoColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PassCardUnoColumnInfo passCardUnoColumnInfo = (PassCardUnoColumnInfo) columnInfo;
            PassCardUnoColumnInfo passCardUnoColumnInfo2 = (PassCardUnoColumnInfo) columnInfo2;
            passCardUnoColumnInfo2.cardDataIndex = passCardUnoColumnInfo.cardDataIndex;
            passCardUnoColumnInfo2.maxColumnIndexValue = passCardUnoColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PassCardUnoColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public CardData realmGet$cardData() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.cardDataIndex)) {
            return null;
        }
        return (CardData) this.proxyState.getRealm$realm().get(CardData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.cardDataIndex), false, Collections.emptyList());
    }

    public void realmSet$cardData(CardData cardData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (cardData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.cardDataIndex);
                return;
            }
            this.proxyState.checkValidObject(cardData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.cardDataIndex, ((RealmObjectProxy) cardData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("cardData")) {
            if (cardData != null && !RealmObject.isManaged(cardData)) {
                cardData = (CardData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(cardData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (cardData == null) {
                row$realm.nullifyLink(this.columnInfo.cardDataIndex);
                return;
            }
            this.proxyState.checkValidObject(cardData);
            row$realm.getTable().setLink(this.columnInfo.cardDataIndex, row$realm.getIndex(), ((RealmObjectProxy) cardData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty("cardData", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_CardDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PassCardUnoColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PassCardUnoColumnInfo(osSchemaInfo);
    }

    public static PassCardUno createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("cardData")) {
            arrayList.add("cardData");
        }
        PassCardUno passCardUno = (PassCardUno) realm.createObjectInternal(PassCardUno.class, true, arrayList);
        ru_unicorn_ujin_data_realm_PassCardUnoRealmProxyInterface ru_unicorn_ujin_data_realm_passcardunorealmproxyinterface = passCardUno;
        if (jSONObject.has("cardData")) {
            if (jSONObject.isNull("cardData")) {
                ru_unicorn_ujin_data_realm_passcardunorealmproxyinterface.realmSet$cardData((CardData) null);
            } else {
                ru_unicorn_ujin_data_realm_passcardunorealmproxyinterface.realmSet$cardData(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("cardData"), z));
            }
        }
        return passCardUno;
    }

    public static PassCardUno createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        PassCardUno passCardUno = new PassCardUno();
        ru_unicorn_ujin_data_realm_PassCardUnoRealmProxyInterface ru_unicorn_ujin_data_realm_passcardunorealmproxyinterface = passCardUno;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("cardData")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_passcardunorealmproxyinterface.realmSet$cardData((CardData) null);
            } else {
                ru_unicorn_ujin_data_realm_passcardunorealmproxyinterface.realmSet$cardData(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (PassCardUno) realm.copyToRealm(passCardUno, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCardUno.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy ru_unicorn_ujin_data_realm_passcardunorealmproxy = new ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_passcardunorealmproxy;
    }

    public static PassCardUno copyOrUpdate(Realm realm, PassCardUnoColumnInfo passCardUnoColumnInfo, PassCardUno passCardUno, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (passCardUno instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCardUno;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return passCardUno;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(passCardUno);
        if (realmObjectProxy2 != null) {
            return (PassCardUno) realmObjectProxy2;
        }
        return copy(realm, passCardUnoColumnInfo, passCardUno, z, map, set);
    }

    public static PassCardUno copy(Realm realm, PassCardUnoColumnInfo passCardUnoColumnInfo, PassCardUno passCardUno, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(passCardUno);
        if (realmObjectProxy != null) {
            return (PassCardUno) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(PassCardUno.class), passCardUnoColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(passCardUno, newProxyInstance);
        CardData realmGet$cardData = passCardUno.realmGet$cardData();
        if (realmGet$cardData == null) {
            newProxyInstance.realmSet$cardData((CardData) null);
        } else {
            CardData cardData = (CardData) map.get(realmGet$cardData);
            if (cardData != null) {
                newProxyInstance.realmSet$cardData(cardData);
            } else {
                newProxyInstance.realmSet$cardData(ru_unicorn_ujin_data_realm_CardDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CardDataRealmProxy.CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class), realmGet$cardData, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, PassCardUno passCardUno, Map<RealmModel, Long> map) {
        if (passCardUno instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCardUno;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(PassCardUno.class);
        long nativePtr = table.getNativePtr();
        PassCardUnoColumnInfo passCardUnoColumnInfo = (PassCardUnoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCardUno.class);
        long createRow = OsObject.createRow(table);
        map.put(passCardUno, Long.valueOf(createRow));
        CardData realmGet$cardData = passCardUno.realmGet$cardData();
        if (realmGet$cardData != null) {
            Long l = map.get(realmGet$cardData);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, realmGet$cardData, map));
            }
            Table.nativeSetLink(nativePtr, passCardUnoColumnInfo.cardDataIndex, createRow, l.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(PassCardUno.class);
        table.getNativePtr();
        PassCardUnoColumnInfo passCardUnoColumnInfo = (PassCardUnoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCardUno.class);
        while (it.hasNext()) {
            PassCardUno passCardUno = (PassCardUno) it.next();
            if (!map.containsKey(passCardUno)) {
                if (passCardUno instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCardUno;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(passCardUno, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(passCardUno, Long.valueOf(createRow));
                CardData realmGet$cardData = passCardUno.realmGet$cardData();
                if (realmGet$cardData != null) {
                    Long l = map.get(realmGet$cardData);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, realmGet$cardData, map));
                    }
                    table.setLink(passCardUnoColumnInfo.cardDataIndex, createRow, l.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, PassCardUno passCardUno, Map<RealmModel, Long> map) {
        if (passCardUno instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCardUno;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(PassCardUno.class);
        long nativePtr = table.getNativePtr();
        PassCardUnoColumnInfo passCardUnoColumnInfo = (PassCardUnoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCardUno.class);
        long createRow = OsObject.createRow(table);
        map.put(passCardUno, Long.valueOf(createRow));
        CardData realmGet$cardData = passCardUno.realmGet$cardData();
        if (realmGet$cardData != null) {
            Long l = map.get(realmGet$cardData);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, realmGet$cardData, map));
            }
            Table.nativeSetLink(nativePtr, passCardUnoColumnInfo.cardDataIndex, createRow, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, passCardUnoColumnInfo.cardDataIndex, createRow);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(PassCardUno.class);
        long nativePtr = table.getNativePtr();
        PassCardUnoColumnInfo passCardUnoColumnInfo = (PassCardUnoColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCardUno.class);
        while (it.hasNext()) {
            PassCardUno passCardUno = (PassCardUno) it.next();
            if (!map.containsKey(passCardUno)) {
                if (passCardUno instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCardUno;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(passCardUno, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(passCardUno, Long.valueOf(createRow));
                CardData realmGet$cardData = passCardUno.realmGet$cardData();
                if (realmGet$cardData != null) {
                    Long l = map.get(realmGet$cardData);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, realmGet$cardData, map));
                    }
                    Table.nativeSetLink(nativePtr, passCardUnoColumnInfo.cardDataIndex, createRow, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, passCardUnoColumnInfo.cardDataIndex, createRow);
                }
            }
        }
    }

    public static PassCardUno createDetachedCopy(PassCardUno passCardUno, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        PassCardUno passCardUno2;
        if (i > i2 || passCardUno == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(passCardUno);
        if (cacheData == null) {
            passCardUno2 = new PassCardUno();
            map.put(passCardUno, new RealmObjectProxy.CacheData(i, passCardUno2));
        } else if (i >= cacheData.minDepth) {
            return (PassCardUno) cacheData.object;
        } else {
            cacheData.minDepth = i;
            passCardUno2 = (PassCardUno) cacheData.object;
        }
        passCardUno2.realmSet$cardData(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createDetachedCopy(passCardUno.realmGet$cardData(), i + 1, i2, map));
        return passCardUno2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("PassCardUno = proxy[");
        sb.append("{cardData:");
        sb.append(realmGet$cardData() != null ? ru_unicorn_ujin_data_realm_CardDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : "null");
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
        ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy ru_unicorn_ujin_data_realm_passcardunorealmproxy = (ru_unicorn_ujin_data_realm_PassCardUnoRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_passcardunorealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_passcardunorealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_passcardunorealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
