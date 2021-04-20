package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Order;
import p035ru.unicorn.ujin.market.company.CompanyFragment;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.tickets.PaymentFormFragment;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy extends Order implements RealmObjectProxy, ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private OrderColumnInfo columnInfo;
    private ProxyState<Order> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Order";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy$OrderColumnInfo */
    static final class OrderColumnInfo extends ColumnInfo {
        long amountIndex;
        long companyDeliveryIndex;
        long companyIdIndex;
        long companyTitleIndex;
        long maxColumnIndexValue;
        long oldAmountIndex;

        OrderColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.companyIdIndex = addColumnDetails("companyId", "companyId", objectSchemaInfo);
            this.companyTitleIndex = addColumnDetails(CompanyFragment.COMPANY_TITLE, CompanyFragment.COMPANY_TITLE, objectSchemaInfo);
            this.companyDeliveryIndex = addColumnDetails("companyDelivery", "companyDelivery", objectSchemaInfo);
            this.amountIndex = addColumnDetails(PaymentFormFragment.AMOUNT, PaymentFormFragment.AMOUNT, objectSchemaInfo);
            this.oldAmountIndex = addColumnDetails("oldAmount", "oldAmount", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OrderColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new OrderColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            OrderColumnInfo orderColumnInfo = (OrderColumnInfo) columnInfo;
            OrderColumnInfo orderColumnInfo2 = (OrderColumnInfo) columnInfo2;
            orderColumnInfo2.companyIdIndex = orderColumnInfo.companyIdIndex;
            orderColumnInfo2.companyTitleIndex = orderColumnInfo.companyTitleIndex;
            orderColumnInfo2.companyDeliveryIndex = orderColumnInfo.companyDeliveryIndex;
            orderColumnInfo2.amountIndex = orderColumnInfo.amountIndex;
            orderColumnInfo2.oldAmountIndex = orderColumnInfo.oldAmountIndex;
            orderColumnInfo2.maxColumnIndexValue = orderColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (OrderColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public String realmGet$companyId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.companyIdIndex);
    }

    public void realmSet$companyId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'companyId' cannot be changed after object was created.");
        }
    }

    public String realmGet$companyTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.companyTitleIndex);
    }

    public void realmSet$companyTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.companyTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.companyTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.companyTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.companyTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$companyDelivery() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.companyDeliveryIndex);
    }

    public void realmSet$companyDelivery(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.companyDeliveryIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.companyDeliveryIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.companyDeliveryIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.companyDeliveryIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public double realmGet$amount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getDouble(this.columnInfo.amountIndex);
    }

    public void realmSet$amount(double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setDouble(this.columnInfo.amountIndex, d);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setDouble(this.columnInfo.amountIndex, row$realm.getIndex(), d, true);
        }
    }

    public double realmGet$oldAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getDouble(this.columnInfo.oldAmountIndex);
    }

    public void realmSet$oldAmount(double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setDouble(this.columnInfo.oldAmountIndex, d);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setDouble(this.columnInfo.oldAmountIndex, row$realm.getIndex(), d, true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 5, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("companyId", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty(CompanyFragment.COMPANY_TITLE, RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("companyDelivery", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(PaymentFormFragment.AMOUNT, RealmFieldType.DOUBLE, false, false, true);
        builder2.addPersistedProperty("oldAmount", RealmFieldType.DOUBLE, false, false, true);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OrderColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new OrderColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v7, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Order createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "companyId"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy$OrderColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.OrderColumnInfo) r3
            long r3 = r3.companyIdIndex
            boolean r5 = r13.isNull(r2)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r2)
            long r3 = r14.findFirstString(r3, r5)
        L_0x0030:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0064
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r5 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r5 = r5.get()
            io.realm.BaseRealm$RealmObjectContext r5 = (p046io.realm.BaseRealm.RealmObjectContext) r5
            io.realm.internal.UncheckedRow r8 = r14.getUncheckedRow(r3)     // Catch:{ all -> 0x005f }
            io.realm.RealmSchema r14 = r12.getSchema()     // Catch:{ all -> 0x005f }
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r1
        L_0x0065:
            if (r14 != 0) goto L_0x0094
            boolean r14 = r13.has(r2)
            if (r14 == 0) goto L_0x008c
            boolean r14 = r13.isNull(r2)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            java.lang.String r2 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'companyId'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface) r12
            java.lang.String r0 = "companyTitle"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00a9
            r12.realmSet$companyTitle(r1)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$companyTitle(r0)
        L_0x00b0:
            java.lang.String r0 = "companyDelivery"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00c2
            r12.realmSet$companyDelivery(r1)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$companyDelivery(r0)
        L_0x00c9:
            java.lang.String r0 = "amount"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e7
            boolean r1 = r13.isNull(r0)
            if (r1 != 0) goto L_0x00df
            double r0 = r13.getDouble(r0)
            r12.realmSet$amount(r0)
            goto L_0x00e7
        L_0x00df:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Trying to set non-nullable field 'amount' to null."
            r12.<init>(r13)
            throw r12
        L_0x00e7:
            java.lang.String r0 = "oldAmount"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0105
            boolean r1 = r13.isNull(r0)
            if (r1 != 0) goto L_0x00fd
            double r0 = r13.getDouble(r0)
            r12.realmSet$oldAmount(r0)
            goto L_0x0105
        L_0x00fd:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Trying to set non-nullable field 'oldAmount' to null."
            r12.<init>(r13)
            throw r12
        L_0x0105:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Order");
    }

    public static Order createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Order order = new Order();
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("companyId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyId((String) null);
                }
                z = true;
            } else if (nextName.equals(CompanyFragment.COMPANY_TITLE)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyTitle((String) null);
                }
            } else if (nextName.equals("companyDelivery")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyDelivery(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyDelivery((String) null);
                }
            } else if (nextName.equals(PaymentFormFragment.AMOUNT)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$amount(jsonReader.nextDouble());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'amount' to null.");
                }
            } else if (!nextName.equals("oldAmount")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$oldAmount(jsonReader.nextDouble());
            } else {
                jsonReader.skipValue();
                throw new IllegalArgumentException("Trying to set non-nullable field 'oldAmount' to null.");
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Order) realm.copyToRealm(order, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'companyId'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Order.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy ru_unicorn_ujin_data_realm_marketplace_orderrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_orderrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Order copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.OrderColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Order r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Order r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Order) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Order> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Order.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.companyIdIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface) r5
            java.lang.String r5 = r5.realmGet$companyId()
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.Order r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Order r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy$OrderColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Order, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Order");
    }

    public static Order copy(Realm realm, OrderColumnInfo orderColumnInfo, Order order, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(order);
        if (realmObjectProxy != null) {
            return (Order) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Order.class), orderColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(orderColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyId());
        osObjectBuilder.addString(orderColumnInfo.companyTitleIndex, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyTitle());
        osObjectBuilder.addString(orderColumnInfo.companyDeliveryIndex, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyDelivery());
        osObjectBuilder.addDouble(orderColumnInfo.amountIndex, Double.valueOf(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$amount()));
        osObjectBuilder.addDouble(orderColumnInfo.oldAmountIndex, Double.valueOf(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$oldAmount()));
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(order, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Order order, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Order order2 = order;
        if (order2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) order2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Order.class);
        long nativePtr = table.getNativePtr();
        OrderColumnInfo orderColumnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Order.class);
        long j3 = orderColumnInfo.companyIdIndex;
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order2;
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j3, realmGet$companyId);
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, realmGet$companyId);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$companyId);
            j2 = j;
        }
        map.put(order2, Long.valueOf(j2));
        String realmGet$companyTitle = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyTitle();
        if (realmGet$companyTitle != null) {
            Table.nativeSetString(nativePtr, orderColumnInfo.companyTitleIndex, j2, realmGet$companyTitle, false);
        }
        String realmGet$companyDelivery = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyDelivery();
        if (realmGet$companyDelivery != null) {
            Table.nativeSetString(nativePtr, orderColumnInfo.companyDeliveryIndex, j2, realmGet$companyDelivery, false);
        }
        long j4 = nativePtr;
        long j5 = j2;
        Table.nativeSetDouble(j4, orderColumnInfo.amountIndex, j5, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$amount(), false);
        Table.nativeSetDouble(j4, orderColumnInfo.oldAmountIndex, j5, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$oldAmount(), false);
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Order.class);
        long nativePtr = table.getNativePtr();
        OrderColumnInfo orderColumnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Order.class);
        long j4 = orderColumnInfo.companyIdIndex;
        while (it.hasNext()) {
            Order order = (Order) it.next();
            if (!map2.containsKey(order)) {
                if (order instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) order;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(order, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order;
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j4);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j4, realmGet$companyId);
                }
                if (j == -1) {
                    j2 = OsObject.createRowWithPrimaryKey(table, j4, realmGet$companyId);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$companyId);
                    j2 = j;
                }
                map2.put(order, Long.valueOf(j2));
                String realmGet$companyTitle = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyTitle();
                if (realmGet$companyTitle != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, orderColumnInfo.companyTitleIndex, j2, realmGet$companyTitle, false);
                } else {
                    j3 = j4;
                }
                String realmGet$companyDelivery = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyDelivery();
                if (realmGet$companyDelivery != null) {
                    Table.nativeSetString(nativePtr, orderColumnInfo.companyDeliveryIndex, j2, realmGet$companyDelivery, false);
                }
                long j5 = nativePtr;
                long j6 = j2;
                Table.nativeSetDouble(j5, orderColumnInfo.amountIndex, j6, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$amount(), false);
                Table.nativeSetDouble(j5, orderColumnInfo.oldAmountIndex, j6, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$oldAmount(), false);
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Order order, Map<RealmModel, Long> map) {
        long j;
        Order order2 = order;
        if (order2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) order2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Order.class);
        long nativePtr = table.getNativePtr();
        OrderColumnInfo orderColumnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Order.class);
        long j2 = orderColumnInfo.companyIdIndex;
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order2;
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$companyId);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$companyId) : j;
        map.put(order2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$companyTitle = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyTitle();
        if (realmGet$companyTitle != null) {
            Table.nativeSetString(nativePtr, orderColumnInfo.companyTitleIndex, createRowWithPrimaryKey, realmGet$companyTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, orderColumnInfo.companyTitleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$companyDelivery = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyDelivery();
        if (realmGet$companyDelivery != null) {
            Table.nativeSetString(nativePtr, orderColumnInfo.companyDeliveryIndex, createRowWithPrimaryKey, realmGet$companyDelivery, false);
        } else {
            Table.nativeSetNull(nativePtr, orderColumnInfo.companyDeliveryIndex, createRowWithPrimaryKey, false);
        }
        long j3 = nativePtr;
        long j4 = createRowWithPrimaryKey;
        Table.nativeSetDouble(j3, orderColumnInfo.amountIndex, j4, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$amount(), false);
        Table.nativeSetDouble(j3, orderColumnInfo.oldAmountIndex, j4, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$oldAmount(), false);
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Order.class);
        long nativePtr = table.getNativePtr();
        OrderColumnInfo orderColumnInfo = (OrderColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Order.class);
        long j3 = orderColumnInfo.companyIdIndex;
        while (it.hasNext()) {
            Order order = (Order) it.next();
            if (!map2.containsKey(order)) {
                if (order instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) order;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(order, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order;
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$companyId);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$companyId) : j;
                map2.put(order, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$companyTitle = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyTitle();
                if (realmGet$companyTitle != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, orderColumnInfo.companyTitleIndex, createRowWithPrimaryKey, realmGet$companyTitle, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, orderColumnInfo.companyTitleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$companyDelivery = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$companyDelivery();
                if (realmGet$companyDelivery != null) {
                    Table.nativeSetString(nativePtr, orderColumnInfo.companyDeliveryIndex, createRowWithPrimaryKey, realmGet$companyDelivery, false);
                } else {
                    Table.nativeSetNull(nativePtr, orderColumnInfo.companyDeliveryIndex, createRowWithPrimaryKey, false);
                }
                long j4 = nativePtr;
                long j5 = createRowWithPrimaryKey;
                Table.nativeSetDouble(j4, orderColumnInfo.amountIndex, j5, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$amount(), false);
                Table.nativeSetDouble(j4, orderColumnInfo.oldAmountIndex, j5, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmGet$oldAmount(), false);
                j3 = j2;
            }
        }
    }

    public static Order createDetachedCopy(Order order, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Order order2;
        if (i > i2 || order == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(order);
        if (cacheData == null) {
            order2 = new Order();
            map.put(order, new RealmObjectProxy.CacheData(i, order2));
        } else if (i >= cacheData.minDepth) {
            return (Order) cacheData.object;
        } else {
            cacheData.minDepth = i;
            order2 = (Order) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order2;
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2 = order;
        ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyId(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$companyId());
        ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyTitle(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$companyTitle());
        ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$companyDelivery(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$companyDelivery());
        ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$amount(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$amount());
        ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface.realmSet$oldAmount(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$oldAmount());
        return order2;
    }

    static Order update(Realm realm, OrderColumnInfo orderColumnInfo, Order order, Order order2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface = order;
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2 = order2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Order.class), orderColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(orderColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$companyId());
        osObjectBuilder.addString(orderColumnInfo.companyTitleIndex, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$companyTitle());
        osObjectBuilder.addString(orderColumnInfo.companyDeliveryIndex, ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$companyDelivery());
        osObjectBuilder.addDouble(orderColumnInfo.amountIndex, Double.valueOf(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$amount()));
        osObjectBuilder.addDouble(orderColumnInfo.oldAmountIndex, Double.valueOf(ru_unicorn_ujin_data_realm_marketplace_orderrealmproxyinterface2.realmGet$oldAmount()));
        osObjectBuilder.updateExistingObject();
        return order;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Order = proxy[");
        sb.append("{companyId:");
        String str = "null";
        sb.append(realmGet$companyId() != null ? realmGet$companyId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{companyTitle:");
        sb.append(realmGet$companyTitle() != null ? realmGet$companyTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{companyDelivery:");
        if (realmGet$companyDelivery() != null) {
            str = realmGet$companyDelivery();
        }
        sb.append(str);
        sb.append("}");
        sb.append(",");
        sb.append("{amount:");
        sb.append(realmGet$amount());
        sb.append("}");
        sb.append(",");
        sb.append("{oldAmount:");
        sb.append(realmGet$oldAmount());
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
        ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy ru_unicorn_ujin_data_realm_marketplace_orderrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_OrderRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_orderrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_orderrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
