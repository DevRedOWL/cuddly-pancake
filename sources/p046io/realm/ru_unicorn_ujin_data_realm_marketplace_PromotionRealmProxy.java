package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Promotion;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy extends Promotion implements RealmObjectProxy, C4618xa0424aae {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private PromotionColumnInfo columnInfo;
    private ProxyState<Promotion> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Promotion";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy$PromotionColumnInfo */
    static final class PromotionColumnInfo extends ColumnInfo {
        long companyIdIndex;
        long createdAtIndex;
        long finishedAtIndex;
        long idIndex;
        long maxColumnIndexValue;
        long startedAtIndex;
        long textIndex;
        long updatedAtIndex;

        PromotionColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.textIndex = addColumnDetails("text", "text", objectSchemaInfo);
            this.companyIdIndex = addColumnDetails("companyId", "companyId", objectSchemaInfo);
            this.startedAtIndex = addColumnDetails("startedAt", "startedAt", objectSchemaInfo);
            this.finishedAtIndex = addColumnDetails("finishedAt", "finishedAt", objectSchemaInfo);
            this.createdAtIndex = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtIndex = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PromotionColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new PromotionColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            PromotionColumnInfo promotionColumnInfo = (PromotionColumnInfo) columnInfo;
            PromotionColumnInfo promotionColumnInfo2 = (PromotionColumnInfo) columnInfo2;
            promotionColumnInfo2.idIndex = promotionColumnInfo.idIndex;
            promotionColumnInfo2.textIndex = promotionColumnInfo.textIndex;
            promotionColumnInfo2.companyIdIndex = promotionColumnInfo.companyIdIndex;
            promotionColumnInfo2.startedAtIndex = promotionColumnInfo.startedAtIndex;
            promotionColumnInfo2.finishedAtIndex = promotionColumnInfo.finishedAtIndex;
            promotionColumnInfo2.createdAtIndex = promotionColumnInfo.createdAtIndex;
            promotionColumnInfo2.updatedAtIndex = promotionColumnInfo.updatedAtIndex;
            promotionColumnInfo2.maxColumnIndexValue = promotionColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (PromotionColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$startedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.startedAtIndex);
    }

    public void realmSet$startedAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.startedAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.startedAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.startedAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.startedAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$finishedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.finishedAtIndex);
    }

    public void realmSet$finishedAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.finishedAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.finishedAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.finishedAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.finishedAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.createdAtIndex);
    }

    public void realmSet$createdAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.createdAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.createdAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.createdAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.createdAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.updatedAtIndex);
    }

    public void realmSet$updatedAt(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.updatedAtIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.updatedAtIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.updatedAtIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.updatedAtIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 7, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("text", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("companyId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("startedAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("finishedAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("createdAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("updatedAt", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PromotionColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new PromotionColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r12v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r12v5, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Promotion createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy$PromotionColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.PromotionColumnInfo) r3
            long r3 = r3.idIndex
            boolean r5 = r13.isNull(r1)
            if (r5 == 0) goto L_0x0028
            long r3 = r14.findFirstNull(r3)
            goto L_0x0030
        L_0x0028:
            java.lang.String r5 = r13.getString(r1)
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy     // Catch:{ all -> 0x005f }
            r14.<init>()     // Catch:{ all -> 0x005f }
            r5.clear()
            goto L_0x0065
        L_0x005f:
            r12 = move-exception
            r5.clear()
            throw r12
        L_0x0064:
            r14 = r2
        L_0x0065:
            if (r14 != 0) goto L_0x0094
            boolean r14 = r13.has(r1)
            if (r14 == 0) goto L_0x008c
            boolean r14 = r13.isNull(r1)
            r3 = 1
            if (r14 == 0) goto L_0x007e
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxyInterface r12 = (p046io.realm.C4618xa0424aae) r12
            java.lang.String r0 = "text"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$text(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$text(r0)
        L_0x00b0:
            java.lang.String r0 = "companyId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$companyId(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$companyId(r0)
        L_0x00c9:
            java.lang.String r0 = "startedAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$startedAt(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$startedAt(r0)
        L_0x00e2:
            java.lang.String r0 = "finishedAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f4
            r12.realmSet$finishedAt(r2)
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$finishedAt(r0)
        L_0x00fb:
            java.lang.String r0 = "createdAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0114
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x010d
            r12.realmSet$createdAt(r2)
            goto L_0x0114
        L_0x010d:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$createdAt(r0)
        L_0x0114:
            java.lang.String r0 = "updatedAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x012e
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0127
            r12.realmSet$updatedAt(r2)
            goto L_0x012e
        L_0x0127:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$updatedAt(r13)
        L_0x012e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Promotion");
    }

    public static Promotion createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Promotion promotion = new Promotion();
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("text")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$text(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$text((String) null);
                }
            } else if (nextName.equals("companyId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$companyId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$companyId((String) null);
                }
            } else if (nextName.equals("startedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$startedAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$startedAt((String) null);
                }
            } else if (nextName.equals("finishedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$finishedAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$finishedAt((String) null);
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$createdAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$createdAt((String) null);
                }
            } else if (!nextName.equals("updatedAt")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$updatedAt(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$updatedAt((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Promotion) realm.copyToRealm(promotion, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Promotion.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Promotion copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.PromotionColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Promotion r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Promotion r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Promotion) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Promotion> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Promotion.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxyInterface r5 = (p046io.realm.C4618xa0424aae) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.Promotion r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Promotion r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy$PromotionColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Promotion, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Promotion");
    }

    public static Promotion copy(Realm realm, PromotionColumnInfo promotionColumnInfo, Promotion promotion, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(promotion);
        if (realmObjectProxy != null) {
            return (Promotion) realmObjectProxy;
        }
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Promotion.class), promotionColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(promotionColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(promotionColumnInfo.textIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$text());
        osObjectBuilder.addString(promotionColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$companyId());
        osObjectBuilder.addString(promotionColumnInfo.startedAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$startedAt());
        osObjectBuilder.addString(promotionColumnInfo.finishedAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$finishedAt());
        osObjectBuilder.addString(promotionColumnInfo.createdAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$createdAt());
        osObjectBuilder.addString(promotionColumnInfo.updatedAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$updatedAt());
        ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(promotion, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Promotion promotion, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Promotion promotion2 = promotion;
        if (promotion2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) promotion2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Promotion.class);
        long nativePtr = table.getNativePtr();
        PromotionColumnInfo promotionColumnInfo = (PromotionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Promotion.class);
        long j3 = promotionColumnInfo.idIndex;
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$id();
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
        map.put(promotion2, Long.valueOf(j2));
        String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.textIndex, j2, realmGet$text, false);
        }
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.companyIdIndex, j2, realmGet$companyId, false);
        }
        String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$startedAt();
        if (realmGet$startedAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.startedAtIndex, j2, realmGet$startedAt, false);
        }
        String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$finishedAt();
        if (realmGet$finishedAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.finishedAtIndex, j2, realmGet$finishedAt, false);
        }
        String realmGet$createdAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.createdAtIndex, j2, realmGet$createdAt, false);
        }
        String realmGet$updatedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.updatedAtIndex, j2, realmGet$updatedAt, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Promotion.class);
        long nativePtr = table.getNativePtr();
        PromotionColumnInfo promotionColumnInfo = (PromotionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Promotion.class);
        long j3 = promotionColumnInfo.idIndex;
        while (it.hasNext()) {
            Promotion promotion = (Promotion) it.next();
            if (!map2.containsKey(promotion)) {
                if (promotion instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) promotion;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(promotion, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$id();
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
                map2.put(promotion, Long.valueOf(j2));
                String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.textIndex, j2, realmGet$text, false);
                }
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.companyIdIndex, j2, realmGet$companyId, false);
                }
                String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$startedAt();
                if (realmGet$startedAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.startedAtIndex, j2, realmGet$startedAt, false);
                }
                String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$finishedAt();
                if (realmGet$finishedAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.finishedAtIndex, j2, realmGet$finishedAt, false);
                }
                String realmGet$createdAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.createdAtIndex, j2, realmGet$createdAt, false);
                }
                String realmGet$updatedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.updatedAtIndex, j2, realmGet$updatedAt, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Promotion promotion, Map<RealmModel, Long> map) {
        long j;
        Promotion promotion2 = promotion;
        if (promotion2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) promotion2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Promotion.class);
        long nativePtr = table.getNativePtr();
        PromotionColumnInfo promotionColumnInfo = (PromotionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Promotion.class);
        long j2 = promotionColumnInfo.idIndex;
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(promotion2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$text();
        if (realmGet$text != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.textIndex, createRowWithPrimaryKey, realmGet$text, false);
        } else {
            Table.nativeSetNull(nativePtr, promotionColumnInfo.textIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$companyId();
        if (realmGet$companyId != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.companyIdIndex, createRowWithPrimaryKey, realmGet$companyId, false);
        } else {
            Table.nativeSetNull(nativePtr, promotionColumnInfo.companyIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$startedAt();
        if (realmGet$startedAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.startedAtIndex, createRowWithPrimaryKey, realmGet$startedAt, false);
        } else {
            Table.nativeSetNull(nativePtr, promotionColumnInfo.startedAtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$finishedAt();
        if (realmGet$finishedAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.finishedAtIndex, createRowWithPrimaryKey, realmGet$finishedAt, false);
        } else {
            Table.nativeSetNull(nativePtr, promotionColumnInfo.finishedAtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$createdAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.createdAtIndex, createRowWithPrimaryKey, realmGet$createdAt, false);
        } else {
            Table.nativeSetNull(nativePtr, promotionColumnInfo.createdAtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$updatedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(nativePtr, promotionColumnInfo.updatedAtIndex, createRowWithPrimaryKey, realmGet$updatedAt, false);
        } else {
            Table.nativeSetNull(nativePtr, promotionColumnInfo.updatedAtIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Promotion.class);
        long nativePtr = table.getNativePtr();
        PromotionColumnInfo promotionColumnInfo = (PromotionColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Promotion.class);
        long j2 = promotionColumnInfo.idIndex;
        while (it.hasNext()) {
            Promotion promotion = (Promotion) it.next();
            if (!map2.containsKey(promotion)) {
                if (promotion instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) promotion;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(promotion, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
                map2.put(promotion, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$text = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$text();
                if (realmGet$text != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.textIndex, createRowWithPrimaryKey, realmGet$text, false);
                } else {
                    Table.nativeSetNull(nativePtr, promotionColumnInfo.textIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$companyId = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$companyId();
                if (realmGet$companyId != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.companyIdIndex, createRowWithPrimaryKey, realmGet$companyId, false);
                } else {
                    Table.nativeSetNull(nativePtr, promotionColumnInfo.companyIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$startedAt();
                if (realmGet$startedAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.startedAtIndex, createRowWithPrimaryKey, realmGet$startedAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, promotionColumnInfo.startedAtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$finishedAt();
                if (realmGet$finishedAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.finishedAtIndex, createRowWithPrimaryKey, realmGet$finishedAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, promotionColumnInfo.finishedAtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$createdAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.createdAtIndex, createRowWithPrimaryKey, realmGet$createdAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, promotionColumnInfo.createdAtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$updatedAt = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(nativePtr, promotionColumnInfo.updatedAtIndex, createRowWithPrimaryKey, realmGet$updatedAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, promotionColumnInfo.updatedAtIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static Promotion createDetachedCopy(Promotion promotion, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Promotion promotion2;
        if (i > i2 || promotion == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(promotion);
        if (cacheData == null) {
            promotion2 = new Promotion();
            map.put(promotion, new RealmObjectProxy.CacheData(i, promotion2));
        } else if (i >= cacheData.minDepth) {
            return (Promotion) cacheData.object;
        } else {
            cacheData.minDepth = i;
            promotion2 = (Promotion) cacheData.object;
        }
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion2;
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2 = promotion;
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$text(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$text());
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$companyId(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$companyId());
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$startedAt(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$startedAt());
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$finishedAt(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$finishedAt());
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$createdAt(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$createdAt());
        ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface.realmSet$updatedAt(ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$updatedAt());
        return promotion2;
    }

    static Promotion update(Realm realm, PromotionColumnInfo promotionColumnInfo, Promotion promotion, Promotion promotion2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface = promotion;
        C4618xa0424aae ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2 = promotion2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Promotion.class), promotionColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(promotionColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(promotionColumnInfo.textIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$text());
        osObjectBuilder.addString(promotionColumnInfo.companyIdIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$companyId());
        osObjectBuilder.addString(promotionColumnInfo.startedAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$startedAt());
        osObjectBuilder.addString(promotionColumnInfo.finishedAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$finishedAt());
        osObjectBuilder.addString(promotionColumnInfo.createdAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$createdAt());
        osObjectBuilder.addString(promotionColumnInfo.updatedAtIndex, ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxyinterface2.realmGet$updatedAt());
        osObjectBuilder.updateExistingObject();
        return promotion;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Promotion = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{text:");
        sb.append(realmGet$text() != null ? realmGet$text() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{companyId:");
        sb.append(realmGet$companyId() != null ? realmGet$companyId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{startedAt:");
        sb.append(realmGet$startedAt() != null ? realmGet$startedAt() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{finishedAt:");
        sb.append(realmGet$finishedAt() != null ? realmGet$finishedAt() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{createdAt:");
        sb.append(realmGet$createdAt() != null ? realmGet$createdAt() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{updatedAt:");
        if (realmGet$updatedAt() != null) {
            str = realmGet$updatedAt();
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
        ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_PromotionRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_promotionrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
