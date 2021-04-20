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
import p035ru.unicorn.ujin.data.realm.marketplace.CartCompany;
import p035ru.unicorn.ujin.data.realm.marketplace.CartItem;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;
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
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy extends CartItem implements RealmObjectProxy, C4604x82066130 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CartItemColumnInfo columnInfo;
    private RealmList<CartOffer> offersRealmList;
    private ProxyState<CartItem> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CartItem";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy$CartItemColumnInfo */
    static final class CartItemColumnInfo extends ColumnInfo {
        long companyIndex;
        long maxColumnIndexValue;
        long offersIndex;
        long totalIndex;

        CartItemColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.companyIndex = addColumnDetails("company", "company", objectSchemaInfo);
            this.offersIndex = addColumnDetails("offers", "offers", objectSchemaInfo);
            this.totalIndex = addColumnDetails("total", "total", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CartItemColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CartItemColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CartItemColumnInfo cartItemColumnInfo = (CartItemColumnInfo) columnInfo;
            CartItemColumnInfo cartItemColumnInfo2 = (CartItemColumnInfo) columnInfo2;
            cartItemColumnInfo2.companyIndex = cartItemColumnInfo.companyIndex;
            cartItemColumnInfo2.offersIndex = cartItemColumnInfo.offersIndex;
            cartItemColumnInfo2.totalIndex = cartItemColumnInfo.totalIndex;
            cartItemColumnInfo2.maxColumnIndexValue = cartItemColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CartItemColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public CartCompany realmGet$company() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.companyIndex)) {
            return null;
        }
        return (CartCompany) this.proxyState.getRealm$realm().get(CartCompany.class, this.proxyState.getRow$realm().getLink(this.columnInfo.companyIndex), false, Collections.emptyList());
    }

    public void realmSet$company(CartCompany cartCompany) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (cartCompany == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.companyIndex);
                return;
            }
            this.proxyState.checkValidObject(cartCompany);
            this.proxyState.getRow$realm().setLink(this.columnInfo.companyIndex, ((RealmObjectProxy) cartCompany).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("company")) {
            if (cartCompany != null && !RealmObject.isManaged(cartCompany)) {
                cartCompany = (CartCompany) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(cartCompany, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (cartCompany == null) {
                row$realm.nullifyLink(this.columnInfo.companyIndex);
                return;
            }
            this.proxyState.checkValidObject(cartCompany);
            row$realm.getTable().setLink(this.columnInfo.companyIndex, row$realm.getIndex(), ((RealmObjectProxy) cartCompany).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RealmList<CartOffer> realmGet$offers() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CartOffer> realmList = this.offersRealmList;
        if (realmList != null) {
            return realmList;
        }
        this.offersRealmList = new RealmList<>(CartOffer.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.offersIndex), this.proxyState.getRealm$realm());
        return this.offersRealmList;
    }

    public void realmSet$offers(RealmList<CartOffer> realmList) {
        int i = 0;
        if (this.proxyState.isUnderConstruction()) {
            if (!this.proxyState.getAcceptDefaultValue$realm() || this.proxyState.getExcludeFields$realm().contains("offers")) {
                return;
            }
            if (realmList != null && !realmList.isManaged()) {
                Realm realm = (Realm) this.proxyState.getRealm$realm();
                RealmList<CartOffer> realmList2 = new RealmList<>();
                Iterator<CartOffer> it = realmList.iterator();
                while (it.hasNext()) {
                    CartOffer next = it.next();
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
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.offersIndex);
        if (realmList == null || ((long) realmList.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList != null) {
                int size = realmList.size();
                while (i < size) {
                    CartOffer cartOffer = realmList.get(i);
                    this.proxyState.checkValidObject(cartOffer);
                    modelList.addRow(((RealmObjectProxy) cartOffer).realmGet$proxyState().getRow$realm().getIndex());
                    i++;
                }
                return;
            }
            return;
        }
        int size2 = realmList.size();
        while (i < size2) {
            CartOffer cartOffer2 = realmList.get(i);
            this.proxyState.checkValidObject(cartOffer2);
            modelList.setRow((long) i, ((RealmObjectProxy) cartOffer2).realmGet$proxyState().getRow$realm().getIndex());
            i++;
        }
    }

    public CartTotal realmGet$total() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.totalIndex)) {
            return null;
        }
        return (CartTotal) this.proxyState.getRealm$realm().get(CartTotal.class, this.proxyState.getRow$realm().getLink(this.columnInfo.totalIndex), false, Collections.emptyList());
    }

    public void realmSet$total(CartTotal cartTotal) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (cartTotal == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.totalIndex);
                return;
            }
            this.proxyState.checkValidObject(cartTotal);
            this.proxyState.getRow$realm().setLink(this.columnInfo.totalIndex, ((RealmObjectProxy) cartTotal).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("total")) {
            if (cartTotal != null && !RealmObject.isManaged(cartTotal)) {
                cartTotal = (CartTotal) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(cartTotal, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (cartTotal == null) {
                row$realm.nullifyLink(this.columnInfo.totalIndex);
                return;
            }
            this.proxyState.checkValidObject(cartTotal);
            row$realm.getTable().setLink(this.columnInfo.totalIndex, row$realm.getIndex(), ((RealmObjectProxy) cartTotal).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        builder.addPersistedLinkProperty("company", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("offers", RealmFieldType.LIST, ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("total", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CartItemColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CartItemColumnInfo(osSchemaInfo);
    }

    public static CartItem createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList(3);
        if (jSONObject.has("company")) {
            arrayList.add("company");
        }
        if (jSONObject.has("offers")) {
            arrayList.add("offers");
        }
        if (jSONObject.has("total")) {
            arrayList.add("total");
        }
        CartItem cartItem = (CartItem) realm.createObjectInternal(CartItem.class, true, arrayList);
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem;
        if (jSONObject.has("company")) {
            if (jSONObject.isNull("company")) {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$company((CartCompany) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$company(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("company"), z));
            }
        }
        if (jSONObject.has("offers")) {
            if (jSONObject.isNull("offers")) {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$offers((RealmList<CartOffer>) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("offers");
                for (int i = 0; i < jSONArray.length(); i++) {
                    ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers().add(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createOrUpdateUsingJsonObject(realm, jSONArray.getJSONObject(i), z));
                }
            }
        }
        if (jSONObject.has("total")) {
            if (jSONObject.isNull("total")) {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$total((CartTotal) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$total(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject.getJSONObject("total"), z));
            }
        }
        return cartItem;
    }

    public static CartItem createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CartItem cartItem = new CartItem();
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("company")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$company((CartCompany) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$company(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("offers")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$offers((RealmList<CartOffer>) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$offers(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers().add(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("total")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$total((CartTotal) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$total(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        return (CartItem) realm.copyToRealm(cartItem, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartItem.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxy;
    }

    public static CartItem copyOrUpdate(Realm realm, CartItemColumnInfo cartItemColumnInfo, CartItem cartItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (cartItem instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartItem;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cartItem;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cartItem);
        if (realmObjectProxy2 != null) {
            return (CartItem) realmObjectProxy2;
        }
        return copy(realm, cartItemColumnInfo, cartItem, z, map, set);
    }

    public static CartItem copy(Realm realm, CartItemColumnInfo cartItemColumnInfo, CartItem cartItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Realm realm2 = realm;
        CartItem cartItem2 = cartItem;
        Map<RealmModel, RealmObjectProxy> map2 = map;
        RealmObjectProxy realmObjectProxy = map2.get(cartItem2);
        if (realmObjectProxy != null) {
            return (CartItem) realmObjectProxy;
        }
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem2;
        ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy newProxyInstance = newProxyInstance(realm, new OsObjectBuilder(realm.getTable(CartItem.class), cartItemColumnInfo.maxColumnIndexValue, set).createNewObject());
        map2.put(cartItem2, newProxyInstance);
        CartCompany realmGet$company = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$company();
        if (realmGet$company == null) {
            newProxyInstance.realmSet$company((CartCompany) null);
        } else {
            CartCompany cartCompany = (CartCompany) map2.get(realmGet$company);
            if (cartCompany != null) {
                newProxyInstance.realmSet$company(cartCompany);
            } else {
                newProxyInstance.realmSet$company(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.CartCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class), realmGet$company, z, map, set));
            }
        }
        RealmList<CartOffer> realmGet$offers = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers();
        if (realmGet$offers != null) {
            RealmList<CartOffer> realmGet$offers2 = newProxyInstance.realmGet$offers();
            realmGet$offers2.clear();
            for (int i = 0; i < realmGet$offers.size(); i++) {
                CartOffer cartOffer = realmGet$offers.get(i);
                CartOffer cartOffer2 = (CartOffer) map2.get(cartOffer);
                if (cartOffer2 != null) {
                    realmGet$offers2.add(cartOffer2);
                } else {
                    realmGet$offers2.add(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.CartOfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class), cartOffer, z, map, set));
                }
            }
        }
        CartTotal realmGet$total = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$total();
        if (realmGet$total == null) {
            newProxyInstance.realmSet$total((CartTotal) null);
        } else {
            CartTotal cartTotal = (CartTotal) map2.get(realmGet$total);
            if (cartTotal != null) {
                newProxyInstance.realmSet$total(cartTotal);
            } else {
                newProxyInstance.realmSet$total(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.CartTotalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class), realmGet$total, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, CartItem cartItem, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        CartItem cartItem2 = cartItem;
        Map<RealmModel, Long> map2 = map;
        if (cartItem2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartItem2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CartItem.class);
        long nativePtr = table.getNativePtr();
        CartItemColumnInfo cartItemColumnInfo = (CartItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartItem.class);
        long createRow = OsObject.createRow(table);
        map2.put(cartItem2, Long.valueOf(createRow));
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem2;
        CartCompany realmGet$company = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$company();
        if (realmGet$company != null) {
            Long l = map2.get(realmGet$company);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insert(realm2, realmGet$company, map2));
            }
            long j3 = nativePtr;
            j = nativePtr;
            j2 = createRow;
            Table.nativeSetLink(j3, cartItemColumnInfo.companyIndex, createRow, l.longValue(), false);
        } else {
            j = nativePtr;
            j2 = createRow;
        }
        RealmList<CartOffer> realmGet$offers = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers();
        if (realmGet$offers != null) {
            OsList osList = new OsList(table.getUncheckedRow(j2), cartItemColumnInfo.offersIndex);
            Iterator<CartOffer> it = realmGet$offers.iterator();
            while (it.hasNext()) {
                CartOffer next = it.next();
                Long l2 = map2.get(next);
                if (l2 == null) {
                    l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insert(realm2, next, map2));
                }
                osList.addRow(l2.longValue());
            }
        }
        CartTotal realmGet$total = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$total();
        if (realmGet$total != null) {
            Long l3 = map2.get(realmGet$total);
            if (l3 == null) {
                l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insert(realm2, realmGet$total, map2));
            }
            Table.nativeSetLink(j, cartItemColumnInfo.totalIndex, j2, l3.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(CartItem.class);
        table.getNativePtr();
        CartItemColumnInfo cartItemColumnInfo = (CartItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartItem.class);
        while (it.hasNext()) {
            CartItem cartItem = (CartItem) it.next();
            if (!map.containsKey(cartItem)) {
                if (cartItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(cartItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map.put(cartItem, Long.valueOf(createRow));
                C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem;
                CartCompany realmGet$company = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$company();
                if (realmGet$company != null) {
                    Long l = map.get(realmGet$company);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insert(realm, realmGet$company, map));
                    }
                    table.setLink(cartItemColumnInfo.companyIndex, createRow, l.longValue(), false);
                }
                RealmList<CartOffer> realmGet$offers = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers();
                if (realmGet$offers != null) {
                    OsList osList = new OsList(table.getUncheckedRow(createRow), cartItemColumnInfo.offersIndex);
                    Iterator<CartOffer> it2 = realmGet$offers.iterator();
                    while (it2.hasNext()) {
                        CartOffer next = it2.next();
                        Long l2 = map.get(next);
                        if (l2 == null) {
                            l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insert(realm, next, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
                CartTotal realmGet$total = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$total();
                if (realmGet$total != null) {
                    Long l3 = map.get(realmGet$total);
                    if (l3 == null) {
                        l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insert(realm, realmGet$total, map));
                    }
                    table.setLink(cartItemColumnInfo.totalIndex, createRow, l3.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CartItem cartItem, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        CartItem cartItem2 = cartItem;
        Map<RealmModel, Long> map2 = map;
        if (cartItem2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartItem2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CartItem.class);
        long nativePtr = table.getNativePtr();
        CartItemColumnInfo cartItemColumnInfo = (CartItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartItem.class);
        long createRow = OsObject.createRow(table);
        map2.put(cartItem2, Long.valueOf(createRow));
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem2;
        CartCompany realmGet$company = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$company();
        if (realmGet$company != null) {
            Long l = map2.get(realmGet$company);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insertOrUpdate(realm2, realmGet$company, map2));
            }
            j = createRow;
            Table.nativeSetLink(nativePtr, cartItemColumnInfo.companyIndex, createRow, l.longValue(), false);
        } else {
            j = createRow;
            Table.nativeNullifyLink(nativePtr, cartItemColumnInfo.companyIndex, j);
        }
        long j3 = j;
        OsList osList = new OsList(table.getUncheckedRow(j3), cartItemColumnInfo.offersIndex);
        RealmList<CartOffer> realmGet$offers = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers();
        if (realmGet$offers == null || ((long) realmGet$offers.size()) != osList.size()) {
            j2 = j3;
            osList.removeAll();
            if (realmGet$offers != null) {
                Iterator<CartOffer> it = realmGet$offers.iterator();
                while (it.hasNext()) {
                    CartOffer next = it.next();
                    Long l2 = map2.get(next);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm2, next, map2));
                    }
                    osList.addRow(l2.longValue());
                }
            }
        } else {
            int size = realmGet$offers.size();
            int i = 0;
            while (i < size) {
                CartOffer cartOffer = realmGet$offers.get(i);
                Long l3 = map2.get(cartOffer);
                if (l3 == null) {
                    l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm2, cartOffer, map2));
                }
                osList.setRow((long) i, l3.longValue());
                i++;
                j3 = j3;
            }
            j2 = j3;
        }
        CartTotal realmGet$total = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$total();
        if (realmGet$total != null) {
            Long l4 = map2.get(realmGet$total);
            if (l4 == null) {
                l4 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insertOrUpdate(realm2, realmGet$total, map2));
            }
            long j4 = j2;
            Table.nativeSetLink(nativePtr, cartItemColumnInfo.totalIndex, j2, l4.longValue(), false);
            return j4;
        }
        long j5 = j2;
        Table.nativeNullifyLink(nativePtr, cartItemColumnInfo.totalIndex, j5);
        return j5;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CartItem.class);
        long nativePtr = table.getNativePtr();
        CartItemColumnInfo cartItemColumnInfo = (CartItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartItem.class);
        while (it.hasNext()) {
            CartItem cartItem = (CartItem) it.next();
            if (!map2.containsKey(cartItem)) {
                if (cartItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cartItem, Long.valueOf(createRow));
                C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem;
                CartCompany realmGet$company = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$company();
                if (realmGet$company != null) {
                    Long l = map2.get(realmGet$company);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.insertOrUpdate(realm2, realmGet$company, map2));
                    }
                    j = createRow;
                    Table.nativeSetLink(nativePtr, cartItemColumnInfo.companyIndex, createRow, l.longValue(), false);
                } else {
                    j = createRow;
                    Table.nativeNullifyLink(nativePtr, cartItemColumnInfo.companyIndex, j);
                }
                long j3 = j;
                OsList osList = new OsList(table.getUncheckedRow(j3), cartItemColumnInfo.offersIndex);
                RealmList<CartOffer> realmGet$offers = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$offers();
                if (realmGet$offers == null || ((long) realmGet$offers.size()) != osList.size()) {
                    j2 = j3;
                    osList.removeAll();
                    if (realmGet$offers != null) {
                        Iterator<CartOffer> it2 = realmGet$offers.iterator();
                        while (it2.hasNext()) {
                            CartOffer next = it2.next();
                            Long l2 = map2.get(next);
                            if (l2 == null) {
                                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm2, next, map2));
                            }
                            osList.addRow(l2.longValue());
                        }
                    }
                } else {
                    int size = realmGet$offers.size();
                    int i = 0;
                    while (i < size) {
                        CartOffer cartOffer = realmGet$offers.get(i);
                        Long l3 = map2.get(cartOffer);
                        if (l3 == null) {
                            l3 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.insertOrUpdate(realm2, cartOffer, map2));
                        }
                        osList.setRow((long) i, l3.longValue());
                        i++;
                        j3 = j3;
                    }
                    j2 = j3;
                }
                CartTotal realmGet$total = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmGet$total();
                if (realmGet$total != null) {
                    Long l4 = map2.get(realmGet$total);
                    if (l4 == null) {
                        l4 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.insertOrUpdate(realm2, realmGet$total, map2));
                    }
                    Table.nativeSetLink(nativePtr, cartItemColumnInfo.totalIndex, j2, l4.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, cartItemColumnInfo.totalIndex, j2);
                }
            }
        }
    }

    public static CartItem createDetachedCopy(CartItem cartItem, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CartItem cartItem2;
        if (i > i2 || cartItem == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cartItem);
        if (cacheData == null) {
            cartItem2 = new CartItem();
            map.put(cartItem, new RealmObjectProxy.CacheData(i, cartItem2));
        } else if (i >= cacheData.minDepth) {
            return (CartItem) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cartItem2 = (CartItem) cacheData.object;
        }
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface = cartItem2;
        C4604x82066130 ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface2 = cartItem;
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$company(ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface2.realmGet$company(), i3, i2, map));
        if (i == i2) {
            ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$offers((RealmList<CartOffer>) null);
        } else {
            RealmList<CartOffer> realmGet$offers = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface2.realmGet$offers();
            RealmList realmList = new RealmList();
            ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$offers(realmList);
            int size = realmGet$offers.size();
            for (int i4 = 0; i4 < size; i4++) {
                realmList.add(ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createDetachedCopy(realmGet$offers.get(i4), i3, i2, map));
            }
        }
        ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface.realmSet$total(ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxyinterface2.realmGet$total(), i3, i2, map));
        return cartItem2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartItem = proxy[");
        sb.append("{company:");
        String str = "null";
        sb.append(realmGet$company() != null ? ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{offers:");
        sb.append("RealmList<CartOffer>[");
        sb.append(realmGet$offers().size());
        sb.append("]");
        sb.append("}");
        sb.append(",");
        sb.append("{total:");
        if (realmGet$total() != null) {
            str = ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CartItemRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_cartitemrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
