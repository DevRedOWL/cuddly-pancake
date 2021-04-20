package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.data.realm.marketplace.OrderItem;
import p035ru.unicorn.ujin.market.order.OrderFormFragment;
import p046io.realm.BaseRealm;
import p046io.realm.exceptions.RealmException;
import p046io.realm.internal.ColumnInfo;
import p046io.realm.internal.OsObject;
import p046io.realm.internal.OsObjectSchemaInfo;
import p046io.realm.internal.OsSchemaInfo;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.internal.Row;
import p046io.realm.internal.Table;
import p046io.realm.internal.objectstore.OsObjectBuilder;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy extends OrderItem implements RealmObjectProxy, C4615x596bcf10 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private OrderItemColumnInfo columnInfo;
    private ProxyState<OrderItem> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "OrderItem";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy$OrderItemColumnInfo */
    static final class OrderItemColumnInfo extends ColumnInfo {
        long companyIdIndex;
        long countIndex;
        long idIndex;
        long maxColumnIndexValue;
        long offerIndex;

        OrderItemColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.offerIndex = addColumnDetails(OrderFormFragment.OFFER_TYPE, OrderFormFragment.OFFER_TYPE, objectSchemaInfo);
            this.countIndex = addColumnDetails("count", "count", objectSchemaInfo);
            this.companyIdIndex = addColumnDetails("companyId", "companyId", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OrderItemColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new OrderItemColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            OrderItemColumnInfo orderItemColumnInfo = (OrderItemColumnInfo) columnInfo;
            OrderItemColumnInfo orderItemColumnInfo2 = (OrderItemColumnInfo) columnInfo2;
            orderItemColumnInfo2.idIndex = orderItemColumnInfo.idIndex;
            orderItemColumnInfo2.offerIndex = orderItemColumnInfo.offerIndex;
            orderItemColumnInfo2.countIndex = orderItemColumnInfo.countIndex;
            orderItemColumnInfo2.companyIdIndex = orderItemColumnInfo.companyIdIndex;
            orderItemColumnInfo2.maxColumnIndexValue = orderItemColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (OrderItemColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idIndex);
    }

    public void realmSet$id(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    public Offer realmGet$offer() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.offerIndex)) {
            return null;
        }
        return (Offer) this.proxyState.getRealm$realm().get(Offer.class, this.proxyState.getRow$realm().getLink(this.columnInfo.offerIndex), false, Collections.emptyList());
    }

    public void realmSet$offer(Offer offer) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (offer == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.offerIndex);
                return;
            }
            this.proxyState.checkValidObject(offer);
            this.proxyState.getRow$realm().setLink(this.columnInfo.offerIndex, ((RealmObjectProxy) offer).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains(OrderFormFragment.OFFER_TYPE)) {
            if (offer != null && !RealmObject.isManaged(offer)) {
                offer = (Offer) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(offer, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (offer == null) {
                row$realm.nullifyLink(this.columnInfo.offerIndex);
                return;
            }
            this.proxyState.checkValidObject(offer);
            row$realm.getTable().setLink(this.columnInfo.offerIndex, row$realm.getIndex(), ((RealmObjectProxy) offer).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public int realmGet$count() {
        this.proxyState.getRealm$realm().checkIfValid();
        return (int) this.proxyState.getRow$realm().getLong(this.columnInfo.countIndex);
    }

    public void realmSet$count(int i) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.countIndex, (long) i);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.countIndex, row$realm.getIndex(), (long) i, true);
        }
    }

    public String realmGet$companyId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.companyIdIndex);
    }

    public void realmSet$companyId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.companyIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.companyIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.companyIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.companyIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 4, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder.addPersistedLinkProperty(OrderFormFragment.OFFER_TYPE, RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("count", RealmFieldType.INTEGER, false, false, true);
        builder2.addPersistedProperty("companyId", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OrderItemColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new OrderItemColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.OrderItem createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            r11 = 0
            java.lang.String r12 = "id"
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r3 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy$OrderItemColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.OrderItemColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r12)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r12)
            long r2 = r1.findFirstString(r2, r4)
        L_0x0036:
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x006b
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r4 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r4 = r4.get()
            r13 = r4
            io.realm.BaseRealm$RealmObjectContext r13 = (p046io.realm.BaseRealm.RealmObjectContext) r13
            io.realm.internal.UncheckedRow r3 = r1.getUncheckedRow(r2)     // Catch:{ all -> 0x0066 }
            io.realm.RealmSchema r1 = r14.getSchema()     // Catch:{ all -> 0x0066 }
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r2 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r11
        L_0x006c:
            java.lang.String r2 = "offer"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r12)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r12)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r11, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            java.lang.String r3 = r15.getString(r12)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxyInterface r3 = (p046io.realm.C4615x596bcf10) r3
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x00c1
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x00b6
            r3.realmSet$offer(r11)
            goto L_0x00c1
        L_0x00b6:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.marketplace.Offer r0 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$offer(r0)
        L_0x00c1:
            java.lang.String r0 = "count"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x00df
            boolean r2 = r15.isNull(r0)
            if (r2 != 0) goto L_0x00d7
            int r0 = r15.getInt(r0)
            r3.realmSet$count(r0)
            goto L_0x00df
        L_0x00d7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trying to set non-nullable field 'count' to null."
            r0.<init>(r1)
            throw r0
        L_0x00df:
            java.lang.String r0 = "companyId"
            boolean r2 = r15.has(r0)
            if (r2 == 0) goto L_0x00f8
            boolean r2 = r15.isNull(r0)
            if (r2 == 0) goto L_0x00f1
            r3.realmSet$companyId(r11)
            goto L_0x00f8
        L_0x00f1:
            java.lang.String r0 = r15.getString(r0)
            r3.realmSet$companyId(r0)
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.OrderItem");
    }

    public static OrderItem createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        OrderItem orderItem = new OrderItem();
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals(OrderFormFragment.OFFER_TYPE)) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$offer((Offer) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$offer(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (nextName.equals("count")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$count(jsonReader.nextInt());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'count' to null.");
                }
            } else if (!nextName.equals("companyId")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$companyId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$companyId((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (OrderItem) realm.copyToRealm(orderItem, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderItem.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.OrderItem copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.OrderItemColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.OrderItem r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
        /*
            boolean r0 = r10 instanceof p046io.realm.internal.RealmObjectProxy
            if (r0 == 0) goto L_0x0038
            r0 = r10
            io.realm.internal.RealmObjectProxy r0 = (p046io.realm.internal.RealmObjectProxy) r0
            io.realm.ProxyState r1 = r0.realmGet$proxyState()
            io.realm.BaseRealm r1 = r1.getRealm$realm()
            if (r1 == 0) goto L_0x0038
            io.realm.ProxyState r0 = r0.realmGet$proxyState()
            io.realm.BaseRealm r0 = r0.getRealm$realm()
            long r1 = r0.threadId
            long r3 = r8.threadId
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0030
            java.lang.String r0 = r0.getPath()
            java.lang.String r1 = r8.getPath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            return r10
        L_0x0030:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Objects which belong to Realm instances in other threads cannot be copied into this Realm instance."
            r8.<init>(r9)
            throw r8
        L_0x0038:
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r0 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r0 = r0.get()
            io.realm.BaseRealm$RealmObjectContext r0 = (p046io.realm.BaseRealm.RealmObjectContext) r0
            java.lang.Object r1 = r12.get(r10)
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            if (r1 == 0) goto L_0x004b
            ru.unicorn.ujin.data.realm.marketplace.OrderItem r1 = (p035ru.unicorn.ujin.data.realm.marketplace.OrderItem) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.OrderItem> r2 = p035ru.unicorn.ujin.data.realm.marketplace.OrderItem.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxyInterface r5 = (p046io.realm.C4615x596bcf10) r5
            java.lang.String r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x0068
        L_0x0064:
            long r3 = r2.findFirstString(r3, r5)
        L_0x0068:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0070
            r0 = 0
            goto L_0x0094
        L_0x0070:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x008e }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x008e }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008e }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy     // Catch:{ all -> 0x008e }
            r1.<init>()     // Catch:{ all -> 0x008e }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x008e }
            r12.put(r10, r2)     // Catch:{ all -> 0x008e }
            r0.clear()
            goto L_0x0093
        L_0x008e:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0093:
            r0 = r11
        L_0x0094:
            r3 = r1
            if (r0 == 0) goto L_0x00a1
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.marketplace.OrderItem r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.OrderItem r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy$OrderItemColumnInfo, ru.unicorn.ujin.data.realm.marketplace.OrderItem, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.OrderItem");
    }

    public static OrderItem copy(Realm realm, OrderItemColumnInfo orderItemColumnInfo, OrderItem orderItem, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(orderItem);
        if (realmObjectProxy != null) {
            return (OrderItem) realmObjectProxy;
        }
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(OrderItem.class), orderItemColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(orderItemColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$id());
        osObjectBuilder.addInteger(orderItemColumnInfo.countIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$count()));
        osObjectBuilder.addString(orderItemColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$companyId());
        ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(orderItem, newProxyInstance);
        Offer realmGet$offer = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$offer();
        if (realmGet$offer == null) {
            newProxyInstance.realmSet$offer((Offer) null);
        } else {
            Offer offer = (Offer) map.get(realmGet$offer);
            if (offer != null) {
                newProxyInstance.realmSet$offer(offer);
            } else {
                newProxyInstance.realmSet$offer(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class), realmGet$offer, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, OrderItem orderItem, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        OrderItem orderItem2 = orderItem;
        Map<RealmModel, Long> map2 = map;
        if (orderItem2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderItem2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(OrderItem.class);
        long nativePtr = table.getNativePtr();
        OrderItemColumnInfo orderItemColumnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderItem.class);
        long j3 = orderItemColumnInfo.idIndex;
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$id);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(orderItem2, Long.valueOf(j2));
        Offer realmGet$offer = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$offer();
        if (realmGet$offer != null) {
            Long l = map2.get(realmGet$offer);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insert(realm2, realmGet$offer, map2));
            }
            Table.nativeSetLink(nativePtr, orderItemColumnInfo.offerIndex, j2, l.longValue(), false);
        }
        Table.nativeSetLong(nativePtr, orderItemColumnInfo.countIndex, j2, (long) ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$count(), false);
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId != null) {
            Table.nativeSetString(nativePtr, orderItemColumnInfo.companyIdIndex, j2, realmGet$companyId, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(OrderItem.class);
        long nativePtr = table.getNativePtr();
        OrderItemColumnInfo orderItemColumnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderItem.class);
        long j4 = orderItemColumnInfo.idIndex;
        while (it.hasNext()) {
            OrderItem orderItem = (OrderItem) it.next();
            if (!map2.containsKey(orderItem)) {
                if (orderItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(orderItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$id);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$id);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                    j2 = j;
                }
                map2.put(orderItem, Long.valueOf(j2));
                Offer realmGet$offer = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$offer();
                if (realmGet$offer != null) {
                    Long l = map2.get(realmGet$offer);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insert(realm2, realmGet$offer, map2));
                    }
                    j3 = j4;
                    table.setLink(orderItemColumnInfo.offerIndex, j2, l.longValue(), false);
                } else {
                    j3 = j4;
                }
                Table.nativeSetLong(nativePtr, orderItemColumnInfo.countIndex, j2, (long) ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$count(), false);
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId != null) {
                    Table.nativeSetString(nativePtr, orderItemColumnInfo.companyIdIndex, j2, realmGet$companyId, false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, OrderItem orderItem, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        OrderItem orderItem2 = orderItem;
        Map<RealmModel, Long> map2 = map;
        if (orderItem2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderItem2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(OrderItem.class);
        long nativePtr = table.getNativePtr();
        OrderItemColumnInfo orderItemColumnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderItem.class);
        long j2 = orderItemColumnInfo.idIndex;
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(orderItem2, Long.valueOf(createRowWithPrimaryKey));
        Offer realmGet$offer = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$offer();
        if (realmGet$offer != null) {
            Long l = map2.get(realmGet$offer);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insertOrUpdate(realm2, realmGet$offer, map2));
            }
            Table.nativeSetLink(nativePtr, orderItemColumnInfo.offerIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, orderItemColumnInfo.offerIndex, createRowWithPrimaryKey);
        }
        Table.nativeSetLong(nativePtr, orderItemColumnInfo.countIndex, createRowWithPrimaryKey, (long) ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$count(), false);
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId != null) {
            Table.nativeSetString(nativePtr, orderItemColumnInfo.companyIdIndex, createRowWithPrimaryKey, realmGet$companyId, false);
        } else {
            Table.nativeSetNull(nativePtr, orderItemColumnInfo.companyIdIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(OrderItem.class);
        long nativePtr = table.getNativePtr();
        OrderItemColumnInfo orderItemColumnInfo = (OrderItemColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) OrderItem.class);
        long j3 = orderItemColumnInfo.idIndex;
        while (it.hasNext()) {
            OrderItem orderItem = (OrderItem) it.next();
            if (!map2.containsKey(orderItem)) {
                if (orderItem instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) orderItem;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(orderItem, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(orderItem, Long.valueOf(createRowWithPrimaryKey));
                Offer realmGet$offer = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$offer();
                if (realmGet$offer != null) {
                    Long l = map2.get(realmGet$offer);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.insertOrUpdate(realm2, realmGet$offer, map2));
                    }
                    j2 = j3;
                    Table.nativeSetLink(nativePtr, orderItemColumnInfo.offerIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    j2 = j3;
                    Table.nativeNullifyLink(nativePtr, orderItemColumnInfo.offerIndex, createRowWithPrimaryKey);
                }
                Table.nativeSetLong(nativePtr, orderItemColumnInfo.countIndex, createRowWithPrimaryKey, (long) ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$count(), false);
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId != null) {
                    Table.nativeSetString(nativePtr, orderItemColumnInfo.companyIdIndex, createRowWithPrimaryKey, realmGet$companyId, false);
                } else {
                    Table.nativeSetNull(nativePtr, orderItemColumnInfo.companyIdIndex, createRowWithPrimaryKey, false);
                }
                j3 = j2;
            }
        }
    }

    public static OrderItem createDetachedCopy(OrderItem orderItem, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        OrderItem orderItem2;
        if (i > i2 || orderItem == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(orderItem);
        if (cacheData == null) {
            orderItem2 = new OrderItem();
            map.put(orderItem, new RealmObjectProxy.CacheData(i, orderItem2));
        } else if (i >= cacheData.minDepth) {
            return (OrderItem) cacheData.object;
        } else {
            cacheData.minDepth = i;
            orderItem2 = (OrderItem) cacheData.object;
        }
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem2;
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2 = orderItem;
        ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$offer(ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$offer(), i + 1, i2, map));
        ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$count(ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$count());
        ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface.realmSet$companyId(ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$companyId());
        return orderItem2;
    }

    static OrderItem update(Realm realm, OrderItemColumnInfo orderItemColumnInfo, OrderItem orderItem, OrderItem orderItem2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface = orderItem;
        C4615x596bcf10 ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2 = orderItem2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(OrderItem.class), orderItemColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(orderItemColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$id());
        Offer realmGet$offer = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$offer();
        if (realmGet$offer == null) {
            osObjectBuilder.addNull(orderItemColumnInfo.offerIndex);
        } else {
            Offer offer = (Offer) map.get(realmGet$offer);
            if (offer != null) {
                osObjectBuilder.addObject(orderItemColumnInfo.offerIndex, offer);
            } else {
                osObjectBuilder.addObject(orderItemColumnInfo.offerIndex, ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.OfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Offer.class), realmGet$offer, true, map, set));
            }
        }
        osObjectBuilder.addInteger(orderItemColumnInfo.countIndex, Integer.valueOf(ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$count()));
        osObjectBuilder.addString(orderItemColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxyinterface2.realmGet$companyId());
        osObjectBuilder.updateExistingObject();
        return orderItem;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("OrderItem = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{offer:");
        sb.append(realmGet$offer() != null ? ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{count:");
        sb.append(realmGet$count());
        sb.append("}");
        sb.append(",");
        sb.append("{companyId:");
        if (realmGet$companyId() != null) {
            str = realmGet$companyId();
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
        ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_OrderItemRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_orderitemrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
