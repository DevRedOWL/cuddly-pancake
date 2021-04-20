package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.CardData;
import p035ru.unicorn.ujin.data.realm.PassCard;
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
import p046io.realm.ru_unicorn_ujin_data_realm_CardDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy */
public class ru_unicorn_ujin_data_realm_PassCardRealmProxy extends PassCard implements RealmObjectProxy, ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<CardData> cardDataListRealmList;
    private PassCardColumnInfo columnInfo;
    private ProxyState<PassCard> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PassCard";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PassCardRealmProxy$PassCardColumnInfo */
    static final class PassCardColumnInfo extends ColumnInfo {
        long cardDataListIndex;
        long maxColumnIndexValue;

        PassCardColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.cardDataListIndex = addColumnDetails("cardDataList", "cardDataList", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PassCardColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PassCardColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PassCardColumnInfo passCardColumnInfo = (PassCardColumnInfo) columnInfo;
            PassCardColumnInfo passCardColumnInfo2 = (PassCardColumnInfo) columnInfo2;
            passCardColumnInfo2.cardDataListIndex = passCardColumnInfo.cardDataListIndex;
            passCardColumnInfo2.maxColumnIndexValue = passCardColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_PassCardRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PassCardColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public RealmList<CardData> realmGet$cardDataList() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CardData> realmList = this.cardDataListRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.cardDataListRealmList = new RealmList<>(CardData.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.cardDataListIndex), this.proxyState.getRealm$realm());
        return this.cardDataListRealmList;
    }

    public void realmSet$cardDataList(RealmList<CardData> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("cardDataList")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<CardData> realmList2 = new RealmList<>();
                Iterator<CardData> it = realmList.iterator();
                while (it.hasNext()) {
                    CardData next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.cardDataListIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    CardData cardData = realmList.get(i);
                    this.proxyState.checkValidObject(cardData);
                    modelList.addRow(((RealmObjectProxy) cardData).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            CardData cardData2 = realmList.get(i);
            this.proxyState.checkValidObject(cardData2);
            modelList.setRow((long) i, ((RealmObjectProxy) cardData2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 1, 0);
        builder.addPersistedLinkProperty("cardDataList", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_CardDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PassCardColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PassCardColumnInfo(osSchemaInfo);
    }

    public static PassCard createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(1);
        if (jSONObject.has("cardDataList")) {
            arrayList.add("cardDataList");
        }
        PassCard passCard = (PassCard) realm.createObjectInternal(PassCard.class, true, arrayList);
        ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface ru_unicorn_ujin_data_realm_passcardrealmproxyinterface = passCard;
        if (jSONObject.has("cardDataList")) {
            if (jSONObject.isNull("cardDataList")) {
                ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmSet$cardDataList((RealmList<CardData>) null);
            } else {
                ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmGet$cardDataList().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("cardDataList");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmGet$cardDataList().add(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        return passCard;
    }

    public static PassCard createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        PassCard passCard = new PassCard();
        ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface ru_unicorn_ujin_data_realm_passcardrealmproxyinterface = passCard;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (!jsonReader.nextName().equals("cardDataList")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmSet$cardDataList((RealmList<CardData>) null);
            } else {
                ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmSet$cardDataList(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmGet$cardDataList().add(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        return (PassCard) realm.copyToRealm(passCard, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_PassCardRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCard.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PassCardRealmProxy ru_unicorn_ujin_data_realm_passcardrealmproxy = new ru_unicorn_ujin_data_realm_PassCardRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_passcardrealmproxy;
    }

    public static PassCard copyOrUpdate(Realm realm, PassCardColumnInfo passCardColumnInfo, PassCard passCard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (passCard instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return passCard;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(passCard);
        if (realmObjectProxy2 != null) {
            return (PassCard) realmObjectProxy2;
        }
        return copy(realm, passCardColumnInfo, passCard, z, map, set);
    }

    public static PassCard copy(Realm realm, PassCardColumnInfo passCardColumnInfo, PassCard passCard, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(passCard);
        if (realmObjectProxy != null) {
            return (PassCard) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_PassCardRealmProxy newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(PassCard.class), passCardColumnInfo.maxColumnIndexValue, set).createNewObject());
        map.put(passCard, newProxyInstance);
        RealmList<CardData> realmGet$cardDataList = passCard.realmGet$cardDataList();
        if (realmGet$cardDataList != null) {
            RealmList<CardData> realmGet$cardDataList2 = newProxyInstance.realmGet$cardDataList();
            realmGet$cardDataList2.clear();
            for (int i = 0; i < realmGet$cardDataList.size(); i++) {
                CardData cardData = realmGet$cardDataList.get(i);
                CardData cardData2 = (CardData) map.get(cardData);
                if (cardData2 != null) {
                    realmGet$cardDataList2.add(cardData2);
                } else {
                    realmGet$cardDataList2.add(ru_unicorn_ujin_data_realm_CardDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_CardDataRealmProxy.CardDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CardData.class), cardData, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, PassCard passCard, Map<RealmModel, Long> map) {
        if (passCard instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(PassCard.class);
        table.getNativePtr();
        PassCardColumnInfo passCardColumnInfo = (PassCardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCard.class);
        long createRow = OsObject.createRow(table);
        map.put(passCard, Long.valueOf(createRow));
        RealmList<CardData> realmGet$cardDataList = passCard.realmGet$cardDataList();
        if (realmGet$cardDataList != null) {
            OsList osList = new OsList(table.getUncheckedRow(createRow), passCardColumnInfo.cardDataListIndex);
            Iterator<CardData> it = realmGet$cardDataList.iterator();
            while (it.hasNext()) {
                CardData next = it.next();
                Long l = map.get(next);
                if (l == null) {
                    l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, next, map));
                }
                osList.addRow(l.longValue());
            }
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(PassCard.class);
        table.getNativePtr();
        PassCardColumnInfo passCardColumnInfo = (PassCardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCard.class);
        while (it.hasNext()) {
            PassCard passCard = (PassCard) it.next();
            if (!map.containsKey(passCard)) {
                if (passCard instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCard;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(passCard, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(passCard, Long.valueOf(createRow));
                RealmList<CardData> realmGet$cardDataList = passCard.realmGet$cardDataList();
                if (realmGet$cardDataList != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), passCardColumnInfo.cardDataListIndex);
                    Iterator<CardData> it2 = realmGet$cardDataList.iterator();
                    while (it2.hasNext()) {
                        CardData next = it2.next();
                        Long l = map.get(next);
                        if (l == null) {
                            l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insert(realm, next, map));
                        }
                        osList.addRow(l.longValue());
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, PassCard passCard, Map<RealmModel, Long> map) {
        if (passCard instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCard;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(PassCard.class);
        table.getNativePtr();
        long createRow = OsObject.createRow(table);
        map.put(passCard, Long.valueOf(createRow));
        OsList osList = new OsList(table.getUncheckedRow(createRow), ((PassCardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCard.class)).cardDataListIndex);
        RealmList<CardData> realmGet$cardDataList = passCard.realmGet$cardDataList();
        if (realmGet$cardDataList == null || ((long) realmGet$cardDataList.size()) != osList.size()) {
            osList.removeAll();
            if (realmGet$cardDataList != null) {
                Iterator<CardData> it = realmGet$cardDataList.iterator();
                while (it.hasNext()) {
                    CardData next = it.next();
                    Long l = map.get(next);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, next, map));
                    }
                    osList.addRow(l.longValue());
                }
            }
        } else {
            int size = realmGet$cardDataList.size();
            for (int i = 0; i < size; i++) {
                CardData cardData = realmGet$cardDataList.get(i);
                Long l2 = map.get(cardData);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, cardData, map));
                }
                osList.setRow((long) i, l2.longValue());
            }
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(PassCard.class);
        table.getNativePtr();
        PassCardColumnInfo passCardColumnInfo = (PassCardColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) PassCard.class);
        while (it.hasNext()) {
            PassCard passCard = (PassCard) it.next();
            if (!map.containsKey(passCard)) {
                if (passCard instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) passCard;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(passCard, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(passCard, Long.valueOf(createRow));
                OsList osList = new OsList(table.getUncheckedRow(createRow), passCardColumnInfo.cardDataListIndex);
                RealmList<CardData> realmGet$cardDataList = passCard.realmGet$cardDataList();
                if (realmGet$cardDataList == null || ((long) realmGet$cardDataList.size()) != osList.size()) {
                    osList.removeAll();
                    if (realmGet$cardDataList != null) {
                        Iterator<CardData> it2 = realmGet$cardDataList.iterator();
                        while (it2.hasNext()) {
                            CardData next = it2.next();
                            Long l = map.get(next);
                            if (l == null) {
                                l = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, next, map));
                            }
                            osList.addRow(l.longValue());
                        }
                    }
                } else {
                    int size = realmGet$cardDataList.size();
                    for (int i = 0; i < size; i++) {
                        CardData cardData = realmGet$cardDataList.get(i);
                        Long l2 = map.get(cardData);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_CardDataRealmProxy.insertOrUpdate(realm, cardData, map));
                        }
                        osList.setRow((long) i, l2.longValue());
                    }
                }
            }
        }
    }

    public static PassCard createDetachedCopy(PassCard passCard, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        PassCard passCard2;
        if (i > i2 || passCard == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(passCard);
        if (cacheData == null) {
            passCard2 = new PassCard();
            map.put(passCard, new RealmObjectProxy.CacheData(i, passCard2));
        } else if (i >= cacheData.minDepth) {
            return (PassCard) cacheData.object;
        } else {
            cacheData.minDepth = i;
            passCard2 = (PassCard) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface ru_unicorn_ujin_data_realm_passcardrealmproxyinterface = passCard2;
        ru_unicorn_ujin_data_realm_PassCardRealmProxyInterface ru_unicorn_ujin_data_realm_passcardrealmproxyinterface2 = passCard;
        if (i == i2) {
            ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmSet$cardDataList((RealmList<CardData>) null);
        } else {
            RealmList<CardData> realmGet$cardDataList = ru_unicorn_ujin_data_realm_passcardrealmproxyinterface2.realmGet$cardDataList();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_passcardrealmproxyinterface.realmSet$cardDataList(realmList);
            int i3 = i + 1;
            int size = realmGet$cardDataList.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_CardDataRealmProxy.createDetachedCopy(realmGet$cardDataList.get(i4), i3, i2, map));
            }
        }
        return passCard2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        return "PassCard = proxy[" + "{cardDataList:" + "RealmList<CardData>[" + realmGet$cardDataList().size() + "]" + "}" + "]";
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
        ru_unicorn_ujin_data_realm_PassCardRealmProxy ru_unicorn_ujin_data_realm_passcardrealmproxy = (ru_unicorn_ujin_data_realm_PassCardRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_passcardrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_passcardrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_passcardrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
