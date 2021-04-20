package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.data.realm.marketplace.CartOffer;
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
import p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy extends CartOffer implements RealmObjectProxy, C4605x38353795 {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CartOfferColumnInfo columnInfo;
    private ProxyState<CartOffer> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CartOffer";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy$CartOfferColumnInfo */
    static final class CartOfferColumnInfo extends ColumnInfo {
        long idIndex;
        long imageIndex;
        long maxColumnIndexValue;
        long oldPriceIndex;
        long priceIndex;
        long quantityIndex;
        long summaryIndex;
        long titleIndex;

        CartOfferColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.quantityIndex = addColumnDetails(FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.QUANTITY, objectSchemaInfo);
            this.oldPriceIndex = addColumnDetails("oldPrice", "oldPrice", objectSchemaInfo);
            this.summaryIndex = addColumnDetails("summary", "summary", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CartOfferColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CartOfferColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CartOfferColumnInfo cartOfferColumnInfo = (CartOfferColumnInfo) columnInfo;
            CartOfferColumnInfo cartOfferColumnInfo2 = (CartOfferColumnInfo) columnInfo2;
            cartOfferColumnInfo2.idIndex = cartOfferColumnInfo.idIndex;
            cartOfferColumnInfo2.titleIndex = cartOfferColumnInfo.titleIndex;
            cartOfferColumnInfo2.priceIndex = cartOfferColumnInfo.priceIndex;
            cartOfferColumnInfo2.quantityIndex = cartOfferColumnInfo.quantityIndex;
            cartOfferColumnInfo2.oldPriceIndex = cartOfferColumnInfo.oldPriceIndex;
            cartOfferColumnInfo2.summaryIndex = cartOfferColumnInfo.summaryIndex;
            cartOfferColumnInfo2.imageIndex = cartOfferColumnInfo.imageIndex;
            cartOfferColumnInfo2.maxColumnIndexValue = cartOfferColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CartOfferColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$summary() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.summaryIndex);
    }

    public void realmSet$summary(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.summaryIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.summaryIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.summaryIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.summaryIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public FileData realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.imageIndex)) {
            return null;
        }
        return (FileData) this.proxyState.getRealm$realm().get(FileData.class, this.proxyState.getRow$realm().getLink(this.columnInfo.imageIndex), false, Collections.emptyList());
    }

    public void realmSet$image(FileData fileData) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (fileData == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.imageIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            this.proxyState.getRow$realm().setLink(this.columnInfo.imageIndex, ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("image")) {
            if (fileData != null && !RealmObject.isManaged(fileData)) {
                fileData = (FileData) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(fileData, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (fileData == null) {
                row$realm.nullifyLink(this.columnInfo.imageIndex);
                return;
            }
            this.proxyState.checkValidObject(fileData);
            row$realm.getTable().setLink(this.columnInfo.imageIndex, row$realm.getIndex(), ((RealmObjectProxy) fileData).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("price", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(FirebaseAnalytics.Param.QUANTITY, RealmFieldType.INTEGER, false, false, false);
        builder2.addPersistedProperty("oldPrice", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("summary", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("image", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CartOfferColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CartOfferColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.CartOffer createOrUpdateUsingJsonObject(p046io.realm.Realm r14, org.json.JSONObject r15, boolean r16) throws org.json.JSONException {
        /*
            r0 = r14
            r7 = r15
            r8 = r16
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 1
            r9.<init>(r10)
            java.lang.String r11 = "id"
            r12 = 0
            if (r8 == 0) goto L_0x006b
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            io.realm.internal.Table r1 = r14.getTable(r1)
            io.realm.RealmSchema r2 = r14.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r3 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            io.realm.internal.ColumnInfo r2 = r2.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy$CartOfferColumnInfo r2 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.CartOfferColumnInfo) r2
            long r2 = r2.idIndex
            boolean r4 = r15.isNull(r11)
            if (r4 == 0) goto L_0x002e
            long r2 = r1.findFirstNull(r2)
            goto L_0x0036
        L_0x002e:
            java.lang.String r4 = r15.getString(r11)
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r2 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            io.realm.internal.ColumnInfo r4 = r1.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r2)     // Catch:{ all -> 0x0066 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0066 }
            r1 = r13
            r2 = r14
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0066 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
            r13.clear()
            goto L_0x006c
        L_0x0066:
            r0 = move-exception
            r13.clear()
            throw r0
        L_0x006b:
            r1 = r12
        L_0x006c:
            java.lang.String r2 = "image"
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r15.has(r2)
            if (r1 == 0) goto L_0x0079
            r9.add(r2)
        L_0x0079:
            boolean r1 = r15.has(r11)
            if (r1 == 0) goto L_0x009b
            boolean r1 = r15.isNull(r11)
            if (r1 == 0) goto L_0x008e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r12, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy) r1
            goto L_0x00a3
        L_0x008e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            java.lang.String r3 = r15.getString(r11)
            io.realm.RealmModel r1 = r14.createObjectInternal(r1, r3, r10, r9)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy r1 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy) r1
            goto L_0x00a3
        L_0x009b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "JSON object doesn't have the primary key field 'id'."
            r0.<init>(r1)
            throw r0
        L_0x00a3:
            r3 = r1
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxyInterface r3 = (p046io.realm.C4605x38353795) r3
            java.lang.String r4 = "title"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00bf
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00b8
            r3.realmSet$title(r12)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$title(r4)
        L_0x00bf:
            java.lang.String r4 = "price"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00d8
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00d1
            r3.realmSet$price(r12)
            goto L_0x00d8
        L_0x00d1:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$price(r4)
        L_0x00d8:
            java.lang.String r4 = "quantity"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x00f5
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x00ea
            r3.realmSet$quantity(r12)
            goto L_0x00f5
        L_0x00ea:
            int r4 = r15.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.realmSet$quantity(r4)
        L_0x00f5:
            java.lang.String r4 = "oldPrice"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x010e
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0107
            r3.realmSet$oldPrice(r12)
            goto L_0x010e
        L_0x0107:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$oldPrice(r4)
        L_0x010e:
            java.lang.String r4 = "summary"
            boolean r5 = r15.has(r4)
            if (r5 == 0) goto L_0x0127
            boolean r5 = r15.isNull(r4)
            if (r5 == 0) goto L_0x0120
            r3.realmSet$summary(r12)
            goto L_0x0127
        L_0x0120:
            java.lang.String r4 = r15.getString(r4)
            r3.realmSet$summary(r4)
        L_0x0127:
            boolean r4 = r15.has(r2)
            if (r4 == 0) goto L_0x0142
            boolean r4 = r15.isNull(r2)
            if (r4 == 0) goto L_0x0137
            r3.realmSet$image(r12)
            goto L_0x0142
        L_0x0137:
            org.json.JSONObject r2 = r15.getJSONObject(r2)
            ru.unicorn.ujin.data.realm.FileData r0 = p046io.realm.ru_unicorn_ujin_data_realm_FileDataRealmProxy.createOrUpdateUsingJsonObject(r14, r2, r8)
            r3.realmSet$image(r0)
        L_0x0142:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.CartOffer");
    }

    public static CartOffer createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        CartOffer cartOffer = new CartOffer();
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("price")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$price(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$price((String) null);
                }
            } else if (nextName.equals(FirebaseAnalytics.Param.QUANTITY)) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$quantity(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$quantity((Integer) null);
                }
            } else if (nextName.equals("oldPrice")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$oldPrice(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$oldPrice((String) null);
                }
            } else if (nextName.equals("summary")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$summary(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$summary((String) null);
                }
            } else if (!nextName.equals("image")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$image((FileData) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (CartOffer) realm.copyToRealm(cartOffer, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.CartOffer copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.CartOfferColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.CartOffer r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.CartOffer r1 = (p035ru.unicorn.ujin.data.realm.marketplace.CartOffer) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartOffer> r2 = p035ru.unicorn.ujin.data.realm.marketplace.CartOffer.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxyInterface r5 = (p046io.realm.C4605x38353795) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.CartOffer r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.CartOffer r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy$CartOfferColumnInfo, ru.unicorn.ujin.data.realm.marketplace.CartOffer, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.CartOffer");
    }

    public static CartOffer copy(Realm realm, CartOfferColumnInfo cartOfferColumnInfo, CartOffer cartOffer, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(cartOffer);
        if (realmObjectProxy != null) {
            return (CartOffer) realmObjectProxy;
        }
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CartOffer.class), cartOfferColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cartOfferColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(cartOfferColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(cartOfferColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$price());
        osObjectBuilder.addInteger(cartOfferColumnInfo.quantityIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$quantity());
        osObjectBuilder.addString(cartOfferColumnInfo.oldPriceIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$oldPrice());
        osObjectBuilder.addString(cartOfferColumnInfo.summaryIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$summary());
        ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(cartOffer, newProxyInstance);
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$image();
        if (realmGet$image == null) {
            newProxyInstance.realmSet$image((FileData) null);
        } else {
            FileData fileData = (FileData) map.get(realmGet$image);
            if (fileData != null) {
                newProxyInstance.realmSet$image(fileData);
            } else {
                newProxyInstance.realmSet$image(ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$image, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, CartOffer cartOffer, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        CartOffer cartOffer2 = cartOffer;
        Map<RealmModel, Long> map2 = map;
        if (cartOffer2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartOffer2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CartOffer.class);
        long nativePtr = table.getNativePtr();
        CartOfferColumnInfo cartOfferColumnInfo = (CartOfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class);
        long j3 = cartOfferColumnInfo.idIndex;
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$id();
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
        map2.put(cartOffer2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.priceIndex, j2, realmGet$price, false);
        }
        Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(nativePtr, cartOfferColumnInfo.quantityIndex, j2, realmGet$quantity.longValue(), false);
        }
        String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$oldPrice();
        if (realmGet$oldPrice != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.oldPriceIndex, j2, realmGet$oldPrice, false);
        }
        String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.summaryIndex, j2, realmGet$summary, false);
        }
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Long l = map2.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$image, map2));
            }
            Table.nativeSetLink(nativePtr, cartOfferColumnInfo.imageIndex, j2, l.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        long j3;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CartOffer.class);
        long nativePtr = table.getNativePtr();
        CartOfferColumnInfo cartOfferColumnInfo = (CartOfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class);
        long j4 = cartOfferColumnInfo.idIndex;
        while (it.hasNext()) {
            CartOffer cartOffer = (CartOffer) it.next();
            if (!map2.containsKey(cartOffer)) {
                if (cartOffer instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartOffer;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartOffer, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$id();
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
                map2.put(cartOffer, Long.valueOf(j2));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j3 = j4;
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.titleIndex, j2, realmGet$title, false);
                } else {
                    j3 = j4;
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.priceIndex, j2, realmGet$price, false);
                }
                Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$quantity();
                if (realmGet$quantity != null) {
                    Table.nativeSetLong(nativePtr, cartOfferColumnInfo.quantityIndex, j2, realmGet$quantity.longValue(), false);
                }
                String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$oldPrice();
                if (realmGet$oldPrice != null) {
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.oldPriceIndex, j2, realmGet$oldPrice, false);
                }
                String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.summaryIndex, j2, realmGet$summary, false);
                }
                FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Long l = map2.get(realmGet$image);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insert(realm2, realmGet$image, map2));
                    }
                    table.setLink(cartOfferColumnInfo.imageIndex, j2, l.longValue(), false);
                }
                j4 = j3;
            }
        }
    }

    public static long insertOrUpdate(Realm realm, CartOffer cartOffer, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        CartOffer cartOffer2 = cartOffer;
        Map<RealmModel, Long> map2 = map;
        if (cartOffer2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartOffer2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(CartOffer.class);
        long nativePtr = table.getNativePtr();
        CartOfferColumnInfo cartOfferColumnInfo = (CartOfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class);
        long j2 = cartOfferColumnInfo.idIndex;
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map2.put(cartOffer2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, cartOfferColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$price();
        if (realmGet$price != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.priceIndex, createRowWithPrimaryKey, realmGet$price, false);
        } else {
            Table.nativeSetNull(nativePtr, cartOfferColumnInfo.priceIndex, createRowWithPrimaryKey, false);
        }
        Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$quantity();
        if (realmGet$quantity != null) {
            Table.nativeSetLong(nativePtr, cartOfferColumnInfo.quantityIndex, createRowWithPrimaryKey, realmGet$quantity.longValue(), false);
        } else {
            Table.nativeSetNull(nativePtr, cartOfferColumnInfo.quantityIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$oldPrice();
        if (realmGet$oldPrice != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.oldPriceIndex, createRowWithPrimaryKey, realmGet$oldPrice, false);
        } else {
            Table.nativeSetNull(nativePtr, cartOfferColumnInfo.oldPriceIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(nativePtr, cartOfferColumnInfo.summaryIndex, createRowWithPrimaryKey, realmGet$summary, false);
        } else {
            Table.nativeSetNull(nativePtr, cartOfferColumnInfo.summaryIndex, createRowWithPrimaryKey, false);
        }
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Long l = map2.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$image, map2));
            }
            Table.nativeSetLink(nativePtr, cartOfferColumnInfo.imageIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, cartOfferColumnInfo.imageIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(CartOffer.class);
        long nativePtr = table.getNativePtr();
        CartOfferColumnInfo cartOfferColumnInfo = (CartOfferColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CartOffer.class);
        long j3 = cartOfferColumnInfo.idIndex;
        while (it.hasNext()) {
            CartOffer cartOffer = (CartOffer) it.next();
            if (!map2.containsKey(cartOffer)) {
                if (cartOffer instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) cartOffer;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(cartOffer, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j3, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j3, realmGet$id) : j;
                map2.put(cartOffer, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, cartOfferColumnInfo.titleIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$price = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$price();
                if (realmGet$price != null) {
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.priceIndex, createRowWithPrimaryKey, realmGet$price, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartOfferColumnInfo.priceIndex, createRowWithPrimaryKey, false);
                }
                Integer realmGet$quantity = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$quantity();
                if (realmGet$quantity != null) {
                    Table.nativeSetLong(nativePtr, cartOfferColumnInfo.quantityIndex, createRowWithPrimaryKey, realmGet$quantity.longValue(), false);
                } else {
                    Table.nativeSetNull(nativePtr, cartOfferColumnInfo.quantityIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$oldPrice = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$oldPrice();
                if (realmGet$oldPrice != null) {
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.oldPriceIndex, createRowWithPrimaryKey, realmGet$oldPrice, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartOfferColumnInfo.oldPriceIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$summary = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$summary();
                if (realmGet$summary != null) {
                    Table.nativeSetString(nativePtr, cartOfferColumnInfo.summaryIndex, createRowWithPrimaryKey, realmGet$summary, false);
                } else {
                    Table.nativeSetNull(nativePtr, cartOfferColumnInfo.summaryIndex, createRowWithPrimaryKey, false);
                }
                FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Long l = map2.get(realmGet$image);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_FileDataRealmProxy.insertOrUpdate(realm2, realmGet$image, map2));
                    }
                    Table.nativeSetLink(nativePtr, cartOfferColumnInfo.imageIndex, createRowWithPrimaryKey, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, cartOfferColumnInfo.imageIndex, createRowWithPrimaryKey);
                }
                j3 = j2;
            }
        }
    }

    public static CartOffer createDetachedCopy(CartOffer cartOffer, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        CartOffer cartOffer2;
        if (i > i2 || cartOffer == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(cartOffer);
        if (cacheData == null) {
            cartOffer2 = new CartOffer();
            map.put(cartOffer, new RealmObjectProxy.CacheData(i, cartOffer2));
        } else if (i >= cacheData.minDepth) {
            return (CartOffer) cacheData.object;
        } else {
            cacheData.minDepth = i;
            cartOffer2 = (CartOffer) cacheData.object;
        }
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer2;
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2 = cartOffer;
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$price(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$price());
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$quantity(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$quantity());
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$oldPrice(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$oldPrice());
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$summary(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$summary());
        ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_FileDataRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$image(), i + 1, i2, map));
        return cartOffer2;
    }

    static CartOffer update(Realm realm, CartOfferColumnInfo cartOfferColumnInfo, CartOffer cartOffer, CartOffer cartOffer2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface = cartOffer;
        C4605x38353795 ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2 = cartOffer2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(CartOffer.class), cartOfferColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(cartOfferColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(cartOfferColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(cartOfferColumnInfo.priceIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$price());
        osObjectBuilder.addInteger(cartOfferColumnInfo.quantityIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$quantity());
        osObjectBuilder.addString(cartOfferColumnInfo.oldPriceIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$oldPrice());
        osObjectBuilder.addString(cartOfferColumnInfo.summaryIndex, ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$summary());
        FileData realmGet$image = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxyinterface2.realmGet$image();
        if (realmGet$image == null) {
            osObjectBuilder.addNull(cartOfferColumnInfo.imageIndex);
        } else {
            FileData fileData = (FileData) map.get(realmGet$image);
            if (fileData != null) {
                osObjectBuilder.addObject(cartOfferColumnInfo.imageIndex, fileData);
            } else {
                osObjectBuilder.addObject(cartOfferColumnInfo.imageIndex, ru_unicorn_ujin_data_realm_FileDataRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_FileDataRealmProxy.FileDataColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) FileData.class), realmGet$image, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return cartOffer;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("CartOffer = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{price:");
        sb.append(realmGet$price() != null ? realmGet$price() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{quantity:");
        sb.append(realmGet$quantity() != null ? realmGet$quantity() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{oldPrice:");
        sb.append(realmGet$oldPrice() != null ? realmGet$oldPrice() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{summary:");
        sb.append(realmGet$summary() != null ? realmGet$summary() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        if (realmGet$image() != null) {
            str = ru_unicorn_ujin_data_realm_FileDataRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CartOfferRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_cartofferrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
