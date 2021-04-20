package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p035ru.unicorn.ujin.data.realm.marketplace.CartTotal;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy extends CartTotal implements RealmObjectProxy, C4606x7b1cbdad {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CartTotalColumnInfo columnInfo;
    private ProxyState<CartTotal> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CartTotal";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy$CartTotalColumnInfo */
    static final class CartTotalColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long oldPriceIndex;
        long priceIndex;
        long quantityIndex;

        CartTotalColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.quantityIndex = addColumnDetails(FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.QUANTITY, objectSchemaInfo);
            this.oldPriceIndex = addColumnDetails("oldPrice", "oldPrice", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CartTotalColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CartTotalColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CartTotalColumnInfo cartTotalColumnInfo = (CartTotalColumnInfo) columnInfo;
            CartTotalColumnInfo cartTotalColumnInfo2 = (CartTotalColumnInfo) columnInfo2;
            cartTotalColumnInfo2.priceIndex = cartTotalColumnInfo.priceIndex;
            cartTotalColumnInfo2.quantityIndex = cartTotalColumnInfo.quantityIndex;
            cartTotalColumnInfo2.oldPriceIndex = cartTotalColumnInfo.oldPriceIndex;
            cartTotalColumnInfo2.maxColumnIndexValue = cartTotalColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CartTotalColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$price() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.priceIndex);
    }

    public void realmSet$price(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.priceIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.priceIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.priceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.priceIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$quantity() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.quantityIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.quantityIndex));
    }

    public void realmSet$quantity(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.quantityIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.quantityIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.quantityIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.quantityIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    public String realmGet$oldPrice() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.oldPriceIndex);
    }

    public void realmSet$oldPrice(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.oldPriceIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.oldPriceIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.oldPriceIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.oldPriceIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("price", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(FirebaseAnalytics.Param.QUANTITY, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("oldPrice", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CartTotalColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CartTotalColumnInfo(osSchemaInfo);
    }

    public static CartTotal createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        CartTotal cartTotal = (CartTotal) realm.createObjectInternal(CartTotal.class, true, Collections.emptyList());
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal;
        if (jSONObject.has("price")) {
            if (jSONObject.isNull("price")) {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$price((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$price(jSONObject.getString("price"));
            }
        }
        if (jSONObject.has(FirebaseAnalytics.Param.QUANTITY)) {
            if (jSONObject.isNull(FirebaseAnalytics.Param.QUANTITY)) {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$quantity((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$quantity(Integer.valueOf(jSONObject.getInt(FirebaseAnalytics.Param.QUANTITY)));
            }
        }
        if (jSONObject.has("oldPrice")) {
            if (jSONObject.isNull("oldPrice")) {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$oldPrice((String) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$oldPrice(jSONObject.getString("oldPrice"));
            }
        }
        return cartTotal;
    }

    public static CartTotal createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CartTotal cartTotal = new CartTotal();
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("price")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$price(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$price((String) null);
                }
            } else if (nextName.equals(FirebaseAnalytics.Param.QUANTITY)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$quantity(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$quantity((Integer) null);
                }
            } else if (!nextName.equals("oldPrice")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$oldPrice(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$oldPrice((String) null);
            }
        }
        jsonReader.endObject();
        return (CartTotal) realm.copyToRealm(cartTotal, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxy;
    }

    public static CartTotal copyOrUpdate(Realm realm, CartTotalColumnInfo cartTotalColumnInfo, CartTotal cartTotal, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (cartTotal instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartTotal;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return cartTotal;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(cartTotal);
        if (realmObjectProxy2 != null) {
            return (CartTotal) realmObjectProxy2;
        }
        return copy(realm, cartTotalColumnInfo, cartTotal, z, map, set);
    }

    public static CartTotal copy(Realm realm, CartTotalColumnInfo cartTotalColumnInfo, CartTotal cartTotal, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cartTotal);
        if (realmObjectProxy != null) {
            return (CartTotal) realmObjectProxy;
        }
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CartTotal.class), cartTotalColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cartTotalColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$price());
        osObjectBuilder.addInteger(cartTotalColumnInfo.quantityIndex, ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$quantity());
        osObjectBuilder.addString(cartTotalColumnInfo.oldPriceIndex, ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$oldPrice());
        ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cartTotal, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, CartTotal cartTotal, Map<RealmModel, Long> map) {
        CartTotal cartTotal2 = cartTotal;
        if (cartTotal2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartTotal2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CartTotal.class);
        long nativePtr = table.getNativePtr();
        CartTotalColumnInfo cartTotalColumnInfo = (CartTotalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class);
        long createRow = OsObject.createRow(table);
        map.put(cartTotal2, Long.valueOf(createRow));
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal2;
        String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, cartTotalColumnInfo.priceIndex, createRow, realmGet$price, false);
        }
        Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(nativePtr, cartTotalColumnInfo.quantityIndex, createRow, realmGet$quantity.longValue(), false);
        }
        String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$oldPrice();
        if (realmGet$oldPrice != null) {
            Table.nativeSetString(nativePtr, cartTotalColumnInfo.oldPriceIndex, createRow, realmGet$oldPrice, false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CartTotal.class);
        long nativePtr = table.getNativePtr();
        CartTotalColumnInfo cartTotalColumnInfo = (CartTotalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class);
        while (it.hasNext()) {
            CartTotal cartTotal = (CartTotal) it.next();
            if (!map2.containsKey(cartTotal)) {
                if (cartTotal instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartTotal;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartTotal, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cartTotal, Long.valueOf(createRow));
                C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal;
                String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, cartTotalColumnInfo.priceIndex, createRow, realmGet$price, false);
                }
                Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$quantity();
                if (realmGet$quantity != null) {
                    Table.nativeSetLong(nativePtr, cartTotalColumnInfo.quantityIndex, createRow, realmGet$quantity.longValue(), false);
                }
                String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$oldPrice();
                if (realmGet$oldPrice != null) {
                    Table.nativeSetString(nativePtr, cartTotalColumnInfo.oldPriceIndex, createRow, realmGet$oldPrice, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CartTotal cartTotal, Map<RealmModel, Long> map) {
        CartTotal cartTotal2 = cartTotal;
        if (cartTotal2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartTotal2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CartTotal.class);
        long nativePtr = table.getNativePtr();
        CartTotalColumnInfo cartTotalColumnInfo = (CartTotalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class);
        long createRow = OsObject.createRow(table);
        map.put(cartTotal2, Long.valueOf(createRow));
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal2;
        String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, cartTotalColumnInfo.priceIndex, createRow, realmGet$price, false);
        } else {
            Table.nativeSetNull(nativePtr, cartTotalColumnInfo.priceIndex, createRow, false);
        }
        Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(nativePtr, cartTotalColumnInfo.quantityIndex, createRow, realmGet$quantity.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, cartTotalColumnInfo.quantityIndex, createRow, false);
        }
        String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$oldPrice();
        if (realmGet$oldPrice != null) {
            Table.nativeSetString(nativePtr, cartTotalColumnInfo.oldPriceIndex, createRow, realmGet$oldPrice, false);
        } else {
            Table.nativeSetNull(nativePtr, cartTotalColumnInfo.oldPriceIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CartTotal.class);
        long nativePtr = table.getNativePtr();
        CartTotalColumnInfo cartTotalColumnInfo = (CartTotalColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartTotal.class);
        while (it.hasNext()) {
            CartTotal cartTotal = (CartTotal) it.next();
            if (!map2.containsKey(cartTotal)) {
                if (cartTotal instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartTotal;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartTotal, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(cartTotal, Long.valueOf(createRow));
                C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal;
                String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, cartTotalColumnInfo.priceIndex, createRow, realmGet$price, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartTotalColumnInfo.priceIndex, createRow, false);
                }
                Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$quantity();
                if (realmGet$quantity != null) {
                    Table.nativeSetLong(nativePtr, cartTotalColumnInfo.quantityIndex, createRow, realmGet$quantity.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, cartTotalColumnInfo.quantityIndex, createRow, false);
                }
                String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmGet$oldPrice();
                if (realmGet$oldPrice != null) {
                    Table.nativeSetString(nativePtr, cartTotalColumnInfo.oldPriceIndex, createRow, realmGet$oldPrice, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartTotalColumnInfo.oldPriceIndex, createRow, false);
                }
            }
        }
    }

    public static CartTotal createDetachedCopy(CartTotal cartTotal, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CartTotal cartTotal2;
        if (i > i2 || cartTotal == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cartTotal);
        if (cacheData == null) {
            cartTotal2 = new CartTotal();
            map.put(cartTotal, new RealmObjectProxy.CacheData(i, cartTotal2));
        } else if (i >= cacheData.minDepth) {
            return (CartTotal) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cartTotal2 = (CartTotal) cacheData.object;
        }
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface = cartTotal2;
        C4606x7b1cbdad ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface2 = cartTotal;
        ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$price(ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface2.realmGet$price());
        ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$quantity(ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface2.realmGet$quantity());
        ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface.realmSet$oldPrice(ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxyinterface2.realmGet$oldPrice());
        return cartTotal2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartTotal = proxy[");
        sb.append("{price:");
        String str = "null";
        sb.append(realmGet$price() != null ? realmGet$price() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{quantity:");
        sb.append(realmGet$quantity() != null ? realmGet$quantity() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{oldPrice:");
        if (realmGet$oldPrice() != null) {
            str = realmGet$oldPrice();
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
        ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CartTotalRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_carttotalrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
