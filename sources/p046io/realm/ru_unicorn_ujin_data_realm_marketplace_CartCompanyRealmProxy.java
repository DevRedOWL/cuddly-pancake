package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.CartCompany;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy extends CartCompany implements RealmObjectProxy, C4603xa36a2614 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CartCompanyColumnInfo columnInfo;
    private ProxyState<CartCompany> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CartCompany";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy$CartCompanyColumnInfo */
    static final class CartCompanyColumnInfo extends ColumnInfo {
        long deliveryIndex;
        long idIndex;
        long maxColumnIndexValue;
        long titleIndex;

        CartCompanyColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.deliveryIndex = addColumnDetails("delivery", "delivery", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CartCompanyColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CartCompanyColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CartCompanyColumnInfo cartCompanyColumnInfo = (CartCompanyColumnInfo) columnInfo;
            CartCompanyColumnInfo cartCompanyColumnInfo2 = (CartCompanyColumnInfo) columnInfo2;
            cartCompanyColumnInfo2.idIndex = cartCompanyColumnInfo.idIndex;
            cartCompanyColumnInfo2.titleIndex = cartCompanyColumnInfo.titleIndex;
            cartCompanyColumnInfo2.deliveryIndex = cartCompanyColumnInfo.deliveryIndex;
            cartCompanyColumnInfo2.maxColumnIndexValue = cartCompanyColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CartCompanyColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$delivery() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.deliveryIndex);
    }

    public void realmSet$delivery(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.deliveryIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.deliveryIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.deliveryIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.deliveryIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 3, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("delivery", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CartCompanyColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CartCompanyColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.CartCompany createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 0
            java.lang.String r2 = "id"
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r14 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r4 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy$CartCompanyColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.CartCompanyColumnInfo) r3
            long r3 = r3.idIndex
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r3 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r14 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r14 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            java.lang.String r2 = r13.getString(r2)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxyInterface r12 = (p046io.realm.C4603xa36a2614) r12
            java.lang.String r0 = "title"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00b0
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00a9
            r12.realmSet$title(r1)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$title(r0)
        L_0x00b0:
            java.lang.String r0 = "delivery"
            boolean r2 = r13.has(r0)
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r13.isNull(r0)
            if (r2 == 0) goto L_0x00c2
            r12.realmSet$delivery(r1)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$delivery(r13)
        L_0x00c9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.CartCompany");
    }

    public static CartCompany createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CartCompany cartCompany = new CartCompany();
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (!nextName.equals("delivery")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$delivery(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$delivery((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (CartCompany) realm.copyToRealm(cartCompany, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.CartCompany copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.CartCompanyColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.CartCompany r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.CartCompany r1 = (p035ru.unicorn.ujin.data.realm.marketplace.CartCompany) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartCompany> r2 = p035ru.unicorn.ujin.data.realm.marketplace.CartCompany.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxyInterface r5 = (p046io.realm.C4603xa36a2614) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.CartCompany r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.CartCompany r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy$CartCompanyColumnInfo, ru.unicorn.ujin.data.realm.marketplace.CartCompany, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.CartCompany");
    }

    public static CartCompany copy(Realm realm, CartCompanyColumnInfo cartCompanyColumnInfo, CartCompany cartCompany, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cartCompany);
        if (realmObjectProxy != null) {
            return (CartCompany) realmObjectProxy;
        }
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CartCompany.class), cartCompanyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cartCompanyColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(cartCompanyColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(cartCompanyColumnInfo.deliveryIndex, ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$delivery());
        ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cartCompany, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, CartCompany cartCompany, Map<RealmModel, Long> map) {
        long j;
        long j2;
        CartCompany cartCompany2 = cartCompany;
        if (cartCompany2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartCompany2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CartCompany.class);
        long nativePtr = table.getNativePtr();
        CartCompanyColumnInfo cartCompanyColumnInfo = (CartCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class);
        long j3 = cartCompanyColumnInfo.idIndex;
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$id();
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
        map.put(cartCompany2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cartCompanyColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$delivery();
        if (realmGet$delivery != null) {
            Table.nativeSetString(nativePtr, cartCompanyColumnInfo.deliveryIndex, j2, realmGet$delivery, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CartCompany.class);
        long nativePtr = table.getNativePtr();
        CartCompanyColumnInfo cartCompanyColumnInfo = (CartCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class);
        long j3 = cartCompanyColumnInfo.idIndex;
        while (it.hasNext()) {
            CartCompany cartCompany = (CartCompany) it.next();
            if (!map2.containsKey(cartCompany)) {
                if (cartCompany instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartCompany;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartCompany, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$id();
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
                map2.put(cartCompany, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, cartCompanyColumnInfo.titleIndex, j2, realmGet$title, false);
                }
                String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$delivery();
                if (realmGet$delivery != null) {
                    Table.nativeSetString(nativePtr, cartCompanyColumnInfo.deliveryIndex, j2, realmGet$delivery, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CartCompany cartCompany, Map<RealmModel, Long> map) {
        long j;
        CartCompany cartCompany2 = cartCompany;
        if (cartCompany2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartCompany2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(CartCompany.class);
        long nativePtr = table.getNativePtr();
        CartCompanyColumnInfo cartCompanyColumnInfo = (CartCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class);
        long j2 = cartCompanyColumnInfo.idIndex;
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(cartCompany2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cartCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, cartCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$delivery();
        if (realmGet$delivery != null) {
            Table.nativeSetString(nativePtr, cartCompanyColumnInfo.deliveryIndex, createRowWithPrimaryKey, realmGet$delivery, false);
        } else {
            Table.nativeSetNull(nativePtr, cartCompanyColumnInfo.deliveryIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(CartCompany.class);
        long nativePtr = table.getNativePtr();
        CartCompanyColumnInfo cartCompanyColumnInfo = (CartCompanyColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartCompany.class);
        long j2 = cartCompanyColumnInfo.idIndex;
        while (it.hasNext()) {
            CartCompany cartCompany = (CartCompany) it.next();
            if (!map2.containsKey(cartCompany)) {
                if (cartCompany instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartCompany;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartCompany, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
                map2.put(cartCompany, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, cartCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartCompanyColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$delivery = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmGet$delivery();
                if (realmGet$delivery != null) {
                    Table.nativeSetString(nativePtr, cartCompanyColumnInfo.deliveryIndex, createRowWithPrimaryKey, realmGet$delivery, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartCompanyColumnInfo.deliveryIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static CartCompany createDetachedCopy(CartCompany cartCompany, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CartCompany cartCompany2;
        if (i > i2 || cartCompany == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cartCompany);
        if (cacheData == null) {
            cartCompany2 = new CartCompany();
            map.put(cartCompany, new RealmObjectProxy.CacheData(i, cartCompany2));
        } else if (i >= cacheData.minDepth) {
            return (CartCompany) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cartCompany2 = (CartCompany) cacheData.object;
        }
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany2;
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2 = cartCompany;
        ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface.realmSet$delivery(ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2.realmGet$delivery());
        return cartCompany2;
    }

    static CartCompany update(Realm realm, CartCompanyColumnInfo cartCompanyColumnInfo, CartCompany cartCompany, CartCompany cartCompany2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface = cartCompany;
        C4603xa36a2614 ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2 = cartCompany2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CartCompany.class), cartCompanyColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cartCompanyColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(cartCompanyColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(cartCompanyColumnInfo.deliveryIndex, ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxyinterface2.realmGet$delivery());
        osObjectBuilder.updateExistingObject();
        return cartCompany;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartCompany = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{delivery:");
        if (realmGet$delivery() != null) {
            str = realmGet$delivery();
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
        ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CartCompanyRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_cartcompanyrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
