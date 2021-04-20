package p046io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.CouponImage;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
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
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy;

/* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy */
public class ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy extends Coupon implements RealmObjectProxy, ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface {
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private CouponColumnInfo columnInfo;
    private ProxyState<Coupon> proxyState;

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy$ClassNameHelper */
    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Coupon";
    }

    public static String getSimpleClassName() {
        return ClassNameHelper.INTERNAL_CLASS_NAME;
    }

    /* renamed from: io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy$CouponColumnInfo */
    static final class CouponColumnInfo extends ColumnInfo {
        long buttonTitleIndex;
        long descriptionIndex;
        long groupIndex;
        long idIndex;
        long imageIndex;
        long longDescriptionIndex;
        long maxColumnIndexValue;
        long redeemedCodeIndex;
        long termsOfObtainingIndex;
        long titleIndex;

        CouponColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo(ClassNameHelper.INTERNAL_CLASS_NAME);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.descriptionIndex = addColumnDetails("description", "description", objectSchemaInfo);
            this.longDescriptionIndex = addColumnDetails("longDescription", "longDescription", objectSchemaInfo);
            this.termsOfObtainingIndex = addColumnDetails("termsOfObtaining", "termsOfObtaining", objectSchemaInfo);
            this.groupIndex = addColumnDetails("group", "group", objectSchemaInfo);
            this.buttonTitleIndex = addColumnDetails("buttonTitle", "buttonTitle", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.redeemedCodeIndex = addColumnDetails("redeemedCode", "redeemedCode", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        CouponColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        /* access modifiers changed from: protected */
        public final ColumnInfo copy(boolean z) {
            return new CouponColumnInfo(this, z);
        }

        /* access modifiers changed from: protected */
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            CouponColumnInfo couponColumnInfo = (CouponColumnInfo) columnInfo;
            CouponColumnInfo couponColumnInfo2 = (CouponColumnInfo) columnInfo2;
            couponColumnInfo2.idIndex = couponColumnInfo.idIndex;
            couponColumnInfo2.titleIndex = couponColumnInfo.titleIndex;
            couponColumnInfo2.descriptionIndex = couponColumnInfo.descriptionIndex;
            couponColumnInfo2.longDescriptionIndex = couponColumnInfo.longDescriptionIndex;
            couponColumnInfo2.termsOfObtainingIndex = couponColumnInfo.termsOfObtainingIndex;
            couponColumnInfo2.groupIndex = couponColumnInfo.groupIndex;
            couponColumnInfo2.buttonTitleIndex = couponColumnInfo.buttonTitleIndex;
            couponColumnInfo2.imageIndex = couponColumnInfo.imageIndex;
            couponColumnInfo2.redeemedCodeIndex = couponColumnInfo.redeemedCodeIndex;
            couponColumnInfo2.maxColumnIndexValue = couponColumnInfo.maxColumnIndexValue;
        }
    }

    ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
            this.columnInfo = (CouponColumnInfo) realmObjectContext.getColumnInfo();
            this.proxyState = new ProxyState<>(this);
            this.proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    public Integer realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.idIndex)) {
            return null;
        }
        return Integer.valueOf((int) this.proxyState.getRow$realm().getLong(this.columnInfo.idIndex));
    }

    public void realmSet$id(Integer num) {
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

    public String realmGet$description() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.descriptionIndex);
    }

    public void realmSet$description(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.descriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.descriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.descriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.descriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$longDescription() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.longDescriptionIndex);
    }

    public void realmSet$longDescription(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.longDescriptionIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.longDescriptionIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.longDescriptionIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.longDescriptionIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$termsOfObtaining() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.termsOfObtainingIndex);
    }

    public void realmSet$termsOfObtaining(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.termsOfObtainingIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.termsOfObtainingIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.termsOfObtainingIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.termsOfObtainingIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$group() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.groupIndex);
    }

    public void realmSet$group(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.groupIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.groupIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.groupIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.groupIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public String realmGet$buttonTitle() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.buttonTitleIndex);
    }

    public void realmSet$buttonTitle(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.buttonTitleIndex);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.buttonTitleIndex, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.buttonTitleIndex, row$realm.getIndex(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.buttonTitleIndex, row$realm.getIndex(), str, true);
            }
        }
    }

    public CouponImage realmGet$image() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.imageIndex)) {
            return null;
        }
        return (CouponImage) this.proxyState.getRealm$realm().get(CouponImage.class, this.proxyState.getRow$realm().getLink(this.columnInfo.imageIndex), false, Collections.emptyList());
    }

    public void realmSet$image(CouponImage couponImage) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (couponImage == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.imageIndex);
                return;
            }
            this.proxyState.checkValidObject(couponImage);
            this.proxyState.getRow$realm().setLink(this.columnInfo.imageIndex, ((RealmObjectProxy) couponImage).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("image")) {
            if (couponImage != null && !RealmObject.isManaged(couponImage)) {
                couponImage = (CouponImage) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(couponImage, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (couponImage == null) {
                row$realm.nullifyLink(this.columnInfo.imageIndex);
                return;
            }
            this.proxyState.checkValidObject(couponImage);
            row$realm.getTable().setLink(this.columnInfo.imageIndex, row$realm.getIndex(), ((RealmObjectProxy) couponImage).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    public RedeemedCode realmGet$redeemedCode() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNullLink(this.columnInfo.redeemedCodeIndex)) {
            return null;
        }
        return (RedeemedCode) this.proxyState.getRealm$realm().get(RedeemedCode.class, this.proxyState.getRow$realm().getLink(this.columnInfo.redeemedCodeIndex), false, Collections.emptyList());
    }

    public void realmSet$redeemedCode(RedeemedCode redeemedCode) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (redeemedCode == null) {
                this.proxyState.getRow$realm().nullifyLink(this.columnInfo.redeemedCodeIndex);
                return;
            }
            this.proxyState.checkValidObject(redeemedCode);
            this.proxyState.getRow$realm().setLink(this.columnInfo.redeemedCodeIndex, ((RealmObjectProxy) redeemedCode).realmGet$proxyState().getRow$realm().getIndex());
        } else if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("redeemedCode")) {
            if (redeemedCode != null && !RealmObject.isManaged(redeemedCode)) {
                redeemedCode = (RedeemedCode) ((Realm) this.proxyState.getRealm$realm()).copyToRealm(redeemedCode, new ImportFlag[0]);
            }
            Row row$realm = this.proxyState.getRow$realm();
            if (redeemedCode == null) {
                row$realm.nullifyLink(this.columnInfo.redeemedCodeIndex);
                return;
            }
            this.proxyState.checkValidObject(redeemedCode);
            row$realm.getTable().setLink(this.columnInfo.redeemedCodeIndex, row$realm.getIndex(), ((RealmObjectProxy) redeemedCode).realmGet$proxyState().getRow$realm().getIndex(), true);
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder(ClassNameHelper.INTERNAL_CLASS_NAME, 9, 0);
        OsObjectSchemaInfo.Builder builder2 = builder;
        builder2.addPersistedProperty("id", RealmFieldType.INTEGER, true, true, false);
        builder2.addPersistedProperty("title", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("description", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("longDescription", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("termsOfObtaining", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("group", RealmFieldType.STRING, false, false, false);
        builder2.addPersistedProperty("buttonTitle", RealmFieldType.STRING, false, false, false);
        builder.addPersistedLinkProperty("image", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        builder.addPersistedLinkProperty("redeemedCode", RealmFieldType.OBJECT, ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CouponColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new CouponColumnInfo(osSchemaInfo);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [io.realm.RealmModel] */
    /* JADX WARNING: type inference failed for: r0v4, types: [io.realm.RealmModel] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Coupon createOrUpdateUsingJsonObject(p046io.realm.Realm r13, org.json.JSONObject r14, boolean r15) throws org.json.JSONException {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.lang.String r1 = "id"
            r2 = 0
            if (r15 == 0) goto L_0x0066
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            io.realm.internal.Table r3 = r13.getTable(r3)
            io.realm.RealmSchema r4 = r13.getSchema()
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r5 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            io.realm.internal.ColumnInfo r4 = r4.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r5)
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy$CouponColumnInfo r4 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.CouponColumnInfo) r4
            long r4 = r4.idIndex
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x002a
            long r4 = r3.findFirstNull(r4)
            goto L_0x0032
        L_0x002a:
            long r6 = r14.getLong(r1)
            long r4 = r3.findFirstLong(r4, r6)
        L_0x0032:
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0066
            io.realm.BaseRealm$ThreadLocalRealmObjectContext r6 = p046io.realm.BaseRealm.objectContext
            java.lang.Object r6 = r6.get()
            io.realm.BaseRealm$RealmObjectContext r6 = (p046io.realm.BaseRealm.RealmObjectContext) r6
            io.realm.internal.UncheckedRow r9 = r3.getUncheckedRow(r4)     // Catch:{ all -> 0x0061 }
            io.realm.RealmSchema r3 = r13.getSchema()     // Catch:{ all -> 0x0061 }
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r4 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            io.realm.internal.ColumnInfo r10 = r3.getColumnInfo((java.lang.Class<? extends p046io.realm.RealmModel>) r4)     // Catch:{ all -> 0x0061 }
            r11 = 0
            java.util.List r12 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0061 }
            r7 = r6
            r8 = r13
            r7.set(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0061 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy r3 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy     // Catch:{ all -> 0x0061 }
            r3.<init>()     // Catch:{ all -> 0x0061 }
            r6.clear()
            goto L_0x0067
        L_0x0061:
            r13 = move-exception
            r6.clear()
            throw r13
        L_0x0066:
            r3 = r2
        L_0x0067:
            java.lang.String r4 = "redeemedCode"
            java.lang.String r5 = "image"
            if (r3 != 0) goto L_0x00b0
            boolean r3 = r14.has(r5)
            if (r3 == 0) goto L_0x0076
            r0.add(r5)
        L_0x0076:
            boolean r3 = r14.has(r4)
            if (r3 == 0) goto L_0x007f
            r0.add(r4)
        L_0x007f:
            boolean r3 = r14.has(r1)
            if (r3 == 0) goto L_0x00a8
            boolean r3 = r14.isNull(r1)
            r6 = 1
            if (r3 == 0) goto L_0x0096
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r1 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            io.realm.RealmModel r0 = r13.createObjectInternal(r1, r2, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy) r3
            goto L_0x00b0
        L_0x0096:
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r3 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            int r1 = r14.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            io.realm.RealmModel r0 = r13.createObjectInternal(r3, r1, r6, r0)
            r3 = r0
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy r3 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy) r3
            goto L_0x00b0
        L_0x00a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "JSON object doesn't have the primary key field 'id'."
            r13.<init>(r14)
            throw r13
        L_0x00b0:
            r0 = r3
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface r0 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface) r0
            java.lang.String r1 = "title"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00cc
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00c5
            r0.realmSet$title(r2)
            goto L_0x00cc
        L_0x00c5:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$title(r1)
        L_0x00cc:
            java.lang.String r1 = "description"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00e5
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00de
            r0.realmSet$description(r2)
            goto L_0x00e5
        L_0x00de:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$description(r1)
        L_0x00e5:
            java.lang.String r1 = "longDescription"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x00fe
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x00f7
            r0.realmSet$longDescription(r2)
            goto L_0x00fe
        L_0x00f7:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$longDescription(r1)
        L_0x00fe:
            java.lang.String r1 = "termsOfObtaining"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0117
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0110
            r0.realmSet$termsOfObtaining(r2)
            goto L_0x0117
        L_0x0110:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$termsOfObtaining(r1)
        L_0x0117:
            java.lang.String r1 = "group"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0130
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0129
            r0.realmSet$group(r2)
            goto L_0x0130
        L_0x0129:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$group(r1)
        L_0x0130:
            java.lang.String r1 = "buttonTitle"
            boolean r6 = r14.has(r1)
            if (r6 == 0) goto L_0x0149
            boolean r6 = r14.isNull(r1)
            if (r6 == 0) goto L_0x0142
            r0.realmSet$buttonTitle(r2)
            goto L_0x0149
        L_0x0142:
            java.lang.String r1 = r14.getString(r1)
            r0.realmSet$buttonTitle(r1)
        L_0x0149:
            boolean r1 = r14.has(r5)
            if (r1 == 0) goto L_0x0164
            boolean r1 = r14.isNull(r5)
            if (r1 == 0) goto L_0x0159
            r0.realmSet$image(r2)
            goto L_0x0164
        L_0x0159:
            org.json.JSONObject r1 = r14.getJSONObject(r5)
            ru.unicorn.ujin.data.realm.marketplace.CouponImage r1 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createOrUpdateUsingJsonObject(r13, r1, r15)
            r0.realmSet$image(r1)
        L_0x0164:
            boolean r1 = r14.has(r4)
            if (r1 == 0) goto L_0x017f
            boolean r1 = r14.isNull(r4)
            if (r1 == 0) goto L_0x0174
            r0.realmSet$redeemedCode(r2)
            goto L_0x017f
        L_0x0174:
            org.json.JSONObject r14 = r14.getJSONObject(r4)
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r13 = p046io.realm.ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createOrUpdateUsingJsonObject(r13, r14, r15)
            r0.realmSet$redeemedCode(r13)
        L_0x017f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):ru.unicorn.ujin.data.realm.marketplace.Coupon");
    }

    public static Coupon createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        Coupon coupon = new Coupon();
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$id(Integer.valueOf(jsonReader.nextInt()));
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$id((Integer) null);
                }
                z = true;
            } else if (nextName.equals("title")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$title(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$title((String) null);
                }
            } else if (nextName.equals("description")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$description(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$description((String) null);
                }
            } else if (nextName.equals("longDescription")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$longDescription(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$longDescription((String) null);
                }
            } else if (nextName.equals("termsOfObtaining")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$termsOfObtaining(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$termsOfObtaining((String) null);
                }
            } else if (nextName.equals("group")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$group(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$group((String) null);
                }
            } else if (nextName.equals("buttonTitle")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$buttonTitle(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$buttonTitle((String) null);
                }
            } else if (nextName.equals("image")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$image((CouponImage) null);
                } else {
                    ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
            } else if (!nextName.equals("redeemedCode")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$redeemedCode((RedeemedCode) null);
            } else {
                ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$redeemedCode(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Coupon) realm.copyToRealm(coupon, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    private static ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = (BaseRealm.RealmObjectContext) BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coupon.class), false, Collections.emptyList());
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy ru_unicorn_ujin_data_realm_marketplace_couponrealmproxy = new ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy();
        realmObjectContext.clear();
        return ru_unicorn_ujin_data_realm_marketplace_couponrealmproxy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p035ru.unicorn.ujin.data.realm.marketplace.Coupon copyOrUpdate(p046io.realm.Realm r8, p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.CouponColumnInfo r9, p035ru.unicorn.ujin.data.realm.marketplace.Coupon r10, boolean r11, java.util.Map<p046io.realm.RealmModel, p046io.realm.internal.RealmObjectProxy> r12, java.util.Set<p046io.realm.ImportFlag> r13) {
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
            ru.unicorn.ujin.data.realm.marketplace.Coupon r1 = (p035ru.unicorn.ujin.data.realm.marketplace.Coupon) r1
            return r1
        L_0x004b:
            r1 = 0
            if (r11 == 0) goto L_0x0097
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.Coupon> r2 = p035ru.unicorn.ujin.data.realm.marketplace.Coupon.class
            io.realm.internal.Table r2 = r8.getTable(r2)
            long r3 = r9.idIndex
            r5 = r10
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface r5 = (p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface) r5
            java.lang.Integer r5 = r5.realmGet$id()
            if (r5 != 0) goto L_0x0064
            long r3 = r2.findFirstNull(r3)
            goto L_0x006c
        L_0x0064:
            long r5 = r5.longValue()
            long r3 = r2.findFirstLong(r3, r5)
        L_0x006c:
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0074
            r0 = 0
            goto L_0x0098
        L_0x0074:
            io.realm.internal.UncheckedRow r3 = r2.getUncheckedRow(r3)     // Catch:{ all -> 0x0092 }
            r5 = 0
            java.util.List r6 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1 = r0
            r2 = r8
            r4 = r9
            r1.set(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0092 }
            io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy r1 = new io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy     // Catch:{ all -> 0x0092 }
            r1.<init>()     // Catch:{ all -> 0x0092 }
            r2 = r1
            io.realm.internal.RealmObjectProxy r2 = (p046io.realm.internal.RealmObjectProxy) r2     // Catch:{ all -> 0x0092 }
            r12.put(r10, r2)     // Catch:{ all -> 0x0092 }
            r0.clear()
            goto L_0x0097
        L_0x0092:
            r8 = move-exception
            r0.clear()
            throw r8
        L_0x0097:
            r0 = r11
        L_0x0098:
            r3 = r1
            if (r0 == 0) goto L_0x00a5
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r12
            r6 = r13
            ru.unicorn.ujin.data.realm.marketplace.Coupon r8 = update(r1, r2, r3, r4, r5, r6)
            goto L_0x00a9
        L_0x00a5:
            ru.unicorn.ujin.data.realm.marketplace.Coupon r8 = copy(r8, r9, r10, r11, r12, r13)
        L_0x00a9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy$CouponColumnInfo, ru.unicorn.ujin.data.realm.marketplace.Coupon, boolean, java.util.Map, java.util.Set):ru.unicorn.ujin.data.realm.marketplace.Coupon");
    }

    public static Coupon copy(Realm realm, CouponColumnInfo couponColumnInfo, Coupon coupon, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(coupon);
        if (realmObjectProxy != null) {
            return (Coupon) realmObjectProxy;
        }
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Coupon.class), couponColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(couponColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id());
        osObjectBuilder.addString(couponColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$title());
        osObjectBuilder.addString(couponColumnInfo.descriptionIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$description());
        osObjectBuilder.addString(couponColumnInfo.longDescriptionIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$longDescription());
        osObjectBuilder.addString(couponColumnInfo.termsOfObtainingIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$termsOfObtaining());
        osObjectBuilder.addString(couponColumnInfo.groupIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$group());
        osObjectBuilder.addString(couponColumnInfo.buttonTitleIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$buttonTitle());
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(coupon, newProxyInstance);
        CouponImage realmGet$image = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$image();
        if (realmGet$image == null) {
            newProxyInstance.realmSet$image((CouponImage) null);
        } else {
            CouponImage couponImage = (CouponImage) map.get(realmGet$image);
            if (couponImage != null) {
                newProxyInstance.realmSet$image(couponImage);
            } else {
                newProxyInstance.realmSet$image(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class), realmGet$image, z, map, set));
            }
        }
        RedeemedCode realmGet$redeemedCode = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$redeemedCode();
        if (realmGet$redeemedCode == null) {
            newProxyInstance.realmSet$redeemedCode((RedeemedCode) null);
        } else {
            RedeemedCode redeemedCode = (RedeemedCode) map.get(realmGet$redeemedCode);
            if (redeemedCode != null) {
                newProxyInstance.realmSet$redeemedCode(redeemedCode);
            } else {
                newProxyInstance.realmSet$redeemedCode(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class), realmGet$redeemedCode, z, map, set));
            }
        }
        return newProxyInstance;
    }

    public static long insert(Realm realm, Coupon coupon, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Coupon coupon2 = coupon;
        Map<RealmModel, Long> map2 = map;
        if (coupon2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coupon2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Coupon.class);
        long nativePtr = table.getNativePtr();
        CouponColumnInfo couponColumnInfo = (CouponColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coupon.class);
        long j3 = couponColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon2;
        Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id();
        if (realmGet$id == null) {
            j = Table.nativeFindFirstNull(nativePtr, j3);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id().intValue());
        }
        if (j == -1) {
            j2 = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$id);
            j2 = j;
        }
        map2.put(coupon2, Long.valueOf(j2));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.titleIndex, j2, realmGet$title, false);
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.descriptionIndex, j2, realmGet$description, false);
        }
        String realmGet$longDescription = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$longDescription();
        if (realmGet$longDescription != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.longDescriptionIndex, j2, realmGet$longDescription, false);
        }
        String realmGet$termsOfObtaining = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$termsOfObtaining();
        if (realmGet$termsOfObtaining != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.termsOfObtainingIndex, j2, realmGet$termsOfObtaining, false);
        }
        String realmGet$group = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$group();
        if (realmGet$group != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.groupIndex, j2, realmGet$group, false);
        }
        String realmGet$buttonTitle = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$buttonTitle();
        if (realmGet$buttonTitle != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.buttonTitleIndex, j2, realmGet$buttonTitle, false);
        }
        CouponImage realmGet$image = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Long l = map2.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insert(realm2, realmGet$image, map2));
            }
            Table.nativeSetLink(nativePtr, couponColumnInfo.imageIndex, j2, l.longValue(), false);
        }
        RedeemedCode realmGet$redeemedCode = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$redeemedCode();
        if (realmGet$redeemedCode != null) {
            Long l2 = map2.get(realmGet$redeemedCode);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm2, realmGet$redeemedCode, map2));
            }
            Table.nativeSetLink(nativePtr, couponColumnInfo.redeemedCodeIndex, j2, l2.longValue(), false);
        }
        return j2;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Coupon.class);
        long nativePtr = table.getNativePtr();
        CouponColumnInfo couponColumnInfo = (CouponColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coupon.class);
        long j2 = couponColumnInfo.idIndex;
        while (it.hasNext()) {
            Coupon coupon = (Coupon) it.next();
            if (!map2.containsKey(coupon)) {
                if (coupon instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coupon;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(coupon, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon;
                Integer realmGet$id = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id();
                if (realmGet$id == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j2);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$id);
                }
                long j3 = j;
                map2.put(coupon, Long.valueOf(j3));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.titleIndex, j3, realmGet$title, false);
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.descriptionIndex, j3, realmGet$description, false);
                }
                String realmGet$longDescription = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$longDescription();
                if (realmGet$longDescription != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.longDescriptionIndex, j3, realmGet$longDescription, false);
                }
                String realmGet$termsOfObtaining = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$termsOfObtaining();
                if (realmGet$termsOfObtaining != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.termsOfObtainingIndex, j3, realmGet$termsOfObtaining, false);
                }
                String realmGet$group = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$group();
                if (realmGet$group != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.groupIndex, j3, realmGet$group, false);
                }
                String realmGet$buttonTitle = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$buttonTitle();
                if (realmGet$buttonTitle != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.buttonTitleIndex, j3, realmGet$buttonTitle, false);
                }
                CouponImage realmGet$image = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Long l = map2.get(realmGet$image);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insert(realm2, realmGet$image, map2));
                    }
                    table.setLink(couponColumnInfo.imageIndex, j3, l.longValue(), false);
                }
                RedeemedCode realmGet$redeemedCode = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$redeemedCode();
                if (realmGet$redeemedCode != null) {
                    Long l2 = map2.get(realmGet$redeemedCode);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insert(realm2, realmGet$redeemedCode, map2));
                    }
                    table.setLink(couponColumnInfo.redeemedCodeIndex, j3, l2.longValue(), false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Coupon coupon, Map<RealmModel, Long> map) {
        long j;
        Realm realm2 = realm;
        Coupon coupon2 = coupon;
        Map<RealmModel, Long> map2 = map;
        if (coupon2 instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coupon2;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex();
            }
        }
        Table table = realm2.getTable(Coupon.class);
        long nativePtr = table.getNativePtr();
        CouponColumnInfo couponColumnInfo = (CouponColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coupon.class);
        long j2 = couponColumnInfo.idIndex;
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon2;
        if (ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id() == null) {
            j = Table.nativeFindFirstNull(nativePtr, j2);
        } else {
            j = Table.nativeFindFirstInt(nativePtr, j2, (long) ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id().intValue());
        }
        long createRowWithPrimaryKey = j == -1 ? OsObject.createRowWithPrimaryKey(table, j2, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id()) : j;
        map2.put(coupon2, Long.valueOf(createRowWithPrimaryKey));
        String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.titleIndex, createRowWithPrimaryKey, realmGet$title, false);
        } else {
            Table.nativeSetNull(nativePtr, couponColumnInfo.titleIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$description();
        if (realmGet$description != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.descriptionIndex, createRowWithPrimaryKey, realmGet$description, false);
        } else {
            Table.nativeSetNull(nativePtr, couponColumnInfo.descriptionIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$longDescription = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$longDescription();
        if (realmGet$longDescription != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.longDescriptionIndex, createRowWithPrimaryKey, realmGet$longDescription, false);
        } else {
            Table.nativeSetNull(nativePtr, couponColumnInfo.longDescriptionIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$termsOfObtaining = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$termsOfObtaining();
        if (realmGet$termsOfObtaining != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.termsOfObtainingIndex, createRowWithPrimaryKey, realmGet$termsOfObtaining, false);
        } else {
            Table.nativeSetNull(nativePtr, couponColumnInfo.termsOfObtainingIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$group = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$group();
        if (realmGet$group != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.groupIndex, createRowWithPrimaryKey, realmGet$group, false);
        } else {
            Table.nativeSetNull(nativePtr, couponColumnInfo.groupIndex, createRowWithPrimaryKey, false);
        }
        String realmGet$buttonTitle = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$buttonTitle();
        if (realmGet$buttonTitle != null) {
            Table.nativeSetString(nativePtr, couponColumnInfo.buttonTitleIndex, createRowWithPrimaryKey, realmGet$buttonTitle, false);
        } else {
            Table.nativeSetNull(nativePtr, couponColumnInfo.buttonTitleIndex, createRowWithPrimaryKey, false);
        }
        CouponImage realmGet$image = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$image();
        if (realmGet$image != null) {
            Long l = map2.get(realmGet$image);
            if (l == null) {
                l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insertOrUpdate(realm2, realmGet$image, map2));
            }
            Table.nativeSetLink(nativePtr, couponColumnInfo.imageIndex, createRowWithPrimaryKey, l.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, couponColumnInfo.imageIndex, createRowWithPrimaryKey);
        }
        RedeemedCode realmGet$redeemedCode = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$redeemedCode();
        if (realmGet$redeemedCode != null) {
            Long l2 = map2.get(realmGet$redeemedCode);
            if (l2 == null) {
                l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm2, realmGet$redeemedCode, map2));
            }
            Table.nativeSetLink(nativePtr, couponColumnInfo.redeemedCodeIndex, createRowWithPrimaryKey, l2.longValue(), false);
        } else {
            Table.nativeNullifyLink(nativePtr, couponColumnInfo.redeemedCodeIndex, createRowWithPrimaryKey);
        }
        return createRowWithPrimaryKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        long j;
        long j2;
        Realm realm2 = realm;
        Map<RealmModel, Long> map2 = map;
        Table table = realm2.getTable(Coupon.class);
        long nativePtr = table.getNativePtr();
        CouponColumnInfo couponColumnInfo = (CouponColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) Coupon.class);
        long j3 = couponColumnInfo.idIndex;
        while (it.hasNext()) {
            Coupon coupon = (Coupon) it.next();
            if (!map2.containsKey(coupon)) {
                if (coupon instanceof RealmObjectProxy) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) coupon;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map2.put(coupon, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getIndex()));
                    }
                }
                ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon;
                if (ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id() == null) {
                    j = Table.nativeFindFirstNull(nativePtr, j3);
                } else {
                    j = Table.nativeFindFirstInt(nativePtr, j3, (long) ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id().intValue());
                }
                if (j == -1) {
                    j = OsObject.createRowWithPrimaryKey(table, j3, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$id());
                }
                long j4 = j;
                map2.put(coupon, Long.valueOf(j4));
                String realmGet$title = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$title();
                if (realmGet$title != null) {
                    j2 = j3;
                    Table.nativeSetString(nativePtr, couponColumnInfo.titleIndex, j4, realmGet$title, false);
                } else {
                    j2 = j3;
                    Table.nativeSetNull(nativePtr, couponColumnInfo.titleIndex, j4, false);
                }
                String realmGet$description = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$description();
                if (realmGet$description != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.descriptionIndex, j4, realmGet$description, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponColumnInfo.descriptionIndex, j4, false);
                }
                String realmGet$longDescription = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$longDescription();
                if (realmGet$longDescription != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.longDescriptionIndex, j4, realmGet$longDescription, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponColumnInfo.longDescriptionIndex, j4, false);
                }
                String realmGet$termsOfObtaining = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$termsOfObtaining();
                if (realmGet$termsOfObtaining != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.termsOfObtainingIndex, j4, realmGet$termsOfObtaining, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponColumnInfo.termsOfObtainingIndex, j4, false);
                }
                String realmGet$group = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$group();
                if (realmGet$group != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.groupIndex, j4, realmGet$group, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponColumnInfo.groupIndex, j4, false);
                }
                String realmGet$buttonTitle = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$buttonTitle();
                if (realmGet$buttonTitle != null) {
                    Table.nativeSetString(nativePtr, couponColumnInfo.buttonTitleIndex, j4, realmGet$buttonTitle, false);
                } else {
                    Table.nativeSetNull(nativePtr, couponColumnInfo.buttonTitleIndex, j4, false);
                }
                CouponImage realmGet$image = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$image();
                if (realmGet$image != null) {
                    Long l = map2.get(realmGet$image);
                    if (l == null) {
                        l = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.insertOrUpdate(realm2, realmGet$image, map2));
                    }
                    Table.nativeSetLink(nativePtr, couponColumnInfo.imageIndex, j4, l.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, couponColumnInfo.imageIndex, j4);
                }
                RedeemedCode realmGet$redeemedCode = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmGet$redeemedCode();
                if (realmGet$redeemedCode != null) {
                    Long l2 = map2.get(realmGet$redeemedCode);
                    if (l2 == null) {
                        l2 = Long.valueOf(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.insertOrUpdate(realm2, realmGet$redeemedCode, map2));
                    }
                    Table.nativeSetLink(nativePtr, couponColumnInfo.redeemedCodeIndex, j4, l2.longValue(), false);
                } else {
                    Table.nativeNullifyLink(nativePtr, couponColumnInfo.redeemedCodeIndex, j4);
                }
                j3 = j2;
            }
        }
    }

    public static Coupon createDetachedCopy(Coupon coupon, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Coupon coupon2;
        if (i > i2 || coupon == null) {
            return null;
        }
        RealmObjectProxy.CacheData cacheData = map.get(coupon);
        if (cacheData == null) {
            coupon2 = new Coupon();
            map.put(coupon, new RealmObjectProxy.CacheData(i, coupon2));
        } else if (i >= cacheData.minDepth) {
            return (Coupon) cacheData.object;
        } else {
            cacheData.minDepth = i;
            coupon2 = (Coupon) cacheData.object;
        }
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon2;
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2 = coupon;
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$id(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$id());
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$title(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$title());
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$description(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$description());
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$longDescription(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$longDescription());
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$termsOfObtaining(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$termsOfObtaining());
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$group(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$group());
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$buttonTitle(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$buttonTitle());
        int i3 = i + 1;
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$image(ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$image(), i3, i2, map));
        ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface.realmSet$redeemedCode(ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.createDetachedCopy(ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$redeemedCode(), i3, i2, map));
        return coupon2;
    }

    static Coupon update(Realm realm, CouponColumnInfo couponColumnInfo, Coupon coupon, Coupon coupon2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface = coupon;
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2 = coupon2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Coupon.class), couponColumnInfo.maxColumnIndexValue, set);
        osObjectBuilder.addInteger(couponColumnInfo.idIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$id());
        osObjectBuilder.addString(couponColumnInfo.titleIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$title());
        osObjectBuilder.addString(couponColumnInfo.descriptionIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$description());
        osObjectBuilder.addString(couponColumnInfo.longDescriptionIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$longDescription());
        osObjectBuilder.addString(couponColumnInfo.termsOfObtainingIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$termsOfObtaining());
        osObjectBuilder.addString(couponColumnInfo.groupIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$group());
        osObjectBuilder.addString(couponColumnInfo.buttonTitleIndex, ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$buttonTitle());
        CouponImage realmGet$image = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$image();
        if (realmGet$image == null) {
            osObjectBuilder.addNull(couponColumnInfo.imageIndex);
        } else {
            CouponImage couponImage = (CouponImage) map.get(realmGet$image);
            if (couponImage != null) {
                osObjectBuilder.addObject(couponColumnInfo.imageIndex, couponImage);
            } else {
                osObjectBuilder.addObject(couponColumnInfo.imageIndex, ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.CouponImageColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) CouponImage.class), realmGet$image, true, map, set));
            }
        }
        RedeemedCode realmGet$redeemedCode = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxyinterface2.realmGet$redeemedCode();
        if (realmGet$redeemedCode == null) {
            osObjectBuilder.addNull(couponColumnInfo.redeemedCodeIndex);
        } else {
            RedeemedCode redeemedCode = (RedeemedCode) map.get(realmGet$redeemedCode);
            if (redeemedCode != null) {
                osObjectBuilder.addObject(couponColumnInfo.redeemedCodeIndex, redeemedCode);
            } else {
                osObjectBuilder.addObject(couponColumnInfo.redeemedCodeIndex, ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.copyOrUpdate(realm, (ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.RedeemedCodeColumnInfo) realm.getSchema().getColumnInfo((Class<? extends RealmModel>) RedeemedCode.class), realmGet$redeemedCode, true, map, set));
            }
        }
        osObjectBuilder.updateExistingObject();
        return coupon;
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Coupon = proxy[");
        sb.append("{id:");
        String str = "null";
        sb.append(realmGet$id() != null ? realmGet$id() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{title:");
        sb.append(realmGet$title() != null ? realmGet$title() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{description:");
        sb.append(realmGet$description() != null ? realmGet$description() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{longDescription:");
        sb.append(realmGet$longDescription() != null ? realmGet$longDescription() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{termsOfObtaining:");
        sb.append(realmGet$termsOfObtaining() != null ? realmGet$termsOfObtaining() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{group:");
        sb.append(realmGet$group() != null ? realmGet$group() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{buttonTitle:");
        sb.append(realmGet$buttonTitle() != null ? realmGet$buttonTitle() : str);
        sb.append("}");
        sb.append(",");
        sb.append("{image:");
        sb.append(realmGet$image() != null ? ru_unicorn_ujin_data_realm_marketplace_CouponImageRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME : str);
        sb.append("}");
        sb.append(",");
        sb.append("{redeemedCode:");
        if (realmGet$redeemedCode() != null) {
            str = ru_unicorn_ujin_data_realm_marketplace_RedeemedCodeRealmProxy.ClassNameHelper.INTERNAL_CLASS_NAME;
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
        ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy ru_unicorn_ujin_data_realm_marketplace_couponrealmproxy = (ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxy) obj;
        String path = this.proxyState.getRealm$realm().getPath();
        String path2 = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxy.proxyState.getRealm$realm().getPath();
        if (path == null ? path2 != null : !path.equals(path2)) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = ru_unicorn_ujin_data_realm_marketplace_couponrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name == null ? name2 == null : name.equals(name2)) {
            return this.proxyState.getRow$realm().getIndex() == ru_unicorn_ujin_data_realm_marketplace_couponrealmproxy.proxyState.getRow$realm().getIndex();
        }
        return false;
    }
}
