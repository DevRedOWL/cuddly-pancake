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
import p035ru.unicorn.ujin.data.realm.Price;
import p046io.realm.BaseRealm;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy */
public class ru_unicorn_ujin_data_realm_PriceRealmProxy extends Price implements RealmObjectProxy, ru_unicorn_ujin_data_realm_PriceRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PriceColumnInfo columnInfo;
    private ProxyState<Price> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Price";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_PriceRealmProxy$PriceColumnInfo */
    static final class PriceColumnInfo extends ColumnInfo {
        long apartmentTypeIndex;
        long maxColumnIndexValue;
        long textCountIndex;
        long textIndex;
        long titleIndex;

        PriceColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.textCountIndex = addColumnDetails("textCount", "textCount", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.apartmentTypeIndex = addColumnDetails("apartmentType", "apartmentType", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PriceColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PriceColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PriceColumnInfo priceColumnInfo = (PriceColumnInfo) columnInfo;
            PriceColumnInfo priceColumnInfo2 = (PriceColumnInfo) columnInfo2;
            priceColumnInfo2.titleIndex = priceColumnInfo.titleIndex;
            priceColumnInfo2.textCountIndex = priceColumnInfo.textCountIndex;
            priceColumnInfo2.textIndex = priceColumnInfo.textIndex;
            priceColumnInfo2.apartmentTypeIndex = priceColumnInfo.apartmentTypeIndex;
            priceColumnInfo2.maxColumnIndexValue = priceColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_PriceRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PriceColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
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

    public String realmGet$textCount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textCountIndex);
    }

    public void realmSet$textCount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textCountIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textCountIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textCountIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textCountIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$text() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.textIndex);
    }

    public void realmSet$text(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.textIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.textIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.textIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.textIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public Integer realmGet$apartmentType() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.apartmentTypeIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.apartmentTypeIndex));
    }

    public void realmSet$apartmentType(Integer num) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (num == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.apartmentTypeIndex);
            } else {
                this.proxyState.getRow$realm().setLong(this.columnInfo.apartmentTypeIndex, (long) num.intValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (num == null) {
                row$realm.getTable().setNull(this.columnInfo.apartmentTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setLong(this.columnInfo.apartmentTypeIndex, row$realm.getIndex(), (long) num.intValue(), true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("textCount", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("text", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("apartmentType", RealmFieldType.INTEGER, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PriceColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PriceColumnInfo(osSchemaInfo);
    }

    public static Price createOrUpdateUsingJsonObject(Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        Price price = (Price) realm.createObjectInternal(Price.class, true, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
        if (jSONObject.has("title")) {
            if (jSONObject.isNull("title")) {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$title((String) null);
            } else {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$title(jSONObject.getString("title"));
            }
        }
        if (jSONObject.has("textCount")) {
            if (jSONObject.isNull("textCount")) {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$textCount((String) null);
            } else {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$textCount(jSONObject.getString("textCount"));
            }
        }
        if (jSONObject.has("text")) {
            if (jSONObject.isNull("text")) {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$text((String) null);
            } else {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$text(jSONObject.getString("text"));
            }
        }
        if (jSONObject.has("apartmentType")) {
            if (jSONObject.isNull("apartmentType")) {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$apartmentType((Integer) null);
            } else {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$apartmentType(Integer.valueOf(jSONObject.getInt("apartmentType")));
            }
        }
        return price;
    }

    public static Price createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Price price = new Price();
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("textCount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$textCount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$textCount((String) null);
                }
            } else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$text((String) null);
                }
            } else if (!nextName.equals("apartmentType")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$apartmentType(Integer.valueOf(jsonReader.nextInt()));
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$apartmentType((Integer) null);
            }
        }
        jsonReader.endObject();
        return (Price) realm.copyToRealm(price, new ImportFlag[0]);
    }

    private static ru_unicorn_ujin_data_realm_PriceRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_PriceRealmProxy ru_unicorn_ujin_data_realm_pricerealmproxy = new ru_unicorn_ujin_data_realm_PriceRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_pricerealmproxy;
    }

    public static Price copyOrUpdate(Realm realm, PriceColumnInfo priceColumnInfo, Price price, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        if (price instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) price;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null) {
                BaseRealm realm$realm = realmObjectProxy.realmGet$proxyState().getRealm$realm();
                if (realm$realm.threadId != realm.threadId) {
                    throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
                } else if (realm$realm.getPath().equals(realm.getPath())) {
                    return price;
                }
            }
        }
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        RealmObjectProxy realmObjectProxy2 = map.get(price);
        if (realmObjectProxy2 != null) {
            return (Price) realmObjectProxy2;
        }
        return copy(realm, priceColumnInfo, price, z, map, set);
    }

    public static Price copy(Realm realm, PriceColumnInfo priceColumnInfo, Price price, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(price);
        if (realmObjectProxy != null) {
            return (Price) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Price.class), priceColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(priceColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(priceColumnInfo.textCountIndex, ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$textCount());
        osObjectBuilder.addString(priceColumnInfo.textIndex, ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$text());
        osObjectBuilder.addInteger(priceColumnInfo.apartmentTypeIndex, ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$apartmentType());
        ru_unicorn_ujin_data_realm_PriceRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(price, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Price price, Map<RealmModel, Long> map) {
        if (price instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) price;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Price.class);
        long nativePtr = table.getNativePtr();
        PriceColumnInfo priceColumnInfo = (PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class);
        long createRow = OsObject.createRow(table);
        map.put(price, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
        String realmGet$title = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, priceColumnInfo.titleIndex, createRow, realmGet$title, false);
        }
        String realmGet$textCount = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$textCount();
        if (realmGet$textCount != null) {
            Table.nativeSetString(nativePtr, priceColumnInfo.textCountIndex, createRow, realmGet$textCount, false);
        }
        String realmGet$text = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, priceColumnInfo.textIndex, createRow, realmGet$text, false);
        }
        Integer realmGet$apartmentType = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$apartmentType();
        if (realmGet$apartmentType != null) {
            Table.nativeSetLong(nativePtr, priceColumnInfo.apartmentTypeIndex, createRow, realmGet$apartmentType.longValue(), false);
        }
        return createRow;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Price.class);
        long nativePtr = table.getNativePtr();
        PriceColumnInfo priceColumnInfo = (PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class);
        while (it.hasNext()) {
            Price price = (Price) it.next();
            if (!map2.containsKey(price)) {
                if (price instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) price;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(price, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(price, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
                String realmGet$title = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, priceColumnInfo.titleIndex, createRow, realmGet$title, false);
                }
                String realmGet$textCount = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$textCount();
                if (realmGet$textCount != null) {
                    Table.nativeSetString(nativePtr, priceColumnInfo.textCountIndex, createRow, realmGet$textCount, false);
                }
                String realmGet$text = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, priceColumnInfo.textIndex, createRow, realmGet$text, false);
                }
                Integer realmGet$apartmentType = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$apartmentType();
                if (realmGet$apartmentType != null) {
                    Table.nativeSetLong(nativePtr, priceColumnInfo.apartmentTypeIndex, createRow, realmGet$apartmentType.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Price price, Map<RealmModel, Long> map) {
        if (price instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) price;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Price.class);
        long nativePtr = table.getNativePtr();
        PriceColumnInfo priceColumnInfo = (PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class);
        long createRow = OsObject.createRow(table);
        map.put(price, Long.valueOf(createRow));
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
        String realmGet$title = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, priceColumnInfo.titleIndex, createRow, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, priceColumnInfo.titleIndex, createRow, false);
        }
        String realmGet$textCount = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$textCount();
        if (realmGet$textCount != null) {
            Table.nativeSetString(nativePtr, priceColumnInfo.textCountIndex, createRow, realmGet$textCount, false);
        } else {
            Table.nativeSetNull(nativePtr, priceColumnInfo.textCountIndex, createRow, false);
        }
        String realmGet$text = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, priceColumnInfo.textIndex, createRow, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, priceColumnInfo.textIndex, createRow, false);
        }
        Integer realmGet$apartmentType = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$apartmentType();
        if (realmGet$apartmentType != null) {
            Table.nativeSetLong(nativePtr, priceColumnInfo.apartmentTypeIndex, createRow, realmGet$apartmentType.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, priceColumnInfo.apartmentTypeIndex, createRow, false);
        }
        return createRow;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Price.class);
        long nativePtr = table.getNativePtr();
        PriceColumnInfo priceColumnInfo = (PriceColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Price.class);
        while (it.hasNext()) {
            Price price = (Price) it.next();
            if (!map2.containsKey(price)) {
                if (price instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) price;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(price, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                long createRow = OsObject.createRow(table);
                map2.put(price, Long.valueOf(createRow));
                ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price;
                String realmGet$title = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, priceColumnInfo.titleIndex, createRow, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, priceColumnInfo.titleIndex, createRow, false);
                }
                String realmGet$textCount = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$textCount();
                if (realmGet$textCount != null) {
                    Table.nativeSetString(nativePtr, priceColumnInfo.textCountIndex, createRow, realmGet$textCount, false);
                } else {
                    Table.nativeSetNull(nativePtr, priceColumnInfo.textCountIndex, createRow, false);
                }
                String realmGet$text = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, priceColumnInfo.textIndex, createRow, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, priceColumnInfo.textIndex, createRow, false);
                }
                Integer realmGet$apartmentType = ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmGet$apartmentType();
                if (realmGet$apartmentType != null) {
                    Table.nativeSetLong(nativePtr, priceColumnInfo.apartmentTypeIndex, createRow, realmGet$apartmentType.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, priceColumnInfo.apartmentTypeIndex, createRow, false);
                }
            }
        }
    }

    public static Price createDetachedCopy(Price price, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Price price2;
        if (i > i2 || price == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(price);
        if (cacheData == null) {
            price2 = new Price();
            map.put(price, new RealmObjectProxy.CacheData(i, price2));
        } else if (i >= cacheData.minDepth) {
            return (Price) cacheData.object;
        } else {
            cacheData.minDepth = i;
            price2 = (Price) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface = price2;
        ru_unicorn_ujin_data_realm_PriceRealmProxyInterface ru_unicorn_ujin_data_realm_pricerealmproxyinterface2 = price;
        ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_pricerealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$textCount(ru_unicorn_ujin_data_realm_pricerealmproxyinterface2.realmGet$textCount());
        ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$text(ru_unicorn_ujin_data_realm_pricerealmproxyinterface2.realmGet$text());
        ru_unicorn_ujin_data_realm_pricerealmproxyinterface.realmSet$apartmentType(ru_unicorn_ujin_data_realm_pricerealmproxyinterface2.realmGet$apartmentType());
        return price2;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Price = proxy[");
        sb.append("{title:");
        Object obj = "null";
        sb.append(realmGet$title() != null ? realmGet$title() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{textCount:");
        sb.append(realmGet$textCount() != null ? realmGet$textCount() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(realmGet$text() != null ? realmGet$text() : obj);
        sb.append("}");
        sb.append(",");
        sb.append("{apartmentType:");
        Object obj2 = obj;
        if (realmGet$apartmentType() != null) {
            obj2 = realmGet$apartmentType();
        }
        sb.append(obj2);
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
        ru_unicorn_ujin_data_realm_PriceRealmProxy ru_unicorn_ujin_data_realm_pricerealmproxy = (ru_unicorn_ujin_data_realm_PriceRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_pricerealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_pricerealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_pricerealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
