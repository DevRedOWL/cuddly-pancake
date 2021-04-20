package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Banner;
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

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy extends Banner implements RealmObjectProxy, ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private BannerColumnInfo columnInfo;
    private ProxyState<Banner> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Banner";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy$BannerColumnInfo */
    static final class BannerColumnInfo extends ColumnInfo {
        long categoryIdIndex;
        long contentIdIndex;
        long contentTypeIndex;
        long finishedAtIndex;
        long idIndex;
        long imageUrlIndex;
        long maxColumnIndexValue;
        long previewUrlIndex;
        long startedAtIndex;

        BannerColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.imageUrlIndex = addColumnDetails("imageUrl", "imageUrl", objectSchemaInfo);
            this.previewUrlIndex = addColumnDetails("previewUrl", "previewUrl", objectSchemaInfo);
            this.contentIdIndex = addColumnDetails("contentId", "contentId", objectSchemaInfo);
            this.contentTypeIndex = addColumnDetails("contentType", "contentType", objectSchemaInfo);
            this.startedAtIndex = addColumnDetails("startedAt", "startedAt", objectSchemaInfo);
            this.finishedAtIndex = addColumnDetails("finishedAt", "finishedAt", objectSchemaInfo);
            this.categoryIdIndex = addColumnDetails(Banner.Fields.categoryId, Banner.Fields.categoryId, objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        BannerColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new BannerColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            BannerColumnInfo bannerColumnInfo = (BannerColumnInfo) columnInfo;
            BannerColumnInfo bannerColumnInfo2 = (BannerColumnInfo) columnInfo2;
            bannerColumnInfo2.idIndex = bannerColumnInfo.idIndex;
            bannerColumnInfo2.imageUrlIndex = bannerColumnInfo.imageUrlIndex;
            bannerColumnInfo2.previewUrlIndex = bannerColumnInfo.previewUrlIndex;
            bannerColumnInfo2.contentIdIndex = bannerColumnInfo.contentIdIndex;
            bannerColumnInfo2.contentTypeIndex = bannerColumnInfo.contentTypeIndex;
            bannerColumnInfo2.startedAtIndex = bannerColumnInfo.startedAtIndex;
            bannerColumnInfo2.finishedAtIndex = bannerColumnInfo.finishedAtIndex;
            bannerColumnInfo2.categoryIdIndex = bannerColumnInfo.categoryIdIndex;
            bannerColumnInfo2.maxColumnIndexValue = bannerColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (BannerColumnInfo) realmObjectContext.getColumnInfo();
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

    public String realmGet$imageUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imageUrlIndex);
    }

    public void realmSet$imageUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imageUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imageUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imageUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imageUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$previewUrl() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.previewUrlIndex);
    }

    public void realmSet$previewUrl(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.previewUrlIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.previewUrlIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.previewUrlIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.previewUrlIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$contentId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.contentIdIndex);
    }

    public void realmSet$contentId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.contentIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.contentIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.contentIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.contentIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$contentType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.contentTypeIndex);
    }

    public void realmSet$contentType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.contentTypeIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.contentTypeIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.contentTypeIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.contentTypeIndex, row$realm.getIndex(), str, true);
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

    public String realmGet$categoryId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.categoryIdIndex);
    }

    public void realmSet$categoryId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.categoryIdIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.categoryIdIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.categoryIdIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.categoryIdIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 8, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.STRING, true, true, false);
        builder2.addPersistedProperty("imageUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("previewUrl", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("contentId", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("contentType", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("startedAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("finishedAt", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty(Banner.Fields.categoryId, RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static BannerColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new BannerColumnInfo(osSchemaInfo);
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
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Banner createOrUpdateUsingJsonObject(p046io.realm.Realm r12, org.json.JSONObject r13, boolean r14) throws org.json.JSONException {
        /*
            java.util.List r0 = java.util.Collections.emptyList()
            java.lang.String r1 = "id"
            r2 = 0
            if (r14 == 0) goto L_0x0064
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            io.realm.internal.Table r14 = r12.getTable(r14)
            io.realm.RealmSchema r3 = r12.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            io.realm.internal.ColumnInfo r3 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy$BannerColumnInfo r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.BannerColumnInfo) r3
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            io.realm.internal.ColumnInfo r9 = r14.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r3)     // Catch:{ all -> 0x005f }
            r10 = 0
            java.util.List r11 = java.util.Collections.emptyList()     // Catch:{ all -> 0x005f }
            r6 = r5
            r7 = r12
            r6.set(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x005f }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy r14 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy     // Catch:{ all -> 0x005f }
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
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r2, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy) r14
            goto L_0x0094
        L_0x007e:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r14 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            java.lang.String r1 = r13.getString(r1)
            io.realm.RealmModel r12 = r12.createObjectInternal(r14, r1, r3, r0)
            r14 = r12
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy r14 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy) r14
            goto L_0x0094
        L_0x008c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "JSON object doesn't have the primary key field 'id'."
            r12.<init>(r13)
            throw r12
        L_0x0094:
            r12 = r14
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface r12 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface) r12
            java.lang.String r0 = "imageUrl"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00b0
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00a9
            r12.realmSet$imageUrl(r2)
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$imageUrl(r0)
        L_0x00b0:
            java.lang.String r0 = "previewUrl"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00c9
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00c2
            r12.realmSet$previewUrl(r2)
            goto L_0x00c9
        L_0x00c2:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$previewUrl(r0)
        L_0x00c9:
            java.lang.String r0 = "contentId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00db
            r12.realmSet$contentId(r2)
            goto L_0x00e2
        L_0x00db:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$contentId(r0)
        L_0x00e2:
            java.lang.String r0 = "contentType"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x00f4
            r12.realmSet$contentType(r2)
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$contentType(r0)
        L_0x00fb:
            java.lang.String r0 = "startedAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0114
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x010d
            r12.realmSet$startedAt(r2)
            goto L_0x0114
        L_0x010d:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$startedAt(r0)
        L_0x0114:
            java.lang.String r0 = "finishedAt"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x012d
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x0126
            r12.realmSet$finishedAt(r2)
            goto L_0x012d
        L_0x0126:
            java.lang.String r0 = r13.getString(r0)
            r12.realmSet$finishedAt(r0)
        L_0x012d:
            java.lang.String r0 = "categoryId"
            boolean r1 = r13.has(r0)
            if (r1 == 0) goto L_0x0146
            boolean r1 = r13.isNull(r0)
            if (r1 == 0) goto L_0x013f
            r12.realmSet$categoryId(r2)
            goto L_0x0146
        L_0x013f:
            java.lang.String r13 = r13.getString(r0)
            r12.realmSet$categoryId(r13)
        L_0x0146:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Banner");
    }

    public static Banner createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Banner banner = new Banner();
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$id(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$id((String) null);
                }
                z = true;
            } else if (nextName.equals("imageUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$imageUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$imageUrl((String) null);
                }
            } else if (nextName.equals("previewUrl")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$previewUrl(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$previewUrl((String) null);
                }
            } else if (nextName.equals("contentId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$contentId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$contentId((String) null);
                }
            } else if (nextName.equals("contentType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$contentType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$contentType((String) null);
                }
            } else if (nextName.equals("startedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$startedAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$startedAt((String) null);
                }
            } else if (nextName.equals("finishedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$finishedAt(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$finishedAt((String) null);
                }
            } else if (!nextName.equals(Banner.Fields.categoryId)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$categoryId(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$categoryId((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Banner) realm.copyToRealm(banner, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Banner.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Banner copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.BannerColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Banner r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Banner r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Banner) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0093
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Banner> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Banner.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface) r5
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
            io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy     // Catch:{ all -> 0x008e }
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
            ru.unicorn.ujin.data.realm.marketplace.Banner r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a5
        L_0x00a1:
            ru.unicorn.ujin.data.realm.marketplace.Banner r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy$BannerColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Banner, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Banner");
    }

    public static Banner copy(Realm realm, BannerColumnInfo bannerColumnInfo, Banner banner, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(banner);
        if (realmObjectProxy != null) {
            return (Banner) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Banner.class), bannerColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(bannerColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(bannerColumnInfo.imageUrlIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$imageUrl());
        osObjectBuilder.addString(bannerColumnInfo.previewUrlIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$previewUrl());
        osObjectBuilder.addString(bannerColumnInfo.contentIdIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentId());
        osObjectBuilder.addString(bannerColumnInfo.contentTypeIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentType());
        osObjectBuilder.addString(bannerColumnInfo.startedAtIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$startedAt());
        osObjectBuilder.addString(bannerColumnInfo.finishedAtIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$finishedAt());
        osObjectBuilder.addString(bannerColumnInfo.categoryIdIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$categoryId());
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(banner, newProxyInstance);
        return newProxyInstance;
    }

    public static long insert(Realm realm, Banner banner, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Banner banner2 = banner;
        if (banner2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) banner2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Banner.class);
        long nativePtr = table.getNativePtr();
        BannerColumnInfo bannerColumnInfo = (BannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Banner.class);
        long j3 = bannerColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$id();
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
        map.put(banner2, Long.valueOf(j2));
        String realmGet$imageUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.imageUrlIndex, j2, realmGet$imageUrl, false);
        }
        String realmGet$previewUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$previewUrl();
        if (realmGet$previewUrl != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.previewUrlIndex, j2, realmGet$previewUrl, false);
        }
        String realmGet$contentId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentId();
        if (realmGet$contentId != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.contentIdIndex, j2, realmGet$contentId, false);
        }
        String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.contentTypeIndex, j2, realmGet$contentType, false);
        }
        String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$startedAt();
        if (realmGet$startedAt != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.startedAtIndex, j2, realmGet$startedAt, false);
        }
        String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$finishedAt();
        if (realmGet$finishedAt != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.finishedAtIndex, j2, realmGet$finishedAt, false);
        }
        String realmGet$categoryId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$categoryId();
        if (realmGet$categoryId != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.categoryIdIndex, j2, realmGet$categoryId, false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Banner.class);
        long nativePtr = table.getNativePtr();
        BannerColumnInfo bannerColumnInfo = (BannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Banner.class);
        long j3 = bannerColumnInfo.idIndex;
        while (it.hasNext()) {
            Banner banner = (Banner) it.next();
            if (!map2.containsKey(banner)) {
                if (banner instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) banner;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(banner, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$id();
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
                map2.put(banner, Long.valueOf(j2));
                String realmGet$imageUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$imageUrl();
                if (realmGet$imageUrl != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.imageUrlIndex, j2, realmGet$imageUrl, false);
                }
                String realmGet$previewUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$previewUrl();
                if (realmGet$previewUrl != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.previewUrlIndex, j2, realmGet$previewUrl, false);
                }
                String realmGet$contentId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentId();
                if (realmGet$contentId != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.contentIdIndex, j2, realmGet$contentId, false);
                }
                String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentType();
                if (realmGet$contentType != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.contentTypeIndex, j2, realmGet$contentType, false);
                }
                String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$startedAt();
                if (realmGet$startedAt != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.startedAtIndex, j2, realmGet$startedAt, false);
                }
                String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$finishedAt();
                if (realmGet$finishedAt != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.finishedAtIndex, j2, realmGet$finishedAt, false);
                }
                String realmGet$categoryId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$categoryId();
                if (realmGet$categoryId != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.categoryIdIndex, j2, realmGet$categoryId, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Banner banner, Map<RealmModel, Long> map) {
        long j;
        Banner banner2 = banner;
        if (banner2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) banner2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm.getTable(Banner.class);
        long nativePtr = table.getNativePtr();
        BannerColumnInfo bannerColumnInfo = (BannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Banner.class);
        long j2 = bannerColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner2;
        String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
        map.put(banner2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$imageUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$imageUrl();
        if (realmGet$imageUrl != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.imageUrlIndex, createRowWithPrimaryKey, realmGet$imageUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.imageUrlIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$previewUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$previewUrl();
        if (realmGet$previewUrl != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.previewUrlIndex, createRowWithPrimaryKey, realmGet$previewUrl, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.previewUrlIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$contentId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentId();
        if (realmGet$contentId != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.contentIdIndex, createRowWithPrimaryKey, realmGet$contentId, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.contentIdIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.contentTypeIndex, createRowWithPrimaryKey, realmGet$contentType, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.contentTypeIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$startedAt();
        if (realmGet$startedAt != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.startedAtIndex, createRowWithPrimaryKey, realmGet$startedAt, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.startedAtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$finishedAt();
        if (realmGet$finishedAt != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.finishedAtIndex, createRowWithPrimaryKey, realmGet$finishedAt, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.finishedAtIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$categoryId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$categoryId();
        if (realmGet$categoryId != null) {
            Table.nativeSetString(nativePtr, bannerColumnInfo.categoryIdIndex, createRowWithPrimaryKey, realmGet$categoryId, false);
        } else {
            Table.nativeSetNull(nativePtr, bannerColumnInfo.categoryIdIndex, createRowWithPrimaryKey, false);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Map<RealmModel, Long> map2 = map;
        Table table = realm.getTable(Banner.class);
        long nativePtr = table.getNativePtr();
        BannerColumnInfo bannerColumnInfo = (BannerColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Banner.class);
        long j2 = bannerColumnInfo.idIndex;
        while (it.hasNext()) {
            Banner banner = (Banner) it.next();
            if (!map2.containsKey(banner)) {
                if (banner instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) banner;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(banner, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner;
                String realmGet$id = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstString(nativePtr, j2, realmGet$id);
                }
                long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, realmGet$id) : j;
                map2.put(banner, Long.valueOf(createRowWithPrimaryKey));
                String realmGet$imageUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$imageUrl();
                if (realmGet$imageUrl != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.imageUrlIndex, createRowWithPrimaryKey, realmGet$imageUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.imageUrlIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$previewUrl = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$previewUrl();
                if (realmGet$previewUrl != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.previewUrlIndex, createRowWithPrimaryKey, realmGet$previewUrl, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.previewUrlIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$contentId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentId();
                if (realmGet$contentId != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.contentIdIndex, createRowWithPrimaryKey, realmGet$contentId, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.contentIdIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$contentType = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$contentType();
                if (realmGet$contentType != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.contentTypeIndex, createRowWithPrimaryKey, realmGet$contentType, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.contentTypeIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$startedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$startedAt();
                if (realmGet$startedAt != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.startedAtIndex, createRowWithPrimaryKey, realmGet$startedAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.startedAtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$finishedAt = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$finishedAt();
                if (realmGet$finishedAt != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.finishedAtIndex, createRowWithPrimaryKey, realmGet$finishedAt, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.finishedAtIndex, createRowWithPrimaryKey, false);
                }
                String realmGet$categoryId = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmGet$categoryId();
                if (realmGet$categoryId != null) {
                    Table.nativeSetString(nativePtr, bannerColumnInfo.categoryIdIndex, createRowWithPrimaryKey, realmGet$categoryId, false);
                } else {
                    Table.nativeSetNull(nativePtr, bannerColumnInfo.categoryIdIndex, createRowWithPrimaryKey, false);
                }
            }
        }
    }

    public static Banner createDetachedCopy(Banner banner, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Banner banner2;
        if (i > i2 || banner == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(banner);
        if (cacheData == null) {
            banner2 = new Banner();
            map.put(banner, new RealmObjectProxy.CacheData(i, banner2));
        } else if (i >= cacheData.minDepth) {
            return (Banner) cacheData.object;
        } else {
            cacheData.minDepth = i;
            banner2 = (Banner) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner2;
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2 = banner;
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$imageUrl(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$imageUrl());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$previewUrl(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$previewUrl());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$contentId(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$contentId());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$contentType(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$contentType());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$startedAt(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$startedAt());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$finishedAt(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$finishedAt());
        ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface.realmSet$categoryId(ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$categoryId());
        return banner2;
    }

    static Banner update(Realm realm, BannerColumnInfo bannerColumnInfo, Banner banner, Banner banner2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface = banner;
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2 = banner2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Banner.class), bannerColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addString(bannerColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(bannerColumnInfo.imageUrlIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$imageUrl());
        osObjectBuilder.addString(bannerColumnInfo.previewUrlIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$previewUrl());
        osObjectBuilder.addString(bannerColumnInfo.contentIdIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$contentId());
        osObjectBuilder.addString(bannerColumnInfo.contentTypeIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$contentType());
        osObjectBuilder.addString(bannerColumnInfo.startedAtIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$startedAt());
        osObjectBuilder.addString(bannerColumnInfo.finishedAtIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$finishedAt());
        osObjectBuilder.addString(bannerColumnInfo.categoryIdIndex, ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxyinterface2.realmGet$categoryId());
        osObjectBuilder.updateExistingObject();
        return banner;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Banner = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{imageUrl:");
        sb.append(realmGet$imageUrl() != null ? realmGet$imageUrl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{previewUrl:");
        sb.append(realmGet$previewUrl() != null ? realmGet$previewUrl() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{contentId:");
        sb.append(realmGet$contentId() != null ? realmGet$contentId() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{contentType:");
        sb.append(realmGet$contentType() != null ? realmGet$contentType() : str);
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
        sb.append("{categoryId:");
        if (realmGet$categoryId() != null) {
            str = realmGet$categoryId();
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
        ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_bannerrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
